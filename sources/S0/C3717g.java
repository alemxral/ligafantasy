package s0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.wallet.wobs.CommonWalletObject;

/* renamed from: s0.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3717g extends S.a {

    @NonNull
    public static final Parcelable.Creator<C3717g> CREATOR = new V();

    /* renamed from: a, reason: collision with root package name */
    private final int f37744a;

    /* renamed from: b, reason: collision with root package name */
    String f37745b;

    /* renamed from: c, reason: collision with root package name */
    String f37746c;

    /* renamed from: d, reason: collision with root package name */
    CommonWalletObject f37747d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3717g(int i8, String str, String str2, CommonWalletObject commonWalletObject) {
        this.f37744a = i8;
        this.f37746c = str2;
        if (i8 < 3) {
            com.google.android.gms.wallet.wobs.a s8 = CommonWalletObject.s();
            s8.a(str);
            this.f37747d = s8.b();
            return;
        }
        this.f37747d = commonWalletObject;
    }

    public int s() {
        return this.f37744a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = S.c.a(parcel);
        S.c.k(parcel, 1, s());
        S.c.q(parcel, 2, this.f37745b, false);
        S.c.q(parcel, 3, this.f37746c, false);
        S.c.p(parcel, 4, this.f37747d, i8, false);
        S.c.b(parcel, a8);
    }
}
