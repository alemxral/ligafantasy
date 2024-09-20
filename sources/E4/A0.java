package e4;

import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.AbstractC3159y;
import l6.InterfaceC3349K;
import m4.D;
import y2.InterfaceC3983b;

/* loaded from: classes4.dex */
public abstract class A0 implements m4.D {

    /* renamed from: a, reason: collision with root package name */
    private final m4.G f30258a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f30259b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3983b f30260c;

    public A0(m4.G identifier, boolean z8) {
        AbstractC3159y.i(identifier, "identifier");
        this.f30258a = identifier;
        this.f30259b = z8;
    }

    @Override // m4.D
    public m4.G a() {
        return this.f30258a;
    }

    @Override // m4.D
    public InterfaceC3983b b() {
        return this.f30260c;
    }

    @Override // m4.D
    public boolean c() {
        return this.f30259b;
    }

    @Override // m4.D
    public InterfaceC3349K e() {
        return D.a.a(this);
    }

    public abstract void f(boolean z8, Composer composer, int i8);
}
