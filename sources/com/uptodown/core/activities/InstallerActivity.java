package com.uptodown.core.activities;

import E4.j;
import L5.I;
import M5.AbstractC1246t;
import N4.r;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AlertDialog;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.core.activities.InstallerActivity;
import com.uptodown.core.view.WrapContentLinearLayoutManager;
import i6.AbstractC2825i;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.InterfaceC2855x0;
import i6.J0;
import i6.M;
import i6.N;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.Q;
import kotlin.jvm.internal.T;
import kotlin.jvm.internal.Y;

/* loaded from: classes4.dex */
public final class InstallerActivity extends F4.r {

    /* renamed from: r0, reason: collision with root package name */
    public static final a f29660r0 = new a(null);

    /* renamed from: A, reason: collision with root package name */
    private TextView f29661A;

    /* renamed from: B, reason: collision with root package name */
    private TextView f29662B;

    /* renamed from: C, reason: collision with root package name */
    private TextView f29663C;

    /* renamed from: D, reason: collision with root package name */
    private ImageView f29664D;

    /* renamed from: E, reason: collision with root package name */
    private ImageView f29665E;

    /* renamed from: F, reason: collision with root package name */
    private String f29666F;

    /* renamed from: G, reason: collision with root package name */
    private ArrayList f29667G;

    /* renamed from: H, reason: collision with root package name */
    private File f29668H;

    /* renamed from: I, reason: collision with root package name */
    private String f29669I;

    /* renamed from: J, reason: collision with root package name */
    private Uri f29670J;

    /* renamed from: K, reason: collision with root package name */
    private N4.w f29671K;

    /* renamed from: L, reason: collision with root package name */
    private String f29672L;

    /* renamed from: M, reason: collision with root package name */
    private AlertDialog f29673M;

    /* renamed from: N, reason: collision with root package name */
    private AlertDialog f29674N;

    /* renamed from: O, reason: collision with root package name */
    private ArrayList f29675O;

    /* renamed from: P, reason: collision with root package name */
    private InterfaceC2855x0 f29676P;

    /* renamed from: Q, reason: collision with root package name */
    private J4.h f29677Q;

    /* renamed from: R, reason: collision with root package name */
    private J4.m f29678R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f29679S;

    /* renamed from: T, reason: collision with root package name */
    private boolean f29680T;

    /* renamed from: U, reason: collision with root package name */
    private String f29681U;

    /* renamed from: V, reason: collision with root package name */
    private boolean f29682V;

    /* renamed from: W, reason: collision with root package name */
    private boolean f29683W;

    /* renamed from: p, reason: collision with root package name */
    private ProgressBar f29687p;

    /* renamed from: q, reason: collision with root package name */
    private TextView f29689q;

    /* renamed from: q0, reason: collision with root package name */
    private final ActivityResultLauncher f29690q0;

    /* renamed from: r, reason: collision with root package name */
    private TextView f29691r;

    /* renamed from: s, reason: collision with root package name */
    private TextView f29692s;

    /* renamed from: t, reason: collision with root package name */
    private ImageView f29693t;

    /* renamed from: u, reason: collision with root package name */
    private TextView f29694u;

    /* renamed from: v, reason: collision with root package name */
    private TextView f29695v;

    /* renamed from: w, reason: collision with root package name */
    private TextView f29696w;

    /* renamed from: x, reason: collision with root package name */
    private TextView f29697x;

    /* renamed from: y, reason: collision with root package name */
    private TextView f29698y;

    /* renamed from: z, reason: collision with root package name */
    private TextView f29699z;

    /* renamed from: X, reason: collision with root package name */
    private final BroadcastReceiver f29684X = new t();

    /* renamed from: Y, reason: collision with root package name */
    private final n f29685Y = new n();

    /* renamed from: Z, reason: collision with root package name */
    private final c f29686Z = new c();

