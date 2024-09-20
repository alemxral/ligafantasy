package U3;

import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public static final b f11079a = new b();

    /* renamed from: b, reason: collision with root package name */
    private static final String f11080b = "426";

    /* renamed from: c, reason: collision with root package name */
    private static final String f11081c = "dcb428fea25c40e7b99f81ae5981ee6a";

    /* renamed from: d, reason: collision with root package name */
    private static final String f11082d = "deca87e736574c5c83c07314051fd93a";

    /* renamed from: e, reason: collision with root package name */
    private static final String f11083e = "7";

    private b() {
    }

    @Override // U3.d
    public String a() {
        return f11080b;
    }

    @Override // U3.d
    public String b() {
        return f11082d;
    }

    @Override // U3.d
    public String c() {
        long currentTimeMillis = System.currentTimeMillis();
        long seconds = TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis);
        return seconds + "." + (currentTimeMillis - TimeUnit.SECONDS.toMillis(seconds));
    }

    @Override // U3.d
    public String getKey() {
        return f11081c;
    }

    @Override // U3.d
    public String getVersion() {
        return f11083e;
    }
}
