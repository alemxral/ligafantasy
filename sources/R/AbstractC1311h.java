package R;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: R.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1311h {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f8551a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static q0 f8552b = null;

    /* renamed from: c, reason: collision with root package name */
    static HandlerThread f8553c = null;

    /* renamed from: d, reason: collision with root package name */
    private static Executor f8554d = null;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f8555e = false;

    public static AbstractC1311h a(Context context) {
        Looper mainLooper;
        synchronized (f8551a) {
            try {
                if (f8552b == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f8555e) {
                        mainLooper = b().getLooper();
                    } else {
                        mainLooper = context.getMainLooper();
                    }
                    f8552b = new q0(applicationContext, mainLooper, f8554d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f8552b;
    }

    public static HandlerThread b() {
        synchronized (f8551a) {
            try {
                HandlerThread handlerThread = f8553c;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                f8553c = handlerThread2;
                handlerThread2.start();
                return f8553c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected abstract void c(l0 l0Var, ServiceConnection serviceConnection, String str);

    public final void d(String str, String str2, int i8, ServiceConnection serviceConnection, String str3, boolean z8) {
        c(new l0(str, str2, 4225, z8), serviceConnection, str3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean e(l0 l0Var, ServiceConnection serviceConnection, String str, Executor executor);
}
