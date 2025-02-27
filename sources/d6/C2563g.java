package d6;

import M5.N;
import kotlin.jvm.internal.AbstractC3151p;

/* renamed from: d6.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C2563g implements Iterable, Y5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f30177d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f30178a;

    /* renamed from: b, reason: collision with root package name */
    private final int f30179b;

    /* renamed from: c, reason: collision with root package name */
    private final int f30180c;

    /* renamed from: d6.g$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final C2563g a(int i8, int i9, int i10) {
            return new C2563g(i8, i9, i10);
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public C2563g(int i8, int i9, int i10) {
        if (i10 != 0) {
            if (i10 != Integer.MIN_VALUE) {
                this.f30178a = i8;
                this.f30179b = S5.c.c(i8, i9, i10);
                this.f30180c = i10;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2563g) {
            if (!isEmpty() || !((C2563g) obj).isEmpty()) {
                C2563g c2563g = (C2563g) obj;
                if (this.f30178a != c2563g.f30178a || this.f30179b != c2563g.f30179b || this.f30180c != c2563g.f30180c) {
                }
            }
            return true;
        }
        return false;
    }

    public final int g() {
        return this.f30178a;
    }

    public final int h() {
        return this.f30179b;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f30178a * 31) + this.f30179b) * 31) + this.f30180c;
    }

    public final int i() {
        return this.f30180c;
    }

    public boolean isEmpty() {
        if (this.f30180c > 0) {
            if (this.f30178a <= this.f30179b) {
                return false;
            }
        } else if (this.f30178a >= this.f30179b) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public N iterator() {
        return new h(this.f30178a, this.f30179b, this.f30180c);
    }

    public String toString() {
        StringBuilder sb;
        int i8;
        if (this.f30180c > 0) {
            sb = new StringBuilder();
            sb.append(this.f30178a);
            sb.append("..");
            sb.append(this.f30179b);
            sb.append(" step ");
            i8 = this.f30180c;
        } else {
            sb = new StringBuilder();
            sb.append(this.f30178a);
            sb.append(" downTo ");
            sb.append(this.f30179b);
            sb.append(" step ");
            i8 = -this.f30180c;
        }
        sb.append(i8);
        return sb.toString();
    }
}
