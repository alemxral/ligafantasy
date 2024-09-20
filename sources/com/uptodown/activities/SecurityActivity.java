package com.uptodown.activities;

import A4.V1;
import E4.j;
import L5.C1224h;
import L5.InterfaceC1227k;
import T4.C1386t;
import T4.j0;
import W4.InterfaceC1479b;
import X4.C1496f;
import X4.C1498h;
import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.mbridge.msdk.MBridgeConstans;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.SecurityActivity;
import com.uptodown.activities.preferences.SettingsPreferences;
import com.uptodown.activities.x;
import i6.AbstractC2825i;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.J0;
import i6.M;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.U;
import l5.AbstractC3337y;
import l5.C3323k;
import l5.C3335w;
import l6.InterfaceC3349K;
import l6.InterfaceC3359g;

/* loaded from: classes4.dex */
public final class SecurityActivity extends V1 {

    /* renamed from: s0, reason: collision with root package name */
    private boolean f28826s0;

    /* renamed from: t0, reason: collision with root package name */
    private D4.F f28827t0;

    /* renamed from: q0, reason: collision with root package name */
    private final InterfaceC1227k f28824q0 = L5.l.b(new a());

    /* renamed from: r0, reason: collision with root package name */
    private final InterfaceC1227k f28825r0 = new ViewModelLazy(U.b(x.class), new h(this), new g(this), new i(null, this));

    /* renamed from: u0, reason: collision with root package name */
    private k f28828u0 = new k();

