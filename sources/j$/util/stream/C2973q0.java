package j$.util.stream;

import java.util.function.Supplier;

/* renamed from: j$.util.stream.q0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2973q0 implements Supplier {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32590a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EnumC3001w0 f32591b;

    public /* synthetic */ C2973q0(EnumC3001w0 enumC3001w0, int i8) {
        this.f32590a = i8;
        this.f32591b = enumC3001w0;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f32590a) {
            case 0:
                return new AbstractC2997v0(this.f32591b);
            case 1:
                return new AbstractC2997v0(this.f32591b);
            default:
                return new AbstractC2997v0(this.f32591b);
        }
    }
}
