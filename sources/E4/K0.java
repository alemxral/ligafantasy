package e4;

import kotlin.jvm.internal.AbstractC3159y;
import m4.C3434y;
import y2.InterfaceC3983b;

/* loaded from: classes4.dex */
public final class K0 extends m4.o0 {

    /* renamed from: b, reason: collision with root package name */
    private final m4.G f30414b;

    /* renamed from: c, reason: collision with root package name */
    private final C3434y f30415c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f30416d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3983b f30417e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K0(m4.G identifier, C3434y controller) {
        super(identifier);
        AbstractC3159y.i(identifier, "identifier");
        AbstractC3159y.i(controller, "controller");
        this.f30414b = identifier;
        this.f30415c = controller;
        this.f30416d = true;
    }

    @Override // m4.o0, m4.k0
    public m4.G a() {
        return this.f30414b;
    }

    @Override // m4.k0
    public InterfaceC3983b b() {
        return this.f30417e;
    }

    @Override // m4.k0
    public boolean c() {
        return this.f30416d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K0)) {
            return false;
        }
        K0 k02 = (K0) obj;
        if (AbstractC3159y.d(this.f30414b, k02.f30414b) && AbstractC3159y.d(this.f30415c, k02.f30415c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f30414b.hashCode() * 31) + this.f30415c.hashCode();
    }

    @Override // m4.o0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public C3434y i() {
        return this.f30415c;
    }

    public String toString() {
        return "SimpleDropdownElement(identifier=" + this.f30414b + ", controller=" + this.f30415c + ")";
    }
}
