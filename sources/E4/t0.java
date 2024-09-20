package e4;

import M5.AbstractC1246t;
import androidx.compose.ui.unit.Dp;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l6.InterfaceC3349K;
import m4.D;
import y2.AbstractC3984c;
import y2.InterfaceC3983b;

/* loaded from: classes4.dex */
public final class t0 implements m4.D {

    /* renamed from: a, reason: collision with root package name */
    private final m4.G f30810a;

    /* renamed from: b, reason: collision with root package name */
    private final int f30811b;

    /* renamed from: c, reason: collision with root package name */
    private final List f30812c;

    /* renamed from: d, reason: collision with root package name */
    private final float f30813d;

    /* renamed from: e, reason: collision with root package name */
    private final m4.H f30814e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f30815f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3983b f30816g;

    public /* synthetic */ t0(m4.G g8, int i8, List list, float f8, m4.H h8, AbstractC3151p abstractC3151p) {
        this(g8, i8, list, f8, h8);
    }

    @Override // m4.D
    public m4.G a() {
        return this.f30810a;
    }

    @Override // m4.D
    public InterfaceC3983b b() {
        return this.f30816g;
    }

    @Override // m4.D
    public boolean c() {
        return this.f30815f;
    }

    @Override // m4.D
    public InterfaceC3349K d() {
        return v4.g.n(AbstractC1246t.m());
    }

    @Override // m4.D
    public InterfaceC3349K e() {
        return D.a.a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        if (AbstractC3159y.d(this.f30810a, t0Var.f30810a) && this.f30811b == t0Var.f30811b && AbstractC3159y.d(this.f30812c, t0Var.f30812c) && Dp.m5183equalsimpl0(this.f30813d, t0Var.f30813d) && AbstractC3159y.d(this.f30814e, t0Var.f30814e)) {
            return true;
        }
        return false;
    }

    public final List f() {
        return this.f30812c;
    }

    public final int g() {
        return this.f30811b;
    }

    public final float h() {
        return this.f30813d;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((this.f30810a.hashCode() * 31) + this.f30811b) * 31) + this.f30812c.hashCode()) * 31) + Dp.m5184hashCodeimpl(this.f30813d)) * 31;
        m4.H h8 = this.f30814e;
        if (h8 == null) {
            hashCode = 0;
        } else {
            hashCode = h8.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "MandateTextElement(identifier=" + this.f30810a + ", stringResId=" + this.f30811b + ", args=" + this.f30812c + ", topPadding=" + Dp.m5189toStringimpl(this.f30813d) + ", controller=" + this.f30814e + ")";
    }

    private t0(m4.G identifier, int i8, List args, float f8, m4.H h8) {
        AbstractC3159y.i(identifier, "identifier");
        AbstractC3159y.i(args, "args");
        this.f30810a = identifier;
        this.f30811b = i8;
        this.f30812c = args;
        this.f30813d = f8;
        this.f30814e = h8;
        String[] strArr = (String[]) args.toArray(new String[0]);
        this.f30816g = AbstractC3984c.f(i8, Arrays.copyOf(strArr, strArr.length), null, 4, null);
    }

    public /* synthetic */ t0(m4.G g8, int i8, List list, float f8, m4.H h8, int i9, AbstractC3151p abstractC3151p) {
        this(g8, i8, list, (i9 & 8) != 0 ? Dp.m5178constructorimpl(8) : f8, (i9 & 16) != 0 ? null : h8, null);
    }
}
