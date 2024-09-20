package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.stripe3ds2.transaction.c;
import com.stripe.android.stripe3ds2.transaction.p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class i implements e {

    /* renamed from: a, reason: collision with root package name */
    private final U3.c f26843a;

    /* renamed from: b, reason: collision with root package name */
    private final P5.g f26844b;

    public i(U3.c errorReporter, P5.g workContext) {
        AbstractC3159y.i(errorReporter, "errorReporter");
        AbstractC3159y.i(workContext, "workContext");
        this.f26843a = errorReporter;
        this.f26844b = workContext;
    }

    @Override // com.stripe.android.stripe3ds2.transaction.e
    public Object a(c.a aVar, Y3.a aVar2, P5.d dVar) {
        return new p.b(aVar).s(this.f26843a, this.f26844b).a(aVar2, dVar);
    }
}
