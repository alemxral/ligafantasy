package com.mbridge.msdk.c;

import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: f, reason: collision with root package name */
    private String f17993f;

    /* renamed from: g, reason: collision with root package name */
    private String f17994g;

    /* renamed from: h, reason: collision with root package name */
    private int f17995h;

    /* renamed from: a, reason: collision with root package name */
    private int f17988a = 1;

    /* renamed from: b, reason: collision with root package name */
    private int f17989b = 1;

    /* renamed from: c, reason: collision with root package name */
    private int f17990c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f17991d = 30;

    /* renamed from: e, reason: collision with root package name */
    private int f17992e = 0;

    /* renamed from: i, reason: collision with root package name */
    private int f17996i = 0;

    public static d a(String str) {
        Exception e8;
        d dVar;
        try {
            JSONObject jSONObject = new JSONObject(str);
            dVar = new d();
            try {
                dVar.f17993f = jSONObject.optString("h_d", com.mbridge.msdk.foundation.same.net.g.d.f().f19685e);
                dVar.f17994g = jSONObject.optString("t_d", com.mbridge.msdk.foundation.same.net.g.d.f().f19690j);
                dVar.f17995h = jSONObject.optInt("t_p", com.mbridge.msdk.foundation.same.net.g.d.f().f19694n);
                dVar.f17996i = jSONObject.optInt("type", 1);
                dVar.f17991d = jSONObject.optInt("d_t", 30);
                dVar.f17990c = jSONObject.optInt("d_a", 0);
            } catch (Exception e9) {
                e8 = e9;
                e8.printStackTrace();
                return dVar;
            }
        } catch (Exception e10) {
            e8 = e10;
            dVar = null;
        }
        return dVar;
    }

    public final int b() {
        return this.f17991d;
    }

    public final String c() {
        return this.f17993f;
    }

    public final String d() {
        return this.f17994g;
    }

    public final int e() {
        return this.f17995h;
    }

    public final int a() {
        return this.f17990c;
    }
}
