package s0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import v0.C3812b;
import v0.C3813c;
import v0.C3815e;
import v0.C3816f;
import v0.C3817g;
import v0.C3818h;

/* loaded from: classes3.dex */
public final class U implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = S.b.y(parcel);
        ArrayList c8 = W.b.c();
        ArrayList c9 = W.b.c();
        ArrayList c10 = W.b.c();
        ArrayList arrayList = c8;
        ArrayList arrayList2 = c9;
        ArrayList arrayList3 = c10;
        ArrayList c11 = W.b.c();
        ArrayList c12 = W.b.c();
        ArrayList c13 = W.b.c();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        C3816f c3816f = null;
        String str11 = null;
        String str12 = null;
        C3813c c3813c = null;
        int i8 = 0;
        boolean z8 = false;
        while (parcel.dataPosition() < y8) {
            int r8 = S.b.r(parcel);
            switch (S.b.l(r8)) {
                case 2:
                    str = S.b.f(parcel, r8);
                    break;
                case 3:
                    str2 = S.b.f(parcel, r8);
                    break;
                case 4:
                    str3 = S.b.f(parcel, r8);
                    break;
                case 5:
                    str4 = S.b.f(parcel, r8);
                    break;
                case 6:
                    str5 = S.b.f(parcel, r8);
                    break;
                case 7:
                    str6 = S.b.f(parcel, r8);
                    break;
                case 8:
                    str7 = S.b.f(parcel, r8);
                    break;
                case 9:
                    str8 = S.b.f(parcel, r8);
                    break;
                case 10:
                    str9 = S.b.f(parcel, r8);
                    break;
                case 11:
                    str10 = S.b.f(parcel, r8);
                    break;
                case 12:
                    i8 = S.b.t(parcel, r8);
                    break;
                case 13:
                    arrayList = S.b.j(parcel, r8, C3818h.CREATOR);
                    break;
                case 14:
                    c3816f = (C3816f) S.b.e(parcel, r8, C3816f.CREATOR);
                    break;
                case 15:
                    arrayList2 = S.b.j(parcel, r8, LatLng.CREATOR);
                    break;
                case 16:
                    str11 = S.b.f(parcel, r8);
                    break;
                case 17:
                    str12 = S.b.f(parcel, r8);
                    break;
                case 18:
                    arrayList3 = S.b.j(parcel, r8, C3812b.CREATOR);
                    break;
                case 19:
                    z8 = S.b.m(parcel, r8);
                    break;
                case 20:
                    c11 = S.b.j(parcel, r8, C3817g.CREATOR);
                    break;
                case 21:
                    c12 = S.b.j(parcel, r8, C3815e.CREATOR);
                    break;
                case 22:
                    c13 = S.b.j(parcel, r8, C3817g.CREATOR);
                    break;
                case 23:
                    c3813c = (C3813c) S.b.e(parcel, r8, C3813c.CREATOR);
                    break;
                default:
                    S.b.x(parcel, r8);
                    break;
            }
        }
        S.b.k(parcel, y8);
        return new C3716f(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, i8, arrayList, c3816f, arrayList2, str11, str12, arrayList3, z8, c11, c12, c13, c3813c);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C3716f[i8];
    }
}
