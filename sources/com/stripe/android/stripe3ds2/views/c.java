package com.stripe.android.stripe3ds2.views;

import L5.I;
import L5.InterfaceC1223g;
import L5.InterfaceC1227k;
import L5.r;
import L5.x;
import M5.Q;
import T3.q;
import X3.v;
import Y3.b;
import a4.C1559c;
import a4.C1566j;
import a4.C1567k;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.stripe3ds2.transaction.a;
import com.stripe.android.stripe3ds2.transaction.d;
import com.stripe.android.stripe3ds2.transaction.h;
import com.stripe.android.stripe3ds2.views.b;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.InterfaceC3153s;
import kotlin.jvm.internal.U;

/* loaded from: classes4.dex */
public final class c extends Fragment {

    /* renamed from: s, reason: collision with root package name */
    public static final a f27040s = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final T3.m f27041a;

    /* renamed from: b, reason: collision with root package name */
    private final v f27042b;

    /* renamed from: c, reason: collision with root package name */
    private final com.stripe.android.stripe3ds2.transaction.k f27043c;

    /* renamed from: d, reason: collision with root package name */
    private final U3.c f27044d;

    /* renamed from: e, reason: collision with root package name */
    private final com.stripe.android.stripe3ds2.transaction.b f27045e;

    /* renamed from: f, reason: collision with root package name */
    private final Y3.g f27046f;

    /* renamed from: g, reason: collision with root package name */
    private final com.stripe.android.stripe3ds2.transaction.n f27047g;

    /* renamed from: h, reason: collision with root package name */
    private final P5.g f27048h;

    /* renamed from: i, reason: collision with root package name */
    private Y3.b f27049i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC1227k f27050j;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC1227k f27051k;

    /* renamed from: l, reason: collision with root package name */
    private final InterfaceC1227k f27052l;

    /* renamed from: m, reason: collision with root package name */
    private Q3.c f27053m;

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC1227k f27054n;

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC1227k f27055o;

    /* renamed from: p, reason: collision with root package name */
    private final InterfaceC1227k f27056p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC1227k f27057q;

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC1227k f27058r;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27059a;

