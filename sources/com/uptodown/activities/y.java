package com.uptodown.activities;

import X4.D;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import i6.AbstractC2825i;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.J0;
import i6.M;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import l5.AbstractC3337y;
import l5.C3312F;
import l5.C3330r;
import l6.AbstractC3351M;
import l6.InterfaceC3349K;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class y extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final l6.v f29416a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3349K f29417b;

    /* renamed from: c, reason: collision with root package name */
    private final l6.v f29418c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3349K f29419d;

    /* renamed from: e, reason: collision with root package name */
    private final l6.v f29420e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f29421f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f29422g;

    /* renamed from: h, reason: collision with root package name */
    private final int f29423h;

    /* loaded from: classes4.dex */
    public enum a {
        NAME,
        DATE
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f29427a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList f29428b;

        public b(ArrayList userPreRegisterApps, ArrayList preRegisterApps) {
            AbstractC3159y.i(userPreRegisterApps, "userPreRegisterApps");
            AbstractC3159y.i(preRegisterApps, "preRegisterApps");
            this.f29427a = userPreRegisterApps;
            this.f29428b = preRegisterApps;
        }

        public final ArrayList a() {
            return this.f29428b;
        }

        public final ArrayList b() {
            return this.f29427a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC3159y.d(this.f29427a, bVar.f29427a) && AbstractC3159y.d(this.f29428b, bVar.f29428b);
        }

        public int hashCode() {
            return (this.f29427a.hashCode() * 31) + this.f29428b.hashCode();
        }

        public String toString() {
            return "UpcomingReleasesData(userPreRegisterApps=" + this.f29427a + ", preRegisterApps=" + this.f29428b + ')';
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29429a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f29430b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ X4.D f29431c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0 f29432d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f29433a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0 f29434b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Function0 function0, P5.d dVar) {
                super(2, dVar);
                this.f29434b = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f29434b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f29433a == 0) {
                    L5.t.b(obj);
                    this.f29434b.invoke();
                    return L5.I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, X4.D d8, Function0 function0, P5.d dVar) {
            super(2, dVar);
            this.f29430b = context;
            this.f29431c = d8;
            this.f29432d = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(this.f29430b, this.f29431c, this.f29432d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String d8;
            Object e8 = Q5.b.e();
            int i8 = this.f29429a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                X4.I d9 = new C3312F(this.f29430b).d(this.f29431c.b());
                if (!d9.b() && (d8 = d9.d()) != null && d8.length() != 0) {
                    String d10 = d9.d();
                    AbstractC3159y.f(d10);
                    JSONObject jSONObject = new JSONObject(d10);
                    if (!jSONObject.isNull("success") && jSONObject.getInt("success") == 1) {
                        Bundle bundle = new Bundle();
                        bundle.putString("type", "removed");
                        new C3330r(this.f29430b).b("preregister", bundle);
                        this.f29431c.i(this.f29430b);
                        J0 c8 = C2812b0.c();
                        a aVar = new a(this.f29432d, null);
                        this.f29429a = 1;
                        if (AbstractC2825i.g(c8, aVar, this) == e8) {
                            return e8;
                        }
                    }
                }
            }
            return L5.I.f6474a;
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        Object f29435a;

        /* renamed from: b, reason: collision with root package name */
        int f29436b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f29438d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f29439e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ a f29440f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f29441g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z8, Context context, a aVar, boolean z9, P5.d dVar) {
            super(2, dVar);
            this.f29438d = z8;
            this.f29439e = context;
            this.f29440f = aVar;
            this.f29441g = z9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new d(this.f29438d, this.f29439e, this.f29440f, this.f29441g, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            l6.v vVar;
            l6.v vVar2;
            Object e8 = Q5.b.e();
            int i8 = this.f29436b;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        vVar2 = (l6.v) this.f29435a;
                        L5.t.b(obj);
                        vVar2.setValue(obj);
                        y.this.f29416a.setValue(new AbstractC3337y.c(new b((ArrayList) y.this.f29418c.getValue(), (ArrayList) y.this.f29420e.getValue())));
                        return L5.I.f6474a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                vVar = (l6.v) this.f29435a;
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                y.this.r(false);
                if (this.f29438d) {
                    y.this.f29416a.setValue(AbstractC3337y.a.f34533a);
                }
                vVar = y.this.f29418c;
                y yVar = y.this;
                Context context = this.f29439e;
                this.f29435a = vVar;
                this.f29436b = 1;
                obj = yVar.p(context, this);
                if (obj == e8) {
                    return e8;
                }
            }
            vVar.setValue(obj);
            l6.v vVar3 = y.this.f29420e;
            y yVar2 = y.this;
            Context context2 = this.f29439e;
            a aVar = this.f29440f;
            boolean z8 = this.f29441g;
            this.f29435a = vVar3;
            this.f29436b = 2;
            Object n8 = y.n(yVar2, context2, aVar, z8, 0, this, 8, null);
            if (n8 == e8) {
                return e8;
            }
            vVar2 = vVar3;
            obj = n8;
            vVar2.setValue(obj);
            y.this.f29416a.setValue(new AbstractC3337y.c(new b((ArrayList) y.this.f29418c.getValue(), (ArrayList) y.this.f29420e.getValue())));
            return L5.I.f6474a;
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29442a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f29444c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f29445d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f29446e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Context context, a aVar, boolean z8, P5.d dVar) {
            super(2, dVar);
            this.f29444c = context;
            this.f29445d = aVar;
            this.f29446e = z8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new e(this.f29444c, this.f29445d, this.f29446e, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f29442a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                y yVar = y.this;
                Context context = this.f29444c;
                a aVar = this.f29445d;
                boolean z8 = this.f29446e;
                int size = ((ArrayList) yVar.f29420e.getValue()).size();
                this.f29442a = 1;
                obj = yVar.m(context, aVar, z8, size, this);
                if (obj == e8) {
                    return e8;
                }
            }
            ArrayList arrayList = (ArrayList) obj;
            if (!arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll((Collection) y.this.f29420e.getValue());
                arrayList2.addAll(arrayList);
                y.this.f29420e.setValue(arrayList2);
                y.this.f29416a.setValue(new AbstractC3337y.c(new b((ArrayList) y.this.f29418c.getValue(), (ArrayList) y.this.f29420e.getValue())));
            } else {
                y.this.f29416a.setValue(AbstractC3337y.b.f34534a);
            }
            return L5.I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29447a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f29449c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f29450d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ a f29451e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f29452f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Context context, boolean z8, a aVar, int i8, P5.d dVar) {
            super(2, dVar);
            this.f29449c = context;
            this.f29450d = z8;
            this.f29451e = aVar;
            this.f29452f = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new f(this.f29449c, this.f29450d, this.f29451e, this.f29452f, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String str;
            String str2;
            Q5.b.e();
            if (this.f29447a == 0) {
                L5.t.b(obj);
                y.this.s(true);
                ArrayList arrayList = new ArrayList();
                C3312F c3312f = new C3312F(this.f29449c);
                if (this.f29450d) {
                    str = CampaignEx.JSON_KEY_DESC;
                } else {
                    str = "asc";
                }
                if (this.f29451e == a.DATE) {
                    str2 = "expireDate";
                } else {
                    str2 = "name";
                }
                X4.I O8 = c3312f.O(y.this.f29423h, this.f29452f, str2, str);
                if (!O8.b() && O8.d() != null) {
                    String d8 = O8.d();
                    AbstractC3159y.f(d8);
                    if (d8.length() > 0) {
                        String d9 = O8.d();
                        AbstractC3159y.f(d9);
                        JSONObject jSONObject = new JSONObject(d9);
                        if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                            JSONArray jSONArray = jSONObject.getJSONArray(DataSchemeDataSource.SCHEME_DATA);
                            int length = jSONArray.length();
                            for (int i8 = 0; i8 < length; i8++) {
                                JSONObject jsonUpcomingRelease = jSONArray.getJSONObject(i8);
                                D.a aVar = X4.D.f12322f;
                                AbstractC3159y.h(jsonUpcomingRelease, "jsonUpcomingRelease");
                                arrayList.add(aVar.b(jsonUpcomingRelease));
                            }
                        } else if (jSONObject.getInt("success") == 1) {
                            y.this.r(true);
                        }
                    }
                }
                y.this.s(false);
                return arrayList;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29453a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f29454b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Context context, P5.d dVar) {
            super(2, dVar);
            this.f29454b = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new g(this.f29454b, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String d8;
            Q5.b.e();
            if (this.f29453a == 0) {
                L5.t.b(obj);
                ArrayList arrayList = new ArrayList();
                X4.I P8 = new C3312F(this.f29454b).P();
                if (!P8.b() && (d8 = P8.d()) != null && d8.length() != 0) {
                    String d9 = P8.d();
                    AbstractC3159y.f(d9);
                    JSONObject jSONObject = new JSONObject(d9);
                    if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                        JSONArray jSONArray = jSONObject.getJSONArray(DataSchemeDataSource.SCHEME_DATA);
                        int length = jSONArray.length();
                        for (int i8 = 0; i8 < length; i8++) {
                            JSONObject jsonUpcomingRelease = jSONArray.getJSONObject(i8);
                            D.a aVar = X4.D.f12322f;
                            AbstractC3159y.h(jsonUpcomingRelease, "jsonUpcomingRelease");
                            arrayList.add(aVar.b(jsonUpcomingRelease));
                        }
                    }
                }
                return arrayList;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes4.dex */
    static final class h extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29455a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f29456b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ X4.D f29457c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0 f29458d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f29459a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0 f29460b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Function0 function0, P5.d dVar) {
                super(2, dVar);
                this.f29460b = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f29460b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f29459a == 0) {
                    L5.t.b(obj);
                    this.f29460b.invoke();
                    return L5.I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Context context, X4.D d8, Function0 function0, P5.d dVar) {
            super(2, dVar);
            this.f29456b = context;
            this.f29457c = d8;
            this.f29458d = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new h(this.f29456b, this.f29457c, this.f29458d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((h) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String d8;
            Object e8 = Q5.b.e();
            int i8 = this.f29455a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                X4.I a8 = new C3312F(this.f29456b).a(this.f29457c.b());
                if (!a8.b() && (d8 = a8.d()) != null && d8.length() != 0) {
                    String d9 = a8.d();
                    AbstractC3159y.f(d9);
                    JSONObject jSONObject = new JSONObject(d9);
                    if (!jSONObject.isNull("success") && jSONObject.getInt("success") == 1) {
                        Bundle bundle = new Bundle();
                        bundle.putString("type", "added");
                        new C3330r(this.f29456b).b("preregister", bundle);
                        this.f29457c.h(this.f29456b);
                        J0 c8 = C2812b0.c();
                        a aVar = new a(this.f29458d, null);
                        this.f29455a = 1;
                        if (AbstractC2825i.g(c8, aVar, this) == e8) {
                            return e8;
                        }
                    }
                }
            }
            return L5.I.f6474a;
        }
    }

    public y() {
        l6.v a8 = AbstractC3351M.a(AbstractC3337y.a.f34533a);
        this.f29416a = a8;
        this.f29417b = a8;
        l6.v a9 = AbstractC3351M.a(new ArrayList());
        this.f29418c = a9;
        this.f29419d = a9;
        this.f29420e = AbstractC3351M.a(new ArrayList());
        this.f29423h = 40;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object m(Context context, a aVar, boolean z8, int i8, P5.d dVar) {
        return AbstractC2825i.g(C2812b0.b(), new f(context, z8, aVar, i8, null), dVar);
    }

    static /* synthetic */ Object n(y yVar, Context context, a aVar, boolean z8, int i8, P5.d dVar, int i9, Object obj) {
        int i10;
        if ((i9 & 8) != 0) {
            i10 = 0;
        } else {
            i10 = i8;
        }
        return yVar.m(context, aVar, z8, i10, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object p(Context context, P5.d dVar) {
        return AbstractC2825i.g(C2812b0.b(), new g(context, null), dVar);
    }

    public final void g(Context context, X4.D preRegister, Function0 callback) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(preRegister, "preRegister");
        AbstractC3159y.i(callback, "callback");
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), C2812b0.b(), null, new c(context, preRegister, callback, null), 2, null);
    }

    public final void h(Context context, a sortByActive, boolean z8, boolean z9) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(sortByActive, "sortByActive");
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), C2812b0.b(), null, new d(z9, context, sortByActive, z8, null), 2, null);
    }

    public final void i(Context context, a sortByActive, boolean z8) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(sortByActive, "sortByActive");
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), C2812b0.b(), null, new e(context, sortByActive, z8, null), 2, null);
    }

    public final boolean j() {
        return this.f29421f;
    }

    public final InterfaceC3349K k() {
        return this.f29417b;
    }

    public final boolean l() {
        return this.f29422g;
    }

    public final InterfaceC3349K o() {
        return this.f29419d;
    }

    public final void q(Context context, X4.D preRegister, Function0 callback) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(preRegister, "preRegister");
        AbstractC3159y.i(callback, "callback");
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), C2812b0.b(), null, new h(context, preRegister, callback, null), 2, null);
    }

    public final void r(boolean z8) {
        this.f29421f = z8;
    }

    public final void s(boolean z8) {
        this.f29422g = z8;
    }
}
