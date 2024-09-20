package J0;

import J0.B;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class g extends B.d.b {

    /* renamed from: a, reason: collision with root package name */
    private final String f4504a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f4505b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends B.d.b.a {

        /* renamed from: a, reason: collision with root package name */
        private String f4506a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f4507b;

        @Override // J0.B.d.b.a
        public B.d.b a() {
            String str = "";
            if (this.f4506a == null) {
                str = " filename";
            }
            if (this.f4507b == null) {
                str = str + " contents";
            }
            if (str.isEmpty()) {
                return new g(this.f4506a, this.f4507b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // J0.B.d.b.a
        public B.d.b.a b(byte[] bArr) {
            if (bArr != null) {
                this.f4507b = bArr;
                return this;
            }
            throw new NullPointerException("Null contents");
        }

        @Override // J0.B.d.b.a
        public B.d.b.a c(String str) {
            if (str != null) {
                this.f4506a = str;
                return this;
            }
            throw new NullPointerException("Null filename");
        }
    }

    @Override // J0.B.d.b
    public byte[] b() {
        return this.f4505b;
    }

    @Override // J0.B.d.b
    public String c() {
        return this.f4504a;
    }

    public boolean equals(Object obj) {
        byte[] b8;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.d.b)) {
            return false;
        }
        B.d.b bVar = (B.d.b) obj;
        if (this.f4504a.equals(bVar.c())) {
            byte[] bArr = this.f4505b;
            if (bVar instanceof g) {
                b8 = ((g) bVar).f4505b;
            } else {
                b8 = bVar.b();
            }
            if (Arrays.equals(bArr, b8)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f4504a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f4505b);
    }

    public String toString() {
        return "File{filename=" + this.f4504a + ", contents=" + Arrays.toString(this.f4505b) + "}";
    }

    private g(String str, byte[] bArr) {
        this.f4504a = str;
        this.f4505b = bArr;
    }
}
