package com.uptodown.activities;

import D4.C1095d;
import E4.j;
import L5.C1224h;
import L5.InterfaceC1227k;
import N4.w;
import T4.C1383p;
import T4.P;
import W4.InterfaceC1486i;
import X4.C1498h;
import X4.C1505o;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.MyDownloads;
import com.uptodown.activities.n;
import com.uptodown.core.activities.FileExplorerActivity;
import com.uptodown.workers.DownloadApkWorker;
import com.uptodown.workers.DownloadWorker;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.M;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.T;
import kotlin.jvm.internal.U;
import kotlin.jvm.internal.Y;
import l5.AbstractC3337y;
import l5.C3323k;
import l5.C3326n;
import l5.C3329q;
import l5.C3335w;
import l6.InterfaceC3349K;
import l6.InterfaceC3359g;

/* loaded from: classes4.dex */
public final class MyDownloads extends AbstractActivityC2489a {

    /* renamed from: Q, reason: collision with root package name */
    private C1095d f28593Q;

    /* renamed from: O, reason: collision with root package name */
    private final InterfaceC1227k f28591O = L5.l.b(new b());

    /* renamed from: P, reason: collision with root package name */
    private final InterfaceC1227k f28592P = new ViewModelLazy(U.b(com.uptodown.activities.n.class), new p(this), new o(this), new q(null, this));

    /* renamed from: R, reason: collision with root package name */
    private boolean f28594R = true;

    /* renamed from: S, reason: collision with root package name */
    private n.b f28595S = n.b.DATE;

    /* renamed from: T, reason: collision with root package name */
    private final m f28596T = new m();

    /* renamed from: U, reason: collision with root package name */
    private final k f28597U = new k();

    /* loaded from: classes4.dex */
    public final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final int f28598a;

