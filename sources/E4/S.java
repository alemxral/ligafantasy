package e4;

import java.util.Map;
import kotlin.jvm.internal.AbstractC3159y;
import y2.InterfaceC3983b;

/* loaded from: classes4.dex */
public final class S extends m4.o0 {

    /* renamed from: f, reason: collision with root package name */
    public static final int f30522f = 8;

    /* renamed from: b, reason: collision with root package name */
    private final m4.G f30523b;

    /* renamed from: c, reason: collision with root package name */
    private final Q f30524c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f30525d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3983b f30526e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(m4.G _identifier, Q controller) {
        super(_identifier);
        AbstractC3159y.i(_identifier, "_identifier");
        AbstractC3159y.i(controller, "controller");
        this.f30523b = _identifier;
        this.f30524c = controller;
        this.f30525d = true;
    }

    @Override // m4.k0
    public InterfaceC3983b b() {
        return this.f30526e;
    }

    @Override // m4.k0
    public boolean c() {
        return this.f30525d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        S s8 = (S) obj;
        if (AbstractC3159y.d(this.f30523b, s8.f30523b) && AbstractC3159y.d(this.f30524c, s8.f30524c)) {
            return true;
        }
        return false;
    }

    @Override // m4.o0, m4.k0
    public void h(Map rawValuesMap) {
        AbstractC3159y.i(rawValuesMap, "rawValuesMap");
    }

    public int hashCode() {
        return (this.f30523b.hashCode() * 31) + this.f30524c.hashCode();
    }

    @Override // m4.o0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public Q i() {
        return this.f30524c;
    }

    public String toString() {
        return "CvcElement(_identifier=" + this.f30523b + ", controller=" + this.f30524c + ")";
    }
}
