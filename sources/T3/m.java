package T3;

import T3.q;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.os.BundleCompat;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class m implements q, Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private p f9986a;

    /* renamed from: b, reason: collision with root package name */
    private d f9987b;

    /* renamed from: c, reason: collision with root package name */
    private o f9988c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f9989d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f9990e;

    /* renamed from: f, reason: collision with root package name */
    private String f9991f;

    /* loaded from: classes4.dex */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public m createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public m[] newArray(int i8) {
            return new m[i8];
        }
    }

    private boolean j(m mVar) {
        if (Z3.c.a(this.f9986a, mVar.f9986a) && Z3.c.a(this.f9991f, mVar.f9991f) && Z3.c.a(this.f9987b, mVar.f9987b) && Z3.c.a(this.f9988c, mVar.f9988c) && Z3.c.a(this.f9989d, mVar.f9989d) && Z3.c.a(this.f9990e, mVar.f9990e)) {
            return true;
        }
        return false;
    }

    @Override // T3.q
    public b b(q.a aVar) {
        return (b) this.f9989d.get(aVar);
    }

    @Override // T3.q
    public d c() {
        return this.f9987b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // T3.q
    public o e() {
        return this.f9988c;
    }

    public boolean equals(Object obj) {
        if (this != obj && (!(obj instanceof m) || !j((m) obj))) {
            return false;
        }
        return true;
    }

    @Override // T3.q
    public String f() {
        return this.f9991f;
    }

    public int hashCode() {
        return Z3.c.b(this.f9986a, this.f9991f, this.f9987b, this.f9988c, this.f9989d, this.f9990e);
    }

    public p i() {
        return this.f9986a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.f9991f);
        parcel.writeParcelable((k) this.f9986a, 0);
        parcel.writeParcelable((g) this.f9987b, 0);
        parcel.writeParcelable((i) this.f9988c, 0);
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f9989d.entrySet()) {
            bundle.putParcelable(((q.a) entry.getKey()).name(), (e) entry.getValue());
        }
        parcel.writeBundle(bundle);
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry2 : this.f9990e.entrySet()) {
            bundle2.putParcelable((String) entry2.getKey(), (e) entry2.getValue());
        }
        parcel.writeBundle(bundle2);
    }

    public m() {
        this.f9989d = new EnumMap(q.a.class);
        this.f9990e = new HashMap();
    }

    private m(Parcel parcel) {
        this.f9991f = parcel.readString();
        this.f9986a = (p) parcel.readParcelable(k.class.getClassLoader());
        this.f9987b = (d) parcel.readParcelable(g.class.getClassLoader());
        this.f9988c = (o) parcel.readParcelable(i.class.getClassLoader());
        this.f9989d = new HashMap();
        Bundle readBundle = parcel.readBundle(m.class.getClassLoader());
        if (readBundle != null) {
            for (String str : readBundle.keySet()) {
                b bVar = (b) BundleCompat.getParcelable(readBundle, str, b.class);
                if (bVar != null) {
                    this.f9989d.put(q.a.valueOf(str), bVar);
                }
            }
        }
        this.f9990e = new HashMap();
        Bundle readBundle2 = parcel.readBundle(m.class.getClassLoader());
        if (readBundle2 != null) {
            for (String str2 : readBundle2.keySet()) {
                b bVar2 = (b) BundleCompat.getParcelable(readBundle2, str2, b.class);
                if (bVar2 != null) {
                    this.f9990e.put(str2, bVar2);
                }
            }
        }
    }
}
