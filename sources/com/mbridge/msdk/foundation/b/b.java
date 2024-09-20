package com.mbridge.msdk.foundation.b;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.x;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f18998a;

    /* renamed from: b, reason: collision with root package name */
    private double f18999b;

    /* renamed from: c, reason: collision with root package name */
    private String f19000c;

    /* renamed from: d, reason: collision with root package name */
    private String f19001d;

    /* renamed from: e, reason: collision with root package name */
    private int f19002e;

    /* renamed from: f, reason: collision with root package name */
    private long f19003f;

    /* renamed from: g, reason: collision with root package name */
    private int f19004g;

    /* renamed from: h, reason: collision with root package name */
    private long f19005h;

    /* renamed from: i, reason: collision with root package name */
    private String f19006i;

    /* renamed from: j, reason: collision with root package name */
    private long f19007j;

    public final long a() {
        return this.f19007j;
    }

    public final CopyOnWriteArrayList<CampaignEx> b() {
        return this.f18998a;
    }

    public final double c() {
        return this.f18999b;
    }

    public final String d() {
        return this.f19000c;
    }

    public final String e() {
        return this.f19001d;
    }

    public final int f() {
        return this.f19002e;
    }

    public final int g() {
        return this.f19004g;
    }

    public final long h() {
        return this.f19005h;
    }

    public final void a(long j8) {
        this.f19007j = j8;
    }

    public final void b(String str) {
        this.f19000c = str;
    }

    public final void c(String str) {
        this.f19001d = str;
    }

    public final void d(String str) {
        this.f19006i = str;
    }

    public final void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        this.f18998a = copyOnWriteArrayList;
    }

    public final void b(int i8) {
        this.f19004g = i8;
    }

    public final void c(long j8) {
        this.f19003f = j8;
    }

    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String a8 = x.a(str);
        if (TextUtils.isEmpty(a8)) {
            return;
        }
        try {
            double parseDouble = Double.parseDouble(a8);
            if (parseDouble <= 0.0d) {
                return;
            }
            this.f18999b = parseDouble;
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void b(long j8) {
        this.f19005h = j8;
    }

    public final void a(int i8) {
        this.f19002e = i8;
    }
}
