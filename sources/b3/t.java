package b3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class t implements v2.f {
    public static final Parcelable.Creator<t> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final String f14546a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14547b;

    /* renamed from: c, reason: collision with root package name */
    private final C1858C f14548c;

    /* renamed from: d, reason: collision with root package name */
    private final List f14549d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f14550e;

    /* renamed from: f, reason: collision with root package name */
    private final Integer f14551f;

    /* renamed from: g, reason: collision with root package name */
    private final String f14552g;

    /* renamed from: h, reason: collision with root package name */
    private final String f14553h;

    /* renamed from: i, reason: collision with root package name */
    private final String f14554i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f14555j;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t createFromParcel(Parcel parcel) {
            C1858C createFromParcel;
            boolean z8;
            boolean z9;
            AbstractC3159y.i(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Integer num = null;
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = C1858C.CREATOR.createFromParcel(parcel);
            }
            C1858C c1858c = createFromParcel;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i8 = 0; i8 != readInt; i8++) {
                arrayList.add(parcel.readParcelable(t.class.getClassLoader()));
            }
            if (parcel.readInt() != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (parcel.readInt() != 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            Integer num2 = num;
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            if (parcel.readInt() != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            return new t(readString, readString2, c1858c, arrayList, z8, num2, readString3, readString4, readString5, z9);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final t[] newArray(int i8) {
            return new t[i8];
        }
    }

    public t(String str, String str2, C1858C c1858c, List sources, boolean z8, Integer num, String str3, String str4, String str5, boolean z9) {
        AbstractC3159y.i(sources, "sources");
        this.f14546a = str;
        this.f14547b = str2;
        this.f14548c = c1858c;
        this.f14549d = sources;
        this.f14550e = z8;
        this.f14551f = num;
        this.f14552g = str3;
        this.f14553h = str4;
        this.f14554i = str5;
        this.f14555j = z9;
    }

    public final String b() {
        return this.f14554i;
    }

    public final C1858C c() {
        return this.f14548c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (AbstractC3159y.d(this.f14546a, tVar.f14546a) && AbstractC3159y.d(this.f14547b, tVar.f14547b) && AbstractC3159y.d(this.f14548c, tVar.f14548c) && AbstractC3159y.d(this.f14549d, tVar.f14549d) && this.f14550e == tVar.f14550e && AbstractC3159y.d(this.f14551f, tVar.f14551f) && AbstractC3159y.d(this.f14552g, tVar.f14552g) && AbstractC3159y.d(this.f14553h, tVar.f14553h) && AbstractC3159y.d(this.f14554i, tVar.f14554i) && this.f14555j == tVar.f14555j) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        String str = this.f14546a;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = hashCode * 31;
        String str2 = this.f14547b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        C1858C c1858c = this.f14548c;
        if (c1858c == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c1858c.hashCode();
        }
        int hashCode7 = (((((i10 + hashCode3) * 31) + this.f14549d.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f14550e)) * 31;
        Integer num = this.f14551f;
        if (num == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num.hashCode();
        }
        int i11 = (hashCode7 + hashCode4) * 31;
        String str3 = this.f14552g;
        if (str3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str3.hashCode();
        }
        int i12 = (i11 + hashCode5) * 31;
        String str4 = this.f14553h;
        if (str4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str4.hashCode();
        }
        int i13 = (i12 + hashCode6) * 31;
        String str5 = this.f14554i;
        if (str5 != null) {
            i8 = str5.hashCode();
        }
        return ((i13 + i8) * 31) + androidx.compose.foundation.a.a(this.f14555j);
    }

    public String toString() {
        return "Customer(id=" + this.f14546a + ", defaultSource=" + this.f14547b + ", shippingInformation=" + this.f14548c + ", sources=" + this.f14549d + ", hasMore=" + this.f14550e + ", totalCount=" + this.f14551f + ", url=" + this.f14552g + ", description=" + this.f14553h + ", email=" + this.f14554i + ", liveMode=" + this.f14555j + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f14546a);
        out.writeString(this.f14547b);
        C1858C c1858c = this.f14548c;
        if (c1858c == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c1858c.writeToParcel(out, i8);
        }
        List list = this.f14549d;
        out.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            out.writeParcelable((Parcelable) it.next(), i8);
        }
        out.writeInt(this.f14550e ? 1 : 0);
        Integer num = this.f14551f;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        out.writeString(this.f14552g);
        out.writeString(this.f14553h);
        out.writeString(this.f14554i);
        out.writeInt(this.f14555j ? 1 : 0);
    }
}
