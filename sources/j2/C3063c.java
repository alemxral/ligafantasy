package j2;

import com.stripe.android.model.b;
import com.stripe.android.model.m;
import com.stripe.android.model.o;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: j2.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3063c extends AbstractC3065e {

    /* renamed from: b, reason: collision with root package name */
    private final String f32953b;

    /* renamed from: c, reason: collision with root package name */
    private final b.d f32954c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3063c(String clientSecret, b.d dVar) {
        super(null);
        AbstractC3159y.i(clientSecret, "clientSecret");
        this.f32953b = clientSecret;
        this.f32954c = dVar;
    }

    @Override // j2.AbstractC3065e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.model.b b(com.stripe.android.model.p createParams, com.stripe.android.model.r rVar) {
        AbstractC3159y.i(createParams, "createParams");
        return b.a.c(com.stripe.android.model.b.f24200o, createParams, this.f32953b, null, null, null, null, this.f32954c, rVar, 60, null);
    }

    @Override // j2.AbstractC3065e
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.model.b c(String paymentMethodId, o.p pVar, com.stripe.android.model.r rVar) {
        com.stripe.android.model.m mVar;
        AbstractC3159y.i(paymentMethodId, "paymentMethodId");
        b.a aVar = com.stripe.android.model.b.f24200o;
        String str = this.f32953b;
        com.stripe.android.model.m mVar2 = new com.stripe.android.model.m(m.c.a.f24307e.a());
        if (pVar != null && pVar.f24540d) {
            mVar = mVar2;
        } else {
            mVar = null;
        }
        return b.a.e(aVar, paymentMethodId, str, null, rVar, null, mVar, null, this.f32954c, 84, null);
    }
}
