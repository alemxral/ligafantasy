package j$.util.stream;

import j$.util.AbstractC2877d;
import j$.util.Spliterator;
import java.util.EnumMap;
import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DISTINCT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: j$.util.stream.e3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class EnumC2916e3 {
    public static final EnumC2916e3 DISTINCT;
    public static final EnumC2916e3 ORDERED;
    public static final EnumC2916e3 SHORT_CIRCUIT;
    public static final EnumC2916e3 SIZED;
    public static final EnumC2916e3 SORTED;

    /* renamed from: f, reason: collision with root package name */
    static final int f32501f;

    /* renamed from: g, reason: collision with root package name */
    static final int f32502g;

    /* renamed from: h, reason: collision with root package name */
    static final int f32503h;

    /* renamed from: i, reason: collision with root package name */
    private static final int f32504i;

    /* renamed from: j, reason: collision with root package name */
    private static final int f32505j;

    /* renamed from: k, reason: collision with root package name */
    private static final int f32506k;

    /* renamed from: l, reason: collision with root package name */
    static final int f32507l;

    /* renamed from: m, reason: collision with root package name */
    static final int f32508m;

    /* renamed from: n, reason: collision with root package name */
    static final int f32509n;

    /* renamed from: o, reason: collision with root package name */
    static final int f32510o;

    /* renamed from: p, reason: collision with root package name */
    static final int f32511p;

    /* renamed from: q, reason: collision with root package name */
    static final int f32512q;

    /* renamed from: r, reason: collision with root package name */
    static final int f32513r;

    /* renamed from: s, reason: collision with root package name */
    static final int f32514s;

    /* renamed from: t, reason: collision with root package name */
    static final int f32515t;

    /* renamed from: u, reason: collision with root package name */
    static final int f32516u;

    /* renamed from: v, reason: collision with root package name */
    private static final /* synthetic */ EnumC2916e3[] f32517v;

    /* renamed from: a, reason: collision with root package name */
    private final Map f32518a;

    /* renamed from: b, reason: collision with root package name */
    private final int f32519b;

    /* renamed from: c, reason: collision with root package name */
    private final int f32520c;

    /* renamed from: d, reason: collision with root package name */
    private final int f32521d;

    /* renamed from: e, reason: collision with root package name */
    private final int f32522e;

    static {
        EnumC2911d3 enumC2911d3 = EnumC2911d3.SPLITERATOR;
        C2906c3 v8 = v(enumC2911d3);
        EnumC2911d3 enumC2911d32 = EnumC2911d3.STREAM;
        v8.a(enumC2911d32);
        EnumC2911d3 enumC2911d33 = EnumC2911d3.OP;
        v8.f32483a.put(enumC2911d33, 3);
        EnumC2916e3 enumC2916e3 = new EnumC2916e3("DISTINCT", 0, 0, v8);
        DISTINCT = enumC2916e3;
        C2906c3 v9 = v(enumC2911d3);
        v9.a(enumC2911d32);
        v9.f32483a.put(enumC2911d33, 3);
        EnumC2916e3 enumC2916e32 = new EnumC2916e3("SORTED", 1, 1, v9);
        SORTED = enumC2916e32;
        C2906c3 v10 = v(enumC2911d3);
        v10.a(enumC2911d32);
        Map map = v10.f32483a;
        map.put(enumC2911d33, 3);
        EnumC2911d3 enumC2911d34 = EnumC2911d3.TERMINAL_OP;
        map.put(enumC2911d34, 2);
        EnumC2911d3 enumC2911d35 = EnumC2911d3.UPSTREAM_TERMINAL_OP;
        map.put(enumC2911d35, 2);
        EnumC2916e3 enumC2916e33 = new EnumC2916e3("ORDERED", 2, 2, v10);
        ORDERED = enumC2916e33;
        C2906c3 v11 = v(enumC2911d3);
        v11.a(enumC2911d32);
        v11.f32483a.put(enumC2911d33, 2);
        EnumC2916e3 enumC2916e34 = new EnumC2916e3("SIZED", 3, 3, v11);
        SIZED = enumC2916e34;
        C2906c3 v12 = v(enumC2911d33);
        v12.a(enumC2911d34);
        EnumC2916e3 enumC2916e35 = new EnumC2916e3("SHORT_CIRCUIT", 4, 12, v12);
        SHORT_CIRCUIT = enumC2916e35;
        f32517v = new EnumC2916e3[]{enumC2916e3, enumC2916e32, enumC2916e33, enumC2916e34, enumC2916e35};
        f32501f = l(enumC2911d3);
        f32502g = l(enumC2911d32);
        f32503h = l(enumC2911d33);
        l(enumC2911d34);
        l(enumC2911d35);
        int i8 = 0;
        for (EnumC2916e3 enumC2916e36 : values()) {
            i8 |= enumC2916e36.f32522e;
        }
        f32504i = i8;
        int i9 = f32502g;
        f32505j = i9;
        int i10 = i9 << 1;
        f32506k = i10;
        f32507l = i9 | i10;
        EnumC2916e3 enumC2916e37 = DISTINCT;
        f32508m = enumC2916e37.f32520c;
        f32509n = enumC2916e37.f32521d;
        EnumC2916e3 enumC2916e38 = SORTED;
        f32510o = enumC2916e38.f32520c;
        f32511p = enumC2916e38.f32521d;
        EnumC2916e3 enumC2916e39 = ORDERED;
        f32512q = enumC2916e39.f32520c;
        f32513r = enumC2916e39.f32521d;
        EnumC2916e3 enumC2916e310 = SIZED;
        f32514s = enumC2916e310.f32520c;
        f32515t = enumC2916e310.f32521d;
        f32516u = SHORT_CIRCUIT.f32520c;
    }

    private EnumC2916e3(String str, int i8, int i9, C2906c3 c2906c3) {
        EnumC2911d3[] values = EnumC2911d3.values();
        int length = values.length;
        int i10 = 0;
        while (true) {
            Map map = c2906c3.f32483a;
            if (i10 >= length) {
                this.f32518a = map;
                int i11 = i9 * 2;
                this.f32519b = i11;
                this.f32520c = 1 << i11;
                this.f32521d = 2 << i11;
                this.f32522e = 3 << i11;
                return;
            }
            AbstractC2877d.t(map, values[i10], 0);
            i10++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int j(int i8, int i9) {
        return i8 | (i9 & (i8 == 0 ? f32504i : ~(((f32505j & i8) << 1) | i8 | ((f32506k & i8) >> 1))));
    }

    private static int l(EnumC2911d3 enumC2911d3) {
        int i8 = 0;
        for (EnumC2916e3 enumC2916e3 : values()) {
            i8 |= ((Integer) enumC2916e3.f32518a.get(enumC2911d3)).intValue() << enumC2916e3.f32519b;
        }
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int m(Spliterator spliterator) {
        int characteristics = spliterator.characteristics();
        int i8 = characteristics & 4;
        int i9 = f32501f;
        return (i8 == 0 || spliterator.getComparator() == null) ? characteristics & i9 : characteristics & i9 & (-5);
    }

    private static C2906c3 v(EnumC2911d3 enumC2911d3) {
        C2906c3 c2906c3 = new C2906c3(new EnumMap(EnumC2911d3.class));
        c2906c3.a(enumC2911d3);
        return c2906c3;
    }

    public static EnumC2916e3 valueOf(String str) {
        return (EnumC2916e3) Enum.valueOf(EnumC2916e3.class, str);
    }

    public static EnumC2916e3[] values() {
        return (EnumC2916e3[]) f32517v.clone();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int z(int i8) {
        return i8 & ((~i8) >> 1) & f32505j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean r(int i8) {
        return (i8 & this.f32522e) == this.f32520c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean u(int i8) {
        int i9 = this.f32522e;
        return (i8 & i9) == i9;
    }
}
