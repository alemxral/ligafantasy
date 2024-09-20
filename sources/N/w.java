package N;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import f0.AbstractC2655e;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class w {

    /* renamed from: e */
    private static w f7120e;

    /* renamed from: a */
    private final Context f7121a;

    /* renamed from: b */
    private final ScheduledExecutorService f7122b;

    /* renamed from: c */
    private q f7123c = new q(this, null);

    /* renamed from: d */
    private int f7124d = 1;

    w(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f7122b = scheduledExecutorService;
        this.f7121a = context.getApplicationContext();
    }

    public static /* bridge */ /* synthetic */ Context a(w wVar) {
        return wVar.f7121a;
    }

    public static synchronized w b(Context context) {
        w wVar;
        synchronized (w.class) {
            try {
                if (f7120e == null) {
                    AbstractC2655e.a();
                    f7120e = new w(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new X.a("MessengerIpcClient"))));
                }
                wVar = f7120e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return wVar;
    }

    public static /* bridge */ /* synthetic */ ScheduledExecutorService e(w wVar) {
        return wVar.f7122b;
    }

    private final synchronized int f() {
        int i8;
        i8 = this.f7124d;
        this.f7124d = i8 + 1;
        return i8;
    }

    private final synchronized Task g(t tVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String valueOf = String.valueOf(tVar);
                StringBuilder sb = new StringBuilder(valueOf.length() + 9);
                sb.append("Queueing ");
                sb.append(valueOf);
                Log.d("MessengerIpcClient", sb.toString());
            }
            if (!this.f7123c.g(tVar)) {
                q qVar = new q(this, null);
                this.f7123c = qVar;
                qVar.g(tVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return tVar.f7117b.a();
    }

    public final Task c(int i8, Bundle bundle) {
        return g(new s(f(), 2, bundle));
    }

    public final Task d(int i8, Bundle bundle) {
        return g(new v(f(), 1, bundle));
    }
}
