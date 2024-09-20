package E3;

import b3.EnumC1870e;
import e4.P;
import j2.AbstractC3053E;
import kotlin.jvm.internal.AbstractC3159y;
import m4.x0;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final String f1987a;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC1870e f1988b;

    /* renamed from: c, reason: collision with root package name */
    private final P f1989c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f1990d;

    /* renamed from: e, reason: collision with root package name */
    private final int f1991e;

    /* renamed from: f, reason: collision with root package name */
    private final x0.c f1992f;

    public g(String cvc, EnumC1870e cardBrand) {
        int i8;
        AbstractC3159y.i(cvc, "cvc");
        AbstractC3159y.i(cardBrand, "cardBrand");
        this.f1987a = cvc;
        this.f1988b = cardBrand;
        P p8 = new P();
        this.f1989c = p8;
        this.f1990d = p8.c(cardBrand, cvc, cardBrand.m()).a();
        if (cardBrand == EnumC1870e.f14427q) {
            i8 = AbstractC3053E.f32857b0;
        } else {
            i8 = AbstractC3053E.f32863e0;
        }
        this.f1991e = i8;
        this.f1992f = new x0.c(cardBrand.g(), null, false, null, 10, null);
    }

    public final EnumC1870e a() {
        return this.f1988b;
    }

    public final String b() {
        return this.f1987a;
    }

    public final x0.c c() {
        return this.f1992f;
    }

    public final int d() {
        return this.f1991e;
    }

    public final boolean e() {
        return this.f1990d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (AbstractC3159y.d(this.f1987a, gVar.f1987a) && this.f1988b == gVar.f1988b) {
            return true;
        }
        return false;
    }

    public final g f(String cvc) {
        AbstractC3159y.i(cvc, "cvc");
        if (cvc.length() > this.f1988b.m()) {
            return this;
        }
        return new g(cvc, this.f1988b);
    }

    public int hashCode() {
        return (this.f1987a.hashCode() * 31) + this.f1988b.hashCode();
    }

    public String toString() {
        return "CvcState(cvc=" + this.f1987a + ", cardBrand=" + this.f1988b + ")";
    }
}
