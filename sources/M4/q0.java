package m4;

import kotlin.jvm.internal.AbstractC3159y;
import y2.InterfaceC3983b;

/* loaded from: classes4.dex */
public final class q0 extends o0 {

    /* renamed from: b, reason: collision with root package name */
    private final G f35659b;

    /* renamed from: c, reason: collision with root package name */
    private final w0 f35660c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f35661d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3983b f35662e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(G identifier, w0 controller) {
        super(identifier);
        AbstractC3159y.i(identifier, "identifier");
        AbstractC3159y.i(controller, "controller");
        this.f35659b = identifier;
        this.f35660c = controller;
        this.f35661d = true;
    }

    @Override // m4.o0, m4.k0
    public G a() {
        return this.f35659b;
    }

    @Override // m4.k0
    public InterfaceC3983b b() {
        return this.f35662e;
    }

    @Override // m4.k0
    public boolean c() {
        return this.f35661d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        if (AbstractC3159y.d(this.f35659b, q0Var.f35659b) && AbstractC3159y.d(this.f35660c, q0Var.f35660c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f35659b.hashCode() * 31) + this.f35660c.hashCode();
    }

    @Override // m4.o0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public w0 i() {
        return this.f35660c;
    }

    public String toString() {
        return "SimpleTextElement(identifier=" + this.f35659b + ", controller=" + this.f35660c + ")";
    }
}
