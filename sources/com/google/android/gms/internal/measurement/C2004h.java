package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2004h implements r {

    /* renamed from: a, reason: collision with root package name */
    private final r f15709a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15710b;

    public C2004h(String str) {
        this.f15709a = r.f15853c0;
        this.f15710b = str;
    }

    public final r a() {
        return this.f15709a;
    }

    public final String b() {
        return this.f15710b;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r d() {
        return new C2004h(this.f15710b, this.f15709a.d());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2004h)) {
            return false;
        }
        C2004h c2004h = (C2004h) obj;
        if (this.f15710b.equals(c2004h.f15710b) && this.f15709a.equals(c2004h.f15709a)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Double f() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final String g() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Boolean h() {
        throw new IllegalStateException("Control is not a boolean");
    }

    public final int hashCode() {
        return (this.f15710b.hashCode() * 31) + this.f15709a.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Iterator i() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r m(String str, T1 t12, List list) {
        throw new IllegalStateException("Control does not have functions");
    }

    public C2004h(String str, r rVar) {
        this.f15709a = rVar;
        this.f15710b = str;
    }
}
