package X4;

import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    private int f12435a = -1;

    /* renamed from: b, reason: collision with root package name */
    private String f12436b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f12437c;

    /* renamed from: d, reason: collision with root package name */
    private int f12438d;

    public final void a(JSONObject jsonObject) {
        AbstractC3159y.i(jsonObject, "jsonObject");
        if (!jsonObject.isNull("id")) {
            this.f12435a = jsonObject.getInt("id");
        }
        if (!jsonObject.isNull("name")) {
            this.f12436b = jsonObject.getString("name");
        }
        if (!jsonObject.isNull("isChecked")) {
            this.f12437c = jsonObject.getBoolean("isChecked");
        }
        if (!jsonObject.isNull("isTurbo")) {
            this.f12438d = jsonObject.getInt("isTurbo");
        }
    }

    public final int b() {
        return this.f12435a;
    }

    public final String c() {
        return this.f12436b;
    }

    public final boolean d() {
        return this.f12437c;
    }

    public final boolean e() {
        if (this.f12438d == 1) {
            return true;
        }
        return false;
    }
}
