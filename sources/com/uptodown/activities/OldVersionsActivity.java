package com.uptodown.activities;

import D4.C1112v;
import E4.j;
import L5.C1224h;
import L5.InterfaceC1227k;
import M5.AbstractC1246t;
import T4.T;
import X4.C1496f;
import X4.C1498h;
import X4.C1505o;
import X4.O;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
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
import androidx.recyclerview.widget.LinearLayoutManager;
import com.mbridge.msdk.MBridgeConstans;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.OldVersionsActivity;
import com.uptodown.activities.p;
import com.uptodown.activities.preferences.SettingsPreferences;
import i6.AbstractC2825i;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.M;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.U;
import kotlin.jvm.internal.Y;
import l5.AbstractC3337y;
import l5.C3313a;
import l5.C3326n;
import l5.C3329q;
import l6.InterfaceC3349K;
import l6.InterfaceC3359g;

/* loaded from: classes4.dex */
public final class OldVersionsActivity extends AbstractActivityC2489a {

    /* renamed from: S, reason: collision with root package name */
    public static final a f28665S = new a(null);

    /* renamed from: Q, reason: collision with root package name */
    private C1112v f28668Q;

    /* renamed from: O, reason: collision with root package name */
    private final InterfaceC1227k f28666O = L5.l.b(new e());

    /* renamed from: P, reason: collision with root package name */
    private final InterfaceC1227k f28667P = new ViewModelLazy(U.b(p.class), new k(this), new j(this), new l(null, this));

    /* renamed from: R, reason: collision with root package name */
    private g f28669R = new g();

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final String f28670a;

        /* renamed from: b, reason: collision with root package name */
        private final long f28671b;

        /* renamed from: c, reason: collision with root package name */
        private final String f28672c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ OldVersionsActivity f28673d;

