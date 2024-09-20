package com.mbridge.msdk.c;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    private String f17864e;

    /* renamed from: f, reason: collision with root package name */
    private String f17865f;

    /* renamed from: g, reason: collision with root package name */
    private int f17866g;

    /* renamed from: a, reason: collision with root package name */
    private int f17860a = 1;

    /* renamed from: b, reason: collision with root package name */
    private int f17861b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f17862c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f17863d = 0;

    /* renamed from: h, reason: collision with root package name */
    private int f17867h = 0;

    public static a a(String str) {
        Exception e8;
        a aVar;
        try {
            JSONObject jSONObject = new JSONObject(str);
            aVar = new a();
            try {
                aVar.f17864e = jSONObject.optString("http_domain", com.mbridge.msdk.foundation.same.net.g.d.f().f19687g);
                aVar.f17865f = jSONObject.optString("tcp_domain", com.mbridge.msdk.foundation.same.net.g.d.f().f19691k);
                aVar.f17866g = jSONObject.optInt("tcp_port", com.mbridge.msdk.foundation.same.net.g.d.f().f19695o);
                aVar.f17867h = jSONObject.optInt("type", 0);
                int i8 = 1;
                int optInt = jSONObject.optInt("batch_size", 1);
                if (optInt >= 1) {
                    i8 = optInt;
                }
                aVar.f17860a = i8;
                aVar.f17862c = jSONObject.optInt(TypedValues.TransitionType.S_DURATION, 0);
                aVar.f17861b = jSONObject.optInt("disable", 0);
                aVar.f17863d = jSONObject.optInt("e_t_l", 0);
            } catch (Exception e9) {
                e8 = e9;
                e8.printStackTrace();
                return aVar;
            }
        } catch (Exception e10) {
            e8 = e10;
            aVar = null;
        }
        return aVar;
    }

    public final int b() {
        return this.f17861b;
    }

    public final int c() {
        return this.f17862c;
    }

    public final int d() {
        return this.f17863d;
    }

    public final String e() {
        return this.f17864e;
    }

    public final String f() {
        return this.f17865f;
    }

    public final int g() {
        return this.f17866g;
    }

    public final int h() {
        return this.f17867h;
    }

    public final int a() {
        return this.f17860a;
    }
}
