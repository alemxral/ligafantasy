package v0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.ArrayList;

/* renamed from: v0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3812b extends S.a {

    @NonNull
    public static final Parcelable.Creator<C3812b> CREATOR = new l();

    /* renamed from: a, reason: collision with root package name */
    String f38590a;

    /* renamed from: b, reason: collision with root package name */
    String f38591b;

    /* renamed from: c, reason: collision with root package name */
    final ArrayList f38592c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3812b(String str, String str2, ArrayList arrayList) {
        this.f38590a = str;
        this.f38591b = str2;
        this.f38592c = arrayList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = S.c.a(parcel);
        S.c.q(parcel, 2, this.f38590a, false);
        S.c.q(parcel, 3, this.f38591b, false);
        S.c.u(parcel, 4, this.f38592c, false);
        S.c.b(parcel, a8);
    }
}
