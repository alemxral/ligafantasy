package j$.util.stream;

/* loaded from: classes2.dex */
final class L extends M {

    /* renamed from: c, reason: collision with root package name */
    static final H f32329c;

    /* renamed from: d, reason: collision with root package name */
    static final H f32330d;

    static {
        EnumC2921f3 enumC2921f3 = EnumC2921f3.REFERENCE;
        f32329c = new H(true, enumC2921f3, j$.util.B.a(), new C2962o(13), new C2947l(10));
        f32330d = new H(false, enumC2921f3, j$.util.B.a(), new C2962o(13), new C2947l(10));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f32336a) {
            return j$.util.B.d(this.f32337b);
        }
        return null;
    }
}
