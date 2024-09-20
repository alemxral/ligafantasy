package n6;

import i6.AbstractC2808G;
import i6.AbstractC2824h0;
import i6.C2805D;
import i6.C2839p;
import i6.InterfaceC2837o;
import i6.X0;
import i6.Z;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: n6.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3496j extends Z implements kotlin.coroutines.jvm.internal.e, P5.d {

    /* renamed from: h, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f36251h = AtomicReferenceFieldUpdater.newUpdater(C3496j.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: d, reason: collision with root package name */
    public final i6.I f36252d;

    /* renamed from: e, reason: collision with root package name */
    public final P5.d f36253e;

    /* renamed from: f, reason: collision with root package name */
    public Object f36254f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f36255g;

    public C3496j(i6.I i8, P5.d dVar) {
        super(-1);
        this.f36252d = i8;
        this.f36253e = dVar;
        this.f36254f = AbstractC3497k.a();
        this.f36255g = J.b(getContext());
    }

    private final C2839p o() {
        Object obj = f36251h.get(this);
        if (obj instanceof C2839p) {
            return (C2839p) obj;
        }
        return null;
    }

    @Override // i6.Z
    public void c(Object obj, Throwable th) {
        if (obj instanceof C2805D) {
            ((C2805D) obj).f31666b.invoke(th);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        P5.d dVar = this.f36253e;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // P5.d
    public P5.g getContext() {
        return this.f36253e.getContext();
    }

    @Override // i6.Z
    public Object h() {
        Object obj = this.f36254f;
        this.f36254f = AbstractC3497k.a();
        return obj;
    }

    public final void i() {
        do {
        } while (f36251h.get(this) == AbstractC3497k.f36257b);
    }

    public final C2839p l() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f36251h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f36251h.set(this, AbstractC3497k.f36257b);
                return null;
            }
            if (obj instanceof C2839p) {
                if (androidx.concurrent.futures.a.a(f36251h, this, obj, AbstractC3497k.f36257b)) {
                    return (C2839p) obj;
                }
            } else if (obj != AbstractC3497k.f36257b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final void m(P5.g gVar, Object obj) {
        this.f36254f = obj;
        this.f31725c = 1;
        this.f36252d.dispatchYield(gVar, this);
    }

    public final boolean p() {
        if (f36251h.get(this) != null) {
            return true;
        }
        return false;
    }

    public final boolean r(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f36251h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            C3486F c3486f = AbstractC3497k.f36257b;
            if (AbstractC3159y.d(obj, c3486f)) {
                if (androidx.concurrent.futures.a.a(f36251h, this, c3486f, th)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (androidx.concurrent.futures.a.a(f36251h, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    @Override // P5.d
    public void resumeWith(Object obj) {
        P5.g context = this.f36253e.getContext();
        Object d8 = AbstractC2808G.d(obj, null, 1, null);
        if (this.f36252d.isDispatchNeeded(context)) {
            this.f36254f = d8;
            this.f31725c = 0;
            this.f36252d.dispatch(context, this);
            return;
        }
        AbstractC2824h0 b8 = X0.f31721a.b();
        if (b8.L()) {
            this.f36254f = d8;
            this.f31725c = 0;
            b8.H(this);
            return;
        }
        b8.J(true);
        try {
            P5.g context2 = getContext();
            Object c8 = J.c(context2, this.f36255g);
            try {
                this.f36253e.resumeWith(obj);
                L5.I i8 = L5.I.f6474a;
                do {
                } while (b8.O());
            } finally {
                J.a(context2, c8);
            }
        } catch (Throwable th) {
            try {
                g(th, null);
            } finally {
                b8.E(true);
            }
        }
    }

    public final void s() {
        i();
        C2839p o8 = o();
        if (o8 != null) {
            o8.r();
        }
    }

    public final Throwable t(InterfaceC2837o interfaceC2837o) {
        C3486F c3486f;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f36251h;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            c3486f = AbstractC3497k.f36257b;
            if (obj != c3486f) {
                if (obj instanceof Throwable) {
                    if (androidx.concurrent.futures.a.a(f36251h, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!androidx.concurrent.futures.a.a(f36251h, this, c3486f, interfaceC2837o));
        return null;
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f36252d + ", " + i6.Q.c(this.f36253e) + ']';
    }

    @Override // i6.Z
    public P5.d d() {
        return this;
    }
}
