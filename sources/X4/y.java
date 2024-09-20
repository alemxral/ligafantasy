package X4;

import android.content.Context;
import android.database.Cursor;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3326n;

/* loaded from: classes5.dex */
public final class y {

    /* renamed from: g, reason: collision with root package name */
    public static final a f12720g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private int f12721a = -1;

    /* renamed from: b, reason: collision with root package name */
    private String f12722b;

    /* renamed from: c, reason: collision with root package name */
    private String f12723c;

    /* renamed from: d, reason: collision with root package name */
    private String f12724d;

    /* renamed from: e, reason: collision with root package name */
    private String f12725e;

    /* renamed from: f, reason: collision with root package name */
    private String f12726f;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final y a(Context context) {
            AbstractC3159y.i(context, "context");
            C3326n a8 = C3326n.f34490t.a(context);
            a8.a();
            y h02 = a8.h0();
            a8.g();
            return h02;
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public final String a() {
        return this.f12725e;
    }

    public final String b() {
        return this.f12726f;
    }

    public final int c() {
        return this.f12721a;
    }

    public final String d() {
        return this.f12724d;
    }

    public final String e() {
        return this.f12722b;
    }

    public final String f() {
        return this.f12723c;
    }

    public final void g(Cursor c8) {
        AbstractC3159y.i(c8, "c");
        this.f12721a = c8.getInt(0);
        this.f12722b = c8.getString(1);
        this.f12723c = c8.getString(2);
        this.f12724d = c8.getString(3);
        this.f12725e = c8.getString(4);
        this.f12726f = c8.getString(5);
    }

    public final void h(Context context) {
        AbstractC3159y.i(context, "context");
        C3326n a8 = C3326n.f34490t.a(context);
        a8.a();
        a8.J0(this);
        if (a8.h() > 100) {
            a8.J(100);
        }
        a8.g();
    }

    public final void i(String str) {
        this.f12725e = str;
    }

    public final void j(String str) {
        this.f12726f = str;
    }

    public final void k(String str) {
        this.f12724d = str;
    }

    public final void l(String str) {
        this.f12722b = str;
    }

    public final void m(String str) {
        this.f12723c = str;
    }

    public String toString() {
        return "NotificationRegistry(\nid=" + this.f12721a + ",\ntimestamp=" + this.f12722b + ", \ntitle=" + this.f12723c + ", \nmsg=" + this.f12724d + ", \nactions=" + this.f12725e + ", \nextraInfo=" + this.f12726f + "\n)";
    }
}
