package s0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* renamed from: s0.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3721k extends S.a {

    @NonNull
    public static final Parcelable.Creator<C3721k> CREATOR = new C3704A();

    /* renamed from: a, reason: collision with root package name */
    int f37770a;

    /* renamed from: b, reason: collision with root package name */
    String f37771b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3721k(int i8, String str) {
        this.f37770a = i8;
        this.f37771b = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = S.c.a(parcel);
        S.c.k(parcel, 2, this.f37770a);
        S.c.q(parcel, 3, this.f37771b, false);
        S.c.b(parcel, a8);
    }
}
