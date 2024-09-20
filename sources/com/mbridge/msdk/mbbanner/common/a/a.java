package com.mbridge.msdk.mbbanner.common.a;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.z;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private String f20280a;

    /* renamed from: b, reason: collision with root package name */
    private String f20281b;

    /* renamed from: c, reason: collision with root package name */
    private String f20282c;

    /* renamed from: d, reason: collision with root package name */
    private String f20283d;

    /* renamed from: e, reason: collision with root package name */
    private String f20284e;

    /* renamed from: f, reason: collision with root package name */
    private String f20285f;

    /* renamed from: g, reason: collision with root package name */
    private String f20286g;

    /* renamed from: h, reason: collision with root package name */
    private int f20287h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f20288i;

    private a() {
    }

    public final a a(boolean z8) {
        this.f20288i = z8;
        return this;
    }

    public final a b(String str) {
        this.f20281b = str;
        return this;
    }

    public final a c(String str) {
        this.f20282c = str;
        return this;
    }

    public final a d(String str) {
        this.f20283d = str;
        return this;
    }

    public final a e(String str) {
        this.f20284e = str;
        return this;
    }

    public final a f(String str) {
        this.f20285f = str;
        return this;
    }

    public final a g(String str) {
        this.f20286g = str;
        return this;
    }

    public static a a() {
        return new a();
    }

    public final String b() {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(this.f20281b)) {
            sb.append("unit_id=");
            sb.append(this.f20281b);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f20282c)) {
            sb.append("cid=");
            sb.append(this.f20282c);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f20283d)) {
            sb.append("rid=");
            sb.append(this.f20283d);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f20284e)) {
            sb.append("rid_n=");
            sb.append(this.f20284e);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f20285f)) {
            sb.append("creative_id=");
            sb.append(this.f20285f);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f20286g)) {
            sb.append("reason=");
            sb.append(this.f20286g);
            sb.append("&");
        }
        if (this.f20287h != 0) {
            sb.append("result=");
            sb.append(this.f20287h);
            sb.append("&");
        }
        if (this.f20288i) {
            sb.append("hb=1");
            sb.append("&");
        }
        sb.append("network_type=");
        sb.append(z.l(com.mbridge.msdk.foundation.controller.c.m().c()));
        sb.append("&");
        if (!TextUtils.isEmpty(this.f20280a)) {
            sb.append("key=");
            sb.append(this.f20280a);
        }
        return sb.toString();
    }

    public final a a(String str) {
        this.f20280a = str;
        return this;
    }

    public final a a(int i8) {
        this.f20287h = i8;
        return this;
    }
}
