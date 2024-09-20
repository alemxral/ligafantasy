package F0;

import android.os.Bundle;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class c implements b, a {

    /* renamed from: a, reason: collision with root package name */
    private final e f2399a;

    /* renamed from: b, reason: collision with root package name */
    private final int f2400b;

    /* renamed from: c, reason: collision with root package name */
    private final TimeUnit f2401c;

    /* renamed from: e, reason: collision with root package name */
    private CountDownLatch f2403e;

    /* renamed from: d, reason: collision with root package name */
    private final Object f2402d = new Object();

    /* renamed from: f, reason: collision with root package name */
    private boolean f2404f = false;

    public c(e eVar, int i8, TimeUnit timeUnit) {
        this.f2399a = eVar;
        this.f2400b = i8;
        this.f2401c = timeUnit;
    }

    @Override // F0.a
    public void a(String str, Bundle bundle) {
        synchronized (this.f2402d) {
            try {
                E0.f.f().i("Logging event " + str + " to Firebase Analytics with params " + bundle);
                this.f2403e = new CountDownLatch(1);
                this.f2404f = false;
                this.f2399a.a(str, bundle);
                E0.f.f().i("Awaiting app exception callback from Analytics...");
                try {
                    if (this.f2403e.await(this.f2400b, this.f2401c)) {
                        this.f2404f = true;
                        E0.f.f().i("App exception callback received from Analytics listener.");
                    } else {
                        E0.f.f().k("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                    }
                } catch (InterruptedException unused) {
                    E0.f.f().d("Interrupted while awaiting app exception callback from Analytics listener.");
                }
                this.f2403e = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F0.b
    public void k(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.f2403e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}
