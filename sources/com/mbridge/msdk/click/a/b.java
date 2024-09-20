package com.mbridge.msdk.click.a;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashSet;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static int f18075a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static int f18076b = 1;

    /* renamed from: c, reason: collision with root package name */
    private String f18077c;

    /* renamed from: d, reason: collision with root package name */
    private int f18078d;

    /* renamed from: e, reason: collision with root package name */
    private HashSet<String> f18079e = new HashSet<>();

    /* renamed from: f, reason: collision with root package name */
    private long f18080f = System.currentTimeMillis();

    /* renamed from: g, reason: collision with root package name */
    private CampaignEx f18081g;

    /* renamed from: h, reason: collision with root package name */
    private String f18082h;

    /* renamed from: i, reason: collision with root package name */
    private int f18083i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f18084j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f18085k;

    /* renamed from: l, reason: collision with root package name */
    private int f18086l;

    public b(String str, String str2) {
        this.f18077c = str;
        b(str2);
    }

    public final boolean a() {
        return this.f18084j;
    }

    public final boolean b() {
        return this.f18085k;
    }

    public final int c() {
        return this.f18086l;
    }

    public final int d() {
        return this.f18083i;
    }

    public final String e() {
        return this.f18082h;
    }

    public final CampaignEx f() {
        return this.f18081g;
    }

    public final String g() {
        return this.f18077c;
    }

    public final int h() {
        return this.f18078d;
    }

    public final HashSet<String> i() {
        return this.f18079e;
    }

    public final long j() {
        return this.f18080f;
    }

    public final void a(boolean z8) {
        this.f18084j = z8;
    }

    public final void b(boolean z8) {
        this.f18085k = z8;
    }

    public final void a(int i8) {
        this.f18086l = i8;
    }

    public final void b(int i8) {
        this.f18083i = i8;
    }

    public final void a(String str) {
        this.f18082h = str;
    }

    public final void b(String str) {
        this.f18078d++;
        this.f18079e.add(str);
    }

    public final void a(CampaignEx campaignEx) {
        this.f18081g = campaignEx;
    }
}
