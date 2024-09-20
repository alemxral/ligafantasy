package Y1;

/* loaded from: classes4.dex */
abstract class B {

    /* renamed from: a, reason: collision with root package name */
    final int f12753a;

    /* renamed from: b, reason: collision with root package name */
    final int f12754b;

    /* renamed from: c, reason: collision with root package name */
    final String f12755c;

    /* renamed from: d, reason: collision with root package name */
    final String f12756d;

    /* renamed from: e, reason: collision with root package name */
    final String f12757e;

    /* renamed from: f, reason: collision with root package name */
    final long f12758f;

    /* renamed from: g, reason: collision with root package name */
    int f12759g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public B(int i8, int i9, String str, String str2, String str3, long j8) {
        this.f12753a = i8;
        this.f12754b = i9;
        this.f12755c = str;
        this.f12756d = str2;
        this.f12757e = str3;
        this.f12758f = j8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a() {
        if (this.f12759g == 0) {
            this.f12759g = D.c(this.f12757e);
        }
        return this.f12759g;
    }
}
