package k4;

import L5.InterfaceC1227k;
import L5.l;
import L5.o;
import androidx.annotation.RestrictTo;
import j4.AbstractC3081g;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3160z;
import r2.AbstractC3685e;
import x6.AbstractC3964y;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@t6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: B, reason: collision with root package name */
    private static final /* synthetic */ g[] f33472B;

    /* renamed from: C, reason: collision with root package name */
    private static final /* synthetic */ R5.a f33473C;
    public static final b Companion;

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC1227k f33474b;

    /* renamed from: a, reason: collision with root package name */
    private final int f33499a;

    /* renamed from: c, reason: collision with root package name */
    public static final g f33475c = new g("Area", 0, AbstractC3081g.f33182i);

    /* renamed from: d, reason: collision with root package name */
    public static final g f33476d = new g("Cedex", 1, AbstractC3081g.f33179f);

    /* renamed from: e, reason: collision with root package name */
    public static final g f33477e = new g("City", 2, AbstractC3685e.f37556b);

    /* renamed from: f, reason: collision with root package name */
    public static final g f33478f = new g("Country", 3, AbstractC3685e.f37557c);

    /* renamed from: g, reason: collision with root package name */
    public static final g f33479g = new g("County", 4, AbstractC3685e.f37558d);

    /* renamed from: h, reason: collision with root package name */
    public static final g f33480h = new g("Department", 5, AbstractC3081g.f33180g);

    /* renamed from: i, reason: collision with root package name */
    public static final g f33481i = new g("District", 6, AbstractC3081g.f33181h);

    /* renamed from: j, reason: collision with root package name */
    public static final g f33482j = new g("DoSi", 7, AbstractC3081g.f33188o);

    /* renamed from: k, reason: collision with root package name */
    public static final g f33483k = new g("Eircode", 8, AbstractC3081g.f33183j);

    /* renamed from: l, reason: collision with root package name */
    public static final g f33484l = new g("Emirate", 9, AbstractC3081g.f33176c);

    /* renamed from: m, reason: collision with root package name */
    public static final g f33485m = new g("Island", 10, AbstractC3081g.f33186m);

    /* renamed from: n, reason: collision with root package name */
    public static final g f33486n = new g("Neighborhood", 11, AbstractC3081g.f33189p);

    /* renamed from: o, reason: collision with root package name */
    public static final g f33487o = new g("Oblast", 12, AbstractC3081g.f33190q);

    /* renamed from: p, reason: collision with root package name */
    public static final g f33488p = new g("Parish", 13, AbstractC3081g.f33178e);

    /* renamed from: q, reason: collision with root package name */
    public static final g f33489q = new g("Pin", 14, AbstractC3081g.f33185l);

    /* renamed from: r, reason: collision with root package name */
    public static final g f33490r = new g("PostTown", 15, AbstractC3081g.f33191r);

    /* renamed from: s, reason: collision with root package name */
    public static final g f33491s = new g("Postal", 16, AbstractC3685e.f37561g);

    /* renamed from: t, reason: collision with root package name */
    public static final g f33492t = new g("Perfecture", 17, AbstractC3081g.f33187n);

    /* renamed from: u, reason: collision with root package name */
    public static final g f33493u = new g("Province", 18, AbstractC3685e.f37562h);

    /* renamed from: v, reason: collision with root package name */
    public static final g f33494v = new g("State", 19, AbstractC3685e.f37563i);

    /* renamed from: w, reason: collision with root package name */
    public static final g f33495w = new g("Suburb", 20, AbstractC3081g.f33192s);

    /* renamed from: x, reason: collision with root package name */
    public static final g f33496x = new g("SuburbOrCity", 21, AbstractC3081g.f33177d);

    /* renamed from: y, reason: collision with root package name */
    public static final g f33497y = new g("Townload", 22, AbstractC3081g.f33184k);

    /* renamed from: z, reason: collision with root package name */
    public static final g f33498z = new g("VillageTownship", 23, AbstractC3081g.f33193t);

    /* renamed from: A, reason: collision with root package name */
    public static final g f33471A = new g("Zip", 24, AbstractC3685e.f37564j);

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f33500a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t6.b invoke() {
            return AbstractC3964y.a("com.stripe.android.uicore.address.NameType", g.values(), new String[]{"area", "cedex", "city", "country", "county", "department", "district", "do_si", "eircode", "emirate", "island", "neighborhood", "oblast", "parish", "pin", "post_town", "postal", "prefecture", "province", "state", "suburb", "suburb_or_city", "townland", "village_township", "zip"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}, null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        private final /* synthetic */ t6.b a() {
            return (t6.b) g.f33474b.getValue();
        }

        public final t6.b serializer() {
            return a();
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    static {
        g[] a8 = a();
        f33472B = a8;
        f33473C = R5.b.a(a8);
        Companion = new b(null);
        f33474b = l.a(o.f6492b, a.f33500a);
    }

    private g(String str, int i8, int i9) {
        this.f33499a = i9;
    }

    private static final /* synthetic */ g[] a() {
        return new g[]{f33475c, f33476d, f33477e, f33478f, f33479g, f33480h, f33481i, f33482j, f33483k, f33484l, f33485m, f33486n, f33487o, f33488p, f33489q, f33490r, f33491s, f33492t, f33493u, f33494v, f33495w, f33496x, f33497y, f33498z, f33471A};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f33472B.clone();
    }

    public final int c() {
        return this.f33499a;
    }
}
