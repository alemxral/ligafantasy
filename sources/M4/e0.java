package m4;

import java.util.Map;
import kotlin.jvm.internal.AbstractC3159y;
import y2.InterfaceC3983b;

/* loaded from: classes4.dex */
public final class e0 extends o0 {

    /* renamed from: f, reason: collision with root package name */
    public static final int f35434f = 8;

    /* renamed from: b, reason: collision with root package name */
    private final G f35435b;

    /* renamed from: c, reason: collision with root package name */
    private final d0 f35436c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f35437d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3983b f35438e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(G identifier, d0 controller) {
        super(identifier);
        AbstractC3159y.i(identifier, "identifier");
        AbstractC3159y.i(controller, "controller");
        this.f35435b = identifier;
        this.f35436c = controller;
        this.f35437d = true;
    }

    @Override // m4.o0, m4.k0
    public G a() {
        return this.f35435b;
    }

    @Override // m4.k0
    public InterfaceC3983b b() {
        return this.f35438e;
    }

    @Override // m4.k0
    public boolean c() {
        return this.f35437d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (AbstractC3159y.d(this.f35435b, e0Var.f35435b) && AbstractC3159y.d(this.f35436c, e0Var.f35436c)) {
            return true;
        }
        return false;
    }

    @Override // m4.o0, m4.k0
    public boolean g() {
        return true;
    }

    @Override // m4.o0, m4.k0
    public void h(Map rawValuesMap) {
        AbstractC3159y.i(rawValuesMap, "rawValuesMap");
        String str = (String) rawValuesMap.get(a());
        if (str != null) {
            i().r(str);
        }
    }

    public int hashCode() {
        return (this.f35435b.hashCode() * 31) + this.f35436c.hashCode();
    }

    @Override // m4.o0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public d0 i() {
        return this.f35436c;
    }

    public String toString() {
        return "SameAsShippingElement(identifier=" + this.f35435b + ", controller=" + this.f35436c + ")";
    }
}
