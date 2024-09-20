package com.google.android.gms.wallet;

import S.c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import s0.C3708E;
import s0.C3714d;
import s0.C3721k;
import s0.C3732w;

/* loaded from: classes3.dex */
public final class FullWallet extends S.a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<FullWallet> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    String f16946a;

    /* renamed from: b, reason: collision with root package name */
    String f16947b;

    /* renamed from: c, reason: collision with root package name */
    C3708E f16948c;

    /* renamed from: d, reason: collision with root package name */
    String f16949d;

    /* renamed from: e, reason: collision with root package name */
    C3732w f16950e;

    /* renamed from: f, reason: collision with root package name */
    C3732w f16951f;

    /* renamed from: g, reason: collision with root package name */
    String[] f16952g;

    /* renamed from: h, reason: collision with root package name */
    UserAddress f16953h;

    /* renamed from: i, reason: collision with root package name */
    UserAddress f16954i;

    /* renamed from: j, reason: collision with root package name */
    C3714d[] f16955j;

    /* renamed from: k, reason: collision with root package name */
    C3721k f16956k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FullWallet(String str, String str2, C3708E c3708e, String str3, C3732w c3732w, C3732w c3732w2, String[] strArr, UserAddress userAddress, UserAddress userAddress2, C3714d[] c3714dArr, C3721k c3721k) {
        this.f16946a = str;
        this.f16947b = str2;
        this.f16948c = c3708e;
        this.f16949d = str3;
        this.f16950e = c3732w;
        this.f16951f = c3732w2;
        this.f16952g = strArr;
        this.f16953h = userAddress;
        this.f16954i = userAddress2;
        this.f16955j = c3714dArr;
        this.f16956k = c3721k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = c.a(parcel);
        c.q(parcel, 2, this.f16946a, false);
        c.q(parcel, 3, this.f16947b, false);
        c.p(parcel, 4, this.f16948c, i8, false);
        c.q(parcel, 5, this.f16949d, false);
        c.p(parcel, 6, this.f16950e, i8, false);
        c.p(parcel, 7, this.f16951f, i8, false);
        c.r(parcel, 8, this.f16952g, false);
        c.p(parcel, 9, this.f16953h, i8, false);
        c.p(parcel, 10, this.f16954i, i8, false);
        c.t(parcel, 11, this.f16955j, i8, false);
        c.p(parcel, 12, this.f16956k, i8, false);
        c.b(parcel, a8);
    }
}
