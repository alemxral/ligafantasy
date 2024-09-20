package com.stripe.android.paymentsheet;

import J3.AbstractActivityC1197e;
import L5.I;
import L5.InterfaceC1227k;
import L5.s;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.paymentsheet.PaymentSheetContractV2;
import com.stripe.android.paymentsheet.x;
import com.stripe.android.paymentsheet.y;
import i6.M;
import j4.AbstractC3087m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.C3156v;
import kotlin.jvm.internal.U;
import l6.AbstractC3360h;
import l6.InterfaceC3358f;
import l6.InterfaceC3359g;
import n4.AbstractC3472h;
import n4.C3471g;
import q2.AbstractC3647a;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class PaymentSheetActivity extends AbstractActivityC1197e {

    /* renamed from: b, reason: collision with root package name */
    private ViewModelProvider.Factory f25465b = new y.d(new f());

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1227k f25466c = new ViewModelLazy(U.b(y.class), new b(this), new e(), new c(null, this));

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC1227k f25467d = L5.l.b(new d());

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements X5.n {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.paymentsheet.PaymentSheetActivity$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0571a extends AbstractC3160z implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ PaymentSheetActivity f25469a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.PaymentSheetActivity$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0572a extends kotlin.coroutines.jvm.internal.l implements X5.n {

                /* renamed from: a, reason: collision with root package name */
                int f25470a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ PaymentSheetActivity f25471b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C3471g f25472c;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: com.stripe.android.paymentsheet.PaymentSheetActivity$a$a$a$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0573a implements InterfaceC3359g {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ PaymentSheetActivity f25473a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ C3471g f25474b;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* renamed from: com.stripe.android.paymentsheet.PaymentSheetActivity$a$a$a$a$a, reason: collision with other inner class name */
                    /* loaded from: classes4.dex */
                    public static final class C0574a extends kotlin.coroutines.jvm.internal.d {

                        /* renamed from: a, reason: collision with root package name */
                        Object f25475a;

                        /* renamed from: b, reason: collision with root package name */
                        /* synthetic */ Object f25476b;

                        /* renamed from: d, reason: collision with root package name */
                        int f25478d;

                        C0574a(P5.d dVar) {
                            super(dVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Object invokeSuspend(Object obj) {
                            this.f25476b = obj;
                            this.f25478d |= Integer.MIN_VALUE;
                            return C0573a.this.emit(null, this);
                        }
                    }

                    C0573a(PaymentSheetActivity paymentSheetActivity, C3471g c3471g) {
                        this.f25473a = paymentSheetActivity;
                        this.f25474b = c3471g;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                    @Override // l6.InterfaceC3359g
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object emit(com.stripe.android.paymentsheet.x r5, P5.d r6) {
                        /*
                            r4 = this;
                            boolean r0 = r6 instanceof com.stripe.android.paymentsheet.PaymentSheetActivity.a.C0571a.C0572a.C0573a.C0574a
                            if (r0 == 0) goto L13
                            r0 = r6
                            com.stripe.android.paymentsheet.PaymentSheetActivity$a$a$a$a$a r0 = (com.stripe.android.paymentsheet.PaymentSheetActivity.a.C0571a.C0572a.C0573a.C0574a) r0
                            int r1 = r0.f25478d
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.f25478d = r1
                            goto L18
                        L13:
                            com.stripe.android.paymentsheet.PaymentSheetActivity$a$a$a$a$a r0 = new com.stripe.android.paymentsheet.PaymentSheetActivity$a$a$a$a$a
                            r0.<init>(r6)
                        L18:
                            java.lang.Object r6 = r0.f25476b
                            java.lang.Object r1 = Q5.b.e()
                            int r2 = r0.f25478d
                            r3 = 1
                            if (r2 == 0) goto L35
                            if (r2 != r3) goto L2d
                            java.lang.Object r5 = r0.f25475a
                            com.stripe.android.paymentsheet.PaymentSheetActivity$a$a$a$a r5 = (com.stripe.android.paymentsheet.PaymentSheetActivity.a.C0571a.C0572a.C0573a) r5
                            L5.t.b(r6)
                            goto L4b
                        L2d:
                            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                            r5.<init>(r6)
                            throw r5
                        L35:
                            L5.t.b(r6)
                            com.stripe.android.paymentsheet.PaymentSheetActivity r6 = r4.f25473a
                            r6.x(r5)
                            n4.g r5 = r4.f25474b
                            r0.f25475a = r4
                            r0.f25478d = r3
                            java.lang.Object r5 = r5.c(r0)
                            if (r5 != r1) goto L4a
                            return r1
                        L4a:
                            r5 = r4
                        L4b:
                            com.stripe.android.paymentsheet.PaymentSheetActivity r6 = r5.f25473a
                            com.stripe.android.paymentsheet.y r6 = r6.n()
                            z3.b r6 = r6.r()
                            r6.d()
                            com.stripe.android.paymentsheet.PaymentSheetActivity r5 = r5.f25473a
                            r5.finish()
                            L5.I r5 = L5.I.f6474a
                            return r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.PaymentSheetActivity.a.C0571a.C0572a.C0573a.emit(com.stripe.android.paymentsheet.x, P5.d):java.lang.Object");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0572a(PaymentSheetActivity paymentSheetActivity, C3471g c3471g, P5.d dVar) {
                    super(2, dVar);
                    this.f25471b = paymentSheetActivity;
                    this.f25472c = c3471g;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final P5.d create(Object obj, P5.d dVar) {
                    return new C0572a(this.f25471b, this.f25472c, dVar);
                }

                @Override // X5.n
                public final Object invoke(M m8, P5.d dVar) {
                    return ((C0572a) create(m8, dVar)).invokeSuspend(I.f6474a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = Q5.b.e();
                    int i8 = this.f25470a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            L5.t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        L5.t.b(obj);
                        InterfaceC3358f t8 = AbstractC3360h.t(this.f25471b.n().r0());
                        C0573a c0573a = new C0573a(this.f25471b, this.f25472c);
                        this.f25470a = 1;
                        if (t8.collect(c0573a, this) == e8) {
                            return e8;
                        }
                    }
                    return I.f6474a;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.PaymentSheetActivity$a$a$b */
            /* loaded from: classes4.dex */
            public /* synthetic */ class b extends C3156v implements Function0 {
                b(Object obj) {
                    super(0, obj, y.class, "onUserCancel", "onUserCancel()V", 0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m5513invoke();
                    return I.f6474a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m5513invoke() {
                    ((y) this.receiver).H();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.PaymentSheetActivity$a$a$c */
            /* loaded from: classes4.dex */
            public static final class c extends AbstractC3160z implements X5.n {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ PaymentSheetActivity f25479a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(PaymentSheetActivity paymentSheetActivity) {
                    super(2);
                    this.f25479a = paymentSheetActivity;
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
                        ComposerKt.traceEventStart(1652456663, i8, -1, "com.stripe.android.paymentsheet.PaymentSheetActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (PaymentSheetActivity.kt:75)");
                    }
                    com.stripe.android.paymentsheet.ui.b.h(this.f25479a.n(), composer, 8);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.PaymentSheetActivity$a$a$d */
            /* loaded from: classes4.dex */
            public static final class d extends AbstractC3160z implements Function1 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ State f25480a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(State state) {
                    super(1);
                    this.f25480a = state;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(ModalBottomSheetValue it) {
                    AbstractC3159y.i(it, "it");
                    return Boolean.valueOf(!C0571a.b(this.f25480a));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0571a(PaymentSheetActivity paymentSheetActivity) {
                super(2);
                this.f25469a = paymentSheetActivity;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean b(State state) {
                return ((Boolean) state.getValue()).booleanValue();
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
                    ComposerKt.traceEventStart(952004382, i8, -1, "com.stripe.android.paymentsheet.PaymentSheetActivity.onCreate.<anonymous>.<anonymous> (PaymentSheetActivity.kt:56)");
                }
                State a8 = v4.f.a(this.f25469a.n().v(), composer, 8);
                composer.startReplaceableGroup(2130490094);
                boolean changed = composer.changed(a8);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new d(a8);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                C3471g b8 = AbstractC3472h.b(null, (Function1) rememberedValue, composer, 0, 1);
                EffectsKt.LaunchedEffect(I.f6474a, new C0572a(this.f25469a, b8, null), composer, 70);
                AbstractC3647a.a(b8, null, new b(this.f25469a.n()), ComposableLambdaKt.composableLambda(composer, 1652456663, true, new c(this.f25469a)), composer, C3471g.f36145e | 3072, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        a() {
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
                ComposerKt.traceEventStart(485212172, i8, -1, "com.stripe.android.paymentsheet.PaymentSheetActivity.onCreate.<anonymous> (PaymentSheetActivity.kt:55)");
            }
            AbstractC3087m.a(null, null, null, ComposableLambdaKt.composableLambda(composer, 952004382, true, new C0571a(PaymentSheetActivity.this)), composer, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f25481a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f25481a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f25481a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f25482a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f25483b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f25482a = function0;
            this.f25483b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f25482a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f25483b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3160z implements Function0 {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PaymentSheetContractV2.a invoke() {
            PaymentSheetContractV2.a.C0576a c0576a = PaymentSheetContractV2.a.f25495e;
            Intent intent = PaymentSheetActivity.this.getIntent();
            AbstractC3159y.h(intent, "getIntent(...)");
            return c0576a.a(intent);
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3160z implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return PaymentSheetActivity.this.v();
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3160z implements Function0 {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PaymentSheetContractV2.a invoke() {
            PaymentSheetContractV2.a t8 = PaymentSheetActivity.this.t();
            if (t8 != null) {
                return t8;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    private final IllegalArgumentException r() {
        return new IllegalArgumentException("PaymentSheet started without arguments.");
    }

    private final void s(Throwable th) {
        if (th == null) {
            th = r();
        }
        x(new x.c(th));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaymentSheetContractV2.a t() {
        return (PaymentSheetContractV2.a) this.f25467d.getValue();
    }

    private final Object w() {
        Object b8;
        PaymentSheetContractV2.a t8 = t();
        if (t8 == null) {
            s.a aVar = L5.s.f6498b;
            b8 = L5.s.b(L5.t.a(r()));
        } else {
            try {
                t8.e().b();
                v.b(t8.b());
                v.a(t8.b().f());
                b8 = L5.s.b(t8);
            } catch (IllegalArgumentException e8) {
                s.a aVar2 = L5.s.f6498b;
                b8 = L5.s.b(L5.t.a(e8));
            }
        }
        p(L5.s.g(b8));
        return b8;
    }

    @Override // J3.AbstractActivityC1197e, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        Object obj;
        Object w8 = w();
        super.onCreate(bundle);
        if (L5.s.g(w8)) {
            obj = null;
        } else {
            obj = w8;
        }
        if (((PaymentSheetContractV2.a) obj) == null) {
            s(L5.s.e(w8));
            return;
        }
        n().K0(this, this);
        if (!K3.a.a(this)) {
            n().c().b();
        }
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(485212172, true, new a()), 1, null);
    }

    @Override // J3.AbstractActivityC1197e
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public y n() {
        return (y) this.f25466c.getValue();
    }

    public final ViewModelProvider.Factory v() {
        return this.f25465b;
    }

    public void x(x result) {
        AbstractC3159y.i(result, "result");
        setResult(-1, new Intent().putExtras(new PaymentSheetContractV2.c(result).c()));
    }
}
