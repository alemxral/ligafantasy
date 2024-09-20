package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class Y implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final long f17380a;

    /* renamed from: b, reason: collision with root package name */
    private final PowerManager.WakeLock f17381b;

    /* renamed from: c, reason: collision with root package name */
    private final FirebaseMessaging f17382c;

    /* renamed from: d, reason: collision with root package name */
    ExecutorService f17383d = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new X.a("firebase-iid-executor"));

    /* loaded from: classes3.dex */
    static class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private Y f17384a;

        public a(Y y8) {
            this.f17384a = y8;
        }

        public void a() {
            if (Y.c()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.f17384a.b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Y y8 = this.f17384a;
            if (y8 == null || !y8.d()) {
                return;
            }
            if (Y.c()) {
                Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
            }
            this.f17384a.f17382c.j(this.f17384a, 0L);
            this.f17384a.b().unregisterReceiver(this);
            this.f17384a = null;
        }
    }

    public Y(FirebaseMessaging firebaseMessaging, long j8) {
        this.f17382c = firebaseMessaging;
        this.f17380a = j8;
        PowerManager.WakeLock newWakeLock = ((PowerManager) b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f17381b = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    static boolean c() {
        if (!Log.isLoggable("FirebaseMessaging", 3) && (Build.VERSION.SDK_INT != 23 || !Log.isLoggable("FirebaseMessaging", 3))) {
            return false;
        }
        return true;
    }

    Context b() {
        return this.f17382c.k();
    }

    boolean d() {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) b().getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    boolean e() {
        try {
            if (this.f17382c.i() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Token successfully retrieved");
                return true;
            }
            return true;
        } catch (IOException e8) {
            if (B.g(e8.getMessage())) {
                Log.w("FirebaseMessaging", "Token retrieval failed: " + e8.getMessage() + ". Will retry token retrieval");
                return false;
            }
            if (e8.getMessage() == null) {
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            throw e8;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (U.b().e(b())) {
            this.f17381b.acquire();
        }
        try {
            try {
                this.f17382c.A(true);
            } catch (IOException e8) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e8.getMessage() + ". Won't retry the operation.");
                this.f17382c.A(false);
                if (!U.b().e(b())) {
                    return;
                }
            }
            if (!this.f17382c.t()) {
                this.f17382c.A(false);
                if (U.b().e(b())) {
                    this.f17381b.release();
                    return;
                }
                return;
            }
            if (U.b().d(b()) && !d()) {
                new a(this).a();
                if (U.b().e(b())) {
                    this.f17381b.release();
                    return;
                }
                return;
            }
            if (e()) {
                this.f17382c.A(false);
            } else {
                this.f17382c.D(this.f17380a);
            }
            if (!U.b().e(b())) {
                return;
            }
            this.f17381b.release();
        } catch (Throwable th) {
            if (U.b().e(b())) {
                this.f17381b.release();
            }
            throw th;
        }
    }
}
