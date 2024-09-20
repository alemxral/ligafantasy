package com.uptodown.activities;

import E4.j;
import L5.C1224h;
import L5.InterfaceC1223g;
import L5.InterfaceC1227k;
import T4.r0;
import X4.C1503m;
import X4.Q;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.stripe.android.paymentsheet.u;
import com.stripe.android.paymentsheet.x;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.G;
import com.uptodown.activities.UptodownTurboActivity;
import com.uptodown.workers.GetUserDataWorker;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.M;
import j2.r;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.C3156v;
import kotlin.jvm.internal.InterfaceC3153s;
import kotlin.jvm.internal.U;
import l5.AbstractC3338z;
import l5.C3323k;
import l5.C3330r;
import l6.InterfaceC3349K;
import l6.InterfaceC3359g;
import x5.C3932e;

/* loaded from: classes4.dex */
public final class UptodownTurboActivity extends AbstractActivityC2489a {

    /* renamed from: S, reason: collision with root package name */
    public static final a f28943S = new a(null);

    /* renamed from: O, reason: collision with root package name */
    private final InterfaceC1227k f28944O = L5.l.b(new b());

    /* renamed from: P, reason: collision with root package name */
    private final InterfaceC1227k f28945P = new ViewModelLazy(U.b(G.class), new n(this), new m(this), new o(null, this));

    /* renamed from: Q, reason: collision with root package name */
    private com.stripe.android.paymentsheet.u f28946Q;

