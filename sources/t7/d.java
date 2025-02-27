package t7;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class d implements w {

    /* renamed from: c, reason: collision with root package name */
    private static final Map f38262c;

    /* renamed from: a, reason: collision with root package name */
    private final int f38263a;

    /* renamed from: b, reason: collision with root package name */
    private final String f38264b;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(b("SHA-256", 32, 16, 67, 20, 2), new d(1, "XMSSMT_SHA2_20/2_256"));
        hashMap.put(b("SHA-256", 32, 16, 67, 20, 4), new d(2, "XMSSMT_SHA2_20/4_256"));
        hashMap.put(b("SHA-256", 32, 16, 67, 40, 2), new d(3, "XMSSMT_SHA2_40/2_256"));
        hashMap.put(b("SHA-256", 32, 16, 67, 40, 2), new d(4, "XMSSMT_SHA2_40/4_256"));
        hashMap.put(b("SHA-256", 32, 16, 67, 40, 4), new d(5, "XMSSMT_SHA2_40/8_256"));
        hashMap.put(b("SHA-256", 32, 16, 67, 60, 8), new d(6, "XMSSMT_SHA2_60/3_256"));
        hashMap.put(b("SHA-256", 32, 16, 67, 60, 6), new d(7, "XMSSMT_SHA2_60/6_256"));
        hashMap.put(b("SHA-256", 32, 16, 67, 60, 12), new d(8, "XMSSMT_SHA2_60/12_256"));
        hashMap.put(b("SHA-512", 64, 16, 131, 20, 2), new d(9, "XMSSMT_SHA2_20/2_512"));
        hashMap.put(b("SHA-512", 64, 16, 131, 20, 4), new d(10, "XMSSMT_SHA2_20/4_512"));
        hashMap.put(b("SHA-512", 64, 16, 131, 40, 2), new d(11, "XMSSMT_SHA2_40/2_512"));
        hashMap.put(b("SHA-512", 64, 16, 131, 40, 4), new d(12, "XMSSMT_SHA2_40/4_512"));
        hashMap.put(b("SHA-512", 64, 16, 131, 40, 8), new d(13, "XMSSMT_SHA2_40/8_512"));
        hashMap.put(b("SHA-512", 64, 16, 131, 60, 3), new d(14, "XMSSMT_SHA2_60/3_512"));
        hashMap.put(b("SHA-512", 64, 16, 131, 60, 6), new d(15, "XMSSMT_SHA2_60/6_512"));
        hashMap.put(b("SHA-512", 64, 16, 131, 60, 12), new d(16, "XMSSMT_SHA2_60/12_512"));
        hashMap.put(b("SHAKE128", 32, 16, 67, 20, 2), new d(17, "XMSSMT_SHAKE_20/2_256"));
        hashMap.put(b("SHAKE128", 32, 16, 67, 20, 4), new d(18, "XMSSMT_SHAKE_20/4_256"));
        hashMap.put(b("SHAKE128", 32, 16, 67, 40, 2), new d(19, "XMSSMT_SHAKE_40/2_256"));
        hashMap.put(b("SHAKE128", 32, 16, 67, 40, 4), new d(20, "XMSSMT_SHAKE_40/4_256"));
        hashMap.put(b("SHAKE128", 32, 16, 67, 40, 8), new d(21, "XMSSMT_SHAKE_40/8_256"));
        hashMap.put(b("SHAKE128", 32, 16, 67, 60, 3), new d(22, "XMSSMT_SHAKE_60/3_256"));
        hashMap.put(b("SHAKE128", 32, 16, 67, 60, 6), new d(23, "XMSSMT_SHAKE_60/6_256"));
        hashMap.put(b("SHAKE128", 32, 16, 67, 60, 12), new d(24, "XMSSMT_SHAKE_60/12_256"));
        hashMap.put(b("SHAKE256", 64, 16, 131, 20, 2), new d(25, "XMSSMT_SHAKE_20/2_512"));
        hashMap.put(b("SHAKE256", 64, 16, 131, 20, 4), new d(26, "XMSSMT_SHAKE_20/4_512"));
        hashMap.put(b("SHAKE256", 64, 16, 131, 40, 2), new d(27, "XMSSMT_SHAKE_40/2_512"));
        hashMap.put(b("SHAKE256", 64, 16, 131, 40, 4), new d(28, "XMSSMT_SHAKE_40/4_512"));
        hashMap.put(b("SHAKE256", 64, 16, 131, 40, 8), new d(29, "XMSSMT_SHAKE_40/8_512"));
        hashMap.put(b("SHAKE256", 64, 16, 131, 60, 3), new d(30, "XMSSMT_SHAKE_60/3_512"));
        hashMap.put(b("SHAKE256", 64, 16, 131, 60, 6), new d(31, "XMSSMT_SHAKE_60/6_512"));
        hashMap.put(b("SHAKE256", 64, 16, 131, 60, 12), new d(32, "XMSSMT_SHAKE_60/12_512"));
        f38262c = DesugarCollections.unmodifiableMap(hashMap);
    }

    private d(int i8, String str) {
        this.f38263a = i8;
        this.f38264b = str;
    }

    private static String b(String str, int i8, int i9, int i10, int i11, int i12) {
        if (str != null) {
            return str + "-" + i8 + "-" + i9 + "-" + i10 + "-" + i11 + "-" + i12;
        }
        throw new NullPointerException("algorithmName == null");
    }

    public static d c(String str, int i8, int i9, int i10, int i11, int i12) {
        if (str != null) {
            return (d) f38262c.get(b(str, i8, i9, i10, i11, i12));
        }
        throw new NullPointerException("algorithmName == null");
    }

    @Override // t7.w
    public int a() {
        return this.f38263a;
    }

    public String toString() {
        return this.f38264b;
    }
}
