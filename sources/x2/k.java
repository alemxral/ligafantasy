package x2;

import kotlin.jvm.functions.Function0;
import x2.j;

/* loaded from: classes4.dex */
public final class k implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f39180a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f39181b;

    public k(I5.a aVar, I5.a aVar2) {
        this.f39180a = aVar;
        this.f39181b = aVar2;
    }

    public static k a(I5.a aVar, I5.a aVar2) {
        return new k(aVar, aVar2);
    }

    public static j.c c(Function0 function0, Function0 function02) {
        return new j.c(function0, function02);
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public j.c get() {
        return c((Function0) this.f39180a.get(), (Function0) this.f39181b.get());
    }
}
