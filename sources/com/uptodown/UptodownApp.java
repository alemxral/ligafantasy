package com.uptodown;

import E4.j;
import F4.r;
import J4.f;
import L5.I;
import L5.t;
import N4.q;
import S4.m;
import T4.C1387u;
import W4.K;
import X4.C1496f;
import X4.C1502l;
import X4.C1503m;
import X4.C1505o;
import X4.H;
import X4.O;
import X4.Q;
import X5.n;
import Y4.g;
import Y4.i;
import a5.InterfaceC1575a;
import android.app.Activity;
import android.app.ActivityOptions;
import android.app.AlertDialog;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.UiModeManager;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.autofill.HintConstants;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import com.inmobi.cmp.ChoiceCmp;
import com.inmobi.cmp.ChoiceCmpCallback;
import com.inmobi.cmp.core.model.ACData;
import com.inmobi.cmp.core.model.GDPRData;
import com.inmobi.cmp.core.model.gbc.GoogleBasicConsents;
import com.inmobi.cmp.core.model.mspa.USRegulationData;
import com.inmobi.cmp.model.ChoiceError;
import com.inmobi.cmp.model.NonIABData;
import com.inmobi.cmp.model.PingReturn;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.uptodown.UptodownApp;
import com.uptodown.activities.AppDetailActivity;
import com.uptodown.activities.AppInstalledDetailsActivity;
import com.uptodown.activities.MainActivity;
import com.uptodown.activities.MyApps;
import com.uptodown.activities.MyDownloads;
import com.uptodown.activities.OldVersionsActivity;
import com.uptodown.activities.Updates;
import com.uptodown.activities.WishlistActivity;
import com.uptodown.activities.preferences.SettingsPreferences;
import com.uptodown.core.activities.InstallerActivity;
import com.uptodown.tv.ui.activity.TvAppDetailActivity;
import com.uptodown.workers.DownloadUpdatesWorker;
import com.uptodown.workers.GetUserDataWorker;
import com.uptodown.workers.PreRegisterWorker;
import com.uptodown.workers.SearchApksWorker;
import com.uptodown.workers.TrackingWorker;
import d2.InterfaceC2541e;
import g6.h;
import i6.AbstractC2825i;
import i6.C2812b0;
import i6.M;
import i6.N;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.Y;
import l5.C3307A;
import l5.C3311E;
import l5.C3319g;
import l5.C3323k;
import l5.C3326n;
import l5.C3330r;
import l5.C3332t;
import l5.C3334v;
import l5.C3335w;
import p5.C3609g;
import x0.InterfaceFutureC3857a;
import z4.AbstractC4026d;

/* loaded from: classes4.dex */
public final class UptodownApp extends j implements ChoiceCmpCallback {

    /* renamed from: D, reason: collision with root package name */
    private static String f27992D;

    /* renamed from: E, reason: collision with root package name */
    private static String f27993E;

    /* renamed from: F, reason: collision with root package name */
    private static String f27994F;

    /* renamed from: G, reason: collision with root package name */
    private static String f27995G;

    /* renamed from: H, reason: collision with root package name */
    private static String f27996H;

    /* renamed from: I, reason: collision with root package name */
    private static String f27997I;

    /* renamed from: J, reason: collision with root package name */
    private static String f27998J;

    /* renamed from: K, reason: collision with root package name */
    private static String f27999K;

    /* renamed from: L, reason: collision with root package name */
    private static String f28000L;

    /* renamed from: M, reason: collision with root package name */
    private static String f28001M;

    /* renamed from: N, reason: collision with root package name */
    private static int f28002N;

    /* renamed from: O, reason: collision with root package name */
    private static int f28003O;

    /* renamed from: P, reason: collision with root package name */
    private static int f28004P;

    /* renamed from: Q, reason: collision with root package name */
    private static int f28005Q;

    /* renamed from: R, reason: collision with root package name */
    private static int f28006R;

    /* renamed from: S, reason: collision with root package name */
    private static InterfaceC2541e f28007S;

    /* renamed from: T, reason: collision with root package name */
    private static InterfaceC2541e f28008T;

    /* renamed from: W, reason: collision with root package name */
    private static boolean f28011W;

    /* renamed from: X, reason: collision with root package name */
    private static int f28012X;

    /* renamed from: Y, reason: collision with root package name */
    private static int f28013Y;

    /* renamed from: Z, reason: collision with root package name */
    private static boolean f28014Z;

    /* renamed from: p0, reason: collision with root package name */
    private static C1502l f28015p0;

    /* renamed from: q0, reason: collision with root package name */
    private static boolean f28016q0;

    /* renamed from: s0, reason: collision with root package name */
    private static ArrayList f28018s0;

    /* renamed from: t0, reason: collision with root package name */
    private static boolean f28019t0;

    /* renamed from: u0, reason: collision with root package name */
    private static long f28020u0;

    /* renamed from: v0, reason: collision with root package name */
    private static ArrayList f28021v0;

    /* renamed from: A, reason: collision with root package name */
    private Y4.b f28026A;

    /* renamed from: y, reason: collision with root package name */
    private Y4.a f28027y;

    /* renamed from: z, reason: collision with root package name */
    private Y4.c f28028z;

    /* renamed from: B, reason: collision with root package name */
    public static final a f27990B = new a(null);

    /* renamed from: C, reason: collision with root package name */
    private static float f27991C = 1.0f;

    /* renamed from: U, reason: collision with root package name */
    private static final HashMap f28009U = new HashMap();

    /* renamed from: V, reason: collision with root package name */
    private static i f28010V = new i(null);

    /* renamed from: r0, reason: collision with root package name */
    private static final Object f28017r0 = new Object();

    /* renamed from: w0, reason: collision with root package name */
    private static final Object f28022w0 = new Object();

    /* renamed from: x0, reason: collision with root package name */
    private static final Object f28023x0 = new Object();

    /* renamed from: y0, reason: collision with root package name */
    private static final Object f28024y0 = new Object();

    /* renamed from: z0, reason: collision with root package name */
    private static final Object f28025z0 = new Object();

    /* renamed from: A0, reason: collision with root package name */
    private static ArrayList f27989A0 = new ArrayList();

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: com.uptodown.UptodownApp$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0696a implements InterfaceC1575a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f28029a;

            C0696a(Context context) {
                this.f28029a = context;
            }

            @Override // a5.InterfaceC1575a
            public void a(String str) {
                Bundle bundle = new Bundle();
                bundle.putString("type", "failed");
                new C3330r(this.f28029a).b("uptodown_services_init", bundle);
            }

            @Override // a5.InterfaceC1575a
            public void b() {
                Bundle bundle = new Bundle();
                bundle.putString("type", "success");
                new C3330r(this.f28029a).b("uptodown_services_init", bundle);
            }

