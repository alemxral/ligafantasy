package I3;

import L5.p;
import M5.AbstractC1246t;
import com.stripe.android.googlepaylauncher.h;
import com.stripe.android.model.o;
import j2.C3073m;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import q3.w;
import y3.EnumC3987b;

/* loaded from: classes4.dex */
public final class n {

    /* renamed from: g, reason: collision with root package name */
    public static final a f4068g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final int f4069h = C3073m.a.f32993d;

    /* renamed from: a, reason: collision with root package name */
    private final c f4070a;

    /* renamed from: b, reason: collision with root package name */
    private final b f4071b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f4072c;

    /* renamed from: d, reason: collision with root package name */
    private final int f4073d;

    /* renamed from: e, reason: collision with root package name */
    private final Function0 f4074e;

    /* renamed from: f, reason: collision with root package name */
    private final Function0 f4075f;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: I3.n$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C0063a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f4076a;

            static {
                int[] iArr = new int[h.b.EnumC0476b.values().length];
                try {
                    iArr[h.b.EnumC0476b.f23919b.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[h.b.EnumC0476b.f23920c.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f4076a = iArr;
            }
        }

        private a() {
        }

        public final n a(Boolean bool, String str, boolean z8, EnumC3987b googlePayButtonType, boolean z9, List paymentMethodTypes, h.d dVar, Function0 onGooglePayPressed, Function0 onLinkPressed, boolean z10) {
            c cVar;
            boolean z11;
            C3073m.a aVar;
            int i8;
            C3073m.a.b bVar;
            AbstractC3159y.i(googlePayButtonType, "googlePayButtonType");
            AbstractC3159y.i(paymentMethodTypes, "paymentMethodTypes");
            AbstractC3159y.i(onGooglePayPressed, "onGooglePayPressed");
            AbstractC3159y.i(onLinkPressed, "onLinkPressed");
            c cVar2 = new c(str);
            if (AbstractC3159y.d(bool, Boolean.TRUE)) {
                cVar = cVar2;
            } else {
                cVar = null;
            }
            if (dVar != null) {
                z11 = dVar.b();
            } else {
                z11 = false;
            }
            if (dVar != null) {
                boolean e8 = dVar.c().e();
                int i9 = C0063a.f4076a[dVar.c().b().ordinal()];
                if (i9 != 1) {
                    if (i9 == 2) {
                        bVar = C3073m.a.b.f32998c;
                    } else {
                        throw new p();
                    }
                } else {
                    bVar = C3073m.a.b.f32997b;
                }
                aVar = new C3073m.a(e8, bVar, dVar.c().c());
            } else {
                aVar = null;
            }
            b bVar2 = new b(googlePayButtonType, z11, aVar);
            if (!z8) {
                bVar2 = null;
            }
            if (cVar == null && bVar2 == null) {
                return null;
            }
            Object M02 = AbstractC1246t.M0(paymentMethodTypes);
            o.p pVar = o.p.f24519i;
            if (AbstractC3159y.d(M02, pVar.f24537a) && !z10) {
                i8 = w.f37421P;
            } else if (AbstractC1246t.M0(paymentMethodTypes) == null && !z10) {
                i8 = w.f37420O;
            } else if (AbstractC3159y.d(AbstractC1246t.M0(paymentMethodTypes), pVar.f24537a) && z10) {
                i8 = w.f37423R;
            } else {
                i8 = w.f37422Q;
            }
            return new n(cVar, bVar2, z9, i8, onGooglePayPressed, onLinkPressed);
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: d, reason: collision with root package name */
        public static final int f4077d = C3073m.a.f32993d;

        /* renamed from: a, reason: collision with root package name */
        private final EnumC3987b f4078a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f4079b;

        /* renamed from: c, reason: collision with root package name */
        private final C3073m.a f4080c;

        public b(EnumC3987b buttonType, boolean z8, C3073m.a aVar) {
            AbstractC3159y.i(buttonType, "buttonType");
            this.f4078a = buttonType;
            this.f4079b = z8;
            this.f4080c = aVar;
        }

        public final boolean a() {
            return this.f4079b;
        }

        public final C3073m.a b() {
            return this.f4080c;
        }

        public final EnumC3987b c() {
            return this.f4078a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f4078a == bVar.f4078a && this.f4079b == bVar.f4079b && AbstractC3159y.d(this.f4080c, bVar.f4080c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = ((this.f4078a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f4079b)) * 31;
            C3073m.a aVar = this.f4080c;
            if (aVar == null) {
                hashCode = 0;
            } else {
                hashCode = aVar.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            return "GooglePay(buttonType=" + this.f4078a + ", allowCreditCards=" + this.f4079b + ", billingAddressParameters=" + this.f4080c + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final String f4081a;

        public c(String str) {
            this.f4081a = str;
        }

        public final String a() {
            return this.f4081a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && AbstractC3159y.d(this.f4081a, ((c) obj).f4081a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f4081a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Link(email=" + this.f4081a + ")";
        }
    }

    public n(c cVar, b bVar, boolean z8, int i8, Function0 onGooglePayPressed, Function0 onLinkPressed) {
        AbstractC3159y.i(onGooglePayPressed, "onGooglePayPressed");
        AbstractC3159y.i(onLinkPressed, "onLinkPressed");
        this.f4070a = cVar;
        this.f4071b = bVar;
        this.f4072c = z8;
        this.f4073d = i8;
        this.f4074e = onGooglePayPressed;
        this.f4075f = onLinkPressed;
    }

    public final boolean a() {
        return this.f4072c;
    }

    public final int b() {
        return this.f4073d;
    }

    public final b c() {
        return this.f4071b;
    }

    public final c d() {
        return this.f4070a;
    }

    public final Function0 e() {
        return this.f4074e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (AbstractC3159y.d(this.f4070a, nVar.f4070a) && AbstractC3159y.d(this.f4071b, nVar.f4071b) && this.f4072c == nVar.f4072c && this.f4073d == nVar.f4073d && AbstractC3159y.d(this.f4074e, nVar.f4074e) && AbstractC3159y.d(this.f4075f, nVar.f4075f)) {
            return true;
        }
        return false;
    }

    public final Function0 f() {
        return this.f4075f;
    }

    public int hashCode() {
        int hashCode;
        c cVar = this.f4070a;
        int i8 = 0;
        if (cVar == null) {
            hashCode = 0;
        } else {
            hashCode = cVar.hashCode();
        }
        int i9 = hashCode * 31;
        b bVar = this.f4071b;
        if (bVar != null) {
            i8 = bVar.hashCode();
        }
        return ((((((((i9 + i8) * 31) + androidx.compose.foundation.a.a(this.f4072c)) * 31) + this.f4073d) * 31) + this.f4074e.hashCode()) * 31) + this.f4075f.hashCode();
    }

    public String toString() {
        return "WalletsState(link=" + this.f4070a + ", googlePay=" + this.f4071b + ", buttonsEnabled=" + this.f4072c + ", dividerTextResource=" + this.f4073d + ", onGooglePayPressed=" + this.f4074e + ", onLinkPressed=" + this.f4075f + ")";
    }
}
