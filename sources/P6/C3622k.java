package p6;

import i6.Q;

/* renamed from: p6.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3622k extends AbstractRunnableC3619h {

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f37102c;

    public C3622k(Runnable runnable, long j8, InterfaceC3620i interfaceC3620i) {
        super(j8, interfaceC3620i);
        this.f37102c = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f37102c.run();
        } finally {
            this.f37100b.a();
        }
    }

    public String toString() {
        return "Task[" + Q.a(this.f37102c) + '@' + Q.b(this.f37102c) + ", " + this.f37099a + ", " + this.f37100b + ']';
    }
}