        static {
            int[] iArr = new int[Y3.g.values().length];
            try {
                iArr[Y3.g.f13161d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Y3.g.f13162e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Y3.g.f13163f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Y3.g.f13165h.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Y3.g.f13164g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f27059a = iArr;
        }
    }

    /* renamed from: com.stripe.android.stripe3ds2.views.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0683c extends AbstractC3160z implements Function0 {
        C0683c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BrandZoneView invoke() {
            BrandZoneView caBrandZone = c.this.H().f8210b;
            AbstractC3159y.h(caBrandZone, "caBrandZone");
            return caBrandZone;
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3160z implements Function0 {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1559c invoke() {
            FragmentActivity requireActivity = c.this.requireActivity();
            AbstractC3159y.h(requireActivity, "requireActivity(...)");
            return new C1559c(requireActivity);
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3160z implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1566j invoke() {
            Y3.b bVar = c.this.f27049i;
            Y3.b bVar2 = null;
            if (bVar == null) {
                AbstractC3159y.y("cresData");
                bVar = null;
            }
            if (bVar.b0() != Y3.g.f13162e) {
                Y3.b bVar3 = c.this.f27049i;
                if (bVar3 == null) {
                    AbstractC3159y.y("cresData");
                    bVar3 = null;
                }
                if (bVar3.b0() != Y3.g.f13163f) {
                    return null;
                }
            }
            C1559c A8 = c.this.A();
            Y3.b bVar4 = c.this.f27049i;
            if (bVar4 == null) {
                AbstractC3159y.y("cresData");
            } else {
                bVar2 = bVar4;
            }
            return A8.a(bVar2, c.this.f27041a);
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3160z implements Function0 {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1567k invoke() {
            Y3.b bVar = c.this.f27049i;
            Y3.b bVar2 = null;
            if (bVar == null) {
                AbstractC3159y.y("cresData");
                bVar = null;
            }
            if (bVar.b0() == Y3.g.f13161d) {
                C1559c A8 = c.this.A();
                Y3.b bVar3 = c.this.f27049i;
                if (bVar3 == null) {
                    AbstractC3159y.y("cresData");
                } else {
                    bVar2 = bVar3;
                }
                return A8.b(bVar2, c.this.f27041a);
            }
            return null;
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends AbstractC3160z implements Function0 {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ChallengeZoneView invoke() {
            ChallengeZoneView caChallengeZone = c.this.H().f8211c;
            AbstractC3159y.h(caChallengeZone, "caChallengeZone");
            return caChallengeZone;
        }
    }

    /* loaded from: classes4.dex */
    static final class h extends AbstractC3160z implements Function0 {
        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.stripe.android.stripe3ds2.views.e invoke() {
            Y3.b bVar = c.this.f27049i;
            Y3.b bVar2 = null;
            if (bVar == null) {
                AbstractC3159y.y("cresData");
                bVar = null;
            }
            if (bVar.b0() == Y3.g.f13165h) {
                C1559c A8 = c.this.A();
                Y3.b bVar3 = c.this.f27049i;
                if (bVar3 == null) {
                    AbstractC3159y.y("cresData");
                } else {
                    bVar2 = bVar3;
                }
                return A8.c(bVar2);
            }
            return null;
        }
    }

    /* loaded from: classes4.dex */
    static final class i extends AbstractC3160z implements Function1 {
        i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return I.f6474a;
        }

        public final void invoke(String str) {
            C1567k C8 = c.this.C();
            if (C8 != null) {
                AbstractC3159y.f(str);
                C8.setText(str);
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class j extends AbstractC3160z implements Function1 {
        j() {
            super(1);
        }

        public final void a(I i8) {
            c.this.O();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((I) obj);
            return I.f6474a;
        }
    }

    /* loaded from: classes4.dex */
    static final class k extends AbstractC3160z implements Function1 {
        k() {
            super(1);
        }

        public final void a(com.stripe.android.stripe3ds2.transaction.d dVar) {
            if (dVar != null) {
                c.this.J(dVar);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((com.stripe.android.stripe3ds2.transaction.d) obj);
            return I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l implements Observer, InterfaceC3153s {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f27069a;

        l(Function1 function) {
            AbstractC3159y.i(function, "function");
            this.f27069a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC3153s)) {
                return AbstractC3159y.d(getFunctionDelegate(), ((InterfaceC3153s) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC3153s
        public final InterfaceC1223g getFunctionDelegate() {
            return this.f27069a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f27069a.invoke(obj);
        }
    }

    /* loaded from: classes4.dex */
    public static final class m extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f27070a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Fragment fragment) {
            super(0);
            this.f27070a = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.f27070a.requireActivity().getViewModelStore();
            AbstractC3159y.h(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* loaded from: classes4.dex */
    public static final class n extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f27071a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f27072b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Function0 function0, Fragment fragment) {
            super(0);
            this.f27071a = function0;
            this.f27072b = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f27071a;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.f27072b.requireActivity().getDefaultViewModelCreationExtras();
            AbstractC3159y.h(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* loaded from: classes4.dex */
    static final class o extends AbstractC3160z implements Function0 {
        o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            Y3.b bVar = c.this.f27049i;
            if (bVar == null) {
                AbstractC3159y.y("cresData");
                bVar = null;
            }
            Y3.g b02 = bVar.b0();
            String b8 = b02 != null ? b02.b() : null;
            return b8 == null ? "" : b8;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class p extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ImageView f27074a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(ImageView imageView) {
            super(1);
            this.f27074a = imageView;
        }

        public final void a(Bitmap bitmap) {
            if (bitmap != null) {
                this.f27074a.setVisibility(0);
                this.f27074a.setImageBitmap(bitmap);
            } else {
                this.f27074a.setVisibility(8);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Bitmap) obj);
            return I.f6474a;
        }
    }

    /* loaded from: classes4.dex */
    static final class q extends AbstractC3160z implements Function0 {
        q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return new b.C0682b(c.this.f27045e, c.this.f27042b, c.this.f27044d, c.this.f27048h);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(T3.m uiCustomization, v transactionTimer, com.stripe.android.stripe3ds2.transaction.k errorRequestExecutor, U3.c errorReporter, com.stripe.android.stripe3ds2.transaction.b challengeActionHandler, Y3.g gVar, com.stripe.android.stripe3ds2.transaction.n intentData, P5.g workContext) {
        super(P3.e.f7955c);
        AbstractC3159y.i(uiCustomization, "uiCustomization");
        AbstractC3159y.i(transactionTimer, "transactionTimer");
        AbstractC3159y.i(errorRequestExecutor, "errorRequestExecutor");
        AbstractC3159y.i(errorReporter, "errorReporter");
        AbstractC3159y.i(challengeActionHandler, "challengeActionHandler");
        AbstractC3159y.i(intentData, "intentData");
        AbstractC3159y.i(workContext, "workContext");
        this.f27041a = uiCustomization;
        this.f27042b = transactionTimer;
        this.f27043c = errorRequestExecutor;
        this.f27044d = errorReporter;
        this.f27045e = challengeActionHandler;
        this.f27046f = gVar;
        this.f27047g = intentData;
        this.f27048h = workContext;
        this.f27050j = L5.l.b(new o());
        this.f27051k = FragmentViewModelLazyKt.createViewModelLazy(this, U.b(com.stripe.android.stripe3ds2.views.b.class), new m(this), new n(null, this), new q());
        this.f27052l = L5.l.b(new d());
        this.f27054n = L5.l.b(new g());
        this.f27055o = L5.l.b(new C0683c());
        this.f27056p = L5.l.b(new f());
        this.f27057q = L5.l.b(new e());
        this.f27058r = L5.l.b(new h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1559c A() {
        return (C1559c) this.f27052l.getValue();
    }

    private final ChallengeZoneView D() {
        return (ChallengeZoneView) this.f27054n.getValue();
    }

    private final String F() {
        return (String) this.f27050j.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(com.stripe.android.stripe3ds2.transaction.d dVar) {
        if (dVar instanceof d.C0679d) {
            d.C0679d c0679d = (d.C0679d) dVar;
            M(c0679d.b(), c0679d.c());
        } else if (dVar instanceof d.b) {
            K(((d.b) dVar).b());
        } else if (dVar instanceof d.c) {
            L(((d.c) dVar).b());
        } else if (dVar instanceof d.e) {
            N(((d.e) dVar).b());
        }
    }

    private final void K(Y3.d dVar) {
        I().n(new h.d(dVar, this.f27046f, this.f27047g));
        I().t();
        this.f27043c.a(dVar);
    }

    private final void L(Throwable th) {
        I().n(new h.e(th, this.f27046f, this.f27047g));
    }

    private final void M(Y3.a aVar, Y3.b bVar) {
        com.stripe.android.stripe3ds2.transaction.h cVar;
        if (bVar.f0()) {
            I().t();
            if (aVar.f() != null) {
                cVar = new h.a(F(), this.f27046f, this.f27047g);
            } else {
                String a02 = bVar.a0();
                if (a02 == null) {
                    a02 = "";
                }
                if (AbstractC3159y.d("Y", a02)) {
                    cVar = new h.f(F(), this.f27046f, this.f27047g);
                } else {
                    cVar = new h.c(F(), this.f27046f, this.f27047g);
                }
            }
            I().n(cVar);
            return;
        }
        I().p(bVar);
    }

    private final void N(Y3.d dVar) {
        I().t();
        this.f27043c.a(dVar);
        I().n(new h.g(F(), this.f27046f, this.f27047g));
    }

    private final void P() {
        BrandZoneView caBrandZone = H().f8210b;
        AbstractC3159y.h(caBrandZone, "caBrandZone");
        ImageView issuerImageView$3ds2sdk_release = caBrandZone.getIssuerImageView$3ds2sdk_release();
        Y3.b bVar = this.f27049i;
        Y3.b bVar2 = null;
        if (bVar == null) {
            AbstractC3159y.y("cresData");
            bVar = null;
        }
        r a8 = x.a(issuerImageView$3ds2sdk_release, bVar.G());
        ImageView paymentSystemImageView$3ds2sdk_release = caBrandZone.getPaymentSystemImageView$3ds2sdk_release();
        Y3.b bVar3 = this.f27049i;
        if (bVar3 == null) {
            AbstractC3159y.y("cresData");
        } else {
            bVar2 = bVar3;
        }
        for (Map.Entry entry : Q.k(a8, x.a(paymentSystemImageView$3ds2sdk_release, bVar2.Q())).entrySet()) {
            I().g((b.d) entry.getValue(), getResources().getDisplayMetrics().densityDpi).observe(getViewLifecycleOwner(), new l(new p((ImageView) entry.getKey())));
        }
    }

    private final void s(C1567k c1567k, C1566j c1566j, com.stripe.android.stripe3ds2.views.e eVar) {
        Y3.b bVar = null;
        if (c1567k != null) {
            D().setChallengeEntryView(c1567k);
            ChallengeZoneView D8 = D();
            Y3.b bVar2 = this.f27049i;
            if (bVar2 == null) {
                AbstractC3159y.y("cresData");
                bVar2 = null;
            }
            D8.d(bVar2.Z(), this.f27041a.b(q.a.SUBMIT));
            ChallengeZoneView D9 = D();
            Y3.b bVar3 = this.f27049i;
            if (bVar3 == null) {
                AbstractC3159y.y("cresData");
            } else {
                bVar = bVar3;
            }
            D9.c(bVar.T(), this.f27041a.b(q.a.RESEND));
        } else if (c1566j != null) {
            D().setChallengeEntryView(c1566j);
            ChallengeZoneView D10 = D();
            Y3.b bVar4 = this.f27049i;
            if (bVar4 == null) {
                AbstractC3159y.y("cresData");
                bVar4 = null;
            }
            D10.d(bVar4.Z(), this.f27041a.b(q.a.NEXT));
            ChallengeZoneView D11 = D();
            Y3.b bVar5 = this.f27049i;
            if (bVar5 == null) {
                AbstractC3159y.y("cresData");
            } else {
                bVar = bVar5;
            }
            D11.c(bVar.T(), this.f27041a.b(q.a.RESEND));
        } else if (eVar != null) {
            D().setChallengeEntryView(eVar);
            D().a(null, null);
            D().b(null, null);
            D().d(null, null);
            eVar.setOnClickListener(new View.OnClickListener() { // from class: a4.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    com.stripe.android.stripe3ds2.views.c.t(com.stripe.android.stripe3ds2.views.c.this, view);
                }
            });
            y().setVisibility(8);
        } else {
            Y3.b bVar6 = this.f27049i;
            if (bVar6 == null) {
                AbstractC3159y.y("cresData");
                bVar6 = null;
            }
            if (bVar6.b0() == Y3.g.f13164g) {
                ChallengeZoneView D12 = D();
                Y3.b bVar7 = this.f27049i;
                if (bVar7 == null) {
                    AbstractC3159y.y("cresData");
                } else {
                    bVar = bVar7;
                }
                D12.d(bVar.L(), this.f27041a.b(q.a.CONTINUE));
            }
        }
        u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(c this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.I().r(this$0.z());
    }

    private final void u() {
        int i8;
        ChallengeZoneView D8 = D();
        Y3.b bVar = this.f27049i;
        Y3.b bVar2 = null;
        if (bVar == null) {
            AbstractC3159y.y("cresData");
            bVar = null;
        }
        D8.a(bVar.k(), this.f27041a.c());
        ChallengeZoneView D9 = D();
        Y3.b bVar3 = this.f27049i;
        if (bVar3 == null) {
            AbstractC3159y.y("cresData");
            bVar3 = null;
        }
        D9.b(bVar3.o(), this.f27041a.c());
        ChallengeZoneView D10 = D();
        Y3.b bVar4 = this.f27049i;
        if (bVar4 == null) {
            AbstractC3159y.y("cresData");
            bVar4 = null;
        }
        if (bVar4.Y()) {
            i8 = P3.c.f7918d;
        } else {
            i8 = 0;
        }
        D10.setInfoTextIndicator(i8);
        ChallengeZoneView D11 = D();
        Y3.b bVar5 = this.f27049i;
        if (bVar5 == null) {
            AbstractC3159y.y("cresData");
        } else {
            bVar2 = bVar5;
        }
        D11.e(bVar2.c0(), this.f27041a.c(), this.f27041a.b(q.a.SELECT));
        D().setSubmitButtonClickListener(new View.OnClickListener() { // from class: a4.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.stripe.android.stripe3ds2.views.c.v(com.stripe.android.stripe3ds2.views.c.this, view);
            }
        });
        D().setResendButtonClickListener(new View.OnClickListener() { // from class: a4.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.stripe.android.stripe3ds2.views.c.w(com.stripe.android.stripe3ds2.views.c.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(c this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.I().r(this$0.z());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(c this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.I().u(a.e.f26789a);
    }

    private final void x() {
        InformationZoneView caInformationZone = H().f8212d;
        AbstractC3159y.h(caInformationZone, "caInformationZone");
        Y3.b bVar = this.f27049i;
        Y3.b bVar2 = null;
        if (bVar == null) {
            AbstractC3159y.y("cresData");
            bVar = null;
        }
        String d02 = bVar.d0();
        Y3.b bVar3 = this.f27049i;
        if (bVar3 == null) {
            AbstractC3159y.y("cresData");
            bVar3 = null;
        }
        caInformationZone.g(d02, bVar3.e0(), this.f27041a.c());
        Y3.b bVar4 = this.f27049i;
        if (bVar4 == null) {
            AbstractC3159y.y("cresData");
            bVar4 = null;
        }
        String u8 = bVar4.u();
        Y3.b bVar5 = this.f27049i;
        if (bVar5 == null) {
            AbstractC3159y.y("cresData");
        } else {
            bVar2 = bVar5;
        }
        caInformationZone.f(u8, bVar2.z(), this.f27041a.c());
        String f8 = this.f27041a.f();
        if (f8 != null) {
            caInformationZone.setToggleColor$3ds2sdk_release(Color.parseColor(f8));
        }
    }

    private final BrandZoneView y() {
        return (BrandZoneView) this.f27055o.getValue();
    }

    private final com.stripe.android.stripe3ds2.transaction.a z() {
        int i8;
        Y3.b bVar = this.f27049i;
        if (bVar == null) {
            AbstractC3159y.y("cresData");
            bVar = null;
        }
        Y3.g b02 = bVar.b0();
        if (b02 == null) {
            i8 = -1;
        } else {
            i8 = b.f27059a[b02.ordinal()];
        }
        if (i8 != 4) {
            if (i8 != 5) {
                return new a.c(G());
            }
            return a.d.f26788a;
        }
        return new a.b(G());
    }

    public final C1566j B() {
        return (C1566j) this.f27057q.getValue();
    }

    public final C1567k C() {
        return (C1567k) this.f27056p.getValue();
    }

    public final com.stripe.android.stripe3ds2.views.e E() {
        return (com.stripe.android.stripe3ds2.views.e) this.f27058r.getValue();
    }

    public final String G() {
        int i8;
        Y3.b bVar = this.f27049i;
        String str = null;
        if (bVar == null) {
            AbstractC3159y.y("cresData");
            bVar = null;
        }
        Y3.g b02 = bVar.b0();
        if (b02 == null) {
            i8 = -1;
        } else {
            i8 = b.f27059a[b02.ordinal()];
        }
        if (i8 != 1) {
            if (i8 != 2 && i8 != 3) {
                if (i8 != 4) {
                    str = "";
                } else {
                    com.stripe.android.stripe3ds2.views.e E8 = E();
                    if (E8 != null) {
                        str = E8.getUserEntry();
                    }
                }
            } else {
                C1566j B8 = B();
                if (B8 != null) {
                    str = B8.getUserEntry();
                }
            }
        } else {
            C1567k C8 = C();
            if (C8 != null) {
                str = C8.getUserEntry();
            }
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public final Q3.c H() {
        Q3.c cVar = this.f27053m;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final com.stripe.android.stripe3ds2.views.b I() {
        return (com.stripe.android.stripe3ds2.views.b) this.f27051k.getValue();
    }

    public final void O() {
        Y3.b bVar = this.f27049i;
        Y3.b bVar2 = null;
        if (bVar == null) {
            AbstractC3159y.y("cresData");
            bVar = null;
        }
        if (bVar.b0() == Y3.g.f13165h) {
            Y3.b bVar3 = this.f27049i;
            if (bVar3 == null) {
                AbstractC3159y.y("cresData");
                bVar3 = null;
            }
            String f8 = bVar3.f();
            if (f8 != null && !g6.n.u(f8)) {
                com.stripe.android.stripe3ds2.views.e E8 = E();
                if (E8 != null) {
                    Y3.b bVar4 = this.f27049i;
                    if (bVar4 == null) {
                        AbstractC3159y.y("cresData");
                    } else {
                        bVar2 = bVar4;
                    }
                    E8.c(bVar2.f());
                    return;
                }
                return;
            }
        }
        Y3.b bVar5 = this.f27049i;
        if (bVar5 == null) {
            AbstractC3159y.y("cresData");
            bVar5 = null;
        }
        if (bVar5.b0() == Y3.g.f13164g) {
            Y3.b bVar6 = this.f27049i;
            if (bVar6 == null) {
                AbstractC3159y.y("cresData");
                bVar6 = null;
            }
            String j8 = bVar6.j();
            if (j8 != null && !g6.n.u(j8)) {
                ChallengeZoneView D8 = D();
                Y3.b bVar7 = this.f27049i;
                if (bVar7 == null) {
                    AbstractC3159y.y("cresData");
                } else {
                    bVar2 = bVar7;
                }
                D8.b(bVar2.j(), this.f27041a.c());
                D().setInfoTextIndicator(0);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f27053m = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Y3.b bVar;
        AbstractC3159y.i(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            bVar = (Y3.b) BundleCompat.getParcelable(arguments, "arg_cres", Y3.b.class);
        } else {
            bVar = null;
        }
        if (bVar == null) {
            L(new IllegalArgumentException("Could not start challenge screen. Challenge response data was null."));
            return;
        }
        this.f27049i = bVar;
        this.f27053m = Q3.c.a(view);
        I().f().observe(getViewLifecycleOwner(), new l(new i()));
        I().i().observe(getViewLifecycleOwner(), new l(new j()));
        I().e().observe(getViewLifecycleOwner(), new l(new k()));
        P();
        s(C(), B(), E());
        x();
    }
}
