package K1;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final m f5762a;

    /* renamed from: b, reason: collision with root package name */
    private final Z1.c f5763b;

    /* renamed from: c, reason: collision with root package name */
    private final Z1.c f5764c;

    /* renamed from: d, reason: collision with root package name */
    private final Z1.c f5765d;

    /* renamed from: e, reason: collision with root package name */
    private final Z1.c f5766e;

    public j(m mVar, Z1.c cVar, Z1.c cVar2, Z1.c cVar3, Z1.c cVar4) {
        this.f5762a = mVar;
        this.f5763b = cVar;
        this.f5764c = cVar2;
        if (cVar3 != null) {
            this.f5765d = cVar3;
            this.f5766e = cVar4;
            return;
        }
        throw new IllegalArgumentException("The cipher text must not be null");
    }

    public Z1.c a() {
        return this.f5766e;
    }

    public Z1.c b() {
        return this.f5765d;
    }

    public Z1.c c() {
        return this.f5763b;
    }

    public m d() {
        return this.f5762a;
    }

    public Z1.c e() {
        return this.f5764c;
    }
}
