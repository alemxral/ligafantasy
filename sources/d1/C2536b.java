package d1;

/* renamed from: d1.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2536b implements InterfaceC2535a {

    /* renamed from: a, reason: collision with root package name */
    private static C2536b f30082a;

    private C2536b() {
    }

    public static C2536b a() {
        if (f30082a == null) {
            f30082a = new C2536b();
        }
        return f30082a;
    }

    @Override // d1.InterfaceC2535a
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}
