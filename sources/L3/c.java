package L3;

import L3.a;
import L3.b;
import L3.n;
import L5.I;
import M5.AbstractC1246t;
import androidx.lifecycle.ViewModelKt;
import com.stripe.android.model.o;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.M;
import i6.N;
import i6.U0;
import j2.AbstractC3053E;
import j2.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.C3156v;
import l6.AbstractC3360h;
import l6.InterfaceC3349K;
import l6.InterfaceC3358f;
import l6.InterfaceC3359g;
import m4.D;
import q3.C3649b;
import q3.C3654g;
import q3.C3658k;
import y2.AbstractC3984c;
import y2.InterfaceC3983b;
import y3.AbstractC3991f;
import z3.C4020b;
import z3.InterfaceC4021c;

/* loaded from: classes4.dex */
public final class c implements n {

    /* renamed from: A, reason: collision with root package name */
    public static final b f6137A = new b(null);

    /* renamed from: B, reason: collision with root package name */
    public static final int f6138B = 8;

    /* renamed from: a, reason: collision with root package name */
    private final Function1 f6139a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f6140b;

    /* renamed from: c, reason: collision with root package name */
    private final Function1 f6141c;

    /* renamed from: d, reason: collision with root package name */
    private final X5.n f6142d;

    /* renamed from: e, reason: collision with root package name */
    private final Function0 f6143e;

    /* renamed from: f, reason: collision with root package name */
    private final Function0 f6144f;

    /* renamed from: g, reason: collision with root package name */
    private final Function1 f6145g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3349K f6146h;

    /* renamed from: i, reason: collision with root package name */
    private final Function1 f6147i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC3349K f6148j;

    /* renamed from: k, reason: collision with root package name */
    private final Function1 f6149k;

    /* renamed from: l, reason: collision with root package name */
    private final Function1 f6150l;

    /* renamed from: m, reason: collision with root package name */
    private final InterfaceC3349K f6151m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f6152n;

    /* renamed from: o, reason: collision with root package name */
    private final Function1 f6153o;

    /* renamed from: p, reason: collision with root package name */
    private final Function1 f6154p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC3349K f6155q;

    /* renamed from: r, reason: collision with root package name */
    private final Function1 f6156r;

    /* renamed from: s, reason: collision with root package name */
    private final Function1 f6157s;

    /* renamed from: t, reason: collision with root package name */
    private final boolean f6158t;

    /* renamed from: u, reason: collision with root package name */
    private final M f6159u;

    /* renamed from: v, reason: collision with root package name */
    private final List f6160v;

    /* renamed from: w, reason: collision with root package name */
    private final InterfaceC3349K f6161w;

    /* renamed from: x, reason: collision with root package name */
    private final InterfaceC3349K f6162x;

    /* renamed from: y, reason: collision with root package name */
    private final InterfaceC3349K f6163y;

    /* renamed from: z, reason: collision with root package name */
    private final InterfaceC3349K f6164z;

    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f6165a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3349K f6167c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: L3.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0126a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3349K f6168a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f6169b;

            C0126a(InterfaceC3349K interfaceC3349K, c cVar) {
                this.f6168a = interfaceC3349K;
                this.f6169b = cVar;
            }

            public final Object b(boolean z8, P5.d dVar) {
                if (!z8) {
                    return I.f6474a;
                }
                AbstractC3991f abstractC3991f = (AbstractC3991f) this.f6168a.getValue();
                if (abstractC3991f == null) {
                    return I.f6474a;
                }
                if (!(abstractC3991f instanceof AbstractC3991f.C0916f)) {
                    this.f6169b.f6154p.invoke(null);
                }
                return I.f6474a;
            }

