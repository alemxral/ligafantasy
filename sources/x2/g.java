package X2;

import com.stripe.android.model.o;
import e4.H0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import q3.w;
import y2.AbstractC3984c;
import y2.InterfaceC3983b;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final String f12214a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3983b f12215b;

    /* renamed from: c, reason: collision with root package name */
    private final int f12216c;

    /* renamed from: d, reason: collision with root package name */
    private final String f12217d;

    /* renamed from: e, reason: collision with root package name */
    private final String f12218e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f12219f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3983b f12220g;

    public g(String code, InterfaceC3983b displayName, int i8, String str, String str2, boolean z8, InterfaceC3983b interfaceC3983b) {
        AbstractC3159y.i(code, "code");
        AbstractC3159y.i(displayName, "displayName");
        this.f12214a = code;
        this.f12215b = displayName;
        this.f12216c = i8;
        this.f12217d = str;
        this.f12218e = str2;
        this.f12219f = z8;
        this.f12220g = interfaceC3983b;
    }

    private static final boolean b(List list, g gVar, o.p pVar) {
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((o) it.next()).f24399e == pVar) {
                    if (AbstractC3159y.d(gVar.f12214a, pVar.f24537a)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final L3.e a(List customerSavedPaymentMethods, Function0 onClick) {
        InterfaceC3983b interfaceC3983b;
        AbstractC3159y.i(customerSavedPaymentMethods, "customerSavedPaymentMethods");
        AbstractC3159y.i(onClick, "onClick");
        if (b(customerSavedPaymentMethods, this, o.p.f24519i)) {
            interfaceC3983b = AbstractC3984c.a(w.f37418M);
        } else {
            interfaceC3983b = this.f12215b;
        }
        return new L3.e(this.f12214a, interfaceC3983b, this.f12216c, this.f12217d, this.f12218e, this.f12219f, this.f12220g, onClick);
    }

    public final W2.a c() {
        return new W2.a(this.f12215b, true, this.f12216c, this.f12217d, this.f12218e, this.f12219f);
    }

    public final String d() {
        return this.f12214a;
    }

    public final String e() {
        return this.f12218e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (AbstractC3159y.d(this.f12214a, gVar.f12214a) && AbstractC3159y.d(this.f12215b, gVar.f12215b) && this.f12216c == gVar.f12216c && AbstractC3159y.d(this.f12217d, gVar.f12217d) && AbstractC3159y.d(this.f12218e, gVar.f12218e) && this.f12219f == gVar.f12219f && AbstractC3159y.d(this.f12220g, gVar.f12220g)) {
            return true;
        }
        return false;
    }

    public final InterfaceC3983b f() {
        return this.f12215b;
    }

    public final boolean g() {
        return this.f12219f;
    }

    public final int h() {
        return this.f12216c;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = ((((this.f12214a.hashCode() * 31) + this.f12215b.hashCode()) * 31) + this.f12216c) * 31;
        String str = this.f12217d;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (hashCode3 + hashCode) * 31;
        String str2 = this.f12218e;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int a8 = (((i9 + hashCode2) * 31) + androidx.compose.foundation.a.a(this.f12219f)) * 31;
        InterfaceC3983b interfaceC3983b = this.f12220g;
        if (interfaceC3983b != null) {
            i8 = interfaceC3983b.hashCode();
        }
        return a8 + i8;
    }

    public final String i() {
        return this.f12217d;
    }

    public String toString() {
        return "SupportedPaymentMethod(code=" + this.f12214a + ", displayName=" + this.f12215b + ", iconResource=" + this.f12216c + ", lightThemeIconUrl=" + this.f12217d + ", darkThemeIconUrl=" + this.f12218e + ", iconRequiresTinting=" + this.f12219f + ", subtitle=" + this.f12220g + ")";
    }

    public /* synthetic */ g(String str, InterfaceC3983b interfaceC3983b, int i8, String str2, String str3, boolean z8, InterfaceC3983b interfaceC3983b2, int i9, AbstractC3151p abstractC3151p) {
        this(str, interfaceC3983b, i8, str2, str3, z8, (i9 & 64) != 0 ? null : interfaceC3983b2);
    }

    public /* synthetic */ g(Y2.b bVar, H0 h02, int i8, int i9, boolean z8, InterfaceC3983b interfaceC3983b, int i10, AbstractC3151p abstractC3151p) {
        this(bVar, (i10 & 2) != 0 ? null : h02, i8, i9, (i10 & 16) != 0 ? false : z8, (i10 & 32) != 0 ? null : interfaceC3983b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public g(Y2.b r9, e4.H0 r10, int r11, int r12, boolean r13, y2.InterfaceC3983b r14) {
        /*
            r8 = this;
            java.lang.String r0 = "paymentMethodDefinition"
            kotlin.jvm.internal.AbstractC3159y.i(r9, r0)
            com.stripe.android.model.o$p r9 = r9.getType()
            java.lang.String r1 = r9.f24537a
            y2.b r2 = y2.AbstractC3984c.a(r11)
            r9 = 0
            if (r10 == 0) goto L1e
            e4.F0 r11 = r10.e()
            if (r11 == 0) goto L1e
            java.lang.String r11 = r11.c()
            r4 = r11
            goto L1f
        L1e:
            r4 = r9
        L1f:
            if (r10 == 0) goto L2b
            e4.F0 r10 = r10.e()
            if (r10 == 0) goto L2b
            java.lang.String r9 = r10.b()
        L2b:
            r5 = r9
            r0 = r8
            r3 = r12
            r6 = r13
            r7 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X2.g.<init>(Y2.b, e4.H0, int, int, boolean, y2.b):void");
    }

    public /* synthetic */ g(String str, int i8, int i9, boolean z8, String str2, String str3, InterfaceC3983b interfaceC3983b, int i10, AbstractC3151p abstractC3151p) {
        this(str, i8, i9, (i10 & 8) != 0 ? false : z8, str2, str3, (i10 & 64) != 0 ? null : interfaceC3983b);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(String code, int i8, int i9, boolean z8, String str, String str2, InterfaceC3983b interfaceC3983b) {
        this(code, AbstractC3984c.a(i8), i9, str, str2, z8, interfaceC3983b);
        AbstractC3159y.i(code, "code");
    }
}
