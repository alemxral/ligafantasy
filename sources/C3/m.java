package c3;

import M5.AbstractC1246t;
import com.stripe.android.model.i;
import com.stripe.android.model.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONObject;
import w2.InterfaceC3845a;

/* loaded from: classes4.dex */
public final class m implements InterfaceC3845a {

    /* renamed from: f, reason: collision with root package name */
    private static final a f14908f = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final String f14909b;

    /* renamed from: c, reason: collision with root package name */
    private final i.b.a f14910c;

    /* renamed from: d, reason: collision with root package name */
    private final String f14911d;

    /* renamed from: e, reason: collision with root package name */
    private final Function0 f14912e;

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14913a;

        static {
            int[] iArr = new int[n.b.values().length];
            try {
                iArr[n.b.f24350c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n.b.f24351d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n.b.f24352e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f14913a = iArr;
        }
    }

    public m(String str, i.b.a paymentMode, String apiKey, Function0 timeProvider) {
        AbstractC3159y.i(paymentMode, "paymentMode");
        AbstractC3159y.i(apiKey, "apiKey");
        AbstractC3159y.i(timeProvider, "timeProvider");
        this.f14909b = str;
        this.f14910c = paymentMode;
        this.f14911d = apiKey;
        this.f14912e = timeProvider;
    }

    @Override // w2.InterfaceC3845a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.model.n a(JSONObject json) {
        n.b bVar;
        AbstractC3159y.i(json, "json");
        InterfaceC3845a.C0900a c0900a = InterfaceC3845a.f38975a;
        List a8 = c0900a.a(json.optJSONArray("payment_method_types"));
        List a9 = c0900a.a(json.optJSONArray("unactivated_payment_method_types"));
        List a10 = c0900a.a(json.optJSONArray("link_funding_sources"));
        ArrayList arrayList = new ArrayList(AbstractC1246t.x(a10, 10));
        Iterator it = a10.iterator();
        while (it.hasNext()) {
            String lowerCase = ((String) it.next()).toLowerCase(Locale.ROOT);
            AbstractC3159y.h(lowerCase, "toLowerCase(...)");
            arrayList.add(lowerCase);
        }
        String l8 = v2.e.l(json, "country_code");
        int i8 = b.f14913a[this.f14910c.c().ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 == 3) {
                    bVar = n.b.f24352e;
                } else {
                    throw new L5.p();
                }
            } else {
                bVar = n.b.f24351d;
            }
        } else {
            bVar = n.b.f24350c;
        }
        n.b bVar2 = bVar;
        String str = this.f14909b;
        boolean z8 = !g6.n.H(this.f14911d, "test", false, 2, null);
        return new com.stripe.android.model.n(str, a8, Long.valueOf(this.f14910c.b()), 0L, null, bVar2, null, null, l8, ((Number) this.f14912e.invoke()).longValue(), this.f14910c.K(), null, z8, null, null, null, null, this.f14910c.E(), null, null, a9, arrayList, null, null, 13494424, null);
    }
}
