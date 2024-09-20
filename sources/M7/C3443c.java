package m7;

/* renamed from: m7.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3443c extends AbstractC3441a {

    /* renamed from: c, reason: collision with root package name */
    private int f35949c;

    /* renamed from: d, reason: collision with root package name */
    private int f35950d;

    /* renamed from: e, reason: collision with root package name */
    private D7.a f35951e;

    public C3443c(int i8, int i9, D7.a aVar, String str) {
        super(false, str);
        this.f35949c = i8;
        this.f35950d = i9;
        this.f35951e = new D7.a(aVar);
    }

    public D7.a b() {
        return this.f35951e;
    }

    public int c() {
        return this.f35949c;
    }

    public int d() {
        return this.f35950d;
    }
}
