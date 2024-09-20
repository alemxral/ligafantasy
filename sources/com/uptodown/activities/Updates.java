package com.uptodown.activities;

import A4.V1;
import D4.M;
import E4.j;
import L5.C1224h;
import L5.InterfaceC1227k;
import M5.AbstractC1246t;
import T4.C1385s;
import T4.q0;
import W4.InterfaceC1479b;
import X4.C1496f;
import X4.C1498h;
import X4.O;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.work.WorkManager;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.D;
import com.uptodown.activities.Updates;
import com.uptodown.activities.preferences.SettingsPreferences;
import com.uptodown.workers.InstallUpdatesWorker;
import i6.AbstractC2825i;
import i6.AbstractC2829k;
import i6.C2812b0;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.U;
import kotlin.jvm.internal.Z;
import l5.AbstractC3337y;
import l5.C3326n;
import l5.C3329q;
import l5.C3335w;
import l6.InterfaceC3349K;
import l6.InterfaceC3359g;

/* loaded from: classes4.dex */
public final class Updates extends V1 {

    /* renamed from: D0, reason: collision with root package name */
    private final ActivityResultLauncher f28895D0;

    /* renamed from: s0, reason: collision with root package name */
    private ArrayList f28898s0;

    /* renamed from: t0, reason: collision with root package name */
    private M f28899t0;

    /* renamed from: u0, reason: collision with root package name */
    private boolean f28900u0;

    /* renamed from: v0, reason: collision with root package name */
    private ImageView f28901v0;

    /* renamed from: q0, reason: collision with root package name */
    private final InterfaceC1227k f28896q0 = L5.l.b(new b());

    /* renamed from: r0, reason: collision with root package name */
    private final InterfaceC1227k f28897r0 = new ViewModelLazy(U.b(D.class), new i(this), new h(this), new j(null, this));

    /* renamed from: w0, reason: collision with root package name */
    private m f28902w0 = new m();

    /* renamed from: x0, reason: collision with root package name */
    private a f28903x0 = new a();

    /* renamed from: y0, reason: collision with root package name */
    private d f28904y0 = new d();

    /* renamed from: z0, reason: collision with root package name */
    private p f28905z0 = new p();

    /* renamed from: A0, reason: collision with root package name */
    private q f28892A0 = new q();

    /* renamed from: B0, reason: collision with root package name */
    private r f28893B0 = new r();

