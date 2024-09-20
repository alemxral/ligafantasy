package com.stripe.android.paymentsheet;

import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.i;
import com.stripe.android.model.n;
import com.stripe.android.paymentsheet.u;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public abstract class d {

    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25884a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f25885b;

        static {
            int[] iArr = new int[u.m.e.values().length];
            try {
                iArr[u.m.e.f26474a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u.m.e.f26475b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f25884a = iArr;
            int[] iArr2 = new int[u.m.a.values().length];
            try {
                iArr2[u.m.a.f26463a.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[u.m.a.f26464b.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[u.m.a.f26465c.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f25885b = iArr2;
        }
    }

    private static final i.b a(u.m.d dVar) {
        StripeIntent.Usage usage;
        if (dVar instanceof u.m.d.a) {
            u.m.d.a aVar = (u.m.d.a) dVar;
            long c8 = aVar.c();
            String K8 = aVar.K();
            u.m.e b8 = dVar.b();
            if (b8 != null) {
                usage = d(b8);
            } else {
                usage = null;
            }
            return new i.b.a(c8, K8, usage, c(aVar.e()));
        }
        if (dVar instanceof u.m.d.b) {
            u.m.d.b bVar = (u.m.d.b) dVar;
            return new i.b.C0502b(bVar.K(), d(bVar.b()));
        }
        throw new L5.p();
    }

    public static final com.stripe.android.model.i b(u.m mVar) {
        AbstractC3159y.i(mVar, "<this>");
        return new com.stripe.android.model.i(a(mVar.b()), mVar.g(), mVar.e(), mVar.c());
    }

    private static final n.b c(u.m.a aVar) {
        int i8 = a.f25885b[aVar.ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 == 3) {
                    return n.b.f24352e;
                }
                throw new L5.p();
            }
            return n.b.f24351d;
        }
        return n.b.f24350c;
    }

    private static final StripeIntent.Usage d(u.m.e eVar) {
        int i8 = a.f25884a[eVar.ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                return StripeIntent.Usage.f24148d;
            }
            throw new L5.p();
        }
        return StripeIntent.Usage.f24147c;
    }
}
