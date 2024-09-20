package com.google.android.gms.common.api;

import O.C1258b;
import P.c;
import P.j;
import R.AbstractC1317n;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* loaded from: classes3.dex */
public final class Status extends S.a implements j, ReflectedParcelable {

    /* renamed from: a, reason: collision with root package name */
    private final int f15082a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15083b;

    /* renamed from: c, reason: collision with root package name */
    private final PendingIntent f15084c;

    /* renamed from: d, reason: collision with root package name */
    private final C1258b f15085d;

    /* renamed from: e, reason: collision with root package name */
    public static final Status f15074e = new Status(-1);

    /* renamed from: f, reason: collision with root package name */
    public static final Status f15075f = new Status(0);

    /* renamed from: g, reason: collision with root package name */
    public static final Status f15076g = new Status(14);

    /* renamed from: h, reason: collision with root package name */
    public static final Status f15077h = new Status(8);

    /* renamed from: i, reason: collision with root package name */
    public static final Status f15078i = new Status(15);

    /* renamed from: j, reason: collision with root package name */
    public static final Status f15079j = new Status(16);

    /* renamed from: l, reason: collision with root package name */
    public static final Status f15081l = new Status(17);

    /* renamed from: k, reason: collision with root package name */
    public static final Status f15080k = new Status(18);

    @NonNull
    public static final Parcelable.Creator<Status> CREATOR = new b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public Status(int i8, String str, PendingIntent pendingIntent, C1258b c1258b) {
        this.f15082a = i8;
        this.f15083b = str;
        this.f15084c = pendingIntent;
        this.f15085d = c1258b;
    }

    public String G() {
        return this.f15083b;
    }

    public boolean I() {
        return this.f15084c != null;
    }

    public boolean L() {
        return this.f15082a <= 0;
    }

    public final String V() {
        String str = this.f15083b;
        if (str != null) {
            return str;
        }
        return c.a(this.f15082a);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.f15082a != status.f15082a || !AbstractC1317n.a(this.f15083b, status.f15083b) || !AbstractC1317n.a(this.f15084c, status.f15084c) || !AbstractC1317n.a(this.f15085d, status.f15085d)) {
            return false;
        }
        return true;
    }

    @Override // P.j
    public Status getStatus() {
        return this;
    }

    public int hashCode() {
        return AbstractC1317n.b(Integer.valueOf(this.f15082a), this.f15083b, this.f15084c, this.f15085d);
    }

    public C1258b s() {
        return this.f15085d;
    }

    public String toString() {
        AbstractC1317n.a c8 = AbstractC1317n.c(this);
        c8.a("statusCode", V());
        c8.a("resolution", this.f15084c);
        return c8.toString();
    }

    public PendingIntent u() {
        return this.f15084c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = S.c.a(parcel);
        S.c.k(parcel, 1, z());
        S.c.q(parcel, 2, G(), false);
        S.c.p(parcel, 3, this.f15084c, i8, false);
        S.c.p(parcel, 4, s(), i8, false);
        S.c.b(parcel, a8);
    }

    public int z() {
        return this.f15082a;
    }

    public Status(int i8) {
        this(i8, (String) null);
    }

    public Status(C1258b c1258b, String str) {
        this(c1258b, str, 17);
    }

    public Status(int i8, String str) {
        this(i8, str, (PendingIntent) null);
    }

    public Status(C1258b c1258b, String str, int i8) {
        this(i8, str, c1258b.z(), c1258b);
    }

    public Status(int i8, String str, PendingIntent pendingIntent) {
        this(i8, str, pendingIntent, null);
    }
}
