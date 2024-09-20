package com.stripe.android.paymentsheet.paymentdatacollection.polling;

import L5.I;
import L5.InterfaceC1227k;
import L5.l;
import L5.t;
import X5.n;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.compose.BackHandlerKt;
import androidx.activity.compose.ComponentActivityKt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.WindowCompat;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingContract;
import com.stripe.android.paymentsheet.paymentdatacollection.polling.b;
import f3.C2662c;
import h6.AbstractC2760c;
import h6.C2758a;
import h6.EnumC2761d;
import i6.M;
import j4.AbstractC3087m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.U;
import n4.AbstractC3472h;
import n4.C3471g;
import q2.AbstractC3647a;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class PollingActivity extends AppCompatActivity {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1227k f26254a = l.b(new a());

    /* renamed from: b, reason: collision with root package name */
    private ViewModelProvider.Factory f26255b = new b.f(new f());

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1227k f26256c = new ViewModelLazy(U.b(com.stripe.android.paymentsheet.paymentdatacollection.polling.b.class), new c(this), new e(), new d(null, this));

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PollingContract.a invoke() {
            PollingContract.a.C0643a c0643a = PollingContract.a.f26275g;
            Intent intent = PollingActivity.this.getIntent();
            AbstractC3159y.h(intent, "getIntent(...)");
            PollingContract.a a8 = c0643a.a(intent);
            if (a8 != null) {
                return a8;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3160z implements n {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ PollingActivity f26259a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingActivity$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0641a extends AbstractC3160z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ PollingActivity f26260a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ State f26261b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0641a(PollingActivity pollingActivity, State state) {
                    super(0);
                    this.f26260a = pollingActivity;
                    this.f26261b = state;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m5534invoke();
                    return I.f6474a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m5534invoke() {
                    if (a.b(this.f26261b).e() == F3.e.f2492c) {
                        this.f26260a.s().k();
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingActivity$b$a$b, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0642b extends kotlin.coroutines.jvm.internal.l implements n {

                /* renamed from: a, reason: collision with root package name */
                Object f26262a;

                /* renamed from: b, reason: collision with root package name */
                int f26263b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ PollingActivity f26264c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ C3471g f26265d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ State f26266e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0642b(PollingActivity pollingActivity, C3471g c3471g, State state, P5.d dVar) {
                    super(2, dVar);
                    this.f26264c = pollingActivity;
                    this.f26265d = c3471g;
                    this.f26266e = state;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final P5.d create(Object obj, P5.d dVar) {
                    return new C0642b(this.f26264c, this.f26265d, this.f26266e, dVar);
                }

                @Override // X5.n
                public final Object invoke(M m8, P5.d dVar) {
                    return ((C0642b) create(m8, dVar)).invokeSuspend(I.f6474a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    C2662c c2662c;
                    Object e8 = Q5.b.e();
                    int i8 = this.f26263b;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            c2662c = (C2662c) this.f26262a;
                            t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        t.b(obj);
                        C2662c d8 = com.stripe.android.paymentsheet.paymentdatacollection.polling.c.d(a.b(this.f26266e).e(), this.f26264c.r());
                        if (d8 != null) {
                            C3471g c3471g = this.f26265d;
                            this.f26262a = d8;
                            this.f26263b = 1;
                            if (c3471g.c(this) == e8) {
                                return e8;
                            }
                            c2662c = d8;
                        }
                        return I.f6474a;
                    }
                    this.f26264c.q(c2662c);
                    return I.f6474a;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes4.dex */
            public static final class c extends AbstractC3160z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                public static final c f26267a = new c();

                c() {
                    super(0);
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m5535invoke() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m5535invoke();
                    return I.f6474a;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes4.dex */
            public static final class d extends AbstractC3160z implements n {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ PollingActivity f26268a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(PollingActivity pollingActivity) {
                    super(2);
                    this.f26268a = pollingActivity;
                }

                @Override // X5.n
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return I.f6474a;
                }

                public final void invoke(Composer composer, int i8) {
                    if ((i8 & 11) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-246136616, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (PollingActivity.kt:81)");
                    }
                    F3.d.d(this.f26268a.s(), null, composer, 8, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes4.dex */
            public static final class e extends AbstractC3160z implements Function1 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ State f26269a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                e(State state) {
                    super(1);
                    this.f26269a = state;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(ModalBottomSheetValue proposedValue) {
                    AbstractC3159y.i(proposedValue, "proposedValue");
                    boolean z8 = true;
                    if (proposedValue == ModalBottomSheetValue.Hidden && a.b(this.f26269a).e() == F3.e.f2490a) {
                        z8 = false;
                    }
                    return Boolean.valueOf(z8);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(PollingActivity pollingActivity) {
                super(2);
                this.f26259a = pollingActivity;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final F3.f b(State state) {
                return (F3.f) state.getValue();
            }

            @Override // X5.n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f6474a;
            }

            public final void invoke(Composer composer, int i8) {
                if ((i8 & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1217612191, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingActivity.onCreate.<anonymous>.<anonymous> (PollingActivity.kt:49)");
                }
                State a8 = v4.f.a(this.f26259a.s().j(), composer, 8);
                composer.startReplaceableGroup(1911403227);
                boolean changed = composer.changed(a8);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new e(a8);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                C3471g b8 = AbstractC3472h.b(null, (Function1) rememberedValue, composer, 0, 1);
                BackHandlerKt.BackHandler(true, new C0641a(this.f26259a, a8), composer, 6, 0);
                EffectsKt.LaunchedEffect(b(a8).e(), new C0642b(this.f26259a, b8, a8, null), composer, 64);
                AbstractC3647a.a(b8, null, c.f26267a, ComposableLambdaKt.composableLambda(composer, -246136616, true, new d(this.f26259a)), composer, C3471g.f36145e | 3456, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        b() {
            super(2);
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6474a;
        }

        public final void invoke(Composer composer, int i8) {
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-684927091, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingActivity.onCreate.<anonymous> (PollingActivity.kt:48)");
            }
            AbstractC3087m.a(null, null, null, ComposableLambdaKt.composableLambda(composer, 1217612191, true, new a(PollingActivity.this)), composer, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f26270a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f26270a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f26270a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f26271a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f26272b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f26271a = function0;
            this.f26272b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f26271a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f26272b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3160z implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return PollingActivity.this.t();
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3160z implements Function0 {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b.e invoke() {
            String d8 = PollingActivity.this.r().d();
            C2758a.C0756a c0756a = C2758a.f31395b;
            int f8 = PollingActivity.this.r().f();
            EnumC2761d enumC2761d = EnumC2761d.f31405e;
            return new b.e(d8, AbstractC2760c.s(f8, enumC2761d), AbstractC2760c.s(PollingActivity.this.r().c(), enumC2761d), PollingActivity.this.r().e(), PollingActivity.this.r().b(), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(C2662c c2662c) {
        setResult(-1, new Intent().putExtras(c2662c.o()));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PollingContract.a r() {
        return (PollingContract.a) this.f26254a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.stripe.android.paymentsheet.paymentdatacollection.polling.b s() {
        return (com.stripe.android.paymentsheet.paymentdatacollection.polling.b) this.f26256c.getValue();
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        v4.c.a(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-684927091, true, new b()), 1, null);
    }

    public final ViewModelProvider.Factory t() {
        return this.f26255b;
    }
}
