package H7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONArray;
import org.json.JSONObject;
import r5.AbstractC3689a;

/* loaded from: classes5.dex */
public final class j extends h {

    /* renamed from: e, reason: collision with root package name */
    public final List f3631e;

    /* renamed from: f, reason: collision with root package name */
    public final String f3632f;

    /* renamed from: g, reason: collision with root package name */
    public final String f3633g;

    /* renamed from: h, reason: collision with root package name */
    public final String f3634h;

    /* renamed from: i, reason: collision with root package name */
    public final String f3635i;

    /* renamed from: j, reason: collision with root package name */
    public final String f3636j;

    /* renamed from: k, reason: collision with root package name */
    public final String f3637k;

    /* renamed from: l, reason: collision with root package name */
    public final String f3638l;

    /* renamed from: m, reason: collision with root package name */
    public final String f3639m;

    public /* synthetic */ j(List list, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i8) {
        this((i8 & 1) != 0 ? new ArrayList() : list, (i8 & 2) != 0 ? null : str, (i8 & 4) != 0 ? null : str2, (i8 & 8) != 0 ? null : str3, (i8 & 16) != 0 ? null : str4, (i8 & 32) != 0 ? null : str5, (i8 & 64) != 0 ? null : str6, (i8 & 128) != 0 ? null : str7, (i8 & 256) == 0 ? str8 : null);
    }

    @Override // H7.h
    public String a() {
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f3631e.iterator();
        while (it.hasNext()) {
            arrayList.add(new JSONObject(((o) it.next()).a()));
        }
        jSONObject.put("userEvents", new JSONArray((Collection) arrayList));
        jSONObject.putOpt("acceptanceState", this.f3632f);
        jSONObject.putOpt("objectionState", this.f3633g);
        jSONObject.putOpt("tcData", this.f3634h);
        jSONObject.putOpt("gppData", this.f3635i);
        jSONObject.putOpt("state", this.f3636j);
        jSONObject.putOpt("jurisdiction", this.f3637k);
        jSONObject.putOpt("nonIabConsentData", this.f3638l);
        jSONObject.putOpt("uspData", this.f3639m);
        jSONObject.put("clientTimestamp", this.f3621a);
        jSONObject.put("operationType", this.f3622b.f3599a);
        jSONObject.putOpt("sessionId", this.f3623c);
        jSONObject.put("domain", this.f3624d);
        String jSONObject2 = jSONObject.toString();
        AbstractC3159y.h(jSONObject2, "JSONObject().apply {\n   … domain)\n    }.toString()");
        return jSONObject2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (AbstractC3159y.d(this.f3631e, jVar.f3631e) && AbstractC3159y.d(this.f3632f, jVar.f3632f) && AbstractC3159y.d(this.f3633g, jVar.f3633g) && AbstractC3159y.d(this.f3634h, jVar.f3634h) && AbstractC3159y.d(this.f3635i, jVar.f3635i) && AbstractC3159y.d(this.f3636j, jVar.f3636j) && AbstractC3159y.d(this.f3637k, jVar.f3637k) && AbstractC3159y.d(this.f3638l, jVar.f3638l) && AbstractC3159y.d(this.f3639m, jVar.f3639m)) {
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
        int hashCode7;
        int hashCode8 = this.f3631e.hashCode() * 31;
        String str = this.f3632f;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (hashCode8 + hashCode) * 31;
        String str2 = this.f3633g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        String str3 = this.f3634h;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        String str4 = this.f3635i;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        String str5 = this.f3636j;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        String str6 = this.f3637k;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i14 = (i13 + hashCode6) * 31;
        String str7 = this.f3638l;
        if (str7 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str7.hashCode();
        }
        int i15 = (i14 + hashCode7) * 31;
        String str8 = this.f3639m;
        if (str8 != null) {
            i8 = str8.hashCode();
        }
        return i15 + i8;
    }

    public String toString() {
        StringBuilder a8 = AbstractC3689a.a("TrackingUserDoneLog(userEvents=");
        a8.append(this.f3631e);
        a8.append(", acceptanceState=");
        a8.append((Object) this.f3632f);
        a8.append(", objectionState=");
        a8.append((Object) this.f3633g);
        a8.append(", tcData=");
        a8.append((Object) this.f3634h);
        a8.append(", gppData=");
        a8.append((Object) this.f3635i);
        a8.append(", state=");
        a8.append((Object) this.f3636j);
        a8.append(", jurisdiction=");
        a8.append((Object) this.f3637k);
        a8.append(", nonIabConsentData=");
        a8.append((Object) this.f3638l);
        a8.append(", uspData=");
        a8.append((Object) this.f3639m);
        a8.append(')');
        return a8.toString();
    }

    public j(List userEvents, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        AbstractC3159y.i(userEvents, "userEvents");
        this.f3631e = userEvents;
        this.f3632f = str;
        this.f3633g = str2;
        this.f3634h = str3;
        this.f3635i = str4;
        this.f3636j = str5;
        this.f3637k = str6;
        this.f3638l = str7;
        this.f3639m = str8;
    }
}
