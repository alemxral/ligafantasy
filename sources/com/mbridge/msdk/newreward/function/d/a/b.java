package com.mbridge.msdk.newreward.function.d.a;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.WorkRequest;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import com.mbridge.msdk.newreward.function.d.c.d;
import com.mbridge.msdk.newreward.function.d.c.e;
import com.mbridge.msdk.newreward.function.d.c.i;
import com.mbridge.msdk.newreward.function.d.c.n;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: A, reason: collision with root package name */
    private String f21021A;

    /* renamed from: B, reason: collision with root package name */
    private int f21022B;

    /* renamed from: C, reason: collision with root package name */
    private int f21023C;

    /* renamed from: D, reason: collision with root package name */
    private List<CampaignEx> f21024D;

    /* renamed from: E, reason: collision with root package name */
    private int f21025E;

    /* renamed from: G, reason: collision with root package name */
    private long f21027G;

    /* renamed from: H, reason: collision with root package name */
    private Map<String, Object> f21028H;

    /* renamed from: I, reason: collision with root package name */
    private String f21029I;

    /* renamed from: a, reason: collision with root package name */
    private int f21030a;

    /* renamed from: b, reason: collision with root package name */
    private String f21031b;

    /* renamed from: c, reason: collision with root package name */
    private String f21032c;

    /* renamed from: d, reason: collision with root package name */
    private String f21033d;

    /* renamed from: e, reason: collision with root package name */
    private String f21034e;

    /* renamed from: f, reason: collision with root package name */
    private String f21035f;

    /* renamed from: g, reason: collision with root package name */
    private String f21036g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f21037h;

    /* renamed from: j, reason: collision with root package name */
    private int f21039j;

    /* renamed from: k, reason: collision with root package name */
    private String f21040k;

    /* renamed from: l, reason: collision with root package name */
    private String f21041l;

    /* renamed from: m, reason: collision with root package name */
    private String f21042m;

    /* renamed from: n, reason: collision with root package name */
    private String f21043n;

    /* renamed from: o, reason: collision with root package name */
    private int f21044o;

    /* renamed from: p, reason: collision with root package name */
    private long f21045p;

    /* renamed from: q, reason: collision with root package name */
    private long f21046q;

    /* renamed from: r, reason: collision with root package name */
    private long f21047r;

    /* renamed from: s, reason: collision with root package name */
    private double f21048s;

    /* renamed from: t, reason: collision with root package name */
    private int f21049t;

    /* renamed from: u, reason: collision with root package name */
    private List<a> f21050u;

    /* renamed from: v, reason: collision with root package name */
    private JSONObject f21051v;

    /* renamed from: w, reason: collision with root package name */
    private d<?> f21052w;

    /* renamed from: z, reason: collision with root package name */
    private Context f21055z;

    /* renamed from: i, reason: collision with root package name */
    private long f21038i = WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;

    /* renamed from: x, reason: collision with root package name */
    private int f21053x = MBridgeCommon.DEFAULT_LOAD_TIMEOUT;

    /* renamed from: y, reason: collision with root package name */
    private int f21054y = MBridgeCommon.DEFAULT_LOAD_TIMEOUT;

    /* renamed from: F, reason: collision with root package name */
    private int f21026F = 0;

    public b(int i8, String str, String str2, String str3) {
        this.f21030a = i8;
        this.f21031b = str;
        this.f21032c = str2;
        this.f21033d = str3;
    }

    public final int A() {
        return this.f21023C;
    }

    public final int B() {
        return this.f21022B;
    }

    public final List<CampaignEx> C() {
        return this.f21024D;
    }

    public final int D() {
        int i8 = this.f21025E;
        if (i8 <= 0) {
            return 1;
        }
        return i8;
    }

    public final int E() {
        return this.f21026F;
    }

    public final Map<String, Object> F() {
        if (this.f21028H == null) {
            this.f21028H = new HashMap();
        }
        return this.f21028H;
    }

    public final long G() {
        return this.f21027G;
    }

    public final String H() {
        return this.f21029I;
    }

    public final int a() {
        return this.f21030a;
    }

    public final String b() {
        return this.f21032c;
    }

    public final String c() {
        return this.f21033d;
    }

    public final String d() {
        return this.f21034e;
    }

    public final String e() {
        return this.f21035f;
    }

    public final String f() {
        return this.f21036g;
    }

    public final boolean g() {
        return this.f21037h;
    }

    public final int h() {
        return this.f21039j;
    }

    public final String i() {
        return this.f21040k;
    }

    public final String j() {
        return this.f21041l;
    }

    public final String k() {
        return this.f21042m;
    }

    public final String l() {
        return this.f21043n;
    }

    public final int m() {
        return this.f21044o;
    }

    public final long n() {
        return this.f21045p;
    }

    public final long o() {
        return this.f21046q;
    }

    public final long p() {
        return this.f21047r;
    }

    public final double q() {
        return this.f21048s;
    }

    public final int r() {
        return this.f21049t;
    }

    public final List<a> s() {
        return this.f21050u;
    }

    public final JSONObject t() {
        return this.f21051v;
    }

    public final d<?> u() {
        d<?> dVar = this.f21052w;
        if (dVar != null) {
            return dVar;
        }
        String str = this.f21021A;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.f21052w == null) {
            if (com.mbridge.msdk.newreward.function.h.a.b(str)) {
                this.f21052w = new e(this, null);
            } else {
                this.f21052w = new i(this, null);
            }
        }
        return this.f21052w;
    }

    public final int v() {
        return this.f21053x;
    }

    public final Context w() {
        return this.f21055z;
    }

    public final boolean x() {
        List<a> list;
        boolean z8;
        boolean z9;
        d<?> dVar = this.f21052w;
        if ((dVar != null && !dVar.c()) || (list = this.f21050u) == null || list.isEmpty()) {
            return false;
        }
        int size = this.f21050u.size();
        Iterator<a> it = this.f21050u.iterator();
        int i8 = 0;
        while (true) {
            boolean z10 = true;
            if (!it.hasNext()) {
                break;
            }
            a next = it.next();
            n d8 = next.d();
            if (d8 != null && !d8.c()) {
                z8 = false;
            } else {
                z8 = true;
            }
            d<?> f8 = next.f();
            if (f8 != null && !f8.c()) {
                z9 = false;
            } else {
                z9 = true;
            }
            d<?> c8 = next.c();
            if (c8 != null && !c8.c()) {
                z10 = false;
            }
            if (z8 && z9 && z10) {
                i8++;
            }
        }
        if (i8 != size) {
            return false;
        }
        return true;
    }

    public final boolean y() {
        boolean z8;
        List<a> list;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.f21045p > System.currentTimeMillis()) {
            z8 = true;
        } else {
            z8 = false;
        }
        boolean x8 = x();
        d<?> dVar = this.f21052w;
        if ((dVar == null || dVar.c()) && (list = this.f21050u) != null && !list.isEmpty()) {
            int size = this.f21050u.size();
            int i8 = 0;
            for (a aVar : this.f21050u) {
                n d8 = aVar.d();
                if (d8 != null && !d8.d()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                d<?> f8 = aVar.f();
                if (f8 != null && !f8.d()) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                d<?> c8 = aVar.c();
                if (c8 != null && !c8.d()) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z10 && z11 && z12) {
                    i8++;
                }
            }
            if (i8 == size) {
                z9 = true;
                if (!z8 && x8 && z9) {
                    return true;
                }
                return false;
            }
        }
        z9 = false;
        if (!z8) {
        }
        return false;
    }

    public final String z() {
        return this.f21021A;
    }

    public final void a(String str) {
        this.f21034e = str;
    }

    public final void b(String str) {
        this.f21035f = str;
    }

    public final void c(String str) {
        this.f21036g = str;
    }

    public final void d(String str) {
        this.f21040k = str;
    }

    public final void e(String str) {
        this.f21041l = str;
    }

    public final void f(String str) {
        this.f21042m = str;
    }

    public final void g(String str) {
        this.f21043n = str;
    }

    public final void h(String str) {
        this.f21021A = str;
    }

    public final void i(int i8) {
        this.f21026F = i8;
    }

    public final void a(boolean z8) {
        this.f21037h = z8;
    }

    public final void b(int i8) {
        this.f21044o = i8;
    }

    public final void c(long j8) {
        this.f21046q = j8;
    }

    public final void d(long j8) {
        this.f21047r = j8;
    }

    public final void e(int i8) {
        this.f21054y = i8;
    }

    public final void f(int i8) {
        this.f21023C = i8;
    }

    public final void g(int i8) {
        this.f21022B = i8;
    }

    public final void h(int i8) {
        this.f21025E = i8;
    }

    public final void i(String str) {
        this.f21029I = str;
    }

    public final void a(long j8) {
        this.f21038i = j8;
    }

    public final void b(long j8) {
        this.f21045p = j8;
    }

    public final void c(int i8) {
        this.f21049t = i8;
    }

    public final void d(int i8) {
        this.f21053x = i8;
    }

    public final void e(long j8) {
        this.f21027G = j8;
    }

    public final void a(int i8) {
        this.f21039j = i8;
    }

    public final void b(List<CampaignEx> list) {
        this.f21024D = list;
    }

    public final void a(double d8) {
        this.f21048s = d8;
    }

    public final void a(List<a> list) {
        this.f21050u = list;
    }

    public final void a(JSONObject jSONObject) {
        this.f21051v = jSONObject;
    }
}
