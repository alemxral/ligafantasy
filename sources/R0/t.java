package r0;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class t implements InterfaceC3676g, InterfaceC3675f, InterfaceC3673d, E {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f37522a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3671b f37523b;

    /* renamed from: c, reason: collision with root package name */
    private final I f37524c;

    public t(Executor executor, InterfaceC3671b interfaceC3671b, I i8) {
        this.f37522a = executor;
        this.f37523b = interfaceC3671b;
        this.f37524c = i8;
    }

    @Override // r0.E
    public final void a(Task task) {
        this.f37522a.execute(new s(this, task));
    }

    @Override // r0.InterfaceC3676g
    public final void b(Object obj) {
        this.f37524c.r(obj);
    }

    @Override // r0.InterfaceC3673d
    public final void c() {
        this.f37524c.s();
    }

    @Override // r0.InterfaceC3675f
    public final void d(Exception exc) {
        this.f37524c.q(exc);
    }
}
