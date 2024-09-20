package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class B3 extends AbstractC2135x3 {

    /* renamed from: f, reason: collision with root package name */
    static final AbstractC2135x3 f15253f = new B3(new Object[0], 0);

    /* renamed from: d, reason: collision with root package name */
    final transient Object[] f15254d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f15255e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public B3(Object[] objArr, int i8) {
        this.f15254d = objArr;
        this.f15255e = i8;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2135x3, com.google.android.gms.internal.measurement.AbstractC2095s3
    final int a(Object[] objArr, int i8) {
        System.arraycopy(this.f15254d, 0, objArr, 0, this.f15255e);
        return this.f15255e;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2095s3
    final int d() {
        return this.f15255e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC2095s3
    public final int g() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i8) {
        AbstractC1990f3.a(i8, this.f15255e, "index");
        Object obj = this.f15254d[i8];
        obj.getClass();
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC2095s3
    public final Object[] h() {
        return this.f15254d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15255e;
    }
}
