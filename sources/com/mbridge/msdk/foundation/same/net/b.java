package com.mbridge.msdk.foundation.same.net;

/* loaded from: classes4.dex */
public final class b implements l {

    /* renamed from: a, reason: collision with root package name */
    private final int f19580a;

    /* renamed from: b, reason: collision with root package name */
    private int f19581b;

    /* renamed from: c, reason: collision with root package name */
    private int f19582c;

    /* renamed from: d, reason: collision with root package name */
    private int f19583d;

    /* renamed from: e, reason: collision with root package name */
    private int f19584e;

    /* renamed from: f, reason: collision with root package name */
    private int f19585f;

    /* renamed from: g, reason: collision with root package name */
    private int f19586g;

    /* renamed from: h, reason: collision with root package name */
    private int f19587h;

    public b() {
        this(30000, 0);
    }

    @Override // com.mbridge.msdk.foundation.same.net.l
    public final int a() {
        return this.f19584e;
    }

    @Override // com.mbridge.msdk.foundation.same.net.l
    public final int b() {
        return this.f19580a;
    }

    @Override // com.mbridge.msdk.foundation.same.net.l
    public final int c() {
        return this.f19582c;
    }

    @Override // com.mbridge.msdk.foundation.same.net.l
    public final int d() {
        return this.f19585f;
    }

    @Override // com.mbridge.msdk.foundation.same.net.l
    public final int e() {
        return this.f19586g;
    }

    @Override // com.mbridge.msdk.foundation.same.net.l
    public final int f() {
        return this.f19581b;
    }

    private b(int i8, int i9) {
        this.f19581b = 0;
        this.f19582c = 0;
        this.f19585f = 0;
        this.f19586g = 0;
        this.f19587h = 2;
        this.f19584e = i8 <= 0 ? 30000 : i8;
        this.f19580a = i9;
    }

    @Override // com.mbridge.msdk.foundation.same.net.l
    public final boolean a(com.mbridge.msdk.foundation.same.net.b.a aVar) {
        int i8 = this.f19583d + 1;
        this.f19583d = i8;
        return i8 <= this.f19580a;
    }

    public b(int i8, int i9, int i10, int i11, int i12, int i13) {
        this.f19581b = 0;
        this.f19582c = 0;
        this.f19585f = 0;
        this.f19586g = 0;
        this.f19587h = 2;
        this.f19582c = Math.max(i8, 0);
        this.f19585f = Math.max(i9, 0);
        this.f19586g = Math.max(i10, 0);
        this.f19581b = Math.max(i11, 0);
        this.f19580a = Math.max(i12, 0);
        this.f19587h = i13;
    }

    public b(int i8, int i9, int i10, int i11, int i12) {
        this.f19581b = 0;
        this.f19582c = 0;
        this.f19585f = 0;
        this.f19586g = 0;
        this.f19587h = 2;
        this.f19582c = Math.max(i8, 0);
        this.f19585f = Math.max(i9, 0);
        this.f19586g = Math.max(i10, 0);
        this.f19581b = Math.max(i11, 0);
        this.f19580a = Math.max(i12, 0);
    }
}
