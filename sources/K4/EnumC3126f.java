package k4;

import L5.InterfaceC1227k;
import L5.l;
import L5.o;
import androidx.annotation.RestrictTo;
import androidx.autofill.HintConstants;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import j4.AbstractC3081g;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3160z;
import m4.G;
import r2.AbstractC3685e;
import x6.AbstractC3964y;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@t6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: k4.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class EnumC3126f {
    public static final b Companion;

    /* renamed from: d, reason: collision with root package name */
    private static final InterfaceC1227k f33456d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC3126f f33457e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC3126f f33458f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC3126f f33459g;

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC3126f f33460h;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC3126f f33461i;

    /* renamed from: j, reason: collision with root package name */
    public static final EnumC3126f f33462j;

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC3126f f33463k;

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC3126f f33464l;

    /* renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ EnumC3126f[] f33465m;

    /* renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ R5.a f33466n;

    /* renamed from: a, reason: collision with root package name */
    private final String f33467a;

    /* renamed from: b, reason: collision with root package name */
    private final G f33468b;

    /* renamed from: c, reason: collision with root package name */
    private final int f33469c;

    /* renamed from: k4.f$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f33470a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t6.b invoke() {
            return AbstractC3964y.a("com.stripe.android.uicore.address.FieldType", EnumC3126f.values(), new String[]{"addressLine1", "addressLine2", "locality", "dependentLocality", HintConstants.AUTOFILL_HINT_POSTAL_CODE, "sortingCode", "administrativeArea", "name"}, new Annotation[][]{null, null, null, null, null, null, null, null}, null);
        }
    }

    /* renamed from: k4.f$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        private final /* synthetic */ t6.b a() {
            return (t6.b) EnumC3126f.f33456d.getValue();
        }

        public final t6.b serializer() {
            return a();
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    static {
        G.b bVar = G.Companion;
        f33457e = new EnumC3126f("AddressLine1", 0, "addressLine1", bVar.p(), AbstractC3685e.f37555a);
        f33458f = new EnumC3126f("AddressLine2", 1, "addressLine2", bVar.q(), AbstractC3081g.f33175b);
        G k8 = bVar.k();
        int i8 = AbstractC3685e.f37556b;
        f33459g = new EnumC3126f("Locality", 2, "locality", k8, i8);
        f33460h = new EnumC3126f("DependentLocality", 3, "dependentLocality", bVar.m(), i8);
        f33461i = new EnumC3126f("PostalCode", 4) { // from class: k4.f.c
            {
                G u8 = G.Companion.u();
                int i9 = AbstractC3685e.f37561g;
                AbstractC3151p abstractC3151p = null;
                String str = HintConstants.AUTOFILL_HINT_POSTAL_CODE;
            }

            @Override // k4.EnumC3126f
            public int c() {
                return KeyboardCapitalization.Companion.m4896getNoneIUNYP9k();
            }
        };
        f33462j = new EnumC3126f("SortingCode", 5) { // from class: k4.f.d
            {
                G y8 = G.Companion.y();
                int i9 = AbstractC3685e.f37561g;
                AbstractC3151p abstractC3151p = null;
                String str = "sortingCode";
            }

            @Override // k4.EnumC3126f
            public int c() {
                return KeyboardCapitalization.Companion.m4896getNoneIUNYP9k();
            }
        };
        f33463k = new EnumC3126f("AdministrativeArea", 6, "administrativeArea", bVar.z(), g.f33494v.c());
        f33464l = new EnumC3126f("Name", 7, "name", bVar.r(), AbstractC3685e.f37559e);
        EnumC3126f[] a8 = a();
        f33465m = a8;
        f33466n = R5.b.a(a8);
        Companion = new b(null);
        f33456d = l.a(o.f6492b, a.f33470a);
    }

    public /* synthetic */ EnumC3126f(String str, int i8, String str2, G g8, int i9, AbstractC3151p abstractC3151p) {
        this(str, i8, str2, g8, i9);
    }

    private static final /* synthetic */ EnumC3126f[] a() {
        return new EnumC3126f[]{f33457e, f33458f, f33459g, f33460h, f33461i, f33462j, f33463k, f33464l};
    }

    public static EnumC3126f valueOf(String str) {
        return (EnumC3126f) Enum.valueOf(EnumC3126f.class, str);
    }

    public static EnumC3126f[] values() {
        return (EnumC3126f[]) f33465m.clone();
    }

    public int c() {
        return KeyboardCapitalization.Companion.m4898getWordsIUNYP9k();
    }

    public final int d() {
        return this.f33469c;
    }

    public final G e() {
        return this.f33468b;
    }

    private EnumC3126f(String str, int i8, String str2, G g8, int i9) {
        this.f33467a = str2;
        this.f33468b = g8;
        this.f33469c = i9;
    }
}
