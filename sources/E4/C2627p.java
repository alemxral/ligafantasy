package e4;

import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l6.AbstractC3351M;
import l6.InterfaceC3349K;
import m4.A0;
import m4.z0;

/* renamed from: e4.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2627p implements m4.v0 {

    /* renamed from: h, reason: collision with root package name */
    private static final a f30769h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f30770i = 8;

    /* renamed from: a, reason: collision with root package name */
    private final int f30771a = KeyboardCapitalization.Companion.m4896getNoneIUNYP9k();

    /* renamed from: b, reason: collision with root package name */
    private final String f30772b = "bacs_debit_sort_code";

    /* renamed from: c, reason: collision with root package name */
    private final int f30773c = b4.n.f14715h;

    /* renamed from: d, reason: collision with root package name */
    private final int f30774d = KeyboardType.Companion.m4919getNumberPasswordPjHm6EE();

    /* renamed from: e, reason: collision with root package name */
    private final VisualTransformation f30775e = C2629q.f30784a;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3349K f30776f = AbstractC3351M.a(null);

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3349K f30777g = AbstractC3351M.a(Boolean.FALSE);

    /* renamed from: e4.p$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    @Override // m4.v0
    public InterfaceC3349K a() {
        return this.f30777g;
    }

    @Override // m4.v0
    public Integer b() {
        return Integer.valueOf(this.f30773c);
    }

    @Override // m4.v0
    public InterfaceC3349K c() {
        return this.f30776f;
    }

    @Override // m4.v0
    public VisualTransformation d() {
        return this.f30775e;
    }

    @Override // m4.v0
    public String e() {
        return "10-80-00";
    }

    @Override // m4.v0
    public String f(String rawValue) {
        AbstractC3159y.i(rawValue, "rawValue");
        return rawValue;
    }

    @Override // m4.v0
    public int g() {
        return this.f30771a;
    }

    @Override // m4.v0
    public String h(String displayName) {
        AbstractC3159y.i(displayName, "displayName");
        return displayName;
    }

    @Override // m4.v0
    public int i() {
        return this.f30774d;
    }

    @Override // m4.v0
    public String j(String userTyped) {
        AbstractC3159y.i(userTyped, "userTyped");
        StringBuilder sb = new StringBuilder();
        int length = userTyped.length();
        for (int i8 = 0; i8 < length; i8++) {
            char charAt = userTyped.charAt(i8);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        AbstractC3159y.h(sb2, "toString(...)");
        return g6.n.U0(sb2, 6);
    }

    @Override // m4.v0
    public String k() {
        return this.f30772b;
    }

    @Override // m4.v0
    public m4.y0 l(String input) {
        AbstractC3159y.i(input, "input");
        if (g6.n.u(input)) {
            return z0.a.f35843c;
        }
        if (input.length() < 6) {
            return new z0.b(b4.n.f14717i);
        }
        return A0.a.f34928a;
    }
}
