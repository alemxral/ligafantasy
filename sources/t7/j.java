package t7;

import t7.o;

/* loaded from: classes5.dex */
final class j extends o {

    /* renamed from: e, reason: collision with root package name */
    private final int f38283e;

    /* renamed from: f, reason: collision with root package name */
    private final int f38284f;

    /* renamed from: g, reason: collision with root package name */
    private final int f38285g;

    private j(b bVar) {
        super(bVar);
        this.f38283e = bVar.f38286e;
        this.f38284f = bVar.f38287f;
        this.f38285g = bVar.f38288g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // t7.o
    public byte[] d() {
        byte[] d8 = super.d();
        E7.f.d(this.f38283e, d8, 16);
        E7.f.d(this.f38284f, d8, 20);
        E7.f.d(this.f38285g, d8, 24);
        return d8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int e() {
        return this.f38284f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int f() {
        return this.f38285g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int g() {
        return this.f38283e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes5.dex */
    public static class b extends o.a {

        /* renamed from: e, reason: collision with root package name */
        private int f38286e;

        /* renamed from: f, reason: collision with root package name */
        private int f38287f;

        /* renamed from: g, reason: collision with root package name */
        private int f38288g;

        /* JADX INFO: Access modifiers changed from: protected */
        public b() {
            super(0);
            this.f38286e = 0;
            this.f38287f = 0;
            this.f38288g = 0;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public o l() {
            return new j(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public b n(int i8) {
            this.f38287f = i8;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public b o(int i8) {
            this.f38288g = i8;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public b p(int i8) {
            this.f38286e = i8;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // t7.o.a
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public b e() {
            return this;
        }
    }
}
