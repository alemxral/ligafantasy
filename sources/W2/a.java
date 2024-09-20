package W2;

import kotlin.jvm.internal.AbstractC3159y;
import y2.InterfaceC3983b;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3983b f11983a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f11984b;

    /* renamed from: c, reason: collision with root package name */
    private final int f11985c;

    /* renamed from: d, reason: collision with root package name */
    private final String f11986d;

    /* renamed from: e, reason: collision with root package name */
    private final String f11987e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f11988f;

    public a(InterfaceC3983b displayName, boolean z8, int i8, String str, String str2, boolean z9) {
        AbstractC3159y.i(displayName, "displayName");
        this.f11983a = displayName;
        this.f11984b = z8;
        this.f11985c = i8;
        this.f11986d = str;
        this.f11987e = str2;
        this.f11988f = z9;
    }

    public static /* synthetic */ a b(a aVar, InterfaceC3983b interfaceC3983b, boolean z8, int i8, String str, String str2, boolean z9, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            interfaceC3983b = aVar.f11983a;
        }
        if ((i9 & 2) != 0) {
            z8 = aVar.f11984b;
        }
        boolean z10 = z8;
        if ((i9 & 4) != 0) {
            i8 = aVar.f11985c;
        }
        int i10 = i8;
        if ((i9 & 8) != 0) {
            str = aVar.f11986d;
        }
        String str3 = str;
        if ((i9 & 16) != 0) {
            str2 = aVar.f11987e;
        }
        String str4 = str2;
        if ((i9 & 32) != 0) {
            z9 = aVar.f11988f;
        }
        return aVar.a(interfaceC3983b, z10, i10, str3, str4, z9);
    }

    public final a a(InterfaceC3983b displayName, boolean z8, int i8, String str, String str2, boolean z9) {
        AbstractC3159y.i(displayName, "displayName");
        return new a(displayName, z8, i8, str, str2, z9);
    }

    public final String c() {
        return this.f11987e;
    }

    public final InterfaceC3983b d() {
        return this.f11983a;
    }

    public final boolean e() {
        return this.f11988f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (AbstractC3159y.d(this.f11983a, aVar.f11983a) && this.f11984b == aVar.f11984b && this.f11985c == aVar.f11985c && AbstractC3159y.d(this.f11986d, aVar.f11986d) && AbstractC3159y.d(this.f11987e, aVar.f11987e) && this.f11988f == aVar.f11988f) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f11985c;
    }

    public final String g() {
        return this.f11986d;
    }

    public final boolean h() {
        return this.f11984b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((this.f11983a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f11984b)) * 31) + this.f11985c) * 31;
        String str = this.f11986d;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (hashCode2 + hashCode) * 31;
        String str2 = this.f11987e;
        if (str2 != null) {
            i8 = str2.hashCode();
        }
        return ((i9 + i8) * 31) + androidx.compose.foundation.a.a(this.f11988f);
    }

    public String toString() {
        return "FormHeaderInformation(displayName=" + this.f11983a + ", shouldShowIcon=" + this.f11984b + ", iconResource=" + this.f11985c + ", lightThemeIconUrl=" + this.f11986d + ", darkThemeIconUrl=" + this.f11987e + ", iconRequiresTinting=" + this.f11988f + ")";
    }
}
