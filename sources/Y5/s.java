package y5;

import M5.AbstractC1239l;
import b.AbstractC1832c;
import com.inmobi.cmp.core.model.Vector;
import com.inmobi.cmp.model.ChoiceError;
import j$.time.ZonedDateTime;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3159y;
import r5.AbstractC3689a;
import v5.C3832b;
import v5.EnumC3833c;

/* loaded from: classes5.dex */
public final class s {

    /* renamed from: A, reason: collision with root package name */
    public Vector f39906A;

    /* renamed from: B, reason: collision with root package name */
    public Vector f39907B;

    /* renamed from: C, reason: collision with root package name */
    public Vector f39908C;

    /* renamed from: D, reason: collision with root package name */
    public Vector f39909D;

    /* renamed from: E, reason: collision with root package name */
    public Vector f39910E;

    /* renamed from: F, reason: collision with root package name */
    public Vector f39911F;

    /* renamed from: G, reason: collision with root package name */
    public j f39912G;

    /* renamed from: b, reason: collision with root package name */
    public long f39914b;

    /* renamed from: c, reason: collision with root package name */
    public long f39915c;

    /* renamed from: d, reason: collision with root package name */
    public ZonedDateTime f39916d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f39918f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f39919g;

    /* renamed from: j, reason: collision with root package name */
    public int f39922j;

    /* renamed from: o, reason: collision with root package name */
    public int f39927o;

    /* renamed from: p, reason: collision with root package name */
    public int f39928p;

    /* renamed from: z, reason: collision with root package name */
    public Vector f39938z;

    /* renamed from: a, reason: collision with root package name */
    public B6.e f39913a = null;

    /* renamed from: e, reason: collision with root package name */
    public boolean f39917e = true;

    /* renamed from: h, reason: collision with root package name */
    public String f39920h = "AA";

    /* renamed from: i, reason: collision with root package name */
    public int f39921i = 2;

    /* renamed from: k, reason: collision with root package name */
    public int f39923k = 2;

    /* renamed from: l, reason: collision with root package name */
    public String f39924l = "EN";

    /* renamed from: m, reason: collision with root package name */
    public int f39925m = 10;

    /* renamed from: n, reason: collision with root package name */
    public int f39926n = 2021;

    /* renamed from: q, reason: collision with root package name */
    public Vector f39929q = new Vector(null, 1, null);

    /* renamed from: r, reason: collision with root package name */
    public Vector f39930r = new Vector(null, 1, null);

    /* renamed from: s, reason: collision with root package name */
    public Vector f39931s = new Vector(null, 1, null);

    /* renamed from: t, reason: collision with root package name */
    public Vector f39932t = new Vector(null, 1, null);

    /* renamed from: u, reason: collision with root package name */
    public Vector f39933u = new Vector(null, 1, null);

    /* renamed from: v, reason: collision with root package name */
    public Vector f39934v = new Vector(null, 1, null);

    /* renamed from: w, reason: collision with root package name */
    public Vector f39935w = new Vector(null, 1, null);

    /* renamed from: x, reason: collision with root package name */
    public Vector f39936x = new Vector(null, 1, null);

    /* renamed from: y, reason: collision with root package name */
    public Vector f39937y = new Vector(null, 1, null);

    public s(B6.e eVar) {
        new LinkedHashSet();
        this.f39938z = new Vector(null, 1, null);
        this.f39906A = new Vector(null, 1, null);
        this.f39907B = new Vector(null, 1, null);
        this.f39908C = new Vector(null, 1, null);
        this.f39909D = new Vector(null, 1, null);
        this.f39910E = new Vector(null, 1, null);
        this.f39911F = new Vector(null, 1, null);
        this.f39912G = new j(this.f39913a, null, null, null, 14);
    }

