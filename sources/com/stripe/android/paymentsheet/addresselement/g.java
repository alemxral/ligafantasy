package com.stripe.android.paymentsheet.addresselement;

import L5.C1224h;
import L5.I;
import L5.s;
import L5.t;
import X5.n;
import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract;
import com.stripe.android.paymentsheet.u;
import e6.InterfaceC2643c;
import f4.InterfaceC2669b;
import i6.AbstractC2829k;
import i6.InterfaceC2855x0;
import i6.M;
import i6.N;
import i6.X;
import j2.z;
import j4.AbstractC3081g;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l6.AbstractC3351M;
import l6.InterfaceC3349K;
import l6.InterfaceC3359g;
import l6.v;
import m4.r0;
import m4.s0;
import m4.x0;
import r3.C3686a;
import s3.InterfaceC3746b;
import x3.InterfaceC3904e;

/* loaded from: classes4.dex */
public final class g extends AndroidViewModel {

    /* renamed from: m, reason: collision with root package name */
    public static final d f25598m = new d(null);

    /* renamed from: n, reason: collision with root package name */
    public static final int f25599n = 8;

    /* renamed from: a, reason: collision with root package name */
    private final AddressElementActivityContract.a f25600a;

    /* renamed from: b, reason: collision with root package name */
    private final com.stripe.android.paymentsheet.addresselement.a f25601b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC2669b f25602c;

    /* renamed from: d, reason: collision with root package name */
    private final c f25603d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3746b f25604e;

    /* renamed from: f, reason: collision with root package name */
    private final v f25605f;

    /* renamed from: g, reason: collision with root package name */
    private final v f25606g;

    /* renamed from: h, reason: collision with root package name */
    private final v f25607h;

    /* renamed from: i, reason: collision with root package name */
    private final r0 f25608i;

    /* renamed from: j, reason: collision with root package name */
    private final s0 f25609j;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC3349K f25610k;

