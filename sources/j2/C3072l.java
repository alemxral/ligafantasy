package j2;

import android.content.Context;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONObject;
import r2.C3681a;

/* renamed from: j2.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3072l {

    /* renamed from: d, reason: collision with root package name */
    private static final a f32984d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f32985a;

    /* renamed from: b, reason: collision with root package name */
    private final String f32986b;

    /* renamed from: c, reason: collision with root package name */
    private final String f32987c;

    /* renamed from: j2.l$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public C3072l(String publishableKey, String str) {
        AbstractC3159y.i(publishableKey, "publishableKey");
        this.f32985a = str;
        this.f32986b = C3681a.f37540a.a().b(publishableKey);
        this.f32987c = "20.49.0";
    }

    private final String a() {
        String str = this.f32985a;
        if (str != null) {
            String str2 = this.f32986b + "/" + str;
            if (str2 != null) {
                return str2;
            }
        }
        return this.f32986b;
    }

    public final JSONObject b() {
        JSONObject put = new JSONObject().put("type", "PAYMENT_GATEWAY").put("parameters", new JSONObject().put("gateway", "stripe").put("stripe:version", "StripeAndroid/" + this.f32987c).put("stripe:publishableKey", a()));
        AbstractC3159y.h(put, "put(...)");
        return put;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3072l(Context context) {
        this(r.f33047c.a(context));
        AbstractC3159y.i(context, "context");
    }

    private C3072l(r rVar) {
        this(rVar.e(), rVar.f());
    }
}
