package com.google.android.gms.identity.intents.model;

import S.c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* loaded from: classes3.dex */
public final class UserAddress extends S.a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<UserAddress> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    String f15219a;

    /* renamed from: b, reason: collision with root package name */
    String f15220b;

    /* renamed from: c, reason: collision with root package name */
    String f15221c;

    /* renamed from: d, reason: collision with root package name */
    String f15222d;

    /* renamed from: e, reason: collision with root package name */
    String f15223e;

    /* renamed from: f, reason: collision with root package name */
    String f15224f;

    /* renamed from: g, reason: collision with root package name */
    String f15225g;

    /* renamed from: h, reason: collision with root package name */
    String f15226h;

    /* renamed from: i, reason: collision with root package name */
    String f15227i;

    /* renamed from: j, reason: collision with root package name */
    String f15228j;

    /* renamed from: k, reason: collision with root package name */
    String f15229k;

    /* renamed from: l, reason: collision with root package name */
    String f15230l;

    /* renamed from: m, reason: collision with root package name */
    boolean f15231m;

    /* renamed from: n, reason: collision with root package name */
    String f15232n;

    /* renamed from: o, reason: collision with root package name */
    String f15233o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public UserAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z8, String str13, String str14) {
        this.f15219a = str;
        this.f15220b = str2;
        this.f15221c = str3;
        this.f15222d = str4;
        this.f15223e = str5;
        this.f15224f = str6;
        this.f15225g = str7;
        this.f15226h = str8;
        this.f15227i = str9;
        this.f15228j = str10;
        this.f15229k = str11;
        this.f15230l = str12;
        this.f15231m = z8;
        this.f15232n = str13;
        this.f15233o = str14;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = c.a(parcel);
        c.q(parcel, 2, this.f15219a, false);
        c.q(parcel, 3, this.f15220b, false);
        c.q(parcel, 4, this.f15221c, false);
        c.q(parcel, 5, this.f15222d, false);
        c.q(parcel, 6, this.f15223e, false);
        c.q(parcel, 7, this.f15224f, false);
        c.q(parcel, 8, this.f15225g, false);
        c.q(parcel, 9, this.f15226h, false);
        c.q(parcel, 10, this.f15227i, false);
        c.q(parcel, 11, this.f15228j, false);
        c.q(parcel, 12, this.f15229k, false);
        c.q(parcel, 13, this.f15230l, false);
        c.c(parcel, 14, this.f15231m);
        c.q(parcel, 15, this.f15232n, false);
        c.q(parcel, 16, this.f15233o, false);
        c.b(parcel, a8);
    }
}
