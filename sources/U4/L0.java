package U4;

import D4.C1094c;
import E4.j;
import M5.AbstractC1246t;
import T4.C1359a;
import T4.C1363c;
import T4.C1366d0;
import T4.C1368e0;
import T4.C1375i;
import T4.C1377j;
import T4.C1379l;
import T4.C1381n;
import T4.C1384q;
import T4.C1388v;
import T4.C1389w;
import T4.C1392z;
import U4.L0;
import W4.InterfaceC1478a;
import W4.InterfaceC1481d;
import W4.InterfaceC1487j;
import X4.C1494d;
import X4.C1495e;
import X4.C1496f;
import X4.C1498h;
import X4.C1500j;
import X4.C1501k;
import X4.C1502l;
import X4.C1503m;
import X4.C1504n;
import X4.C1505o;
import X4.C1507q;
import X4.C1510u;
import X4.F;
import X4.K;
import X4.L;
import X4.Q;
import X4.T;
import X4.x;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.autofill.HintConstants;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.compose.runtime.ComposerKt;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.Data;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.snackbar.Snackbar;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.newinterstitial.out.MBNewInterstitialHandler;
import com.mbridge.msdk.newinterstitial.out.NewInterstitialListener;
import com.mbridge.msdk.out.BannerAdListener;
import com.mbridge.msdk.out.BannerSize;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.uptodown.UptodownApp;
import com.uptodown.activities.AbstractActivityC2489a;
import com.uptodown.activities.AppDetailActivity;
import com.uptodown.activities.AppInstalledDetailsActivity;
import com.uptodown.activities.Gallery;
import com.uptodown.activities.InformationActivity;
import com.uptodown.activities.LoginActivity;
import com.uptodown.activities.MainActivity;
import com.uptodown.activities.MoreInfo;
import com.uptodown.activities.OldVersionsActivity;
import com.uptodown.activities.OrganizationActivity;
import com.uptodown.activities.RepliesActivity;
import com.uptodown.activities.ReviewsActivity;
import com.uptodown.activities.SearchActivity;
import com.uptodown.activities.UserCommentsActivity;
import com.uptodown.activities.VirusTotalReport;
import com.uptodown.activities.YouTubeActivity;
import com.uptodown.activities.preferences.SettingsPreferences;
import com.uptodown.util.views.UsernameTextView;
import com.uptodown.views.ScrollableTextView;
import com.uptodown.workers.DownloadApkWorker;
import com.uptodown.workers.DownloadWorker;
import com.uptodown.workers.GenerateQueueWorker;
import com.uptodown.workers.GetUserDataWorker;
import d2.InterfaceC2541e;
import i2.InterfaceC2774b;
import i6.AbstractC2825i;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.InterfaceC2855x0;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l5.C3307A;
import l5.C3312F;
import l5.C3313a;
import l5.C3319g;
import l5.C3323k;
import l5.C3326n;
import l5.C3329q;
import l5.C3330r;
import l5.C3335w;
import n5.C3475c;
import n5.C3476d;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class L0 extends Fragment {

    /* renamed from: K, reason: collision with root package name */
    public static final C1393a f11173K = new C1393a(null);

    /* renamed from: A, reason: collision with root package name */
    private boolean f11174A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f11175B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f11176C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f11177D;

    /* renamed from: E, reason: collision with root package name */
    private String f11178E;

    /* renamed from: F, reason: collision with root package name */
    private D4.K f11179F;

    /* renamed from: G, reason: collision with root package name */
    private D4.K f11180G;

    /* renamed from: I, reason: collision with root package name */
    private final ActivityResultLauncher f11182I;

    /* renamed from: J, reason: collision with root package name */
    private final ActivityResultLauncher f11183J;

    /* renamed from: a, reason: collision with root package name */
    private C1363c f11184a;

    /* renamed from: b, reason: collision with root package name */
    private ImageView f11185b;

    /* renamed from: c, reason: collision with root package name */
    private C1498h f11186c;

    /* renamed from: d, reason: collision with root package name */
    private C1494d f11187d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f11188e;

    /* renamed from: f, reason: collision with root package name */
    private int f11189f;

    /* renamed from: g, reason: collision with root package name */
    private C1496f f11190g;

    /* renamed from: h, reason: collision with root package name */
    private X4.O f11191h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f11192i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f11193j;

    /* renamed from: l, reason: collision with root package name */
    private int f11195l;

    /* renamed from: m, reason: collision with root package name */
    private AlertDialog f11196m;

    /* renamed from: n, reason: collision with root package name */
    private ArrayList f11197n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f11198o;

    /* renamed from: r, reason: collision with root package name */
    private Menu f11201r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f11202s;

    /* renamed from: v, reason: collision with root package name */
    private boolean f11205v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f11206w;

    /* renamed from: x, reason: collision with root package name */
    private X4.U f11207x;

    /* renamed from: y, reason: collision with root package name */
    private X4.K f11208y;

    /* renamed from: z, reason: collision with root package name */
    private C3330r f11209z;

    /* renamed from: k, reason: collision with root package name */
    private boolean f11194k = true;

    /* renamed from: p, reason: collision with root package name */
    private boolean f11199p = true;

    /* renamed from: q, reason: collision with root package name */
    private int f11200q = -1;

    /* renamed from: t, reason: collision with root package name */
    private int f11203t = -1;

    /* renamed from: u, reason: collision with root package name */
    private long f11204u = -1;

    /* renamed from: H, reason: collision with root package name */
    private ArrayList f11181H = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class A extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f11210a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f11212c;

        /* loaded from: classes5.dex */
        public static final class a implements InterfaceC1481d {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L0 f11213a;

            a(L0 l02) {
                this.f11213a = l02;
            }

            @Override // W4.InterfaceC1481d
            public void b(C1498h app) {
                AbstractC3159y.i(app, "app");
                if (UptodownApp.f27990B.a0() && this.f11213a.getActivity() != null && !this.f11213a.requireActivity().isFinishing()) {
                    this.f11213a.d5(app);
                }
            }
        }

        /* loaded from: classes5.dex */
        public static final class b implements InterfaceC1478a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L0 f11214a;

            b(L0 l02) {
                this.f11214a = l02;
            }

            @Override // W4.InterfaceC1478a
            public void a(C1498h appInfo, int i8) {
                AbstractC3159y.i(appInfo, "appInfo");
                this.f11214a.w6(appInfo);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        A(ArrayList arrayList, P5.d dVar) {
            super(2, dVar);
            this.f11212c = arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void h(L0 l02, X4.N n8, View view) {
            if (UptodownApp.f27990B.a0()) {
                l02.Q4(n8.b());
            }
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new A(this.f11212c, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((A) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f11210a == 0) {
                L5.t.b(obj);
                L0.this.J3().f10417Y.setVisibility(8);
                if (L0.this.getActivity() != null) {
                    Iterator it = this.f11212c.iterator();
                    while (it.hasNext()) {
                        final X4.N n8 = (X4.N) it.next();
                        T4.G c8 = T4.G.c(L0.this.getLayoutInflater());
                        AbstractC3159y.h(c8, "inflate(layoutInflater)");
                        LinearLayout root = c8.getRoot();
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                        layoutParams.topMargin = (int) L0.this.getResources().getDimension(com.uptodown.R.dimen.margin_l);
                        root.setLayoutParams(layoutParams);
                        a aVar = new a(L0.this);
                        b bVar = new b(L0.this);
                        Context requireContext = L0.this.requireContext();
                        AbstractC3159y.h(requireContext, "requireContext()");
                        D4.K k8 = new D4.K(aVar, bVar, requireContext, 20);
                        k8.d(n8.a());
                        L0.this.f11181H.add(k8);
                        c8.f10102e.setTypeface(E4.j.f2272g.t());
                        c8.f10102e.setText(n8.b().f());
                        RelativeLayout relativeLayout = c8.f10100c;
                        final L0 l02 = L0.this;
                        relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: U4.P0
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                L0.A.h(L0.this, n8, view);
                            }
                        });
                        c8.f10101d.setAdapter(k8);
                        c8.f10101d.setNestedScrollingEnabled(false);
                        c8.f10101d.setItemAnimator(null);
                        c8.f10101d.setLayoutManager(new LinearLayoutManager(L0.this.getContext(), 0, false));
                        L0.this.J3().f10449r.addView(c8.getRoot());
                    }
                }
                L0.this.J3().f10449r.setVisibility(0);
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class B extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f11215a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f11217c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        B(ArrayList arrayList, P5.d dVar) {
            super(2, dVar);
            this.f11217c = arrayList;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new B(this.f11217c, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((B) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f11215a == 0) {
                L5.t.b(obj);
                L0.this.J3().f10417Y.setTypeface(E4.j.f2272g.t());
                if (L0.this.getActivity() != null) {
                    HorizontalScrollView horizontalScrollView = new HorizontalScrollView(L0.this.requireContext());
                    horizontalScrollView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                    horizontalScrollView.setHorizontalScrollBarEnabled(false);
                    LinearLayout linearLayout = new LinearLayout(L0.this.requireContext());
                    linearLayout.setOrientation(0);
                    linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                    horizontalScrollView.addView(linearLayout);
                    L0.this.J3().f10449r.addView(horizontalScrollView);
                    Iterator it = this.f11217c.iterator();
                    while (it.hasNext()) {
                        C1501k category = (C1501k) it.next();
                        int dimension = (int) L0.this.getResources().getDimension(com.uptodown.R.dimen.margin_m);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                        if (AbstractC3159y.d(category, AbstractC1246t.y0(this.f11217c))) {
                            layoutParams.setMargins(dimension, 0, dimension, 0);
                        } else {
                            layoutParams.setMargins(dimension, 0, 0, 0);
                        }
                        L0 l02 = L0.this;
                        AbstractC3159y.h(category, "category");
                        linearLayout.addView(l02.s5(category, layoutParams));
                    }
                }
                L0.this.J3().f10449r.setVisibility(0);
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class C extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f11218a;

        C(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new C(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((C) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f11218a == 0) {
                L5.t.b(obj);
                if (L0.this.getActivity() != null && !L0.this.requireActivity().isFinishing() && L0.this.f11208y != null) {
                    X4.K k8 = L0.this.f11208y;
                    AbstractC3159y.f(k8);
                    if (k8.n() >= 1) {
                        L0.this.J3().f10453v.f10026b.setImageDrawable(ContextCompat.getDrawable(L0.this.requireContext(), com.uptodown.R.drawable.vector_star_on));
                    }
                    X4.K k9 = L0.this.f11208y;
                    AbstractC3159y.f(k9);
                    if (k9.n() >= 2) {
                        L0.this.J3().f10453v.f10027c.setImageDrawable(ContextCompat.getDrawable(L0.this.requireContext(), com.uptodown.R.drawable.vector_star_on));
                    }
                    X4.K k10 = L0.this.f11208y;
                    AbstractC3159y.f(k10);
                    if (k10.n() >= 3) {
                        L0.this.J3().f10453v.f10028d.setImageDrawable(ContextCompat.getDrawable(L0.this.requireContext(), com.uptodown.R.drawable.vector_star_on));
                    }
                    X4.K k11 = L0.this.f11208y;
                    AbstractC3159y.f(k11);
                    if (k11.n() >= 4) {
                        L0.this.J3().f10453v.f10029e.setImageDrawable(ContextCompat.getDrawable(L0.this.requireContext(), com.uptodown.R.drawable.vector_star_on));
                    }
                    X4.K k12 = L0.this.f11208y;
                    AbstractC3159y.f(k12);
                    if (k12.n() == 5) {
                        L0.this.J3().f10453v.f10030f.setImageDrawable(ContextCompat.getDrawable(L0.this.requireContext(), com.uptodown.R.drawable.vector_star_on));
                    }
                    L0.this.J3().f10453v.f10033i.setText(L0.this.getString(com.uptodown.R.string.edit_your_review));
                }
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes5.dex */
    public static final class D implements W4.r {
        D() {
        }

        @Override // W4.r
        public void c(int i8) {
            if (i8 == 404) {
                L0.this.f11174A = true;
            }
        }

        @Override // W4.r
        public void f(C1498h appInfo) {
            AbstractC3159y.i(appInfo, "appInfo");
            L0.this.T5(appInfo);
            L0.this.u5();
            L0.this.F2();
            L0.this.E2();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class E extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f11221a;

        E(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new E(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((E) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f11221a == 0) {
                L5.t.b(obj);
                L0.this.v5();
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class F extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f11223a;

        F(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new F(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((F) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f11223a == 0) {
                L5.t.b(obj);
                L0.this.l5();
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class G extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f11225a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f11226b;

        /* renamed from: d, reason: collision with root package name */
        int f11228d;

        G(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f11226b = obj;
            this.f11228d |= Integer.MIN_VALUE;
            return L0.this.Q3(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class H extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f11229a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f11231c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        H(ArrayList arrayList, P5.d dVar) {
            super(2, dVar);
            this.f11231c = arrayList;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new H(this.f11231c, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((H) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f11229a == 0) {
                L5.t.b(obj);
                if (L0.this.getActivity() != null && !L0.this.requireActivity().isFinishing()) {
                    if (!this.f11231c.isEmpty()) {
                        L0.this.J5(this.f11231c);
                    } else {
                        L0.this.J3().f10395C.setVisibility(8);
                    }
                }
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class I extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f11232a;

        I(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new I(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((I) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f11232a == 0) {
                L5.t.b(obj);
                L0.this.J3().f10395C.setVisibility(8);
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class J extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f11234a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.T f11235b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        J(kotlin.jvm.internal.T t8, P5.d dVar) {
            super(2, dVar);
            this.f11235b = t8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new J(this.f11235b, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((J) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f11234a == 0) {
                L5.t.b(obj);
                return X4.K.f12368o.e((JSONArray) this.f11235b.f33747a);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class K extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f11236a;

        K(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new K(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((K) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f11236a == 0) {
                L5.t.b(obj);
                L0 l02 = L0.this;
                C1498h I32 = l02.I3();
                AbstractC3159y.f(I32);
                l02.L5(I32.V0(), false);
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class L extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        public static final L f11238a = new L();

        L() {
            super(2);
        }

        @Override // X5.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(X4.L ss1, X4.L ss2) {
            AbstractC3159y.i(ss1, "ss1");
            AbstractC3159y.i(ss2, "ss2");
            return Integer.valueOf(ss1.c() - ss2.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class M extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f11239a;

        M(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new M(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((M) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f11239a == 0) {
                L5.t.b(obj);
                L0.this.G4();
                L0.this.K5();
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class N extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f11241a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ X4.K f11243c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        N(X4.K k8, P5.d dVar) {
            super(2, dVar);
            this.f11243c = k8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new N(this.f11243c, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((N) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f11241a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                L0 l02 = L0.this;
                X4.K k8 = this.f11243c;
                this.f11241a = 1;
                if (l02.E4(k8, this) == e8) {
                    return e8;
                }
            }
            return L5.I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class O extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f11244a;

        /* renamed from: b, reason: collision with root package name */
        Object f11245b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f11246c;

        /* renamed from: e, reason: collision with root package name */
        int f11248e;

        O(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f11246c = obj;
            this.f11248e |= Integer.MIN_VALUE;
            return L0.this.E4(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class P extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f11249a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f11250b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ L0 f11251c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ X4.K f11252d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        P(int i8, L0 l02, X4.K k8, P5.d dVar) {
            super(2, dVar);
            this.f11250b = i8;
            this.f11251c = l02;
            this.f11252d = k8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new P(this.f11250b, this.f11251c, this.f11252d, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((P) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f11249a == 0) {
                L5.t.b(obj);
                int i8 = -1;
                if (this.f11250b == 1) {
                    C1498h I32 = this.f11251c.I3();
                    AbstractC3159y.f(I32);
                    ArrayList Q02 = I32.Q0();
                    AbstractC3159y.f(Q02);
                    Iterator it = Q02.iterator();
                    int i9 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        int i10 = i9 + 1;
                        if (((X4.K) it.next()).j() == this.f11252d.j()) {
                            i8 = i9;
                            break;
                        }
                        i9 = i10;
                    }
                    if (i8 > 0) {
                        C1498h I33 = this.f11251c.I3();
                        AbstractC3159y.f(I33);
                        ArrayList Q03 = I33.Q0();
                        AbstractC3159y.f(Q03);
                        if (i8 < Q03.size()) {
                            C1498h I34 = this.f11251c.I3();
                            AbstractC3159y.f(I34);
                            ArrayList Q04 = I34.Q0();
                            AbstractC3159y.f(Q04);
                            Q04.set(i8, this.f11252d);
                            this.f11251c.P6(this.f11252d, i8);
                        }
                    }
                } else {
                    Snackbar.make(this.f11251c.J3().f10450s, com.uptodown.R.string.error_generico, -1).show();
                }
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes5.dex */
    public static final class Q implements BannerAdListener {
        Q() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(L0 this$0, View view) {
            AbstractC3159y.i(this$0, "this$0");
            this$0.E6();
        }

        @Override // com.mbridge.msdk.out.BannerAdListener
        public void closeFullScreen(MBridgeIds ids) {
            AbstractC3159y.i(ids, "ids");
        }

        @Override // com.mbridge.msdk.out.BannerAdListener
        public void onClick(MBridgeIds ids) {
            AbstractC3159y.i(ids, "ids");
            Bundle bundle = new Bundle();
            bundle.putString("type", "clicked");
            new C3330r(L0.this.getContext()).b("mintegral_banner", bundle);
        }

        @Override // com.mbridge.msdk.out.BannerAdListener
        public void onCloseBanner(MBridgeIds ids) {
            AbstractC3159y.i(ids, "ids");
            Bundle bundle = new Bundle();
            bundle.putString("type", "closed");
            new C3330r(L0.this.getContext()).b("mintegral_banner", bundle);
        }

        @Override // com.mbridge.msdk.out.BannerAdListener
        public void onLeaveApp(MBridgeIds ids) {
            AbstractC3159y.i(ids, "ids");
        }

        @Override // com.mbridge.msdk.out.BannerAdListener
        public void onLoadFailed(MBridgeIds ids, String errorMsg) {
            AbstractC3159y.i(ids, "ids");
            AbstractC3159y.i(errorMsg, "errorMsg");
            L0.this.J3().f10455x.setVisibility(8);
            L0.this.J3().f10426d0.setVisibility(8);
            L0.this.J3().f10455x.release();
            Bundle bundle = new Bundle();
            bundle.putString("type", "failed");
            new C3330r(L0.this.getContext()).b("mintegral_banner", bundle);
        }

        @Override // com.mbridge.msdk.out.BannerAdListener
        public void onLoadSuccessed(MBridgeIds ids) {
            AbstractC3159y.i(ids, "ids");
            L0.this.J3().f10426d0.setTypeface(E4.j.f2272g.u());
            L0.this.J3().f10426d0.setVisibility(0);
            TextView textView = L0.this.J3().f10426d0;
            final L0 l02 = L0.this;
            textView.setOnClickListener(new View.OnClickListener() { // from class: U4.Q0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    L0.Q.b(L0.this, view);
                }
            });
            Bundle bundle = new Bundle();
            bundle.putString("type", "loaded");
            new C3330r(L0.this.getContext()).b("mintegral_banner", bundle);
        }

        @Override // com.mbridge.msdk.out.BannerAdListener
        public void onLogImpression(MBridgeIds ids) {
            AbstractC3159y.i(ids, "ids");
        }

        @Override // com.mbridge.msdk.out.BannerAdListener
        public void showFullScreen(MBridgeIds ids) {
            AbstractC3159y.i(ids, "ids");
        }
    }

    /* loaded from: classes5.dex */
    public static final class R implements InterfaceC2774b {
        R() {
        }

        @Override // i2.InterfaceC2774b
        public void a(Exception e8) {
            AbstractC3159y.i(e8, "e");
        }

        @Override // i2.InterfaceC2774b
        public void b() {
            ImageView imageView = L0.this.f11185b;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            if (!L0.this.f11199p) {
                CollapsingToolbarLayout collapsingToolbarLayout = L0.this.J3().f10427e;
                C1498h I32 = L0.this.I3();
                AbstractC3159y.f(I32);
                collapsingToolbarLayout.setTitle(I32.s0());
                L0.this.J3().f10421b.setExpanded(false, false);
            }
            if (L0.this.I3() != null) {
                C1498h I33 = L0.this.I3();
                AbstractC3159y.f(I33);
                if (I33.e0() != null) {
                    L0.this.F3();
                    FragmentActivity activity = L0.this.getActivity();
                    if (activity != null) {
                        L0.this.N6(activity);
                    }
                }
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class S implements W4.K {
        S() {
        }

        @Override // W4.K
        public void a(X4.H reportVT) {
            AbstractC3159y.i(reportVT, "reportVT");
            if (L0.this.getActivity() != null && !L0.this.requireActivity().isFinishing() && L0.this.I3() != null) {
                Intent intent = new Intent(L0.this.requireActivity(), (Class<?>) VirusTotalReport.class);
                intent.putExtra("appInfo", L0.this.I3());
                intent.putExtra("appReportVT", reportVT);
                L0 l02 = L0.this;
                UptodownApp.a aVar = UptodownApp.f27990B;
                FragmentActivity requireActivity = l02.requireActivity();
                AbstractC3159y.h(requireActivity, "requireActivity()");
                l02.startActivity(intent, aVar.a(requireActivity));
            }
        }

        @Override // W4.K
        public void b() {
            if (L0.this.getActivity() != null && !L0.this.requireActivity().isFinishing() && L0.this.I3() != null) {
                FragmentActivity activity = L0.this.getActivity();
                AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
                C1498h I32 = L0.this.I3();
                AbstractC3159y.f(I32);
                ((AbstractActivityC2489a) activity).J2(I32.S0());
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class T implements InterfaceC2774b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f11257b;

        T(Context context) {
            this.f11257b = context;
        }

        @Override // i2.InterfaceC2774b
        public void a(Exception e8) {
            AbstractC3159y.i(e8, "e");
            e8.printStackTrace();
            L0 l02 = L0.this;
            l02.Q5(l02.J3().f10399G.f10495b, this.f11257b);
        }

        @Override // i2.InterfaceC2774b
        public void b() {
            L0 l02 = L0.this;
            l02.Q5(l02.J3().f10399G.f10495b, this.f11257b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class U extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f11258a;

        U(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new U(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((U) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f11258a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                L0 l02 = L0.this;
                this.f11258a = 1;
                if (l02.P5(this) == e8) {
                    return e8;
                }
            }
            return L5.I.f6474a;
        }
    }

    /* loaded from: classes5.dex */
    public static final class V implements InterfaceC1481d {
        V() {
        }

        @Override // W4.InterfaceC1481d
        public void b(C1498h app) {
            AbstractC3159y.i(app, "app");
            if (UptodownApp.f27990B.a0() && L0.this.getActivity() != null && !L0.this.requireActivity().isFinishing()) {
                L0.this.d5(app);
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class W implements InterfaceC1478a {
        W() {
        }

        @Override // W4.InterfaceC1478a
        public void a(C1498h appInfo, int i8) {
            AbstractC3159y.i(appInfo, "appInfo");
            L0.this.w6(appInfo);
        }
    }

    /* loaded from: classes5.dex */
    public static final class X implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1366d0 f11262a;

        X(C1366d0 c1366d0) {
            this.f11262a = c1366d0;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f11262a.f10487n.getViewTreeObserver().removeOnPreDrawListener(this);
            TextView textView = this.f11262a.f10487n;
            AbstractC3159y.h(textView, "reviewBinding.tvBodyReview");
            if (n5.v.a(textView)) {
                this.f11262a.f10492s.setVisibility(0);
                this.f11262a.f10492s.setTypeface(E4.j.f2272g.t());
                return true;
            }
            return true;
        }
    }

    /* loaded from: classes5.dex */
    public static final class Y implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1368e0 f11263a;

        Y(C1368e0 c1368e0) {
            this.f11263a = c1368e0;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f11263a.f10533n.getViewTreeObserver().removeOnPreDrawListener(this);
            TextView textView = this.f11263a.f10533n;
            AbstractC3159y.h(textView, "reviewBinding.tvBodyReview");
            if (n5.v.a(textView)) {
                this.f11263a.f10538s.setVisibility(0);
                this.f11263a.f10538s.setTypeface(E4.j.f2272g.t());
                return true;
            }
            return true;
        }
    }

    /* loaded from: classes5.dex */
    public static final class Z implements W4.C {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f11265b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.T f11266c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList f11267d;

        Z(ArrayList arrayList, kotlin.jvm.internal.T t8, ArrayList arrayList2) {
            this.f11265b = arrayList;
            this.f11266c = t8;
            this.f11267d = arrayList2;
        }

        @Override // W4.C
        public void a(X4.L screenshot) {
            AbstractC3159y.i(screenshot, "screenshot");
            UptodownApp.a aVar = UptodownApp.f27990B;
            if (aVar.a0() && L0.this.getActivity() != null && !L0.this.requireActivity().isFinishing()) {
                Intent intent = new Intent(L0.this.requireActivity(), (Class<?>) Gallery.class);
                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("images", this.f11265b);
                bundle.putInt("index", this.f11265b.indexOf(screenshot));
                intent.putExtra("bundle", bundle);
                L0 l02 = L0.this;
                FragmentActivity requireActivity = l02.requireActivity();
                AbstractC3159y.h(requireActivity, "requireActivity()");
                l02.startActivity(intent, aVar.a(requireActivity));
            }
        }

        @Override // W4.C
        public void b(X4.L screenshot) {
            AbstractC3159y.i(screenshot, "screenshot");
            this.f11265b.remove(screenshot);
            D4.D d8 = (D4.D) this.f11266c.f33747a;
            if (d8 != null) {
                d8.c(screenshot);
            }
        }

        @Override // W4.C
        public void c(X4.T video) {
            AbstractC3159y.i(video, "video");
            if (UptodownApp.f27990B.a0() && L0.this.getActivity() != null && !L0.this.requireActivity().isFinishing()) {
                Intent intent = new Intent(L0.this.getActivity(), (Class<?>) YouTubeActivity.class);
                intent.putExtra("id_youtube", video.getId());
                L0.this.startActivity(intent);
            }
        }

        @Override // W4.C
        public void d(X4.T video) {
            AbstractC3159y.i(video, "video");
            this.f11267d.remove(video);
            D4.D d8 = (D4.D) this.f11266c.f33747a;
            if (d8 != null) {
                d8.c(video);
            }
        }
    }

    /* renamed from: U4.L0$a, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C1393a {
        private C1393a() {
        }

        public final L0 a(C1498h c1498h, long j8) {
            L0 l02 = new L0();
            Bundle bundle = new Bundle();
            if (c1498h != null) {
                bundle.putParcelable("appInfo", c1498h);
            }
            bundle.putLong("appId", j8);
            l02.setArguments(bundle);
            return l02;
        }

        public /* synthetic */ C1393a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    public static final class a0 implements InterfaceC1481d {
        a0() {
        }

        @Override // W4.InterfaceC1481d
        public void b(C1498h app) {
            AbstractC3159y.i(app, "app");
            if (UptodownApp.f27990B.a0() && L0.this.getActivity() != null && !L0.this.requireActivity().isFinishing()) {
                L0.this.d5(app);
            }
        }
    }

    /* renamed from: U4.L0$b, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public final class RunnableC1394b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final int f11269a;

        /* renamed from: b, reason: collision with root package name */
        private final X4.O f11270b;

        public RunnableC1394b(int i8, X4.O o8) {
            this.f11269a = i8;
            this.f11270b = o8;
        }

        @Override // java.lang.Runnable
        public void run() {
            X4.O o8;
            if (L0.this.I3() != null && (o8 = this.f11270b) != null) {
                String n8 = o8.n();
                C1498h I32 = L0.this.I3();
                AbstractC3159y.f(I32);
                if (g6.n.s(n8, I32.y0(), true)) {
                    int i8 = this.f11269a;
                    if (i8 == 101) {
                        L0.this.p6(this.f11270b);
                        return;
                    }
                    if (i8 != 103) {
                        if (i8 == 109) {
                            L0.this.p6(this.f11270b);
                            L0.this.v5();
                            return;
                        } else {
                            FragmentActivity activity = L0.this.getActivity();
                            if (activity != null) {
                                L0.this.G6(activity);
                                return;
                            }
                            return;
                        }
                    }
                    if (L0.this.getContext() != null) {
                        C3319g c3319g = new C3319g();
                        C1498h I33 = L0.this.I3();
                        AbstractC3159y.f(I33);
                        if (c3319g.r(I33.y0(), L0.this.getContext())) {
                            L0 l02 = L0.this;
                            Context requireContext = l02.requireContext();
                            AbstractC3159y.h(requireContext, "requireContext()");
                            l02.r6(requireContext);
                            return;
                        }
                        L0 l03 = L0.this;
                        Context requireContext2 = l03.requireContext();
                        AbstractC3159y.h(requireContext2, "requireContext()");
                        l03.g6(requireContext2);
                        return;
                    }
                    FragmentActivity activity2 = L0.this.getActivity();
                    if (activity2 != null) {
                        L0.this.G6(activity2);
                    }
                }
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class b0 implements InterfaceC1478a {
        b0() {
        }

        @Override // W4.InterfaceC1478a
        public void a(C1498h appInfo, int i8) {
            AbstractC3159y.i(appInfo, "appInfo");
            L0.this.w6(appInfo);
        }
    }

    /* renamed from: U4.L0$c, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public final class RunnableC1395c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final String f11273a;

        /* renamed from: b, reason: collision with root package name */
        private final int f11274b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ L0 f11275c;

        public RunnableC1395c(L0 l02, String packagename, int i8) {
            AbstractC3159y.i(packagename, "packagename");
            this.f11275c = l02;
            this.f11273a = packagename;
            this.f11274b = i8;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:8:0x002f. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00bd  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r4 = this;
                U4.L0 r0 = r4.f11275c
                X4.h r0 = r0.I3()
                if (r0 == 0) goto Lce
                U4.L0 r0 = r4.f11275c
                X4.h r0 = r0.I3()
                kotlin.jvm.internal.AbstractC3159y.f(r0)
                java.lang.String r0 = r0.y0()
                if (r0 == 0) goto Lce
                U4.L0 r0 = r4.f11275c
                X4.h r0 = r0.I3()
                kotlin.jvm.internal.AbstractC3159y.f(r0)
                java.lang.String r0 = r0.y0()
                java.lang.String r1 = r4.f11273a
                r2 = 1
                boolean r0 = g6.n.s(r0, r1, r2)
                if (r0 == 0) goto Lce
                int r0 = r4.f11274b
                switch(r0) {
                    case 301: goto Lbd;
                    case 302: goto Laf;
                    case 303: goto L92;
                    case 304: goto L75;
                    case 305: goto L63;
                    case 306: goto L55;
                    case 307: goto L37;
                    default: goto L32;
                }
            L32:
                switch(r0) {
                    case 351: goto Lbd;
                    case 352: goto Laf;
                    case 353: goto L92;
                    default: goto L35;
                }
            L35:
                goto Lce
            L37:
                U4.L0 r0 = r4.f11275c
                androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
                if (r0 == 0) goto Lce
                U4.L0 r1 = r4.f11275c
                r2 = 2131951985(0x7f130171, float:1.95404E38)
                java.lang.String r2 = r1.getString(r2)
                java.lang.String r3 = "getString(R.string.error_generico)"
                kotlin.jvm.internal.AbstractC3159y.h(r2, r3)
                U4.L0.U0(r1, r2)
                U4.L0.v2(r1, r0)
                goto Lce
            L55:
                U4.L0 r0 = r4.f11275c
                androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
                if (r0 == 0) goto Lce
                U4.L0 r1 = r4.f11275c
                U4.L0.c2(r1, r0)
                goto Lce
            L63:
                U4.L0 r0 = r4.f11275c
                r1 = 2131953003(0x7f13056b, float:1.9542465E38)
                java.lang.String r1 = r0.getString(r1)
                java.lang.String r2 = "getString(R.string.uninstalling)"
                kotlin.jvm.internal.AbstractC3159y.h(r1, r2)
                U4.L0.e2(r0, r1)
                goto Lce
            L75:
                U4.L0 r0 = r4.f11275c
                androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
                if (r0 == 0) goto Lce
                U4.L0 r1 = r4.f11275c
                r2 = 2131952271(0x7f13028f, float:1.954098E38)
                java.lang.String r2 = r1.getString(r2)
                java.lang.String r3 = "getString(R.string.msg_r…iled_invalid_versioncode)"
                kotlin.jvm.internal.AbstractC3159y.h(r2, r3)
                U4.L0.U0(r1, r2)
                U4.L0.f2(r1, r0)
                goto Lce
            L92:
                U4.L0 r0 = r4.f11275c
                androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
                if (r0 == 0) goto Lce
                U4.L0 r1 = r4.f11275c
                r2 = 2131952262(0x7f130286, float:1.9540962E38)
                java.lang.String r2 = r1.getString(r2)
                java.lang.String r3 = "getString(R.string.msg_install_failed)"
                kotlin.jvm.internal.AbstractC3159y.h(r2, r3)
                U4.L0.U0(r1, r2)
                U4.L0.f2(r1, r0)
                goto Lce
            Laf:
                U4.L0 r0 = r4.f11275c
                androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
                if (r0 == 0) goto Lce
                U4.L0 r1 = r4.f11275c
                U4.L0.h2(r1, r0)
                goto Lce
            Lbd:
                U4.L0 r0 = r4.f11275c
                r1 = 2131952069(0x7f1301c5, float:1.954057E38)
                java.lang.String r1 = r0.getString(r1)
                java.lang.String r2 = "getString(R.string.installing)"
                kotlin.jvm.internal.AbstractC3159y.h(r1, r2)
                U4.L0.e2(r0, r1)
            Lce:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: U4.L0.RunnableC1395c.run():void");
        }
    }

    /* loaded from: classes5.dex */
    public static final class c0 extends ClickableSpan {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1503m f11276a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ L0 f11277b;

        c0(C1503m c1503m, L0 l02) {
            this.f11276a = c1503m;
            this.f11277b = l02;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            AbstractC3159y.i(widget, "widget");
            if (UptodownApp.f27990B.a0() && this.f11276a.a() != null) {
                this.f11277b.c5(this.f11276a.a().longValue());
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds) {
            AbstractC3159y.i(ds, "ds");
            super.updateDrawState(ds);
            ds.setColor(ContextCompat.getColor(this.f11277b.requireContext(), com.uptodown.R.color.main_blue));
            ds.setTypeface(E4.j.f2272g.t());
        }
    }

    /* renamed from: U4.L0$d, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public final class RunnableC1396d implements Runnable {
        public RunnableC1396d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentActivity activity;
            if (L0.this.I3() != null && (activity = L0.this.getActivity()) != null) {
                L0.this.G6(activity);
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class d0 extends ClickableSpan {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1503m f11279a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ L0 f11280b;

        d0(C1503m c1503m, L0 l02) {
            this.f11279a = c1503m;
            this.f11280b = l02;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            AbstractC3159y.i(widget, "widget");
            if (UptodownApp.f27990B.a0() && this.f11279a.a() != null) {
                C1501k c1501k = new C1501k((int) this.f11279a.a().longValue(), this.f11279a.d(), null, 4, null);
                c1501k.L(true);
                this.f11280b.Q4(c1501k);
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds) {
            AbstractC3159y.i(ds, "ds");
            super.updateDrawState(ds);
            ds.setColor(ContextCompat.getColor(this.f11280b.requireContext(), com.uptodown.R.color.main_blue));
            ds.setTypeface(E4.j.f2272g.t());
        }
    }

    /* renamed from: U4.L0$e, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public final class RunnableC1397e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final int f11281a;

        /* renamed from: b, reason: collision with root package name */
        private final C1505o f11282b;

        public RunnableC1397e(int i8, C1505o c1505o) {
            this.f11281a = i8;
            this.f11282b = c1505o;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            C1505o c1505o;
            if (L0.this.I3() != null && (c1505o = this.f11282b) != null && c1505o.Y() != null) {
                String Y7 = this.f11282b.Y();
                C1498h I32 = L0.this.I3();
                AbstractC3159y.f(I32);
                if (g6.n.s(Y7, I32.y0(), true)) {
                    int i8 = this.f11281a;
                    if (i8 != 103) {
                        if (i8 == 211) {
                            L0.this.k6(this.f11282b);
                            return;
                        }
                        switch (i8) {
                            case 200:
                                if (L0.this.C4()) {
                                    L0.this.c6(this.f11282b);
                                }
                                L0.this.v5();
                                return;
                            case ComposerKt.providerKey /* 201 */:
                                if (L0.this.C4()) {
                                    L0.this.c6(this.f11282b);
                                    return;
                                }
                                return;
                            case ComposerKt.compositionLocalMapKey /* 202 */:
                                if (L0.this.getContext() != null) {
                                    C3319g c3319g = new C3319g();
                                    C1498h I33 = L0.this.I3();
                                    AbstractC3159y.f(I33);
                                    if (c3319g.r(I33.y0(), L0.this.getContext())) {
                                        L0 l02 = L0.this;
                                        Context requireContext = l02.requireContext();
                                        AbstractC3159y.h(requireContext, "requireContext()");
                                        l02.r6(requireContext);
                                    } else {
                                        L0 l03 = L0.this;
                                        Context requireContext2 = l03.requireContext();
                                        AbstractC3159y.h(requireContext2, "requireContext()");
                                        l03.g6(requireContext2);
                                    }
                                    C1505o c1505o2 = this.f11282b;
                                    Context requireContext3 = L0.this.requireContext();
                                    AbstractC3159y.h(requireContext3, "requireContext()");
                                    File s8 = c1505o2.s(requireContext3);
                                    if (s8 != null) {
                                        UptodownApp.a aVar = UptodownApp.f27990B;
                                        Context requireContext4 = L0.this.requireContext();
                                        AbstractC3159y.h(requireContext4, "requireContext()");
                                        C1498h I34 = L0.this.I3();
                                        AbstractC3159y.f(I34);
                                        aVar.X(s8, requireContext4, I34.t0());
                                        return;
                                    }
                                    return;
                                }
                                FragmentActivity activity = L0.this.getActivity();
                                if (activity != null) {
                                    L0.this.G6(activity);
                                    return;
                                }
                                return;
                            case ComposerKt.providerValuesKey /* 203 */:
                                FragmentActivity activity2 = L0.this.getActivity();
                                if (activity2 != null) {
                                    L0 l04 = L0.this;
                                    String string = l04.getString(com.uptodown.R.string.download_error_message);
                                    AbstractC3159y.h(string, "getString(R.string.download_error_message)");
                                    l04.m3(string);
                                    l04.a6(activity2);
                                    return;
                                }
                                return;
                            default:
                                switch (i8) {
                                    case 205:
                                        L0.this.Z5(this.f11282b);
                                        return;
                                    case ComposerKt.referenceKey /* 206 */:
                                        FragmentActivity activity3 = L0.this.getActivity();
                                        if (activity3 != null) {
                                            L0.this.G6(activity3);
                                            return;
                                        }
                                        return;
                                    case ComposerKt.reuseKey /* 207 */:
                                        FragmentActivity activity4 = L0.this.getActivity();
                                        if (activity4 != null) {
                                            L0.this.a6(activity4);
                                            return;
                                        }
                                        return;
                                    default:
                                        FragmentActivity activity5 = L0.this.getActivity();
                                        if (activity5 != null) {
                                            L0.this.G6(activity5);
                                            return;
                                        }
                                        return;
                                }
                        }
                    }
                    C1505o c1505o3 = this.f11282b;
                    Context requireContext5 = L0.this.requireContext();
                    AbstractC3159y.h(requireContext5, "requireContext()");
                    File s9 = c1505o3.s(requireContext5);
                    if (s9 != null) {
                        UptodownApp.a aVar2 = UptodownApp.f27990B;
                        Context requireContext6 = L0.this.requireContext();
                        AbstractC3159y.h(requireContext6, "requireContext()");
                        C1498h I35 = L0.this.I3();
                        AbstractC3159y.f(I35);
                        aVar2.X(s9, requireContext6, I35.t0());
                        return;
                    }
                    return;
                }
            }
            L0 l05 = L0.this;
            C1505o c1505o4 = this.f11282b;
            if (c1505o4 != null) {
                str = c1505o4.Y();
            } else {
                str = null;
            }
            l05.O6(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class e0 extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f11284a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f11285b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f11287a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f11288b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ L0 f11289c;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: U4.L0$e0$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C0225a extends kotlin.coroutines.jvm.internal.l implements X5.n {

                /* renamed from: a, reason: collision with root package name */
                int f11290a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ L0 f11291b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0225a(L0 l02, P5.d dVar) {
                    super(2, dVar);
                    this.f11291b = l02;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final P5.d create(Object obj, P5.d dVar) {
                    return new C0225a(this.f11291b, dVar);
                }

                @Override // X5.n
                public final Object invoke(i6.M m8, P5.d dVar) {
                    return ((C0225a) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = Q5.b.e();
                    int i8 = this.f11290a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            L5.t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        L5.t.b(obj);
                        L0 l02 = this.f11291b;
                        this.f11290a = 1;
                        if (l02.T3(this) == e8) {
                            return e8;
                        }
                    }
                    return L5.I.f6474a;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes5.dex */
            public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

                /* renamed from: a, reason: collision with root package name */
                int f11292a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ L0 f11293b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(L0 l02, P5.d dVar) {
                    super(2, dVar);
                    this.f11293b = l02;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final P5.d create(Object obj, P5.d dVar) {
                    return new b(this.f11293b, dVar);
                }

                @Override // X5.n
                public final Object invoke(i6.M m8, P5.d dVar) {
                    return ((b) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = Q5.b.e();
                    int i8 = this.f11292a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            L5.t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        L5.t.b(obj);
                        L0 l02 = this.f11293b;
                        this.f11292a = 1;
                        if (l02.K3(this) == e8) {
                            return e8;
                        }
                    }
                    return L5.I.f6474a;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes5.dex */
            public static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

                /* renamed from: a, reason: collision with root package name */
                int f11294a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ L0 f11295b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(L0 l02, P5.d dVar) {
                    super(2, dVar);
                    this.f11295b = l02;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final P5.d create(Object obj, P5.d dVar) {
                    return new c(this.f11295b, dVar);
                }

                @Override // X5.n
                public final Object invoke(i6.M m8, P5.d dVar) {
                    return ((c) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = Q5.b.e();
                    int i8 = this.f11294a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            L5.t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        L5.t.b(obj);
                        L0 l02 = this.f11295b;
                        this.f11294a = 1;
                        if (l02.P3(this) == e8) {
                            return e8;
                        }
                    }
                    return L5.I.f6474a;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes5.dex */
            public static final class d extends kotlin.coroutines.jvm.internal.l implements X5.n {

                /* renamed from: a, reason: collision with root package name */
                int f11296a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ L0 f11297b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(L0 l02, P5.d dVar) {
                    super(2, dVar);
                    this.f11297b = l02;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final P5.d create(Object obj, P5.d dVar) {
                    return new d(this.f11297b, dVar);
                }

                @Override // X5.n
                public final Object invoke(i6.M m8, P5.d dVar) {
                    return ((d) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = Q5.b.e();
                    int i8 = this.f11296a;
                    if (i8 != 0) {
                        if (i8 != 1 && i8 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        L5.t.b(obj);
                    } else {
                        L5.t.b(obj);
                        C1498h I32 = this.f11297b.I3();
                        if (I32 != null && I32.h0() == 1) {
                            L0 l02 = this.f11297b;
                            this.f11296a = 1;
                            if (l02.H3(this) == e8) {
                                return e8;
                            }
                        } else {
                            L0 l03 = this.f11297b;
                            this.f11296a = 2;
                            if (l03.R3(this) == e8) {
                                return e8;
                            }
                        }
                    }
                    return L5.I.f6474a;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes5.dex */
            public static final class e extends kotlin.coroutines.jvm.internal.l implements X5.n {

                /* renamed from: a, reason: collision with root package name */
                int f11298a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ L0 f11299b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                e(L0 l02, P5.d dVar) {
                    super(2, dVar);
                    this.f11299b = l02;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final P5.d create(Object obj, P5.d dVar) {
                    return new e(this.f11299b, dVar);
                }

                @Override // X5.n
                public final Object invoke(i6.M m8, P5.d dVar) {
                    return ((e) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = Q5.b.e();
                    int i8 = this.f11298a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            L5.t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        L5.t.b(obj);
                        L0 l02 = this.f11299b;
                        this.f11298a = 1;
                        if (l02.Q3(this) == e8) {
                            return e8;
                        }
                    }
                    return L5.I.f6474a;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes5.dex */
            public static final class f extends kotlin.coroutines.jvm.internal.l implements X5.n {

                /* renamed from: a, reason: collision with root package name */
                int f11300a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ L0 f11301b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                f(L0 l02, P5.d dVar) {
                    super(2, dVar);
                    this.f11301b = l02;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final P5.d create(Object obj, P5.d dVar) {
                    return new f(this.f11301b, dVar);
                }

                @Override // X5.n
                public final Object invoke(i6.M m8, P5.d dVar) {
                    return ((f) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = Q5.b.e();
                    int i8 = this.f11300a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            L5.t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        L5.t.b(obj);
                        L0 l02 = this.f11301b;
                        this.f11300a = 1;
                        if (l02.M3(this) == e8) {
                            return e8;
                        }
                    }
                    return L5.I.f6474a;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes5.dex */
            public static final class g extends kotlin.coroutines.jvm.internal.l implements X5.n {

                /* renamed from: a, reason: collision with root package name */
                int f11302a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ L0 f11303b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                g(L0 l02, P5.d dVar) {
                    super(2, dVar);
                    this.f11303b = l02;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final P5.d create(Object obj, P5.d dVar) {
                    return new g(this.f11303b, dVar);
                }

                @Override // X5.n
                public final Object invoke(i6.M m8, P5.d dVar) {
                    return ((g) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = Q5.b.e();
                    int i8 = this.f11302a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            L5.t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        L5.t.b(obj);
                        L0 l02 = this.f11303b;
                        this.f11302a = 1;
                        if (l02.L3(this) == e8) {
                            return e8;
                        }
                    }
                    return L5.I.f6474a;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes5.dex */
            public static final class h extends kotlin.coroutines.jvm.internal.l implements X5.n {

                /* renamed from: a, reason: collision with root package name */
                int f11304a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ L0 f11305b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                h(L0 l02, P5.d dVar) {
                    super(2, dVar);
                    this.f11305b = l02;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final P5.d create(Object obj, P5.d dVar) {
                    return new h(this.f11305b, dVar);
                }

                @Override // X5.n
                public final Object invoke(i6.M m8, P5.d dVar) {
                    return ((h) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = Q5.b.e();
                    int i8 = this.f11304a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            L5.t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        L5.t.b(obj);
                        L0 l02 = this.f11305b;
                        this.f11304a = 1;
                        if (l02.G3(this) == e8) {
                            return e8;
                        }
                    }
                    return L5.I.f6474a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(L0 l02, P5.d dVar) {
                super(2, dVar);
                this.f11289c = l02;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                a aVar = new a(this.f11289c, dVar);
                aVar.f11288b = obj;
                return aVar;
            }

            @Override // X5.n
            public final Object invoke(i6.M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f11287a == 0) {
                    L5.t.b(obj);
                    i6.M m8 = (i6.M) this.f11288b;
                    AbstractC2829k.d(m8, null, null, new C0225a(this.f11289c, null), 3, null);
                    AbstractC2829k.d(m8, null, null, new b(this.f11289c, null), 3, null);
                    AbstractC2829k.d(m8, null, null, new c(this.f11289c, null), 3, null);
                    AbstractC2829k.d(m8, null, null, new d(this.f11289c, null), 3, null);
                    AbstractC2829k.d(m8, null, null, new e(this.f11289c, null), 3, null);
                    AbstractC2829k.d(m8, null, null, new f(this.f11289c, null), 3, null);
                    AbstractC2829k.d(m8, null, null, new g(this.f11289c, null), 3, null);
                    AbstractC2829k.d(m8, null, null, new h(this.f11289c, null), 3, null);
                    return L5.I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        e0(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            e0 e0Var = new e0(dVar);
            e0Var.f11285b = obj;
            return e0Var;
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((e0) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            InterfaceC2855x0 d8;
            Object e8 = Q5.b.e();
            int i8 = this.f11284a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                d8 = AbstractC2829k.d((i6.M) this.f11285b, C2812b0.b(), null, new a(L0.this, null), 2, null);
                this.f11284a = 1;
                if (d8.e(this) == e8) {
                    return e8;
                }
            }
            return L5.I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U4.L0$f, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C1398f extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f11306a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3312F f11308c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f11309d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: U4.L0$f$a */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f11310a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L0 f11311b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(L0 l02, P5.d dVar) {
                super(2, dVar);
                this.f11311b = l02;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f11311b, dVar);
            }

            @Override // X5.n
            public final Object invoke(i6.M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f11310a == 0) {
                    L5.t.b(obj);
                    this.f11311b.m6();
                    this.f11311b.o3();
                    return L5.I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1398f(C3312F c3312f, View view, P5.d dVar) {
            super(2, dVar);
            this.f11308c = c3312f;
            this.f11309d = view;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new C1398f(this.f11308c, this.f11309d, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((C1398f) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String d8;
            Object e8 = Q5.b.e();
            int i8 = this.f11306a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                if (L0.this.I3() != null) {
                    C1498h I32 = L0.this.I3();
                    AbstractC3159y.f(I32);
                    if (I32.i() > 0) {
                        C1498h I33 = L0.this.I3();
                        AbstractC3159y.f(I33);
                        long i9 = I33.i();
                        C1498h I34 = L0.this.I3();
                        AbstractC3159y.f(I34);
                        String s02 = I34.s0();
                        AbstractC3159y.f(s02);
                        C1498h I35 = L0.this.I3();
                        AbstractC3159y.f(I35);
                        String m02 = I35.m0();
                        C1498h I36 = L0.this.I3();
                        AbstractC3159y.f(I36);
                        X4.D d9 = new X4.D(i9, s02, m02, I36.C0());
                        C3312F c3312f = this.f11308c;
                        C1498h I37 = L0.this.I3();
                        AbstractC3159y.f(I37);
                        X4.I a8 = c3312f.a(I37.i());
                        if (!a8.b() && (d8 = a8.d()) != null && d8.length() != 0) {
                            String d10 = a8.d();
                            AbstractC3159y.f(d10);
                            JSONObject jSONObject = new JSONObject(d10);
                            if (!jSONObject.isNull("success") && jSONObject.getInt("success") == 1) {
                                if (this.f11309d.getContext() != null) {
                                    Bundle bundle = new Bundle();
                                    bundle.putString("type", "added");
                                    new C3330r(this.f11309d.getContext()).b("preregister", bundle);
                                    Context requireContext = L0.this.requireContext();
                                    AbstractC3159y.h(requireContext, "requireContext()");
                                    d9.h(requireContext);
                                }
                                i6.J0 c8 = C2812b0.c();
                                a aVar = new a(L0.this, null);
                                this.f11306a = 1;
                                if (AbstractC2825i.g(c8, aVar, this) == e8) {
                                    return e8;
                                }
                            }
                        }
                    }
                }
            }
            return L5.I.f6474a;
        }
    }

    /* loaded from: classes5.dex */
    public static final class f0 implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f11312a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ L0 f11313b;

        f0(View view, L0 l02) {
            this.f11312a = view;
            this.f11313b = l02;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f11312a.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f11313b.startPostponedEnterTransition();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U4.L0$g, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C1399g extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f11314a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3312F f11316c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f11317d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: U4.L0$g$a */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f11318a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L0 f11319b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(L0 l02, P5.d dVar) {
                super(2, dVar);
                this.f11319b = l02;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f11319b, dVar);
            }

            @Override // X5.n
            public final Object invoke(i6.M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f11318a == 0) {
                    L5.t.b(obj);
                    this.f11319b.m6();
                    FragmentActivity activity = this.f11319b.getActivity();
                    AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
                    AlertDialog s22 = ((AbstractActivityC2489a) activity).s2();
                    if (s22 != null) {
                        s22.dismiss();
                        return L5.I.f6474a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1399g(C3312F c3312f, View view, P5.d dVar) {
            super(2, dVar);
            this.f11316c = c3312f;
            this.f11317d = view;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new C1399g(this.f11316c, this.f11317d, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((C1399g) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String d8;
            Object e8 = Q5.b.e();
            int i8 = this.f11314a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                if (L0.this.I3() != null) {
                    C1498h I32 = L0.this.I3();
                    AbstractC3159y.f(I32);
                    if (I32.i() > 0) {
                        C1498h I33 = L0.this.I3();
                        AbstractC3159y.f(I33);
                        long i9 = I33.i();
                        X4.I d9 = this.f11316c.d(i9);
                        if (!d9.b() && (d8 = d9.d()) != null && d8.length() != 0) {
                            String d10 = d9.d();
                            AbstractC3159y.f(d10);
                            JSONObject jSONObject = new JSONObject(d10);
                            if (!jSONObject.isNull("success") && jSONObject.getInt("success") == 1) {
                                if (this.f11317d.getContext() != null) {
                                    Bundle bundle = new Bundle();
                                    bundle.putString("type", "removed");
                                    new C3330r(this.f11317d.getContext()).b("preregister", bundle);
                                    C3326n.a aVar = C3326n.f34490t;
                                    Context context = this.f11317d.getContext();
                                    AbstractC3159y.h(context, "context");
                                    C3326n a8 = aVar.a(context);
                                    a8.a();
                                    a8.b1(i9);
                                    a8.g();
                                }
                                i6.J0 c8 = C2812b0.c();
                                a aVar2 = new a(L0.this, null);
                                this.f11314a = 1;
                                if (AbstractC2825i.g(c8, aVar2, this) == e8) {
                                    return e8;
                                }
                            }
                        }
                    }
                }
            }
            return L5.I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class g0 extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f11320a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f11322c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g0(String str, P5.d dVar) {
            super(2, dVar);
            this.f11322c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new g0(this.f11322c, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((g0) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f11320a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                L0 l02 = L0.this;
                String str = this.f11322c;
                this.f11320a = 1;
                if (l02.L6(str, this) == e8) {
                    return e8;
                }
            }
            return L5.I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U4.L0$h, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C1400h extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f11323a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f11324b;

        /* renamed from: d, reason: collision with root package name */
        int f11326d;

        C1400h(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f11324b = obj;
            this.f11326d |= Integer.MIN_VALUE;
            return L0.this.U2(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class h0 extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f11327a;

        h0(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new h0(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((h0) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f11327a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                L0 l02 = L0.this;
                this.f11327a = 1;
                if (l02.O3(this) == e8) {
                    return e8;
                }
            }
            return L5.I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U4.L0$i, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C1401i extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f11329a;

        C1401i(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new C1401i(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((C1401i) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f11329a == 0) {
                L5.t.b(obj);
                if (L0.this.getContext() != null && L0.this.I3() != null) {
                    C1498h I32 = L0.this.I3();
                    AbstractC3159y.f(I32);
                    if (I32.y0() != null) {
                        C3326n.a aVar = C3326n.f34490t;
                        Context requireContext = L0.this.requireContext();
                        AbstractC3159y.h(requireContext, "requireContext()");
                        C3326n a8 = aVar.a(requireContext);
                        a8.a();
                        C1498h I33 = L0.this.I3();
                        AbstractC3159y.f(I33);
                        String y02 = I33.y0();
                        AbstractC3159y.f(y02);
                        C1496f S7 = a8.S(y02);
                        if (S7 != null) {
                            L0.this.f11190g = S7;
                        }
                    }
                }
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class i0 extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f11331a;

        i0(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new i0(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((i0) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f11331a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                L0 l02 = L0.this;
                this.f11331a = 1;
                if (l02.O3(this) == e8) {
                    return e8;
                }
            }
            return L5.I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U4.L0$j, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C1402j extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f11333a;

        C1402j(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new C1402j(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((C1402j) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f11333a == 0) {
                L5.t.b(obj);
                if (L0.this.f11190g != null) {
                    C1496f c1496f = L0.this.f11190g;
                    AbstractC3159y.f(c1496f);
                    if (c1496f.i() == 0) {
                        L0 l02 = L0.this;
                        String string = l02.getString(com.uptodown.R.string.not_offer_updates);
                        AbstractC3159y.h(string, "getString(R.string.not_offer_updates)");
                        l02.W5(com.uptodown.R.id.action_exclude, string);
                        return L5.I.f6474a;
                    }
                }
                L0 l03 = L0.this;
                String string2 = l03.getString(com.uptodown.R.string.offer_updates_again);
                AbstractC3159y.h(string2, "getString(R.string.offer_updates_again)");
                l03.W5(com.uptodown.R.id.action_exclude, string2);
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class j0 extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1498h f11335a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ L0 f11336b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j0(C1498h c1498h, L0 l02) {
            super(0);
            this.f11335a = c1498h;
            this.f11336b = l02;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m65invoke();
            return L5.I.f6474a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m65invoke() {
            if (this.f11335a.y0() != null) {
                L0 l02 = this.f11336b;
                String y02 = this.f11335a.y0();
                AbstractC3159y.f(y02);
                l02.O6(y02);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U4.L0$k, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C1403k extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f11337a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f11339c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.T f11340d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.O f11341e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.O f11342f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1403k(Context context, kotlin.jvm.internal.T t8, kotlin.jvm.internal.O o8, kotlin.jvm.internal.O o9, P5.d dVar) {
            super(2, dVar);
            this.f11339c = context;
            this.f11340d = t8;
            this.f11341e = o8;
            this.f11342f = o9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new C1403k(this.f11339c, this.f11340d, this.f11341e, this.f11342f, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((C1403k) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C1496f c1496f;
            Object obj2;
            Q5.b.e();
            if (this.f11337a == 0) {
                L5.t.b(obj);
                L0.this.J3().f10396D.f10689d.setVisibility(8);
                L0.this.J3().f10393A.f11016h.setVisibility(8);
                if (L0.this.I3() != null) {
                    C1498h I32 = L0.this.I3();
                    AbstractC3159y.f(I32);
                    if (I32.c()) {
                        L0.this.J3().f10420a0.setVisibility(0);
                    } else {
                        L0.this.J3().f10420a0.setVisibility(8);
                    }
                    C1498h I33 = L0.this.I3();
                    AbstractC3159y.f(I33);
                    if (I33.r1()) {
                        L0.this.n6();
                    } else {
                        C1498h I34 = L0.this.I3();
                        AbstractC3159y.f(I34);
                        if (I34.o1()) {
                            L0.this.a6(this.f11339c);
                        } else {
                            String str = null;
                            if (L0.this.f11190g != null) {
                                if (L0.this.f11191h != null) {
                                    X4.O o8 = L0.this.f11191h;
                                    AbstractC3159y.f(o8);
                                    if (o8.f() != 1) {
                                        C1496f c1496f2 = L0.this.f11190g;
                                        AbstractC3159y.f(c1496f2);
                                        if (c1496f2.i() != 1) {
                                            if (this.f11340d.f33747a == null) {
                                                if (!L0.this.f11192i) {
                                                    L0.this.u6(this.f11339c);
                                                } else {
                                                    X4.O o9 = L0.this.f11191h;
                                                    AbstractC3159y.f(o9);
                                                    if (!o9.b()) {
                                                        ArrayList G8 = UptodownApp.f27990B.G();
                                                        if (G8 != null) {
                                                            L0 l02 = L0.this;
                                                            Iterator it = G8.iterator();
                                                            while (true) {
                                                                if (it.hasNext()) {
                                                                    obj2 = it.next();
                                                                    String Q8 = ((C1496f) obj2).Q();
                                                                    X4.O o10 = l02.f11191h;
                                                                    AbstractC3159y.f(o10);
                                                                    if (AbstractC3159y.d(Q8, o10.n())) {
                                                                        break;
                                                                    }
                                                                } else {
                                                                    obj2 = null;
                                                                    break;
                                                                }
                                                            }
                                                            c1496f = (C1496f) obj2;
                                                        } else {
                                                            c1496f = null;
                                                        }
                                                        if (c1496f == null) {
                                                            X4.O o11 = L0.this.f11191h;
                                                            AbstractC3159y.f(o11);
                                                            if (!o11.b()) {
                                                                X4.O o12 = L0.this.f11191h;
                                                                AbstractC3159y.f(o12);
                                                                if (o12.o() != 100) {
                                                                    L0.this.t6(this.f11339c);
                                                                }
                                                            }
                                                            K4.a h8 = E4.j.f2272g.h();
                                                            if (h8 != null) {
                                                                str = h8.b();
                                                            }
                                                            X4.O o13 = L0.this.f11191h;
                                                            AbstractC3159y.f(o13);
                                                            if (!g6.n.s(str, o13.n(), true)) {
                                                                L0.this.r6(this.f11339c);
                                                            } else {
                                                                L0 l03 = L0.this;
                                                                String string = l03.getString(com.uptodown.R.string.updating);
                                                                AbstractC3159y.h(string, "getString(R.string.updating)");
                                                                l03.f6(string);
                                                            }
                                                        }
                                                    }
                                                    L0 l04 = L0.this;
                                                    l04.p6(l04.f11191h);
                                                }
                                            } else if (!L0.this.f11192i) {
                                                L0.this.u6(this.f11339c);
                                            } else if (!this.f11341e.f33743a) {
                                                L0.this.a6(this.f11339c);
                                            } else if (L0.this.f11193j) {
                                                L0.this.r6(this.f11339c);
                                            } else if (L0.this.C4() || this.f11342f.f33743a) {
                                                L0.this.c6((C1505o) this.f11340d.f33747a);
                                            } else {
                                                L0.this.t6(this.f11339c);
                                            }
                                        }
                                    }
                                }
                                C1496f c1496f3 = L0.this.f11190g;
                                AbstractC3159y.f(c1496f3);
                                if (!c1496f3.n0()) {
                                    L0.this.j6(this.f11339c);
                                } else {
                                    L0.this.J3().f10396D.getRoot().setVisibility(4);
                                    L0.this.J3().f10393A.getRoot().setVisibility(8);
                                }
                            } else if (!L0.this.W3()) {
                                L0.this.i6(this.f11339c, (C1505o) this.f11340d.f33747a);
                            } else {
                                if (!L0.this.f11174A) {
                                    C1498h I35 = L0.this.I3();
                                    AbstractC3159y.f(I35);
                                    if (!I35.m1()) {
                                        C1498h I36 = L0.this.I3();
                                        AbstractC3159y.f(I36);
                                        if (I36.p1()) {
                                            L0.this.m6();
                                        } else {
                                            C1498h I37 = L0.this.I3();
                                            AbstractC3159y.f(I37);
                                            if (!I37.k1() && SettingsPreferences.f29309b.S(this.f11339c)) {
                                                L0.this.H4();
                                                L0 l05 = L0.this;
                                                String string2 = l05.getString(com.uptodown.R.string.app_detail_not_compatible);
                                                AbstractC3159y.h(string2, "getString(R.string.app_detail_not_compatible)");
                                                l05.Y5(string2);
                                            } else {
                                                C1498h I38 = L0.this.I3();
                                                AbstractC3159y.f(I38);
                                                if (I38.y0() != null) {
                                                    K4.a h9 = E4.j.f2272g.h();
                                                    if (h9 != null) {
                                                        str = h9.b();
                                                    }
                                                    C1498h I39 = L0.this.I3();
                                                    AbstractC3159y.f(I39);
                                                    if (g6.n.s(str, I39.y0(), true)) {
                                                        L0 l06 = L0.this;
                                                        String string3 = l06.getString(com.uptodown.R.string.installing);
                                                        AbstractC3159y.h(string3, "getString(R.string.installing)");
                                                        l06.f6(string3);
                                                    } else {
                                                        if (L0.this.f11191h != null) {
                                                            C3326n a8 = C3326n.f34490t.a(this.f11339c);
                                                            a8.a();
                                                            X4.O o14 = L0.this.f11191h;
                                                            AbstractC3159y.f(o14);
                                                            a8.M(o14.n());
                                                            a8.g();
                                                        }
                                                        if (this.f11340d.f33747a == null) {
                                                            L0.this.a6(this.f11339c);
                                                        } else if (!L0.this.f11192i) {
                                                            if ((L0.this.C4() || this.f11342f.f33743a) && this.f11341e.f33743a) {
                                                                L0.this.c6((C1505o) this.f11340d.f33747a);
                                                            } else {
                                                                L0.this.a6(this.f11339c);
                                                            }
                                                        } else if (L0.this.f11193j) {
                                                            L0.this.g6(this.f11339c);
                                                        } else if (L0.this.C4() || this.f11342f.f33743a) {
                                                            L0.this.c6((C1505o) this.f11340d.f33747a);
                                                        } else {
                                                            L0.this.o6(this.f11339c);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                L0 l07 = L0.this;
                                String string4 = l07.getString(com.uptodown.R.string.app_detail_not_available);
                                AbstractC3159y.h(string4, "getString(R.string.app_detail_not_available)");
                                l07.Y5(string4);
                            }
                        }
                    }
                    L0.this.f11205v = true;
                    if (L0.this.f11190g != null) {
                        L0.this.D6(com.uptodown.R.id.action_app_details_settings);
                        L0.this.D6(com.uptodown.R.id.action_exclude);
                    } else {
                        L0.this.X3(com.uptodown.R.id.action_app_details_settings);
                        L0.this.X3(com.uptodown.R.id.action_exclude);
                    }
                    C1498h I310 = L0.this.I3();
                    AbstractC3159y.f(I310);
                    if (I310.o1()) {
                        C1498h I311 = L0.this.I3();
                        AbstractC3159y.f(I311);
                        String Y7 = I311.Y();
                        if (Y7 != null && Y7.length() != 0) {
                            TextView textView = L0.this.J3().f10446o.f10112c;
                            L0 l08 = L0.this;
                            textView.setTypeface(E4.j.f2272g.u());
                            C1498h I312 = l08.I3();
                            AbstractC3159y.f(I312);
                            textView.setText(I312.Y());
                            L0.this.J3().f10446o.getRoot().setVisibility(0);
                        }
                    }
                    L0.this.J3().f10446o.getRoot().setVisibility(8);
                    L0.this.J3().f10446o.f10112c.setVisibility(8);
                }
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U4.L0$l, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C1404l extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f11346a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.O f11348c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: U4.L0$l$a */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f11349a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.T f11350b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ L0 f11351c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.O f11352d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C3312F f11353e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(kotlin.jvm.internal.T t8, L0 l02, kotlin.jvm.internal.O o8, C3312F c3312f, P5.d dVar) {
                super(2, dVar);
                this.f11350b = t8;
                this.f11351c = l02;
                this.f11352d = o8;
                this.f11353e = c3312f;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f11350b, this.f11351c, this.f11352d, this.f11353e, dVar);
            }

            @Override // X5.n
            public final Object invoke(i6.M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f11349a == 0) {
                    L5.t.b(obj);
                    CharSequence charSequence = (CharSequence) this.f11350b.f33747a;
                    if (charSequence != null && charSequence.length() != 0) {
                        this.f11351c.J3().f10396D.f10691f.setText((CharSequence) this.f11350b.f33747a);
                        this.f11351c.J3().f10393A.f11024p.setText((CharSequence) this.f11350b.f33747a);
                    }
                    if (this.f11352d.f33743a) {
                        L0 l02 = this.f11351c;
                        TextView textView = l02.J3().f10396D.f10691f;
                        AbstractC3159y.h(textView, "binding.rlDownloadButton…ppDetail.tvStatusDownload");
                        l02.P2(textView, this.f11353e);
                        L0 l03 = this.f11351c;
                        RelativeLayout relativeLayout = l03.J3().f10393A.f11017i;
                        AbstractC3159y.h(relativeLayout, "binding.rlBottomDownload…etail.rlStatusPreRegister");
                        l03.P2(relativeLayout, this.f11353e);
                        this.f11351c.J3().f10393A.f11012d.setVisibility(8);
                        if (this.f11351c.getContext() != null) {
                            this.f11351c.J3().f10396D.f10691f.setBackground(ContextCompat.getDrawable(this.f11351c.requireContext(), com.uptodown.R.drawable.ripple_open_button));
                            this.f11351c.J3().f10396D.f10691f.setTextColor(ContextCompat.getColorStateList(this.f11351c.requireContext(), com.uptodown.R.color.selector_wizard_accept_button_text));
                            this.f11351c.J3().f10393A.f11017i.setBackground(ContextCompat.getDrawable(this.f11351c.requireContext(), com.uptodown.R.drawable.ripple_open_button));
                            this.f11351c.J3().f10393A.f11024p.setTextColor(ContextCompat.getColorStateList(this.f11351c.requireContext(), com.uptodown.R.color.selector_wizard_accept_button_text));
                        }
                    } else {
                        L0 l04 = this.f11351c;
                        TextView textView2 = l04.J3().f10396D.f10691f;
                        AbstractC3159y.h(textView2, "binding.rlDownloadButton…ppDetail.tvStatusDownload");
                        l04.C2(textView2, this.f11353e);
                        L0 l05 = this.f11351c;
                        RelativeLayout relativeLayout2 = l05.J3().f10393A.f11017i;
                        AbstractC3159y.h(relativeLayout2, "binding.rlBottomDownload…etail.rlStatusPreRegister");
                        l05.C2(relativeLayout2, this.f11353e);
                        this.f11351c.J3().f10393A.f11012d.setVisibility(0);
                        if (this.f11351c.getContext() != null) {
                            this.f11351c.J3().f10396D.f10691f.setBackground(ContextCompat.getDrawable(this.f11351c.requireContext(), com.uptodown.R.drawable.ripple_blue_primary_button));
                            this.f11351c.J3().f10396D.f10691f.setTextColor(ContextCompat.getColor(this.f11351c.requireContext(), com.uptodown.R.color.white));
                            this.f11351c.J3().f10393A.f11017i.setBackground(ContextCompat.getDrawable(this.f11351c.requireContext(), com.uptodown.R.drawable.ripple_blue_primary_button));
                            this.f11351c.J3().f10393A.f11024p.setTextColor(ContextCompat.getColor(this.f11351c.requireContext(), com.uptodown.R.color.white));
                        }
                    }
                    return L5.I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1404l(kotlin.jvm.internal.O o8, P5.d dVar) {
            super(2, dVar);
            this.f11348c = o8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new C1404l(this.f11348c, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((C1404l) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String d8;
            boolean z8;
            Object e8 = Q5.b.e();
            int i8 = this.f11346a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                kotlin.jvm.internal.T t8 = new kotlin.jvm.internal.T();
                Context requireContext = L0.this.requireContext();
                AbstractC3159y.h(requireContext, "requireContext()");
                C3312F c3312f = new C3312F(requireContext);
                C1498h I32 = L0.this.I3();
                AbstractC3159y.f(I32);
                X4.I h8 = c3312f.h(I32.i());
                if (!h8.b() && (d8 = h8.d()) != null && d8.length() != 0) {
                    String d9 = h8.d();
                    AbstractC3159y.f(d9);
                    JSONObject jSONObject = new JSONObject(d9);
                    if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                        AbstractC3159y.h(jSONObject2, "json.getJSONObject(Constantes.FIELD_DATA)");
                        if (!jSONObject2.isNull("message")) {
                            t8.f33747a = jSONObject2.getString("message");
                        }
                        if (!jSONObject2.isNull("preRegistered")) {
                            kotlin.jvm.internal.O o8 = this.f11348c;
                            if (jSONObject2.getInt("preRegistered") != 0) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            o8.f33743a = z8;
                        }
                    }
                }
                i6.J0 c8 = C2812b0.c();
                a aVar = new a(t8, L0.this, this.f11348c, c3312f, null);
                this.f11346a = 1;
                if (AbstractC2825i.g(c8, aVar, this) == e8) {
                    return e8;
                }
            }
            return L5.I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class l0 extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1498h f11354a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ L0 f11355b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l0(C1498h c1498h, L0 l02) {
            super(0);
            this.f11354a = c1498h;
            this.f11355b = l02;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m67invoke();
            return L5.I.f6474a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m67invoke() {
            if (this.f11354a.y0() != null) {
                L0 l02 = this.f11355b;
                String y02 = this.f11354a.y0();
                AbstractC3159y.f(y02);
                l02.O6(y02);
            }
        }
    }

    /* renamed from: U4.L0$m, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C1405m implements W4.K {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1505o f11357b;

        /* renamed from: U4.L0$m$a */
        /* loaded from: classes5.dex */
        static final class a extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L0 f11358a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C1505o f11359b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(L0 l02, C1505o c1505o) {
                super(0);
                this.f11358a = l02;
                this.f11359b = c1505o;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m68invoke();
                return L5.I.f6474a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m68invoke() {
                this.f11358a.A3(this.f11359b);
            }
        }

        /* renamed from: U4.L0$m$b */
        /* loaded from: classes5.dex */
        static final class b extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L0 f11360a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(L0 l02) {
                super(0);
                this.f11360a = l02;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m69invoke();
                return L5.I.f6474a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m69invoke() {
                L0 l02 = this.f11360a;
                FragmentActivity requireActivity = l02.requireActivity();
                AbstractC3159y.h(requireActivity, "requireActivity()");
                l02.O2(requireActivity);
            }
        }

        C1405m(C1505o c1505o) {
            this.f11357b = c1505o;
        }

        @Override // W4.K
        public void a(X4.H reportVT) {
            AbstractC3159y.i(reportVT, "reportVT");
            if (L0.this.getActivity() != null && (L0.this.getActivity() instanceof AbstractActivityC2489a) && !L0.this.requireActivity().isFinishing() && L0.this.I3() != null) {
                C1498h I32 = L0.this.I3();
                AbstractC3159y.f(I32);
                I32.B1(reportVT);
                if (reportVT.f() <= 0) {
                    L0.this.A3(this.f11357b);
                    return;
                }
                FragmentActivity activity = L0.this.getActivity();
                AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
                C1498h I33 = L0.this.I3();
                AbstractC3159y.f(I33);
                ((AbstractActivityC2489a) activity).k2(I33, new a(L0.this, this.f11357b), new b(L0.this));
            }
        }

        @Override // W4.K
        public void b() {
            L0.this.A3(this.f11357b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U4.L0$n, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C1406n extends AbstractC3160z implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1505o f11365b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1406n(C1505o c1505o) {
            super(0);
            this.f11365b = c1505o;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m71invoke();
            return L5.I.f6474a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m71invoke() {
            L0.this.A3(this.f11365b);
        }
    }

    /* loaded from: classes5.dex */
    public static final class n0 implements InterfaceC2774b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1359a f11367b;

        n0(C1359a c1359a) {
            this.f11367b = c1359a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(C1359a interstitialBinding, L0 this$0) {
            AbstractC3159y.i(interstitialBinding, "$interstitialBinding");
            AbstractC3159y.i(this$0, "this$0");
            if (new C3323k().p(interstitialBinding.getRoot())) {
                C1510u.a aVar = C1510u.f12703n;
                Context requireContext = this$0.requireContext();
                AbstractC3159y.h(requireContext, "requireContext()");
                C1510u d8 = aVar.d(requireContext);
                if (d8 != null) {
                    Context requireContext2 = this$0.requireContext();
                    AbstractC3159y.h(requireContext2, "requireContext()");
                    d8.j(requireContext2);
                    return;
                }
                return;
            }
            if (this$0.getActivity() != null && (this$0.getActivity() instanceof MainActivity)) {
                FragmentActivity activity = this$0.getActivity();
                AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                ((MainActivity) activity).V2();
            }
        }

        @Override // i2.InterfaceC2774b
        public void a(Exception exc) {
            L0.this.J3().f10431g.removeAllViews();
            L0.this.J3().f10431g.setVisibility(8);
            L0.this.C6();
        }

        @Override // i2.InterfaceC2774b
        public void b() {
            if (L0.this.getActivity() != null && (L0.this.getActivity() instanceof MainActivity)) {
                FragmentActivity activity = L0.this.getActivity();
                AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                ((MainActivity) activity).w2();
            }
            L0.this.J3().f10431g.addView(this.f11367b.getRoot());
            L0.this.J3().f10431g.setVisibility(0);
            Handler handler = new Handler(Looper.getMainLooper());
            final C1359a c1359a = this.f11367b;
            final L0 l02 = L0.this;
            handler.postDelayed(new Runnable() { // from class: U4.R0
                @Override // java.lang.Runnable
                public final void run() {
                    L0.n0.d(C1359a.this, l02);
                }
            }, 500L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U4.L0$o, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C1407o extends AbstractC3160z implements Function0 {
        C1407o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m72invoke();
            return L5.I.f6474a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m72invoke() {
            L0 l02 = L0.this;
            FragmentActivity requireActivity = l02.requireActivity();
            AbstractC3159y.h(requireActivity, "requireActivity()");
            l02.O2(requireActivity);
        }
    }

    /* loaded from: classes5.dex */
    public static final class o0 implements NewInterstitialListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MBNewInterstitialHandler f11370b;

        o0(MBNewInterstitialHandler mBNewInterstitialHandler) {
            this.f11370b = mBNewInterstitialHandler;
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public void onAdClicked(MBridgeIds ids) {
            AbstractC3159y.i(ids, "ids");
            Bundle bundle = new Bundle();
            bundle.putString("type", "clicked");
            new C3330r(L0.this.getContext()).b("mintegral_interstitial", bundle);
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public void onAdClose(MBridgeIds ids, RewardInfo info) {
            AbstractC3159y.i(ids, "ids");
            AbstractC3159y.i(info, "info");
            Bundle bundle = new Bundle();
            bundle.putString("type", "closed");
            new C3330r(L0.this.getContext()).b("mintegral_interstitial", bundle);
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public void onAdCloseWithNIReward(MBridgeIds ids, RewardInfo info) {
            AbstractC3159y.i(ids, "ids");
            AbstractC3159y.i(info, "info");
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public void onAdShow(MBridgeIds ids) {
            AbstractC3159y.i(ids, "ids");
            if (L0.this.getContext() != null) {
                Bundle bundle = new Bundle();
                bundle.putString("type", "show");
                new C3330r(L0.this.getContext()).b("mintegral_interstitial", bundle);
                SettingsPreferences.a aVar = SettingsPreferences.f29309b;
                Context requireContext = L0.this.requireContext();
                AbstractC3159y.h(requireContext, "requireContext()");
                aVar.Q0(requireContext, System.currentTimeMillis());
            }
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public void onEndcardShow(MBridgeIds ids) {
            AbstractC3159y.i(ids, "ids");
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public void onLoadCampaignSuccess(MBridgeIds ids) {
            AbstractC3159y.i(ids, "ids");
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public void onResourceLoadFail(MBridgeIds ids, String errorMsg) {
            String str;
            AbstractC3159y.i(ids, "ids");
            AbstractC3159y.i(errorMsg, "errorMsg");
            Bundle bundle = new Bundle();
            bundle.putString("type", "load_failed");
            if (errorMsg.length() > 10) {
                str = errorMsg.substring(0, 10);
                AbstractC3159y.h(str, "substring(...)");
            } else if (errorMsg.length() > 0) {
                str = errorMsg;
            } else {
                str = null;
            }
            if (str != null) {
                bundle.putString(CampaignEx.JSON_NATIVE_VIDEO_ERROR, errorMsg);
            }
            new C3330r(L0.this.getContext()).b("mintegral_interstitial", bundle);
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public void onResourceLoadSuccess(MBridgeIds ids) {
            AbstractC3159y.i(ids, "ids");
            Bundle bundle = new Bundle();
            bundle.putString("type", "loaded");
            new C3330r(L0.this.getContext()).b("mintegral_interstitial", bundle);
            if (this.f11370b.isReady()) {
                this.f11370b.show();
            }
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public void onShowFail(MBridgeIds ids, String errorMsg) {
            String str;
            AbstractC3159y.i(ids, "ids");
            AbstractC3159y.i(errorMsg, "errorMsg");
            Bundle bundle = new Bundle();
            bundle.putString("type", "show_failed");
            if (errorMsg.length() > 10) {
                str = errorMsg.substring(0, 10);
                AbstractC3159y.h(str, "substring(...)");
            } else if (errorMsg.length() > 0) {
                str = errorMsg;
            } else {
                str = null;
            }
            if (str != null) {
                bundle.putString(CampaignEx.JSON_NATIVE_VIDEO_ERROR, errorMsg);
            }
            new C3330r(L0.this.getContext()).b("mintegral_interstitial", bundle);
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public void onVideoComplete(MBridgeIds ids) {
            AbstractC3159y.i(ids, "ids");
            Bundle bundle = new Bundle();
            bundle.putString("type", "video_completed");
            new C3330r(L0.this.getContext()).b("mintegral_interstitial", bundle);
        }
    }

    /* renamed from: U4.L0$p, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C1408p implements InterfaceC1487j {
        C1408p() {
        }

        @Override // W4.InterfaceC1487j
        public void a(int i8) {
            L0.this.f11195l = i8;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class p0 extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f11372a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f11374c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p0(Context context, P5.d dVar) {
            super(2, dVar);
            this.f11374c = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new p0(this.f11374c, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((p0) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f11372a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                L0 l02 = L0.this;
                Context context = this.f11374c;
                this.f11372a = 1;
                if (l02.Z2(context, this) == e8) {
                    return e8;
                }
            }
            return L5.I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U4.L0$q, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C1409q extends AbstractC3160z implements Function0 {
        C1409q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m73invoke();
            return L5.I.f6474a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m73invoke() {
            L0 l02 = L0.this;
            C1498h I32 = l02.I3();
            AbstractC3159y.f(I32);
            l02.S4(I32.Z());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class q0 extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f11376a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f11378c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.Q f11379d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.Q f11380e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f11381a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.Q f11382b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ L0 f11383c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.Q f11384d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(kotlin.jvm.internal.Q q8, L0 l02, kotlin.jvm.internal.Q q9, P5.d dVar) {
                super(2, dVar);
                this.f11382b = q8;
                this.f11383c = l02;
                this.f11384d = q9;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f11382b, this.f11383c, this.f11384d, dVar);
            }

            @Override // X5.n
            public final Object invoke(i6.M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f11381a == 0) {
                    L5.t.b(obj);
                    int i8 = this.f11382b.f33745a;
                    if (i8 == 1) {
                        Toast.makeText(this.f11383c.requireContext(), this.f11383c.requireContext().getString(com.uptodown.R.string.review_sended), 0).show();
                        Bundle bundle = new Bundle();
                        bundle.putString(CampaignEx.JSON_KEY_STAR, String.valueOf(this.f11383c.f11200q));
                        C1498h I32 = this.f11383c.I3();
                        AbstractC3159y.f(I32);
                        bundle.putString("packagename", I32.y0());
                        C3330r c3330r = this.f11383c.f11209z;
                        if (c3330r != null) {
                            c3330r.b("app_rated", bundle);
                            return L5.I.f6474a;
                        }
                        return null;
                    }
                    if (i8 == 0 && this.f11384d.f33745a == 0) {
                        Toast.makeText(this.f11383c.requireContext(), com.uptodown.R.string.error_review_already_submitted, 1).show();
                        return L5.I.f6474a;
                    }
                    int i9 = this.f11384d.f33745a;
                    if (i9 == 401) {
                        this.f11383c.K4();
                        return L5.I.f6474a;
                    }
                    if (i9 == 403) {
                        Toast.makeText(this.f11383c.requireContext(), com.uptodown.R.string.email_validation_msg, 1).show();
                        return L5.I.f6474a;
                    }
                    Toast.makeText(this.f11383c.requireContext(), this.f11383c.requireContext().getString(com.uptodown.R.string.error_generico), 0).show();
                    return L5.I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q0(String str, kotlin.jvm.internal.Q q8, kotlin.jvm.internal.Q q9, P5.d dVar) {
            super(2, dVar);
            this.f11378c = str;
            this.f11379d = q8;
            this.f11380e = q9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new q0(this.f11378c, this.f11379d, this.f11380e, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((q0) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f11376a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                if (L0.this.getContext() != null && L0.this.I3() != null) {
                    K.b bVar = X4.K.f12368o;
                    if (!bVar.b(L0.this.getContext(), this.f11378c)) {
                        bVar.f(L0.this.getContext(), this.f11378c, String.valueOf(System.currentTimeMillis()));
                        Context requireContext = L0.this.requireContext();
                        AbstractC3159y.h(requireContext, "requireContext()");
                        C3312F c3312f = new C3312F(requireContext);
                        X4.K k8 = new X4.K();
                        k8.c0(this.f11378c);
                        k8.b0(L0.this.f11200q);
                        C1498h I32 = L0.this.I3();
                        AbstractC3159y.f(I32);
                        X4.I I02 = c3312f.I0(I32.i(), k8);
                        this.f11379d.f33745a = I02.e();
                        if (!I02.b() && I02.d() != null) {
                            String d8 = I02.d();
                            AbstractC3159y.f(d8);
                            JSONObject jSONObject = new JSONObject(d8);
                            if (!jSONObject.isNull("success")) {
                                this.f11380e.f33745a = jSONObject.getInt("success");
                            }
                        }
                    }
                    i6.J0 c8 = C2812b0.c();
                    a aVar = new a(this.f11380e, L0.this, this.f11379d, null);
                    this.f11376a = 1;
                    if (AbstractC2825i.g(c8, aVar, this) == e8) {
                        return e8;
                    }
                }
            }
            return L5.I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U4.L0$r, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C1410r extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C1410r f11385a = new C1410r();

        C1410r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m74invoke();
            return L5.I.f6474a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m74invoke() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class r0 extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f11386a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f11387b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ L0 f11388c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r0(String str, L0 l02, P5.d dVar) {
            super(2, dVar);
            this.f11387b = str;
            this.f11388c = l02;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new r0(this.f11387b, this.f11388c, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((r0) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object obj3;
            Object obj4;
            Q5.b.e();
            if (this.f11386a == 0) {
                L5.t.b(obj);
                String str = this.f11387b;
                if (str != null && str.length() != 0) {
                    if (this.f11388c.f11179F != null) {
                        D4.K k8 = this.f11388c.f11179F;
                        AbstractC3159y.f(k8);
                        ArrayList c8 = k8.c();
                        String str2 = this.f11387b;
                        Iterator it = c8.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj4 = it.next();
                                if (AbstractC3159y.d(((C1498h) obj4).y0(), str2)) {
                                    break;
                                }
                            } else {
                                obj4 = null;
                                break;
                            }
                        }
                        D4.K k9 = this.f11388c.f11179F;
                        AbstractC3159y.f(k9);
                        int r02 = AbstractC1246t.r0(k9.c(), (C1498h) obj4);
                        D4.K k10 = this.f11388c.f11179F;
                        AbstractC3159y.f(k10);
                        k10.notifyItemChanged(r02);
                    }
                    if (this.f11388c.f11180G != null) {
                        D4.K k11 = this.f11388c.f11180G;
                        AbstractC3159y.f(k11);
                        ArrayList c9 = k11.c();
                        String str3 = this.f11387b;
                        Iterator it2 = c9.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj3 = it2.next();
                                if (AbstractC3159y.d(((C1498h) obj3).y0(), str3)) {
                                    break;
                                }
                            } else {
                                obj3 = null;
                                break;
                            }
                        }
                        D4.K k12 = this.f11388c.f11180G;
                        AbstractC3159y.f(k12);
                        int r03 = AbstractC1246t.r0(k12.c(), (C1498h) obj3);
                        D4.K k13 = this.f11388c.f11180G;
                        AbstractC3159y.f(k13);
                        k13.notifyItemChanged(r03);
                    }
                    if (!this.f11388c.f11181H.isEmpty()) {
                        Iterator it3 = this.f11388c.f11181H.iterator();
                        while (it3.hasNext()) {
                            D4.K k14 = (D4.K) it3.next();
                            ArrayList c10 = k14.c();
                            String str4 = this.f11387b;
                            Iterator it4 = c10.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    obj2 = it4.next();
                                    if (AbstractC3159y.d(((C1498h) obj2).y0(), str4)) {
                                        break;
                                    }
                                } else {
                                    obj2 = null;
                                    break;
                                }
                            }
                            k14.notifyItemChanged(AbstractC1246t.r0(k14.c(), (C1498h) obj2));
                        }
                    }
                }
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U4.L0$s, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C1411s extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f11389a;

        C1411s(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new C1411s(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((C1411s) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f11389a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                L0 l02 = L0.this;
                this.f11389a = 1;
                if (l02.U2(this) == e8) {
                    return e8;
                }
            }
            return L5.I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class s0 extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f11391a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f11393c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s0(String str, P5.d dVar) {
            super(2, dVar);
            this.f11393c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new s0(this.f11393c, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((s0) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            FragmentActivity activity;
            Q5.b.e();
            if (this.f11391a == 0) {
                L5.t.b(obj);
                if (L0.this.I3() != null) {
                    String str = this.f11393c;
                    C1498h I32 = L0.this.I3();
                    AbstractC3159y.f(I32);
                    if (g6.n.s(str, I32.y0(), true) && (activity = L0.this.getActivity()) != null) {
                        L0.this.G6(activity);
                    }
                }
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U4.L0$t, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C1412t extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f11394a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f11395b;

        /* renamed from: d, reason: collision with root package name */
        int f11397d;

        C1412t(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f11395b = obj;
            this.f11397d |= Integer.MIN_VALUE;
            return L0.this.G3(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class t0 extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f11398a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ u0 f11400c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t0(u0 u0Var, P5.d dVar) {
            super(2, dVar);
            this.f11400c = u0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new t0(this.f11400c, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((t0) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f11398a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                GetUserDataWorker.a aVar = GetUserDataWorker.f30019b;
                Context requireContext = L0.this.requireContext();
                AbstractC3159y.h(requireContext, "requireContext()");
                u0 u0Var = this.f11400c;
                this.f11398a = 1;
                if (aVar.b(requireContext, u0Var, this) == e8) {
                    return e8;
                }
            }
            return L5.I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U4.L0$u, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C1413u extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f11401a;

        C1413u(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new C1413u(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((C1413u) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String d8;
            Q5.b.e();
            if (this.f11401a == 0) {
                L5.t.b(obj);
                FragmentActivity requireActivity = L0.this.requireActivity();
                AbstractC3159y.h(requireActivity, "requireActivity()");
                C3312F c3312f = new C3312F(requireActivity);
                C1498h I32 = L0.this.I3();
                AbstractC3159y.f(I32);
                X4.I k8 = c3312f.k(I32.i());
                if (!k8.b() && (d8 = k8.d()) != null && d8.length() != 0) {
                    String d9 = k8.d();
                    AbstractC3159y.f(d9);
                    JSONObject jSONObject = new JSONObject(d9);
                    if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                        L0 l02 = L0.this;
                        C1494d.a aVar = C1494d.f12482h;
                        JSONObject jSONObject2 = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                        AbstractC3159y.h(jSONObject2, "jsonObject.getJSONObject(Constantes.FIELD_DATA)");
                        l02.f11187d = aVar.a(jSONObject2);
                    }
                }
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes5.dex */
    public static final class u0 implements W4.I {
        u0() {
        }

        @Override // W4.I
        public void a() {
            Q.b bVar = X4.Q.f12424k;
            Context requireContext = L0.this.requireContext();
            AbstractC3159y.h(requireContext, "requireContext()");
            X4.Q e8 = bVar.e(requireContext);
            if (e8 != null && e8.G()) {
                L0.this.J3().f10431g.setVisibility(8);
                L0.this.J3().f10455x.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U4.L0$v, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C1414v extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f11404a;

        C1414v(P5.d dVar) {
            super(2, dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void l(L0 l02, View view) {
            Long l8;
            if (l02.getContext() != null && l02.f11187d != null) {
                C1494d c1494d = l02.f11187d;
                AbstractC3159y.f(c1494d);
                if (c1494d.c() != null) {
                    C1494d c1494d2 = l02.f11187d;
                    if (c1494d2 != null) {
                        Context requireContext = l02.requireContext();
                        AbstractC3159y.h(requireContext, "requireContext()");
                        C1498h I32 = l02.I3();
                        if (I32 != null) {
                            l8 = Long.valueOf(I32.i());
                        } else {
                            l8 = null;
                        }
                        c1494d2.a(requireContext, l8);
                    }
                    if (l02.getActivity() != null) {
                        C1494d c1494d3 = l02.f11187d;
                        AbstractC3159y.f(c1494d3);
                        String c8 = c1494d3.c();
                        AbstractC3159y.f(c8);
                        C3323k c3323k = new C3323k();
                        FragmentActivity requireActivity = l02.requireActivity();
                        AbstractC3159y.h(requireActivity, "requireActivity()");
                        C3323k.r(c3323k, requireActivity, c8, null, 4, null);
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(L0 l02) {
            C1494d c1494d;
            Long l8;
            if (new C3323k().p(l02.J3().f10456y.getRoot()) && (c1494d = l02.f11187d) != null) {
                Context requireContext = l02.requireContext();
                AbstractC3159y.h(requireContext, "requireContext()");
                C1498h I32 = l02.I3();
                if (I32 != null) {
                    l8 = Long.valueOf(I32.i());
                } else {
                    l8 = null;
                }
                c1494d.b(requireContext, l8);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new C1414v(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((C1414v) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f11404a == 0) {
                L5.t.b(obj);
                if (L0.this.f11187d != null) {
                    L0.this.J3().f10456y.getRoot().setVisibility(0);
                    float dimension = L0.this.getResources().getDimension(com.uptodown.R.dimen.border_radius_m);
                    C1494d c1494d = L0.this.f11187d;
                    AbstractC3159y.f(c1494d);
                    int parseColor = Color.parseColor(c1494d.f());
                    C1494d c1494d2 = L0.this.f11187d;
                    AbstractC3159y.f(c1494d2);
                    int parseColor2 = Color.parseColor(c1494d2.g());
                    GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{parseColor, parseColor2});
                    gradientDrawable.setCornerRadius(dimension);
                    L0.this.J3().f10456y.f10387d.setBackground(gradientDrawable);
                    ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{dimension, dimension, dimension, dimension, dimension, dimension, dimension, dimension}, null, null));
                    shapeDrawable.getPaint().setColor(parseColor2);
                    L0.this.J3().f10456y.f10388e.setBackground(shapeDrawable);
                    com.squareup.picasso.s h8 = com.squareup.picasso.s.h();
                    C1498h I32 = L0.this.I3();
                    AbstractC3159y.f(I32);
                    h8.l(I32.m0()).i(L0.this.J3().f10456y.f10385b);
                    TextView textView = L0.this.J3().f10456y.f10390g;
                    j.a aVar = E4.j.f2272g;
                    textView.setTypeface(aVar.t());
                    L0.this.J3().f10456y.f10390g.setTextColor(parseColor);
                    TextView textView2 = L0.this.J3().f10456y.f10390g;
                    C1494d c1494d3 = L0.this.f11187d;
                    AbstractC3159y.f(c1494d3);
                    textView2.setText(c1494d3.i());
                    L0.this.J3().f10456y.f10389f.setTypeface(aVar.u());
                    TextView textView3 = L0.this.J3().f10456y.f10389f;
                    C1494d c1494d4 = L0.this.f11187d;
                    AbstractC3159y.f(c1494d4);
                    textView3.setText(c1494d4.e());
                    L0.this.J3().f10456y.f10388e.setTypeface(aVar.t());
                    TextView textView4 = L0.this.J3().f10456y.f10388e;
                    C1494d c1494d5 = L0.this.f11187d;
                    AbstractC3159y.f(c1494d5);
                    textView4.setText(c1494d5.d());
                    RelativeLayout root = L0.this.J3().f10456y.getRoot();
                    final L0 l02 = L0.this;
                    root.setOnClickListener(new View.OnClickListener() { // from class: U4.M0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            L0.C1414v.l(L0.this, view);
                        }
                    });
                    ImageView imageView = L0.this.J3().f10456y.f10385b;
                    Handler handler = new Handler(Looper.getMainLooper());
                    final L0 l03 = L0.this;
                    handler.postDelayed(new Runnable() { // from class: U4.N0
                        @Override // java.lang.Runnable
                        public final void run() {
                            L0.C1414v.m(L0.this);
                        }
                    }, 500L);
                }
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class v0 extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f11406a;

        v0(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new v0(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((v0) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f11406a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                L0 l02 = L0.this;
                this.f11406a = 1;
                if (l02.W6(this) == e8) {
                    return e8;
                }
            }
            return L5.I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U4.L0$w, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C1415w extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f11408a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C1495e f11410c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1415w(C1495e c1495e, P5.d dVar) {
            super(2, dVar);
            this.f11410c = c1495e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void h(L0 l02, C1495e c1495e, View view) {
            l02.M4(c1495e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new C1415w(this.f11410c, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((C1415w) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f11408a == 0) {
                L5.t.b(obj);
                L0.this.J3().f10437j.setVisibility(0);
                L0.this.J3().f10434h0.setText(L0.this.getString(com.uptodown.R.string.best_alternatives));
                LinearLayout linearLayout = L0.this.J3().f10452u;
                final L0 l02 = L0.this;
                final C1495e c1495e = this.f11410c;
                linearLayout.setOnClickListener(new View.OnClickListener() { // from class: U4.O0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        L0.C1415w.h(L0.this, c1495e, view);
                    }
                });
                L0.this.L5(this.f11410c.a(), true);
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class w0 extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f11411a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f11412b;

        /* renamed from: d, reason: collision with root package name */
        int f11414d;

        w0(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f11412b = obj;
            this.f11414d |= Integer.MIN_VALUE;
            return L0.this.W6(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U4.L0$x, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C1416x extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f11415a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f11416b;

        /* renamed from: d, reason: collision with root package name */
        int f11418d;

        C1416x(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f11416b = obj;
            this.f11418d |= Integer.MIN_VALUE;
            return L0.this.K3(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class x0 extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f11419a;

        x0(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new x0(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((x0) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f11419a == 0) {
                L5.t.b(obj);
                if (L0.this.getContext() != null && L0.this.I3() != null) {
                    C3326n.a aVar = C3326n.f34490t;
                    Context requireContext = L0.this.requireContext();
                    AbstractC3159y.h(requireContext, "requireContext()");
                    C3326n a8 = aVar.a(requireContext);
                    a8.a();
                    L0 l02 = L0.this;
                    C1498h I32 = l02.I3();
                    AbstractC3159y.f(I32);
                    l02.f11207x = a8.x0(I32.i());
                    a8.g();
                }
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U4.L0$y, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C1417y extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f11421a;

        C1417y(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new C1417y(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((C1417y) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f11421a == 0) {
                L5.t.b(obj);
                if (L0.this.getActivity() != null) {
                    FragmentActivity requireActivity = L0.this.requireActivity();
                    AbstractC3159y.h(requireActivity, "requireActivity()");
                    C3312F c3312f = new C3312F(requireActivity);
                    if (L0.this.I3() != null) {
                        C1498h I32 = L0.this.I3();
                        AbstractC3159y.f(I32);
                        ArrayList a02 = I32.a0();
                        if (a02 == null || a02.isEmpty()) {
                            C1498h I33 = L0.this.I3();
                            AbstractC3159y.f(I33);
                            X4.I t8 = c3312f.t(I33.i());
                            if (!t8.b() && t8.d() != null) {
                                String d8 = t8.d();
                                AbstractC3159y.f(d8);
                                if (d8.length() > 0) {
                                    C1507q.b bVar = C1507q.f12689c;
                                    String d9 = t8.d();
                                    AbstractC3159y.f(d9);
                                    ArrayList a8 = bVar.a(d9);
                                    C1498h I34 = L0.this.I3();
                                    AbstractC3159y.f(I34);
                                    I34.u1(a8);
                                }
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
    /* loaded from: classes5.dex */
    public static final class y0 extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f11423a;

        y0(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new y0(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((y0) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f11423a == 0) {
                L5.t.b(obj);
                if (L0.this.f11207x != null) {
                    L0 l02 = L0.this;
                    String string = l02.getString(com.uptodown.R.string.app_detail_remove_wishlist_title);
                    AbstractC3159y.h(string, "getString(R.string.app_d…il_remove_wishlist_title)");
                    l02.W5(com.uptodown.R.id.action_wishlist, string);
                    L0.this.J3().f10396D.f10688c.setBackground(ContextCompat.getDrawable(L0.this.requireContext(), com.uptodown.R.drawable.ripple_wishlist_button));
                    L0.this.J3().f10396D.f10688c.setImageResource(com.uptodown.R.drawable.vector_heart_red);
                } else {
                    L0 l03 = L0.this;
                    String string2 = l03.getString(com.uptodown.R.string.app_detail_add_wishlist_title);
                    AbstractC3159y.h(string2, "getString(R.string.app_detail_add_wishlist_title)");
                    l03.W5(com.uptodown.R.id.action_wishlist, string2);
                    L0.this.J3().f10396D.f10688c.setBackground(ContextCompat.getDrawable(L0.this.requireContext(), com.uptodown.R.drawable.ripple_wishlist_added_button));
                    L0.this.J3().f10396D.f10688c.setImageResource(com.uptodown.R.drawable.vector_heart_white);
                }
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U4.L0$z, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C1418z extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f11425a;

        C1418z(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new C1418z(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((C1418z) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f11425a == 0) {
                L5.t.b(obj);
                L0.this.r5();
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public L0() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: U4.k
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                L0.J4(L0.this, (ActivityResult) obj);
            }
        });
        AbstractC3159y.h(registerForActivityResult, "registerForActivityResul…        }\n        }\n    }");
        this.f11182I = registerForActivityResult;
        ActivityResultLauncher registerForActivityResult2 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: U4.l
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                L0.S6(L0.this, (ActivityResult) obj);
            }
        });
        AbstractC3159y.h(registerForActivityResult2, "registerForActivityResul…text(), callback) }\n    }");
        this.f11183J = registerForActivityResult2;
    }

    private final void A2() {
        C1498h c1498h = this.f11186c;
        if (c1498h != null) {
            AbstractC3159y.f(c1498h);
            if (c1498h.y0() != null && getContext() != null) {
                C3326n.a aVar = C3326n.f34490t;
                Context requireContext = requireContext();
                AbstractC3159y.h(requireContext, "requireContext()");
                C3326n a8 = aVar.a(requireContext);
                a8.a();
                C1498h c1498h2 = this.f11186c;
                AbstractC3159y.f(c1498h2);
                String y02 = c1498h2.y0();
                AbstractC3159y.f(y02);
                C1496f S7 = a8.S(y02);
                if (S7 != null) {
                    if (S7.i() == 0) {
                        S7.t0(1);
                        C1496f.c c02 = S7.c0();
                        C1496f.c cVar = C1496f.c.UPDATED;
                        if (c02 != cVar) {
                            S7.J0(cVar);
                            String Q8 = S7.Q();
                            AbstractC3159y.f(Q8);
                            a8.M(Q8);
                            C3329q c3329q = new C3329q();
                            Context requireContext2 = requireContext();
                            AbstractC3159y.h(requireContext2, "requireContext()");
                            c3329q.c(requireContext2);
                        }
                    } else {
                        S7.t0(0);
                    }
                    a8.m1(S7);
                    this.f11190g = S7;
                    C3319g c3319g = new C3319g();
                    Context requireContext3 = requireContext();
                    AbstractC3159y.h(requireContext3, "requireContext()");
                    c3319g.A(requireContext3);
                }
                a8.g();
                C3();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A3(C1505o c1505o) {
        if (getContext() != null) {
            X4.O o8 = this.f11191h;
            if (o8 != null) {
                AbstractC3159y.f(o8);
                F6(o8.n());
                return;
            }
            C1498h c1498h = this.f11186c;
            AbstractC3159y.f(c1498h);
            c1505o.b(c1498h);
            Context requireContext = requireContext();
            AbstractC3159y.h(requireContext, "requireContext()");
            int l02 = c1505o.l0(requireContext);
            if (l02 >= 0) {
                if (this.f11175B) {
                    C1500j.a aVar = C1500j.f12617n;
                    Context requireContext2 = requireContext();
                    AbstractC3159y.h(requireContext2, "requireContext()");
                    C1500j d8 = aVar.d(requireContext2);
                    if (d8 != null && d8.k() == this.f11204u) {
                        Context requireContext3 = requireContext();
                        AbstractC3159y.h(requireContext3, "requireContext()");
                        d8.w(requireContext3, l02);
                    }
                } else if (this.f11176C) {
                    C1510u.a aVar2 = C1510u.f12703n;
                    Context requireContext4 = requireContext();
                    AbstractC3159y.h(requireContext4, "requireContext()");
                    C1510u d9 = aVar2.d(requireContext4);
                    if (d9 != null && d9.k() == this.f11204u) {
                        Context requireContext5 = requireContext();
                        AbstractC3159y.h(requireContext5, "requireContext()");
                        d9.w(requireContext5, l02);
                    }
                }
                z6();
                if (B4()) {
                    C1502l p8 = UptodownApp.f27990B.p();
                    AbstractC3159y.f(p8);
                    p8.g(l02);
                }
                C1498h c1498h2 = this.f11186c;
                AbstractC3159y.f(c1498h2);
                String y02 = c1498h2.y0();
                AbstractC3159y.f(y02);
                C1498h c1498h3 = this.f11186c;
                AbstractC3159y.f(c1498h3);
                Y2(l02, y02, c1498h3.i());
                DownloadApkWorker.a aVar3 = DownloadApkWorker.f29987k;
                Context requireContext6 = requireContext();
                AbstractC3159y.h(requireContext6, "requireContext()");
                if (!aVar3.f(requireContext6, l02)) {
                    J3().f10396D.f10691f.setVisibility(0);
                    J3().f10396D.f10691f.setText(getString(com.uptodown.R.string.option_button_cancel));
                    J3().f10396D.f10691f.setBackground(ContextCompat.getDrawable(requireContext(), com.uptodown.R.drawable.ripple_open_button));
                    J3().f10396D.f10691f.setTextColor(ContextCompat.getColor(requireContext(), com.uptodown.R.color.blue_primary));
                    J3().f10396D.f10691f.setOnClickListener(new View.OnClickListener() { // from class: U4.j
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            L0.B3(L0.this, view);
                        }
                    });
                    J3().f10393A.f11010b.setVisibility(0);
                    SettingsPreferences.a aVar4 = SettingsPreferences.f29309b;
                    Context requireContext7 = requireContext();
                    AbstractC3159y.h(requireContext7, "requireContext()");
                    if (!aVar4.U(requireContext7)) {
                        Context requireContext8 = requireContext();
                        kotlin.jvm.internal.Y y8 = kotlin.jvm.internal.Y.f33752a;
                        String string = getString(com.uptodown.R.string.msg_added_to_downlads_queue);
                        AbstractC3159y.h(string, "getString(R.string.msg_added_to_downlads_queue)");
                        C1498h c1498h4 = this.f11186c;
                        AbstractC3159y.f(c1498h4);
                        String format = String.format(string, Arrays.copyOf(new Object[]{c1498h4.s0()}, 1));
                        AbstractC3159y.h(format, "format(...)");
                        Toast.makeText(requireContext8, format, 1).show();
                    }
                }
                if (getActivity() != null && (getActivity() instanceof MainActivity)) {
                    FragmentActivity activity = getActivity();
                    AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                    ((MainActivity) activity).T1(c1505o);
                    return;
                }
                return;
            }
            m3(getString(com.uptodown.R.string.error_cant_enqueue_download) + " (108)");
            Context requireContext9 = requireContext();
            AbstractC3159y.h(requireContext9, "requireContext()");
            a6(requireContext9);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A4(java.io.File r11, android.content.Context r12) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: U4.L0.A4(java.io.File, android.content.Context):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A5(L0 this$0, X4.K review, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(review, "$review");
        UptodownApp.a aVar = UptodownApp.f27990B;
        if (aVar.a0()) {
            Intent intent = new Intent(this$0.requireActivity(), (Class<?>) RepliesActivity.class);
            intent.putExtra("review", review);
            C1498h c1498h = this$0.f11186c;
            AbstractC3159y.f(c1498h);
            intent.putExtra("appName", c1498h.s0());
            FragmentActivity requireActivity = this$0.requireActivity();
            AbstractC3159y.h(requireActivity, "requireActivity()");
            this$0.startActivity(intent, aVar.a(requireActivity));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A6(L0 this$0, C1510u c1510u, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.J3().f10431g.removeAllViews();
        this$0.J3().f10431g.setVisibility(8);
        Context requireContext = this$0.requireContext();
        AbstractC3159y.h(requireContext, "requireContext()");
        c1510u.f(requireContext);
        if (this$0.getActivity() != null && (this$0.getActivity() instanceof MainActivity)) {
            FragmentActivity activity = this$0.getActivity();
            AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
            ((MainActivity) activity).V2();
        }
    }

    private final void B2() {
        if (getContext() != null && this.f11186c != null) {
            X4.U u8 = this.f11207x;
            if (u8 != null) {
                AbstractC3159y.f(u8);
                Context requireContext = requireContext();
                AbstractC3159y.h(requireContext, "requireContext()");
                u8.i(requireContext);
                Context requireContext2 = requireContext();
                Context requireContext3 = requireContext();
                C1498h c1498h = this.f11186c;
                AbstractC3159y.f(c1498h);
                Toast.makeText(requireContext2, requireContext3.getString(com.uptodown.R.string.action_removed_from_wishlist, c1498h.s0()), 0).show();
            } else {
                C1498h c1498h2 = this.f11186c;
                AbstractC3159y.f(c1498h2);
                long i8 = c1498h2.i();
                C1498h c1498h3 = this.f11186c;
                AbstractC3159y.f(c1498h3);
                String s02 = c1498h3.s0();
                AbstractC3159y.f(s02);
                C1498h c1498h4 = this.f11186c;
                AbstractC3159y.f(c1498h4);
                String m02 = c1498h4.m0();
                C1498h c1498h5 = this.f11186c;
                AbstractC3159y.f(c1498h5);
                String y02 = c1498h5.y0();
                C1498h c1498h6 = this.f11186c;
                AbstractC3159y.f(c1498h6);
                X4.U u9 = new X4.U(i8, s02, m02, y02, c1498h6.n1());
                this.f11207x = u9;
                AbstractC3159y.f(u9);
                Context requireContext4 = requireContext();
                AbstractC3159y.h(requireContext4, "requireContext()");
                u9.h(requireContext4);
                Context requireContext5 = requireContext();
                Context requireContext6 = requireContext();
                C1498h c1498h7 = this.f11186c;
                AbstractC3159y.f(c1498h7);
                Toast.makeText(requireContext5, requireContext6.getString(com.uptodown.R.string.action_added_to_wishlist, c1498h7.s0()), 0).show();
            }
            V6();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B3(L0 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.d3();
    }

    private final boolean B4() {
        UptodownApp.a aVar = UptodownApp.f27990B;
        if (aVar.p() != null) {
            C1502l p8 = aVar.p();
            AbstractC3159y.f(p8);
            String d8 = p8.d();
            C1498h c1498h = this.f11186c;
            AbstractC3159y.f(c1498h);
            if (g6.n.s(d8, c1498h.y0(), true)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B5(L0 this$0, C1366d0 reviewBinding, X4.K review, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(reviewBinding, "$reviewBinding");
        AbstractC3159y.i(review, "$review");
        if (UptodownApp.f27990B.a0()) {
            Context requireContext = this$0.requireContext();
            AbstractC3159y.h(requireContext, "requireContext()");
            ImageView imageView = reviewBinding.f10477d;
            AbstractC3159y.h(imageView, "reviewBinding.ivLikesCounterReview");
            n5.k.a(requireContext, imageView);
            if (!C3307A.f34459a.i(review.j())) {
                this$0.D4(review);
                reviewBinding.f10489p.setText(String.valueOf(review.k() + 1));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B6(L0 this$0, C1510u c1510u, View view) {
        AbstractC3159y.i(this$0, "this$0");
        if (UptodownApp.f27990B.a0() && this$0.getActivity() != null && (this$0.getActivity() instanceof MainActivity)) {
            FragmentActivity activity = this$0.getActivity();
            AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
            ((MainActivity) activity).V2();
            Context requireContext = this$0.requireContext();
            AbstractC3159y.h(requireContext, "requireContext()");
            c1510u.e(requireContext);
            this$0.J3().f10431g.removeAllViews();
            this$0.J3().f10431g.setVisibility(8);
            FragmentActivity activity2 = this$0.getActivity();
            AbstractC3159y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
            ((MainActivity) activity2).G2(c1510u.k());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C2(final View view, final C3312F c3312f) {
        view.setOnClickListener(new View.OnClickListener() { // from class: U4.Y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                L0.D2(L0.this, c3312f, view, view2);
            }
        });
    }

    private final void C3() {
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1411s(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean C4() {
        DownloadApkWorker.a aVar = DownloadApkWorker.f29987k;
        C1498h c1498h = this.f11186c;
        AbstractC3159y.f(c1498h);
        long i8 = c1498h.i();
        C1498h c1498h2 = this.f11186c;
        AbstractC3159y.f(c1498h2);
        return aVar.d(i8, c1498h2.o0());
    }

    private final View C5(LinearLayout.LayoutParams layoutParams) {
        C1366d0 c8 = C1366d0.c(getLayoutInflater());
        AbstractC3159y.h(c8, "inflate(layoutInflater)");
        c8.getRoot().setLayoutParams(layoutParams);
        c8.getRoot().setVisibility(4);
        RelativeLayout root = c8.getRoot();
        AbstractC3159y.h(root, "reviewBinding.root");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C6() {
        boolean z8;
        C1498h c1498h;
        Q.b bVar = X4.Q.f12424k;
        Context requireContext = requireContext();
        AbstractC3159y.h(requireContext, "requireContext()");
        X4.Q e8 = bVar.e(requireContext);
        if (e8 != null && e8.G()) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (getContext() != null && (c1498h = this.f11186c) != null && c1498h.f() == 1 && !z8) {
            SettingsPreferences.a aVar = SettingsPreferences.f29309b;
            Context requireContext2 = requireContext();
            AbstractC3159y.h(requireContext2, "requireContext()");
            long w8 = aVar.w(requireContext2);
            if (w8 == 0 || System.currentTimeMillis() - w8 >= 86400000) {
                try {
                    MBNewInterstitialHandler mBNewInterstitialHandler = new MBNewInterstitialHandler(requireContext(), "1525209", "3361225");
                    mBNewInterstitialHandler.setInterstitialVideoListener(new o0(mBNewInterstitialHandler));
                    mBNewInterstitialHandler.playVideoMute(1);
                    mBNewInterstitialHandler.load();
                } catch (Exception e9) {
                    e9.printStackTrace();
                    Bundle bundle = new Bundle();
                    bundle.putString("type", "exception");
                    new C3330r(getContext()).b("mintegral_interstitial", bundle);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D2(L0 this$0, C3312F wsHelper, View this_addPreRegister, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(wsHelper, "$wsHelper");
        AbstractC3159y.i(this_addPreRegister, "$this_addPreRegister");
        if (UptodownApp.f27990B.a0()) {
            AbstractC2829k.d(i6.N.a(C2812b0.b()), null, null, new C1398f(wsHelper, this_addPreRegister, null), 3, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007e, code lost:
    
        if (r0.length() != 0) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void D3() {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: U4.L0.D3():void");
    }

    private final void D4(X4.K k8) {
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new N(k8, null), 3, null);
    }

    private final View D5(LinearLayout.LayoutParams layoutParams, final X4.K k8, Context context) {
        CharSequence charSequence;
        final C1368e0 c8 = C1368e0.c(getLayoutInflater());
        AbstractC3159y.h(c8, "inflate(layoutInflater)");
        c8.getRoot().setLayoutParams(layoutParams);
        c8.f10524e.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on_turbo));
        c8.f10525f.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off_turbo));
        c8.f10526g.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off_turbo));
        c8.f10527h.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off_turbo));
        c8.f10528i.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off_turbo));
        if (k8.n() >= 2) {
            c8.f10525f.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on_turbo));
        }
        if (k8.n() >= 3) {
            c8.f10526g.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on_turbo));
        }
        if (k8.n() >= 4) {
            c8.f10527h.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on_turbo));
        }
        if (k8.n() == 5) {
            c8.f10528i.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on_turbo));
        }
        UsernameTextView usernameTextView = c8.f10539t;
        j.a aVar = E4.j.f2272g;
        usernameTextView.setTypeface(aVar.t());
        c8.f10534o.setTypeface(aVar.u());
        c8.f10533n.setTypeface(aVar.u());
        c8.f10536q.setTypeface(aVar.u());
        c8.f10537r.setTypeface(aVar.u());
        Q.b bVar = X4.Q.f12424k;
        if (bVar.c(k8.i()) != null) {
            com.squareup.picasso.s.h().l(bVar.c(k8.i())).n(UptodownApp.f27990B.f0(context)).i(c8.f10522c);
        }
        String z8 = k8.z();
        if (z8 != null && z8.length() != 0) {
            c8.f10522c.setOnClickListener(new View.OnClickListener() { // from class: U4.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    L0.E5(L0.this, k8, view);
                }
            });
            c8.f10539t.setOnClickListener(new View.OnClickListener() { // from class: U4.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    L0.F5(L0.this, k8, view);
                }
            });
        }
        if (k8.G() != null) {
            c8.f10539t.setText(k8.G());
            UsernameTextView.a aVar2 = UsernameTextView.f29975k;
            UsernameTextView usernameTextView2 = c8.f10539t;
            AbstractC3159y.h(usernameTextView2, "reviewBinding.tvUsernameReview");
            aVar2.a(usernameTextView2, k8.L(), k8.I());
        }
        if (k8.u() != null) {
            c8.f10534o.setText(k8.u());
        }
        if (k8.b() == 1) {
            TextView textView = c8.f10537r;
            kotlin.jvm.internal.Y y8 = kotlin.jvm.internal.Y.f33752a;
            String string = getString(com.uptodown.R.string.replies_counter_single);
            AbstractC3159y.h(string, "getString(R.string.replies_counter_single)");
            String format = String.format(string, Arrays.copyOf(new Object[0], 0));
            AbstractC3159y.h(format, "format(...)");
            textView.setText(format);
        } else if (k8.b() > 1) {
            TextView textView2 = c8.f10537r;
            kotlin.jvm.internal.Y y9 = kotlin.jvm.internal.Y.f33752a;
            String string2 = getString(com.uptodown.R.string.replies_counter_multiple);
            AbstractC3159y.h(string2, "getString(R.string.replies_counter_multiple)");
            String format2 = String.format(string2, Arrays.copyOf(new Object[]{String.valueOf(k8.b())}, 1));
            AbstractC3159y.h(format2, "format(...)");
            textView2.setText(format2);
        }
        if (k8.o() != null) {
            c8.f10536q.setFocusable(true);
            TextView textView3 = c8.f10533n;
            Spanned s8 = k8.s();
            if (s8 != null) {
                charSequence = g6.n.M0(s8);
            } else {
                charSequence = null;
            }
            textView3.setText(charSequence);
            c8.f10533n.getViewTreeObserver().addOnPreDrawListener(new Y(c8));
            c8.f10538s.setOnClickListener(new View.OnClickListener() { // from class: U4.q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    L0.G5(C1368e0.this, this, view);
                }
            });
            c8.f10531l.setOnClickListener(new View.OnClickListener() { // from class: U4.r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    L0.H5(L0.this, k8, view);
                }
            });
            c8.f10531l.setFocusable(true);
            c8.f10535p.setText(String.valueOf(k8.k()));
            if (C3307A.f34459a.i(k8.j())) {
                c8.f10523d.setImageDrawable(ContextCompat.getDrawable(requireContext(), com.uptodown.R.drawable.vector_heart_red));
            }
            c8.f10530k.setOnClickListener(new View.OnClickListener() { // from class: U4.s
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    L0.I5(L0.this, c8, k8, view);
                }
            });
        } else {
            c8.f10533n.setVisibility(8);
            c8.f10531l.setVisibility(8);
            c8.f10530k.setVisibility(8);
        }
        c8.f10529j.setVisibility(0);
        C3323k.a aVar3 = C3323k.f34483a;
        ImageView imageView = c8.f10522c;
        AbstractC3159y.h(imageView, "reviewBinding.ivAvatarReview");
        aVar3.a(imageView);
        c8.f10536q.setFocusable(true);
        RelativeLayout root = c8.getRoot();
        AbstractC3159y.h(root, "reviewBinding.root");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D6(int i8) {
        Menu menu = this.f11201r;
        AbstractC3159y.f(menu);
        menu.findItem(i8).setVisible(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E2() {
        if (getContext() != null && this.f11175B) {
            this.f11205v = true;
            Context requireContext = requireContext();
            AbstractC3159y.h(requireContext, "requireContext()");
            z3(requireContext);
        }
    }

    private final void E3() {
        C1498h c1498h = this.f11186c;
        if (c1498h != null) {
            AbstractC3159y.f(c1498h);
            if (c1498h.t0() != null) {
                C1498h c1498h2 = this.f11186c;
                AbstractC3159y.f(c1498h2);
                String t02 = c1498h2.t0();
                AbstractC3159y.f(t02);
                if (t02.length() > 0) {
                    if (J3().f10403K.f10097e.getVisibility() == 0) {
                        J3().f10403K.f10094b.setText(com.uptodown.R.string.read_less_desc_app_detail);
                        J3().f10403K.f10097e.setVisibility(8);
                        J3().f10403K.f10096d.setMaxLines(Integer.MAX_VALUE);
                        J3().f10403K.f10096d.setEllipsize(null);
                        return;
                    }
                    J3().f10403K.f10094b.setText(com.uptodown.R.string.read_more_desc_app_detail);
                    J3().f10403K.f10097e.setVisibility(0);
                    J3().f10403K.f10096d.setMaxLines(6);
                    J3().f10403K.f10096d.setEllipsize(TextUtils.TruncateAt.END);
                    J3().f10408P.smoothScrollTo(0, J3().f10403K.f10095c.getTop(), 1000);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object E4(X4.K r8, P5.d r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof U4.L0.O
            if (r0 == 0) goto L13
            r0 = r9
            U4.L0$O r0 = (U4.L0.O) r0
            int r1 = r0.f11248e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11248e = r1
            goto L18
        L13:
            U4.L0$O r0 = new U4.L0$O
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f11246c
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f11248e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            L5.t.b(r9)
            goto L79
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            java.lang.Object r8 = r0.f11245b
            X4.K r8 = (X4.K) r8
            java.lang.Object r2 = r0.f11244a
            U4.L0 r2 = (U4.L0) r2
            L5.t.b(r9)
            goto L5c
        L40:
            L5.t.b(r9)
            X4.K$b r9 = X4.K.f12368o
            android.content.Context r2 = r7.requireContext()
            java.lang.String r5 = "requireContext()"
            kotlin.jvm.internal.AbstractC3159y.h(r2, r5)
            r0.f11244a = r7
            r0.f11245b = r8
            r0.f11248e = r4
            java.lang.Object r9 = r9.c(r8, r2, r0)
            if (r9 != r1) goto L5b
            return r1
        L5b:
            r2 = r7
        L5c:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            i6.J0 r4 = i6.C2812b0.c()
            U4.L0$P r5 = new U4.L0$P
            r6 = 0
            r5.<init>(r9, r2, r8, r6)
            r0.f11244a = r6
            r0.f11245b = r6
            r0.f11248e = r3
            java.lang.Object r8 = i6.AbstractC2825i.g(r4, r5, r0)
            if (r8 != r1) goto L79
            return r1
        L79:
            L5.I r8 = L5.I.f6474a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: U4.L0.E4(X4.K, P5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E5(L0 this$0, X4.K review, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(review, "$review");
        String z8 = review.z();
        AbstractC3159y.f(z8);
        this$0.g5(z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E6() {
        if (getContext() != null) {
            CustomTabsIntent build = new CustomTabsIntent.Builder().build();
            AbstractC3159y.h(build, "builder.build()");
            C3312F.a aVar = C3312F.f34471c;
            Context requireContext = requireContext();
            AbstractC3159y.h(requireContext, "requireContext()");
            build.intent.setData(Uri.parse(new C3323k().c(aVar.c(requireContext))));
            ActivityResultLauncher activityResultLauncher = this.f11183J;
            Intent intent = build.intent;
            UptodownApp.a aVar2 = UptodownApp.f27990B;
            FragmentActivity requireActivity = requireActivity();
            AbstractC3159y.h(requireActivity, "requireActivity()");
            activityResultLauncher.launch(intent, aVar2.b(requireActivity));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F2() {
        if (B4()) {
            C1502l p8 = UptodownApp.f27990B.p();
            AbstractC3159y.f(p8);
            if (p8.b() == -1 && getContext() != null) {
                SettingsPreferences.a aVar = SettingsPreferences.f29309b;
                Context requireContext = requireContext();
                AbstractC3159y.h(requireContext, "requireContext()");
                if (aVar.S(requireContext)) {
                    Context requireContext2 = requireContext();
                    AbstractC3159y.h(requireContext2, "requireContext()");
                    if (!aVar.e0(requireContext2)) {
                        Context requireContext3 = requireContext();
                        AbstractC3159y.h(requireContext3, "requireContext()");
                        aVar.W0(requireContext3, false);
                    }
                    Context requireContext4 = requireContext();
                    AbstractC3159y.h(requireContext4, "requireContext()");
                    z3(requireContext4);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F3() {
        if (getContext() != null) {
            UptodownApp.a aVar = UptodownApp.f27990B;
            if (aVar.y() > 0) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, aVar.y());
                ImageView imageView = this.f11185b;
                if (imageView != null) {
                    imageView.setLayoutParams(layoutParams);
                }
                J3().f10427e.setScrimVisibleHeightTrigger((int) (aVar.y() * 0.4d));
            }
        }
    }

    private final void F4() {
        boolean z8;
        Q.b bVar = X4.Q.f12424k;
        Context requireContext = requireContext();
        AbstractC3159y.h(requireContext, "requireContext()");
        X4.Q e8 = bVar.e(requireContext);
        if (e8 != null && e8.G()) {
            z8 = true;
        } else {
            z8 = false;
        }
        C1498h c1498h = this.f11186c;
        if (c1498h != null && c1498h.f() == 1 && !z8) {
            try {
                J3().f10455x.init(new BannerSize(5, getResources().getDisplayMetrics().widthPixels, (int) getResources().getDimension(com.uptodown.R.dimen.mintegral_banner_height)), "1517644", "3351941");
                J3().f10455x.setAllowShowCloseBtn(true);
                J3().f10455x.setRefreshTime(15);
                J3().f10455x.setBannerAdListener(new Q());
                J3().f10455x.load();
                return;
            } catch (Exception e9) {
                e9.printStackTrace();
                Bundle bundle = new Bundle();
                bundle.putString("type", "exception");
                new C3330r(getContext()).b("mintegral_banner", bundle);
                J3().f10455x.setVisibility(8);
                J3().f10455x.release();
                return;
            }
        }
        J3().f10455x.setVisibility(8);
        J3().f10455x.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F5(L0 this$0, X4.K review, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(review, "$review");
        String z8 = review.z();
        AbstractC3159y.f(z8);
        this$0.g5(z8);
    }

    private final void F6(String str) {
        if (getContext() != null && !UptodownApp.f27990B.W("GenerateQueueWorker", getContext())) {
            Data build = new Data.Builder().putInt("downloadAutostartedInBackground", 0).putBoolean("downloadAnyway", false).putString("packagename", str).build();
            AbstractC3159y.h(build, "Builder()\n              …\n                .build()");
            WorkManager.getInstance(requireContext()).enqueue(new OneTimeWorkRequest.Builder(GenerateQueueWorker.class).addTag("GenerateQueueWorker").setInputData(build).build());
        }
    }

    private final void G2(C1377j c1377j) {
        c1377j.f10691f.setTypeface(E4.j.f2272g.t());
        c1377j.f10690e.setOnClickListener(new View.OnClickListener() { // from class: U4.s0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                L0.H2(L0.this, view);
            }
        });
        c1377j.f10691f.setOnClickListener(new View.OnClickListener() { // from class: U4.t0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                L0.I2(L0.this, view);
            }
        });
        c1377j.f10690e.setFocusable(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object G3(P5.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof U4.L0.C1412t
            if (r0 == 0) goto L13
            r0 = r7
            U4.L0$t r0 = (U4.L0.C1412t) r0
            int r1 = r0.f11397d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11397d = r1
            goto L18
        L13:
            U4.L0$t r0 = new U4.L0$t
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f11395b
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f11397d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            L5.t.b(r7)
            goto L71
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            java.lang.Object r2 = r0.f11394a
            U4.L0 r2 = (U4.L0) r2
            L5.t.b(r7)
            goto L5d
        L3d:
            L5.t.b(r7)
            boolean r7 = r6.isAdded()
            if (r7 == 0) goto L74
            r6.f11187d = r5
            i6.I r7 = i6.C2812b0.b()
            U4.L0$u r2 = new U4.L0$u
            r2.<init>(r5)
            r0.f11394a = r6
            r0.f11397d = r4
            java.lang.Object r7 = i6.AbstractC2825i.g(r7, r2, r0)
            if (r7 != r1) goto L5c
            return r1
        L5c:
            r2 = r6
        L5d:
            i6.J0 r7 = i6.C2812b0.c()
            U4.L0$v r4 = new U4.L0$v
            r4.<init>(r5)
            r0.f11394a = r5
            r0.f11397d = r3
            java.lang.Object r7 = i6.AbstractC2825i.g(r7, r4, r0)
            if (r7 != r1) goto L71
            return r1
        L71:
            L5.I r7 = L5.I.f6474a
            return r7
        L74:
            L5.I r7 = L5.I.f6474a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: U4.L0.G3(P5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G4() {
        C1498h c1498h = this.f11186c;
        if (c1498h != null) {
            AbstractC3159y.f(c1498h);
            if (c1498h.e0() != null) {
                com.squareup.picasso.s h8 = com.squareup.picasso.s.h();
                C1498h c1498h2 = this.f11186c;
                AbstractC3159y.f(c1498h2);
                com.squareup.picasso.w l8 = h8.l(c1498h2.e0());
                Context requireContext = requireContext();
                AbstractC3159y.h(requireContext, "requireContext()");
                com.squareup.picasso.w n8 = l8.n(new C3476d(requireContext));
                ImageView imageView = this.f11185b;
                AbstractC3159y.g(imageView, "null cannot be cast to non-null type android.widget.ImageView");
                n8.j(imageView, new R());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G5(C1368e0 reviewBinding, L0 this$0, View view) {
        AbstractC3159y.i(reviewBinding, "$reviewBinding");
        AbstractC3159y.i(this$0, "this$0");
        if (reviewBinding.f10533n.getMaxLines() == Integer.MAX_VALUE) {
            reviewBinding.f10533n.setMaxLines(4);
            reviewBinding.f10538s.setText(this$0.getString(com.uptodown.R.string.read_more_desc_app_detail));
        } else {
            reviewBinding.f10533n.setMaxLines(Integer.MAX_VALUE);
            reviewBinding.f10538s.setText(this$0.getString(com.uptodown.R.string.read_less_desc_app_detail));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G6(Context context) {
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new p0(context, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H2(L0 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.N4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object H3(P5.d dVar) {
        if (getActivity() != null && !requireActivity().isFinishing() && this.f11186c != null) {
            C1495e c1495e = new C1495e();
            FragmentActivity requireActivity = requireActivity();
            AbstractC3159y.h(requireActivity, "requireActivity()");
            C3312F c3312f = new C3312F(requireActivity);
            C1498h c1498h = this.f11186c;
            AbstractC3159y.f(c1498h);
            X4.I b8 = c3312f.b(c1498h.i());
            if (!b8.b() && b8.d() != null) {
                String d8 = b8.d();
                AbstractC3159y.f(d8);
                if (d8.length() > 0) {
                    String d9 = b8.d();
                    AbstractC3159y.f(d9);
                    JSONObject jSONObject = new JSONObject(d9);
                    if (!jSONObject.isNull("success") && jSONObject.getInt("success") == 1 && !jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                        JSONObject jsonData = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                        AbstractC3159y.h(jsonData, "jsonData");
                        c1495e.d(jsonData);
                    }
                }
            }
            Object g8 = AbstractC2825i.g(C2812b0.c(), new C1415w(c1495e, null), dVar);
            if (g8 == Q5.b.e()) {
                return g8;
            }
            return L5.I.f6474a;
        }
        return L5.I.f6474a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H4() {
        Long l8;
        C1498h c1498h = this.f11186c;
        if (c1498h != null) {
            AbstractC3159y.f(c1498h);
            if (!c1498h.u0()) {
                C1498h c1498h2 = this.f11186c;
                AbstractC3159y.f(c1498h2);
                c1498h2.w1(true);
                Bundle bundle = new Bundle();
                C1498h c1498h3 = this.f11186c;
                if (c1498h3 != null) {
                    l8 = Long.valueOf(c1498h3.i());
                } else {
                    l8 = null;
                }
                if (l8 != null) {
                    C1498h c1498h4 = this.f11186c;
                    AbstractC3159y.f(c1498h4);
                    bundle.putString("appId", String.valueOf(c1498h4.i()));
                }
                bundle.putString("type", "noCompatibleFile");
                C3330r c3330r = this.f11209z;
                if (c3330r != null) {
                    c3330r.b("app_details", bundle);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H5(L0 this$0, X4.K review, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(review, "$review");
        UptodownApp.a aVar = UptodownApp.f27990B;
        if (aVar.a0()) {
            Intent intent = new Intent(this$0.requireActivity(), (Class<?>) RepliesActivity.class);
            intent.putExtra("review", review);
            C1498h c1498h = this$0.f11186c;
            AbstractC3159y.f(c1498h);
            intent.putExtra("appName", c1498h.s0());
            FragmentActivity requireActivity = this$0.requireActivity();
            AbstractC3159y.h(requireActivity, "requireActivity()");
            this$0.startActivity(intent, aVar.a(requireActivity));
        }
    }

    private final void H6() {
        J3().f10399G.f10498e.setVisibility(0);
        J3().f10399G.f10496c.setVisibility(8);
        J3().f10396D.f10691f.setVisibility(0);
        J3().f10393A.f11014f.setVisibility(0);
        J3().f10393A.f11015g.setVisibility(8);
        J3().f10393A.f11019k.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I2(L0 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        Context requireContext = this$0.requireContext();
        AbstractC3159y.h(requireContext, "requireContext()");
        this$0.z3(requireContext);
    }

    private final void I4(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("type", str);
        if (B4()) {
            bundle.putInt("deeplink", 1);
        } else {
            bundle.putInt("deeplink", 0);
        }
        C3330r c3330r = this.f11209z;
        if (c3330r != null) {
            c3330r.b("warning", bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I5(L0 this$0, C1368e0 reviewBinding, X4.K review, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(reviewBinding, "$reviewBinding");
        AbstractC3159y.i(review, "$review");
        if (UptodownApp.f27990B.a0()) {
            Context requireContext = this$0.requireContext();
            AbstractC3159y.h(requireContext, "requireContext()");
            ImageView imageView = reviewBinding.f10523d;
            AbstractC3159y.h(imageView, "reviewBinding.ivLikesCounterReview");
            n5.k.a(requireContext, imageView);
            if (!C3307A.f34459a.i(review.j())) {
                this$0.D4(review);
                reviewBinding.f10535p.setText(String.valueOf(review.k() + 1));
            }
        }
    }

    private final void I6() {
        J3().f10399G.f10498e.setVisibility(8);
        J3().f10399G.f10496c.setVisibility(0);
        J3().f10396D.f10691f.setVisibility(0);
        J3().f10396D.f10690e.setVisibility(0);
        J3().f10393A.f11016h.setVisibility(8);
        J3().f10393A.f11014f.setVisibility(8);
        J3().f10393A.f11015g.setVisibility(0);
        J3().f10393A.f11019k.setVisibility(8);
    }

    private final void J2(final C1392z c1392z) {
        ScrollableTextView scrollableTextView = c1392z.f11023o;
        j.a aVar = E4.j.f2272g;
        scrollableTextView.setTypeface(aVar.t());
        c1392z.f11021m.setTypeface(aVar.u());
        c1392z.f11022n.setTypeface(aVar.u());
        c1392z.f11020l.setTypeface(aVar.u());
        c1392z.f11018j.setTypeface(aVar.u());
        c1392z.f11019k.setTypeface(aVar.t());
        c1392z.f11024p.setTypeface(aVar.t());
        c1392z.f11014f.setOnClickListener(new View.OnClickListener() { // from class: U4.i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                L0.K2(L0.this, view);
            }
        });
        c1392z.f11014f.setFocusable(true);
        c1392z.f11010b.setOnClickListener(new View.OnClickListener() { // from class: U4.j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                L0.L2(C1392z.this, this, view);
            }
        });
        c1392z.f11011c.setOnClickListener(new View.OnClickListener() { // from class: U4.k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                L0.M2(C1392z.this, this, view);
            }
        });
        c1392z.f11019k.setOnClickListener(new View.OnClickListener() { // from class: U4.l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                L0.N2(L0.this, view);
            }
        });
        c1392z.f11019k.setFocusable(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1363c J3() {
        C1363c c1363c = this.f11184a;
        AbstractC3159y.f(c1363c);
        return c1363c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J4(L0 this$0, ActivityResult activityResult) {
        String str;
        AbstractC3159y.i(this$0, "this$0");
        if (activityResult.getResultCode() == 1) {
            Q.b bVar = X4.Q.f12424k;
            Context requireContext = this$0.requireContext();
            AbstractC3159y.h(requireContext, "requireContext()");
            X4.Q e8 = bVar.e(requireContext);
            if (e8 != null) {
                str = e8.getId();
            } else {
                str = null;
            }
            if (str != null) {
                Context requireContext2 = this$0.requireContext();
                AbstractC3159y.h(requireContext2, "requireContext()");
                if (e8.z(requireContext2)) {
                    this$0.b3();
                    UptodownApp.a aVar = UptodownApp.f27990B;
                    Context requireContext3 = this$0.requireContext();
                    AbstractC3159y.h(requireContext3, "requireContext()");
                    aVar.j0(requireContext3);
                    Context requireContext4 = this$0.requireContext();
                    AbstractC3159y.h(requireContext4, "requireContext()");
                    aVar.i0(requireContext4);
                    this$0.S5();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J5(ArrayList arrayList) {
        if (getContext() != null) {
            if (arrayList != null && !arrayList.isEmpty()) {
                int dimension = (int) getResources().getDimension(com.uptodown.R.dimen.margin_m);
                if (g6.n.s(getString(com.uptodown.R.string.screen_type), HintConstants.AUTOFILL_HINT_PHONE, true)) {
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams.setMargins(dimension, dimension, dimension, dimension);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        X4.K review = (X4.K) it.next();
                        if (review.L()) {
                            LinearLayout linearLayout = J3().f10450s;
                            AbstractC3159y.h(review, "review");
                            Context requireContext = requireContext();
                            AbstractC3159y.h(requireContext, "requireContext()");
                            linearLayout.addView(D5(layoutParams, review, requireContext));
                        } else {
                            LinearLayout linearLayout2 = J3().f10450s;
                            AbstractC3159y.h(review, "review");
                            Context requireContext2 = requireContext();
                            AbstractC3159y.h(requireContext2, "requireContext()");
                            linearLayout2.addView(w5(layoutParams, review, requireContext2));
                        }
                    }
                    return;
                }
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams2.setMargins(dimension, dimension, dimension, dimension);
                for (int i8 = 0; i8 < arrayList.size(); i8 += 2) {
                    LinearLayout linearLayout3 = new LinearLayout(getContext());
                    linearLayout3.setOrientation(0);
                    linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                    LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams3.setMargins(0, dimension, dimension, dimension);
                    layoutParams3.weight = 1.0f;
                    if (((X4.K) arrayList.get(i8)).L()) {
                        Object obj = arrayList.get(i8);
                        AbstractC3159y.h(obj, "reviews[i]");
                        Context requireContext3 = requireContext();
                        AbstractC3159y.h(requireContext3, "requireContext()");
                        linearLayout3.addView(D5(layoutParams2, (X4.K) obj, requireContext3));
                    } else {
                        Object obj2 = arrayList.get(i8);
                        AbstractC3159y.h(obj2, "reviews[i]");
                        Context requireContext4 = requireContext();
                        AbstractC3159y.h(requireContext4, "requireContext()");
                        linearLayout3.addView(w5(layoutParams3, (X4.K) obj2, requireContext4));
                    }
                    int i9 = i8 + 1;
                    if (i9 < arrayList.size()) {
                        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
                        layoutParams4.setMargins(dimension, dimension, 0, dimension);
                        layoutParams4.weight = 1.0f;
                        if (((X4.K) arrayList.get(i9)).L()) {
                            Object obj3 = arrayList.get(i9);
                            AbstractC3159y.h(obj3, "reviews[i + 1]");
                            Context requireContext5 = requireContext();
                            AbstractC3159y.h(requireContext5, "requireContext()");
                            linearLayout3.addView(D5(layoutParams2, (X4.K) obj3, requireContext5));
                        } else {
                            Object obj4 = arrayList.get(i9);
                            AbstractC3159y.h(obj4, "reviews[i + 1]");
                            Context requireContext6 = requireContext();
                            AbstractC3159y.h(requireContext6, "requireContext()");
                            linearLayout3.addView(w5(layoutParams4, (X4.K) obj4, requireContext6));
                        }
                    } else {
                        linearLayout3.addView(C5(layoutParams3));
                    }
                    J3().f10450s.addView(linearLayout3);
                }
                return;
            }
            J3().f10450s.setVisibility(8);
            J3().f10395C.setVisibility(8);
        }
    }

    private final void J6() {
        J3().f10399G.f10498e.setVisibility(0);
        J3().f10399G.f10496c.setVisibility(8);
        J3().f10396D.f10691f.setVisibility(8);
        J3().f10396D.f10690e.setVisibility(0);
        J3().f10393A.f11014f.setVisibility(8);
        J3().f10393A.f11015g.setVisibility(8);
        J3().f10393A.f11019k.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K2(L0 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        Context requireContext = this$0.requireContext();
        AbstractC3159y.h(requireContext, "requireContext()");
        this$0.z3(requireContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object K3(P5.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof U4.L0.C1416x
            if (r0 == 0) goto L13
            r0 = r7
            U4.L0$x r0 = (U4.L0.C1416x) r0
            int r1 = r0.f11418d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11418d = r1
            goto L18
        L13:
            U4.L0$x r0 = new U4.L0$x
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f11416b
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f11418d
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
            java.lang.Object r2 = r0.f11415a
            U4.L0 r2 = (U4.L0) r2
            L5.t.b(r7)
            goto L55
        L3d:
            L5.t.b(r7)
            i6.I r7 = i6.C2812b0.b()
            U4.L0$y r2 = new U4.L0$y
            r2.<init>(r5)
            r0.f11415a = r6
            r0.f11418d = r4
            java.lang.Object r7 = i6.AbstractC2825i.g(r7, r2, r0)
            if (r7 != r1) goto L54
            return r1
        L54:
            r2 = r6
        L55:
            i6.J0 r7 = i6.C2812b0.c()
            U4.L0$z r4 = new U4.L0$z
            r4.<init>(r5)
            r0.f11415a = r5
            r0.f11418d = r3
            java.lang.Object r7 = i6.AbstractC2825i.g(r7, r4, r0)
            if (r7 != r1) goto L69
            return r1
        L69:
            L5.I r7 = L5.I.f6474a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: U4.L0.K3(P5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K4() {
        Q.b bVar = X4.Q.f12424k;
        Context requireContext = requireContext();
        AbstractC3159y.h(requireContext, "requireContext()");
        bVar.a(requireContext);
        U4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K5() {
        C1498h c1498h = this.f11186c;
        AbstractC3159y.f(c1498h);
        ArrayList R02 = c1498h.R0();
        if (R02 != null && !R02.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            C1498h c1498h2 = this.f11186c;
            AbstractC3159y.f(c1498h2);
            ArrayList i12 = c1498h2.i1();
            if (i12 != null && !i12.isEmpty()) {
                C1498h c1498h3 = this.f11186c;
                AbstractC3159y.f(c1498h3);
                ArrayList<X4.T> i13 = c1498h3.i1();
                AbstractC3159y.f(i13);
                for (X4.T t8 : i13) {
                    String b8 = t8.b();
                    if (b8 != null && b8.length() != 0) {
                        arrayList.add(t8);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            C1498h c1498h4 = this.f11186c;
            AbstractC3159y.f(c1498h4);
            ArrayList R03 = c1498h4.R0();
            AbstractC3159y.f(R03);
            int size = R03.size();
            for (int i8 = 0; i8 < size; i8++) {
                C1498h c1498h5 = this.f11186c;
                AbstractC3159y.f(c1498h5);
                ArrayList R04 = c1498h5.R0();
                AbstractC3159y.f(R04);
                Object obj = R04.get(i8);
                AbstractC3159y.h(obj, "appInfo!!.screenShots!![i]");
                X4.L l8 = (X4.L) obj;
                if (l8.b() == 0) {
                    arrayList2.add(l8);
                }
            }
            kotlin.jvm.internal.T t9 = new kotlin.jvm.internal.T();
            Z z8 = new Z(arrayList2, t9, arrayList);
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(arrayList);
            arrayList3.addAll(arrayList2);
            t9.f33747a = new D4.D(arrayList3, z8);
            J3().f10405M.setAdapter((RecyclerView.Adapter) t9.f33747a);
            J3().f10405M.setVisibility(0);
            return;
        }
        J3().f10405M.setVisibility(8);
    }

    private final void K6() {
        J3().f10399G.f10498e.setVisibility(0);
        J3().f10399G.f10496c.setVisibility(8);
        J3().f10396D.f10691f.setVisibility(0);
        J3().f10396D.f10690e.setVisibility(8);
        J3().f10393A.f11017i.setVisibility(0);
        J3().f10393A.f11014f.setVisibility(8);
        J3().f10393A.f11015g.setVisibility(8);
        J3().f10393A.f11019k.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L2(C1392z actionButton, L0 this$0, View view) {
        AbstractC3159y.i(actionButton, "$actionButton");
        AbstractC3159y.i(this$0, "this$0");
        if (actionButton.f11010b.getVisibility() == 0) {
            this$0.d3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object L3(P5.d dVar) {
        if (getActivity() != null && !requireActivity().isFinishing() && this.f11186c != null) {
            FragmentActivity requireActivity = requireActivity();
            AbstractC3159y.h(requireActivity, "requireActivity()");
            C3312F c3312f = new C3312F(requireActivity);
            C1498h c1498h = this.f11186c;
            AbstractC3159y.f(c1498h);
            X4.I w8 = c3312f.w(c1498h.i());
            if (!w8.b() && w8.d() != null) {
                String d8 = w8.d();
                AbstractC3159y.f(d8);
                JSONArray jSONArray = new JSONObject(d8).getJSONArray(DataSchemeDataSource.SCHEME_DATA);
                if (jSONArray.length() <= 2) {
                    ArrayList arrayList = new ArrayList();
                    int length = jSONArray.length();
                    for (int i8 = 0; i8 < length; i8++) {
                        X4.N n8 = new X4.N(null, null, 0, 7, null);
                        JSONObject jSONObject = jSONArray.getJSONObject(i8);
                        JSONObject jsonObjectFloatingCategoryInfo = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                        C1501k c1501k = new C1501k(0, null, null, 7, null);
                        AbstractC3159y.h(jsonObjectFloatingCategoryInfo, "jsonObjectFloatingCategoryInfo");
                        c1501k.z(jsonObjectFloatingCategoryInfo);
                        c1501k.L(true);
                        n8.e(c1501k);
                        JSONArray jSONArray2 = jSONObject.getJSONArray("apps");
                        int length2 = jSONArray2.length();
                        for (int i9 = 0; i9 < length2; i9++) {
                            C1498h c1498h2 = new C1498h();
                            JSONObject jSONObject2 = jSONArray2.getJSONObject(i9);
                            AbstractC3159y.h(jSONObject2, "jsonObjectFloatingCategoryApps.getJSONObject(j)");
                            c1498h2.b(jSONObject2);
                            n8.a().add(c1498h2);
                        }
                        arrayList.add(n8);
                    }
                    Object g8 = AbstractC2825i.g(C2812b0.c(), new A(arrayList, null), dVar);
                    if (g8 == Q5.b.e()) {
                        return g8;
                    }
                    return L5.I.f6474a;
                }
                ArrayList arrayList2 = new ArrayList();
                int length3 = jSONArray.length();
                for (int i10 = 0; i10 < length3; i10++) {
                    JSONObject jsonObjectFloatingCategory = jSONArray.getJSONObject(i10);
                    C1501k c1501k2 = new C1501k(0, null, null, 7, null);
                    c1501k2.L(true);
                    AbstractC3159y.h(jsonObjectFloatingCategory, "jsonObjectFloatingCategory");
                    c1501k2.z(jsonObjectFloatingCategory);
                    arrayList2.add(c1501k2);
                }
                Object g9 = AbstractC2825i.g(C2812b0.c(), new B(arrayList2, null), dVar);
                if (g9 == Q5.b.e()) {
                    return g9;
                }
                return L5.I.f6474a;
            }
        }
        return L5.I.f6474a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043 A[Catch: Exception -> 0x0016, TryCatch #0 {Exception -> 0x0016, blocks: (B:2:0x0000, B:4:0x0004, B:5:0x0019, B:8:0x0020, B:10:0x002b, B:13:0x0032, B:14:0x003f, B:16:0x0043, B:18:0x004b, B:20:0x0051, B:21:0x006e, B:23:0x007d, B:25:0x008b, B:26:0x00b1, B:28:0x00b5, B:29:0x00b8, B:31:0x00bc, B:32:0x00bf, B:33:0x00c5, B:35:0x00cb, B:40:0x005f, B:42:0x003d), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d A[Catch: Exception -> 0x0016, TryCatch #0 {Exception -> 0x0016, blocks: (B:2:0x0000, B:4:0x0004, B:5:0x0019, B:8:0x0020, B:10:0x002b, B:13:0x0032, B:14:0x003f, B:16:0x0043, B:18:0x004b, B:20:0x0051, B:21:0x006e, B:23:0x007d, B:25:0x008b, B:26:0x00b1, B:28:0x00b5, B:29:0x00b8, B:31:0x00bc, B:32:0x00bf, B:33:0x00c5, B:35:0x00cb, B:40:0x005f, B:42:0x003d), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b5 A[Catch: Exception -> 0x0016, TryCatch #0 {Exception -> 0x0016, blocks: (B:2:0x0000, B:4:0x0004, B:5:0x0019, B:8:0x0020, B:10:0x002b, B:13:0x0032, B:14:0x003f, B:16:0x0043, B:18:0x004b, B:20:0x0051, B:21:0x006e, B:23:0x007d, B:25:0x008b, B:26:0x00b1, B:28:0x00b5, B:29:0x00b8, B:31:0x00bc, B:32:0x00bf, B:33:0x00c5, B:35:0x00cb, B:40:0x005f, B:42:0x003d), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bc A[Catch: Exception -> 0x0016, TryCatch #0 {Exception -> 0x0016, blocks: (B:2:0x0000, B:4:0x0004, B:5:0x0019, B:8:0x0020, B:10:0x002b, B:13:0x0032, B:14:0x003f, B:16:0x0043, B:18:0x004b, B:20:0x0051, B:21:0x006e, B:23:0x007d, B:25:0x008b, B:26:0x00b1, B:28:0x00b5, B:29:0x00b8, B:31:0x00bc, B:32:0x00bf, B:33:0x00c5, B:35:0x00cb, B:40:0x005f, B:42:0x003d), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cb A[Catch: Exception -> 0x0016, LOOP:0: B:33:0x00c5->B:35:0x00cb, LOOP_END, TRY_LEAVE, TryCatch #0 {Exception -> 0x0016, blocks: (B:2:0x0000, B:4:0x0004, B:5:0x0019, B:8:0x0020, B:10:0x002b, B:13:0x0032, B:14:0x003f, B:16:0x0043, B:18:0x004b, B:20:0x0051, B:21:0x006e, B:23:0x007d, B:25:0x008b, B:26:0x00b1, B:28:0x00b5, B:29:0x00b8, B:31:0x00bc, B:32:0x00bf, B:33:0x00c5, B:35:0x00cb, B:40:0x005f, B:42:0x003d), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void L4() {
        /*
            r4 = this;
            boolean r0 = r4.f11194k     // Catch: java.lang.Exception -> L16
            if (r0 != 0) goto L19
            android.graphics.Rect r0 = new android.graphics.Rect     // Catch: java.lang.Exception -> L16
            r0.<init>()     // Catch: java.lang.Exception -> L16
            T4.c r1 = r4.J3()     // Catch: java.lang.Exception -> L16
            androidx.core.widget.NestedScrollView r1 = r1.f10408P     // Catch: java.lang.Exception -> L16
            r1.getHitRect(r0)     // Catch: java.lang.Exception -> L16
            r4.x6(r0)     // Catch: java.lang.Exception -> L16
            goto L19
        L16:
            r0 = move-exception
            goto Ld5
        L19:
            boolean r0 = r4.f11194k     // Catch: java.lang.Exception -> L16
            java.lang.String r1 = "requireContext()"
            r2 = 0
            if (r0 != 0) goto L3d
            X4.h r0 = r4.f11186c     // Catch: java.lang.Exception -> L16
            kotlin.jvm.internal.AbstractC3159y.f(r0)     // Catch: java.lang.Exception -> L16
            java.lang.String r0 = r0.I()     // Catch: java.lang.Exception -> L16
            if (r0 == 0) goto L3d
            int r0 = r0.length()     // Catch: java.lang.Exception -> L16
            if (r0 != 0) goto L32
            goto L3d
        L32:
            android.content.Context r0 = r4.requireContext()     // Catch: java.lang.Exception -> L16
            kotlin.jvm.internal.AbstractC3159y.h(r0, r1)     // Catch: java.lang.Exception -> L16
            r4.G6(r0)     // Catch: java.lang.Exception -> L16
            goto L3f
        L3d:
            r4.f11194k = r2     // Catch: java.lang.Exception -> L16
        L3f:
            X4.h r0 = r4.f11186c     // Catch: java.lang.Exception -> L16
            if (r0 == 0) goto L48
            java.lang.String r0 = r0.W0()     // Catch: java.lang.Exception -> L16
            goto L49
        L48:
            r0 = 0
        L49:
            if (r0 == 0) goto L5f
            boolean r0 = r4.W3()     // Catch: java.lang.Exception -> L16
            if (r0 != 0) goto L5f
            T4.c r0 = r4.J3()     // Catch: java.lang.Exception -> L16
            T4.E0 r0 = r0.f10454w     // Catch: java.lang.Exception -> L16
            android.widget.LinearLayout r0 = r0.getRoot()     // Catch: java.lang.Exception -> L16
            r0.setVisibility(r2)     // Catch: java.lang.Exception -> L16
            goto L6e
        L5f:
            T4.c r0 = r4.J3()     // Catch: java.lang.Exception -> L16
            T4.E0 r0 = r0.f10454w     // Catch: java.lang.Exception -> L16
            android.widget.LinearLayout r0 = r0.getRoot()     // Catch: java.lang.Exception -> L16
            r3 = 8
            r0.setVisibility(r3)     // Catch: java.lang.Exception -> L16
        L6e:
            r4.C3()     // Catch: java.lang.Exception -> L16
            T4.c r0 = r4.J3()     // Catch: java.lang.Exception -> L16
            androidx.core.widget.NestedScrollView r0 = r0.f10408P     // Catch: java.lang.Exception -> L16
            int r0 = r0.getScrollY()     // Catch: java.lang.Exception -> L16
            if (r0 <= 0) goto Lb1
            android.content.Context r0 = r4.requireContext()     // Catch: java.lang.Exception -> L16
            kotlin.jvm.internal.AbstractC3159y.h(r0, r1)     // Catch: java.lang.Exception -> L16
            r4.M6(r0)     // Catch: java.lang.Exception -> L16
            boolean r0 = r4.f11206w     // Catch: java.lang.Exception -> L16
            if (r0 != 0) goto Lb1
            T4.c r0 = r4.J3()     // Catch: java.lang.Exception -> L16
            com.google.android.material.appbar.CollapsingToolbarLayout r0 = r0.f10427e     // Catch: java.lang.Exception -> L16
            java.lang.String r1 = ""
            r0.setTitle(r1)     // Catch: java.lang.Exception -> L16
            T4.c r0 = r4.J3()     // Catch: java.lang.Exception -> L16
            android.widget.TextView r0 = r0.f10436i0     // Catch: java.lang.Exception -> L16
            r0.setVisibility(r2)     // Catch: java.lang.Exception -> L16
            T4.c r0 = r4.J3()     // Catch: java.lang.Exception -> L16
            android.widget.TextView r0 = r0.f10436i0     // Catch: java.lang.Exception -> L16
            X4.h r1 = r4.f11186c     // Catch: java.lang.Exception -> L16
            kotlin.jvm.internal.AbstractC3159y.f(r1)     // Catch: java.lang.Exception -> L16
            java.lang.String r1 = r1.s0()     // Catch: java.lang.Exception -> L16
            r0.setText(r1)     // Catch: java.lang.Exception -> L16
        Lb1:
            D4.K r0 = r4.f11179F     // Catch: java.lang.Exception -> L16
            if (r0 == 0) goto Lb8
            r0.notifyDataSetChanged()     // Catch: java.lang.Exception -> L16
        Lb8:
            D4.K r0 = r4.f11180G     // Catch: java.lang.Exception -> L16
            if (r0 == 0) goto Lbf
            r0.notifyDataSetChanged()     // Catch: java.lang.Exception -> L16
        Lbf:
            java.util.ArrayList r0 = r4.f11181H     // Catch: java.lang.Exception -> L16
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L16
        Lc5:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Exception -> L16
            if (r1 == 0) goto Ld8
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Exception -> L16
            D4.K r1 = (D4.K) r1     // Catch: java.lang.Exception -> L16
            r1.notifyDataSetChanged()     // Catch: java.lang.Exception -> L16
            goto Lc5
        Ld5:
            r0.printStackTrace()
        Ld8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: U4.L0.L4():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L5(ArrayList arrayList, boolean z8) {
        int i8;
        if (getContext() != null && this.f11186c != null && arrayList != null && !arrayList.isEmpty()) {
            a0 a0Var = new a0();
            b0 b0Var = new b0();
            Context requireContext = requireContext();
            AbstractC3159y.h(requireContext, "requireContext()");
            if (z8) {
                i8 = 25;
            } else {
                i8 = 20;
            }
            D4.K k8 = new D4.K(a0Var, b0Var, requireContext, i8);
            this.f11179F = k8;
            AbstractC3159y.f(k8);
            k8.d(arrayList);
            J3().f10406N.setAdapter(this.f11179F);
            J3().f10406N.setNestedScrollingEnabled(false);
            J3().f10406N.setItemAnimator(null);
            J3().f10406N.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
            J3().f10401I.setVisibility(0);
            return;
        }
        J3().f10401I.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object L6(String str, P5.d dVar) {
        kotlin.jvm.internal.Q q8 = new kotlin.jvm.internal.Q();
        Object g8 = AbstractC2825i.g(C2812b0.b(), new q0(str, new kotlin.jvm.internal.Q(), q8, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return L5.I.f6474a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M2(C1392z actionButton, L0 this$0, View view) {
        Object obj;
        AbstractC3159y.i(actionButton, "$actionButton");
        AbstractC3159y.i(this$0, "this$0");
        if (actionButton.f11011c.getVisibility() == 0) {
            DownloadApkWorker.a aVar = DownloadApkWorker.f29987k;
            C1498h c1498h = this$0.f11186c;
            AbstractC3159y.f(c1498h);
            long i8 = c1498h.i();
            C1498h c1498h2 = this$0.f11186c;
            AbstractC3159y.f(c1498h2);
            if (aVar.d(i8, c1498h2.o0())) {
                DownloadWorker.a aVar2 = DownloadWorker.f30005c;
                if (aVar2.c()) {
                    aVar2.h();
                    return;
                }
            }
            Iterator it = UptodownApp.f27990B.F().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    String n8 = ((X4.O) obj).n();
                    C1498h c1498h3 = this$0.f11186c;
                    AbstractC3159y.f(c1498h3);
                    if (AbstractC3159y.d(n8, c1498h3.y0())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            if (obj != null) {
                DownloadWorker.a aVar3 = DownloadWorker.f30005c;
                if (aVar3.d()) {
                    aVar3.i();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object M3(P5.d dVar) {
        int i8;
        Integer num;
        if (getActivity() != null) {
            FragmentActivity requireActivity = requireActivity();
            AbstractC3159y.h(requireActivity, "requireActivity()");
            C3312F c3312f = new C3312F(requireActivity);
            C1498h c1498h = this.f11186c;
            if (c1498h != null) {
                AbstractC3159y.f(c1498h);
                X4.I G8 = c3312f.G(c1498h.i());
                if (!G8.b() && G8.d() != null) {
                    String d8 = G8.d();
                    AbstractC3159y.f(d8);
                    JSONObject jSONObject = new JSONObject(d8);
                    if (!jSONObject.isNull("success")) {
                        i8 = jSONObject.getInt("success");
                    } else {
                        i8 = 0;
                    }
                    if (i8 == 1) {
                        X4.K k8 = new X4.K();
                        this.f11208y = k8;
                        K.b bVar = X4.K.f12368o;
                        AbstractC3159y.f(k8);
                        JSONObject jSONObject2 = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                        AbstractC3159y.h(jSONObject2, "jsonObjectMyReview.getJS…ct(Constantes.FIELD_DATA)");
                        bVar.d(k8, jSONObject2);
                        X4.K k9 = this.f11208y;
                        if (k9 != null) {
                            num = kotlin.coroutines.jvm.internal.b.c(k9.n());
                        } else {
                            num = null;
                        }
                        AbstractC3159y.f(num);
                        this.f11200q = num.intValue();
                    }
                } else if (G8.b() && G8.e() == 404) {
                    C1498h c1498h2 = this.f11186c;
                    AbstractC3159y.f(c1498h2);
                    c1498h2.C1(new ArrayList());
                }
            }
        }
        Object g8 = AbstractC2825i.g(C2812b0.c(), new C(null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return L5.I.f6474a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M4(C1495e c1495e) {
        if (getActivity() != null && (getActivity() instanceof MainActivity)) {
            FragmentActivity activity = getActivity();
            AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
            ((MainActivity) activity).O7(c1495e);
        } else if (getActivity() != null && (getActivity() instanceof AppDetailActivity)) {
            FragmentActivity activity2 = getActivity();
            AbstractC3159y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.AppDetailActivity");
            ((AppDetailActivity) activity2).y3(c1495e);
        }
    }

    private final void M5() {
        boolean z8;
        boolean z9;
        boolean z10;
        C1505o c1505o = new C1505o();
        C1498h c1498h = this.f11186c;
        AbstractC3159y.f(c1498h);
        c1505o.k0(c1498h);
        C1504n c1504n = new C1504n();
        Context requireContext = requireContext();
        AbstractC3159y.h(requireContext, "requireContext()");
        c1504n.i(requireContext);
        SettingsPreferences.a aVar = SettingsPreferences.f29309b;
        Context requireContext2 = requireContext();
        AbstractC3159y.h(requireContext2, "requireContext()");
        if (aVar.o1(requireContext2)) {
            z8 = c1504n.g(c1505o);
            z10 = c1504n.e(c1505o);
            z9 = c1504n.f(c1505o);
        } else {
            z8 = true;
            z9 = true;
            z10 = true;
        }
        if (z8 && z10 && z9) {
            c3(c1505o);
            return;
        }
        if (!z8) {
            I4("sdk");
            String string = getString(com.uptodown.R.string.msg_warning_incompatible_sdk);
            AbstractC3159y.h(string, "getString(R.string.msg_warning_incompatible_sdk)");
            g3(c1505o, string);
            return;
        }
        if (!z10) {
            I4("abi");
            String string2 = getString(com.uptodown.R.string.msg_warning_incompatible_abi);
            AbstractC3159y.h(string2, "getString(R.string.msg_warning_incompatible_abi)");
            g3(c1505o, string2);
            return;
        }
        I4("density");
        String string3 = getString(com.uptodown.R.string.msg_warning_incompatible_density);
        AbstractC3159y.h(string3, "getString(R.string.msg_w…ing_incompatible_density)");
        g3(c1505o, string3);
    }

    private final void M6(Context context) {
        J3().f10444m0.setVisibility(8);
        J3().f10409Q.setBackgroundColor(ContextCompat.getColor(context, com.uptodown.R.color.transparent));
        if (new C3323k().o(context)) {
            X5(ContextCompat.getColor(context, com.uptodown.R.color.main_blue));
            Drawable drawable = ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_arrow_left);
            if (drawable != null) {
                J3().f10409Q.setNavigationIcon(drawable);
            }
            Drawable drawable2 = ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_menu_dots_blue);
            if (drawable2 != null) {
                J3().f10409Q.setOverflowIcon(drawable2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N2(L0 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.N4();
    }

    private final void N3() {
        C1498h c1498h = this.f11186c;
        if (c1498h != null) {
            AbstractC3159y.f(c1498h);
            if (c1498h.i() > 0) {
                u5();
                F2();
                E2();
                return;
            }
        }
        Context requireContext = requireContext();
        AbstractC3159y.h(requireContext, "requireContext()");
        new S4.i(requireContext, this.f11204u, new D(), LifecycleOwnerKt.getLifecycleScope(this));
    }

    private final void N4() {
        C1498h c1498h;
        if (getActivity() != null && !requireActivity().isFinishing() && (c1498h = this.f11186c) != null) {
            AbstractC3159y.f(c1498h);
            if (c1498h.y0() != null) {
                C1498h c1498h2 = this.f11186c;
                AbstractC3159y.f(c1498h2);
                if (!g6.n.s(c1498h2.y0(), requireActivity().getPackageName(), true)) {
                    PackageManager packageManager = requireActivity().getPackageManager();
                    C1498h c1498h3 = this.f11186c;
                    AbstractC3159y.f(c1498h3);
                    String y02 = c1498h3.y0();
                    AbstractC3159y.f(y02);
                    Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(y02);
                    if (launchIntentForPackage != null) {
                        startActivity(launchIntentForPackage);
                    }
                }
            }
        }
    }

    private final SpannableStringBuilder N5(String str) {
        String A8 = g6.n.A(g6.n.A(str, "<br />", "\n", false, 4, null), "<br/>", "\n", false, 4, null);
        List<C1503m> b8 = C1503m.f12631f.b(A8);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A8);
        int i8 = 0;
        for (C1503m c1503m : b8) {
            int b9 = c1503m.b() - i8;
            int length = c1503m.d().length() + b9;
            String e8 = c1503m.e();
            AbstractC3159y.f(e8);
            spannableStringBuilder = spannableStringBuilder.replace(b9, e8.length() + b9, (CharSequence) c1503m.d());
            AbstractC3159y.h(spannableStringBuilder, "spannableString.replace(…!.length, customTag.text)");
            String c8 = c1503m.c();
            int hashCode = c8.hashCode();
            if (hashCode != 98) {
                if (hashCode != 105) {
                    if (hashCode != 117) {
                        if (hashCode != 93028092) {
                            if (hashCode != 1524339519) {
                                if (hashCode != 3274) {
                                    if (hashCode == 3275 && c8.equals("h3")) {
                                        float dimension = getResources().getDimension(com.uptodown.R.dimen.text_size_m);
                                        Typeface t8 = E4.j.f2272g.t();
                                        AbstractC3159y.f(t8);
                                        spannableStringBuilder.setSpan(new defpackage.b(dimension, t8, ContextCompat.getColor(requireContext(), com.uptodown.R.color.text_primary)), b9, length, 33);
                                    }
                                } else if (c8.equals("h2")) {
                                    float dimension2 = getResources().getDimension(com.uptodown.R.dimen.text_size_l);
                                    Typeface t9 = E4.j.f2272g.t();
                                    AbstractC3159y.f(t9);
                                    spannableStringBuilder.setSpan(new defpackage.b(dimension2, t9, ContextCompat.getColor(requireContext(), com.uptodown.R.color.text_primary)), b9, length, 33);
                                }
                            } else if (c8.equals("floatingCategoryID")) {
                                spannableStringBuilder.setSpan(new d0(c1503m, this), b9, length, 33);
                            }
                        } else if (c8.equals("appID")) {
                            spannableStringBuilder.setSpan(new c0(c1503m, this), b9, length, 33);
                        }
                    } else if (c8.equals("u")) {
                        spannableStringBuilder.setSpan(new UnderlineSpan(), b9, length, 33);
                    }
                } else if (c8.equals(com.mbridge.msdk.foundation.same.report.i.f19888a)) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), b9, length, 33);
                }
            } else if (c8.equals(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B)) {
                spannableStringBuilder.setSpan(new StyleSpan(1), b9, length, 33);
            }
            String e9 = c1503m.e();
            AbstractC3159y.f(e9);
            i8 = (i8 + e9.length()) - c1503m.d().length();
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N6(Context context) {
        J3().f10444m0.setVisibility(0);
        J3().f10409Q.setBackgroundColor(ContextCompat.getColor(context, com.uptodown.R.color.transparent));
        X5(ContextCompat.getColor(context, com.uptodown.R.color.white));
        Drawable drawable = ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_arrow_left_white);
        if (drawable != null) {
            J3().f10409Q.setNavigationIcon(drawable);
        }
        Drawable drawable2 = ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_menu_dots);
        if (drawable2 != null) {
            J3().f10409Q.setOverflowIcon(drawable2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O2(Context context) {
        X4.O o8 = this.f11191h;
        if (o8 != null) {
            UptodownApp.a aVar = UptodownApp.f27990B;
            AbstractC3159y.f(o8);
            aVar.c0(o8.n(), context);
            X4.O o9 = this.f11191h;
            AbstractC3159y.f(o9);
            if (o9.j() != null) {
                C3313a c3313a = new C3313a();
                X4.O o10 = this.f11191h;
                AbstractC3159y.f(o10);
                if (c3313a.b(context, o10.j())) {
                    C3326n a8 = C3326n.f34490t.a(context);
                    a8.a();
                    X4.O o11 = this.f11191h;
                    AbstractC3159y.f(o11);
                    o11.X(0);
                    X4.O o12 = this.f11191h;
                    AbstractC3159y.f(o12);
                    a8.r1(o12);
                    a8.g();
                }
            }
            u6(context);
            return;
        }
        C1498h c1498h = this.f11186c;
        C1505o c1505o = null;
        String str = null;
        if (c1498h != null) {
            DownloadApkWorker.a aVar2 = DownloadApkWorker.f29987k;
            AbstractC3159y.f(c1498h);
            aVar2.a(c1498h.i());
            C3335w.f34532a.g(context);
            C3326n a9 = C3326n.f34490t.a(context);
            a9.a();
            C1498h c1498h2 = this.f11186c;
            AbstractC3159y.f(c1498h2);
            C1505o Z7 = a9.Z(String.valueOf(c1498h2.f0()));
            a9.x(Z7);
            if (Z7 != null) {
                str = Z7.X();
            }
            if (str != null) {
                File f8 = new C3329q().f(context);
                String X7 = Z7.X();
                AbstractC3159y.f(X7);
                File file = new File(f8, X7);
                if (file.exists()) {
                    file.delete();
                }
            }
            a9.g();
            c1505o = Z7;
        }
        a6(context);
        if (getActivity() != null && (getActivity() instanceof MainActivity)) {
            if (c1505o != null) {
                FragmentActivity activity = getActivity();
                AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                ((MainActivity) activity).K2(c1505o);
            } else {
                FragmentActivity activity2 = getActivity();
                AbstractC3159y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                ((MainActivity) activity2).C2();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object O3(P5.d dVar) {
        C1498h c1498h;
        ArrayList arrayList = new ArrayList();
        if (getActivity() != null && (c1498h = this.f11186c) != null) {
            AbstractC3159y.f(c1498h);
            ArrayList E02 = c1498h.E0();
            if (E02 == null || E02.isEmpty()) {
                FragmentActivity requireActivity = requireActivity();
                AbstractC3159y.h(requireActivity, "requireActivity()");
                C3312F c3312f = new C3312F(requireActivity);
                C1498h c1498h2 = this.f11186c;
                AbstractC3159y.f(c1498h2);
                X4.I R8 = c3312f.R(c1498h2.i());
                if (!R8.b() && R8.d() != null) {
                    String d8 = R8.d();
                    AbstractC3159y.f(d8);
                    if (d8.length() > 0) {
                        String d9 = R8.d();
                        AbstractC3159y.f(d9);
                        JSONObject jSONObject = new JSONObject(d9);
                        for (int i8 = 1; !jSONObject.isNull(String.valueOf(i8)); i8++) {
                            JSONObject jsonObjectAppSimilar = jSONObject.getJSONObject(String.valueOf(i8));
                            C1498h c1498h3 = new C1498h();
                            AbstractC3159y.h(jsonObjectAppSimilar, "jsonObjectAppSimilar");
                            c1498h3.b(jsonObjectAppSimilar);
                            arrayList.add(c1498h3);
                        }
                        if (true ^ arrayList.isEmpty()) {
                            C1498h c1498h4 = this.f11186c;
                            AbstractC3159y.f(c1498h4);
                            c1498h4.z1(arrayList);
                        }
                    }
                }
            }
        }
        Object g8 = AbstractC2825i.g(C2812b0.c(), new E(null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return L5.I.f6474a;
    }

    private final void O4() {
        if (getActivity() != null && !requireActivity().isFinishing() && this.f11186c != null) {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            C1498h c1498h = this.f11186c;
            AbstractC3159y.f(c1498h);
            intent.setData(Uri.fromParts("package", c1498h.y0(), null));
            intent.addFlags(268435456);
            intent.addFlags(8388608);
            try {
                startActivity(intent);
            } catch (ActivityNotFoundException e8) {
                e8.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P2(final View view, final C3312F c3312f) {
        view.setOnClickListener(new View.OnClickListener() { // from class: U4.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                L0.Q2(L0.this, view, c3312f, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object P3(P5.d dVar) {
        C1498h c1498h;
        int i8;
        if (getActivity() != null && !requireActivity().isFinishing() && (c1498h = this.f11186c) != null) {
            AbstractC3159y.f(c1498h);
            ArrayList N02 = c1498h.N0();
            if (N02 == null || N02.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                if (g6.n.s(getString(com.uptodown.R.string.screen_type), HintConstants.AUTOFILL_HINT_PHONE, true)) {
                    i8 = 2;
                } else {
                    i8 = 4;
                }
                FragmentActivity requireActivity = requireActivity();
                AbstractC3159y.h(requireActivity, "requireActivity()");
                C3312F c3312f = new C3312F(requireActivity);
                C1498h c1498h2 = this.f11186c;
                AbstractC3159y.f(c1498h2);
                X4.I K02 = c3312f.K0(c1498h2.i(), i8, 0);
                if (!K02.b() && K02.d() != null) {
                    String d8 = K02.d();
                    AbstractC3159y.f(d8);
                    if (d8.length() > 0) {
                        F.b bVar = X4.F.f12330e;
                        String d9 = K02.d();
                        AbstractC3159y.f(d9);
                        arrayList.addAll(bVar.a(d9));
                    }
                }
                C1498h c1498h3 = this.f11186c;
                AbstractC3159y.f(c1498h3);
                c1498h3.A1(arrayList);
            }
        }
        Object g8 = AbstractC2825i.g(C2812b0.c(), new F(null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return L5.I.f6474a;
    }

    private final void P4() {
        if (getContext() != null) {
            C3326n.a aVar = C3326n.f34490t;
            FragmentActivity requireActivity = requireActivity();
            AbstractC3159y.h(requireActivity, "requireActivity()");
            C3326n a8 = aVar.a(requireActivity);
            a8.a();
            C1498h c1498h = this.f11186c;
            AbstractC3159y.f(c1498h);
            String y02 = c1498h.y0();
            AbstractC3159y.f(y02);
            C1496f S7 = a8.S(y02);
            a8.g();
            Intent intent = new Intent(requireActivity(), (Class<?>) AppInstalledDetailsActivity.class);
            intent.putExtra("appInstalled", S7);
            intent.putExtra("appInfo", this.f11186c);
            UptodownApp.a aVar2 = UptodownApp.f27990B;
            FragmentActivity requireActivity2 = requireActivity();
            AbstractC3159y.h(requireActivity2, "requireActivity()");
            startActivity(intent, aVar2.a(requireActivity2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object P5(P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new e0(null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return L5.I.f6474a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P6(X4.K k8, int i8) {
        int dimension = (int) getResources().getDimension(com.uptodown.R.dimen.margin_m);
        LinearLayout linearLayout = J3().f10450s;
        AbstractC3159y.h(linearLayout, "binding.llReviewListContainer");
        if (linearLayout.getChildCount() > i8) {
            J3().f10450s.removeViewAt(i8);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(dimension, dimension, dimension, dimension);
        if (k8.L()) {
            LinearLayout linearLayout2 = J3().f10450s;
            Context requireContext = requireContext();
            AbstractC3159y.h(requireContext, "requireContext()");
            linearLayout2.addView(D5(layoutParams, k8, requireContext), i8);
            return;
        }
        LinearLayout linearLayout3 = J3().f10450s;
        Context requireContext2 = requireContext();
        AbstractC3159y.h(requireContext2, "requireContext()");
        linearLayout3.addView(w5(layoutParams, k8, requireContext2), i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q2(final L0 this$0, final View this_cancelPreRegister, final C3312F wsHelper, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(this_cancelPreRegister, "$this_cancelPreRegister");
        AbstractC3159y.i(wsHelper, "$wsHelper");
        if (UptodownApp.f27990B.a0()) {
            FragmentActivity activity = this$0.getActivity();
            AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
            AlertDialog s22 = ((AbstractActivityC2489a) activity).s2();
            if (s22 != null) {
                s22.dismiss();
            }
            if (this_cancelPreRegister.getContext() != null) {
                C1388v c8 = C1388v.c(this$0.getLayoutInflater());
                AbstractC3159y.h(c8, "inflate(layoutInflater)");
                TextView textView = c8.f10925f;
                j.a aVar = E4.j.f2272g;
                textView.setTypeface(aVar.t());
                c8.f10925f.setText(this$0.getString(com.uptodown.R.string.cancel_registration));
                c8.f10923d.setTypeface(aVar.u());
                TextView textView2 = c8.f10923d;
                C3323k c3323k = new C3323k();
                C1498h c1498h = this$0.f11186c;
                AbstractC3159y.f(c1498h);
                String string = this$0.getString(com.uptodown.R.string.confirm_cancel_preregister, c1498h.s0());
                AbstractC3159y.h(string, "getString(R.string.confi…register, appInfo!!.name)");
                C1498h c1498h2 = this$0.f11186c;
                AbstractC3159y.f(c1498h2);
                String s02 = c1498h2.s0();
                AbstractC3159y.f(s02);
                Context context = this_cancelPreRegister.getContext();
                AbstractC3159y.h(context, "context");
                textView2.setText(c3323k.d(string, s02, context));
                c8.f10922c.setTypeface(aVar.t());
                c8.f10924e.setTypeface(aVar.t());
                c8.f10924e.setText(this$0.getString(com.uptodown.R.string.dialog_confirmation_verify_afirmative));
                c8.f10922c.setVisibility(0);
                c8.f10922c.setOnClickListener(new View.OnClickListener() { // from class: U4.m0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        L0.R2(L0.this, view2);
                    }
                });
                c8.f10924e.setOnClickListener(new View.OnClickListener() { // from class: U4.n0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        L0.S2(L0.this, wsHelper, this_cancelPreRegister, view2);
                    }
                });
                c8.f10921b.setOnClickListener(new View.OnClickListener() { // from class: U4.o0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        L0.T2(L0.this, view2);
                    }
                });
                AlertDialog.Builder builder = new AlertDialog.Builder(this$0.requireContext());
                builder.setView(c8.getRoot());
                builder.setCancelable(true);
                this$0.y6(builder);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0100 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object Q3(P5.d r11) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: U4.L0.Q3(P5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q4(C1501k c1501k) {
        if (getActivity() != null && (getActivity() instanceof MainActivity)) {
            FragmentActivity activity = getActivity();
            AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
            ((MainActivity) activity).R7(c1501k);
        } else if (getActivity() != null && (getActivity() instanceof AppDetailActivity)) {
            FragmentActivity activity2 = getActivity();
            AbstractC3159y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.AppDetailActivity");
            ((AppDetailActivity) activity2).z3(c1501k);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q5(View view, Context context) {
        ViewTreeObserver viewTreeObserver;
        if (SettingsPreferences.f29309b.N(context) && view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnPreDrawListener(new f0(view, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R2(L0 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        FragmentActivity activity = this$0.getActivity();
        AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
        AlertDialog s22 = ((AbstractActivityC2489a) activity).s2();
        if (s22 != null) {
            s22.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object R3(P5.d r9) {
        /*
            r8 = this;
            androidx.fragment.app.FragmentActivity r0 = r8.getActivity()
            if (r0 == 0) goto Leb
            androidx.fragment.app.FragmentActivity r0 = r8.requireActivity()
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto Leb
            X4.h r0 = r8.f11186c
            if (r0 == 0) goto Leb
            kotlin.jvm.internal.AbstractC3159y.f(r0)
            java.util.ArrayList r0 = r0.V0()
            if (r0 == 0) goto L23
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Leb
        L23:
            l5.F r0 = new l5.F
            androidx.fragment.app.FragmentActivity r1 = r8.requireActivity()
            java.lang.String r2 = "requireActivity()"
            kotlin.jvm.internal.AbstractC3159y.h(r1, r2)
            r0.<init>(r1)
            X4.h r1 = r8.f11186c
            kotlin.jvm.internal.AbstractC3159y.f(r1)
            long r1 = r1.i()
            r3 = 20
            r4 = 0
            X4.I r0 = r0.T0(r1, r3, r4)
            boolean r1 = r0.b()
            r2 = 0
            if (r1 != 0) goto Lb9
            java.lang.String r1 = r0.d()
            if (r1 == 0) goto Lb9
            java.lang.String r1 = r0.d()
            kotlin.jvm.internal.AbstractC3159y.f(r1)
            int r1 = r1.length()
            if (r1 <= 0) goto Lb9
            org.json.JSONObject r1 = new org.json.JSONObject
            java.lang.String r0 = r0.d()
            kotlin.jvm.internal.AbstractC3159y.f(r0)
            r1.<init>(r0)
            java.lang.String r0 = "success"
            boolean r3 = r1.isNull(r0)
            r5 = 1
            if (r3 != 0) goto L75
            int r0 = r1.optInt(r0, r4)
            goto L76
        L75:
            r0 = 1
        L76:
            java.lang.String r3 = "data"
            boolean r6 = r1.isNull(r3)
            if (r6 != 0) goto L83
            org.json.JSONArray r1 = r1.optJSONArray(r3)
            goto L84
        L83:
            r1 = r2
        L84:
            if (r0 != r5) goto Ld4
            if (r1 == 0) goto Ld4
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r3 = r1.length()
        L91:
            if (r4 >= r3) goto Laa
            X4.h r5 = new X4.h
            r5.<init>()
            org.json.JSONObject r6 = r1.getJSONObject(r4)
            java.lang.String r7 = "jsonObjectAppSimilar"
            kotlin.jvm.internal.AbstractC3159y.h(r6, r7)
            r5.b(r6)
            r0.add(r5)
            int r4 = r4 + 1
            goto L91
        Laa:
            int r1 = r0.size()
            if (r1 <= 0) goto Ld4
            X4.h r1 = r8.f11186c
            kotlin.jvm.internal.AbstractC3159y.f(r1)
            r1.E1(r0)
            goto Ld4
        Lb9:
            boolean r1 = r0.b()
            if (r1 == 0) goto Ld4
            int r0 = r0.e()
            r1 = 404(0x194, float:5.66E-43)
            if (r0 != r1) goto Ld4
            X4.h r0 = r8.f11186c
            kotlin.jvm.internal.AbstractC3159y.f(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.E1(r1)
        Ld4:
            i6.J0 r0 = i6.C2812b0.c()
            U4.L0$K r1 = new U4.L0$K
            r1.<init>(r2)
            java.lang.Object r9 = i6.AbstractC2825i.g(r0, r1, r9)
            java.lang.Object r0 = Q5.b.e()
            if (r9 != r0) goto Le8
            return r9
        Le8:
            L5.I r9 = L5.I.f6474a
            return r9
        Leb:
            L5.I r9 = L5.I.f6474a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: U4.L0.R3(P5.d):java.lang.Object");
    }

    private final void R4() {
        if (getActivity() != null && !requireActivity().isFinishing()) {
            String string = getString(com.uptodown.R.string.dmca_title);
            AbstractC3159y.h(string, "getString(R.string.dmca_title)");
            String string2 = getString(com.uptodown.R.string.url_dmca);
            AbstractC3159y.h(string2, "getString(R.string.url_dmca)");
            C3323k c3323k = new C3323k();
            FragmentActivity requireActivity = requireActivity();
            AbstractC3159y.h(requireActivity, "requireActivity()");
            c3323k.q(requireActivity, string2, string);
        }
    }

    private final void R5(String str) {
        int i8 = this.f11200q;
        if (1 <= i8 && i8 < 6) {
            AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new g0(str, null), 3, null);
            FragmentActivity activity = getActivity();
            AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
            AlertDialog s22 = ((AbstractActivityC2489a) activity).s2();
            if (s22 != null) {
                s22.dismiss();
                return;
            }
            return;
        }
        Toast.makeText(requireContext(), getString(com.uptodown.R.string.error_review_no_valoration), 0).show();
    }

    private final void R6(int i8, Context context) {
        String str;
        X4.Q e8 = X4.Q.f12424k.e(context);
        if (e8 != null) {
            str = e8.getId();
        } else {
            str = null;
        }
        if (str != null) {
            String id = e8.getId();
            AbstractC3159y.f(id);
            if (id.length() > 0) {
                this.f11200q = i8;
                if (i8 != 1) {
                    if (i8 != 2) {
                        if (i8 != 3) {
                            if (i8 != 4) {
                                if (i8 != 5) {
                                    J3().f10453v.f10026b.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off));
                                    J3().f10453v.f10027c.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off));
                                    J3().f10453v.f10028d.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off));
                                    J3().f10453v.f10029e.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off));
                                    J3().f10453v.f10030f.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off));
                                    return;
                                }
                                J3().f10453v.f10026b.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on));
                                J3().f10453v.f10027c.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on));
                                J3().f10453v.f10028d.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on));
                                J3().f10453v.f10029e.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on));
                                J3().f10453v.f10030f.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on));
                                return;
                            }
                            J3().f10453v.f10026b.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on));
                            J3().f10453v.f10027c.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on));
                            J3().f10453v.f10028d.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on));
                            J3().f10453v.f10029e.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on));
                            J3().f10453v.f10030f.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off));
                            return;
                        }
                        J3().f10453v.f10026b.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on));
                        J3().f10453v.f10027c.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on));
                        J3().f10453v.f10028d.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on));
                        J3().f10453v.f10029e.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off));
                        J3().f10453v.f10030f.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off));
                        return;
                    }
                    J3().f10453v.f10026b.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on));
                    J3().f10453v.f10027c.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on));
                    J3().f10453v.f10028d.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off));
                    J3().f10453v.f10029e.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off));
                    J3().f10453v.f10030f.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off));
                    return;
                }
                J3().f10453v.f10026b.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on));
                J3().f10453v.f10027c.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off));
                J3().f10453v.f10028d.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off));
                J3().f10453v.f10029e.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off));
                J3().f10453v.f10030f.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S2(L0 this$0, C3312F wsHelper, View this_cancelPreRegister, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(wsHelper, "$wsHelper");
        AbstractC3159y.i(this_cancelPreRegister, "$this_cancelPreRegister");
        AbstractC2829k.d(i6.N.a(C2812b0.b()), null, null, new C1399g(wsHelper, this_cancelPreRegister, null), 3, null);
    }

    private final long S3() {
        String str;
        try {
            C1498h c1498h = this.f11186c;
            if (c1498h != null) {
                str = c1498h.W0();
            } else {
                str = null;
            }
            if (str != null) {
                C1498h c1498h2 = this.f11186c;
                AbstractC3159y.f(c1498h2);
                String W02 = c1498h2.W0();
                AbstractC3159y.f(W02);
                return Long.parseLong(W02);
            }
        } catch (NumberFormatException e8) {
            e8.printStackTrace();
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S4(String str) {
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (Exception e8) {
            m3(String.valueOf(e8.getMessage()));
        }
    }

    private final void S5() {
        String str = this.f11178E;
        if (str != null) {
            AbstractC3159y.f(str);
            R5(str);
            FragmentActivity activity = getActivity();
            AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
            AlertDialog s22 = ((AbstractActivityC2489a) activity).s2();
            if (s22 != null) {
                s22.dismiss();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S6(L0 this$0, ActivityResult activityResult) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this$0), C2812b0.b(), null, new t0(new u0(), null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T2(L0 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        FragmentActivity activity = this$0.getActivity();
        AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
        AlertDialog s22 = ((AbstractActivityC2489a) activity).s2();
        if (s22 != null) {
            s22.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object T3(P5.d dVar) {
        int i8;
        boolean z8;
        int i9;
        if (getActivity() != null) {
            FragmentActivity requireActivity = requireActivity();
            AbstractC3159y.h(requireActivity, "requireActivity()");
            C3312F c3312f = new C3312F(requireActivity);
            C1498h c1498h = this.f11186c;
            if (c1498h != null) {
                AbstractC3159y.f(c1498h);
                ArrayList i12 = c1498h.i1();
                if (i12 == null || i12.isEmpty()) {
                    C1498h c1498h2 = this.f11186c;
                    AbstractC3159y.f(c1498h2);
                    X4.I t02 = c3312f.t0(c1498h2.i());
                    if (!t02.b() && t02.d() != null) {
                        String d8 = t02.d();
                        AbstractC3159y.f(d8);
                        if (d8.length() > 0) {
                            String d9 = t02.d();
                            AbstractC3159y.f(d9);
                            JSONObject jSONObject = new JSONObject(d9);
                            if (!jSONObject.isNull("success")) {
                                i8 = jSONObject.optInt("success", 0);
                            } else {
                                i8 = 0;
                            }
                            if (i8 == 1 && !jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                                JSONObject jSONObject2 = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                                ArrayList arrayList = new ArrayList();
                                JSONArray jSONArray = jSONObject2.getJSONArray("videos");
                                int length = jSONArray.length();
                                for (int i10 = 0; i10 < length; i10++) {
                                    JSONObject jsonObjectVideo = jSONArray.getJSONObject(i10);
                                    T.b bVar = X4.T.f12439c;
                                    AbstractC3159y.h(jsonObjectVideo, "jsonObjectVideo");
                                    arrayList.add(bVar.a(jsonObjectVideo));
                                }
                                C1498h c1498h3 = this.f11186c;
                                AbstractC3159y.f(c1498h3);
                                c1498h3.F1(arrayList);
                            }
                        }
                    }
                }
                C1498h c1498h4 = this.f11186c;
                AbstractC3159y.f(c1498h4);
                if (c1498h4.R0() == null) {
                    C1498h c1498h5 = this.f11186c;
                    AbstractC3159y.f(c1498h5);
                    X4.I X7 = c3312f.X(c1498h5.i());
                    if (!X7.b() && X7.d() != null) {
                        String d10 = X7.d();
                        AbstractC3159y.f(d10);
                        if (d10.length() > 0) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (z8) {
                            String d11 = X7.d();
                            AbstractC3159y.f(d11);
                            JSONObject jSONObject3 = new JSONObject(d11);
                            if (!jSONObject3.isNull("success")) {
                                i9 = jSONObject3.optInt("success", 0);
                            } else {
                                i9 = 0;
                            }
                            if (i9 == 1 && !jSONObject3.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                                ArrayList arrayList2 = new ArrayList();
                                JSONArray jSONArray2 = jSONObject3.getJSONArray(DataSchemeDataSource.SCHEME_DATA);
                                int length2 = jSONArray2.length();
                                for (int i11 = 0; i11 < length2; i11++) {
                                    JSONObject jsonObjectScreenshot = jSONArray2.getJSONObject(i11);
                                    L.b bVar2 = X4.L.f12393e;
                                    AbstractC3159y.h(jsonObjectScreenshot, "jsonObjectScreenshot");
                                    X4.L a8 = bVar2.a(jsonObjectScreenshot);
                                    if (a8.b() == 0) {
                                        arrayList2.add(a8);
                                    } else {
                                        C1498h c1498h6 = this.f11186c;
                                        AbstractC3159y.f(c1498h6);
                                        c1498h6.v1(a8.e());
                                    }
                                    final L l8 = L.f11238a;
                                    AbstractC1246t.B(arrayList2, new Comparator() { // from class: U4.J
                                        @Override // java.util.Comparator
                                        public final int compare(Object obj, Object obj2) {
                                            int U32;
                                            U32 = L0.U3(X5.n.this, obj, obj2);
                                            return U32;
                                        }
                                    });
                                    C1498h c1498h7 = this.f11186c;
                                    AbstractC3159y.f(c1498h7);
                                    c1498h7.D1(arrayList2);
                                }
                            }
                        }
                    }
                    if (X7.b() && X7.e() == 404) {
                        C1498h c1498h8 = this.f11186c;
                        AbstractC3159y.f(c1498h8);
                        c1498h8.D1(new ArrayList());
                    }
                }
            }
        }
        Object g8 = AbstractC2825i.g(C2812b0.c(), new M(null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return L5.I.f6474a;
    }

    private final void T4() {
        if (!requireActivity().isFinishing()) {
            Intent intent = new Intent(requireActivity(), (Class<?>) InformationActivity.class);
            UptodownApp.a aVar = UptodownApp.f27990B;
            FragmentActivity requireActivity = requireActivity();
            AbstractC3159y.h(requireActivity, "requireActivity()");
            startActivity(intent, aVar.a(requireActivity));
        }
    }

    private final void T6() {
        try {
            C1498h c1498h = this.f11186c;
            if (c1498h != null) {
                AbstractC3159y.f(c1498h);
                if (c1498h.G0() > 0 && this.f11189f > 0) {
                    int dimension = (int) getResources().getDimension(com.uptodown.R.dimen.margin_m);
                    int i8 = this.f11189f;
                    C1498h c1498h2 = this.f11186c;
                    AbstractC3159y.f(c1498h2);
                    int L02 = i8 * c1498h2.L0();
                    C1498h c1498h3 = this.f11186c;
                    AbstractC3159y.f(c1498h3);
                    J3().f10451t.f10709h.setLayoutParams(new RelativeLayout.LayoutParams(L02 / c1498h3.G0(), dimension));
                    int i9 = this.f11189f;
                    C1498h c1498h4 = this.f11186c;
                    AbstractC3159y.f(c1498h4);
                    int K02 = i9 * c1498h4.K0();
                    C1498h c1498h5 = this.f11186c;
                    AbstractC3159y.f(c1498h5);
                    J3().f10451t.f10708g.setLayoutParams(new RelativeLayout.LayoutParams(K02 / c1498h5.G0(), dimension));
                    int i10 = this.f11189f;
                    C1498h c1498h6 = this.f11186c;
                    AbstractC3159y.f(c1498h6);
                    int J02 = i10 * c1498h6.J0();
                    C1498h c1498h7 = this.f11186c;
                    AbstractC3159y.f(c1498h7);
                    J3().f10451t.f10707f.setLayoutParams(new RelativeLayout.LayoutParams(J02 / c1498h7.G0(), dimension));
                    int i11 = this.f11189f;
                    C1498h c1498h8 = this.f11186c;
                    AbstractC3159y.f(c1498h8);
                    int I02 = i11 * c1498h8.I0();
                    C1498h c1498h9 = this.f11186c;
                    AbstractC3159y.f(c1498h9);
                    J3().f10451t.f10706e.setLayoutParams(new RelativeLayout.LayoutParams(I02 / c1498h9.G0(), dimension));
                    int i12 = this.f11189f;
                    C1498h c1498h10 = this.f11186c;
                    AbstractC3159y.f(c1498h10);
                    int H02 = i12 * c1498h10.H0();
                    C1498h c1498h11 = this.f11186c;
                    AbstractC3159y.f(c1498h11);
                    J3().f10451t.f10705d.setLayoutParams(new RelativeLayout.LayoutParams(H02 / c1498h11.G0(), dimension));
                }
            }
            J3().f10451t.getRoot().setVisibility(8);
            J3().f10451t.f10718q.setVisibility(8);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object U2(P5.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof U4.L0.C1400h
            if (r0 == 0) goto L13
            r0 = r7
            U4.L0$h r0 = (U4.L0.C1400h) r0
            int r1 = r0.f11326d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11326d = r1
            goto L18
        L13:
            U4.L0$h r0 = new U4.L0$h
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f11324b
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f11326d
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
            java.lang.Object r2 = r0.f11323a
            U4.L0 r2 = (U4.L0) r2
            L5.t.b(r7)
            goto L55
        L3d:
            L5.t.b(r7)
            i6.I r7 = i6.C2812b0.b()
            U4.L0$i r2 = new U4.L0$i
            r2.<init>(r5)
            r0.f11323a = r6
            r0.f11326d = r4
            java.lang.Object r7 = i6.AbstractC2825i.g(r7, r2, r0)
            if (r7 != r1) goto L54
            return r1
        L54:
            r2 = r6
        L55:
            i6.J0 r7 = i6.C2812b0.c()
            U4.L0$j r4 = new U4.L0$j
            r4.<init>(r5)
            r0.f11323a = r5
            r0.f11326d = r3
            java.lang.Object r7 = i6.AbstractC2825i.g(r7, r4, r0)
            if (r7 != r1) goto L69
            return r1
        L69:
            L5.I r7 = L5.I.f6474a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: U4.L0.U2(P5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int U3(X5.n tmp0, Object obj, Object obj2) {
        AbstractC3159y.i(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    private final void U4() {
        if (getActivity() != null && !requireActivity().isFinishing()) {
            Intent intent = new Intent(requireActivity(), (Class<?>) LoginActivity.class);
            ActivityResultLauncher activityResultLauncher = this.f11182I;
            UptodownApp.a aVar = UptodownApp.f27990B;
            FragmentActivity requireActivity = requireActivity();
            AbstractC3159y.h(requireActivity, "requireActivity()");
            activityResultLauncher.launch(intent, aVar.b(requireActivity));
        }
    }

    private final void U5(TextView textView, int i8) {
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setOutlineSpotShadowColor(ContextCompat.getColor(requireContext(), i8));
            textView.setOutlineAmbientShadowColor(ContextCompat.getColor(requireContext(), i8));
        }
    }

    private final void U6() {
        N4.u uVar = new N4.u();
        Context requireContext = requireContext();
        AbstractC3159y.h(requireContext, "requireContext()");
        ArrayList c8 = uVar.c(requireContext);
        this.f11197n = c8;
        AbstractC3159y.f(c8);
        if (c8.size() > 0) {
            C3329q c3329q = new C3329q();
            Context requireContext2 = requireContext();
            AbstractC3159y.h(requireContext2, "requireContext()");
            File f8 = c3329q.f(requireContext2);
            String absolutePath = f8.getAbsolutePath();
            AbstractC3159y.h(absolutePath, "dirApps.absolutePath");
            K4.e eVar = new K4.e(absolutePath);
            eVar.f(false);
            eVar.e(f8.getFreeSpace());
            ArrayList arrayList = this.f11197n;
            AbstractC3159y.f(arrayList);
            arrayList.add(0, eVar);
            this.f11195l = 0;
            k3();
            return;
        }
        SettingsPreferences.a aVar = SettingsPreferences.f29309b;
        Context requireContext3 = requireContext();
        AbstractC3159y.h(requireContext3, "requireContext()");
        aVar.W0(requireContext3, false);
        e6();
    }

    private final void V2() {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: U4.F0
            @Override // java.lang.Runnable
            public final void run() {
                L0.W2(L0.this);
            }
        }, 5000L);
    }

    private final View V3(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String str;
        this.f11184a = C1363c.c(layoutInflater, viewGroup, false);
        CoordinatorLayout root = J3().getRoot();
        AbstractC3159y.h(root, "binding.root");
        C1498h c1498h = this.f11186c;
        String str2 = null;
        if (c1498h != null) {
            str = c1498h.j0();
        } else {
            str = null;
        }
        if (str == null || str.length() == 0) {
            C1498h c1498h2 = this.f11186c;
            if (c1498h2 != null) {
                str2 = c1498h2.b0();
            }
            if (str2 == null || str2.length() == 0) {
                J3().f10398F.f10473b.setVisibility(8);
                View inflate = layoutInflater.inflate(com.uptodown.R.layout.app_detail_feature_image, viewGroup, false);
                AbstractC3159y.g(inflate, "null cannot be cast to non-null type android.widget.ImageView");
                this.f11185b = (ImageView) inflate;
                J3().f10398F.f10473b.removeAllViews();
                J3().f10398F.f10473b.addView(this.f11185b);
                return root;
            }
        }
        J3().f10398F.f10473b.setVisibility(0);
        View inflate2 = layoutInflater.inflate(com.uptodown.R.layout.app_detail_feature_image, viewGroup, false);
        AbstractC3159y.g(inflate2, "null cannot be cast to non-null type android.widget.ImageView");
        this.f11185b = (ImageView) inflate2;
        J3().f10398F.f10473b.removeAllViews();
        J3().f10398F.f10473b.addView(this.f11185b);
        return root;
    }

    private final void V4(final View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: U4.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                L0.W4(L0.this, view, view2);
            }
        });
    }

    private final void V5() {
        if (J3().f10429f.getChildCount() == 0) {
            C1379l c8 = C1379l.c(getLayoutInflater());
            AbstractC3159y.h(c8, "inflate(layoutInflater)");
            c8.f10728b.setTypeface(E4.j.f2272g.u());
            J3().f10429f.addView(c8.getRoot());
        }
        V2();
    }

    private final void V6() {
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new v0(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W2(L0 this$0) {
        AbstractC3159y.i(this$0, "this$0");
        if (this$0.getContext() != null) {
            SettingsPreferences.a aVar = SettingsPreferences.f29309b;
            Context requireContext = this$0.requireContext();
            AbstractC3159y.h(requireContext, "requireContext()");
            if (!aVar.S(requireContext)) {
                this$0.V5();
            } else if (this$0.J3().f10429f.getChildCount() > 0) {
                this$0.J3().f10429f.removeAllViews();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean W3() {
        FragmentActivity activity = getActivity();
        AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
        if (((AbstractActivityC2489a) activity).U() && getContext() != null) {
            C3329q c3329q = new C3329q();
            Context requireContext = requireContext();
            AbstractC3159y.h(requireContext, "requireContext()");
            File f8 = c3329q.f(requireContext);
            C3313a c3313a = new C3313a();
            C3329q c3329q2 = new C3329q();
            Context requireContext2 = requireContext();
            AbstractC3159y.h(requireContext2, "requireContext()");
            return c3313a.c(c3329q2.k(requireContext2, f8), S3());
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W4(final L0 this$0, View this_openLoginToPreRegister, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(this_openLoginToPreRegister, "$this_openLoginToPreRegister");
        if (UptodownApp.f27990B.a0()) {
            FragmentActivity activity = this$0.getActivity();
            AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
            AlertDialog s22 = ((AbstractActivityC2489a) activity).s2();
            if (s22 != null) {
                s22.dismiss();
            }
            if (this_openLoginToPreRegister.getContext() != null) {
                C1388v c8 = C1388v.c(this$0.getLayoutInflater());
                AbstractC3159y.h(c8, "inflate(layoutInflater)");
                TextView textView = c8.f10925f;
                j.a aVar = E4.j.f2272g;
                textView.setTypeface(aVar.t());
                c8.f10923d.setTypeface(aVar.u());
                c8.f10924e.setTypeface(aVar.t());
                c8.f10924e.setOnClickListener(new View.OnClickListener() { // from class: U4.p0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        L0.X4(L0.this, view2);
                    }
                });
                c8.f10921b.setOnClickListener(new View.OnClickListener() { // from class: U4.q0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        L0.Y4(L0.this, view2);
                    }
                });
                AlertDialog.Builder builder = new AlertDialog.Builder(this$0.requireContext());
                builder.setView(c8.getRoot());
                builder.setCancelable(true);
                this$0.y6(builder);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W5(int i8, String str) {
        Menu menu = this.f11201r;
        if (menu != null) {
            AbstractC3159y.f(menu);
            menu.findItem(i8).setTitle(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object W6(P5.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof U4.L0.w0
            if (r0 == 0) goto L13
            r0 = r7
            U4.L0$w0 r0 = (U4.L0.w0) r0
            int r1 = r0.f11414d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11414d = r1
            goto L18
        L13:
            U4.L0$w0 r0 = new U4.L0$w0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f11412b
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f11414d
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
            java.lang.Object r2 = r0.f11411a
            U4.L0 r2 = (U4.L0) r2
            L5.t.b(r7)
            goto L55
        L3d:
            L5.t.b(r7)
            i6.I r7 = i6.C2812b0.b()
            U4.L0$x0 r2 = new U4.L0$x0
            r2.<init>(r5)
            r0.f11411a = r6
            r0.f11414d = r4
            java.lang.Object r7 = i6.AbstractC2825i.g(r7, r2, r0)
            if (r7 != r1) goto L54
            return r1
        L54:
            r2 = r6
        L55:
            i6.J0 r7 = i6.C2812b0.c()
            U4.L0$y0 r4 = new U4.L0$y0
            r4.<init>(r5)
            r0.f11411a = r5
            r0.f11414d = r3
            java.lang.Object r7 = i6.AbstractC2825i.g(r7, r4, r0)
            if (r7 != r1) goto L69
            return r1
        L69:
            L5.I r7 = L5.I.f6474a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: U4.L0.W6(P5.d):java.lang.Object");
    }

    private final void X2() {
        Long l8;
        C1498h c1498h = this.f11186c;
        if (c1498h != null) {
            AbstractC3159y.f(c1498h);
            if (!c1498h.v0()) {
                C1498h c1498h2 = this.f11186c;
                AbstractC3159y.f(c1498h2);
                if (c1498h2.o0() > 0) {
                    C1498h c1498h3 = this.f11186c;
                    AbstractC3159y.f(c1498h3);
                    if (c1498h3.k1()) {
                        C1498h c1498h4 = this.f11186c;
                        AbstractC3159y.f(c1498h4);
                        if (c1498h4.f1() > 0) {
                            C1498h c1498h5 = this.f11186c;
                            AbstractC3159y.f(c1498h5);
                            long o02 = c1498h5.o0();
                            C1498h c1498h6 = this.f11186c;
                            AbstractC3159y.f(c1498h6);
                            if (o02 != c1498h6.f1()) {
                                C1498h c1498h7 = this.f11186c;
                                AbstractC3159y.f(c1498h7);
                                c1498h7.x1(true);
                                Bundle bundle = new Bundle();
                                C1498h c1498h8 = this.f11186c;
                                if (c1498h8 != null) {
                                    l8 = Long.valueOf(c1498h8.i());
                                } else {
                                    l8 = null;
                                }
                                if (l8 != null) {
                                    C1498h c1498h9 = this.f11186c;
                                    AbstractC3159y.f(c1498h9);
                                    bundle.putString("appId", String.valueOf(c1498h9.i()));
                                }
                                bundle.putString("type", "noLastVersion");
                                C3330r c3330r = this.f11209z;
                                if (c3330r != null) {
                                    c3330r.b("app_details", bundle);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X3(int i8) {
        Menu menu = this.f11201r;
        if (menu != null) {
            AbstractC3159y.f(menu);
            menu.findItem(i8).setVisible(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X4(L0 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.U4();
        FragmentActivity activity = this$0.getActivity();
        AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
        AlertDialog s22 = ((AbstractActivityC2489a) activity).s2();
        if (s22 != null) {
            s22.dismiss();
        }
    }

    private final void X5(int i8) {
        Menu menu = this.f11201r;
        AbstractC3159y.f(menu);
        Drawable icon = menu.findItem(com.uptodown.R.id.action_search).getIcon();
        if (icon != null) {
            DrawableCompat.setTint(icon, i8);
        }
    }

    private final void Y2(int i8, String str, long j8) {
        if (getContext() != null && i8 >= 0) {
            x.a aVar = X4.x.f12714f;
            Context requireContext = requireContext();
            AbstractC3159y.h(requireContext, "requireContext()");
            X4.x b8 = aVar.b(requireContext);
            if (b8 != null && b8.c() == -1 && AbstractC3159y.d(b8.d(), str) && b8.b() == j8) {
                Context requireContext2 = requireContext();
                AbstractC3159y.h(requireContext2, "requireContext()");
                b8.l(requireContext2, i8);
            }
        }
    }

    private final void Y3() {
        I6();
        C3475c c3475c = C3475c.f36184a;
        ProgressBar progressBar = J3().f10399G.f10501h;
        AbstractC3159y.h(progressBar, "binding.rlMainInfoAppDetail.pbProgressAppDetail");
        ImageView imageView = J3().f10399G.f10495b;
        AbstractC3159y.h(imageView, "binding.rlMainInfoAppDetail.ivLogoAppDetail");
        c3475c.e(progressBar, imageView);
        this.f11203t = -1;
        J3().f10396D.f10690e.setVisibility(8);
        J3().f10396D.f10691f.setVisibility(8);
        J3().f10396D.f10689d.setVisibility(0);
        J3().f10399G.f10501h.setIndeterminate(true);
        J3().f10399G.f10514u.setText(getString(com.uptodown.R.string.status_download_update_pending));
        J3().f10393A.f11019k.setVisibility(8);
        J3().f10393A.f11010b.setVisibility(4);
        J3().f10393A.f11022n.setText("");
        J3().f10393A.f11013e.setIndeterminate(true);
        J3().f10393A.f11020l.setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y4(L0 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        FragmentActivity activity = this$0.getActivity();
        AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
        AlertDialog s22 = ((AbstractActivityC2489a) activity).s2();
        if (s22 != null) {
            s22.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y5(String str) {
        H6();
        this.f11203t = -1;
        J3().f10399G.f10498e.setVisibility(0);
        J3().f10399G.f10496c.setVisibility(8);
        J3().f10396D.f10691f.setText(str);
        J3().f10396D.f10691f.setBackground(ContextCompat.getDrawable(requireContext(), com.uptodown.R.drawable.shape_bg_download_button_deactivated));
        J3().f10396D.f10691f.setTextColor(ContextCompat.getColor(requireContext(), com.uptodown.R.color.main_light_grey));
        J3().f10396D.f10691f.setOnClickListener(null);
        J3().f10393A.f11023o.setText(str);
        J3().f10393A.f11014f.setBackground(ContextCompat.getDrawable(requireContext(), com.uptodown.R.drawable.shape_bg_download_button_deactivated));
        J3().f10393A.f11023o.setTextColor(ContextCompat.getColor(requireContext(), com.uptodown.R.color.main_light_grey));
        J3().f10393A.f11014f.setOnClickListener(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x007c, code lost:
    
        if (r6.exists() == false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0149 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object Z2(android.content.Context r14, P5.d r15) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: U4.L0.Z2(android.content.Context, P5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x05eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void Z3(final android.content.Context r10) {
        /*
            Method dump skipped, instructions count: 1635
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: U4.L0.Z3(android.content.Context):void");
    }

    private final void Z4() {
        if (!requireActivity().isFinishing() && this.f11186c != null) {
            Intent intent = new Intent(requireActivity(), (Class<?>) MoreInfo.class);
            intent.putExtra("appInfo", this.f11186c);
            UptodownApp.a aVar = UptodownApp.f27990B;
            FragmentActivity requireActivity = requireActivity();
            AbstractC3159y.h(requireActivity, "requireActivity()");
            startActivity(intent, aVar.a(requireActivity));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z5(C1505o c1505o) {
        I6();
        this.f11203t = -1;
        J3().f10399G.f10501h.setIndeterminate(true);
        J3().f10399G.f10498e.setVisibility(8);
        J3().f10399G.f10496c.setVisibility(0);
        J3().f10399G.f10514u.setText(getString(com.uptodown.R.string.status_download_update_pending));
        J3().f10393A.f11013e.setIndeterminate(true);
        J3().f10393A.f11021m.setText(new N4.g().c(c1505o.o()));
        J3().f10393A.f11020l.setText(c1505o.Z() + getString(com.uptodown.R.string.percent));
        TextView textView = J3().f10393A.f11022n;
        kotlin.jvm.internal.Y y8 = kotlin.jvm.internal.Y.f33752a;
        String format = String.format("/%s", Arrays.copyOf(new Object[]{new N4.g().c(c1505o.a0())}, 1));
        AbstractC3159y.h(format, "format(...)");
        textView.setText(format);
    }

    private final void a3() {
        FragmentActivity activity = getActivity();
        AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
        if (((AbstractActivityC2489a) activity).U()) {
            SettingsPreferences.a aVar = SettingsPreferences.f29309b;
            Context requireContext = requireContext();
            AbstractC3159y.h(requireContext, "requireContext()");
            if (!aVar.e0(requireContext)) {
                U6();
                return;
            } else {
                e6();
                return;
            }
        }
        FragmentActivity activity2 = getActivity();
        AbstractC3159y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
        ((AbstractActivityC2489a) activity2).p0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a4(L0 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        if (this$0.getActivity() != null) {
            if (this$0.getActivity() instanceof MainActivity) {
                FragmentActivity activity = this$0.getActivity();
                AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                ((MainActivity) activity).M6();
            } else if (this$0.getActivity() instanceof AppDetailActivity) {
                FragmentActivity activity2 = this$0.getActivity();
                AbstractC3159y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.AppDetailActivity");
                ((AppDetailActivity) activity2).finish();
            }
        }
    }

    private final void a5() {
        C1498h c1498h;
        if (!requireActivity().isFinishing() && (c1498h = this.f11186c) != null) {
            AbstractC3159y.f(c1498h);
            if (c1498h.n1()) {
                Intent intent = new Intent(requireActivity(), (Class<?>) OldVersionsActivity.class);
                intent.putExtra("appInfo", this.f11186c);
                UptodownApp.a aVar = UptodownApp.f27990B;
                FragmentActivity requireActivity = requireActivity();
                AbstractC3159y.h(requireActivity, "requireActivity()");
                startActivity(intent, aVar.a(requireActivity));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a6(Context context) {
        String str;
        String string;
        H6();
        C3475c c3475c = C3475c.f36184a;
        ProgressBar progressBar = J3().f10399G.f10501h;
        AbstractC3159y.h(progressBar, "binding.rlMainInfoAppDetail.pbProgressAppDetail");
        ImageView imageView = J3().f10399G.f10495b;
        AbstractC3159y.h(imageView, "binding.rlMainInfoAppDetail.ivLogoAppDetail");
        c3475c.c(progressBar, imageView);
        this.f11203t = -1;
        if (new G4.a(context).m()) {
            string = context.getString(com.uptodown.R.string.option_button_install);
            AbstractC3159y.h(string, "context.getString(R.string.option_button_install)");
        } else {
            C1498h c1498h = this.f11186c;
            if (c1498h != null) {
                str = c1498h.B0();
            } else {
                str = null;
            }
            if (str != null && str.length() != 0) {
                C1498h c1498h2 = this.f11186c;
                AbstractC3159y.f(c1498h2);
                string = c1498h2.d1("try");
                if (this.f11186c == null || string == null || string.length() == 0) {
                    string = context.getString(com.uptodown.R.string.updates_button_download_app);
                    AbstractC3159y.h(string, "context.getString(R.stri…ates_button_download_app)");
                }
            } else {
                string = context.getString(com.uptodown.R.string.updates_button_download_app);
                AbstractC3159y.h(string, "context.getString(R.stri…ates_button_download_app)");
            }
        }
        J3().f10396D.f10691f.setBackground(ContextCompat.getDrawable(requireContext(), com.uptodown.R.drawable.ripple_blue_primary_button));
        J3().f10396D.f10691f.setTextColor(ContextCompat.getColor(requireContext(), com.uptodown.R.color.white));
        TextView textView = J3().f10396D.f10691f;
        AbstractC3159y.h(textView, "binding.rlDownloadButton…ppDetail.tvStatusDownload");
        U5(textView, com.uptodown.R.color.blue_primary);
        J3().f10396D.f10690e.setVisibility(8);
        J3().f10399G.f10498e.setVisibility(0);
        J3().f10399G.f10496c.setVisibility(8);
        J3().f10396D.f10691f.setOnClickListener(new View.OnClickListener() { // from class: U4.Z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                L0.b6(L0.this, view);
            }
        });
        J3().f10396D.f10691f.setVisibility(0);
        J3().f10396D.f10691f.setText(string);
        J3().f10393A.f11010b.setVisibility(4);
        J3().f10393A.f11023o.setText(string);
        J3().f10393A.f11014f.setBackground(ContextCompat.getDrawable(context, com.uptodown.R.drawable.ripple_blue_primary_button));
        X3(com.uptodown.R.id.action_uninstall);
        X3(com.uptodown.R.id.action_app_installed_details);
    }

    private final void b3() {
        AbstractC2829k.d(i6.N.a(C2812b0.b()), null, null, new C1404l(new kotlin.jvm.internal.O(), null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b4(L0 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.e5();
    }

    private final void b5() {
        if (!requireActivity().isFinishing() && this.f11186c != null) {
            Intent intent = new Intent(requireActivity(), (Class<?>) OrganizationActivity.class);
            C1498h c1498h = this.f11186c;
            AbstractC3159y.f(c1498h);
            intent.putExtra("organizationID", c1498h.x0());
            C1498h c1498h2 = this.f11186c;
            AbstractC3159y.f(c1498h2);
            intent.putExtra("organizationName", c1498h2.k());
            UptodownApp.a aVar = UptodownApp.f27990B;
            FragmentActivity requireActivity = requireActivity();
            AbstractC3159y.h(requireActivity, "requireActivity()");
            startActivity(intent, aVar.a(requireActivity));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b6(L0 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        Context requireContext = this$0.requireContext();
        AbstractC3159y.h(requireContext, "requireContext()");
        this$0.z3(requireContext);
    }

    private final void c3(C1505o c1505o) {
        if (getActivity() != null && !requireActivity().isFinishing() && this.f11186c != null) {
            Q.b bVar = X4.Q.f12424k;
            FragmentActivity requireActivity = requireActivity();
            AbstractC3159y.h(requireActivity, "requireActivity()");
            X4.Q e8 = bVar.e(requireActivity);
            if (e8 != null && e8.G()) {
                C1498h c1498h = this.f11186c;
                AbstractC3159y.f(c1498h);
                if (c1498h.O0() == null) {
                    FragmentActivity requireActivity2 = requireActivity();
                    AbstractC3159y.h(requireActivity2, "requireActivity()");
                    C1498h c1498h2 = this.f11186c;
                    AbstractC3159y.f(c1498h2);
                    String valueOf = String.valueOf(c1498h2.f0());
                    C1498h c1498h3 = this.f11186c;
                    AbstractC3159y.f(c1498h3);
                    new S4.m(requireActivity2, valueOf, c1498h3.S0(), new C1405m(c1505o), LifecycleOwnerKt.getLifecycleScope(this));
                    return;
                }
                C1498h c1498h4 = this.f11186c;
                AbstractC3159y.f(c1498h4);
                X4.H O02 = c1498h4.O0();
                AbstractC3159y.f(O02);
                if (O02.f() > 0) {
                    FragmentActivity activity = getActivity();
                    AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
                    C1498h c1498h5 = this.f11186c;
                    AbstractC3159y.f(c1498h5);
                    ((AbstractActivityC2489a) activity).k2(c1498h5, new C1406n(c1505o), new C1407o());
                    return;
                }
                A3(c1505o);
                return;
            }
            A3(c1505o);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c4(L0 this$0, Context context, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(context, "$context");
        this$0.q3(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c5(long j8) {
        if (getActivity() != null && (getActivity() instanceof MainActivity)) {
            FragmentActivity activity = getActivity();
            AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
            ((MainActivity) activity).G2(j8);
        } else if (getActivity() != null && (getActivity() instanceof AppDetailActivity)) {
            FragmentActivity activity2 = getActivity();
            AbstractC3159y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.AppDetailActivity");
            ((AppDetailActivity) activity2).G2(j8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c6(C1505o c1505o) {
        C1505o c1505o2;
        I6();
        C3475c c3475c = C3475c.f36184a;
        ProgressBar progressBar = J3().f10399G.f10501h;
        AbstractC3159y.h(progressBar, "binding.rlMainInfoAppDetail.pbProgressAppDetail");
        ImageView imageView = J3().f10399G.f10495b;
        AbstractC3159y.h(imageView, "binding.rlMainInfoAppDetail.ivLogoAppDetail");
        c3475c.e(progressBar, imageView);
        J3().f10396D.f10691f.setBackground(ContextCompat.getDrawable(requireContext(), com.uptodown.R.drawable.ripple_open_button));
        J3().f10396D.f10691f.setTextColor(ContextCompat.getColor(requireContext(), com.uptodown.R.color.blue_primary));
        TextView textView = J3().f10396D.f10691f;
        AbstractC3159y.h(textView, "binding.rlDownloadButton…ppDetail.tvStatusDownload");
        U5(textView, com.uptodown.R.color.blue_primary);
        J3().f10396D.f10691f.setText(getString(com.uptodown.R.string.option_button_cancel));
        J3().f10393A.f11011c.setVisibility(8);
        this.f11203t = 5;
        if (c1505o == null && getContext() != null && this.f11186c != null) {
            C3326n.a aVar = C3326n.f34490t;
            Context requireContext = requireContext();
            AbstractC3159y.h(requireContext, "requireContext()");
            C3326n a8 = aVar.a(requireContext);
            a8.a();
            C1498h c1498h = this.f11186c;
            AbstractC3159y.f(c1498h);
            c1505o2 = a8.Z(String.valueOf(c1498h.f0()));
            a8.g();
        } else {
            c1505o2 = c1505o;
        }
        Long l8 = null;
        if (c1505o2 != null) {
            J3().f10396D.f10691f.setOnClickListener(new View.OnClickListener() { // from class: U4.b0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    L0.d6(L0.this, view);
                }
            });
            J3().f10393A.f11010b.setVisibility(0);
            if (!C4()) {
                J3().f10399G.f10514u.setText(getString(com.uptodown.R.string.status_download_update_pending));
                J3().f10399G.f10501h.setIndeterminate(true);
                J3().f10393A.f11013e.setIndeterminate(true);
                J3().f10393A.f11018j.setVisibility(0);
                J3().f10393A.f11020l.setVisibility(8);
            } else {
                String valueOf = String.valueOf(c1505o2.Z());
                if (isAdded() && getContext() != null) {
                    valueOf = valueOf + requireContext().getString(com.uptodown.R.string.percent);
                }
                C3319g c3319g = new C3319g();
                C1498h c1498h2 = this.f11186c;
                AbstractC3159y.f(c1498h2);
                if (c3319g.r(c1498h2.y0(), getContext())) {
                    J3().f10396D.f10690e.setTextColor(ContextCompat.getColor(requireContext(), com.uptodown.R.color.white));
                } else {
                    J3().f10396D.f10690e.setTextColor(ContextCompat.getColor(requireContext(), com.uptodown.R.color.main_light_grey));
                }
                J3().f10399G.f10501h.setIndeterminate(false);
                J3().f10399G.f10501h.setProgress(c1505o2.Z());
                if (c1505o != null) {
                    l8 = Long.valueOf(c1505o.a0());
                }
                if (l8 != null) {
                    J3().f10399G.f10514u.setText(getString(com.uptodown.R.string.percent_of_total_size, Integer.valueOf(c1505o2.Z()), new N4.g().c(c1505o.a0())));
                }
                J3().f10393A.f11013e.setIndeterminate(false);
                J3().f10393A.f11020l.setVisibility(0);
                J3().f10393A.f11018j.setVisibility(8);
                J3().f10393A.f11020l.setText(valueOf);
                J3().f10393A.f11021m.setText(new N4.g().c(c1505o2.o()));
                J3().f10393A.f11013e.setProgress(c1505o2.Z());
            }
            TextView textView2 = J3().f10393A.f11022n;
            kotlin.jvm.internal.Y y8 = kotlin.jvm.internal.Y.f33752a;
            String format = String.format("/%s", Arrays.copyOf(new Object[]{new N4.g().c(c1505o2.a0())}, 1));
            AbstractC3159y.h(format, "format(...)");
            textView2.setText(format);
            return;
        }
        J3().f10399G.f10501h.setIndeterminate(true);
        J3().f10393A.f11013e.setIndeterminate(true);
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.b(), null, new h0(null), 2, null);
    }

    private final void d3() {
        FragmentActivity activity = getActivity();
        AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
        AlertDialog s22 = ((AbstractActivityC2489a) activity).s2();
        if (s22 != null) {
            s22.dismiss();
        }
        if (C4()) {
            DownloadWorker.f30005c.f();
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        T4.r c8 = T4.r.c(getLayoutInflater());
        AbstractC3159y.h(c8, "inflate(layoutInflater)");
        if (getActivity() != null && !requireActivity().isFinishing()) {
            TextView textView = c8.f10808d;
            j.a aVar = E4.j.f2272g;
            textView.setTypeface(aVar.u());
            c8.f10808d.setText(requireContext().getString(com.uptodown.R.string.download_cancel_confimation_title));
            c8.f10807c.setTypeface(aVar.u());
            c8.f10807c.setText(requireContext().getString(com.uptodown.R.string.dialog_confirmation_verify_negative));
            c8.f10807c.setOnClickListener(new View.OnClickListener() { // from class: U4.D0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    L0.e3(L0.this, view);
                }
            });
            c8.f10809e.setTypeface(aVar.u());
            c8.f10809e.setText(requireContext().getString(com.uptodown.R.string.dialog_confirmation_verify_afirmative));
            c8.f10809e.setOnClickListener(new View.OnClickListener() { // from class: U4.E0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    L0.f3(L0.this, view);
                }
            });
        }
        builder.setView(c8.getRoot());
        builder.setCancelable(false);
        y6(builder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d4(L0 this$0, Context context, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(context, "$context");
        this$0.q3(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d5(C1498h c1498h) {
        if (getActivity() != null && (getActivity() instanceof MainActivity)) {
            FragmentActivity activity = getActivity();
            AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
            ((MainActivity) activity).G2(c1498h.i());
        } else if (getActivity() != null && (getActivity() instanceof AppDetailActivity)) {
            FragmentActivity activity2 = getActivity();
            AbstractC3159y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.AppDetailActivity");
            ((AppDetailActivity) activity2).G2(c1498h.i());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d6(L0 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.d3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e3(L0 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        DownloadWorker.f30005c.h();
        FragmentActivity activity = this$0.getActivity();
        AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
        AlertDialog s22 = ((AbstractActivityC2489a) activity).s2();
        if (s22 != null) {
            s22.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e4(L0 this$0, Context context, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(context, "$context");
        this$0.q3(context);
    }

    private final void e5() {
        if (!requireActivity().isFinishing() && this.f11186c != null) {
            Intent intent = new Intent(requireActivity(), (Class<?>) ReviewsActivity.class);
            intent.putExtra("appInfo", this.f11186c);
            intent.putExtra("myReview", this.f11208y);
            UptodownApp.a aVar = UptodownApp.f27990B;
            FragmentActivity requireActivity = requireActivity();
            AbstractC3159y.h(requireActivity, "requireActivity()");
            startActivity(intent, aVar.a(requireActivity));
        }
    }

    private final void e6() {
        this.f11203t = 5;
        long S32 = S3();
        C3329q c3329q = new C3329q();
        Context requireContext = requireContext();
        AbstractC3159y.h(requireContext, "requireContext()");
        File f8 = c3329q.f(requireContext);
        if (!f8.exists() && !f8.mkdirs()) {
            String string = getString(com.uptodown.R.string.error_cant_create_dir);
            AbstractC3159y.h(string, "getString(R.string.error_cant_create_dir)");
            m3(string);
            return;
        }
        if (!W3()) {
            Context requireContext2 = requireContext();
            AbstractC3159y.h(requireContext2, "requireContext()");
            i6(requireContext2, null);
            String string2 = getString(com.uptodown.R.string.error_not_enough_space);
            AbstractC3159y.h(string2, "getString(R.string.error_not_enough_space)");
            m3(string2);
            return;
        }
        C3323k c3323k = new C3323k();
        AlertDialog alertDialog = this.f11196m;
        FragmentActivity requireActivity = requireActivity();
        AbstractC3159y.h(requireActivity, "requireActivity()");
        this.f11196m = c3323k.g(alertDialog, requireActivity);
        J3().f10399G.f10514u.setVisibility(0);
        J3().f10399G.f10514u.setText(getString(com.uptodown.R.string.status_download_update_pending));
        J3().f10399G.f10501h.setProgress(0);
        J3().f10393A.f11018j.setVisibility(0);
        J3().f10393A.f11020l.setVisibility(8);
        J3().f10393A.f11021m.setText(com.uptodown.R.string.zero_mb);
        TextView textView = J3().f10393A.f11022n;
        kotlin.jvm.internal.Y y8 = kotlin.jvm.internal.Y.f33752a;
        String format = String.format("/%s", Arrays.copyOf(new Object[]{new N4.g().c(S32)}, 1));
        AbstractC3159y.h(format, "format(...)");
        textView.setText(format);
        J3().f10393A.f11013e.setProgress(0);
        if (this.f11196m == null) {
            c6(null);
            M5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f3(L0 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        Context requireContext = this$0.requireContext();
        AbstractC3159y.h(requireContext, "requireContext()");
        this$0.O2(requireContext);
        FragmentActivity activity = this$0.getActivity();
        AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
        AlertDialog s22 = ((AbstractActivityC2489a) activity).s2();
        if (s22 != null) {
            s22.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f4(L0 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.Z4();
    }

    private final void f5() {
        Intent intent = new Intent(getContext(), (Class<?>) SearchActivity.class);
        intent.setFlags(603979776);
        UptodownApp.a aVar = UptodownApp.f27990B;
        FragmentActivity requireActivity = requireActivity();
        AbstractC3159y.h(requireActivity, "requireActivity()");
        startActivity(intent, aVar.a(requireActivity));
        C3330r c3330r = this.f11209z;
        if (c3330r != null) {
            c3330r.b("search_from_app_details", new Bundle());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f6(String str) {
        Y3();
        J3().f10399G.f10514u.setText(str);
        J3().f10393A.f11021m.setText(str);
    }

    private final void g3(final C1505o c1505o, String str) {
        FragmentActivity activity = getActivity();
        AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
        AlertDialog s22 = ((AbstractActivityC2489a) activity).s2();
        if (s22 != null) {
            s22.dismiss();
        }
        if (getContext() != null) {
            final T4.r c8 = T4.r.c(getLayoutInflater());
            AbstractC3159y.h(c8, "inflate(layoutInflater)");
            TextView textView = c8.f10808d;
            j.a aVar = E4.j.f2272g;
            textView.setTypeface(aVar.u());
            c8.f10808d.setText(str);
            c8.f10806b.setVisibility(0);
            c8.f10806b.setTypeface(aVar.u());
            c8.f10806b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: U4.g0
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z8) {
                    L0.h3(L0.this, compoundButton, z8);
                }
            });
            c8.f10809e.setTypeface(aVar.t());
            c8.f10809e.setOnClickListener(new View.OnClickListener() { // from class: U4.r0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    L0.i3(L0.this, c1505o, view);
                }
            });
            c8.f10807c.setTypeface(aVar.t());
            c8.f10807c.setOnClickListener(new View.OnClickListener() { // from class: U4.C0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    L0.j3(T4.r.this, this, view);
                }
            });
            AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
            builder.setView(c8.getRoot());
            builder.setCancelable(false);
            y6(builder);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g4(L0 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.a5();
    }

    private final void g5(String str) {
        Intent intent = new Intent(requireContext(), (Class<?>) UserCommentsActivity.class);
        intent.putExtra("userID", str);
        UptodownApp.a aVar = UptodownApp.f27990B;
        FragmentActivity requireActivity = requireActivity();
        AbstractC3159y.h(requireActivity, "requireActivity()");
        startActivity(intent, aVar.a(requireActivity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g6(Context context) {
        H6();
        C3475c c3475c = C3475c.f36184a;
        ProgressBar progressBar = J3().f10399G.f10501h;
        AbstractC3159y.h(progressBar, "binding.rlMainInfoAppDetail.pbProgressAppDetail");
        ImageView imageView = J3().f10399G.f10495b;
        AbstractC3159y.h(imageView, "binding.rlMainInfoAppDetail.ivLogoAppDetail");
        c3475c.c(progressBar, imageView);
        J3().f10399G.f10498e.setVisibility(0);
        J3().f10399G.f10496c.setVisibility(8);
        J3().f10396D.f10691f.setOnClickListener(new View.OnClickListener() { // from class: U4.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                L0.h6(L0.this, view);
            }
        });
        this.f11203t = 3;
        J3().f10396D.f10691f.setText(getString(com.uptodown.R.string.option_button_install));
        J3().f10396D.f10691f.setBackground(ContextCompat.getDrawable(context, com.uptodown.R.drawable.ripple_install_button));
        J3().f10396D.f10691f.setTextColor(ContextCompat.getColor(requireContext(), com.uptodown.R.color.white));
        TextView textView = J3().f10396D.f10691f;
        AbstractC3159y.h(textView, "binding.rlDownloadButton…ppDetail.tvStatusDownload");
        U5(textView, com.uptodown.R.color.accent_green);
        J3().f10393A.f11023o.setText(getString(com.uptodown.R.string.option_button_install));
        J3().f10393A.f11014f.setBackground(ContextCompat.getDrawable(context, com.uptodown.R.drawable.ripple_install_button));
        X3(com.uptodown.R.id.action_app_installed_details);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h3(L0 this$0, CompoundButton compoundButton, boolean z8) {
        AbstractC3159y.i(this$0, "this$0");
        SettingsPreferences.a aVar = SettingsPreferences.f29309b;
        Context requireContext = this$0.requireContext();
        AbstractC3159y.h(requireContext, "requireContext()");
        aVar.a1(requireContext, !z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h4(L0 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.R4();
    }

    private final void h5() {
        if (getActivity() != null && !requireActivity().isFinishing() && this.f11186c != null) {
            FragmentActivity requireActivity = requireActivity();
            AbstractC3159y.h(requireActivity, "requireActivity()");
            C1498h c1498h = this.f11186c;
            AbstractC3159y.f(c1498h);
            String valueOf = String.valueOf(c1498h.f0());
            C1498h c1498h2 = this.f11186c;
            AbstractC3159y.f(c1498h2);
            new S4.m(requireActivity, valueOf, c1498h2.S0(), new S(), LifecycleOwnerKt.getLifecycleScope(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h6(L0 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        Context requireContext = this$0.requireContext();
        AbstractC3159y.h(requireContext, "requireContext()");
        this$0.z3(requireContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i3(L0 this$0, C1505o download, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(download, "$download");
        this$0.A3(download);
        FragmentActivity activity = this$0.getActivity();
        AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
        AlertDialog s22 = ((AbstractActivityC2489a) activity).s2();
        if (s22 != null) {
            s22.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i4(L0 this$0) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.f11189f = this$0.J3().f10451t.f10710i.getMeasuredWidth();
        if (this$0.f11188e) {
            this$0.T6();
        }
    }

    private final View i5(X4.F f8, LinearLayout.LayoutParams layoutParams) {
        C1375i c8 = C1375i.c(getLayoutInflater());
        AbstractC3159y.h(c8, "inflate(layoutInflater)");
        c8.getRoot().setLayoutParams(layoutParams);
        TextView textView = c8.f10678c;
        j.a aVar = E4.j.f2272g;
        textView.setTypeface(aVar.u());
        c8.f10679d.setTypeface(aVar.t());
        c8.f10678c.setText(f8.b());
        c8.f10679d.setText(f8.f());
        c8.getRoot().setTag(f8.i());
        c8.getRoot().setOnClickListener(new View.OnClickListener() { // from class: U4.X
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                L0.j5(L0.this, view);
            }
        });
        if (getContext() != null && f8.c() != null) {
            com.squareup.picasso.w l8 = com.squareup.picasso.s.h().l(f8.e());
            UptodownApp.a aVar2 = UptodownApp.f27990B;
            FragmentActivity requireActivity = requireActivity();
            AbstractC3159y.h(requireActivity, "requireActivity()");
            l8.n(aVar2.f0(requireActivity)).i(c8.f10677b);
        }
        c8.getRoot().setFocusable(true);
        RelativeLayout root = c8.getRoot();
        AbstractC3159y.h(root, "articleBinding.root");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i6(Context context, C1505o c1505o) {
        J3().f10454w.getRoot().setVisibility(0);
        if (c1505o != null && c1505o.Z() == 100) {
            g6(context);
        } else {
            a6(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j3(T4.r dialogBinding, L0 this$0, View view) {
        AbstractC3159y.i(dialogBinding, "$dialogBinding");
        AbstractC3159y.i(this$0, "this$0");
        if (dialogBinding.f10806b.isChecked()) {
            SettingsPreferences.a aVar = SettingsPreferences.f29309b;
            Context requireContext = this$0.requireContext();
            AbstractC3159y.h(requireContext, "requireContext()");
            aVar.a1(requireContext, true);
        }
        Context requireContext2 = this$0.requireContext();
        AbstractC3159y.h(requireContext2, "requireContext()");
        this$0.a6(requireContext2);
        FragmentActivity activity = this$0.getActivity();
        AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
        AlertDialog s22 = ((AbstractActivityC2489a) activity).s2();
        if (s22 != null) {
            s22.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j4(L0 this$0, Context context, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(context, "$context");
        this$0.f11200q = 1;
        this$0.q3(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j5(L0 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(view, "view");
        try {
            if (this$0.getActivity() != null && !this$0.requireActivity().isFinishing()) {
                Object tag = view.getTag();
                AbstractC3159y.g(tag, "null cannot be cast to non-null type kotlin.String");
                C3323k c3323k = new C3323k();
                FragmentActivity requireActivity = this$0.requireActivity();
                AbstractC3159y.h(requireActivity, "requireActivity()");
                C3323k.r(c3323k, requireActivity, (String) tag, null, 4, null);
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j6(Context context) {
        J6();
        C3475c c3475c = C3475c.f36184a;
        ProgressBar progressBar = J3().f10399G.f10501h;
        AbstractC3159y.h(progressBar, "binding.rlMainInfoAppDetail.pbProgressAppDetail");
        ImageView imageView = J3().f10399G.f10495b;
        AbstractC3159y.h(imageView, "binding.rlMainInfoAppDetail.ivLogoAppDetail");
        c3475c.c(progressBar, imageView);
        this.f11203t = 0;
        J3().f10396D.f10690e.setBackground(ContextCompat.getDrawable(context, com.uptodown.R.drawable.ripple_blue_primary_button));
        J3().f10396D.f10690e.setTextColor(ContextCompat.getColor(context, com.uptodown.R.color.white));
        J3().f10396D.f10690e.setEnabled(true);
        C1498h c1498h = this.f11186c;
        AbstractC3159y.f(c1498h);
        C1501k n8 = c1498h.n();
        AbstractC3159y.f(n8);
        if (n8.o() == 1) {
            J3().f10396D.f10690e.setText(context.getString(com.uptodown.R.string.app_detail_play_button));
            J3().f10393A.f11019k.setText(context.getString(com.uptodown.R.string.app_detail_play_button));
        }
        D6(com.uptodown.R.id.action_uninstall);
        D6(com.uptodown.R.id.action_app_installed_details);
        C1498h c1498h2 = this.f11186c;
        if (c1498h2 != null) {
            AbstractC3159y.f(c1498h2);
            if (c1498h2.y0() != null) {
                String packageName = requireActivity().getPackageName();
                C1498h c1498h3 = this.f11186c;
                AbstractC3159y.f(c1498h3);
                if (g6.n.s(packageName, c1498h3.y0(), true)) {
                    J3().f10396D.f10690e.setVisibility(8);
                    J3().f10396D.f10687b.setVisibility(8);
                    J3().f10396D.f10688c.setVisibility(8);
                    J3().f10393A.f11019k.setVisibility(8);
                    C1498h c1498h4 = this.f11186c;
                    AbstractC3159y.f(c1498h4);
                    if (625 < c1498h4.o0()) {
                        if (this.f11192i) {
                            r6(context);
                            return;
                        }
                        String packageName2 = requireActivity().getPackageName();
                        AbstractC3159y.h(packageName2, "requireActivity().packageName");
                        this.f11191h = new X4.O(packageName2);
                        u6(context);
                    }
                }
            }
        }
    }

    private final void k3() {
        FragmentActivity activity = getActivity();
        AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
        AlertDialog s22 = ((AbstractActivityC2489a) activity).s2();
        if (s22 != null) {
            s22.dismiss();
        }
        if (getActivity() != null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(requireActivity());
            C1384q c8 = C1384q.c(getLayoutInflater());
            AbstractC3159y.h(c8, "inflate(layoutInflater)");
            FragmentActivity requireActivity = requireActivity();
            AbstractC3159y.h(requireActivity, "requireActivity()");
            ArrayList arrayList = this.f11197n;
            AbstractC3159y.f(arrayList);
            c8.f10798b.setAdapter(new C1094c(requireActivity, arrayList, this.f11195l, new C1408p()));
            c8.f10798b.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
            c8.f10799c.setTypeface(E4.j.f2272g.t());
            c8.f10799c.setOnClickListener(new View.OnClickListener() { // from class: U4.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    L0.l3(L0.this, view);
                }
            });
            builder.setView(c8.getRoot());
            builder.setCancelable(true);
            y6(builder);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k4(L0 this$0, Context context, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(context, "$context");
        this$0.f11200q = 2;
        this$0.q3(context);
    }

    private final View k5(LinearLayout.LayoutParams layoutParams) {
        C1375i c8 = C1375i.c(getLayoutInflater());
        AbstractC3159y.h(c8, "inflate(layoutInflater)");
        c8.getRoot().setLayoutParams(layoutParams);
        c8.getRoot().setVisibility(4);
        RelativeLayout root = c8.getRoot();
        AbstractC3159y.h(root, "articleBinding.root");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k6(C1505o c1505o) {
        c6(c1505o);
        J3().f10396D.f10691f.setOnClickListener(new View.OnClickListener() { // from class: U4.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                L0.l6(L0.this, view);
            }
        });
        J3().f10396D.f10691f.setBackground(ContextCompat.getDrawable(requireContext(), com.uptodown.R.drawable.ripple_blue_primary_button));
        TextView textView = J3().f10396D.f10691f;
        AbstractC3159y.h(textView, "binding.rlDownloadButton…ppDetail.tvStatusDownload");
        U5(textView, com.uptodown.R.color.blue_primary);
        J3().f10396D.f10691f.setTextColor(ContextCompat.getColor(requireContext(), com.uptodown.R.color.white));
        J3().f10396D.f10691f.setVisibility(0);
        J3().f10396D.f10691f.setText(getString(com.uptodown.R.string.updates_button_resume));
        J3().f10393A.f11010b.setVisibility(8);
        J3().f10393A.f11011c.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l3(L0 this$0, View view) {
        ArrayList arrayList;
        boolean z8;
        AbstractC3159y.i(this$0, "this$0");
        int i8 = this$0.f11195l;
        if (i8 >= 0 && (arrayList = this$0.f11197n) != null) {
            AbstractC3159y.f(arrayList);
            if (i8 < arrayList.size()) {
                SettingsPreferences.a aVar = SettingsPreferences.f29309b;
                Context requireContext = this$0.requireContext();
                AbstractC3159y.h(requireContext, "requireContext()");
                if (this$0.f11195l > 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                aVar.W0(requireContext, z8);
                FragmentActivity activity = this$0.getActivity();
                AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
                AlertDialog s22 = ((AbstractActivityC2489a) activity).s2();
                if (s22 != null) {
                    s22.dismiss();
                }
                this$0.e6();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l4(L0 this$0, MenuItem item) {
        FragmentActivity activity;
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(item, "item");
        if (UptodownApp.f27990B.a0()) {
            if (item.getItemId() == com.uptodown.R.id.action_search) {
                this$0.f5();
                return true;
            }
            if (item.getItemId() == com.uptodown.R.id.action_share) {
                this$0.v6();
                return true;
            }
            if (item.getItemId() == com.uptodown.R.id.action_antivirus_report) {
                this$0.h5();
                return true;
            }
            if (item.getItemId() == com.uptodown.R.id.action_uninstall) {
                C1498h c1498h = this$0.f11186c;
                if (c1498h != null) {
                    AbstractC3159y.f(c1498h);
                    if (c1498h.y0() != null && (activity = this$0.getActivity()) != null) {
                        E4.i iVar = new E4.i(activity);
                        C1498h c1498h2 = this$0.f11186c;
                        AbstractC3159y.f(c1498h2);
                        String y02 = c1498h2.y0();
                        AbstractC3159y.f(y02);
                        iVar.h(y02);
                        return true;
                    }
                    return true;
                }
                return true;
            }
            if (item.getItemId() == com.uptodown.R.id.action_wishlist) {
                this$0.B2();
                return true;
            }
            if (item.getItemId() == com.uptodown.R.id.action_exclude) {
                this$0.A2();
                return true;
            }
            if (item.getItemId() == com.uptodown.R.id.action_app_details_settings) {
                this$0.O4();
                return true;
            }
            if (item.getItemId() == com.uptodown.R.id.action_app_installed_details) {
                this$0.P4();
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l5() {
        C1498h c1498h;
        if (getActivity() != null && !requireActivity().isFinishing() && (c1498h = this.f11186c) != null) {
            AbstractC3159y.f(c1498h);
            if (c1498h.N0() != null) {
                C1498h c1498h2 = this.f11186c;
                AbstractC3159y.f(c1498h2);
                ArrayList N02 = c1498h2.N0();
                AbstractC3159y.f(N02);
                if (N02.size() > 0) {
                    int dimension = (int) getResources().getDimension(com.uptodown.R.dimen.margin_m);
                    int dimension2 = (int) getResources().getDimension(com.uptodown.R.dimen.feature_card_width);
                    TextView textView = J3().f10410R;
                    C1498h c1498h3 = this.f11186c;
                    AbstractC3159y.f(c1498h3);
                    textView.setText(getString(com.uptodown.R.string.app_related_articles, c1498h3.s0()));
                    int dimension3 = (int) getResources().getDimension(com.uptodown.R.dimen.margin_l);
                    if (g6.n.s(getString(com.uptodown.R.string.screen_type), HintConstants.AUTOFILL_HINT_PHONE, true)) {
                        C1498h c1498h4 = this.f11186c;
                        AbstractC3159y.f(c1498h4);
                        ArrayList N03 = c1498h4.N0();
                        AbstractC3159y.f(N03);
                        if (N03.size() == 1) {
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dimension2, -2);
                            layoutParams.setMargins(dimension, dimension, dimension, dimension3);
                            LinearLayout linearLayout = J3().f10445n;
                            C1498h c1498h5 = this.f11186c;
                            AbstractC3159y.f(c1498h5);
                            ArrayList N04 = c1498h5.N0();
                            AbstractC3159y.f(N04);
                            linearLayout.addView(i5((X4.F) AbstractC1246t.m0(N04), layoutParams));
                            return;
                        }
                        C1498h c1498h6 = this.f11186c;
                        AbstractC3159y.f(c1498h6);
                        ArrayList N05 = c1498h6.N0();
                        AbstractC3159y.f(N05);
                        int size = N05.size();
                        for (int i8 = 0; i8 < size; i8++) {
                            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(dimension2, -2);
                            C1498h c1498h7 = this.f11186c;
                            AbstractC3159y.f(c1498h7);
                            ArrayList N06 = c1498h7.N0();
                            AbstractC3159y.f(N06);
                            if (i8 == AbstractC1246t.o(N06)) {
                                layoutParams2.setMargins(0, dimension, dimension, dimension3);
                            } else {
                                layoutParams2.setMargins(dimension, dimension, dimension, dimension);
                            }
                            LinearLayout linearLayout2 = J3().f10445n;
                            C1498h c1498h8 = this.f11186c;
                            AbstractC3159y.f(c1498h8);
                            ArrayList N07 = c1498h8.N0();
                            AbstractC3159y.f(N07);
                            Object obj = N07.get(i8);
                            AbstractC3159y.h(obj, "appInfo!!.relatedPosts!![i]");
                            linearLayout2.addView(i5((X4.F) obj, layoutParams2));
                        }
                        return;
                    }
                    int i9 = 0;
                    while (true) {
                        C1498h c1498h9 = this.f11186c;
                        AbstractC3159y.f(c1498h9);
                        ArrayList N08 = c1498h9.N0();
                        AbstractC3159y.f(N08);
                        if (i9 < N08.size()) {
                            LinearLayout linearLayout3 = new LinearLayout(requireActivity());
                            linearLayout3.setOrientation(0);
                            linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                            layoutParams3.setMargins(dimension, dimension, dimension, dimension);
                            layoutParams3.weight = 1.0f;
                            C1498h c1498h10 = this.f11186c;
                            AbstractC3159y.f(c1498h10);
                            ArrayList N09 = c1498h10.N0();
                            AbstractC3159y.f(N09);
                            Object obj2 = N09.get(i9);
                            AbstractC3159y.h(obj2, "appInfo!!.relatedPosts!![i]");
                            linearLayout3.addView(i5((X4.F) obj2, layoutParams3));
                            int i10 = i9 + 1;
                            C1498h c1498h11 = this.f11186c;
                            AbstractC3159y.f(c1498h11);
                            ArrayList N010 = c1498h11.N0();
                            AbstractC3159y.f(N010);
                            if (i10 < N010.size()) {
                                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
                                layoutParams4.setMargins(dimension, dimension, dimension, dimension);
                                layoutParams4.weight = 1.0f;
                                C1498h c1498h12 = this.f11186c;
                                AbstractC3159y.f(c1498h12);
                                ArrayList N011 = c1498h12.N0();
                                AbstractC3159y.f(N011);
                                Object obj3 = N011.get(i10);
                                AbstractC3159y.h(obj3, "appInfo!!.relatedPosts!![i + 1]");
                                linearLayout3.addView(i5((X4.F) obj3, layoutParams4));
                            } else {
                                linearLayout3.addView(k5(layoutParams3));
                            }
                            J3().f10445n.addView(linearLayout3);
                            i9 += 2;
                        } else {
                            return;
                        }
                    }
                }
            }
        }
        J3().f10443m.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l6(L0 this$0, View view) {
        Object obj;
        AbstractC3159y.i(this$0, "this$0");
        DownloadApkWorker.a aVar = DownloadApkWorker.f29987k;
        C1498h c1498h = this$0.f11186c;
        AbstractC3159y.f(c1498h);
        long i8 = c1498h.i();
        C1498h c1498h2 = this$0.f11186c;
        AbstractC3159y.f(c1498h2);
        if (aVar.d(i8, c1498h2.o0())) {
            DownloadWorker.a aVar2 = DownloadWorker.f30005c;
            if (aVar2.c()) {
                aVar2.h();
                return;
            }
        }
        Iterator it = UptodownApp.f27990B.F().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                String n8 = ((X4.O) obj).n();
                C1498h c1498h3 = this$0.f11186c;
                AbstractC3159y.f(c1498h3);
                if (AbstractC3159y.d(n8, c1498h3.y0())) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (obj != null) {
            DownloadWorker.a aVar3 = DownloadWorker.f30005c;
            if (aVar3.d()) {
                aVar3.i();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m3(String str) {
        if (getActivity() != null && !requireActivity().isFinishing()) {
            FragmentActivity activity = getActivity();
            AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
            AlertDialog s22 = ((AbstractActivityC2489a) activity).s2();
            if (s22 != null) {
                s22.dismiss();
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
            T4.r c8 = T4.r.c(getLayoutInflater());
            AbstractC3159y.h(c8, "inflate(layoutInflater)");
            TextView textView = c8.f10808d;
            j.a aVar = E4.j.f2272g;
            textView.setTypeface(aVar.u());
            c8.f10808d.setText(str);
            c8.f10807c.setVisibility(8);
            c8.f10809e.setTypeface(aVar.u());
            c8.f10809e.setOnClickListener(new View.OnClickListener() { // from class: U4.a0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    L0.n3(L0.this, view);
                }
            });
            builder.setView(c8.getRoot());
            builder.setCancelable(false);
            y6(builder);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m4(L0 this$0, Context context, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(context, "$context");
        this$0.f11200q = 3;
        this$0.q3(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x066d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void m5(android.content.Context r14) {
        /*
            Method dump skipped, instructions count: 1720
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: U4.L0.m5(android.content.Context):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m6() {
        K6();
        Q.b bVar = X4.Q.f12424k;
        Context requireContext = requireContext();
        AbstractC3159y.h(requireContext, "requireContext()");
        if (bVar.e(requireContext) == null) {
            J3().f10396D.f10691f.setText(getString(com.uptodown.R.string.pre_registration_title));
            J3().f10393A.f11024p.setText(getString(com.uptodown.R.string.pre_registration_title));
            J3().f10393A.f11012d.setVisibility(0);
            TextView textView = J3().f10396D.f10691f;
            AbstractC3159y.h(textView, "binding.rlDownloadButton…ppDetail.tvStatusDownload");
            V4(textView);
            RelativeLayout relativeLayout = J3().f10393A.f11017i;
            AbstractC3159y.h(relativeLayout, "binding.rlBottomDownload…etail.rlStatusPreRegister");
            V4(relativeLayout);
        } else {
            b3();
        }
        J3().f10399G.f10498e.setVisibility(0);
        J3().f10399G.f10496c.setVisibility(8);
        J3().f10399G.f10508o.setVisibility(8);
        J3().f10396D.f10687b.setVisibility(8);
        X3(com.uptodown.R.id.action_antivirus_report);
        X3(com.uptodown.R.id.action_uninstall);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n3(L0 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        if (this$0.getActivity() != null && !this$0.requireActivity().isFinishing()) {
            FragmentActivity activity = this$0.getActivity();
            AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
            AlertDialog s22 = ((AbstractActivityC2489a) activity).s2();
            if (s22 != null) {
                s22.dismiss();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n4(L0 this$0, Context context, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(context, "$context");
        this$0.f11200q = 4;
        this$0.q3(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n5(L0 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.e5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n6() {
        J3().f10399G.f10518y.setVisibility(8);
        J3().f10399G.f10497d.setVisibility(8);
        C1498h c1498h = this.f11186c;
        AbstractC3159y.f(c1498h);
        String M02 = c1498h.M0();
        if (M02 != null && M02.length() != 0) {
            C1498h c1498h2 = this.f11186c;
            AbstractC3159y.f(c1498h2);
            String M03 = c1498h2.M0();
            AbstractC3159y.f(M03);
            Y5(M03);
        } else {
            String string = getString(com.uptodown.R.string.app_detail_not_available);
            AbstractC3159y.h(string, "getString(R.string.app_detail_not_available)");
            Y5(string);
        }
        J3().f10396D.f10687b.setVisibility(8);
        X3(com.uptodown.R.id.action_antivirus_report);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o3() {
        FragmentActivity activity = getActivity();
        AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
        AlertDialog s22 = ((AbstractActivityC2489a) activity).s2();
        if (s22 != null) {
            s22.dismiss();
        }
        if (getContext() != null) {
            C1381n c8 = C1381n.c(getLayoutInflater());
            AbstractC3159y.h(c8, "inflate(layoutInflater)");
            TextView textView = c8.f10758d;
            j.a aVar = E4.j.f2272g;
            textView.setTypeface(aVar.t());
            c8.f10757c.setTypeface(aVar.u());
            TextView textView2 = c8.f10757c;
            C3323k c3323k = new C3323k();
            C1498h c1498h = this.f11186c;
            AbstractC3159y.f(c1498h);
            String string = getString(com.uptodown.R.string.pre_register_success, c1498h.s0());
            AbstractC3159y.h(string, "getString(R.string.pre_r…_success, appInfo!!.name)");
            C1498h c1498h2 = this.f11186c;
            AbstractC3159y.f(c1498h2);
            String s02 = c1498h2.s0();
            AbstractC3159y.f(s02);
            Context requireContext = requireContext();
            AbstractC3159y.h(requireContext, "requireContext()");
            textView2.setText(c3323k.d(string, s02, requireContext));
            c8.f10756b.setTypeface(aVar.t());
            c8.f10756b.setOnClickListener(new View.OnClickListener() { // from class: U4.G0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    L0.p3(L0.this, view);
                }
            });
            AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
            builder.setView(c8.getRoot());
            builder.setCancelable(true);
            y6(builder);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o4(L0 this$0, Context context, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(context, "$context");
        this$0.f11200q = 5;
        this$0.q3(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o5(L0 this$0) {
        AbstractC3159y.i(this$0, "this$0");
        TextView textView = this$0.J3().f10403K.f10096d;
        AbstractC3159y.h(textView, "binding.rlWhatsNew.tvWhatsNewContent");
        if (!n5.v.a(textView) && this$0.J3().f10403K.f10096d.getMaxLines() <= 6) {
            this$0.J3().f10403K.f10094b.setVisibility(8);
            this$0.J3().f10403K.f10097e.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o6(Context context) {
        H6();
        this.f11203t = 4;
        J3().f10396D.f10691f.setText(getString(com.uptodown.R.string.updates_button_resume));
        J3().f10396D.f10691f.setBackground(ContextCompat.getDrawable(context, com.uptodown.R.drawable.ripple_blue_primary_button));
        J3().f10393A.f11023o.setText(getString(com.uptodown.R.string.updates_button_resume));
        J3().f10393A.f11014f.setBackground(ContextCompat.getDrawable(context, com.uptodown.R.drawable.ripple_blue_primary_button));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p3(L0 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        FragmentActivity activity = this$0.getActivity();
        AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
        AlertDialog s22 = ((AbstractActivityC2489a) activity).s2();
        if (s22 != null) {
            s22.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p4(L0 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.e5();
    }

    private final View p5(C1507q c1507q, LinearLayout.LayoutParams layoutParams) {
        T4.A c8 = T4.A.c(getLayoutInflater());
        AbstractC3159y.h(c8, "inflate(layoutInflater)");
        c8.getRoot().setLayoutParams(layoutParams);
        TextView textView = c8.f10001c;
        j.a aVar = E4.j.f2272g;
        textView.setTypeface(aVar.t());
        c8.f10000b.setTypeface(aVar.u());
        c8.f10001c.setText(c1507q.c());
        c8.f10000b.setText(c1507q.b());
        c8.getRoot().setOnClickListener(new View.OnClickListener() { // from class: U4.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                L0.q5(view);
            }
        });
        LinearLayout root = c8.getRoot();
        AbstractC3159y.h(root, "faqBinding.root");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p6(X4.O o8) {
        boolean z8;
        boolean z9;
        I6();
        C3475c c3475c = C3475c.f36184a;
        ProgressBar progressBar = J3().f10399G.f10501h;
        AbstractC3159y.h(progressBar, "binding.rlMainInfoAppDetail.pbProgressAppDetail");
        ImageView imageView = J3().f10399G.f10495b;
        AbstractC3159y.h(imageView, "binding.rlMainInfoAppDetail.ivLogoAppDetail");
        c3475c.e(progressBar, imageView);
        this.f11203t = 5;
        if (o8 != null) {
            J3().f10399G.f10498e.setVisibility(8);
            J3().f10399G.f10496c.setVisibility(0);
            J3().f10396D.f10690e.setTextColor(ContextCompat.getColor(requireContext(), com.uptodown.R.color.white));
            J3().f10396D.f10691f.setOnClickListener(new View.OnClickListener() { // from class: U4.V
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    L0.q6(L0.this, view);
                }
            });
            J3().f10396D.f10691f.setVisibility(0);
            J3().f10396D.f10691f.setText(getString(com.uptodown.R.string.option_button_cancel));
            ProgressBar progressBar2 = J3().f10399G.f10501h;
            if (o8.o() == 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            progressBar2.setIndeterminate(z8);
            J3().f10399G.f10501h.setProgress(o8.o());
            J3().f10399G.f10514u.setText(getString(com.uptodown.R.string.percent_of_total_size, Integer.valueOf(o8.o()), new N4.g().c(o8.s())));
            J3().f10393A.f11010b.setVisibility(0);
            ProgressBar progressBar3 = J3().f10393A.f11013e;
            if (o8.o() == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            progressBar3.setIndeterminate(z9);
            J3().f10393A.f11021m.setText(new N4.g().c((o8.s() * o8.o()) / 100));
            J3().f10393A.f11013e.setProgress(o8.o());
            J3().f10393A.f11018j.setVisibility(8);
            J3().f10393A.f11020l.setVisibility(0);
            J3().f10393A.f11020l.setText(o8.o() + getString(com.uptodown.R.string.percent));
            TextView textView = J3().f10393A.f11022n;
            kotlin.jvm.internal.Y y8 = kotlin.jvm.internal.Y.f33752a;
            String format = String.format("/%s", Arrays.copyOf(new Object[]{new N4.g().c(o8.s())}, 1));
            AbstractC3159y.h(format, "format(...)");
            textView.setText(format);
            return;
        }
        J3().f10399G.f10501h.setIndeterminate(true);
        J3().f10393A.f11013e.setIndeterminate(true);
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.b(), null, new i0(null), 2, null);
    }

    private final void q3(final Context context) {
        String str;
        String str2;
        String str3;
        String str4;
        FragmentActivity activity = getActivity();
        AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
        AlertDialog s22 = ((AbstractActivityC2489a) activity).s2();
        if (s22 != null) {
            s22.dismiss();
        }
        final Drawable drawable = ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on);
        final Drawable drawable2 = ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off);
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        final C1389w c8 = C1389w.c(getLayoutInflater());
        AbstractC3159y.h(c8, "inflate(layoutInflater)");
        C1498h c1498h = this.f11186c;
        if (c1498h != null) {
            str = c1498h.m0();
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            com.squareup.picasso.s h8 = com.squareup.picasso.s.h();
            C1498h c1498h2 = this.f11186c;
            if (c1498h2 != null) {
                str4 = c1498h2.m0();
            } else {
                str4 = null;
            }
            h8.l(str4).n(UptodownApp.f27990B.f0(context)).i(c8.f10931c);
        } else {
            c8.f10931c.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_app_icon_placeholder));
        }
        TextView textView = c8.f10937i;
        j.a aVar = E4.j.f2272g;
        textView.setTypeface(aVar.t());
        TextView textView2 = c8.f10937i;
        C1498h c1498h3 = this.f11186c;
        if (c1498h3 != null) {
            str2 = c1498h3.s0();
        } else {
            str2 = null;
        }
        textView2.setText(str2);
        int i8 = this.f11200q;
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    if (i8 != 4) {
                        if (i8 != 5) {
                            c8.f10932d.setImageDrawable(drawable2);
                            c8.f10933e.setImageDrawable(drawable2);
                            c8.f10934f.setImageDrawable(drawable2);
                            c8.f10935g.setImageDrawable(drawable2);
                            c8.f10936h.setImageDrawable(drawable2);
                        } else {
                            c8.f10932d.setImageDrawable(drawable);
                            c8.f10933e.setImageDrawable(drawable);
                            c8.f10934f.setImageDrawable(drawable);
                            c8.f10935g.setImageDrawable(drawable);
                            c8.f10936h.setImageDrawable(drawable);
                        }
                    } else {
                        c8.f10932d.setImageDrawable(drawable);
                        c8.f10933e.setImageDrawable(drawable);
                        c8.f10934f.setImageDrawable(drawable);
                        c8.f10935g.setImageDrawable(drawable);
                        c8.f10936h.setImageDrawable(drawable2);
                    }
                } else {
                    c8.f10932d.setImageDrawable(drawable);
                    c8.f10933e.setImageDrawable(drawable);
                    c8.f10934f.setImageDrawable(drawable);
                    c8.f10935g.setImageDrawable(drawable2);
                    c8.f10936h.setImageDrawable(drawable2);
                }
            } else {
                c8.f10932d.setImageDrawable(drawable);
                c8.f10933e.setImageDrawable(drawable);
                c8.f10934f.setImageDrawable(drawable2);
                c8.f10935g.setImageDrawable(drawable2);
                c8.f10936h.setImageDrawable(drawable2);
            }
        } else {
            c8.f10932d.setImageDrawable(drawable);
            c8.f10933e.setImageDrawable(drawable2);
            c8.f10934f.setImageDrawable(drawable2);
            c8.f10935g.setImageDrawable(drawable2);
            c8.f10936h.setImageDrawable(drawable2);
        }
        c8.f10932d.setOnClickListener(new View.OnClickListener() { // from class: U4.u0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                L0.r3(L0.this, c8, drawable, drawable2, view);
            }
        });
        c8.f10933e.setOnClickListener(new View.OnClickListener() { // from class: U4.v0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                L0.s3(L0.this, c8, drawable, drawable2, view);
            }
        });
        c8.f10934f.setOnClickListener(new View.OnClickListener() { // from class: U4.w0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                L0.t3(L0.this, c8, drawable, drawable2, view);
            }
        });
        c8.f10935g.setOnClickListener(new View.OnClickListener() { // from class: U4.x0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                L0.u3(L0.this, c8, drawable, drawable2, view);
            }
        });
        c8.f10936h.setOnClickListener(new View.OnClickListener() { // from class: U4.y0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                L0.v3(L0.this, c8, drawable, view);
            }
        });
        c8.f10930b.setTypeface(aVar.u());
        X4.K k8 = this.f11208y;
        if (k8 != null) {
            EditText editText = c8.f10930b;
            if (k8 != null) {
                str3 = k8.o();
            } else {
                str3 = null;
            }
            editText.setText(String.valueOf(str3));
            X4.K k9 = this.f11208y;
            AbstractC3159y.f(k9);
            if (k9.n() >= 1) {
                c8.f10932d.setImageDrawable(ContextCompat.getDrawable(requireContext(), com.uptodown.R.drawable.vector_star_on));
            }
            X4.K k10 = this.f11208y;
            AbstractC3159y.f(k10);
            if (k10.n() >= 2) {
                c8.f10933e.setImageDrawable(ContextCompat.getDrawable(requireContext(), com.uptodown.R.drawable.vector_star_on));
            }
            X4.K k11 = this.f11208y;
            AbstractC3159y.f(k11);
            if (k11.n() >= 3) {
                c8.f10934f.setImageDrawable(ContextCompat.getDrawable(requireContext(), com.uptodown.R.drawable.vector_star_on));
            }
            X4.K k12 = this.f11208y;
            AbstractC3159y.f(k12);
            if (k12.n() >= 4) {
                c8.f10935g.setImageDrawable(ContextCompat.getDrawable(requireContext(), com.uptodown.R.drawable.vector_star_on));
            }
            X4.K k13 = this.f11208y;
            AbstractC3159y.f(k13);
            if (k13.n() == 5) {
                c8.f10936h.setImageDrawable(ContextCompat.getDrawable(requireContext(), com.uptodown.R.drawable.vector_star_on));
            }
        }
        c8.f10939k.setTypeface(aVar.t());
        c8.f10939k.setOnClickListener(new View.OnClickListener() { // from class: U4.z0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                L0.w3(context, this, c8, view);
            }
        });
        c8.f10938j.setTypeface(aVar.t());
        c8.f10938j.setOnClickListener(new View.OnClickListener() { // from class: U4.A0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                L0.x3(L0.this, view);
            }
        });
        builder.setView(c8.getRoot());
        FragmentActivity activity2 = getActivity();
        AbstractC3159y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
        AlertDialog s23 = ((AbstractActivityC2489a) activity2).s2();
        if (s23 != null) {
            s23.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: U4.B0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    L0.y3(L0.this, context, dialogInterface);
                }
            });
        }
        y6(builder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q4(L0 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.T4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q6(L0 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.d3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r3(L0 this$0, C1389w dialogBinding, Drawable drawable, Drawable drawable2, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(dialogBinding, "$dialogBinding");
        if (UptodownApp.f27990B.a0()) {
            this$0.f11200q = 1;
            dialogBinding.f10932d.setImageDrawable(drawable);
            dialogBinding.f10933e.setImageDrawable(drawable2);
            dialogBinding.f10934f.setImageDrawable(drawable2);
            dialogBinding.f10935g.setImageDrawable(drawable2);
            dialogBinding.f10936h.setImageDrawable(drawable2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r4(L0 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        if (UptodownApp.f27990B.a0()) {
            this$0.B2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r5() {
        try {
            C1498h c1498h = this.f11186c;
            AbstractC3159y.f(c1498h);
            ArrayList a02 = c1498h.a0();
            if (a02 != null && a02.size() > 0) {
                int dimension = (int) getResources().getDimension(com.uptodown.R.dimen.margin_m);
                int dimension2 = (int) getResources().getDimension(com.uptodown.R.dimen.margin_l);
                C1498h c1498h2 = this.f11186c;
                AbstractC3159y.f(c1498h2);
                ArrayList a03 = c1498h2.a0();
                AbstractC3159y.f(a03);
                int size = a03.size();
                for (int i8 = 0; i8 < size; i8++) {
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    C1498h c1498h3 = this.f11186c;
                    AbstractC3159y.f(c1498h3);
                    ArrayList a04 = c1498h3.a0();
                    AbstractC3159y.f(a04);
                    if (i8 == AbstractC1246t.o(a04)) {
                        layoutParams.setMargins(0, dimension, 0, dimension2);
                    } else {
                        layoutParams.setMargins(0, dimension, 0, dimension);
                    }
                    LinearLayout linearLayout = J3().f10448q;
                    C1498h c1498h4 = this.f11186c;
                    AbstractC3159y.f(c1498h4);
                    ArrayList a05 = c1498h4.a0();
                    AbstractC3159y.f(a05);
                    Object obj = a05.get(i8);
                    AbstractC3159y.h(obj, "appInfo!!.faqs!![i]");
                    linearLayout.addView(p5((C1507q) obj, layoutParams));
                }
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r6(final Context context) {
        H6();
        C3475c c3475c = C3475c.f36184a;
        ProgressBar progressBar = J3().f10399G.f10501h;
        AbstractC3159y.h(progressBar, "binding.rlMainInfoAppDetail.pbProgressAppDetail");
        ImageView imageView = J3().f10399G.f10495b;
        AbstractC3159y.h(imageView, "binding.rlMainInfoAppDetail.ivLogoAppDetail");
        c3475c.c(progressBar, imageView);
        this.f11203t = 2;
        J3().f10396D.f10691f.setText(getString(com.uptodown.R.string.updates_button_update_app));
        J3().f10396D.f10691f.setBackground(ContextCompat.getDrawable(context, com.uptodown.R.drawable.ripple_install_button));
        J3().f10396D.f10691f.setTextColor(ContextCompat.getColor(context, com.uptodown.R.color.white));
        J3().f10396D.f10691f.setOnClickListener(new View.OnClickListener() { // from class: U4.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                L0.s6(L0.this, context, view);
            }
        });
        J3().f10393A.f11023o.setText(getString(com.uptodown.R.string.updates_button_update_app));
        J3().f10393A.f11014f.setBackground(ContextCompat.getDrawable(context, com.uptodown.R.drawable.ripple_install_button));
        D6(com.uptodown.R.id.action_app_installed_details);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s3(L0 this$0, C1389w dialogBinding, Drawable drawable, Drawable drawable2, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(dialogBinding, "$dialogBinding");
        if (UptodownApp.f27990B.a0()) {
            this$0.f11200q = 2;
            dialogBinding.f10932d.setImageDrawable(drawable);
            dialogBinding.f10933e.setImageDrawable(drawable);
            dialogBinding.f10934f.setImageDrawable(drawable2);
            dialogBinding.f10935g.setImageDrawable(drawable2);
            dialogBinding.f10936h.setImageDrawable(drawable2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s4(L0 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        if (UptodownApp.f27990B.a0()) {
            this$0.h5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View s5(final C1501k c1501k, LinearLayout.LayoutParams layoutParams) {
        T4.F c8 = T4.F.c(getLayoutInflater());
        AbstractC3159y.h(c8, "inflate(layoutInflater)");
        c8.getRoot().setLayoutParams(layoutParams);
        c8.getRoot().setTypeface(E4.j.f2272g.t());
        c8.getRoot().setText(String.valueOf(c1501k.f()));
        c8.getRoot().setOnClickListener(new View.OnClickListener() { // from class: U4.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                L0.t5(L0.this, c1501k, view);
            }
        });
        TextView root = c8.getRoot();
        AbstractC3159y.h(root, "categoryItemBinding.root");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s6(L0 this$0, Context context, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(context, "$context");
        this$0.z3(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t3(L0 this$0, C1389w dialogBinding, Drawable drawable, Drawable drawable2, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(dialogBinding, "$dialogBinding");
        if (UptodownApp.f27990B.a0()) {
            this$0.f11200q = 3;
            dialogBinding.f10932d.setImageDrawable(drawable);
            dialogBinding.f10933e.setImageDrawable(drawable);
            dialogBinding.f10934f.setImageDrawable(drawable);
            dialogBinding.f10935g.setImageDrawable(drawable2);
            dialogBinding.f10936h.setImageDrawable(drawable2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t4(L0 this$0, Context context, AppBarLayout appBarLayout, int i8) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(context, "$context");
        AbstractC3159y.i(appBarLayout, "appBarLayout");
        if (Math.abs(i8) == appBarLayout.getTotalScrollRange()) {
            this$0.f11198o = true;
        } else if (i8 == 0) {
            this$0.f11198o = false;
            this$0.N6(context);
        } else {
            this$0.f11198o = false;
            this$0.M6(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t5(L0 this$0, C1501k category, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(category, "$category");
        if (UptodownApp.f27990B.a0()) {
            this$0.Q4(category);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t6(Context context) {
        H6();
        this.f11203t = 4;
        J3().f10396D.f10691f.setText(getString(com.uptodown.R.string.updates_button_resume));
        J3().f10396D.f10691f.setBackground(ContextCompat.getDrawable(context, com.uptodown.R.drawable.ripple_blue_primary_button));
        J3().f10393A.f11023o.setText(getString(com.uptodown.R.string.updates_button_resume));
        J3().f10393A.f11014f.setBackground(ContextCompat.getDrawable(context, com.uptodown.R.drawable.ripple_blue_primary_button));
        D6(com.uptodown.R.id.action_app_installed_details);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u3(L0 this$0, C1389w dialogBinding, Drawable drawable, Drawable drawable2, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(dialogBinding, "$dialogBinding");
        if (UptodownApp.f27990B.a0()) {
            this$0.f11200q = 4;
            dialogBinding.f10932d.setImageDrawable(drawable);
            dialogBinding.f10933e.setImageDrawable(drawable);
            dialogBinding.f10934f.setImageDrawable(drawable);
            dialogBinding.f10935g.setImageDrawable(drawable);
            dialogBinding.f10936h.setImageDrawable(drawable2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u4(L0 this$0, NestedScrollView nestedScrollView, int i8, int i9, int i10, int i11) {
        C1494d c1494d;
        Long l8;
        AbstractC3159y.i(this$0, "this$0");
        Rect rect = new Rect();
        this$0.J3().f10408P.getHitRect(rect);
        this$0.x6(rect);
        boolean z8 = true;
        if (this$0.J3().f10399G.f10512s.getLocalVisibleRect(rect)) {
            this$0.J3().f10427e.setTitle("");
            this$0.J3().f10436i0.setVisibility(8);
            this$0.f11199p = true;
        } else {
            boolean z9 = this$0.f11199p;
            this$0.f11199p = false;
            C1498h c1498h = this$0.f11186c;
            if (c1498h != null) {
                AbstractC3159y.f(c1498h);
                if (c1498h.s0() != null) {
                    C1498h c1498h2 = this$0.f11186c;
                    AbstractC3159y.f(c1498h2);
                    ArrayList i12 = c1498h2.i1();
                    if (i12 != null && !i12.isEmpty()) {
                        z8 = this$0.f11198o;
                    } else {
                        C1498h c1498h3 = this$0.f11186c;
                        AbstractC3159y.f(c1498h3);
                        if (c1498h3.e0() != null) {
                            this$0.f11206w = true;
                            z8 = this$0.f11198o;
                        } else {
                            this$0.J3().f10436i0.setVisibility(0);
                            this$0.J3().f10427e.setTitleEnabled(false);
                        }
                    }
                    if (z9 && z8) {
                        if (!this$0.f11206w) {
                            TextView textView = this$0.J3().f10436i0;
                            C1498h c1498h4 = this$0.f11186c;
                            AbstractC3159y.f(c1498h4);
                            textView.setText(c1498h4.s0());
                        }
                        CollapsingToolbarLayout collapsingToolbarLayout = this$0.J3().f10427e;
                        C1498h c1498h5 = this$0.f11186c;
                        AbstractC3159y.f(c1498h5);
                        String s02 = c1498h5.s0();
                        AbstractC3159y.f(s02);
                        collapsingToolbarLayout.setTitle(s02);
                    }
                }
            }
        }
        C1494d c1494d2 = this$0.f11187d;
        if (c1494d2 != null) {
            AbstractC3159y.f(c1494d2);
            if (!c1494d2.h() && this$0.J3().f10456y.getRoot().getLocalVisibleRect(rect) && (c1494d = this$0.f11187d) != null) {
                Context requireContext = this$0.requireContext();
                AbstractC3159y.h(requireContext, "requireContext()");
                C1498h c1498h6 = this$0.f11186c;
                if (c1498h6 != null) {
                    l8 = Long.valueOf(c1498h6.i());
                } else {
                    l8 = null;
                }
                c1494d.b(requireContext, l8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u5() {
        LifecycleCoroutineScope lifecycleScope;
        U u8;
        try {
            try {
                Context requireContext = requireContext();
                AbstractC3159y.h(requireContext, "requireContext()");
                m5(requireContext);
                X2();
                Context requireContext2 = requireContext();
                AbstractC3159y.h(requireContext2, "requireContext()");
                G6(requireContext2);
                V6();
                this.f11188e = true;
                if (this.f11189f > 0) {
                    T6();
                }
                C3();
            } catch (Exception e8) {
                e8.printStackTrace();
                if (this.f11186c != null) {
                    lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
                    u8 = new U(null);
                } else {
                    return;
                }
            }
            if (this.f11186c != null) {
                lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
                u8 = new U(null);
                AbstractC2829k.d(lifecycleScope, null, null, u8, 3, null);
            }
        } catch (Throwable th) {
            if (this.f11186c != null) {
                AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new U(null), 3, null);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u6(Context context) {
        H6();
        this.f11203t = 1;
        J3().f10396D.f10691f.setText(getString(com.uptodown.R.string.updates_button_download_app));
        J3().f10396D.f10691f.setBackground(ContextCompat.getDrawable(context, com.uptodown.R.drawable.ripple_blue_primary_button));
        J3().f10393A.f11023o.setText(getString(com.uptodown.R.string.updates_button_download_app));
        J3().f10393A.f11014f.setBackground(ContextCompat.getDrawable(context, com.uptodown.R.drawable.ripple_blue_primary_button));
        D6(com.uptodown.R.id.action_app_installed_details);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v3(L0 this$0, C1389w dialogBinding, Drawable drawable, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(dialogBinding, "$dialogBinding");
        if (UptodownApp.f27990B.a0()) {
            this$0.f11200q = 5;
            dialogBinding.f10932d.setImageDrawable(drawable);
            dialogBinding.f10933e.setImageDrawable(drawable);
            dialogBinding.f10934f.setImageDrawable(drawable);
            dialogBinding.f10935g.setImageDrawable(drawable);
            dialogBinding.f10936h.setImageDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v5() {
        if (this.f11186c != null && J3().f10447p.getVisibility() == 8) {
            C1498h c1498h = this.f11186c;
            AbstractC3159y.f(c1498h);
            ArrayList E02 = c1498h.E0();
            if (E02 != null && !E02.isEmpty()) {
                V v8 = new V();
                W w8 = new W();
                Context requireContext = requireContext();
                AbstractC3159y.h(requireContext, "requireContext()");
                D4.K k8 = new D4.K(v8, w8, requireContext, 8);
                this.f11180G = k8;
                AbstractC3159y.f(k8);
                C1498h c1498h2 = this.f11186c;
                AbstractC3159y.f(c1498h2);
                ArrayList E03 = c1498h2.E0();
                AbstractC3159y.f(E03);
                k8.d(E03);
                J3().f10404L.setAdapter(this.f11180G);
                J3().f10404L.setNestedScrollingEnabled(false);
                J3().f10404L.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
                J3().f10447p.setVisibility(0);
            }
        }
    }

    private final void v6() {
        if (getContext() != null && this.f11186c != null) {
            Context requireContext = requireContext();
            AbstractC3159y.h(requireContext, "requireContext()");
            C1498h c1498h = this.f11186c;
            AbstractC3159y.f(c1498h);
            new S4.r(requireContext, c1498h, null, null, LifecycleOwnerKt.getLifecycleScope(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w3(Context context, L0 this$0, C1389w dialogBinding, View view) {
        String str;
        AbstractC3159y.i(context, "$context");
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(dialogBinding, "$dialogBinding");
        if (UptodownApp.f27990B.a0()) {
            X4.Q e8 = X4.Q.f12424k.e(context);
            if (e8 != null) {
                str = e8.getId();
            } else {
                str = null;
            }
            if (str != null) {
                String id = e8.getId();
                AbstractC3159y.f(id);
                if (id.length() > 0) {
                    Editable text = dialogBinding.f10930b.getText();
                    AbstractC3159y.h(text, "dialogBinding.etReview.text");
                    this$0.R5(g6.n.M0(text).toString());
                    return;
                }
            }
            this$0.f11178E = dialogBinding.f10930b.toString();
            this$0.U4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w4(L0 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.b5();
    }

    private final View w5(LinearLayout.LayoutParams layoutParams, final X4.K k8, Context context) {
        CharSequence charSequence;
        final C1366d0 c8 = C1366d0.c(getLayoutInflater());
        AbstractC3159y.h(c8, "inflate(layoutInflater)");
        c8.getRoot().setLayoutParams(layoutParams);
        c8.f10478e.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on));
        c8.f10479f.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off));
        c8.f10480g.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off));
        c8.f10481h.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off));
        c8.f10482i.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_off));
        if (k8.n() >= 2) {
            c8.f10479f.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on));
        }
        if (k8.n() >= 3) {
            c8.f10480g.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on));
        }
        if (k8.n() >= 4) {
            c8.f10481h.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on));
        }
        if (k8.n() == 5) {
            c8.f10482i.setImageDrawable(ContextCompat.getDrawable(context, com.uptodown.R.drawable.vector_star_on));
        }
        UsernameTextView usernameTextView = c8.f10493t;
        j.a aVar = E4.j.f2272g;
        usernameTextView.setTypeface(aVar.t());
        c8.f10488o.setTypeface(aVar.u());
        c8.f10487n.setTypeface(aVar.u());
        c8.f10490q.setTypeface(aVar.u());
        c8.f10491r.setTypeface(aVar.u());
        Q.b bVar = X4.Q.f12424k;
        String c9 = bVar.c(k8.i());
        if (c9 != null && c9.length() != 0) {
            com.squareup.picasso.s.h().l(bVar.c(k8.i())).n(UptodownApp.f27990B.f0(context)).i(c8.f10476c);
        }
        String z8 = k8.z();
        if (z8 != null && z8.length() != 0) {
            c8.f10476c.setOnClickListener(new View.OnClickListener() { // from class: U4.c0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    L0.x5(L0.this, k8, view);
                }
            });
            c8.f10493t.setOnClickListener(new View.OnClickListener() { // from class: U4.d0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    L0.y5(L0.this, k8, view);
                }
            });
        }
        if (k8.G() != null) {
            c8.f10493t.setText(k8.G());
            UsernameTextView.a aVar2 = UsernameTextView.f29975k;
            UsernameTextView usernameTextView2 = c8.f10493t;
            AbstractC3159y.h(usernameTextView2, "reviewBinding.tvUsernameReview");
            aVar2.a(usernameTextView2, k8.L(), k8.I());
        }
        if (k8.u() != null) {
            c8.f10488o.setText(k8.u());
        }
        if (k8.b() == 1) {
            TextView textView = c8.f10491r;
            kotlin.jvm.internal.Y y8 = kotlin.jvm.internal.Y.f33752a;
            String string = getString(com.uptodown.R.string.replies_counter_single);
            AbstractC3159y.h(string, "getString(R.string.replies_counter_single)");
            String format = String.format(string, Arrays.copyOf(new Object[0], 0));
            AbstractC3159y.h(format, "format(...)");
            textView.setText(format);
        } else if (k8.b() > 1) {
            TextView textView2 = c8.f10491r;
            kotlin.jvm.internal.Y y9 = kotlin.jvm.internal.Y.f33752a;
            String string2 = getString(com.uptodown.R.string.replies_counter_multiple);
            AbstractC3159y.h(string2, "getString(R.string.replies_counter_multiple)");
            String format2 = String.format(string2, Arrays.copyOf(new Object[]{String.valueOf(k8.b())}, 1));
            AbstractC3159y.h(format2, "format(...)");
            textView2.setText(format2);
        }
        if (k8.o() != null) {
            c8.f10490q.setFocusable(true);
            TextView textView3 = c8.f10487n;
            Spanned s8 = k8.s();
            if (s8 != null) {
                charSequence = g6.n.M0(s8);
            } else {
                charSequence = null;
            }
            textView3.setText(charSequence);
            c8.f10487n.getViewTreeObserver().addOnPreDrawListener(new X(c8));
            c8.f10492s.setOnClickListener(new View.OnClickListener() { // from class: U4.e0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    L0.z5(C1366d0.this, this, view);
                }
            });
            c8.f10485l.setOnClickListener(new View.OnClickListener() { // from class: U4.f0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    L0.A5(L0.this, k8, view);
                }
            });
            c8.f10485l.setFocusable(true);
            c8.f10489p.setText(String.valueOf(k8.k()));
            if (C3307A.f34459a.i(k8.j())) {
                c8.f10477d.setImageDrawable(ContextCompat.getDrawable(requireContext(), com.uptodown.R.drawable.vector_heart_red));
            }
            c8.f10484k.setOnClickListener(new View.OnClickListener() { // from class: U4.h0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    L0.B5(L0.this, c8, k8, view);
                }
            });
        } else {
            c8.f10487n.setVisibility(8);
            c8.f10485l.setVisibility(8);
            c8.f10484k.setVisibility(8);
        }
        c8.f10490q.setFocusable(true);
        RelativeLayout root = c8.getRoot();
        AbstractC3159y.h(root, "reviewBinding.root");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w6(C1498h c1498h) {
        if (getActivity() instanceof MainActivity) {
            FragmentActivity activity = getActivity();
            AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
            ((MainActivity) activity).a7(c1498h, new j0(c1498h, this));
            Context requireContext = requireContext();
            AbstractC3159y.h(requireContext, "requireContext()");
            new S4.i(requireContext, c1498h.i(), new k0(), LifecycleOwnerKt.getLifecycleScope(this));
            return;
        }
        if (getActivity() instanceof AppDetailActivity) {
            FragmentActivity activity2 = getActivity();
            AbstractC3159y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.AppDetailActivity");
            ((AppDetailActivity) activity2).r3(J3().f10423c.getRoot());
            FragmentActivity activity3 = getActivity();
            AbstractC3159y.g(activity3, "null cannot be cast to non-null type com.uptodown.activities.AppDetailActivity");
            ((AppDetailActivity) activity3).s3(c1498h, new l0(c1498h, this));
            Context requireContext2 = requireContext();
            AbstractC3159y.h(requireContext2, "requireContext()");
            new S4.i(requireContext2, c1498h.i(), new m0(), LifecycleOwnerKt.getLifecycleScope(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x3(L0 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        if (UptodownApp.f27990B.a0()) {
            this$0.f11200q = -1;
            FragmentActivity activity = this$0.getActivity();
            AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
            AlertDialog s22 = ((AbstractActivityC2489a) activity).s2();
            if (s22 != null) {
                s22.dismiss();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x4(L0 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        if (this$0.getActivity() != null) {
            String string = this$0.getString(com.uptodown.R.string.url_iap);
            AbstractC3159y.h(string, "getString(R.string.url_iap)");
            C3323k c3323k = new C3323k();
            FragmentActivity requireActivity = this$0.requireActivity();
            AbstractC3159y.h(requireActivity, "requireActivity()");
            C3323k.r(c3323k, requireActivity, string, null, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x5(L0 this$0, X4.K review, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(review, "$review");
        String z8 = review.z();
        AbstractC3159y.f(z8);
        this$0.g5(z8);
    }

    private final void x6(Rect rect) {
        if (getContext() != null) {
            C1498h c1498h = this.f11186c;
            AbstractC3159y.f(c1498h);
            if (!AbstractC3159y.d(c1498h.y0(), requireContext().getPackageName())) {
                if (J3().f10396D.getRoot().getLocalVisibleRect(rect) && !this.f11177D) {
                    J3().f10457z.startAnimation(AnimationUtils.loadAnimation(requireContext(), com.uptodown.R.anim.slide_out_bottom));
                    J3().f10457z.setVisibility(8);
                    this.f11177D = !this.f11177D;
                    return;
                }
                if (!J3().f10396D.getRoot().getLocalVisibleRect(rect) && this.f11177D) {
                    J3().f10457z.startAnimation(AnimationUtils.loadAnimation(requireContext(), com.uptodown.R.anim.slide_in_bottom));
                    J3().f10457z.setVisibility(0);
                    this.f11177D = !this.f11177D;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y3(L0 this$0, Context context, DialogInterface dialogInterface) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(context, "$context");
        this$0.R6(this$0.f11200q, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y4(L0 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.D3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y5(L0 this$0, X4.K review, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(review, "$review");
        String z8 = review.z();
        AbstractC3159y.f(z8);
        this$0.g5(z8);
    }

    private final void y6(AlertDialog.Builder builder) {
        if (!UptodownApp.f27990B.N()) {
            FragmentActivity activity = getActivity();
            AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
            ((AbstractActivityC2489a) activity).O2(builder.create());
            if (getActivity() != null && !requireActivity().isFinishing()) {
                FragmentActivity activity2 = getActivity();
                AbstractC3159y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
                if (((AbstractActivityC2489a) activity2).s2() != null) {
                    FragmentActivity activity3 = getActivity();
                    AbstractC3159y.g(activity3, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
                    AlertDialog s22 = ((AbstractActivityC2489a) activity3).s2();
                    AbstractC3159y.f(s22);
                    Window window = s22.getWindow();
                    if (window != null) {
                        window.setBackgroundDrawable(new ColorDrawable(0));
                    }
                    FragmentActivity activity4 = getActivity();
                    AbstractC3159y.g(activity4, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
                    AlertDialog s23 = ((AbstractActivityC2489a) activity4).s2();
                    AbstractC3159y.f(s23);
                    s23.show();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c7, code lost:
    
        if (r4.exists() == false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void z3(android.content.Context r6) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: U4.L0.z3(android.content.Context):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z4(L0 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.E3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z5(C1366d0 reviewBinding, L0 this$0, View view) {
        AbstractC3159y.i(reviewBinding, "$reviewBinding");
        AbstractC3159y.i(this$0, "this$0");
        if (reviewBinding.f10487n.getMaxLines() == Integer.MAX_VALUE) {
            reviewBinding.f10487n.setMaxLines(4);
            reviewBinding.f10492s.setText(this$0.getString(com.uptodown.R.string.read_more_desc_app_detail));
        } else {
            reviewBinding.f10487n.setMaxLines(Integer.MAX_VALUE);
            reviewBinding.f10492s.setText(this$0.getString(com.uptodown.R.string.read_less_desc_app_detail));
        }
    }

    private final void z6() {
        Q.b bVar = X4.Q.f12424k;
        Context requireContext = requireContext();
        AbstractC3159y.h(requireContext, "requireContext()");
        X4.Q e8 = bVar.e(requireContext);
        if (e8 == null || !e8.G()) {
            C1510u.a aVar = C1510u.f12703n;
            Context requireContext2 = requireContext();
            AbstractC3159y.h(requireContext2, "requireContext()");
            final C1510u d8 = aVar.d(requireContext2);
            if (d8 != null) {
                Context requireContext3 = requireContext();
                AbstractC3159y.h(requireContext3, "requireContext()");
                if (d8.a(requireContext3)) {
                    String r8 = d8.r();
                    C1498h c1498h = this.f11186c;
                    AbstractC3159y.f(c1498h);
                    if (!g6.n.s(r8, c1498h.y0(), true)) {
                        C1359a c8 = C1359a.c(getLayoutInflater());
                        AbstractC3159y.h(c8, "inflate(layoutInflater)");
                        c8.f10376d.setTypeface(E4.j.f2272g.t());
                        com.squareup.picasso.s h8 = com.squareup.picasso.s.h();
                        Resources resources = getResources();
                        AbstractC3159y.h(resources, "resources");
                        h8.l(d8.A(resources)).j(c8.f10374b, new n0(c8));
                        c8.f10375c.setOnClickListener(new View.OnClickListener() { // from class: U4.H0
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                L0.A6(L0.this, d8, view);
                            }
                        });
                        c8.f10374b.setOnClickListener(new View.OnClickListener() { // from class: U4.I0
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                L0.B6(L0.this, d8, view);
                            }
                        });
                        return;
                    }
                }
            }
            C6();
        }
    }

    public final C1498h I3() {
        return this.f11186c;
    }

    public final void O5() {
        N3();
    }

    public final void O6(String str) {
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new r0(str, this, null), 2, null);
    }

    public final void Q6(String packagename) {
        AbstractC3159y.i(packagename, "packagename");
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new s0(packagename, null), 2, null);
    }

    public final void T5(C1498h c1498h) {
        this.f11186c = c1498h;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Parcelable parcelable;
        Object parcelable2;
        super.onCreate(bundle);
        this.f11188e = false;
        this.f11202s = false;
        this.f11209z = new C3330r(requireActivity());
        UptodownApp.a aVar = UptodownApp.f27990B;
        InterfaceC2541e n8 = aVar.n();
        if (n8 != null) {
            n8.pause();
        }
        InterfaceC2541e o8 = aVar.o();
        if (o8 != null) {
            o8.pause();
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f11204u = arguments.getLong("appId");
            if (arguments.containsKey("appInfo")) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = arguments.getParcelable("appInfo", C1498h.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    parcelable = arguments.getParcelable("appInfo");
                }
                this.f11186c = (C1498h) parcelable;
            }
        }
        C1500j.a aVar2 = C1500j.f12617n;
        Context requireContext = requireContext();
        AbstractC3159y.h(requireContext, "requireContext()");
        boolean b8 = aVar2.b(requireContext, this.f11204u);
        this.f11175B = b8;
        if (!b8) {
            C1510u.a aVar3 = C1510u.f12703n;
            Context requireContext2 = requireContext();
            AbstractC3159y.h(requireContext2, "requireContext()");
            this.f11176C = aVar3.b(requireContext2, this.f11204u);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC3159y.i(inflater, "inflater");
        if (getActivity() != null) {
            View V32 = V3(inflater, viewGroup);
            FragmentActivity requireActivity = requireActivity();
            AbstractC3159y.h(requireActivity, "requireActivity()");
            Z3(requireActivity);
            return V32;
        }
        return super.onCreateView(inflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        try {
            MBBannerView mBBannerView = J3().f10455x;
            AbstractC3159y.h(mBBannerView, "binding.mbBannerView");
            mBBannerView.release();
        } catch (Exception unused) {
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.f11177D = !this.f11177D;
        MBBannerView mBBannerView = J3().f10455x;
        AbstractC3159y.h(mBBannerView, "binding.mbBannerView");
        mBBannerView.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        L4();
        MBBannerView mBBannerView = J3().f10455x;
        AbstractC3159y.h(mBBannerView, "binding.mbBannerView");
        mBBannerView.onResume();
    }

    /* loaded from: classes5.dex */
    public static final class k0 implements W4.r {

        /* loaded from: classes5.dex */
        static final class a extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L0 f11344a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C1498h f11345b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(L0 l02, C1498h c1498h) {
                super(0);
                this.f11344a = l02;
                this.f11345b = c1498h;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m66invoke();
                return L5.I.f6474a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m66invoke() {
                this.f11344a.O6(this.f11345b.y0());
            }
        }

        k0() {
        }

        @Override // W4.r
        public void f(C1498h appInfo) {
            AbstractC3159y.i(appInfo, "appInfo");
            FragmentActivity activity = L0.this.getActivity();
            AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
            ((MainActivity) activity).a7(appInfo, new a(L0.this, appInfo));
        }

        @Override // W4.r
        public void c(int i8) {
        }
    }

    /* loaded from: classes5.dex */
    public static final class m0 implements W4.r {

        /* loaded from: classes5.dex */
        static final class a extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L0 f11362a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C1498h f11363b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(L0 l02, C1498h c1498h) {
                super(0);
                this.f11362a = l02;
                this.f11363b = c1498h;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m70invoke();
                return L5.I.f6474a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m70invoke() {
                this.f11362a.O6(this.f11363b.y0());
            }
        }

        m0() {
        }

        @Override // W4.r
        public void f(C1498h appInfo) {
            AbstractC3159y.i(appInfo, "appInfo");
            FragmentActivity activity = L0.this.getActivity();
            AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.AppDetailActivity");
            ((AppDetailActivity) activity).s3(appInfo, new a(L0.this, appInfo));
        }

        @Override // W4.r
        public void c(int i8) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q5(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v4(View view) {
    }
}
