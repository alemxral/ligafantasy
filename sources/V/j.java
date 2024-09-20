package v;

import android.content.Context;
import w.InterfaceC3836b;

/* loaded from: classes3.dex */
public final class j implements InterfaceC3836b {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f38578a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f38579b;

    /* renamed from: c, reason: collision with root package name */
    private final I5.a f38580c;

    public j(I5.a aVar, I5.a aVar2, I5.a aVar3) {
        this.f38578a = aVar;
        this.f38579b = aVar2;
        this.f38580c = aVar3;
    }

    public static j a(I5.a aVar, I5.a aVar2, I5.a aVar3) {
        return new j(aVar, aVar2, aVar3);
    }

    public static i c(Context context, E.a aVar, E.a aVar2) {
        return new i(context, aVar, aVar2);
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c((Context) this.f38578a.get(), (E.a) this.f38579b.get(), (E.a) this.f38580c.get());
    }
}
