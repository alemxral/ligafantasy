package V0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class i implements S0.g {

    /* renamed from: a, reason: collision with root package name */
    private boolean f11835a = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f11836b = false;

    /* renamed from: c, reason: collision with root package name */
    private S0.c f11837c;

    /* renamed from: d, reason: collision with root package name */
    private final f f11838d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(f fVar) {
        this.f11838d = fVar;
    }

    private void a() {
        if (!this.f11835a) {
            this.f11835a = true;
            return;
        }
        throw new S0.b("Cannot encode a second value in the ValueEncoderContext");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(S0.c cVar, boolean z8) {
        this.f11835a = false;
        this.f11837c = cVar;
        this.f11836b = z8;
    }

    @Override // S0.g
    public S0.g f(String str) {
        a();
        this.f11838d.i(this.f11837c, str, this.f11836b);
        return this;
    }

    @Override // S0.g
    public S0.g g(boolean z8) {
        a();
        this.f11838d.o(this.f11837c, z8, this.f11836b);
        return this;
    }
}
