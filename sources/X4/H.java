package X4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class H implements Parcelable {
    public static final a CREATOR = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private String f12355a;

    /* renamed from: b, reason: collision with root package name */
    private int f12356b;

    /* renamed from: c, reason: collision with root package name */
    private int f12357c;

    /* renamed from: d, reason: collision with root package name */
    private String f12358d;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList f12359e;

    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator {
        private a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public H createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new H(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public H[] newArray(int i8) {
            return new H[i8];
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public H() {
    }

    public final void b(JSONObject jsonObject) {
        AbstractC3159y.i(jsonObject, "jsonObject");
        if (!jsonObject.isNull("sha256")) {
            this.f12355a = jsonObject.getString("sha256");
        }
        if (!jsonObject.isNull("scans")) {
            this.f12356b = jsonObject.getInt("scans");
        }
        if (!jsonObject.isNull("positives")) {
            this.f12357c = jsonObject.getInt("positives");
        }
        if (!jsonObject.isNull("lastAnalysis")) {
            this.f12358d = jsonObject.getString("lastAnalysis");
        }
        if (!jsonObject.isNull("infections")) {
            this.f12359e = new ArrayList();
            JSONArray jSONArray = jsonObject.getJSONArray("infections");
            int length = jSONArray.length();
            for (int i8 = 0; i8 < length; i8++) {
                C1508s c1508s = new C1508s();
                c1508s.b(jSONArray.getJSONObject(i8));
                ArrayList arrayList = this.f12359e;
                AbstractC3159y.f(arrayList);
                arrayList.add(c1508s);
            }
        }
    }

    public final ArrayList c() {
        return this.f12359e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f12358d;
    }

    public final int f() {
        return this.f12357c;
    }

    public final int i() {
        return this.f12356b;
    }

    public final String j() {
        return this.f12355a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        AbstractC3159y.i(parcel, "parcel");
        parcel.writeString(this.f12355a);
        parcel.writeInt(this.f12356b);
        parcel.writeInt(this.f12357c);
        parcel.writeString(this.f12358d);
        parcel.writeList(this.f12359e);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public H(Parcel parcel) {
        this();
        AbstractC3159y.i(parcel, "parcel");
        this.f12355a = parcel.readString();
        this.f12356b = parcel.readInt();
        this.f12357c = parcel.readInt();
        this.f12358d = parcel.readString();
        ArrayList arrayList = this.f12359e;
        if (arrayList == null || arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            this.f12359e = arrayList2;
            AbstractC3159y.f(arrayList2);
            parcel.readList(arrayList2, C1508s.class.getClassLoader());
        }
    }
}
