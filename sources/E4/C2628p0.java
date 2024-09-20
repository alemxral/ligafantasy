package e4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import m4.G;
import x6.C;
import x6.C3944e0;

@StabilityInferred(parameters = 0)
@t6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: e4.p0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2628p0 extends AbstractC2608f0 {

    /* renamed from: a, reason: collision with root package name */
    private final m4.G f30779a;

    /* renamed from: b, reason: collision with root package name */
    private final int f30780b;

    /* renamed from: c, reason: collision with root package name */
    private final u0 f30781c;
    public static final b Companion = new b(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f30778d = m4.G.f35059d;
    public static final Parcelable.Creator<C2628p0> CREATOR = new c();

    /* renamed from: e4.p0$a */
    /* loaded from: classes4.dex */
    public static final class a implements x6.C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f30782a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C3944e0 f30783b;

        static {
            a aVar = new a();
            f30782a = aVar;
            C3944e0 c3944e0 = new C3944e0("com.stripe.android.ui.core.elements.KlarnaMandateTextSpec", aVar, 2);
            c3944e0.k("api_path", true);
            c3944e0.k("stringResId", true);
            f30783b = c3944e0;
        }

        private a() {
        }

        @Override // t6.b, t6.i, t6.InterfaceC3796a
        public v6.f a() {
            return f30783b;
        }

        @Override // x6.C
        public t6.b[] b() {
            return C.a.a(this);
        }

        @Override // x6.C
        public t6.b[] d() {
            return new t6.b[]{G.a.f35085a, x6.H.f39499a};
        }

        @Override // t6.InterfaceC3796a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C2628p0 c(w6.e decoder) {
            m4.G g8;
            int i8;
            int i9;
            AbstractC3159y.i(decoder, "decoder");
            v6.f a8 = a();
            w6.c d8 = decoder.d(a8);
            x6.n0 n0Var = null;
            if (d8.z()) {
                g8 = (m4.G) d8.r(a8, 0, G.a.f35085a, null);
                i8 = d8.u(a8, 1);
                i9 = 3;
            } else {
                g8 = null;
                int i10 = 0;
                int i11 = 0;
                boolean z8 = true;
                while (z8) {
                    int p8 = d8.p(a8);
                    if (p8 != -1) {
                        if (p8 != 0) {
                            if (p8 == 1) {
                                i10 = d8.u(a8, 1);
                                i11 |= 2;
                            } else {
                                throw new t6.l(p8);
                            }
                        } else {
                            g8 = (m4.G) d8.r(a8, 0, G.a.f35085a, g8);
                            i11 |= 1;
                        }
                    } else {
                        z8 = false;
                    }
                }
                i8 = i10;
                i9 = i11;
            }
            d8.a(a8);
            return new C2628p0(i9, g8, i8, n0Var);
        }

        @Override // t6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(w6.f encoder, C2628p0 value) {
            AbstractC3159y.i(encoder, "encoder");
            AbstractC3159y.i(value, "value");
            v6.f a8 = a();
            w6.d d8 = encoder.d(a8);
            C2628p0.j(value, d8, a8);
            d8.a(a8);
        }
    }

    /* renamed from: e4.p0$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final t6.b serializer() {
            return a.f30782a;
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: e4.p0$c */
    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2628p0 createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new C2628p0((m4.G) parcel.readParcelable(C2628p0.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2628p0[] newArray(int i8) {
            return new C2628p0[i8];
        }
    }

    public /* synthetic */ C2628p0(int i8, m4.G g8, int i9, x6.n0 n0Var) {
        super(null);
        this.f30779a = (i8 & 1) == 0 ? m4.G.Companion.a("klarna_mandate") : g8;
        if ((i8 & 2) == 0) {
            this.f30780b = b4.n.f14671A;
        } else {
            this.f30780b = i9;
        }
        this.f30781c = new u0(f(), this.f30780b);
    }

    public static final /* synthetic */ void j(C2628p0 c2628p0, w6.d dVar, v6.f fVar) {
        if (dVar.i(fVar, 0) || !AbstractC3159y.d(c2628p0.f(), m4.G.Companion.a("klarna_mandate"))) {
            dVar.A(fVar, 0, G.a.f35085a, c2628p0.f());
        }
        if (dVar.i(fVar, 1) || c2628p0.f30780b != b4.n.f14671A) {
            dVar.v(fVar, 1, c2628p0.f30780b);
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
        if (!(obj instanceof C2628p0)) {
            return false;
        }
        C2628p0 c2628p0 = (C2628p0) obj;
        if (AbstractC3159y.d(this.f30779a, c2628p0.f30779a) && this.f30780b == c2628p0.f30780b) {
            return true;
        }
        return false;
    }

    public m4.G f() {
        return this.f30779a;
    }

    public int hashCode() {
        return (this.f30779a.hashCode() * 31) + this.f30780b;
    }

    public final m4.D i(String merchantName) {
        AbstractC3159y.i(merchantName, "merchantName");
        return this.f30781c.i(merchantName, merchantName);
    }

    public String toString() {
        return "KlarnaMandateTextSpec(apiPath=" + this.f30779a + ", stringResId=" + this.f30780b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeParcelable(this.f30779a, i8);
        out.writeInt(this.f30780b);
    }

    public /* synthetic */ C2628p0(m4.G g8, int i8, int i9, AbstractC3151p abstractC3151p) {
        this((i9 & 1) != 0 ? m4.G.Companion.a("klarna_mandate") : g8, (i9 & 2) != 0 ? b4.n.f14671A : i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2628p0(m4.G apiPath, int i8) {
        super(null);
        AbstractC3159y.i(apiPath, "apiPath");
        this.f30779a = apiPath;
        this.f30780b = i8;
        this.f30781c = new u0(f(), i8);
    }
}
