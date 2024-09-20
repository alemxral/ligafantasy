package f3;

import android.content.Context;
import e3.m;
import kotlin.jvm.functions.Function0;
import r2.InterfaceC3684d;

/* renamed from: f3.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2667h implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f31061a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f31062b;

    /* renamed from: c, reason: collision with root package name */
    private final I5.a f31063c;

    /* renamed from: d, reason: collision with root package name */
    private final I5.a f31064d;

    /* renamed from: e, reason: collision with root package name */
    private final I5.a f31065e;

    public C2667h(I5.a aVar, I5.a aVar2, I5.a aVar3, I5.a aVar4, I5.a aVar5) {
        this.f31061a = aVar;
        this.f31062b = aVar2;
        this.f31063c = aVar3;
        this.f31064d = aVar4;
        this.f31065e = aVar5;
    }

    public static C2667h a(I5.a aVar, I5.a aVar2, I5.a aVar3, I5.a aVar4, I5.a aVar5) {
        return new C2667h(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static C2666g c(Context context, Function0 function0, m mVar, InterfaceC3684d interfaceC3684d, P5.g gVar) {
        return new C2666g(context, function0, mVar, interfaceC3684d, gVar);
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2666g get() {
        return c((Context) this.f31061a.get(), (Function0) this.f31062b.get(), (m) this.f31063c.get(), (InterfaceC3684d) this.f31064d.get(), (P5.g) this.f31065e.get());
    }
}
