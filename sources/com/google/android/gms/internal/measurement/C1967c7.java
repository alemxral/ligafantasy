package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.c7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1967c7 implements InterfaceC1958b7 {

    /* renamed from: a, reason: collision with root package name */
    public static final X2 f15667a;

    /* renamed from: b, reason: collision with root package name */
    public static final X2 f15668b;

    /* renamed from: c, reason: collision with root package name */
    public static final X2 f15669c;

    /* renamed from: d, reason: collision with root package name */
    public static final X2 f15670d;

    static {
        T2 a8 = new T2(L2.a("com.google.android.gms.measurement")).b().a();
        f15667a = a8.f("measurement.collection.enable_session_stitching_token.client.dev", true);
        f15668b = a8.f("measurement.collection.enable_session_stitching_token.first_open_fix", true);
        f15669c = a8.f("measurement.session_stitching_token_enabled", false);
        f15670d = a8.f("measurement.link_sst_to_sid", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1958b7
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1958b7
    public final boolean b() {
        return ((Boolean) f15667a.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1958b7
    public final boolean c() {
        return ((Boolean) f15668b.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1958b7
    public final boolean d() {
        return ((Boolean) f15669c.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1958b7
    public final boolean e() {
        return ((Boolean) f15670d.b()).booleanValue();
    }
}