    /* renamed from: C0, reason: collision with root package name */
    private e f28894C0 = new e();

    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC1479b {
        a() {
        }

        @Override // W4.InterfaceC1479b
        public void a(int i8) {
            Object obj;
            ArrayList b8;
            if (UptodownApp.f27990B.a0()) {
                M m8 = Updates.this.f28899t0;
                if (m8 != null && (b8 = m8.b()) != null) {
                    obj = b8.get(i8);
                } else {
                    obj = null;
                }
                if (obj instanceof C1496f) {
                    M m9 = Updates.this.f28899t0;
                    AbstractC3159y.f(m9);
                    Object obj2 = m9.b().get(i8);
                    AbstractC3159y.g(obj2, "null cannot be cast to non-null type com.uptodown.models.App");
                    Updates updates = Updates.this;
                    updates.L3((C1496f) obj2, i8, updates.f28902w0);
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3160z implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final q0 invoke() {
            return q0.c(Updates.this.getLayoutInflater());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28908a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f28910c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f28911d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, String str2, P5.d dVar) {
            super(2, dVar);
            this.f28910c = str;
            this.f28911d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(this.f28910c, this.f28911d, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f28908a == 0) {
                L5.t.b(obj);
                int W42 = Updates.this.W4(this.f28910c);
                if (AbstractC3159y.d(this.f28911d, "app_updated")) {
                    if (W42 >= 0) {
                        ArrayList arrayList = Updates.this.f28898s0;
                        if (arrayList != null) {
                            M m8 = Updates.this.f28899t0;
                            AbstractC3159y.f(m8);
                            kotlin.coroutines.jvm.internal.b.a(Z.a(arrayList).remove(m8.b().get(W42)));
                        }
                        M m9 = Updates.this.f28899t0;
                        AbstractC3159y.f(m9);
                        m9.c(W42);
                    }
                } else if (AbstractC3159y.d(this.f28911d, "app_installed")) {
                    Updates.this.f5(false);
                } else if (AbstractC3159y.d(this.f28911d, "app_uninstalled") && W42 >= 0) {
                    ArrayList arrayList2 = Updates.this.f28898s0;
                    if (arrayList2 != null) {
                        M m10 = Updates.this.f28899t0;
                        AbstractC3159y.f(m10);
                        kotlin.coroutines.jvm.internal.b.a(Z.a(arrayList2).remove(m10.b().get(W42)));
                    }
                    M m11 = Updates.this.f28899t0;
                    AbstractC3159y.f(m11);
                    m11.b().remove(W42);
                    M m12 = Updates.this.f28899t0;
                    AbstractC3159y.f(m12);
                    m12.notifyItemRemoved(W42);
                }
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements W4.r {
        d() {
        }

        @Override // W4.r
        public void c(int i8) {
        }

        @Override // W4.r
        public void f(C1498h appInfo) {
            AbstractC3159y.i(appInfo, "appInfo");
            String t02 = appInfo.t0();
            if (t02 != null && !g6.n.u(t02)) {
                HashMap f42 = Updates.this.f4();
                AbstractC3159y.f(f42);
                String y02 = appInfo.y0();
                AbstractC3159y.f(y02);
                String t03 = appInfo.t0();
                AbstractC3159y.f(t03);
                f42.put(y02, t03);
                M m8 = Updates.this.f28899t0;
                AbstractC3159y.f(m8);
                m8.d(appInfo);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements W4.t {
        e() {
        }

        @Override // W4.t
        public void a() {
            if (UptodownApp.f27990B.a0()) {
                Updates updates = Updates.this;
                String string = updates.getString(R.string.disabled_apps_explanation);
                AbstractC3159y.h(string, "getString(R.string.disabled_apps_explanation)");
                updates.e2(string);
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28914a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Updates f28916a;

            a(Updates updates) {
                this.f28916a = updates;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3337y abstractC3337y, P5.d dVar) {
                if (abstractC3337y instanceof AbstractC3337y.a) {
                    this.f28916a.V4().f10801b.f10172b.setVisibility(0);
                } else if (abstractC3337y instanceof AbstractC3337y.c) {
                    AbstractC3337y.c cVar = (AbstractC3337y.c) abstractC3337y;
                    this.f28916a.f28898s0 = ((D.b) cVar.a()).f();
                    this.f28916a.g5(((D.b) cVar.a()).f(), ((D.b) cVar.a()).e(), ((D.b) cVar.a()).c(), ((D.b) cVar.a()).a(), ((D.b) cVar.a()).d());
                    this.f28916a.h5(((D.b) cVar.a()).b().b(), ((D.b) cVar.a()).b().a());
                    this.f28916a.V4().f10801b.f10172b.setVisibility(8);
                } else {
                    boolean z8 = abstractC3337y instanceof AbstractC3337y.b;
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
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f28914a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K f8 = Updates.this.X4().f();
                a aVar = new a(Updates.this);
                this.f28914a = 1;
                if (f8.collect(aVar, this) == e8) {
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
        int f28917a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f28919c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f28920a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Updates f28921b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ArrayList f28922c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Updates updates, ArrayList arrayList, P5.d dVar) {
                super(2, dVar);
                this.f28921b = updates;
                this.f28922c = arrayList;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void o(Updates updates, View view) {
                UptodownApp.a aVar = UptodownApp.f27990B;
                if (aVar.a0()) {
                    updates.startActivity(new Intent(updates.getApplicationContext(), (Class<?>) SettingsPreferences.class), aVar.a(updates));
                    AlertDialog s22 = updates.s2();
                    if (s22 != null) {
                        s22.dismiss();
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void p(Updates updates, View view) {
                AlertDialog s22 = updates.s2();
                if (s22 != null) {
                    s22.dismiss();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void r(Updates updates, View view) {
                AlertDialog s22 = updates.s2();
                if (s22 != null) {
                    s22.dismiss();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void t(ArrayList arrayList, Updates updates, View view) {
                String str;
                if (arrayList != null) {
                    if (arrayList.size() == 1) {
                        str = ((C1496f) arrayList.get(0)).Q();
                    } else {
                        str = null;
                    }
                    if (!UptodownApp.f27990B.O(updates)) {
                        updates.v4(str, true);
                        if (arrayList.size() > 1 && updates.f28899t0 != null) {
                            M m8 = updates.f28899t0;
                            AbstractC3159y.f(m8);
                            m8.i();
                        }
                    }
                }
                AlertDialog s22 = updates.s2();
                if (s22 != null) {
                    s22.dismiss();
                }
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f28921b, this.f28922c, dVar);
            }

            @Override // X5.n
            public final Object invoke(i6.M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f28920a == 0) {
                    L5.t.b(obj);
                    AlertDialog s22 = this.f28921b.s2();
                    if (s22 != null) {
                        s22.dismiss();
                    }
                    AlertDialog.Builder builder = new AlertDialog.Builder(this.f28921b);
                    C1385s c8 = C1385s.c(this.f28921b.getLayoutInflater());
                    AbstractC3159y.h(c8, "inflate(layoutInflater)");
                    final Updates updates = this.f28921b;
                    final ArrayList arrayList = this.f28922c;
                    TextView textView = c8.f10871g;
                    j.a aVar = E4.j.f2272g;
                    textView.setTypeface(aVar.t());
                    c8.f10868d.setTypeface(aVar.u());
                    c8.f10870f.setTypeface(aVar.t());
                    c8.f10867c.setTypeface(aVar.t());
                    c8.f10869e.setTypeface(aVar.t());
                    c8.f10870f.setOnClickListener(new View.OnClickListener() { // from class: com.uptodown.activities.z
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Updates.g.a.o(Updates.this, view);
                        }
                    });
                    c8.f10867c.setOnClickListener(new View.OnClickListener() { // from class: com.uptodown.activities.A
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Updates.g.a.p(Updates.this, view);
                        }
                    });
                    c8.f10866b.setOnClickListener(new View.OnClickListener() { // from class: com.uptodown.activities.B
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Updates.g.a.r(Updates.this, view);
                        }
                    });
                    c8.f10869e.setOnClickListener(new View.OnClickListener() { // from class: com.uptodown.activities.C
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Updates.g.a.t(arrayList, updates, view);
                        }
                    });
                    builder.setView(c8.getRoot());
                    this.f28921b.O2(builder.create());
                    if (!this.f28921b.isFinishing() && this.f28921b.s2() != null) {
                        this.f28921b.U2();
                    }
                    return L5.I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(ArrayList arrayList, P5.d dVar) {
            super(2, dVar);
            this.f28919c = arrayList;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new g(this.f28919c, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f28917a == 0) {
                L5.t.b(obj);
                AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(Updates.this), C2812b0.c(), null, new a(Updates.this, this.f28919c, null), 2, null);
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28923a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentActivity componentActivity) {
            super(0);
            this.f28923a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f28923a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28924a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentActivity componentActivity) {
            super(0);
            this.f28924a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f28924a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f28925a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28926b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f28925a = function0;
            this.f28926b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f28925a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f28926b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28927a;

        k(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new k(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((k) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Animation animation;
            MenuItem findItem;
            View actionView;
            Q5.b.e();
            if (this.f28927a == 0) {
                L5.t.b(obj);
                Menu menu = Updates.this.V4().f10803d.getMenu();
                if (menu != null && (findItem = menu.findItem(R.id.action_reload)) != null && (actionView = findItem.getActionView()) != null) {
                    animation = actionView.getAnimation();
                } else {
                    animation = null;
                }
                if (animation != null) {
                    animation.setRepeatCount(0);
                }
                Updates.this.t4(false);
                Updates.this.f5(false);
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28929a;

        l(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new l(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((l) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Animation animation;
            MenuItem findItem;
            View actionView;
            Q5.b.e();
            if (this.f28929a == 0) {
                L5.t.b(obj);
                Menu menu = Updates.this.V4().f10803d.getMenu();
                if (menu != null && (findItem = menu.findItem(R.id.action_reload)) != null && (actionView = findItem.getActionView()) != null) {
                    animation = actionView.getAnimation();
                } else {
                    animation = null;
                }
                if (animation != null) {
                    animation.setRepeatCount(-1);
                }
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes4.dex */
    public static final class m implements W4.E {
        m() {
        }

        @Override // W4.E
        public void a(int i8) {
            Object obj;
            ArrayList b8;
            if (UptodownApp.f27990B.a0()) {
                M m8 = Updates.this.f28899t0;
                if (m8 != null && (b8 = m8.b()) != null) {
                    obj = b8.get(i8);
                } else {
                    obj = null;
                }
                if (obj instanceof C1496f) {
                    M m9 = Updates.this.f28899t0;
                    AbstractC3159y.f(m9);
                    Object obj2 = m9.b().get(i8);
                    AbstractC3159y.g(obj2, "null cannot be cast to non-null type com.uptodown.models.App");
                    Updates.this.L3((C1496f) obj2, i8, this);
                }
            }
        }

        @Override // W4.E
        public void b(int i8) {
            if (Updates.this.d5(i8)) {
                M m8 = Updates.this.f28899t0;
                AbstractC3159y.f(m8);
                Object obj = m8.b().get(i8);
                AbstractC3159y.g(obj, "null cannot be cast to non-null type com.uptodown.models.App");
                ((C1496f) obj).H0(true);
                M m9 = Updates.this.f28899t0;
                AbstractC3159y.f(m9);
                m9.notifyItemChanged(i8);
            }
        }

        @Override // W4.E
        public void c(int i8) {
            if (UptodownApp.f27990B.a0() && Updates.this.d5(i8)) {
                M m8 = Updates.this.f28899t0;
                AbstractC3159y.f(m8);
                Object obj = m8.b().get(i8);
                AbstractC3159y.g(obj, "null cannot be cast to non-null type com.uptodown.models.App");
                Updates.this.m4((C1496f) obj);
                M m9 = Updates.this.f28899t0;
                if (m9 != null) {
                    m9.notifyItemChanged(i8);
                }
            }
        }

        @Override // W4.E
        public void d(int i8) {
            if (Updates.this.d5(i8)) {
                M m8 = Updates.this.f28899t0;
                AbstractC3159y.f(m8);
                m8.notifyItemChanged(i8);
            }
            Updates.this.f5(false);
        }

        @Override // W4.E
        public void e(int i8) {
            if (UptodownApp.f27990B.a0() && Updates.this.d5(i8)) {
                M m8 = Updates.this.f28899t0;
                AbstractC3159y.f(m8);
                Object obj = m8.b().get(i8);
                AbstractC3159y.g(obj, "null cannot be cast to non-null type com.uptodown.models.App");
                Updates.this.l4((C1496f) obj);
                M m9 = Updates.this.f28899t0;
                if (m9 != null) {
                    m9.notifyItemChanged(i8);
                }
            }
        }

        @Override // W4.E
        public void f(int i8) {
            if (Updates.this.d5(i8)) {
                M m8 = Updates.this.f28899t0;
                AbstractC3159y.f(m8);
                Object obj = m8.b().get(i8);
                AbstractC3159y.g(obj, "null cannot be cast to non-null type com.uptodown.models.App");
                ((C1496f) obj).H0(false);
                M m9 = Updates.this.f28899t0;
                AbstractC3159y.f(m9);
                m9.notifyItemChanged(i8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class n extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28932a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f28934c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f28935d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(int i8, String str, P5.d dVar) {
            super(2, dVar);
            this.f28934c = i8;
            this.f28935d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new n(this.f28934c, this.f28935d, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((n) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0084  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
            /*
                r2 = this;
                Q5.b.e()
                int r0 = r2.f28932a
                if (r0 != 0) goto L93
                L5.t.b(r3)
                com.uptodown.activities.Updates r3 = com.uptodown.activities.Updates.this
                D4.M r3 = com.uptodown.activities.Updates.D4(r3)
                if (r3 == 0) goto L90
                int r3 = r2.f28934c
                r0 = 107(0x6b, float:1.5E-43)
                if (r3 == r0) goto L6d
                switch(r3) {
                    case 101: goto L6d;
                    case 102: goto L53;
                    case 103: goto L2e;
                    case 104: goto L1c;
                    default: goto L1b;
                }
            L1b:
                goto L79
            L1c:
                com.uptodown.activities.Updates r3 = com.uptodown.activities.Updates.this
                android.content.Context r3 = r3.getApplicationContext()
                r0 = 2131952353(0x7f1302e1, float:1.9541146E38)
                r1 = 1
                android.widget.Toast r3 = android.widget.Toast.makeText(r3, r0, r1)
                r3.show()
                goto L79
            L2e:
                com.uptodown.UptodownApp$a r3 = com.uptodown.UptodownApp.f27990B
                java.util.ArrayList r0 = r3.F()
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L79
                java.util.ArrayList r3 = r3.G()
                if (r3 == 0) goto L46
                boolean r3 = r3.isEmpty()
                if (r3 == 0) goto L79
            L46:
                com.uptodown.activities.Updates r3 = com.uptodown.activities.Updates.this
                com.uptodown.activities.D r3 = com.uptodown.activities.Updates.J4(r3)
                com.uptodown.activities.Updates r0 = com.uptodown.activities.Updates.this
                r1 = 0
                r3.e(r0, r1)
                goto L79
            L53:
                com.uptodown.activities.Updates r3 = com.uptodown.activities.Updates.this
                boolean r3 = r3.y2()
                if (r3 != 0) goto L79
                com.uptodown.activities.Updates r3 = com.uptodown.activities.Updates.this
                r0 = 2131951940(0x7f130144, float:1.9540309E38)
                java.lang.String r0 = r3.getString(r0)
                java.lang.String r1 = "getString(R.string.download_error_message)"
                kotlin.jvm.internal.AbstractC3159y.h(r0, r1)
                r3.e2(r0)
                goto L79
            L6d:
                com.uptodown.activities.Updates r3 = com.uptodown.activities.Updates.this
                D4.M r3 = com.uptodown.activities.Updates.D4(r3)
                kotlin.jvm.internal.AbstractC3159y.f(r3)
                r3.i()
            L79:
                com.uptodown.activities.Updates r3 = com.uptodown.activities.Updates.this
                java.lang.String r0 = r2.f28935d
                int r3 = com.uptodown.activities.Updates.E4(r3, r0)
                r0 = -1
                if (r3 <= r0) goto L90
                com.uptodown.activities.Updates r0 = com.uptodown.activities.Updates.this
                D4.M r0 = com.uptodown.activities.Updates.D4(r0)
                kotlin.jvm.internal.AbstractC3159y.f(r0)
                r0.notifyItemChanged(r3)
            L90:
                L5.I r3 = L5.I.f6474a
                return r3
            L93:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r3.<init>(r0)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.Updates.n.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class o extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28936a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f28938c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f28939d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(String str, int i8, P5.d dVar) {
            super(2, dVar);
            this.f28938c = str;
            this.f28939d = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new o(this.f28938c, this.f28939d, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((o) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean z8;
            String string;
            Q5.b.e();
            if (this.f28936a == 0) {
                L5.t.b(obj);
                if (Updates.this.f28899t0 != null) {
                    int T42 = Updates.this.T4(this.f28938c);
                    if (T42 > -1) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    int i8 = this.f28939d;
                    if (i8 == 306) {
                        if (z8) {
                            M m8 = Updates.this.f28899t0;
                            AbstractC3159y.f(m8);
                            m8.b().remove(T42);
                            M m9 = Updates.this.f28899t0;
                            AbstractC3159y.f(m9);
                            m9.notifyItemRemoved(T42);
                        }
                    } else if (i8 == 301) {
                        if (z8) {
                            M m10 = Updates.this.f28899t0;
                            AbstractC3159y.f(m10);
                            m10.notifyItemChanged(T42);
                        }
                    } else if (i8 != 305) {
                        if (i8 == 302) {
                            if (z8) {
                                M m11 = Updates.this.f28899t0;
                                AbstractC3159y.f(m11);
                                m11.notifyItemChanged(T42);
                            } else {
                                Updates.this.f5(false);
                            }
                        } else {
                            if (i8 != 303) {
                                if (i8 != 304) {
                                    if (i8 != 307) {
                                        string = "ERROR: (" + this.f28939d + ") " + Updates.this.getString(R.string.error_generico);
                                    } else {
                                        string = Updates.this.getString(R.string.error_generico);
                                        AbstractC3159y.h(string, "getString(R.string.error_generico)");
                                    }
                                } else {
                                    string = Updates.this.getString(R.string.msg_root_install_failed_invalid_versioncode);
                                    AbstractC3159y.h(string, "getString(R.string.msg_r…iled_invalid_versioncode)");
                                }
                            } else {
                                string = Updates.this.getString(R.string.msg_install_failed);
                                AbstractC3159y.h(string, "getString(R.string.msg_install_failed)");
                            }
                            Updates.this.e2(string);
                            if (z8) {
                                M m12 = Updates.this.f28899t0;
                                AbstractC3159y.f(m12);
                                m12.notifyItemChanged(T42);
                            } else {
                                M m13 = Updates.this.f28899t0;
                                AbstractC3159y.f(m13);
                                m13.notifyDataSetChanged();
                            }
                        }
                    }
                }
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes4.dex */
    public static final class p implements W4.F {
        p() {
        }

        @Override // W4.F
        public void a() {
            UptodownApp.a aVar = UptodownApp.f27990B;
            if (aVar.a0()) {
                if (!aVar.W("downloadApkWorker", Updates.this)) {
                    Updates.this.Q4();
                    return;
                }
                Updates updates = Updates.this;
                String string = updates.getString(R.string.error_download_in_progress_wait);
                AbstractC3159y.h(string, "getString(R.string.error…ownload_in_progress_wait)");
                updates.e2(string);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class q implements W4.G {
        q() {
        }

        @Override // W4.G
        public void a() {
            UptodownApp.a aVar = UptodownApp.f27990B;
            if (aVar.a0()) {
                Updates.this.startActivity(new Intent(Updates.this, (Class<?>) SecurityActivity.class), aVar.a(Updates.this));
            }
        }

        @Override // W4.G
        public void b() {
            if (UptodownApp.f27990B.a0()) {
                Updates.this.k4();
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class r implements W4.L {
        r() {
        }

        @Override // W4.L
        public void a() {
            if (UptodownApp.f27990B.a0()) {
                Updates.this.e5();
            }
        }
    }

    public Updates() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: A4.H3
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                Updates.S4(Updates.this, (ActivityResult) obj);
            }
        });
        AbstractC3159y.h(registerForActivityResult, "registerForActivityResul… = false)\n        }\n    }");
        this.f28895D0 = registerForActivityResult;
    }

    private final void P4() {
        WorkManager.getInstance(this).cancelAllWorkByTag("DownloadUpdatesWorker");
        UptodownApp.f27990B.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q4() {
        String str;
        UptodownApp.a aVar = UptodownApp.f27990B;
        if (!aVar.O(this)) {
            ArrayList U42 = U4(this.f28898s0);
            if (U42.size() > 0) {
                if (U42.size() == 1) {
                    str = ((C1496f) U42.get(0)).Q();
                } else {
                    str = null;
                }
                M m8 = this.f28899t0;
                if (m8 != null) {
                    m8.i();
                }
                aVar.J0(this.f28898s0);
                v4(str, false);
                M m9 = this.f28899t0;
                if (m9 != null) {
                    m9.notifyDataSetChanged();
                    return;
                }
                return;
            }
            if (this.f28900u0) {
                InstallUpdatesWorker.f30028b.b(this);
                return;
            }
            return;
        }
        M m10 = this.f28899t0;
        if (m10 != null) {
            m10.j();
        }
        P4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S4(Updates this$0, ActivityResult activityResult) {
        AbstractC3159y.i(this$0, "this$0");
        if (activityResult.getResultCode() == -1) {
            this$0.P2();
            this$0.f5(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int T4(String str) {
        if (str != null) {
            M m8 = this.f28899t0;
            AbstractC3159y.f(m8);
            ArrayList b8 = m8.b();
            Iterator it = b8.iterator();
            int i8 = 0;
            while (it.hasNext()) {
                int i9 = i8 + 1;
                if (it.next() instanceof C1496f) {
                    Object obj = b8.get(i8);
                    AbstractC3159y.g(obj, "null cannot be cast to non-null type com.uptodown.models.App");
                    if (g6.n.s(((C1496f) obj).Q(), str, true)) {
                        return i8;
                    }
                }
                i8 = i9;
            }
        }
        return -1;
    }

    private final ArrayList U4(ArrayList arrayList) {
        String str;
        ArrayList arrayList2 = new ArrayList();
        if (arrayList != null) {
            C3329q c3329q = new C3329q();
            Context applicationContext = getApplicationContext();
            AbstractC3159y.h(applicationContext, "applicationContext");
            ArrayList e8 = c3329q.e(applicationContext);
            C3326n.a aVar = C3326n.f34490t;
            Context applicationContext2 = getApplicationContext();
            AbstractC3159y.h(applicationContext2, "applicationContext");
            C3326n a8 = aVar.a(applicationContext2);
            a8.a();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C1496f c1496f = (C1496f) it.next();
                if (c1496f.i() == 0) {
                    N4.f fVar = new N4.f();
                    String Q8 = c1496f.Q();
                    AbstractC3159y.f(Q8);
                    if (!fVar.p(this, Q8)) {
                        String Q9 = c1496f.Q();
                        AbstractC3159y.f(Q9);
                        O u02 = a8.u0(Q9);
                        if (u02 != null) {
                            str = u02.j();
                        } else {
                            str = null;
                        }
                        if (str != null && u02.o() == 100) {
                            Iterator it2 = e8.iterator();
                            while (it2.hasNext()) {
                                if (g6.n.s(u02.j(), ((File) it2.next()).getName(), true)) {
                                    break;
                                }
                            }
                        }
                        arrayList2.add(c1496f);
                    }
                }
            }
            a8.g();
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final q0 V4() {
        return (q0) this.f28896q0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int W4(String str) {
        ArrayList arrayList;
        M m8 = this.f28899t0;
        ArrayList arrayList2 = null;
        if (m8 != null) {
            arrayList = m8.b();
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            M m9 = this.f28899t0;
            if (m9 != null) {
                arrayList2 = m9.b();
            }
            AbstractC3159y.f(arrayList2);
            Iterator it = arrayList2.iterator();
            int i8 = 0;
            while (it.hasNext()) {
                int i9 = i8 + 1;
                Object next = it.next();
                if (((next instanceof O) && g6.n.s(((O) next).n(), str, true)) || ((next instanceof C1496f) && g6.n.s(((C1496f) next).Q(), str, true))) {
                    return i8;
                }
                i8 = i9;
            }
            return -1;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final D X4() {
        return (D) this.f28897r0.getValue();
    }

    private final void Y4() {
        setContentView(V4().getRoot());
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
        if (drawable != null) {
            V4().f10803d.setNavigationIcon(drawable);
            V4().f10803d.setNavigationContentDescription(getString(R.string.back));
        }
        V4().f10803d.setNavigationOnClickListener(new View.OnClickListener() { // from class: A4.I3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Updates.Z4(Updates.this, view);
            }
        });
        V4().f10804e.setTypeface(E4.j.f2272g.t());
        V4().f10803d.inflateMenu(R.menu.toolbar_menu_updates);
        Drawable drawable2 = ContextCompat.getDrawable(this, R.drawable.vector_menu_dots_color_adaptable);
        if (drawable2 != null) {
            V4().f10803d.setOverflowIcon(drawable2);
        }
        SettingsPreferences.a aVar = SettingsPreferences.f29309b;
        boolean h02 = aVar.h0(this);
        V4().f10803d.getMenu().findItem(R.id.action_show_system_apps).setChecked(h02);
        V4().f10803d.getMenu().findItem(R.id.action_show_system_services).setChecked(aVar.i0(this));
        Toolbar toolbar = V4().f10803d;
        AbstractC3159y.h(toolbar, "binding.toolbarUpdates");
        d4(R.id.action_show_system_services, h02, toolbar);
        MenuItem findItem = V4().f10803d.getMenu().findItem(R.id.action_reload);
        V4().f10803d.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() { // from class: A4.J3
            @Override // androidx.appcompat.widget.Toolbar.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean a52;
                a52 = Updates.a5(Updates.this, menuItem);
                return a52;
            }
        });
        Object systemService = getSystemService("layout_inflater");
        AbstractC3159y.g(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View inflate = ((LayoutInflater) systemService).inflate(R.layout.reload_action_view, (ViewGroup) V4().f10803d, false);
        AbstractC3159y.g(inflate, "null cannot be cast to non-null type android.widget.ImageView");
        this.f28901v0 = (ImageView) inflate;
        final Animation loadAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);
        ImageView imageView = this.f28901v0;
        if (imageView != null) {
            imageView.startAnimation(loadAnimation);
        }
        ImageView imageView2 = this.f28901v0;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: A4.K3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Updates.b5(Updates.this, loadAnimation, view);
                }
            });
        }
        if (findItem != null) {
            findItem.setActionView(this.f28901v0);
        }
        V4().f10802c.setLayoutManager(new LinearLayoutManager(this, 1, false));
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setSupportsChangeAnimations(false);
        V4().f10802c.addItemDecoration(new n5.m((int) getResources().getDimension(R.dimen.margin_m), 0));
        V4().f10802c.setItemAnimator(defaultItemAnimator);
        V4().f10801b.f10172b.setOnClickListener(new View.OnClickListener() { // from class: A4.L3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Updates.c5(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z4(Updates this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a5(Updates this$0, MenuItem item) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(item, "item");
        if (item.getItemId() == R.id.action_show_system_apps) {
            boolean isChecked = item.isChecked();
            item.setChecked(!isChecked);
            SettingsPreferences.a aVar = SettingsPreferences.f29309b;
            Context applicationContext = this$0.getApplicationContext();
            AbstractC3159y.h(applicationContext, "applicationContext");
            aVar.Y0(applicationContext, !isChecked);
            if (isChecked) {
                Context applicationContext2 = this$0.getApplicationContext();
                AbstractC3159y.h(applicationContext2, "applicationContext");
                aVar.Z0(applicationContext2, false);
                Toolbar toolbar = this$0.V4().f10803d;
                AbstractC3159y.h(toolbar, "binding.toolbarUpdates");
                this$0.d4(R.id.action_show_system_services, false, toolbar);
                Toolbar toolbar2 = this$0.V4().f10803d;
                AbstractC3159y.h(toolbar2, "binding.toolbarUpdates");
                this$0.B3(R.id.action_show_system_services, false, toolbar2);
            } else {
                Toolbar toolbar3 = this$0.V4().f10803d;
                AbstractC3159y.h(toolbar3, "binding.toolbarUpdates");
                this$0.d4(R.id.action_show_system_services, true, toolbar3);
            }
            if (!isChecked) {
                ImageView imageView = this$0.f28901v0;
                if (imageView != null) {
                    imageView.performClick();
                }
            } else {
                this$0.f5(true);
            }
        } else if (item.getItemId() == R.id.action_show_system_services) {
            boolean isChecked2 = item.isChecked();
            item.setChecked(!isChecked2);
            SettingsPreferences.a aVar2 = SettingsPreferences.f29309b;
            Context applicationContext3 = this$0.getApplicationContext();
            AbstractC3159y.h(applicationContext3, "applicationContext");
            aVar2.Z0(applicationContext3, !isChecked2);
            if (!isChecked2) {
                ImageView imageView2 = this$0.f28901v0;
                if (imageView2 != null) {
                    imageView2.performClick();
                }
            } else {
                this$0.f5(true);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b5(Updates this$0, Animation animation, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(view, "view");
        UptodownApp.a aVar = UptodownApp.f27990B;
        if (aVar.a0() && UptodownApp.a.N0(aVar, this$0, false, false, 6, null)) {
            animation.setRepeatCount(0);
            view.startAnimation(animation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c5(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean d5(int i8) {
        ArrayList arrayList;
        ArrayList arrayList2;
        M m8 = this.f28899t0;
        if (m8 != null) {
            ArrayList arrayList3 = null;
            if (m8 != null) {
                arrayList = m8.b();
            } else {
                arrayList = null;
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                M m9 = this.f28899t0;
                if (m9 != null) {
                    arrayList2 = m9.b();
                } else {
                    arrayList2 = null;
                }
                AbstractC3159y.f(arrayList2);
                if (arrayList2.size() > i8) {
                    M m10 = this.f28899t0;
                    if (m10 != null) {
                        arrayList3 = m10.b();
                    }
                    AbstractC3159y.f(arrayList3);
                    if (arrayList3.get(i8) instanceof C1496f) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e5() {
        this.f28895D0.launch(new Intent(getApplicationContext(), (Class<?>) GdprPrivacySettings.class), UptodownApp.f27990B.b(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g5(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5) {
        M m8 = this.f28899t0;
        if (m8 == null) {
            this.f28899t0 = new M(arrayList, arrayList2, arrayList3, arrayList4, this, this.f28902w0, this.f28903x0, this.f28905z0, this.f28892A0, this.f28893B0, this.f28894C0);
            V4().f10802c.setAdapter(this.f28899t0);
        } else if (m8 != null) {
            m8.g(arrayList, arrayList2, arrayList3, arrayList4);
        }
        M m9 = this.f28899t0;
        AbstractC3159y.f(m9);
        m9.l(arrayList5);
        if (!arrayList.isEmpty()) {
            if (f4() == null) {
                q4(new HashMap());
                ArrayList arrayList6 = new ArrayList(AbstractC1246t.x(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList6.add(Long.valueOf(((C1496f) it.next()).c()));
                }
                new S4.l(this, arrayList6, this.f28904y0, LifecycleOwnerKt.getLifecycleScope(this));
                return;
            }
            M m10 = this.f28899t0;
            AbstractC3159y.f(m10);
            HashMap f42 = f4();
            AbstractC3159y.f(f42);
            m10.e(f42);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h5(boolean z8, boolean z9) {
        if (z8) {
            if (z9) {
                if (this.f28900u0) {
                    M m8 = this.f28899t0;
                    if (m8 != null) {
                        m8.k();
                        return;
                    }
                    return;
                }
                M m9 = this.f28899t0;
                if (m9 != null) {
                    m9.h();
                    return;
                }
                return;
            }
            M m10 = this.f28899t0;
            if (m10 != null) {
                m10.j();
                return;
            }
            return;
        }
        M m11 = this.f28899t0;
        if (m11 != null) {
            m11.h();
        }
    }

    public final Object R4(String str, String str2, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.c(), new c(str2, str, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return L5.I.f6474a;
    }

    public final void f5(boolean z8) {
        X4().e(this, z8);
    }

    public final void i5(ArrayList arrayList) {
        if (h4()) {
            AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new g(arrayList, null), 2, null);
        }
    }

    public final void j5() {
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new k(null), 2, null);
    }

    public final void k5() {
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new l(null), 2, null);
    }

    public final void l5(int i8, String str) {
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new n(i8, str, null), 2, null);
    }

    public final void m5(int i8, String str) {
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new o(str, i8, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2489a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Y4();
        SettingsPreferences.a aVar = SettingsPreferences.f29309b;
        Context applicationContext = getApplicationContext();
        AbstractC3159y.h(applicationContext, "applicationContext");
        this.f28900u0 = aVar.Y(applicationContext);
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new f(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2489a, F4.a1, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        ImageView imageView;
        super.onResume();
        f5(true);
        C3335w.f34532a.g(this);
        UptodownApp.a aVar = UptodownApp.f27990B;
        if (!aVar.V("TrackingWorkerSingle", this) && !aVar.V("TrackingWorkerPeriodic", this) && (imageView = this.f28901v0) != null) {
            imageView.clearAnimation();
        }
    }

    @Override // A4.V1
    protected void p4() {
        f5(false);
    }
}
