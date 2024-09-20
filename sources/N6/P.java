package n6;

import i6.V0;
import kotlin.jvm.internal.AbstractC3159y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    public final P5.g f36238a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f36239b;

    /* renamed from: c, reason: collision with root package name */
    private final V0[] f36240c;

    /* renamed from: d, reason: collision with root package name */
    private int f36241d;

    public P(P5.g gVar, int i8) {
        this.f36238a = gVar;
        this.f36239b = new Object[i8];
        this.f36240c = new V0[i8];
    }

    public final void a(V0 v02, Object obj) {
        Object[] objArr = this.f36239b;
        int i8 = this.f36241d;
        objArr[i8] = obj;
        V0[] v0Arr = this.f36240c;
        this.f36241d = i8 + 1;
        AbstractC3159y.g(v02, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        v0Arr[i8] = v02;
    }

    public final void b(P5.g gVar) {
        int length = this.f36240c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i8 = length - 1;
            V0 v02 = this.f36240c[length];
            AbstractC3159y.f(v02);
            v02.restoreThreadContext(gVar, this.f36239b[length]);
            if (i8 >= 0) {
                length = i8;
            } else {
                return;
            }
        }
    }
}
