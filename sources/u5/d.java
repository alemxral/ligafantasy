package u5;

import t5.InterfaceC3795a;

/* loaded from: classes5.dex */
public final class d implements i, InterfaceC3795a {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f38550c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile i f38551a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f38552b = f38550c;

    private d(i iVar) {
        this.f38551a = iVar;
    }

    public static InterfaceC3795a a(I5.a aVar) {
        return b(j.a(aVar));
    }

    public static InterfaceC3795a b(i iVar) {
        if (iVar instanceof InterfaceC3795a) {
            return (InterfaceC3795a) iVar;
        }
        return new d((i) h.b(iVar));
    }

    public static i c(i iVar) {
        h.b(iVar);
        if (iVar instanceof d) {
            return iVar;
        }
        return new d(iVar);
    }

    private static Object d(Object obj, Object obj2) {
        if (obj != f38550c && obj != obj2) {
            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
        }
        return obj2;
    }

    @Override // I5.a
    public Object get() {
        Object obj = this.f38552b;
        Object obj2 = f38550c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f38552b;
                    if (obj == obj2) {
                        obj = this.f38551a.get();
                        this.f38552b = d(this.f38552b, obj);
                        this.f38551a = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
