package L5;

import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: L5.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1225i implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    public static final a f6483e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final C1225i f6484f = C1226j.a();

    /* renamed from: a, reason: collision with root package name */
    private final int f6485a;

    /* renamed from: b, reason: collision with root package name */
    private final int f6486b;

    /* renamed from: c, reason: collision with root package name */
    private final int f6487c;

    /* renamed from: d, reason: collision with root package name */
    private final int f6488d;

    /* renamed from: L5.i$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public C1225i(int i8, int i9, int i10) {
        this.f6485a = i8;
        this.f6486b = i9;
        this.f6487c = i10;
        this.f6488d = b(i8, i9, i10);
    }

    private final int b(int i8, int i9, int i10) {
        if (new d6.i(0, 255).p(i8) && new d6.i(0, 255).p(i9) && new d6.i(0, 255).p(i10)) {
            return (i8 << 16) + (i9 << 8) + i10;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i8 + '.' + i9 + '.' + i10).toString());
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C1225i other) {
        AbstractC3159y.i(other, "other");
        return this.f6488d - other.f6488d;
    }

    public boolean equals(Object obj) {
        C1225i c1225i;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1225i) {
            c1225i = (C1225i) obj;
        } else {
            c1225i = null;
        }
        if (c1225i != null && this.f6488d == c1225i.f6488d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f6488d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6485a);
        sb.append('.');
        sb.append(this.f6486b);
        sb.append('.');
        sb.append(this.f6487c);
        return sb.toString();
    }
}
