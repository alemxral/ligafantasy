package X4;

import com.uptodown.UptodownApp;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONObject;

/* renamed from: X4.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1499i {

    /* renamed from: f, reason: collision with root package name */
    public static final a f12611f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private long f12612a;

    /* renamed from: b, reason: collision with root package name */
    private String f12613b;

    /* renamed from: c, reason: collision with root package name */
    private int f12614c;

    /* renamed from: d, reason: collision with root package name */
    private String f12615d;

    /* renamed from: e, reason: collision with root package name */
    private int f12616e;

    /* renamed from: X4.i$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final C1499i a(JSONObject jsonObjectData) {
            AbstractC3159y.i(jsonObjectData, "jsonObjectData");
            C1499i c1499i = new C1499i();
            c1499i.g(jsonObjectData);
            return c1499i;
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(JSONObject jSONObject) {
        if (!jSONObject.isNull("id")) {
            this.f12612a = jSONObject.getLong("id");
        }
        if (!jSONObject.isNull("sha256")) {
            this.f12613b = jSONObject.getString("sha256");
        }
        if (!jSONObject.isNull("active")) {
            this.f12614c = jSONObject.getInt("active");
        }
        if (!jSONObject.isNull("url")) {
            this.f12615d = jSONObject.getString("url");
        }
        if (!jSONObject.isNull("isTurbo")) {
            this.f12616e = jSONObject.getInt("isTurbo");
        }
    }

    public final int b() {
        return this.f12614c;
    }

    public final String c() {
        if (this.f12615d != null) {
            return this.f12615d + UptodownApp.f27990B.t() + ":webp";
        }
        return null;
    }

    public final long d() {
        return this.f12612a;
    }

    public final String e() {
        return this.f12615d;
    }

    public final boolean f() {
        if (this.f12616e == 1) {
            return true;
        }
        return false;
    }
}
