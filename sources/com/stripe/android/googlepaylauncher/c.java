package com.stripe.android.googlepaylauncher;

import android.content.Context;
import com.stripe.android.googlepaylauncher.h;
import r2.InterfaceC3684d;

/* loaded from: classes4.dex */
public final class c implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f23840a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f23841b;

    /* renamed from: c, reason: collision with root package name */
    private final I5.a f23842c;

    public c(I5.a aVar, I5.a aVar2, I5.a aVar3) {
        this.f23840a = aVar;
        this.f23841b = aVar2;
        this.f23842c = aVar3;
    }

    public static c a(I5.a aVar, I5.a aVar2, I5.a aVar3) {
        return new c(aVar, aVar2, aVar3);
    }

    public static b c(Context context, h.d dVar, InterfaceC3684d interfaceC3684d) {
        return new b(context, dVar, interfaceC3684d);
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public b get() {
        return c((Context) this.f23840a.get(), (h.d) this.f23841b.get(), (InterfaceC3684d) this.f23842c.get());
    }
}
