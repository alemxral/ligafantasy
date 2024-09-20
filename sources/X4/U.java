package X4;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3326n;
import l5.C3330r;

/* loaded from: classes5.dex */
public final class U {

    /* renamed from: h, reason: collision with root package name */
    public static final a f12442h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private long f12443a;

    /* renamed from: b, reason: collision with root package name */
    private long f12444b;

    /* renamed from: c, reason: collision with root package name */
    private String f12445c;

    /* renamed from: d, reason: collision with root package name */
    private String f12446d;

    /* renamed from: e, reason: collision with root package name */
    private String f12447e;

    /* renamed from: f, reason: collision with root package name */
    private int f12448f;

    /* renamed from: g, reason: collision with root package name */
    private String f12449g;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final U a(Cursor c8) {
            AbstractC3159y.i(c8, "c");
            U u8 = new U();
            u8.n(c8.getLong(0));
            u8.j(c8.getLong(1));
            u8.o(c8.getString(2));
            u8.m(c8.getString(3));
            u8.p(c8.getString(4));
            u8.k(c8.getInt(5));
            return u8;
        }

        public final U b(Cursor c8) {
            AbstractC3159y.i(c8, "c");
            U u8 = new U();
            u8.n(c8.getLong(0));
            u8.j(c8.getLong(1));
            u8.o(c8.getString(2));
            u8.m(c8.getString(3));
            u8.p(c8.getString(4));
            return u8;
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public U(long j8, String name, String str, String str2, boolean z8) {
        AbstractC3159y.i(name, "name");
        this.f12443a = -1L;
        this.f12444b = j8;
        this.f12445c = name;
        this.f12446d = str;
        this.f12447e = str2;
        this.f12448f = z8 ? 1 : 0;
    }

    public final long a() {
        return this.f12444b;
    }

    public final int b() {
        return this.f12448f;
    }

    public final String c() {
        return this.f12449g;
    }

    public final String d() {
        return this.f12446d;
    }

    public final String e() {
        return this.f12445c;
    }

    public final String f() {
        return this.f12447e;
    }

    public final void g(Cursor c8) {
        AbstractC3159y.i(c8, "c");
        this.f12443a = c8.getLong(0);
        this.f12444b = c8.getLong(1);
        this.f12445c = c8.getString(2);
        this.f12446d = c8.getString(3);
        this.f12447e = c8.getString(4);
    }

    public final void h(Context context) {
        AbstractC3159y.i(context, "context");
        C3326n a8 = C3326n.f34490t.a(context);
        a8.a();
        if (a8.x0(this.f12444b) == null) {
            a8.P0(this);
            Bundle bundle = new Bundle();
            bundle.putString("type", "added");
            new C3330r(context).b("wishlist", bundle);
        }
        a8.g();
    }

    public final void i(Context context) {
        AbstractC3159y.i(context, "context");
        C3326n a8 = C3326n.f34490t.a(context);
        a8.a();
        a8.d1(this.f12444b);
        Bundle bundle = new Bundle();
        bundle.putString("type", "removed");
        new C3330r(context).b("wishlist", bundle);
        a8.g();
    }

    public final void j(long j8) {
        this.f12444b = j8;
    }

    public final void k(int i8) {
        this.f12448f = i8;
    }

    public final void l(String str) {
        this.f12449g = str;
    }

    public final void m(String str) {
        this.f12446d = str;
    }

    public final void n(long j8) {
        this.f12443a = j8;
    }

    public final void o(String str) {
        this.f12445c = str;
    }

    public final void p(String str) {
        this.f12447e = str;
    }

    public final void q(Context context, int i8) {
        AbstractC3159y.i(context, "context");
        C3326n a8 = C3326n.f34490t.a(context);
        a8.a();
        this.f12448f = i8;
        a8.w1(this.f12444b, i8);
        a8.g();
    }

    public String toString() {
        return "Wishlist(id=" + this.f12443a + ", programId=" + this.f12444b + ", name=" + this.f12445c + ", icon=" + this.f12446d + ", packagename=" + this.f12447e + ')';
    }

    public U() {
        this.f12443a = -1L;
        this.f12448f = 1;
    }
}
