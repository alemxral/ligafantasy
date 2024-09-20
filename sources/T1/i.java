package T1;

/* loaded from: classes4.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static g f9689a = g.f9678h;

    /* renamed from: b, reason: collision with root package name */
    public static final W1.d f9690b = new W1.d();

    /* renamed from: c, reason: collision with root package name */
    public static final X1.e f9691c = new X1.e();

    public static void a(String str, Appendable appendable, g gVar) {
        if (str == null) {
            return;
        }
        gVar.f(str, appendable);
    }

    public static void b(Object obj, Appendable appendable, g gVar) {
        if (obj == null) {
            appendable.append("null");
            return;
        }
        Class<?> cls = obj.getClass();
        W1.d dVar = f9690b;
        W1.e a8 = dVar.a(cls);
        if (a8 == null) {
            if (cls.isArray()) {
                a8 = W1.d.f11967l;
            } else {
                a8 = dVar.b(obj.getClass());
                if (a8 == null) {
                    a8 = W1.d.f11965j;
                }
            }
            dVar.d(a8, cls);
        }
        a8.a(obj, appendable, gVar);
    }
}
