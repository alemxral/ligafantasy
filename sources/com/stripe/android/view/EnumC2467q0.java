package com.stripe.android.view;

import j2.AbstractC3053E;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.stripe.android.view.q0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC2467q0 {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC2467q0 f27891b = new EnumC2467q0("ShippingInfo", 0, AbstractC3053E.f32831I0);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC2467q0 f27892c = new EnumC2467q0("ShippingMethod", 1, AbstractC3053E.f32835K0);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC2467q0[] f27893d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ R5.a f27894e;

    /* renamed from: a, reason: collision with root package name */
    private final int f27895a;

    static {
        EnumC2467q0[] a8 = a();
        f27893d = a8;
        f27894e = R5.b.a(a8);
    }

    private EnumC2467q0(String str, int i8, int i9) {
        this.f27895a = i9;
    }

    private static final /* synthetic */ EnumC2467q0[] a() {
        return new EnumC2467q0[]{f27891b, f27892c};
    }

    public static EnumC2467q0 valueOf(String str) {
        return (EnumC2467q0) Enum.valueOf(EnumC2467q0.class, str);
    }

    public static EnumC2467q0[] values() {
        return (EnumC2467q0[]) f27893d.clone();
    }

    public final int b() {
        return this.f27895a;
    }
}
