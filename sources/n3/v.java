package n3;

import android.content.Context;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import l3.InterfaceC3178h;

/* loaded from: classes4.dex */
public final class v implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final s f36108a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f36109b;

    /* renamed from: c, reason: collision with root package name */
    private final I5.a f36110c;

    /* renamed from: d, reason: collision with root package name */
    private final I5.a f36111d;

    /* renamed from: e, reason: collision with root package name */
    private final I5.a f36112e;

    /* renamed from: f, reason: collision with root package name */
    private final I5.a f36113f;

    /* renamed from: g, reason: collision with root package name */
    private final I5.a f36114g;

    /* renamed from: h, reason: collision with root package name */
    private final I5.a f36115h;

    /* renamed from: i, reason: collision with root package name */
    private final I5.a f36116i;

    /* renamed from: j, reason: collision with root package name */
    private final I5.a f36117j;

    /* renamed from: k, reason: collision with root package name */
    private final I5.a f36118k;

    public v(s sVar, I5.a aVar, I5.a aVar2, I5.a aVar3, I5.a aVar4, I5.a aVar5, I5.a aVar6, I5.a aVar7, I5.a aVar8, I5.a aVar9, I5.a aVar10) {
        this.f36108a = sVar;
        this.f36109b = aVar;
        this.f36110c = aVar2;
        this.f36111d = aVar3;
        this.f36112e = aVar4;
        this.f36113f = aVar5;
        this.f36114g = aVar6;
        this.f36115h = aVar7;
        this.f36116i = aVar8;
        this.f36117j = aVar9;
        this.f36118k = aVar10;
    }

    public static v a(s sVar, I5.a aVar, I5.a aVar2, I5.a aVar3, I5.a aVar4, I5.a aVar5, I5.a aVar6, I5.a aVar7, I5.a aVar8, I5.a aVar9, I5.a aVar10) {
        return new v(sVar, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10);
    }

    public static InterfaceC3178h c(s sVar, Context context, boolean z8, P5.g gVar, P5.g gVar2, Map map, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, Function0 function0, Set set, boolean z9, boolean z10) {
        return (InterfaceC3178h) u5.h.d(sVar.c(context, z8, gVar, gVar2, map, paymentAnalyticsRequestFactory, function0, set, z9, z10));
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC3178h get() {
        return c(this.f36108a, (Context) this.f36109b.get(), ((Boolean) this.f36110c.get()).booleanValue(), (P5.g) this.f36111d.get(), (P5.g) this.f36112e.get(), (Map) this.f36113f.get(), (PaymentAnalyticsRequestFactory) this.f36114g.get(), (Function0) this.f36115h.get(), (Set) this.f36116i.get(), ((Boolean) this.f36117j.get()).booleanValue(), ((Boolean) this.f36118k.get()).booleanValue());
    }
}