        public b(OldVersionsActivity oldVersionsActivity, String packagename, long j8, String downloadName) {
            AbstractC3159y.i(packagename, "packagename");
            AbstractC3159y.i(downloadName, "downloadName");
            this.f28673d = oldVersionsActivity;
            this.f28670a = packagename;
            this.f28671b = j8;
            this.f28672c = downloadName;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f28673d.q3().d().getValue() != null) {
                Object value = this.f28673d.q3().d().getValue();
                AbstractC3159y.f(value);
                if (((C1498h) value).y0() != null) {
                    Object value2 = this.f28673d.q3().d().getValue();
                    AbstractC3159y.f(value2);
                    if (g6.n.s(((C1498h) value2).y0(), this.f28670a, true)) {
                        OldVersionsActivity oldVersionsActivity = this.f28673d;
                        Object value3 = oldVersionsActivity.q3().d().getValue();
                        AbstractC3159y.f(value3);
                        String y02 = ((C1498h) value3).y0();
                        AbstractC3159y.f(y02);
                        oldVersionsActivity.z3(y02, this.f28671b, this.f28672c);
                    }
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public final class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final int f28674a;

        /* renamed from: b, reason: collision with root package name */
        private final C1505o f28675b;

        public c(int i8, C1505o c1505o) {
            this.f28674a = i8;
            this.f28675b = c1505o;
        }

        @Override // java.lang.Runnable
        public void run() {
            Long l8;
            int i8 = this.f28674a;
            if (i8 == 203) {
                OldVersionsActivity.this.E3(this.f28675b);
                return;
            }
            if (i8 == 208) {
                Toast.makeText(OldVersionsActivity.this.getApplicationContext(), R.string.no_free_space, 1).show();
                return;
            }
            if (OldVersionsActivity.this.f28668Q != null && !OldVersionsActivity.this.q3().g()) {
                C1505o c1505o = this.f28675b;
                Long l9 = null;
                if (c1505o != null) {
                    l8 = Long.valueOf(c1505o.f());
                } else {
                    l8 = null;
                }
                C1498h c1498h = (C1498h) OldVersionsActivity.this.q3().d().getValue();
                if (c1498h != null) {
                    l9 = Long.valueOf(c1498h.i());
                }
                if (AbstractC3159y.d(l8, l9)) {
                    OldVersionsActivity.this.E3(this.f28675b);
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public final class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final String f28677a;

        /* renamed from: b, reason: collision with root package name */
        private final int f28678b;

        public d(String str, int i8) {
            this.f28677a = str;
            this.f28678b = i8;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x00ab, code lost:
        
            if (g6.n.s(((X4.C1496f) r0).Q(), r4.f28677a, true) == false) goto L27;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r4 = this;
                java.lang.String r0 = r4.f28677a
                if (r0 == 0) goto L114
                com.uptodown.activities.OldVersionsActivity r1 = com.uptodown.activities.OldVersionsActivity.this
                com.uptodown.activities.p r1 = com.uptodown.activities.OldVersionsActivity.f3(r1)
                l6.v r1 = r1.d()
                java.lang.Object r1 = r1.getValue()
                kotlin.jvm.internal.AbstractC3159y.f(r1)
                X4.h r1 = (X4.C1498h) r1
                java.lang.String r1 = r1.y0()
                r2 = 1
                boolean r0 = g6.n.s(r0, r1, r2)
                if (r0 == 0) goto L114
                int r0 = r4.f28678b
                r1 = 306(0x132, float:4.29E-43)
                r3 = 8
                if (r0 != r1) goto L38
                com.uptodown.activities.OldVersionsActivity r0 = com.uptodown.activities.OldVersionsActivity.this
                T4.T r0 = com.uptodown.activities.OldVersionsActivity.d3(r0)
                T4.K r0 = r0.f10312b
                android.widget.RelativeLayout r0 = r0.f10172b
                r0.setVisibility(r3)
                goto L49
            L38:
                r1 = 307(0x133, float:4.3E-43)
                if (r0 != r1) goto L49
                com.uptodown.activities.OldVersionsActivity r0 = com.uptodown.activities.OldVersionsActivity.this
                T4.T r0 = com.uptodown.activities.OldVersionsActivity.d3(r0)
                T4.K r0 = r0.f10312b
                android.widget.RelativeLayout r0 = r0.f10172b
                r0.setVisibility(r3)
            L49:
                int r0 = r4.f28678b
                r1 = 301(0x12d, float:4.22E-43)
                if (r0 == r1) goto Lfb
                r1 = 351(0x15f, float:4.92E-43)
                if (r0 != r1) goto L55
                goto Lfb
            L55:
                r1 = 352(0x160, float:4.93E-43)
                if (r0 != r1) goto L114
                com.uptodown.activities.OldVersionsActivity r0 = com.uptodown.activities.OldVersionsActivity.this
                com.uptodown.activities.p r0 = com.uptodown.activities.OldVersionsActivity.f3(r0)
                boolean r0 = r0.g()
                if (r0 != 0) goto L114
                com.uptodown.activities.OldVersionsActivity r0 = com.uptodown.activities.OldVersionsActivity.this
                com.uptodown.activities.p r0 = com.uptodown.activities.OldVersionsActivity.f3(r0)
                l6.v r0 = r0.c()
                java.lang.Object r0 = r0.getValue()
                if (r0 == 0) goto Lad
                com.uptodown.activities.OldVersionsActivity r0 = com.uptodown.activities.OldVersionsActivity.this
                com.uptodown.activities.p r0 = com.uptodown.activities.OldVersionsActivity.f3(r0)
                l6.v r0 = r0.c()
                java.lang.Object r0 = r0.getValue()
                kotlin.jvm.internal.AbstractC3159y.f(r0)
                X4.f r0 = (X4.C1496f) r0
                java.lang.String r0 = r0.Q()
                if (r0 == 0) goto Lad
                com.uptodown.activities.OldVersionsActivity r0 = com.uptodown.activities.OldVersionsActivity.this
                com.uptodown.activities.p r0 = com.uptodown.activities.OldVersionsActivity.f3(r0)
                l6.v r0 = r0.c()
                java.lang.Object r0 = r0.getValue()
                kotlin.jvm.internal.AbstractC3159y.f(r0)
                X4.f r0 = (X4.C1496f) r0
                java.lang.String r0 = r0.Q()
                java.lang.String r1 = r4.f28677a
                boolean r0 = g6.n.s(r0, r1, r2)
                if (r0 != 0) goto Lf5
            Lad:
                com.uptodown.activities.OldVersionsActivity r0 = com.uptodown.activities.OldVersionsActivity.this
                com.uptodown.activities.p r0 = com.uptodown.activities.OldVersionsActivity.f3(r0)
                l6.v r0 = r0.d()
                java.lang.Object r0 = r0.getValue()
                if (r0 == 0) goto L114
                com.uptodown.activities.OldVersionsActivity r0 = com.uptodown.activities.OldVersionsActivity.this
                com.uptodown.activities.p r0 = com.uptodown.activities.OldVersionsActivity.f3(r0)
                l6.v r0 = r0.d()
                java.lang.Object r0 = r0.getValue()
                kotlin.jvm.internal.AbstractC3159y.f(r0)
                X4.h r0 = (X4.C1498h) r0
                java.lang.String r0 = r0.y0()
                if (r0 == 0) goto L114
                com.uptodown.activities.OldVersionsActivity r0 = com.uptodown.activities.OldVersionsActivity.this
                com.uptodown.activities.p r0 = com.uptodown.activities.OldVersionsActivity.f3(r0)
                l6.v r0 = r0.d()
                java.lang.Object r0 = r0.getValue()
                kotlin.jvm.internal.AbstractC3159y.f(r0)
                X4.h r0 = (X4.C1498h) r0
                java.lang.String r0 = r0.y0()
                java.lang.String r1 = r4.f28677a
                boolean r0 = g6.n.s(r0, r1, r2)
                if (r0 == 0) goto L114
            Lf5:
                com.uptodown.activities.OldVersionsActivity r0 = com.uptodown.activities.OldVersionsActivity.this
                com.uptodown.activities.OldVersionsActivity.e3(r0)
                goto L114
            Lfb:
                com.uptodown.activities.OldVersionsActivity r0 = com.uptodown.activities.OldVersionsActivity.this
                D4.v r0 = com.uptodown.activities.OldVersionsActivity.c3(r0)
                if (r0 == 0) goto L114
                com.uptodown.activities.OldVersionsActivity r0 = com.uptodown.activities.OldVersionsActivity.this
                com.uptodown.activities.p r0 = com.uptodown.activities.OldVersionsActivity.f3(r0)
                boolean r0 = r0.g()
                if (r0 != 0) goto L114
                com.uptodown.activities.OldVersionsActivity r0 = com.uptodown.activities.OldVersionsActivity.this
                com.uptodown.activities.OldVersionsActivity.j3(r0)
            L114:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.OldVersionsActivity.d.run():void");
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3160z implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T invoke() {
            return T.c(OldVersionsActivity.this.getLayoutInflater());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3160z implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f28682b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f28683c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, String str2) {
            super(0);
            this.f28682b = str;
            this.f28683c = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5570invoke();
            return L5.I.f6474a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5570invoke() {
            SettingsPreferences.f29309b.w0(OldVersionsActivity.this, this.f28682b);
            OldVersionsActivity.this.C3(this.f28683c);
        }
    }

    /* loaded from: classes4.dex */
    public static final class g implements W4.w {
        g() {
        }

        @Override // W4.w
        public void a() {
            if (UptodownApp.f27990B.a0()) {
                OldVersionsActivity.this.q3().l(true);
                OldVersionsActivity.this.q3().n(r0.i() - 1);
                OldVersionsActivity.this.q3().m(OldVersionsActivity.this.q3().i() * 20);
                OldVersionsActivity.this.p3();
            }
        }

        @Override // W4.x
        public void b(C1498h appInfo, C1496f c1496f) {
            AbstractC3159y.i(appInfo, "appInfo");
        }

        @Override // W4.w
        public void c(int i8) {
            if (UptodownApp.f27990B.a0()) {
                OldVersionsActivity.this.x3(i8);
            }
        }

        @Override // W4.w
        public void d(int i8) {
            OldVersionsActivity.this.w3(i8);
        }

        @Override // W4.x
        public void e(String appName) {
            AbstractC3159y.i(appName, "appName");
        }

        @Override // W4.w
        public void f() {
            if (UptodownApp.f27990B.a0()) {
                OldVersionsActivity.this.q3().l(true);
                p q32 = OldVersionsActivity.this.q3();
                q32.n(q32.i() + 1);
                OldVersionsActivity.this.q3().m(OldVersionsActivity.this.q3().i() * 20);
                OldVersionsActivity.this.p3();
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class h extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28685a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ OldVersionsActivity f28687a;

            a(OldVersionsActivity oldVersionsActivity) {
                this.f28687a = oldVersionsActivity;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3337y abstractC3337y, P5.d dVar) {
                if (AbstractC3159y.d(abstractC3337y, AbstractC3337y.a.f34533a)) {
                    if (this.f28687a.q3().f()) {
                        this.f28687a.o3().f10312b.f10172b.setVisibility(0);
                    }
                } else if (abstractC3337y instanceof AbstractC3337y.c) {
                    AbstractC3337y.c cVar = (AbstractC3337y.c) abstractC3337y;
                    if (((p.a) cVar.a()).c()) {
                        this.f28687a.q3().c().setValue(((p.a) cVar.a()).a());
                        this.f28687a.q3().d().setValue(((p.a) cVar.a()).b());
                        if (((p.a) cVar.a()).b().w0() != null) {
                            if (this.f28687a.f28668Q == null) {
                                this.f28687a.l3();
                                this.f28687a.o3().f10313c.setAdapter(this.f28687a.f28668Q);
                            } else {
                                C1112v c1112v = this.f28687a.f28668Q;
                                AbstractC3159y.f(c1112v);
                                c1112v.g(this.f28687a.q3().i());
                                C1112v c1112v2 = this.f28687a.f28668Q;
                                AbstractC3159y.f(c1112v2);
                                c1112v2.f(((p.a) cVar.a()).b().w0());
                                C1112v c1112v3 = this.f28687a.f28668Q;
                                AbstractC3159y.f(c1112v3);
                                c1112v3.e((C1496f) this.f28687a.q3().c().getValue());
                                this.f28687a.D3();
                            }
                        } else {
                            this.f28687a.o3().f10315e.setVisibility(0);
                        }
                        this.f28687a.B3();
                    } else {
                        C1498h c1498h = (C1498h) this.f28687a.q3().d().getValue();
                        if (c1498h != null) {
                            c1498h.y1(null);
                        }
                        this.f28687a.o3().f10315e.setVisibility(0);
                        this.f28687a.B3();
                    }
                } else {
                    AbstractC3159y.d(abstractC3337y, AbstractC3337y.b.f34534a);
                }
                return L5.I.f6474a;
            }
        }

        h(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new h(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((h) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f28685a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K e9 = OldVersionsActivity.this.q3().e();
                a aVar = new a(OldVersionsActivity.this);
                this.f28685a = 1;
                if (e9.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* loaded from: classes4.dex */
    public static final class i implements W4.K {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ X4.z f28689b;

        i(X4.z zVar) {
            this.f28689b = zVar;
        }

        @Override // W4.K
        public void a(X4.H reportVT) {
            AbstractC3159y.i(reportVT, "reportVT");
            Intent intent = new Intent(OldVersionsActivity.this, (Class<?>) VirusTotalReport.class);
            intent.putExtra("appInfo", (Parcelable) OldVersionsActivity.this.q3().d().getValue());
            intent.putExtra("appReportVT", reportVT);
            intent.putExtra("old_version", this.f28689b.k());
            OldVersionsActivity oldVersionsActivity = OldVersionsActivity.this;
            oldVersionsActivity.startActivity(intent, UptodownApp.f27990B.a(oldVersionsActivity));
        }

        @Override // W4.K
        public void b() {
            if (OldVersionsActivity.this.q3().d().getValue() != null) {
                OldVersionsActivity oldVersionsActivity = OldVersionsActivity.this;
                Object value = oldVersionsActivity.q3().d().getValue();
                AbstractC3159y.f(value);
                oldVersionsActivity.J2(((C1498h) value).S0());
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28690a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentActivity componentActivity) {
            super(0);
            this.f28690a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f28690a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28691a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentActivity componentActivity) {
            super(0);
            this.f28691a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f28691a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class l extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f28692a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28693b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f28692a = function0;
            this.f28693b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f28692a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f28693b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class m extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28694a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f28696c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str, P5.d dVar) {
            super(2, dVar);
            this.f28696c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new m(this.f28696c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((m) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x005d, code lost:
        
            if (g6.n.s(((X4.C1496f) r3).Q(), r2.f28696c, true) == false) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x00a7, code lost:
        
            r2.f28695b.p3();
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x00a5, code lost:
        
            if (g6.n.s(((X4.C1498h) r3).y0(), r2.f28696c, true) != false) goto L18;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
            /*
                r2 = this;
                Q5.b.e()
                int r0 = r2.f28694a
                if (r0 != 0) goto Laf
                L5.t.b(r3)
                com.uptodown.activities.OldVersionsActivity r3 = com.uptodown.activities.OldVersionsActivity.this
                com.uptodown.activities.p r3 = com.uptodown.activities.OldVersionsActivity.f3(r3)
                boolean r3 = r3.g()
                if (r3 != 0) goto Lac
                com.uptodown.activities.OldVersionsActivity r3 = com.uptodown.activities.OldVersionsActivity.this
                com.uptodown.activities.p r3 = com.uptodown.activities.OldVersionsActivity.f3(r3)
                l6.v r3 = r3.c()
                java.lang.Object r3 = r3.getValue()
                r0 = 1
                if (r3 == 0) goto L5f
                com.uptodown.activities.OldVersionsActivity r3 = com.uptodown.activities.OldVersionsActivity.this
                com.uptodown.activities.p r3 = com.uptodown.activities.OldVersionsActivity.f3(r3)
                l6.v r3 = r3.c()
                java.lang.Object r3 = r3.getValue()
                kotlin.jvm.internal.AbstractC3159y.f(r3)
                X4.f r3 = (X4.C1496f) r3
                java.lang.String r3 = r3.Q()
                if (r3 == 0) goto L5f
                com.uptodown.activities.OldVersionsActivity r3 = com.uptodown.activities.OldVersionsActivity.this
                com.uptodown.activities.p r3 = com.uptodown.activities.OldVersionsActivity.f3(r3)
                l6.v r3 = r3.c()
                java.lang.Object r3 = r3.getValue()
                kotlin.jvm.internal.AbstractC3159y.f(r3)
                X4.f r3 = (X4.C1496f) r3
                java.lang.String r3 = r3.Q()
                java.lang.String r1 = r2.f28696c
                boolean r3 = g6.n.s(r3, r1, r0)
                if (r3 != 0) goto La7
            L5f:
                com.uptodown.activities.OldVersionsActivity r3 = com.uptodown.activities.OldVersionsActivity.this
                com.uptodown.activities.p r3 = com.uptodown.activities.OldVersionsActivity.f3(r3)
                l6.v r3 = r3.d()
                java.lang.Object r3 = r3.getValue()
                if (r3 == 0) goto Lac
                com.uptodown.activities.OldVersionsActivity r3 = com.uptodown.activities.OldVersionsActivity.this
                com.uptodown.activities.p r3 = com.uptodown.activities.OldVersionsActivity.f3(r3)
                l6.v r3 = r3.d()
                java.lang.Object r3 = r3.getValue()
                kotlin.jvm.internal.AbstractC3159y.f(r3)
                X4.h r3 = (X4.C1498h) r3
                java.lang.String r3 = r3.y0()
                if (r3 == 0) goto Lac
                com.uptodown.activities.OldVersionsActivity r3 = com.uptodown.activities.OldVersionsActivity.this
                com.uptodown.activities.p r3 = com.uptodown.activities.OldVersionsActivity.f3(r3)
                l6.v r3 = r3.d()
                java.lang.Object r3 = r3.getValue()
                kotlin.jvm.internal.AbstractC3159y.f(r3)
                X4.h r3 = (X4.C1498h) r3
                java.lang.String r3 = r3.y0()
                java.lang.String r1 = r2.f28696c
                boolean r3 = g6.n.s(r3, r1, r0)
                if (r3 == 0) goto Lac
            La7:
                com.uptodown.activities.OldVersionsActivity r3 = com.uptodown.activities.OldVersionsActivity.this
                com.uptodown.activities.OldVersionsActivity.e3(r3)
            Lac:
                L5.I r3 = L5.I.f6474a
                return r3
            Laf:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r3.<init>(r0)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.OldVersionsActivity.m.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private final void A3(String str, long j8, String str2) {
        if (v3(str, j8)) {
            m3(str, str2);
            return;
        }
        C3329q c3329q = new C3329q();
        Context applicationContext = getApplicationContext();
        AbstractC3159y.h(applicationContext, "applicationContext");
        UptodownApp.a.Z(UptodownApp.f27990B, new File(c3329q.g(applicationContext), str2), this, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B3() {
        q3().k(false);
        o3().f10312b.f10172b.setVisibility(8);
        q3().l(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C3(String str) {
        new E4.i(this).h(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D3() {
        C1112v c1112v = this.f28668Q;
        if (c1112v != null) {
            c1112v.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E3(C1505o c1505o) {
        X4.z zVar;
        Object obj;
        String str;
        Object value = q3().d().getValue();
        AbstractC3159y.f(value);
        ArrayList w02 = ((C1498h) value).w0();
        Integer num = null;
        if (w02 != null) {
            Iterator it = w02.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    String b8 = ((X4.z) obj).b();
                    if (c1505o != null) {
                        str = c1505o.u();
                    } else {
                        str = null;
                    }
                    if (AbstractC3159y.d(b8, str)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            zVar = (X4.z) obj;
        } else {
            zVar = null;
        }
        Object value2 = q3().d().getValue();
        AbstractC3159y.f(value2);
        ArrayList w03 = ((C1498h) value2).w0();
        if (w03 != null) {
            num = Integer.valueOf(AbstractC1246t.r0(w03, zVar));
        }
        if (zVar != null && num != null) {
            C1112v c1112v = this.f28668Q;
            if (c1112v != null) {
                c1112v.notifyItemChanged(num.intValue());
                return;
            }
            return;
        }
        D3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l3() {
        Object value = q3().d().getValue();
        AbstractC3159y.f(value);
        C1498h c1498h = (C1498h) value;
        C1496f c1496f = (C1496f) q3().c().getValue();
        g gVar = this.f28669R;
        Object value2 = q3().d().getValue();
        AbstractC3159y.f(value2);
        this.f28668Q = new C1112v(c1498h, c1496f, this, gVar, ((C1498h) value2).c1());
    }

    private final void m3(String str, String str2) {
        String string = getString(R.string.msg_warning_old_versions);
        AbstractC3159y.h(string, "getString(R.string.msg_warning_old_versions)");
        Z1(string, new f(str2, str));
    }

    private final void n3(C1505o c1505o) {
        Object value = q3().d().getValue();
        AbstractC3159y.f(value);
        c1505o.b((C1498h) value);
        int l02 = c1505o.l0(this);
        if (l02 >= 0) {
            M2(this, l02);
            return;
        }
        Toast.makeText(this, getString(R.string.error_cant_enqueue_download) + " (108)", 1).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T o3() {
        return (T) this.f28666O.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p3() {
        q3().l(true);
        if (q3().d().getValue() != null) {
            q3().b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p q3() {
        return (p) this.f28667P.getValue();
    }

    private final void r3() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_old_versions);
        if (toolbar != null) {
            Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
            if (drawable != null) {
                toolbar.setNavigationIcon(drawable);
                toolbar.setNavigationContentDescription(getString(R.string.back));
            }
            toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: A4.r2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OldVersionsActivity.s3(OldVersionsActivity.this, view);
                }
            });
        }
        TextView textView = (TextView) findViewById(R.id.tv_toolbar_old_versions);
        j.a aVar = E4.j.f2272g;
        textView.setTypeface(aVar.t());
        o3().f10315e.setTypeface(aVar.u());
        o3().f10313c.setLayoutManager(new LinearLayoutManager(this, 1, false));
        o3().f10313c.setItemAnimator(null);
        o3().f10313c.addItemDecoration(new n5.m((int) getResources().getDimension(R.dimen.margin_m), (int) getResources().getDimension(R.dimen.margin_xl)));
        o3().f10312b.f10172b.setOnClickListener(new View.OnClickListener() { // from class: A4.s2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OldVersionsActivity.t3(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s3(OldVersionsActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.getOnBackPressedDispatcher().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t3(View view) {
    }

    private final boolean v3(String str, long j8) {
        PackageManager pm = getPackageManager();
        try {
            AbstractC3159y.h(pm, "pm");
            if (j8 >= new N4.f().m(N4.q.d(pm, str, 128))) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    private final void y3(X4.z zVar) {
        if (!isFinishing() && q3().d().getValue() != null) {
            Object value = q3().d().getValue();
            AbstractC3159y.f(value);
            if (((C1498h) value).n1()) {
                new S4.m(this, zVar.b(), null, new i(zVar), LifecycleOwnerKt.getLifecycleScope(this));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z3(String str, long j8, String str2) {
        if (v3(str, j8)) {
            m3(str, str2);
            return;
        }
        C3329q c3329q = new C3329q();
        Context applicationContext = getApplicationContext();
        AbstractC3159y.h(applicationContext, "applicationContext");
        UptodownApp.a.Z(UptodownApp.f27990B, new File(c3329q.f(applicationContext), str2), this, null, 4, null);
    }

    public final Object F3(String str, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.c(), new m(str, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return L5.I.f6474a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2489a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Bundle extras;
        Parcelable parcelable;
        Object parcelable2;
        Parcelable parcelable3;
        Object parcelable4;
        super.onCreate(bundle);
        setContentView(o3().getRoot());
        q3().k(true);
        Intent intent = getIntent();
        if (intent != null && (extras = intent.getExtras()) != null) {
            if (extras.containsKey(MBridgeConstans.DYNAMIC_VIEW_WX_APP)) {
                l6.v c8 = q3().c();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable4 = extras.getParcelable(MBridgeConstans.DYNAMIC_VIEW_WX_APP, C1496f.class);
                    parcelable3 = (Parcelable) parcelable4;
                } else {
                    parcelable3 = extras.getParcelable(MBridgeConstans.DYNAMIC_VIEW_WX_APP);
                }
                c8.setValue(parcelable3);
            }
            if (extras.containsKey("appInfo")) {
                l6.v d8 = q3().d();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = extras.getParcelable("appInfo", C1498h.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    parcelable = extras.getParcelable("appInfo");
                }
                d8.setValue(parcelable);
            }
        }
        r3();
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new h(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2489a, F4.a1, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        p3();
    }

    public final void u3(String packageName) {
        AbstractC3159y.i(packageName, "packageName");
        q3().j(this, packageName);
    }

    public final void w3(int i8) {
        O o8;
        Object value = q3().d().getValue();
        AbstractC3159y.f(value);
        if (((C1498h) value).w0() != null) {
            Object value2 = q3().d().getValue();
            AbstractC3159y.f(value2);
            ArrayList w02 = ((C1498h) value2).w0();
            AbstractC3159y.f(w02);
            if (i8 < w02.size()) {
                Object value3 = q3().d().getValue();
                AbstractC3159y.f(value3);
                ArrayList w03 = ((C1498h) value3).w0();
                AbstractC3159y.f(w03);
                long j8 = ((X4.z) w03.get(i8)).j();
                if (q3().c().getValue() != null) {
                    Object value4 = q3().c().getValue();
                    AbstractC3159y.f(value4);
                    if (j8 == ((C1496f) value4).f0()) {
                        Y y8 = Y.f33752a;
                        String string = getString(R.string.autoupdate_installed_version);
                        AbstractC3159y.h(string, "getString(R.string.autoupdate_installed_version)");
                        Object value5 = q3().d().getValue();
                        AbstractC3159y.f(value5);
                        ArrayList w04 = ((C1498h) value5).w0();
                        AbstractC3159y.f(w04);
                        String format = String.format(string, Arrays.copyOf(new Object[]{((X4.z) w04.get(i8)).k()}, 1));
                        AbstractC3159y.h(format, "format(...)");
                        Toast.makeText(this, format, 1).show();
                        return;
                    }
                }
                C3326n.a aVar = C3326n.f34490t;
                Context applicationContext = getApplicationContext();
                AbstractC3159y.h(applicationContext, "applicationContext");
                C3326n a8 = aVar.a(applicationContext);
                a8.a();
                Object value6 = q3().d().getValue();
                AbstractC3159y.f(value6);
                ArrayList w05 = ((C1498h) value6).w0();
                AbstractC3159y.f(w05);
                String b8 = ((X4.z) w05.get(i8)).b();
                AbstractC3159y.f(b8);
                C1505o Z7 = a8.Z(b8);
                if (Z7 != null) {
                    int Z8 = Z7.Z();
                    if (1 <= Z8 && Z8 < 100) {
                        if (Z7.X() != null) {
                            C3313a c3313a = new C3313a();
                            Context applicationContext2 = getApplicationContext();
                            AbstractC3159y.h(applicationContext2, "applicationContext");
                            c3313a.a(applicationContext2, Z7.X());
                        }
                    } else if (Z7.Z() == 100) {
                        Object value7 = q3().d().getValue();
                        AbstractC3159y.f(value7);
                        String y02 = ((C1498h) value7).y0();
                        AbstractC3159y.f(y02);
                        long e02 = Z7.e0();
                        String X7 = Z7.X();
                        AbstractC3159y.f(X7);
                        z3(y02, e02, X7);
                    } else {
                        Z7.n0(this);
                        C1112v c1112v = this.f28668Q;
                        if (c1112v != null) {
                            c1112v.notifyItemChanged(i8);
                        }
                    }
                } else {
                    Object value8 = q3().d().getValue();
                    AbstractC3159y.f(value8);
                    if (((C1498h) value8).y0() != null) {
                        Object value9 = q3().d().getValue();
                        AbstractC3159y.f(value9);
                        String y03 = ((C1498h) value9).y0();
                        AbstractC3159y.f(y03);
                        o8 = a8.u0(y03);
                    } else {
                        o8 = null;
                    }
                    if (o8 != null && o8.o() == 100) {
                        long u8 = o8.u();
                        Object value10 = q3().d().getValue();
                        AbstractC3159y.f(value10);
                        ArrayList w06 = ((C1498h) value10).w0();
                        AbstractC3159y.f(w06);
                        if (u8 == ((X4.z) w06.get(i8)).j()) {
                            Object value11 = q3().d().getValue();
                            AbstractC3159y.f(value11);
                            String y04 = ((C1498h) value11).y0();
                            AbstractC3159y.f(y04);
                            long u9 = o8.u();
                            String j9 = o8.j();
                            AbstractC3159y.f(j9);
                            A3(y04, u9, j9);
                        }
                    }
                    File f8 = new C3329q().f(this);
                    C3313a c3313a2 = new C3313a();
                    long k8 = new C3329q().k(this, f8);
                    Object value12 = q3().d().getValue();
                    AbstractC3159y.f(value12);
                    ArrayList w07 = ((C1498h) value12).w0();
                    AbstractC3159y.f(w07);
                    if (c3313a2.c(k8, ((X4.z) w07.get(i8)).i())) {
                        C1505o c1505o = new C1505o();
                        Object value13 = q3().d().getValue();
                        AbstractC3159y.f(value13);
                        ArrayList w08 = ((C1498h) value13).w0();
                        AbstractC3159y.f(w08);
                        c1505o.w0(((X4.z) w08.get(i8)).b());
                        Object value14 = q3().d().getValue();
                        AbstractC3159y.f(value14);
                        ArrayList w09 = ((C1498h) value14).w0();
                        AbstractC3159y.f(w09);
                        c1505o.J0(((X4.z) w09.get(i8)).j());
                        Object value15 = q3().d().getValue();
                        AbstractC3159y.f(value15);
                        ArrayList w010 = ((C1498h) value15).w0();
                        AbstractC3159y.f(w010);
                        c1505o.G0(((X4.z) w010.get(i8)).i());
                        n3(c1505o);
                        C1112v c1112v2 = this.f28668Q;
                        if (c1112v2 != null) {
                            c1112v2.notifyItemChanged(i8);
                        }
                    } else {
                        String string2 = getString(R.string.error_not_enough_space);
                        AbstractC3159y.h(string2, "getString(R.string.error_not_enough_space)");
                        e2(string2);
                    }
                }
                a8.g();
            }
        }
    }

    public final void x3(int i8) {
        X4.z zVar;
        Object value = q3().d().getValue();
        AbstractC3159y.f(value);
        if (((C1498h) value).w0() != null) {
            Object value2 = q3().d().getValue();
            AbstractC3159y.f(value2);
            ArrayList w02 = ((C1498h) value2).w0();
            AbstractC3159y.f(w02);
            if (i8 < w02.size()) {
                Object value3 = q3().d().getValue();
                AbstractC3159y.f(value3);
                ArrayList w03 = ((C1498h) value3).w0();
                if (w03 != null) {
                    zVar = (X4.z) w03.get(i8);
                } else {
                    zVar = null;
                }
                AbstractC3159y.f(zVar);
                y3(zVar);
            }
        }
    }
}
