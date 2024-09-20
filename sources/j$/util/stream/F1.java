package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
final class F1 extends AbstractC3013z0 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f32286h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ Object f32287i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ Object f32288j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ Object f32289k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F1(EnumC2921f3 enumC2921f3, Object obj, Object obj2, Object obj3, int i8) {
        super(enumC2921f3);
        this.f32286h = i8;
        this.f32287i = obj;
        this.f32289k = obj2;
        this.f32288j = obj3;
    }

    public /* synthetic */ F1(EnumC2921f3 enumC2921f3, BinaryOperator binaryOperator, Object obj, Supplier supplier, int i8) {
        this.f32286h = i8;
        this.f32287i = binaryOperator;
        this.f32289k = obj;
        this.f32288j = supplier;
    }

    @Override // j$.util.stream.AbstractC3013z0
    public final V1 f0() {
        switch (this.f32286h) {
            case 0:
                return new C1((Supplier) this.f32288j, (ObjLongConsumer) this.f32289k, (BinaryOperator) this.f32287i);
            case 1:
                return new I1((Supplier) this.f32288j, (ObjDoubleConsumer) this.f32289k, (BinaryOperator) this.f32287i);
            case 2:
                return new K1(this.f32288j, (BiFunction) this.f32289k, (BinaryOperator) this.f32287i);
            case 3:
                return new O1((Supplier) this.f32288j, (BiConsumer) this.f32289k, (BiConsumer) this.f32287i);
            default:
                return new S1((Supplier) this.f32288j, (ObjIntConsumer) this.f32289k, (BinaryOperator) this.f32287i);
        }
    }
}
