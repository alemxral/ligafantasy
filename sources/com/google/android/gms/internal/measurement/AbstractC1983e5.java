package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.e5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC1983e5 {

    /* renamed from: a, reason: collision with root package name */
    private static final C1974d5 f15683a;

    /* renamed from: b, reason: collision with root package name */
    private static final C1974d5 f15684b;

    static {
        C1974d5 c1974d5 = null;
        try {
            c1974d5 = (C1974d5) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f15683a = c1974d5;
        f15684b = new C1974d5();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C1974d5 a() {
        return f15683a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C1974d5 b() {
        return f15684b;
    }
}
