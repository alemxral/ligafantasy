package com.mbridge.msdk.videocommon.d;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private Map<String, Integer> f22965a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, com.mbridge.msdk.videocommon.b.c> f22966b;

    /* renamed from: c, reason: collision with root package name */
    private long f22967c;

    /* renamed from: d, reason: collision with root package name */
    private long f22968d;

    /* renamed from: e, reason: collision with root package name */
    private long f22969e;

    /* renamed from: f, reason: collision with root package name */
    private long f22970f;

    /* renamed from: g, reason: collision with root package name */
    private long f22971g;

    /* renamed from: h, reason: collision with root package name */
    private long f22972h;

    /* renamed from: j, reason: collision with root package name */
    private String f22974j;

    /* renamed from: i, reason: collision with root package name */
    private int f22973i = 0;

    /* renamed from: k, reason: collision with root package name */
    private String f22975k = "";

    /* renamed from: l, reason: collision with root package name */
    private String f22976l = "";

    public final String a() {
        return this.f22975k;
    }

    public final String b() {
        return this.f22974j;
    }

    public final String c() {
        return this.f22976l;
    }

    public final long d() {
        return this.f22967c * 1000;
    }

    public final long e() {
        return this.f22968d * 1000;
    }

    public final long f() {
        return this.f22969e * 1000;
    }

    public final long g() {
        return this.f22970f;
    }

    public final long h() {
        return this.f22971g;
    }

    public final long i() {
        return this.f22972h;
    }

    public final Map<String, com.mbridge.msdk.videocommon.b.c> j() {
        return this.f22966b;
    }

    public final JSONObject k() {
        JSONObject jSONObject = new JSONObject();
        try {
            Map<String, Integer> map = this.f22965a;
            if (map != null && map.size() > 0) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    for (Map.Entry<String, Integer> entry : this.f22965a.entrySet()) {
                        jSONObject2.put(entry.getKey(), entry.getValue().intValue());
                    }
                    jSONObject.put("caplist", jSONObject2);
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
            }
            Map<String, com.mbridge.msdk.videocommon.b.c> map2 = this.f22966b;
            if (map2 != null && map2.size() > 0) {
                try {
                    JSONArray jSONArray = new JSONArray();
                    for (Map.Entry<String, com.mbridge.msdk.videocommon.b.c> entry2 : this.f22966b.entrySet()) {
                        JSONObject jSONObject3 = new JSONObject();
                        String key = entry2.getKey();
                        com.mbridge.msdk.videocommon.b.c value = entry2.getValue();
                        if (value != null) {
                            jSONObject3.put("name", value.a());
                            jSONObject3.put(RewardPlus.AMOUNT, value.b());
                            jSONObject3.put("id", key);
                        }
                        jSONArray.put(jSONObject3);
                    }
                    jSONObject.put("reward", jSONArray);
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
            }
            jSONObject.put("getpf", this.f22967c);
            jSONObject.put("ruct", this.f22968d);
            jSONObject.put(CampaignEx.JSON_KEY_PLCT, this.f22969e);
            jSONObject.put("dlct", this.f22970f);
            jSONObject.put("vcct", this.f22971g);
            jSONObject.put("current_time", this.f22972h);
            jSONObject.put("vtag", this.f22975k);
            jSONObject.put("isDefault", this.f22973i);
            return jSONObject;
        } catch (Exception e10) {
            e10.printStackTrace();
            return jSONObject;
        }
    }

    public final void a(long j8) {
        this.f22967c = j8;
    }

    public final void b(long j8) {
        this.f22968d = j8;
    }

    public final void c(long j8) {
        this.f22969e = j8;
    }

    public final void d(long j8) {
        this.f22970f = j8;
    }

    public final void e(long j8) {
        this.f22971g = j8;
    }

    public final void a(Map<String, Integer> map) {
        this.f22965a = map;
    }

    public final void b(Map<String, com.mbridge.msdk.videocommon.b.c> map) {
        this.f22966b = map;
    }

    public final void a(int i8) {
        this.f22973i = i8;
    }

    public static a a(String str) {
        a aVar = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                a aVar2 = new a();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    JSONObject optJSONObject = jSONObject.optJSONObject("caplist");
                    aVar2.f22974j = jSONObject.optString("ab_id", "");
                    aVar2.f22976l = jSONObject.optString("rid", "");
                    if (optJSONObject != null && optJSONObject.length() > 0) {
                        HashMap hashMap = new HashMap();
                        Iterator<String> keys = optJSONObject.keys();
                        while (keys != null && keys.hasNext()) {
                            String next = keys.next();
                            int optInt = optJSONObject.optInt(next, 1000);
                            if (!TextUtils.isEmpty(next)) {
                                if (!TextUtils.isEmpty(next) && optInt == 0) {
                                    hashMap.put(next, 1000);
                                } else {
                                    hashMap.put(next, Integer.valueOf(optInt));
                                }
                            }
                        }
                        aVar2.f22965a = hashMap;
                    }
                    aVar2.f22966b = com.mbridge.msdk.videocommon.b.c.a(jSONObject.optJSONArray("reward"));
                    aVar2.f22967c = jSONObject.optLong("getpf", 43200L);
                    aVar2.f22968d = jSONObject.optLong("ruct", 5400L);
                    aVar2.f22969e = jSONObject.optLong(CampaignEx.JSON_KEY_PLCT, 3600L);
                    aVar2.f22970f = jSONObject.optLong("dlct", 3600L);
                    aVar2.f22971g = jSONObject.optLong("vcct", 5L);
                    aVar2.f22972h = jSONObject.optLong("current_time");
                    aVar2.f22975k = jSONObject.optString("vtag", "");
                    return aVar2;
                } catch (Exception e8) {
                    e = e8;
                    aVar = aVar2;
                    e.printStackTrace();
                    return aVar;
                }
            } catch (Exception e9) {
                e = e9;
            }
        }
        return aVar;
    }
}
