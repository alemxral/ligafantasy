package com.uptodown.activities;

import A4.V1;
import E4.j;
import L5.C1224h;
import L5.InterfaceC1227k;
import M5.AbstractC1246t;
import T4.C1385s;
import T4.O;
import W4.InterfaceC1479b;
import X4.C1496f;
import X4.C1498h;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.SimpleItemAnimator;
import androidx.work.Data;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.MyApps;
import com.uptodown.activities.m;
import com.uptodown.activities.preferences.SettingsPreferences;
import com.uptodown.workers.GenerateQueueWorker;
import i6.AbstractC2825i;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.M;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.U;
import l5.AbstractC3337y;
import l5.C3335w;
import l6.InterfaceC3349K;
import l6.InterfaceC3359g;

/* loaded from: classes4.dex */
public final class MyApps extends V1 {

    /* renamed from: s0, reason: collision with root package name */
    private D4.r f28549s0;

    /* renamed from: q0, reason: collision with root package name */
    private final InterfaceC1227k f28547q0 = L5.l.b(new c());

    /* renamed from: r0, reason: collision with root package name */
    private final InterfaceC1227k f28548r0 = new ViewModelLazy(U.b(com.uptodown.activities.m.class), new j(this), new i(this), new k(null, this));

    /* renamed from: t0, reason: collision with root package name */
    private final b f28550t0 = new b();

    /* renamed from: u0, reason: collision with root package name */
    private final l f28551u0 = new l();

    /* renamed from: v0, reason: collision with root package name */
    private final o f28552v0 = new o();

    /* renamed from: w0, reason: collision with root package name */
    private final f f28553w0 = new f();

    /* renamed from: x0, reason: collision with root package name */
    private final e f28554x0 = new e();

    /* loaded from: classes4.dex */
    public final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final int f28555a;

        /* renamed from: b, reason: collision with root package name */
        private final String f28556b;

