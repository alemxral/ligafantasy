package com.mbridge.msdk.e.a;

/* loaded from: classes4.dex */
public abstract class z extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final m f18845a;

    /* renamed from: b, reason: collision with root package name */
    private long f18846b;

    /* renamed from: c, reason: collision with root package name */
    private int f18847c;

    /* renamed from: d, reason: collision with root package name */
    private String f18848d;

    public z() {
        this.f18847c = 0;
        this.f18848d = "";
        this.f18845a = null;
    }

    public abstract int a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(long j8) {
        this.f18846b = j8;
    }

    public final int b() {
        return this.f18847c;
    }

    public final String c() {
        return this.f18848d;
    }

    public final void a(int i8) {
        this.f18847c = i8;
    }

    public final void a(String str) {
        this.f18848d = str;
    }

    public z(m mVar) {
        this.f18847c = 0;
        this.f18848d = "";
        this.f18845a = mVar;
    }

    public z(String str) {
        super(str);
        this.f18847c = 0;
        this.f18848d = "";
        this.f18845a = null;
    }

    public z(Throwable th) {
        super(th);
        this.f18847c = 0;
        this.f18848d = "";
        this.f18845a = null;
    }
}
