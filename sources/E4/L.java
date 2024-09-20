package e4;

import java.util.Map;
import kotlin.jvm.internal.AbstractC3159y;
import y2.InterfaceC3983b;

/* loaded from: classes4.dex */
public final class L extends m4.o0 {

    /* renamed from: b, reason: collision with root package name */
    private final m4.G f30418b;

    /* renamed from: c, reason: collision with root package name */
    private final K f30419c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f30420d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3983b f30421e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(m4.G _identifier, K controller) {
        super(_identifier);
        AbstractC3159y.i(_identifier, "_identifier");
        AbstractC3159y.i(controller, "controller");
        this.f30418b = _identifier;
        this.f30419c = controller;
        this.f30420d = true;
    }

    @Override // m4.k0
    public InterfaceC3983b b() {
        return this.f30421e;
    }

    @Override // m4.k0
    public boolean c() {
        return this.f30420d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l8 = (L) obj;
        if (AbstractC3159y.d(this.f30418b, l8.f30418b) && AbstractC3159y.d(this.f30419c, l8.f30419c)) {
            return true;
        }
        return false;
    }

    @Override // m4.o0, m4.k0
    public void h(Map rawValuesMap) {
        AbstractC3159y.i(rawValuesMap, "rawValuesMap");
    }

    public int hashCode() {
        return (this.f30418b.hashCode() * 31) + this.f30419c.hashCode();
    }

    @Override // m4.o0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public K i() {
        return this.f30419c;
    }

    public String toString() {
        return "CardNumberElement(_identifier=" + this.f30418b + ", controller=" + this.f30419c + ")";
    }
}
