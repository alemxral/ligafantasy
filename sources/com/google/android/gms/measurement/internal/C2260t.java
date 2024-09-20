package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* renamed from: com.google.android.gms.measurement.internal.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2260t extends S.a implements Iterable {
    public static final Parcelable.Creator<C2260t> CREATOR = new C2265u();

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f16810a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2260t(Bundle bundle) {
        this.f16810a = bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Double G(String str) {
        return Double.valueOf(this.f16810a.getDouble("value"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Long I(String str) {
        return Long.valueOf(this.f16810a.getLong("value"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object L(String str) {
        return this.f16810a.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String V(String str) {
        return this.f16810a.getString(str);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C2255s(this);
    }

    public final int s() {
        return this.f16810a.size();
    }

    public final String toString() {
        return this.f16810a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = S.c.a(parcel);
        S.c.e(parcel, 2, z(), false);
        S.c.b(parcel, a8);
    }

    public final Bundle z() {
        return new Bundle(this.f16810a);
    }
}
