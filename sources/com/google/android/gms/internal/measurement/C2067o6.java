package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.o6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2067o6 implements InterfaceC2059n6 {

    /* renamed from: a, reason: collision with root package name */
    public static final X2 f15820a;

    /* renamed from: b, reason: collision with root package name */
    public static final X2 f15821b;

    /* renamed from: c, reason: collision with root package name */
    public static final X2 f15822c;

    static {
        T2 a8 = new T2(L2.a("com.google.android.gms.measurement")).a();
        f15820a = a8.f("measurement.client.sessions.check_on_reset_and_enable2", true);
        f15821b = a8.f("measurement.client.sessions.check_on_startup", true);
        f15822c = a8.f("measurement.client.sessions.start_session_before_view_screen", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2059n6
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2059n6
    public final boolean b() {
        return ((Boolean) f15820a.b()).booleanValue();
    }
}
