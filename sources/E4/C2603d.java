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
/* renamed from: e4.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2603d extends AbstractC2608f0 {

    /* renamed from: a, reason: collision with root package name */
    private final m4.G f30646a;
    public static final b Companion = new b(null);

    /* renamed from: b, reason: collision with root package name */
    public static final int f30645b = m4.G.f35059d;
    public static final Parcelable.Creator<C2603d> CREATOR = new c();

    /* renamed from: e4.d$a */
    /* loaded from: classes4.dex */
    public static final class a implements x6.C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f30647a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C3944e0 f30648b;

        static {
            a aVar = new a();
            f30647a = aVar;
            C3944e0 c3944e0 = new C3944e0("com.stripe.android.ui.core.elements.AffirmTextSpec", aVar, 1);
            c3944e0.k("api_path", true);
            f30648b = c3944e0;
        }

        private a() {
        }

        @Override // t6.b, t6.i, t6.InterfaceC3796a
        public v6.f a() {
            return f30648b;
        }

        @Override // x6.C
        public t6.b[] b() {
            return C.a.a(this);
        }

        @Override // x6.C
        public t6.b[] d() {
            return new t6.b[]{G.a.f35085a};
        }

        @Override // t6.InterfaceC3796a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C2603d c(w6.e decoder) {
            m4.G g8;
            AbstractC3159y.i(decoder, "decoder");
            v6.f a8 = a();
            w6.c d8 = decoder.d(a8);
            int i8 = 1;
            x6.n0 n0Var = null;
            if (d8.z()) {
                g8 = (m4.G) d8.r(a8, 0, G.a.f35085a, null);
            } else {
                g8 = null;
                boolean z8 = true;
                int i9 = 0;
                while (z8) {
                    int p8 = d8.p(a8);
                    if (p8 != -1) {
                        if (p8 == 0) {
                            g8 = (m4.G) d8.r(a8, 0, G.a.f35085a, g8);
                            i9 = 1;
                        } else {
                            throw new t6.l(p8);
                        }
                    } else {
                        z8 = false;
                    }
                }
                i8 = i9;
            }
            d8.a(a8);
            return new C2603d(i8, g8, n0Var);
        }

        @Override // t6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(w6.f encoder, C2603d value) {
            AbstractC3159y.i(encoder, "encoder");
            AbstractC3159y.i(value, "value");
            v6.f a8 = a();
            w6.d d8 = encoder.d(a8);
            C2603d.j(value, d8, a8);
            d8.a(a8);
        }
    }

    /* renamed from: e4.d$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final t6.b serializer() {
            return a.f30647a;
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: e4.d$c */
    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2603d createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new C2603d((m4.G) parcel.readParcelable(C2603d.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2603d[] newArray(int i8) {
            return new C2603d[i8];
        }
    }

    public /* synthetic */ C2603d(int i8, m4.G g8, x6.n0 n0Var) {
        super(null);
        if ((i8 & 1) == 0) {
            this.f30646a = m4.G.Companion.a("affirm_header");
        } else {
            this.f30646a = g8;
        }
    }

    public static final /* synthetic */ void j(C2603d c2603d, w6.d dVar, v6.f fVar) {
        if (dVar.i(fVar, 0) || !AbstractC3159y.d(c2603d.f(), m4.G.Companion.a("affirm_header"))) {
            dVar.A(fVar, 0, G.a.f35085a, c2603d.f());
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
        if ((obj instanceof C2603d) && AbstractC3159y.d(this.f30646a, ((C2603d) obj).f30646a)) {
            return true;
        }
        return false;
    }

    public m4.G f() {
        return this.f30646a;
    }

    public int hashCode() {
        return this.f30646a.hashCode();
    }

    public final m4.D i() {
        return new C2601c(f(), null, 2, 0 == true ? 1 : 0);
    }

    public String toString() {
        return "AffirmTextSpec(apiPath=" + this.f30646a + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeParcelable(this.f30646a, i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2603d(m4.G apiPath) {
        super(null);
        AbstractC3159y.i(apiPath, "apiPath");
        this.f30646a = apiPath;
    }
}
