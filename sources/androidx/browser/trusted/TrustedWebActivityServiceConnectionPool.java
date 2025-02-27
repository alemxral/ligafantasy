package androidx.browser.trusted;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentTransaction;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import x0.InterfaceFutureC3857a;

/* loaded from: classes.dex */
public final class TrustedWebActivityServiceConnectionPool {
    private static final String TAG = "TWAConnectionPool";
    private final Map<Uri, ConnectionHolder> mConnections = new HashMap();
    private final Context mContext;

    /* loaded from: classes.dex */
    static class BindToServiceAsyncTask extends AsyncTask<Void, Void, Exception> {
        private final Context mAppContext;
        private final ConnectionHolder mConnection;
        private final Intent mIntent;

        BindToServiceAsyncTask(Context context, Intent intent, ConnectionHolder connectionHolder) {
            this.mAppContext = context.getApplicationContext();
            this.mIntent = intent;
            this.mConnection = connectionHolder;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        @Nullable
        public Exception doInBackground(Void... voidArr) {
            try {
                if (this.mAppContext.bindService(this.mIntent, this.mConnection, FragmentTransaction.TRANSIT_FRAGMENT_OPEN)) {
                    return null;
                }
                this.mAppContext.unbindService(this.mConnection);
                return new IllegalStateException("Could not bind to the service");
            } catch (SecurityException e8) {
                Log.w(TrustedWebActivityServiceConnectionPool.TAG, "SecurityException while binding.", e8);
                return e8;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(Exception exc) {
            if (exc != null) {
                this.mConnection.cancel(exc);
            }
        }
    }

    private TrustedWebActivityServiceConnectionPool(@NonNull Context context) {
        this.mContext = context.getApplicationContext();
    }

    @NonNull
    public static TrustedWebActivityServiceConnectionPool create(@NonNull Context context) {
        return new TrustedWebActivityServiceConnectionPool(context);
    }

    @Nullable
    private Intent createServiceIntent(Context context, Uri uri, Set<Token> set, boolean z8) {
        if (set == null || set.size() == 0) {
            return null;
        }
        Intent intent = new Intent();
        intent.setData(uri);
        intent.setAction("android.intent.action.VIEW");
        Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent, 65536).iterator();
        String str = null;
        while (it.hasNext()) {
            String str2 = it.next().activityInfo.packageName;
            Iterator<Token> it2 = set.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (it2.next().matches(str2, context.getPackageManager())) {
                    str = str2;
                    break;
                }
            }
        }
        if (str == null) {
            if (z8) {
                Log.w(TAG, "No TWA candidates for " + uri + " have been registered.");
            }
            return null;
        }
        Intent intent2 = new Intent();
        intent2.setPackage(str);
        intent2.setAction(TrustedWebActivityService.ACTION_TRUSTED_WEB_ACTIVITY_SERVICE);
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent2, 131072);
        if (resolveService == null) {
            if (z8) {
                Log.w(TAG, "Could not find TWAService for " + str);
            }
            return null;
        }
        if (z8) {
            Log.i(TAG, "Found " + resolveService.serviceInfo.name + " to handle request for " + uri);
        }
        Intent intent3 = new Intent();
        intent3.setComponent(new ComponentName(str, resolveService.serviceInfo.name));
        return intent3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$connect$0(Uri uri) {
        this.mConnections.remove(uri);
    }

    @NonNull
    @MainThread
    public InterfaceFutureC3857a connect(@NonNull final Uri uri, @NonNull Set<Token> set, @NonNull Executor executor) {
        ConnectionHolder connectionHolder = this.mConnections.get(uri);
        if (connectionHolder != null) {
            return connectionHolder.getServiceWrapper();
        }
        Intent createServiceIntent = createServiceIntent(this.mContext, uri, set, true);
        if (createServiceIntent == null) {
            return FutureUtils.immediateFailedFuture(new IllegalArgumentException("No service exists for scope"));
        }
        ConnectionHolder connectionHolder2 = new ConnectionHolder(new Runnable() { // from class: androidx.browser.trusted.k
            @Override // java.lang.Runnable
            public final void run() {
                TrustedWebActivityServiceConnectionPool.this.lambda$connect$0(uri);
            }
        });
        this.mConnections.put(uri, connectionHolder2);
        new BindToServiceAsyncTask(this.mContext, createServiceIntent, connectionHolder2).executeOnExecutor(executor, new Void[0]);
        return connectionHolder2.getServiceWrapper();
    }

    @MainThread
    public boolean serviceExistsForScope(@NonNull Uri uri, @NonNull Set<Token> set) {
        if (this.mConnections.get(uri) != null || createServiceIntent(this.mContext, uri, set, false) != null) {
            return true;
        }
        return false;
    }

    void unbindAllConnections() {
        Iterator<ConnectionHolder> it = this.mConnections.values().iterator();
        while (it.hasNext()) {
            this.mContext.unbindService(it.next());
        }
        this.mConnections.clear();
    }
}
