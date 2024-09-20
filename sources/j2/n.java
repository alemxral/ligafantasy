package j2;

import com.stripe.android.googlepaylauncher.h;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class n implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f33024a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f33025b;

    /* renamed from: c, reason: collision with root package name */
    private final I5.a f33026c;

    public n(I5.a aVar, I5.a aVar2, I5.a aVar3) {
        this.f33024a = aVar;
        this.f33025b = aVar2;
        this.f33026c = aVar3;
    }

    public static n a(I5.a aVar, I5.a aVar2, I5.a aVar3) {
        return new n(aVar, aVar2, aVar3);
    }

    public static C3073m c(Function0 function0, Function0 function02, h.d dVar) {
        return new C3073m(function0, function02, dVar);
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3073m get() {
        return c((Function0) this.f33024a.get(), (Function0) this.f33025b.get(), (h.d) this.f33026c.get());
    }
}
