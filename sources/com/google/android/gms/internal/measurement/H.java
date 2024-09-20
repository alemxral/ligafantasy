package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
final class H implements I {

    /* renamed from: a, reason: collision with root package name */
    private final T1 f15325a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15326b;

    public H(T1 t12, String str) {
        this.f15325a = t12;
        this.f15326b = str;
    }

    @Override // com.google.android.gms.internal.measurement.I
    public final T1 a(r rVar) {
        T1 a8 = this.f15325a.a();
        a8.e(this.f15326b, rVar);
        return a8;
    }
}
