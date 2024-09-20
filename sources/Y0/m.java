package y0;

import R.AbstractC1317n;
import R.AbstractC1319p;
import R.C1321s;
import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final String f39650a;

    /* renamed from: b, reason: collision with root package name */
    private final String f39651b;

    /* renamed from: c, reason: collision with root package name */
    private final String f39652c;

    /* renamed from: d, reason: collision with root package name */
    private final String f39653d;

    /* renamed from: e, reason: collision with root package name */
    private final String f39654e;

    /* renamed from: f, reason: collision with root package name */
    private final String f39655f;

    /* renamed from: g, reason: collision with root package name */
    private final String f39656g;

    private m(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AbstractC1319p.p(!W.n.a(str), "ApplicationId must be set.");
        this.f39651b = str;
        this.f39650a = str2;
        this.f39652c = str3;
        this.f39653d = str4;
        this.f39654e = str5;
        this.f39655f = str6;
        this.f39656g = str7;
    }

    public static m a(Context context) {
        C1321s c1321s = new C1321s(context);
        String a8 = c1321s.a("google_app_id");
        if (TextUtils.isEmpty(a8)) {
            return null;
        }
        return new m(a8, c1321s.a("google_api_key"), c1321s.a("firebase_database_url"), c1321s.a("ga_trackingId"), c1321s.a("gcm_defaultSenderId"), c1321s.a("google_storage_bucket"), c1321s.a("project_id"));
    }

    public String b() {
        return this.f39650a;
    }

    public String c() {
        return this.f39651b;
    }

    public String d() {
        return this.f39654e;
    }

    public String e() {
        return this.f39656g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (!AbstractC1317n.a(this.f39651b, mVar.f39651b) || !AbstractC1317n.a(this.f39650a, mVar.f39650a) || !AbstractC1317n.a(this.f39652c, mVar.f39652c) || !AbstractC1317n.a(this.f39653d, mVar.f39653d) || !AbstractC1317n.a(this.f39654e, mVar.f39654e) || !AbstractC1317n.a(this.f39655f, mVar.f39655f) || !AbstractC1317n.a(this.f39656g, mVar.f39656g)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AbstractC1317n.b(this.f39651b, this.f39650a, this.f39652c, this.f39653d, this.f39654e, this.f39655f, this.f39656g);
    }

    public String toString() {
        return AbstractC1317n.c(this).a("applicationId", this.f39651b).a("apiKey", this.f39650a).a("databaseUrl", this.f39652c).a("gcmSenderId", this.f39654e).a("storageBucket", this.f39655f).a("projectId", this.f39656g).toString();
    }
}
