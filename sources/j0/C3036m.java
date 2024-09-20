package j0;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;

/* renamed from: j0.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3036m extends S.a {
    public static final Parcelable.Creator<C3036m> CREATOR = new C3037n();

    /* renamed from: a, reason: collision with root package name */
    String[] f32694a;

    /* renamed from: b, reason: collision with root package name */
    int[] f32695b;

    /* renamed from: c, reason: collision with root package name */
    RemoteViews f32696c;

    /* renamed from: d, reason: collision with root package name */
    byte[] f32697d;

    public C3036m(String[] strArr, int[] iArr, RemoteViews remoteViews, byte[] bArr) {
        this.f32694a = strArr;
        this.f32695b = iArr;
        this.f32696c = remoteViews;
        this.f32697d = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = S.c.a(parcel);
        S.c.r(parcel, 1, this.f32694a, false);
        S.c.l(parcel, 2, this.f32695b, false);
        S.c.p(parcel, 3, this.f32696c, i8, false);
        S.c.f(parcel, 4, this.f32697d, false);
        S.c.b(parcel, a8);
    }
}
