package j$.util.stream;

import j$.util.Comparator$CC;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
final class L2 extends AbstractC2930h2 {

    /* renamed from: m, reason: collision with root package name */
    private final boolean f32334m;

    /* renamed from: n, reason: collision with root package name */
    private final Comparator f32335n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public L2(AbstractC2897b abstractC2897b) {
        super(abstractC2897b, EnumC2916e3.f32512q | EnumC2916e3.f32510o, 0);
        this.f32334m = true;
        this.f32335n = Comparator$CC.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public L2(AbstractC2897b abstractC2897b, Comparator comparator) {
        super(abstractC2897b, EnumC2916e3.f32512q | EnumC2916e3.f32511p, 0);
        this.f32334m = false;
        this.f32335n = (Comparator) Objects.requireNonNull(comparator);
    }

    @Override // j$.util.stream.AbstractC2897b
    public final L0 K(AbstractC2897b abstractC2897b, Spliterator spliterator, IntFunction intFunction) {
        if (EnumC2916e3.SORTED.r(abstractC2897b.G()) && this.f32334m) {
            return abstractC2897b.y(spliterator, false, intFunction);
        }
        Object[] n8 = abstractC2897b.y(spliterator, true, intFunction).n(intFunction);
        Arrays.sort(n8, this.f32335n);
        return new O0(n8);
    }

    @Override // j$.util.stream.AbstractC2897b
    public final InterfaceC2975q2 N(int i8, InterfaceC2975q2 interfaceC2975q2) {
        Objects.requireNonNull(interfaceC2975q2);
        if (EnumC2916e3.SORTED.r(i8) && this.f32334m) {
            return interfaceC2975q2;
        }
        boolean r8 = EnumC2916e3.SIZED.r(i8);
        Comparator comparator = this.f32335n;
        return r8 ? new E2(interfaceC2975q2, comparator) : new E2(interfaceC2975q2, comparator);
    }
}
