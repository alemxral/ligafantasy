package G;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
final class c extends Thread {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f3070a;

    /* renamed from: b, reason: collision with root package name */
    private final long f3071b;

    /* renamed from: c, reason: collision with root package name */
    final CountDownLatch f3072c = new CountDownLatch(1);

    /* renamed from: d, reason: collision with root package name */
    boolean f3073d = false;

    public c(a aVar, long j8) {
        this.f3070a = new WeakReference(aVar);
        this.f3071b = j8;
        start();
    }

    private final void a() {
        a aVar = (a) this.f3070a.get();
        if (aVar != null) {
            aVar.c();
            this.f3073d = true;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (!this.f3072c.await(this.f3071b, TimeUnit.MILLISECONDS)) {
                a();
            }
        } catch (InterruptedException unused) {
            a();
        }
    }
}
