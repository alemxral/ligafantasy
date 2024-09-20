package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.u2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2268u2 {

    /* renamed from: A, reason: collision with root package name */
    private long f16829A;

    /* renamed from: B, reason: collision with root package name */
    private long f16830B;

    /* renamed from: C, reason: collision with root package name */
    private long f16831C;

    /* renamed from: D, reason: collision with root package name */
    private long f16832D;

    /* renamed from: E, reason: collision with root package name */
    private String f16833E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f16834F;

    /* renamed from: G, reason: collision with root package name */
    private long f16835G;

    /* renamed from: H, reason: collision with root package name */
    private long f16836H;

    /* renamed from: a, reason: collision with root package name */
    private final Y1 f16837a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16838b;

    /* renamed from: c, reason: collision with root package name */
    private String f16839c;

    /* renamed from: d, reason: collision with root package name */
    private String f16840d;

    /* renamed from: e, reason: collision with root package name */
    private String f16841e;

    /* renamed from: f, reason: collision with root package name */
    private String f16842f;

    /* renamed from: g, reason: collision with root package name */
    private long f16843g;

    /* renamed from: h, reason: collision with root package name */
    private long f16844h;

    /* renamed from: i, reason: collision with root package name */
    private long f16845i;

    /* renamed from: j, reason: collision with root package name */
    private String f16846j;

    /* renamed from: k, reason: collision with root package name */
    private long f16847k;

    /* renamed from: l, reason: collision with root package name */
    private String f16848l;

    /* renamed from: m, reason: collision with root package name */
    private long f16849m;

    /* renamed from: n, reason: collision with root package name */
    private long f16850n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f16851o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f16852p;

    /* renamed from: q, reason: collision with root package name */
    private String f16853q;

    /* renamed from: r, reason: collision with root package name */
    private Boolean f16854r;

    /* renamed from: s, reason: collision with root package name */
    private long f16855s;

    /* renamed from: t, reason: collision with root package name */
    private List f16856t;

    /* renamed from: u, reason: collision with root package name */
    private String f16857u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f16858v;

    /* renamed from: w, reason: collision with root package name */
    private long f16859w;

    /* renamed from: x, reason: collision with root package name */
    private long f16860x;

    /* renamed from: y, reason: collision with root package name */
    private long f16861y;

    /* renamed from: z, reason: collision with root package name */
    private long f16862z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2268u2(Y1 y12, String str) {
        AbstractC1319p.l(y12);
        AbstractC1319p.f(str);
        this.f16837a = y12;
        this.f16838b = str;
        y12.f().h();
    }

    public final long A() {
        this.f16837a.f().h();
        return 0L;
    }

    public final void B(String str) {
        this.f16837a.f().h();
        this.f16834F |= !m0.l.a(this.f16833E, str);
        this.f16833E = str;
    }

    public final void C(long j8) {
        boolean z8;
        this.f16837a.f().h();
        boolean z9 = this.f16834F;
        if (this.f16845i != j8) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f16834F = z9 | z8;
        this.f16845i = j8;
    }

    public final void D(long j8) {
        boolean z8;
        boolean z9 = false;
        if (j8 >= 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        AbstractC1319p.a(z8);
        this.f16837a.f().h();
        boolean z10 = this.f16834F;
        if (this.f16843g != j8) {
            z9 = true;
        }
        this.f16834F = z10 | z9;
        this.f16843g = j8;
    }

    public final void E(long j8) {
        boolean z8;
        this.f16837a.f().h();
        boolean z9 = this.f16834F;
        if (this.f16844h != j8) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f16834F = z9 | z8;
        this.f16844h = j8;
    }

    public final void F(boolean z8) {
        boolean z9;
        this.f16837a.f().h();
        boolean z10 = this.f16834F;
        if (this.f16851o != z8) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f16834F = z10 | z9;
        this.f16851o = z8;
    }

    public final void G(Boolean bool) {
        this.f16837a.f().h();
        this.f16834F |= !m0.l.a(this.f16854r, bool);
        this.f16854r = bool;
    }

    public final void H(String str) {
        this.f16837a.f().h();
        this.f16834F |= !m0.l.a(this.f16841e, str);
        this.f16841e = str;
    }

    public final void I(List list) {
        ArrayList arrayList;
        this.f16837a.f().h();
        if (!m0.l.a(this.f16856t, list)) {
            this.f16834F = true;
            if (list != null) {
                arrayList = new ArrayList(list);
            } else {
                arrayList = null;
            }
            this.f16856t = arrayList;
        }
    }

    public final void J(String str) {
        this.f16837a.f().h();
        this.f16834F |= !m0.l.a(this.f16857u, str);
        this.f16857u = str;
    }

    public final void K(long j8) {
        boolean z8;
        this.f16837a.f().h();
        boolean z9 = this.f16834F;
        if (this.f16860x != j8) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f16834F = z9 | z8;
        this.f16860x = j8;
    }

    public final void L(boolean z8) {
        boolean z9;
        this.f16837a.f().h();
        boolean z10 = this.f16834F;
        if (this.f16858v != z8) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f16834F = z10 | z9;
        this.f16858v = z8;
    }

    public final void M(long j8) {
        boolean z8;
        this.f16837a.f().h();
        boolean z9 = this.f16834F;
        if (this.f16859w != j8) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f16834F = z9 | z8;
        this.f16859w = j8;
    }

    public final boolean N() {
        this.f16837a.f().h();
        return this.f16852p;
    }

    public final boolean O() {
        this.f16837a.f().h();
        return this.f16851o;
    }

    public final boolean P() {
        this.f16837a.f().h();
        return this.f16834F;
    }

    public final boolean Q() {
        this.f16837a.f().h();
        return this.f16858v;
    }

    public final long R() {
        this.f16837a.f().h();
        return this.f16847k;
    }

    public final long S() {
        this.f16837a.f().h();
        return this.f16835G;
    }

    public final long T() {
        this.f16837a.f().h();
        return this.f16830B;
    }

    public final long U() {
        this.f16837a.f().h();
        return this.f16831C;
    }

    public final long V() {
        this.f16837a.f().h();
        return this.f16829A;
    }

    public final long W() {
        this.f16837a.f().h();
        return this.f16862z;
    }

    public final long X() {
        this.f16837a.f().h();
        return this.f16832D;
    }

    public final long Y() {
        this.f16837a.f().h();
        return this.f16861y;
    }

    public final long Z() {
        this.f16837a.f().h();
        return this.f16850n;
    }

    public final String a() {
        this.f16837a.f().h();
        return this.f16840d;
    }

    public final long a0() {
        this.f16837a.f().h();
        return this.f16855s;
    }

    public final String b() {
        this.f16837a.f().h();
        return this.f16833E;
    }

    public final long b0() {
        this.f16837a.f().h();
        return this.f16836H;
    }

    public final String c() {
        this.f16837a.f().h();
        return this.f16841e;
    }

    public final long c0() {
        this.f16837a.f().h();
        return this.f16849m;
    }

    public final String d() {
        this.f16837a.f().h();
        return this.f16857u;
    }

    public final long d0() {
        this.f16837a.f().h();
        return this.f16845i;
    }

    public final List e() {
        this.f16837a.f().h();
        return this.f16856t;
    }

    public final long e0() {
        this.f16837a.f().h();
        return this.f16843g;
    }

    public final void f() {
        this.f16837a.f().h();
        this.f16834F = false;
    }

    public final long f0() {
        this.f16837a.f().h();
        return this.f16844h;
    }

    public final void g() {
        this.f16837a.f().h();
        long j8 = this.f16843g + 1;
        if (j8 > 2147483647L) {
            this.f16837a.d().w().b("Bundle index overflow. appId", C2267u1.z(this.f16838b));
            j8 = 0;
        }
        this.f16834F = true;
        this.f16843g = j8;
    }

    public final long g0() {
        this.f16837a.f().h();
        return this.f16860x;
    }

    public final void h(String str) {
        this.f16837a.f().h();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f16834F |= true ^ m0.l.a(this.f16853q, str);
        this.f16853q = str;
    }

    public final long h0() {
        this.f16837a.f().h();
        return this.f16859w;
    }

    public final void i(boolean z8) {
        boolean z9;
        this.f16837a.f().h();
        boolean z10 = this.f16834F;
        if (this.f16852p != z8) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f16834F = z10 | z9;
        this.f16852p = z8;
    }

    public final Boolean i0() {
        this.f16837a.f().h();
        return this.f16854r;
    }

    public final void j(String str) {
        this.f16837a.f().h();
        this.f16834F |= !m0.l.a(this.f16839c, str);
        this.f16839c = str;
    }

    public final String j0() {
        this.f16837a.f().h();
        return this.f16853q;
    }

    public final void k(String str) {
        this.f16837a.f().h();
        this.f16834F |= !m0.l.a(this.f16848l, str);
        this.f16848l = str;
    }

    public final String k0() {
        this.f16837a.f().h();
        String str = this.f16833E;
        B(null);
        return str;
    }

    public final void l(String str) {
        this.f16837a.f().h();
        this.f16834F |= !m0.l.a(this.f16846j, str);
        this.f16846j = str;
    }

    public final String l0() {
        this.f16837a.f().h();
        return this.f16838b;
    }

    public final void m(long j8) {
        boolean z8;
        this.f16837a.f().h();
        boolean z9 = this.f16834F;
        if (this.f16847k != j8) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f16834F = z9 | z8;
        this.f16847k = j8;
    }

    public final String m0() {
        this.f16837a.f().h();
        return this.f16839c;
    }

    public final void n(long j8) {
        boolean z8;
        this.f16837a.f().h();
        boolean z9 = this.f16834F;
        if (this.f16835G != j8) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f16834F = z9 | z8;
        this.f16835G = j8;
    }

    public final String n0() {
        this.f16837a.f().h();
        return this.f16848l;
    }

    public final void o(long j8) {
        boolean z8;
        this.f16837a.f().h();
        boolean z9 = this.f16834F;
        if (this.f16830B != j8) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f16834F = z9 | z8;
        this.f16830B = j8;
    }

    public final String o0() {
        this.f16837a.f().h();
        return this.f16846j;
    }

    public final void p(long j8) {
        boolean z8;
        this.f16837a.f().h();
        boolean z9 = this.f16834F;
        if (this.f16831C != j8) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f16834F = z9 | z8;
        this.f16831C = j8;
    }

    public final String p0() {
        this.f16837a.f().h();
        return this.f16842f;
    }

    public final void q(long j8) {
        boolean z8;
        this.f16837a.f().h();
        boolean z9 = this.f16834F;
        if (this.f16829A != j8) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f16834F = z9 | z8;
        this.f16829A = j8;
    }

    public final void r(long j8) {
        boolean z8;
        this.f16837a.f().h();
        boolean z9 = this.f16834F;
        if (this.f16862z != j8) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f16834F = z9 | z8;
        this.f16862z = j8;
    }

    public final void s(long j8) {
        boolean z8;
        this.f16837a.f().h();
        boolean z9 = this.f16834F;
        if (this.f16832D != j8) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f16834F = z9 | z8;
        this.f16832D = j8;
    }

    public final void t(long j8) {
        boolean z8;
        this.f16837a.f().h();
        boolean z9 = this.f16834F;
        if (this.f16861y != j8) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f16834F = z9 | z8;
        this.f16861y = j8;
    }

    public final void u(long j8) {
        boolean z8;
        this.f16837a.f().h();
        boolean z9 = this.f16834F;
        if (this.f16850n != j8) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f16834F = z9 | z8;
        this.f16850n = j8;
    }

    public final void v(long j8) {
        boolean z8;
        this.f16837a.f().h();
        boolean z9 = this.f16834F;
        if (this.f16855s != j8) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f16834F = z9 | z8;
        this.f16855s = j8;
    }

    public final void w(long j8) {
        boolean z8;
        this.f16837a.f().h();
        boolean z9 = this.f16834F;
        if (this.f16836H != j8) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f16834F = z9 | z8;
        this.f16836H = j8;
    }

    public final void x(String str) {
        this.f16837a.f().h();
        this.f16834F |= !m0.l.a(this.f16842f, str);
        this.f16842f = str;
    }

    public final void y(String str) {
        this.f16837a.f().h();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f16834F |= true ^ m0.l.a(this.f16840d, str);
        this.f16840d = str;
    }

    public final void z(long j8) {
        boolean z8;
        this.f16837a.f().h();
        boolean z9 = this.f16834F;
        if (this.f16849m != j8) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f16834F = z9 | z8;
        this.f16849m = j8;
    }
}
