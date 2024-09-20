package r0;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class D implements InterfaceC3676g, InterfaceC3675f, InterfaceC3673d, E {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f37488a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3678i f37489b;

    /* renamed from: c, reason: collision with root package name */
    private final I f37490c;

    public D(Executor executor, InterfaceC3678i interfaceC3678i, I i8) {
        this.f37488a = executor;
        this.f37489b = interfaceC3678i;
        this.f37490c = i8;
    }

    @Override // r0.E
    public final void a(Task task) {
        this.f37488a.execute(new C(this, task));
    }

    @Override // r0.InterfaceC3676g
    public final void b(Object obj) {
        this.f37490c.r(obj);
    }

    @Override // r0.InterfaceC3673d
    public final void c() {
        this.f37490c.s();
    }

    @Override // r0.InterfaceC3675f
    public final void d(Exception exc) {
        this.f37490c.q(exc);
    }
}
