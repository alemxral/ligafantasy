package n6;

import L5.AbstractC1221e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes5.dex */
public abstract class x {

    /* loaded from: classes5.dex */
    static final class a extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f36284a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f36285b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ P5.g f36286c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function1 function1, Object obj, P5.g gVar) {
            super(1);
            this.f36284a = function1;
            this.f36285b = obj;
            this.f36286c = gVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return L5.I.f6474a;
        }

        public final void invoke(Throwable th) {
            x.b(this.f36284a, this.f36285b, this.f36286c);
        }
    }

    public static final Function1 a(Function1 function1, Object obj, P5.g gVar) {
        return new a(function1, obj, gVar);
    }

    public static final void b(Function1 function1, Object obj, P5.g gVar) {
        Q c8 = c(function1, obj, null);
        if (c8 != null) {
            i6.K.a(gVar, c8);
        }
    }

    public static final Q c(Function1 function1, Object obj, Q q8) {
        try {
            function1.invoke(obj);
        } catch (Throwable th) {
            if (q8 != null && q8.getCause() != th) {
                AbstractC1221e.a(q8, th);
            } else {
                return new Q("Exception in undelivered element handler for " + obj, th);
            }
        }
        return q8;
    }

    public static /* synthetic */ Q d(Function1 function1, Object obj, Q q8, int i8, Object obj2) {
        if ((i8 & 2) != 0) {
            q8 = null;
        }
        return c(function1, obj, q8);
    }
}
