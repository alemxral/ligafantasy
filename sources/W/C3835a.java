package w;

/* renamed from: w.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3835a implements I5.a {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f38915c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile I5.a f38916a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f38917b = f38915c;

    private C3835a(I5.a aVar) {
        this.f38916a = aVar;
    }

    public static I5.a a(I5.a aVar) {
        AbstractC3838d.b(aVar);
        if (aVar instanceof C3835a) {
            return aVar;
        }
        return new C3835a(aVar);
    }

    public static Object b(Object obj, Object obj2) {
        if (obj != f38915c && obj != obj2) {
            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
        }
        return obj2;
    }

    @Override // I5.a
    public Object get() {
        Object obj = this.f38917b;
        Object obj2 = f38915c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f38917b;
                    if (obj == obj2) {
                        obj = this.f38916a.get();
                        this.f38917b = b(this.f38917b, obj);
                        this.f38916a = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
