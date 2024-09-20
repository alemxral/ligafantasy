package com.stripe.android.paymentsheet;

import J3.C1201i;
import J3.InterfaceC1206n;
import J3.InterfaceC1211t;
import L5.C1224h;
import L5.I;
import L5.InterfaceC1227k;
import M5.AbstractC1246t;
import androidx.lifecycle.ViewModelKt;
import b3.EnumC1870e;
import c4.InterfaceC1925a;
import com.stripe.android.model.o;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.p;
import i6.AbstractC2829k;
import i6.M;
import i6.X;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l6.AbstractC3351M;
import l6.InterfaceC3349K;
import l6.InterfaceC3359g;
import q3.C3649b;
import y2.AbstractC3984c;
import y2.InterfaceC3983b;
import y3.AbstractC3991f;
import z3.C4020b;
import z3.InterfaceC4021c;

/* loaded from: classes4.dex */
public final class B {

    /* renamed from: u, reason: collision with root package name */
    public static final e f25357u = new e(null);

    /* renamed from: v, reason: collision with root package name */
    public static final int f25358v = 8;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1211t.a f25359a;

    /* renamed from: b, reason: collision with root package name */
    private final EventReporter f25360b;

    /* renamed from: c, reason: collision with root package name */
    private final M f25361c;

    /* renamed from: d, reason: collision with root package name */
    private final P5.g f25362d;

    /* renamed from: e, reason: collision with root package name */
    private final C4020b f25363e;

    /* renamed from: f, reason: collision with root package name */
    private final H3.c f25364f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f25365g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3349K f25366h;

    /* renamed from: i, reason: collision with root package name */
    private final Function1 f25367i;

    /* renamed from: j, reason: collision with root package name */
    private final Function0 f25368j;

    /* renamed from: k, reason: collision with root package name */
    private final Function0 f25369k;

    /* renamed from: l, reason: collision with root package name */
    private final Function0 f25370l;

    /* renamed from: m, reason: collision with root package name */
    private final C3649b f25371m;

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC3349K f25372n;

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC3349K f25373o;

    /* renamed from: p, reason: collision with root package name */
    private final InterfaceC1227k f25374p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC3349K f25375q;

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC3349K f25376r;

    /* renamed from: s, reason: collision with root package name */
    private final l6.v f25377s;

    /* renamed from: t, reason: collision with root package name */
    private final InterfaceC3349K f25378t;

    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f25379a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.paymentsheet.B$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0564a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ B f25381a;

