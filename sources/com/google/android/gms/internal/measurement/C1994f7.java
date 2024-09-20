package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.f7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1994f7 implements InterfaceC1985e7 {

    /* renamed from: a, reason: collision with root package name */
    public static final X2 f15695a;

    /* renamed from: b, reason: collision with root package name */
    public static final X2 f15696b;

    /* renamed from: c, reason: collision with root package name */
    public static final X2 f15697c;

    /* renamed from: d, reason: collision with root package name */
    public static final X2 f15698d;

    /* renamed from: e, reason: collision with root package name */
    public static final X2 f15699e;

    /* renamed from: f, reason: collision with root package name */
    public static final X2 f15700f;

    static {
        T2 a8 = new T2(L2.a("com.google.android.gms.measurement")).b().a();
        f15695a = a8.f("measurement.client.sessions.background_sessions_enabled", true);
        f15696b = a8.f("measurement.client.sessions.enable_fix_background_engagement", false);
        f15697c = a8.f("measurement.client.sessions.immediate_start_enabled_foreground", true);
        f15698d = a8.f("measurement.client.sessions.remove_expired_session_properties_enabled", true);
        f15699e = a8.f("measurement.client.sessions.session_id_enabled", true);
        f15700f = a8.d("measurement.id.client.sessions.enable_fix_background_engagement", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1985e7
    public final boolean a() {
        return ((Boolean) f15696b.b()).booleanValue();
    }
}
