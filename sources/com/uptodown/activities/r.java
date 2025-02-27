package com.uptodown.activities;

import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.M;
import kotlin.jvm.internal.AbstractC3159y;
import l5.AbstractC3337y;
import l5.C3312F;
import l6.AbstractC3351M;
import l6.InterfaceC3349K;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class r extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final l6.v f29314a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3349K f29315b;

    /* renamed from: c, reason: collision with root package name */
    private final l6.v f29316c;

    /* renamed from: d, reason: collision with root package name */
    private final l6.v f29317d;

    /* renamed from: e, reason: collision with root package name */
    private final l6.v f29318e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f29319f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f29320g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f29321h;

    /* renamed from: i, reason: collision with root package name */
    private int f29322i;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final X4.A f29323a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f29324b;

        public a(X4.A organization, boolean z8) {
            AbstractC3159y.i(organization, "organization");
            this.f29323a = organization;
            this.f29324b = z8;
        }

        public final boolean a() {
            return this.f29324b;
        }

        public final X4.A b() {
            return this.f29323a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC3159y.d(this.f29323a, aVar.f29323a) && this.f29324b == aVar.f29324b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.f29323a.hashCode() * 31;
            boolean z8 = this.f29324b;
            int i8 = z8;
            if (z8 != 0) {
                i8 = 1;
            }
            return hashCode + i8;
        }

        public String toString() {
            return "OrganizationData(organization=" + this.f29323a + ", moreDataAdded=" + this.f29324b + ')';
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29325a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f29327c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, P5.d dVar) {
            super(2, dVar);
            this.f29327c = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(this.f29327c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String d8;
            Q5.b.e();
            if (this.f29325a == 0) {
                L5.t.b(obj);
                r.this.n(true);
                r.this.m(false);
                X4.I K8 = new C3312F(this.f29327c).K(((Number) r.this.j().getValue()).longValue());
                if (!K8.b() && (d8 = K8.d()) != null && d8.length() != 0) {
                    String d9 = K8.d();
                    AbstractC3159y.f(d9);
                    JSONObject jSONObject = new JSONObject(d9);
                    if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                        X4.A a8 = (X4.A) r.this.f29316c.getValue();
                        JSONObject jSONObject2 = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                        AbstractC3159y.h(jSONObject2, "jsonObject.getJSONObject(Constantes.FIELD_DATA)");
                        a8.o(jSONObject2);
                    } else if (jSONObject.getInt("success") == 1) {
                        r.this.m(true);
                    }
                }
                r.this.f29314a.setValue(new AbstractC3337y.c(new a((X4.A) r.this.f29316c.getValue(), false)));
                r.this.n(false);
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29328a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f29330c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, P5.d dVar) {
            super(2, dVar);
            this.f29330c = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(this.f29330c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String d8;
            Q5.b.e();
            if (this.f29328a == 0) {
                L5.t.b(obj);
                r.this.f29314a.setValue(AbstractC3337y.a.f34533a);
                r.this.n(true);
                X4.I J8 = new C3312F(this.f29330c).J(((Number) r.this.j().getValue()).longValue(), r.this.f29322i);
                if (!J8.b() && (d8 = J8.d()) != null && d8.length() != 0) {
                    String d9 = J8.d();
                    AbstractC3159y.f(d9);
                    JSONObject jSONObject = new JSONObject(d9);
                    if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                        X4.A a8 = (X4.A) r.this.f29316c.getValue();
                        X4.A a9 = (X4.A) r.this.f29316c.getValue();
                        JSONArray jSONArray = jSONObject.getJSONArray(DataSchemeDataSource.SCHEME_DATA);
                        AbstractC3159y.h(jSONArray, "jsonObject.getJSONArray(Constantes.FIELD_DATA)");
                        a8.p(a9.n(jSONArray));
                    } else if (J8.b() && J8.e() == 404) {
                        r.this.m(true);
                        r.this.f29314a.setValue(AbstractC3337y.b.f34534a);
                    }
                    r.this.f29314a.setValue(new AbstractC3337y.c(new a((X4.A) r.this.f29316c.getValue(), true)));
                    r.this.f29322i++;
                } else {
                    r.this.m(true);
                    r.this.f29314a.setValue(AbstractC3337y.b.f34534a);
                }
                r.this.n(false);
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public r() {
        l6.v a8 = AbstractC3351M.a(AbstractC3337y.a.f34533a);
        this.f29314a = a8;
        this.f29315b = a8;
        this.f29316c = AbstractC3351M.a(new X4.A());
        this.f29317d = AbstractC3351M.a(0L);
        this.f29318e = AbstractC3351M.a("");
        this.f29322i = 2;
    }

    public final void e(Context context) {
        AbstractC3159y.i(context, "context");
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), C2812b0.b(), null, new b(context, null), 2, null);
    }

    public final void f(Context context) {
        AbstractC3159y.i(context, "context");
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), C2812b0.b(), null, new c(context, null), 2, null);
    }

    public final boolean g() {
        return this.f29320g;
    }

    public final InterfaceC3349K h() {
        return this.f29315b;
    }

    public final boolean i() {
        return this.f29319f;
    }

    public final l6.v j() {
        return this.f29317d;
    }

    public final l6.v k() {
        return this.f29318e;
    }

    public final boolean l() {
        return this.f29321h;
    }

    public final void m(boolean z8) {
        this.f29320g = z8;
    }

    public final void n(boolean z8) {
        this.f29319f = z8;
    }

    public final void o(boolean z8) {
        this.f29321h = z8;
    }
}
