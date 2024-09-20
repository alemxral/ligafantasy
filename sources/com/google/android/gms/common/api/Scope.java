package com.google.android.gms.common.api;

import R.AbstractC1319p;
import S.c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* loaded from: classes3.dex */
public final class Scope extends S.a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<Scope> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    final int f15072a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15073b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Scope(int i8, String str) {
        AbstractC1319p.g(str, "scopeUri must not be null or empty");
        this.f15072a = i8;
        this.f15073b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f15073b.equals(((Scope) obj).f15073b);
    }

    public int hashCode() {
        return this.f15073b.hashCode();
    }

    public String s() {
        return this.f15073b;
    }

    public String toString() {
        return this.f15073b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f15072a;
        int a8 = c.a(parcel);
        c.k(parcel, 1, i9);
        c.q(parcel, 2, s(), false);
        c.b(parcel, a8);
    }

    public Scope(String str) {
        this(1, str);
    }
}
