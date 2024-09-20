package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
final class G implements I {

    /* renamed from: a, reason: collision with root package name */
    private final T1 f15316a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15317b;

    public G(T1 t12, String str) {
        this.f15316a = t12;
        this.f15317b = str;
    }

    @Override // com.google.android.gms.internal.measurement.I
    public final T1 a(r rVar) {
        T1 a8 = this.f15316a.a();
        a8.f(this.f15317b, rVar);
        return a8;
    }
}
