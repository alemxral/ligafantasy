package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.i4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2017i4 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f15718a;

    /* renamed from: b, reason: collision with root package name */
    private final int f15719b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2017i4(Object obj, int i8) {
        this.f15718a = obj;
        this.f15719b = i8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2017i4)) {
            return false;
        }
        C2017i4 c2017i4 = (C2017i4) obj;
        if (this.f15718a != c2017i4.f15718a || this.f15719b != c2017i4.f15719b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f15718a) * 65535) + this.f15719b;
    }
}
