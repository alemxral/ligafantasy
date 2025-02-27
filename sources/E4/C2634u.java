package e4;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import com.stripe.android.view.C2469s;
import d6.C2559c;
import j2.AbstractC3053E;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l6.AbstractC3351M;
import l6.InterfaceC3349K;
import m4.A0;
import m4.v0;
import m4.z0;

/* renamed from: e4.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2634u implements m4.v0 {

    /* renamed from: i, reason: collision with root package name */
    private static final a f30817i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    public static final int f30818j = 8;

    /* renamed from: k, reason: collision with root package name */
    private static final C2559c f30819k = new C2559c('0', '9');

    /* renamed from: a, reason: collision with root package name */
    private final List f30820a;

    /* renamed from: b, reason: collision with root package name */
    private final int f30821b;

    /* renamed from: c, reason: collision with root package name */
    private final String f30822c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3349K f30823d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3349K f30824e;

    /* renamed from: f, reason: collision with root package name */
    private final int f30825f;

    /* renamed from: g, reason: collision with root package name */
    private final int f30826g;

    /* renamed from: h, reason: collision with root package name */
    private final VisualTransformation f30827h;

    /* renamed from: e4.u$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: e4.u$b */
    /* loaded from: classes4.dex */
    public static final class b implements OffsetMapping {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f30828a;

        b(String str) {
            this.f30828a = str;
        }

        @Override // androidx.compose.ui.text.input.OffsetMapping
        public int originalToTransformed(int i8) {
            if (i8 > 2) {
                return i8 + this.f30828a.length();
            }
            return i8;
        }

        @Override // androidx.compose.ui.text.input.OffsetMapping
        public int transformedToOriginal(int i8) {
            if (i8 > 3) {
                return i8 - this.f30828a.length();
            }
            return i8;
        }
    }

    public C2634u(List banks) {
        AbstractC3159y.i(banks, "banks");
        this.f30820a = banks;
        this.f30821b = KeyboardCapitalization.Companion.m4896getNoneIUNYP9k();
        this.f30822c = "bsb";
        this.f30823d = AbstractC3351M.a(null);
        this.f30824e = AbstractC3351M.a(Boolean.FALSE);
        this.f30825f = AbstractC3053E.f32844Q;
        this.f30826g = KeyboardType.Companion.m4918getNumberPjHm6EE();
        this.f30827h = new VisualTransformation() { // from class: e4.t
            @Override // androidx.compose.ui.text.input.VisualTransformation
            public final TransformedText filter(AnnotatedString annotatedString) {
                TransformedText n8;
                n8 = C2634u.n(annotatedString);
                return n8;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TransformedText n(AnnotatedString text) {
        AbstractC3159y.i(text, "text");
        StringBuilder sb = new StringBuilder();
        String text2 = text.getText();
        int i8 = 0;
        int i9 = 0;
        while (i8 < text2.length()) {
            int i10 = i9 + 1;
            sb.append(text2.charAt(i8));
            if (i9 == 2) {
                sb.append(" - ");
            }
            i8++;
            i9 = i10;
        }
        String sb2 = sb.toString();
        AbstractC3159y.h(sb2, "toString(...)");
        return new TransformedText(new AnnotatedString(sb2, null, null, 6, null), new b(" - "));
    }

    @Override // m4.v0
    public InterfaceC3349K a() {
        return this.f30824e;
    }

    @Override // m4.v0
    public Integer b() {
        return Integer.valueOf(this.f30825f);
    }

    @Override // m4.v0
    public InterfaceC3349K c() {
        return this.f30823d;
    }

    @Override // m4.v0
    public VisualTransformation d() {
        return this.f30827h;
    }

    @Override // m4.v0
    public String e() {
        return v0.a.a(this);
    }

    @Override // m4.v0
    public String f(String rawValue) {
        AbstractC3159y.i(rawValue, "rawValue");
        return rawValue;
    }

    @Override // m4.v0
    public int g() {
        return this.f30821b;
    }

    @Override // m4.v0
    public String h(String displayName) {
        AbstractC3159y.i(displayName, "displayName");
        return displayName;
    }

    @Override // m4.v0
    public int i() {
        return this.f30826g;
    }

    @Override // m4.v0
    public String j(String userTyped) {
        AbstractC3159y.i(userTyped, "userTyped");
        StringBuilder sb = new StringBuilder();
        int length = userTyped.length();
        for (int i8 = 0; i8 < length; i8++) {
            char charAt = userTyped.charAt(i8);
            if (f30819k.l(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        AbstractC3159y.h(sb2, "toString(...)");
        return g6.n.U0(sb2, 6);
    }

    @Override // m4.v0
    public String k() {
        return this.f30822c;
    }

    @Override // m4.v0
    public m4.y0 l(String input) {
        Object obj;
        AbstractC3159y.i(input, "input");
        if (g6.n.u(input)) {
            return z0.a.f35843c;
        }
        if (input.length() < 6) {
            return new z0.b(AbstractC3053E.f32845R);
        }
        Iterator it = this.f30820a.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (g6.n.C(input, ((C2469s.a) next).c(), false, 2, null)) {
                obj = next;
                break;
            }
        }
        if (((C2469s.a) obj) != null && input.length() <= 6) {
            return A0.a.f34928a;
        }
        return new z0.c(AbstractC3053E.f32846S, null, false, 6, null);
    }
}
