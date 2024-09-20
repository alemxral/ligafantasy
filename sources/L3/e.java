package L3;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import y2.InterfaceC3983b;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final String f6207a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3983b f6208b;

    /* renamed from: c, reason: collision with root package name */
    private final int f6209c;

    /* renamed from: d, reason: collision with root package name */
    private final String f6210d;

    /* renamed from: e, reason: collision with root package name */
    private final String f6211e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f6212f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3983b f6213g;

    /* renamed from: h, reason: collision with root package name */
    private final Function0 f6214h;

    public e(String code, InterfaceC3983b displayName, int i8, String str, String str2, boolean z8, InterfaceC3983b interfaceC3983b, Function0 onClick) {
        AbstractC3159y.i(code, "code");
        AbstractC3159y.i(displayName, "displayName");
        AbstractC3159y.i(onClick, "onClick");
        this.f6207a = code;
        this.f6208b = displayName;
        this.f6209c = i8;
        this.f6210d = str;
        this.f6211e = str2;
        this.f6212f = z8;
        this.f6213g = interfaceC3983b;
        this.f6214h = onClick;
    }

    public final String a() {
        return this.f6207a;
    }

    public final String b() {
        return this.f6211e;
    }

    public final InterfaceC3983b c() {
        return this.f6208b;
    }

    public final boolean d() {
        return this.f6212f;
    }

    public final int e() {
        return this.f6209c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (AbstractC3159y.d(this.f6207a, eVar.f6207a) && AbstractC3159y.d(this.f6208b, eVar.f6208b) && this.f6209c == eVar.f6209c && AbstractC3159y.d(this.f6210d, eVar.f6210d) && AbstractC3159y.d(this.f6211e, eVar.f6211e) && this.f6212f == eVar.f6212f && AbstractC3159y.d(this.f6213g, eVar.f6213g) && AbstractC3159y.d(this.f6214h, eVar.f6214h)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f6210d;
    }

    public final Function0 g() {
        return this.f6214h;
    }

    public final InterfaceC3983b h() {
        return this.f6213g;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = ((((this.f6207a.hashCode() * 31) + this.f6208b.hashCode()) * 31) + this.f6209c) * 31;
        String str = this.f6210d;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (hashCode3 + hashCode) * 31;
        String str2 = this.f6211e;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int a8 = (((i9 + hashCode2) * 31) + androidx.compose.foundation.a.a(this.f6212f)) * 31;
        InterfaceC3983b interfaceC3983b = this.f6213g;
        if (interfaceC3983b != null) {
            i8 = interfaceC3983b.hashCode();
        }
        return ((a8 + i8) * 31) + this.f6214h.hashCode();
    }

    public String toString() {
        return "DisplayablePaymentMethod(code=" + this.f6207a + ", displayName=" + this.f6208b + ", iconResource=" + this.f6209c + ", lightThemeIconUrl=" + this.f6210d + ", darkThemeIconUrl=" + this.f6211e + ", iconRequiresTinting=" + this.f6212f + ", subtitle=" + this.f6213g + ", onClick=" + this.f6214h + ")";
    }
}