            C0564a(B b8) {
                this.f25381a = b8;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3991f abstractC3991f, P5.d dVar) {
                if (abstractC3991f instanceof AbstractC3991f.C0916f) {
                    this.f25381a.f25371m.e(((AbstractC3991f.C0916f) abstractC3991f).v());
                }
                return I.f6474a;
            }
        }

        a(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new a(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f25379a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K interfaceC3349K = B.this.f25366h;
                C0564a c0564a = new C0564a(B.this);
                this.f25379a = 1;
                if (interfaceC3349K.collect(c0564a, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f25382a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ B f25384a;

            a(B b8) {
                this.f25384a = b8;
            }

            public final Object b(boolean z8, P5.d dVar) {
                if (!z8 && ((Boolean) this.f25384a.n().getValue()).booleanValue()) {
                    this.f25384a.f25377s.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                }
                return I.f6474a;
            }

            @Override // l6.InterfaceC3359g
            public /* bridge */ /* synthetic */ Object emit(Object obj, P5.d dVar) {
                return b(((Boolean) obj).booleanValue(), dVar);
            }
        }

        b(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f25382a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K l8 = B.this.l();
                a aVar = new a(B.this);
                this.f25382a = 1;
                if (l8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f25385a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ B f25387a;

            a(B b8) {
                this.f25387a = b8;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(List list, P5.d dVar) {
                if (list.isEmpty() && ((Boolean) this.f25387a.n().getValue()).booleanValue()) {
                    this.f25387a.f25377s.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                }
                return I.f6474a;
            }
        }

        c(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f25385a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K c8 = B.this.f25371m.c();
                a aVar = new a(B.this);
                this.f25385a = 1;
                if (c8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f25388a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ B f25390a;

            a(B b8) {
                this.f25390a = b8;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(InterfaceC4021c interfaceC4021c, P5.d dVar) {
                if (interfaceC4021c instanceof InterfaceC4021c.k) {
                    this.f25390a.f25377s.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                }
                return I.f6474a;
            }
        }

        d(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new d(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f25388a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K interfaceC3349K = B.this.f25372n;
                a aVar = new a(B.this);
                this.f25388a = 1;
                if (interfaceC3349K.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* loaded from: classes4.dex */
    public static final class e {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final a f25391a = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Y2.d dVar) {
                boolean z8 = false;
                if (dVar != null && dVar.a0()) {
                    z8 = true;
                }
                return Boolean.valueOf(z8);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ M3.a f25392a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(M3.a aVar) {
                super(1);
                this.f25392a = aVar;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC3983b invoke(String str) {
                X2.g gVar;
                InterfaceC3983b interfaceC3983b = null;
                if (str != null) {
                    Y2.d dVar = (Y2.d) this.f25392a.t().getValue();
                    if (dVar != null) {
                        gVar = dVar.g0(str);
                    } else {
                        gVar = null;
                    }
                    if (gVar != null) {
                        interfaceC3983b = gVar.f();
                    }
                }
                return AbstractC3984c.c(interfaceC3983b);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class c extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ M3.a f25393a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(M3.a aVar) {
                super(0);
                this.f25393a = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC4021c invoke() {
                C1201i.e eVar = C1201i.f5176r;
                M3.a aVar = this.f25393a;
                Object value = aVar.t().getValue();
                if (value != null) {
                    return new InterfaceC4021c.b(eVar.a(aVar, (Y2.d) value));
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class d extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ M3.a f25394a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(M3.a aVar) {
                super(0);
                this.f25394a = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5511invoke();
                return I.f6474a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5511invoke() {
                this.f25394a.M(null);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.paymentsheet.B$e$e, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0565e extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ M3.a f25395a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0565e(M3.a aVar) {
                super(0);
                this.f25395a = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                Object value = this.f25395a.t().getValue();
                if (value != null) {
                    return Boolean.valueOf(((Y2.d) value).V().a());
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class f extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ M3.a f25396a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(M3.a aVar) {
                super(0);
                this.f25396a = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                Y2.d dVar = (Y2.d) this.f25396a.t().getValue();
                return Boolean.valueOf((dVar != null ? dVar.u() : null) instanceof InterfaceC1925a.b);
            }
        }

        private e() {
        }

        public final B a(M3.a viewModel) {
            AbstractC3159y.i(viewModel, "viewModel");
            return new B(viewModel.l(), viewModel.n(), ViewModelKt.getViewModelScope(viewModel), viewModel.B(), viewModel.r(), viewModel.h(), viewModel.f().e(), viewModel.y(), new b(viewModel), new c(viewModel), new d(viewModel), new C0565e(viewModel), viewModel.i(), viewModel.r().f(), new f(viewModel), v4.g.m(viewModel.t(), a.f25391a), viewModel.p().g(), !viewModel.F());
        }

        public /* synthetic */ e(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        public static final f f25397a = new f();

        f() {
            super(2);
        }

        public final Boolean a(boolean z8, List items) {
            boolean z9;
            AbstractC3159y.i(items, "items");
            if (!z8) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : items) {
                    if (obj instanceof p.d) {
                        arrayList.add(obj);
                    }
                }
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((p.d) it.next()).f()) {
                        }
                    }
                }
                z9 = false;
                return Boolean.valueOf(z9);
            }
            z9 = true;
            return Boolean.valueOf(z9);
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Boolean) obj).booleanValue(), (List) obj2);
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends AbstractC3160z implements Function1 {
        g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(I3.a aVar) {
            boolean z8 = false;
            if (aVar != null) {
                B b8 = B.this;
                boolean c8 = aVar.i().c();
                int size = aVar.f().size();
                if (size != 0) {
                    if (size != 1) {
                        z8 = c8;
                    } else if (b8.f25365g && c8) {
                        z8 = true;
                    }
                }
            }
            return Boolean.valueOf(z8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f25399a;

        /* renamed from: b, reason: collision with root package name */
        Object f25400b;

        /* renamed from: c, reason: collision with root package name */
        Object f25401c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f25402d;

        /* renamed from: f, reason: collision with root package name */
        int f25404f;

        h(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25402d = obj;
            this.f25404f |= Integer.MIN_VALUE;
            Object r8 = B.this.r(null, null, this);
            return r8 == Q5.b.e() ? r8 : L5.s.a(r8);
        }
    }

    /* loaded from: classes4.dex */
    static final class i extends AbstractC3160z implements Function1 {
        i() {
            super(1);
        }

        public final void a(InterfaceC1206n.a event) {
            AbstractC3159y.i(event, "event");
            if (event instanceof InterfaceC1206n.a.b) {
                B.this.f25360b.l(EventReporter.a.f25715a, ((InterfaceC1206n.a.b) event).a());
            } else if (event instanceof InterfaceC1206n.a.C0106a) {
                B.this.f25360b.u(EventReporter.a.f25715a, ((InterfaceC1206n.a.C0106a) event).a());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC1206n.a) obj);
            return I.f6474a;
        }
    }

    /* loaded from: classes4.dex */
    static final class j extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f25406a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f25407b;

        j(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            j jVar = new j(dVar);
            jVar.f25407b = obj;
            return jVar;
        }

        @Override // X5.n
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.stripe.android.model.o oVar, P5.d dVar) {
            return ((j) create(oVar, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f25406a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                com.stripe.android.model.o oVar = (com.stripe.android.model.o) this.f25407b;
                B b8 = B.this;
                this.f25406a = 1;
                obj = b8.v(oVar, this);
                if (obj == e8) {
                    return e8;
                }
            }
            return obj;
        }
    }

    /* loaded from: classes4.dex */
    static final class k extends kotlin.coroutines.jvm.internal.l implements X5.o {

        /* renamed from: a, reason: collision with root package name */
        int f25409a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f25410b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f25411c;

        k(P5.d dVar) {
            super(3, dVar);
        }

        @Override // X5.o
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.stripe.android.model.o oVar, EnumC1870e enumC1870e, P5.d dVar) {
            k kVar = new k(dVar);
            kVar.f25410b = oVar;
            kVar.f25411c = enumC1870e;
            return kVar.invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object r8;
            Object e8 = Q5.b.e();
            int i8 = this.f25409a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                    r8 = ((L5.s) obj).k();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                com.stripe.android.model.o oVar = (com.stripe.android.model.o) this.f25410b;
                EnumC1870e enumC1870e = (EnumC1870e) this.f25411c;
                B b8 = B.this;
                this.f25410b = null;
                this.f25409a = 1;
                r8 = b8.r(oVar, enumC1870e, this);
                if (r8 == e8) {
                    return e8;
                }
            }
            return L5.s.a(r8);
        }
    }

    /* loaded from: classes4.dex */
    static final class l extends AbstractC3160z implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3349K f25414b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3349K f25415c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f25416d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0 f25417e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(InterfaceC3349K interfaceC3349K, InterfaceC3349K interfaceC3349K2, boolean z8, Function0 function0) {
            super(0);
            this.f25414b = interfaceC3349K;
            this.f25415c = interfaceC3349K2;
            this.f25416d = z8;
            this.f25417e = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final M3.b invoke() {
            InterfaceC3349K a8 = B.this.f25371m.a();
            Function1 q8 = B.this.q();
            return new M3.b(a8, this.f25414b, this.f25415c, B.this.m(), q8, this.f25416d, this.f25417e);
        }
    }

    /* loaded from: classes4.dex */
    static final class m extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f25418a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f25420c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str, P5.d dVar) {
            super(2, dVar);
            this.f25420c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new m(this.f25420c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((m) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f25418a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                    ((L5.s) obj).k();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                B.this.t(this.f25420c);
                B b8 = B.this;
                String str = this.f25420c;
                this.f25418a = 1;
                if (b8.w(str, this) == e8) {
                    return e8;
                }
            }
            return I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class n extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f25421a;

        /* renamed from: b, reason: collision with root package name */
        Object f25422b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f25423c;

        /* renamed from: e, reason: collision with root package name */
        int f25425e;

        n(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25423c = obj;
            this.f25425e |= Integer.MIN_VALUE;
            return B.this.v(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class o extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f25426a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f25428c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(String str, P5.d dVar) {
            super(2, dVar);
            this.f25428c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new o(this.f25428c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((o) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f25426a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                B.this.f25363e.i();
                this.f25426a = 1;
                if (X.b(600L, this) == e8) {
                    return e8;
                }
            }
            B.this.t(this.f25428c);
            return I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class p extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f25429a;

        /* renamed from: c, reason: collision with root package name */
        int f25431c;

        p(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25429a = obj;
            this.f25431c |= Integer.MIN_VALUE;
            Object w8 = B.this.w(null, this);
            return w8 == Q5.b.e() ? w8 : L5.s.a(w8);
        }
    }

    public B(InterfaceC1211t.a editInteractorFactory, EventReporter eventReporter, M coroutineScope, P5.g workContext, C4020b navigationHandler, H3.c customerRepository, boolean z8, InterfaceC3349K selection, Function1 providePaymentMethodName, Function0 addFirstPaymentMethodScreenFactory, Function0 clearSelection, Function0 isLiveModeProvider, C3649b customerStateHolder, InterfaceC3349K currentScreen, Function0 isCbcEligible, InterfaceC3349K isGooglePayReady, InterfaceC3349K isLinkEnabled, boolean z9) {
        AbstractC3159y.i(editInteractorFactory, "editInteractorFactory");
        AbstractC3159y.i(eventReporter, "eventReporter");
        AbstractC3159y.i(coroutineScope, "coroutineScope");
        AbstractC3159y.i(workContext, "workContext");
        AbstractC3159y.i(navigationHandler, "navigationHandler");
        AbstractC3159y.i(customerRepository, "customerRepository");
        AbstractC3159y.i(selection, "selection");
        AbstractC3159y.i(providePaymentMethodName, "providePaymentMethodName");
        AbstractC3159y.i(addFirstPaymentMethodScreenFactory, "addFirstPaymentMethodScreenFactory");
        AbstractC3159y.i(clearSelection, "clearSelection");
        AbstractC3159y.i(isLiveModeProvider, "isLiveModeProvider");
        AbstractC3159y.i(customerStateHolder, "customerStateHolder");
        AbstractC3159y.i(currentScreen, "currentScreen");
        AbstractC3159y.i(isCbcEligible, "isCbcEligible");
        AbstractC3159y.i(isGooglePayReady, "isGooglePayReady");
        AbstractC3159y.i(isLinkEnabled, "isLinkEnabled");
        this.f25359a = editInteractorFactory;
        this.f25360b = eventReporter;
        this.f25361c = coroutineScope;
        this.f25362d = workContext;
        this.f25363e = navigationHandler;
        this.f25364f = customerRepository;
        this.f25365g = z8;
        this.f25366h = selection;
        this.f25367i = providePaymentMethodName;
        this.f25368j = addFirstPaymentMethodScreenFactory;
        this.f25369k = clearSelection;
        this.f25370l = isLiveModeProvider;
        this.f25371m = customerStateHolder;
        this.f25372n = currentScreen;
        InterfaceC3349K m8 = v4.g.m(customerStateHolder.a(), new g());
        this.f25373o = m8;
        this.f25374p = L5.l.b(new l(isGooglePayReady, isLinkEnabled, z9, isCbcEligible));
        InterfaceC3349K c8 = p().c();
        this.f25375q = c8;
        this.f25376r = v4.g.d(m8, c8, f.f25397a);
        l6.v a8 = AbstractC3351M.a(Boolean.FALSE);
        this.f25377s = a8;
        this.f25378t = a8;
        AbstractC2829k.d(coroutineScope, null, null, new a(null), 3, null);
        AbstractC2829k.d(coroutineScope, null, null, new b(null), 3, null);
        AbstractC2829k.d(coroutineScope, null, null, new c(null), 3, null);
        AbstractC2829k.d(coroutineScope, null, null, new d(null), 3, null);
    }

    private final M3.b p() {
        return (M3.b) this.f25374p.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(com.stripe.android.model.o r18, b3.EnumC1870e r19, P5.d r20) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.B.r(com.stripe.android.model.o, b3.e, P5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(String str) {
        String str2;
        AbstractC3991f.C0916f c0916f;
        com.stripe.android.model.o v8;
        I3.a aVar = (I3.a) this.f25371m.a().getValue();
        if (aVar == null) {
            return;
        }
        C3649b c3649b = this.f25371m;
        List f8 = aVar.f();
        ArrayList arrayList = new ArrayList();
        for (Object obj : f8) {
            if (!AbstractC3159y.d(((com.stripe.android.model.o) obj).f24395a, str)) {
                arrayList.add(obj);
            }
        }
        c3649b.d(I3.a.c(aVar, null, null, arrayList, null, 11, null));
        com.stripe.android.model.o oVar = (com.stripe.android.model.o) this.f25371m.b().getValue();
        String str3 = null;
        if (oVar != null) {
            str2 = oVar.f24395a;
        } else {
            str2 = null;
        }
        if (AbstractC3159y.d(str2, str)) {
            this.f25371m.e(null);
        }
        Object value = this.f25366h.getValue();
        if (value instanceof AbstractC3991f.C0916f) {
            c0916f = (AbstractC3991f.C0916f) value;
        } else {
            c0916f = null;
        }
        if (c0916f != null && (v8 = c0916f.v()) != null) {
            str3 = v8.f24395a;
        }
        if (AbstractC3159y.d(str3, str)) {
            this.f25369k.invoke();
        }
        if (((List) this.f25371m.c().getValue()).isEmpty() && (this.f25363e.f().getValue() instanceof InterfaceC4021c.j)) {
            this.f25363e.l(AbstractC1246t.e(this.f25368j.invoke()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object v(com.stripe.android.model.o r9, P5.d r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.stripe.android.paymentsheet.B.n
            if (r0 == 0) goto L13
            r0 = r10
            com.stripe.android.paymentsheet.B$n r0 = (com.stripe.android.paymentsheet.B.n) r0
            int r1 = r0.f25425e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25425e = r1
            goto L18
        L13:
            com.stripe.android.paymentsheet.B$n r0 = new com.stripe.android.paymentsheet.B$n
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f25423c
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f25425e
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r9 = r0.f25422b
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r0 = r0.f25421a
            com.stripe.android.paymentsheet.B r0 = (com.stripe.android.paymentsheet.B) r0
            L5.t.b(r10)
            L5.s r10 = (L5.s) r10
            java.lang.Object r10 = r10.k()
            goto L55
        L37:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3f:
            L5.t.b(r10)
            java.lang.String r9 = r9.f24395a
            kotlin.jvm.internal.AbstractC3159y.f(r9)
            r0.f25421a = r8
            r0.f25422b = r9
            r0.f25425e = r3
            java.lang.Object r10 = r8.w(r9, r0)
            if (r10 != r1) goto L54
            return r1
        L54:
            r0 = r8
        L55:
            boolean r1 = L5.s.h(r10)
            if (r1 == 0) goto L6b
            i6.M r2 = r0.f25361c
            P5.g r3 = r0.f25362d
            com.stripe.android.paymentsheet.B$o r5 = new com.stripe.android.paymentsheet.B$o
            r1 = 0
            r5.<init>(r9, r1)
            r6 = 2
            r7 = 0
            r4 = 0
            i6.AbstractC2825i.d(r2, r3, r4, r5, r6, r7)
        L6b:
            java.lang.Throwable r9 = L5.s.e(r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.B.v(com.stripe.android.model.o, P5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object w(java.lang.String r8, P5.d r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.stripe.android.paymentsheet.B.p
            if (r0 == 0) goto L13
            r0 = r9
            com.stripe.android.paymentsheet.B$p r0 = (com.stripe.android.paymentsheet.B.p) r0
            int r1 = r0.f25431c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25431c = r1
            goto L18
        L13:
            com.stripe.android.paymentsheet.B$p r0 = new com.stripe.android.paymentsheet.B$p
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f25429a
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f25431c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            L5.t.b(r9)
            L5.s r9 = (L5.s) r9
            java.lang.Object r8 = r9.k()
            goto L9e
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            L5.t.b(r9)
            q3.b r9 = r7.f25371m
            l6.K r9 = r9.a()
            java.lang.Object r9 = r9.getValue()
            I3.a r9 = (I3.a) r9
            if (r9 != 0) goto L5a
            L5.s$a r8 = L5.s.f6498b
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Could not remove payment method because CustomerConfiguration was not found! Make sure it is provided as part of PaymentSheet.Configuration"
            r8.<init>(r9)
            java.lang.Object r8 = L5.t.a(r8)
            java.lang.Object r8 = L5.s.b(r8)
            return r8
        L5a:
            l6.K r2 = r7.f25366h
            java.lang.Object r2 = r2.getValue()
            boolean r4 = r2 instanceof y3.AbstractC3991f.C0916f
            r5 = 0
            if (r4 == 0) goto L68
            y3.f$f r2 = (y3.AbstractC3991f.C0916f) r2
            goto L69
        L68:
            r2 = r5
        L69:
            if (r2 == 0) goto L73
            com.stripe.android.model.o r2 = r2.v()
            if (r2 == 0) goto L73
            java.lang.String r5 = r2.f24395a
        L73:
            boolean r2 = kotlin.jvm.internal.AbstractC3159y.d(r5, r8)
            if (r2 == 0) goto L7e
            kotlin.jvm.functions.Function0 r2 = r7.f25369k
            r2.invoke()
        L7e:
            H3.c r2 = r7.f25364f
            H3.c$a r4 = new H3.c$a
            java.lang.String r5 = r9.getId()
            java.lang.String r6 = r9.e()
            r4.<init>(r5, r6)
            I3.a$c r9 = r9.i()
            boolean r9 = r9.b()
            r0.f25431c = r3
            java.lang.Object r8 = r2.b(r4, r8, r9, r0)
            if (r8 != r1) goto L9e
            return r1
        L9e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.B.w(java.lang.String, P5.d):java.lang.Object");
    }

    public final InterfaceC3349K l() {
        return this.f25376r;
    }

    public final InterfaceC3349K m() {
        return this.f25373o;
    }

    public final InterfaceC3349K n() {
        return this.f25378t;
    }

    public final InterfaceC3349K o() {
        return this.f25375q;
    }

    public final Function1 q() {
        return this.f25367i;
    }

    public final void s(com.stripe.android.model.o paymentMethod) {
        String str;
        AbstractC3159y.i(paymentMethod, "paymentMethod");
        C4020b c4020b = this.f25363e;
        InterfaceC1211t.a aVar = this.f25359a;
        Function1 function1 = this.f25367i;
        o.p pVar = paymentMethod.f24399e;
        if (pVar != null) {
            str = pVar.f24537a;
        } else {
            str = null;
        }
        c4020b.m(new InterfaceC4021c.f(aVar.a(paymentMethod, new i(), new j(null), new k(null), (InterfaceC3983b) function1.invoke(str), ((Boolean) this.f25373o.getValue()).booleanValue(), ((Boolean) this.f25370l.invoke()).booleanValue())));
    }

    public final void u(com.stripe.android.model.o paymentMethod) {
        AbstractC3159y.i(paymentMethod, "paymentMethod");
        String str = paymentMethod.f24395a;
        if (str != null) {
            AbstractC2829k.d(this.f25361c, this.f25362d, null, new m(str, null), 2, null);
        }
    }

    public final void x() {
        l6.v vVar = this.f25377s;
        do {
        } while (!vVar.a(vVar.getValue(), Boolean.valueOf(!((Boolean) r1).booleanValue())));
    }
}
