package com.google.android.gms.wallet;

import S.c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import s0.C3714d;
import s0.C3716f;
import s0.C3717g;
import s0.C3732w;

/* loaded from: classes3.dex */
public final class MaskedWallet extends S.a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<MaskedWallet> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    String f16957a;

    /* renamed from: b, reason: collision with root package name */
    String f16958b;

    /* renamed from: c, reason: collision with root package name */
    String[] f16959c;

    /* renamed from: d, reason: collision with root package name */
    String f16960d;

    /* renamed from: e, reason: collision with root package name */
    C3732w f16961e;

    /* renamed from: f, reason: collision with root package name */
    C3732w f16962f;

    /* renamed from: g, reason: collision with root package name */
    C3716f[] f16963g;

    /* renamed from: h, reason: collision with root package name */
    C3717g[] f16964h;

    /* renamed from: i, reason: collision with root package name */
    UserAddress f16965i;

    /* renamed from: j, reason: collision with root package name */
    UserAddress f16966j;

    /* renamed from: k, reason: collision with root package name */
    C3714d[] f16967k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MaskedWallet(String str, String str2, String[] strArr, String str3, C3732w c3732w, C3732w c3732w2, C3716f[] c3716fArr, C3717g[] c3717gArr, UserAddress userAddress, UserAddress userAddress2, C3714d[] c3714dArr) {
        this.f16957a = str;
        this.f16958b = str2;
        this.f16959c = strArr;
        this.f16960d = str3;
        this.f16961e = c3732w;
        this.f16962f = c3732w2;
        this.f16963g = c3716fArr;
        this.f16964h = c3717gArr;
        this.f16965i = userAddress;
        this.f16966j = userAddress2;
        this.f16967k = c3714dArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = c.a(parcel);
        c.q(parcel, 2, this.f16957a, false);
        c.q(parcel, 3, this.f16958b, false);
        c.r(parcel, 4, this.f16959c, false);
        c.q(parcel, 5, this.f16960d, false);
        c.p(parcel, 6, this.f16961e, i8, false);
        c.p(parcel, 7, this.f16962f, i8, false);
        c.t(parcel, 8, this.f16963g, i8, false);
        c.t(parcel, 9, this.f16964h, i8, false);
        c.p(parcel, 10, this.f16965i, i8, false);
        c.p(parcel, 11, this.f16966j, i8, false);
        c.t(parcel, 12, this.f16967k, i8, false);
        c.b(parcel, a8);
    }
}
