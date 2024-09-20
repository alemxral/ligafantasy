package e4;

import L5.InterfaceC1227k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.core.os.EnvironmentCompat;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import m4.G;
import x6.AbstractC3964y;
import x6.C;
import x6.C3944e0;

@StabilityInferred(parameters = 0)
@t6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class z0 extends AbstractC2608f0 {

    /* renamed from: a, reason: collision with root package name */
    private final m4.G f30881a;

    /* renamed from: b, reason: collision with root package name */
    private final d f30882b;
    public static final b Companion = new b(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f30879c = m4.G.f35059d;
    public static final Parcelable.Creator<z0> CREATOR = new c();

    /* renamed from: d, reason: collision with root package name */
    private static final t6.b[] f30880d = {null, d.Companion.serializer()};

    /* loaded from: classes4.dex */
    public static final class a implements x6.C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f30883a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C3944e0 f30884b;

        static {
            a aVar = new a();
            f30883a = aVar;
            C3944e0 c3944e0 = new C3944e0("com.stripe.android.ui.core.elements.PlaceholderSpec", aVar, 2);
            c3944e0.k("api_path", true);
            c3944e0.k("for", true);
            f30884b = c3944e0;
        }

        private a() {
        }

        @Override // t6.b, t6.i, t6.InterfaceC3796a
        public v6.f a() {
            return f30884b;
        }

        @Override // x6.C
        public t6.b[] b() {
            return C.a.a(this);
        }

        @Override // x6.C
        public t6.b[] d() {
            return new t6.b[]{G.a.f35085a, z0.f30880d[1]};
        }

        @Override // t6.InterfaceC3796a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public z0 c(w6.e decoder) {
            d dVar;
            m4.G g8;
            int i8;
            AbstractC3159y.i(decoder, "decoder");
            v6.f a8 = a();
            w6.c d8 = decoder.d(a8);
            t6.b[] bVarArr = z0.f30880d;
            x6.n0 n0Var = null;
            if (d8.z()) {
                g8 = (m4.G) d8.r(a8, 0, G.a.f35085a, null);
                dVar = (d) d8.r(a8, 1, bVarArr[1], null);
                i8 = 3;
            } else {
                d dVar2 = null;
                m4.G g9 = null;
                int i9 = 0;
                boolean z8 = true;
                while (z8) {
                    int p8 = d8.p(a8);
                    if (p8 != -1) {
                        if (p8 != 0) {
                            if (p8 == 1) {
                                dVar2 = (d) d8.r(a8, 1, bVarArr[1], dVar2);
                                i9 |= 2;
                            } else {
                                throw new t6.l(p8);
                            }
                        } else {
                            g9 = (m4.G) d8.r(a8, 0, G.a.f35085a, g9);
                            i9 |= 1;
                        }
                    } else {
                        z8 = false;
                    }
                }
                dVar = dVar2;
                g8 = g9;
                i8 = i9;
            }
            d8.a(a8);
            return new z0(i8, g8, dVar, n0Var);
        }

        @Override // t6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(w6.f encoder, z0 value) {
            AbstractC3159y.i(encoder, "encoder");
            AbstractC3159y.i(value, "value");
            v6.f a8 = a();
            w6.d d8 = encoder.d(a8);
            z0.k(value, d8, a8);
            d8.a(a8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final t6.b serializer() {
            return a.f30883a;
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final z0 createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new z0((m4.G) parcel.readParcelable(z0.class.getClassLoader()), d.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final z0[] newArray(int i8) {
            return new z0[i8];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @t6.g
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes4.dex */
    public static final class d {
        public static final b Companion;

        /* renamed from: a, reason: collision with root package name */
        private static final InterfaceC1227k f30885a;

        /* renamed from: b, reason: collision with root package name */
        public static final d f30886b = new d("Name", 0);

        /* renamed from: c, reason: collision with root package name */
        public static final d f30887c = new d("Email", 1);

        /* renamed from: d, reason: collision with root package name */
        public static final d f30888d = new d("Phone", 2);

        /* renamed from: e, reason: collision with root package name */
        public static final d f30889e = new d("BillingAddress", 3);

        /* renamed from: f, reason: collision with root package name */
        public static final d f30890f = new d("BillingAddressWithoutCountry", 4);

        /* renamed from: g, reason: collision with root package name */
        public static final d f30891g = new d("SepaMandate", 5);

        /* renamed from: h, reason: collision with root package name */
        public static final d f30892h = new d("Unknown", 6);

        /* renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ d[] f30893i;

        /* renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ R5.a f30894j;

        /* loaded from: classes4.dex */
        static final class a extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            public static final a f30895a = new a();

            a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final t6.b invoke() {
                return AbstractC3964y.a("com.stripe.android.ui.core.elements.PlaceholderSpec.PlaceholderField", d.values(), new String[]{"name", NotificationCompat.CATEGORY_EMAIL, HintConstants.AUTOFILL_HINT_PHONE, "billing_address", "billing_address_without_country", "sepa_mandate", EnvironmentCompat.MEDIA_UNKNOWN}, new Annotation[][]{null, null, null, null, null, null, null}, null);
            }
        }

        /* loaded from: classes4.dex */
        public static final class b {
            private b() {
            }

            private final /* synthetic */ t6.b a() {
                return (t6.b) d.f30885a.getValue();
            }

            public final t6.b serializer() {
                return a();
            }

            public /* synthetic */ b(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        static {
            d[] a8 = a();
            f30893i = a8;
            f30894j = R5.b.a(a8);
            Companion = new b(null);
            f30885a = L5.l.a(L5.o.f6492b, a.f30895a);
        }

        private d(String str, int i8) {
        }

        private static final /* synthetic */ d[] a() {
            return new d[]{f30886b, f30887c, f30888d, f30889e, f30890f, f30891g, f30892h};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f30893i.clone();
        }
    }

    public /* synthetic */ z0(int i8, m4.G g8, d dVar, x6.n0 n0Var) {
        super(null);
        this.f30881a = (i8 & 1) == 0 ? m4.G.Companion.a("placeholder") : g8;
        if ((i8 & 2) == 0) {
            this.f30882b = d.f30892h;
        } else {
            this.f30882b = dVar;
        }
    }

    public static final /* synthetic */ void k(z0 z0Var, w6.d dVar, v6.f fVar) {
        t6.b[] bVarArr = f30880d;
        if (dVar.i(fVar, 0) || !AbstractC3159y.d(z0Var.i(), m4.G.Companion.a("placeholder"))) {
            dVar.A(fVar, 0, G.a.f35085a, z0Var.i());
        }
        if (dVar.i(fVar, 1) || z0Var.f30882b != d.f30892h) {
            dVar.A(fVar, 1, bVarArr[1], z0Var.f30882b);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        if (AbstractC3159y.d(this.f30881a, z0Var.f30881a) && this.f30882b == z0Var.f30882b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f30881a.hashCode() * 31) + this.f30882b.hashCode();
    }

    public m4.G i() {
        return this.f30881a;
    }

    public final d j() {
        return this.f30882b;
    }

    public String toString() {
        return "PlaceholderSpec(apiPath=" + this.f30881a + ", field=" + this.f30882b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeParcelable(this.f30881a, i8);
        out.writeString(this.f30882b.name());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(m4.G apiPath, d field) {
        super(null);
        AbstractC3159y.i(apiPath, "apiPath");
        AbstractC3159y.i(field, "field");
        this.f30881a = apiPath;
        this.f30882b = field;
    }
}
