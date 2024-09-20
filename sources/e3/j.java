package e3;

import android.content.Context;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class j implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f30243a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f30244b;

    /* renamed from: c, reason: collision with root package name */
    private final I5.a f30245c;

    public j(I5.a aVar, I5.a aVar2, I5.a aVar3) {
        this.f30243a = aVar;
        this.f30244b = aVar2;
        this.f30245c = aVar3;
    }

    public static j a(I5.a aVar, I5.a aVar2, I5.a aVar3) {
        return new j(aVar, aVar2, aVar3);
    }

    public static PaymentAnalyticsRequestFactory c(Context context, Function0 function0, Set set) {
        return new PaymentAnalyticsRequestFactory(context, function0, set);
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public PaymentAnalyticsRequestFactory get() {
        return c((Context) this.f30243a.get(), (Function0) this.f30244b.get(), (Set) this.f30245c.get());
    }
}
