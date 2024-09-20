package r0;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
final class n implements o {

    /* renamed from: a, reason: collision with root package name */
    private final CountDownLatch f37506a = new CountDownLatch(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ n(m mVar) {
    }

    public final void a() {
        this.f37506a.await();
    }

    @Override // r0.InterfaceC3676g
    public final void b(Object obj) {
        this.f37506a.countDown();
    }

    @Override // r0.InterfaceC3673d
    public final void c() {
        this.f37506a.countDown();
    }

    @Override // r0.InterfaceC3675f
    public final void d(Exception exc) {
        this.f37506a.countDown();
    }

    public final boolean e(long j8, TimeUnit timeUnit) {
        return this.f37506a.await(j8, timeUnit);
    }
}
