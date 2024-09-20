package x2;

import h6.AbstractC2760c;
import h6.C2758a;
import h6.EnumC2761d;
import kotlin.jvm.internal.AbstractC3151p;

/* loaded from: classes4.dex */
public final class p implements InterfaceC3864B {

    /* renamed from: b, reason: collision with root package name */
    private static final a f39212b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final long f39213a;

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public /* synthetic */ p(long j8, AbstractC3151p abstractC3151p) {
        this(j8);
    }

    @Override // x2.InterfaceC3864B
    public long a(int i8, int i9) {
        int k8 = (i8 - d6.m.k(i9, 1, i8)) + 1;
        long j8 = this.f39213a;
        EnumC2761d enumC2761d = EnumC2761d.f31405e;
        return AbstractC2760c.r(Math.pow(C2758a.G(j8, enumC2761d), k8), enumC2761d);
    }

    @Override // x2.InterfaceC3864B
    public long b(int i8) {
        C2758a.C0756a c0756a = C2758a.f31395b;
        long s8 = AbstractC2760c.s(0, EnumC2761d.f31405e);
        for (int i9 = i8; i9 > 0; i9--) {
            s8 = C2758a.E(s8, a(i8, i9));
        }
        return s8;
    }

    private p(long j8) {
        this.f39213a = j8;
    }

    public p() {
        this(AbstractC2760c.t(2L, EnumC2761d.f31405e), null);
    }
}
