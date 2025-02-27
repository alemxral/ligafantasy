package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class u4 extends S.a {
    public static final Parcelable.Creator<u4> CREATOR = new v4();

    /* renamed from: a, reason: collision with root package name */
    public final int f16864a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16865b;

    /* renamed from: c, reason: collision with root package name */
    public final long f16866c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f16867d;

    /* renamed from: e, reason: collision with root package name */
    public final String f16868e;

    /* renamed from: f, reason: collision with root package name */
    public final String f16869f;

    /* renamed from: g, reason: collision with root package name */
    public final Double f16870g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u4(int i8, String str, long j8, Long l8, Float f8, String str2, String str3, Double d8) {
        this.f16864a = i8;
        this.f16865b = str;
        this.f16866c = j8;
        this.f16867d = l8;
        if (i8 == 1) {
            this.f16870g = f8 != null ? Double.valueOf(f8.doubleValue()) : null;
        } else {
            this.f16870g = d8;
        }
        this.f16868e = str2;
        this.f16869f = str3;
    }

    public final Object s() {
        Long l8 = this.f16867d;
        if (l8 != null) {
            return l8;
        }
        Double d8 = this.f16870g;
        if (d8 != null) {
            return d8;
        }
        String str = this.f16868e;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        v4.a(this, parcel, i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u4(w4 w4Var) {
        this(w4Var.f16899c, w4Var.f16900d, w4Var.f16901e, w4Var.f16898b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u4(String str, long j8, Object obj, String str2) {
        AbstractC1319p.f(str);
        this.f16864a = 2;
        this.f16865b = str;
        this.f16866c = j8;
        this.f16869f = str2;
        if (obj == null) {
            this.f16867d = null;
            this.f16870g = null;
            this.f16868e = null;
            return;
        }
        if (obj instanceof Long) {
            this.f16867d = (Long) obj;
            this.f16870g = null;
            this.f16868e = null;
        } else if (obj instanceof String) {
            this.f16867d = null;
            this.f16870g = null;
            this.f16868e = (String) obj;
        } else {
            if (obj instanceof Double) {
                this.f16867d = null;
                this.f16870g = (Double) obj;
                this.f16868e = null;
                return;
            }
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }
}
