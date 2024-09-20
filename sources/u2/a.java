package U2;

import R5.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f11057a = new a("InputtingPrimaryField", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final a f11058b = new a("VerifyingEmail", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final a f11059c = new a("InputtingRemainingFields", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ a[] f11060d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ R5.a f11061e;

    static {
        a[] a8 = a();
        f11060d = a8;
        f11061e = b.a(a8);
    }

    private a(String str, int i8) {
    }

    private static final /* synthetic */ a[] a() {
        return new a[]{f11057a, f11058b, f11059c};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f11060d.clone();
    }
}