            @Override // a5.InterfaceC1575a
            public void c() {
            }
        }

        /* loaded from: classes4.dex */
        static final class b extends l implements n {

            /* renamed from: a, reason: collision with root package name */
            int f28030a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InstallerActivity f28031b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(InstallerActivity installerActivity, P5.d dVar) {
                super(2, dVar);
                this.f28031b = installerActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new b(this.f28031b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = Q5.b.e();
                int i8 = this.f28030a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    InstallerActivity installerActivity = this.f28031b;
                    this.f28030a = 1;
                    if (installerActivity.l2(1, this) == e8) {
                        return e8;
                    }
                }
                return I.f6474a;
            }
        }

        /* loaded from: classes4.dex */
        static final class c extends l implements n {

            /* renamed from: a, reason: collision with root package name */
            int f28032a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Activity f28033b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f28034c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(Activity activity, String str, P5.d dVar) {
                super(2, dVar);
                this.f28033b = activity;
                this.f28034c = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new c(this.f28033b, this.f28034c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((c) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = Q5.b.e();
                int i8 = this.f28032a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    OldVersionsActivity oldVersionsActivity = (OldVersionsActivity) this.f28033b;
                    String str = this.f28034c;
                    this.f28032a = 1;
                    if (oldVersionsActivity.F3(str, this) == e8) {
                        return e8;
                    }
                }
                return I.f6474a;
            }
        }

        /* loaded from: classes4.dex */
        static final class d extends l implements n {

            /* renamed from: a, reason: collision with root package name */
            int f28035a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Activity f28036b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f28037c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f28038d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(Activity activity, String str, boolean z8, P5.d dVar) {
                super(2, dVar);
                this.f28036b = activity;
                this.f28037c = str;
                this.f28038d = z8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new d(this.f28036b, this.f28037c, this.f28038d, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((d) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = Q5.b.e();
                int i8 = this.f28035a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    MainActivity mainActivity = (MainActivity) this.f28036b;
                    String str = this.f28037c;
                    this.f28035a = 1;
                    if (mainActivity.C7(str, this) == e8) {
                        return e8;
                    }
                }
                if (this.f28038d) {
                    ((MainActivity) this.f28036b).I7();
                }
                ((MainActivity) this.f28036b).K7(this.f28037c);
                return I.f6474a;
            }
        }

        /* loaded from: classes4.dex */
        static final class e extends l implements n {

            /* renamed from: a, reason: collision with root package name */
            int f28039a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Activity f28040b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(Activity activity, P5.d dVar) {
                super(2, dVar);
                this.f28040b = activity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new e(this.f28040b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((e) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f28039a == 0) {
                    t.b(obj);
                    ((MyDownloads) this.f28040b).o4(false);
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* loaded from: classes4.dex */
        static final class f extends l implements n {

            /* renamed from: a, reason: collision with root package name */
            int f28041a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Activity f28042b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f28043c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(Activity activity, String str, P5.d dVar) {
                super(2, dVar);
                this.f28042b = activity;
                this.f28043c = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new f(this.f28042b, this.f28043c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((f) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = Q5.b.e();
                int i8 = this.f28041a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    MyApps myApps = (MyApps) this.f28042b;
                    String str = this.f28043c;
                    this.f28041a = 1;
                    if (myApps.K4("app_updated", str, this) == e8) {
                        return e8;
                    }
                }
                return I.f6474a;
            }
        }

        /* loaded from: classes4.dex */
        static final class g extends l implements n {

            /* renamed from: a, reason: collision with root package name */
            int f28044a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f28045b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Activity f28046c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f28047d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            g(boolean z8, Activity activity, String str, P5.d dVar) {
                super(2, dVar);
                this.f28045b = z8;
                this.f28046c = activity;
                this.f28047d = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new g(this.f28045b, this.f28046c, this.f28047d, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((g) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = Q5.b.e();
                int i8 = this.f28044a;
                if (i8 != 0) {
                    if (i8 != 1 && i8 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                } else {
                    t.b(obj);
                    if (this.f28045b) {
                        Updates updates = (Updates) this.f28046c;
                        String str = this.f28047d;
                        this.f28044a = 1;
                        if (updates.R4("app_updated", str, this) == e8) {
                            return e8;
                        }
                    } else {
                        Updates updates2 = (Updates) this.f28046c;
                        String str2 = this.f28047d;
                        this.f28044a = 2;
                        if (updates2.R4("app_installed", str2, this) == e8) {
                            return e8;
                        }
                    }
                }
                return I.f6474a;
            }
        }

        /* loaded from: classes4.dex */
        static final class h extends l implements n {

            /* renamed from: a, reason: collision with root package name */
            int f28048a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f28049b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Activity f28050c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            h(boolean z8, Activity activity, P5.d dVar) {
                super(2, dVar);
                this.f28049b = z8;
                this.f28050c = activity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new h(this.f28049b, this.f28050c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((h) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = Q5.b.e();
                int i8 = this.f28048a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    if (this.f28049b) {
                        AppInstalledDetailsActivity appInstalledDetailsActivity = (AppInstalledDetailsActivity) this.f28050c;
                        this.f28048a = 1;
                        if (appInstalledDetailsActivity.T4("app_updated", this) == e8) {
                            return e8;
                        }
                    }
                }
                return I.f6474a;
            }
        }

        /* loaded from: classes4.dex */
        static final class i extends l implements n {

            /* renamed from: a, reason: collision with root package name */
            int f28051a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Activity f28052b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f28053c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            i(Activity activity, String str, P5.d dVar) {
                super(2, dVar);
                this.f28052b = activity;
                this.f28053c = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new i(this.f28052b, this.f28053c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((i) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = Q5.b.e();
                int i8 = this.f28051a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    TvAppDetailActivity tvAppDetailActivity = (TvAppDetailActivity) this.f28052b;
                    String str = this.f28053c;
                    this.f28051a = 1;
                    if (tvAppDetailActivity.p(str, this) == e8) {
                        return e8;
                    }
                }
                return I.f6474a;
            }
        }

        /* loaded from: classes4.dex */
        static final class j extends l implements n {

            /* renamed from: a, reason: collision with root package name */
            int f28054a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Activity f28055b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f28056c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(Activity activity, String str, P5.d dVar) {
                super(2, dVar);
                this.f28055b = activity;
                this.f28056c = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new j(this.f28055b, this.f28056c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((j) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f28054a == 0) {
                    t.b(obj);
                    ((WishlistActivity) this.f28055b).V4(this.f28056c);
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        private a() {
        }

        private final void L0(Context context, boolean z8, boolean z9) {
            Data build = new Data.Builder().putBoolean("isCompressed", z8).putBoolean("downloadUpdates", z9).build();
            AbstractC3159y.h(build, "Builder()\n              …\n                .build()");
            WorkManager.getInstance(context).enqueue(new OneTimeWorkRequest.Builder(TrackingWorker.class).addTag("TrackingWorkerSingle").setBackoffCriteria(BackoffPolicy.LINEAR, 1L, TimeUnit.MINUTES).setInputData(build).setConstraints(new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build()).build());
        }

        public static /* synthetic */ boolean N0(a aVar, Context context, boolean z8, boolean z9, int i8, Object obj) {
            if ((i8 & 2) != 0) {
                z8 = true;
            }
            if ((i8 & 4) != 0) {
                z9 = true;
            }
            return aVar.M0(context, z8, z9);
        }

        public static /* synthetic */ void Z(a aVar, File file, Context context, String str, int i8, Object obj) {
            if ((i8 & 4) != 0) {
                str = null;
            }
            aVar.Y(file, context, str);
        }

        private final int d(float f8) {
            return (int) (f8 * UptodownApp.f27991C);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
        
            r7 = com.uptodown.UptodownApp.f28018s0;
            kotlin.jvm.internal.AbstractC3159y.f(r7);
            r7.remove(r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
        
            r2 = true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final boolean d0(java.lang.String r7) {
            /*
                r6 = this;
                java.lang.Object r0 = com.uptodown.UptodownApp.m0()
                monitor-enter(r0)
                java.util.ArrayList r1 = com.uptodown.UptodownApp.B0()     // Catch: java.lang.Throwable -> L3e
                r2 = 0
                if (r1 == 0) goto L43
                java.util.ArrayList r1 = com.uptodown.UptodownApp.B0()     // Catch: java.lang.Throwable -> L3e
                kotlin.jvm.internal.AbstractC3159y.f(r1)     // Catch: java.lang.Throwable -> L3e
                int r1 = r1.size()     // Catch: java.lang.Throwable -> L3e
                r3 = 0
            L18:
                if (r3 >= r1) goto L43
                java.util.ArrayList r4 = com.uptodown.UptodownApp.B0()     // Catch: java.lang.Throwable -> L3e
                kotlin.jvm.internal.AbstractC3159y.f(r4)     // Catch: java.lang.Throwable -> L3e
                java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.Throwable -> L3e
                X4.f r4 = (X4.C1496f) r4     // Catch: java.lang.Throwable -> L3e
                java.lang.String r4 = r4.Q()     // Catch: java.lang.Throwable -> L3e
                r5 = 1
                boolean r4 = g6.n.s(r7, r4, r5)     // Catch: java.lang.Throwable -> L3e
                if (r4 == 0) goto L40
                java.util.ArrayList r7 = com.uptodown.UptodownApp.B0()     // Catch: java.lang.Throwable -> L3e
                kotlin.jvm.internal.AbstractC3159y.f(r7)     // Catch: java.lang.Throwable -> L3e
                r7.remove(r3)     // Catch: java.lang.Throwable -> L3e
                r2 = 1
                goto L43
            L3e:
                r7 = move-exception
                goto L45
            L40:
                int r3 = r3 + 1
                goto L18
            L43:
                monitor-exit(r0)
                return r2
            L45:
                monitor-exit(r0)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uptodown.UptodownApp.a.d0(java.lang.String):boolean");
        }

        private final void k0(Context context) {
            Constraints build = new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build();
            TimeUnit timeUnit = TimeUnit.MINUTES;
            WorkManager.getInstance(context).enqueue(new PeriodicWorkRequest.Builder((Class<? extends ListenableWorker>) TrackingWorker.class, 30L, timeUnit).addTag("TrackingWorkerPeriodic").setBackoffCriteria(BackoffPolicy.LINEAR, 1L, timeUnit).setConstraints(build).build());
        }

        public final int A() {
            return UptodownApp.f28004P;
        }

        public final void A0(String str) {
            UptodownApp.f27992D = str;
        }

        public final int B() {
            return UptodownApp.f28005Q;
        }

        public final void B0(ArrayList arrayList) {
            UptodownApp.f28021v0 = arrayList;
        }

        public final String C() {
            return UptodownApp.f27999K;
        }

        public final void C0(boolean z8) {
            UptodownApp.f28011W = z8;
        }

        public final String D() {
            return UptodownApp.f27998J;
        }

        public final void D0(int i8) {
            UptodownApp.f28003O = i8;
        }

        public final Y4.i E() {
            return UptodownApp.f28010V;
        }

        public final void E0(int i8) {
            UptodownApp.f28002N = i8;
        }

        public final ArrayList F() {
            ArrayList arrayList;
            synchronized (UptodownApp.f28025z0) {
                arrayList = UptodownApp.f27989A0;
            }
            return arrayList;
        }

        public final void F0(int i8) {
            UptodownApp.f28004P = i8;
        }

        public final ArrayList G() {
            ArrayList arrayList;
            synchronized (UptodownApp.f28017r0) {
                arrayList = UptodownApp.f28018s0;
            }
            return arrayList;
        }

        public final void G0(int i8) {
            UptodownApp.f28005Q = i8;
        }

        public final int H() {
            return UptodownApp.f28006R;
        }

        public final void H0(String str) {
            UptodownApp.f27999K = str;
        }

        public final WorkInfo.State I(String str, Context context) {
            WorkInfo.State state = WorkInfo.State.SUCCEEDED;
            if (context != null) {
                WorkManager workManager = WorkManager.getInstance(context);
                AbstractC3159y.h(workManager, "getInstance(context)");
                AbstractC3159y.f(str);
                InterfaceFutureC3857a workInfosByTag = workManager.getWorkInfosByTag(str);
                AbstractC3159y.h(workInfosByTag, "instance.getWorkInfosByTag(tag!!)");
                Iterator it = ((List) workInfosByTag.get()).iterator();
                while (it.hasNext() && (state = ((WorkInfo) it.next()).getState()) != WorkInfo.State.RUNNING && state != WorkInfo.State.ENQUEUED) {
                }
            }
            return state;
        }

        public final void I0(String str) {
            UptodownApp.f27998J = str;
        }

        public final HashMap J() {
            return UptodownApp.f28009U;
        }

        public final void J0(ArrayList arrayList) {
            synchronized (UptodownApp.f28017r0) {
                UptodownApp.f28018s0 = arrayList;
                I i8 = I.f6474a;
            }
        }

        public final void K(Context context) {
            AbstractC3159y.i(context, "context");
            if (SettingsPreferences.f29309b.k0(context)) {
                new Z4.a(context).c("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ2YWx1ZSI6IjRhOTRiN2I1MTk1NGVkNGMyMjZjZGM1MGMxZDE5Yjk2MTY4MzY5OTE1NCJ9.1j7HuORIuuZDp0wTf1f9A__sAHEnqaGDiuCNY5OQXYN", new C0696a(context));
            }
        }

        public final void K0(int i8) {
            UptodownApp.f28006R = i8;
        }

        public final boolean L() {
            return UptodownApp.f28014Z;
        }

        public final boolean M() {
            return false;
        }

        public final boolean M0(Context context, boolean z8, boolean z9) {
            AbstractC3159y.i(context, "context");
            if (!W("TrackingWorkerSingle", context) && !V("TrackingWorkerPeriodic", context) && !V("GenerateQueueWorker", context) && !V("DownloadUpdatesWorker", context)) {
                L0(context, z8, z9);
                return true;
            }
            return false;
        }

        public final boolean N() {
            return UptodownApp.f28016q0;
        }

        public final boolean O(Context context) {
            AbstractC3159y.i(context, "context");
            return W("DownloadUpdatesWorker", context);
        }

        public final Object O0(String str, boolean z8, P5.d dVar) {
            if (Q()) {
                C3307A c3307a = C3307A.f34459a;
                if (c3307a.d().size() > 0) {
                    Object obj = c3307a.d().get(c3307a.d().size() - 1);
                    AbstractC3159y.h(obj, "StaticResources.activity….activity_stack.size - 1]");
                    Activity activity = (Activity) obj;
                    if (activity instanceof OldVersionsActivity) {
                        if (((OldVersionsActivity) activity).r2()) {
                            Object g8 = AbstractC2825i.g(C2812b0.c(), new c(activity, str, null), dVar);
                            if (g8 == Q5.b.e()) {
                                return g8;
                            }
                            return I.f6474a;
                        }
                    } else if (activity instanceof AppDetailActivity) {
                        AppDetailActivity appDetailActivity = (AppDetailActivity) activity;
                        if (appDetailActivity.r2()) {
                            Object w32 = appDetailActivity.w3(str, dVar);
                            if (w32 == Q5.b.e()) {
                                return w32;
                            }
                            return I.f6474a;
                        }
                    } else if (activity instanceof MainActivity) {
                        if (((MainActivity) activity).r2()) {
                            Object g9 = AbstractC2825i.g(C2812b0.c(), new d(activity, str, z8, null), dVar);
                            if (g9 == Q5.b.e()) {
                                return g9;
                            }
                            return I.f6474a;
                        }
                    } else if (activity instanceof MyDownloads) {
                        if (((MyDownloads) activity).r2()) {
                            Object g10 = AbstractC2825i.g(C2812b0.c(), new e(activity, null), dVar);
                            if (g10 == Q5.b.e()) {
                                return g10;
                            }
                            return I.f6474a;
                        }
                    } else if (activity instanceof MyApps) {
                        if (((MyApps) activity).r2()) {
                            Object g11 = AbstractC2825i.g(C2812b0.c(), new f(activity, str, null), dVar);
                            if (g11 == Q5.b.e()) {
                                return g11;
                            }
                            return I.f6474a;
                        }
                    } else if (activity instanceof Updates) {
                        if (((Updates) activity).r2()) {
                            Object g12 = AbstractC2825i.g(C2812b0.c(), new g(z8, activity, str, null), dVar);
                            if (g12 == Q5.b.e()) {
                                return g12;
                            }
                            return I.f6474a;
                        }
                    } else if (activity instanceof AppInstalledDetailsActivity) {
                        if (((AppInstalledDetailsActivity) activity).r2()) {
                            Object g13 = AbstractC2825i.g(C2812b0.c(), new h(z8, activity, null), dVar);
                            if (g13 == Q5.b.e()) {
                                return g13;
                            }
                            return I.f6474a;
                        }
                    } else if (activity instanceof TvAppDetailActivity) {
                        if (((TvAppDetailActivity) activity).n()) {
                            Object g14 = AbstractC2825i.g(C2812b0.c(), new i(activity, str, null), dVar);
                            if (g14 == Q5.b.e()) {
                                return g14;
                            }
                            return I.f6474a;
                        }
                    } else if ((activity instanceof WishlistActivity) && ((WishlistActivity) activity).r2()) {
                        Object g15 = AbstractC2825i.g(C2812b0.c(), new j(activity, str, null), dVar);
                        if (g15 == Q5.b.e()) {
                            return g15;
                        }
                        return I.f6474a;
                    }
                    return I.f6474a;
                }
            }
            j.a aVar = E4.j.f2272g;
            if (aVar.f() != null && (aVar.f() instanceof InstallerActivity)) {
                Activity f8 = aVar.f();
                AbstractC3159y.g(f8, "null cannot be cast to non-null type com.uptodown.core.activities.InstallerActivity");
                Object g16 = AbstractC2825i.g(C2812b0.b(), new b((InstallerActivity) f8, null), dVar);
                if (g16 == Q5.b.e()) {
                    return g16;
                }
                return I.f6474a;
            }
            return I.f6474a;
        }

        public final boolean P(O update) {
            boolean z8;
            AbstractC3159y.i(update, "update");
            synchronized (UptodownApp.f28025z0) {
                Iterator it = UptodownApp.f27989A0.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (AbstractC3159y.d(((O) it.next()).c(), update.c())) {
                            z8 = true;
                            break;
                        }
                    } else {
                        z8 = false;
                        break;
                    }
                }
            }
            return z8;
        }

        public final boolean Q() {
            if (UptodownApp.f28012X > UptodownApp.f28013Y) {
                return true;
            }
            return false;
        }

        public final boolean R(String packagename) {
            AbstractC3159y.i(packagename, "packagename");
            synchronized (UptodownApp.f28017r0) {
                if (UptodownApp.f28018s0 != null) {
                    ArrayList arrayList = UptodownApp.f28018s0;
                    AbstractC3159y.f(arrayList);
                    int size = arrayList.size();
                    for (int i8 = 0; i8 < size; i8++) {
                        ArrayList arrayList2 = UptodownApp.f28018s0;
                        AbstractC3159y.f(arrayList2);
                        if (g6.n.s(packagename, ((C1496f) arrayList2.get(i8)).Q(), true)) {
                            return true;
                        }
                    }
                }
                return false;
            }
        }

        public final boolean S() {
            return false;
        }

        public final boolean T(Context context) {
            AbstractC3159y.i(context, "context");
            try {
                PackageManager packageManager = context.getPackageManager();
                AbstractC3159y.h(packageManager, "context.packageManager");
                return new N4.f().r(q.d(packageManager, "com.npg.smarttvnpg", 4096));
            } catch (PackageManager.NameNotFoundException unused) {
                return false;
            }
        }

        public final boolean U(Context context) {
            AbstractC3159y.i(context, "context");
            Object systemService = context.getSystemService("uimode");
            AbstractC3159y.g(systemService, "null cannot be cast to non-null type android.app.UiModeManager");
            if (((UiModeManager) systemService).getCurrentModeType() != 4 && !T(context)) {
                return false;
            }
            return true;
        }

        public final boolean V(String str, Context context) {
            AbstractC3159y.i(context, "context");
            WorkManager workManager = WorkManager.getInstance(context);
            AbstractC3159y.h(workManager, "getInstance(context)");
            AbstractC3159y.f(str);
            InterfaceFutureC3857a workInfosByTag = workManager.getWorkInfosByTag(str);
            AbstractC3159y.h(workInfosByTag, "instance.getWorkInfosByTag(tag!!)");
            Iterator it = ((List) workInfosByTag.get()).iterator();
            while (it.hasNext()) {
                if (((WorkInfo) it.next()).getState() == WorkInfo.State.RUNNING) {
                    return true;
                }
            }
            return false;
        }

        public final boolean W(String str, Context context) {
            if (context != null) {
                WorkManager workManager = WorkManager.getInstance(context);
                AbstractC3159y.h(workManager, "getInstance(context)");
                AbstractC3159y.f(str);
                InterfaceFutureC3857a workInfosByTag = workManager.getWorkInfosByTag(str);
                AbstractC3159y.h(workInfosByTag, "instance.getWorkInfosByTag(tag!!)");
                Iterator it = ((List) workInfosByTag.get()).iterator();
                while (it.hasNext()) {
                    WorkInfo.State state = ((WorkInfo) it.next()).getState();
                    if (state == WorkInfo.State.RUNNING || state == WorkInfo.State.ENQUEUED) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }

        public final void X(File item, Context context, String str) {
            AbstractC3159y.i(item, "item");
            AbstractC3159y.i(context, "context");
            new E4.i(context).a(item, str, new C3319g().x(context));
        }

        public final void Y(File item, Context context, String str) {
            AbstractC3159y.i(item, "item");
            AbstractC3159y.i(context, "context");
            new E4.i(context).c(item, str, new C3319g().x(context));
        }

        public final Bundle a(Activity activity) {
            AbstractC3159y.i(activity, "<this>");
            Bundle bundle = ActivityOptions.makeCustomAnimation(activity, R.anim.left_to_right_in, R.anim.fade_out).toBundle();
            AbstractC3159y.h(bundle, "makeCustomAnimation(this…anim.fade_out).toBundle()");
            return bundle;
        }

        public final boolean a0() {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - UptodownApp.f28020u0 > 600) {
                UptodownApp.f28020u0 = currentTimeMillis;
                return true;
            }
            return false;
        }

        public final ActivityOptionsCompat b(Activity activity) {
            AbstractC3159y.i(activity, "<this>");
            ActivityOptionsCompat makeCustomAnimation = ActivityOptionsCompat.makeCustomAnimation(activity, R.anim.left_to_right_in, R.anim.fade_out);
            AbstractC3159y.h(makeCustomAnimation, "makeCustomAnimation(this…ight_in, R.anim.fade_out)");
            return makeCustomAnimation;
        }

        public final void b0(O update) {
            AbstractC3159y.i(update, "update");
            synchronized (UptodownApp.f28025z0) {
                try {
                    Iterator it = UptodownApp.f27989A0.iterator();
                    int i8 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            int i9 = i8 + 1;
                            if (AbstractC3159y.d(((O) it.next()).c(), update.c())) {
                                break;
                            } else {
                                i8 = i9;
                            }
                        } else {
                            i8 = -1;
                            break;
                        }
                    }
                    if (i8 >= 0 && i8 < UptodownApp.f27989A0.size()) {
                        UptodownApp.f27989A0.remove(i8);
                    }
                    I i10 = I.f6474a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final ArrayList c(C1496f app) {
            ArrayList arrayList;
            AbstractC3159y.i(app, "app");
            synchronized (UptodownApp.f28017r0) {
                try {
                    if (UptodownApp.f28018s0 != null) {
                        ArrayList arrayList2 = UptodownApp.f28018s0;
                        AbstractC3159y.f(arrayList2);
                        arrayList2.add(app);
                    } else {
                        UptodownApp.f28018s0 = new ArrayList();
                        ArrayList arrayList3 = UptodownApp.f28018s0;
                        AbstractC3159y.f(arrayList3);
                        arrayList3.add(app);
                    }
                    arrayList = UptodownApp.f28018s0;
                    AbstractC3159y.f(arrayList);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return arrayList;
        }

        public final void c0(String packagename, Context context) {
            AbstractC3159y.i(packagename, "packagename");
            AbstractC3159y.i(context, "context");
            if (d0(packagename)) {
                Bundle bundle = new Bundle();
                bundle.putString("packagename", packagename);
                C3307A.f34459a.g().send(106, bundle);
            }
            if (O(context)) {
                DownloadUpdatesWorker.f29995k.a(packagename);
            }
        }

        public final void e(Context context) {
            AbstractC3159y.i(context, "context");
            int i8 = context.getResources().getDisplayMetrics().widthPixels;
            if (!g6.n.s(context.getString(R.string.screen_type), HintConstants.AUTOFILL_HINT_PHONE, true)) {
                i8 = 1024;
            }
            K0((int) (i8 - (4 * context.getResources().getDimension(R.dimen.margin_m))));
            E0((int) (H() / 2.048d));
            D0((int) (i8 / 2.048d));
            float f8 = context.getResources().getDisplayMetrics().density;
            int i9 = context.getResources().getDisplayMetrics().heightPixels;
            float dimension = context.getResources().getDimension(R.dimen.icon_size_xl);
            float dimension2 = context.getResources().getDimension(R.dimen.icon_size_m);
            float dimension3 = context.getResources().getDimension(R.dimen.icon_size_s);
            float dimension4 = context.getResources().getDimension(R.dimen.gallery_height);
            float dimension5 = context.getResources().getDimension(R.dimen.user_avatar_profile_size);
            float dimension6 = context.getResources().getDimension(R.dimen.user_avatar_review_size);
            float dimension7 = context.getResources().getDimension(R.dimen.gallery_feature_horizontal_height);
            float c8 = n5.i.f36195a.c(context);
            if (c8 != f8) {
                UptodownApp.f27991C = c8 / f8;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(':');
            sb.append(d(dimension));
            y0(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(':');
            sb2.append(d(dimension2));
            z0(sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(':');
            sb3.append(d(dimension3));
            A0(sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append(':');
            sb4.append(d(dimension5));
            m0(sb4.toString());
            StringBuilder sb5 = new StringBuilder();
            sb5.append(':');
            sb5.append(d(dimension6));
            n0(sb5.toString());
            StringBuilder sb6 = new StringBuilder();
            sb6.append(':');
            sb6.append(d(dimension4));
            I0(sb6.toString());
            StringBuilder sb7 = new StringBuilder();
            sb7.append(':');
            sb7.append(d(i9));
            H0(sb7.toString());
            StringBuilder sb8 = new StringBuilder();
            sb8.append(':');
            sb8.append(d(y()));
            w0(sb8.toString());
            StringBuilder sb9 = new StringBuilder();
            sb9.append(':');
            sb9.append(d(z()));
            v0(sb9.toString());
            StringBuilder sb10 = new StringBuilder();
            sb10.append(':');
            sb10.append(d(dimension7));
            x0(sb10.toString());
        }

        public final C3609g e0(Context context) {
            AbstractC3159y.i(context, "context");
            return new C3609g((int) context.getResources().getDimension(R.dimen.border_radius_m), null, 2, 0 == true ? 1 : 0);
        }

        public final boolean f(Context context) {
            AbstractC3159y.i(context, "context");
            SettingsPreferences.a aVar = SettingsPreferences.f29309b;
            if ((aVar.f(context) == 0 && C3332t.f34516a.f()) || aVar.f(context) == 1) {
                return true;
            }
            return false;
        }

        public final C3609g f0(Context context) {
            AbstractC3159y.i(context, "context");
            int i8 = 2;
            C3609g.a aVar = null;
            byte b8 = 0;
            byte b9 = 0;
            byte b10 = 0;
            if (SettingsPreferences.f29309b.l(context) > 0 && C3332t.f34516a.c()) {
                return new C3609g((int) context.getResources().getDimension(R.dimen.border_radius_m), aVar, i8, b10 == true ? 1 : 0);
            }
            return new C3609g((int) context.getResources().getDimension(R.dimen.border_radius_xs), b9 == true ? 1 : 0, i8, b8 == true ? 1 : 0);
        }

        public final void g() {
            synchronized (UptodownApp.f28017r0) {
                UptodownApp.f28018s0 = null;
                I i8 = I.f6474a;
            }
        }

        public final C3609g g0(Context context) {
            AbstractC3159y.i(context, "context");
            int i8 = 2;
            C3609g.a aVar = null;
            byte b8 = 0;
            byte b9 = 0;
            byte b10 = 0;
            if (SettingsPreferences.f29309b.l(context) > 0 && C3332t.f34516a.c()) {
                return new C3609g((int) context.getResources().getDimension(R.dimen.border_radius_s), aVar, i8, b10 == true ? 1 : 0);
            }
            return new C3609g((int) context.getResources().getDimension(R.dimen.border_radius_xs), b9 == true ? 1 : 0, i8, b8 == true ? 1 : 0);
        }

        public final boolean h() {
            return UptodownApp.f28019t0;
        }

        public final C3609g h0(Context context) {
            AbstractC3159y.i(context, "context");
            return new C3609g((int) context.getResources().getDimension(R.dimen.border_radius_s), null, 2, 0 == true ? 1 : 0);
        }

        public final Object i() {
            return UptodownApp.f28024y0;
        }

        public final void i0(Context context) {
            AbstractC3159y.i(context, "context");
            if (!W("GetUserDataWorker", context)) {
                WorkManager.getInstance(context).enqueue(new PeriodicWorkRequest.Builder((Class<? extends ListenableWorker>) GetUserDataWorker.class, 24L, TimeUnit.HOURS).addTag("GetUserDataWorker").setConstraints(new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build()).build());
            }
        }

        public final Object j() {
            return UptodownApp.f28022w0;
        }

        public final void j0(Context context) {
            AbstractC3159y.i(context, "context");
            if (!W("PreRegisterWorker", context)) {
                WorkManager.getInstance(context).enqueue(new PeriodicWorkRequest.Builder((Class<? extends ListenableWorker>) PreRegisterWorker.class, 4L, TimeUnit.HOURS).addTag("PreRegisterWorker").setConstraints(new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build()).build());
            }
        }

        public final Object k() {
            return UptodownApp.f28023x0;
        }

        public final String l() {
            return UptodownApp.f28000L;
        }

        public final void l0(Context context) {
            AbstractC3159y.i(context, "context");
            if (!W("TrackingWorkerPeriodic", context)) {
                k0(context);
            }
        }

        public final String m() {
            return UptodownApp.f28001M;
        }

        public final void m0(String str) {
            UptodownApp.f28000L = str;
        }

        public final InterfaceC2541e n() {
            return UptodownApp.f28007S;
        }

        public final void n0(String str) {
            UptodownApp.f28001M = str;
        }

        public final InterfaceC2541e o() {
            return UptodownApp.f28008T;
        }

        public final void o0(InterfaceC2541e interfaceC2541e) {
            UptodownApp.f28007S = interfaceC2541e;
        }

        public final C1502l p() {
            return UptodownApp.f28015p0;
        }

        public final void p0(InterfaceC2541e interfaceC2541e) {
            UptodownApp.f28008T = interfaceC2541e;
        }

        public final String q() {
            return UptodownApp.f27996H;
        }

        public final void q0(boolean z8) {
            UptodownApp.f28014Z = z8;
        }

        public final String r() {
            return UptodownApp.f27995G;
        }

        public final void r0(C1502l c1502l) {
            UptodownApp.f28015p0 = c1502l;
        }

        public final String s() {
            return UptodownApp.f27997I;
        }

        public final void s0(boolean z8) {
            UptodownApp.f28016q0 = z8;
        }

        public final String t() {
            return UptodownApp.f27994F;
        }

        public final void t0(boolean z8) {
            UptodownApp.f28019t0 = z8;
        }

        public final String u() {
            return UptodownApp.f27993E;
        }

        public final void u0(O update) {
            AbstractC3159y.i(update, "update");
            synchronized (UptodownApp.f28025z0) {
                try {
                    Iterator it = UptodownApp.f27989A0.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (AbstractC3159y.d(((O) it.next()).c(), update.c())) {
                                break;
                            }
                        } else {
                            UptodownApp.f27989A0.add(update);
                            break;
                        }
                    }
                    I i8 = I.f6474a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final C1496f v() {
            C1496f c1496f;
            synchronized (UptodownApp.f28017r0) {
                if (UptodownApp.f28018s0 != null) {
                    ArrayList arrayList = UptodownApp.f28018s0;
                    AbstractC3159y.f(arrayList);
                    if (arrayList.size() > 0) {
                        ArrayList arrayList2 = UptodownApp.f28018s0;
                        AbstractC3159y.f(arrayList2);
                        c1496f = (C1496f) arrayList2.remove(0);
                    }
                }
                c1496f = null;
            }
            return c1496f;
        }

        public final void v0(String str) {
            UptodownApp.f27996H = str;
        }

        public final ArrayList w() {
            return UptodownApp.f28021v0;
        }

        public final void w0(String str) {
            UptodownApp.f27995G = str;
        }

        public final boolean x() {
            return UptodownApp.f28011W;
        }

        public final void x0(String str) {
            UptodownApp.f27997I = str;
        }

        public final int y() {
            return UptodownApp.f28003O;
        }

        public final void y0(String str) {
            UptodownApp.f27994F = str;
        }

        public final int z() {
            return UptodownApp.f28002N;
        }

        public final void z0(String str) {
            UptodownApp.f27993E = str;
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements K {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f28058b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ File f28059c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f28060d;

        /* loaded from: classes4.dex */
        static final class a extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ r f28061a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ File f28062b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f28063c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(r rVar, File file, boolean z8) {
                super(0);
                this.f28061a = rVar;
                this.f28062b = file;
                this.f28063c = z8;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5562invoke();
                return I.f6474a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5562invoke() {
                new E4.i(this.f28061a).c(this.f28062b, null, this.f28063c);
            }
        }

        b(r rVar, File file, boolean z8) {
            this.f28058b = rVar;
            this.f28059c = file;
            this.f28060d = z8;
        }

        @Override // W4.K
        public void a(H reportVT) {
            AbstractC3159y.i(reportVT, "reportVT");
            if (reportVT.f() > 0) {
                UptodownApp.this.j1(reportVT, new a(this.f28058b, this.f28059c, this.f28060d), this.f28058b);
            } else {
                new E4.i(this.f28058b).c(this.f28059c, null, this.f28060d);
            }
        }

        @Override // W4.K
        public void b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f28064a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f28065b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ H f28066c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ UptodownApp f28067d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0 f28068e;

        /* loaded from: classes4.dex */
        public static final class a extends ClickableSpan {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ UptodownApp f28069a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ H f28070b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ r f28071c;

            a(UptodownApp uptodownApp, H h8, r rVar) {
                this.f28069a = uptodownApp;
                this.f28070b = h8;
                this.f28071c = rVar;
            }

            @Override // android.text.style.ClickableSpan
            public void onClick(View widget) {
                AbstractC3159y.i(widget, "widget");
                this.f28069a.o1(this.f28070b.j(), this.f28071c);
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint ds) {
                AbstractC3159y.i(ds, "ds");
                super.updateDrawState(ds);
                ds.setColor(ContextCompat.getColor(this.f28071c, R.color.main_blue));
                ds.setTypeface(j.f2272g.t());
                ds.setUnderlineText(false);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final b f28072a = new b();

            b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(h it) {
                AbstractC3159y.i(it, "it");
                return (CharSequence) it.a().get(1);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(r rVar, H h8, UptodownApp uptodownApp, Function0 function0, P5.d dVar) {
            super(2, dVar);
            this.f28065b = rVar;
            this.f28066c = h8;
            this.f28067d = uptodownApp;
            this.f28068e = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(Function0 function0, r rVar, View view) {
            function0.invoke();
            AlertDialog R8 = rVar.R();
            if (R8 != null) {
                R8.dismiss();
            }
            UptodownApp.f27990B.s0(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void o(r rVar, View view) {
            AlertDialog R8 = rVar.R();
            if (R8 != null) {
                R8.dismiss();
            }
            UptodownApp.f27990B.s0(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void p(UptodownApp uptodownApp, H h8, r rVar, View view) {
            uptodownApp.o1(h8.j(), rVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(this.f28065b, this.f28066c, this.f28067d, this.f28068e, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f28064a == 0) {
                t.b(obj);
                if (!this.f28065b.isFinishing()) {
                    AlertDialog R8 = this.f28065b.R();
                    if (R8 != null) {
                        R8.dismiss();
                    }
                    AlertDialog.Builder builder = new AlertDialog.Builder(this.f28065b);
                    C1387u c8 = C1387u.c(this.f28065b.getLayoutInflater());
                    AbstractC3159y.h(c8, "inflate(coreBaseActivity.layoutInflater)");
                    final H h8 = this.f28066c;
                    final UptodownApp uptodownApp = this.f28067d;
                    final r rVar = this.f28065b;
                    final Function0 function0 = this.f28068e;
                    TextView textView = c8.f10904f;
                    j.a aVar = j.f2272g;
                    textView.setTypeface(aVar.u());
                    c8.f10904f.setText(aVar.g().getString(R.string.positives_detected_in_downloaded_file));
                    String obj2 = c8.f10904f.getText().toString();
                    List<C1503m> a8 = C1503m.f12631f.a(obj2, "\\[xx](.*?)\\[/xx]");
                    SpannableString spannableString = new SpannableString(new g6.j("\\[xx](.*?)\\[/xx]").g(obj2, b.f28072a));
                    for (C1503m c1503m : a8) {
                        SpannableString spannableString2 = spannableString;
                        int S7 = g6.n.S(spannableString, c1503m.d(), 0, false, 6, null);
                        int length = c1503m.d().length() + S7;
                        if (S7 >= 0) {
                            spannableString2.setSpan(new a(uptodownApp, h8, rVar), S7, length, 33);
                        }
                        spannableString = spannableString2;
                    }
                    c8.f10904f.setText(spannableString);
                    c8.f10904f.setMovementMethod(LinkMovementMethod.getInstance());
                    TextView textView2 = c8.f10906h;
                    j.a aVar2 = j.f2272g;
                    textView2.setTypeface(aVar2.t());
                    c8.f10906h.setText(String.valueOf(h8.f()));
                    c8.f10905g.setTypeface(aVar2.u());
                    TextView textView3 = c8.f10905g;
                    C3307A c3307a = C3307A.f34459a;
                    Y y8 = Y.f33752a;
                    String string = aVar2.g().getString(R.string.virustotal_report_msg);
                    AbstractC3159y.h(string, "appContext.getString(R.s…ng.virustotal_report_msg)");
                    String format = String.format(string, Arrays.copyOf(new Object[]{String.valueOf(h8.i())}, 1));
                    AbstractC3159y.h(format, "format(...)");
                    textView3.setText(c3307a.c(format));
                    c8.f10903e.setTypeface(aVar2.u());
                    c8.f10903e.setText(aVar2.g().getString(R.string.virustotal_report_previous_scan, h8.e()));
                    c8.f10902d.setTypeface(aVar2.t());
                    c8.f10902d.setOnClickListener(new View.OnClickListener() { // from class: com.uptodown.a
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            UptodownApp.c.m(Function0.this, rVar, view);
                        }
                    });
                    c8.f10901c.setTypeface(aVar2.t());
                    c8.f10901c.setOnClickListener(new View.OnClickListener() { // from class: com.uptodown.b
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            UptodownApp.c.o(r.this, view);
                        }
                    });
                    c8.f10900b.setOnClickListener(new View.OnClickListener() { // from class: com.uptodown.c
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            UptodownApp.c.p(UptodownApp.this, h8, rVar, view);
                        }
                    });
                    builder.setCancelable(false);
                    builder.setView(c8.getRoot());
                    this.f28065b.t0(builder.create());
                    if (!this.f28065b.isFinishing() && this.f28065b.R() != null) {
                        AlertDialog R9 = this.f28065b.R();
                        AbstractC3159y.f(R9);
                        Window window = R9.getWindow();
                        if (window != null) {
                            window.setBackgroundDrawable(new ColorDrawable(0));
                        }
                        AlertDialog R10 = this.f28065b.R();
                        AbstractC3159y.f(R10);
                        R10.show();
                        UptodownApp.f27990B.s0(true);
                    }
                }
                return I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f28073a;

        d(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new d(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f28073a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                UptodownApp uptodownApp = UptodownApp.this;
                this.f28073a = 1;
                if (uptodownApp.q1(uptodownApp, this) == e8) {
                    return e8;
                }
            }
            return I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f28075a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f28076b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Context context, P5.d dVar) {
            super(2, dVar);
            this.f28076b = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new e(this.f28076b, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f28075a == 0) {
                t.b(obj);
                ArrayList A8 = new C3319g().A(this.f28076b);
                new C3319g().e(A8, this.f28076b);
                return new C3319g().f(A8, this.f28076b);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private final void i1() {
        if (Build.VERSION.SDK_INT >= 26) {
            Object systemService = getSystemService("notification");
            AbstractC3159y.g(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            String string = getString(R.string.app_name);
            AbstractC3159y.h(string, "getString(R.string.app_name)");
            String string2 = getString(R.string.notification_channel_description);
            AbstractC3159y.h(string2, "getString(R.string.notif…tion_channel_description)");
            NotificationChannel a8 = androidx.browser.trusted.h.a("CHANNEL_ID_UPTODOWN", string, 3);
            a8.setSound(null, null);
            a8.setDescription(string2);
            AbstractC4026d.a(a8, true);
            ((NotificationManager) systemService).createNotificationChannel(a8);
        }
    }

    private final void k1(boolean z8, String str) {
        Bundle bundle = new Bundle();
        if (z8) {
            bundle.putString("type", "accepted");
        } else {
            bundle.putString("type", "rejected");
        }
        bundle.putString("consent_version", str);
        new C3330r(this).b("user_consent_mintegral", bundle);
    }

    private final void l1() {
        Q e8 = Q.f12424k.e(this);
        if (e8 == null || !e8.G()) {
            String packageName = getPackageName();
            AbstractC3159y.h(packageName, "this.packageName");
            ChoiceCmp.startChoice$default(this, packageName, "p-PLc5NudJ4X36X", this, null, 16, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o1(String str, r rVar) {
        if (str != null && !rVar.isFinishing()) {
            String q8 = new C3319g().q(str);
            String string = rVar.getString(R.string.virustotal_safety_report_title);
            AbstractC3159y.h(string, "coreBaseActivity.getStri…otal_safety_report_title)");
            new C3323k().q(rVar, q8, string);
        }
    }

    private final void p1() {
        AbstractC2825i.d(N.a(C2812b0.b()), null, null, new d(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object q1(Context context, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new e(context, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6474a;
    }

    private final void r1() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        Y4.a aVar = new Y4.a();
        this.f28027y = aVar;
        registerReceiver(aVar, intentFilter);
    }

    private final void s1() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addDataScheme("package");
        Y4.b bVar = new Y4.b();
        this.f28026A = bVar;
        registerReceiver(bVar, intentFilter);
    }

    private final void t1() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter.addDataScheme("package");
        Y4.c cVar = new Y4.c();
        this.f28028z = cVar;
        registerReceiver(cVar, intentFilter);
    }

    private final void u1(Context context) {
        if (!f27990B.W("SearchApksWorker", context)) {
            WorkManager.getInstance(context).enqueue(new OneTimeWorkRequest.Builder(SearchApksWorker.class).addTag("SearchApksWorker").build());
        }
    }

    private final void v1() {
        try {
            Y4.a aVar = this.f28027y;
            if (aVar != null) {
                unregisterReceiver(aVar);
                this.f28027y = null;
            }
            Y4.c cVar = this.f28028z;
            if (cVar != null) {
                unregisterReceiver(cVar);
                this.f28028z = null;
            }
            Y4.b bVar = this.f28026A;
            if (bVar != null) {
                unregisterReceiver(bVar);
                this.f28026A = null;
            }
        } catch (IllegalArgumentException e8) {
            e8.printStackTrace();
        }
    }

    @Override // E4.j
    public void G(File file, f listener, r coreBaseActivity) {
        String str;
        AbstractC3159y.i(file, "file");
        AbstractC3159y.i(listener, "listener");
        AbstractC3159y.i(coreBaseActivity, "coreBaseActivity");
        boolean x8 = new C3319g().x(this);
        Q e8 = Q.f12424k.e(this);
        C3326n a8 = C3326n.f34490t.a(this);
        a8.a();
        String name = file.getName();
        AbstractC3159y.h(name, "file.name");
        C1505o Y7 = a8.Y(name);
        a8.g();
        if (e8 != null && e8.G()) {
            if (Y7 != null) {
                str = Y7.u();
            } else {
                str = null;
            }
            if (str == null || str.length() == 0) {
                new m(this, null, N4.d.f7188a.e(file.getAbsolutePath()), new b(coreBaseActivity, file, x8), N.a(C2812b0.b()));
                return;
            }
        }
        new E4.i(this).c(file, null, x8);
    }

    @Override // E4.j
    public void M(String event) {
        AbstractC3159y.i(event, "event");
        Bundle bundle = new Bundle();
        if (event.length() > 30) {
            event = event.substring(0, 30);
            AbstractC3159y.h(event, "substring(...)");
        }
        bundle.putString(CampaignEx.JSON_NATIVE_VIDEO_ERROR, event);
        new C3330r(this).b("nsd", bundle);
    }

    public final void j1(H reportVT, Function0 installAction, r coreBaseActivity) {
        AbstractC3159y.i(reportVT, "reportVT");
        AbstractC3159y.i(installAction, "installAction");
        AbstractC3159y.i(coreBaseActivity, "coreBaseActivity");
        AbstractC2825i.d(LifecycleOwnerKt.getLifecycleScope(coreBaseActivity), C2812b0.c(), null, new c(coreBaseActivity, reportVT, this, installAction, null), 2, null);
    }

    public final void m1() {
        f28013Y++;
    }

    public final void n1() {
        f28012X++;
    }

    @Override // com.inmobi.cmp.ChoiceCmpCallback
    public void onCCPAConsentGiven(String consentString) {
        AbstractC3159y.i(consentString, "consentString");
    }

    @Override // com.inmobi.cmp.ChoiceCmpCallback
    public void onCmpError(ChoiceError error) {
        AbstractC3159y.i(error, "error");
    }

    @Override // com.inmobi.cmp.ChoiceCmpCallback
    public void onCmpLoaded(PingReturn info) {
        AbstractC3159y.i(info, "info");
    }

    @Override // com.inmobi.cmp.ChoiceCmpCallback
    public void onCmpUIShown(PingReturn info) {
        AbstractC3159y.i(info, "info");
    }

    @Override // E4.j, android.app.Application
    public void onCreate() {
        String str;
        super.onCreate();
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
        new C3330r(this).f();
        new V4.b().b();
        new C3334v(this).b();
        r1();
        t1();
        s1();
        int i8 = getResources().getConfiguration().uiMode & 48;
        SettingsPreferences.a aVar = SettingsPreferences.f29309b;
        String j8 = aVar.j(this);
        if (g6.n.s(j8, "yes", true)) {
            if (i8 != 32) {
                AppCompatDelegate.setDefaultNightMode(2);
            }
            str = "dark";
        } else if (g6.n.s(j8, "no", true)) {
            if (i8 != 16) {
                AppCompatDelegate.setDefaultNightMode(1);
            }
            str = "light";
        } else {
            AppCompatDelegate.setDefaultNightMode(-1);
            if (i8 != 16) {
                if (i8 != 32) {
                    str = "followSystem";
                } else {
                    str = "followSystem_dark";
                }
            } else {
                str = "followSystem_light";
            }
        }
        if (aVar.k(this) == -1) {
            aVar.C0(this);
            Bundle bundle = new Bundle();
            bundle.putString("type", str);
            new C3330r(this).b("darkMode", bundle);
        }
        Context applicationContext = getApplicationContext();
        AbstractC3159y.h(applicationContext, "applicationContext");
        if (aVar.q(applicationContext) == null) {
            String language = Locale.getDefault().getLanguage();
            Context applicationContext2 = getApplicationContext();
            AbstractC3159y.h(applicationContext2, "applicationContext");
            aVar.K0(applicationContext2, language);
        }
        p1();
        Context applicationContext3 = getApplicationContext();
        AbstractC3159y.h(applicationContext3, "applicationContext");
        if (aVar.j0(applicationContext3)) {
            Context applicationContext4 = getApplicationContext();
            AbstractC3159y.h(applicationContext4, "applicationContext");
            if (625 != aVar.K(applicationContext4)) {
                Context applicationContext5 = getApplicationContext();
                AbstractC3159y.h(applicationContext5, "applicationContext");
                aVar.c1(applicationContext5, false);
                Context applicationContext6 = getApplicationContext();
                AbstractC3159y.h(applicationContext6, "applicationContext");
                aVar.i1(applicationContext6, null);
            }
        }
        a aVar2 = f27990B;
        aVar2.e(this);
        i1();
        aVar2.l0(this);
        if (Q.f12424k.e(this) != null) {
            aVar2.j0(this);
            aVar2.i0(this);
        }
        G4.a aVar3 = new G4.a(this);
        aVar3.h();
        if (aVar3.l() || aVar3.s()) {
            j.f2272g.J(new Y4.h(null));
        }
        if (aVar3.p()) {
            u1(this);
        }
        T(new g(null));
        ResultReceiver J8 = J();
        AbstractC3159y.g(J8, "null cannot be cast to non-null type com.uptodown.receivers.InstallerActivityReceiver");
        ((g) J8).e(getApplicationContext());
        C3335w c3335w = C3335w.f34532a;
        Context applicationContext7 = getApplicationContext();
        AbstractC3159y.h(applicationContext7, "applicationContext");
        c3335w.h(applicationContext7);
        aVar2.K(this);
        j.f2272g.b();
        new C3311E().d(this);
        l1();
    }

    @Override // com.inmobi.cmp.ChoiceCmpCallback
    public void onGoogleBasicConsentChange(GoogleBasicConsents consents) {
        AbstractC3159y.i(consents, "consents");
    }

    @Override // com.inmobi.cmp.ChoiceCmpCallback
    public void onGoogleVendorConsentGiven(ACData acData) {
        AbstractC3159y.i(acData, "acData");
    }

    @Override // com.inmobi.cmp.ChoiceCmpCallback
    public void onIABVendorConsentGiven(GDPRData gdprData) {
        boolean z8;
        AbstractC3159y.i(gdprData, "gdprData");
        Boolean bool = gdprData.getVendor().getConsents().get("867");
        if (bool != null) {
            z8 = bool.booleanValue();
        } else {
            z8 = false;
        }
        new C3311E().a(j.f2272g.g(), z8);
        k1(z8, "gdpr");
    }

    @Override // com.inmobi.cmp.ChoiceCmpCallback
    public void onNonIABVendorConsentGiven(NonIABData nonIABData) {
        AbstractC3159y.i(nonIABData, "nonIABData");
    }

    @Override // com.inmobi.cmp.ChoiceCmpCallback
    public void onReceiveUSRegulationsConsent(USRegulationData usRegulationData) {
        boolean z8;
        boolean z9;
        boolean z10;
        AbstractC3159y.i(usRegulationData, "usRegulationData");
        boolean z11 = false;
        if (usRegulationData.getSaleOptOut() == 2) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (usRegulationData.getSharingOptOut() == 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (usRegulationData.getPersonalDataConsents() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z8 && z9 && z10) {
            z11 = true;
        }
        new C3311E().b(!z11);
        k1(z11, "mspa");
    }

    @Override // android.app.Application
    public void onTerminate() {
        super.onTerminate();
        new C3334v(this).c();
        v1();
    }

    @Override // com.inmobi.cmp.ChoiceCmpCallback
    public void onUserMovedToOtherState() {
    }
}
