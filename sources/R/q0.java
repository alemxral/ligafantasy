package R;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import androidx.work.PeriodicWorkRequest;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class q0 extends AbstractC1311h {

    /* renamed from: f, reason: collision with root package name */
    private final HashMap f8591f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    private final Context f8592g;

    /* renamed from: h, reason: collision with root package name */
    private volatile Handler f8593h;

    /* renamed from: i, reason: collision with root package name */
    private final p0 f8594i;

    /* renamed from: j, reason: collision with root package name */
    private final V.b f8595j;

    /* renamed from: k, reason: collision with root package name */
    private final long f8596k;

    /* renamed from: l, reason: collision with root package name */
    private final long f8597l;

    /* renamed from: m, reason: collision with root package name */
    private volatile Executor f8598m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q0(Context context, Looper looper, Executor executor) {
        p0 p0Var = new p0(this, null);
        this.f8594i = p0Var;
        this.f8592g = context.getApplicationContext();
        this.f8593h = new g0.e(looper, p0Var);
        this.f8595j = V.b.b();
        this.f8596k = 5000L;
        this.f8597l = PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS;
        this.f8598m = executor;
    }

    @Override // R.AbstractC1311h
    protected final void c(l0 l0Var, ServiceConnection serviceConnection, String str) {
        AbstractC1319p.m(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f8591f) {
            try {
                n0 n0Var = (n0) this.f8591f.get(l0Var);
                if (n0Var != null) {
                    if (n0Var.h(serviceConnection)) {
                        n0Var.f(serviceConnection, str);
                        if (n0Var.i()) {
                            this.f8593h.sendMessageDelayed(this.f8593h.obtainMessage(0, l0Var), this.f8596k);
                        }
                    } else {
                        throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + l0Var.toString());
                    }
                } else {
                    throw new IllegalStateException("Nonexistent connection status for service config: " + l0Var.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // R.AbstractC1311h
    public final boolean e(l0 l0Var, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean j8;
        AbstractC1319p.m(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f8591f) {
            try {
                n0 n0Var = (n0) this.f8591f.get(l0Var);
                if (executor == null) {
                    executor = this.f8598m;
                }
                if (n0Var == null) {
                    n0Var = new n0(this, l0Var);
                    n0Var.d(serviceConnection, serviceConnection, str);
                    n0Var.e(str, executor);
                    this.f8591f.put(l0Var, n0Var);
                } else {
                    this.f8593h.removeMessages(0, l0Var);
                    if (!n0Var.h(serviceConnection)) {
                        n0Var.d(serviceConnection, serviceConnection, str);
                        int a8 = n0Var.a();
                        if (a8 != 1) {
                            if (a8 == 2) {
                                n0Var.e(str, executor);
                            }
                        } else {
                            serviceConnection.onServiceConnected(n0Var.b(), n0Var.c());
                        }
                    } else {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + l0Var.toString());
                    }
                }
                j8 = n0Var.j();
            } catch (Throwable th) {
                throw th;
            }
        }
        return j8;
    }
}
