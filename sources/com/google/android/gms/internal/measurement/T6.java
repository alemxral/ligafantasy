package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class T6 implements S6 {

    /* renamed from: a, reason: collision with root package name */
    public static final X2 f15553a;

    /* renamed from: b, reason: collision with root package name */
    public static final X2 f15554b;

    /* renamed from: c, reason: collision with root package name */
    public static final X2 f15555c;

    /* renamed from: d, reason: collision with root package name */
    public static final X2 f15556d;

    /* renamed from: e, reason: collision with root package name */
    public static final X2 f15557e;

    /* renamed from: f, reason: collision with root package name */
    public static final X2 f15558f;

    /* renamed from: g, reason: collision with root package name */
    public static final X2 f15559g;

    /* renamed from: h, reason: collision with root package name */
    public static final X2 f15560h;

    /* renamed from: i, reason: collision with root package name */
    public static final X2 f15561i;

    /* renamed from: j, reason: collision with root package name */
    public static final X2 f15562j;

    /* renamed from: k, reason: collision with root package name */
    public static final X2 f15563k;

    /* renamed from: l, reason: collision with root package name */
    public static final X2 f15564l;

    /* renamed from: m, reason: collision with root package name */
    public static final X2 f15565m;

    /* renamed from: n, reason: collision with root package name */
    public static final X2 f15566n;

    static {
        T2 a8 = new T2(L2.a("com.google.android.gms.measurement")).b().a();
        f15553a = a8.f("measurement.redaction.app_instance_id", true);
        f15554b = a8.f("measurement.redaction.client_ephemeral_aiid_generation", true);
        f15555c = a8.f("measurement.redaction.config_redacted_fields", true);
        f15556d = a8.f("measurement.redaction.device_info", true);
        f15557e = a8.f("measurement.redaction.e_tag", true);
        f15558f = a8.f("measurement.redaction.enhanced_uid", true);
        f15559g = a8.f("measurement.redaction.populate_ephemeral_app_instance_id", true);
        f15560h = a8.f("measurement.redaction.google_signals", true);
        f15561i = a8.f("measurement.redaction.no_aiid_in_config_request", true);
        f15562j = a8.f("measurement.redaction.retain_major_os_version", true);
        f15563k = a8.f("measurement.redaction.scion_payload_generator", true);
        f15564l = a8.f("measurement.redaction.upload_redacted_fields", true);
        f15565m = a8.f("measurement.redaction.upload_subdomain_override", true);
        f15566n = a8.f("measurement.redaction.user_id", true);
    }

    @Override // com.google.android.gms.internal.measurement.S6
    public final boolean a() {
        return ((Boolean) f15562j.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.S6
    public final boolean b() {
        return ((Boolean) f15563k.b()).booleanValue();
    }
}
