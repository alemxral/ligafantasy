package r3;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.paymentsheet.u;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final u.b f37586a;

    /* renamed from: b, reason: collision with root package name */
    private final C3686a f37587b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f37588c;

    /* renamed from: d, reason: collision with root package name */
    private final String f37589d;

    /* renamed from: e, reason: collision with root package name */
    private final d f37590e;

    /* renamed from: f, reason: collision with root package name */
    private final String f37591f;

    /* renamed from: g, reason: collision with root package name */
    private final String f37592g;

    /* renamed from: h, reason: collision with root package name */
    private final Set f37593h;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e createFromParcel(Parcel parcel) {
            C3686a createFromParcel;
            AbstractC3159y.i(parcel, "parcel");
            u.b createFromParcel2 = u.b.CREATOR.createFromParcel(parcel);
            d dVar = null;
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = C3686a.CREATOR.createFromParcel(parcel);
            }
            C3686a c3686a = createFromParcel;
            int readInt = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
            for (int i8 = 0; i8 != readInt; i8++) {
                linkedHashSet.add(parcel.readString());
            }
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                dVar = d.CREATOR.createFromParcel(parcel);
            }
            d dVar2 = dVar;
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            int readInt2 = parcel.readInt();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(readInt2);
            for (int i9 = 0; i9 != readInt2; i9++) {
                linkedHashSet2.add(parcel.readString());
            }
            return new e(createFromParcel2, c3686a, linkedHashSet, readString, dVar2, readString2, readString3, linkedHashSet2);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final e[] newArray(int i8) {
            return new e[i8];
        }
    }

    public e(u.b appearance, C3686a c3686a, Set allowedCountries, String str, d dVar, String str2, String str3, Set autocompleteCountries) {
        AbstractC3159y.i(appearance, "appearance");
        AbstractC3159y.i(allowedCountries, "allowedCountries");
        AbstractC3159y.i(autocompleteCountries, "autocompleteCountries");
        this.f37586a = appearance;
        this.f37587b = c3686a;
        this.f37588c = allowedCountries;
        this.f37589d = str;
        this.f37590e = dVar;
        this.f37591f = str2;
        this.f37592g = str3;
        this.f37593h = autocompleteCountries;
    }

    public final d b() {
        return this.f37590e;
    }

    public final C3686a c() {
        return this.f37587b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Set e() {
        return this.f37588c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (AbstractC3159y.d(this.f37586a, eVar.f37586a) && AbstractC3159y.d(this.f37587b, eVar.f37587b) && AbstractC3159y.d(this.f37588c, eVar.f37588c) && AbstractC3159y.d(this.f37589d, eVar.f37589d) && AbstractC3159y.d(this.f37590e, eVar.f37590e) && AbstractC3159y.d(this.f37591f, eVar.f37591f) && AbstractC3159y.d(this.f37592g, eVar.f37592g) && AbstractC3159y.d(this.f37593h, eVar.f37593h)) {
            return true;
        }
        return false;
    }

    public final u.b f() {
        return this.f37586a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = this.f37586a.hashCode() * 31;
        C3686a c3686a = this.f37587b;
        int i8 = 0;
        if (c3686a == null) {
            hashCode = 0;
        } else {
            hashCode = c3686a.hashCode();
        }
        int hashCode6 = (((hashCode5 + hashCode) * 31) + this.f37588c.hashCode()) * 31;
        String str = this.f37589d;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i9 = (hashCode6 + hashCode2) * 31;
        d dVar = this.f37590e;
        if (dVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = dVar.hashCode();
        }
        int i10 = (i9 + hashCode3) * 31;
        String str2 = this.f37591f;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int i11 = (i10 + hashCode4) * 31;
        String str3 = this.f37592g;
        if (str3 != null) {
            i8 = str3.hashCode();
        }
        return ((i11 + i8) * 31) + this.f37593h.hashCode();
    }

    public final Set i() {
        return this.f37593h;
    }

    public final String j() {
        return this.f37589d;
    }

    public final String k() {
        return this.f37592g;
    }

    public final String n() {
        return this.f37591f;
    }

    public String toString() {
        return "Configuration(appearance=" + this.f37586a + ", address=" + this.f37587b + ", allowedCountries=" + this.f37588c + ", buttonTitle=" + this.f37589d + ", additionalFields=" + this.f37590e + ", title=" + this.f37591f + ", googlePlacesApiKey=" + this.f37592g + ", autocompleteCountries=" + this.f37593h + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        this.f37586a.writeToParcel(out, i8);
        C3686a c3686a = this.f37587b;
        if (c3686a == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c3686a.writeToParcel(out, i8);
        }
        Set set = this.f37588c;
        out.writeInt(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            out.writeString((String) it.next());
        }
        out.writeString(this.f37589d);
        d dVar = this.f37590e;
        if (dVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            dVar.writeToParcel(out, i8);
        }
        out.writeString(this.f37591f);
        out.writeString(this.f37592g);
        Set set2 = this.f37593h;
        out.writeInt(set2.size());
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            out.writeString((String) it2.next());
        }
    }
}
