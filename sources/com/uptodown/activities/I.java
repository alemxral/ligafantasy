package com.uptodown.activities;

import X4.K;
import X4.Q;
import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.M;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3159y;
import l5.AbstractC3337y;
import l5.C3312F;
import l6.AbstractC3351M;
import l6.InterfaceC3349K;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class I extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final l6.v f28262a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3349K f28263b;

    /* renamed from: c, reason: collision with root package name */
    private final l6.v f28264c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3349K f28265d;

    /* renamed from: e, reason: collision with root package name */
    private l6.v f28266e;

    /* renamed from: f, reason: collision with root package name */
    private l6.v f28267f;

    /* renamed from: g, reason: collision with root package name */
    private l6.v f28268g;

    /* renamed from: h, reason: collision with root package name */
    private l6.v f28269h;

    /* renamed from: i, reason: collision with root package name */
    private l6.v f28270i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f28271j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f28272k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f28273l;

    /* renamed from: m, reason: collision with root package name */
    private int f28274m;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Q f28275a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList f28276b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f28277c;

        public a(Q q8, ArrayList reviews, boolean z8) {
            AbstractC3159y.i(reviews, "reviews");
            this.f28275a = q8;
            this.f28276b = reviews;
            this.f28277c = z8;
        }

        public final ArrayList a() {
            return this.f28276b;
        }

        public final Q b() {
            return this.f28275a;
        }

        public final boolean c() {
            return this.f28277c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC3159y.d(this.f28275a, aVar.f28275a) && AbstractC3159y.d(this.f28276b, aVar.f28276b) && this.f28277c == aVar.f28277c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            Q q8 = this.f28275a;
            int hashCode = (((q8 == null ? 0 : q8.hashCode()) * 31) + this.f28276b.hashCode()) * 31;
            boolean z8 = this.f28277c;
            int i8 = z8;
            if (z8 != 0) {
                i8 = 1;
            }
            return hashCode + i8;
        }

        public String toString() {
            return "UserCommentsData(user=" + this.f28275a + ", reviews=" + this.f28276b + ", userExists=" + this.f28277c + ')';
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28278a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f28280c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, P5.d dVar) {
            super(2, dVar);
            this.f28280c = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(this.f28280c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q q8;
            Q5.b.e();
            if (this.f28278a == 0) {
                L5.t.b(obj);
                if (I.this.f28272k) {
                    ArrayList arrayList = new ArrayList();
                    C3312F c3312f = new C3312F(this.f28280c);
                    Object value = I.this.m().getValue();
                    AbstractC3159y.f(value);
                    X4.I p02 = c3312f.p0((String) value, 10, I.this.j());
                    Q q9 = null;
                    JSONArray jSONArray = null;
                    q9 = null;
                    q9 = null;
                    if (!p02.b() && p02.d() != null) {
                        String d8 = p02.d();
                        AbstractC3159y.f(d8);
                        JSONObject jSONObject = new JSONObject(d8);
                        if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                            JSONObject jSONObject2 = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                            if (!jSONObject2.isNull("user")) {
                                q8 = new Q();
                                JSONObject jSONObject3 = jSONObject2.getJSONObject("user");
                                AbstractC3159y.h(jSONObject3, "jsonObjectData.getJSONOb…ct(Constantes.FIELD_USER)");
                                q8.i(jSONObject3);
                                I.this.n().setValue(q8.n());
                                I.this.l().setValue(q8.c());
                                I.this.o().setValue(q8.u());
                                I.this.p().setValue(kotlin.coroutines.jvm.internal.b.a(q8.I()));
                            } else {
                                q8 = null;
                            }
                            if (!jSONObject2.isNull("comments")) {
                                jSONArray = jSONObject2.getJSONArray("comments");
                            }
                            if (jSONArray == null) {
                                I.this.f28272k = false;
                            } else {
                                int length = jSONArray.length();
                                for (int i8 = 0; i8 < length; i8++) {
                                    K.b bVar = X4.K.f12368o;
                                    JSONObject jSONObject4 = jSONArray.getJSONObject(i8);
                                    AbstractC3159y.h(jSONObject4, "jsonArrayData.getJSONObject(i)");
                                    arrayList.add(bVar.g(jSONObject4));
                                }
                            }
                            q9 = q8;
                        }
                    } else if (p02.e() == 404) {
                        I.this.f28271j = false;
                    }
                    I i9 = I.this;
                    i9.s(i9.j() + arrayList.size());
                    I.this.f28262a.setValue(new AbstractC3337y.c(new a(q9, arrayList, I.this.f28271j)));
                }
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28281a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ X4.K f28282b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f28283c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ I f28284d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(X4.K k8, Context context, I i8, P5.d dVar) {
            super(2, dVar);
            this.f28282b = k8;
            this.f28283c = context;
            this.f28284d = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(this.f28282b, this.f28283c, this.f28284d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f28281a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                K.b bVar = X4.K.f12368o;
                X4.K k8 = this.f28282b;
                Context context = this.f28283c;
                this.f28281a = 1;
                obj = bVar.c(k8, context, this);
                if (obj == e8) {
                    return e8;
                }
            }
            this.f28284d.f28264c.setValue(new AbstractC3337y.c(new K.c(this.f28282b, ((Number) obj).intValue())));
            return L5.I.f6474a;
        }
    }

    public I() {
        AbstractC3337y.a aVar = AbstractC3337y.a.f34533a;
        l6.v a8 = AbstractC3351M.a(aVar);
        this.f28262a = a8;
        this.f28263b = a8;
        l6.v a9 = AbstractC3351M.a(aVar);
        this.f28264c = a9;
        this.f28265d = a9;
        this.f28266e = AbstractC3351M.a("");
        this.f28267f = AbstractC3351M.a("");
        this.f28268g = AbstractC3351M.a("");
        this.f28269h = AbstractC3351M.a("");
        this.f28270i = AbstractC3351M.a(Boolean.FALSE);
        this.f28271j = true;
        this.f28272k = true;
    }

    public final void g(Context context) {
        AbstractC3159y.i(context, "context");
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), C2812b0.b(), null, new b(context, null), 2, null);
    }

    public final InterfaceC3349K h() {
        return this.f28263b;
    }

    public final boolean i() {
        return this.f28273l;
    }

    public final int j() {
        return this.f28274m;
    }

    public final InterfaceC3349K k() {
        return this.f28265d;
    }

    public final l6.v l() {
        return this.f28268g;
    }

    public final l6.v m() {
        return this.f28266e;
    }

    public final l6.v n() {
        return this.f28267f;
    }

    public final l6.v o() {
        return this.f28269h;
    }

    public final l6.v p() {
        return this.f28270i;
    }

    public final void q(Context context, X4.K review) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(review, "review");
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), C2812b0.b(), null, new c(review, context, this, null), 2, null);
    }

    public final void r(boolean z8) {
        this.f28273l = z8;
    }

    public final void s(int i8) {
        this.f28274m = i8;
    }
}
