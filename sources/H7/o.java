package H7;

import androidx.core.app.NotificationCompat;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONObject;
import r5.AbstractC3689a;

/* loaded from: classes5.dex */
public final class o extends h {

    /* renamed from: e, reason: collision with root package name */
    public long f3676e;

    /* renamed from: f, reason: collision with root package name */
    public final String f3677f;

    public o(long j8, String event) {
        AbstractC3159y.i(event, "event");
        this.f3676e = j8;
        this.f3677f = event;
    }

    @Override // H7.h
    public String a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("clientTimestamp", Long.valueOf(this.f3676e));
        jSONObject.put(NotificationCompat.CATEGORY_EVENT, this.f3677f);
        jSONObject.putOpt("sessionId", this.f3623c);
        String jSONObject2 = jSONObject.toString();
        AbstractC3159y.h(jSONObject2, "JSONObject().apply {\n   …ssionId)\n    }.toString()");
        return jSONObject2;
    }

    @Override // H7.h
    public void b(long j8) {
        this.f3676e = j8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f3676e == oVar.f3676e && AbstractC3159y.d(this.f3677f, oVar.f3677f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f3677f.hashCode() + (androidx.collection.a.a(this.f3676e) * 31);
    }

    public String toString() {
        StringBuilder a8 = AbstractC3689a.a("UserEvent(clientTimestamp=");
        a8.append(this.f3676e);
        a8.append(", event=");
        a8.append(this.f3677f);
        a8.append(')');
        return a8.toString();
    }
}
