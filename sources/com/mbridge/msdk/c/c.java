package com.mbridge.msdk.c;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: A, reason: collision with root package name */
    private String f17948A;

    /* renamed from: D, reason: collision with root package name */
    private int f17951D;

    /* renamed from: E, reason: collision with root package name */
    private int f17952E;

    /* renamed from: I, reason: collision with root package name */
    private int f17956I;

    /* renamed from: K, reason: collision with root package name */
    private String f17958K;

    /* renamed from: N, reason: collision with root package name */
    private int f17961N;

    /* renamed from: b, reason: collision with root package name */
    private List<Integer> f17963b;

    /* renamed from: c, reason: collision with root package name */
    private List<Integer> f17964c;

    /* renamed from: d, reason: collision with root package name */
    private int f17965d;

    /* renamed from: e, reason: collision with root package name */
    private int f17966e;

    /* renamed from: f, reason: collision with root package name */
    private int f17967f;

    /* renamed from: g, reason: collision with root package name */
    private int f17968g;

    /* renamed from: h, reason: collision with root package name */
    private int f17969h;

    /* renamed from: i, reason: collision with root package name */
    private int f17970i;

    /* renamed from: k, reason: collision with root package name */
    private long f17972k;

    /* renamed from: l, reason: collision with root package name */
    private long f17973l;

    /* renamed from: m, reason: collision with root package name */
    private int f17974m;

    /* renamed from: n, reason: collision with root package name */
    private int f17975n;

    /* renamed from: o, reason: collision with root package name */
    private int f17976o;

    /* renamed from: p, reason: collision with root package name */
    private long f17977p;

    /* renamed from: q, reason: collision with root package name */
    private long f17978q;

    /* renamed from: r, reason: collision with root package name */
    private int f17979r;

    /* renamed from: s, reason: collision with root package name */
    private String f17980s;

    /* renamed from: t, reason: collision with root package name */
    private int f17981t;

    /* renamed from: u, reason: collision with root package name */
    private int f17982u;

    /* renamed from: z, reason: collision with root package name */
    private String f17987z;

    /* renamed from: a, reason: collision with root package name */
    private String f17962a = "";

    /* renamed from: j, reason: collision with root package name */
    private int f17971j = 0;

    /* renamed from: v, reason: collision with root package name */
    private int f17983v = 30;

    /* renamed from: w, reason: collision with root package name */
    private int f17984w = 1;

    /* renamed from: x, reason: collision with root package name */
    private int f17985x = 10;

    /* renamed from: y, reason: collision with root package name */
    private int f17986y = 60;

    /* renamed from: B, reason: collision with root package name */
    private int f17949B = 1;

    /* renamed from: C, reason: collision with root package name */
    private String f17950C = "";

    /* renamed from: F, reason: collision with root package name */
    private int f17953F = 100;

    /* renamed from: G, reason: collision with root package name */
    private int f17954G = 60;

    /* renamed from: H, reason: collision with root package name */
    private int f17955H = DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS;

    /* renamed from: J, reason: collision with root package name */
    private int f17957J = 1;

    /* renamed from: L, reason: collision with root package name */
    private String f17959L = "";

    /* renamed from: M, reason: collision with root package name */
    private String f17960M = "";

    public static k a(JSONObject jSONObject) {
        k kVar = null;
        if (jSONObject == null) {
            return null;
        }
        try {
            k kVar2 = new k();
            try {
                ((c) kVar2).f17958K = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
                String optString = jSONObject.optString("ab_id");
                ((c) kVar2).f17962a = optString;
                com.mbridge.msdk.foundation.controller.a.f19040b.put(((c) kVar2).f17958K, optString);
                ((c) kVar2).f17959L = jSONObject.optString("rid");
                JSONArray optJSONArray = jSONObject.optJSONArray("adSourceList");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (int i8 = 0; i8 < optJSONArray.length(); i8++) {
                        arrayList.add(Integer.valueOf(optJSONArray.optInt(i8)));
                    }
                    ((c) kVar2).f17963b = arrayList;
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("ad_source_timeout");
                if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i9 = 0; i9 < optJSONArray2.length(); i9++) {
                        arrayList2.add(Integer.valueOf(optJSONArray2.optInt(i9)));
                    }
                    ((c) kVar2).f17964c = arrayList2;
                }
                ((c) kVar2).f17956I = jSONObject.optInt("tpqn");
                ((c) kVar2).f17967f = jSONObject.optInt("aqn");
                ((c) kVar2).f17966e = jSONObject.optInt("acn");
                ((c) kVar2).f17961N = jSONObject.optInt("wt");
                int i10 = 1;
                ((c) kVar2).f17984w = jSONObject.optInt("iscasf", 1);
                ((c) kVar2).f17955H = jSONObject.optInt("spmxrt", DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS);
                ((c) kVar2).f17977p = jSONObject.optLong("current_time");
                ((c) kVar2).f17949B = jSONObject.optInt(TypedValues.CycleType.S_WAVE_OFFSET);
                ((c) kVar2).f17978q = jSONObject.optLong("dlct", 3600L);
                ((c) kVar2).f17968g = jSONObject.optInt("autoplay", 0);
                ((c) kVar2).f17979r = jSONObject.optInt("dlnet", 2);
                ((c) kVar2).f17948A = jSONObject.optString("no_offer");
                ((c) kVar2).f17970i = jSONObject.optInt("cb_type");
                ((c) kVar2).f17973l = jSONObject.optLong("clct", 86400L);
                ((c) kVar2).f17972k = jSONObject.optLong("clcq", 300L);
                ((c) kVar2).f17953F = jSONObject.optInt(CampaignEx.JSON_KEY_READY_RATE, 100);
                ((c) kVar2).f17971j = jSONObject.optInt("cd_rate", 0);
                ((c) kVar2).f17975n = jSONObject.optInt("content", 1);
                ((c) kVar2).f17982u = jSONObject.optInt("impt", 0);
                ((c) kVar2).f17981t = jSONObject.optInt("icon_type", 1);
                ((c) kVar2).f17987z = jSONObject.optString("no_ads_url", "");
                ((c) kVar2).f17952E = jSONObject.optInt("playclosebtn_tm", -1);
                ((c) kVar2).f17951D = jSONObject.optInt("play_ctdown", 0);
                ((c) kVar2).f17974m = jSONObject.optInt("close_alert", 0);
                ((c) kVar2).f17983v = jSONObject.optInt("intershowlimit", 30);
                ((c) kVar2).f17954G = jSONObject.optInt("refreshFq", 60);
                ((c) kVar2).f17969h = jSONObject.optInt("closeBtn", 0);
                int optInt = jSONObject.optInt("tmorl", 1);
                if (optInt <= 2 && optInt > 0) {
                    i10 = optInt;
                }
                ((c) kVar2).f17957J = i10;
                ((c) kVar2).f17950C = jSONObject.optString("placementid", "");
                ((c) kVar2).f17985x = jSONObject.optInt("ltafemty", 10);
                ((c) kVar2).f17986y = jSONObject.optInt("ltorwc", 60);
                ((c) kVar2).f17960M = jSONObject.optString("vtag", "");
                return kVar2;
            } catch (Exception e8) {
                e = e8;
                kVar = kVar2;
                e.printStackTrace();
                return kVar;
            }
        } catch (Exception e9) {
            e = e9;
        }
    }

    public final List<Integer> b() {
        return this.f17963b;
    }

    public final List<Integer> c() {
        return this.f17964c;
    }

    public final int d() {
        return this.f17966e;
    }

    public final int e() {
        return this.f17967f;
    }

    public final int f() {
        return this.f17969h;
    }

    public final int g() {
        return this.f17971j;
    }

    public final int h() {
        return this.f17975n;
    }

    public final long i() {
        return this.f17977p;
    }

    public final long j() {
        return this.f17978q;
    }

    public final int k() {
        return this.f17979r;
    }

    public final int l() {
        return this.f17982u;
    }

    public final int m() {
        return this.f17984w;
    }

    public final int n() {
        return this.f17985x;
    }

    public final int o() {
        return this.f17986y;
    }

    public final int p() {
        return this.f17953F;
    }

    public final int q() {
        return this.f17954G;
    }

    public final int r() {
        return this.f17955H;
    }

    public final String s() {
        return this.f17959L;
    }

    public final String t() {
        return this.f17960M;
    }

    public String toString() {
        List<Integer> list = this.f17963b;
        String str = "";
        if (list != null && list.size() > 0) {
            Iterator<Integer> it = this.f17963b.iterator();
            while (it.hasNext()) {
                str = str + it.next() + ",";
            }
        }
        return "offset = " + this.f17949B + " unitId = " + this.f17958K + " fbPlacementId = " + this.f17980s + str;
    }

    public final int u() {
        return this.f17961N;
    }

    public final int v() {
        return this.f17968g;
    }

    public final int w() {
        return this.f17949B;
    }

    public final JSONObject x() {
        JSONObject jSONObject = new JSONObject();
        try {
            List<Integer> list = this.f17963b;
            if (list != null && list.size() > 0) {
                int size = list.size();
                JSONArray jSONArray = new JSONArray();
                for (int i8 = 0; i8 < size; i8++) {
                    jSONArray.put(list.get(i8));
                }
                jSONObject.put("adSourceList", jSONArray);
            }
            List<Integer> list2 = this.f17964c;
            if (list2 != null && list2.size() > 0) {
                int size2 = list2.size();
                JSONArray jSONArray2 = new JSONArray();
                for (int i9 = 0; i9 < size2; i9++) {
                    jSONArray2.put(list2.get(i9));
                }
                jSONObject.put("ad_source_timeout", jSONArray2);
            }
            jSONObject.put("tpqn", this.f17956I);
            jSONObject.put("aqn", this.f17967f);
            jSONObject.put("acn", this.f17966e);
            jSONObject.put("wt", this.f17961N);
            jSONObject.put("current_time", this.f17977p);
            jSONObject.put(TypedValues.CycleType.S_WAVE_OFFSET, this.f17949B);
            jSONObject.put("dlct", this.f17978q);
            jSONObject.put("autoplay", this.f17968g);
            jSONObject.put("dlnet", this.f17979r);
            jSONObject.put("no_offer", this.f17948A);
            jSONObject.put("cb_type", this.f17970i);
            jSONObject.put("clct", this.f17973l);
            jSONObject.put("clcq", this.f17972k);
            jSONObject.put(CampaignEx.JSON_KEY_READY_RATE, this.f17953F);
            jSONObject.put("content", this.f17975n);
            jSONObject.put("impt", this.f17982u);
            jSONObject.put("icon_type", this.f17981t);
            jSONObject.put("no_ads_url", this.f17987z);
            jSONObject.put("playclosebtn_tm", this.f17952E);
            jSONObject.put("play_ctdown", this.f17951D);
            jSONObject.put("close_alert", this.f17974m);
            jSONObject.put("closeBtn", this.f17969h);
            jSONObject.put("refreshFq", this.f17954G);
            jSONObject.put("countdown", this.f17976o);
            jSONObject.put("allowSkip", this.f17965d);
            jSONObject.put("tmorl", this.f17957J);
            jSONObject.put(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, this.f17958K);
            jSONObject.put("placementid", this.f17950C);
            jSONObject.put("ltafemty", this.f17985x);
            jSONObject.put("ltorwc", this.f17986y);
            jSONObject.put("vtag", this.f17960M);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        return jSONObject;
    }

    public final void b(List<Integer> list) {
        this.f17964c = list;
    }

    public final void c(int i8) {
        this.f17966e = i8;
    }

    public final void d(int i8) {
        this.f17967f = i8;
    }

    public final void e(int i8) {
        this.f17971j = i8;
    }

    public final void f(int i8) {
        this.f17975n = i8;
    }

    public final void g(int i8) {
        this.f17976o = i8;
    }

    public final void h(int i8) {
        this.f17979r = i8;
    }

    public final void i(int i8) {
        this.f17982u = i8;
    }

    public final void j(int i8) {
        this.f17985x = i8;
    }

    public final void k(int i8) {
        this.f17986y = i8;
    }

    public final void l(int i8) {
        this.f17953F = i8;
    }

    public final void m(int i8) {
        this.f17954G = i8;
    }

    public final void n(int i8) {
        this.f17956I = i8;
    }

    public final void o(int i8) {
        this.f17961N = i8;
    }

    public final void p(int i8) {
        this.f17949B = i8;
    }

    public final void b(int i8) {
        this.f17965d = i8;
    }

    public final void b(String str) {
        this.f17958K = str;
    }

    public final void a(int i8) {
        this.f17968g = i8;
    }

    public final String a() {
        return this.f17962a;
    }

    public final void a(List<Integer> list) {
        this.f17963b = list;
    }

    public final void a(long j8) {
        this.f17978q = j8;
    }

    public final void a(String str) {
        this.f17950C = str;
    }
}
