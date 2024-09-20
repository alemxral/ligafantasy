package z6;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3159y;
import v6.k;

/* renamed from: z6.D, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4033D {

    /* renamed from: a, reason: collision with root package name */
    private Object[] f40462a = new Object[8];

    /* renamed from: b, reason: collision with root package name */
    private int[] f40463b;

    /* renamed from: c, reason: collision with root package name */
    private int f40464c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z6.D$a */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f40465a = new a();

        private a() {
        }
    }

    public C4033D() {
        int[] iArr = new int[8];
        for (int i8 = 0; i8 < 8; i8++) {
            iArr[i8] = -1;
        }
        this.f40463b = iArr;
        this.f40464c = -1;
    }

    private final void e() {
        int i8 = this.f40464c * 2;
        Object[] copyOf = Arrays.copyOf(this.f40462a, i8);
        AbstractC3159y.h(copyOf, "copyOf(...)");
        this.f40462a = copyOf;
        int[] copyOf2 = Arrays.copyOf(this.f40463b, i8);
        AbstractC3159y.h(copyOf2, "copyOf(...)");
        this.f40463b = copyOf2;
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        sb.append("$");
        int i8 = this.f40464c + 1;
        for (int i9 = 0; i9 < i8; i9++) {
            Object obj = this.f40462a[i9];
            if (obj instanceof v6.f) {
                v6.f fVar = (v6.f) obj;
                if (AbstractC3159y.d(fVar.getKind(), k.b.f38908a)) {
                    if (this.f40463b[i9] != -1) {
                        sb.append("[");
                        sb.append(this.f40463b[i9]);
                        sb.append("]");
                    }
                } else {
                    int i10 = this.f40463b[i9];
                    if (i10 >= 0) {
                        sb.append(".");
                        sb.append(fVar.f(i10));
                    }
                }
            } else if (obj != a.f40465a) {
                sb.append("[");
                sb.append("'");
                sb.append(obj);
                sb.append("'");
                sb.append("]");
            }
        }
        String sb2 = sb.toString();
        AbstractC3159y.h(sb2, "toString(...)");
        return sb2;
    }

    public final void b() {
        int i8 = this.f40464c;
        int[] iArr = this.f40463b;
        if (iArr[i8] == -2) {
            iArr[i8] = -1;
            this.f40464c = i8 - 1;
        }
        int i9 = this.f40464c;
        if (i9 != -1) {
            this.f40464c = i9 - 1;
        }
    }

    public final void c(v6.f sd) {
        AbstractC3159y.i(sd, "sd");
        int i8 = this.f40464c + 1;
        this.f40464c = i8;
        if (i8 == this.f40462a.length) {
            e();
        }
        this.f40462a[i8] = sd;
    }

    public final void d() {
        int[] iArr = this.f40463b;
        int i8 = this.f40464c;
        if (iArr[i8] == -2) {
            this.f40462a[i8] = a.f40465a;
        }
    }

    public final void f(Object obj) {
        int[] iArr = this.f40463b;
        int i8 = this.f40464c;
        if (iArr[i8] != -2) {
            int i9 = i8 + 1;
            this.f40464c = i9;
            if (i9 == this.f40462a.length) {
                e();
            }
        }
        Object[] objArr = this.f40462a;
        int i10 = this.f40464c;
        objArr[i10] = obj;
        this.f40463b[i10] = -2;
    }

    public final void g(int i8) {
        this.f40463b[this.f40464c] = i8;
    }

    public String toString() {
        return a();
    }
}
