package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* loaded from: classes3.dex */
final class C3 extends AbstractC2143y3 {

    /* renamed from: h, reason: collision with root package name */
    private static final Object[] f15269h;

    /* renamed from: i, reason: collision with root package name */
    static final C3 f15270i;

    /* renamed from: c, reason: collision with root package name */
    final transient Object[] f15271c;

    /* renamed from: d, reason: collision with root package name */
    private final transient int f15272d;

    /* renamed from: e, reason: collision with root package name */
    final transient Object[] f15273e;

    /* renamed from: f, reason: collision with root package name */
    private final transient int f15274f;

    /* renamed from: g, reason: collision with root package name */
    private final transient int f15275g;

    static {
        Object[] objArr = new Object[0];
        f15269h = objArr;
        f15270i = new C3(objArr, 0, objArr, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3(Object[] objArr, int i8, Object[] objArr2, int i9, int i10) {
        this.f15271c = objArr;
        this.f15272d = i8;
        this.f15273e = objArr2;
        this.f15274f = i9;
        this.f15275g = i10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2095s3
    final int a(Object[] objArr, int i8) {
        System.arraycopy(this.f15271c, 0, objArr, 0, this.f15275g);
        return this.f15275g;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2095s3, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Object[] objArr = this.f15273e;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int a8 = AbstractC2072p3.a(obj.hashCode());
        while (true) {
            int i8 = a8 & this.f15274f;
            Object obj2 = objArr[i8];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            a8 = i8 + 1;
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2095s3
    final int d() {
        return this.f15275g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC2095s3
    public final int g() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC2095s3
    public final Object[] h() {
        return this.f15271c;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2143y3, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f15272d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return m().listIterator(0);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2143y3
    final AbstractC2135x3 p() {
        return AbstractC2135x3.m(this.f15271c, this.f15275g);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2143y3
    final boolean r() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f15275g;
    }
}
