package q3;

import com.stripe.android.paymentsheet.C2432a;
import kotlin.jvm.functions.Function0;

/* renamed from: q3.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3650c implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f37293a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f37294b;

    /* renamed from: c, reason: collision with root package name */
    private final I5.a f37295c;

    /* renamed from: d, reason: collision with root package name */
    private final I5.a f37296d;

    public C3650c(I5.a aVar, I5.a aVar2, I5.a aVar3, I5.a aVar4) {
        this.f37293a = aVar;
        this.f37294b = aVar2;
        this.f37295c = aVar3;
        this.f37296d = aVar4;
    }

    public static C3650c a(I5.a aVar, I5.a aVar2, I5.a aVar3, I5.a aVar4) {
        return new C3650c(aVar, aVar2, aVar3, aVar4);
    }

    public static C2432a c(e3.m mVar, boolean z8, Function0 function0, Function0 function02) {
        return new C2432a(mVar, z8, function0, function02);
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2432a get() {
        return c((e3.m) this.f37293a.get(), ((Boolean) this.f37294b.get()).booleanValue(), (Function0) this.f37295c.get(), (Function0) this.f37296d.get());
    }
}
