package com.uptodown.activities;

import E4.j;
import L5.C1224h;
import L5.InterfaceC1227k;
import T4.C1381n;
import T4.C1388v;
import T4.p0;
import X4.Q;
import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
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
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.UpcomingReleasesActivity;
import com.uptodown.activities.y;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.M;
import i6.N;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.U;
import l5.AbstractC3337y;
import l5.C3323k;
import l6.InterfaceC3349K;
import l6.InterfaceC3359g;

/* loaded from: classes4.dex */
public final class UpcomingReleasesActivity extends AbstractActivityC2489a {

    /* renamed from: W, reason: collision with root package name */
    public static final a f28864W = new a(null);

    /* renamed from: Q, reason: collision with root package name */
    private D4.L f28867Q;

    /* renamed from: T, reason: collision with root package name */
    private boolean f28870T;

    /* renamed from: V, reason: collision with root package name */
    private final ActivityResultLauncher f28872V;

    /* renamed from: O, reason: collision with root package name */
    private final InterfaceC1227k f28865O = new ViewModelLazy(U.b(y.class), new i(this), new h(this), new j(null, this));

    /* renamed from: P, reason: collision with root package name */
    private final InterfaceC1227k f28866P = L5.l.b(new b());

    /* renamed from: R, reason: collision with root package name */
    private y.a f28868R = y.a.DATE;

    /* renamed from: S, reason: collision with root package name */
    private boolean f28869S = true;

