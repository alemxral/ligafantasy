package P2;

import P5.g;
import e3.m;
import java.util.Locale;
import k3.i;
import kotlin.jvm.functions.Function0;
import u5.e;

/* loaded from: classes4.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f7902a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f7903b;

    /* renamed from: c, reason: collision with root package name */
    private final I5.a f7904c;

    /* renamed from: d, reason: collision with root package name */
    private final I5.a f7905d;

    /* renamed from: e, reason: collision with root package name */
    private final I5.a f7906e;

    /* renamed from: f, reason: collision with root package name */
    private final I5.a f7907f;

    /* renamed from: g, reason: collision with root package name */
    private final I5.a f7908g;

    public b(I5.a aVar, I5.a aVar2, I5.a aVar3, I5.a aVar4, I5.a aVar5, I5.a aVar6, I5.a aVar7) {
        this.f7902a = aVar;
        this.f7903b = aVar2;
        this.f7904c = aVar3;
        this.f7905d = aVar4;
        this.f7906e = aVar5;
        this.f7907f = aVar6;
        this.f7908g = aVar7;
    }

    public static b a(I5.a aVar, I5.a aVar2, I5.a aVar3, I5.a aVar4, I5.a aVar5, I5.a aVar6, I5.a aVar7) {
        return new b(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static a c(Function0 function0, Function0 function02, m mVar, O3.a aVar, g gVar, Locale locale, i iVar) {
        return new a(function0, function02, mVar, aVar, gVar, locale, iVar);
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c((Function0) this.f7902a.get(), (Function0) this.f7903b.get(), (m) this.f7904c.get(), (O3.a) this.f7905d.get(), (g) this.f7906e.get(), (Locale) this.f7907f.get(), (i) this.f7908g.get());
    }
}
