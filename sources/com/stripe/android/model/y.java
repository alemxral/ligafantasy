package com.stripe.android.model;

import M5.AbstractC1246t;
import M5.a0;
import com.stripe.android.model.o;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    private static final Set f24792a = a0.d(o.p.f24497C);

    public static final int a(StripeIntent stripeIntent) {
        AbstractC3159y.i(stripeIntent, "<this>");
        return com.stripe.android.b.f23453q.c(stripeIntent);
    }

    public static final boolean b(StripeIntent stripeIntent) {
        o.p pVar;
        AbstractC3159y.i(stripeIntent, "<this>");
        if (stripeIntent instanceof n) {
            Set set = f24792a;
            o v8 = stripeIntent.v();
            if (v8 != null) {
                pVar = v8.f24399e;
            } else {
                pVar = null;
            }
            if (AbstractC1246t.d0(set, pVar) && stripeIntent.w()) {
                return true;
            }
        }
        return false;
    }
}
