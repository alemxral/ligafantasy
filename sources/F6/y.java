package F6;

import P6.InterfaceC1280f;

/* loaded from: classes5.dex */
public abstract class y {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public final class a extends y {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f3026a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ byte[] f3027b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f3028c;

        a(t tVar, int i8, byte[] bArr, int i9) {
            this.f3026a = i8;
            this.f3027b = bArr;
            this.f3028c = i9;
        }

        @Override // F6.y
        public long a() {
            return this.f3026a;
        }

        @Override // F6.y
        public t b() {
            return null;
        }

        @Override // F6.y
        public void e(InterfaceC1280f interfaceC1280f) {
            interfaceC1280f.write(this.f3027b, this.f3028c, this.f3026a);
        }
    }

    public static y c(t tVar, byte[] bArr) {
        return d(tVar, bArr, 0, bArr.length);
    }

    public static y d(t tVar, byte[] bArr, int i8, int i9) {
        if (bArr != null) {
            G6.c.c(bArr.length, i8, i9);
            return new a(tVar, i9, bArr, i8);
        }
        throw new NullPointerException("content == null");
    }

    public abstract long a();

    public abstract t b();

    public abstract void e(InterfaceC1280f interfaceC1280f);
}
