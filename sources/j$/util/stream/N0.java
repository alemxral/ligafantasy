package j$.util.stream;

/* loaded from: classes2.dex */
abstract class N0 implements L0 {

    /* renamed from: a, reason: collision with root package name */
    protected final L0 f32346a;

    /* renamed from: b, reason: collision with root package name */
    protected final L0 f32347b;

    /* renamed from: c, reason: collision with root package name */
    private final long f32348c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public N0(L0 l02, L0 l03) {
        this.f32346a = l02;
        this.f32347b = l03;
        this.f32348c = l02.count() + l03.count();
    }

    @Override // j$.util.stream.L0
    public /* bridge */ /* synthetic */ K0 b(int i8) {
        return (K0) b(i8);
    }

    @Override // j$.util.stream.L0
    public final L0 b(int i8) {
        if (i8 == 0) {
            return this.f32346a;
        }
        if (i8 == 1) {
            return this.f32347b;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.L0
    public final long count() {
        return this.f32348c;
    }

    @Override // j$.util.stream.L0
    public final int p() {
        return 2;
    }
}
