package e4;

import L5.InterfaceC1227k;
import androidx.annotation.RestrictTo;
import j2.AbstractC3053E;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3160z;
import r2.AbstractC3685e;
import x6.AbstractC3964y;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@t6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes4.dex */
public final class P0 {
    public static final b Companion;

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC1227k f30465b;

    /* renamed from: c, reason: collision with root package name */
    public static final P0 f30466c = new P0("IdealBank", 0, b4.n.f14743v);

    /* renamed from: d, reason: collision with root package name */
    public static final P0 f30467d = new P0("P24Bank", 1, b4.n.f14679E);

    /* renamed from: e, reason: collision with root package name */
    public static final P0 f30468e = new P0("EpsBank", 2, b4.n.f14731p);

    /* renamed from: f, reason: collision with root package name */
    public static final P0 f30469f = new P0("FpxBank", 3, b4.n.f14733q);

    /* renamed from: g, reason: collision with root package name */
    public static final P0 f30470g = new P0("AddressName", 4, AbstractC3685e.f37559e);

    /* renamed from: h, reason: collision with root package name */
    public static final P0 f30471h = new P0("AuBecsAccountName", 5, AbstractC3053E.f32834K);

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ P0[] f30472i;

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ R5.a f30473j;

    /* renamed from: a, reason: collision with root package name */
    private final int f30474a;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f30475a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t6.b invoke() {
            return AbstractC3964y.a("com.stripe.android.ui.core.elements.TranslationId", P0.values(), new String[]{"upe.labels.ideal.bank", "upe.labels.p24.bank", "upe.labels.eps.bank", "upe.labels.fpx.bank", "address.label.name", "upe.labels.name.onAccount"}, new Annotation[][]{null, null, null, null, null, null}, null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        private final /* synthetic */ t6.b a() {
            return (t6.b) P0.f30465b.getValue();
        }

        public final t6.b serializer() {
            return a();
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    static {
        P0[] a8 = a();
        f30472i = a8;
        f30473j = R5.b.a(a8);
        Companion = new b(null);
        f30465b = L5.l.a(L5.o.f6492b, a.f30475a);
    }

    private P0(String str, int i8, int i9) {
        this.f30474a = i9;
    }

    private static final /* synthetic */ P0[] a() {
        return new P0[]{f30466c, f30467d, f30468e, f30469f, f30470g, f30471h};
    }

    public static P0 valueOf(String str) {
        return (P0) Enum.valueOf(P0.class, str);
    }

    public static P0[] values() {
        return (P0[]) f30472i.clone();
    }

    public final int c() {
        return this.f30474a;
    }
}
