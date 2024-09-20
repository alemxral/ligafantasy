package com.mbridge.msdk.foundation.c;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.out.MBridgeIds;
import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class b implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private int f19022a;

    /* renamed from: b, reason: collision with root package name */
    private int f19023b;

    /* renamed from: c, reason: collision with root package name */
    private String f19024c;

    /* renamed from: d, reason: collision with root package name */
    private Throwable f19025d;

    /* renamed from: e, reason: collision with root package name */
    private CampaignEx f19026e;

    /* renamed from: f, reason: collision with root package name */
    private MBridgeIds f19027f;

    /* renamed from: g, reason: collision with root package name */
    private String f19028g;

    /* renamed from: h, reason: collision with root package name */
    private String f19029h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f19030i;

    /* renamed from: j, reason: collision with root package name */
    private int f19031j = -1;

    /* renamed from: k, reason: collision with root package name */
    private String f19032k;

    /* renamed from: l, reason: collision with root package name */
    private HashMap<Object, Object> f19033l;

    /* renamed from: m, reason: collision with root package name */
    private int f19034m;

    /* renamed from: n, reason: collision with root package name */
    private String f19035n;

    /* renamed from: o, reason: collision with root package name */
    private String f19036o;

    /* renamed from: p, reason: collision with root package name */
    private String f19037p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f19038q;

    public b(int i8) {
        this.f19022a = i8;
        this.f19023b = a.b(i8);
    }

    public final int a() {
        return this.f19022a;
    }

    public final String b() {
        String str;
        int i8;
        if (!TextUtils.isEmpty(this.f19024c)) {
            str = this.f19024c;
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str) && (i8 = this.f19022a) != -1) {
            str = a.a(i8);
        }
        Throwable th = this.f19025d;
        if (th == null) {
            return str;
        }
        String message = th.getMessage();
        if (TextUtils.isEmpty(message)) {
            return str;
        }
        return str + " # " + message;
    }

    public final CampaignEx c() {
        return this.f19026e;
    }

    public final MBridgeIds d() {
        if (this.f19027f == null) {
            this.f19027f = new MBridgeIds();
        }
        return this.f19027f;
    }

    public final boolean e() {
        return this.f19030i;
    }

    public final int f() {
        return this.f19023b;
    }

    public final int g() {
        return this.f19031j;
    }

    public final String h() {
        return this.f19032k;
    }

    public final int i() {
        return this.f19034m;
    }

    public final String j() {
        return this.f19035n;
    }

    public final String k() {
        return this.f19036o;
    }

    public final String l() {
        return this.f19037p;
    }

    public final boolean m() {
        return this.f19038q;
    }

    public final String toString() {
        return "MBFailureReason{errorCode=" + this.f19022a + ", errorSubType=" + this.f19023b + ", message='" + this.f19024c + "', cause=" + this.f19025d + ", campaign=" + this.f19026e + ", ids=" + this.f19027f + ", requestId='" + this.f19028g + "', localRequestId='" + this.f19029h + "', isHeaderBidding=" + this.f19030i + ", typeD=" + this.f19031j + ", reasonD='" + this.f19032k + "', extraMap=" + this.f19033l + ", serverErrorCode=" + this.f19034m + ", errorUrl='" + this.f19035n + "', serverErrorResponse='" + this.f19036o + "'}";
    }

    public final void a(String str) {
        this.f19024c = str;
    }

    public final void c(String str) {
        this.f19035n = str;
    }

    public final void e(String str) {
        this.f19037p = str;
    }

    public final void a(Throwable th) {
        this.f19025d = th;
    }

    public final void a(CampaignEx campaignEx) {
        this.f19026e = campaignEx;
    }

    public final void d(String str) {
        this.f19036o = str;
    }

    public b(int i8, String str) {
        this.f19022a = i8;
        if (!TextUtils.isEmpty(str)) {
            a("his_reason", str);
        }
        this.f19024c = str;
        this.f19023b = a.b(i8);
    }

    public final void a(MBridgeIds mBridgeIds) {
        this.f19027f = mBridgeIds;
    }

    public final void a(boolean z8) {
        this.f19030i = z8;
    }

    public final void a(int i8) {
        this.f19023b = i8;
    }

    public final void a(Object obj, Object obj2) {
        if (this.f19033l == null) {
            this.f19033l = new HashMap<>();
        }
        this.f19033l.put(obj, obj2);
    }

    public final Object a(Object obj) {
        HashMap<Object, Object> hashMap = this.f19033l;
        if (hashMap != null && hashMap.containsKey(obj)) {
            return this.f19033l.get(obj);
        }
        return null;
    }

    public final void b(int i8) {
        this.f19031j = i8;
    }

    public b(int i8, int i9, String str) {
        if (!TextUtils.isEmpty(str)) {
            a("his_reason", str);
            this.f19024c = str;
        } else {
            this.f19024c = a.a(i9);
        }
        this.f19034m = i8;
        this.f19023b = a.b(i9);
    }

    public final void b(String str) {
        this.f19032k = str;
    }

    public final void b(boolean z8) {
        this.f19038q = z8;
    }
}