        public a(int i8, String str) {
            this.f28555a = i8;
            this.f28556b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i8 = this.f28555a;
            boolean z8 = true;
            if (i8 != 102) {
                if (i8 == 104) {
                    Toast.makeText(MyApps.this.getApplicationContext(), R.string.no_free_space, 1).show();
                }
            } else {
                Toast.makeText(MyApps.this.getApplicationContext(), R.string.descarga_error, 1).show();
            }
            if (MyApps.this.f28549s0 != null) {
                int i9 = 0;
                if (this.f28556b != null) {
                    D4.r rVar = MyApps.this.f28549s0;
                    AbstractC3159y.f(rVar);
                    ArrayList b8 = rVar.b();
                    int i10 = 0;
                    while (i10 < b8.size()) {
                        if (b8.get(i10) instanceof C1496f) {
                            Object obj = b8.get(i10);
                            AbstractC3159y.g(obj, "null cannot be cast to non-null type com.uptodown.models.App");
                            C1496f c1496f = (C1496f) obj;
                            if (c1496f.Q() != null && g6.n.s(c1496f.Q(), this.f28556b, true)) {
                                i9 = i10;
                                break;
                            }
                        }
                        i10++;
                    }
                    i9 = i10;
                }
                z8 = false;
                if (z8) {
                    D4.r rVar2 = MyApps.this.f28549s0;
                    AbstractC3159y.f(rVar2);
                    rVar2.notifyItemChanged(i9);
                } else {
                    D4.r rVar3 = MyApps.this.f28549s0;
                    AbstractC3159y.f(rVar3);
                    rVar3.c();
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC1479b {
        b() {
        }

        @Override // W4.InterfaceC1479b
        public void a(int i8) {
            if (UptodownApp.f27990B.a0() && MyApps.this.S4(i8)) {
                D4.r rVar = MyApps.this.f28549s0;
                AbstractC3159y.f(rVar);
                Object obj = rVar.b().get(i8);
                AbstractC3159y.g(obj, "null cannot be cast to non-null type com.uptodown.models.App");
                C1496f c1496f = (C1496f) obj;
                if (c1496f.c0() == C1496f.c.UPDATED) {
                    MyApps myApps = MyApps.this;
                    myApps.L3(c1496f, i8, myApps.f28551u0);
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3160z implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final O invoke() {
            return O.c(MyApps.this.getLayoutInflater());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28560a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f28562c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f28563d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, String str2, P5.d dVar) {
            super(2, dVar);
            this.f28562c = str;
            this.f28563d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new d(this.f28562c, this.f28563d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
        
            if (r0.equals("app_updated") != false) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
        
            if (r4 < 0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
        
            r3.f28561b.T4(false);
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
        
            if (r0.equals("app_installed") == false) goto L24;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                Q5.b.e()
                int r0 = r3.f28560a
                if (r0 != 0) goto L6d
                L5.t.b(r4)
                com.uptodown.activities.MyApps r4 = com.uptodown.activities.MyApps.this
                java.lang.String r0 = r3.f28562c
                int r4 = com.uptodown.activities.MyApps.E4(r4, r0)
                java.lang.String r0 = r3.f28563d
                int r1 = r0.hashCode()
                r2 = -1972881700(0xffffffff8a6836dc, float:-1.11807116E-32)
                if (r1 == r2) goto L59
                r2 = -1487908707(0xffffffffa750509d, float:-2.89095E-15)
                if (r1 == r2) goto L50
                r2 = 389690339(0x173a33e3, float:6.016533E-25)
                if (r1 == r2) goto L28
                goto L6a
            L28:
                java.lang.String r1 = "app_uninstalled"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L31
                goto L6a
            L31:
                if (r4 < 0) goto L6a
                com.uptodown.activities.MyApps r0 = com.uptodown.activities.MyApps.this
                D4.r r0 = com.uptodown.activities.MyApps.C4(r0)
                kotlin.jvm.internal.AbstractC3159y.f(r0)
                java.util.ArrayList r0 = r0.b()
                r0.remove(r4)
                com.uptodown.activities.MyApps r0 = com.uptodown.activities.MyApps.this
                D4.r r0 = com.uptodown.activities.MyApps.C4(r0)
                kotlin.jvm.internal.AbstractC3159y.f(r0)
                r0.notifyItemRemoved(r4)
                goto L6a
            L50:
                java.lang.String r1 = "app_updated"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L6a
                goto L62
            L59:
                java.lang.String r1 = "app_installed"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L62
                goto L6a
            L62:
                if (r4 < 0) goto L6a
                com.uptodown.activities.MyApps r4 = com.uptodown.activities.MyApps.this
                r0 = 0
                r4.T4(r0)
            L6a:
                L5.I r4 = L5.I.f6474a
                return r4
            L6d:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.MyApps.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements W4.r {
        e() {
        }

        @Override // W4.r
        public void c(int i8) {
        }

        @Override // W4.r
        public void f(C1498h appInfo) {
            AbstractC3159y.i(appInfo, "appInfo");
            String t02 = appInfo.t0();
            if (t02 != null && !g6.n.u(t02)) {
                HashMap f42 = MyApps.this.f4();
                AbstractC3159y.f(f42);
                String y02 = appInfo.y0();
                AbstractC3159y.f(y02);
                String t03 = appInfo.t0();
                AbstractC3159y.f(t03);
                f42.put(y02, t03);
                D4.r rVar = MyApps.this.f28549s0;
                AbstractC3159y.f(rVar);
                rVar.d(appInfo);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class f implements W4.t {
        f() {
        }

        @Override // W4.t
        public void a() {
            if (UptodownApp.f27990B.a0()) {
                MyApps myApps = MyApps.this;
                String string = myApps.getString(R.string.disabled_apps_explanation);
                AbstractC3159y.h(string, "getString(R.string.disabled_apps_explanation)");
                myApps.e2(string);
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28566a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ MyApps f28568a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.uptodown.activities.MyApps$g$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0697a extends kotlin.coroutines.jvm.internal.l implements X5.n {

                /* renamed from: a, reason: collision with root package name */
                int f28569a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ MyApps f28570b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0697a(MyApps myApps, P5.d dVar) {
                    super(2, dVar);
                    this.f28570b = myApps;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final P5.d create(Object obj, P5.d dVar) {
                    return new C0697a(this.f28570b, dVar);
                }

                @Override // X5.n
                public final Object invoke(M m8, P5.d dVar) {
                    return ((C0697a) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Q5.b.e();
                    if (this.f28569a == 0) {
                        L5.t.b(obj);
                        this.f28570b.L4().f10276b.f10172b.setVisibility(0);
                        return L5.I.f6474a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes4.dex */
            public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

                /* renamed from: a, reason: collision with root package name */
                int f28571a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ MyApps f28572b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ AbstractC3337y f28573c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(MyApps myApps, AbstractC3337y abstractC3337y, P5.d dVar) {
                    super(2, dVar);
                    this.f28572b = myApps;
                    this.f28573c = abstractC3337y;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final P5.d create(Object obj, P5.d dVar) {
                    return new b(this.f28572b, this.f28573c, dVar);
                }

                @Override // X5.n
                public final Object invoke(M m8, P5.d dVar) {
                    return ((b) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Q5.b.e();
                    if (this.f28571a == 0) {
                        L5.t.b(obj);
                        this.f28572b.L4().f10276b.f10172b.setVisibility(8);
                        this.f28572b.U4(((m.a) ((AbstractC3337y.c) this.f28573c).a()).e(), ((m.a) ((AbstractC3337y.c) this.f28573c).a()).c(), ((m.a) ((AbstractC3337y.c) this.f28573c).a()).a(), ((m.a) ((AbstractC3337y.c) this.f28573c).a()).d(), ((m.a) ((AbstractC3337y.c) this.f28573c).a()).b());
                        return L5.I.f6474a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            a(MyApps myApps) {
                this.f28568a = myApps;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3337y abstractC3337y, P5.d dVar) {
                if (abstractC3337y instanceof AbstractC3337y.a) {
                    Object g8 = AbstractC2825i.g(C2812b0.c(), new C0697a(this.f28568a, null), dVar);
                    if (g8 == Q5.b.e()) {
                        return g8;
                    }
                    return L5.I.f6474a;
                }
                if (abstractC3337y instanceof AbstractC3337y.c) {
                    Object g9 = AbstractC2825i.g(C2812b0.c(), new b(this.f28568a, abstractC3337y, null), dVar);
                    if (g9 == Q5.b.e()) {
                        return g9;
                    }
                    return L5.I.f6474a;
                }
                boolean z8 = abstractC3337y instanceof AbstractC3337y.b;
                return L5.I.f6474a;
            }
        }

        g(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new g(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f28566a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K c8 = MyApps.this.N4().c();
                a aVar = new a(MyApps.this);
                this.f28566a = 1;
                if (c8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28574a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f28576c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(ArrayList arrayList, P5.d dVar) {
            super(2, dVar);
            this.f28576c = arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void o(MyApps myApps, View view) {
            UptodownApp.a aVar = UptodownApp.f27990B;
            if (aVar.a0()) {
                myApps.startActivity(new Intent(myApps.getApplicationContext(), (Class<?>) SettingsPreferences.class), aVar.a(myApps));
                AlertDialog s22 = myApps.s2();
                if (s22 != null) {
                    s22.dismiss();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void p(MyApps myApps, View view) {
            AlertDialog s22 = myApps.s2();
            if (s22 != null) {
                s22.dismiss();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void r(MyApps myApps, View view) {
            AlertDialog s22 = myApps.s2();
            if (s22 != null) {
                s22.dismiss();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void t(ArrayList arrayList, MyApps myApps, View view) {
            if (arrayList != null && arrayList.size() > 0) {
                myApps.W4(arrayList);
            }
            AlertDialog s22 = myApps.s2();
            if (s22 != null) {
                s22.dismiss();
            }
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new h(this.f28576c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((h) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f28574a == 0) {
                L5.t.b(obj);
                AlertDialog s22 = MyApps.this.s2();
                if (s22 != null) {
                    s22.dismiss();
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(MyApps.this);
                C1385s c8 = C1385s.c(MyApps.this.getLayoutInflater());
                AbstractC3159y.h(c8, "inflate(layoutInflater)");
                final MyApps myApps = MyApps.this;
                final ArrayList arrayList = this.f28576c;
                TextView textView = c8.f10871g;
                j.a aVar = E4.j.f2272g;
                textView.setTypeface(aVar.t());
                c8.f10868d.setTypeface(aVar.u());
                c8.f10870f.setTypeface(aVar.t());
                c8.f10867c.setTypeface(aVar.t());
                c8.f10869e.setTypeface(aVar.t());
                c8.f10870f.setOnClickListener(new View.OnClickListener() { // from class: com.uptodown.activities.i
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MyApps.h.o(MyApps.this, view);
                    }
                });
                c8.f10867c.setOnClickListener(new View.OnClickListener() { // from class: com.uptodown.activities.j
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MyApps.h.p(MyApps.this, view);
                    }
                });
                c8.f10866b.setOnClickListener(new View.OnClickListener() { // from class: com.uptodown.activities.k
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MyApps.h.r(MyApps.this, view);
                    }
                });
                c8.f10869e.setOnClickListener(new View.OnClickListener() { // from class: com.uptodown.activities.l
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MyApps.h.t(arrayList, myApps, view);
                    }
                });
                builder.setView(c8.getRoot());
                MyApps.this.O2(builder.create());
                if (!MyApps.this.isFinishing() && MyApps.this.s2() != null) {
                    MyApps.this.U2();
                }
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28577a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentActivity componentActivity) {
            super(0);
            this.f28577a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f28577a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28578a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentActivity componentActivity) {
            super(0);
            this.f28578a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f28578a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f28579a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28580b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f28579a = function0;
            this.f28580b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f28579a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f28580b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* loaded from: classes4.dex */
    public static final class l implements W4.E {
        l() {
        }

        @Override // W4.E
        public void a(int i8) {
            if (UptodownApp.f27990B.a0() && MyApps.this.S4(i8)) {
                D4.r rVar = MyApps.this.f28549s0;
                AbstractC3159y.f(rVar);
                Object obj = rVar.b().get(i8);
                AbstractC3159y.g(obj, "null cannot be cast to non-null type com.uptodown.models.App");
                C1496f c1496f = (C1496f) obj;
                if (c1496f.c0() == C1496f.c.OUTDATED) {
                    MyApps.this.L3(c1496f, i8, this);
                }
            }
        }

        @Override // W4.E
        public void b(int i8) {
            if (MyApps.this.S4(i8)) {
                D4.r rVar = MyApps.this.f28549s0;
                AbstractC3159y.f(rVar);
                Object obj = rVar.b().get(i8);
                AbstractC3159y.g(obj, "null cannot be cast to non-null type com.uptodown.models.App");
                ((C1496f) obj).H0(true);
                D4.r rVar2 = MyApps.this.f28549s0;
                AbstractC3159y.f(rVar2);
                rVar2.notifyItemChanged(i8);
            }
        }

        @Override // W4.E
        public void c(int i8) {
            if (UptodownApp.f27990B.a0() && MyApps.this.S4(i8)) {
                D4.r rVar = MyApps.this.f28549s0;
                AbstractC3159y.f(rVar);
                Object obj = rVar.b().get(i8);
                AbstractC3159y.g(obj, "null cannot be cast to non-null type com.uptodown.models.App");
                C1496f c1496f = (C1496f) obj;
                if (c1496f.c0() == C1496f.c.OUTDATED) {
                    MyApps.this.m4(c1496f);
                    D4.r rVar2 = MyApps.this.f28549s0;
                    if (rVar2 != null) {
                        rVar2.notifyItemChanged(i8);
                    }
                }
            }
        }

        @Override // W4.E
        public void d(int i8) {
            if (MyApps.this.S4(i8)) {
                D4.r rVar = MyApps.this.f28549s0;
                AbstractC3159y.f(rVar);
                rVar.notifyItemChanged(i8);
            }
            MyApps.this.T4(false);
        }

        @Override // W4.E
        public void e(int i8) {
            if (UptodownApp.f27990B.a0() && MyApps.this.S4(i8)) {
                D4.r rVar = MyApps.this.f28549s0;
                AbstractC3159y.f(rVar);
                Object obj = rVar.b().get(i8);
                AbstractC3159y.g(obj, "null cannot be cast to non-null type com.uptodown.models.App");
                MyApps.this.l4((C1496f) obj);
                D4.r rVar2 = MyApps.this.f28549s0;
                if (rVar2 != null) {
                    rVar2.notifyItemChanged(i8);
                }
            }
        }

        @Override // W4.E
        public void f(int i8) {
            if (MyApps.this.S4(i8)) {
                D4.r rVar = MyApps.this.f28549s0;
                AbstractC3159y.f(rVar);
                Object obj = rVar.b().get(i8);
                AbstractC3159y.g(obj, "null cannot be cast to non-null type com.uptodown.models.App");
                ((C1496f) obj).H0(false);
                D4.r rVar2 = MyApps.this.f28549s0;
                AbstractC3159y.f(rVar2);
                rVar2.notifyItemChanged(i8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class m extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28582a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f28584c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f28585d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str, int i8, P5.d dVar) {
            super(2, dVar);
            this.f28584c = str;
            this.f28585d = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new m(this.f28584c, this.f28585d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((m) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean z8;
            String string;
            Q5.b.e();
            if (this.f28582a == 0) {
                L5.t.b(obj);
                if (MyApps.this.f28549s0 != null) {
                    D4.r rVar = MyApps.this.f28549s0;
                    AbstractC3159y.f(rVar);
                    ArrayList b8 = rVar.b();
                    int i8 = 0;
                    while (true) {
                        if (i8 < b8.size()) {
                            if (b8.get(i8) instanceof C1496f) {
                                Object obj2 = b8.get(i8);
                                AbstractC3159y.g(obj2, "null cannot be cast to non-null type com.uptodown.models.App");
                                z8 = true;
                                if (g6.n.s(((C1496f) obj2).Q(), this.f28584c, true)) {
                                    break;
                                }
                            }
                            i8++;
                        } else {
                            z8 = false;
                            break;
                        }
                    }
                    int i9 = this.f28585d;
                    if (i9 == 306) {
                        if (z8) {
                            D4.r rVar2 = MyApps.this.f28549s0;
                            AbstractC3159y.f(rVar2);
                            rVar2.b().remove(i8);
                            D4.r rVar3 = MyApps.this.f28549s0;
                            AbstractC3159y.f(rVar3);
                            rVar3.notifyItemRemoved(i8);
                        }
                    } else if (i9 == 301) {
                        if (z8) {
                            D4.r rVar4 = MyApps.this.f28549s0;
                            AbstractC3159y.f(rVar4);
                            rVar4.notifyItemChanged(i8);
                        }
                    } else if (i9 != 305) {
                        if (i9 == 302) {
                            if (z8) {
                                D4.r rVar5 = MyApps.this.f28549s0;
                                AbstractC3159y.f(rVar5);
                                rVar5.notifyItemChanged(i8);
                            } else {
                                MyApps.this.T4(false);
                            }
                        } else {
                            if (i9 != 303) {
                                if (i9 != 304) {
                                    if (i9 != 307) {
                                        string = "ERROR: (" + this.f28585d + ") " + MyApps.this.getString(R.string.error_generico);
                                    } else {
                                        string = MyApps.this.getString(R.string.error_generico);
                                        AbstractC3159y.h(string, "getString(R.string.error_generico)");
                                    }
                                } else {
                                    string = MyApps.this.getString(R.string.msg_root_install_failed_invalid_versioncode);
                                    AbstractC3159y.h(string, "getString(R.string.msg_r…iled_invalid_versioncode)");
                                }
                            } else {
                                string = MyApps.this.getString(R.string.msg_install_failed);
                                AbstractC3159y.h(string, "getString(R.string.msg_install_failed)");
                            }
                            MyApps.this.e2(string);
                            if (z8) {
                                D4.r rVar6 = MyApps.this.f28549s0;
                                AbstractC3159y.f(rVar6);
                                rVar6.notifyItemChanged(i8);
                            } else {
                                D4.r rVar7 = MyApps.this.f28549s0;
                                AbstractC3159y.f(rVar7);
                                rVar7.c();
                            }
                        }
                    }
                }
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class n extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28586a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f28587b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MyApps f28588c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f28589d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(int i8, MyApps myApps, String str, P5.d dVar) {
            super(2, dVar);
            this.f28587b = i8;
            this.f28588c = myApps;
            this.f28589d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new n(this.f28587b, this.f28588c, this.f28589d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((n) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f28586a == 0) {
                L5.t.b(obj);
                int i8 = this.f28587b;
                boolean z8 = true;
                if (i8 != 102) {
                    if (i8 != 104) {
                        if (i8 == 106) {
                            Toast.makeText(this.f28588c.getApplicationContext(), R.string.download_cancelled, 1).show();
                        }
                    } else {
                        Toast.makeText(this.f28588c.getApplicationContext(), R.string.no_free_space, 1).show();
                    }
                } else {
                    Toast.makeText(this.f28588c.getApplicationContext(), R.string.descarga_error, 1).show();
                }
                if (this.f28588c.f28549s0 != null) {
                    int i9 = 0;
                    if (this.f28589d != null) {
                        D4.r rVar = this.f28588c.f28549s0;
                        AbstractC3159y.f(rVar);
                        ArrayList b8 = rVar.b();
                        int i10 = 0;
                        while (i10 < b8.size()) {
                            if (b8.get(i10) instanceof C1496f) {
                                Object obj2 = b8.get(i10);
                                AbstractC3159y.g(obj2, "null cannot be cast to non-null type com.uptodown.models.App");
                                C1496f c1496f = (C1496f) obj2;
                                if (c1496f.Q() != null && g6.n.s(c1496f.Q(), this.f28589d, true)) {
                                    i9 = i10;
                                    break;
                                }
                            }
                            i10++;
                        }
                        i9 = i10;
                    }
                    z8 = false;
                    if (z8) {
                        D4.r rVar2 = this.f28588c.f28549s0;
                        AbstractC3159y.f(rVar2);
                        rVar2.notifyItemChanged(i9);
                    } else {
                        D4.r rVar3 = this.f28588c.f28549s0;
                        AbstractC3159y.f(rVar3);
                        rVar3.c();
                    }
                }
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes4.dex */
    public static final class o implements W4.G {
        o() {
        }

        @Override // W4.G
        public void a() {
            UptodownApp.a aVar = UptodownApp.f27990B;
            if (aVar.a0()) {
                MyApps.this.startActivity(new Intent(MyApps.this, (Class<?>) SecurityActivity.class), aVar.a(MyApps.this));
            }
        }

        @Override // W4.G
        public void b() {
            if (UptodownApp.f27990B.a0()) {
                MyApps.this.k4();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final O L4() {
        return (O) this.f28547q0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int M4(String str) {
        ArrayList arrayList;
        D4.r rVar = this.f28549s0;
        ArrayList arrayList2 = null;
        if (rVar != null) {
            arrayList = rVar.b();
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            D4.r rVar2 = this.f28549s0;
            if (rVar2 != null) {
                arrayList2 = rVar2.b();
            }
            AbstractC3159y.f(arrayList2);
            Iterator it = arrayList2.iterator();
            int i8 = 0;
            while (it.hasNext()) {
                int i9 = i8 + 1;
                Object next = it.next();
                if (((next instanceof X4.O) && g6.n.s(((X4.O) next).n(), str, true)) || ((next instanceof C1496f) && g6.n.s(((C1496f) next).Q(), str, true))) {
                    return i8;
                }
                i8 = i9;
            }
            return -1;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.uptodown.activities.m N4() {
        return (com.uptodown.activities.m) this.f28548r0.getValue();
    }

    private final void O4() {
        setContentView(L4().getRoot());
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
        if (drawable != null) {
            L4().f10278d.setNavigationIcon(drawable);
            L4().f10278d.setNavigationContentDescription(getString(R.string.back));
        }
        L4().f10278d.setNavigationOnClickListener(new View.OnClickListener() { // from class: A4.v1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyApps.P4(MyApps.this, view);
            }
        });
        L4().f10278d.inflateMenu(R.menu.toolbar_menu_my_apps);
        L4().f10279e.setTypeface(E4.j.f2272g.t());
        SettingsPreferences.a aVar = SettingsPreferences.f29309b;
        boolean h02 = aVar.h0(this);
        L4().f10278d.getMenu().findItem(R.id.action_show_system_apps).setChecked(h02);
        L4().f10278d.getMenu().findItem(R.id.action_show_system_services).setChecked(aVar.i0(this));
        Toolbar toolbar = L4().f10278d;
        AbstractC3159y.h(toolbar, "binding.toolbarMyApps");
        d4(R.id.action_show_system_services, h02, toolbar);
        L4().f10278d.setOverflowIcon(ContextCompat.getDrawable(this, R.drawable.vector_menu_dots_color_adaptable));
        L4().f10278d.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() { // from class: A4.w1
            @Override // androidx.appcompat.widget.Toolbar.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean Q42;
                Q42 = MyApps.Q4(MyApps.this, menuItem);
                return Q42;
            }
        });
        L4().f10277c.addItemDecoration(new n5.m((int) getResources().getDimension(R.dimen.margin_m), 0));
        L4().f10277c.setLayoutManager(new LinearLayoutManager(this, 1, false));
        L4().f10277c.setItemAnimator(new DefaultItemAnimator());
        SimpleItemAnimator simpleItemAnimator = (SimpleItemAnimator) L4().f10277c.getItemAnimator();
        AbstractC3159y.f(simpleItemAnimator);
        simpleItemAnimator.setSupportsChangeAnimations(false);
        L4().f10276b.f10172b.setOnClickListener(new View.OnClickListener() { // from class: A4.x1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyApps.R4(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P4(MyApps this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Q4(MyApps this$0, MenuItem item) {
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
                Toolbar toolbar = this$0.L4().f10278d;
                AbstractC3159y.h(toolbar, "binding.toolbarMyApps");
                this$0.d4(R.id.action_show_system_services, false, toolbar);
                Toolbar toolbar2 = this$0.L4().f10278d;
                AbstractC3159y.h(toolbar2, "binding.toolbarMyApps");
                this$0.B3(R.id.action_show_system_services, false, toolbar2);
            } else {
                Toolbar toolbar3 = this$0.L4().f10278d;
                AbstractC3159y.h(toolbar3, "binding.toolbarMyApps");
                this$0.d4(R.id.action_show_system_services, true, toolbar3);
            }
            this$0.T4(true);
        } else if (item.getItemId() == R.id.action_show_system_services) {
            boolean isChecked2 = item.isChecked();
            item.setChecked(!isChecked2);
            SettingsPreferences.a aVar2 = SettingsPreferences.f29309b;
            Context applicationContext3 = this$0.getApplicationContext();
            AbstractC3159y.h(applicationContext3, "applicationContext");
            aVar2.Z0(applicationContext3, !isChecked2);
            this$0.T4(true);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R4(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean S4(int i8) {
        ArrayList arrayList;
        ArrayList arrayList2;
        D4.r rVar = this.f28549s0;
        if (rVar != null) {
            ArrayList arrayList3 = null;
            if (rVar != null) {
                arrayList = rVar.b();
            } else {
                arrayList = null;
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                D4.r rVar2 = this.f28549s0;
                if (rVar2 != null) {
                    arrayList2 = rVar2.b();
                } else {
                    arrayList2 = null;
                }
                AbstractC3159y.f(arrayList2);
                if (arrayList2.size() > i8) {
                    D4.r rVar3 = this.f28549s0;
                    if (rVar3 != null) {
                        arrayList3 = rVar3.b();
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
    public final void U4(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5) {
        D4.r rVar = this.f28549s0;
        if (rVar == null) {
            this.f28549s0 = new D4.r(arrayList, arrayList2, arrayList3, arrayList4, this, this.f28550t0, this.f28551u0, this.f28552v0, this.f28553w0);
            L4().f10277c.setAdapter(this.f28549s0);
        } else {
            AbstractC3159y.f(rVar);
            rVar.g(arrayList, arrayList2, arrayList3, arrayList4);
        }
        D4.r rVar2 = this.f28549s0;
        AbstractC3159y.f(rVar2);
        rVar2.h(arrayList5);
        if (!arrayList.isEmpty()) {
            if (f4() == null) {
                q4(new HashMap());
                ArrayList arrayList6 = new ArrayList(AbstractC1246t.x(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList6.add(Long.valueOf(((C1496f) it.next()).c()));
                }
                new S4.l(this, arrayList6, this.f28554x0, LifecycleOwnerKt.getLifecycleScope(this));
                return;
            }
            D4.r rVar3 = this.f28549s0;
            AbstractC3159y.f(rVar3);
            HashMap f42 = f4();
            AbstractC3159y.f(f42);
            rVar3.e(f42);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W4(ArrayList arrayList) {
        if (!UptodownApp.f27990B.W("GenerateQueueWorker", this)) {
            Data build = new Data.Builder().putInt("downloadAutostartedInBackground", 0).putBoolean("downloadAnyway", true).putString("packagename", ((C1496f) arrayList.get(0)).Q()).build();
            AbstractC3159y.h(build, "Builder()\n              …\n                .build()");
            WorkManager.getInstance(this).enqueue(new OneTimeWorkRequest.Builder(GenerateQueueWorker.class).addTag("GenerateQueueWorker").setInputData(build).build());
            X4();
        }
    }

    private final void X4() {
        runOnUiThread(new Runnable() { // from class: A4.y1
            @Override // java.lang.Runnable
            public final void run() {
                MyApps.Y4(MyApps.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y4(final MyApps this$0) {
        AbstractC3159y.i(this$0, "this$0");
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: A4.z1
            @Override // java.lang.Runnable
            public final void run() {
                MyApps.Z4(MyApps.this);
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z4(MyApps this$0) {
        AbstractC3159y.i(this$0, "this$0");
        D4.r rVar = this$0.f28549s0;
        if (rVar != null) {
            rVar.c();
        }
    }

    public final Object K4(String str, String str2, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.c(), new d(str2, str, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return L5.I.f6474a;
    }

    public final void T4(boolean z8) {
        N4().b(this, z8);
    }

    public final void V4(ArrayList arrayList) {
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new h(arrayList, null), 2, null);
    }

    public final void a5(int i8, String packageName) {
        AbstractC3159y.i(packageName, "packageName");
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new m(packageName, i8, null), 2, null);
    }

    public final void b5(int i8, String str) {
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new n(i8, this, str, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2489a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        O4();
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new g(null), 3, null);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i8, KeyEvent event) {
        AbstractC3159y.i(event, "event");
        if (i8 == 82) {
            L4().f10278d.showOverflowMenu();
            return true;
        }
        return super.onKeyDown(i8, event);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2489a, F4.a1, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        T4(true);
        C3335w.f34532a.g(this);
    }

    @Override // A4.V1
    protected void p4() {
        T4(false);
    }
}
