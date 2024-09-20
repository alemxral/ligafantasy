package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.m4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC2049m4 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC2033k4 f15751a = new C2041l4();

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC2033k4 f15752b;

    static {
        AbstractC2033k4 abstractC2033k4 = null;
        try {
            abstractC2033k4 = (AbstractC2033k4) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f15752b = abstractC2033k4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AbstractC2033k4 a() {
        AbstractC2033k4 abstractC2033k4 = f15752b;
        if (abstractC2033k4 != null) {
            return abstractC2033k4;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AbstractC2033k4 b() {
        return f15751a;
    }
}
