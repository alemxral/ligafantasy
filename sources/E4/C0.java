package e4;

import M5.AbstractC1246t;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l6.InterfaceC3349K;
import m4.D;
import r4.C3688a;
import y2.InterfaceC3983b;

/* loaded from: classes4.dex */
public final class C0 implements m4.D {

    /* renamed from: g, reason: collision with root package name */
    public static final int f30296g = 8;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f30297a;

    /* renamed from: b, reason: collision with root package name */
    private final String f30298b;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3983b f30300d;

    /* renamed from: e, reason: collision with root package name */
    private final B0 f30301e;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f30299c = true;

    /* renamed from: f, reason: collision with root package name */
    private final m4.G f30302f = m4.G.Companion.x();

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function1 {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke(C3688a it) {
            AbstractC3159y.i(it, "it");
            return AbstractC1246t.e(L5.x.a(C0.this.a(), it));
        }
    }

    public C0(boolean z8, String str) {
        this.f30297a = z8;
        this.f30298b = str;
        this.f30301e = new B0(z8);
    }

    @Override // m4.D
    public m4.G a() {
        return this.f30302f;
    }

    @Override // m4.D
    public InterfaceC3983b b() {
        return this.f30300d;
    }

    @Override // m4.D
    public boolean c() {
        return this.f30299c;
    }

    @Override // m4.D
    public InterfaceC3349K d() {
        return v4.g.m(f().m(), new a());
    }

    @Override // m4.D
    public InterfaceC3349K e() {
        return D.a.a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0)) {
            return false;
        }
        C0 c02 = (C0) obj;
        if (this.f30297a == c02.f30297a && AbstractC3159y.d(this.f30298b, c02.f30298b)) {
            return true;
        }
        return false;
    }

    public B0 f() {
        return this.f30301e;
    }

    public final String g() {
        return this.f30298b;
    }

    public int hashCode() {
        int hashCode;
        int a8 = androidx.compose.foundation.a.a(this.f30297a) * 31;
        String str = this.f30298b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return a8 + hashCode;
    }

    public String toString() {
        return "SaveForFutureUseElement(initialValue=" + this.f30297a + ", merchantName=" + this.f30298b + ")";
    }
}
