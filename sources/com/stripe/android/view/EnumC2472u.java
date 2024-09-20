package com.stripe.android.view;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.stripe.android.view.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC2472u {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC2472u f27955a = new EnumC2472u("None", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC2472u f27956b = new EnumC2472u("PostalCode", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC2472u f27957c = new EnumC2472u("Full", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC2472u[] f27958d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ R5.a f27959e;

    static {
        EnumC2472u[] a8 = a();
        f27958d = a8;
        f27959e = R5.b.a(a8);
    }

    private EnumC2472u(String str, int i8) {
    }

    private static final /* synthetic */ EnumC2472u[] a() {
        return new EnumC2472u[]{f27955a, f27956b, f27957c};
    }

    public static EnumC2472u valueOf(String str) {
        return (EnumC2472u) Enum.valueOf(EnumC2472u.class, str);
    }

    public static EnumC2472u[] values() {
        return (EnumC2472u[]) f27958d.clone();
    }
}
