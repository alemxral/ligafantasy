package e4;

import M5.AbstractC1246t;
import j2.AbstractC3053E;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l6.InterfaceC3349K;
import m4.D;
import y2.AbstractC3984c;
import y2.InterfaceC3983b;

/* renamed from: e4.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2617k implements m4.D {

    /* renamed from: a, reason: collision with root package name */
    private final m4.G f30706a;

    /* renamed from: b, reason: collision with root package name */
    private final String f30707b;

    /* renamed from: c, reason: collision with root package name */
    private final m4.H f30708c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f30709d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3983b f30710e;

    public C2617k(m4.G identifier, String str, m4.H h8) {
        AbstractC3159y.i(identifier, "identifier");
        this.f30706a = identifier;
        this.f30707b = str;
        this.f30708c = h8;
        this.f30710e = AbstractC3984c.f(AbstractC3053E.f32836L, new Object[]{str == null ? "" : str}, null, 4, null);
    }

    @Override // m4.D
    public m4.G a() {
        return this.f30706a;
    }

    @Override // m4.D
    public InterfaceC3983b b() {
        return this.f30710e;
    }

    @Override // m4.D
    public boolean c() {
        return this.f30709d;
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
        if (!(obj instanceof C2617k)) {
            return false;
        }
        C2617k c2617k = (C2617k) obj;
        if (AbstractC3159y.d(this.f30706a, c2617k.f30706a) && AbstractC3159y.d(this.f30707b, c2617k.f30707b) && AbstractC3159y.d(this.f30708c, c2617k.f30708c)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f30707b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f30706a.hashCode() * 31;
        String str = this.f30707b;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (hashCode2 + hashCode) * 31;
        m4.H h8 = this.f30708c;
        if (h8 != null) {
            i8 = h8.hashCode();
        }
        return i9 + i8;
    }

    public String toString() {
        return "AuBecsDebitMandateTextElement(identifier=" + this.f30706a + ", merchantName=" + this.f30707b + ", controller=" + this.f30708c + ")";
    }

    public /* synthetic */ C2617k(m4.G g8, String str, m4.H h8, int i8, AbstractC3151p abstractC3151p) {
        this(g8, str, (i8 & 4) != 0 ? null : h8);
    }
}
