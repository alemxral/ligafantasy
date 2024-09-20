package i6;

import n6.C3486F;

/* loaded from: classes5.dex */
public final class X0 {

    /* renamed from: a, reason: collision with root package name */
    public static final X0 f31721a = new X0();

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal f31722b = n6.M.a(new C3486F("ThreadLocalEventLoop"));

    private X0() {
    }

    public final AbstractC2824h0 a() {
        return (AbstractC2824h0) f31722b.get();
    }

    public final AbstractC2824h0 b() {
        ThreadLocal threadLocal = f31722b;
        AbstractC2824h0 abstractC2824h0 = (AbstractC2824h0) threadLocal.get();
        if (abstractC2824h0 == null) {
            AbstractC2824h0 a8 = AbstractC2830k0.a();
            threadLocal.set(a8);
            return a8;
        }
        return abstractC2824h0;
    }

    public final void c() {
        f31722b.set(null);
    }

    public final void d(AbstractC2824h0 abstractC2824h0) {
        f31722b.set(abstractC2824h0);
    }
}
