package H7;

import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONObject;
import r5.AbstractC3689a;
import y5.t;

/* loaded from: classes5.dex */
public final class i extends h {

    /* renamed from: e, reason: collision with root package name */
    public final String f3625e;

    /* renamed from: f, reason: collision with root package name */
    public final String f3626f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3627g;

    /* renamed from: h, reason: collision with root package name */
    public final String f3628h;

    /* renamed from: i, reason: collision with root package name */
    public final String f3629i;

    /* renamed from: j, reason: collision with root package name */
    public final String f3630j;

    public i(String accountId, String publisher, int i8, String cmpVersion, String displayType, String configurationHashCode) {
        AbstractC3159y.i(accountId, "accountId");
        AbstractC3159y.i(publisher, "publisher");
        AbstractC3159y.i(cmpVersion, "cmpVersion");
        AbstractC3159y.i(displayType, "displayType");
        AbstractC3159y.i(configurationHashCode, "configurationHashCode");
        this.f3625e = accountId;
        this.f3626f = publisher;
        this.f3627g = i8;
        this.f3628h = cmpVersion;
        this.f3629i = displayType;
        this.f3630j = configurationHashCode;
    }

    @Override // H7.h
    public String a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("accountId", this.f3625e);
        jSONObject.put("publisher", this.f3626f);
        jSONObject.put("cmpId", this.f3627g);
        jSONObject.put("cmpVersion", this.f3628h);
        jSONObject.put("displayType", this.f3629i);
        jSONObject.put("configurationHashCode", this.f3630j);
        jSONObject.put("clientTimestamp", this.f3621a);
        jSONObject.put("operationType", this.f3622b.f3599a);
        jSONObject.put("sessionId", this.f3623c);
        jSONObject.put("domain", this.f3624d);
        String jSONObject2 = jSONObject.toString();
        AbstractC3159y.h(jSONObject2, "JSONObject().apply {\n   … domain)\n    }.toString()");
        return jSONObject2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (AbstractC3159y.d(this.f3625e, iVar.f3625e) && AbstractC3159y.d(this.f3626f, iVar.f3626f) && this.f3627g == iVar.f3627g && AbstractC3159y.d(this.f3628h, iVar.f3628h) && AbstractC3159y.d(this.f3629i, iVar.f3629i) && AbstractC3159y.d(this.f3630j, iVar.f3630j)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f3630j.hashCode() + t.a(this.f3629i, t.a(this.f3628h, C6.k.a(this.f3627g, t.a(this.f3626f, this.f3625e.hashCode() * 31, 31), 31), 31), 31);
    }

    public String toString() {
        StringBuilder a8 = AbstractC3689a.a("TrackingInitLog(accountId=");
        a8.append(this.f3625e);
        a8.append(", publisher=");
        a8.append(this.f3626f);
        a8.append(", cmpId=");
        a8.append(this.f3627g);
        a8.append(", cmpVersion=");
        a8.append(this.f3628h);
        a8.append(", displayType=");
        a8.append(this.f3629i);
        a8.append(", configurationHashCode=");
        a8.append(this.f3630j);
        a8.append(')');
        return a8.toString();
    }
}
