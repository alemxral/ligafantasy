package com.mbridge.msdk.e;

import java.io.Serializable;

/* loaded from: classes4.dex */
public final class i implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    static String f18872a = "CREATE TABLE IF NOT EXISTS %s (id INTEGER PRIMARY KEY,uuid TEXT,name TEXT,type INTEGER,time_stamp INTEGER,duration INTEGER,properties TEXT,priority INTEGER,state INTEGER,invalid_time INTEGER,ignore_max_timeout INTEGER,ignore_max_retry_times INTEGER,report_count INTEGER)";

    /* renamed from: b, reason: collision with root package name */
    static String f18873b = "DROP TABLE IF EXISTS %s";

    /* renamed from: c, reason: collision with root package name */
    private final e f18874c;

    /* renamed from: d, reason: collision with root package name */
    private int f18875d;

    /* renamed from: e, reason: collision with root package name */
    private int f18876e;

    /* renamed from: f, reason: collision with root package name */
    private final String f18877f;

    /* renamed from: g, reason: collision with root package name */
    private long f18878g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f18879h = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean f18880i = false;

    public i(e eVar) {
        this.f18874c = eVar;
        this.f18877f = eVar.e();
    }

    public final void a(boolean z8) {
        this.f18879h = z8;
    }

    public final void b(boolean z8) {
        this.f18880i = z8;
    }

    public final e c() {
        return this.f18874c;
    }

    public final int d() {
        return this.f18875d;
    }

    public final int e() {
        return this.f18876e;
    }

    public final String f() {
        return this.f18877f;
    }

    public final long g() {
        return this.f18878g;
    }

    public final boolean a() {
        return this.f18879h;
    }

    public final boolean b() {
        return this.f18880i;
    }

    public final void a(int i8) {
        this.f18875d = i8;
    }

    public final void b(int i8) {
        this.f18876e = i8;
    }

    public final void a(long j8) {
        this.f18878g = j8;
    }
}