    /* renamed from: U, reason: collision with root package name */
    private final k f28871U = new k();

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
        public final p0 invoke() {
            return p0.c(UpcomingReleasesActivity.this.getLayoutInflater());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3160z implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5571invoke();
            return L5.I.f6474a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5571invoke() {
            UpcomingReleasesActivity.this.H3(true);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends RecyclerView.OnScrollListener {
        d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i8, int i9) {
            AbstractC3159y.i(recyclerView, "recyclerView");
            if (i9 > 0 && !UpcomingReleasesActivity.this.B3().l() && !UpcomingReleasesActivity.this.B3().j() && recyclerView.getLayoutManager() != null) {
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                AbstractC3159y.f(layoutManager);
                int childCount = layoutManager.getChildCount();
                RecyclerView.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
                AbstractC3159y.f(layoutManager2);
                int itemCount = layoutManager2.getItemCount();
                RecyclerView.LayoutManager layoutManager3 = recyclerView.getLayoutManager();
                AbstractC3159y.f(layoutManager3);
                if (childCount + ((LinearLayoutManager) layoutManager3).findFirstVisibleItemPosition() >= itemCount - 10) {
                    D4.L l8 = UpcomingReleasesActivity.this.f28867Q;
                    if (l8 != null) {
                        l8.e(true);
                    }
                    y B32 = UpcomingReleasesActivity.this.B3();
                    UpcomingReleasesActivity upcomingReleasesActivity = UpcomingReleasesActivity.this;
                    B32.i(upcomingReleasesActivity, upcomingReleasesActivity.f28868R, UpcomingReleasesActivity.this.f28869S);
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28876a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ UpcomingReleasesActivity f28878a;

            a(UpcomingReleasesActivity upcomingReleasesActivity) {
                this.f28878a = upcomingReleasesActivity;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3337y abstractC3337y, P5.d dVar) {
                D4.L l8;
                if (abstractC3337y instanceof AbstractC3337y.a) {
                    this.f28878a.A3().f10789c.f10172b.setVisibility(0);
                } else if (abstractC3337y instanceof AbstractC3337y.c) {
                    AbstractC3337y.c cVar = (AbstractC3337y.c) abstractC3337y;
                    this.f28878a.x3(((y.b) cVar.a()).b(), ((y.b) cVar.a()).a());
                    if (((y.b) cVar.a()).b().isEmpty() && ((y.b) cVar.a()).a().isEmpty()) {
                        this.f28878a.A3().f10795i.setVisibility(0);
                    }
                    D4.L l9 = this.f28878a.f28867Q;
                    if (l9 != null) {
                        l9.e(false);
                    }
                    this.f28878a.A3().f10789c.f10172b.setVisibility(8);
                    this.f28878a.A3().f10788b.setVisibility(0);
                } else if ((abstractC3337y instanceof AbstractC3337y.b) && (l8 = this.f28878a.f28867Q) != null) {
                    l8.e(false);
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
            int i8 = this.f28876a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K k8 = UpcomingReleasesActivity.this.B3().k();
                a aVar = new a(UpcomingReleasesActivity.this);
                this.f28876a = 1;
                if (k8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ X4.D f28879a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ UpcomingReleasesActivity f28880b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(X4.D d8, UpcomingReleasesActivity upcomingReleasesActivity) {
            super(0);
            this.f28879a = d8;
            this.f28880b = upcomingReleasesActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5572invoke();
            return L5.I.f6474a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5572invoke() {
            String d8 = this.f28879a.d();
            if (d8 != null && d8.length() != 0) {
                UpcomingReleasesActivity upcomingReleasesActivity = this.f28880b;
                String d9 = this.f28879a.d();
                AbstractC3159y.f(d9);
                upcomingReleasesActivity.y3(d9);
            }
            this.f28880b.H3(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28881a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ X4.D f28883c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(X4.D d8, P5.d dVar) {
            super(2, dVar);
            this.f28883c = d8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new g(this.f28883c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f28881a == 0) {
                L5.t.b(obj);
                UpcomingReleasesActivity.this.w3(this.f28883c);
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28884a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentActivity componentActivity) {
            super(0);
            this.f28884a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f28884a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28885a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentActivity componentActivity) {
            super(0);
            this.f28885a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f28885a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f28886a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28887b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f28886a = function0;
            this.f28887b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f28886a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f28887b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* loaded from: classes4.dex */
    public static final class k implements W4.J {

        /* loaded from: classes4.dex */
        static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f28889a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ UpcomingReleasesActivity f28890b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ X4.D f28891c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(UpcomingReleasesActivity upcomingReleasesActivity, X4.D d8, P5.d dVar) {
                super(2, dVar);
                this.f28890b = upcomingReleasesActivity;
                this.f28891c = d8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f28890b, this.f28891c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f28889a == 0) {
                    L5.t.b(obj);
                    this.f28890b.J3(this.f28891c);
                    return L5.I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        k() {
        }

        @Override // W4.J
        public void a(int i8) {
            if (UptodownApp.f27990B.a0() && UpcomingReleasesActivity.this.f28867Q != null) {
                AbstractC3159y.f(UpcomingReleasesActivity.this.f28867Q);
                if (!r0.b().isEmpty()) {
                    D4.L l8 = UpcomingReleasesActivity.this.f28867Q;
                    AbstractC3159y.f(l8);
                    if (l8.b().get(i8) instanceof X4.D) {
                        D4.L l9 = UpcomingReleasesActivity.this.f28867Q;
                        AbstractC3159y.f(l9);
                        Object obj = l9.b().get(i8);
                        AbstractC3159y.g(obj, "null cannot be cast to non-null type com.uptodown.models.PreRegister");
                        UpcomingReleasesActivity.this.G2(((X4.D) obj).b());
                    }
                }
            }
        }

        @Override // W4.J
        public void e(int i8) {
            if (UptodownApp.f27990B.a0()) {
                if (Q.f12424k.e(UpcomingReleasesActivity.this) == null) {
                    UpcomingReleasesActivity.this.P3();
                    return;
                }
                D4.L l8 = UpcomingReleasesActivity.this.f28867Q;
                AbstractC3159y.f(l8);
                Object obj = l8.b().get(i8);
                AbstractC3159y.g(obj, "null cannot be cast to non-null type com.uptodown.models.PreRegister");
                X4.D d8 = (X4.D) obj;
                if (((ArrayList) UpcomingReleasesActivity.this.B3().o().getValue()).contains(d8)) {
                    UpcomingReleasesActivity.this.L3(d8);
                } else {
                    AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(UpcomingReleasesActivity.this), null, null, new a(UpcomingReleasesActivity.this, d8, null), 3, null);
                }
            }
        }
    }

    public UpcomingReleasesActivity() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: A4.w3
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                UpcomingReleasesActivity.I3(UpcomingReleasesActivity.this, (ActivityResult) obj);
            }
        });
        AbstractC3159y.h(registerForActivityResult, "registerForActivityResul…        }\n        }\n    }");
        this.f28872V = registerForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p0 A3() {
        return (p0) this.f28866P.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final y B3() {
        return (y) this.f28865O.getValue();
    }

    private final void C3() {
        setContentView(A3().getRoot());
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
        p0 A32 = A3();
        if (drawable != null) {
            A32.f10793g.setNavigationIcon(drawable);
            A32.f10793g.setNavigationContentDescription(getString(R.string.back));
        }
        A32.f10793g.setNavigationOnClickListener(new View.OnClickListener() { // from class: A4.y3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UpcomingReleasesActivity.D3(UpcomingReleasesActivity.this, view);
            }
        });
        TextView textView = A32.f10796j;
        j.a aVar = E4.j.f2272g;
        textView.setTypeface(aVar.t());
        A32.f10792f.setLayoutManager(new LinearLayoutManager(this, 1, false));
        A32.f10792f.setItemAnimator(new DefaultItemAnimator());
        int dimension = (int) getResources().getDimension(R.dimen.margin_m);
        A3().f10792f.addItemDecoration(new n5.m(dimension, dimension));
        A32.f10795i.setTypeface(aVar.u());
        A32.f10789c.f10172b.setOnClickListener(new View.OnClickListener() { // from class: A4.z3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UpcomingReleasesActivity.E3(view);
            }
        });
        A32.f10794h.setTypeface(aVar.u());
        A32.f10791e.setOnClickListener(new View.OnClickListener() { // from class: A4.A3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UpcomingReleasesActivity.F3(UpcomingReleasesActivity.this, view);
            }
        });
        A32.f10790d.setOnClickListener(new View.OnClickListener() { // from class: A4.B3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UpcomingReleasesActivity.G3(UpcomingReleasesActivity.this, view);
            }
        });
        A32.f10792f.addOnScrollListener(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D3(UpcomingReleasesActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E3(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F3(UpcomingReleasesActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        y.a aVar = this$0.f28868R;
        y.a aVar2 = y.a.NAME;
        if (aVar != aVar2) {
            this$0.f28868R = aVar2;
        } else {
            this$0.f28869S = !this$0.f28869S;
        }
        this$0.K3();
        this$0.B3().r(false);
        this$0.H3(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G3(UpcomingReleasesActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        y.a aVar = this$0.f28868R;
        y.a aVar2 = y.a.DATE;
        if (aVar != aVar2) {
            this$0.f28868R = aVar2;
        } else {
            this$0.f28869S = !this$0.f28869S;
        }
        this$0.K3();
        this$0.B3().r(false);
        this$0.H3(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H3(boolean z8) {
        B3().h(this, this.f28868R, this.f28869S, z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I3(UpcomingReleasesActivity this$0, ActivityResult activityResult) {
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
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J3(X4.D d8) {
        B3().q(this, d8, new f(d8, this));
    }

    private final void K3() {
        if (this.f28869S) {
            A3().f10791e.setBackground(ContextCompat.getDrawable(this, R.drawable.selector_sort_name_desc));
            A3().f10790d.setBackground(ContextCompat.getDrawable(this, R.drawable.selector_sort_date_desc));
        } else {
            A3().f10791e.setBackground(ContextCompat.getDrawable(this, R.drawable.selector_sort_name_asc));
            A3().f10790d.setBackground(ContextCompat.getDrawable(this, R.drawable.selector_sort_date_asc));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L3(final X4.D d8) {
        AlertDialog s22;
        if (!isFinishing()) {
            if (s2() != null && (s22 = s2()) != null) {
                s22.dismiss();
            }
            C1388v c8 = C1388v.c(getLayoutInflater());
            AbstractC3159y.h(c8, "inflate(layoutInflater)");
            TextView textView = c8.f10925f;
            j.a aVar = E4.j.f2272g;
            textView.setTypeface(aVar.t());
            c8.f10925f.setText(getString(R.string.cancel_registration));
            c8.f10923d.setTypeface(aVar.u());
            TextView textView2 = c8.f10923d;
            C3323k c3323k = new C3323k();
            String string = getString(R.string.confirm_cancel_preregister, d8.d());
            AbstractC3159y.h(string, "getString(R.string.confi…gister, preRegister.name)");
            String d9 = d8.d();
            AbstractC3159y.f(d9);
            textView2.setText(c3323k.d(string, d9, this));
            c8.f10922c.setTypeface(aVar.t());
            c8.f10924e.setTypeface(aVar.t());
            c8.f10924e.setText(getString(R.string.dialog_confirmation_verify_afirmative));
            c8.f10922c.setVisibility(0);
            c8.f10922c.setOnClickListener(new View.OnClickListener() { // from class: A4.E3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UpcomingReleasesActivity.M3(UpcomingReleasesActivity.this, view);
                }
            });
            c8.f10924e.setOnClickListener(new View.OnClickListener() { // from class: A4.F3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UpcomingReleasesActivity.N3(UpcomingReleasesActivity.this, d8, view);
                }
            });
            c8.f10921b.setOnClickListener(new View.OnClickListener() { // from class: A4.G3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UpcomingReleasesActivity.O3(UpcomingReleasesActivity.this, view);
                }
            });
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setView(c8.getRoot());
            builder.setCancelable(true);
            O2(builder.create());
            if (s2() != null) {
                AlertDialog s23 = s2();
                AbstractC3159y.f(s23);
                Window window = s23.getWindow();
                if (window != null) {
                    window.setBackgroundDrawable(new ColorDrawable(0));
                }
                AlertDialog s24 = s2();
                AbstractC3159y.f(s24);
                s24.show();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M3(UpcomingReleasesActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AlertDialog s22 = this$0.s2();
        AbstractC3159y.f(s22);
        s22.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N3(UpcomingReleasesActivity this$0, X4.D preRegister, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(preRegister, "$preRegister");
        AbstractC2829k.d(N.a(C2812b0.b()), null, null, new g(preRegister, null), 3, null);
        AlertDialog s22 = this$0.s2();
        AbstractC3159y.f(s22);
        s22.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O3(UpcomingReleasesActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AlertDialog s22 = this$0.s2();
        AbstractC3159y.f(s22);
        s22.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P3() {
        AlertDialog s22;
        if (!isFinishing()) {
            if (s2() != null && (s22 = s2()) != null) {
                s22.dismiss();
            }
            C1388v c8 = C1388v.c(getLayoutInflater());
            AbstractC3159y.h(c8, "inflate(layoutInflater)");
            TextView textView = c8.f10925f;
            j.a aVar = E4.j.f2272g;
            textView.setTypeface(aVar.t());
            c8.f10923d.setTypeface(aVar.u());
            c8.f10924e.setTypeface(aVar.t());
            c8.f10924e.setOnClickListener(new View.OnClickListener() { // from class: A4.C3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UpcomingReleasesActivity.Q3(UpcomingReleasesActivity.this, view);
                }
            });
            c8.f10921b.setOnClickListener(new View.OnClickListener() { // from class: A4.D3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UpcomingReleasesActivity.R3(UpcomingReleasesActivity.this, view);
                }
            });
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setView(c8.getRoot());
            builder.setCancelable(true);
            O2(builder.create());
            if (s2() != null) {
                AlertDialog s23 = s2();
                AbstractC3159y.f(s23);
                Window window = s23.getWindow();
                if (window != null) {
                    window.setBackgroundDrawable(new ColorDrawable(0));
                }
                AlertDialog s24 = s2();
                AbstractC3159y.f(s24);
                s24.show();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q3(UpcomingReleasesActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.f28872V.launch(new Intent(this$0.getApplicationContext(), (Class<?>) LoginActivity.class), UptodownApp.f27990B.b(this$0));
        this$0.f28870T = true;
        AlertDialog s22 = this$0.s2();
        AbstractC3159y.f(s22);
        s22.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R3(UpcomingReleasesActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AlertDialog s22 = this$0.s2();
        AbstractC3159y.f(s22);
        s22.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w3(X4.D d8) {
        B3().g(this, d8, new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x3(ArrayList arrayList, ArrayList arrayList2) {
        D4.L l8 = this.f28867Q;
        if (l8 == null) {
            this.f28867Q = new D4.L(arrayList, arrayList2, this, this.f28871U);
            A3().f10792f.setAdapter(this.f28867Q);
        } else {
            AbstractC3159y.f(l8);
            l8.d(arrayList, arrayList2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y3(String str) {
        if (s2() != null) {
            AlertDialog s22 = s2();
            AbstractC3159y.f(s22);
            s22.dismiss();
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        C1381n c8 = C1381n.c(getLayoutInflater());
        AbstractC3159y.h(c8, "inflate(layoutInflater)");
        TextView textView = c8.f10758d;
        j.a aVar = E4.j.f2272g;
        textView.setTypeface(aVar.t());
        c8.f10757c.setTypeface(aVar.u());
        TextView textView2 = c8.f10757c;
        C3323k c3323k = new C3323k();
        String string = getString(R.string.pre_register_success, str);
        AbstractC3159y.h(string, "getString(R.string.pre_register_success, appName)");
        textView2.setText(c3323k.d(string, str, this));
        c8.f10756b.setTypeface(aVar.t());
        c8.f10756b.setOnClickListener(new View.OnClickListener() { // from class: A4.x3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UpcomingReleasesActivity.z3(UpcomingReleasesActivity.this, view);
            }
        });
        builder.setView(c8.getRoot());
        O2(builder.create());
        if (!isFinishing() && s2() != null) {
            AlertDialog s23 = s2();
            AbstractC3159y.f(s23);
            Window window = s23.getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            AlertDialog s24 = s2();
            AbstractC3159y.f(s24);
            s24.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z3(UpcomingReleasesActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AlertDialog s22 = this$0.s2();
        AbstractC3159y.f(s22);
        s22.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2489a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C3();
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new e(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2489a, F4.a1, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (!this.f28870T) {
            H3(false);
        }
    }
}
