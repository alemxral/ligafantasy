package com.uptodown.activities;

import D4.C1097f;
import D4.C1099h;
import E4.j;
import F4.a1;
import T4.C1390x;
import W4.InterfaceC1488k;
import W4.InterfaceC1489l;
import X4.C1498h;
import X4.C1502l;
import X4.C1505o;
import X4.Q;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.ComposerKt;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.InputDeviceCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.AbstractActivityC2489a;
import com.uptodown.activities.preferences.SettingsPreferences;
import com.uptodown.core.view.WrapContentLinearLayoutManager;
import com.uptodown.workers.DownloadApkWorker;
import i6.AbstractC2825i;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.J0;
import i6.M;
import i6.N;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.T;
import l5.C3307A;
import l5.C3319g;
import l5.C3323k;
import l5.C3326n;
import l5.C3329q;
import l5.C3330r;
import l5.C3332t;

/* renamed from: com.uptodown.activities.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractActivityC2489a extends a1 {

    /* renamed from: N, reason: collision with root package name */
    public static final C0700a f29096N = new C0700a(null);

    /* renamed from: A, reason: collision with root package name */
    private AlertDialog f29097A;

    /* renamed from: B, reason: collision with root package name */
    private RecyclerView f29098B;

    /* renamed from: C, reason: collision with root package name */
    private C1099h f29099C;

    /* renamed from: E, reason: collision with root package name */
    private RecyclerView f29101E;

    /* renamed from: F, reason: collision with root package name */
    private C1097f f29102F;

    /* renamed from: H, reason: collision with root package name */
    private long f29104H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f29105I;

    /* renamed from: J, reason: collision with root package name */
    private RecyclerView f29106J;

    /* renamed from: K, reason: collision with root package name */
    private D4.z f29107K;

    /* renamed from: x, reason: collision with root package name */
    private UptodownApp f29110x;

    /* renamed from: y, reason: collision with root package name */
    private C3330r f29111y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f29112z;

    /* renamed from: D, reason: collision with root package name */
    private InterfaceC1489l f29100D = new j();

    /* renamed from: G, reason: collision with root package name */
    private InterfaceC1488k f29103G = new i();

    /* renamed from: L, reason: collision with root package name */
    private W4.y f29108L = new r();

    /* renamed from: M, reason: collision with root package name */
    private ArrayList f29109M = new ArrayList();

    /* renamed from: com.uptodown.activities.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0700a {
        private C0700a() {
        }

        public /* synthetic */ C0700a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: com.uptodown.activities.a$b */
    /* loaded from: classes4.dex */
    public final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!AbstractActivityC2489a.this.y2()) {
                AbstractActivityC2489a abstractActivityC2489a = AbstractActivityC2489a.this;
                String string = abstractActivityC2489a.getString(R.string.error_no_connection);
                AbstractC3159y.h(string, "getString(R.string.error_no_connection)");
                abstractActivityC2489a.e2(string);
            }
        }
    }

    /* renamed from: com.uptodown.activities.a$c */
    /* loaded from: classes4.dex */
    public static final class c extends ItemTouchHelper.SimpleCallback {
        c() {
            super(0, 8);
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
            AbstractC3159y.i(recyclerView, "recyclerView");
            AbstractC3159y.i(viewHolder, "viewHolder");
            AbstractC3159y.i(target, "target");
            return false;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void onSwiped(RecyclerView.ViewHolder viewHolder, int i8) {
            AbstractC3159y.i(viewHolder, "viewHolder");
            int absoluteAdapterPosition = viewHolder.getAbsoluteAdapterPosition();
            D4.z zVar = AbstractActivityC2489a.this.f29107K;
            if (zVar != null) {
                zVar.e(absoluteAdapterPosition);
            }
        }
    }

    /* renamed from: com.uptodown.activities.a$d */
    /* loaded from: classes4.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29115a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.uptodown.activities.a$d$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0701a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f29117a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractActivityC2489a f29118b;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.uptodown.activities.a$d$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0702a extends kotlin.coroutines.jvm.internal.l implements X5.n {

                /* renamed from: a, reason: collision with root package name */
                int f29119a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ T f29120b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ File f29121c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ AbstractActivityC2489a f29122d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0702a(T t8, File file, AbstractActivityC2489a abstractActivityC2489a, P5.d dVar) {
                    super(2, dVar);
                    this.f29120b = t8;
                    this.f29121c = file;
                    this.f29122d = abstractActivityC2489a;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final P5.d create(Object obj, P5.d dVar) {
                    return new C0702a(this.f29120b, this.f29121c, this.f29122d, dVar);
                }

                @Override // X5.n
                public final Object invoke(M m8, P5.d dVar) {
                    return ((C0702a) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Q5.b.e();
                    if (this.f29119a == 0) {
                        L5.t.b(obj);
                        if (this.f29120b.f33747a != null) {
                            C1502l c1502l = new C1502l();
                            File file = this.f29121c;
                            AbstractC3159y.f(file);
                            String absolutePath = file.getAbsolutePath();
                            AbstractC3159y.h(absolutePath, "uptodownApk!!.absolutePath");
                            c1502l.h(absolutePath);
                            c1502l.f(String.valueOf(this.f29121c.lastModified()));
                            this.f29122d.H2((String) this.f29120b.f33747a, c1502l);
                        } else {
                            this.f29122d.F2();
                        }
                        this.f29122d.Q2(true);
                        return L5.I.f6474a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0701a(AbstractActivityC2489a abstractActivityC2489a, P5.d dVar) {
                super(2, dVar);
                this.f29118b = abstractActivityC2489a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new C0701a(this.f29118b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((C0701a) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = Q5.b.e();
                int i8 = this.f29117a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        L5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    L5.t.b(obj);
                    T t8 = new T();
                    File h8 = new C3329q().h(this.f29118b);
                    if (h8 != null) {
                        C3326n a8 = C3326n.f34490t.a(this.f29118b);
                        a8.a();
                        ArrayList X7 = a8.X();
                        a8.g();
                        Iterator it = X7.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                C1502l c1502l = (C1502l) it.next();
                                if (g6.n.s(c1502l.e(), h8.getAbsolutePath(), true) && Long.parseLong(c1502l.a()) == h8.lastModified()) {
                                    break;
                                }
                            } else {
                                C3329q c3329q = new C3329q();
                                String name = h8.getName();
                                AbstractC3159y.h(name, "uptodownApk.name");
                                t8.f33747a = c3329q.i(name);
                                break;
                            }
                        }
                    }
                    J0 c8 = C2812b0.c();
                    C0702a c0702a = new C0702a(t8, h8, this.f29118b, null);
                    this.f29117a = 1;
                    if (AbstractC2825i.g(c8, c0702a, this) == e8) {
                        return e8;
                    }
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
            int i8 = this.f29115a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                i6.I b8 = C2812b0.b();
                C0701a c0701a = new C0701a(AbstractActivityC2489a.this, null);
                this.f29115a = 1;
                if (AbstractC2825i.g(b8, c0701a, this) == e8) {
                    return e8;
                }
            }
            return L5.I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.activities.a$e */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29123a;

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
            Q5.b.e();
            if (this.f29123a == 0) {
                L5.t.b(obj);
                try {
                    AbstractActivityC2489a.this.X1();
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.uptodown.activities.a$f */
    /* loaded from: classes4.dex */
    static final class f extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29125a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f29127c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0 f29128d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0 f29129e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, Function0 function0, Function0 function02, P5.d dVar) {
            super(2, dVar);
            this.f29127c = str;
            this.f29128d = function0;
            this.f29129e = function02;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void l(Function0 function0, AbstractActivityC2489a abstractActivityC2489a, View view) {
            function0.invoke();
            abstractActivityC2489a.q2();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(Function0 function0, AbstractActivityC2489a abstractActivityC2489a, View view) {
            function0.invoke();
            abstractActivityC2489a.q2();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new f(this.f29127c, this.f29128d, this.f29129e, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f29125a == 0) {
                L5.t.b(obj);
                if (!AbstractActivityC2489a.this.isFinishing()) {
                    AlertDialog s22 = AbstractActivityC2489a.this.s2();
                    if (s22 != null) {
                        s22.dismiss();
                    }
                    AlertDialog.Builder builder = new AlertDialog.Builder(AbstractActivityC2489a.this);
                    T4.r c8 = T4.r.c(AbstractActivityC2489a.this.getLayoutInflater());
                    AbstractC3159y.h(c8, "inflate(layoutInflater)");
                    String str = this.f29127c;
                    final Function0 function0 = this.f29128d;
                    final AbstractActivityC2489a abstractActivityC2489a = AbstractActivityC2489a.this;
                    final Function0 function02 = this.f29129e;
                    TextView textView = c8.f10808d;
                    j.a aVar = E4.j.f2272g;
                    textView.setTypeface(aVar.u());
                    c8.f10808d.setText(str);
                    c8.f10809e.setTypeface(aVar.t());
                    c8.f10809e.setOnClickListener(new View.OnClickListener() { // from class: com.uptodown.activities.b
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            AbstractActivityC2489a.f.l(Function0.this, abstractActivityC2489a, view);
                        }
                    });
                    c8.f10807c.setTypeface(aVar.t());
                    c8.f10807c.setOnClickListener(new View.OnClickListener() { // from class: com.uptodown.activities.c
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            AbstractActivityC2489a.f.m(Function0.this, abstractActivityC2489a, view);
                        }
                    });
                    builder.setCancelable(false);
                    builder.setView(c8.getRoot());
                    AbstractActivityC2489a.this.O2(builder.create());
                    if (!AbstractActivityC2489a.this.isFinishing() && AbstractActivityC2489a.this.s2() != null) {
                        AbstractActivityC2489a.this.U2();
                    }
                }
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.uptodown.activities.a$g */
    /* loaded from: classes4.dex */
    static final class g extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ File f29130a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractActivityC2489a f29131b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(File file, AbstractActivityC2489a abstractActivityC2489a) {
            super(0);
            this.f29130a = file;
            this.f29131b = abstractActivityC2489a;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5574invoke();
            return L5.I.f6474a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5574invoke() {
            UptodownApp.a.Z(UptodownApp.f27990B, this.f29130a, this.f29131b, null, 4, null);
        }
    }

    /* renamed from: com.uptodown.activities.a$h */
    /* loaded from: classes4.dex */
    static final class h extends AbstractC3160z implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f29133b;

        /* renamed from: com.uptodown.activities.a$h$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0703a implements W4.r {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractActivityC2489a f29134a;

            C0703a(AbstractActivityC2489a abstractActivityC2489a) {
                this.f29134a = abstractActivityC2489a;
            }

            @Override // W4.r
            public void c(int i8) {
                AbstractActivityC2489a abstractActivityC2489a = this.f29134a;
                String string = abstractActivityC2489a.getString(R.string.app_detail_not_found);
                AbstractC3159y.h(string, "getString(R.string.app_detail_not_found)");
                abstractActivityC2489a.e2(string);
            }

            @Override // W4.r
            public void f(C1498h appInfo) {
                AbstractC3159y.i(appInfo, "appInfo");
                this.f29134a.Y2(appInfo);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(long j8) {
            super(0);
            this.f29133b = j8;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5575invoke();
            return L5.I.f6474a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5575invoke() {
            Context applicationContext = AbstractActivityC2489a.this.getApplicationContext();
            AbstractC3159y.h(applicationContext, "applicationContext");
            new S4.i(applicationContext, this.f29133b, new C0703a(AbstractActivityC2489a.this), LifecycleOwnerKt.getLifecycleScope(AbstractActivityC2489a.this));
        }
    }

    /* renamed from: com.uptodown.activities.a$i */
    /* loaded from: classes4.dex */
    public static final class i implements InterfaceC1488k {
        i() {
        }

        @Override // W4.InterfaceC1488k
        public void a(File file) {
            AbstractC3159y.i(file, "file");
            UptodownApp.a.Z(UptodownApp.f27990B, file, AbstractActivityC2489a.this, null, 4, null);
            AbstractActivityC2489a.this.o2(file);
        }
    }

    /* renamed from: com.uptodown.activities.a$j */
    /* loaded from: classes4.dex */
    public static final class j implements InterfaceC1489l {
        j() {
        }

        @Override // W4.InterfaceC1489l
        public void a() {
            if (UptodownApp.f27990B.a0()) {
                AbstractActivityC2489a.this.I2();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.activities.a$k */
    /* loaded from: classes4.dex */
    public static final class k extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29137a;

        /* renamed from: b, reason: collision with root package name */
        int f29138b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f29139c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AbstractActivityC2489a f29140d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f29141e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(long j8, AbstractActivityC2489a abstractActivityC2489a, int i8, P5.d dVar) {
            super(2, dVar);
            this.f29139c = j8;
            this.f29140d = abstractActivityC2489a;
            this.f29141e = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new k(this.f29139c, this.f29140d, this.f29141e, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((k) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x003d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004d -> B:6:0x0050). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = Q5.b.e()
                int r1 = r7.f29138b
                r2 = 2
                java.lang.String r3 = "downloadApkWorker"
                r4 = 1
                if (r1 == 0) goto L22
                if (r1 == r4) goto L1e
                if (r1 != r2) goto L16
                int r1 = r7.f29137a
                L5.t.b(r8)
                goto L50
            L16:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1e:
                L5.t.b(r8)
                goto L30
            L22:
                L5.t.b(r8)
                long r5 = r7.f29139c
                r7.f29138b = r4
                java.lang.Object r8 = i6.X.b(r5, r7)
                if (r8 != r0) goto L30
                return r0
            L30:
                com.uptodown.UptodownApp$a r8 = com.uptodown.UptodownApp.f27990B
                com.uptodown.activities.a r1 = r7.f29140d
                androidx.work.WorkInfo$State r8 = r8.I(r3, r1)
                r1 = 0
            L39:
                int r5 = r7.f29141e
                if (r1 >= r5) goto L59
                androidx.work.WorkInfo$State r5 = androidx.work.WorkInfo.State.ENQUEUED
                if (r8 != r5) goto L59
                int r1 = r1 + 1
                long r5 = r7.f29139c
                r7.f29137a = r1
                r7.f29138b = r2
                java.lang.Object r8 = i6.X.b(r5, r7)
                if (r8 != r0) goto L50
                return r0
            L50:
                com.uptodown.UptodownApp$a r8 = com.uptodown.UptodownApp.f27990B
                com.uptodown.activities.a r5 = r7.f29140d
                androidx.work.WorkInfo$State r8 = r8.I(r3, r5)
                goto L39
            L59:
                com.uptodown.UptodownApp$a r8 = com.uptodown.UptodownApp.f27990B
                com.uptodown.activities.a r0 = r7.f29140d
                boolean r8 = r8.W(r3, r0)
                if (r8 != 0) goto L84
                l5.k r8 = new l5.k
                r8.<init>()
                com.uptodown.activities.a r0 = r7.f29140d
                java.util.ArrayList r8 = r8.k(r0)
                boolean r0 = r8.isEmpty()
                r0 = r0 ^ r4
                if (r0 == 0) goto L84
                com.uptodown.activities.a r0 = r7.f29140d
                java.lang.Object r8 = M5.AbstractC1246t.m0(r8)
                X4.o r8 = (X4.C1505o) r8
                int r8 = r8.G()
                r0.M2(r0, r8)
            L84:
                L5.I r8 = L5.I.f6474a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.AbstractActivityC2489a.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.uptodown.activities.a$l */
    /* loaded from: classes4.dex */
    public static final class l implements W4.K {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ File f29143b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f29144c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f29145d;

        /* renamed from: com.uptodown.activities.a$l$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0704a extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractActivityC2489a f29146a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ File f29147b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f29148c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f29149d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0704a(AbstractActivityC2489a abstractActivityC2489a, File file, String str, boolean z8) {
                super(0);
                this.f29146a = abstractActivityC2489a;
                this.f29147b = file;
                this.f29148c = str;
                this.f29149d = z8;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5576invoke();
                return L5.I.f6474a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5576invoke() {
                new E4.i(this.f29146a).c(this.f29147b, this.f29148c, this.f29149d);
            }
        }

        l(File file, String str, boolean z8) {
            this.f29143b = file;
            this.f29144c = str;
            this.f29145d = z8;
        }

        @Override // W4.K
        public void a(X4.H reportVT) {
            AbstractC3159y.i(reportVT, "reportVT");
            if (reportVT.f() > 0) {
                new UptodownApp().j1(reportVT, new C0704a(AbstractActivityC2489a.this, this.f29143b, this.f29144c, this.f29145d), AbstractActivityC2489a.this);
            } else {
                new E4.i(AbstractActivityC2489a.this).c(this.f29143b, this.f29144c, this.f29145d);
            }
        }

        @Override // W4.K
        public void b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.activities.a$m */
    /* loaded from: classes4.dex */
    public static final class m extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29150a;

        m(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new m(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((m) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f29150a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                AbstractActivityC2489a abstractActivityC2489a = AbstractActivityC2489a.this;
                this.f29150a = 1;
                if (abstractActivityC2489a.D2(this) == e8) {
                    return e8;
                }
            }
            return L5.I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.activities.a$n */
    /* loaded from: classes4.dex */
    public static final class n extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29152a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.uptodown.activities.a$n$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0705a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f29154a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractActivityC2489a f29155b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ArrayList f29156c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0705a(AbstractActivityC2489a abstractActivityC2489a, ArrayList arrayList, P5.d dVar) {
                super(2, dVar);
                this.f29155b = abstractActivityC2489a;
                this.f29156c = arrayList;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new C0705a(this.f29155b, this.f29156c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((C0705a) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f29154a == 0) {
                    L5.t.b(obj);
                    C1099h c1099h = this.f29155b.f29099C;
                    if (c1099h != null) {
                        c1099h.i(this.f29156c);
                        return L5.I.f6474a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
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
            int i8 = this.f29152a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                ArrayList k8 = new C3323k().k(AbstractActivityC2489a.this);
                J0 c8 = C2812b0.c();
                C0705a c0705a = new C0705a(AbstractActivityC2489a.this, k8, null);
                this.f29152a = 1;
                obj = AbstractC2825i.g(c8, c0705a, this);
                if (obj == e8) {
                    return e8;
                }
            }
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.activities.a$o */
    /* loaded from: classes4.dex */
    public static final class o extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29157a;

        o(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new o(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((o) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f29157a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                AbstractActivityC2489a abstractActivityC2489a = AbstractActivityC2489a.this;
                this.f29157a = 1;
                if (abstractActivityC2489a.Y1(this) == e8) {
                    return e8;
                }
            }
            return L5.I.f6474a;
        }
    }

    /* renamed from: com.uptodown.activities.a$p */
    /* loaded from: classes4.dex */
    public static final class p implements W4.r {
        p() {
        }

        @Override // W4.r
        public void c(int i8) {
        }

        @Override // W4.r
        public void f(C1498h appInfo) {
            AbstractC3159y.i(appInfo, "appInfo");
            if (!AbstractActivityC2489a.this.isFinishing()) {
                Intent intent = new Intent(AbstractActivityC2489a.this, (Class<?>) AppDetailActivity.class);
                intent.putExtra("appInfo", appInfo);
                AbstractActivityC2489a abstractActivityC2489a = AbstractActivityC2489a.this;
                abstractActivityC2489a.startActivity(intent, UptodownApp.f27990B.a(abstractActivityC2489a));
            }
        }
    }

    /* renamed from: com.uptodown.activities.a$q */
    /* loaded from: classes4.dex */
    public static final class q implements W4.r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1502l f29160a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractActivityC2489a f29161b;

        q(C1502l c1502l, AbstractActivityC2489a abstractActivityC2489a) {
            this.f29160a = c1502l;
            this.f29161b = abstractActivityC2489a;
        }

        @Override // W4.r
        public void c(int i8) {
            this.f29161b.F2();
        }

        @Override // W4.r
        public void f(C1498h appInfo) {
            AbstractC3159y.i(appInfo, "appInfo");
            if (appInfo.i() > 0) {
                UptodownApp.f27990B.r0(this.f29160a);
                if (this.f29160a != null) {
                    C3326n a8 = C3326n.f34490t.a(this.f29161b);
                    a8.a();
                    a8.E0(this.f29160a);
                    a8.g();
                }
                this.f29161b.E2(appInfo);
                return;
            }
            this.f29161b.F2();
        }
    }

    /* renamed from: com.uptodown.activities.a$r */
    /* loaded from: classes4.dex */
    public static final class r implements W4.y {
        r() {
        }

        @Override // W4.y
        public void a() {
            if (AbstractActivityC2489a.this.v2().size() > 0) {
                Object remove = AbstractActivityC2489a.this.v2().remove(0);
                AbstractC3159y.h(remove, "preregistrationsToNotify.removeAt(0)");
                AbstractActivityC2489a.this.L2((X4.D) remove);
            }
        }

        @Override // W4.y
        public void b(X4.D preregister) {
            AbstractC3159y.i(preregister, "preregister");
            AbstractActivityC2489a.this.G2(preregister.b());
            D4.z zVar = AbstractActivityC2489a.this.f29107K;
            if (zVar != null) {
                zVar.d(preregister);
            }
        }
    }

    /* renamed from: com.uptodown.activities.a$s */
    /* loaded from: classes4.dex */
    public static final class s implements W4.r {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ X4.D f29164b;

        s(X4.D d8) {
            this.f29164b = d8;
        }

        @Override // W4.r
        public void c(int i8) {
            if (i8 == 404) {
                C3326n a8 = C3326n.f34490t.a(AbstractActivityC2489a.this);
                a8.a();
                a8.c1(this.f29164b.b());
                a8.g();
            }
        }

        @Override // W4.r
        public void f(C1498h appInfo) {
            AbstractC3159y.i(appInfo, "appInfo");
            X4.D d8 = new X4.D();
            d8.j(appInfo.i());
            d8.l(appInfo.s0());
            d8.k(appInfo.l0());
            AbstractActivityC2489a.this.U1(d8);
            C3326n a8 = C3326n.f34490t.a(AbstractActivityC2489a.this);
            a8.a();
            a8.c1(d8.b());
            a8.g();
        }
    }

    public static /* synthetic */ void B2(AbstractActivityC2489a abstractActivityC2489a, File file, String str, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 2) != 0) {
                str = null;
            }
            abstractActivityC2489a.A2(file, str);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launchInstallation");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object D2(P5.d dVar) {
        return AbstractC2825i.g(C2812b0.b(), new n(null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N2(AbstractActivityC2489a this$0) {
        AbstractC3159y.i(this$0, "this$0");
        String string = this$0.getString(R.string.error_no_connection);
        AbstractC3159y.h(string, "getString(R.string.error_no_connection)");
        this$0.e2(string);
    }

    private final void R1(C1505o c1505o) {
        if (c1505o.X() != null) {
            File f8 = new C3329q().f(this);
            String X7 = c1505o.X();
            AbstractC3159y.f(X7);
            final File file = new File(f8, X7);
            if (file.exists()) {
                C1097f c1097f = this.f29102F;
                if (c1097f != null) {
                    c1097f.b(file, c1505o);
                }
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: A4.C
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractActivityC2489a.S1(AbstractActivityC2489a.this, file);
                    }
                }, 5000L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S1(AbstractActivityC2489a this$0, File file) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(file, "$file");
        this$0.o2(file);
    }

    private final void V1() {
        new ItemTouchHelper(new c()).attachToRecyclerView(this.f29106J);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X1() {
        C3326n a8 = C3326n.f34490t.a(this);
        a8.a();
        Iterator it = a8.c0().iterator();
        while (it.hasNext()) {
            C1505o c1505o = (C1505o) it.next();
            if (c1505o.Y() == null || c1505o.a0() <= 0 || c1505o.e0() == 0) {
                a8.x(c1505o);
            }
        }
        a8.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object Y1(P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new e(null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return L5.I.f6474a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b2(Function0 acceptAction, AbstractActivityC2489a this$0, View view) {
        AbstractC3159y.i(acceptAction, "$acceptAction");
        AbstractC3159y.i(this$0, "this$0");
        acceptAction.invoke();
        this$0.q2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c2(AbstractActivityC2489a this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.q2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f2(AbstractActivityC2489a this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.q2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i2(AbstractActivityC2489a this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AlertDialog alertDialog = this$0.f29097A;
        AbstractC3159y.f(alertDialog);
        alertDialog.dismiss();
        this$0.p0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j2(AbstractActivityC2489a this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AlertDialog alertDialog = this$0.f29097A;
        AbstractC3159y.f(alertDialog);
        alertDialog.dismiss();
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l2(AbstractActivityC2489a this$0, Function0 cancelAction, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(cancelAction, "$cancelAction");
        AlertDialog alertDialog = this$0.f29097A;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        cancelAction.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m2(Function0 action, AbstractActivityC2489a this$0, View view) {
        AbstractC3159y.i(action, "$action");
        AbstractC3159y.i(this$0, "this$0");
        action.invoke();
        AlertDialog alertDialog = this$0.f29097A;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n2(Function0 cancelAction, DialogInterface dialogInterface) {
        AbstractC3159y.i(cancelAction, "$cancelAction");
        cancelAction.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o2(final File file) {
        Integer num;
        RecyclerView.ViewHolder findViewHolderForAdapterPosition;
        C1097f c1097f = this.f29102F;
        View view = null;
        if (c1097f != null) {
            num = Integer.valueOf(c1097f.c(file));
        } else {
            num = null;
        }
        if (num != null && num.intValue() >= 0) {
            RecyclerView recyclerView = this.f29101E;
            if (recyclerView != null && (findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(num.intValue())) != null) {
                view = findViewHolderForAdapterPosition.itemView;
            }
            if (view != null) {
                Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_out_left);
                AbstractC3159y.h(loadAnimation, "loadAnimation(\n         …ut_left\n                )");
                loadAnimation.setDuration(300L);
                view.startAnimation(loadAnimation);
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: A4.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractActivityC2489a.p2(AbstractActivityC2489a.this, file);
                    }
                }, loadAnimation.getDuration());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p2(AbstractActivityC2489a this$0, File file) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(file, "$file");
        C1097f c1097f = this$0.f29102F;
        if (c1097f != null) {
            c1097f.e(file);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q2() {
        AlertDialog alertDialog = this.f29097A;
        AbstractC3159y.f(alertDialog);
        alertDialog.dismiss();
        UptodownApp.f27990B.s0(false);
    }

    public final void A2(File item, String str) {
        String str2;
        AbstractC3159y.i(item, "item");
        boolean x8 = new C3319g().x(this);
        Q e8 = Q.f12424k.e(this);
        C3326n a8 = C3326n.f34490t.a(this);
        a8.a();
        String name = item.getName();
        AbstractC3159y.h(name, "item.name");
        C1505o Y7 = a8.Y(name);
        a8.g();
        if (e8 != null && e8.G()) {
            if (Y7 != null) {
                str2 = Y7.u();
            } else {
                str2 = null;
            }
            if (str2 == null || str2.length() == 0) {
                new S4.m(this, null, N4.d.f7188a.e(item.getAbsolutePath()), new l(item, str, x8), LifecycleOwnerKt.getLifecycleScope(this));
                return;
            }
        }
        new E4.i(this).c(item, str, x8);
    }

    public final void C2() {
        if (SettingsPreferences.f29309b.U(this)) {
            AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new m(null), 3, null);
        }
    }

    public void E2(C1498h appInfo) {
        AbstractC3159y.i(appInfo, "appInfo");
        Y2(appInfo);
    }

    public void F2() {
    }

    public void G2(long j8) {
        if (j8 > 0) {
            new S4.i(this, j8, new p(), LifecycleOwnerKt.getLifecycleScope(this));
        } else {
            I2();
        }
    }

    public final void H2(String packageNameToOpen, C1502l c1502l) {
        AbstractC3159y.i(packageNameToOpen, "packageNameToOpen");
        new S4.j(this, packageNameToOpen, new q(c1502l, this), LifecycleOwnerKt.getLifecycleScope(this));
    }

    public final void I2() {
        Object obj = C3307A.f34459a.d().get(r0.d().size() - 1);
        AbstractC3159y.h(obj, "StaticResources.activity….activity_stack.size - 1]");
        Activity activity = (Activity) obj;
        if (!isFinishing() && !(activity instanceof MyDownloads)) {
            startActivity(new Intent(this, (Class<?>) MyDownloads.class), UptodownApp.f27990B.a(this));
        }
    }

    public final void J2(String str) {
        if (str != null && !isFinishing()) {
            String q8 = new C3319g().q(str);
            String string = getString(R.string.virustotal_safety_report_title);
            AbstractC3159y.h(string, "getString(R.string.virustotal_safety_report_title)");
            new C3323k().q(this, q8, string);
        }
    }

    public final void K2(C1505o download) {
        ArrayList arrayList;
        AbstractC3159y.i(download, "download");
        C1099h c1099h = this.f29099C;
        if (c1099h != null) {
            c1099h.h(download);
        }
        C1099h c1099h2 = this.f29099C;
        if (c1099h2 != null) {
            arrayList = c1099h2.f();
        } else {
            arrayList = null;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            w2();
        }
    }

    public final void L2(X4.D preregister) {
        AbstractC3159y.i(preregister, "preregister");
        new S4.i(this, preregister.b(), new s(preregister), LifecycleOwnerKt.getLifecycleScope(this));
    }

    public final void M2(Context context, int i8) {
        AbstractC3159y.i(context, "context");
        if (C3332t.f34516a.d()) {
            DownloadApkWorker.f29987k.f(context, i8);
        } else {
            runOnUiThread(new Runnable() { // from class: A4.s
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractActivityC2489a.N2(AbstractActivityC2489a.this);
                }
            });
        }
    }

    public final void O2(AlertDialog alertDialog) {
        this.f29097A = alertDialog;
    }

    public final void P2() {
        this.f29111y = new C3330r(this);
    }

    public final void Q2(boolean z8) {
        this.f29105I = z8;
    }

    public final void R2(Window window) {
        WindowInsetsController insetsController;
        int statusBars;
        int navigationBars;
        AbstractC3159y.i(window, "window");
        if (Build.VERSION.SDK_INT >= 30) {
            insetsController = window.getInsetsController();
            if (insetsController != null) {
                statusBars = WindowInsets.Type.statusBars();
                navigationBars = WindowInsets.Type.navigationBars();
                insetsController.hide(statusBars | navigationBars);
                insetsController.setSystemBarsBehavior(2);
                return;
            }
            return;
        }
        window.getDecorView().setSystemUiVisibility(4);
        window.getDecorView().setSystemUiVisibility(InputDeviceCompat.SOURCE_TOUCHSCREEN);
    }

    public final void S2(ArrayList arrayList) {
        AbstractC3159y.i(arrayList, "<set-?>");
        this.f29109M = arrayList;
    }

    public final void T1(C1505o download) {
        ArrayList arrayList;
        AbstractC3159y.i(download, "download");
        C1099h c1099h = this.f29099C;
        if (c1099h != null) {
            c1099h.e(download);
        }
        C1099h c1099h2 = this.f29099C;
        if (c1099h2 != null) {
            arrayList = c1099h2.f();
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            V2();
        }
    }

    public final void T2(Drawable drawable, int i8) {
        AbstractC3159y.i(drawable, "drawable");
        DrawableCompat.setTint(drawable, i8);
    }

    public final void U1(X4.D preRegister) {
        AbstractC3159y.i(preRegister, "preRegister");
        D4.z zVar = this.f29107K;
        if (zVar != null) {
            zVar.b(preRegister);
        }
    }

    public final void U2() {
        AlertDialog alertDialog = this.f29097A;
        AbstractC3159y.f(alertDialog);
        Window window = alertDialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        AlertDialog alertDialog2 = this.f29097A;
        AbstractC3159y.f(alertDialog2);
        alertDialog2.show();
        UptodownApp.f27990B.s0(true);
    }

    public final void V2() {
        RecyclerView recyclerView = this.f29098B;
        if (recyclerView != null && recyclerView.getVisibility() == 8) {
            RecyclerView recyclerView2 = this.f29098B;
            if (recyclerView2 != null) {
                recyclerView2.startAnimation(AnimationUtils.loadAnimation(this, R.anim.slide_next_in));
            }
            RecyclerView recyclerView3 = this.f29098B;
            if (recyclerView3 != null) {
                recyclerView3.setVisibility(0);
            }
        }
    }

    public final void W1() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f29104H > ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) {
            this.f29104H = currentTimeMillis;
            AbstractC2829k.d(N.a(C2812b0.b()), null, null, new d(null), 3, null);
        }
    }

    public void W2(long j8) {
        String string = getString(R.string.core_kill_this_app, getString(R.string.app_name));
        AbstractC3159y.h(string, "getString(R.string.core_…tring(R.string.app_name))");
        e2(string);
    }

    public final void X2(int i8, C1505o download, boolean z8) {
        AbstractC3159y.i(download, "download");
        switch (i8) {
            case 199:
                C1099h c1099h = this.f29099C;
                if (c1099h != null) {
                    c1099h.j(download, i8);
                    return;
                }
                return;
            case 200:
                C1099h c1099h2 = this.f29099C;
                if (c1099h2 != null) {
                    c1099h2.j(download, i8);
                    return;
                }
                return;
            case ComposerKt.providerKey /* 201 */:
                C1099h c1099h3 = this.f29099C;
                if (c1099h3 != null) {
                    c1099h3.j(download, i8);
                    return;
                }
                return;
            case ComposerKt.compositionLocalMapKey /* 202 */:
                K2(download);
                return;
            case ComposerKt.providerValuesKey /* 203 */:
                C2();
                return;
            case ComposerKt.providerMapsKey /* 204 */:
            default:
                return;
            case 205:
                C1099h c1099h4 = this.f29099C;
                if (c1099h4 != null) {
                    c1099h4.j(download, i8);
                    return;
                }
                return;
            case ComposerKt.referenceKey /* 206 */:
                K2(download);
                if (z8) {
                    R1(download);
                    return;
                }
                return;
            case ComposerKt.reuseKey /* 207 */:
                K2(download);
                return;
            case 208:
                C2();
                return;
        }
    }

    public void Y2(C1498h appInfo) {
        AbstractC3159y.i(appInfo, "appInfo");
    }

    public final void Z1(String msg, final Function0 acceptAction) {
        AbstractC3159y.i(msg, "msg");
        AbstractC3159y.i(acceptAction, "acceptAction");
        if (!isFinishing()) {
            AlertDialog alertDialog = this.f29097A;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            T4.r c8 = T4.r.c(getLayoutInflater());
            AbstractC3159y.h(c8, "inflate(layoutInflater)");
            TextView textView = c8.f10808d;
            j.a aVar = E4.j.f2272g;
            textView.setTypeface(aVar.u());
            c8.f10808d.setText(msg);
            c8.f10809e.setTypeface(aVar.t());
            c8.f10809e.setOnClickListener(new View.OnClickListener() { // from class: A4.u
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractActivityC2489a.b2(Function0.this, this, view);
                }
            });
            c8.f10807c.setTypeface(aVar.t());
            c8.f10807c.setOnClickListener(new View.OnClickListener() { // from class: A4.v
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractActivityC2489a.c2(AbstractActivityC2489a.this, view);
                }
            });
            builder.setView(c8.getRoot());
            this.f29097A = builder.create();
            if (!isFinishing() && this.f29097A != null) {
                U2();
            }
        }
    }

    public final void a2(String msg, Function0 acceptAction, Function0 cancelAction) {
        AbstractC3159y.i(msg, "msg");
        AbstractC3159y.i(acceptAction, "acceptAction");
        AbstractC3159y.i(cancelAction, "cancelAction");
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new f(msg, acceptAction, cancelAction, null), 2, null);
    }

    @Override // F4.r
    public void c0() {
    }

    @Override // F4.r
    public void d0() {
    }

    @Override // F4.a1
    public void d1() {
    }

    public final void d2(File updateFile) {
        AbstractC3159y.i(updateFile, "updateFile");
        String string = getString(R.string.warning_auto_update);
        AbstractC3159y.h(string, "getString(R.string.warning_auto_update)");
        Z1(string, new g(updateFile, this));
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getSource() == 8194) {
            return true;
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // F4.r
    public void e0() {
    }

    public final void e2(String msg) {
        AbstractC3159y.i(msg, "msg");
        if (!isFinishing()) {
            AlertDialog alertDialog = this.f29097A;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            T4.r c8 = T4.r.c(getLayoutInflater());
            AbstractC3159y.h(c8, "inflate(layoutInflater)");
            TextView textView = c8.f10808d;
            j.a aVar = E4.j.f2272g;
            textView.setTypeface(aVar.u());
            c8.f10808d.setText(msg);
            c8.f10807c.setVisibility(8);
            c8.f10809e.setTypeface(aVar.t());
            c8.f10809e.setOnClickListener(new View.OnClickListener() { // from class: A4.y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractActivityC2489a.f2(AbstractActivityC2489a.this, view);
                }
            });
            builder.setView(c8.getRoot());
            this.f29097A = builder.create();
            if (!isFinishing() && this.f29097A != null) {
                U2();
            }
        }
    }

    @Override // F4.r
    public void f0() {
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.fade_in, R.anim.right_to_left_out);
    }

    public final void g2(String str, String str2, long j8) {
        Z1(str + '\n' + str2, new h(j8));
    }

    @Override // F4.r
    public void h0() {
    }

    public final void h2() {
        AlertDialog alertDialog;
        if (!isFinishing()) {
            AlertDialog alertDialog2 = this.f29097A;
            if (alertDialog2 != null) {
                alertDialog2.dismiss();
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            T4.r c8 = T4.r.c(getLayoutInflater());
            AbstractC3159y.h(c8, "inflate(layoutInflater)");
            TextView textView = c8.f10808d;
            j.a aVar = E4.j.f2272g;
            textView.setTypeface(aVar.u());
            c8.f10808d.setText(getString(R.string.msg_storage_permission_required));
            c8.f10809e.setTypeface(aVar.t());
            c8.f10809e.setOnClickListener(new View.OnClickListener() { // from class: A4.w
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractActivityC2489a.i2(AbstractActivityC2489a.this, view);
                }
            });
            c8.f10807c.setTypeface(aVar.t());
            c8.f10807c.setText(getString(R.string.exit));
            c8.f10807c.setOnClickListener(new View.OnClickListener() { // from class: A4.x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractActivityC2489a.j2(AbstractActivityC2489a.this, view);
                }
            });
            builder.setView(c8.getRoot());
            builder.setCancelable(false);
            this.f29097A = builder.create();
            if (!isFinishing() && (alertDialog = this.f29097A) != null) {
                AbstractC3159y.f(alertDialog);
                Window window = alertDialog.getWindow();
                if (window != null) {
                    window.setBackgroundDrawable(new ColorDrawable(0));
                }
                AlertDialog alertDialog3 = this.f29097A;
                AbstractC3159y.f(alertDialog3);
                alertDialog3.show();
            }
        }
    }

    public final void k2(C1498h appInfo, final Function0 action, final Function0 cancelAction) {
        AbstractC3159y.i(appInfo, "appInfo");
        AbstractC3159y.i(action, "action");
        AbstractC3159y.i(cancelAction, "cancelAction");
        AlertDialog alertDialog = this.f29097A;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        C1390x c8 = C1390x.c(getLayoutInflater());
        AbstractC3159y.h(c8, "inflate(layoutInflater)");
        TextView textView = c8.f10948e;
        j.a aVar = E4.j.f2272g;
        textView.setTypeface(aVar.t());
        c8.f10947d.setTypeface(aVar.u());
        c8.f10945b.setOnClickListener(new View.OnClickListener() { // from class: A4.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractActivityC2489a.l2(AbstractActivityC2489a.this, cancelAction, view);
            }
        });
        if (appInfo.o1()) {
            c8.f10947d.setText(appInfo.Y());
            c8.f10946c.setText(getString(R.string.leave_anyways));
        } else {
            c8.f10946c.setText(getString(R.string.download_anyways));
        }
        c8.f10946c.setTypeface(aVar.t());
        c8.f10946c.setOnClickListener(new View.OnClickListener() { // from class: A4.A
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractActivityC2489a.m2(Function0.this, this, view);
            }
        });
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(c8.getRoot());
        builder.setCancelable(true);
        builder.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: A4.B
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                AbstractActivityC2489a.n2(Function0.this, dialogInterface);
            }
        });
        this.f29097A = builder.create();
        U2();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Application application = getApplication();
        AbstractC3159y.g(application, "null cannot be cast to non-null type com.uptodown.UptodownApp");
        this.f29110x = (UptodownApp) application;
        this.f29111y = new C3330r(this);
        C3307A c3307a = C3307A.f34459a;
        c3307a.d().add(this);
        if (c3307a.d().size() == 1) {
            AbstractC2829k.d(N.a(C2812b0.b()), null, null, new o(null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        C3307A.f34459a.d().remove(this);
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f29112z = false;
        UptodownApp uptodownApp = this.f29110x;
        AbstractC3159y.f(uptodownApp);
        uptodownApp.m1();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // F4.a1, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f29112z = true;
        UptodownApp uptodownApp = this.f29110x;
        AbstractC3159y.f(uptodownApp);
        uptodownApp.n1();
        C2();
        z2();
    }

    public final boolean r2() {
        return this.f29112z;
    }

    public final AlertDialog s2() {
        return this.f29097A;
    }

    public final boolean t2() {
        return this.f29105I;
    }

    public final C3330r u2() {
        return this.f29111y;
    }

    public final ArrayList v2() {
        return this.f29109M;
    }

    public final void w2() {
        RecyclerView recyclerView = this.f29098B;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
    }

    public final void x2() {
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.rl_floating_queue);
        if (UptodownApp.f27990B.S()) {
            relativeLayout.removeAllViews();
            relativeLayout.setVisibility(8);
            return;
        }
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_floating_notifications);
        this.f29101E = recyclerView;
        if (recyclerView != null) {
            AbstractC3159y.f(recyclerView);
            recyclerView.setLayoutManager(new WrapContentLinearLayoutManager(this, 1, false));
            RecyclerView recyclerView2 = this.f29101E;
            AbstractC3159y.f(recyclerView2);
            recyclerView2.addItemDecoration(new n5.o((int) getResources().getDimension(R.dimen.margin_m)));
            this.f29102F = new C1097f(this, this.f29103G);
            RecyclerView recyclerView3 = this.f29101E;
            AbstractC3159y.f(recyclerView3);
            recyclerView3.setAdapter(this.f29102F);
        }
        if (this.f29098B == null) {
            RecyclerView recyclerView4 = (RecyclerView) findViewById(R.id.rv_floating_queue);
            this.f29098B = recyclerView4;
            if (recyclerView4 != null) {
                AbstractC3159y.f(recyclerView4);
                recyclerView4.setLayoutManager(new WrapContentLinearLayoutManager(this, 0, false));
                RecyclerView recyclerView5 = this.f29098B;
                AbstractC3159y.f(recyclerView5);
                recyclerView5.addItemDecoration(new n5.p((int) getResources().getDimension(R.dimen.margin_m)));
                RecyclerView recyclerView6 = this.f29098B;
                AbstractC3159y.f(recyclerView6);
                recyclerView6.setItemAnimator(null);
                this.f29099C = new C1099h(this, this.f29100D);
                RecyclerView recyclerView7 = this.f29098B;
                AbstractC3159y.f(recyclerView7);
                recyclerView7.setAdapter(this.f29099C);
            }
        }
        RecyclerView recyclerView8 = (RecyclerView) findViewById(R.id.rv_preregister_notifications);
        this.f29106J = recyclerView8;
        if (recyclerView8 != null) {
            AbstractC3159y.f(recyclerView8);
            recyclerView8.setLayoutManager(new WrapContentLinearLayoutManager(this, 1, false));
            RecyclerView recyclerView9 = this.f29106J;
            AbstractC3159y.f(recyclerView9);
            recyclerView9.addItemDecoration(new n5.o((int) getResources().getDimension(R.dimen.margin_m)));
            this.f29107K = new D4.z(this, this.f29108L);
            RecyclerView recyclerView10 = this.f29106J;
            AbstractC3159y.f(recyclerView10);
            recyclerView10.setAdapter(this.f29107K);
            V1();
        }
    }

    public final boolean y2() {
        AlertDialog alertDialog = this.f29097A;
        if (alertDialog == null || !alertDialog.isShowing()) {
            return false;
        }
        return true;
    }

    public final void z2() {
        AbstractC2829k.d(N.a(C2812b0.a()), null, null, new k(5000L, this, 5, null), 3, null);
    }
}
