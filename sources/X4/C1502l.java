package X4;

import com.mbridge.msdk.MBridgeConstans;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3329q;

/* renamed from: X4.l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1502l {

    /* renamed from: a, reason: collision with root package name */
    public String f12628a;

    /* renamed from: b, reason: collision with root package name */
    public String f12629b;

    /* renamed from: c, reason: collision with root package name */
    private int f12630c = -1;

    public final String a() {
        String str = this.f12629b;
        if (str != null) {
            return str;
        }
        AbstractC3159y.y("date");
        return null;
    }

    public final int b() {
        return this.f12630c;
    }

    public final String c() {
        String substring = e().substring(g6.n.X(e(), "/", 0, false, 6, null) + 1);
        AbstractC3159y.h(substring, "substring(...)");
        return substring;
    }

    public final String d() {
        return new C3329q().i(c());
    }

    public final String e() {
        String str = this.f12628a;
        if (str != null) {
            return str;
        }
        AbstractC3159y.y(MBridgeConstans.DYNAMIC_VIEW_WX_PATH);
        return null;
    }

    public final void f(String str) {
        AbstractC3159y.i(str, "<set-?>");
        this.f12629b = str;
    }

    public final void g(int i8) {
        this.f12630c = i8;
    }

    public final void h(String str) {
        AbstractC3159y.i(str, "<set-?>");
        this.f12628a = str;
    }
}
