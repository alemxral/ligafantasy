package j$.util.stream;

import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
final class J extends M implements InterfaceC2965o2 {

    /* renamed from: c, reason: collision with root package name */
    static final H f32318c;

    /* renamed from: d, reason: collision with root package name */
    static final H f32319d;

    static {
        EnumC2921f3 enumC2921f3 = EnumC2921f3.INT_VALUE;
        f32318c = new H(true, enumC2921f3, j$.util.D.a(), new C2962o(11), new C2947l(8));
        f32319d = new H(false, enumC2921f3, j$.util.D.a(), new C2962o(11), new C2947l(8));
    }

    @Override // j$.util.stream.M, j$.util.stream.InterfaceC2975q2
    public final void accept(int i8) {
        o(Integer.valueOf(i8));
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.d(this, intConsumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f32336a) {
            return j$.util.D.d(((Integer) this.f32337b).intValue());
        }
        return null;
    }
}
