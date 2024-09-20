package t7;

/* loaded from: classes5.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    private final int f38304a;

    /* renamed from: b, reason: collision with root package name */
    private final long f38305b;

    /* renamed from: c, reason: collision with root package name */
    private final int f38306c;

    /* renamed from: d, reason: collision with root package name */
    private final int f38307d;

    /* loaded from: classes5.dex */
    protected static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f38308a;

        /* renamed from: b, reason: collision with root package name */
        private int f38309b = 0;

        /* renamed from: c, reason: collision with root package name */
        private long f38310c = 0;

        /* renamed from: d, reason: collision with root package name */
        private int f38311d = 0;

        /* JADX INFO: Access modifiers changed from: protected */
        public a(int i8) {
            this.f38308a = i8;
        }

        protected abstract a e();

        /* JADX INFO: Access modifiers changed from: protected */
        public a f(int i8) {
            this.f38311d = i8;
            return e();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public a g(int i8) {
            this.f38309b = i8;
            return e();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public a h(long j8) {
            this.f38310c = j8;
            return e();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public o(a aVar) {
        this.f38304a = aVar.f38309b;
        this.f38305b = aVar.f38310c;
        this.f38306c = aVar.f38308a;
        this.f38307d = aVar.f38311d;
    }

    public final int a() {
        return this.f38307d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int b() {
        return this.f38304a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long c() {
        return this.f38305b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public byte[] d() {
        byte[] bArr = new byte[32];
        E7.f.d(this.f38304a, bArr, 0);
        E7.f.i(this.f38305b, bArr, 4);
        E7.f.d(this.f38306c, bArr, 12);
        E7.f.d(this.f38307d, bArr, 28);
        return bArr;
    }
}
