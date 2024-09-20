package com.mbridge.msdk.foundation.same.report.d;

import android.text.TextUtils;
import androidx.leanback.preference.LeanbackPreferenceDialogFragment;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ao;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class b implements Serializable, Cloneable {

    /* renamed from: a, reason: collision with root package name */
    private boolean f19830a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, Map<String, String>> f19831b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, Map<String, String>> f19832c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, Long> f19833d;

    /* renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.foundation.c.b f19834e;

    /* renamed from: f, reason: collision with root package name */
    private String f19835f;

    /* renamed from: g, reason: collision with root package name */
    private List<CampaignEx> f19836g;

    /* renamed from: h, reason: collision with root package name */
    private String f19837h;

    /* renamed from: i, reason: collision with root package name */
    private int f19838i;

    /* renamed from: j, reason: collision with root package name */
    private String f19839j;

    /* renamed from: k, reason: collision with root package name */
    private String f19840k;

    /* renamed from: l, reason: collision with root package name */
    private String f19841l;

    /* renamed from: m, reason: collision with root package name */
    private String f19842m;

    /* renamed from: n, reason: collision with root package name */
    private String f19843n;

    /* renamed from: o, reason: collision with root package name */
    private String f19844o;

    /* renamed from: p, reason: collision with root package name */
    private String f19845p;

    /* renamed from: q, reason: collision with root package name */
    private String f19846q;

    /* renamed from: r, reason: collision with root package name */
    private int f19847r;

    /* renamed from: s, reason: collision with root package name */
    private int f19848s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f19849t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f19850u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f19851v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f19852w;

    /* renamed from: x, reason: collision with root package name */
    private CampaignEx f19853x;

    /* renamed from: y, reason: collision with root package name */
    private List<CampaignEx> f19854y;

    public b() {
        this.f19830a = false;
        this.f19831b = new HashMap();
        this.f19832c = new HashMap();
        this.f19833d = new HashMap();
        this.f19835f = "";
        this.f19847r = -1;
        this.f19849t = false;
        this.f19851v = false;
    }

    public final boolean a() {
        return this.f19830a;
    }

    public final int b() {
        return this.f19847r;
    }

    public final String c() {
        return this.f19846q;
    }

    public final Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public final String d() {
        return this.f19845p;
    }

    public final List<CampaignEx> e() {
        return this.f19836g;
    }

    public final String f() {
        return this.f19835f;
    }

    public final CampaignEx g() {
        return this.f19853x;
    }

    public final List<CampaignEx> h() {
        return this.f19854y;
    }

    public final String i() {
        Map<String, String> map;
        if (!TextUtils.isEmpty(this.f19837h)) {
            return this.f19837h;
        }
        try {
            if (TextUtils.isEmpty(this.f19837h)) {
                String str = this.f19835f + this.f19846q;
                Map<String, Map<String, String>> map2 = this.f19831b;
                if (map2 != null && map2.containsKey(str) && (map = this.f19831b.get(str)) != null && map.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID)) {
                    this.f19837h = map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
                }
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
        return this.f19837h;
    }

    public final int j() {
        return this.f19838i;
    }

    public final String k() {
        return this.f19840k;
    }

    public final String l() {
        return this.f19841l;
    }

    public final String m() {
        return this.f19843n;
    }

    public final int n() {
        return this.f19848s;
    }

    public final com.mbridge.msdk.foundation.c.b o() {
        return this.f19834e;
    }

    public final Map<String, Map<String, String>> p() {
        return this.f19831b;
    }

    public final Map<String, Map<String, String>> q() {
        return this.f19832c;
    }

    public final boolean r() {
        return this.f19850u;
    }

    public final boolean s() {
        return this.f19851v;
    }

    public final String t() {
        return this.f19842m;
    }

    public final void a(boolean z8) {
        this.f19849t = z8;
    }

    public final void b(String str) {
        this.f19845p = str;
    }

    public final void c(String str) {
        this.f19835f = str;
    }

    public final void d(String str) {
        this.f19837h = str;
    }

    public final void e(String str) {
        this.f19839j = str;
    }

    public final void f(String str) {
        this.f19840k = str;
    }

    public final void g(String str) {
        this.f19841l = str;
    }

    public final void h(String str) {
        this.f19843n = str;
    }

    public final Map<String, String> j(String str) {
        int F8;
        String a8;
        com.mbridge.msdk.foundation.c.b bVar;
        com.mbridge.msdk.foundation.c.b bVar2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        d dVar = new d();
        try {
            this.f19846q = str;
            dVar.a(CampaignEx.JSON_KEY_ST_TS, Long.valueOf(System.currentTimeMillis()));
            if (!TextUtils.isEmpty(i())) {
                dVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, i());
            }
            int i8 = this.f19838i;
            if (i8 != 0) {
                dVar.a("adtp", Integer.valueOf(i8));
            }
            if (!TextUtils.isEmpty(this.f19844o)) {
                dVar.a(CampaignEx.JSON_KEY_HB, this.f19844o);
            }
            if (!TextUtils.isEmpty(this.f19839j)) {
                dVar.a("bid_tk", this.f19839j);
            }
            if (!TextUtils.isEmpty(str)) {
                dVar.a(LeanbackPreferenceDialogFragment.ARG_KEY, str);
            }
            if (Arrays.asList(a.f19819a).contains(str)) {
                dVar.a("from_cache", this.f19849t ? "1" : "2");
            }
            if ("2000047".contains(str) && (bVar2 = this.f19834e) != null) {
                dVar.a("type", Integer.valueOf(bVar2.f()));
                dVar.a("reason", bVar2.b());
                if (!TextUtils.isEmpty(bVar2.h())) {
                    dVar.a("reason_d", bVar2.h());
                    dVar.a("type_d", Integer.valueOf(bVar2.g()));
                }
            }
            if ("2000048".contains(str) && (bVar = this.f19834e) != null && !TextUtils.isEmpty(bVar.h())) {
                dVar.a("type", Integer.valueOf(bVar.g()));
                dVar.a("reason", bVar.h());
            }
            if ("2000126".equals(this.f19846q)) {
                String str2 = this.f19839j;
                g a9 = h.a().a(com.mbridge.msdk.foundation.controller.c.m().k());
                if (TextUtils.isEmpty(str2)) {
                    F8 = a9.ar();
                } else {
                    F8 = a9.F();
                }
                String a10 = com.mbridge.msdk.foundation.same.net.g.d.f().a(str2, F8);
                if (TextUtils.isEmpty(a10)) {
                    a8 = "";
                } else {
                    a8 = ao.a(a10);
                }
                dVar.a("dns_ty", Integer.valueOf(com.mbridge.msdk.c.e.a().a(a8)));
                dVar.a("dns_hs", a8);
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
        return dVar.a();
    }

    public final void k(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String str2 = this.f19835f + str;
            Map<String, Map<String, String>> map = this.f19831b;
            if (map == null || !map.containsKey(str2)) {
                return;
            }
            this.f19831b.remove(str2);
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
    }

    public final long l(String str) {
        Map<String, Long> map;
        try {
            if (TextUtils.isEmpty(str) || (map = this.f19833d) == null || !map.containsKey(str)) {
                return 0L;
            }
            Long l8 = this.f19833d.get(str);
            return System.currentTimeMillis() - (l8 != null ? l8.longValue() : 0L);
        } catch (Exception e8) {
            if (!MBridgeConstans.DEBUG) {
                return 0L;
            }
            e8.printStackTrace();
            return 0L;
        }
    }

    public final void m(String str) {
        if (this.f19833d == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f19833d.put(str, Long.valueOf(System.currentTimeMillis()));
    }

    public final void n(String str) {
        this.f19842m = str;
    }

    public final void a(int i8) {
        this.f19847r = i8;
    }

    public final void b(List<CampaignEx> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f19854y = list;
    }

    public final void c(int i8) {
        this.f19848s = i8;
    }

    public final void d(boolean z8) {
        this.f19852w = z8;
    }

    public final void a(String str) {
        this.f19846q = str;
    }

    public final void c(boolean z8) {
        this.f19851v = z8;
    }

    public final void a(List<CampaignEx> list) {
        this.f19836g = list;
    }

    public final void b(int i8) {
        this.f19838i = i8;
    }

    public final void a(CampaignEx campaignEx) {
        this.f19853x = campaignEx;
    }

    public final void b(boolean z8) {
        this.f19850u = z8;
    }

    public final void a(String str, d dVar) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str) || dVar == null) {
            return;
        }
        try {
            String str2 = this.f19835f + str;
            Map<String, Map<String, String>> map2 = this.f19831b;
            if (map2 != null) {
                if (map2.containsKey(str2) && (map = this.f19831b.get(str2)) != null) {
                    map.putAll(dVar.a());
                } else {
                    this.f19831b.put(str2, dVar.a());
                }
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
    }

    public b(boolean z8) {
        this.f19830a = false;
        this.f19831b = new HashMap();
        this.f19832c = new HashMap();
        this.f19833d = new HashMap();
        this.f19835f = "";
        this.f19847r = -1;
        this.f19849t = false;
        this.f19851v = false;
        this.f19830a = z8;
    }

    public final void i(String str) {
        this.f19844o = str;
    }

    public final void a(String str, d dVar, int i8) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str) || dVar == null) {
            return;
        }
        try {
            String str2 = this.f19835f + "_" + i8 + "_" + str;
            Map<String, Map<String, String>> map2 = this.f19832c;
            if (map2 != null) {
                if (map2.containsKey(str2) && (map = this.f19832c.get(str2)) != null) {
                    map.putAll(dVar.a());
                } else {
                    this.f19832c.put(str2, dVar.a());
                }
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
    }

    public final void a(com.mbridge.msdk.foundation.c.b bVar) {
        this.f19834e = bVar;
    }
}
