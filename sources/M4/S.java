package m4;

import kotlin.jvm.internal.AbstractC3159y;
import y2.InterfaceC3983b;

/* loaded from: classes4.dex */
public final class S extends o0 {

    /* renamed from: b, reason: collision with root package name */
    private final G f35218b;

    /* renamed from: c, reason: collision with root package name */
    private final Q f35219c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f35220d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3983b f35221e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(G identifier, Q controller) {
        super(identifier);
        AbstractC3159y.i(identifier, "identifier");
        AbstractC3159y.i(controller, "controller");
        this.f35218b = identifier;
        this.f35219c = controller;
        this.f35220d = true;
    }

    @Override // m4.o0, m4.k0
    public G a() {
        return this.f35218b;
    }

    @Override // m4.k0
    public InterfaceC3983b b() {
        return this.f35221e;
    }

    @Override // m4.k0
    public boolean c() {
        return this.f35220d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        S s8 = (S) obj;
        if (AbstractC3159y.d(this.f35218b, s8.f35218b) && AbstractC3159y.d(this.f35219c, s8.f35219c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f35218b.hashCode() * 31) + this.f35219c.hashCode();
    }

    @Override // m4.o0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public Q i() {
        return this.f35219c;
    }

    public String toString() {
        return "PhoneNumberElement(identifier=" + this.f35218b + ", controller=" + this.f35219c + ")";
    }
}
