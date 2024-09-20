package J2;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import r2.InterfaceC3684d;

/* loaded from: classes4.dex */
public final class g implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final f f4748a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f4749b;

    /* renamed from: c, reason: collision with root package name */
    private final I5.a f4750c;

    public g(f fVar, I5.a aVar, I5.a aVar2) {
        this.f4748a = fVar;
        this.f4749b = aVar;
        this.f4750c = aVar2;
    }

    public static g a(f fVar, I5.a aVar, I5.a aVar2) {
        return new g(fVar, aVar, aVar2);
    }

    public static Function1 c(f fVar, Context context, InterfaceC3684d interfaceC3684d) {
        return (Function1) u5.h.d(fVar.a(context, interfaceC3684d));
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Function1 get() {
        return c(this.f4748a, (Context) this.f4749b.get(), (InterfaceC3684d) this.f4750c.get());
    }
}
