package com.google.android.gms.auth.api.signin.internal;

import L.b;
import L.w;
import R.AbstractC1319p;
import S.c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* loaded from: classes3.dex */
public final class SignInConfiguration extends S.a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new w();

    /* renamed from: a, reason: collision with root package name */
    private final String f15061a;

    /* renamed from: b, reason: collision with root package name */
    private final GoogleSignInOptions f15062b;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        this.f15061a = AbstractC1319p.f(str);
        this.f15062b = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f15061a.equals(signInConfiguration.f15061a)) {
            GoogleSignInOptions googleSignInOptions = this.f15062b;
            GoogleSignInOptions googleSignInOptions2 = signInConfiguration.f15062b;
            if (googleSignInOptions == null) {
                if (googleSignInOptions2 == null) {
                    return true;
                }
            } else if (googleSignInOptions.equals(googleSignInOptions2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return new b().a(this.f15061a).a(this.f15062b).b();
    }

    public final GoogleSignInOptions s() {
        return this.f15062b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = c.a(parcel);
        c.q(parcel, 2, this.f15061a, false);
        c.p(parcel, 5, this.f15062b, i8, false);
        c.b(parcel, a8);
    }
}