    public static final boolean c(s sVar, B6.l lVar) {
        sVar.getClass();
        List list = O7.d.f7793a.j().f2373b.f2340j;
        Set set = lVar.f1055e;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (AbstractC1832c.a((Number) it.next(), list)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean e(s sVar, B6.l lVar) {
        sVar.getClass();
        List list = O7.d.f7793a.j().f2373b.f2338h;
        Set set = lVar.f1054d;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (AbstractC1832c.a((Number) it.next(), list)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean g(s sVar, B6.l lVar) {
        sVar.getClass();
        List list = O7.d.f7793a.j().f2373b.f2342l;
        Set set = lVar.f1057g;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (AbstractC1832c.a((Number) it.next(), list)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int a() {
        return this.f39925m;
    }

    public final void b(String value) {
        String str;
        AbstractC3159y.i(value, "value");
        String[] iSOCountries = Locale.getISOCountries();
        AbstractC3159y.h(iSOCountries, "getISOCountries()");
        Locale locale = Locale.getDefault();
        AbstractC3159y.h(locale, "getDefault()");
        String upperCase = value.toUpperCase(locale);
        AbstractC3159y.h(upperCase, "this as java.lang.String).toUpperCase(locale)");
        if (AbstractC1239l.W(iSOCountries, upperCase)) {
            Locale locale2 = Locale.getDefault();
            AbstractC3159y.h(locale2, "getDefault()");
            String upperCase2 = value.toUpperCase(locale2);
            AbstractC3159y.h(upperCase2, "this as java.lang.String).toUpperCase(locale)");
            this.f39920h = upperCase2;
            return;
        }
        u uVar = new u("publisherCountryCode", value, "");
        C3832b c3832b = C3832b.f38857a;
        ChoiceError choiceError = ChoiceError.TC_MODEL_PROPERTY_ERROR;
        AbstractC3159y.h("f.s", "TAG");
        String message = uVar.getMessage();
        if (message == null) {
            str = "";
        } else {
            str = message;
        }
        c3832b.a(choiceError, "f.s", str, EnumC3833c.CONSOLE_AND_CALLBACK, uVar);
    }

    public final int d() {
        return this.f39926n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof s) && AbstractC3159y.d(this.f39913a, ((s) obj).f39913a)) {
            return true;
        }
        return false;
    }

    public final int f() {
        Integer num;
        B6.e eVar = this.f39913a;
        if (eVar == null) {
            num = null;
        } else {
            num = eVar.f1037c;
        }
        if (num == null) {
            return this.f39923k;
        }
        return num.intValue();
    }

    public final Vector h() {
        return this.f39934v;
    }

    public int hashCode() {
        B6.e eVar = this.f39913a;
        if (eVar == null) {
            return 0;
        }
        return eVar.hashCode();
    }

    public final String i() {
        return this.f39920h;
    }

    public final Vector j() {
        return this.f39936x;
    }

    public final Vector k() {
        return this.f39937y;
    }

    public final Vector l() {
        return this.f39935w;
    }

    public final j m() {
        return this.f39912G;
    }

    public final Vector n() {
        return this.f39930r;
    }

    public final Vector o() {
        return this.f39931s;
    }

    public final boolean p() {
        return this.f39919g;
    }

    public final Vector q() {
        return this.f39929q;
    }

    public final boolean r() {
        return this.f39918f;
    }

    public final Vector s() {
        return this.f39938z;
    }

    public final Vector t() {
        return this.f39908C;
    }

    public String toString() {
        StringBuilder a8 = AbstractC3689a.a("TCModel(gvl=");
        a8.append(this.f39913a);
        a8.append(')');
        return a8.toString();
    }

    public final Vector u() {
        return this.f39911F;
    }

    public final Vector v() {
        return this.f39910E;
    }

    public final boolean w() {
        return this.f39917e;
    }

    public final void x() {
        this.f39907B.setAllOwnedItems();
        this.f39938z.forEach(new o(this));
        this.f39930r.setAllOwnedItems();
        this.f39931s.setAllOwnedItems();
        this.f39929q.setAllOwnedItems();
        this.f39908C.forEach(new p(this));
        this.f39906A.forEach(new n(this));
        this.f39909D.setAllOwnedItems();
    }
}
