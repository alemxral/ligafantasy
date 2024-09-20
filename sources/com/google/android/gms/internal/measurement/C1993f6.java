package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.f6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1993f6 implements InterfaceC1975d6 {

    /* renamed from: a, reason: collision with root package name */
    public static final X2 f15691a;

    /* renamed from: b, reason: collision with root package name */
    public static final X2 f15692b;

    /* renamed from: c, reason: collision with root package name */
    public static final X2 f15693c;

    /* renamed from: d, reason: collision with root package name */
    public static final X2 f15694d;

    static {
        T2 a8 = new T2(L2.a("com.google.android.gms.measurement")).a();
        f15691a = a8.f("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f15692b = a8.f("measurement.audience.refresh_event_count_filters_timestamp", false);
        f15693c = a8.f("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f15694d = a8.f("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1975d6
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1975d6
    public final boolean b() {
        return ((Boolean) f15692b.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1975d6
    public final boolean c() {
        return ((Boolean) f15693c.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1975d6
    public final boolean d() {
        return ((Boolean) f15694d.b()).booleanValue();
    }
}
