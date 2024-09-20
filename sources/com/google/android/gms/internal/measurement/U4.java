package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
abstract class U4 {

    /* renamed from: a, reason: collision with root package name */
    private static final T4 f15570a;

    /* renamed from: b, reason: collision with root package name */
    private static final T4 f15571b;

    static {
        T4 t42 = null;
        try {
            t42 = (T4) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f15570a = t42;
        f15571b = new T4();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static T4 a() {
        return f15570a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static T4 b() {
        return f15571b;
    }
}