    /* renamed from: v0, reason: collision with root package name */
    private final c f28829v0 = new c();

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j0 invoke() {
            return j0.c(SecurityActivity.this.getLayoutInflater());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28831a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ j0 f28833c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f28834a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j0 f28835b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(j0 j0Var, P5.d dVar) {
                super(2, dVar);
                this.f28835b = j0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f28835b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f28834a == 0) {
                    L5.t.b(obj);
                    this.f28835b.f10694c.f10172b.setVisibility(0);
                    return L5.I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(j0 j0Var, P5.d dVar) {
            super(2, dVar);
            this.f28833c = j0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(this.f28833c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f28831a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                J0 c8 = C2812b0.c();
                a aVar = new a(this.f28833c, null);
                this.f28831a = 1;
                if (AbstractC2825i.g(c8, aVar, this) == e8) {
                    return e8;
                }
            }
            SecurityActivity.this.k4();
            return L5.I.f6474a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC1479b {
        c() {
        }

        @Override // W4.InterfaceC1479b
        public void a(int i8) {
            if (UptodownApp.f27990B.a0() && !SecurityActivity.this.f28826s0) {
                D4.F f8 = SecurityActivity.this.f28827t0;
                AbstractC3159y.f(f8);
                if (f8.b().get(i8) instanceof C1496f) {
                    D4.F f9 = SecurityActivity.this.f28827t0;
                    AbstractC3159y.f(f9);
                    Object obj = f9.b().get(i8);
                    AbstractC3159y.g(obj, "null cannot be cast to non-null type com.uptodown.models.App");
                    SecurityActivity.this.K4((C1496f) obj);
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28837a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ SecurityActivity f28839a;

            a(SecurityActivity securityActivity) {
                this.f28839a = securityActivity;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3337y abstractC3337y, P5.d dVar) {
                if (abstractC3337y instanceof AbstractC3337y.a) {
                    this.f28839a.P4().f10694c.f10172b.setVisibility(0);
                } else if (abstractC3337y instanceof AbstractC3337y.c) {
                    AbstractC3337y.c cVar = (AbstractC3337y.c) abstractC3337y;
                    if (((x.a) cVar.a()).a().isEmpty()) {
                        this.f28839a.P4().f10695d.setVisibility(0);
                        this.f28839a.P4().f10696e.setVisibility(8);
                        this.f28839a.P4().f10699h.setText(this.f28839a.getString(R.string.uptodown_last_analysis, String.valueOf(new C3323k().m(SettingsPreferences.f29309b.r(this.f28839a)))));
                    } else {
                        this.f28839a.P4().f10696e.setVisibility(0);
                        this.f28839a.P4().f10695d.setVisibility(8);
                        this.f28839a.Y4(((x.a) cVar.a()).a());
                    }
                    this.f28839a.P4().f10694c.f10172b.setVisibility(8);
                } else {
                    boolean z8 = abstractC3337y instanceof AbstractC3337y.b;
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
            int i8 = this.f28837a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K b8 = SecurityActivity.this.Q4().b();
                a aVar = new a(SecurityActivity.this);
                this.f28837a = 1;
                if (b8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements W4.r {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1496f f28841b;

        e(C1496f c1496f) {
            this.f28841b = c1496f;
        }

        @Override // W4.r
        public void c(int i8) {
            SecurityActivity securityActivity = SecurityActivity.this;
            String string = securityActivity.getString(R.string.rollback_not_available, this.f28841b.I());
            AbstractC3159y.h(string, "getString(R.string.rollb…ilable, appSelected.name)");
            securityActivity.e2(string);
        }

        @Override // W4.r
        public void f(C1498h appInfo) {
            AbstractC3159y.i(appInfo, "appInfo");
            if (appInfo.c()) {
                Intent intent = new Intent(SecurityActivity.this.getApplicationContext(), (Class<?>) OldVersionsActivity.class);
                intent.putExtra(MBridgeConstans.DYNAMIC_VIEW_WX_APP, this.f28841b);
                intent.putExtra("appInfo", appInfo);
                SecurityActivity securityActivity = SecurityActivity.this;
                securityActivity.startActivity(intent, UptodownApp.f27990B.a(securityActivity));
                return;
            }
            SecurityActivity securityActivity2 = SecurityActivity.this;
            String string = securityActivity2.getString(R.string.rollback_not_available, appInfo.s0());
            AbstractC3159y.h(string, "getString(R.string.rollb…_available, appInfo.name)");
            securityActivity2.e2(string);
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28842a;

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
            Q5.b.e();
            if (this.f28842a == 0) {
                L5.t.b(obj);
                SecurityActivity.this.P4().f10694c.f10172b.setVisibility(8);
                SecurityActivity.this.P4().f10699h.setText(SecurityActivity.this.getString(R.string.uptodown_last_analysis, String.valueOf(new C3323k().m(SettingsPreferences.f29309b.r(SecurityActivity.this)))));
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28844a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f28844a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f28844a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28845a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentActivity componentActivity) {
            super(0);
            this.f28845a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f28845a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f28846a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28847b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f28846a = function0;
            this.f28847b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f28846a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f28847b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28848a;

        j(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new j(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((j) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f28848a == 0) {
                L5.t.b(obj);
                SecurityActivity.this.X4();
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes4.dex */
    public static final class k implements W4.G {
        k() {
        }

        @Override // W4.G
        public void a() {
        }

        @Override // W4.G
        public void b() {
            SecurityActivity.this.k4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K4(final C1496f c1496f) {
        if (!isFinishing() && c1496f != null) {
            C1386t c8 = C1386t.c(getLayoutInflater());
            AbstractC3159y.h(c8, "inflate(layoutInflater)");
            O2(new AlertDialog.Builder(this).setView(c8.getRoot()).create());
            TextView textView = c8.f10880c;
            j.a aVar = E4.j.f2272g;
            textView.setTypeface(aVar.t());
            c8.f10880c.setText(c1496f.I());
            if (c1496f.Q() != null && c1496f.z() != null && c1496f.c() > 0) {
                c8.f10879b.setTypeface(aVar.u());
                c8.f10879b.setOnClickListener(new View.OnClickListener() { // from class: A4.o3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SecurityActivity.L4(SecurityActivity.this, c1496f, view);
                    }
                });
                c8.f10883f.setTypeface(aVar.u());
                c8.f10883f.setOnClickListener(new View.OnClickListener() { // from class: A4.p3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SecurityActivity.M4(SecurityActivity.this, c1496f, view);
                    }
                });
                c8.f10881d.setTypeface(aVar.u());
                c8.f10881d.setOnClickListener(new View.OnClickListener() { // from class: A4.q3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SecurityActivity.N4(SecurityActivity.this, c1496f, view);
                    }
                });
            } else {
                c8.f10879b.setVisibility(8);
                c8.f10883f.setVisibility(8);
                c8.f10881d.setVisibility(8);
            }
            if (!g6.n.s(getPackageName(), c1496f.Q(), true)) {
                c8.f10882e.setTypeface(aVar.u());
                c8.f10882e.setOnClickListener(new View.OnClickListener() { // from class: A4.r3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SecurityActivity.O4(C1496f.this, this, view);
                    }
                });
            } else {
                c8.f10882e.setVisibility(8);
            }
            if (!isFinishing()) {
                AlertDialog s22 = s2();
                AbstractC3159y.f(s22);
                Window window = s22.getWindow();
                if (window != null) {
                    window.setBackgroundDrawable(new ColorDrawable(0));
                }
                AlertDialog s23 = s2();
                AbstractC3159y.f(s23);
                s23.show();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L4(SecurityActivity this$0, C1496f c1496f, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.G2(c1496f.c());
        AlertDialog s22 = this$0.s2();
        AbstractC3159y.f(s22);
        s22.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M4(SecurityActivity this$0, C1496f c1496f, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.J2(c1496f.X());
        AlertDialog s22 = this$0.s2();
        AbstractC3159y.f(s22);
        s22.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N4(SecurityActivity this$0, C1496f c1496f, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.W4(c1496f);
        AlertDialog s22 = this$0.s2();
        AbstractC3159y.f(s22);
        s22.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O4(C1496f c1496f, SecurityActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        if (c1496f.Q() != null) {
            E4.i iVar = new E4.i(this$0);
            String Q8 = c1496f.Q();
            AbstractC3159y.f(Q8);
            iVar.h(Q8);
        }
        AlertDialog s22 = this$0.s2();
        AbstractC3159y.f(s22);
        s22.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j0 P4() {
        return (j0) this.f28824q0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final x Q4() {
        return (x) this.f28825r0.getValue();
    }

    private final void R4() {
        setContentView(P4().getRoot());
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
        if (drawable != null) {
            P4().f10697f.setNavigationIcon(drawable);
            P4().f10697f.setNavigationContentDescription(getString(R.string.back));
        }
        final j0 P42 = P4();
        P42.f10697f.setNavigationOnClickListener(new View.OnClickListener() { // from class: A4.l3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SecurityActivity.S4(SecurityActivity.this, view);
            }
        });
        TextView textView = P42.f10701j;
        j.a aVar = E4.j.f2272g;
        textView.setTypeface(aVar.t());
        P42.f10696e.setLayoutManager(new LinearLayoutManager(this, 1, false));
        P42.f10696e.setItemAnimator(new DefaultItemAnimator());
        SimpleItemAnimator simpleItemAnimator = (SimpleItemAnimator) P42.f10696e.getItemAnimator();
        AbstractC3159y.f(simpleItemAnimator);
        simpleItemAnimator.setSupportsChangeAnimations(false);
        P42.f10696e.addItemDecoration(new n5.m((int) getResources().getDimension(R.dimen.margin_m), 0));
        P42.f10694c.f10172b.setOnClickListener(new View.OnClickListener() { // from class: A4.m3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SecurityActivity.T4(view);
            }
        });
        P42.f10700i.setTypeface(aVar.t());
        P42.f10699h.setTypeface(aVar.u());
        P42.f10698g.setTypeface(aVar.t());
        P42.f10698g.setOnClickListener(new View.OnClickListener() { // from class: A4.n3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SecurityActivity.U4(SecurityActivity.this, P42, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S4(SecurityActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T4(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U4(SecurityActivity this$0, j0 this_with, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(this_with, "$this_with");
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this$0), C2812b0.b(), null, new b(this_with, null), 2, null);
    }

    private final void V4() {
        Q4().a(this);
    }

    private final void W4(C1496f c1496f) {
        new S4.i(this, c1496f.c(), new e(c1496f), LifecycleOwnerKt.getLifecycleScope(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y4(ArrayList arrayList) {
        D4.F f8 = this.f28827t0;
        if (f8 == null) {
            c cVar = this.f28829v0;
            k kVar = this.f28828u0;
            AbstractC3159y.f(kVar);
            this.f28827t0 = new D4.F(arrayList, this, cVar, kVar);
            P4().f10696e.setAdapter(this.f28827t0);
            return;
        }
        AbstractC3159y.f(f8);
        f8.c(arrayList);
    }

    public final void X4() {
        if (P4().f10694c.f10172b.getVisibility() == 8) {
            k4();
            V4();
        }
    }

    public final void Z4() {
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new j(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2489a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        R4();
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new d(null), 2, null);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i8, KeyEvent event) {
        AbstractC3159y.i(event, "event");
        if (i8 == 82) {
            P4().f10697f.showOverflowMenu();
            return true;
        }
        return super.onKeyDown(i8, event);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2489a, F4.a1, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        k4();
        C3335w.f34532a.g(this);
    }

    @Override // A4.V1
    protected void p4() {
        V4();
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new f(null), 2, null);
    }
}
