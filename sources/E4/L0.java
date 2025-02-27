package e4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import m4.G;
import x6.AbstractC3942d0;
import x6.C;
import x6.C3944e0;
import x6.C3948h;

@StabilityInferred(parameters = 0)
@t6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class L0 extends AbstractC2608f0 {

    /* renamed from: a, reason: collision with root package name */
    private final m4.G f30424a;

    /* renamed from: b, reason: collision with root package name */
    private final int f30425b;

    /* renamed from: c, reason: collision with root package name */
    private final EnumC2639z f30426c;

    /* renamed from: d, reason: collision with root package name */
    private final EnumC2624n0 f30427d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f30428e;
    public static final b Companion = new b(null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f30422f = m4.G.f35059d;
    public static final Parcelable.Creator<L0> CREATOR = new c();

    /* renamed from: g, reason: collision with root package name */
    private static final t6.b[] f30423g = {null, null, EnumC2639z.Companion.serializer(), EnumC2624n0.Companion.serializer(), null};

    /* loaded from: classes4.dex */
    public static final class a implements x6.C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f30429a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C3944e0 f30430b;

        static {
            a aVar = new a();
            f30429a = aVar;
            C3944e0 c3944e0 = new C3944e0("com.stripe.android.ui.core.elements.SimpleTextSpec", aVar, 5);
            c3944e0.k("api_path", false);
            c3944e0.k("label", false);
            c3944e0.k("capitalization", true);
            c3944e0.k("keyboard_type", true);
            c3944e0.k("show_optional_label", true);
            f30430b = c3944e0;
        }

        private a() {
        }

        @Override // t6.b, t6.i, t6.InterfaceC3796a
        public v6.f a() {
            return f30430b;
        }

        @Override // x6.C
        public t6.b[] b() {
            return C.a.a(this);
        }

        @Override // x6.C
        public t6.b[] d() {
            t6.b[] bVarArr = L0.f30423g;
            return new t6.b[]{G.a.f35085a, x6.H.f39499a, bVarArr[2], bVarArr[3], C3948h.f39553a};
        }

        @Override // t6.InterfaceC3796a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public L0 c(w6.e decoder) {
            boolean z8;
            int i8;
            int i9;
            m4.G g8;
            EnumC2639z enumC2639z;
            EnumC2624n0 enumC2624n0;
            AbstractC3159y.i(decoder, "decoder");
            v6.f a8 = a();
            w6.c d8 = decoder.d(a8);
            t6.b[] bVarArr = L0.f30423g;
            if (d8.z()) {
                m4.G g9 = (m4.G) d8.r(a8, 0, G.a.f35085a, null);
                int u8 = d8.u(a8, 1);
                EnumC2639z enumC2639z2 = (EnumC2639z) d8.r(a8, 2, bVarArr[2], null);
                enumC2624n0 = (EnumC2624n0) d8.r(a8, 3, bVarArr[3], null);
                g8 = g9;
                z8 = d8.j(a8, 4);
                enumC2639z = enumC2639z2;
                i9 = u8;
                i8 = 31;
            } else {
                m4.G g10 = null;
                EnumC2639z enumC2639z3 = null;
                EnumC2624n0 enumC2624n02 = null;
                boolean z9 = false;
                int i10 = 0;
                int i11 = 0;
                boolean z10 = true;
                while (z10) {
                    int p8 = d8.p(a8);
                    if (p8 != -1) {
                        if (p8 != 0) {
                            if (p8 != 1) {
                                if (p8 != 2) {
                                    if (p8 != 3) {
                                        if (p8 == 4) {
                                            z9 = d8.j(a8, 4);
                                            i10 |= 16;
                                        } else {
                                            throw new t6.l(p8);
                                        }
                                    } else {
                                        enumC2624n02 = (EnumC2624n0) d8.r(a8, 3, bVarArr[3], enumC2624n02);
                                        i10 |= 8;
                                    }
                                } else {
                                    enumC2639z3 = (EnumC2639z) d8.r(a8, 2, bVarArr[2], enumC2639z3);
                                    i10 |= 4;
                                }
                            } else {
                                i11 = d8.u(a8, 1);
                                i10 |= 2;
                            }
                        } else {
                            g10 = (m4.G) d8.r(a8, 0, G.a.f35085a, g10);
                            i10 |= 1;
                        }
                    } else {
                        z10 = false;
                    }
                }
                z8 = z9;
                i8 = i10;
                i9 = i11;
                g8 = g10;
                enumC2639z = enumC2639z3;
                enumC2624n0 = enumC2624n02;
            }
            d8.a(a8);
            return new L0(i8, g8, i9, enumC2639z, enumC2624n0, z8, (x6.n0) null);
        }

        @Override // t6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(w6.f encoder, L0 value) {
            AbstractC3159y.i(encoder, "encoder");
            AbstractC3159y.i(value, "value");
            v6.f a8 = a();
            w6.d d8 = encoder.d(a8);
            L0.k(value, d8, a8);
            d8.a(a8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final t6.b serializer() {
            return a.f30429a;
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final L0 createFromParcel(Parcel parcel) {
            boolean z8;
            AbstractC3159y.i(parcel, "parcel");
            m4.G g8 = (m4.G) parcel.readParcelable(L0.class.getClassLoader());
            int readInt = parcel.readInt();
            EnumC2639z valueOf = EnumC2639z.valueOf(parcel.readString());
            EnumC2624n0 valueOf2 = EnumC2624n0.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            return new L0(g8, readInt, valueOf, valueOf2, z8);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final L0[] newArray(int i8) {
            return new L0[i8];
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30431a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f30432b;

        static {
            int[] iArr = new int[EnumC2639z.values().length];
            try {
                iArr[EnumC2639z.f30872b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2639z.f30873c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2639z.f30874d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC2639z.f30875e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f30431a = iArr;
            int[] iArr2 = new int[EnumC2624n0.values().length];
            try {
                iArr2[EnumC2624n0.f30750b.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC2624n0.f30751c.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EnumC2624n0.f30752d.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EnumC2624n0.f30753e.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[EnumC2624n0.f30754f.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[EnumC2624n0.f30755g.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[EnumC2624n0.f30756h.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[EnumC2624n0.f30757i.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            f30432b = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ L0(int i8, m4.G g8, int i9, EnumC2639z enumC2639z, EnumC2624n0 enumC2624n0, boolean z8, x6.n0 n0Var) {
        super(null);
        if (3 != (i8 & 3)) {
            AbstractC3942d0.a(i8, 3, a.f30429a.a());
        }
        this.f30424a = g8;
        this.f30425b = i9;
        if ((i8 & 4) == 0) {
            this.f30426c = EnumC2639z.f30872b;
        } else {
            this.f30426c = enumC2639z;
        }
        if ((i8 & 8) == 0) {
            this.f30427d = EnumC2624n0.f30751c;
        } else {
            this.f30427d = enumC2624n0;
        }
        if ((i8 & 16) == 0) {
            this.f30428e = false;
        } else {
            this.f30428e = z8;
        }
    }

    public static final /* synthetic */ void k(L0 l02, w6.d dVar, v6.f fVar) {
        t6.b[] bVarArr = f30423g;
        dVar.A(fVar, 0, G.a.f35085a, l02.i());
        dVar.v(fVar, 1, l02.f30425b);
        if (dVar.i(fVar, 2) || l02.f30426c != EnumC2639z.f30872b) {
            dVar.A(fVar, 2, bVarArr[2], l02.f30426c);
        }
        if (dVar.i(fVar, 3) || l02.f30427d != EnumC2624n0.f30751c) {
            dVar.A(fVar, 3, bVarArr[3], l02.f30427d);
        }
        if (dVar.i(fVar, 4) || l02.f30428e) {
            dVar.o(fVar, 4, l02.f30428e);
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
        if (!(obj instanceof L0)) {
            return false;
        }
        L0 l02 = (L0) obj;
        if (AbstractC3159y.d(this.f30424a, l02.f30424a) && this.f30425b == l02.f30425b && this.f30426c == l02.f30426c && this.f30427d == l02.f30427d && this.f30428e == l02.f30428e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.f30424a.hashCode() * 31) + this.f30425b) * 31) + this.f30426c.hashCode()) * 31) + this.f30427d.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f30428e);
    }

    public m4.G i() {
        return this.f30424a;
    }

    public final m4.h0 j(Map initialValues) {
        int m4896getNoneIUNYP9k;
        int m4922getTextPjHm6EE;
        AbstractC3159y.i(initialValues, "initialValues");
        m4.G i8 = i();
        Integer valueOf = Integer.valueOf(this.f30425b);
        int i9 = d.f30431a[this.f30426c.ordinal()];
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 == 4) {
                        m4896getNoneIUNYP9k = KeyboardCapitalization.Companion.m4897getSentencesIUNYP9k();
                    } else {
                        throw new L5.p();
                    }
                } else {
                    m4896getNoneIUNYP9k = KeyboardCapitalization.Companion.m4898getWordsIUNYP9k();
                }
            } else {
                m4896getNoneIUNYP9k = KeyboardCapitalization.Companion.m4895getCharactersIUNYP9k();
            }
        } else {
            m4896getNoneIUNYP9k = KeyboardCapitalization.Companion.m4896getNoneIUNYP9k();
        }
        int i10 = m4896getNoneIUNYP9k;
        switch (d.f30432b[this.f30427d.ordinal()]) {
            case 1:
                m4922getTextPjHm6EE = KeyboardType.Companion.m4922getTextPjHm6EE();
                break;
            case 2:
                m4922getTextPjHm6EE = KeyboardType.Companion.m4915getAsciiPjHm6EE();
                break;
            case 3:
                m4922getTextPjHm6EE = KeyboardType.Companion.m4918getNumberPjHm6EE();
                break;
            case 4:
                m4922getTextPjHm6EE = KeyboardType.Companion.m4921getPhonePjHm6EE();
                break;
            case 5:
                m4922getTextPjHm6EE = KeyboardType.Companion.m4923getUriPjHm6EE();
                break;
            case 6:
                m4922getTextPjHm6EE = KeyboardType.Companion.m4917getEmailPjHm6EE();
                break;
            case 7:
                m4922getTextPjHm6EE = KeyboardType.Companion.m4920getPasswordPjHm6EE();
                break;
            case 8:
                m4922getTextPjHm6EE = KeyboardType.Companion.m4919getNumberPasswordPjHm6EE();
                break;
            default:
                throw new L5.p();
        }
        return AbstractC2608f0.e(this, new m4.q0(i8, new m4.s0(new m4.r0(valueOf, i10, m4922getTextPjHm6EE, null, 8, null), this.f30428e, (String) initialValues.get(i()))), null, 2, null);
    }

    public String toString() {
        return "SimpleTextSpec(apiPath=" + this.f30424a + ", label=" + this.f30425b + ", capitalization=" + this.f30426c + ", keyboardType=" + this.f30427d + ", showOptionalLabel=" + this.f30428e + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeParcelable(this.f30424a, i8);
        out.writeInt(this.f30425b);
        out.writeString(this.f30426c.name());
        out.writeString(this.f30427d.name());
        out.writeInt(this.f30428e ? 1 : 0);
    }

    public /* synthetic */ L0(m4.G g8, int i8, EnumC2639z enumC2639z, EnumC2624n0 enumC2624n0, boolean z8, int i9, AbstractC3151p abstractC3151p) {
        this(g8, i8, (i9 & 4) != 0 ? EnumC2639z.f30872b : enumC2639z, (i9 & 8) != 0 ? EnumC2624n0.f30751c : enumC2624n0, (i9 & 16) != 0 ? false : z8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L0(m4.G apiPath, int i8, EnumC2639z capitalization, EnumC2624n0 keyboardType, boolean z8) {
        super(null);
        AbstractC3159y.i(apiPath, "apiPath");
        AbstractC3159y.i(capitalization, "capitalization");
        AbstractC3159y.i(keyboardType, "keyboardType");
        this.f30424a = apiPath;
        this.f30425b = i8;
        this.f30426c = capitalization;
        this.f30427d = keyboardType;
        this.f30428e = z8;
    }
}
