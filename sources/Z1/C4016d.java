package z1;

import E1.g;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: z1.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4016d {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f40041a;

    /* renamed from: b, reason: collision with root package name */
    private final Float f40042b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f40043c;

    /* renamed from: d, reason: collision with root package name */
    private final EnumC4015c f40044d;

    private C4016d(boolean z8, Float f8, boolean z9, EnumC4015c enumC4015c) {
        this.f40041a = z8;
        this.f40042b = f8;
        this.f40043c = z9;
        this.f40044d = enumC4015c;
    }

    public static C4016d b(boolean z8, EnumC4015c enumC4015c) {
        g.b(enumC4015c, "Position is null");
        return new C4016d(false, null, z8, enumC4015c);
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f40041a);
            if (this.f40041a) {
                jSONObject.put("skipOffset", this.f40042b);
            }
            jSONObject.put("autoPlay", this.f40043c);
            jSONObject.put("position", this.f40044d);
        } catch (JSONException e8) {
            E1.d.b("VastProperties: JSON error", e8);
        }
        return jSONObject;
    }
}
