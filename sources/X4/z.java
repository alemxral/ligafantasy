package X4;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class z implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private String f12728a;

    /* renamed from: b, reason: collision with root package name */
    private long f12729b;

    /* renamed from: c, reason: collision with root package name */
    private String f12730c;

    /* renamed from: d, reason: collision with root package name */
    private long f12731d;

    /* renamed from: e, reason: collision with root package name */
    private String f12732e;

    /* renamed from: f, reason: collision with root package name */
    private String f12733f;

    /* renamed from: g, reason: collision with root package name */
    private String f12734g;

    /* renamed from: h, reason: collision with root package name */
    public static final b f12727h = new b(null);
    public static Parcelable.Creator<z> CREATOR = new a();

    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public z createFromParcel(Parcel source) {
            AbstractC3159y.i(source, "source");
            return new z(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public z[] newArray(int i8) {
            return new z[i8];
        }
    }

    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public final ArrayList a(String sJson) {
            int i8;
            JSONArray jSONArray;
            AbstractC3159y.i(sJson, "sJson");
            ArrayList arrayList = null;
            try {
                JSONObject jSONObject = new JSONObject(sJson);
                if (!jSONObject.isNull("success")) {
                    i8 = jSONObject.optInt("success", 0);
                } else {
                    i8 = 1;
                }
                if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                    jSONArray = jSONObject.optJSONArray(DataSchemeDataSource.SCHEME_DATA);
                } else {
                    jSONArray = null;
                }
                if (i8 != 1 || jSONArray == null) {
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                try {
                    int length = jSONArray.length();
                    for (int i9 = 0; i9 < length; i9++) {
                        z zVar = new z();
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i9);
                        if (!jSONObject2.isNull("fileID")) {
                            zVar.n(jSONObject2.getString("fileID"));
                        }
                        if (!jSONObject2.isNull("version")) {
                            zVar.I(jSONObject2.getString("version"));
                        }
                        if (!jSONObject2.isNull("versionCode")) {
                            zVar.G(jSONObject2.getLong("versionCode"));
                        }
                        if (!jSONObject2.isNull("sizeInBytes")) {
                            zVar.z(jSONObject2.getLong("sizeInBytes"));
                        }
                        if (!jSONObject2.isNull("minSDKVersion")) {
                            zVar.u(jSONObject2.getString("minSDKVersion"));
                        }
                        if (!jSONObject2.isNull("lastUpdate")) {
                            zVar.s(jSONObject2.getString("lastUpdate"));
                        }
                        if (!jSONObject2.isNull("fileType")) {
                            zVar.o(jSONObject2.getString("fileType"));
                        }
                        arrayList2.add(zVar);
                    }
                    return arrayList2;
                } catch (Exception e8) {
                    arrayList = arrayList2;
                    e = e8;
                    e.printStackTrace();
                    return arrayList;
                }
            } catch (Exception e9) {
                e = e9;
            }
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public z() {
        this.f12729b = -1L;
        this.f12731d = -1L;
    }

    public final void G(long j8) {
        this.f12731d = j8;
    }

    public final void I(String str) {
        this.f12728a = str;
    }

    public final String b() {
        return this.f12734g;
    }

    public final String c() {
        return this.f12733f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return hashCode();
    }

    public final String e() {
        return this.f12730c;
    }

    public final String f() {
        return this.f12732e;
    }

    public final long i() {
        return this.f12729b;
    }

    public final long j() {
        return this.f12731d;
    }

    public final String k() {
        return this.f12728a;
    }

    public final void n(String str) {
        this.f12734g = str;
    }

    public final void o(String str) {
        this.f12733f = str;
    }

    public final void s(String str) {
        this.f12730c = str;
    }

    public final void u(String str) {
        this.f12732e = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        AbstractC3159y.i(parcel, "parcel");
        parcel.writeString(this.f12728a);
        parcel.writeString(this.f12730c);
        parcel.writeLong(this.f12731d);
        parcel.writeString(this.f12732e);
        parcel.writeString(this.f12733f);
        parcel.writeString(this.f12734g);
        parcel.writeLong(this.f12729b);
    }

    public final void z(long j8) {
        this.f12729b = j8;
    }

    public z(Parcel source) {
        AbstractC3159y.i(source, "source");
        this.f12729b = -1L;
        this.f12731d = -1L;
        this.f12728a = source.readString();
        this.f12730c = source.readString();
        this.f12731d = source.readLong();
        this.f12732e = source.readString();
        this.f12733f = source.readString();
        this.f12734g = source.readString();
        this.f12729b = source.readLong();
    }
}
