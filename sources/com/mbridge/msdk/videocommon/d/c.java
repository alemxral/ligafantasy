package com.mbridge.msdk.videocommon.d;

import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.foundation.db.h;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.mbridge.msdk.foundation.tools.x;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: H, reason: collision with root package name */
    private static h f22985H;

    /* renamed from: a, reason: collision with root package name */
    public static String f22986a;

    /* renamed from: F, reason: collision with root package name */
    private int f22992F;

    /* renamed from: I, reason: collision with root package name */
    private int f22994I;

    /* renamed from: W, reason: collision with root package name */
    private JSONArray f23008W;

    /* renamed from: X, reason: collision with root package name */
    private JSONObject f23009X;

    /* renamed from: b, reason: collision with root package name */
    private String f23010b;

    /* renamed from: c, reason: collision with root package name */
    private String f23011c;

    /* renamed from: d, reason: collision with root package name */
    private List<com.mbridge.msdk.videocommon.b.b> f23012d;

    /* renamed from: e, reason: collision with root package name */
    private long f23013e;

    /* renamed from: u, reason: collision with root package name */
    private ArrayList<Integer> f23029u;

    /* renamed from: f, reason: collision with root package name */
    private int f23014f = -1;

    /* renamed from: g, reason: collision with root package name */
    private int f23015g = 0;

    /* renamed from: h, reason: collision with root package name */
    private int f23016h = 0;

    /* renamed from: i, reason: collision with root package name */
    private int f23017i = 1;

    /* renamed from: j, reason: collision with root package name */
    private int f23018j = 1;

    /* renamed from: k, reason: collision with root package name */
    private int f23019k = 1;

    /* renamed from: l, reason: collision with root package name */
    private int f23020l = 1;

    /* renamed from: m, reason: collision with root package name */
    private int f23021m = 5;

    /* renamed from: n, reason: collision with root package name */
    private int f23022n = 1;

    /* renamed from: o, reason: collision with root package name */
    private int f23023o = 3;

    /* renamed from: p, reason: collision with root package name */
    private int f23024p = 80;

    /* renamed from: q, reason: collision with root package name */
    private int f23025q = 100;

    /* renamed from: r, reason: collision with root package name */
    private int f23026r = 0;

    /* renamed from: s, reason: collision with root package name */
    private double f23027s = 1.0d;

    /* renamed from: t, reason: collision with root package name */
    private int f23028t = -1;

    /* renamed from: v, reason: collision with root package name */
    private int f23030v = 3;

    /* renamed from: w, reason: collision with root package name */
    private int f23031w = 1;

    /* renamed from: x, reason: collision with root package name */
    private int f23032x = 100;

    /* renamed from: y, reason: collision with root package name */
    private int f23033y = 60;

    /* renamed from: z, reason: collision with root package name */
    private int f23034z = 0;

    /* renamed from: A, reason: collision with root package name */
    private int f22987A = 70;

    /* renamed from: B, reason: collision with root package name */
    private int f22988B = 0;

    /* renamed from: C, reason: collision with root package name */
    private int f22989C = -1;

    /* renamed from: D, reason: collision with root package name */
    private int f22990D = -1;

    /* renamed from: E, reason: collision with root package name */
    private int f22991E = -1;

    /* renamed from: G, reason: collision with root package name */
    private int f22993G = 20;

    /* renamed from: J, reason: collision with root package name */
    private int f22995J = 0;

    /* renamed from: K, reason: collision with root package name */
    private int f22996K = 1;

    /* renamed from: L, reason: collision with root package name */
    private String f22997L = "";

    /* renamed from: M, reason: collision with root package name */
    private int f22998M = 1;

    /* renamed from: N, reason: collision with root package name */
    private String f22999N = "";

    /* renamed from: O, reason: collision with root package name */
    private int f23000O = 1;

    /* renamed from: P, reason: collision with root package name */
    private String f23001P = "Virtual Item";

    /* renamed from: Q, reason: collision with root package name */
    private String f23002Q = "";

    /* renamed from: R, reason: collision with root package name */
    private String f23003R = "";

    /* renamed from: S, reason: collision with root package name */
    private int f23004S = 0;

    /* renamed from: T, reason: collision with root package name */
    private int f23005T = 1;

    /* renamed from: U, reason: collision with root package name */
    private int f23006U = 60;

    /* renamed from: V, reason: collision with root package name */
    private String f23007V = "";

    private void y(int i8) {
        if (i8 <= 0) {
            this.f22998M = 1;
        } else {
            this.f22998M = i8;
        }
    }

    public final int A() {
        return this.f23030v;
    }

    public final Queue<Integer> B() {
        LinkedList linkedList;
        Exception e8;
        List<com.mbridge.msdk.videocommon.b.b> list;
        try {
            list = this.f23012d;
        } catch (Exception e9) {
            linkedList = null;
            e8 = e9;
        }
        if (list == null || list.size() <= 0) {
            return null;
        }
        linkedList = new LinkedList();
        for (int i8 = 0; i8 < this.f23012d.size(); i8++) {
            try {
                linkedList.add(Integer.valueOf(this.f23012d.get(i8).b()));
            } catch (Exception e10) {
                e8 = e10;
                e8.printStackTrace();
                return linkedList;
            }
        }
        return linkedList;
    }

    public final int C() {
        return this.f23005T;
    }

    public final int D() {
        return this.f23006U;
    }

    public final JSONObject E() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, this.f23010b);
            jSONObject.put("callbackType", this.f23017i);
            List<com.mbridge.msdk.videocommon.b.b> list = this.f23012d;
            if (list != null && list.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (com.mbridge.msdk.videocommon.b.b bVar : this.f23012d) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", bVar.a());
                    jSONObject2.put("timeout", bVar.b());
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("adSourceList", jSONArray);
            }
            jSONObject.put("aqn", this.f23018j);
            jSONObject.put("acn", this.f23019k);
            jSONObject.put("vcn", this.f23020l);
            jSONObject.put(TypedValues.CycleType.S_WAVE_OFFSET, this.f23021m);
            jSONObject.put("dlnet", this.f23022n);
            jSONObject.put("tv_start", this.f23023o);
            jSONObject.put("tv_end", this.f23024p);
            jSONObject.put(CampaignEx.JSON_KEY_READY_RATE, this.f23025q);
            jSONObject.put("endscreen_type", this.f22994I);
            jSONObject.put("daily_play_cap", this.f22988B);
            jSONObject.put("video_skip_time", this.f22989C);
            jSONObject.put("video_skip_result", this.f22990D);
            jSONObject.put("video_interactive_type", this.f22991E);
            jSONObject.put("orientation", this.f23034z);
            jSONObject.put("close_button_delay", this.f22992F);
            jSONObject.put("playclosebtn_tm", this.f23014f);
            jSONObject.put("play_ctdown", this.f23015g);
            jSONObject.put("close_alert", this.f23016h);
            jSONObject.put("rfpv", this.f23028t);
            jSONObject.put("vdcmp", this.f23027s);
            JSONArray jSONArray2 = new JSONArray();
            ArrayList<Integer> arrayList = this.f23029u;
            if (arrayList != null) {
                if (arrayList.size() > 0) {
                    Iterator<Integer> it = this.f23029u.iterator();
                    while (it.hasNext()) {
                        jSONArray2.put(it.next());
                    }
                }
                jSONObject.put("atl_type", jSONArray2);
            }
            jSONObject.put("atl_dyt", this.f23030v);
            jSONObject.put("tmorl", this.f23031w);
            jSONObject.put("placementid", this.f23011c);
            jSONObject.put("ltafemty", this.f23032x);
            jSONObject.put("ltorwc", this.f23033y);
            jSONObject.put(RewardPlus.AMOUNT_MAX, this.f22995J);
            jSONObject.put(RewardPlus.CALLBACK_RULE, this.f22996K);
            jSONObject.put(RewardPlus.VIRTUAL_CURRENCY, this.f22997L);
            jSONObject.put(RewardPlus.AMOUNT, this.f22998M);
            jSONObject.put(RewardPlus.ICON, this.f22999N);
            jSONObject.put(RewardPlus.CURRENCY_ID, this.f23000O);
            jSONObject.put("name", this.f23001P);
            jSONObject.put("isDefault", this.f23004S);
            jSONObject.put("video_error_rule", this.f23005T);
            jSONObject.put("loadtmo", this.f23006U);
            jSONObject.put("vtag", this.f23007V);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        return jSONObject;
    }

    public final int F() {
        return this.f22987A;
    }

    public final JSONArray G() {
        return this.f23008W;
    }

    public final int a() {
        return this.f23032x;
    }

    public final int b() {
        return this.f23033y;
    }

    public final int c() {
        return this.f23034z;
    }

    public final int d() {
        return this.f22988B;
    }

    public final int e() {
        return this.f22989C;
    }

    public final int f() {
        return this.f22990D;
    }

    public final int g() {
        return this.f22991E;
    }

    public final int h() {
        return this.f23014f;
    }

    public final int i() {
        return this.f23016h;
    }

    public final String j() {
        return this.f23007V;
    }

    public final String k() {
        return this.f23002Q;
    }

    public final String l() {
        return this.f23003R;
    }

    public final int m() {
        return this.f22998M;
    }

    public final String n() {
        return this.f23001P;
    }

    public final int o() {
        return this.f22993G;
    }

    public final int p() {
        return this.f22992F;
    }

    public final int q() {
        return this.f22994I;
    }

    public final int r() {
        return this.f23025q;
    }

    public final int s() {
        return this.f23026r;
    }

    public final int t() {
        return this.f23018j;
    }

    public final int u() {
        return this.f23019k;
    }

    public final int v() {
        return this.f23021m;
    }

    public final int w() {
        return this.f23022n;
    }

    public final long x() {
        return this.f23013e;
    }

    public final String z() {
        return this.f23011c;
    }

    public final void a(ArrayList<Integer> arrayList) {
        this.f23029u = arrayList;
    }

    public final void b(int i8) {
        this.f22988B = i8;
    }

    public final void c(int i8) {
        this.f22989C = i8;
    }

    public final void d(int i8) {
        this.f22990D = i8;
    }

    public final void e(int i8) {
        this.f22991E = i8;
    }

    public final void f(int i8) {
        this.f22992F = i8;
    }

    public final void g(int i8) {
        this.f22994I = i8;
    }

    public final void h(int i8) {
        this.f23023o = i8;
    }

    public final void i(int i8) {
        this.f23024p = i8;
    }

    public final void j(int i8) {
        this.f23025q = i8;
    }

    public final void k(int i8) {
        this.f23026r = i8;
    }

    public final void l(int i8) {
        this.f23018j = i8;
    }

    public final void m(int i8) {
        this.f23019k = i8;
    }

    public final void n(int i8) {
        this.f23020l = i8;
    }

    public final void o(int i8) {
        this.f23021m = i8;
    }

    public final void p(int i8) {
        this.f23022n = i8;
    }

    public final void q(int i8) {
        this.f23017i = i8;
    }

    public final void r(int i8) {
        this.f23031w = i8;
    }

    public final boolean s(int i8) {
        ArrayList<Integer> arrayList = this.f23029u;
        if (arrayList == null || arrayList.size() <= 0) {
            return false;
        }
        return this.f23029u.contains(Integer.valueOf(i8));
    }

    public final void t(int i8) {
        this.f23030v = i8;
    }

    public final void u(int i8) {
        this.f23004S = i8;
    }

    public final void v(int i8) {
        this.f23005T = i8;
    }

    public final void w(int i8) {
        this.f23006U = i8;
    }

    public final void x(int i8) {
        this.f22987A = i8;
    }

    public static c c(String str) {
        JSONObject optJSONObject;
        if (f22985H == null) {
            f22985H = h.a(com.mbridge.msdk.foundation.controller.c.m().c());
        }
        c cVar = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("vtag", "");
                String optString2 = jSONObject.optString("rid", "");
                JSONArray optJSONArray = jSONObject.optJSONArray("unitSetting");
                if (optJSONArray == null || (optJSONObject = optJSONArray.optJSONObject(0)) == null) {
                    return null;
                }
                String optString3 = optJSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
                if (TextUtils.isEmpty(optString3)) {
                    return null;
                }
                c cVar2 = new c();
                try {
                    cVar2.f23007V = optString;
                    cVar2.f23003R = optString2;
                    List<com.mbridge.msdk.videocommon.b.b> a8 = com.mbridge.msdk.videocommon.b.b.a(optJSONObject.optJSONArray("adSourceList"));
                    cVar2.f23010b = optString3;
                    cVar2.f23012d = a8;
                    cVar2.f23017i = optJSONObject.optInt("callbackType");
                    int optInt = optJSONObject.optInt("aqn", 1);
                    if (optInt <= 0) {
                        optInt = 1;
                    }
                    cVar2.f23018j = optInt;
                    int optInt2 = optJSONObject.optInt("acn", 1);
                    if (optInt2 < 0) {
                        optInt2 = 1;
                    }
                    cVar2.f23019k = optInt2;
                    cVar2.f23020l = optJSONObject.optInt("vcn", 5);
                    cVar2.f23021m = optJSONObject.optInt(TypedValues.CycleType.S_WAVE_OFFSET, 5);
                    cVar2.f23022n = optJSONObject.optInt("dlnet", 1);
                    cVar2.f22994I = optJSONObject.optInt("endscreen_type", 2);
                    cVar2.f23023o = optJSONObject.optInt("tv_start", 3);
                    cVar2.f23024p = optJSONObject.optInt("tv_end", 80);
                    cVar2.f23025q = optJSONObject.optInt(CampaignEx.JSON_KEY_READY_RATE, 100);
                    cVar2.f23026r = optJSONObject.optInt("cd_rate", 0);
                    cVar2.f23013e = jSONObject.optLong("current_time");
                    cVar2.f23034z = optJSONObject.optInt("orientation", 0);
                    cVar2.f22988B = optJSONObject.optInt("daily_play_cap", 0);
                    cVar2.f22989C = optJSONObject.optInt("video_skip_time", -1);
                    cVar2.f22990D = optJSONObject.optInt("video_skip_result", 2);
                    cVar2.f22991E = optJSONObject.optInt("video_interactive_type", -1);
                    cVar2.f22992F = optJSONObject.optInt("close_button_delay", 1);
                    cVar2.f23014f = optJSONObject.optInt("playclosebtn_tm", -1);
                    cVar2.f23015g = optJSONObject.optInt("play_ctdown", 0);
                    cVar2.f23016h = optJSONObject.optInt("close_alert", 0);
                    cVar2.f22993G = optJSONObject.optInt("rdrct", 20);
                    cVar2.f22987A = optJSONObject.optInt("load_global_timeout", 70);
                    cVar2.f23028t = optJSONObject.optInt("rfpv", -1);
                    cVar2.f23027s = optJSONObject.optDouble("vdcmp", 1.0d);
                    f22986a = optJSONObject.optString("atzu");
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("atl_type");
                    ArrayList<Integer> arrayList = new ArrayList<>();
                    try {
                        if (optJSONArray2 != null) {
                            for (int i8 = 0; i8 < optJSONArray2.length(); i8++) {
                                arrayList.add(Integer.valueOf(optJSONArray2.getInt(i8)));
                            }
                        } else {
                            arrayList.add(4);
                            arrayList.add(6);
                        }
                        cVar2.f23029u = arrayList;
                    } catch (Exception e8) {
                        e8.printStackTrace();
                    }
                    int optInt3 = optJSONObject.optInt("atl_dyt", 0);
                    cVar2.f23030v = optInt3 > 0 ? optInt3 : 3;
                    int optInt4 = optJSONObject.optInt("tmorl", 1);
                    if (optInt4 > 2 || optInt4 <= 0) {
                        optInt4 = 1;
                    }
                    cVar2.f23031w = optInt4;
                    cVar2.f23011c = optJSONObject.optString("placementid");
                    cVar2.f23032x = optJSONObject.optInt("ltafemty", 10);
                    cVar2.f23033y = optJSONObject.optInt("ltorwc", 60);
                    cVar2.d(optJSONObject.optString("ab_id"));
                    cVar2.f22995J = optJSONObject.optInt(RewardPlus.AMOUNT_MAX, 0);
                    cVar2.f22996K = optJSONObject.optInt(RewardPlus.CALLBACK_RULE, 1);
                    cVar2.f22997L = optJSONObject.optString(RewardPlus.VIRTUAL_CURRENCY, "");
                    cVar2.y(optJSONObject.optInt(RewardPlus.AMOUNT, 1));
                    cVar2.f22999N = optJSONObject.optString(RewardPlus.ICON, "");
                    cVar2.f23000O = optJSONObject.optInt(RewardPlus.CURRENCY_ID, 1);
                    cVar2.e(optJSONObject.optString("name", "Virtual Item"));
                    cVar2.f23005T = optJSONObject.optInt("video_error_rule", 1);
                    cVar2.f23006U = optJSONObject.optInt("loadtmo", 60);
                    cVar2.f23008W = optJSONObject.optJSONArray("local_cache_info");
                    try {
                        String optString4 = optJSONObject.optString(MBridgeCommon.SettingConfig.KEY_SETTING_CONFIG_RETRY_STRATEGY);
                        if (!TextUtils.isEmpty(optString4)) {
                            String a9 = x.a(optString4);
                            if (!TextUtils.isEmpty(a9)) {
                                cVar2.f23009X = new JSONObject(a9);
                            }
                        }
                    } catch (Exception unused) {
                    }
                    return cVar2;
                } catch (Exception e9) {
                    e = e9;
                    cVar = cVar2;
                    e.printStackTrace();
                    return cVar;
                }
            } catch (Exception e10) {
                e = e10;
            }
        }
        return cVar;
    }

    private void d(String str) {
        this.f23002Q = str;
        com.mbridge.msdk.foundation.controller.a.f19040b.put(this.f23010b, str);
    }

    private void e(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f23001P = this.f22997L;
        } else {
            this.f23001P = str;
        }
    }

    public final void a(int i8) {
        this.f23034z = i8;
    }

    public final void b(String str) {
        this.f23011c = str;
    }

    public final int y() {
        return this.f23031w;
    }

    public final void a(String str) {
        this.f23010b = str;
    }

    public final void a(List<com.mbridge.msdk.videocommon.b.b> list) {
        this.f23012d = list;
    }

    public static c a(JSONObject jSONObject) {
        c cVar = null;
        if (jSONObject == null) {
            return null;
        }
        try {
            c cVar2 = new c();
            try {
                cVar2.f23012d = com.mbridge.msdk.videocommon.b.b.a(jSONObject.optJSONArray("adSourceList"));
                cVar2.f23017i = jSONObject.optInt("callbackType");
                int optInt = jSONObject.optInt("aqn", 1);
                if (optInt <= 0) {
                    optInt = 1;
                }
                cVar2.f23018j = optInt;
                int optInt2 = jSONObject.optInt("acn", 1);
                if (optInt2 < 0) {
                    optInt2 = 1;
                }
                cVar2.f23019k = optInt2;
                cVar2.f23020l = jSONObject.optInt("vcn", 5);
                cVar2.f23021m = jSONObject.optInt(TypedValues.CycleType.S_WAVE_OFFSET, 5);
                cVar2.f23022n = jSONObject.optInt("dlnet", 1);
                cVar2.f22994I = jSONObject.optInt("endscreen_type", 2);
                cVar2.f23023o = jSONObject.optInt("tv_start", 3);
                cVar2.f23024p = jSONObject.optInt("tv_end", 80);
                cVar2.f23025q = jSONObject.optInt(CampaignEx.JSON_KEY_READY_RATE, 100);
                cVar2.f23013e = jSONObject.optLong("current_time");
                cVar2.f23034z = jSONObject.optInt("orientation", 0);
                cVar2.f22988B = jSONObject.optInt("daily_play_cap", 0);
                cVar2.f22989C = jSONObject.optInt("video_skip_time", -1);
                cVar2.f22990D = jSONObject.optInt("video_skip_result", 2);
                cVar2.f22991E = jSONObject.optInt("video_interactive_type", -1);
                cVar2.f22992F = jSONObject.optInt("close_button_delay", 1);
                cVar2.f23014f = jSONObject.optInt("playclosebtn_tm", -1);
                cVar2.f23015g = jSONObject.optInt("play_ctdown", 0);
                cVar2.f23016h = jSONObject.optInt("close_alert", 0);
                cVar2.f22993G = jSONObject.optInt("rdrct", 20);
                cVar2.f23028t = jSONObject.optInt("rfpv", -1);
                cVar2.f23027s = jSONObject.optDouble("vdcmp", 1.0d);
                cVar2.f22987A = jSONObject.optInt("load_global_timeout", 70);
                JSONArray optJSONArray = jSONObject.optJSONArray("atl_type");
                ArrayList<Integer> arrayList = new ArrayList<>();
                try {
                    if (optJSONArray != null) {
                        for (int i8 = 0; i8 < optJSONArray.length(); i8++) {
                            arrayList.add(Integer.valueOf(optJSONArray.getInt(i8)));
                        }
                    } else {
                        arrayList.add(4);
                        arrayList.add(6);
                    }
                    cVar2.f23029u = arrayList;
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
                cVar2.f23030v = jSONObject.optInt("atl_dyt", 3);
                int optInt3 = jSONObject.optInt("tmorl", 1);
                if (optInt3 > 2 || optInt3 <= 0) {
                    optInt3 = 1;
                }
                cVar2.f23031w = optInt3;
                cVar2.f23011c = jSONObject.optString("placementid");
                cVar2.f23032x = jSONObject.optInt("ltafemty", 10);
                cVar2.f23033y = jSONObject.optInt("ltorwc", 60);
                cVar2.d(jSONObject.optString("ab_id"));
                cVar2.f23003R = jSONObject.optString("rid", "");
                cVar2.f22995J = jSONObject.optInt(RewardPlus.AMOUNT_MAX, 0);
                cVar2.f22996K = jSONObject.optInt(RewardPlus.CALLBACK_RULE, 1);
                cVar2.f22997L = jSONObject.optString(RewardPlus.VIRTUAL_CURRENCY, "");
                cVar2.y(jSONObject.optInt(RewardPlus.AMOUNT, 1));
                cVar2.f22999N = jSONObject.optString(RewardPlus.ICON, "");
                cVar2.f23000O = jSONObject.optInt(RewardPlus.CURRENCY_ID, 1);
                cVar2.e(jSONObject.optString("name", "Virtual Item"));
                cVar2.f23005T = jSONObject.optInt("video_error_rule", 1);
                cVar2.f23006U = jSONObject.optInt("loadtmo", 60);
                cVar2.f23007V = jSONObject.optString("vtag", "");
                cVar2.f23008W = jSONObject.optJSONArray("local_cache_info");
                try {
                    String optString = jSONObject.optString(MBridgeCommon.SettingConfig.KEY_SETTING_CONFIG_RETRY_STRATEGY);
                    if (!TextUtils.isEmpty(optString)) {
                        String a8 = x.a(optString);
                        if (!TextUtils.isEmpty(a8)) {
                            cVar2.f23009X = new JSONObject(a8);
                        }
                    }
                } catch (Exception unused) {
                }
                return cVar2;
            } catch (Exception e9) {
                e = e9;
                cVar = cVar2;
                e.printStackTrace();
                return cVar;
            }
        } catch (Exception e10) {
            e = e10;
        }
    }
}
