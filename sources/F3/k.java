package f3;

import android.content.Context;
import e3.m;
import kotlin.jvm.functions.Function0;
import r2.InterfaceC3684d;

/* loaded from: classes4.dex */
public final class k implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f31076a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f31077b;

    /* renamed from: c, reason: collision with root package name */
    private final I5.a f31078c;

    /* renamed from: d, reason: collision with root package name */
    private final I5.a f31079d;

    /* renamed from: e, reason: collision with root package name */
    private final I5.a f31080e;

    public k(I5.a aVar, I5.a aVar2, I5.a aVar3, I5.a aVar4, I5.a aVar5) {
        this.f31076a = aVar;
        this.f31077b = aVar2;
        this.f31078c = aVar3;
        this.f31079d = aVar4;
        this.f31080e = aVar5;
    }

    public static k a(I5.a aVar, I5.a aVar2, I5.a aVar3, I5.a aVar4, I5.a aVar5) {
        return new k(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static j c(Context context, Function0 function0, m mVar, InterfaceC3684d interfaceC3684d, P5.g gVar) {
        return new j(context, function0, mVar, interfaceC3684d, gVar);
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public j get() {
        return c((Context) this.f31076a.get(), (Function0) this.f31077b.get(), (m) this.f31078c.get(), (InterfaceC3684d) this.f31079d.get(), (P5.g) this.f31080e.get());
    }
}