        public a(int i8) {
            this.f28598a = i8;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i8 = this.f28598a;
            if (i8 != 302 && i8 != 352) {
                MyDownloads.this.n4();
            } else {
                MyDownloads.this.o4(false);
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
        public final P invoke() {
            return P.c(MyDownloads.this.getLayoutInflater());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        Object f28601a;

        /* renamed from: b, reason: collision with root package name */
        int f28602b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f28604d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z8, P5.d dVar) {
            super(2, dVar);
            this.f28604d = z8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(this.f28604d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0097  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = Q5.b.e()
                int r1 = r9.f28602b
                java.lang.String r2 = "item"
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L29
                if (r1 == r4) goto L21
                if (r1 != r3) goto L19
                java.lang.Object r1 = r9.f28601a
                java.util.Iterator r1 = (java.util.Iterator) r1
                L5.t.b(r10)
                goto L91
            L19:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L21:
                java.lang.Object r1 = r9.f28601a
                java.util.Iterator r1 = (java.util.Iterator) r1
                L5.t.b(r10)
                goto L5d
            L29:
                L5.t.b(r10)
                com.uptodown.activities.MyDownloads r10 = com.uptodown.activities.MyDownloads.this
                D4.d r10 = com.uptodown.activities.MyDownloads.z3(r10)
                if (r10 == 0) goto Lcf
                com.uptodown.activities.MyDownloads r10 = com.uptodown.activities.MyDownloads.this
                D4.d r10 = com.uptodown.activities.MyDownloads.z3(r10)
                kotlin.jvm.internal.AbstractC3159y.f(r10)
                java.util.ArrayList r10 = r10.d()
                int r10 = r10.size()
                if (r10 <= 0) goto Lcf
                boolean r10 = r9.f28604d
                if (r10 == 0) goto L7f
                com.uptodown.activities.MyDownloads r10 = com.uptodown.activities.MyDownloads.this
                D4.d r10 = com.uptodown.activities.MyDownloads.z3(r10)
                kotlin.jvm.internal.AbstractC3159y.f(r10)
                java.util.ArrayList r10 = r10.d()
                java.util.Iterator r10 = r10.iterator()
                r1 = r10
            L5d:
                boolean r10 = r1.hasNext()
                if (r10 == 0) goto Lc9
                java.lang.Object r10 = r1.next()
                X4.o r10 = (X4.C1505o) r10
                com.uptodown.activities.MyDownloads r3 = com.uptodown.activities.MyDownloads.this
                com.uptodown.activities.n r3 = com.uptodown.activities.MyDownloads.A3(r3)
                com.uptodown.activities.MyDownloads r5 = com.uptodown.activities.MyDownloads.this
                kotlin.jvm.internal.AbstractC3159y.h(r10, r2)
                r9.f28601a = r1
                r9.f28602b = r4
                java.lang.Object r10 = r3.h(r5, r10, r9)
                if (r10 != r0) goto L5d
                return r0
            L7f:
                com.uptodown.activities.MyDownloads r10 = com.uptodown.activities.MyDownloads.this
                D4.d r10 = com.uptodown.activities.MyDownloads.z3(r10)
                kotlin.jvm.internal.AbstractC3159y.f(r10)
                java.util.ArrayList r10 = r10.d()
                java.util.Iterator r10 = r10.iterator()
                r1 = r10
            L91:
                boolean r10 = r1.hasNext()
                if (r10 == 0) goto Lc9
                java.lang.Object r10 = r1.next()
                X4.o r10 = (X4.C1505o) r10
                boolean r4 = r10.h0()
                if (r4 != 0) goto L91
                com.uptodown.workers.DownloadApkWorker$a r4 = com.uptodown.workers.DownloadApkWorker.f29987k
                long r5 = r10.f()
                long r7 = r10.e0()
                boolean r4 = r4.d(r5, r7)
                if (r4 != 0) goto L91
                com.uptodown.activities.MyDownloads r4 = com.uptodown.activities.MyDownloads.this
                com.uptodown.activities.n r4 = com.uptodown.activities.MyDownloads.A3(r4)
                com.uptodown.activities.MyDownloads r5 = com.uptodown.activities.MyDownloads.this
                kotlin.jvm.internal.AbstractC3159y.h(r10, r2)
                r9.f28601a = r1
                r9.f28602b = r3
                java.lang.Object r10 = r4.h(r5, r10, r9)
                if (r10 != r0) goto L91
                return r0
            Lc9:
                com.uptodown.activities.MyDownloads r10 = com.uptodown.activities.MyDownloads.this
                r0 = 0
                r10.o4(r0)
            Lcf:
                L5.I r10 = L5.I.f6474a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.MyDownloads.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28605a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f28607c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i8, P5.d dVar) {
            super(2, dVar);
            this.f28607c = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new d(this.f28607c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f28605a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                C1095d c1095d = MyDownloads.this.f28593Q;
                AbstractC3159y.f(c1095d);
                Object obj2 = c1095d.d().get(this.f28607c);
                AbstractC3159y.h(obj2, "downloadsAdapter!!.data[pos]");
                com.uptodown.activities.n Y32 = MyDownloads.this.Y3();
                MyDownloads myDownloads = MyDownloads.this;
                this.f28605a = 1;
                obj = Y32.h(myDownloads, (C1505o) obj2, this);
                if (obj == e8) {
                    return e8;
                }
            }
            if (((Boolean) obj).booleanValue() && MyDownloads.this.f28593Q != null) {
                C1095d c1095d2 = MyDownloads.this.f28593Q;
                AbstractC3159y.f(c1095d2);
                c1095d2.d().remove(this.f28607c);
                C1095d c1095d3 = MyDownloads.this.f28593Q;
                AbstractC3159y.f(c1095d3);
                c1095d3.notifyItemRemoved(this.f28607c);
                C1095d c1095d4 = MyDownloads.this.f28593Q;
                AbstractC3159y.f(c1095d4);
                if (c1095d4.d().isEmpty()) {
                    MyDownloads.this.W3().f10291l.setVisibility(0);
                }
            }
            return L5.I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3160z implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5563invoke();
            return L5.I.f6474a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5563invoke() {
            MyDownloads.this.I3(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3160z implements Function0 {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5564invoke();
            return L5.I.f6474a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5564invoke() {
            MyDownloads.this.I3(false);
            DownloadWorker.f30005c.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3160z implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f28611b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i8) {
            super(0);
            this.f28611b = i8;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5565invoke();
            return L5.I.f6474a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5565invoke() {
            MyDownloads.this.J3(this.f28611b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final h f28612a = new h();

        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5566invoke();
            return L5.I.f6474a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5566invoke() {
            DownloadWorker.f30005c.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3160z implements Function0 {
        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5567invoke();
            return L5.I.f6474a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5567invoke() {
            if (UptodownApp.f27990B.W("downloadApkWorker", MyDownloads.this)) {
                MyDownloads.this.K3();
            } else {
                MyDownloads.this.I3(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3160z implements Function0 {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            Object f28615a;

            /* renamed from: b, reason: collision with root package name */
            int f28616b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ MyDownloads f28617c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(MyDownloads myDownloads, P5.d dVar) {
                super(2, dVar);
                this.f28617c = myDownloads;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f28617c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Iterator it;
                Object e8 = Q5.b.e();
                int i8 = this.f28616b;
                if (i8 != 0) {
                    if (i8 == 1) {
                        it = (Iterator) this.f28615a;
                        L5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    L5.t.b(obj);
                    if (this.f28617c.f28593Q != null) {
                        C1095d c1095d = this.f28617c.f28593Q;
                        AbstractC3159y.f(c1095d);
                        it = c1095d.e().iterator();
                    }
                    this.f28617c.o4(false);
                    this.f28617c.Z3();
                    return L5.I.f6474a;
                }
                while (it.hasNext()) {
                    C1505o item = (C1505o) it.next();
                    com.uptodown.activities.n Y32 = this.f28617c.Y3();
                    MyDownloads myDownloads = this.f28617c;
                    AbstractC3159y.h(item, "item");
                    this.f28615a = it;
                    this.f28616b = 1;
                    if (Y32.h(myDownloads, item, this) == e8) {
                        return e8;
                    }
                }
                this.f28617c.o4(false);
                this.f28617c.Z3();
                return L5.I.f6474a;
            }
        }

        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5568invoke();
            return L5.I.f6474a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5568invoke() {
            AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(MyDownloads.this), null, null, new a(MyDownloads.this, null), 3, null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class k implements InterfaceC1486i {
        k() {
        }

        @Override // W4.InterfaceC1486i
        public void a(int i8) {
            if (UptodownApp.f27990B.a0()) {
                C1095d c1095d = MyDownloads.this.f28593Q;
                AbstractC3159y.f(c1095d);
                if (c1095d.f()) {
                    C1095d c1095d2 = MyDownloads.this.f28593Q;
                    AbstractC3159y.f(c1095d2);
                    c1095d2.i(i8);
                    MyDownloads.this.q4();
                    return;
                }
                C1095d c1095d3 = MyDownloads.this.f28593Q;
                AbstractC3159y.f(c1095d3);
                Object obj = c1095d3.d().get(i8);
                AbstractC3159y.h(obj, "downloadsAdapter!!.data[position]");
                MyDownloads.this.O3((C1505o) obj, i8);
            }
        }

        @Override // W4.InterfaceC1486i
        public void b(int i8) {
            if (UptodownApp.f27990B.a0()) {
                MyDownloads.this.L3(i8);
            }
        }

        @Override // W4.InterfaceC1486i
        public void c(int i8) {
            if (MyDownloads.this.f28593Q != null) {
                C1095d c1095d = MyDownloads.this.f28593Q;
                AbstractC3159y.f(c1095d);
                if (!c1095d.f()) {
                    C1095d c1095d2 = MyDownloads.this.f28593Q;
                    AbstractC3159y.f(c1095d2);
                    AbstractC3159y.f(MyDownloads.this.f28593Q);
                    c1095d2.j(!r1.f());
                    C1095d c1095d3 = MyDownloads.this.f28593Q;
                    AbstractC3159y.f(c1095d3);
                    c1095d3.i(i8);
                    MyDownloads.this.v4();
                    if (MyDownloads.this.W3().f10284e.getRoot().getVisibility() != 0) {
                        MyDownloads.this.W3().f10284e.getRoot().setVisibility(0);
                    }
                }
            }
        }

        @Override // W4.InterfaceC1486i
        public void d(int i8) {
            if (UptodownApp.f27990B.a0()) {
                C1095d c1095d = MyDownloads.this.f28593Q;
                AbstractC3159y.f(c1095d);
                if (c1095d.d().size() > 0) {
                    C1095d c1095d2 = MyDownloads.this.f28593Q;
                    AbstractC3159y.f(c1095d2);
                    if (i8 < c1095d2.d().size()) {
                        C1095d c1095d3 = MyDownloads.this.f28593Q;
                        AbstractC3159y.f(c1095d3);
                        Object obj = c1095d3.d().get(i8);
                        AbstractC3159y.h(obj, "downloadsAdapter!!.data[position]");
                        if (DownloadApkWorker.f29987k.e((C1505o) obj)) {
                            DownloadWorker.a aVar = DownloadWorker.f30005c;
                            if (aVar.c()) {
                                aVar.h();
                            }
                        }
                    }
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class l implements SearchView.OnQueryTextListener {
        l() {
        }

        @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
        public boolean onQueryTextChange(String newText) {
            AbstractC3159y.i(newText, "newText");
            MyDownloads.this.G3(newText);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
        public boolean onQueryTextSubmit(String query) {
            AbstractC3159y.i(query, "query");
            MyDownloads.this.G3(query);
            return true;
        }
    }

    /* loaded from: classes4.dex */
    public static final class m extends OnBackPressedCallback {
        m() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            C1095d c1095d = MyDownloads.this.f28593Q;
            if (c1095d != null && c1095d.f()) {
                MyDownloads.this.Z3();
            } else {
                MyDownloads.this.finish();
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class n extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28621a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ MyDownloads f28623a;

            a(MyDownloads myDownloads) {
                this.f28623a = myDownloads;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3337y abstractC3337y, P5.d dVar) {
                if (abstractC3337y instanceof AbstractC3337y.a) {
                    this.f28623a.W3().f10283d.f10172b.setVisibility(0);
                } else if (abstractC3337y instanceof AbstractC3337y.c) {
                    this.f28623a.W3().f10283d.f10172b.setVisibility(8);
                    AbstractC3337y.c cVar = (AbstractC3337y.c) abstractC3337y;
                    this.f28623a.p4(((n.a) cVar.a()).a(), ((n.a) cVar.a()).b());
                    this.f28623a.Z3();
                    if (!this.f28623a.isFinishing()) {
                        if (((n.a) cVar.a()).a().size() == 0 && ((n.a) cVar.a()).b().size() == 0) {
                            this.f28623a.W3().f10291l.setVisibility(0);
                            this.f28623a.W3().f10285f.setVisibility(8);
                        } else {
                            this.f28623a.W3().f10291l.setVisibility(8);
                            this.f28623a.W3().f10285f.setVisibility(0);
                        }
                        if (((n.a) cVar.a()).b().size() == 0) {
                            this.f28623a.W3().f10290k.setVisibility(8);
                            this.f28623a.W3().f10286g.setVisibility(8);
                        } else {
                            this.f28623a.W3().f10290k.setVisibility(0);
                            if (!UptodownApp.f27990B.W("downloadApkWorker", this.f28623a)) {
                                this.f28623a.W3().f10286g.setVisibility(0);
                            } else {
                                this.f28623a.W3().f10286g.setVisibility(8);
                            }
                        }
                        this.f28623a.W3().f10283d.f10172b.setVisibility(8);
                    }
                } else {
                    boolean z8 = abstractC3337y instanceof AbstractC3337y.b;
                }
                return L5.I.f6474a;
            }
        }

        n(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new n(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((n) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f28621a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K k8 = MyDownloads.this.Y3().k();
                a aVar = new a(MyDownloads.this);
                this.f28621a = 1;
                if (k8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* loaded from: classes4.dex */
    public static final class o extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28624a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ComponentActivity componentActivity) {
            super(0);
            this.f28624a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f28624a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class p extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28625a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(ComponentActivity componentActivity) {
            super(0);
            this.f28625a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f28625a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class q extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f28626a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28627b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f28626a = function0;
            this.f28627b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f28626a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f28627b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class r extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28628a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f28630c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C1505o f28631d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(int i8, C1505o c1505o, P5.d dVar) {
            super(2, dVar);
            this.f28630c = i8;
            this.f28631d = c1505o;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new r(this.f28630c, this.f28631d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((r) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int X32;
            Q5.b.e();
            if (this.f28628a == 0) {
                L5.t.b(obj);
                if (MyDownloads.this.f28593Q != null) {
                    int i8 = this.f28630c;
                    if (i8 == 202 || i8 == 203) {
                        MyDownloads.this.o4(false);
                    }
                    C1505o c1505o = this.f28631d;
                    if (c1505o != null && (X32 = MyDownloads.this.X3(c1505o.Y())) > -1) {
                        C1095d c1095d = MyDownloads.this.f28593Q;
                        AbstractC3159y.f(c1095d);
                        c1095d.d().set(X32, this.f28631d);
                        C1095d c1095d2 = MyDownloads.this.f28593Q;
                        AbstractC3159y.f(c1095d2);
                        c1095d2.notifyItemChanged(X32);
                    }
                }
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G3(String str) {
        Y3().j(str, this.f28595S, this.f28594R);
    }

    private final void H3(File file) {
        w.a aVar = N4.w.f7268b;
        String name = file.getName();
        AbstractC3159y.h(name, "item.name");
        if (aVar.a(name)) {
            N4.w wVar = new N4.w();
            boolean f8 = wVar.f(file);
            if (wVar.c(file) && !new N4.f().e().canWrite()) {
                if (X()) {
                    W2(0L);
                } else {
                    o0();
                }
                f8 = false;
            }
            if (f8) {
                AbstractActivityC2489a.B2(this, file, null, 2, null);
                return;
            }
            return;
        }
        AbstractActivityC2489a.B2(this, file, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I3(boolean z8) {
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new c(z8, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J3(int i8) {
        C1095d c1095d = this.f28593Q;
        if (c1095d != null) {
            AbstractC3159y.f(c1095d);
            if (c1095d.d().size() > 0) {
                C1095d c1095d2 = this.f28593Q;
                AbstractC3159y.f(c1095d2);
                if (i8 < c1095d2.d().size()) {
                    AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new d(i8, null), 3, null);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K3() {
        String format;
        DownloadWorker.f30005c.f();
        if (new C3323k().k(this).size() > 1) {
            Y y8 = Y.f33752a;
            String string = getString(R.string.dialog_cancel_downloads_msg);
            AbstractC3159y.h(string, "getString(R.string.dialog_cancel_downloads_msg)");
            format = String.format(string, Arrays.copyOf(new Object[0], 0));
            AbstractC3159y.h(format, "format(...)");
        } else {
            Y y9 = Y.f33752a;
            String string2 = getString(R.string.dialog_cancel_download_msg);
            AbstractC3159y.h(string2, "getString(R.string.dialog_cancel_download_msg)");
            format = String.format(string2, Arrays.copyOf(new Object[0], 0));
            AbstractC3159y.h(format, "format(...)");
        }
        a2(format, new e(), new f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L3(int i8) {
        C1095d c1095d = this.f28593Q;
        if (c1095d != null) {
            AbstractC3159y.f(c1095d);
            Object obj = c1095d.d().get(i8);
            AbstractC3159y.h(obj, "downloadsAdapter!!.data[position]");
            C1505o c1505o = (C1505o) obj;
            if (DownloadApkWorker.f29987k.d(c1505o.f(), c1505o.e0())) {
                DownloadWorker.f30005c.f();
            }
            String string = getString(R.string.download_cancel_confimation_title);
            AbstractC3159y.h(string, "getString(R.string.downl…cancel_confimation_title)");
            a2(string, new g(i8), h.f28612a);
        }
    }

    private final void M3() {
        Y y8 = Y.f33752a;
        String string = getString(R.string.dialog_delete_all_download_msg);
        AbstractC3159y.h(string, "getString(R.string.dialog_delete_all_download_msg)");
        String format = String.format(string, Arrays.copyOf(new Object[0], 0));
        AbstractC3159y.h(format, "format(...)");
        Z1(format, new i());
    }

    private final void N3() {
        Y y8 = Y.f33752a;
        String string = getString(R.string.dialog_delete_selected_download_msg);
        AbstractC3159y.h(string, "getString(R.string.dialo…te_selected_download_msg)");
        String format = String.format(string, Arrays.copyOf(new Object[0], 0));
        AbstractC3159y.h(format, "format(...)");
        Z1(format, new j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O3(final C1505o c1505o, final int i8) {
        Object obj;
        final T t8 = new T();
        C1383p c8 = C1383p.c(getLayoutInflater());
        AbstractC3159y.h(c8, "inflate(layoutInflater)");
        c8.f10786h.setText(c1505o.X());
        TextView textView = c8.f10786h;
        j.a aVar = E4.j.f2272g;
        textView.setTypeface(aVar.u());
        if (!V3(c1505o) && !c1505o.h0()) {
            c8.f10783e.setTypeface(aVar.u());
            c8.f10783e.setOnClickListener(new View.OnClickListener() { // from class: A4.Z1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MyDownloads.P3(kotlin.jvm.internal.T.this, c1505o, this, view);
                }
            });
        } else {
            c8.f10783e.setVisibility(8);
        }
        c8.f10784f.setTypeface(aVar.u());
        c8.f10784f.setOnClickListener(new View.OnClickListener() { // from class: A4.a2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyDownloads.Q3(MyDownloads.this, i8, t8, view);
            }
        });
        c8.f10785g.setTypeface(aVar.u());
        c8.f10785g.setOnClickListener(new View.OnClickListener() { // from class: A4.b2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyDownloads.R3(kotlin.jvm.internal.T.this, c1505o, this, view);
            }
        });
        if (c1505o.f() >= 0) {
            c8.f10780b.setTypeface(aVar.u());
            c8.f10780b.setOnClickListener(new View.OnClickListener() { // from class: A4.c2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MyDownloads.S3(kotlin.jvm.internal.T.this, this, c1505o, view);
                }
            });
        } else {
            c8.f10780b.setVisibility(8);
        }
        c8.f10781c.setTypeface(aVar.u());
        c8.f10781c.setOnClickListener(new View.OnClickListener() { // from class: A4.d2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyDownloads.T3(kotlin.jvm.internal.T.this, this, i8, view);
            }
        });
        C1095d c1095d = this.f28593Q;
        AbstractC3159y.f(c1095d);
        if (((C1505o) c1095d.d().get(i8)).e() != null) {
            c8.f10782d.setTypeface(aVar.u());
            c8.f10782d.setOnClickListener(new View.OnClickListener() { // from class: A4.e2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MyDownloads.U3(kotlin.jvm.internal.T.this, this, i8, view);
                }
            });
        } else {
            c8.f10782d.setVisibility(8);
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(c8.getRoot());
        builder.setCancelable(true);
        t8.f33747a = builder.create();
        if (!isFinishing() && (obj = t8.f33747a) != null) {
            Window window = ((AlertDialog) obj).getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            ((AlertDialog) t8.f33747a).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P3(T dialogDownloadOptions, C1505o download, MyDownloads this$0, View view) {
        AbstractC3159y.i(dialogDownloadOptions, "$dialogDownloadOptions");
        AbstractC3159y.i(download, "$download");
        AbstractC3159y.i(this$0, "this$0");
        AlertDialog alertDialog = (AlertDialog) dialogDownloadOptions.f33747a;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        if (AbstractC3159y.d(download.Y(), this$0.getPackageName())) {
            String e8 = download.e();
            AbstractC3159y.f(e8);
            File file = new File(e8);
            if (file.exists()) {
                PackageManager packageManager = this$0.getPackageManager();
                AbstractC3159y.h(packageManager, "packageManager");
                String absolutePath = file.getAbsolutePath();
                AbstractC3159y.h(absolutePath, "uptodownFile.absolutePath");
                PackageInfo c8 = N4.q.c(packageManager, absolutePath, 128);
                if (c8 == null) {
                    String string = this$0.getString(R.string.installable_files_not_found);
                    AbstractC3159y.h(string, "getString(R.string.installable_files_not_found)");
                    this$0.e2(string);
                    return;
                }
                C3329q c3329q = new C3329q();
                String name = file.getName();
                AbstractC3159y.h(name, "uptodownFile.name");
                String i8 = c3329q.i(name);
                if (i8 != null) {
                    if (new N4.f().m(c8) > 625) {
                        AbstractActivityC2489a.B2(this$0, file, null, 2, null);
                        return;
                    } else {
                        this$0.H2(i8, null);
                        return;
                    }
                }
                UptodownApp.a.Z(UptodownApp.f27990B, file, this$0, null, 4, null);
                return;
            }
            String string2 = this$0.getString(R.string.installable_files_not_found);
            AbstractC3159y.h(string2, "getString(R.string.installable_files_not_found)");
            this$0.e2(string2);
            return;
        }
        String e9 = download.e();
        if (e9 != null && e9.length() != 0) {
            String e10 = download.e();
            AbstractC3159y.f(e10);
            File file2 = new File(e10);
            if (file2.exists()) {
                this$0.H3(file2);
                return;
            }
            String string3 = this$0.getString(R.string.installable_files_not_found);
            AbstractC3159y.h(string3, "getString(R.string.installable_files_not_found)");
            this$0.e2(string3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q3(MyDownloads this$0, int i8, T dialogDownloadOptions, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(dialogDownloadOptions, "$dialogDownloadOptions");
        C1095d c1095d = this$0.f28593Q;
        AbstractC3159y.f(c1095d);
        c1095d.j(true);
        C1095d c1095d2 = this$0.f28593Q;
        AbstractC3159y.f(c1095d2);
        c1095d2.i(i8);
        this$0.v4();
        this$0.q4();
        AlertDialog alertDialog = (AlertDialog) dialogDownloadOptions.f33747a;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R3(T dialogDownloadOptions, C1505o download, MyDownloads this$0, View view) {
        AbstractC3159y.i(dialogDownloadOptions, "$dialogDownloadOptions");
        AbstractC3159y.i(download, "$download");
        AbstractC3159y.i(this$0, "this$0");
        if (UptodownApp.f27990B.a0()) {
            AlertDialog alertDialog = (AlertDialog) dialogDownloadOptions.f33747a;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
            if (download.Z() == 100) {
                this$0.u4(download.e());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S3(T dialogDownloadOptions, MyDownloads this$0, C1505o download, View view) {
        AbstractC3159y.i(dialogDownloadOptions, "$dialogDownloadOptions");
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(download, "$download");
        if (UptodownApp.f27990B.a0()) {
            AlertDialog alertDialog = (AlertDialog) dialogDownloadOptions.f33747a;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
            this$0.G2(download.f());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T3(T dialogDownloadOptions, MyDownloads this$0, int i8, View view) {
        AbstractC3159y.i(dialogDownloadOptions, "$dialogDownloadOptions");
        AbstractC3159y.i(this$0, "this$0");
        AlertDialog alertDialog = (AlertDialog) dialogDownloadOptions.f33747a;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        this$0.J3(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U3(T dialogDownloadOptions, MyDownloads this$0, int i8, View view) {
        String str;
        AbstractC3159y.i(dialogDownloadOptions, "$dialogDownloadOptions");
        AbstractC3159y.i(this$0, "this$0");
        AlertDialog alertDialog = (AlertDialog) dialogDownloadOptions.f33747a;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        C1095d c1095d = this$0.f28593Q;
        AbstractC3159y.f(c1095d);
        if (((C1505o) c1095d.d().get(i8)).e() != null) {
            C1095d c1095d2 = this$0.f28593Q;
            AbstractC3159y.f(c1095d2);
            String e8 = ((C1505o) c1095d2.d().get(i8)).e();
            AbstractC3159y.f(e8);
            File parentFile = new File(e8).getParentFile();
            if (parentFile != null) {
                str = parentFile.getAbsolutePath();
            } else {
                str = null;
            }
            if (str != null) {
                Intent intent = new Intent(this$0.getApplicationContext(), (Class<?>) FileExplorerActivity.class);
                intent.putExtra("subdir", str);
                this$0.startActivity(intent);
            } else {
                String string = this$0.getString(R.string.installable_files_not_found);
                AbstractC3159y.h(string, "getString(R.string.installable_files_not_found)");
                this$0.e2(string);
            }
        }
    }

    private final boolean V3(C1505o c1505o) {
        if (c1505o != null && c1505o.Z() > 0 && c1505o.Z() < 100) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final P W3() {
        return (P) this.f28591O.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int X3(String str) {
        if (str != null) {
            C1095d c1095d = this.f28593Q;
            AbstractC3159y.f(c1095d);
            ArrayList d8 = c1095d.d();
            int size = d8.size();
            for (int i8 = 0; i8 < size; i8++) {
                Object obj = d8.get(i8);
                AbstractC3159y.h(obj, "tmp[index]");
                if (g6.n.s(((C1505o) obj).Y(), str, true)) {
                    return i8;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.uptodown.activities.n Y3() {
        return (com.uptodown.activities.n) this.f28592P.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z3() {
        C1095d c1095d = this.f28593Q;
        if (c1095d != null) {
            c1095d.j(false);
        }
        W3().f10284e.f10298f.setVisibility(8);
        W3().f10284e.f10299g.setVisibility(0);
    }

    private final void a4() {
        setContentView(W3().getRoot());
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
        if (drawable != null) {
            W3().f10289j.setNavigationIcon(drawable);
            W3().f10289j.setNavigationContentDescription(getString(R.string.back));
        }
        TextView textView = (TextView) findViewById(R.id.tv_toolbar_title_downloads);
        j.a aVar = E4.j.f2272g;
        textView.setTypeface(aVar.t());
        W3().f10289j.setNavigationOnClickListener(new View.OnClickListener() { // from class: A4.W1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyDownloads.b4(MyDownloads.this, view);
            }
        });
        W3().f10289j.inflateMenu(R.menu.toolbar_menu_my_downloads);
        W3().f10289j.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() { // from class: A4.h2
            @Override // androidx.appcompat.widget.Toolbar.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean c42;
                c42 = MyDownloads.c4(MyDownloads.this, menuItem);
                return c42;
            }
        });
        W3().f10288i.setOnQueryTextListener(new l());
        W3().f10288i.setOnClickListener(new View.OnClickListener() { // from class: A4.i2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyDownloads.f4(MyDownloads.this, view);
            }
        });
        ((ImageView) W3().f10288i.findViewById(R.id.search_close_btn)).setBackgroundResource(R.drawable.shape_transparent);
        ((ImageView) W3().f10288i.findViewById(R.id.search_mag_icon)).setImageResource(R.drawable.vector_search_downloads);
        SearchView.SearchAutoComplete searchAutoComplete = (SearchView.SearchAutoComplete) W3().f10288i.findViewById(R.id.search_src_text);
        searchAutoComplete.setTypeface(aVar.u());
        searchAutoComplete.setTextColor(ContextCompat.getColor(this, R.color.text_primary));
        ((TextView) findViewById(R.id.tv_label_order_by_mdf)).setTypeface(aVar.u());
        W3().f10284e.f10295c.setOnClickListener(new View.OnClickListener() { // from class: A4.j2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyDownloads.g4(MyDownloads.this, view);
            }
        });
        W3().f10284e.f10296d.setOnClickListener(new View.OnClickListener() { // from class: A4.k2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyDownloads.h4(MyDownloads.this, view);
            }
        });
        W3().f10284e.f10294b.setOnClickListener(new View.OnClickListener() { // from class: A4.l2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyDownloads.i4(MyDownloads.this, view);
            }
        });
        W3().f10285f.setLayoutManager(new LinearLayoutManager(this, 1, false));
        int dimension = (int) getResources().getDimension(R.dimen.margin_m);
        W3().f10285f.addItemDecoration(new n5.m(dimension, dimension));
        W3().f10285f.setItemAnimator(null);
        W3().f10290k.setTypeface(aVar.u());
        W3().f10286g.setOnClickListener(new View.OnClickListener() { // from class: A4.m2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyDownloads.j4(MyDownloads.this, view);
            }
        });
        W3().f10291l.setTypeface(aVar.u());
        W3().f10284e.f10304l.setTypeface(aVar.t());
        W3().f10284e.f10304l.setOnClickListener(new View.OnClickListener() { // from class: A4.n2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyDownloads.k4(MyDownloads.this, view);
            }
        });
        TextView textView2 = W3().f10284e.f10301i;
        W3().f10284e.f10303k.setTypeface(aVar.u());
        W3().f10284e.f10300h.setTypeface(aVar.t());
        W3().f10284e.f10300h.setOnClickListener(new View.OnClickListener() { // from class: A4.X1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyDownloads.l4(MyDownloads.this, view);
            }
        });
        W3().f10284e.f10301i.setTypeface(aVar.t());
        W3().f10284e.f10301i.setOnClickListener(new View.OnClickListener() { // from class: A4.Y1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyDownloads.m4(MyDownloads.this, view);
            }
        });
        W3().f10283d.f10172b.setOnClickListener(new View.OnClickListener() { // from class: A4.f2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyDownloads.d4(view);
            }
        });
        W3().f10282c.setOnClickListener(new View.OnClickListener() { // from class: A4.g2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyDownloads.e4(MyDownloads.this, view);
            }
        });
        p0();
        getOnBackPressedDispatcher().addCallback(this, this.f28596T);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b4(MyDownloads this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.getOnBackPressedDispatcher().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c4(MyDownloads this$0, MenuItem menuItem) {
        AbstractC3159y.i(this$0, "this$0");
        if (menuItem.getItemId() == R.id.action_file_explorer) {
            this$0.startActivity(new Intent(this$0, (Class<?>) FileExplorerActivity.class));
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d4(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e4(MyDownloads this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        if (this$0.W3().f10284e.getRoot().getVisibility() == 0) {
            this$0.W3().f10284e.getRoot().setVisibility(8);
            view.animate().rotation(0.0f).start();
            C1095d c1095d = this$0.f28593Q;
            if (c1095d != null && c1095d.f()) {
                this$0.Z3();
                return;
            }
            return;
        }
        this$0.W3().f10284e.getRoot().setVisibility(0);
        view.animate().rotation(180.0f).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f4(MyDownloads this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.W3().f10288i.setIconified(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g4(MyDownloads this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.s4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h4(MyDownloads this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.t4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i4(MyDownloads this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.r4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j4(MyDownloads this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.W3().f10281b.startAnimation(AnimationUtils.loadAnimation(this$0, R.anim.rotate));
        this$0.z2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k4(MyDownloads this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        C1095d c1095d = this$0.f28593Q;
        if (c1095d != null) {
            AbstractC3159y.f(c1095d);
            if (c1095d.f()) {
                this$0.Z3();
            } else {
                this$0.v4();
            }
            C1095d c1095d2 = this$0.f28593Q;
            AbstractC3159y.f(c1095d2);
            AbstractC3159y.f(this$0.f28593Q);
            c1095d2.j(!r0.f());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l4(MyDownloads this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.M3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m4(MyDownloads this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.N3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n4() {
        C1095d c1095d = this.f28593Q;
        if (c1095d != null) {
            c1095d.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p4(ArrayList arrayList, ArrayList arrayList2) {
        if (!isFinishing()) {
            C1095d c1095d = this.f28593Q;
            if (c1095d == null) {
                this.f28593Q = new C1095d(arrayList, arrayList2, this, this.f28597U);
                W3().f10285f.setAdapter(this.f28593Q);
            } else {
                AbstractC3159y.f(c1095d);
                c1095d.g(arrayList, arrayList2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q4() {
        int i8;
        boolean z8;
        boolean z9;
        C1095d c1095d = this.f28593Q;
        if (c1095d != null) {
            AbstractC3159y.f(c1095d);
            i8 = c1095d.c();
            TextView textView = W3().f10284e.f10300h;
            C1095d c1095d2 = this.f28593Q;
            AbstractC3159y.f(c1095d2);
            if (c1095d2.d().size() > 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            textView.setEnabled(z9);
        } else {
            i8 = 0;
        }
        TextView textView2 = W3().f10284e.f10301i;
        if (i8 != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        textView2.setEnabled(z8);
        W3().f10284e.f10303k.setText(getString(R.string.core_x_items_selected, String.valueOf(i8)));
    }

    private final void r4() {
        n.b bVar = this.f28595S;
        n.b bVar2 = n.b.DATE;
        if (bVar != bVar2) {
            this.f28595S = bVar2;
        } else {
            this.f28594R = !this.f28594R;
        }
        G3(W3().f10288i.getQuery().toString());
        if (this.f28594R) {
            W3().f10284e.f10295c.setBackground(ContextCompat.getDrawable(this, R.drawable.selector_sort_name_desc));
            W3().f10284e.f10296d.setBackground(ContextCompat.getDrawable(this, R.drawable.selector_sort_size_desc));
            W3().f10284e.f10294b.setBackground(ContextCompat.getDrawable(this, R.drawable.selector_sort_date_desc));
        } else {
            W3().f10284e.f10295c.setBackground(ContextCompat.getDrawable(this, R.drawable.selector_sort_name_asc));
            W3().f10284e.f10296d.setBackground(ContextCompat.getDrawable(this, R.drawable.selector_sort_size_asc));
            W3().f10284e.f10294b.setBackground(ContextCompat.getDrawable(this, R.drawable.selector_sort_date_asc));
        }
    }

    private final void s4() {
        n.b bVar = this.f28595S;
        n.b bVar2 = n.b.NAME;
        if (bVar != bVar2) {
            this.f28595S = bVar2;
        } else {
            this.f28594R = !this.f28594R;
        }
        G3(W3().f10288i.getQuery().toString());
        if (this.f28594R) {
            W3().f10284e.f10295c.setBackground(ContextCompat.getDrawable(this, R.drawable.core_vector_sort_az_desc_on));
            W3().f10284e.f10296d.setBackground(ContextCompat.getDrawable(this, R.drawable.core_vector_sort_size_desc_off));
            W3().f10284e.f10294b.setBackground(ContextCompat.getDrawable(this, R.drawable.core_vector_sort_date_desc_off));
        } else {
            W3().f10284e.f10295c.setBackground(ContextCompat.getDrawable(this, R.drawable.core_vector_sort_az_asc_on));
            W3().f10284e.f10296d.setBackground(ContextCompat.getDrawable(this, R.drawable.core_vector_sort_size_asc_off));
            W3().f10284e.f10294b.setBackground(ContextCompat.getDrawable(this, R.drawable.core_vector_sort_date_asc_off));
        }
    }

    private final void t4() {
        n.b bVar = this.f28595S;
        n.b bVar2 = n.b.SIZE;
        if (bVar != bVar2) {
            this.f28595S = bVar2;
        } else {
            this.f28594R = !this.f28594R;
        }
        G3(W3().f10288i.getQuery().toString());
        if (this.f28594R) {
            W3().f10284e.f10296d.setBackground(ContextCompat.getDrawable(this, R.drawable.core_vector_sort_size_desc_on));
            W3().f10284e.f10295c.setBackground(ContextCompat.getDrawable(this, R.drawable.core_vector_sort_az_desc_off));
            W3().f10284e.f10294b.setBackground(ContextCompat.getDrawable(this, R.drawable.core_vector_sort_date_desc_off));
        } else {
            W3().f10284e.f10296d.setBackground(ContextCompat.getDrawable(this, R.drawable.core_vector_sort_size_asc_on));
            W3().f10284e.f10295c.setBackground(ContextCompat.getDrawable(this, R.drawable.core_vector_sort_az_asc_off));
            W3().f10284e.f10294b.setBackground(ContextCompat.getDrawable(this, R.drawable.core_vector_sort_date_asc_off));
        }
    }

    private final void u4(String str) {
        if (str != null) {
            Intent intent = new Intent("android.intent.action.SEND");
            Uri uriForFile = FileProvider.getUriForFile(this, getPackageName() + ".provider", new File(str));
            intent.setType(getContentResolver().getType(uriForFile));
            intent.putExtra("android.intent.extra.STREAM", uriForFile);
            startActivity(Intent.createChooser(intent, getString(R.string.intent_chooser_title_share_file)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v4() {
        W3().f10284e.f10298f.setVisibility(0);
        W3().f10284e.f10299g.setVisibility(4);
        q4();
    }

    @Override // com.uptodown.activities.AbstractActivityC2489a
    public void Y2(C1498h appInfo) {
        AbstractC3159y.i(appInfo, "appInfo");
        if (!isFinishing()) {
            Intent intent = new Intent(this, (Class<?>) AppDetailActivity.class);
            intent.putExtra("appInfo", appInfo);
            startActivity(intent, UptodownApp.f27990B.a(this));
        }
    }

    public final void o4(boolean z8) {
        if (W3().f10288i.getQuery().toString().length() > 0) {
            G3(W3().f10288i.getQuery().toString());
        } else {
            Y3().i(this, this.f28595S, this.f28594R, z8);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2489a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a4();
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new n(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2489a, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        try {
            C3326n a8 = C3326n.f34490t.a(this);
            a8.a();
            a8.i1();
            a8.g();
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        super.onPause();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2489a, F4.a1, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        C3335w.f34532a.g(this);
        o4(true);
    }

    public final void w4(int i8, C1505o c1505o) {
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new r(i8, c1505o, null), 2, null);
    }
}
