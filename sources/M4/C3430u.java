package m4;

import kotlin.jvm.internal.AbstractC3159y;
import y2.InterfaceC3983b;

/* renamed from: m4.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3430u extends o0 {

    /* renamed from: b, reason: collision with root package name */
    private final G f35714b;

    /* renamed from: c, reason: collision with root package name */
    private final C3434y f35715c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f35716d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3983b f35717e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3430u(G identifier, C3434y controller) {
        super(identifier);
        AbstractC3159y.i(identifier, "identifier");
        AbstractC3159y.i(controller, "controller");
        this.f35714b = identifier;
        this.f35715c = controller;
        this.f35716d = true;
    }

    @Override // m4.o0, m4.k0
    public G a() {
        return this.f35714b;
    }

    @Override // m4.k0
    public InterfaceC3983b b() {
        return this.f35717e;
    }

    @Override // m4.k0
    public boolean c() {
        return this.f35716d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3430u)) {
            return false;
        }
        C3430u c3430u = (C3430u) obj;
        if (AbstractC3159y.d(this.f35714b, c3430u.f35714b) && AbstractC3159y.d(this.f35715c, c3430u.f35715c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f35714b.hashCode() * 31) + this.f35715c.hashCode();
    }

    @Override // m4.o0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public C3434y i() {
        return this.f35715c;
    }

    public String toString() {
        return "CountryElement(identifier=" + this.f35714b + ", controller=" + this.f35715c + ")";
    }
}
