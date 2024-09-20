package T2;

import K2.d;
import L5.p;
import M5.AbstractC1246t;
import M5.a0;
import g6.n;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import v2.C3826b;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: i, reason: collision with root package name */
    public static final a f9764i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    public static final int f9765j = 8;

    /* renamed from: a, reason: collision with root package name */
    private final m f9766a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9767b;

    /* renamed from: c, reason: collision with root package name */
    private final k f9768c;

    /* renamed from: d, reason: collision with root package name */
    private final List f9769d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f9770e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f9771f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f9772g;

    /* renamed from: h, reason: collision with root package name */
    private final U2.a f9773h;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: T2.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C0215a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f9774a;

            static {
                int[] iArr = new int[k.values().length];
                try {
                    iArr[k.f9953a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[k.f9954b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f9774a = iArr;
            }
        }

        private a() {
        }

        public final e a(k signupMode, K2.d config) {
            boolean z8;
            Set b12;
            AbstractC3159y.i(signupMode, "signupMode");
            AbstractC3159y.i(config, "config");
            boolean z9 = false;
            if (signupMode == k.f9954b) {
                z8 = true;
            } else {
                z8 = false;
            }
            d.b b8 = config.b();
            List c8 = AbstractC1246t.c();
            String c9 = b8.c();
            if (c9 == null || n.u(c9)) {
                z9 = true;
            }
            boolean z10 = !z9;
            if (z8 && z10) {
                c8.add(j.f9949b);
                c8.add(j.f9948a);
            } else if (z8) {
                c8.add(j.f9948a);
                c8.add(j.f9949b);
            } else {
                c8.add(j.f9948a);
                c8.add(j.f9949b);
            }
            if (!AbstractC3159y.d(config.j().p(), C3826b.Companion.b().c())) {
                c8.add(j.f9950c);
            }
            List a8 = AbstractC1246t.a(c8);
            int i8 = C0215a.f9774a[signupMode.ordinal()];
            if (i8 != 1) {
                if (i8 == 2) {
                    b12 = a0.l(AbstractC1246t.b1(a8), AbstractC1246t.m0(a8));
                } else {
                    throw new p();
                }
            } else {
                b12 = AbstractC1246t.b1(a8);
            }
            return new e(null, config.f(), signupMode, a8, b12, false, false, null, 224, null);
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9775a;

        static {
            int[] iArr = new int[k.values().length];
            try {
                iArr[k.f9954b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.f9953a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f9775a = iArr;
        }
    }

    public e(m mVar, String merchantName, k kVar, List fields, Set prefillEligibleFields, boolean z8, boolean z9, U2.a signUpState) {
        AbstractC3159y.i(merchantName, "merchantName");
        AbstractC3159y.i(fields, "fields");
        AbstractC3159y.i(prefillEligibleFields, "prefillEligibleFields");
        AbstractC3159y.i(signUpState, "signUpState");
        this.f9766a = mVar;
        this.f9767b = merchantName;
        this.f9768c = kVar;
        this.f9769d = fields;
        this.f9770e = prefillEligibleFields;
        this.f9771f = z8;
        this.f9772g = z9;
        this.f9773h = signUpState;
    }

    public static /* synthetic */ e b(e eVar, m mVar, String str, k kVar, List list, Set set, boolean z8, boolean z9, U2.a aVar, int i8, Object obj) {
        m mVar2;
        String str2;
        k kVar2;
        List list2;
        Set set2;
        boolean z10;
        boolean z11;
        U2.a aVar2;
        if ((i8 & 1) != 0) {
            mVar2 = eVar.f9766a;
        } else {
            mVar2 = mVar;
        }
        if ((i8 & 2) != 0) {
            str2 = eVar.f9767b;
        } else {
            str2 = str;
        }
        if ((i8 & 4) != 0) {
            kVar2 = eVar.f9768c;
        } else {
            kVar2 = kVar;
        }
        if ((i8 & 8) != 0) {
            list2 = eVar.f9769d;
        } else {
            list2 = list;
        }
        if ((i8 & 16) != 0) {
            set2 = eVar.f9770e;
        } else {
            set2 = set;
        }
        if ((i8 & 32) != 0) {
            z10 = eVar.f9771f;
        } else {
            z10 = z8;
        }
        if ((i8 & 64) != 0) {
            z11 = eVar.f9772g;
        } else {
            z11 = z9;
        }
        if ((i8 & 128) != 0) {
            aVar2 = eVar.f9773h;
        } else {
            aVar2 = aVar;
        }
        return eVar.a(mVar2, str2, kVar2, list2, set2, z10, z11, aVar2);
    }

    public final e a(m mVar, String merchantName, k kVar, List fields, Set prefillEligibleFields, boolean z8, boolean z9, U2.a signUpState) {
        AbstractC3159y.i(merchantName, "merchantName");
        AbstractC3159y.i(fields, "fields");
        AbstractC3159y.i(prefillEligibleFields, "prefillEligibleFields");
        AbstractC3159y.i(signUpState, "signUpState");
        return new e(mVar, merchantName, kVar, fields, prefillEligibleFields, z8, z9, signUpState);
    }

    public final List c() {
        return this.f9769d;
    }

    public final String d() {
        return this.f9767b;
    }

    public final Set e() {
        return this.f9770e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (AbstractC3159y.d(this.f9766a, eVar.f9766a) && AbstractC3159y.d(this.f9767b, eVar.f9767b) && this.f9768c == eVar.f9768c && AbstractC3159y.d(this.f9769d, eVar.f9769d) && AbstractC3159y.d(this.f9770e, eVar.f9770e) && this.f9771f == eVar.f9771f && this.f9772g == eVar.f9772g && this.f9773h == eVar.f9773h) {
            return true;
        }
        return false;
    }

    public final U2.a f() {
        return this.f9773h;
    }

    public final k g() {
        return this.f9768c;
    }

    public final boolean h() {
        int i8;
        k kVar = this.f9768c;
        if (kVar == null) {
            i8 = -1;
        } else {
            i8 = b.f9775a[kVar.ordinal()];
        }
        if (i8 == -1) {
            return false;
        }
        if (i8 != 1) {
            if (i8 == 2) {
                if (!this.f9771f || this.f9772g) {
                    return false;
                }
            } else {
                throw new p();
            }
        } else if (this.f9766a == null || this.f9772g) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        m mVar = this.f9766a;
        int i8 = 0;
        if (mVar == null) {
            hashCode = 0;
        } else {
            hashCode = mVar.hashCode();
        }
        int hashCode2 = ((hashCode * 31) + this.f9767b.hashCode()) * 31;
        k kVar = this.f9768c;
        if (kVar != null) {
            i8 = kVar.hashCode();
        }
        return ((((((((((hashCode2 + i8) * 31) + this.f9769d.hashCode()) * 31) + this.f9770e.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f9771f)) * 31) + androidx.compose.foundation.a.a(this.f9772g)) * 31) + this.f9773h.hashCode();
    }

    public final m i() {
        return this.f9766a;
    }

    public final boolean j() {
        return this.f9771f;
    }

    public final boolean k() {
        if (AbstractC1246t.m0(this.f9769d) == j.f9948a) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if (AbstractC1246t.m0(this.f9769d) == j.f9949b) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "InlineSignupViewState(userInput=" + this.f9766a + ", merchantName=" + this.f9767b + ", signupMode=" + this.f9768c + ", fields=" + this.f9769d + ", prefillEligibleFields=" + this.f9770e + ", isExpanded=" + this.f9771f + ", apiFailed=" + this.f9772g + ", signUpState=" + this.f9773h + ")";
    }

    public /* synthetic */ e(m mVar, String str, k kVar, List list, Set set, boolean z8, boolean z9, U2.a aVar, int i8, AbstractC3151p abstractC3151p) {
        this(mVar, str, kVar, list, set, (i8 & 32) != 0 ? false : z8, (i8 & 64) != 0 ? false : z9, (i8 & 128) != 0 ? U2.a.f11057a : aVar);
    }
}
