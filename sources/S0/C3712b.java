package s0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.identity.intents.model.UserAddress;

/* renamed from: s0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3712b extends S.a {

    @NonNull
    public static final Parcelable.Creator<C3712b> CREATOR = new N();

    /* renamed from: a, reason: collision with root package name */
    String f37703a;

    /* renamed from: b, reason: collision with root package name */
    String f37704b;

    /* renamed from: c, reason: collision with root package name */
    String f37705c;

    /* renamed from: d, reason: collision with root package name */
    int f37706d;

    /* renamed from: e, reason: collision with root package name */
    UserAddress f37707e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3712b(String str, String str2, String str3, int i8, UserAddress userAddress) {
        this.f37703a = str;
        this.f37704b = str2;
        this.f37705c = str3;
        this.f37706d = i8;
        this.f37707e = userAddress;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = S.c.a(parcel);
        S.c.q(parcel, 1, this.f37703a, false);
        S.c.q(parcel, 2, this.f37704b, false);
        S.c.q(parcel, 3, this.f37705c, false);
        S.c.k(parcel, 4, this.f37706d);
        S.c.p(parcel, 5, this.f37707e, i8, false);
        S.c.b(parcel, a8);
    }
}
