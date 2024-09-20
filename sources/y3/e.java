package Y3;

import M5.AbstractC1246t;
import M5.N;
import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import d6.i;
import d6.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class e implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f13144a;

    /* renamed from: b, reason: collision with root package name */
    private final String f13145b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f13146c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f13147d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f13142e = new a(null);
    public static final Parcelable.Creator<e> CREATOR = new b();

    /* renamed from: f, reason: collision with root package name */
    private static final List f13143f = AbstractC1246t.m();

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        private final e a(JSONObject jSONObject) {
            String optString = jSONObject.optString("name");
            if (optString.length() <= 64) {
                String optString2 = jSONObject.optString("id");
                if (optString2.length() <= 64) {
                    HashMap hashMap = new HashMap();
                    JSONObject optJSONObject = jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
                    if (optJSONObject != null) {
                        Iterator<String> keys = optJSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            String optString3 = optJSONObject.optString(next);
                            if (optString3.length() <= 8059) {
                                AbstractC3159y.f(next);
                                AbstractC3159y.f(optString3);
                                hashMap.put(next, optString3);
                            } else {
                                throw c.f13119d.a("messageExtension.data.value");
                            }
                        }
                    }
                    AbstractC3159y.f(optString);
                    AbstractC3159y.f(optString2);
                    return new e(optString, optString2, jSONObject.optBoolean("criticalityIndicator"), hashMap);
                }
                throw c.f13119d.a("messageExtension.id");
            }
            throw c.f13119d.a("messageExtension.name");
        }

        public final List b(JSONArray jSONArray) {
            if (jSONArray == null) {
                return null;
            }
            i s8 = m.s(0, jSONArray.length());
            ArrayList arrayList = new ArrayList();
            Iterator it = s8.iterator();
            while (it.hasNext()) {
                JSONObject optJSONObject = jSONArray.optJSONObject(((N) it).nextInt());
                if (optJSONObject != null) {
                    arrayList.add(optJSONObject);
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC1246t.x(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(e.f13142e.a((JSONObject) it2.next()));
            }
            if (arrayList2.size() <= 10) {
                return arrayList2;
            }
            throw c.f13119d.a("messageExtensions");
        }

        public final JSONArray c(List list) {
            if (list == null) {
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(((e) it.next()).e());
            }
            return jSONArray;
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e createFromParcel(Parcel parcel) {
            boolean z8;
            AbstractC3159y.i(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            for (int i8 = 0; i8 != readInt; i8++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            return new e(readString, readString2, z8, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final e[] newArray(int i8) {
            return new e[i8];
        }
    }

    public e(String name, String id, boolean z8, Map data) {
        AbstractC3159y.i(name, "name");
        AbstractC3159y.i(id, "id");
        AbstractC3159y.i(data, "data");
        this.f13144a = name;
        this.f13145b = id;
        this.f13146c = z8;
        this.f13147d = data;
    }

    public final boolean b() {
        return this.f13146c;
    }

    public final boolean c() {
        return f13143f.contains(this.f13144a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final JSONObject e() {
        JSONObject put = new JSONObject().put("name", this.f13144a).put("id", this.f13145b).put("criticalityIndicator", this.f13146c).put(DataSchemeDataSource.SCHEME_DATA, new JSONObject(this.f13147d));
        AbstractC3159y.h(put, "put(...)");
        return put;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (AbstractC3159y.d(this.f13144a, eVar.f13144a) && AbstractC3159y.d(this.f13145b, eVar.f13145b) && this.f13146c == eVar.f13146c && AbstractC3159y.d(this.f13147d, eVar.f13147d)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f13144a.hashCode() * 31) + this.f13145b.hashCode()) * 31;
        boolean z8 = this.f13146c;
        int i8 = z8;
        if (z8 != 0) {
            i8 = 1;
        }
        return ((hashCode + i8) * 31) + this.f13147d.hashCode();
    }

    public String toString() {
        return "MessageExtension(name=" + this.f13144a + ", id=" + this.f13145b + ", criticalityIndicator=" + this.f13146c + ", data=" + this.f13147d + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f13144a);
        out.writeString(this.f13145b);
        out.writeInt(this.f13146c ? 1 : 0);
        Map map = this.f13147d;
        out.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            out.writeString((String) entry.getKey());
            out.writeString((String) entry.getValue());
        }
    }
}
