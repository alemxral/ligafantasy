package com.google.android.gms.auth.api.signin;

import R.AbstractC1319p;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* loaded from: classes3.dex */
public class SignInAccount extends S.a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<SignInAccount> CREATOR = new g();

    /* renamed from: a, reason: collision with root package name */
    final String f15056a;

    /* renamed from: b, reason: collision with root package name */
    private final GoogleSignInAccount f15057b;

    /* renamed from: c, reason: collision with root package name */
    final String f15058c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f15057b = googleSignInAccount;
        this.f15056a = AbstractC1319p.g(str, "8.3 and 8.4 SDKs require non-null email");
        this.f15058c = AbstractC1319p.g(str2, "8.3 and 8.4 SDKs require non-null userId");
    }

    public final GoogleSignInAccount s() {
        return this.f15057b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = S.c.a(parcel);
        S.c.q(parcel, 4, this.f15056a, false);
        S.c.p(parcel, 7, this.f15057b, i8, false);
        S.c.q(parcel, 8, this.f15058c, false);
        S.c.b(parcel, a8);
    }
}
