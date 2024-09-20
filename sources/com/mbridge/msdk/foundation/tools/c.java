package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public int f20026a;

    /* renamed from: b, reason: collision with root package name */
    public int f20027b;

    /* renamed from: c, reason: collision with root package name */
    public String f20028c;

    /* renamed from: d, reason: collision with root package name */
    public String f20029d;

    /* renamed from: e, reason: collision with root package name */
    public String f20030e;

    /* renamed from: f, reason: collision with root package name */
    public String f20031f;

    /* renamed from: g, reason: collision with root package name */
    public String f20032g;

    /* renamed from: h, reason: collision with root package name */
    public String f20033h;

    /* renamed from: j, reason: collision with root package name */
    public String f20035j;

    /* renamed from: k, reason: collision with root package name */
    public String f20036k;

    /* renamed from: m, reason: collision with root package name */
    public int f20038m;

    /* renamed from: n, reason: collision with root package name */
    public String f20039n;

    /* renamed from: o, reason: collision with root package name */
    public String f20040o;

    /* renamed from: p, reason: collision with root package name */
    public String f20041p;

    /* renamed from: r, reason: collision with root package name */
    public String f20043r;

    /* renamed from: s, reason: collision with root package name */
    public String f20044s;

    /* renamed from: t, reason: collision with root package name */
    public String f20045t;

    /* renamed from: v, reason: collision with root package name */
    public String f20047v;

    /* renamed from: q, reason: collision with root package name */
    public String f20042q = "android";

    /* renamed from: i, reason: collision with root package name */
    public String f20034i = z.m();

    /* renamed from: u, reason: collision with root package name */
    public String f20046u = z.v();

    /* renamed from: l, reason: collision with root package name */
    public String f20037l = e.c();

    public c(Context context) {
        int l8 = z.l(context);
        this.f20039n = String.valueOf(l8);
        this.f20040o = z.a(context, l8);
        this.f20035j = z.f(context);
        this.f20030e = com.mbridge.msdk.foundation.controller.c.m().b();
        this.f20029d = com.mbridge.msdk.foundation.controller.c.m().k();
        this.f20045t = String.valueOf(ai.f(context));
        this.f20044s = String.valueOf(ai.e(context));
        this.f20043r = String.valueOf(ai.d(context));
        this.f20047v = com.mbridge.msdk.foundation.controller.c.m().i().toString();
        this.f20032g = z.w();
        this.f20038m = ai.a();
        if (context.getResources().getConfiguration().orientation == 2) {
            this.f20041p = "landscape";
        } else {
            this.f20041p = "portrait";
        }
        this.f20031f = com.mbridge.msdk.foundation.same.a.f19397U;
        this.f20033h = com.mbridge.msdk.foundation.same.a.f19406g;
        this.f20036k = z.n();
        this.f20028c = e.d();
        this.f20026a = e.a();
        this.f20027b = com.mbridge.msdk.foundation.controller.authoritycontroller.b.b() ? 1 : 0;
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                jSONObject.put("device", this.f20034i);
                jSONObject.put("system_version", this.f20046u);
                jSONObject.put("network_type", this.f20039n);
                jSONObject.put("network_type_str", this.f20040o);
                jSONObject.put("device_ua", this.f20035j);
                jSONObject.put("has_wx", z.u(com.mbridge.msdk.foundation.controller.c.m().c()));
                jSONObject.put("integrated_wx", z.y());
                jSONObject.put("opensdk_ver", z.t() + "");
                jSONObject.put("wx_api_ver", z.c(com.mbridge.msdk.foundation.controller.c.m().h()) + "");
                jSONObject.put("brand", this.f20032g);
                jSONObject.put("mnc", z.k(com.mbridge.msdk.foundation.controller.c.m().c()));
                jSONObject.put("mcc", z.j(com.mbridge.msdk.foundation.controller.c.m().c()));
                jSONObject.put("adid_limit", this.f20026a);
                jSONObject.put("adid_limit_dev", this.f20027b);
            }
            jSONObject.put("plantform", this.f20042q);
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                jSONObject.put("google_ad_id", this.f20037l);
                jSONObject.put("az_aid_info", this.f20028c);
            }
            jSONObject.put("appkey", this.f20030e);
            jSONObject.put("appId", this.f20029d);
            jSONObject.put("screen_width", this.f20045t);
            jSONObject.put("screen_height", this.f20044s);
            jSONObject.put("orientation", this.f20041p);
            jSONObject.put("scale", this.f20043r);
            jSONObject.put(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, this.f20031f);
            jSONObject.put("c", this.f20033h);
            jSONObject.put("web_env", this.f20047v);
            jSONObject.put("f", this.f20036k);
            jSONObject.put("misk_spt", this.f20038m);
            if (z.q() != 0) {
                jSONObject.put("tun", z.q());
            }
            jSONObject.put(com.mbridge.msdk.foundation.same.net.h.e.f19715c, com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().f() + "");
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("adid_limit", this.f20026a);
                jSONObject2.put("adid_limit_dev", this.f20027b);
                jSONObject.put("dvi", x.b(jSONObject2.toString()));
            }
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.a()) {
                jSONObject.put("dev_source", "2");
            }
            if (DomainNameUtils.getInstance().isExcludeCNDomain()) {
                jSONObject.put("re_domain", "1");
            }
        } catch (JSONException e8) {
            e8.printStackTrace();
        }
        return jSONObject;
    }
}
