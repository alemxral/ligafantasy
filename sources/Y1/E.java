package Y1;

/* loaded from: classes4.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f12787a;

    /* renamed from: b, reason: collision with root package name */
    private final int f12788b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public E(byte[] bArr, int i8) {
        this.f12787a = bArr;
        this.f12788b = i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(E e8, C1515d c1515d) {
        if (e8 == null) {
            c1515d.g(0);
            return;
        }
        byte[] bArr = e8.f12787a;
        int i8 = e8.f12788b;
        c1515d.h(bArr, i8, (bArr[i8] * 2) + 1);
    }

    public int a() {
        return this.f12787a[this.f12788b];
    }

    public int b(int i8) {
        return this.f12787a[this.f12788b + (i8 * 2) + 1];
    }

    public int c(int i8) {
        return this.f12787a[this.f12788b + (i8 * 2) + 2];
    }

    public String toString() {
        int a8 = a();
        StringBuilder sb = new StringBuilder(a8 * 2);
        for (int i8 = 0; i8 < a8; i8++) {
            int b8 = b(i8);
            if (b8 != 0) {
                if (b8 != 1) {
                    if (b8 != 2) {
                        if (b8 == 3) {
                            sb.append(c(i8));
                            sb.append(';');
                        } else {
                            throw new AssertionError();
                        }
                    } else {
                        sb.append('*');
                    }
                } else {
                    sb.append('.');
                }
            } else {
                sb.append('[');
            }
        }
        return sb.toString();
    }
}
