package h6;

/* renamed from: h6.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2759b {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f31400a = false;

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal[] f31401b;

    static {
        ThreadLocal[] threadLocalArr = new ThreadLocal[4];
        for (int i8 = 0; i8 < 4; i8++) {
            threadLocalArr[i8] = new ThreadLocal();
        }
        f31401b = threadLocalArr;
    }

    public static final boolean a() {
        return f31400a;
    }
}
