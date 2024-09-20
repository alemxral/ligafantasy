package t7;

import t7.o;

/* loaded from: classes5.dex */
final class i extends o {

    /* renamed from: e, reason: collision with root package name */
    private final int f38277e;

    /* renamed from: f, reason: collision with root package name */
    private final int f38278f;

    /* renamed from: g, reason: collision with root package name */
    private final int f38279g;

    private i(b bVar) {
        super(bVar);
        this.f38277e = bVar.f38280e;
        this.f38278f = bVar.f38281f;
        this.f38279g = bVar.f38282g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // t7.o
    public byte[] d() {
        byte[] d8 = super.d();
        E7.f.d(this.f38277e, d8, 16);
        E7.f.d(this.f38278f, d8, 20);
        E7.f.d(this.f38279g, d8, 24);
        return d8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int e() {
        return this.f38277e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int f() {
        return this.f38278f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int g() {
        return this.f38279g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes5.dex */
    public static class b extends o.a {

        /* renamed from: e, reason: collision with root package name */
        private int f38280e;

        /* renamed from: f, reason: collision with root package name */
        private int f38281f;

        /* renamed from: g, reason: collision with root package name */
        private int f38282g;

        /* JADX INFO: Access modifiers changed from: protected */
        public b() {
            super(1);
            this.f38280e = 0;
            this.f38281f = 0;
            this.f38282g = 0;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public o l() {
            return new i(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public b n(int i8) {
            this.f38280e = i8;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public b o(int i8) {
            this.f38281f = i8;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public b p(int i8) {
            this.f38282g = i8;
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
