package com.mbridge.msdk.foundation.same.net.g;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.e.o;
import com.mbridge.msdk.e.t;
import com.mbridge.msdk.e.w;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.same.report.n;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: A, reason: collision with root package name */
    public String f19655A;

    /* renamed from: B, reason: collision with root package name */
    public String f19656B;

    /* renamed from: C, reason: collision with root package name */
    public String f19657C;

    /* renamed from: D, reason: collision with root package name */
    public String f19658D;

    /* renamed from: E, reason: collision with root package name */
    public String f19659E;

    /* renamed from: F, reason: collision with root package name */
    public String f19660F;

    /* renamed from: G, reason: collision with root package name */
    public String f19661G;

    /* renamed from: H, reason: collision with root package name */
    public String f19662H;

    /* renamed from: I, reason: collision with root package name */
    public String f19663I;

    /* renamed from: J, reason: collision with root package name */
    public String f19664J;

    /* renamed from: K, reason: collision with root package name */
    public String f19665K;

    /* renamed from: L, reason: collision with root package name */
    public String f19666L;

    /* renamed from: M, reason: collision with root package name */
    public String f19667M;

    /* renamed from: N, reason: collision with root package name */
    public String f19668N;

    /* renamed from: O, reason: collision with root package name */
    public String f19669O;

    /* renamed from: P, reason: collision with root package name */
    private final String f19670P;

    /* renamed from: Q, reason: collision with root package name */
    private String f19671Q;

    /* renamed from: R, reason: collision with root package name */
    private String f19672R;

    /* renamed from: S, reason: collision with root package name */
    private String f19673S;

    /* renamed from: T, reason: collision with root package name */
    private String f19674T;

    /* renamed from: U, reason: collision with root package name */
    private String f19675U;

    /* renamed from: V, reason: collision with root package name */
    private String f19676V;

    /* renamed from: W, reason: collision with root package name */
    private String f19677W;

    /* renamed from: X, reason: collision with root package name */
    private String f19678X;

    /* renamed from: Y, reason: collision with root package name */
    private String f19679Y;

    /* renamed from: Z, reason: collision with root package name */
    private String f19680Z;

    /* renamed from: a, reason: collision with root package name */
    public String f19681a;
    private String aa;
    private String ab;
    private String ac;
    private String ad;
    private boolean ae;
    private int af;

    /* renamed from: b, reason: collision with root package name */
    public String f19682b;

    /* renamed from: c, reason: collision with root package name */
    public String f19683c;

    /* renamed from: d, reason: collision with root package name */
    public String f19684d;

    /* renamed from: e, reason: collision with root package name */
    public String f19685e;

    /* renamed from: f, reason: collision with root package name */
    public String f19686f;

    /* renamed from: g, reason: collision with root package name */
    public String f19687g;

    /* renamed from: h, reason: collision with root package name */
    public String f19688h;

    /* renamed from: i, reason: collision with root package name */
    public String f19689i;

    /* renamed from: j, reason: collision with root package name */
    public String f19690j;

    /* renamed from: k, reason: collision with root package name */
    public String f19691k;

    /* renamed from: l, reason: collision with root package name */
    public String f19692l;

    /* renamed from: m, reason: collision with root package name */
    public int f19693m;

    /* renamed from: n, reason: collision with root package name */
    public int f19694n;

    /* renamed from: o, reason: collision with root package name */
    public int f19695o;

    /* renamed from: p, reason: collision with root package name */
    public int f19696p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f19697q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f19698r;

    /* renamed from: s, reason: collision with root package name */
    public int f19699s;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList<String> f19700t;

    /* renamed from: u, reason: collision with root package name */
    public int f19701u;

    /* renamed from: v, reason: collision with root package name */
    public int f19702v;

    /* renamed from: w, reason: collision with root package name */
    public ArrayList<String> f19703w;

    /* renamed from: x, reason: collision with root package name */
    public String f19704x;

    /* renamed from: y, reason: collision with root package name */
    public String f19705y;

    /* renamed from: z, reason: collision with root package name */
    public String f19706z;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final d f19707a = new d();
    }

    public static d f() {
        return a.f19707a;
    }

    public final boolean a() {
        try {
            if (!this.f19698r) {
                ArrayList<String> arrayList = this.f19700t;
                if (arrayList != null && this.f19701u <= arrayList.size() - 1) {
                    this.f19688h = this.f19700t.get(this.f19701u);
                    b();
                    return true;
                }
            } else {
                ArrayList<String> arrayList2 = this.f19703w;
                if (arrayList2 != null && this.f19702v <= arrayList2.size() - 1) {
                    if (!b(this.f19703w.get(this.f19702v))) {
                        this.f19692l = this.f19703w.get(this.f19702v);
                        c();
                    }
                    return true;
                }
            }
            if (this.f19697q) {
                this.f19701u = 0;
                this.f19702v = 0;
            }
            return false;
        } catch (Throwable th) {
            ad.a("RequestUrlUtil", th.getMessage());
            return false;
        }
    }

    public final void b() {
        this.f19661G = this.f19688h + this.f19679Y;
        this.f19705y = this.f19688h + this.f19673S;
        this.f19663I = this.f19688h + this.f19680Z;
        this.f19657C = this.f19688h + this.f19676V;
        this.f19665K = this.f19688h + this.aa;
    }

    public final void c() {
        this.f19662H = this.f19692l + this.f19679Y;
        this.f19706z = this.f19692l + this.f19673S;
        this.f19664J = this.f19692l + this.f19680Z;
        this.f19658D = this.f19692l + this.f19676V;
        this.f19666L = this.f19692l + this.aa;
    }

    public final int d() {
        return this.af;
    }

    public final void e() {
        boolean z8;
        HashMap<String, String> G8;
        o oVar;
        g b8 = h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
        if (b8 != null) {
            com.mbridge.msdk.c.a n8 = b8.n();
            if (n8 != null) {
                this.f19691k = n8.f();
                this.f19695o = n8.g();
                this.f19687g = n8.e();
                this.f19660F = this.f19687g + this.f19678X;
            }
            com.mbridge.msdk.c.d C8 = b8.C();
            if (C8 != null) {
                this.f19690j = C8.d();
                this.f19694n = C8.e();
                this.f19685e = C8.c();
                this.f19659E = this.f19685e + this.f19677W;
                com.mbridge.msdk.c.d C9 = b8.C();
                if (C9 != null && C9.a() != 1) {
                    int a8 = af.a().a("monitor", "type", af.a().a("t_r_t", 1));
                    if (a8 != 0 && a8 != 1) {
                        a8 = 0;
                    }
                    w.a a9 = new w.a().a(new com.mbridge.msdk.foundation.same.report.d()).a(new com.mbridge.msdk.foundation.same.report.o());
                    if (a8 == 1) {
                        oVar = new o(new n((byte) 2), a.f19707a.f19690j, a.f19707a.f19694n);
                    } else {
                        oVar = new o(new com.mbridge.msdk.e.a.a.g(), a.f19707a.f19659E, 0);
                    }
                    t.a().a(com.mbridge.msdk.foundation.controller.c.m().c(), a9.a(a8, oVar).e(af.a().a("t_m_e_t", 604800000)).a(af.a().a("t_m_e_s", 50)).d(af.a().a("t_m_r_c", 50)).b(af.a().a("t_m_t", DefaultLoadControl.DEFAULT_MIN_BUFFER_MS)).c(af.a().a("t_m_r_t_s", 2)).a(), C9.b() * 1000, com.mbridge.msdk.foundation.same.report.c.a());
                }
            }
            if (b8.ap() == 2) {
                z8 = true;
            } else {
                z8 = false;
            }
            this.f19698r = z8;
            this.f19699s = b8.ap();
            this.ae = !b8.y(2);
            if (b8.G() != null && b8.G().size() > 0 && (G8 = b8.G()) != null && G8.size() > 0) {
                if (G8.containsKey("v") && !TextUtils.isEmpty(G8.get("v")) && b(G8.get("v"))) {
                    this.f19684d = G8.get("v");
                    this.f19667M = this.f19684d + this.ab;
                    this.f19668N = this.f19684d + this.ac;
                    this.f19669O = this.f19684d + this.ad;
                    this.f19655A = this.f19684d + this.f19674T;
                }
                if (G8.containsKey(CampaignEx.JSON_KEY_HB) && !TextUtils.isEmpty(G8.get(CampaignEx.JSON_KEY_HB)) && b(G8.get(CampaignEx.JSON_KEY_HB))) {
                    this.f19671Q = G8.get(CampaignEx.JSON_KEY_HB);
                    this.f19704x = this.f19671Q + this.f19672R;
                    this.f19656B = this.f19671Q + this.f19675U;
                }
                if (G8.containsKey("lg") && !TextUtils.isEmpty(G8.get("lg"))) {
                    String str = G8.get("lg");
                    if (b(str)) {
                        this.f19683c = str;
                    } else {
                        this.f19689i = str;
                    }
                }
                if (G8.containsKey("lgt") && !TextUtils.isEmpty(G8.get("lgt"))) {
                    String str2 = G8.get("lgt");
                    if (b(str2)) {
                        String c8 = c(str2);
                        if (!TextUtils.isEmpty(c8)) {
                            this.f19689i = c8;
                        }
                    } else {
                        this.f19689i = str2;
                    }
                }
            }
            String y8 = b8.y();
            if (!TextUtils.isEmpty(y8)) {
                this.f19688h = y8;
                b();
                this.f19700t.add(0, y8);
            }
            String z9 = b8.z();
            if (!TextUtils.isEmpty(z9)) {
                this.f19692l = z9;
                c();
                this.f19703w.add(0, z9);
            }
        }
    }

    private d() {
        this.f19670P = "RequestUrlUtil";
        this.f19681a = DomainNameUtils.getInstance().DEFAULT_HOST_APPLETS;
        this.f19682b = DomainNameUtils.getInstance().DEFAULT_CDN_SPARE_SETTING_URL;
        this.f19683c = DomainNameUtils.getInstance().DEFAULT_HOST_ANALYTICS;
        this.f19684d = DomainNameUtils.getInstance().DEFAULT_HOST_API;
        this.f19685e = DomainNameUtils.getInstance().DEFAULT_HOST_MONITOR_DEFAULT;
        this.f19686f = DomainNameUtils.getInstance().DEFAULT_HOST_PRIVACY;
        this.f19687g = DomainNameUtils.getInstance().DEFAULT_HOST_REVENUE_DEFAULT;
        this.f19688h = DomainNameUtils.getInstance().DEFAULT_HOST_SETTING;
        this.f19689i = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_ANALYTICS;
        this.f19690j = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_MONITOR;
        this.f19691k = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_REVENUE;
        this.f19692l = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_SETTING;
        this.f19693m = 9377;
        this.f19694n = 9377;
        this.f19695o = 9988;
        this.f19696p = 9377;
        this.f19697q = false;
        this.f19698r = false;
        this.f19699s = 1;
        this.f19700t = DomainNameUtils.getInstance().SPARE_SETTING_HOST;
        this.f19701u = 0;
        this.f19702v = 0;
        this.f19703w = DomainNameUtils.getInstance().SPARE_TCP_SETTING_HOST;
        this.f19671Q = DomainNameUtils.getInstance().DEFAULT_HB_HOST;
        this.f19672R = "/bid";
        this.f19704x = this.f19671Q + this.f19672R;
        this.f19673S = "/sdk/customid";
        this.f19705y = this.f19688h + this.f19673S;
        this.f19706z = this.f19692l + this.f19673S;
        this.f19674T = "/image";
        this.f19655A = this.f19684d + this.f19674T;
        this.f19675U = "/load";
        this.f19656B = this.f19671Q + this.f19675U;
        this.f19676V = "/mapping";
        this.f19657C = this.f19688h + this.f19676V;
        this.f19658D = this.f19692l + this.f19676V;
        this.f19677W = "";
        this.f19659E = this.f19687g + this.f19677W;
        this.f19678X = "/batchPaidEvent";
        this.f19660F = this.f19687g + this.f19678X;
        this.f19679Y = "/setting";
        this.f19661G = this.f19688h + this.f19679Y;
        this.f19662H = this.f19692l + this.f19679Y;
        this.f19680Z = "/rewardsetting";
        this.f19663I = this.f19688h + this.f19680Z;
        this.f19664J = this.f19692l + this.f19680Z;
        this.aa = "/appwall/setting";
        this.f19665K = this.f19688h + this.aa;
        this.f19666L = this.f19692l + this.aa;
        this.ab = "/openapi/ad/v3";
        this.f19667M = this.f19684d + this.ab;
        this.ac = "/openapi/ad/v4";
        this.f19668N = this.f19684d + this.ac;
        this.ad = "/openapi/ad/v5";
        this.f19669O = this.f19684d + this.ad;
        this.ae = true;
        this.af = 0;
    }

    private boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.compile("(https|http)://[-A-Za-z0-9{}+&@#/%?=~_|!:,.;]+[-A-Za-z0-9+&@#/%=~_|]").matcher(str.trim()).matches();
    }

    private String c(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return Uri.parse(str).getHost();
        } catch (Throwable th) {
            ad.b("RequestUrlUtil", th.getMessage());
            return "";
        }
    }

    public final String a(String str, int i8) {
        try {
            if (!TextUtils.isEmpty(str)) {
                String[] split = str.split("_");
                if (split.length > 1) {
                    return a(true, split[1]);
                }
                return a(true, "");
            }
        } catch (Exception e8) {
            ad.b("RequestUrlUtil", e8.getMessage());
        }
        return i8 % 2 == 0 ? this.f19669O : this.f19667M;
    }

    public final String a(boolean z8, String str) {
        if (!z8) {
            return this.f19704x.replace("{}", "");
        }
        if (!this.f19656B.contains("{}") || TextUtils.isEmpty(str)) {
            return this.f19656B.replace("{}", "");
        }
        return this.f19656B.replace("{}", str + "-");
    }

    public final void a(int i8) {
        this.af = i8;
    }

    public final String a(String str) {
        return a.f19707a.a(str, 1);
    }
}
