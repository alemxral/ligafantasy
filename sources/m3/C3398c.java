package m3;

import j2.p;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* renamed from: m3.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3398c implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f34912a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f34913b;

    /* renamed from: c, reason: collision with root package name */
    private final I5.a f34914c;

    /* renamed from: d, reason: collision with root package name */
    private final I5.a f34915d;

    public C3398c(I5.a aVar, I5.a aVar2, I5.a aVar3, I5.a aVar4) {
        this.f34912a = aVar;
        this.f34913b = aVar2;
        this.f34914c = aVar3;
        this.f34915d = aVar4;
    }

    public static C3398c a(I5.a aVar, I5.a aVar2, I5.a aVar3, I5.a aVar4) {
        return new C3398c(aVar, aVar2, aVar3, aVar4);
    }

    public static com.stripe.android.payments.core.authentication.threeds2.b c(p pVar, boolean z8, Function0 function0, Set set) {
        return new com.stripe.android.payments.core.authentication.threeds2.b(pVar, z8, function0, set);
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.payments.core.authentication.threeds2.b get() {
        return c((p) this.f34912a.get(), ((Boolean) this.f34913b.get()).booleanValue(), (Function0) this.f34914c.get(), (Set) this.f34915d.get());
    }
}
