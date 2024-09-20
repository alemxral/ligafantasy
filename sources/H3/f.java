package H3;

import L5.p;
import b3.v;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.n;
import com.stripe.android.model.o;
import com.stripe.android.paymentsheet.u;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public abstract class f {
    private static final String b(u.i iVar) {
        u.h b8 = iVar.b();
        if (b8 instanceof u.h.a) {
            return ((u.h.a) iVar.b()).F();
        }
        if (b8 instanceof u.h.b) {
            return null;
        }
        throw new p();
    }

    public static final v c(u.l lVar, u.i iVar, List externalPaymentMethods, String str) {
        String str2;
        AbstractC3159y.i(lVar, "<this>");
        AbstractC3159y.i(externalPaymentMethods, "externalPaymentMethods");
        if (iVar != null) {
            str2 = b(iVar);
        } else {
            str2 = null;
        }
        String str3 = str2;
        if (lVar instanceof u.l.b) {
            return new v.b(((u.l.b) lVar).d(), null, str3, str, externalPaymentMethods, 2, null);
        }
        if (lVar instanceof u.l.c) {
            return new v.c(((u.l.c) lVar).d(), null, str3, str, externalPaymentMethods, 2, null);
        }
        if (lVar instanceof u.l.a) {
            return new v.a(null, com.stripe.android.paymentsheet.d.b(((u.l.a) lVar).c()), externalPaymentMethods, str, str3, 1, null);
        }
        throw new p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StripeIntent d(StripeIntent stripeIntent) {
        com.stripe.android.model.u b8;
        n b9;
        List g8 = stripeIntent.g();
        ArrayList arrayList = new ArrayList();
        for (Object obj : g8) {
            if (!AbstractC3159y.d((String) obj, o.p.f24497C.f24537a)) {
                arrayList.add(obj);
            }
        }
        if (stripeIntent instanceof n) {
            b9 = r2.b((r44 & 1) != 0 ? r2.f24314a : null, (r44 & 2) != 0 ? r2.f24315b : arrayList, (r44 & 4) != 0 ? r2.f24316c : null, (r44 & 8) != 0 ? r2.f24317d : 0L, (r44 & 16) != 0 ? r2.f24318e : null, (r44 & 32) != 0 ? r2.f24319f : null, (r44 & 64) != 0 ? r2.f24320g : null, (r44 & 128) != 0 ? r2.f24321h : null, (r44 & 256) != 0 ? r2.f24322i : null, (r44 & 512) != 0 ? r2.f24323j : 0L, (r44 & 1024) != 0 ? r2.f24324k : null, (r44 & 2048) != 0 ? r2.f24325l : null, (r44 & 4096) != 0 ? r2.f24326m : false, (r44 & 8192) != 0 ? r2.f24327n : null, (r44 & 16384) != 0 ? r2.f24328o : null, (r44 & 32768) != 0 ? r2.f24329p : null, (r44 & 65536) != 0 ? r2.f24330q : null, (r44 & 131072) != 0 ? r2.f24331r : null, (r44 & 262144) != 0 ? r2.f24332s : null, (r44 & 524288) != 0 ? r2.f24333t : null, (r44 & 1048576) != 0 ? r2.f24334u : null, (r44 & 2097152) != 0 ? r2.f24335v : null, (r44 & 4194304) != 0 ? r2.f24336w : null, (r44 & 8388608) != 0 ? ((n) stripeIntent).f24337x : null);
            return b9;
        }
        if (stripeIntent instanceof com.stripe.android.model.u) {
            b8 = r2.b((r36 & 1) != 0 ? r2.f24677a : null, (r36 & 2) != 0 ? r2.f24678b : null, (r36 & 4) != 0 ? r2.f24679c : 0L, (r36 & 8) != 0 ? r2.f24680d : null, (r36 & 16) != 0 ? r2.f24681e : null, (r36 & 32) != 0 ? r2.f24682f : null, (r36 & 64) != 0 ? r2.f24683g : false, (r36 & 128) != 0 ? r2.f24684h : null, (r36 & 256) != 0 ? r2.f24685i : null, (r36 & 512) != 0 ? r2.f24686j : arrayList, (r36 & 1024) != 0 ? r2.f24687k : null, (r36 & 2048) != 0 ? r2.f24688l : null, (r36 & 4096) != 0 ? r2.f24689m : null, (r36 & 8192) != 0 ? r2.f24690n : null, (r36 & 16384) != 0 ? r2.f24691o : null, (r36 & 32768) != 0 ? r2.f24692p : null, (r36 & 65536) != 0 ? ((com.stripe.android.model.u) stripeIntent).f24693q : null);
            return b8;
        }
        throw new p();
    }
}
