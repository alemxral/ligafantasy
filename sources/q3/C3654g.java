package q3;

import b3.EnumC1870e;
import com.stripe.android.model.o;
import j2.AbstractC3053E;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3159y;
import y2.AbstractC3984c;
import y2.InterfaceC3983b;

/* renamed from: q3.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3654g {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3983b f37315a;

    /* renamed from: b, reason: collision with root package name */
    private final com.stripe.android.model.o f37316b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f37317c;

    /* renamed from: q3.g$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37318a;

        static {
            int[] iArr = new int[o.p.values().length];
            try {
                iArr[o.p.f24519i.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.p.f24523m.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o.p.f24509O.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f37318a = iArr;
        }
    }

    public C3654g(InterfaceC3983b displayName, com.stripe.android.model.o paymentMethod, boolean z8) {
        AbstractC3159y.i(displayName, "displayName");
        AbstractC3159y.i(paymentMethod, "paymentMethod");
        this.f37315a = displayName;
        this.f37316b = paymentMethod;
        this.f37317c = z8;
    }

    public final InterfaceC3983b a() {
        int i8;
        EnumC1870e enumC1870e;
        String str;
        String str2;
        String str3;
        o.p pVar = this.f37316b.f24399e;
        if (pVar == null) {
            i8 = -1;
        } else {
            i8 = a.f37318a[pVar.ordinal()];
        }
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    return AbstractC3984c.e("", new Object[0]);
                }
                int i9 = w.f37436c;
                o.r rVar = this.f37316b.f24412r;
                if (rVar != null) {
                    str3 = rVar.f24547e;
                } else {
                    str3 = null;
                }
                return AbstractC3984c.f(i9, new Object[]{str3}, null, 4, null);
            }
            int i10 = w.f37436c;
            o.n nVar = this.f37316b.f24406l;
            if (nVar != null) {
                str2 = nVar.f24493e;
            } else {
                str2 = null;
            }
            return AbstractC3984c.f(i10, new Object[]{str2}, null, 4, null);
        }
        int i11 = AbstractC3053E.f32853Z;
        o.g gVar = this.f37316b.f24402h;
        if (gVar != null) {
            enumC1870e = gVar.f24462a;
        } else {
            enumC1870e = null;
        }
        if (gVar != null) {
            str = gVar.f24469h;
        } else {
            str = null;
        }
        return AbstractC3984c.f(i11, new Object[]{enumC1870e, str}, null, 4, null);
    }

    public final InterfaceC3983b b() {
        return this.f37315a;
    }

    public final InterfaceC3983b c() {
        return AbstractC3984c.f(w.f37417L, new Object[]{a()}, null, 4, null);
    }

    public final com.stripe.android.model.o d() {
        return this.f37316b;
    }

    public final InterfaceC3983b e() {
        return AbstractC3984c.f(w.f37430Y, new Object[]{a()}, null, 4, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3654g)) {
            return false;
        }
        C3654g c3654g = (C3654g) obj;
        if (AbstractC3159y.d(this.f37315a, c3654g.f37315a) && AbstractC3159y.d(this.f37316b, c3654g.f37316b) && this.f37317c == c3654g.f37317c) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        boolean z8;
        o.g.c cVar;
        Set b8;
        o.g gVar = this.f37316b.f24402h;
        if (gVar != null && (cVar = gVar.f24472k) != null && (b8 = cVar.b()) != null && b8.size() > 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (!this.f37317c || !z8) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.f37315a.hashCode() * 31) + this.f37316b.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f37317c);
    }

    public String toString() {
        return "DisplayableSavedPaymentMethod(displayName=" + this.f37315a + ", paymentMethod=" + this.f37316b + ", isCbcEligible=" + this.f37317c + ")";
    }
}
