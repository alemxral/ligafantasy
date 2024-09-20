package X4;

import android.content.Context;
import android.database.Cursor;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3326n;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class D {

    /* renamed from: f, reason: collision with root package name */
    public static final a f12322f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private long f12323a;

    /* renamed from: b, reason: collision with root package name */
    private String f12324b;

    /* renamed from: c, reason: collision with root package name */
    private String f12325c;

    /* renamed from: d, reason: collision with root package name */
    private String f12326d;

    /* renamed from: e, reason: collision with root package name */
    private int f12327e;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final void a(Context context) {
            AbstractC3159y.i(context, "context");
            C3326n a8 = C3326n.f34490t.a(context);
            a8.a();
            a8.a1();
            a8.g();
        }

        public final D b(JSONObject jsonObjectData) {
            AbstractC3159y.i(jsonObjectData, "jsonObjectData");
            D d8 = new D();
            d8.g(jsonObjectData);
            return d8;
        }

        public final D c(Cursor c8) {
            AbstractC3159y.i(c8, "c");
            D d8 = new D();
            d8.j(c8.getLong(0));
            return d8;
        }

        public final D d(Cursor c8) {
            AbstractC3159y.i(c8, "c");
            D d8 = new D();
            d8.j(c8.getLong(0));
            d8.l(c8.getString(1));
            d8.k(c8.getString(2));
            d8.n(c8.getString(3));
            d8.m(c8.getInt(4));
            return d8;
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public D() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(JSONObject jSONObject) {
        if (!jSONObject.isNull("appID")) {
            this.f12323a = jSONObject.getLong("appID");
        }
        if (!jSONObject.isNull("name")) {
            this.f12324b = jSONObject.getString("name");
        }
        if (!jSONObject.isNull("iconURL")) {
            this.f12325c = jSONObject.getString("iconURL");
        }
        if (!jSONObject.isNull("expireDate")) {
            this.f12326d = jSONObject.getString("expireDate");
        }
    }

    public final long b() {
        return this.f12323a;
    }

    public final String c() {
        return this.f12325c;
    }

    public final String d() {
        return this.f12324b;
    }

    public final String e() {
        return this.f12326d;
    }

    public final void f(Cursor c8) {
        AbstractC3159y.i(c8, "c");
        this.f12323a = c8.getLong(0);
    }

    public final void h(Context context) {
        AbstractC3159y.i(context, "context");
        C3326n a8 = C3326n.f34490t.a(context);
        a8.a();
        if (a8.n0(this.f12323a) == null) {
            a8.L0(this);
        }
        a8.g();
    }

    public final void i(Context context) {
        AbstractC3159y.i(context, "context");
        C3326n a8 = C3326n.f34490t.a(context);
        a8.a();
        a8.b1(this.f12323a);
        a8.g();
    }

    public final void j(long j8) {
        this.f12323a = j8;
    }

    public final void k(String str) {
        this.f12325c = str;
    }

    public final void l(String str) {
        this.f12324b = str;
    }

    public final void m(int i8) {
        this.f12327e = i8;
    }

    public final void n(String str) {
        this.f12326d = str;
    }

    public String toString() {
        return "PreRegister(appID=" + this.f12323a + ", notified=" + this.f12327e + ')';
    }

    public D(long j8, String name, String str, String str2) {
        AbstractC3159y.i(name, "name");
        this.f12323a = j8;
        this.f12324b = name;
        this.f12325c = str;
        this.f12326d = str2;
    }
}
