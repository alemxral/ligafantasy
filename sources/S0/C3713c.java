package s0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.ArrayList;

/* renamed from: s0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3713c extends S.a {

    @NonNull
    public static final Parcelable.Creator<C3713c> CREATOR = new O();

    /* renamed from: a, reason: collision with root package name */
    ArrayList f37708a;

    /* renamed from: b, reason: collision with root package name */
    boolean f37709b;

    /* renamed from: c, reason: collision with root package name */
    boolean f37710c;

    /* renamed from: d, reason: collision with root package name */
    int f37711d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3713c(ArrayList arrayList, boolean z8, boolean z9, int i8) {
        this.f37708a = arrayList;
        this.f37709b = z8;
        this.f37710c = z9;
        this.f37711d = i8;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = S.c.a(parcel);
        S.c.m(parcel, 1, this.f37708a, false);
        S.c.c(parcel, 2, this.f37709b);
        S.c.c(parcel, 3, this.f37710c);
        S.c.k(parcel, 4, this.f37711d);
        S.c.b(parcel, a8);
    }
}
