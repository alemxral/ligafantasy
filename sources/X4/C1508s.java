package X4;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONObject;

/* renamed from: X4.s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1508s implements Parcelable {
    public static final a CREATOR = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private String f12696a;

    /* renamed from: b, reason: collision with root package name */
    private String f12697b;

    /* renamed from: X4.s$a */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator {
        private a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1508s createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new C1508s(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1508s[] newArray(int i8) {
            return new C1508s[i8];
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public C1508s() {
    }

    public final void b(JSONObject jSONObject) {
        if (jSONObject != null) {
            if (!jSONObject.isNull("antivirusName")) {
                this.f12696a = jSONObject.getString("antivirusName");
            }
            if (!jSONObject.isNull("virusName")) {
                this.f12697b = jSONObject.getString("virusName");
            }
        }
    }

    public final String c() {
        return this.f12696a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f12697b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        AbstractC3159y.i(parcel, "parcel");
        parcel.writeString(this.f12696a);
        parcel.writeString(this.f12697b);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1508s(Parcel parcel) {
        this();
        AbstractC3159y.i(parcel, "parcel");
        this.f12696a = parcel.readString();
        this.f12697b = parcel.readString();
    }
}
