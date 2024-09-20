package com.uptodown.activities;

import A4.V1;
import L5.InterfaceC1227k;
import T4.C1362b0;
import T4.C1373h;
import X4.C1496f;
import X4.C1498h;
import X4.C1501k;
import X4.O;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PermissionInfo;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.AppInstalledDetailsActivity;
import i6.AbstractC2825i;
import i6.C2812b0;
import i6.J0;
import i6.M;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l5.C3326n;
import n5.C3475c;

/* loaded from: classes4.dex */
public final class AppInstalledDetailsActivity extends V1 {

    /* renamed from: u0, reason: collision with root package name */
    public static final a f28126u0 = new a(null);

    /* renamed from: q0, reason: collision with root package name */
    private final InterfaceC1227k f28127q0 = L5.l.b(new b());

    /* renamed from: r0, reason: collision with root package name */
    private C1496f f28128r0;

    /* renamed from: s0, reason: collision with root package name */
    private C1498h f28129s0;

    /* renamed from: t0, reason: collision with root package name */
    private ArrayList f28130t0;

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
        public final C1373h invoke() {
            return C1373h.c(AppInstalledDetailsActivity.this.getLayoutInflater());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28132a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f28134a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AppInstalledDetailsActivity f28135b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ O f28136c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AppInstalledDetailsActivity appInstalledDetailsActivity, O o8, P5.d dVar) {
                super(2, dVar);
                this.f28135b = appInstalledDetailsActivity;
                this.f28136c = o8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f28135b, this.f28136c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f28134a == 0) {
                    L5.t.b(obj);
                    this.f28135b.U4().f10650n0.setTypeface(E4.j.f2272g.t());
                    this.f28135b.j5(this.f28136c.n());
                    if (this.f28136c.o() != 100) {
                        this.f28135b.U4().f10650n0.setText(this.f28135b.getString(R.string.updates_button_download_app));
                        this.f28135b.U4().f10650n0.setBackground(ContextCompat.getDrawable(this.f28135b, R.drawable.ripple_blue_primary_button));
                    } else {
                        this.f28135b.U4().f10650n0.setText(this.f28135b.getString(R.string.action_update));
                        this.f28135b.U4().f10650n0.setBackground(ContextCompat.getDrawable(this.f28135b, R.drawable.ripple_install_button));
                    }
                    if (UptodownApp.f27990B.R(this.f28136c.n())) {
                        this.f28135b.l5();
                        this.f28135b.U4().f10621Y.setText(this.f28135b.getString(R.string.status_download_update_pending));
                    }
                    return L5.I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f28137a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AppInstalledDetailsActivity f28138b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(AppInstalledDetailsActivity appInstalledDetailsActivity, P5.d dVar) {
                super(2, dVar);
                this.f28138b = appInstalledDetailsActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new b(this.f28138b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f28137a == 0) {
                    L5.t.b(obj);
                    if (!this.f28138b.isFinishing()) {
                        AppInstalledDetailsActivity appInstalledDetailsActivity = this.f28138b;
                        String packageName = appInstalledDetailsActivity.getPackageName();
                        AbstractC3159y.h(packageName, "packageName");
                        appInstalledDetailsActivity.j5(packageName);
                    }
                    return L5.I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
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
            int i8 = this.f28132a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        L5.t.b(obj);
                        return L5.I.f6474a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                C3326n.a aVar = C3326n.f34490t;
                Context applicationContext = AppInstalledDetailsActivity.this.getApplicationContext();
                AbstractC3159y.h(applicationContext, "applicationContext");
                C3326n a8 = aVar.a(applicationContext);
                a8.a();
                C1496f c1496f = AppInstalledDetailsActivity.this.f28128r0;
                AbstractC3159y.f(c1496f);
                String Q8 = c1496f.Q();
                AbstractC3159y.f(Q8);
                O u02 = a8.u0(Q8);
                a8.g();
                if (u02 != null && u02.f() == 0) {
                    J0 c8 = C2812b0.c();
                    a aVar2 = new a(AppInstalledDetailsActivity.this, u02, null);
                    this.f28132a = 1;
                    if (AbstractC2825i.g(c8, aVar2, this) == e8) {
                        return e8;
                    }
                }
            }
            if (UptodownApp.f27990B.M()) {
                C1496f c1496f2 = AppInstalledDetailsActivity.this.f28128r0;
                AbstractC3159y.f(c1496f2);
                if (g6.n.t(c1496f2.Q(), AppInstalledDetailsActivity.this.getPackageName(), false, 2, null)) {
                    J0 c9 = C2812b0.c();
                    b bVar = new b(AppInstalledDetailsActivity.this, null);
                    this.f28132a = 2;
                    if (AbstractC2825i.g(c9, bVar, this) == e8) {
                        return e8;
                    }
                }
            }
            return L5.I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28139a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f28140b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AppInstalledDetailsActivity f28141c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, AppInstalledDetailsActivity appInstalledDetailsActivity, P5.d dVar) {
            super(2, dVar);
            this.f28140b = str;
            this.f28141c = appInstalledDetailsActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new d(this.f28140b, this.f28141c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f28139a == 0) {
                L5.t.b(obj);
                if (AbstractC3159y.d(this.f28140b, "app_updated")) {
                    this.f28141c.X4();
                }
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
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
            C1501k n8;
            AbstractC3159y.i(appInfo, "appInfo");
            AppInstalledDetailsActivity.this.f28129s0 = appInfo;
            if (!AppInstalledDetailsActivity.this.isFinishing() && (n8 = appInfo.n()) != null && n8.o() == 1) {
                AppInstalledDetailsActivity.this.U4().f10616T.setText(AppInstalledDetailsActivity.this.getString(R.string.app_detail_play_button));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f28143a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f28144b;

        /* renamed from: d, reason: collision with root package name */
        int f28146d;

        f(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f28144b = obj;
            this.f28146d |= Integer.MIN_VALUE;
            return AppInstalledDetailsActivity.this.W4(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28147a;

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
            PackageInfo packageInfo;
            PermissionInfo[] permissionInfoArr;
            Q5.b.e();
            if (this.f28147a == 0) {
                L5.t.b(obj);
                try {
                    PackageManager packageManager = AppInstalledDetailsActivity.this.getPackageManager();
                    AbstractC3159y.h(packageManager, "packageManager");
                    C1496f c1496f = AppInstalledDetailsActivity.this.f28128r0;
                    AbstractC3159y.f(c1496f);
                    String Q8 = c1496f.Q();
                    AbstractC3159y.f(Q8);
                    packageInfo = N4.q.d(packageManager, Q8, 4096);
                } catch (PackageManager.NameNotFoundException unused) {
                    packageInfo = null;
                }
                if (packageInfo != null && (permissionInfoArr = packageInfo.permissions) != null) {
                    AppInstalledDetailsActivity.this.f28130t0 = new ArrayList();
                    for (PermissionInfo permissionInfo : permissionInfoArr) {
                        X4.B b8 = new X4.B();
                        b8.c(String.valueOf(permissionInfo.loadDescription(AppInstalledDetailsActivity.this.getPackageManager())));
                        b8.d(permissionInfo.name);
                        ArrayList arrayList = AppInstalledDetailsActivity.this.f28130t0;
                        AbstractC3159y.f(arrayList);
                        arrayList.add(b8);
                    }
                }
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28149a;

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
            int i8;
            Q5.b.e();
            if (this.f28149a == 0) {
                L5.t.b(obj);
                if (AppInstalledDetailsActivity.this.f28130t0 != null) {
                    ArrayList arrayList = AppInstalledDetailsActivity.this.f28130t0;
                    AbstractC3159y.f(arrayList);
                    if (arrayList.size() > 0) {
                        AppInstalledDetailsActivity appInstalledDetailsActivity = AppInstalledDetailsActivity.this;
                        ArrayList arrayList2 = appInstalledDetailsActivity.f28130t0;
                        AbstractC3159y.f(arrayList2);
                        LinearLayout linearLayout = AppInstalledDetailsActivity.this.U4().f10659s;
                        AbstractC3159y.h(linearLayout, "binding.llPermissionsAida");
                        appInstalledDetailsActivity.i5(arrayList2, linearLayout);
                        ArrayList arrayList3 = AppInstalledDetailsActivity.this.f28130t0;
                        AbstractC3159y.f(arrayList3);
                        i8 = arrayList3.size();
                        AppInstalledDetailsActivity.this.U4().f10619W.setText(String.valueOf(i8));
                        return L5.I.f6474a;
                    }
                }
                AppInstalledDetailsActivity.this.U4().f10597A.setVisibility(8);
                i8 = 0;
                AppInstalledDetailsActivity.this.U4().f10619W.setText(String.valueOf(i8));
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes4.dex */
    static final class i extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28151a;

        i(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new i(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((i) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f28151a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                AppInstalledDetailsActivity appInstalledDetailsActivity = AppInstalledDetailsActivity.this;
                this.f28151a = 1;
                if (appInstalledDetailsActivity.W4(this) == e8) {
                    return e8;
                }
            }
            return L5.I.f6474a;
        }
    }

    /* loaded from: classes4.dex */
    static final class j extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28153a;

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
            Object e8 = Q5.b.e();
            int i8 = this.f28153a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                AppInstalledDetailsActivity appInstalledDetailsActivity = AppInstalledDetailsActivity.this;
                this.f28153a = 1;
                if (appInstalledDetailsActivity.S4(this) == e8) {
                    return e8;
                }
            }
            return L5.I.f6474a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class k implements W4.r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CharSequence f28155a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AppInstalledDetailsActivity f28156b;

        k(CharSequence charSequence, AppInstalledDetailsActivity appInstalledDetailsActivity) {
            this.f28155a = charSequence;
            this.f28156b = appInstalledDetailsActivity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(AppInstalledDetailsActivity this$0, C1498h appInfo, View view) {
            AbstractC3159y.i(this$0, "this$0");
            AbstractC3159y.i(appInfo, "$appInfo");
            if (UptodownApp.f27990B.a0()) {
                this$0.G2(appInfo.i());
            }
        }

        @Override // W4.r
        public void c(int i8) {
        }

        @Override // W4.r
        public void f(final C1498h appInfo) {
            AbstractC3159y.i(appInfo, "appInfo");
            SpannableString a8 = defpackage.b.f14185d.a(this.f28155a.toString());
            float dimension = this.f28156b.getResources().getDimension(R.dimen.text_size_m);
            Typeface u8 = E4.j.f2272g.u();
            AbstractC3159y.f(u8);
            a8.setSpan(new defpackage.b(dimension, u8, ContextCompat.getColor(this.f28156b, R.color.blue_primary)), 0, this.f28155a.length(), 33);
            this.f28156b.U4().f10652o0.setText(a8);
            TextView textView = this.f28156b.U4().f10652o0;
            final AppInstalledDetailsActivity appInstalledDetailsActivity = this.f28156b;
            textView.setOnClickListener(new View.OnClickListener() { // from class: A4.r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AppInstalledDetailsActivity.k.b(AppInstalledDetailsActivity.this, appInfo, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28157a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f28159c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f28160d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f28161a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f28162b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AppInstalledDetailsActivity f28163c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f28164d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ O f28165e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(int i8, AppInstalledDetailsActivity appInstalledDetailsActivity, String str, O o8, P5.d dVar) {
                super(2, dVar);
                this.f28162b = i8;
                this.f28163c = appInstalledDetailsActivity;
                this.f28164d = str;
                this.f28165e = o8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f28162b, this.f28163c, this.f28164d, this.f28165e, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f28161a == 0) {
                    L5.t.b(obj);
                    switch (this.f28162b) {
                        case 102:
                            Toast.makeText(this.f28163c.getApplicationContext(), R.string.descarga_error, 1).show();
                            break;
                        case 103:
                        case 106:
                            AppInstalledDetailsActivity appInstalledDetailsActivity = this.f28163c;
                            String str = this.f28164d;
                            AbstractC3159y.f(str);
                            appInstalledDetailsActivity.j5(str);
                            this.f28163c.U4().f10621Y.setText(this.f28163c.getString(R.string.zero) + this.f28163c.getString(R.string.percent));
                            this.f28163c.U4().f10663u.setProgress(0);
                            break;
                        case 104:
                        case 105:
                        default:
                            this.f28163c.U4().f10663u.setIndeterminate(false);
                            if (this.f28165e != null) {
                                this.f28163c.l5();
                                this.f28163c.U4().f10663u.setProgress(this.f28165e.o());
                                this.f28163c.U4().f10621Y.setText(this.f28163c.getString(R.string.percent_of_total_size, kotlin.coroutines.jvm.internal.b.c(this.f28165e.o()), new N4.g().c(this.f28165e.s())));
                                break;
                            } else {
                                this.f28163c.X4();
                                break;
                            }
                        case 107:
                            this.f28163c.l5();
                            this.f28163c.U4().f10621Y.setText(this.f28163c.getString(R.string.status_download_update_pending));
                            break;
                        case 108:
                            AppInstalledDetailsActivity appInstalledDetailsActivity2 = this.f28163c;
                            String str2 = this.f28164d;
                            AbstractC3159y.f(str2);
                            appInstalledDetailsActivity2.j5(str2);
                            O o8 = this.f28165e;
                            if (o8 != null && o8.o() == 100) {
                                this.f28163c.U4().f10650n0.setText(this.f28163c.getString(R.string.action_update));
                                this.f28163c.U4().f10650n0.setBackground(ContextCompat.getDrawable(this.f28163c, R.drawable.ripple_install_button));
                                break;
                            }
                            break;
                    }
                    return L5.I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(int i8, String str, P5.d dVar) {
            super(2, dVar);
            this.f28159c = i8;
            this.f28160d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new l(this.f28159c, this.f28160d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((l) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f28157a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                C3326n.a aVar = C3326n.f34490t;
                Context applicationContext = AppInstalledDetailsActivity.this.getApplicationContext();
                AbstractC3159y.h(applicationContext, "applicationContext");
                C3326n a8 = aVar.a(applicationContext);
                a8.a();
                C1496f c1496f = AppInstalledDetailsActivity.this.f28128r0;
                AbstractC3159y.f(c1496f);
                String Q8 = c1496f.Q();
                AbstractC3159y.f(Q8);
                O u02 = a8.u0(Q8);
                a8.g();
                J0 c8 = C2812b0.c();
                a aVar2 = new a(this.f28159c, AppInstalledDetailsActivity.this, this.f28160d, u02, null);
                this.f28157a = 1;
                if (AbstractC2825i.g(c8, aVar2, this) == e8) {
                    return e8;
                }
            }
            return L5.I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object S4(P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new c(null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return L5.I.f6474a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1373h U4() {
        return (C1373h) this.f28127q0.getValue();
    }

    private final void V4() {
        C1496f c1496f = this.f28128r0;
        AbstractC3159y.f(c1496f);
        new S4.i(this, c1496f.c(), new e(), LifecycleOwnerKt.getLifecycleScope(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object W4(P5.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.uptodown.activities.AppInstalledDetailsActivity.f
            if (r0 == 0) goto L13
            r0 = r7
            com.uptodown.activities.AppInstalledDetailsActivity$f r0 = (com.uptodown.activities.AppInstalledDetailsActivity.f) r0
            int r1 = r0.f28146d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28146d = r1
            goto L18
        L13:
            com.uptodown.activities.AppInstalledDetailsActivity$f r0 = new com.uptodown.activities.AppInstalledDetailsActivity$f
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f28144b
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f28146d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            L5.t.b(r7)
            goto L69
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            java.lang.Object r2 = r0.f28143a
            com.uptodown.activities.AppInstalledDetailsActivity r2 = (com.uptodown.activities.AppInstalledDetailsActivity) r2
            L5.t.b(r7)
            goto L55
        L3d:
            L5.t.b(r7)
            i6.I r7 = i6.C2812b0.b()
            com.uptodown.activities.AppInstalledDetailsActivity$g r2 = new com.uptodown.activities.AppInstalledDetailsActivity$g
            r2.<init>(r5)
            r0.f28143a = r6
            r0.f28146d = r4
            java.lang.Object r7 = i6.AbstractC2825i.g(r7, r2, r0)
            if (r7 != r1) goto L54
            return r1
        L54:
            r2 = r6
        L55:
            i6.J0 r7 = i6.C2812b0.c()
            com.uptodown.activities.AppInstalledDetailsActivity$h r4 = new com.uptodown.activities.AppInstalledDetailsActivity$h
            r4.<init>(r5)
            r0.f28143a = r5
            r0.f28146d = r3
            java.lang.Object r7 = i6.AbstractC2825i.g(r7, r4, r0)
            if (r7 != r1) goto L69
            return r1
        L69:
            L5.I r7 = L5.I.f6474a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.AppInstalledDetailsActivity.W4(P5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X4() {
        C3475c c3475c = C3475c.f36184a;
        ProgressBar progressBar = U4().f10663u;
        AbstractC3159y.h(progressBar, "binding.pbProgressAida");
        ImageView imageView = U4().f10631e;
        AbstractC3159y.h(imageView, "binding.ivLogoAida");
        c3475c.c(progressBar, imageView);
        U4().f10655q.setVisibility(8);
        U4().f10650n0.setVisibility(8);
        U4().f10658r0.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y4(AppInstalledDetailsActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.getOnBackPressedDispatcher().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z4(View view) {
    }

    private final void a5() {
        U4().f10604H.setVisibility(8);
        U4().f10615S.setVisibility(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void b5() {
        /*
            Method dump skipped, instructions count: 1540
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.AppInstalledDetailsActivity.b5():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c5(AppInstalledDetailsActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        PackageManager packageManager = this$0.getPackageManager();
        C1496f c1496f = this$0.f28128r0;
        AbstractC3159y.f(c1496f);
        String Q8 = c1496f.Q();
        AbstractC3159y.f(Q8);
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(Q8);
        if (launchIntentForPackage != null) {
            this$0.startActivity(launchIntentForPackage);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d5(AppInstalledDetailsActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        E4.i iVar = new E4.i(this$0);
        C1496f c1496f = this$0.f28128r0;
        AbstractC3159y.f(c1496f);
        String Q8 = c1496f.Q();
        AbstractC3159y.f(Q8);
        iVar.h(Q8);
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e5(AppInstalledDetailsActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) AppFilesActivity.class);
        intent.putExtra("appInstalled", this$0.f28128r0);
        this$0.startActivity(intent, UptodownApp.f27990B.a(this$0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f5(final AppInstalledDetailsActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        if (this$0.U4().f10659s.getVisibility() == 0) {
            this$0.U4().f10659s.setVisibility(8);
            this$0.U4().f10639i.setImageResource(R.drawable.vector_add);
        } else {
            this$0.U4().f10659s.setVisibility(0);
            this$0.U4().f10639i.setImageResource(R.drawable.vector_remove);
            this$0.U4().f10604H.post(new Runnable() { // from class: A4.q
                @Override // java.lang.Runnable
                public final void run() {
                    AppInstalledDetailsActivity.g5(AppInstalledDetailsActivity.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g5(AppInstalledDetailsActivity this$0) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.U4().f10604H.smoothScrollTo(0, this$0.U4().f10597A.getTop());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h5(AppInstalledDetailsActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) AppDetailActivity.class);
        C1498h c1498h = this$0.f28129s0;
        if (c1498h != null) {
            intent.putExtra("appInfo", c1498h);
        } else {
            C1496f c1496f = this$0.f28128r0;
            AbstractC3159y.f(c1496f);
            intent.putExtra("appId", c1496f.c());
        }
        this$0.startActivity(intent, UptodownApp.f27990B.a(this$0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i5(ArrayList arrayList, LinearLayout linearLayout) {
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            C1362b0 c8 = C1362b0.c(LayoutInflater.from(getApplicationContext()));
            AbstractC3159y.h(c8, "inflate(LayoutInflater.from(applicationContext))");
            c8.f10392b.setTypeface(E4.j.f2272g.u());
            c8.f10392b.setText(((X4.B) arrayList.get(i8)).b());
            linearLayout.addView(c8.getRoot());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j5(final String str) {
        C3475c c3475c = C3475c.f36184a;
        ProgressBar progressBar = U4().f10663u;
        AbstractC3159y.h(progressBar, "binding.pbProgressAida");
        ImageView imageView = U4().f10631e;
        AbstractC3159y.h(imageView, "binding.ivLogoAida");
        c3475c.c(progressBar, imageView);
        U4().f10621Y.setVisibility(0);
        U4().f10658r0.setVisibility(0);
        U4().f10655q.setVisibility(8);
        U4().f10650n0.setText(getString(R.string.updates_button_download_app));
        U4().f10650n0.setTextColor(ContextCompat.getColor(this, R.color.white));
        U4().f10650n0.setBackground(ContextCompat.getDrawable(this, R.drawable.ripple_blue_primary_button));
        U4().f10650n0.setOnClickListener(new View.OnClickListener() { // from class: A4.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppInstalledDetailsActivity.k5(AppInstalledDetailsActivity.this, str, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k5(AppInstalledDetailsActivity this$0, String packagename, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(packagename, "$packagename");
        this$0.m4(this$0.f28128r0);
        if (UptodownApp.f27990B.R(packagename)) {
            this$0.l5();
            this$0.U4().f10621Y.setText(this$0.getString(R.string.status_download_update_pending));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l5() {
        C3475c c3475c = C3475c.f36184a;
        ProgressBar progressBar = U4().f10663u;
        AbstractC3159y.h(progressBar, "binding.pbProgressAida");
        ImageView imageView = U4().f10631e;
        AbstractC3159y.h(imageView, "binding.ivLogoAida");
        c3475c.e(progressBar, imageView);
        U4().f10655q.setVisibility(0);
        U4().f10658r0.setVisibility(8);
        U4().f10650n0.setText(getString(R.string.option_button_cancel));
        U4().f10650n0.setTextColor(ContextCompat.getColor(this, R.color.main_blue));
        U4().f10650n0.setBackground(ContextCompat.getDrawable(this, R.drawable.ripple_open_button));
        U4().f10650n0.setOnClickListener(new View.OnClickListener() { // from class: A4.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppInstalledDetailsActivity.m5(AppInstalledDetailsActivity.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m5(AppInstalledDetailsActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        UptodownApp.a aVar = UptodownApp.f27990B;
        C1496f c1496f = this$0.f28128r0;
        AbstractC3159y.f(c1496f);
        String Q8 = c1496f.Q();
        AbstractC3159y.f(Q8);
        aVar.c0(Q8, this$0);
    }

    public final Object T4(String str, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.c(), new d(str, this, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return L5.I.f6474a;
    }

    public final Object n5(int i8, String str, P5.d dVar) {
        C1496f c1496f = this.f28128r0;
        AbstractC3159y.f(c1496f);
        if (AbstractC3159y.d(str, c1496f.Q())) {
            Object g8 = AbstractC2825i.g(C2812b0.b(), new l(i8, str, null), dVar);
            if (g8 == Q5.b.e()) {
                return g8;
            }
            return L5.I.f6474a;
        }
        return L5.I.f6474a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0118  */
    @Override // com.uptodown.activities.AbstractActivityC2489a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.AppInstalledDetailsActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2489a, F4.a1, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        String str;
        super.onResume();
        if (this.f28128r0 != null) {
            K4.a h8 = E4.j.f2272g.h();
            if (h8 != null) {
                str = h8.b();
            } else {
                str = null;
            }
            C1496f c1496f = this.f28128r0;
            AbstractC3159y.f(c1496f);
            if (g6.n.s(str, c1496f.Q(), true)) {
                U4().f10663u.setIndeterminate(true);
                C3475c c3475c = C3475c.f36184a;
                ProgressBar progressBar = U4().f10663u;
                AbstractC3159y.h(progressBar, "binding.pbProgressAida");
                ImageView imageView = U4().f10631e;
                AbstractC3159y.h(imageView, "binding.ivLogoAida");
                c3475c.e(progressBar, imageView);
            }
        }
    }

    @Override // A4.V1
    protected void p4() {
    }
}
