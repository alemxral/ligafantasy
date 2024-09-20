package x6;

import M5.AbstractC1239l;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: x6.v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3961v {

    /* renamed from: e, reason: collision with root package name */
    private static final a f39599e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final long[] f39600f = new long[0];

    /* renamed from: a, reason: collision with root package name */
    private final v6.f f39601a;

    /* renamed from: b, reason: collision with root package name */
    private final X5.n f39602b;

    /* renamed from: c, reason: collision with root package name */
    private long f39603c;

    /* renamed from: d, reason: collision with root package name */
    private final long[] f39604d;

    /* renamed from: x6.v$a */
    /* loaded from: classes5.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public C3961v(v6.f descriptor, X5.n readIfAbsent) {
        AbstractC3159y.i(descriptor, "descriptor");
        AbstractC3159y.i(readIfAbsent, "readIfAbsent");
        this.f39601a = descriptor;
        this.f39602b = readIfAbsent;
        int e8 = descriptor.e();
        if (e8 <= 64) {
            this.f39603c = e8 != 64 ? (-1) << e8 : 0L;
            this.f39604d = f39600f;
        } else {
            this.f39603c = 0L;
            this.f39604d = e(e8);
        }
    }

    private final void b(int i8) {
        int i9 = (i8 >>> 6) - 1;
        long[] jArr = this.f39604d;
        jArr[i9] = jArr[i9] | (1 << (i8 & 63));
    }

    private final int c() {
        int length = this.f39604d.length;
        int i8 = 0;
        while (i8 < length) {
            int i9 = i8 + 1;
            int i10 = i9 * 64;
            long j8 = this.f39604d[i8];
            while (j8 != -1) {
                int numberOfTrailingZeros = Long.numberOfTrailingZeros(~j8);
                j8 |= 1 << numberOfTrailingZeros;
                int i11 = numberOfTrailingZeros + i10;
                if (((Boolean) this.f39602b.invoke(this.f39601a, Integer.valueOf(i11))).booleanValue()) {
                    this.f39604d[i8] = j8;
                    return i11;
                }
            }
            this.f39604d[i8] = j8;
            i8 = i9;
        }
        return -1;
    }

    private final long[] e(int i8) {
        long[] jArr = new long[(i8 - 1) >>> 6];
        if ((i8 & 63) != 0) {
            jArr[AbstractC1239l.h0(jArr)] = (-1) << i8;
        }
        return jArr;
    }

    public final void a(int i8) {
        if (i8 < 64) {
            this.f39603c |= 1 << i8;
        } else {
            b(i8);
        }
    }

    public final int d() {
        int numberOfTrailingZeros;
        int e8 = this.f39601a.e();
        do {
            long j8 = this.f39603c;
            if (j8 != -1) {
                numberOfTrailingZeros = Long.numberOfTrailingZeros(~j8);
                this.f39603c |= 1 << numberOfTrailingZeros;
            } else {
                if (e8 > 64) {
                    return c();
                }
                return -1;
            }
        } while (!((Boolean) this.f39602b.invoke(this.f39601a, Integer.valueOf(numberOfTrailingZeros))).booleanValue());
        return numberOfTrailingZeros;
    }
}
