package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class A6 implements InterfaceC2154z6 {

    /* renamed from: a, reason: collision with root package name */
    public static final X2 f15237a;

    /* renamed from: b, reason: collision with root package name */
    public static final X2 f15238b;

    /* renamed from: c, reason: collision with root package name */
    public static final X2 f15239c;

    /* renamed from: d, reason: collision with root package name */
    public static final X2 f15240d;

    static {
        T2 a8 = new T2(L2.a("com.google.android.gms.measurement")).a();
        f15237a = a8.f("measurement.sdk.collection.enable_extend_user_property_size", true);
        f15238b = a8.f("measurement.sdk.collection.last_deep_link_referrer2", true);
        f15239c = a8.f("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        f15240d = a8.d("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2154z6
    public final boolean a() {
        return ((Boolean) f15239c.b()).booleanValue();
    }
}
