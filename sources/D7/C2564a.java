package d7;

/* renamed from: d7.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C2564a implements Y6.b {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f30197a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f30198b;

    /* renamed from: c, reason: collision with root package name */
    private C2566c f30199c;

    /* renamed from: d, reason: collision with root package name */
    private int f30200d;

    public C2564a(C2566c c2566c, int i8, byte[] bArr, byte[] bArr2) {
        this.f30199c = c2566c;
        this.f30198b = E7.a.d(bArr);
        this.f30200d = i8;
        this.f30197a = E7.a.d(bArr2);
    }

    public byte[] a() {
        return E7.a.d(this.f30197a);
    }

    public C2566c b() {
        return this.f30199c;
    }

    public int c() {
        return this.f30200d;
    }

    public byte[] d() {
        return E7.a.d(this.f30198b);
    }
}