    /* renamed from: p0, reason: collision with root package name */
    private final s f29688p0 = new s();

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public final class b {

        /* renamed from: a, reason: collision with root package name */
        private String f29700a;

        /* renamed from: b, reason: collision with root package name */
        private String f29701b;

        /* renamed from: c, reason: collision with root package name */
        private File f29702c;

        /* renamed from: d, reason: collision with root package name */
        private ArrayList f29703d = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        private ArrayList f29704e = new ArrayList();

        /* renamed from: f, reason: collision with root package name */
        private ArrayList f29705f = new ArrayList();

        /* renamed from: g, reason: collision with root package name */
        private ArrayList f29706g = new ArrayList();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f29708a = new a();

            a() {
                super(2);
            }

            @Override // X5.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(K4.d o12, K4.d o22) {
                AbstractC3159y.i(o12, "o1");
                AbstractC3159y.i(o22, "o2");
                return Integer.valueOf(Boolean.compare(!o12.a(), !o22.a()));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.uptodown.core.activities.InstallerActivity$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0709b extends AbstractC3160z implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            public static final C0709b f29709a = new C0709b();

            C0709b() {
                super(2);
            }

            @Override // X5.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(K4.d o12, K4.d o22) {
                AbstractC3159y.i(o12, "o1");
                AbstractC3159y.i(o22, "o2");
                return Integer.valueOf(Boolean.compare(!o12.a(), !o22.a()));
            }
        }

        public b() {
        }

        private final void o() {
            AbstractC1246t.B(this.f29703d, new Comparator() { // from class: F4.C0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int p8;
                    p8 = InstallerActivity.b.p((K4.d) obj, (K4.d) obj2);
                    return p8;
                }
            });
            AbstractC1246t.B(this.f29703d, new Comparator() { // from class: F4.D0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int q8;
                    q8 = InstallerActivity.b.q((K4.d) obj, (K4.d) obj2);
                    return q8;
                }
            });
            AbstractC1246t.B(this.f29704e, new Comparator() { // from class: F4.E0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int r8;
                    r8 = InstallerActivity.b.r((K4.d) obj, (K4.d) obj2);
                    return r8;
                }
            });
            ArrayList arrayList = this.f29704e;
            final a aVar = a.f29708a;
            AbstractC1246t.B(arrayList, new Comparator() { // from class: F4.F0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int s8;
                    s8 = InstallerActivity.b.s(X5.n.this, obj, obj2);
                    return s8;
                }
            });
            AbstractC1246t.B(this.f29705f, new Comparator() { // from class: F4.G0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int t8;
                    t8 = InstallerActivity.b.t((K4.d) obj, (K4.d) obj2);
                    return t8;
                }
            });
            ArrayList arrayList2 = this.f29705f;
            final C0709b c0709b = C0709b.f29709a;
            AbstractC1246t.B(arrayList2, new Comparator() { // from class: F4.H0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int u8;
                    u8 = InstallerActivity.b.u(X5.n.this, obj, obj2);
                    return u8;
                }
            });
            AbstractC1246t.B(this.f29706g, new Comparator() { // from class: F4.I0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int v8;
                    v8 = InstallerActivity.b.v((K4.d) obj, (K4.d) obj2);
                    return v8;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int p(K4.d o12, K4.d o22) {
            AbstractC3159y.i(o12, "o1");
            AbstractC3159y.i(o22, "o2");
            if (o12.d() == null) {
                return 1;
            }
            if (o22.d() == null) {
                return -1;
            }
            File d8 = o12.d();
            AbstractC3159y.f(d8);
            String name = d8.getName();
            AbstractC3159y.h(name, "o1.file!!.name");
            File d9 = o22.d();
            AbstractC3159y.f(d9);
            String name2 = d9.getName();
            AbstractC3159y.h(name2, "o2.file!!.name");
            return g6.n.m(name, name2, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int q(K4.d o12, K4.d o22) {
            AbstractC3159y.i(o12, "o1");
            AbstractC3159y.i(o22, "o2");
            if (o12.d() == null) {
                return 1;
            }
            if (o22.d() == null) {
                return -1;
            }
            return Boolean.compare(!o12.a(), !o22.a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int r(K4.d d12, K4.d d22) {
            AbstractC3159y.i(d12, "d1");
            AbstractC3159y.i(d22, "d2");
            if (d12.d() == null) {
                return 1;
            }
            if (d22.d() == null) {
                return -1;
            }
            File d8 = d12.d();
            AbstractC3159y.f(d8);
            String name = d8.getName();
            AbstractC3159y.h(name, "d1.file!!.name");
            File d9 = d22.d();
            AbstractC3159y.f(d9);
            String name2 = d9.getName();
            AbstractC3159y.h(name2, "d2.file!!.name");
            return g6.n.m(name, name2, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int s(X5.n tmp0, Object obj, Object obj2) {
            AbstractC3159y.i(tmp0, "$tmp0");
            return ((Number) tmp0.invoke(obj, obj2)).intValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int t(K4.d d12, K4.d d22) {
            AbstractC3159y.i(d12, "d1");
            AbstractC3159y.i(d22, "d2");
            if (d12.d() == null) {
                return 1;
            }
            if (d22.d() == null) {
                return -1;
            }
            File d8 = d12.d();
            AbstractC3159y.f(d8);
            String name = d8.getName();
            AbstractC3159y.h(name, "d1.file!!.name");
            File d9 = d22.d();
            AbstractC3159y.f(d9);
            String name2 = d9.getName();
            AbstractC3159y.h(name2, "d2.file!!.name");
            return g6.n.m(name, name2, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int u(X5.n tmp0, Object obj, Object obj2) {
            AbstractC3159y.i(tmp0, "$tmp0");
            return ((Number) tmp0.invoke(obj, obj2)).intValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int v(K4.d f12, K4.d f22) {
            AbstractC3159y.i(f12, "f1");
            AbstractC3159y.i(f22, "f2");
            if (f12.d() == null) {
                return 1;
            }
            if (f22.d() == null) {
                return -1;
            }
            File d8 = f12.d();
            AbstractC3159y.f(d8);
            String name = d8.getName();
            AbstractC3159y.h(name, "f1.file!!.name");
            File d9 = f22.d();
            AbstractC3159y.f(d9);
            String name2 = d9.getName();
            AbstractC3159y.h(name2, "f2.file!!.name");
            return g6.n.m(name, name2, true);
        }

        private final void x() {
            String[] SUPPORTED_ABIS = Build.SUPPORTED_ABIS;
            AbstractC3159y.h(SUPPORTED_ABIS, "SUPPORTED_ABIS");
            boolean z8 = false;
            for (String str : SUPPORTED_ABIS) {
                Iterator it = this.f29703d.iterator();
                while (it.hasNext()) {
                    K4.d dVar = (K4.d) it.next();
                    if (dVar.e() != null) {
                        String e8 = dVar.e();
                        AbstractC3159y.f(e8);
                        if (g6.n.s(str, new g6.j("_").f(e8, "-"), true)) {
                            if (!z8) {
                                dVar.f(true);
                                z8 = true;
                            }
                            dVar.g(true);
                        }
                    }
                }
            }
        }

        public final ArrayList h() {
            return this.f29703d;
        }

        public final File i() {
            return this.f29702c;
        }

        public final ArrayList j() {
            return this.f29704e;
        }

        public final ArrayList k() {
            return this.f29706g;
        }

        public final ArrayList l() {
            return this.f29705f;
        }

        public final String m() {
            return this.f29700a;
        }

        public final String n() {
            return this.f29701b;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:56:0x0196. Please report as an issue. */
        public final void w(ArrayList files) {
            AbstractC3159y.i(files, "files");
            String string = InstallerActivity.this.getString(E4.h.f2204E);
            AbstractC3159y.h(string, "getString(R.string.dpi_device)");
            this.f29703d = new ArrayList();
            this.f29704e = new ArrayList();
            this.f29705f = new ArrayList();
            this.f29706g = new ArrayList();
            String F12 = InstallerActivity.this.F1();
            PackageManager pm = InstallerActivity.this.getPackageManager();
            Iterator it = files.iterator();
            while (true) {
                int i8 = 0;
                if (it.hasNext()) {
                    File file = (File) it.next();
                    AbstractC3159y.h(pm, "pm");
                    String absolutePath = file.getAbsolutePath();
                    AbstractC3159y.h(absolutePath, "file.absolutePath");
                    PackageInfo c8 = N4.q.c(pm, absolutePath, 128);
                    if (c8 != null && this.f29702c == null) {
                        try {
                            if (c8.applicationInfo != null) {
                                this.f29700a = c8.packageName;
                                this.f29701b = c8.versionName + '(' + new N4.f().m(c8) + ')';
                                if (new N4.e().k(c8)) {
                                    this.f29702c = file;
                                } else {
                                    String f8 = new N4.a().f(file.getAbsolutePath());
                                    if (f8 != null && g6.n.H(f8, "name=\"com.android.vending.splits\"", false, 2, null)) {
                                        this.f29702c = file;
                                    } else {
                                        K4.d dVar = new K4.d();
                                        dVar.i(file);
                                        dVar.j(file.getName());
                                        dVar.h(file.getName());
                                        dVar.f(true);
                                        dVar.g(true);
                                        this.f29706g.add(dVar);
                                    }
                                }
                            }
                        } catch (Exception e8) {
                            e8.printStackTrace();
                        }
                    } else {
                        String f9 = new N4.a().f(file.getAbsolutePath());
                        if (f9 != null) {
                            if (g6.n.H(f9, "isFeatureSplit=\"resourceID 0xffffffff\"", false, 2, null)) {
                                K4.d dVar2 = new K4.d();
                                dVar2.i(file);
                                dVar2.j("");
                                dVar2.h(file.getName());
                                dVar2.f(true);
                                dVar2.g(true);
                                this.f29706g.add(dVar2);
                            } else if (g6.n.H(f9, "configForSplit=", false, 2, null) && !g6.n.H(f9, "configForSplit=\"\"", false, 2, null)) {
                                String name = file.getName();
                                AbstractC3159y.h(name, "file.name");
                                K4.d dVar3 = new K4.d();
                                dVar3.i(file);
                                dVar3.j(name);
                                dVar3.h(file.getName());
                                dVar3.f(true);
                                dVar3.g(true);
                                this.f29706g.add(dVar3);
                            } else if (g6.n.H(f9, "split=\"config.", false, 2, null)) {
                                String substring = f9.substring(g6.n.S(f9, "split=\"config.", 0, false, 6, null) + 14);
                                AbstractC3159y.h(substring, "this as java.lang.String).substring(startIndex)");
                                String substring2 = substring.substring(0, g6.n.S(substring, "\"", 0, false, 6, null));
                                AbstractC3159y.h(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                switch (substring2.hashCode()) {
                                    case -1619189395:
                                        if (!substring2.equals("xxxhdpi")) {
                                            K4.d dVar4 = new K4.d();
                                            try {
                                                Locale build = new Locale.Builder().setLanguage(substring2).build();
                                                dVar4.h(build.getDisplayLanguage(build));
                                            } catch (Exception e9) {
                                                e9.printStackTrace();
                                            }
                                            dVar4.i(file);
                                            dVar4.j(substring2);
                                            dVar4.f(g6.n.s(substring2, F12, true));
                                            dVar4.g(true);
                                            this.f29705f.add(dVar4);
                                            break;
                                        } else {
                                            K4.d dVar5 = new K4.d();
                                            dVar5.i(file);
                                            dVar5.j(substring2);
                                            dVar5.h(substring2);
                                            dVar5.f(g6.n.s(substring2, string, true));
                                            dVar5.g(true);
                                            this.f29704e.add(dVar5);
                                            break;
                                        }
                                    case -1073971299:
                                        if (substring2.equals("mips64")) {
                                            K4.d dVar6 = new K4.d();
                                            dVar6.i(file);
                                            dVar6.j(substring2);
                                            dVar6.h(substring2);
                                            this.f29703d.add(dVar6);
                                            break;
                                        } else {
                                            K4.d dVar42 = new K4.d();
                                            Locale build2 = new Locale.Builder().setLanguage(substring2).build();
                                            dVar42.h(build2.getDisplayLanguage(build2));
                                            dVar42.i(file);
                                            dVar42.j(substring2);
                                            dVar42.f(g6.n.s(substring2, F12, true));
                                            dVar42.g(true);
                                            this.f29705f.add(dVar42);
                                            break;
                                        }
                                    case -806050265:
                                        if (substring2.equals("x86_64")) {
                                            K4.d dVar62 = new K4.d();
                                            dVar62.i(file);
                                            dVar62.j(substring2);
                                            dVar62.h(substring2);
                                            this.f29703d.add(dVar62);
                                            break;
                                        } else {
                                            K4.d dVar422 = new K4.d();
                                            Locale build22 = new Locale.Builder().setLanguage(substring2).build();
                                            dVar422.h(build22.getDisplayLanguage(build22));
                                            dVar422.i(file);
                                            dVar422.j(substring2);
                                            dVar422.f(g6.n.s(substring2, F12, true));
                                            dVar422.g(true);
                                            this.f29705f.add(dVar422);
                                            break;
                                        }
                                    case -745448715:
                                        if (!substring2.equals("xxhdpi")) {
                                            K4.d dVar4222 = new K4.d();
                                            Locale build222 = new Locale.Builder().setLanguage(substring2).build();
                                            dVar4222.h(build222.getDisplayLanguage(build222));
                                            dVar4222.i(file);
                                            dVar4222.j(substring2);
                                            dVar4222.f(g6.n.s(substring2, F12, true));
                                            dVar4222.g(true);
                                            this.f29705f.add(dVar4222);
                                            break;
                                        } else {
                                            K4.d dVar52 = new K4.d();
                                            dVar52.i(file);
                                            dVar52.j(substring2);
                                            dVar52.h(substring2);
                                            dVar52.f(g6.n.s(substring2, string, true));
                                            dVar52.g(true);
                                            this.f29704e.add(dVar52);
                                            break;
                                        }
                                    case -738963905:
                                        if (substring2.equals("armeabi")) {
                                            K4.d dVar622 = new K4.d();
                                            dVar622.i(file);
                                            dVar622.j(substring2);
                                            dVar622.h(substring2);
                                            this.f29703d.add(dVar622);
                                            break;
                                        } else {
                                            K4.d dVar42222 = new K4.d();
                                            Locale build2222 = new Locale.Builder().setLanguage(substring2).build();
                                            dVar42222.h(build2222.getDisplayLanguage(build2222));
                                            dVar42222.i(file);
                                            dVar42222.j(substring2);
                                            dVar42222.f(g6.n.s(substring2, F12, true));
                                            dVar42222.g(true);
                                            this.f29705f.add(dVar42222);
                                            break;
                                        }
                                    case 117110:
                                        if (substring2.equals("x86")) {
                                            K4.d dVar6222 = new K4.d();
                                            dVar6222.i(file);
                                            dVar6222.j(substring2);
                                            dVar6222.h(substring2);
                                            this.f29703d.add(dVar6222);
                                            break;
                                        } else {
                                            K4.d dVar422222 = new K4.d();
                                            Locale build22222 = new Locale.Builder().setLanguage(substring2).build();
                                            dVar422222.h(build22222.getDisplayLanguage(build22222));
                                            dVar422222.i(file);
                                            dVar422222.j(substring2);
                                            dVar422222.f(g6.n.s(substring2, F12, true));
                                            dVar422222.g(true);
                                            this.f29705f.add(dVar422222);
                                            break;
                                        }
                                    case 3197941:
                                        if (!substring2.equals("hdpi")) {
                                            K4.d dVar4222222 = new K4.d();
                                            Locale build222222 = new Locale.Builder().setLanguage(substring2).build();
                                            dVar4222222.h(build222222.getDisplayLanguage(build222222));
                                            dVar4222222.i(file);
                                            dVar4222222.j(substring2);
                                            dVar4222222.f(g6.n.s(substring2, F12, true));
                                            dVar4222222.g(true);
                                            this.f29705f.add(dVar4222222);
                                            break;
                                        } else {
                                            K4.d dVar522 = new K4.d();
                                            dVar522.i(file);
                                            dVar522.j(substring2);
                                            dVar522.h(substring2);
                                            dVar522.f(g6.n.s(substring2, string, true));
                                            dVar522.g(true);
                                            this.f29704e.add(dVar522);
                                            break;
                                        }
                                    case 3317105:
                                        if (!substring2.equals("ldpi")) {
                                            K4.d dVar42222222 = new K4.d();
                                            Locale build2222222 = new Locale.Builder().setLanguage(substring2).build();
                                            dVar42222222.h(build2222222.getDisplayLanguage(build2222222));
                                            dVar42222222.i(file);
                                            dVar42222222.j(substring2);
                                            dVar42222222.f(g6.n.s(substring2, F12, true));
                                            dVar42222222.g(true);
                                            this.f29705f.add(dVar42222222);
                                            break;
                                        } else {
                                            K4.d dVar5222 = new K4.d();
                                            dVar5222.i(file);
                                            dVar5222.j(substring2);
                                            dVar5222.h(substring2);
                                            dVar5222.f(g6.n.s(substring2, string, true));
                                            dVar5222.g(true);
                                            this.f29704e.add(dVar5222);
                                            break;
                                        }
                                    case 3346896:
                                        if (!substring2.equals("mdpi")) {
                                            K4.d dVar422222222 = new K4.d();
                                            Locale build22222222 = new Locale.Builder().setLanguage(substring2).build();
                                            dVar422222222.h(build22222222.getDisplayLanguage(build22222222));
                                            dVar422222222.i(file);
                                            dVar422222222.j(substring2);
                                            dVar422222222.f(g6.n.s(substring2, F12, true));
                                            dVar422222222.g(true);
                                            this.f29705f.add(dVar422222222);
                                            break;
                                        } else {
                                            K4.d dVar52222 = new K4.d();
                                            dVar52222.i(file);
                                            dVar52222.j(substring2);
                                            dVar52222.h(substring2);
                                            dVar52222.f(g6.n.s(substring2, string, true));
                                            dVar52222.g(true);
                                            this.f29704e.add(dVar52222);
                                            break;
                                        }
                                    case 3351711:
                                        if (substring2.equals("mips")) {
                                            K4.d dVar62222 = new K4.d();
                                            dVar62222.i(file);
                                            dVar62222.j(substring2);
                                            dVar62222.h(substring2);
                                            this.f29703d.add(dVar62222);
                                            break;
                                        } else {
                                            K4.d dVar4222222222 = new K4.d();
                                            Locale build222222222 = new Locale.Builder().setLanguage(substring2).build();
                                            dVar4222222222.h(build222222222.getDisplayLanguage(build222222222));
                                            dVar4222222222.i(file);
                                            dVar4222222222.j(substring2);
                                            dVar4222222222.f(g6.n.s(substring2, F12, true));
                                            dVar4222222222.g(true);
                                            this.f29705f.add(dVar4222222222);
                                            break;
                                        }
                                    case 110743451:
                                        if (!substring2.equals("tvdpi")) {
                                            K4.d dVar42222222222 = new K4.d();
                                            Locale build2222222222 = new Locale.Builder().setLanguage(substring2).build();
                                            dVar42222222222.h(build2222222222.getDisplayLanguage(build2222222222));
                                            dVar42222222222.i(file);
                                            dVar42222222222.j(substring2);
                                            dVar42222222222.f(g6.n.s(substring2, F12, true));
                                            dVar42222222222.g(true);
                                            this.f29705f.add(dVar42222222222);
                                            break;
                                        } else {
                                            K4.d dVar522222 = new K4.d();
                                            dVar522222.i(file);
                                            dVar522222.j(substring2);
                                            dVar522222.h(substring2);
                                            dVar522222.f(g6.n.s(substring2, string, true));
                                            dVar522222.g(true);
                                            this.f29704e.add(dVar522222);
                                            break;
                                        }
                                    case 114020461:
                                        if (!substring2.equals("xhdpi")) {
                                            K4.d dVar422222222222 = new K4.d();
                                            Locale build22222222222 = new Locale.Builder().setLanguage(substring2).build();
                                            dVar422222222222.h(build22222222222.getDisplayLanguage(build22222222222));
                                            dVar422222222222.i(file);
                                            dVar422222222222.j(substring2);
                                            dVar422222222222.f(g6.n.s(substring2, F12, true));
                                            dVar422222222222.g(true);
                                            this.f29705f.add(dVar422222222222);
                                            break;
                                        } else {
                                            K4.d dVar5222222 = new K4.d();
                                            dVar5222222.i(file);
                                            dVar5222222.j(substring2);
                                            dVar5222222.h(substring2);
                                            dVar5222222.f(g6.n.s(substring2, string, true));
                                            dVar5222222.g(true);
                                            this.f29704e.add(dVar5222222);
                                            break;
                                        }
                                    case 146933760:
                                        if (substring2.equals("armeabi_v7a")) {
                                            K4.d dVar622222 = new K4.d();
                                            dVar622222.i(file);
                                            dVar622222.j(substring2);
                                            dVar622222.h(substring2);
                                            this.f29703d.add(dVar622222);
                                            break;
                                        } else {
                                            K4.d dVar4222222222222 = new K4.d();
                                            Locale build222222222222 = new Locale.Builder().setLanguage(substring2).build();
                                            dVar4222222222222.h(build222222222222.getDisplayLanguage(build222222222222));
                                            dVar4222222222222.i(file);
                                            dVar4222222222222.j(substring2);
                                            dVar4222222222222.f(g6.n.s(substring2, F12, true));
                                            dVar4222222222222.g(true);
                                            this.f29705f.add(dVar4222222222222);
                                            break;
                                        }
                                    case 1433054842:
                                        if (substring2.equals("arm64_v8a")) {
                                            K4.d dVar6222222 = new K4.d();
                                            dVar6222222.i(file);
                                            dVar6222222.j(substring2);
                                            dVar6222222.h(substring2);
                                            this.f29703d.add(dVar6222222);
                                            break;
                                        } else {
                                            K4.d dVar42222222222222 = new K4.d();
                                            Locale build2222222222222 = new Locale.Builder().setLanguage(substring2).build();
                                            dVar42222222222222.h(build2222222222222.getDisplayLanguage(build2222222222222));
                                            dVar42222222222222.i(file);
                                            dVar42222222222222.j(substring2);
                                            dVar42222222222222.f(g6.n.s(substring2, F12, true));
                                            dVar42222222222222.g(true);
                                            this.f29705f.add(dVar42222222222222);
                                            break;
                                        }
                                    default:
                                        K4.d dVar422222222222222 = new K4.d();
                                        Locale build22222222222222 = new Locale.Builder().setLanguage(substring2).build();
                                        dVar422222222222222.h(build22222222222222.getDisplayLanguage(build22222222222222));
                                        dVar422222222222222.i(file);
                                        dVar422222222222222.j(substring2);
                                        dVar422222222222222.f(g6.n.s(substring2, F12, true));
                                        dVar422222222222222.g(true);
                                        this.f29705f.add(dVar422222222222222);
                                        break;
                                }
                            } else {
                                String name2 = file.getName();
                                AbstractC3159y.h(name2, "file.name");
                                K4.d dVar7 = new K4.d();
                                dVar7.i(file);
                                dVar7.j(name2);
                                dVar7.h(file.getName());
                                dVar7.f(true);
                                dVar7.g(true);
                                this.f29706g.add(dVar7);
                            }
                        }
                    }
                } else {
                    if (this.f29702c == null) {
                        Iterator it2 = this.f29706g.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                int i9 = i8 + 1;
                                K4.d dVar8 = (K4.d) it2.next();
                                File d8 = dVar8.d();
                                AbstractC3159y.f(d8);
                                if (d8.getName().equals("base.apk")) {
                                    this.f29702c = dVar8.d();
                                } else {
                                    i8 = i9;
                                }
                            } else {
                                i8 = -1;
                            }
                        }
                        if (i8 >= 0) {
                            this.f29706g.remove(i8);
                        }
                    }
                    x();
                    o();
                    return;
                }
            }
        }

        public final ArrayList y() {
            ArrayList arrayList = new ArrayList();
            File file = this.f29702c;
            if (file != null) {
                AbstractC3159y.f(file);
                arrayList.add(file);
            }
            Iterator it = this.f29703d.iterator();
            while (it.hasNext()) {
                K4.d dVar = (K4.d) it.next();
                if (dVar.a()) {
                    File d8 = dVar.d();
                    AbstractC3159y.f(d8);
                    arrayList.add(d8);
                }
            }
            Iterator it2 = this.f29704e.iterator();
            while (it2.hasNext()) {
                K4.d dVar2 = (K4.d) it2.next();
                if (dVar2.a()) {
                    File d9 = dVar2.d();
                    AbstractC3159y.f(d9);
                    arrayList.add(d9);
                }
            }
            Iterator it3 = this.f29705f.iterator();
            while (it3.hasNext()) {
                K4.d dVar3 = (K4.d) it3.next();
                if (dVar3.a()) {
                    File d10 = dVar3.d();
                    AbstractC3159y.f(d10);
                    arrayList.add(d10);
                }
            }
            Iterator it4 = this.f29706g.iterator();
            while (it4.hasNext()) {
                K4.d dVar4 = (K4.d) it4.next();
                if (dVar4.a()) {
                    File d11 = dVar4.d();
                    AbstractC3159y.f(d11);
                    arrayList.add(d11);
                }
            }
            return arrayList;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements J4.a {
        c() {
        }

        @Override // J4.a
        public void a(String filename) {
            AbstractC3159y.i(filename, "filename");
            InstallerActivity.this.g2();
        }

        @Override // J4.a
        public void b(String filename) {
            AbstractC3159y.i(filename, "filename");
            InstallerActivity.this.finish();
        }

        @Override // J4.a
        public void c(String filename, String str) {
            AbstractC3159y.i(filename, "filename");
            if (str != null) {
                InstallerActivity.this.f2(str);
                return;
            }
            InstallerActivity installerActivity = InstallerActivity.this;
            String string = installerActivity.getString(E4.h.f2209J);
            AbstractC3159y.h(string, "getString(R.string.error_unknown)");
            installerActivity.f2(string);
        }

        @Override // J4.a
        public void d(String filename) {
            AbstractC3159y.i(filename, "filename");
            InstallerActivity.this.f2(filename + " could not be parsed.");
        }

        @Override // J4.a
        public void e(String filename) {
            AbstractC3159y.i(filename, "filename");
            InstallerActivity.this.f2("invalid version code");
        }

        @Override // J4.a
        public void f(String str) {
            InstallerActivity.this.f2("error: not system permissions");
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements J4.l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f29711a;

        d(b bVar) {
            this.f29711a = bVar;
        }

        @Override // J4.l
        public void a(View view, int i8) {
            ((K4.d) this.f29711a.h().get(i8)).f(!((K4.d) this.f29711a.h().get(i8)).a());
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements J4.l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f29712a;

        e(b bVar) {
            this.f29712a = bVar;
        }

        @Override // J4.l
        public void a(View view, int i8) {
            ((K4.d) this.f29712a.j().get(i8)).f(!((K4.d) this.f29712a.j().get(i8)).a());
        }
    }

    /* loaded from: classes4.dex */
    public static final class f implements J4.l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f29713a;

        f(b bVar) {
            this.f29713a = bVar;
        }

        @Override // J4.l
        public void a(View view, int i8) {
            ((K4.d) this.f29713a.k().get(i8)).f(!((K4.d) this.f29713a.k().get(i8)).a());
        }
    }

    /* loaded from: classes4.dex */
    public static final class g implements J4.l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f29714a;

        g(b bVar) {
            this.f29714a = bVar;
        }

        @Override // J4.l
        public void a(View view, int i8) {
            ((K4.d) this.f29714a.l().get(i8)).f(!((K4.d) this.f29714a.l().get(i8)).a());
        }
    }

    /* loaded from: classes4.dex */
    public static final class h implements J4.h {
        h() {
        }

        @Override // J4.h
        public void a() {
            IntentFilter intentFilter = new IntentFilter("com.uptodown.core.custom_action_installation_status");
            InstallerActivity installerActivity = InstallerActivity.this;
            ContextCompat.registerReceiver(installerActivity, installerActivity.f29684X, intentFilter, 2);
            InstallerActivity.this.g2();
        }

        @Override // J4.h
        public void b(String str) {
            InstallerActivity.this.R1(str);
        }
    }

    /* loaded from: classes4.dex */
    public static final class i implements J4.m {
        i() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void l(InstallerActivity this$0, View view) {
            AbstractC3159y.i(this$0, "this$0");
            this$0.finish();
        }

        @Override // J4.m
        public void a(File fileZipped, ArrayList files) {
            AbstractC3159y.i(fileZipped, "fileZipped");
            AbstractC3159y.i(files, "files");
            if (new G4.a(InstallerActivity.this).r()) {
                InstallerActivity.this.C1(fileZipped, files);
                return;
            }
            b bVar = new b();
            bVar.w(files);
            ArrayList y8 = bVar.y();
            InstallerActivity installerActivity = InstallerActivity.this;
            installerActivity.P1(installerActivity, y8);
        }

        @Override // J4.m
        public void b(File file) {
            AbstractC3159y.i(file, "file");
            InstallerActivity installerActivity = InstallerActivity.this;
            installerActivity.O1(installerActivity, file);
        }

        @Override // J4.m
        public void c(int i8) {
            ProgressBar progressBar = InstallerActivity.this.f29687p;
            if (progressBar != null) {
                progressBar.setProgress(i8);
            }
            TextView textView = InstallerActivity.this.f29689q;
            if (textView != null) {
                Y y8 = Y.f33752a;
                String format = String.format("%s%%", Arrays.copyOf(new Object[]{Integer.valueOf(i8)}, 1));
                AbstractC3159y.h(format, "format(format, *args)");
                textView.setText(format);
            }
        }

        @Override // J4.m
        public void d(File file) {
            if (file != null) {
                N4.f fVar = new N4.f();
                InstallerActivity installerActivity = InstallerActivity.this;
                String absolutePath = file.getAbsolutePath();
                AbstractC3159y.h(absolutePath, "file.absolutePath");
                Drawable h8 = fVar.h(installerActivity, absolutePath);
                ImageView imageView = InstallerActivity.this.f29664D;
                AbstractC3159y.f(imageView);
                imageView.setImageDrawable(h8);
                InstallerActivity.this.f29668H = file;
            }
        }

        @Override // J4.m
        public void e(File file) {
            if (InstallerActivity.this.f29667G == null) {
                InstallerActivity.this.f29667G = new ArrayList();
            }
            ArrayList arrayList = InstallerActivity.this.f29667G;
            AbstractC3159y.f(arrayList);
            arrayList.add(file);
            c(0);
            TextView textView = InstallerActivity.this.f29661A;
            if (textView != null) {
                textView.setText(E4.h.f2263s0);
            }
        }

        @Override // J4.m
        public void f() {
            InstallerActivity.this.getWindow().clearFlags(128);
            TextView textView = InstallerActivity.this.f29661A;
            if (textView != null) {
                textView.setText(E4.h.f2207H);
            }
        }

        @Override // J4.m
        public void g() {
            c(0);
            TextView textView = InstallerActivity.this.f29661A;
            if (textView != null) {
                textView.setText(E4.h.f2261r0);
            }
        }

        @Override // J4.m
        public void h() {
            InstallerActivity.this.getWindow().clearFlags(128);
            TextView textView = InstallerActivity.this.f29691r;
            if (textView != null) {
                InstallerActivity installerActivity = InstallerActivity.this;
                textView.setText(installerActivity.getString(E4.h.f2268x, installerActivity.getString(E4.h.f2230c)));
            }
            TextView textView2 = InstallerActivity.this.f29691r;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            TextView textView3 = InstallerActivity.this.f29663C;
            if (textView3 != null) {
                final InstallerActivity installerActivity2 = InstallerActivity.this;
                textView3.setOnClickListener(new View.OnClickListener() { // from class: F4.J0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        InstallerActivity.i.l(InstallerActivity.this, view);
                    }
                });
            }
        }

        @Override // J4.m
        public void i() {
            TextView textView = InstallerActivity.this.f29661A;
            if (textView != null) {
                textView.setText(E4.h.f2210K);
            }
        }

        @Override // J4.m
        public void j() {
            InstallerActivity.this.getWindow().clearFlags(128);
            TextView textView = InstallerActivity.this.f29691r;
            if (textView != null) {
                InstallerActivity installerActivity = InstallerActivity.this;
                textView.setText(installerActivity.getString(E4.h.f2225Z, installerActivity.getString(E4.h.f2230c)));
            }
            InstallerActivity.this.M();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29717a;

        j(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new j(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((j) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f29717a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                InstallerActivity installerActivity = InstallerActivity.this;
                this.f29717a = 1;
                if (installerActivity.Z1(this) == e8) {
                    return e8;
                }
            }
            return I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29719a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Uri f29721c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f29722d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Uri uri, String str, P5.d dVar) {
            super(2, dVar);
            this.f29721c = uri;
            this.f29722d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new k(this.f29721c, this.f29722d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((k) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f29719a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                InstallerActivity installerActivity = InstallerActivity.this;
                Uri uri = this.f29721c;
                String str = this.f29722d;
                this.f29719a = 1;
                if (installerActivity.d2(uri, str, this) == e8) {
                    return e8;
                }
            }
            return I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29723a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f29725c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str, P5.d dVar) {
            super(2, dVar);
            this.f29725c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new l(this.f29725c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((l) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f29723a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                InstallerActivity installerActivity = InstallerActivity.this;
                String str = this.f29725c;
                this.f29723a = 1;
                if (installerActivity.m2(str, this) == e8) {
                    return e8;
                }
            }
            return I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class m extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29726a;

        /* renamed from: b, reason: collision with root package name */
        int f29727b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f29729a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InstallerActivity f29730b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Q f29731c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InstallerActivity installerActivity, Q q8, P5.d dVar) {
                super(2, dVar);
                this.f29730b = installerActivity;
                this.f29731c = q8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f29730b, this.f29731c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f29729a == 0) {
                    L5.t.b(obj);
                    TextView textView = this.f29730b.f29691r;
                    if (textView != null) {
                        ArrayList arrayList = this.f29730b.f29675O;
                        AbstractC3159y.f(arrayList);
                        textView.setText((CharSequence) arrayList.get(this.f29731c.f33745a));
                    }
                    TextView textView2 = this.f29730b.f29691r;
                    if (textView2 != null) {
                        textView2.setVisibility(0);
                    }
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        m(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new m(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((m) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x004d A[Catch: Exception -> 0x0012, LOOP:0: B:10:0x0049->B:12:0x004d, LOOP_END, TryCatch #0 {Exception -> 0x0012, blocks: (B:6:0x000d, B:8:0x007b, B:9:0x002f, B:10:0x0049, B:12:0x004d, B:14:0x0063, B:23:0x001f), top: B:2:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0063 A[EDGE_INSN: B:13:0x0063->B:14:0x0063 BREAK  A[LOOP:0: B:10:0x0049->B:12:0x004d], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0079 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x007a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007a -> B:8:0x007b). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = Q5.b.e()
                int r1 = r7.f29727b
                r2 = 1
                if (r1 == 0) goto L1c
                if (r1 != r2) goto L14
                int r1 = r7.f29726a
                L5.t.b(r8)     // Catch: java.lang.Exception -> L12
                r8 = r1
                goto L7b
            L12:
                r8 = move-exception
                goto L81
            L14:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1c:
                L5.t.b(r8)
                com.uptodown.core.activities.InstallerActivity r8 = com.uptodown.core.activities.InstallerActivity.this     // Catch: java.lang.Exception -> L12
                java.util.ArrayList r8 = com.uptodown.core.activities.InstallerActivity.U0(r8)     // Catch: java.lang.Exception -> L12
                kotlin.jvm.internal.AbstractC3159y.f(r8)     // Catch: java.lang.Exception -> L12
                int r8 = r8.size()     // Catch: java.lang.Exception -> L12
                if (r8 <= 0) goto L84
                r8 = -1
            L2f:
                kotlin.jvm.internal.Q r1 = new kotlin.jvm.internal.Q     // Catch: java.lang.Exception -> L12
                r1.<init>()     // Catch: java.lang.Exception -> L12
                b6.c$a r3 = b6.AbstractC1885c.f14778a     // Catch: java.lang.Exception -> L12
                com.uptodown.core.activities.InstallerActivity r4 = com.uptodown.core.activities.InstallerActivity.this     // Catch: java.lang.Exception -> L12
                java.util.ArrayList r4 = com.uptodown.core.activities.InstallerActivity.U0(r4)     // Catch: java.lang.Exception -> L12
                kotlin.jvm.internal.AbstractC3159y.f(r4)     // Catch: java.lang.Exception -> L12
                int r4 = r4.size()     // Catch: java.lang.Exception -> L12
                int r3 = r3.c(r4)     // Catch: java.lang.Exception -> L12
                r1.f33745a = r3     // Catch: java.lang.Exception -> L12
            L49:
                int r3 = r1.f33745a     // Catch: java.lang.Exception -> L12
                if (r3 != r8) goto L63
                b6.c$a r3 = b6.AbstractC1885c.f14778a     // Catch: java.lang.Exception -> L12
                com.uptodown.core.activities.InstallerActivity r4 = com.uptodown.core.activities.InstallerActivity.this     // Catch: java.lang.Exception -> L12
                java.util.ArrayList r4 = com.uptodown.core.activities.InstallerActivity.U0(r4)     // Catch: java.lang.Exception -> L12
                kotlin.jvm.internal.AbstractC3159y.f(r4)     // Catch: java.lang.Exception -> L12
                int r4 = r4.size()     // Catch: java.lang.Exception -> L12
                int r3 = r3.c(r4)     // Catch: java.lang.Exception -> L12
                r1.f33745a = r3     // Catch: java.lang.Exception -> L12
                goto L49
            L63:
                i6.J0 r8 = i6.C2812b0.c()     // Catch: java.lang.Exception -> L12
                com.uptodown.core.activities.InstallerActivity$m$a r4 = new com.uptodown.core.activities.InstallerActivity$m$a     // Catch: java.lang.Exception -> L12
                com.uptodown.core.activities.InstallerActivity r5 = com.uptodown.core.activities.InstallerActivity.this     // Catch: java.lang.Exception -> L12
                r6 = 0
                r4.<init>(r5, r1, r6)     // Catch: java.lang.Exception -> L12
                r7.f29726a = r3     // Catch: java.lang.Exception -> L12
                r7.f29727b = r2     // Catch: java.lang.Exception -> L12
                java.lang.Object r8 = i6.AbstractC2825i.g(r8, r4, r7)     // Catch: java.lang.Exception -> L12
                if (r8 != r0) goto L7a
                return r0
            L7a:
                r8 = r3
            L7b:
                r3 = 7000(0x1b58, double:3.4585E-320)
                java.lang.Thread.sleep(r3)     // Catch: java.lang.Exception -> L12
                goto L2f
            L81:
                r8.printStackTrace()
            L84:
                L5.I r8 = L5.I.f6474a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uptodown.core.activities.InstallerActivity.m.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes4.dex */
    public static final class n extends OnBackPressedCallback {
        n() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            InstallerActivity.this.u1();
        }
    }

    /* loaded from: classes4.dex */
    static final class o extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29733a;

        o(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new o(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((o) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f29733a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                InstallerActivity installerActivity = InstallerActivity.this;
                this.f29733a = 1;
                if (installerActivity.l2(2, this) == e8) {
                    return e8;
                }
            }
            return I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class p extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f29735a;

        /* renamed from: b, reason: collision with root package name */
        Object f29736b;

        /* renamed from: c, reason: collision with root package name */
        Object f29737c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f29738d;

        /* renamed from: f, reason: collision with root package name */
        int f29740f;

        p(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f29738d = obj;
            this.f29740f |= Integer.MIN_VALUE;
            return InstallerActivity.this.d2(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class q extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29741a;

        q(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new q(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((q) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f29741a == 0) {
                L5.t.b(obj);
                TextView textView = InstallerActivity.this.f29661A;
                if (textView != null) {
                    textView.setText(E4.h.f2259q0);
                }
                ProgressBar progressBar = InstallerActivity.this.f29687p;
                if (progressBar != null) {
                    progressBar.setIndeterminate(true);
                }
                return I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class r extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29743a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f29744b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InstallerActivity f29745c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Uri f29746d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f29747a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InstallerActivity f29748b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ T f29749c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InstallerActivity installerActivity, T t8, P5.d dVar) {
                super(2, dVar);
                this.f29748b = installerActivity;
                this.f29749c = t8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f29748b, this.f29749c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f29747a == 0) {
                    L5.t.b(obj);
                    ProgressBar progressBar = this.f29748b.f29687p;
                    if (progressBar != null) {
                        progressBar.setIndeterminate(false);
                    }
                    TextView textView = this.f29748b.f29661A;
                    if (textView != null) {
                        textView.setText("");
                    }
                    TextView textView2 = this.f29748b.f29663C;
                    if (textView2 != null) {
                        textView2.setVisibility(8);
                    }
                    TextView textView3 = this.f29748b.f29662B;
                    if (textView3 != null) {
                        textView3.setVisibility(8);
                    }
                    if (this.f29749c.f33747a != null) {
                        TextView textView4 = this.f29748b.f29661A;
                        if (textView4 != null) {
                            textView4.setText((CharSequence) this.f29749c.f33747a);
                        }
                    } else {
                        InstallerActivity installerActivity = this.f29748b;
                        Intent intent = new Intent();
                        intent.putExtra("realPath", this.f29748b.f29669I);
                        I i8 = I.f6474a;
                        installerActivity.setResult(10, intent);
                        this.f29748b.finish();
                    }
                    return I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(String str, InstallerActivity installerActivity, Uri uri, P5.d dVar) {
            super(2, dVar);
            this.f29744b = str;
            this.f29745c = installerActivity;
            this.f29746d = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new r(this.f29744b, this.f29745c, this.f29746d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((r) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x00dd A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = Q5.b.e()
                int r1 = r14.f29743a
                r2 = 1
                if (r1 == 0) goto L18
                if (r1 != r2) goto L10
                L5.t.b(r15)
                goto Lde
            L10:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L18:
                L5.t.b(r15)
                kotlin.jvm.internal.T r15 = new kotlin.jvm.internal.T
                r15.<init>()
                N4.f r1 = new N4.f
                r1.<init>()
                java.lang.String r3 = r14.f29744b
                boolean r1 = r1.o(r3)
                r3 = 0
                if (r1 == 0) goto Lca
                com.uptodown.core.activities.InstallerActivity r1 = r14.f29745c     // Catch: java.lang.SecurityException -> L3b java.io.FileNotFoundException -> L3d
                android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.lang.SecurityException -> L3b java.io.FileNotFoundException -> L3d
                android.net.Uri r4 = r14.f29746d     // Catch: java.lang.SecurityException -> L3b java.io.FileNotFoundException -> L3d
                java.io.InputStream r1 = r1.openInputStream(r4)     // Catch: java.lang.SecurityException -> L3b java.io.FileNotFoundException -> L3d
                goto L5b
            L3b:
                r1 = move-exception
                goto L3f
            L3d:
                r1 = move-exception
                goto L4d
            L3f:
                r1.printStackTrace()
                com.uptodown.core.activities.InstallerActivity r1 = r14.f29745c
                int r4 = E4.h.f2233d0
                java.lang.String r1 = r1.getString(r4)
                r15.f33747a = r1
                goto L5a
            L4d:
                r1.printStackTrace()
                com.uptodown.core.activities.InstallerActivity r1 = r14.f29745c
                int r4 = E4.h.f2211L
                java.lang.String r1 = r1.getString(r4)
                r15.f33747a = r1
            L5a:
                r1 = r3
            L5b:
                if (r1 == 0) goto Lca
                r4 = 8192(0x2000, float:1.148E-41)
                byte[] r5 = new byte[r4]
                kotlin.jvm.internal.Q r6 = new kotlin.jvm.internal.Q
                r6.<init>()
                N4.f r7 = new N4.f
                r7.<init>()
                com.uptodown.core.activities.InstallerActivity r8 = r14.f29745c
                java.io.File r7 = r7.g(r8)
                long r8 = r7.getUsableSpace()
                int r10 = r1.available()
                double r10 = (double) r10
                r12 = 4608308318706860032(0x3ff4000000000000, double:1.25)
                double r10 = r10 * r12
                double r8 = (double) r8
                int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r12 <= 0) goto Lbd
                java.io.File r8 = new java.io.File
                java.lang.String r9 = r14.f29744b
                r8.<init>(r7, r9)
                java.io.FileOutputStream r7 = new java.io.FileOutputStream
                r7.<init>(r8)
            L8f:
                r9 = 0
                int r10 = r1.read(r5, r9, r4)
                r6.f33745a = r10
                if (r10 <= 0) goto La4
                r7.write(r5, r9, r10)     // Catch: java.io.IOException -> L9c
                goto L8f
            L9c:
                r9 = move-exception
                java.lang.String r9 = r9.getLocalizedMessage()
                r15.f33747a = r9
                goto L8f
            La4:
                r7.close()     // Catch: java.io.IOException -> La8
                goto Lb3
            La8:
                r4 = move-exception
                java.lang.Object r5 = r15.f33747a
                if (r5 != 0) goto Lb3
                java.lang.String r4 = r4.getLocalizedMessage()
                r15.f33747a = r4
            Lb3:
                com.uptodown.core.activities.InstallerActivity r4 = r14.f29745c
                java.lang.String r5 = r8.getAbsolutePath()
                com.uptodown.core.activities.InstallerActivity.p1(r4, r5)
                goto Lc7
            Lbd:
                com.uptodown.core.activities.InstallerActivity r4 = r14.f29745c
                int r5 = E4.h.f2207H
                java.lang.String r4 = r4.getString(r5)
                r15.f33747a = r4
            Lc7:
                r1.close()
            Lca:
                i6.J0 r1 = i6.C2812b0.c()
                com.uptodown.core.activities.InstallerActivity$r$a r4 = new com.uptodown.core.activities.InstallerActivity$r$a
                com.uptodown.core.activities.InstallerActivity r5 = r14.f29745c
                r4.<init>(r5, r15, r3)
                r14.f29743a = r2
                java.lang.Object r15 = i6.AbstractC2825i.g(r1, r4, r14)
                if (r15 != r0) goto Lde
                return r0
            Lde:
                L5.I r15 = L5.I.f6474a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uptodown.core.activities.InstallerActivity.r.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes4.dex */
    public static final class s implements J4.k {
        s() {
        }

        @Override // J4.k
        public void a(String filename) {
            AbstractC3159y.i(filename, "filename");
            InstallerActivity.this.g2();
        }

        @Override // J4.k
        public void b(String filename) {
            AbstractC3159y.i(filename, "filename");
            InstallerActivity.this.finish();
        }

        @Override // J4.k
        public void c(String filename, String str) {
            AbstractC3159y.i(filename, "filename");
            InstallerActivity installerActivity = InstallerActivity.this;
            String string = installerActivity.getString(E4.h.f2257p0);
            AbstractC3159y.h(string, "getString(R.string.xapk_installation_failed)");
            installerActivity.f2(string);
        }

        @Override // J4.k
        public void d(String filename) {
            AbstractC3159y.i(filename, "filename");
            InstallerActivity.this.f2(filename + " could not be parsed.");
        }

        @Override // J4.k
        public void e(String filename) {
            AbstractC3159y.i(filename, "filename");
            InstallerActivity.this.f2("invalid version code");
        }

        @Override // J4.k
        public void f(String filename) {
            AbstractC3159y.i(filename, "filename");
            InstallerActivity.this.f2(filename + " not found.");
        }
    }

    /* loaded from: classes4.dex */
    public static final class t extends BroadcastReceiver {
        t() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            AbstractC3159y.i(context, "context");
            AbstractC3159y.i(intent, "intent");
            int intExtra = intent.getIntExtra("com.uptodown.core.installation_status", -1);
            if (intExtra != 0) {
                if (intExtra != 1) {
                    if (intExtra == 2) {
                        InstallerActivity.this.R1(intent.getStringExtra("com.uptodown.core.error"));
                        return;
                    }
                    return;
                }
                InstallerActivity.this.g2();
                return;
            }
            InstallerActivity.this.Q1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class u extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f29752a;

        /* renamed from: b, reason: collision with root package name */
        Object f29753b;

        /* renamed from: c, reason: collision with root package name */
        int f29754c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f29755d;

        /* renamed from: f, reason: collision with root package name */
        int f29757f;

        u(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f29755d = obj;
            this.f29757f |= Integer.MIN_VALUE;
            return InstallerActivity.this.l2(0, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class v extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29758a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ T f29760c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(T t8, P5.d dVar) {
            super(2, dVar);
            this.f29760c = t8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new v(this.f29760c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((v) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f29758a == 0) {
                L5.t.b(obj);
                Intent intent = InstallerActivity.this.getIntent();
                if (intent != null) {
                    InstallerActivity.this.f29670J = intent.getData();
                    Bundle extras = intent.getExtras();
                    if (extras != null && extras.containsKey("realPath")) {
                        InstallerActivity.this.f29669I = extras.getString("realPath");
                        T t8 = this.f29760c;
                        String str = InstallerActivity.this.f29669I;
                        AbstractC3159y.f(str);
                        String str2 = InstallerActivity.this.f29669I;
                        AbstractC3159y.f(str2);
                        String substring = str.substring(g6.n.X(str2, "/", 0, false, 6, null) + 1);
                        AbstractC3159y.h(substring, "this as java.lang.String).substring(startIndex)");
                        t8.f33747a = substring;
                    }
                }
                return I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class w extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29761a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f29763c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ T f29764d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(int i8, T t8, P5.d dVar) {
            super(2, dVar);
            this.f29763c = i8;
            this.f29764d = t8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new w(this.f29763c, this.f29764d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((w) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i8;
            String str;
            Q5.b.e();
            if (this.f29761a == 0) {
                L5.t.b(obj);
                if (InstallerActivity.this.f29680T && ((i8 = this.f29763c) == 1 || i8 == 2)) {
                    TextView textView = InstallerActivity.this.f29662B;
                    if (textView != null) {
                        textView.setVisibility(0);
                    }
                    ProgressBar progressBar = InstallerActivity.this.f29687p;
                    if (progressBar != null) {
                        progressBar.setVisibility(8);
                    }
                    TextView textView2 = InstallerActivity.this.f29699z;
                    if (textView2 != null) {
                        textView2.setVisibility(8);
                    }
                    TextView textView3 = InstallerActivity.this.f29692s;
                    if (textView3 != null) {
                        textView3.setVisibility(0);
                    }
                    TextView textView4 = InstallerActivity.this.f29698y;
                    if (textView4 != null) {
                        textView4.setText(InstallerActivity.this.getString(E4.h.f2264t));
                    }
                    if (this.f29764d.f33747a != null) {
                        TextView textView5 = InstallerActivity.this.f29695v;
                        if (textView5 != null) {
                            textView5.setText((CharSequence) this.f29764d.f33747a);
                        }
                        TextView textView6 = InstallerActivity.this.f29695v;
                        if (textView6 != null) {
                            textView6.setVisibility(0);
                        }
                    } else {
                        TextView textView7 = InstallerActivity.this.f29695v;
                        if (textView7 != null) {
                            textView7.setText("");
                        }
                    }
                    String str2 = InstallerActivity.this.f29669I;
                    if (str2 != null && str2.length() != 0) {
                        PackageManager packageManager = InstallerActivity.this.getPackageManager();
                        AbstractC3159y.h(packageManager, "packageManager");
                        String str3 = InstallerActivity.this.f29669I;
                        AbstractC3159y.f(str3);
                        PackageInfo c8 = N4.q.c(packageManager, str3, 128);
                        if (c8 != null && (str = InstallerActivity.this.f29669I) != null && str.length() != 0) {
                            N4.f fVar = new N4.f();
                            String str4 = InstallerActivity.this.f29669I;
                            AbstractC3159y.f(str4);
                            PackageManager packageManager2 = InstallerActivity.this.getPackageManager();
                            AbstractC3159y.h(packageManager2, "this@InstallerActivity.packageManager");
                            String b8 = fVar.b(c8, str4, packageManager2);
                            TextView textView8 = InstallerActivity.this.f29694u;
                            if (textView8 != null) {
                                textView8.setText(b8);
                            }
                            TextView textView9 = InstallerActivity.this.f29694u;
                            if (textView9 != null) {
                                textView9.setVisibility(0);
                            }
                        }
                        ImageView imageView = InstallerActivity.this.f29693t;
                        if (imageView != null) {
                            imageView.setVisibility(0);
                        }
                        String str5 = InstallerActivity.this.f29669I;
                        AbstractC3159y.f(str5);
                        if (g6.n.r(str5, ".xapk", false, 2, null)) {
                            ImageView imageView2 = InstallerActivity.this.f29693t;
                            if (imageView2 != null) {
                                imageView2.setImageResource(E4.d.f2017q);
                            }
                        } else {
                            ImageView imageView3 = InstallerActivity.this.f29693t;
                            if (imageView3 != null) {
                                N4.f fVar2 = new N4.f();
                                InstallerActivity installerActivity = InstallerActivity.this;
                                String str6 = installerActivity.f29669I;
                                AbstractC3159y.f(str6);
                                imageView3.setImageDrawable(fVar2.h(installerActivity, str6));
                            }
                        }
                    }
                }
                return I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class x extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f29765a;

        /* renamed from: b, reason: collision with root package name */
        Object f29766b;

        /* renamed from: c, reason: collision with root package name */
        Object f29767c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f29768d;

        /* renamed from: f, reason: collision with root package name */
        int f29770f;

        x(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f29768d = obj;
            this.f29770f |= Integer.MIN_VALUE;
            return InstallerActivity.this.m2(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class y extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29771a;

        y(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new y(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((y) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f29771a == 0) {
                L5.t.b(obj);
                InstallerActivity.this.f29668H = null;
                TextView textView = InstallerActivity.this.f29663C;
                if (textView != null) {
                    textView.setVisibility(0);
                }
                return I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class z extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29773a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f29774b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InstallerActivity f29775c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ O f29776d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f29777a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InstallerActivity f29778b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InstallerActivity installerActivity, P5.d dVar) {
                super(2, dVar);
                this.f29778b = installerActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f29778b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f29777a == 0) {
                    L5.t.b(obj);
                    J4.m mVar = this.f29778b.f29678R;
                    if (mVar != null) {
                        mVar.h();
                        return I.f6474a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f29779a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InstallerActivity f29780b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(InstallerActivity installerActivity, P5.d dVar) {
                super(2, dVar);
                this.f29780b = installerActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new b(this.f29780b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f29779a == 0) {
                    L5.t.b(obj);
                    J4.m mVar = this.f29780b.f29678R;
                    if (mVar != null) {
                        mVar.j();
                        return I.f6474a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f29781a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InstallerActivity f29782b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(InstallerActivity installerActivity, P5.d dVar) {
                super(2, dVar);
                this.f29782b = installerActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new c(this.f29782b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((c) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f29781a == 0) {
                    L5.t.b(obj);
                    J4.m mVar = this.f29782b.f29678R;
                    if (mVar != null) {
                        mVar.i();
                        return I.f6474a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(String str, InstallerActivity installerActivity, O o8, P5.d dVar) {
            super(2, dVar);
            this.f29774b = str;
            this.f29775c = installerActivity;
            this.f29776d = o8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new z(this.f29774b, this.f29775c, this.f29776d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((z) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object g8;
            Object g9;
            Object g10;
            Object e8 = Q5.b.e();
            int i8 = this.f29773a;
            try {
            } catch (Exception e9) {
                e9.printStackTrace();
                J0 c8 = C2812b0.c();
                c cVar = new c(this.f29775c, null);
                this.f29773a = 4;
                g8 = AbstractC2825i.g(c8, cVar, this);
                if (g8 == e8) {
                    return e8;
                }
            }
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 != 2) {
                        if (i8 != 3) {
                            if (i8 == 4) {
                                L5.t.b(obj);
                                g8 = obj;
                                return (I) g8;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        L5.t.b(obj);
                        g9 = obj;
                        return (I) g9;
                    }
                    L5.t.b(obj);
                    g10 = obj;
                    return (I) g10;
                }
                L5.t.b(obj);
                return I.f6474a;
            }
            L5.t.b(obj);
            E4.j.f2272g.c(this.f29774b);
            File g11 = new N4.f().g(this.f29775c);
            File file = new File(this.f29774b);
            String name = file.getName();
            AbstractC3159y.h(name, "fileZipped.name");
            String name2 = file.getName();
            AbstractC3159y.h(name2, "fileZipped.name");
            String substring = name.substring(0, g6.n.X(name2, ".", 0, false, 6, null));
            AbstractC3159y.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            File file2 = new File(g11, substring);
            if (!file2.exists()) {
                file2.mkdirs();
            }
            this.f29775c.f29671K = new N4.w();
            N4.w wVar = this.f29775c.f29671K;
            AbstractC3159y.f(wVar);
            if (wVar.c(file)) {
                File e10 = new N4.f().e();
                this.f29776d.f33743a = e10.canWrite();
            }
            if (this.f29776d.f33743a) {
                N4.w wVar2 = this.f29775c.f29671K;
                AbstractC3159y.f(wVar2);
                J4.m mVar = this.f29775c.f29678R;
                this.f29773a = 1;
                if (wVar2.g(file, file2, mVar, this) == e8) {
                    return e8;
                }
                return I.f6474a;
            }
            if (this.f29775c.X()) {
                J0 c9 = C2812b0.c();
                a aVar = new a(this.f29775c, null);
                this.f29773a = 2;
                g10 = AbstractC2825i.g(c9, aVar, this);
                if (g10 == e8) {
                    return e8;
                }
                return (I) g10;
            }
            J0 c10 = C2812b0.c();
            b bVar = new b(this.f29775c, null);
            this.f29773a = 3;
            g9 = AbstractC2825i.g(c10, bVar, this);
            if (g9 == e8) {
                return e8;
            }
            return (I) g9;
        }
    }

    public InstallerActivity() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: F4.l0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                InstallerActivity.S1(InstallerActivity.this, (ActivityResult) obj);
            }
        });
        AbstractC3159y.h(registerForActivityResult, "registerForActivityResul… {\n        finish()\n    }");
        this.f29690q0 = registerForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A1(InstallerActivity this$0, ArrayList files, DialogInterface dialogInterface, int i8) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(files, "$files");
        G4.a aVar = new G4.a(this$0);
        aVar.M(true);
        aVar.B(true);
        this$0.P1(this$0, files);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B1(InstallerActivity this$0, ArrayList files, DialogInterface dialogInterface, int i8) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(files, "$files");
        G4.a aVar = new G4.a(this$0);
        aVar.M(true);
        aVar.B(false);
        this$0.P1(this$0, files);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C1(File file, ArrayList arrayList) {
        Window window;
        boolean z8;
        AlertDialog alertDialog = this.f29673M;
        if (alertDialog != null) {
            AbstractC3159y.f(alertDialog);
            if (alertDialog.isShowing()) {
                AlertDialog alertDialog2 = this.f29673M;
                AbstractC3159y.f(alertDialog2);
                alertDialog2.dismiss();
            }
        }
        final b bVar = new b();
        bVar.w(arrayList);
        View inflate = getLayoutInflater().inflate(E4.f.f2192p, (ViewGroup) null, false);
        TextView textView = (TextView) inflate.findViewById(E4.e.f2145p0);
        j.a aVar = E4.j.f2272g;
        textView.setTypeface(aVar.t());
        AbstractC3159y.f(file);
        textView.setText(file.getName());
        ((TextView) inflate.findViewById(E4.e.f2158t1)).setTypeface(aVar.t());
        TextView textView2 = (TextView) inflate.findViewById(E4.e.f2038F1);
        textView2.setTypeface(aVar.u());
        textView2.setText(bVar.m());
        ((TextView) inflate.findViewById(E4.e.f2161u1)).setTypeface(aVar.t());
        TextView textView3 = (TextView) inflate.findViewById(E4.e.f2089W1);
        textView3.setTypeface(aVar.u());
        textView3.setText(bVar.n());
        ((TextView) inflate.findViewById(E4.e.f2143o1)).setTypeface(aVar.t());
        CheckBox checkBox = (CheckBox) inflate.findViewById(E4.e.f2120h);
        if (bVar.i() != null) {
            checkBox.setTypeface(aVar.u());
            File i8 = bVar.i();
            AbstractC3159y.f(i8);
            checkBox.setText(i8.getName());
        }
        TextView textView4 = (TextView) inflate.findViewById(E4.e.f2146p1);
        textView4.setTypeface(aVar.t());
        TextView textView5 = (TextView) inflate.findViewById(E4.e.f2061N0);
        textView5.setTypeface(aVar.u());
        View findViewById = inflate.findViewById(E4.e.f2093Y);
        AbstractC3159y.h(findViewById, "view.findViewById(R.id.r…quitecture_dialog_splits)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        if (bVar.h().size() > 0) {
            recyclerView.setLayoutManager(new WrapContentLinearLayoutManager(this, 1, false));
            recyclerView.addItemDecoration(new N4.s((int) getResources().getDimension(E4.c.f2000a)));
            recyclerView.setItemAnimator(new DefaultItemAnimator());
            recyclerView.setAdapter(new H4.c(bVar.h(), new d(bVar)));
            String[] strArr = Build.SUPPORTED_ABIS;
            if (strArr != null) {
                if (strArr.length == 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (!z8) {
                    StringBuilder sb = new StringBuilder();
                    int length = strArr.length;
                    for (int i9 = 0; i9 < length; i9++) {
                        if (i9 == 0) {
                            sb = new StringBuilder('(' + strArr[i9]);
                        } else {
                            sb.append(",");
                            sb.append(strArr[i9]);
                        }
                    }
                    sb.append(")");
                    Y y8 = Y.f33752a;
                    String string = getString(E4.h.f2202C);
                    AbstractC3159y.h(string, "getString(R.string.devic…rted_abis_split_selector)");
                    String format = String.format(string, Arrays.copyOf(new Object[]{sb.toString()}, 1));
                    AbstractC3159y.h(format, "format(format, *args)");
                    textView5.setText(format);
                }
            }
            textView5.setVisibility(8);
        } else {
            recyclerView.setVisibility(8);
            textView4.setVisibility(8);
            textView5.setVisibility(8);
            inflate.findViewById(E4.e.f2115f0).setVisibility(8);
        }
        TextView textView6 = (TextView) inflate.findViewById(E4.e.f2149q1);
        j.a aVar2 = E4.j.f2272g;
        textView6.setTypeface(aVar2.t());
        TextView textView7 = (TextView) inflate.findViewById(E4.e.f2064O0);
        textView7.setTypeface(aVar2.u());
        View findViewById2 = inflate.findViewById(E4.e.f2100a0);
        AbstractC3159y.h(findViewById2, "view.findViewById(R.id.rv_dpi_dialog_splits)");
        RecyclerView recyclerView2 = (RecyclerView) findViewById2;
        if (bVar.j().size() > 0) {
            recyclerView2.setLayoutManager(new WrapContentLinearLayoutManager(this, 1, false));
            recyclerView2.addItemDecoration(new N4.s((int) getResources().getDimension(E4.c.f2000a)));
            recyclerView2.setItemAnimator(new DefaultItemAnimator());
            recyclerView2.setAdapter(new H4.c(bVar.j(), new e(bVar)));
            Y y9 = Y.f33752a;
            String string2 = getString(E4.h.f2203D);
            AbstractC3159y.h(string2, "getString(R.string.devic…rted_dpis_split_selector)");
            String format2 = String.format(string2, Arrays.copyOf(new Object[]{getString(E4.h.f2204E)}, 1));
            AbstractC3159y.h(format2, "format(format, *args)");
            textView7.setText(format2);
        } else {
            recyclerView2.setVisibility(8);
            textView6.setVisibility(8);
            textView7.setVisibility(8);
            inflate.findViewById(E4.e.f2118g0).setVisibility(8);
        }
        TextView textView8 = (TextView) inflate.findViewById(E4.e.f2155s1);
        textView8.setTypeface(aVar2.t());
        TextView textView9 = (TextView) inflate.findViewById(E4.e.f2055L0);
        textView9.setTypeface(aVar2.u());
        View findViewById3 = inflate.findViewById(E4.e.f2109d0);
        AbstractC3159y.h(findViewById3, "view.findViewById(R.id.rv_lang_dialog_splits)");
        RecyclerView recyclerView3 = (RecyclerView) findViewById3;
        if (bVar.l().size() > 0) {
            recyclerView3.setLayoutManager(new WrapContentLinearLayoutManager(this, 1, false));
            recyclerView3.addItemDecoration(new N4.s((int) getResources().getDimension(E4.c.f2000a)));
            recyclerView3.setItemAnimator(new DefaultItemAnimator());
            recyclerView3.setAdapter(new H4.c(bVar.l(), new g(bVar)));
            textView9.setText(getString(E4.h.f2201B));
        } else {
            recyclerView3.setVisibility(8);
            textView8.setVisibility(8);
            textView9.setVisibility(8);
            inflate.findViewById(E4.e.f2124i0).setVisibility(8);
        }
        TextView textView10 = (TextView) inflate.findViewById(E4.e.f2152r1);
        textView10.setTypeface(aVar2.t());
        TextView textView11 = (TextView) inflate.findViewById(E4.e.f2052K0);
        textView11.setTypeface(aVar2.u());
        View findViewById4 = inflate.findViewById(E4.e.f2103b0);
        AbstractC3159y.h(findViewById4, "view.findViewById(R.id.rv_features_dialog_splits)");
        RecyclerView recyclerView4 = (RecyclerView) findViewById4;
        if (bVar.k().size() > 0) {
            recyclerView4.setLayoutManager(new WrapContentLinearLayoutManager(this, 1, false));
            recyclerView4.addItemDecoration(new N4.s((int) getResources().getDimension(E4.c.f2000a)));
            recyclerView4.setItemAnimator(new DefaultItemAnimator());
            recyclerView4.setAdapter(new H4.c(bVar.k(), new f(bVar)));
        } else {
            recyclerView4.setVisibility(8);
            textView10.setVisibility(8);
            textView11.setVisibility(8);
            inflate.findViewById(E4.e.f2121h0).setVisibility(8);
        }
        TextView textView12 = (TextView) inflate.findViewById(E4.e.f2131k1);
        textView12.setTypeface(aVar2.t());
        textView12.setOnClickListener(new View.OnClickListener() { // from class: F4.r0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InstallerActivity.D1(InstallerActivity.this, bVar, view);
            }
        });
        TextView textView13 = (TextView) inflate.findViewById(E4.e.f2169x0);
        textView13.setTypeface(aVar2.t());
        textView13.setOnClickListener(new View.OnClickListener() { // from class: F4.s0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InstallerActivity.E1(InstallerActivity.this, view);
            }
        });
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(inflate);
        builder.setCancelable(true);
        this.f29673M = builder.create();
        if (!isFinishing()) {
            AlertDialog alertDialog3 = this.f29673M;
            if (alertDialog3 != null && (window = alertDialog3.getWindow()) != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            AlertDialog alertDialog4 = this.f29673M;
            if (alertDialog4 != null) {
                alertDialog4.show();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D1(InstallerActivity this$0, b splits, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(splits, "$splits");
        AlertDialog alertDialog = this$0.f29673M;
        AbstractC3159y.f(alertDialog);
        alertDialog.dismiss();
        this$0.P1(this$0, splits.y());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E1(InstallerActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AlertDialog alertDialog = this$0.f29673M;
        AbstractC3159y.f(alertDialog);
        alertDialog.dismiss();
        this$0.u1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String F1() {
        String language = Locale.getDefault().getLanguage();
        AbstractC3159y.h(language, "getDefault().language");
        return language;
    }

    private final void G1() {
        TextView textView;
        setContentView(E4.f.f2196t);
        try {
            this.f29679S = false;
            Intent intent = getIntent();
            if (intent != null) {
                Uri data = intent.getData();
                this.f29670J = data;
                if (data != null) {
                    N4.f fVar = new N4.f();
                    Uri uri = this.f29670J;
                    AbstractC3159y.f(uri);
                    this.f29666F = fVar.j(uri, this);
                }
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    if (extras.containsKey("realPath")) {
                        this.f29669I = extras.getString("realPath");
                    }
                    if (extras.containsKey("newFeatures")) {
                        this.f29681U = extras.getString("newFeatures");
                    }
                    if (extras.containsKey("requireUserAction")) {
                        this.f29682V = extras.getBoolean("requireUserAction");
                    }
                    if (extras.containsKey("action")) {
                        this.f29672L = extras.getString("action");
                    }
                    if (extras.containsKey("notificationId")) {
                        v1(this, extras.getInt("notificationId"));
                    }
                    if (extras.containsKey("backgroundInstallation")) {
                        this.f29683W = extras.getBoolean("backgroundInstallation");
                    }
                }
            }
            ImageView imageView = (ImageView) findViewById(E4.e.f2150r);
            this.f29665E = imageView;
            if (imageView != null) {
                imageView.setOnClickListener(new View.OnClickListener() { // from class: F4.w0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        InstallerActivity.H1(InstallerActivity.this, view);
                    }
                });
            }
            this.f29664D = (ImageView) findViewById(E4.e.f2156t);
            TextView textView2 = (TextView) findViewById(E4.e.f2119g1);
            this.f29696w = textView2;
            if (textView2 != null) {
                textView2.setTypeface(E4.j.f2272g.u());
            }
            TextView textView3 = (TextView) findViewById(E4.e.f2148q0);
            this.f29697x = textView3;
            if (textView3 != null) {
                textView3.setTypeface(E4.j.f2272g.t());
            }
            String str = this.f29666F;
            if (str != null) {
                TextView textView4 = this.f29696w;
                if (textView4 != null) {
                    textView4.setText(str);
                }
                String str2 = this.f29666F;
                AbstractC3159y.f(str2);
                if (g6.n.r(str2, ".apk", false, 2, null)) {
                    ImageView imageView2 = this.f29664D;
                    AbstractC3159y.f(imageView2);
                    imageView2.setImageResource(E4.d.f2001a);
                } else {
                    String str3 = this.f29666F;
                    AbstractC3159y.f(str3);
                    if (g6.n.r(str3, ".xapk", false, 2, null)) {
                        ImageView imageView3 = this.f29664D;
                        AbstractC3159y.f(imageView3);
                        imageView3.setImageResource(E4.d.f2017q);
                    }
                }
            } else {
                String str4 = this.f29669I;
                if (str4 != null && (textView = this.f29696w) != null) {
                    AbstractC3159y.f(str4);
                    String str5 = this.f29669I;
                    AbstractC3159y.f(str5);
                    String substring = str4.substring(g6.n.X(str5, "/", 0, false, 6, null) + 1);
                    AbstractC3159y.h(substring, "this as java.lang.String).substring(startIndex)");
                    textView.setText(substring);
                }
            }
            this.f29687p = (ProgressBar) findViewById(E4.e.f2036F);
            TextView textView5 = (TextView) findViewById(E4.e.f2047I1);
            this.f29689q = textView5;
            if (textView5 != null) {
                textView5.setTypeface(E4.j.f2272g.u());
            }
            TextView textView6 = (TextView) findViewById(E4.e.f2173y1);
            this.f29691r = textView6;
            if (textView6 != null) {
                textView6.setTypeface(E4.j.f2272g.u());
            }
            TextView textView7 = (TextView) findViewById(E4.e.f2023A1);
            this.f29661A = textView7;
            if (textView7 != null) {
                textView7.setTypeface(E4.j.f2272g.u());
            }
            TextView textView8 = (TextView) findViewById(E4.e.f2134l1);
            this.f29662B = textView8;
            if (textView8 != null) {
                textView8.setTypeface(E4.j.f2272g.t());
            }
            TextView textView9 = this.f29662B;
            if (textView9 != null) {
                textView9.setVisibility(8);
            }
            TextView textView10 = this.f29662B;
            if (textView10 != null) {
                textView10.setOnClickListener(new View.OnClickListener() { // from class: F4.x0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        InstallerActivity.I1(InstallerActivity.this, view);
                    }
                });
            }
            TextView textView11 = (TextView) findViewById(E4.e.f2172y0);
            this.f29663C = textView11;
            if (textView11 != null) {
                textView11.setTypeface(E4.j.f2272g.t());
            }
            TextView textView12 = this.f29663C;
            if (textView12 != null) {
                textView12.setVisibility(8);
            }
            TextView textView13 = this.f29663C;
            if (textView13 != null) {
                textView13.setOnClickListener(new View.OnClickListener() { // from class: F4.y0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        InstallerActivity.J1(InstallerActivity.this, view);
                    }
                });
            }
            String str6 = this.f29681U;
            if (str6 != null && str6.length() != 0) {
                TextView textView14 = this.f29691r;
                AbstractC3159y.f(textView14);
                textView14.setVisibility(8);
                final O o8 = new O();
                LinearLayout linearLayout = (LinearLayout) findViewById(E4.e.f2024B);
                LinearLayout linearLayout2 = (LinearLayout) findViewById(E4.e.f2027C);
                final TextView textView15 = (TextView) findViewById(E4.e.f2092X1);
                final ImageView imageView4 = (ImageView) findViewById(E4.e.f2162v);
                j.a aVar = E4.j.f2272g;
                textView15.setTypeface(aVar.t());
                final TextView textView16 = (TextView) findViewById(E4.e.f2095Y1);
                textView16.setTypeface(aVar.u());
                textView16.setText(this.f29681U);
                textView16.setVisibility(8);
                linearLayout2.setVisibility(0);
                linearLayout.setOnClickListener(new View.OnClickListener() { // from class: F4.z0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        InstallerActivity.K1(kotlin.jvm.internal.O.this, textView15, this, imageView4, textView16, view);
                    }
                });
            }
            M1();
            String str7 = this.f29672L;
            if (str7 != null && g6.n.s(str7, "delete", true)) {
                TextView textView17 = this.f29662B;
                if (textView17 != null) {
                    textView17.setVisibility(0);
                }
                TextView textView18 = this.f29662B;
                if (textView18 != null) {
                    textView18.setText(E4.h.f2245j0);
                }
                TextView textView19 = this.f29662B;
                if (textView19 != null) {
                    textView19.setTag(this.f29669I);
                }
                TextView textView20 = this.f29662B;
                if (textView20 != null) {
                    textView20.setOnClickListener(new View.OnClickListener() { // from class: F4.A0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            InstallerActivity.L1(InstallerActivity.this, view);
                        }
                    });
                }
                TextView textView21 = this.f29663C;
                if (textView21 != null) {
                    textView21.setVisibility(0);
                    return;
                }
                return;
            }
            this.f29675O = Y1();
            if (this.f29670J != null && this.f29666F != null) {
                N4.f fVar2 = new N4.f();
                String str8 = this.f29666F;
                AbstractC3159y.f(str8);
                if (fVar2.o(str8)) {
                    Uri uri2 = this.f29670J;
                    AbstractC3159y.f(uri2);
                    String str9 = this.f29666F;
                    AbstractC3159y.f(str9);
                    W1(uri2, str9);
                    return;
                }
            }
            c2(this.f29669I);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H1(InstallerActivity this$0, View view) {
        CharSequence charSequence;
        AbstractC3159y.i(this$0, "this$0");
        TextView textView = this$0.f29697x;
        if (textView != null) {
            charSequence = textView.getText();
        } else {
            charSequence = null;
        }
        String valueOf = String.valueOf(charSequence);
        Bundle bundle = new Bundle();
        bundle.putString("appNameAndVersion", valueOf);
        Application application = this$0.getApplication();
        AbstractC3159y.g(application, "null cannot be cast to non-null type com.uptodown.core.UptodownCoreApplication");
        ((E4.j) application).J().send(222, bundle);
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I1(InstallerActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        TextView textView = this$0.f29662B;
        if (textView != null) {
            textView.setVisibility(8);
        }
        this$0.c2(this$0.f29669I);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J1(InstallerActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.u1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K1(O expanded, TextView textView, InstallerActivity this$0, ImageView imageView, TextView textView2, View view) {
        AbstractC3159y.i(expanded, "$expanded");
        AbstractC3159y.i(this$0, "this$0");
        if (!expanded.f33743a) {
            textView.setText(this$0.getString(E4.h.f2266v));
            imageView.setImageDrawable(ContextCompat.getDrawable(this$0, E4.d.f2020t));
            textView2.setVisibility(0);
            expanded.f33743a = true;
            return;
        }
        textView.setText(this$0.getString(E4.h.f2265u));
        imageView.setImageDrawable(ContextCompat.getDrawable(this$0, E4.d.f2019s));
        textView2.setVisibility(8);
        expanded.f33743a = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L1(InstallerActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(view, "view");
        Object tag = view.getTag();
        AbstractC3159y.g(tag, "null cannot be cast to non-null type kotlin.String");
        String str = (String) tag;
        TextView textView = this$0.f29662B;
        if (textView != null) {
            textView.setVisibility(8);
        }
        new File(str).delete();
        this$0.finish();
    }

    private final void M1() {
        this.f29677Q = new h();
        this.f29678R = new i();
    }

    private final void N1(File file) {
        Context applicationContext = getApplicationContext();
        AbstractC3159y.h(applicationContext, "applicationContext");
        new N4.h(applicationContext, this.f29677Q).t(file, this.f29682V);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S1(InstallerActivity this$0, ActivityResult activityResult) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.finish();
    }

    private final boolean T1(File file) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(file);
        return U1(arrayList);
    }

    private final boolean U1(ArrayList arrayList) {
        try {
            if (!new G4.a(this).N() || arrayList.size() != 1) {
                return false;
            }
            String name = ((File) arrayList.get(0)).getName();
            AbstractC3159y.h(name, "files[0].name");
            if (!g6.n.r(name, ".apk", false, 2, null)) {
                return false;
            }
            PackageManager packageManager = getPackageManager();
            AbstractC3159y.h(packageManager, "packageManager");
            String absolutePath = ((File) arrayList.get(0)).getAbsolutePath();
            AbstractC3159y.h(absolutePath, "files[0].absolutePath");
            PackageInfo c8 = N4.q.c(packageManager, absolutePath, 0);
            if (c8 == null) {
                return false;
            }
            PackageManager packageManager2 = getPackageManager();
            AbstractC3159y.h(packageManager2, "packageManager");
            String str = c8.packageName;
            AbstractC3159y.h(str, "piFileToInstall.packageName");
            if (new N4.f().m(N4.q.d(packageManager2, str, 0)) != new N4.f().m(c8)) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private final void V1() {
        InterfaceC2855x0 d8;
        if (this.f29676P == null) {
            d8 = AbstractC2829k.d(N.a(C2812b0.b()), null, null, new j(null), 3, null);
            this.f29676P = d8;
        }
    }

    private final void W1(Uri uri, String str) {
        AbstractC2829k.d(N.a(C2812b0.b()), null, null, new k(uri, str, null), 3, null);
    }

    private final void X1(String str) {
        AbstractC2829k.d(N.a(C2812b0.b()), null, null, new l(str, null), 3, null);
    }

    private final ArrayList Y1() {
        String str;
        String str2;
        String string = getString(E4.h.f2230c);
        AbstractC3159y.h(string, "getString(R.string.app_name)");
        ArrayList arrayList = new ArrayList();
        try {
            String[] stringArray = getResources().getStringArray(E4.b.f1998a);
            AbstractC3159y.h(stringArray, "resources.getStringArray(R.array.messages_info)");
            int length = stringArray.length;
            int i8 = 0;
            while (true) {
                str = TypedValues.Custom.S_STRING;
                if (i8 >= length) {
                    break;
                }
                String string2 = stringArray[i8];
                AbstractC3159y.h(string2, "string");
                if (string2.length() > 0) {
                    if (g6.n.H(string2, "%s", false, 2, null)) {
                        arrayList.add(g6.n.A(string2, "%s", string, false, 4, null));
                    } else {
                        arrayList.add(string2);
                    }
                }
                i8++;
            }
            String[] stringArray2 = getResources().getStringArray(E4.b.f1999b);
            AbstractC3159y.h(stringArray2, "resources.getStringArray…array.messages_info_core)");
            int length2 = stringArray2.length;
            int i9 = 0;
            while (i9 < length2) {
                String str3 = stringArray2[i9];
                AbstractC3159y.h(str3, str);
                if (str3.length() > 0) {
                    if (g6.n.H(str3, "%s", false, 2, null)) {
                        str2 = str;
                        arrayList.add(g6.n.A(str3, "%s", string, false, 4, null));
                    } else {
                        str2 = str;
                        arrayList.add(str3);
                    }
                } else {
                    str2 = str;
                }
                i9++;
                str = str2;
            }
        } catch (Resources.NotFoundException e8) {
            e8.printStackTrace();
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object Z1(P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new m(null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6474a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a2(InstallerActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        Application application = this$0.getApplication();
        AbstractC3159y.g(application, "null cannot be cast to non-null type com.uptodown.core.UptodownCoreApplication");
        ((E4.j) application).J().send(225, null);
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b2(InstallerActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        Application application = this$0.getApplication();
        AbstractC3159y.g(application, "null cannot be cast to non-null type com.uptodown.core.UptodownCoreApplication");
        ((E4.j) application).J().send(226, null);
        this$0.G1();
    }

    private final void c2(String str) {
        if (str != null && new File(str).exists()) {
            if (N4.w.f7268b.a(str)) {
                X1(str);
                return;
            } else if (g6.n.r(str, ".apk", false, 2, null)) {
                O1(this, new File(str));
                return;
            } else {
                Toast.makeText(this, E4.h.f2211L, 0).show();
                finish();
                return;
            }
        }
        Toast.makeText(this, E4.h.f2211L, 0).show();
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d2(android.net.Uri r7, java.lang.String r8, P5.d r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.uptodown.core.activities.InstallerActivity.p
            if (r0 == 0) goto L13
            r0 = r9
            com.uptodown.core.activities.InstallerActivity$p r0 = (com.uptodown.core.activities.InstallerActivity.p) r0
            int r1 = r0.f29740f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29740f = r1
            goto L18
        L13:
            com.uptodown.core.activities.InstallerActivity$p r0 = new com.uptodown.core.activities.InstallerActivity$p
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f29738d
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f29740f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L46
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            L5.t.b(r9)
            goto L7a
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            java.lang.Object r7 = r0.f29737c
            r8 = r7
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r0.f29736b
            android.net.Uri r7 = (android.net.Uri) r7
            java.lang.Object r2 = r0.f29735a
            com.uptodown.core.activities.InstallerActivity r2 = (com.uptodown.core.activities.InstallerActivity) r2
            L5.t.b(r9)
            goto L62
        L46:
            L5.t.b(r9)
            i6.J0 r9 = i6.C2812b0.c()
            com.uptodown.core.activities.InstallerActivity$q r2 = new com.uptodown.core.activities.InstallerActivity$q
            r2.<init>(r5)
            r0.f29735a = r6
            r0.f29736b = r7
            r0.f29737c = r8
            r0.f29740f = r4
            java.lang.Object r9 = i6.AbstractC2825i.g(r9, r2, r0)
            if (r9 != r1) goto L61
            return r1
        L61:
            r2 = r6
        L62:
            i6.I r9 = i6.C2812b0.b()
            com.uptodown.core.activities.InstallerActivity$r r4 = new com.uptodown.core.activities.InstallerActivity$r
            r4.<init>(r8, r2, r7, r5)
            r0.f29735a = r5
            r0.f29736b = r5
            r0.f29737c = r5
            r0.f29740f = r3
            java.lang.Object r7 = i6.AbstractC2825i.g(r9, r4, r0)
            if (r7 != r1) goto L7a
            return r1
        L7a:
            L5.I r7 = L5.I.f6474a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.core.activities.InstallerActivity.d2(android.net.Uri, java.lang.String, P5.d):java.lang.Object");
    }

    private final void e2() {
        String str = this.f29669I;
        if (str != null) {
            AbstractC3159y.f(str);
            if (g6.n.r(str, ".apk", false, 2, null)) {
                PackageManager pm = getPackageManager();
                AbstractC3159y.h(pm, "pm");
                String str2 = this.f29669I;
                AbstractC3159y.f(str2);
                PackageInfo c8 = N4.q.c(pm, str2, 128);
                if (c8 != null) {
                    ImageView imageView = this.f29664D;
                    AbstractC3159y.f(imageView);
                    N4.f fVar = new N4.f();
                    String str3 = this.f29669I;
                    AbstractC3159y.f(str3);
                    imageView.setImageDrawable(fVar.h(this, str3));
                    N4.f fVar2 = new N4.f();
                    String str4 = this.f29669I;
                    AbstractC3159y.f(str4);
                    String b8 = fVar2.b(c8, str4, pm);
                    long m8 = new N4.f().m(c8);
                    N4.e eVar = new N4.e();
                    String str5 = this.f29669I;
                    AbstractC3159y.f(str5);
                    long f8 = eVar.f(str5);
                    j.a aVar = E4.j.f2272g;
                    String str6 = c8.packageName;
                    AbstractC3159y.h(str6, "pi.packageName");
                    aVar.v(str6, m8, b8, f8);
                    TextView textView = this.f29697x;
                    if (textView != null) {
                        textView.setText(getString(E4.h.f2228b, b8, c8.versionName));
                    }
                    TextView textView2 = this.f29697x;
                    if (textView2 != null) {
                        textView2.setVisibility(0);
                    }
                }
            }
        }
        TextView textView3 = this.f29696w;
        if (textView3 != null) {
            textView3.setText(this.f29666F);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f2(String str) {
        TextView textView = this.f29661A;
        if (textView != null) {
            textView.setText(str);
        }
        ProgressBar progressBar = this.f29687p;
        if (progressBar != null) {
            progressBar.setIndeterminate(false);
        }
        getWindow().clearFlags(128);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h2(InstallerActivity this$0) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.e2();
        this$0.V1();
        LinearLayout linearLayout = (LinearLayout) this$0.findViewById(E4.e.f2171y);
        if (!this$0.f29683W) {
            linearLayout.setVisibility(0);
            TextView textView = this$0.f29689q;
            if (textView != null) {
                textView.setText("");
            }
            TextView textView2 = this$0.f29661A;
            if (textView2 != null) {
                textView2.setText(E4.h.f2218S);
            }
            ProgressBar progressBar = this$0.f29687p;
            if (progressBar != null) {
                progressBar.setIndeterminate(true);
            }
            this$0.getWindow().addFlags(128);
            ImageView imageView = this$0.f29665E;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            TextView textView3 = this$0.f29663C;
            if (textView3 != null) {
                textView3.setVisibility(8);
                return;
            }
            return;
        }
        this$0.finish();
    }

    private final void i2(final ArrayList arrayList) {
        AlertDialog alertDialog;
        AlertDialog alertDialog2 = this.f29674N;
        if (alertDialog2 != null) {
            AbstractC3159y.f(alertDialog2);
            if (alertDialog2.isShowing()) {
                AlertDialog alertDialog3 = this.f29674N;
                AbstractC3159y.f(alertDialog3);
                alertDialog3.dismiss();
            }
        }
        Window window = null;
        View inflate = getLayoutInflater().inflate(E4.f.f2188l, (ViewGroup) null, false);
        TextView textView = (TextView) inflate.findViewById(E4.e.f2176z1);
        j.a aVar = E4.j.f2272g;
        textView.setTypeface(aVar.u());
        final CheckBox checkBox = (CheckBox) inflate.findViewById(E4.e.f2126j);
        checkBox.setTypeface(aVar.u());
        TextView textView2 = (TextView) inflate.findViewById(E4.e.f2128j1);
        textView2.setTypeface(aVar.t());
        textView2.setOnClickListener(new View.OnClickListener() { // from class: F4.B0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InstallerActivity.j2(InstallerActivity.this, checkBox, arrayList, view);
            }
        });
        TextView textView3 = (TextView) inflate.findViewById(E4.e.f2160u0);
        textView3.setTypeface(aVar.t());
        textView3.setOnClickListener(new View.OnClickListener() { // from class: F4.m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InstallerActivity.k2(InstallerActivity.this, view);
            }
        });
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(inflate);
        builder.setCancelable(false);
        AlertDialog create = builder.create();
        this.f29674N = create;
        if (create != null) {
            window = create.getWindow();
        }
        AbstractC3159y.f(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        if (!isFinishing() && (alertDialog = this.f29674N) != null) {
            alertDialog.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j2(InstallerActivity this$0, CheckBox checkBox, ArrayList files, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(files, "$files");
        this$0.f29679S = true;
        AlertDialog alertDialog = this$0.f29674N;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        if (checkBox.isChecked()) {
            new G4.a(this$0).J(false);
        }
        this$0.P1(this$0, files);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k2(InstallerActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AlertDialog alertDialog = this$0.f29674N;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        this$0.u1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0082 A[PHI: r9
  0x0082: PHI (r9v5 java.lang.Object) = (r9v4 java.lang.Object), (r9v1 java.lang.Object) binds: [B:17:0x007f, B:10:0x0029] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m2(java.lang.String r8, P5.d r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.uptodown.core.activities.InstallerActivity.x
            if (r0 == 0) goto L13
            r0 = r9
            com.uptodown.core.activities.InstallerActivity$x r0 = (com.uptodown.core.activities.InstallerActivity.x) r0
            int r1 = r0.f29770f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29770f = r1
            goto L18
        L13:
            com.uptodown.core.activities.InstallerActivity$x r0 = new com.uptodown.core.activities.InstallerActivity$x
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f29768d
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f29770f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L47
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            L5.t.b(r9)
            goto L82
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            java.lang.Object r8 = r0.f29767c
            kotlin.jvm.internal.O r8 = (kotlin.jvm.internal.O) r8
            java.lang.Object r2 = r0.f29766b
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r0.f29765a
            com.uptodown.core.activities.InstallerActivity r4 = (com.uptodown.core.activities.InstallerActivity) r4
            L5.t.b(r9)
            r9 = r8
            r8 = r2
            goto L6a
        L47:
            L5.t.b(r9)
            kotlin.jvm.internal.O r9 = new kotlin.jvm.internal.O
            r9.<init>()
            r9.f33743a = r4
            i6.J0 r2 = i6.C2812b0.c()
            com.uptodown.core.activities.InstallerActivity$y r6 = new com.uptodown.core.activities.InstallerActivity$y
            r6.<init>(r5)
            r0.f29765a = r7
            r0.f29766b = r8
            r0.f29767c = r9
            r0.f29770f = r4
            java.lang.Object r2 = i6.AbstractC2825i.g(r2, r6, r0)
            if (r2 != r1) goto L69
            return r1
        L69:
            r4 = r7
        L6a:
            i6.I r2 = i6.C2812b0.b()
            com.uptodown.core.activities.InstallerActivity$z r6 = new com.uptodown.core.activities.InstallerActivity$z
            r6.<init>(r8, r4, r9, r5)
            r0.f29765a = r5
            r0.f29766b = r5
            r0.f29767c = r5
            r0.f29770f = r3
            java.lang.Object r9 = i6.AbstractC2825i.g(r2, r6, r0)
            if (r9 != r1) goto L82
            return r1
        L82:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.core.activities.InstallerActivity.m2(java.lang.String, P5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u1() {
        N4.w wVar = this.f29671K;
        if (wVar != null) {
            wVar.b();
        }
        E4.j.f2272g.b();
        ArrayList arrayList = this.f29667G;
        if (arrayList != null) {
            AbstractC3159y.f(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                File file = (File) it.next();
                if (file != null && file.exists()) {
                    file.delete();
                }
            }
        }
        finish();
    }

    private final void v1(Context context, int i8) {
        Object systemService = context.getSystemService("notification");
        AbstractC3159y.g(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).cancel(i8);
    }

    private final void w1(final File file) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(getString(E4.h.f2253n0));
        builder.setMessage(E4.h.f2223X);
        builder.setCancelable(false);
        builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: F4.p0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                InstallerActivity.y1(InstallerActivity.this, file, dialogInterface, i8);
            }
        });
        builder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: F4.q0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                InstallerActivity.z1(InstallerActivity.this, file, dialogInterface, i8);
            }
        });
        builder.create().show();
    }

    private final void x1(final ArrayList arrayList) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(getString(E4.h.f2253n0));
        builder.setMessage(E4.h.f2223X);
        builder.setCancelable(false);
        builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: F4.n0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                InstallerActivity.A1(InstallerActivity.this, arrayList, dialogInterface, i8);
            }
        });
        builder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: F4.o0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                InstallerActivity.B1(InstallerActivity.this, arrayList, dialogInterface, i8);
            }
        });
        builder.create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y1(InstallerActivity this$0, File file, DialogInterface dialogInterface, int i8) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(file, "$file");
        G4.a aVar = new G4.a(this$0);
        aVar.M(true);
        aVar.B(true);
        this$0.O1(this$0, file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z1(InstallerActivity this$0, File file, DialogInterface dialogInterface, int i8) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(file, "$file");
        G4.a aVar = new G4.a(this$0);
        aVar.M(true);
        aVar.B(false);
        this$0.O1(this$0, file);
    }

    public final void O1(Activity activity, File file) {
        AbstractC3159y.i(activity, "activity");
        AbstractC3159y.i(file, "file");
        G4.a aVar = new G4.a(activity);
        boolean l8 = aVar.l();
        boolean s8 = aVar.s();
        if (!this.f29679S && T1(file)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(file);
            i2(arrayList);
            return;
        }
        if (!l8 && !s8) {
            N1(file);
            return;
        }
        if (!aVar.t()) {
            w1(file);
            return;
        }
        if (!aVar.m()) {
            N1(file);
            return;
        }
        if (aVar.l()) {
            r.a aVar2 = N4.r.f7224a;
            String absolutePath = file.getAbsolutePath();
            AbstractC3159y.h(absolutePath, "file.absolutePath");
            aVar2.b(absolutePath, activity, this.f29688p0);
            return;
        }
        if (aVar.s()) {
            new N4.v(activity, this.f29686Z).f(file);
        }
    }

    public final void P1(Activity activity, ArrayList files) {
        AbstractC3159y.i(activity, "activity");
        AbstractC3159y.i(files, "files");
        G4.a aVar = new G4.a(activity);
        boolean l8 = aVar.l();
        boolean s8 = aVar.s();
        if (!this.f29679S && U1(files)) {
            i2(files);
        } else if ((l8 || s8) && !aVar.t()) {
            x1(files);
        } else {
            new N4.h(activity, this.f29677Q).v(files, this.f29682V);
        }
    }

    public final void Q1() {
        try {
            unregisterReceiver(this.f29684X);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        E4.j.f2272g.b();
        finish();
    }

    public final void R1(String str) {
        try {
            unregisterReceiver(this.f29684X);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        Toast.makeText(this, str, 0).show();
        u1();
    }

    @Override // F4.r
    public void c0() {
    }

    @Override // F4.r
    public void d0() {
    }

    @Override // F4.r
    public void e0() {
    }

    @Override // F4.r
    public void f0() {
    }

    public final void g2() {
        runOnUiThread(new Runnable() { // from class: F4.v0
            @Override // java.lang.Runnable
            public final void run() {
                InstallerActivity.h2(InstallerActivity.this);
            }
        });
    }

    @Override // F4.r
    public void h0() {
    }

    @Override // F4.r
    public void l0() {
        J4.m mVar;
        if (X() && !new File("/Android/obb").canRead() && (mVar = this.f29678R) != null) {
            mVar.h();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l2(int r8, P5.d r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.uptodown.core.activities.InstallerActivity.u
            if (r0 == 0) goto L13
            r0 = r9
            com.uptodown.core.activities.InstallerActivity$u r0 = (com.uptodown.core.activities.InstallerActivity.u) r0
            int r1 = r0.f29757f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29757f = r1
            goto L18
        L13:
            com.uptodown.core.activities.InstallerActivity$u r0 = new com.uptodown.core.activities.InstallerActivity$u
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f29755d
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f29757f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L43
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            L5.t.b(r9)
            goto L7a
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            int r8 = r0.f29754c
            java.lang.Object r2 = r0.f29753b
            kotlin.jvm.internal.T r2 = (kotlin.jvm.internal.T) r2
            java.lang.Object r4 = r0.f29752a
            com.uptodown.core.activities.InstallerActivity r4 = (com.uptodown.core.activities.InstallerActivity) r4
            L5.t.b(r9)
            goto L64
        L43:
            L5.t.b(r9)
            kotlin.jvm.internal.T r2 = new kotlin.jvm.internal.T
            r2.<init>()
            i6.I r9 = i6.C2812b0.b()
            com.uptodown.core.activities.InstallerActivity$v r6 = new com.uptodown.core.activities.InstallerActivity$v
            r6.<init>(r2, r5)
            r0.f29752a = r7
            r0.f29753b = r2
            r0.f29754c = r8
            r0.f29757f = r4
            java.lang.Object r9 = i6.AbstractC2825i.g(r9, r6, r0)
            if (r9 != r1) goto L63
            return r1
        L63:
            r4 = r7
        L64:
            i6.J0 r9 = i6.C2812b0.c()
            com.uptodown.core.activities.InstallerActivity$w r6 = new com.uptodown.core.activities.InstallerActivity$w
            r6.<init>(r8, r2, r5)
            r0.f29752a = r5
            r0.f29753b = r5
            r0.f29757f = r3
            java.lang.Object r8 = i6.AbstractC2825i.g(r9, r6, r0)
            if (r8 != r1) goto L7a
            return r1
        L7a:
            L5.I r8 = L5.I.f6474a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.core.activities.InstallerActivity.l2(int, P5.d):java.lang.Object");
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        TextView textView;
        super.onCreate(bundle);
        j.a aVar = E4.j.f2272g;
        if (aVar.h() == null) {
            G1();
        } else {
            setContentView(E4.f.f2197u);
            this.f29680T = true;
            Application application = getApplication();
            AbstractC3159y.g(application, "null cannot be cast to non-null type com.uptodown.core.UptodownCoreApplication");
            String str = null;
            ((E4.j) application).J().send(224, null);
            TextView textView2 = (TextView) findViewById(E4.e.f2125i1);
            this.f29692s = textView2;
            AbstractC3159y.f(textView2);
            textView2.setTypeface(aVar.t());
            this.f29693t = (ImageView) findViewById(E4.e.f2144p);
            TextView textView3 = (TextView) findViewById(E4.e.f2154s0);
            this.f29694u = textView3;
            AbstractC3159y.f(textView3);
            textView3.setTypeface(aVar.t());
            TextView textView4 = (TextView) findViewById(E4.e.f2151r0);
            this.f29695v = textView4;
            AbstractC3159y.f(textView4);
            textView4.setTypeface(aVar.u());
            TextView textView5 = (TextView) findViewById(E4.e.f2140n1);
            this.f29698y = textView5;
            AbstractC3159y.f(textView5);
            textView5.setTypeface(aVar.u());
            TextView textView6 = (TextView) findViewById(E4.e.f2172y0);
            this.f29663C = textView6;
            AbstractC3159y.f(textView6);
            textView6.setTypeface(aVar.t());
            TextView textView7 = this.f29663C;
            AbstractC3159y.f(textView7);
            textView7.setOnClickListener(new View.OnClickListener() { // from class: F4.t0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    InstallerActivity.a2(InstallerActivity.this, view);
                }
            });
            TextView textView8 = (TextView) findViewById(E4.e.f2134l1);
            this.f29662B = textView8;
            AbstractC3159y.f(textView8);
            textView8.setTypeface(aVar.t());
            TextView textView9 = this.f29662B;
            AbstractC3159y.f(textView9);
            textView9.setOnClickListener(new View.OnClickListener() { // from class: F4.u0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    InstallerActivity.b2(InstallerActivity.this, view);
                }
            });
            this.f29687p = (ProgressBar) findViewById(E4.e.f2036F);
            TextView textView10 = (TextView) findViewById(E4.e.f2137m1);
            this.f29699z = textView10;
            AbstractC3159y.f(textView10);
            textView10.setTypeface(aVar.u());
            K4.a h8 = aVar.h();
            if (h8 != null) {
                str = h8.a();
            }
            if (str != null && (textView = this.f29699z) != null) {
                textView.setText(str);
            }
        }
        getOnBackPressedDispatcher().addCallback(this, this.f29685Y);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        InterfaceC2855x0 interfaceC2855x0 = this.f29676P;
        if (interfaceC2855x0 != null) {
            InterfaceC2855x0.a.a(interfaceC2855x0, null, 1, null);
        }
        getWindow().clearFlags(128);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        TextView textView;
        super.onResume();
        if (E4.j.f2272g.h() == null && (textView = this.f29698y) != null && textView.getVisibility() == 0) {
            AbstractC2829k.d(N.a(C2812b0.c()), null, null, new o(null), 3, null);
        }
    }
}
