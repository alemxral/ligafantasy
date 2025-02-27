package j$.util.stream;

import j$.util.C2880g;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;
import java.util.function.Predicate;
import java.util.stream.Collector;

/* renamed from: j$.util.stream.z0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC3013z0 implements K3 {

    /* renamed from: a, reason: collision with root package name */
    private static final C2914e1 f32653a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static final H0 f32654b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static final J0 f32655c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static final F0 f32656d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f32657e = new int[0];

    /* renamed from: f, reason: collision with root package name */
    private static final long[] f32658f = new long[0];

    /* renamed from: g, reason: collision with root package name */
    private static final double[] f32659g = new double[0];

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC3013z0(EnumC2921f3 enumC2921f3) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long A(long j8, long j9, long j10) {
        if (j8 >= 0) {
            return Math.max(-1L, Math.min(j8 - j9, j10));
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long B(long j8, long j9) {
        long j10 = j9 >= 0 ? j8 + j9 : Long.MAX_VALUE;
        if (j10 >= 0) {
            return j10;
        }
        return Long.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Spliterator C(EnumC2921f3 enumC2921f3, Spliterator spliterator, long j8, long j9) {
        long j10 = j9 >= 0 ? j8 + j9 : Long.MAX_VALUE;
        long j11 = j10 >= 0 ? j10 : Long.MAX_VALUE;
        int i8 = AbstractC3015z2.f32660a[enumC2921f3.ordinal()];
        if (i8 == 1) {
            return new y3(spliterator, j8, j11);
        }
        if (i8 == 2) {
            return new x3((j$.util.Z) spliterator, j8, j11);
        }
        if (i8 == 3) {
            return new x3((j$.util.c0) spliterator, j8, j11);
        }
        if (i8 == 4) {
            return new x3((j$.util.W) spliterator, j8, j11);
        }
        throw new IllegalStateException("Unknown shape " + enumC2921f3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r0v1, types: [j$.util.stream.a3, j$.util.stream.D0] */
    /* JADX WARN: Type inference failed for: r0v3, types: [j$.util.stream.O0, j$.util.stream.D0] */
    public static D0 D(long j8, IntFunction intFunction) {
        return (j8 < 0 || j8 >= 2147483639) ? new C2896a3() : new O0(j8, intFunction);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.function.LongFunction, j$.util.stream.R0, java.lang.Object] */
    public static L0 E(AbstractC2897b abstractC2897b, Spliterator spliterator, boolean z8, IntFunction intFunction) {
        long C8 = abstractC2897b.C(spliterator);
        if (C8 < 0 || !spliterator.hasCharacteristics(16384)) {
            ?? obj = new Object();
            obj.f32382a = intFunction;
            L0 l02 = (L0) new Q0(abstractC2897b, spliterator, obj, new C2947l(17), 3).invoke();
            return z8 ? N(l02, intFunction) : l02;
        }
        if (C8 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) C8);
        new C3002w1(spliterator, abstractC2897b, objArr).invoke();
        return new O0(objArr);
    }

    public static F0 F(AbstractC2897b abstractC2897b, Spliterator spliterator, boolean z8) {
        long C8 = abstractC2897b.C(spliterator);
        if (C8 < 0 || !spliterator.hasCharacteristics(16384)) {
            F0 f02 = (F0) new Q0(abstractC2897b, spliterator, new C2947l(11), new C2947l(12), 0).invoke();
            return z8 ? O(f02) : f02;
        }
        if (C8 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) C8];
        new C2988t1(spliterator, abstractC2897b, dArr).invoke();
        return new Y0(dArr);
    }

    public static H0 G(AbstractC2897b abstractC2897b, Spliterator spliterator, boolean z8) {
        long C8 = abstractC2897b.C(spliterator);
        if (C8 < 0 || !spliterator.hasCharacteristics(16384)) {
            H0 h02 = (H0) new Q0(abstractC2897b, spliterator, new C2947l(13), new C2947l(14), 1).invoke();
            return z8 ? P(h02) : h02;
        }
        if (C8 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) C8];
        new C2993u1(spliterator, abstractC2897b, iArr).invoke();
        return new C2929h1(iArr);
    }

    public static J0 H(AbstractC2897b abstractC2897b, Spliterator spliterator, boolean z8) {
        long C8 = abstractC2897b.C(spliterator);
        if (C8 < 0 || !spliterator.hasCharacteristics(16384)) {
            J0 j02 = (J0) new Q0(abstractC2897b, spliterator, new C2947l(15), new C2947l(16), 2).invoke();
            return z8 ? Q(j02) : j02;
        }
        if (C8 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) C8];
        new C2998v1(spliterator, abstractC2897b, jArr).invoke();
        return new C2974q1(jArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static N0 I(EnumC2921f3 enumC2921f3, L0 l02, L0 l03) {
        int i8 = M0.f32338a[enumC2921f3.ordinal()];
        if (i8 == 1) {
            return new N0(l02, l03);
        }
        if (i8 == 2) {
            return new N0((H0) l02, (H0) l03);
        }
        if (i8 == 3) {
            return new N0((J0) l02, (J0) l03);
        }
        if (i8 == 4) {
            return new N0((F0) l02, (F0) l03);
        }
        throw new IllegalStateException("Unknown shape " + enumC2921f3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r0v1, types: [j$.util.stream.Z2, j$.util.stream.A0] */
    /* JADX WARN: Type inference failed for: r0v3, types: [j$.util.stream.Y0, j$.util.stream.A0] */
    public static A0 J(long j8) {
        return (j8 < 0 || j8 >= 2147483639) ? new Z2() : new Y0(j8);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.stream.G, j$.util.stream.b] */
    public static G K(j$.util.W w8) {
        return new AbstractC2897b(w8, EnumC2916e3.m(w8), false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AbstractC2919f1 L(EnumC2921f3 enumC2921f3) {
        L0 l02;
        int i8 = M0.f32338a[enumC2921f3.ordinal()];
        if (i8 == 1) {
            return f32653a;
        }
        if (i8 == 2) {
            l02 = f32654b;
        } else if (i8 == 3) {
            l02 = f32655c;
        } else {
            if (i8 != 4) {
                throw new IllegalStateException("Unknown shape " + enumC2921f3);
            }
            l02 = f32656d;
        }
        return (AbstractC2919f1) l02;
    }

    private static int M(long j8) {
        return (j8 != -1 ? EnumC2916e3.f32516u : 0) | EnumC2916e3.f32515t;
    }

    public static L0 N(L0 l02, IntFunction intFunction) {
        if (l02.p() <= 0) {
            return l02;
        }
        long count = l02.count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) count);
        new A1(l02, objArr, 1).invoke();
        return new O0(objArr);
    }

    public static F0 O(F0 f02) {
        if (f02.p() <= 0) {
            return f02;
        }
        long count = f02.count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) count];
        new A1(f02, dArr, 0).invoke();
        return new Y0(dArr);
    }

    public static H0 P(H0 h02) {
        if (h02.p() <= 0) {
            return h02;
        }
        long count = h02.count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) count];
        new A1(h02, iArr, 0).invoke();
        return new C2929h1(iArr);
    }

    public static J0 Q(J0 j02) {
        if (j02.p() <= 0) {
            return j02;
        }
        long count = j02.count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) count];
        new A1(j02, jArr, 0).invoke();
        return new C2974q1(jArr);
    }

    public static Set R(Set set) {
        if (set == null || set.isEmpty()) {
            return set;
        }
        HashSet hashSet = new HashSet();
        Object next = set.iterator().next();
        if (next instanceof EnumC2932i) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    EnumC2932i enumC2932i = (EnumC2932i) it.next();
                    hashSet.add(enumC2932i == null ? null : enumC2932i == EnumC2932i.CONCURRENT ? Collector.Characteristics.CONCURRENT : enumC2932i == EnumC2932i.UNORDERED ? Collector.Characteristics.UNORDERED : Collector.Characteristics.IDENTITY_FINISH);
                } catch (ClassCastException e8) {
                    C2880g.a("java.util.stream.Collector.Characteristics", e8);
                    throw null;
                }
            }
            return hashSet;
        }
        if (!(next instanceof Collector.Characteristics)) {
            C2880g.a("java.util.stream.Collector.Characteristics", next.getClass());
            throw null;
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            try {
                Collector.Characteristics characteristics = (Collector.Characteristics) it2.next();
                hashSet.add(characteristics == null ? null : characteristics == Collector.Characteristics.CONCURRENT ? EnumC2932i.CONCURRENT : characteristics == Collector.Characteristics.UNORDERED ? EnumC2932i.UNORDERED : EnumC2932i.IDENTITY_FINISH);
            } catch (ClassCastException e9) {
                C2880g.a("java.util.stream.Collector.Characteristics", e9);
                throw null;
            }
        }
        return hashSet;
    }

    public static C2892a S(Function function) {
        C2892a c2892a = new C2892a(9);
        c2892a.f32460b = function;
        return c2892a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r0v1, types: [j$.util.stream.Z2, j$.util.stream.B0] */
    /* JADX WARN: Type inference failed for: r0v3, types: [j$.util.stream.h1, j$.util.stream.B0] */
    public static B0 T(long j8) {
        return (j8 < 0 || j8 >= 2147483639) ? new Z2() : new C2929h1(j8);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.stream.IntStream, j$.util.stream.b] */
    public static IntStream U(j$.util.Z z8) {
        return new AbstractC2897b(z8, EnumC2916e3.m(z8), false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r0v1, types: [j$.util.stream.Z2, j$.util.stream.C0] */
    /* JADX WARN: Type inference failed for: r0v3, types: [j$.util.stream.q1, j$.util.stream.C0] */
    public static C0 V(long j8) {
        return (j8 < 0 || j8 >= 2147483639) ? new Z2() : new C2974q1(j8);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.stream.p0, j$.util.stream.b] */
    public static InterfaceC2968p0 W(j$.util.c0 c0Var) {
        return new AbstractC2897b(c0Var, EnumC2916e3.m(c0Var), false);
    }

    public static G X(AbstractC2897b abstractC2897b, long j8, long j9) {
        if (j8 >= 0) {
            return new C3011y2(abstractC2897b, M(j9), j8, j9);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j8);
    }

    public static C3005x0 Y(EnumC3001w0 enumC3001w0) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(enumC3001w0);
        return new C3005x0(EnumC2921f3.DOUBLE_VALUE, enumC3001w0, new C2973q0(enumC3001w0, 2));
    }

    public static IntStream Z(AbstractC2897b abstractC2897b, long j8, long j9) {
        if (j8 >= 0) {
            return new C2994u2(abstractC2897b, M(j9), j8, j9);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j8);
    }

    public static void a() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static C3005x0 a0(EnumC3001w0 enumC3001w0) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(enumC3001w0);
        return new C3005x0(EnumC2921f3.INT_VALUE, enumC3001w0, new C2973q0(enumC3001w0, 1));
    }

    public static InterfaceC2968p0 b0(AbstractC2897b abstractC2897b, long j8, long j9) {
        if (j8 >= 0) {
            return new C3003w2(abstractC2897b, M(j9), j8, j9);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j8);
    }

    public static C3005x0 c0(EnumC3001w0 enumC3001w0) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(enumC3001w0);
        return new C3005x0(EnumC2921f3.LONG_VALUE, enumC3001w0, new C2973q0(enumC3001w0, 0));
    }

    public static C3005x0 d0(EnumC3001w0 enumC3001w0, Predicate predicate) {
        Objects.requireNonNull(predicate);
        Objects.requireNonNull(enumC3001w0);
        return new C3005x0(EnumC2921f3.REFERENCE, enumC3001w0, new C2952m(1, enumC3001w0, predicate));
    }

    public static void e(InterfaceC2960n2 interfaceC2960n2, Double d8) {
        if (N3.f32354a) {
            N3.a(interfaceC2960n2.getClass(), "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        }
        interfaceC2960n2.accept(d8.doubleValue());
    }

    public static Stream e0(AbstractC2897b abstractC2897b, long j8, long j9) {
        if (j8 >= 0) {
            return new C2984s2(abstractC2897b, M(j9), j8, j9);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j8);
    }

    public static void g(InterfaceC2965o2 interfaceC2965o2, Integer num) {
        if (N3.f32354a) {
            N3.a(interfaceC2965o2.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
            throw null;
        }
        interfaceC2965o2.accept(num.intValue());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.stream.Stream, j$.util.stream.b] */
    public static Stream g0(Spliterator spliterator, boolean z8) {
        Objects.requireNonNull(spliterator);
        return new AbstractC2897b(spliterator, EnumC2916e3.m(spliterator), z8);
    }

    public static void i(InterfaceC2970p2 interfaceC2970p2, Long l8) {
        if (N3.f32354a) {
            N3.a(interfaceC2970p2.getClass(), "{0} calling Sink.OfLong.accept(Long)");
            throw null;
        }
        interfaceC2970p2.accept(l8.longValue());
    }

    public static void k() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static void l() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static Object[] m(K0 k02, IntFunction intFunction) {
        if (N3.f32354a) {
            N3.a(k02.getClass(), "{0} calling Node.OfPrimitive.asArray");
            throw null;
        }
        if (k02.count() >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) k02.count());
        k02.h(objArr, 0);
        return objArr;
    }

    public static void n(F0 f02, Double[] dArr, int i8) {
        if (N3.f32354a) {
            N3.a(f02.getClass(), "{0} calling Node.OfDouble.copyInto(Double[], int)");
            throw null;
        }
        double[] dArr2 = (double[]) f02.d();
        for (int i9 = 0; i9 < dArr2.length; i9++) {
            dArr[i8 + i9] = Double.valueOf(dArr2[i9]);
        }
    }

    public static void o(H0 h02, Integer[] numArr, int i8) {
        if (N3.f32354a) {
            N3.a(h02.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
            throw null;
        }
        int[] iArr = (int[]) h02.d();
        for (int i9 = 0; i9 < iArr.length; i9++) {
            numArr[i8 + i9] = Integer.valueOf(iArr[i9]);
        }
    }

    public static void p(J0 j02, Long[] lArr, int i8) {
        if (N3.f32354a) {
            N3.a(j02.getClass(), "{0} calling Node.OfInt.copyInto(Long[], int)");
            throw null;
        }
        long[] jArr = (long[]) j02.d();
        for (int i9 = 0; i9 < jArr.length; i9++) {
            lArr[i8 + i9] = Long.valueOf(jArr[i9]);
        }
    }

    public static void q(F0 f02, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            f02.e((DoubleConsumer) consumer);
        } else {
            if (N3.f32354a) {
                N3.a(f02.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.W) f02.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void r(H0 h02, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            h02.e((IntConsumer) consumer);
        } else {
            if (N3.f32354a) {
                N3.a(h02.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.Z) h02.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void s(J0 j02, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            j02.e((LongConsumer) consumer);
        } else {
            if (N3.f32354a) {
                N3.a(j02.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.c0) j02.spliterator()).forEachRemaining(consumer);
        }
    }

    public static F0 t(F0 f02, long j8, long j9) {
        if (j8 == 0 && j9 == f02.count()) {
            return f02;
        }
        long j10 = j9 - j8;
        j$.util.W w8 = (j$.util.W) f02.spliterator();
        A0 J8 = J(j10);
        J8.k(j10);
        for (int i8 = 0; i8 < j8 && w8.tryAdvance((DoubleConsumer) new E0(0)); i8++) {
        }
        if (j9 == f02.count()) {
            w8.forEachRemaining((DoubleConsumer) J8);
        } else {
            for (int i9 = 0; i9 < j10 && w8.tryAdvance((DoubleConsumer) J8); i9++) {
            }
        }
        J8.j();
        return J8.a();
    }

    public static H0 u(H0 h02, long j8, long j9) {
        if (j8 == 0 && j9 == h02.count()) {
            return h02;
        }
        long j10 = j9 - j8;
        j$.util.Z z8 = (j$.util.Z) h02.spliterator();
        B0 T7 = T(j10);
        T7.k(j10);
        for (int i8 = 0; i8 < j8 && z8.tryAdvance((IntConsumer) new G0(0)); i8++) {
        }
        if (j9 == h02.count()) {
            z8.forEachRemaining((IntConsumer) T7);
        } else {
            for (int i9 = 0; i9 < j10 && z8.tryAdvance((IntConsumer) T7); i9++) {
            }
        }
        T7.j();
        return T7.a();
    }

    public static J0 v(J0 j02, long j8, long j9) {
        if (j8 == 0 && j9 == j02.count()) {
            return j02;
        }
        long j10 = j9 - j8;
        j$.util.c0 c0Var = (j$.util.c0) j02.spliterator();
        C0 V7 = V(j10);
        V7.k(j10);
        for (int i8 = 0; i8 < j8 && c0Var.tryAdvance((LongConsumer) new I0(0)); i8++) {
        }
        if (j9 == j02.count()) {
            c0Var.forEachRemaining((LongConsumer) V7);
        } else {
            for (int i9 = 0; i9 < j10 && c0Var.tryAdvance((LongConsumer) V7); i9++) {
            }
        }
        V7.j();
        return V7.a();
    }

    public static L0 w(L0 l02, long j8, long j9, IntFunction intFunction) {
        if (j8 == 0 && j9 == l02.count()) {
            return l02;
        }
        Spliterator spliterator = l02.spliterator();
        long j10 = j9 - j8;
        D0 D8 = D(j10, intFunction);
        D8.k(j10);
        for (int i8 = 0; i8 < j8 && spliterator.tryAdvance(new C2918f0(7)); i8++) {
        }
        if (j9 == l02.count()) {
            spliterator.forEachRemaining(D8);
        } else {
            for (int i9 = 0; i9 < j10 && spliterator.tryAdvance(D8); i9++) {
            }
        }
        D8.j();
        return D8.a();
    }

    @Override // j$.util.stream.K3
    public Object b(AbstractC2897b abstractC2897b, Spliterator spliterator) {
        V1 f02 = f0();
        abstractC2897b.R(spliterator, f02);
        return f02.get();
    }

    @Override // j$.util.stream.K3
    public Object c(AbstractC2897b abstractC2897b, Spliterator spliterator) {
        return ((V1) new C2905c2(this, abstractC2897b, spliterator).invoke()).get();
    }

    @Override // j$.util.stream.K3
    public /* synthetic */ int d() {
        return 0;
    }

    public abstract V1 f0();
}