            @Override // l6.InterfaceC3359g
            public /* bridge */ /* synthetic */ Object emit(Object obj, P5.d dVar) {
                return b(((Boolean) obj).booleanValue(), dVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC3349K interfaceC3349K, P5.d dVar) {
            super(2, dVar);
            this.f6167c = interfaceC3349K;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new a(this.f6167c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f6165a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                InterfaceC3358f o8 = AbstractC3360h.o(c.this.f6155q, 2);
                C0126a c0126a = new C0126a(this.f6167c, c.this);
                this.f6165a = 1;
                if (o8.collect(c0126a, this) == e8) {
                    return e8;
                }
            }
            return I.f6474a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ M3.a f6170a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Y2.d f6171b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C3649b f6172c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(M3.a aVar, Y2.d dVar, C3649b c3649b) {
                super(0);
                this.f6170a = aVar;
                this.f6171b = dVar;
                this.f6172c = c3649b;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC4021c invoke() {
                a.C0120a c0120a = L3.a.f6102d;
                M3.a aVar = this.f6170a;
                return new InterfaceC4021c.h(c0120a.a(aVar, this.f6171b, this.f6172c, aVar.w()));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: L3.c$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0127b extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ M3.a f6173a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Y2.d f6174b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C3649b f6175c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0127b(M3.a aVar, Y2.d dVar, C3649b c3649b) {
                super(1);
                this.f6173a = aVar;
                this.f6174b = dVar;
                this.f6175c = c3649b;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC4021c invoke(String selectedPaymentMethodCode) {
                AbstractC3159y.i(selectedPaymentMethodCode, "selectedPaymentMethodCode");
                return new InterfaceC4021c.l(L3.d.f6192l.a(selectedPaymentMethodCode, this.f6173a, this.f6174b, this.f6175c), false, 2, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: L3.c$b$c, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0128c extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ M3.a f6176a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0128c(M3.a aVar) {
                super(1);
                this.f6176a = aVar;
            }

            public final void a(C3654g it) {
                AbstractC3159y.i(it, "it");
                this.f6176a.w().s(it.d());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C3654g) obj);
                return I.f6474a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class d extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ M3.a f6177a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(M3.a aVar) {
                super(1);
                this.f6177a = aVar;
            }

            public final void a(com.stripe.android.model.o it) {
                AbstractC3159y.i(it, "it");
                this.f6177a.E(new AbstractC3991f.C0916f(it, null, null, 6, null));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((com.stripe.android.model.o) obj);
                return I.f6474a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class e extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ M3.a f6178a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(M3.a aVar) {
                super(1);
                this.f6178a = aVar;
            }

            public final void a(InterfaceC3983b interfaceC3983b) {
                this.f6178a.q().e(interfaceC3983b, true);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((InterfaceC3983b) obj);
                return I.f6474a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public /* synthetic */ class f extends C3156v implements Function1 {
            f(Object obj) {
                super(1, obj, C3658k.class, "formElementsForCode", "formElementsForCode(Ljava/lang/String;)Ljava/util/List;", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final List invoke(String p02) {
                AbstractC3159y.i(p02, "p0");
                return ((C3658k) this.receiver).b(p02);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public /* synthetic */ class g extends C3156v implements Function1 {
            g(Object obj) {
                super(1, obj, C3658k.class, "requiresFormScreen", "requiresFormScreen(Ljava/lang/String;)Z", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(String p02) {
                AbstractC3159y.i(p02, "p0");
                return Boolean.valueOf(((C3658k) this.receiver).d(p02));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public /* synthetic */ class h extends C3156v implements Function1 {
            h(Object obj) {
                super(1, obj, C4020b.class, "transitionToWithDelay", "transitionToWithDelay(Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;)V", 0);
            }

            public final void d(InterfaceC4021c p02) {
                AbstractC3159y.i(p02, "p0");
                ((C4020b) this.receiver).o(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                d((InterfaceC4021c) obj);
                return I.f6474a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public /* synthetic */ class i extends C3156v implements X5.n {
            i(Object obj) {
                super(2, obj, C3658k.class, "onFormFieldValuesChanged", "onFormFieldValuesChanged(Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Ljava/lang/String;)V", 0);
            }

            public final void d(w3.c cVar, String p12) {
                AbstractC3159y.i(p12, "p1");
                ((C3658k) this.receiver).c(cVar, p12);
            }

            @Override // X5.n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                d((w3.c) obj, (String) obj2);
                return I.f6474a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public /* synthetic */ class j extends C3156v implements Function1 {
            j(Object obj) {
                super(1, obj, M3.a.class, "updateSelection", "updateSelection(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V", 0);
            }

            public final void d(AbstractC3991f abstractC3991f) {
                ((M3.a) this.receiver).M(abstractC3991f);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                d((AbstractC3991f) obj);
                return I.f6474a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class k extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final k f6179a = new k();

            k() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(InterfaceC4021c it) {
                AbstractC3159y.i(it, "it");
                return Boolean.valueOf(it instanceof InterfaceC4021c.k);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public /* synthetic */ class l extends C3156v implements Function1 {
            l(Object obj) {
                super(1, obj, EventReporter.class, "onSelectPaymentMethod", "onSelectPaymentMethod(Ljava/lang/String;)V", 0);
            }

            public final void d(String p02) {
                AbstractC3159y.i(p02, "p0");
                ((EventReporter) this.receiver).h(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                d((String) obj);
                return I.f6474a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public /* synthetic */ class m extends C3156v implements Function1 {
            m(Object obj) {
                super(1, obj, EventReporter.class, "onPaymentMethodFormShown", "onPaymentMethodFormShown(Ljava/lang/String;)V", 0);
            }

            public final void d(String p02) {
                AbstractC3159y.i(p02, "p0");
                ((EventReporter) this.receiver).o(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                d((String) obj);
                return I.f6474a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class n extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ M3.a f6180a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Y2.d f6181b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C3649b f6182c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            n(M3.a aVar, Y2.d dVar, C3649b c3649b) {
                super(0);
                this.f6180a = aVar;
                this.f6181b = dVar;
                this.f6182c = c3649b;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC4021c invoke() {
                b.c cVar = L3.b.f6107q;
                M3.a aVar = this.f6180a;
                return new InterfaceC4021c.i(cVar.b(aVar, this.f6181b, this.f6182c, aVar.w()));
            }
        }

        private b() {
        }

        public final L3.n a(M3.a viewModel, Y2.d paymentMethodMetadata, C3649b customerStateHolder) {
            AbstractC3159y.i(viewModel, "viewModel");
            AbstractC3159y.i(paymentMethodMetadata, "paymentMethodMetadata");
            AbstractC3159y.i(customerStateHolder, "customerStateHolder");
            C3658k a8 = C3658k.f37321g.a(viewModel, q3.m.f37331h.a(viewModel, ViewModelKt.getViewModelScope(viewModel)), paymentMethodMetadata);
            return new c(paymentMethodMetadata, viewModel.v(), viewModel.y(), new f(a8), new g(a8), new h(viewModel.r()), new i(a8), new n(viewModel, paymentMethodMetadata, customerStateHolder), new a(viewModel, paymentMethodMetadata, customerStateHolder), new C0127b(viewModel, paymentMethodMetadata, customerStateHolder), customerStateHolder.c(), customerStateHolder.b(), viewModel.w().q(), viewModel.w().m(), new C0128c(viewModel), new d(viewModel), viewModel.A(), !viewModel.F(), new e(viewModel), new j(viewModel), v4.g.m(viewModel.r().f(), k.f6179a), new l(viewModel.n()), new m(viewModel.n()), paymentMethodMetadata.V().a(), null, 16777216, null);
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: L3.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0129c extends AbstractC3160z implements X5.o {
        C0129c() {
            super(3);
        }

        public final n.a a(List paymentMethods, C3654g c3654g, boolean z8) {
            AbstractC3159y.i(paymentMethods, "paymentMethods");
            return c.this.j(paymentMethods, c3654g, z8);
        }

        @Override // X5.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((List) obj, (C3654g) obj2, ((Boolean) obj3).booleanValue());
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3160z implements X5.n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Y2.d f6185b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Y2.d dVar) {
            super(2);
            this.f6185b = dVar;
        }

        @Override // X5.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3654g invoke(List paymentMethods, com.stripe.android.model.o oVar) {
            AbstractC3159y.i(paymentMethods, "paymentMethods");
            return c.this.l(paymentMethods, this.f6185b, oVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3160z implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m43invoke();
            return I.f6474a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m43invoke() {
            c.this.f6154p.invoke(AbstractC3991f.d.f39758a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3160z implements Function0 {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m44invoke();
            return I.f6474a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m44invoke() {
            c.this.f6154p.invoke(AbstractC3991f.c.f39757a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3160z implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ X2.g f6189b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(X2.g gVar) {
            super(0);
            this.f6189b = gVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m45invoke();
            return I.f6474a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m45invoke() {
            c.this.b(new n.c.b(this.f6189b.d()));
        }
    }

    /* loaded from: classes4.dex */
    static final class h extends AbstractC3160z implements Function1 {
        h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(I3.n nVar) {
            return Boolean.valueOf(!c.this.n(nVar));
        }
    }

    /* loaded from: classes4.dex */
    static final class i extends AbstractC3160z implements X5.r {
        i() {
            super(6);
        }

        public final n.b a(List paymentMethods, boolean z8, AbstractC3991f abstractC3991f, C3654g c3654g, I3.n nVar, n.a action) {
            AbstractC3159y.i(paymentMethods, "paymentMethods");
            AbstractC3159y.i(action, "action");
            return new n.b(c.this.k(paymentMethods, nVar), z8, abstractC3991f, c3654g, action);
        }

        @Override // X5.r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
            return a((List) obj, ((Boolean) obj2).booleanValue(), (AbstractC3991f) obj3, (C3654g) obj4, (I3.n) obj5, (n.a) obj6);
        }
    }

    public c(Y2.d paymentMethodMetadata, InterfaceC3349K processing, InterfaceC3349K selection, Function1 formElementsForCode, Function1 requiresFormScreen, Function1 transitionTo, X5.n onFormFieldValuesChanged, Function0 manageScreenFactory, Function0 manageOneSavedPaymentMethodFactory, Function1 formScreenFactory, InterfaceC3349K paymentMethods, InterfaceC3349K mostRecentlySelectedSavedPaymentMethod, Function1 providePaymentMethodName, InterfaceC3349K canRemove, Function1 onEditPaymentMethod, Function1 onSelectSavedPaymentMethod, InterfaceC3349K walletsState, boolean z8, Function1 onMandateTextUpdated, Function1 updateSelection, InterfaceC3349K isCurrentScreen, Function1 reportPaymentMethodTypeSelected, Function1 reportFormShown, boolean z9, P5.g dispatcher) {
        AbstractC3159y.i(paymentMethodMetadata, "paymentMethodMetadata");
        AbstractC3159y.i(processing, "processing");
        AbstractC3159y.i(selection, "selection");
        AbstractC3159y.i(formElementsForCode, "formElementsForCode");
        AbstractC3159y.i(requiresFormScreen, "requiresFormScreen");
        AbstractC3159y.i(transitionTo, "transitionTo");
        AbstractC3159y.i(onFormFieldValuesChanged, "onFormFieldValuesChanged");
        AbstractC3159y.i(manageScreenFactory, "manageScreenFactory");
        AbstractC3159y.i(manageOneSavedPaymentMethodFactory, "manageOneSavedPaymentMethodFactory");
        AbstractC3159y.i(formScreenFactory, "formScreenFactory");
        AbstractC3159y.i(paymentMethods, "paymentMethods");
        AbstractC3159y.i(mostRecentlySelectedSavedPaymentMethod, "mostRecentlySelectedSavedPaymentMethod");
        AbstractC3159y.i(providePaymentMethodName, "providePaymentMethodName");
        AbstractC3159y.i(canRemove, "canRemove");
        AbstractC3159y.i(onEditPaymentMethod, "onEditPaymentMethod");
        AbstractC3159y.i(onSelectSavedPaymentMethod, "onSelectSavedPaymentMethod");
        AbstractC3159y.i(walletsState, "walletsState");
        AbstractC3159y.i(onMandateTextUpdated, "onMandateTextUpdated");
        AbstractC3159y.i(updateSelection, "updateSelection");
        AbstractC3159y.i(isCurrentScreen, "isCurrentScreen");
        AbstractC3159y.i(reportPaymentMethodTypeSelected, "reportPaymentMethodTypeSelected");
        AbstractC3159y.i(reportFormShown, "reportFormShown");
        AbstractC3159y.i(dispatcher, "dispatcher");
        this.f6139a = formElementsForCode;
        this.f6140b = requiresFormScreen;
        this.f6141c = transitionTo;
        this.f6142d = onFormFieldValuesChanged;
        this.f6143e = manageScreenFactory;
        this.f6144f = manageOneSavedPaymentMethodFactory;
        this.f6145g = formScreenFactory;
        this.f6146h = mostRecentlySelectedSavedPaymentMethod;
        this.f6147i = providePaymentMethodName;
        this.f6148j = canRemove;
        this.f6149k = onEditPaymentMethod;
        this.f6150l = onSelectSavedPaymentMethod;
        this.f6151m = walletsState;
        this.f6152n = z8;
        this.f6153o = onMandateTextUpdated;
        this.f6154p = updateSelection;
        this.f6155q = isCurrentScreen;
        this.f6156r = reportPaymentMethodTypeSelected;
        this.f6157s = reportFormShown;
        this.f6158t = z9;
        M a8 = N.a(dispatcher.plus(U0.b(null, 1, null)));
        this.f6159u = a8;
        this.f6160v = paymentMethodMetadata.e0();
        InterfaceC3349K d8 = v4.g.d(paymentMethods, mostRecentlySelectedSavedPaymentMethod, new d(paymentMethodMetadata));
        this.f6161w = d8;
        InterfaceC3349K e8 = v4.g.e(paymentMethods, d8, canRemove, new C0129c());
        this.f6162x = e8;
        this.f6163y = v4.g.h(paymentMethods, processing, selection, d8, walletsState, e8, new i());
        this.f6164z = v4.g.m(walletsState, new h());
        AbstractC2829k.d(a8, null, null, new a(selection, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n.a j(List list, C3654g c3654g, boolean z8) {
        if (list != null && c3654g != null) {
            int size = list.size();
            if (size != 0) {
                if (size != 1) {
                    return n.a.f6330d;
                }
                return m(z8, c3654g);
            }
            return n.a.f6327a;
        }
        return n.a.f6327a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List k(List list, I3.n nVar) {
        List<X2.g> list2 = this.f6160v;
        ArrayList arrayList = new ArrayList(AbstractC1246t.x(list2, 10));
        for (X2.g gVar : list2) {
            arrayList.add(gVar.a(list, new g(gVar)));
        }
        ArrayList arrayList2 = new ArrayList();
        if (n(nVar)) {
            if (nVar != null && nVar.d() != null) {
                arrayList2.add(new L3.e(o.p.f24518h.f24537a, AbstractC3984c.a(AbstractC3053E.f32905z0), q3.t.f37396v, null, null, false, AbstractC3984c.a(AbstractC3053E.f32815A0), new e()));
            }
            if (nVar != null && nVar.c() != null) {
                arrayList2.add(new L3.e("google_pay", AbstractC3984c.a(AbstractC3053E.f32889r0), z.f33121b, null, null, false, null, new f()));
            }
        }
        Iterator it = arrayList.iterator();
        int i8 = 0;
        while (true) {
            if (it.hasNext()) {
                if (AbstractC3159y.d(((L3.e) it.next()).a(), o.p.f24519i.f24537a)) {
                    break;
                }
                i8++;
            } else {
                i8 = -1;
                break;
            }
        }
        List Z02 = AbstractC1246t.Z0(arrayList);
        Z02.addAll(i8 + 1, arrayList2);
        return Z02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C3654g l(List list, Y2.d dVar, com.stripe.android.model.o oVar) {
        if (oVar == null) {
            if (list != null) {
                oVar = (com.stripe.android.model.o) AbstractC1246t.o0(list);
            } else {
                oVar = null;
            }
        }
        if (oVar == null) {
            return null;
        }
        return q.a(oVar, this.f6147i, dVar);
    }

    private final n.a m(boolean z8, C3654g c3654g) {
        if (c3654g != null && c3654g.f()) {
            return n.a.f6328b;
        }
        if (z8) {
            return n.a.f6329c;
        }
        return n.a.f6327a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean n(I3.n nVar) {
        if (this.f6152n && nVar != null && nVar.c() != null) {
            return true;
        }
        return false;
    }

    private final void o(String str) {
        this.f6142d.invoke(new w3.c(null, AbstractC3991f.a.f39747d, 1, null), str);
    }

    @Override // L3.n
    public boolean a() {
        return this.f6158t;
    }

    @Override // L3.n
    public void b(n.c viewAction) {
        InterfaceC3983b interfaceC3983b;
        AbstractC3159y.i(viewAction, "viewAction");
        if (viewAction instanceof n.c.b) {
            n.c.b bVar = (n.c.b) viewAction;
            this.f6156r.invoke(bVar.a());
            if (((Boolean) this.f6140b.invoke(bVar.a())).booleanValue()) {
                this.f6157s.invoke(bVar.a());
                this.f6141c.invoke(this.f6145g.invoke(bVar.a()));
                return;
            }
            o(bVar.a());
            Iterator it = ((Iterable) this.f6139a.invoke(bVar.a())).iterator();
            while (true) {
                if (it.hasNext()) {
                    interfaceC3983b = ((D) it.next()).b();
                    if (interfaceC3983b != null) {
                        break;
                    }
                } else {
                    interfaceC3983b = null;
                    break;
                }
            }
            if (interfaceC3983b != null) {
                this.f6153o.invoke(interfaceC3983b);
                return;
            }
            return;
        }
        if (viewAction instanceof n.c.C0135c) {
            this.f6156r.invoke("saved");
            this.f6150l.invoke(((n.c.C0135c) viewAction).a());
        } else if (AbstractC3159y.d(viewAction, n.c.e.f6343a)) {
            this.f6141c.invoke(this.f6143e.invoke());
        } else if (AbstractC3159y.d(viewAction, n.c.d.f6342a)) {
            this.f6141c.invoke(this.f6144f.invoke());
        } else if (viewAction instanceof n.c.a) {
            this.f6149k.invoke(((n.c.a) viewAction).a());
        }
    }

    @Override // L3.n
    public InterfaceC3349K c() {
        return this.f6164z;
    }

    @Override // L3.n
    public InterfaceC3349K getState() {
        return this.f6163y;
    }

    public /* synthetic */ c(Y2.d dVar, InterfaceC3349K interfaceC3349K, InterfaceC3349K interfaceC3349K2, Function1 function1, Function1 function12, Function1 function13, X5.n nVar, Function0 function0, Function0 function02, Function1 function14, InterfaceC3349K interfaceC3349K3, InterfaceC3349K interfaceC3349K4, Function1 function15, InterfaceC3349K interfaceC3349K5, Function1 function16, Function1 function17, InterfaceC3349K interfaceC3349K6, boolean z8, Function1 function18, Function1 function19, InterfaceC3349K interfaceC3349K7, Function1 function110, Function1 function111, boolean z9, P5.g gVar, int i8, AbstractC3151p abstractC3151p) {
        this(dVar, interfaceC3349K, interfaceC3349K2, function1, function12, function13, nVar, function0, function02, function14, interfaceC3349K3, interfaceC3349K4, function15, interfaceC3349K5, function16, function17, interfaceC3349K6, z8, function18, function19, interfaceC3349K7, function110, function111, z9, (i8 & 16777216) != 0 ? C2812b0.a() : gVar);
    }
}
