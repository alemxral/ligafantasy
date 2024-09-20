package s0;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.identity.intents.model.UserAddress;

/* renamed from: s0.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3719i extends S.a {

    @NonNull
    public static final Parcelable.Creator<C3719i> CREATOR = new x();

    /* renamed from: a, reason: collision with root package name */
    String f37749a;

    /* renamed from: b, reason: collision with root package name */
    C3712b f37750b;

    /* renamed from: c, reason: collision with root package name */
    UserAddress f37751c;

    /* renamed from: d, reason: collision with root package name */
    C3721k f37752d;

    /* renamed from: e, reason: collision with root package name */
    String f37753e;

    /* renamed from: f, reason: collision with root package name */
    Bundle f37754f;

    /* renamed from: g, reason: collision with root package name */
    String f37755g;

    /* renamed from: h, reason: collision with root package name */
    Bundle f37756h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3719i(String str, C3712b c3712b, UserAddress userAddress, C3721k c3721k, String str2, Bundle bundle, String str3, Bundle bundle2) {
        this.f37749a = str;
        this.f37750b = c3712b;
        this.f37751c = userAddress;
        this.f37752d = c3721k;
        this.f37753e = str2;
        this.f37754f = bundle;
        this.f37755g = str3;
        this.f37756h = bundle2;
    }

    public static C3719i s(Intent intent) {
        return (C3719i) S.e.b(intent, "com.google.android.gms.wallet.PaymentData", CREATOR);
    }

    public String u() {
        return this.f37755g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = S.c.a(parcel);
        S.c.q(parcel, 1, this.f37749a, false);
        S.c.p(parcel, 2, this.f37750b, i8, false);
        S.c.p(parcel, 3, this.f37751c, i8, false);
        S.c.p(parcel, 4, this.f37752d, i8, false);
        S.c.q(parcel, 5, this.f37753e, false);
        S.c.e(parcel, 6, this.f37754f, false);
        S.c.q(parcel, 7, this.f37755g, false);
        S.c.e(parcel, 8, this.f37756h, false);
        S.c.b(parcel, a8);
    }
}
