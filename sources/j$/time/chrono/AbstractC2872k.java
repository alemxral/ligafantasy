package j$.time.chrono;

/* renamed from: j$.time.chrono.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract /* synthetic */ class AbstractC2872k {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f31872a;

    static {
        int[] iArr = new int[j$.time.temporal.a.values().length];
        f31872a = iArr;
        try {
            iArr[j$.time.temporal.a.INSTANT_SECONDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f31872a[j$.time.temporal.a.OFFSET_SECONDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
