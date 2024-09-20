package r0;

import java.util.concurrent.ExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class p implements o {

    /* renamed from: a, reason: collision with root package name */
    private final Object f37507a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final int f37508b;

    /* renamed from: c, reason: collision with root package name */
    private final I f37509c;

    /* renamed from: d, reason: collision with root package name */
    private int f37510d;

    /* renamed from: e, reason: collision with root package name */
    private int f37511e;

    /* renamed from: f, reason: collision with root package name */
    private int f37512f;

    /* renamed from: g, reason: collision with root package name */
    private Exception f37513g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f37514h;

    public p(int i8, I i9) {
        this.f37508b = i8;
        this.f37509c = i9;
    }

    private final void a() {
        if (this.f37510d + this.f37511e + this.f37512f == this.f37508b) {
            if (this.f37513g != null) {
                this.f37509c.q(new ExecutionException(this.f37511e + " out of " + this.f37508b + " underlying tasks failed", this.f37513g));
                return;
            }
            if (this.f37514h) {
                this.f37509c.s();
            } else {
                this.f37509c.r(null);
            }
        }
    }

    @Override // r0.InterfaceC3676g
    public final void b(Object obj) {
        synchronized (this.f37507a) {
            this.f37510d++;
            a();
        }
    }

    @Override // r0.InterfaceC3673d
    public final void c() {
        synchronized (this.f37507a) {
            this.f37512f++;
            this.f37514h = true;
            a();
        }
    }

    @Override // r0.InterfaceC3675f
    public final void d(Exception exc) {
        synchronized (this.f37507a) {
            this.f37511e++;
            this.f37513g = exc;
            a();
        }
    }
}
