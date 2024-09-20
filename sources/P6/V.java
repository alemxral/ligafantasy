package P6;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public static final V f8007a = new V();

    /* renamed from: b, reason: collision with root package name */
    private static final int f8008b = 65536;

    /* renamed from: c, reason: collision with root package name */
    private static final U f8009c = new U(new byte[0], 0, 0, false, false);

    /* renamed from: d, reason: collision with root package name */
    private static final int f8010d;

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicReference[] f8011e;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f8010d = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i8 = 0; i8 < highestOneBit; i8++) {
            atomicReferenceArr[i8] = new AtomicReference();
        }
        f8011e = atomicReferenceArr;
    }

    private V() {
    }

    private final AtomicReference a() {
        return f8011e[(int) (Thread.currentThread().getId() & (f8010d - 1))];
    }

    public static final void b(U segment) {
        int i8;
        AbstractC3159y.i(segment, "segment");
        if (segment.f8005f == null && segment.f8006g == null) {
            if (segment.f8003d) {
                return;
            }
            AtomicReference a8 = f8007a.a();
            U u8 = f8009c;
            U u9 = (U) a8.getAndSet(u8);
            if (u9 == u8) {
                return;
            }
            if (u9 != null) {
                i8 = u9.f8002c;
            } else {
                i8 = 0;
            }
            if (i8 >= f8008b) {
                a8.set(u9);
                return;
            }
            segment.f8005f = u9;
            segment.f8001b = 0;
            segment.f8002c = i8 + 8192;
            a8.set(segment);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static final U c() {
        AtomicReference a8 = f8007a.a();
        U u8 = f8009c;
        U u9 = (U) a8.getAndSet(u8);
        if (u9 == u8) {
            return new U();
        }
        if (u9 == null) {
            a8.set(null);
            return new U();
        }
        a8.set(u9.f8005f);
        u9.f8005f = null;
        u9.f8002c = 0;
        return u9;
    }
}
