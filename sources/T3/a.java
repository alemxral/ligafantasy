package T3;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public abstract class a implements c, Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private String f9970a;

    /* renamed from: b, reason: collision with root package name */
    private String f9971b;

    /* renamed from: c, reason: collision with root package name */
    private int f9972c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Parcel parcel) {
        this.f9970a = parcel.readString();
        this.f9971b = parcel.readString();
        this.f9972c = parcel.readInt();
    }

    @Override // T3.c
    public String G() {
        return this.f9970a;
    }

    @Override // T3.c
    public String k() {
        return this.f9971b;
    }

    @Override // T3.c
    public int o() {
        return this.f9972c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.f9970a);
        parcel.writeString(this.f9971b);
        parcel.writeInt(this.f9972c);
    }
}
