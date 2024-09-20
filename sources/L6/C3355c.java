package l6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import k6.EnumC3132a;
import kotlin.jvm.internal.AbstractC3151p;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: l6.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3355c extends m6.e {

    /* renamed from: f, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f34614f = AtomicIntegerFieldUpdater.newUpdater(C3355c.class, "consumed");
    private volatile int consumed;

    /* renamed from: d, reason: collision with root package name */
    private final k6.u f34615d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f34616e;

    public /* synthetic */ C3355c(k6.u uVar, boolean z8, P5.g gVar, int i8, EnumC3132a enumC3132a, int i9, AbstractC3151p abstractC3151p) {
        this(uVar, z8, (i9 & 4) != 0 ? P5.h.f7981a : gVar, (i9 & 8) != 0 ? -3 : i8, (i9 & 16) != 0 ? EnumC3132a.SUSPEND : enumC3132a);
    }

    private final void n() {
        if (this.f34616e && f34614f.getAndSet(this, 1) != 0) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
        }
    }

    @Override // m6.e, l6.InterfaceC3358f
    public Object collect(InterfaceC3359g interfaceC3359g, P5.d dVar) {
        if (this.f35863b == -3) {
            n();
            Object d8 = AbstractC3362j.d(interfaceC3359g, this.f34615d, this.f34616e, dVar);
            if (d8 == Q5.b.e()) {
                return d8;
            }
            return L5.I.f6474a;
        }
        Object collect = super.collect(interfaceC3359g, dVar);
        if (collect == Q5.b.e()) {
            return collect;
        }
        return L5.I.f6474a;
    }

    @Override // m6.e
    protected String f() {
        return "channel=" + this.f34615d;
    }

    @Override // m6.e
    protected Object h(k6.s sVar, P5.d dVar) {
        Object d8 = AbstractC3362j.d(new m6.w(sVar), this.f34615d, this.f34616e, dVar);
        if (d8 == Q5.b.e()) {
            return d8;
        }
        return L5.I.f6474a;
    }

    @Override // m6.e
    protected m6.e i(P5.g gVar, int i8, EnumC3132a enumC3132a) {
        return new C3355c(this.f34615d, this.f34616e, gVar, i8, enumC3132a);
    }

    @Override // m6.e
    public InterfaceC3358f j() {
        return new C3355c(this.f34615d, this.f34616e, null, 0, null, 28, null);
    }

    @Override // m6.e
    public k6.u m(i6.M m8) {
        n();
        if (this.f35863b == -3) {
            return this.f34615d;
        }
        return super.m(m8);
    }

    public C3355c(k6.u uVar, boolean z8, P5.g gVar, int i8, EnumC3132a enumC3132a) {
        super(gVar, i8, enumC3132a);
        this.f34615d = uVar;
        this.f34616e = z8;
        this.consumed = 0;
    }
}
