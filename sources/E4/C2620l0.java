package e4;

import kotlin.jvm.internal.AbstractC3159y;
import y2.InterfaceC3983b;

/* renamed from: e4.l0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2620l0 extends m4.o0 {

    /* renamed from: b, reason: collision with root package name */
    private final m4.G f30726b;

    /* renamed from: c, reason: collision with root package name */
    private final m4.w0 f30727c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f30728d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3983b f30729e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2620l0(m4.G identifier, m4.w0 controller) {
        super(identifier);
        AbstractC3159y.i(identifier, "identifier");
        AbstractC3159y.i(controller, "controller");
        this.f30726b = identifier;
        this.f30727c = controller;
        this.f30728d = true;
    }

    @Override // m4.o0, m4.k0
    public m4.G a() {
        return this.f30726b;
    }

    @Override // m4.k0
    public InterfaceC3983b b() {
        return this.f30729e;
    }

    @Override // m4.k0
    public boolean c() {
        return this.f30728d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2620l0)) {
            return false;
        }
        C2620l0 c2620l0 = (C2620l0) obj;
        if (AbstractC3159y.d(this.f30726b, c2620l0.f30726b) && AbstractC3159y.d(this.f30727c, c2620l0.f30727c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f30726b.hashCode() * 31) + this.f30727c.hashCode();
    }

    @Override // m4.o0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public m4.w0 i() {
        return this.f30727c;
    }

    public String toString() {
        return "IbanElement(identifier=" + this.f30726b + ", controller=" + this.f30727c + ")";
    }
}
