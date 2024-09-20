package p0;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: p0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3592b extends S.a implements P.j {
    public static final Parcelable.Creator<C3592b> CREATOR = new C3593c();

    /* renamed from: a, reason: collision with root package name */
    final int f36955a;

    /* renamed from: b, reason: collision with root package name */
    private int f36956b;

    /* renamed from: c, reason: collision with root package name */
    private Intent f36957c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3592b(int i8, int i9, Intent intent) {
        this.f36955a = i8;
        this.f36956b = i9;
        this.f36957c = intent;
    }

    @Override // P.j
    public final Status getStatus() {
        if (this.f36956b == 0) {
            return Status.f15075f;
        }
        return Status.f15079j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f36955a;
        int a8 = S.c.a(parcel);
        S.c.k(parcel, 1, i9);
        S.c.k(parcel, 2, this.f36956b);
        S.c.p(parcel, 3, this.f36957c, i8, false);
        S.c.b(parcel, a8);
    }
}