    /* renamed from: l, reason: collision with root package name */
    private final e f25611l;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function1 {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.paymentsheet.addresselement.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0593a extends l implements n {

            /* renamed from: a, reason: collision with root package name */
            int f25613a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ g f25614b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f25615c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0593a(g gVar, String str, P5.d dVar) {
                super(2, dVar);
                this.f25614b = gVar;
                this.f25615c = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new C0593a(this.f25614b, this.f25615c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((C0593a) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object b8;
                Object e8 = Q5.b.e();
                int i8 = this.f25613a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                        b8 = ((s) obj).k();
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    InterfaceC2669b interfaceC2669b = this.f25614b.f25602c;
                    if (interfaceC2669b != null) {
                        String str = this.f25615c;
                        String a8 = this.f25614b.f25603d.a();
                        if (a8 != null) {
                            this.f25613a = 1;
                            b8 = interfaceC2669b.b(str, a8, 4, this);
                            if (b8 == e8) {
                                return e8;
                            }
                        } else {
                            throw new IllegalStateException("Country cannot be empty");
                        }
                    }
                    return I.f6474a;
                }
                g gVar = this.f25614b;
                Throwable e9 = s.e(b8);
                if (e9 == null) {
                    gVar.f25606g.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                    gVar.f25605f.setValue(((g4.f) b8).a());
                } else {
                    gVar.f25606g.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                    gVar.h().setValue(s.a(s.b(t.a(e9))));
                }
                return I.f6474a;
            }
        }

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return I.f6474a;
        }

        public final void invoke(String it) {
            AbstractC3159y.i(it, "it");
            AbstractC2829k.d(ViewModelKt.getViewModelScope(g.this), null, null, new C0593a(g.this, it, null), 3, null);
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f25616a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ g f25618a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.addresselement.g$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0594a extends AbstractC3160z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ g f25619a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0594a(g gVar) {
                    super(0);
                    this.f25619a = gVar;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m5518invoke();
                    return I.f6474a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m5518invoke() {
                    this.f25619a.g();
                }
            }

            a(g gVar) {
                this.f25618a = gVar;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(String str, P5.d dVar) {
                Object value;
                Object value2;
                if (str.length() == 0) {
                    v c8 = this.f25618a.f25608i.c();
                    do {
                        value2 = c8.getValue();
                    } while (!c8.a(value2, null));
                } else {
                    v c9 = this.f25618a.f25608i.c();
                    g gVar = this.f25618a;
                    do {
                        value = c9.getValue();
                    } while (!c9.a(value, new x0.c(z.f33112N, null, true, new C0594a(gVar), 2, null)));
                }
                return I.f6474a;
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
            int i8 = this.f25616a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                InterfaceC3349K interfaceC3349K = g.this.f25610k;
                a aVar = new a(g.this);
                this.f25616a = 1;
                if (interfaceC3349K.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final String f25620a;

        public c(String str) {
            this.f25620a = str;
        }

        public final String a() {
            return this.f25620a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC3159y.d(this.f25620a, ((c) obj).f25620a);
        }

        public int hashCode() {
            String str = this.f25620a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Args(country=" + this.f25620a + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class d {
        private d() {
        }

        public /* synthetic */ d(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        private InterfaceC2855x0 f25621a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends l implements n {

            /* renamed from: a, reason: collision with root package name */
            int f25622a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f25623b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC3349K f25624c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ e f25625d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Function1 f25626e;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.addresselement.g$e$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0595a implements InterfaceC3359g {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ e f25627a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ M f25628b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ Function1 f25629c;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: com.stripe.android.paymentsheet.addresselement.g$e$a$a$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0596a extends l implements n {

                    /* renamed from: a, reason: collision with root package name */
                    int f25630a;

                    /* renamed from: b, reason: collision with root package name */
                    private /* synthetic */ Object f25631b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ Function1 f25632c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ String f25633d;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0596a(Function1 function1, String str, P5.d dVar) {
                        super(2, dVar);
                        this.f25632c = function1;
                        this.f25633d = str;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final P5.d create(Object obj, P5.d dVar) {
                        C0596a c0596a = new C0596a(this.f25632c, this.f25633d, dVar);
                        c0596a.f25631b = obj;
                        return c0596a;
                    }

                    @Override // X5.n
                    public final Object invoke(M m8, P5.d dVar) {
                        return ((C0596a) create(m8, dVar)).invokeSuspend(I.f6474a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        M m8;
                        Object e8 = Q5.b.e();
                        int i8 = this.f25630a;
                        if (i8 != 0) {
                            if (i8 == 1) {
                                m8 = (M) this.f25631b;
                                t.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            t.b(obj);
                            M m9 = (M) this.f25631b;
                            this.f25631b = m9;
                            this.f25630a = 1;
                            if (X.b(1000L, this) == e8) {
                                return e8;
                            }
                            m8 = m9;
                        }
                        if (N.g(m8)) {
                            this.f25632c.invoke(this.f25633d);
                        }
                        return I.f6474a;
                    }
                }

                C0595a(e eVar, M m8, Function1 function1) {
                    this.f25627a = eVar;
                    this.f25628b = m8;
                    this.f25629c = function1;
                }

                @Override // l6.InterfaceC3359g
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Object emit(String str, P5.d dVar) {
                    InterfaceC2855x0 d8;
                    if (str != null) {
                        e eVar = this.f25627a;
                        M m8 = this.f25628b;
                        Function1 function1 = this.f25629c;
                        InterfaceC2855x0 interfaceC2855x0 = eVar.f25621a;
                        if (interfaceC2855x0 != null) {
                            InterfaceC2855x0.a.a(interfaceC2855x0, null, 1, null);
                        }
                        if (str.length() > 3) {
                            d8 = AbstractC2829k.d(m8, null, null, new C0596a(function1, str, null), 3, null);
                            eVar.f25621a = d8;
                        }
                    }
                    return I.f6474a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC3349K interfaceC3349K, e eVar, Function1 function1, P5.d dVar) {
                super(2, dVar);
                this.f25624c = interfaceC3349K;
                this.f25625d = eVar;
                this.f25626e = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                a aVar = new a(this.f25624c, this.f25625d, this.f25626e, dVar);
                aVar.f25623b = obj;
                return aVar;
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = Q5.b.e();
                int i8 = this.f25622a;
                if (i8 != 0) {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                } else {
                    t.b(obj);
                    M m8 = (M) this.f25623b;
                    InterfaceC3349K interfaceC3349K = this.f25624c;
                    C0595a c0595a = new C0595a(this.f25625d, m8, this.f25626e);
                    this.f25622a = 1;
                    if (interfaceC3349K.collect(c0595a, this) == e8) {
                        return e8;
                    }
                }
                throw new C1224h();
            }
        }

        public final void c(M coroutineScope, InterfaceC3349K queryFlow, Function1 onValidQuery) {
            AbstractC3159y.i(coroutineScope, "coroutineScope");
            AbstractC3159y.i(queryFlow, "queryFlow");
            AbstractC3159y.i(onValidQuery, "onValidQuery");
            AbstractC2829k.d(coroutineScope, null, null, new a(queryFlow, this, onValidQuery, null), 3, null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class f implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final I5.a f25634a;

        /* renamed from: b, reason: collision with root package name */
        private final c f25635b;

        /* renamed from: c, reason: collision with root package name */
        private final Function0 f25636c;

        public f(I5.a autoCompleteViewModelSubcomponentBuilderProvider, c args, Function0 applicationSupplier) {
            AbstractC3159y.i(autoCompleteViewModelSubcomponentBuilderProvider, "autoCompleteViewModelSubcomponentBuilderProvider");
            AbstractC3159y.i(args, "args");
            AbstractC3159y.i(applicationSupplier, "applicationSupplier");
            this.f25634a = autoCompleteViewModelSubcomponentBuilderProvider;
            this.f25635b = args;
            this.f25636c = applicationSupplier;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(InterfaceC2643c interfaceC2643c, CreationExtras creationExtras) {
            return androidx.lifecycle.n.a(this, interfaceC2643c, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
            return androidx.lifecycle.n.c(this, cls, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class modelClass) {
            AbstractC3159y.i(modelClass, "modelClass");
            g a8 = ((InterfaceC3904e.a) this.f25634a.get()).b((Application) this.f25636c.invoke()).a(this.f25635b).build().a();
            AbstractC3159y.g(a8, "null cannot be cast to non-null type T of com.stripe.android.paymentsheet.addresselement.AutocompleteViewModel.Factory.create");
            return a8;
        }
    }

    /* renamed from: com.stripe.android.paymentsheet.addresselement.g$g, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0597g extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f25637a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ g4.d f25639c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0597g(g4.d dVar, P5.d dVar2) {
            super(2, dVar2);
            this.f25639c = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new C0597g(this.f25639c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((C0597g) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object a8;
            Object e8 = Q5.b.e();
            int i8 = this.f25637a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                    a8 = ((s) obj).k();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                g.this.f25606g.setValue(kotlin.coroutines.jvm.internal.b.a(true));
                InterfaceC2669b interfaceC2669b = g.this.f25602c;
                if (interfaceC2669b != null) {
                    String a9 = this.f25639c.a();
                    this.f25637a = 1;
                    a8 = interfaceC2669b.a(a9, this);
                    if (a8 == e8) {
                        return e8;
                    }
                }
                return I.f6474a;
            }
            g gVar = g.this;
            Throwable e9 = s.e(a8);
            if (e9 == null) {
                gVar.f25606g.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                com.stripe.android.model.a f8 = g4.h.f(((g4.e) a8).a(), gVar.getApplication());
                gVar.h().setValue(s.a(s.b(new C3686a(null, new u.a(f8.b(), f8.c(), f8.e(), f8.f(), f8.i(), f8.j()), null, null, 13, null))));
                g.p(gVar, null, 1, null);
            } else {
                gVar.f25606g.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                gVar.h().setValue(s.a(s.b(t.a(e9))));
                g.p(gVar, null, 1, null);
            }
            return I.f6474a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(AddressElementActivityContract.a args, com.stripe.android.paymentsheet.addresselement.a navigator, InterfaceC2669b interfaceC2669b, c autocompleteArgs, InterfaceC3746b eventReporter, Application application) {
        super(application);
        AbstractC3159y.i(args, "args");
        AbstractC3159y.i(navigator, "navigator");
        AbstractC3159y.i(autocompleteArgs, "autocompleteArgs");
        AbstractC3159y.i(eventReporter, "eventReporter");
        AbstractC3159y.i(application, "application");
        this.f25600a = args;
        this.f25601b = navigator;
        this.f25602c = interfaceC2669b;
        this.f25603d = autocompleteArgs;
        this.f25604e = eventReporter;
        this.f25605f = AbstractC3351M.a(null);
        this.f25606g = AbstractC3351M.a(Boolean.FALSE);
        this.f25607h = AbstractC3351M.a(null);
        r0 r0Var = new r0(Integer.valueOf(AbstractC3081g.f33174a), 0, 0, AbstractC3351M.a(null), 6, null);
        this.f25608i = r0Var;
        s0 s0Var = new s0(r0Var, false, null, 6, null);
        this.f25609j = s0Var;
        InterfaceC3349K k8 = s0Var.k();
        this.f25610k = k8;
        e eVar = new e();
        this.f25611l = eVar;
        eVar.c(ViewModelKt.getViewModelScope(this), k8, new a());
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), null, null, new b(null), 3, null);
        String a8 = autocompleteArgs.a();
        if (a8 != null) {
            eventReporter.a(a8);
        }
    }

    private final void o(C3686a c3686a) {
        if (c3686a != null) {
            this.f25601b.h("AddressDetails", c3686a);
        } else {
            s sVar = (s) this.f25607h.getValue();
            if (sVar != null) {
                Object k8 = sVar.k();
                if (s.e(k8) == null) {
                    this.f25601b.h("AddressDetails", (C3686a) k8);
                } else {
                    this.f25601b.h("AddressDetails", null);
                }
            }
        }
        this.f25601b.e();
    }

    static /* synthetic */ void p(g gVar, C3686a c3686a, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            c3686a = null;
        }
        gVar.o(c3686a);
    }

    public final void g() {
        this.f25609j.r("");
        this.f25605f.setValue(null);
    }

    public final v h() {
        return this.f25607h;
    }

    public final InterfaceC3349K i() {
        return this.f25606g;
    }

    public final InterfaceC3349K j() {
        return this.f25605f;
    }

    public final s0 k() {
        return this.f25609j;
    }

    public final void l() {
        C3686a c3686a;
        if (!g6.n.u((CharSequence) this.f25610k.getValue())) {
            c3686a = new C3686a(null, new u.a(null, null, (String) this.f25610k.getValue(), null, null, null, 59, null), null, null, 13, null);
        } else {
            c3686a = null;
        }
        o(c3686a);
    }

    public final void m() {
        this.f25601b.h("force_expanded_form", Boolean.TRUE);
        o(new C3686a(null, new u.a(null, null, (String) this.f25610k.getValue(), null, null, null, 59, null), null, null, 13, null));
    }

    public final void n(g4.d prediction) {
        AbstractC3159y.i(prediction, "prediction");
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), null, null, new C0597g(prediction, null), 3, null);
    }
}
