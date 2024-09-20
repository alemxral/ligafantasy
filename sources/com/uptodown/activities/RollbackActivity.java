package com.uptodown.activities;

import A4.V1;
import E4.j;
import L5.C1224h;
import L5.InterfaceC1227k;
import T4.C1372g0;
import X4.C1496f;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
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
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.RollbackActivity;
import com.uptodown.activities.preferences.SettingsPreferences;
import com.uptodown.activities.u;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.M;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.U;
import l5.AbstractC3337y;
import l6.InterfaceC3349K;
import l6.InterfaceC3359g;

/* loaded from: classes4.dex */
public final class RollbackActivity extends V1 implements W4.B {

    /* renamed from: q0, reason: collision with root package name */
    private final InterfaceC1227k f28781q0 = L5.l.b(new b());

    /* renamed from: r0, reason: collision with root package name */
    private final InterfaceC1227k f28782r0 = new ViewModelLazy(U.b(u.class), new e(this), new d(this), new f(null, this));

    /* renamed from: s0, reason: collision with root package name */
    private D4.C f28783s0;

    /* renamed from: t0, reason: collision with root package name */
    private final ActivityResultLauncher f28784t0;

    /* loaded from: classes4.dex */
    public final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RollbackActivity.this.N4(false);
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3160z implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1372g0 invoke() {
            return C1372g0.c(RollbackActivity.this.getLayoutInflater());
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28787a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ RollbackActivity f28789a;

            a(RollbackActivity rollbackActivity) {
                this.f28789a = rollbackActivity;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3337y abstractC3337y, P5.d dVar) {
                if (abstractC3337y instanceof AbstractC3337y.a) {
                    this.f28789a.H4().f10590b.f10172b.setVisibility(0);
                } else if (abstractC3337y instanceof AbstractC3337y.c) {
                    this.f28789a.F4(((u.a) ((AbstractC3337y.c) abstractC3337y).a()).a());
                    this.f28789a.H4().f10595g.setVisibility(0);
                    this.f28789a.H4().f10590b.f10172b.setVisibility(8);
                } else if (abstractC3337y instanceof AbstractC3337y.b) {
                    this.f28789a.H4().f10590b.f10172b.setVisibility(8);
                    this.f28789a.H4().f10594f.setVisibility(0);
                    this.f28789a.H4().f10594f.setText(this.f28789a.getString(R.string.no_results));
                }
                return L5.I.f6474a;
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
            return ((c) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f28787a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K d8 = RollbackActivity.this.I4().d();
                a aVar = new a(RollbackActivity.this);
                this.f28787a = 1;
                if (d8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28790a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f28790a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f28790a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28791a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f28791a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f28791a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f28792a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28793b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f28792a = function0;
            this.f28793b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f28792a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f28793b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public RollbackActivity() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: A4.a3
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                RollbackActivity.G4(RollbackActivity.this, (ActivityResult) obj);
            }
        });
        AbstractC3159y.h(registerForActivityResult, "registerForActivityResul…rollback)\n        }\n    }");
        this.f28784t0 = registerForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F4(ArrayList arrayList) {
        D4.C c8 = this.f28783s0;
        if (c8 == null) {
            this.f28783s0 = new D4.C(arrayList, this, this);
            H4().f10591c.setAdapter(this.f28783s0);
        } else {
            AbstractC3159y.f(c8);
            c8.d(arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G4(RollbackActivity this$0, ActivityResult activityResult) {
        AbstractC3159y.i(this$0, "this$0");
        if (activityResult.getResultCode() == -1) {
            this$0.P2();
            this$0.H4().f10593e.setVisibility(8);
            this$0.H4().f10594f.setText(this$0.getString(R.string.msg_checking_device_rollback));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1372g0 H4() {
        return (C1372g0) this.f28781q0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final u I4() {
        return (u) this.f28782r0.getValue();
    }

    private final void J4() {
        setContentView(H4().getRoot());
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
        if (drawable != null) {
            H4().f10592d.setNavigationIcon(drawable);
            H4().f10592d.setNavigationContentDescription(getString(R.string.back));
        }
        H4().f10592d.setNavigationOnClickListener(new View.OnClickListener() { // from class: A4.b3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RollbackActivity.K4(RollbackActivity.this, view);
            }
        });
        TextView textView = H4().f10596h;
        j.a aVar = E4.j.f2272g;
        textView.setTypeface(aVar.t());
        H4().f10591c.setLayoutManager(new LinearLayoutManager(this, 1, false));
        H4().f10591c.setItemAnimator(new DefaultItemAnimator());
        int dimension = (int) getResources().getDimension(R.dimen.margin_m);
        H4().f10591c.addItemDecoration(new n5.m(dimension, dimension));
        H4().f10594f.setTypeface(aVar.u());
        if (!SettingsPreferences.f29309b.k0(this)) {
            H4().f10594f.setText(getString(R.string.msg_permissions_rollback));
        }
        H4().f10595g.setTypeface(aVar.u());
        H4().f10593e.setTypeface(aVar.u());
        H4().f10593e.setOnClickListener(new View.OnClickListener() { // from class: A4.c3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RollbackActivity.L4(RollbackActivity.this, view);
            }
        });
        H4().f10590b.f10172b.setOnClickListener(new View.OnClickListener() { // from class: A4.d3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RollbackActivity.M4(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K4(RollbackActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L4(RollbackActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.O4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M4(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N4(boolean z8) {
        I4().c(this, z8);
    }

    private final void O4() {
        this.f28784t0.launch(new Intent(getApplicationContext(), (Class<?>) GdprPrivacySettings.class), UptodownApp.f27990B.b(this));
    }

    @Override // W4.B
    public void a(int i8) {
        D4.C c8;
        if (UptodownApp.f27990B.a0() && (c8 = this.f28783s0) != null) {
            AbstractC3159y.f(c8);
            if (i8 < c8.a().size()) {
                D4.C c9 = this.f28783s0;
                AbstractC3159y.f(c9);
                if (((C1496f) c9.a().get(i8)).c() != 0) {
                    D4.C c10 = this.f28783s0;
                    AbstractC3159y.f(c10);
                    Object obj = c10.a().get(i8);
                    AbstractC3159y.h(obj, "adapter!!.rollbackApps[position]");
                    n4((C1496f) obj);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2489a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        J4();
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new c(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2489a, F4.a1, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        N4(true);
    }

    @Override // A4.V1
    protected void p4() {
    }
}
