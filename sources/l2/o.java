package l2;

import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l2.f;
import l6.InterfaceC3349K;

/* loaded from: classes4.dex */
public final class o implements InterfaceC3169d {

    /* renamed from: a, reason: collision with root package name */
    private final p f33865a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3349K f33866b;

    public o(p accountRanges) {
        AbstractC3159y.i(accountRanges, "accountRanges");
        this.f33865a = accountRanges;
        this.f33866b = v4.g.n(Boolean.FALSE);
    }

    @Override // l2.InterfaceC3169d
    public InterfaceC3349K a() {
        return this.f33866b;
    }

    @Override // l2.InterfaceC3169d
    public Object b(f.b bVar, P5.d dVar) {
        return this.f33865a.b(bVar);
    }

    public /* synthetic */ o(p pVar, int i8, AbstractC3151p abstractC3151p) {
        this((i8 & 1) != 0 ? new k() : pVar);
    }
}