    /* renamed from: R, reason: collision with root package name */
    private final ActivityResultLauncher f28947R;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3160z implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r0 invoke() {
            return r0.c(UptodownTurboActivity.this.getLayoutInflater());
        }
    }

    /* loaded from: classes4.dex */
    /* synthetic */ class c implements q3.p, InterfaceC3153s {
        c() {
        }

        @Override // q3.p
        public final void a(com.stripe.android.paymentsheet.x p02) {
            AbstractC3159y.i(p02, "p0");
            UptodownTurboActivity.this.E3(p02);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof q3.p) && (obj instanceof InterfaceC3153s)) {
                return AbstractC3159y.d(getFunctionDelegate(), ((InterfaceC3153s) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC3153s
        public final InterfaceC1223g getFunctionDelegate() {
            return new C3156v(1, UptodownTurboActivity.this, UptodownTurboActivity.class, "onPaymentSheetResult", "onPaymentSheetResult(Lcom/stripe/android/paymentsheet/PaymentSheetResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28950a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ UptodownTurboActivity f28952a;

            a(UptodownTurboActivity uptodownTurboActivity) {
                this.f28952a = uptodownTurboActivity;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3338z abstractC3338z, P5.d dVar) {
                if (!AbstractC3159y.d(abstractC3338z, AbstractC3338z.b.f34537a)) {
                    if (abstractC3338z instanceof AbstractC3338z.d) {
                        AbstractC3338z.d dVar2 = (AbstractC3338z.d) abstractC3338z;
                        r.a.c(j2.r.f33047c, this.f28952a, ((G.d) dVar2.a()).c(), null, 4, null);
                        this.f28952a.B3(((G.d) dVar2.a()).b(), ((G.d) dVar2.a()).a());
                    } else if (!AbstractC3159y.d(abstractC3338z, AbstractC3338z.c.f34538a) && AbstractC3159y.d(abstractC3338z, AbstractC3338z.a.f34536a)) {
                        UptodownTurboActivity uptodownTurboActivity = this.f28952a;
                        String string = uptodownTurboActivity.getString(R.string.error_turbo);
                        AbstractC3159y.h(string, "getString(R.string.error_turbo)");
                        uptodownTurboActivity.e2(string);
                    }
                }
                return L5.I.f6474a;
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
            return ((d) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f28950a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K i9 = UptodownTurboActivity.this.q3().i();
                a aVar = new a(UptodownTurboActivity.this);
                this.f28950a = 1;
                if (i9.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28953a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ UptodownTurboActivity f28955a;

            a(UptodownTurboActivity uptodownTurboActivity) {
                this.f28955a = uptodownTurboActivity;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void h(Q q8, UptodownTurboActivity this$0, AbstractC3338z resultTurbo, View view) {
                AbstractC3159y.i(this$0, "this$0");
                AbstractC3159y.i(resultTurbo, "$resultTurbo");
                if (q8 == null) {
                    this$0.F3();
                    return;
                }
                this$0.p3().f10810A.setVisibility(0);
                G q32 = this$0.q3();
                String a8 = ((G.c) ((AbstractC3338z.d) resultTurbo).a()).b().a();
                String id = q8.getId();
                AbstractC3159y.f(id);
                q32.d(this$0, a8, id, "year");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void i(Q q8, UptodownTurboActivity this$0, AbstractC3338z resultTurbo, View view) {
                AbstractC3159y.i(this$0, "this$0");
                AbstractC3159y.i(resultTurbo, "$resultTurbo");
                if (q8 == null) {
                    this$0.F3();
                    return;
                }
                this$0.p3().f10810A.setVisibility(0);
                G q32 = this$0.q3();
                String a8 = ((G.c) ((AbstractC3338z.d) resultTurbo).a()).a().a();
                String id = q8.getId();
                AbstractC3159y.f(id);
                q32.d(this$0, a8, id, "month");
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object emit(final AbstractC3338z abstractC3338z, P5.d dVar) {
                if (AbstractC3159y.d(abstractC3338z, AbstractC3338z.b.f34537a)) {
                    this.f28955a.p3().f10864z.setVisibility(0);
                    this.f28955a.p3().f10863y.setVisibility(0);
                } else if (abstractC3338z instanceof AbstractC3338z.d) {
                    final Q e8 = Q.f12424k.e(this.f28955a);
                    this.f28955a.p3().f10864z.setVisibility(8);
                    this.f28955a.p3().f10863y.setVisibility(8);
                    AbstractC3338z.d dVar2 = (AbstractC3338z.d) abstractC3338z;
                    this.f28955a.p3().f10841c0.setText(((G.c) dVar2.a()).b().b());
                    this.f28955a.p3().f10833X.setText(((G.c) dVar2.a()).a().b());
                    RelativeLayout relativeLayout = this.f28955a.p3().f10812C;
                    final UptodownTurboActivity uptodownTurboActivity = this.f28955a;
                    relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.uptodown.activities.E
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            UptodownTurboActivity.e.a.h(Q.this, uptodownTurboActivity, abstractC3338z, view);
                        }
                    });
                    RelativeLayout relativeLayout2 = this.f28955a.p3().f10811B;
                    final UptodownTurboActivity uptodownTurboActivity2 = this.f28955a;
                    relativeLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.uptodown.activities.F
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            UptodownTurboActivity.e.a.i(Q.this, uptodownTurboActivity2, abstractC3338z, view);
                        }
                    });
                } else if (!AbstractC3159y.d(abstractC3338z, AbstractC3338z.c.f34538a) && AbstractC3159y.d(abstractC3338z, AbstractC3338z.a.f34536a)) {
                    UptodownTurboActivity uptodownTurboActivity3 = this.f28955a;
                    String string = uptodownTurboActivity3.getString(R.string.error_turbo);
                    AbstractC3159y.h(string, "getString(R.string.error_turbo)");
                    uptodownTurboActivity3.e2(string);
                }
                return L5.I.f6474a;
            }
        }

        e(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new e(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f28953a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K e9 = UptodownTurboActivity.this.q3().e();
                a aVar = new a(UptodownTurboActivity.this);
                this.f28953a = 1;
                if (e9.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28956a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ UptodownTurboActivity f28958a;

            a(UptodownTurboActivity uptodownTurboActivity) {
                this.f28958a = uptodownTurboActivity;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3338z abstractC3338z, P5.d dVar) {
                if (!AbstractC3159y.d(abstractC3338z, AbstractC3338z.b.f34537a)) {
                    if (abstractC3338z instanceof AbstractC3338z.d) {
                        new C3323k().q(this.f28958a, (String) ((AbstractC3338z.d) abstractC3338z).a(), this.f28958a.getString(R.string.uptodown_turbo));
                    } else if (!AbstractC3159y.d(abstractC3338z, AbstractC3338z.c.f34538a) && AbstractC3159y.d(abstractC3338z, AbstractC3338z.a.f34536a)) {
                        UptodownTurboActivity uptodownTurboActivity = this.f28958a;
                        String string = uptodownTurboActivity.getString(R.string.error_turbo);
                        AbstractC3159y.h(string, "getString(R.string.error_turbo)");
                        uptodownTurboActivity.e2(string);
                    }
                }
                return L5.I.f6474a;
            }
        }

        f(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new f(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f28956a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K g8 = UptodownTurboActivity.this.q3().g();
                a aVar = new a(UptodownTurboActivity.this);
                this.f28956a = 1;
                if (g8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28959a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ h f28961c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(h hVar, P5.d dVar) {
            super(2, dVar);
            this.f28961c = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new g(this.f28961c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f28959a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                GetUserDataWorker.a aVar = GetUserDataWorker.f30019b;
                UptodownTurboActivity uptodownTurboActivity = UptodownTurboActivity.this;
                h hVar = this.f28961c;
                this.f28959a = 1;
                if (aVar.b(uptodownTurboActivity, hVar, this) == e8) {
                    return e8;
                }
            }
            return L5.I.f6474a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class h implements W4.I {
        h() {
        }

        @Override // W4.I
        public void a() {
            UptodownTurboActivity.this.setResult(100);
            UptodownTurboActivity.this.finish();
        }
    }

    /* loaded from: classes4.dex */
    public static final class i extends ClickableSpan {
        i() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            AbstractC3159y.i(widget, "widget");
            String string = UptodownTurboActivity.this.getString(R.string.url_support);
            AbstractC3159y.h(string, "getString(R.string.url_support)");
            String string2 = UptodownTurboActivity.this.getString(R.string.support_title);
            AbstractC3159y.h(string2, "getString(R.string.support_title)");
            new C3323k().q(UptodownTurboActivity.this, string, string2);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds) {
            AbstractC3159y.i(ds, "ds");
            super.updateDrawState(ds);
            ds.setColor(ContextCompat.getColor(UptodownTurboActivity.this, R.color.blue_primary));
            ds.setTypeface(E4.j.f2272g.t());
            ds.setUnderlineText(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final j f28964a = new j();

        j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(g6.h it) {
            AbstractC3159y.i(it, "it");
            return (CharSequence) it.a().get(1);
        }
    }

    /* loaded from: classes4.dex */
    public static final class k extends ClickableSpan {
        k() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            AbstractC3159y.i(widget, "widget");
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds) {
            AbstractC3159y.i(ds, "ds");
            super.updateDrawState(ds);
            ds.setColor(ContextCompat.getColor(UptodownTurboActivity.this, R.color.turbo_main));
            ds.setTypeface(E4.j.f2272g.t());
            ds.setUnderlineText(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final l f28966a = new l();

        l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(g6.h it) {
            AbstractC3159y.i(it, "it");
            return (CharSequence) it.a().get(1);
        }
    }

    /* loaded from: classes4.dex */
    public static final class m extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28967a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ComponentActivity componentActivity) {
            super(0);
            this.f28967a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f28967a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class n extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28968a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(ComponentActivity componentActivity) {
            super(0);
            this.f28968a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f28968a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class o extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f28969a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28970b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f28969a = function0;
            this.f28970b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f28969a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f28970b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public UptodownTurboActivity() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: A4.M3
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                UptodownTurboActivity.D3(UptodownTurboActivity.this, (ActivityResult) obj);
            }
        });
        AbstractC3159y.h(registerForActivityResult, "registerForActivityResul…        }\n        }\n    }");
        this.f28947R = registerForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A3(UptodownTurboActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.q3().h(this$0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B3(String str, String str2) {
        com.stripe.android.paymentsheet.u uVar = this.f28946Q;
        if (uVar == null) {
            AbstractC3159y.y("paymentSheet");
            uVar = null;
        }
        String string = getString(R.string.app_name);
        AbstractC3159y.h(string, "getString(R.string.app_name)");
        uVar.a(str, new u.g(string, null, null, null, null, null, true, false, null, str2, null, null, 3518, null));
        C3("shown");
    }

    private final void C3(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("type", str);
        new C3330r(this).b("turbo_stripe_form", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D3(UptodownTurboActivity this$0, ActivityResult activityResult) {
        String str;
        AbstractC3159y.i(this$0, "this$0");
        if (activityResult.getResultCode() == 1) {
            Q e8 = Q.f12424k.e(this$0);
            if (e8 != null) {
                str = e8.getId();
            } else {
                str = null;
            }
            if (str != null && e8.z(this$0)) {
                UptodownApp.a aVar = UptodownApp.f27990B;
                aVar.j0(this$0);
                aVar.i0(this$0);
                this$0.I3();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E3(com.stripe.android.paymentsheet.x xVar) {
        if (xVar instanceof x.a) {
            p3().f10810A.setVisibility(8);
            C3("cancelled");
        } else if (xVar instanceof x.c) {
            p3().f10810A.setVisibility(8);
            C3("failed");
        } else if (xVar instanceof x.b) {
            AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.b(), null, new g(new h(), null), 2, null);
            C3("success");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F3() {
        this.f28947R.launch(new Intent(this, (Class<?>) LoginActivity.class), UptodownApp.f27990B.b(this));
    }

    private final void G3(TextView textView) {
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        String obj = textView.getText().toString();
        List<C1503m> a8 = C1503m.f12631f.a(obj, "\\[xx](.*?)\\[/xx]");
        SpannableString spannableString = new SpannableString(new g6.j("\\[xx](.*?)\\[/xx]").g(obj, j.f28964a));
        for (C1503m c1503m : a8) {
            int S7 = g6.n.S(spannableString, c1503m.d(), 0, false, 6, null);
            int length = c1503m.d().length() + S7;
            if (S7 >= 0) {
                spannableString.setSpan(new i(), S7, length, 33);
            }
        }
        textView.setText(spannableString);
    }

    private final void H3(TextView textView) {
        String obj = textView.getText().toString();
        List<C1503m> a8 = C1503m.f12631f.a(obj, "\\[xx](.*?)\\[/xx]");
        SpannableString spannableString = new SpannableString(new g6.j("\\[xx](.*?)\\[/xx]").g(obj, l.f28966a));
        for (C1503m c1503m : a8) {
            int S7 = g6.n.S(spannableString, c1503m.d(), 0, false, 6, null);
            int length = c1503m.d().length() + S7;
            if (S7 >= 0) {
                spannableString.setSpan(new k(), S7, length, 33);
            }
        }
        textView.setText(spannableString);
    }

    private final void I3() {
        Q e8 = Q.f12424k.e(this);
        r0 p32 = p3();
        if (e8 != null && e8.G()) {
            p32.f10832W.setVisibility(0);
            p32.f10811B.setVisibility(8);
            p32.f10813D.setVisibility(8);
            p32.f10837a0.setVisibility(8);
            return;
        }
        p32.f10832W.setVisibility(8);
        p32.f10811B.setVisibility(0);
        p32.f10813D.setVisibility(0);
        p32.f10837a0.setVisibility(0);
        q3().f(this);
    }

    private final void o3(ImageView imageView, long j8) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, "translationY", -20.0f, 40.0f);
        ofFloat.setDuration(j8);
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(2);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final r0 p3() {
        return (r0) this.f28944O.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final G q3() {
        return (G) this.f28945P.getValue();
    }

    private final void r3() {
        final r0 p32 = p3();
        p32.f10840c.setOnClickListener(new View.OnClickListener() { // from class: A4.N3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UptodownTurboActivity.s3(UptodownTurboActivity.this, view);
            }
        });
        p32.f10838b.b(p3().getRoot(), new C3932e(this)).b(getWindow().getDecorView().getBackground()).d(20.0f);
        TextView textView = p32.f10815F;
        j.a aVar = E4.j.f2272g;
        textView.setTypeface(aVar.u());
        TextView tvDescTurbo = p32.f10815F;
        AbstractC3159y.h(tvDescTurbo, "tvDescTurbo");
        H3(tvDescTurbo);
        p32.f10839b0.setTypeface(aVar.t());
        p32.f10841c0.setTypeface(aVar.t());
        p32.f10833X.setTypeface(aVar.t());
        p32.f10832W.setTypeface(aVar.t());
        p32.f10837a0.setTypeface(aVar.u());
        p32.f10834Y.setTypeface(aVar.t());
        p32.f10835Z.setTypeface(aVar.t());
        p32.f10816G.setTypeface(aVar.t());
        p32.f10831V.setTypeface(aVar.t());
        p32.f10829T.setTypeface(aVar.t());
        p32.f10823N.setTypeface(aVar.t());
        p32.f10817H.setTypeface(aVar.u());
        p32.f10824O.setTypeface(aVar.t());
        p32.f10818I.setTypeface(aVar.u());
        p32.f10825P.setTypeface(aVar.t());
        p32.f10819J.setTypeface(aVar.u());
        p32.f10826Q.setTypeface(aVar.t());
        p32.f10820K.setTypeface(aVar.u());
        p32.f10827R.setTypeface(aVar.t());
        p32.f10821L.setTypeface(aVar.u());
        p32.f10828S.setTypeface(aVar.t());
        p32.f10822M.setTypeface(aVar.u());
        p32.f10810A.setOnClickListener(new View.OnClickListener() { // from class: A4.O3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UptodownTurboActivity.t3(view);
            }
        });
        p32.f10855q.setOnClickListener(new View.OnClickListener() { // from class: A4.P3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UptodownTurboActivity.u3(T4.r0.this, view);
            }
        });
        p32.f10856r.setOnClickListener(new View.OnClickListener() { // from class: A4.Q3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UptodownTurboActivity.v3(T4.r0.this, view);
            }
        });
        p32.f10857s.setOnClickListener(new View.OnClickListener() { // from class: A4.R3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UptodownTurboActivity.w3(T4.r0.this, view);
            }
        });
        p32.f10858t.setOnClickListener(new View.OnClickListener() { // from class: A4.S3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UptodownTurboActivity.x3(T4.r0.this, view);
            }
        });
        p32.f10859u.setOnClickListener(new View.OnClickListener() { // from class: A4.T3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UptodownTurboActivity.y3(T4.r0.this, view);
            }
        });
        p32.f10860v.setOnClickListener(new View.OnClickListener() { // from class: A4.U3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UptodownTurboActivity.z3(T4.r0.this, view);
            }
        });
        p32.f10832W.setOnClickListener(new View.OnClickListener() { // from class: A4.V3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UptodownTurboActivity.A3(UptodownTurboActivity.this, view);
            }
        });
        p32.f10830U.setTypeface(aVar.u());
        TextView tvFooterTurbo = p32.f10830U;
        AbstractC3159y.h(tvFooterTurbo, "tvFooterTurbo");
        G3(tvFooterTurbo);
        ImageView ivDiamond1Turbo = p32.f10843e;
        AbstractC3159y.h(ivDiamond1Turbo, "ivDiamond1Turbo");
        o3(ivDiamond1Turbo, 3000L);
        ImageView ivDiamond2Turbo = p32.f10844f;
        AbstractC3159y.h(ivDiamond2Turbo, "ivDiamond2Turbo");
        o3(ivDiamond2Turbo, 5000L);
        ImageView ivDiamond3Turbo = p32.f10845g;
        AbstractC3159y.h(ivDiamond3Turbo, "ivDiamond3Turbo");
        o3(ivDiamond3Turbo, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
        I3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s3(UptodownTurboActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.getOnBackPressedDispatcher().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t3(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u3(r0 this_with, View view) {
        AbstractC3159y.i(this_with, "$this_with");
        if (this_with.f10817H.getVisibility() == 0) {
            this_with.f10817H.setVisibility(8);
        } else {
            this_with.f10817H.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v3(r0 this_with, View view) {
        AbstractC3159y.i(this_with, "$this_with");
        if (this_with.f10818I.getVisibility() == 0) {
            this_with.f10818I.setVisibility(8);
        } else {
            this_with.f10818I.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w3(r0 this_with, View view) {
        AbstractC3159y.i(this_with, "$this_with");
        if (this_with.f10819J.getVisibility() == 0) {
            this_with.f10819J.setVisibility(8);
        } else {
            this_with.f10819J.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x3(r0 this_with, View view) {
        AbstractC3159y.i(this_with, "$this_with");
        if (this_with.f10820K.getVisibility() == 0) {
            this_with.f10820K.setVisibility(8);
        } else {
            this_with.f10820K.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y3(r0 this_with, View view) {
        AbstractC3159y.i(this_with, "$this_with");
        if (this_with.f10821L.getVisibility() == 0) {
            this_with.f10821L.setVisibility(8);
        } else {
            this_with.f10821L.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z3(r0 this_with, View view) {
        AbstractC3159y.i(this_with, "$this_with");
        if (this_with.f10822M.getVisibility() == 0) {
            this_with.f10822M.setVisibility(8);
        } else {
            this_with.f10822M.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2489a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(p3().getRoot());
        r3();
        Bundle bundle2 = new Bundle();
        bundle2.putString("type", "shown");
        new C3330r(this).b("turbo_landing", bundle2);
        this.f28946Q = new com.stripe.android.paymentsheet.u(this, new c());
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new d(null), 2, null);
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new e(null), 2, null);
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new f(null), 2, null);
    }
}
