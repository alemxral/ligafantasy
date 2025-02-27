package c3;

import M5.AbstractC1246t;
import com.stripe.android.model.i;
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
public final class n implements InterfaceC3845a {

    /* renamed from: f, reason: collision with root package name */
    private static final a f14914f = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final String f14915b;

    /* renamed from: c, reason: collision with root package name */
    private final i.b.C0502b f14916c;

    /* renamed from: d, reason: collision with root package name */
    private final String f14917d;

    /* renamed from: e, reason: collision with root package name */
    private final Function0 f14918e;

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public n(String str, i.b.C0502b setupMode, String apiKey, Function0 timeProvider) {
        AbstractC3159y.i(setupMode, "setupMode");
        AbstractC3159y.i(apiKey, "apiKey");
        AbstractC3159y.i(timeProvider, "timeProvider");
        this.f14915b = str;
        this.f14916c = setupMode;
        this.f14917d = apiKey;
        this.f14918e = timeProvider;
    }

    @Override // w2.InterfaceC3845a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.model.u a(JSONObject json) {
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
        return new com.stripe.android.model.u(this.f14915b, null, ((Number) this.f14918e.invoke()).longValue(), l8, null, null, g6.n.H(this.f14917d, "live", false, 2, null), null, null, a8, null, this.f14916c.E(), null, a9, arrayList, null, null, 69760, null);
    }
}
