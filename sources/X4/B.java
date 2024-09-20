package X4;

import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    private String f12318a;

    /* renamed from: b, reason: collision with root package name */
    private String f12319b;

    public final void a(JSONObject jsonObject) {
        AbstractC3159y.i(jsonObject, "jsonObject");
        if (!jsonObject.isNull("permission")) {
            this.f12318a = jsonObject.getString("permission");
        }
        if (!jsonObject.isNull("description")) {
            this.f12319b = jsonObject.getString("description");
        }
    }

    public final String b() {
        return this.f12318a;
    }

    public final void c(String str) {
        this.f12319b = str;
    }

    public final void d(String str) {
        this.f12318a = str;
    }
}
