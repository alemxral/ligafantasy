package b3;

import androidx.core.os.EnvironmentCompat;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class z {

    /* renamed from: b, reason: collision with root package name */
    public static final z f14588b = new z("AMOUNTS", 0, "amounts");

    /* renamed from: c, reason: collision with root package name */
    public static final z f14589c = new z("DESCRIPTOR_CODE", 1, "descriptor_code");

    /* renamed from: d, reason: collision with root package name */
    public static final z f14590d = new z("UNKNOWN", 2, EnvironmentCompat.MEDIA_UNKNOWN);

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ z[] f14591e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ R5.a f14592f;

    /* renamed from: a, reason: collision with root package name */
    private final String f14593a;

    static {
        z[] a8 = a();
        f14591e = a8;
        f14592f = R5.b.a(a8);
    }

    private z(String str, int i8, String str2) {
        this.f14593a = str2;
    }

    private static final /* synthetic */ z[] a() {
        return new z[]{f14588b, f14589c, f14590d};
    }

    public static R5.a b() {
        return f14592f;
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) f14591e.clone();
    }

    public final String c() {
        return this.f14593a;
    }
}
