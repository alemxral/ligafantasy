package f3;

import L5.p;
import android.content.Context;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.n;
import com.stripe.android.model.o;
import com.stripe.android.model.u;
import j2.AbstractC3053E;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: f3.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2661b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f30997a;

    public C2661b(Context context) {
        AbstractC3159y.i(context, "context");
        this.f30997a = context;
    }

    private final String b(n nVar) {
        String str;
        n.g.c cVar;
        o v8;
        o.p pVar;
        if (nVar.getStatus() != StripeIntent.Status.f24138e || ((v8 = nVar.v()) != null && (pVar = v8.f24399e) != null && pVar.f24539c)) {
            n.g i8 = nVar.i();
            if (i8 != null) {
                str = i8.r();
            } else {
                str = null;
            }
            if (!AbstractC3159y.d(str, "payment_intent_authentication_failure")) {
                n.g i9 = nVar.i();
                if (i9 != null) {
                    cVar = i9.f();
                } else {
                    cVar = null;
                }
                if (cVar != n.g.c.f24380f) {
                    return null;
                }
                return e3.l.c(nVar.i(), this.f30997a).e();
            }
        }
        return this.f30997a.getResources().getString(AbstractC3053E.f32881n0);
    }

    private final String c(u uVar) {
        String str;
        u.e.c cVar;
        u.e e8 = uVar.e();
        if (e8 != null) {
            str = e8.r();
        } else {
            str = null;
        }
        if (AbstractC3159y.d(str, "setup_intent_authentication_failure")) {
            return this.f30997a.getResources().getString(AbstractC3053E.f32881n0);
        }
        u.e e9 = uVar.e();
        if (e9 != null) {
            cVar = e9.f();
        } else {
            cVar = null;
        }
        if (cVar != u.e.c.f24718f) {
            return null;
        }
        return e3.l.d(uVar.e(), this.f30997a).e();
    }

    private final boolean d(StripeIntent stripeIntent) {
        o.p pVar;
        o v8 = stripeIntent.v();
        if (v8 != null) {
            pVar = v8.f24399e;
        } else {
            pVar = null;
        }
        if (pVar == o.p.f24519i && (stripeIntent.l() instanceof StripeIntent.a.j.b)) {
            return true;
        }
        return false;
    }

    public final String a(StripeIntent intent, int i8) {
        AbstractC3159y.i(intent, "intent");
        if (i8 == 4) {
            return this.f30997a.getResources().getString(AbstractC3053E.f32883o0);
        }
        if (d(intent) || (intent.getStatus() != StripeIntent.Status.f24140g && intent.getStatus() != StripeIntent.Status.f24138e)) {
            return null;
        }
        if (intent instanceof n) {
            return b((n) intent);
        }
        if (intent instanceof u) {
            return c((u) intent);
        }
        throw new p();
    }
}
