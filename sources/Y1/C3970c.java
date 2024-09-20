package y1;

import org.json.JSONObject;

/* renamed from: y1.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3970c {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC3978k f39658a;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC3978k f39659b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f39660c;

    /* renamed from: d, reason: collision with root package name */
    private final EnumC3973f f39661d;

    /* renamed from: e, reason: collision with root package name */
    private final EnumC3976i f39662e;

    private C3970c(EnumC3973f enumC3973f, EnumC3976i enumC3976i, EnumC3978k enumC3978k, EnumC3978k enumC3978k2, boolean z8) {
        this.f39661d = enumC3973f;
        this.f39662e = enumC3976i;
        this.f39658a = enumC3978k;
        if (enumC3978k2 == null) {
            this.f39659b = EnumC3978k.NONE;
        } else {
            this.f39659b = enumC3978k2;
        }
        this.f39660c = z8;
    }

    public static C3970c a(EnumC3973f enumC3973f, EnumC3976i enumC3976i, EnumC3978k enumC3978k, EnumC3978k enumC3978k2, boolean z8) {
        E1.g.b(enumC3973f, "CreativeType is null");
        E1.g.b(enumC3976i, "ImpressionType is null");
        E1.g.b(enumC3978k, "Impression owner is null");
        E1.g.e(enumC3978k, enumC3973f, enumC3976i);
        return new C3970c(enumC3973f, enumC3976i, enumC3978k, enumC3978k2, z8);
    }

    public boolean b() {
        if (EnumC3978k.NATIVE == this.f39658a) {
            return true;
        }
        return false;
    }

    public boolean c() {
        if (EnumC3978k.NATIVE == this.f39659b) {
            return true;
        }
        return false;
    }

    public JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        E1.c.h(jSONObject, "impressionOwner", this.f39658a);
        E1.c.h(jSONObject, "mediaEventsOwner", this.f39659b);
        E1.c.h(jSONObject, "creativeType", this.f39661d);
        E1.c.h(jSONObject, "impressionType", this.f39662e);
        E1.c.h(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.f39660c));
        return jSONObject;
    }
}
