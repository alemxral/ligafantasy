package com.uptodown.activities;

import X4.Q;
import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.M;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l5.AbstractC3338z;
import l5.C3312F;
import l6.AbstractC3351M;
import l6.InterfaceC3349K;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class G extends ViewModel {

    /* renamed from: g, reason: collision with root package name */
    public static final a f28206g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final l6.v f28207a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3349K f28208b;

    /* renamed from: c, reason: collision with root package name */
    private final l6.v f28209c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3349K f28210d;

    /* renamed from: e, reason: collision with root package name */
    private final l6.v f28211e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3349K f28212f;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f28213a;

        /* renamed from: b, reason: collision with root package name */
        private final String f28214b;

        public b(String id, String message) {
            AbstractC3159y.i(id, "id");
            AbstractC3159y.i(message, "message");
            this.f28213a = id;
            this.f28214b = message;
        }

        public final String a() {
            return this.f28213a;
        }

        public final String b() {
            return this.f28214b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC3159y.d(this.f28213a, bVar.f28213a) && AbstractC3159y.d(this.f28214b, bVar.f28214b);
        }

        public int hashCode() {
            return (this.f28213a.hashCode() * 31) + this.f28214b.hashCode();
        }

        public String toString() {
            return "UptodownTurboProductPriceData(id=" + this.f28213a + ", message=" + this.f28214b + ')';
        }
    }

    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final String f28215a;

        /* renamed from: b, reason: collision with root package name */
        private final b f28216b;

        /* renamed from: c, reason: collision with root package name */
        private final b f28217c;

        public c(String name, b yearProduct, b monthProduct) {
            AbstractC3159y.i(name, "name");
            AbstractC3159y.i(yearProduct, "yearProduct");
            AbstractC3159y.i(monthProduct, "monthProduct");
            this.f28215a = name;
            this.f28216b = yearProduct;
            this.f28217c = monthProduct;
        }

        public final b a() {
            return this.f28217c;
        }

        public final b b() {
            return this.f28216b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC3159y.d(this.f28215a, cVar.f28215a) && AbstractC3159y.d(this.f28216b, cVar.f28216b) && AbstractC3159y.d(this.f28217c, cVar.f28217c);
        }

        public int hashCode() {
            return (((this.f28215a.hashCode() * 31) + this.f28216b.hashCode()) * 31) + this.f28217c.hashCode();
        }

        public String toString() {
            return "UptodownTurboProductsData(name=" + this.f28215a + ", yearProduct=" + this.f28216b + ", monthProduct=" + this.f28217c + ')';
        }
    }

    /* loaded from: classes4.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final String f28218a;

        /* renamed from: b, reason: collision with root package name */
        private final String f28219b;

        /* renamed from: c, reason: collision with root package name */
        private final String f28220c;

        /* renamed from: d, reason: collision with root package name */
        private final String f28221d;

        /* renamed from: e, reason: collision with root package name */
        private final String f28222e;

        public d(String clientSecret, String publicKey, String ephemeralKey, String customerID, String buttonText) {
            AbstractC3159y.i(clientSecret, "clientSecret");
            AbstractC3159y.i(publicKey, "publicKey");
            AbstractC3159y.i(ephemeralKey, "ephemeralKey");
            AbstractC3159y.i(customerID, "customerID");
            AbstractC3159y.i(buttonText, "buttonText");
            this.f28218a = clientSecret;
            this.f28219b = publicKey;
            this.f28220c = ephemeralKey;
            this.f28221d = customerID;
            this.f28222e = buttonText;
        }

        public final String a() {
            return this.f28222e;
        }

        public final String b() {
            return this.f28218a;
        }

        public final String c() {
            return this.f28219b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return AbstractC3159y.d(this.f28218a, dVar.f28218a) && AbstractC3159y.d(this.f28219b, dVar.f28219b) && AbstractC3159y.d(this.f28220c, dVar.f28220c) && AbstractC3159y.d(this.f28221d, dVar.f28221d) && AbstractC3159y.d(this.f28222e, dVar.f28222e);
        }

        public int hashCode() {
            return (((((((this.f28218a.hashCode() * 31) + this.f28219b.hashCode()) * 31) + this.f28220c.hashCode()) * 31) + this.f28221d.hashCode()) * 31) + this.f28222e.hashCode();
        }

        public String toString() {
            return "UptodownTurboSubscriptionData(clientSecret=" + this.f28218a + ", publicKey=" + this.f28219b + ", ephemeralKey=" + this.f28220c + ", customerID=" + this.f28221d + ", buttonText=" + this.f28222e + ')';
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28223a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f28225c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f28226d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f28227e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f28228f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Context context, String str, String str2, String str3, P5.d dVar) {
            super(2, dVar);
            this.f28225c = context;
            this.f28226d = str;
            this.f28227e = str2;
            this.f28228f = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new e(this.f28225c, this.f28226d, this.f28227e, this.f28228f, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String d8;
            int i8;
            String str;
            String str2;
            String str3;
            String str4;
            boolean z8;
            boolean z9;
            boolean z10;
            boolean z11;
            Q5.b.e();
            if (this.f28223a == 0) {
                L5.t.b(obj);
                l6.v vVar = G.this.f28209c;
                AbstractC3338z.c cVar = AbstractC3338z.c.f34538a;
                vVar.setValue(cVar);
                X4.I i9 = new C3312F(this.f28225c).i(this.f28226d, this.f28227e, this.f28228f);
                if (!i9.b() && (d8 = i9.d()) != null && d8.length() != 0) {
                    String d9 = i9.d();
                    AbstractC3159y.f(d9);
                    JSONObject jSONObject = new JSONObject(d9);
                    boolean z12 = false;
                    if (!jSONObject.isNull("success")) {
                        i8 = jSONObject.getInt("success");
                    } else {
                        i8 = 0;
                    }
                    if (i8 == 1 && !jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                        String str5 = null;
                        if (!jSONObject2.isNull("clientSecret")) {
                            str = jSONObject2.getString("clientSecret");
                        } else {
                            str = null;
                        }
                        if (!jSONObject2.isNull("publicKey")) {
                            str2 = jSONObject2.getString("publicKey");
                        } else {
                            str2 = null;
                        }
                        if (!jSONObject2.isNull("ephemeralKey")) {
                            str3 = jSONObject2.getString("ephemeralKey");
                        } else {
                            str3 = null;
                        }
                        if (!jSONObject2.isNull("customerID")) {
                            str4 = jSONObject2.getString("customerID");
                        } else {
                            str4 = null;
                        }
                        if (!jSONObject2.isNull("buttonText")) {
                            str5 = jSONObject2.getString("buttonText");
                        }
                        String str6 = str5;
                        if (str != null && str.length() != 0) {
                            z8 = false;
                        } else {
                            z8 = true;
                        }
                        if (!z8) {
                            if (str2 != null && str2.length() != 0) {
                                z9 = false;
                            } else {
                                z9 = true;
                            }
                            if (!z9) {
                                if (str3 != null && str3.length() != 0) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                if (!z10) {
                                    if (str4 != null && str4.length() != 0) {
                                        z11 = false;
                                    } else {
                                        z11 = true;
                                    }
                                    if (!z11) {
                                        if (str6 == null || str6.length() == 0) {
                                            z12 = true;
                                        }
                                        if (!z12) {
                                            G.this.f28209c.setValue(new AbstractC3338z.d(new d(str, str2, str3, str4, str6)));
                                        }
                                    }
                                }
                            }
                        }
                        G.this.f28209c.setValue(cVar);
                    } else {
                        G.this.f28209c.setValue(cVar);
                    }
                }
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28229a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f28231c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Context context, P5.d dVar) {
            super(2, dVar);
            this.f28231c = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new f(this.f28231c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String d8;
            String str;
            String str2;
            String str3;
            Q5.b.e();
            if (this.f28229a == 0) {
                L5.t.b(obj);
                G.this.f28207a.setValue(AbstractC3338z.c.f34538a);
                X4.I h02 = new C3312F(this.f28231c).h0();
                if (!h02.b() && (d8 = h02.d()) != null && d8.length() != 0) {
                    String d9 = h02.d();
                    AbstractC3159y.f(d9);
                    JSONObject jSONObject = new JSONObject(d9);
                    if (jSONObject.getInt("success") == 1 && !jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                        JSONArray jSONArray = jSONObject.getJSONArray(DataSchemeDataSource.SCHEME_DATA);
                        int length = jSONArray.length();
                        for (int i8 = 0; i8 < length; i8++) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i8);
                            String str4 = "";
                            if (jSONObject2.isNull("name")) {
                                str = "";
                            } else {
                                str = jSONObject2.getString("name");
                                AbstractC3159y.h(str, "jsonObjectData.getString(FIELD_NAME)");
                            }
                            if (!jSONObject2.isNull("prices")) {
                                JSONObject jSONObject3 = jSONObject2.getJSONObject("prices");
                                if (jSONObject3.isNull("year")) {
                                    str2 = "";
                                } else {
                                    JSONObject jSONObject4 = jSONObject3.getJSONObject("year");
                                    if (jSONObject4.isNull("id")) {
                                        str3 = "";
                                    } else {
                                        str3 = jSONObject4.getString("id");
                                        AbstractC3159y.h(str3, "yearJsonObjectData.getSt…onstantes.FIELD_UDATA_ID)");
                                    }
                                    if (!jSONObject4.isNull("message")) {
                                        str4 = jSONObject4.getString("message");
                                        AbstractC3159y.h(str4, "yearJsonObjectData.getString(FIELD_MESSAGE)");
                                    }
                                    str2 = str4;
                                    str4 = str3;
                                }
                                b bVar = new b(str4, str2);
                                if (!jSONObject3.isNull("month")) {
                                    JSONObject jSONObject5 = jSONObject3.getJSONObject("month");
                                    if (!jSONObject5.isNull("id")) {
                                        str4 = jSONObject5.getString("id");
                                        AbstractC3159y.h(str4, "monthJsonObjectData.getS…onstantes.FIELD_UDATA_ID)");
                                    }
                                    if (!jSONObject5.isNull("message")) {
                                        str2 = jSONObject5.getString("message");
                                        AbstractC3159y.h(str2, "monthJsonObjectData.getString(FIELD_MESSAGE)");
                                    }
                                }
                                G.this.f28207a.setValue(new AbstractC3338z.d(new c(str, bVar, new b(str4, str2))));
                            }
                        }
                    } else {
                        G.this.f28207a.setValue(AbstractC3338z.a.f34536a);
                    }
                } else {
                    G.this.f28207a.setValue(AbstractC3338z.a.f34536a);
                }
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28232a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f28233b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ G f28234c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Context context, G g8, P5.d dVar) {
            super(2, dVar);
            this.f28233b = context;
            this.f28234c = g8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new g(this.f28233b, this.f28234c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String id;
            String d8;
            Q5.b.e();
            if (this.f28232a == 0) {
                L5.t.b(obj);
                C3312F c3312f = new C3312F(this.f28233b);
                Q e8 = Q.f12424k.e(this.f28233b);
                if (e8 != null && (id = e8.getId()) != null && id.length() != 0) {
                    String id2 = e8.getId();
                    AbstractC3159y.f(id2);
                    X4.I Z7 = c3312f.Z(id2);
                    if (!Z7.b() && (d8 = Z7.d()) != null && d8.length() != 0) {
                        String d9 = Z7.d();
                        AbstractC3159y.f(d9);
                        JSONObject jSONObject = new JSONObject(d9);
                        if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                            JSONObject jSONObject2 = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                            AbstractC3159y.h(jSONObject2, "jsonObject.getJSONObject(Constantes.FIELD_DATA)");
                            if (!jSONObject2.isNull("url")) {
                                this.f28234c.f28211e.setValue(new AbstractC3338z.d(jSONObject2.getString("url")));
                            }
                        }
                    }
                }
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public G() {
        AbstractC3338z.b bVar = AbstractC3338z.b.f34537a;
        l6.v a8 = AbstractC3351M.a(bVar);
        this.f28207a = a8;
        this.f28208b = a8;
        l6.v a9 = AbstractC3351M.a(bVar);
        this.f28209c = a9;
        this.f28210d = a9;
        l6.v a10 = AbstractC3351M.a(bVar);
        this.f28211e = a10;
        this.f28212f = a10;
    }

    public final void d(Context context, String priceId, String userID, String productType) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(priceId, "priceId");
        AbstractC3159y.i(userID, "userID");
        AbstractC3159y.i(productType, "productType");
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), C2812b0.b(), null, new e(context, userID, priceId, productType, null), 2, null);
    }

    public final InterfaceC3349K e() {
        return this.f28208b;
    }

    public final void f(Context context) {
        AbstractC3159y.i(context, "context");
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), C2812b0.b(), null, new f(context, null), 2, null);
    }

    public final InterfaceC3349K g() {
        return this.f28212f;
    }

    public final void h(Context context) {
        AbstractC3159y.i(context, "context");
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), C2812b0.b(), null, new g(context, this, null), 2, null);
    }

    public final InterfaceC3349K i() {
        return this.f28210d;
    }
}
