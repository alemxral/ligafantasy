package y1;

import java.net.URL;
import org.json.JSONObject;

/* renamed from: y1.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3980m {

    /* renamed from: a, reason: collision with root package name */
    private final String f39713a;

    /* renamed from: b, reason: collision with root package name */
    private final URL f39714b;

    /* renamed from: c, reason: collision with root package name */
    private final String f39715c;

    private C3980m(String str, URL url, String str2) {
        this.f39713a = str;
        this.f39714b = url;
        this.f39715c = str2;
    }

    public static C3980m a(String str, URL url, String str2) {
        E1.g.d(str, "VendorKey is null or empty");
        E1.g.b(url, "ResourceURL is null");
        E1.g.d(str2, "VerificationParameters is null or empty");
        return new C3980m(str, url, str2);
    }

    public static C3980m b(URL url) {
        E1.g.b(url, "ResourceURL is null");
        return new C3980m(null, url, null);
    }

    public URL c() {
        return this.f39714b;
    }

    public String d() {
        return this.f39713a;
    }

    public String e() {
        return this.f39715c;
    }

    public JSONObject f() {
        JSONObject jSONObject = new JSONObject();
        E1.c.h(jSONObject, "vendorKey", this.f39713a);
        E1.c.h(jSONObject, "resourceUrl", this.f39714b.toString());
        E1.c.h(jSONObject, "verificationParameters", this.f39715c);
        return jSONObject;
    }
}
