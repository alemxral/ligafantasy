package d6;

import M5.O;
import kotlin.jvm.internal.AbstractC3151p;

/* loaded from: classes5.dex */
public abstract class j implements Iterable, Y5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f30187d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final long f30188a;

    /* renamed from: b, reason: collision with root package name */
    private final long f30189b;

    /* renamed from: c, reason: collision with root package name */
    private final long f30190c;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public j(long j8, long j9, long j10) {
        if (j10 != 0) {
            if (j10 != Long.MIN_VALUE) {
                this.f30188a = j8;
                this.f30189b = S5.c.d(j8, j9, j10);
                this.f30190c = j10;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    public final long g() {
        return this.f30188a;
    }

    public final long h() {
        return this.f30189b;
    }

    @Override // java.lang.Iterable
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public O iterator() {
        return new k(this.f30188a, this.f30189b, this.f30190c);
    }
}
