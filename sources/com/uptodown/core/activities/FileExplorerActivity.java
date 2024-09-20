package com.uptodown.core.activities;

import E4.e;
import E4.h;
import E4.i;
import E4.j;
import F4.a1;
import H4.b;
import J4.c;
import J4.f;
import J4.g;
import L5.t;
import M5.AbstractC1246t;
import N4.s;
import N4.u;
import N4.x;
import O5.a;
import P5.d;
import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.core.view.ViewGroupKt;
import androidx.documentfile.provider.DocumentFile;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.uptodown.core.activities.FileExplorerActivity;
import g6.n;
import i6.AbstractC2825i;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.InterfaceC2855x0;
import i6.J0;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes4.dex */
public final class FileExplorerActivity extends a1 {

    /* renamed from: D0, reason: collision with root package name */
    public static final C2501a f29469D0 = new C2501a(null);

    /* renamed from: A, reason: collision with root package name */
    private RelativeLayout f29470A;

    /* renamed from: B, reason: collision with root package name */
    private LinearLayout f29472B;

    /* renamed from: C, reason: collision with root package name */
    private LinearLayout f29474C;

    /* renamed from: C0, reason: collision with root package name */
    private ActivityResultLauncher f29475C0;

    /* renamed from: D, reason: collision with root package name */
    private LinearLayout f29476D;

    /* renamed from: E, reason: collision with root package name */
    private HorizontalScrollView f29477E;

    /* renamed from: F, reason: collision with root package name */
    private TextView f29478F;

    /* renamed from: G, reason: collision with root package name */
    private TextView f29479G;

    /* renamed from: H, reason: collision with root package name */
    private TextView f29480H;

    /* renamed from: I, reason: collision with root package name */
    private SearchView f29481I;

    /* renamed from: J, reason: collision with root package name */
    private ImageView f29482J;

    /* renamed from: K, reason: collision with root package name */
    private RelativeLayout f29483K;

    /* renamed from: L, reason: collision with root package name */
    private RadioButton f29484L;

    /* renamed from: M, reason: collision with root package name */
    private RadioButton f29485M;

    /* renamed from: N, reason: collision with root package name */
    private RadioButton f29486N;

    /* renamed from: O, reason: collision with root package name */
    private AlertDialog f29487O;

    /* renamed from: P, reason: collision with root package name */
    private Toolbar f29488P;

    /* renamed from: Q, reason: collision with root package name */
    private TextView f29489Q;

    /* renamed from: R, reason: collision with root package name */
    private b f29490R;

    /* renamed from: S, reason: collision with root package name */
    private ArrayList f29491S;

    /* renamed from: T, reason: collision with root package name */
    private ArrayList f29492T;

    /* renamed from: U, reason: collision with root package name */
    private DocumentFile f29493U;

    /* renamed from: V, reason: collision with root package name */
    private ArrayList f29494V;

    /* renamed from: W, reason: collision with root package name */
    private ArrayList f29495W;

    /* renamed from: X, reason: collision with root package name */
    private ArrayList f29496X;

    /* renamed from: Y, reason: collision with root package name */
    private File f29497Y;

    /* renamed from: Z, reason: collision with root package name */
    private boolean f29498Z;

    /* renamed from: p0, reason: collision with root package name */
    private boolean f29499p0;

    /* renamed from: q0, reason: collision with root package name */
    private Object f29500q0;

    /* renamed from: r0, reason: collision with root package name */
    private ArrayList f29501r0;

    /* renamed from: s0, reason: collision with root package name */
    private boolean f29502s0;

    /* renamed from: t0, reason: collision with root package name */
    private boolean f29503t0;

    /* renamed from: u0, reason: collision with root package name */
    private TabLayout f29504u0;

    /* renamed from: v0, reason: collision with root package name */
    private TextView f29505v0;

    /* renamed from: w0, reason: collision with root package name */
    private Uri f29506w0;

    /* renamed from: x, reason: collision with root package name */
    private TextView f29507x;

    /* renamed from: x0, reason: collision with root package name */
    private String f29508x0;

    /* renamed from: y, reason: collision with root package name */
    private RecyclerView f29509y;

    /* renamed from: z, reason: collision with root package name */
    private RelativeLayout f29511z;

    /* renamed from: y0, reason: collision with root package name */
    private C f29510y0 = new C();

    /* renamed from: z0, reason: collision with root package name */
    private final C2506f f29512z0 = new C2506f();

    /* renamed from: A0, reason: collision with root package name */
    private final G f29471A0 = new G();

    /* renamed from: B0, reason: collision with root package name */
    private final E f29473B0 = new E();

    /* loaded from: classes4.dex */
    public static final class A implements f {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ File f29514b;

        A(File file) {
            this.f29514b = file;
        }

        @Override // J4.f
        public void a() {
            i.f(new i(FileExplorerActivity.this), this.f29514b, null, false, 6, null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class B implements f {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ DocumentFile f29516b;

        B(DocumentFile documentFile) {
            this.f29516b = documentFile;
        }

        @Override // J4.f
        public void a() {
            i iVar = new i(FileExplorerActivity.this);
            Uri uri = this.f29516b.getUri();
            AbstractC3159y.h(uri, "documentFile.uri");
            i.e(iVar, uri, null, false, false, 14, null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class C implements g {
        C() {
        }

        @Override // J4.g
        public void a(Object item, int i8) {
            AbstractC3159y.i(item, "item");
            b bVar = FileExplorerActivity.this.f29490R;
            if (bVar != null && bVar.c()) {
                b bVar2 = FileExplorerActivity.this.f29490R;
                AbstractC3159y.f(bVar2);
                bVar2.h(i8);
                FileExplorerActivity.this.b5();
                return;
            }
            if (item instanceof File) {
                File file = (File) item;
                if (file.isDirectory()) {
                    FileExplorerActivity.this.f29497Y = file;
                    FileExplorerActivity.this.f29493U = null;
                    FileExplorerActivity.q4(FileExplorerActivity.this, false, 1, null);
                    return;
                }
                N4.f fVar = new N4.f();
                String name = file.getName();
                AbstractC3159y.h(name, "item.name");
                if (fVar.o(name)) {
                    FileExplorerActivity.this.n4(file);
                    return;
                }
                String name2 = file.getName();
                AbstractC3159y.h(name2, "item.name");
                if (n.r(name2, ".zip", false, 2, null)) {
                    FileExplorerActivity.this.f4(item);
                    return;
                } else {
                    FileExplorerActivity.this.O4(file);
                    return;
                }
            }
            if (item instanceof DocumentFile) {
                DocumentFile documentFile = (DocumentFile) item;
                if (documentFile.isDirectory()) {
                    FileExplorerActivity.this.f29493U = documentFile;
                    FileExplorerActivity.this.f29497Y = null;
                    FileExplorerActivity.q4(FileExplorerActivity.this, false, 1, null);
                    return;
                }
                if (documentFile.getName() != null) {
                    N4.f fVar2 = new N4.f();
                    String name3 = documentFile.getName();
                    AbstractC3159y.f(name3);
                    if (fVar2.o(name3)) {
                        FileExplorerActivity.this.m4(documentFile);
                        return;
                    }
                }
                if (documentFile.getName() != null) {
                    String name4 = documentFile.getName();
                    AbstractC3159y.f(name4);
                    if (n.r(name4, ".zip", false, 2, null)) {
                        FileExplorerActivity.this.f4(item);
                        return;
                    }
                }
                FileExplorerActivity.this.N4(documentFile);
            }
        }

        @Override // J4.g
        public void b(Object item, int i8) {
            AbstractC3159y.i(item, "item");
            b bVar = FileExplorerActivity.this.f29490R;
            AbstractC3159y.f(bVar);
            if (bVar.c()) {
                b bVar2 = FileExplorerActivity.this.f29490R;
                AbstractC3159y.f(bVar2);
                bVar2.h(i8);
                FileExplorerActivity.this.b5();
                return;
            }
            FileExplorerActivity.this.I3(item, i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class D implements J4.i {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f29519b;

        D(String str) {
            this.f29519b = str;
        }

        @Override // J4.i
        public void a(ArrayList items) {
            AbstractC3159y.i(items, "items");
            FileExplorerActivity.this.f29492T = items;
            FileExplorerActivity.this.f29491S = items;
            FileExplorerActivity.this.f29496X = null;
            FileExplorerActivity.this.f29495W = null;
            FileExplorerActivity fileExplorerActivity = FileExplorerActivity.this;
            SearchView searchView = fileExplorerActivity.f29481I;
            AbstractC3159y.f(searchView);
            fileExplorerActivity.v3(searchView.getQuery().toString(), this.f29519b);
        }

        @Override // J4.i
        public void b(ArrayList items) {
            AbstractC3159y.i(items, "items");
            FileExplorerActivity.this.f29496X = items;
            FileExplorerActivity.this.f29495W = items;
            FileExplorerActivity.this.f29492T = null;
            FileExplorerActivity.this.f29491S = null;
            if (FileExplorerActivity.this.f29497Y != null) {
                File file = FileExplorerActivity.this.f29497Y;
                AbstractC3159y.f(file);
                if (!file.canRead()) {
                    ArrayList arrayList = FileExplorerActivity.this.f29496X;
                    AbstractC3159y.f(arrayList);
                    if (arrayList.isEmpty()) {
                        File externalStorageDirectory = Environment.getExternalStorageDirectory();
                        File file2 = FileExplorerActivity.this.f29497Y;
                        AbstractC3159y.f(file2);
                        if (file2.getAbsolutePath().equals(externalStorageDirectory.getAbsolutePath() + "/Android/data")) {
                            File file3 = new File(FileExplorerActivity.this.f29497Y, FileExplorerActivity.this.getPackageName());
                            if (file3.exists() && file3.canRead()) {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(new File(FileExplorerActivity.this.f29497Y, FileExplorerActivity.this.getPackageName()));
                                FileExplorerActivity.this.f29496X = arrayList2;
                                FileExplorerActivity.this.f29495W = arrayList2;
                            }
                        }
                    }
                }
            }
            FileExplorerActivity fileExplorerActivity = FileExplorerActivity.this;
            SearchView searchView = fileExplorerActivity.f29481I;
            AbstractC3159y.f(searchView);
            fileExplorerActivity.v3(searchView.getQuery().toString(), this.f29519b);
        }
    }

    /* loaded from: classes4.dex */
    public static final class E extends OnBackPressedCallback {
        E() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            b bVar = FileExplorerActivity.this.f29490R;
            if (bVar != null && bVar.c()) {
                b bVar2 = FileExplorerActivity.this.f29490R;
                AbstractC3159y.f(bVar2);
                bVar2.i(false);
                FileExplorerActivity.this.l4();
                return;
            }
            if (FileExplorerActivity.this.f29493U != null) {
                DocumentFile documentFile = FileExplorerActivity.this.f29493U;
                AbstractC3159y.f(documentFile);
                String name = documentFile.getName();
                DocumentFile documentFile2 = FileExplorerActivity.this.f29493U;
                AbstractC3159y.f(documentFile2);
                DocumentFile parentFile = documentFile2.getParentFile();
                if (parentFile != null) {
                    FileExplorerActivity.this.f29493U = parentFile;
                    FileExplorerActivity.this.f29497Y = null;
                    FileExplorerActivity.this.T4();
                    FileExplorerActivity.this.o4(name);
                    SearchView searchView = FileExplorerActivity.this.f29481I;
                    if (searchView != null) {
                        FileExplorerActivity.this.z3(searchView);
                        return;
                    }
                    return;
                }
                FileExplorerActivity.this.finish();
                return;
            }
            if (FileExplorerActivity.this.f29497Y != null && !AbstractC3159y.d(FileExplorerActivity.this.f29497Y, Environment.getExternalStorageDirectory())) {
                File file = FileExplorerActivity.this.f29497Y;
                AbstractC3159y.f(file);
                String name2 = file.getName();
                File file2 = FileExplorerActivity.this.f29497Y;
                AbstractC3159y.f(file2);
                File parentFile2 = file2.getParentFile();
                if (parentFile2 != null) {
                    FileExplorerActivity.this.f29497Y = parentFile2;
                    FileExplorerActivity.this.f29493U = null;
                    FileExplorerActivity.this.T4();
                    FileExplorerActivity.this.o4(name2);
                    SearchView searchView2 = FileExplorerActivity.this.f29481I;
                    if (searchView2 != null) {
                        FileExplorerActivity.this.z3(searchView2);
                        return;
                    }
                    return;
                }
                FileExplorerActivity.this.finish();
                return;
            }
            FileExplorerActivity.this.finish();
        }
    }

    /* loaded from: classes4.dex */
    public static final class F implements TabLayout.OnTabSelectedListener {
        F() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            if (tab == null || tab.getId() != 0) {
                FileExplorerActivity.this.f29499p0 = true;
                ArrayList arrayList = FileExplorerActivity.this.f29494V;
                AbstractC3159y.f(arrayList);
                if (arrayList.size() > 0) {
                    FileExplorerActivity.this.U4();
                    FileExplorerActivity.this.x3();
                    return;
                }
                return;
            }
            FileExplorerActivity.this.f29499p0 = false;
            RecyclerView recyclerView = FileExplorerActivity.this.f29509y;
            if (recyclerView == null) {
                AbstractC3159y.y("rvFiles");
                recyclerView = null;
            }
            recyclerView.setVisibility(0);
            LinearLayout linearLayout = FileExplorerActivity.this.f29472B;
            if (linearLayout == null) {
                AbstractC3159y.y("llPermissionExplanation");
                linearLayout = null;
            }
            linearLayout.setVisibility(8);
            RecyclerView recyclerView2 = FileExplorerActivity.this.f29509y;
            if (recyclerView2 == null) {
                AbstractC3159y.y("rvFiles");
                recyclerView2 = null;
            }
            recyclerView2.setVisibility(0);
            FileExplorerActivity.this.U4();
            FileExplorerActivity.this.a5();
            FileExplorerActivity.q4(FileExplorerActivity.this, false, 1, null);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    /* loaded from: classes4.dex */
    public static final class G implements SearchView.OnQueryTextListener {
        G() {
        }

        @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
        public boolean onQueryTextChange(String newText) {
            AbstractC3159y.i(newText, "newText");
            FileExplorerActivity.this.v3(newText, null);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
        public boolean onQueryTextSubmit(String query) {
            AbstractC3159y.i(query, "query");
            FileExplorerActivity.this.v3(query, null);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class H extends l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29523a;

        H(d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new H(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, d dVar) {
            return ((H) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f29523a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                FileExplorerActivity fileExplorerActivity = FileExplorerActivity.this;
                this.f29523a = 1;
                if (fileExplorerActivity.Q4(this) == e8) {
                    return e8;
                }
            }
            return L5.I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class I extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f29525a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f29526b;

        /* renamed from: d, reason: collision with root package name */
        int f29528d;

        I(d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f29526b = obj;
            this.f29528d |= Integer.MIN_VALUE;
            return FileExplorerActivity.this.Q4(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class J extends l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29529a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f29530b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f29532a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ FileExplorerActivity f29533b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(FileExplorerActivity fileExplorerActivity, d dVar) {
                super(2, dVar);
                this.f29533b = fileExplorerActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new a(this.f29533b, dVar);
            }

            @Override // X5.n
            public final Object invoke(i6.M m8, d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f29532a == 0) {
                    t.b(obj);
                    this.f29533b.l5();
                    return L5.I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f29534a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ FileExplorerActivity f29535b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(FileExplorerActivity fileExplorerActivity, d dVar) {
                super(2, dVar);
                this.f29535b = fileExplorerActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new b(this.f29535b, dVar);
            }

            @Override // X5.n
            public final Object invoke(i6.M m8, d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f29534a == 0) {
                    t.b(obj);
                    this.f29535b.j5();
                    return L5.I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class c extends l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f29536a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ FileExplorerActivity f29537b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(FileExplorerActivity fileExplorerActivity, d dVar) {
                super(2, dVar);
                this.f29537b = fileExplorerActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new c(this.f29537b, dVar);
            }

            @Override // X5.n
            public final Object invoke(i6.M m8, d dVar) {
                return ((c) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f29536a == 0) {
                    t.b(obj);
                    this.f29537b.k5();
                    return L5.I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        J(d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            J j8 = new J(dVar);
            j8.f29530b = obj;
            return j8;
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, d dVar) {
            return ((J) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            i6.U b8;
            i6.U b9;
            i6.U b10;
            Object e8 = Q5.b.e();
            int i8 = this.f29529a;
            if (i8 != 0) {
                if (i8 != 1 && i8 != 2 && i8 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                i6.M m8 = (i6.M) this.f29530b;
                RadioButton radioButton = FileExplorerActivity.this.f29484L;
                AbstractC3159y.f(radioButton);
                if (radioButton.isChecked()) {
                    b10 = AbstractC2829k.b(m8, null, null, new c(FileExplorerActivity.this, null), 3, null);
                    this.f29529a = 1;
                    if (b10.g(this) == e8) {
                        return e8;
                    }
                } else {
                    RadioButton radioButton2 = FileExplorerActivity.this.f29485M;
                    AbstractC3159y.f(radioButton2);
                    if (radioButton2.isChecked()) {
                        b9 = AbstractC2829k.b(m8, null, null, new a(FileExplorerActivity.this, null), 3, null);
                        this.f29529a = 2;
                        if (b9.g(this) == e8) {
                            return e8;
                        }
                    } else {
                        RadioButton radioButton3 = FileExplorerActivity.this.f29486N;
                        AbstractC3159y.f(radioButton3);
                        if (radioButton3.isChecked()) {
                            b8 = AbstractC2829k.b(m8, null, null, new b(FileExplorerActivity.this, null), 3, null);
                            this.f29529a = 3;
                            if (b8.g(this) == e8) {
                                return e8;
                            }
                        }
                    }
                }
            }
            return L5.I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class K extends l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29538a;

        K(d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new K(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, d dVar) {
            return ((K) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f29538a == 0) {
                t.b(obj);
                FileExplorerActivity.this.Z4();
                RelativeLayout relativeLayout = FileExplorerActivity.this.f29511z;
                if (relativeLayout == null) {
                    AbstractC3159y.y("rlLoading");
                    relativeLayout = null;
                }
                relativeLayout.setVisibility(8);
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes4.dex */
    public static final class L implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return a.a(Long.valueOf(((DocumentFile) obj).lastModified()), Long.valueOf(((DocumentFile) obj2).lastModified()));
        }
    }

    /* loaded from: classes4.dex */
    public static final class M implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return a.a(Boolean.valueOf(((DocumentFile) obj).isFile()), Boolean.valueOf(((DocumentFile) obj2).isFile()));
        }
    }

    /* loaded from: classes4.dex */
    public static final class N implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return a.a(Long.valueOf(((File) obj).lastModified()), Long.valueOf(((File) obj2).lastModified()));
        }
    }

    /* loaded from: classes4.dex */
    public static final class O implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return a.a(Boolean.valueOf(((File) obj).isFile()), Boolean.valueOf(((File) obj2).isFile()));
        }
    }

    /* loaded from: classes4.dex */
    public static final class P implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return a.a(Long.valueOf(((DocumentFile) obj2).lastModified()), Long.valueOf(((DocumentFile) obj).lastModified()));
        }
    }

    /* loaded from: classes4.dex */
    public static final class Q implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return a.a(Boolean.valueOf(((DocumentFile) obj2).isDirectory()), Boolean.valueOf(((DocumentFile) obj).isDirectory()));
        }
    }

    /* loaded from: classes4.dex */
    public static final class R implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return a.a(Long.valueOf(((File) obj2).lastModified()), Long.valueOf(((File) obj).lastModified()));
        }
    }

    /* loaded from: classes4.dex */
    public static final class S implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return a.a(Boolean.valueOf(((File) obj2).isDirectory()), Boolean.valueOf(((File) obj).isDirectory()));
        }
    }

    /* loaded from: classes4.dex */
    public static final class T implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            String str;
            String name = ((DocumentFile) obj).getName();
            String str2 = null;
            if (name != null) {
                AbstractC3159y.h(name, "name");
                str = name.toUpperCase(Locale.ROOT);
                AbstractC3159y.h(str, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            } else {
                str = null;
            }
            String name2 = ((DocumentFile) obj2).getName();
            if (name2 != null) {
                AbstractC3159y.h(name2, "name");
                str2 = name2.toUpperCase(Locale.ROOT);
                AbstractC3159y.h(str2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            }
            return a.a(str, str2);
        }
    }

    /* loaded from: classes4.dex */
    public static final class U implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return a.a(Boolean.valueOf(((DocumentFile) obj).isFile()), Boolean.valueOf(((DocumentFile) obj2).isFile()));
        }
    }

    /* loaded from: classes4.dex */
    public static final class V implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            String name = ((File) obj).getName();
            AbstractC3159y.h(name, "it.name");
            Locale locale = Locale.ROOT;
            String upperCase = name.toUpperCase(locale);
            AbstractC3159y.h(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            String name2 = ((File) obj2).getName();
            AbstractC3159y.h(name2, "it.name");
            String upperCase2 = name2.toUpperCase(locale);
            AbstractC3159y.h(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            return a.a(upperCase, upperCase2);
        }
    }

    /* loaded from: classes4.dex */
    public static final class W implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return a.a(Boolean.valueOf(((File) obj).isFile()), Boolean.valueOf(((File) obj2).isFile()));
        }
    }

    /* loaded from: classes4.dex */
    public static final class X implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            String str;
            String name = ((DocumentFile) obj2).getName();
            String str2 = null;
            if (name != null) {
                AbstractC3159y.h(name, "name");
                str = name.toUpperCase(Locale.ROOT);
                AbstractC3159y.h(str, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            } else {
                str = null;
            }
            String name2 = ((DocumentFile) obj).getName();
            if (name2 != null) {
                AbstractC3159y.h(name2, "name");
                str2 = name2.toUpperCase(Locale.ROOT);
                AbstractC3159y.h(str2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            }
            return a.a(str, str2);
        }
    }

    /* loaded from: classes4.dex */
    public static final class Y implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return a.a(Boolean.valueOf(((DocumentFile) obj2).isDirectory()), Boolean.valueOf(((DocumentFile) obj).isDirectory()));
        }
    }

    /* loaded from: classes4.dex */
    public static final class Z implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            String name = ((File) obj2).getName();
            AbstractC3159y.h(name, "it.name");
            Locale locale = Locale.ROOT;
            String upperCase = name.toUpperCase(locale);
            AbstractC3159y.h(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            String name2 = ((File) obj).getName();
            AbstractC3159y.h(name2, "it.name");
            String upperCase2 = name2.toUpperCase(locale);
            AbstractC3159y.h(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            return a.a(upperCase, upperCase2);
        }
    }

    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$a, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2501a {
        private C2501a() {
        }

        public /* synthetic */ C2501a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class a0 implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return a.a(Boolean.valueOf(((File) obj2).isDirectory()), Boolean.valueOf(((File) obj).isDirectory()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$b, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2502b extends l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29540a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f29542c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f29543d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.uptodown.core.activities.FileExplorerActivity$b$a */
        /* loaded from: classes4.dex */
        public static final class a extends l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f29544a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ FileExplorerActivity f29545b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f29546c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f29547d;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.uptodown.core.activities.FileExplorerActivity$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0708a extends l implements X5.n {

                /* renamed from: a, reason: collision with root package name */
                int f29548a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ FileExplorerActivity f29549b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f29550c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0708a(FileExplorerActivity fileExplorerActivity, String str, d dVar) {
                    super(2, dVar);
                    this.f29549b = fileExplorerActivity;
                    this.f29550c = str;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final d create(Object obj, d dVar) {
                    return new C0708a(this.f29549b, this.f29550c, dVar);
                }

                @Override // X5.n
                public final Object invoke(i6.M m8, d dVar) {
                    return ((C0708a) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Q5.b.e();
                    if (this.f29548a == 0) {
                        t.b(obj);
                        RelativeLayout relativeLayout = this.f29549b.f29511z;
                        if (relativeLayout == null) {
                            AbstractC3159y.y("rlLoading");
                            relativeLayout = null;
                        }
                        relativeLayout.setVisibility(8);
                        this.f29549b.g5(this.f29550c);
                        this.f29549b.w3();
                        return L5.I.f6474a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(FileExplorerActivity fileExplorerActivity, String str, String str2, d dVar) {
                super(2, dVar);
                this.f29545b = fileExplorerActivity;
                this.f29546c = str;
                this.f29547d = str2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new a(this.f29545b, this.f29546c, this.f29547d, dVar);
            }

            @Override // X5.n
            public final Object invoke(i6.M m8, d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = Q5.b.e();
                int i8 = this.f29544a;
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 == 2) {
                            t.b(obj);
                            return L5.I.f6474a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                } else {
                    t.b(obj);
                    this.f29545b.Y4(this.f29546c);
                    FileExplorerActivity fileExplorerActivity = this.f29545b;
                    this.f29544a = 1;
                    if (fileExplorerActivity.Q4(this) == e8) {
                        return e8;
                    }
                }
                J0 c8 = C2812b0.c();
                C0708a c0708a = new C0708a(this.f29545b, this.f29547d, null);
                this.f29544a = 2;
                if (AbstractC2825i.g(c8, c0708a, this) == e8) {
                    return e8;
                }
                return L5.I.f6474a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2502b(String str, String str2, d dVar) {
            super(2, dVar);
            this.f29542c = str;
            this.f29543d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C2502b(this.f29542c, this.f29543d, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, d dVar) {
            return ((C2502b) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f29540a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                i6.I b8 = C2812b0.b();
                a aVar = new a(FileExplorerActivity.this, this.f29542c, this.f29543d, null);
                this.f29540a = 1;
                if (AbstractC2825i.g(b8, aVar, this) == e8) {
                    return e8;
                }
            }
            return L5.I.f6474a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b0 implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return a.a(Long.valueOf(((DocumentFile) obj).length()), Long.valueOf(((DocumentFile) obj2).length()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$c, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2503c extends l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29551a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f29552b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ DocumentFile f29553c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ c f29554d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ FileExplorerActivity f29555e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.uptodown.core.activities.FileExplorerActivity$c$a */
        /* loaded from: classes4.dex */
        public static final class a extends l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f29556a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ FileExplorerActivity f29557b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(FileExplorerActivity fileExplorerActivity, d dVar) {
                super(2, dVar);
                this.f29557b = fileExplorerActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new a(this.f29557b, dVar);
            }

            @Override // X5.n
            public final Object invoke(i6.M m8, d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f29556a == 0) {
                    t.b(obj);
                    this.f29557b.n5();
                    return L5.I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2503c(ArrayList arrayList, DocumentFile documentFile, c cVar, FileExplorerActivity fileExplorerActivity, d dVar) {
            super(2, dVar);
            this.f29552b = arrayList;
            this.f29553c = documentFile;
            this.f29554d = cVar;
            this.f29555e = fileExplorerActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C2503c(this.f29552b, this.f29553c, this.f29554d, this.f29555e, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, d dVar) {
            return ((C2503c) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f29551a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        t.b(obj);
                        return L5.I.f6474a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                x xVar = new x();
                ArrayList arrayList = this.f29552b;
                DocumentFile documentFile = this.f29553c;
                c cVar = this.f29554d;
                Context applicationContext = this.f29555e.getApplicationContext();
                AbstractC3159y.h(applicationContext, "applicationContext");
                this.f29551a = 1;
                if (xVar.h(arrayList, documentFile, cVar, applicationContext, this) == e8) {
                    return e8;
                }
            }
            J0 c8 = C2812b0.c();
            a aVar = new a(this.f29555e, null);
            this.f29551a = 2;
            if (AbstractC2825i.g(c8, aVar, this) == e8) {
                return e8;
            }
            return L5.I.f6474a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c0 implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return a.a(Boolean.valueOf(((DocumentFile) obj).isFile()), Boolean.valueOf(((DocumentFile) obj2).isFile()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$d, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2504d extends l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29558a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f29559b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ File f29560c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ c f29561d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ FileExplorerActivity f29562e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.uptodown.core.activities.FileExplorerActivity$d$a */
        /* loaded from: classes4.dex */
        public static final class a extends l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f29563a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ FileExplorerActivity f29564b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(FileExplorerActivity fileExplorerActivity, d dVar) {
                super(2, dVar);
                this.f29564b = fileExplorerActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new a(this.f29564b, dVar);
            }

            @Override // X5.n
            public final Object invoke(i6.M m8, d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f29563a == 0) {
                    t.b(obj);
                    this.f29564b.n5();
                    return L5.I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2504d(ArrayList arrayList, File file, c cVar, FileExplorerActivity fileExplorerActivity, d dVar) {
            super(2, dVar);
            this.f29559b = arrayList;
            this.f29560c = file;
            this.f29561d = cVar;
            this.f29562e = fileExplorerActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C2504d(this.f29559b, this.f29560c, this.f29561d, this.f29562e, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, d dVar) {
            return ((C2504d) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f29558a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        t.b(obj);
                        return L5.I.f6474a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                x xVar = new x();
                ArrayList arrayList = this.f29559b;
                File file = this.f29560c;
                c cVar = this.f29561d;
                this.f29558a = 1;
                if (xVar.i(arrayList, file, cVar, this) == e8) {
                    return e8;
                }
            }
            J0 c8 = C2812b0.c();
            a aVar = new a(this.f29562e, null);
            this.f29558a = 2;
            if (AbstractC2825i.g(c8, aVar, this) == e8) {
                return e8;
            }
            return L5.I.f6474a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class d0 implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return a.a(Long.valueOf(((File) obj).length()), Long.valueOf(((File) obj2).length()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$e, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2505e extends l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29565a;

        C2505e(d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C2505e(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, d dVar) {
            return ((C2505e) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f29565a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                FileExplorerActivity fileExplorerActivity = FileExplorerActivity.this;
                this.f29565a = 1;
                if (fileExplorerActivity.D3(this) == e8) {
                    return e8;
                }
            }
            return L5.I.f6474a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class e0 implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return a.a(Boolean.valueOf(((File) obj).isFile()), Boolean.valueOf(((File) obj2).isFile()));
        }
    }

    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$f, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2506f implements J4.d {
        C2506f() {
        }

        @Override // J4.d
        public void a(DocumentFile docFile) {
            AbstractC3159y.i(docFile, "docFile");
        }

        @Override // J4.d
        public void b(int i8) {
            ((ProgressBar) FileExplorerActivity.this.findViewById(e.f2039G)).setProgress(i8);
        }

        @Override // J4.d
        public void c(File file) {
            AbstractC3159y.i(file, "file");
        }

        @Override // J4.d
        public void d(DocumentFile docFile) {
            AbstractC3159y.i(docFile, "docFile");
        }

        @Override // J4.d
        public void e(File file) {
            AbstractC3159y.i(file, "file");
        }

        @Override // J4.d
        public void f(Object file, int i8) {
            String string;
            AbstractC3159y.i(file, "file");
            RelativeLayout relativeLayout = FileExplorerActivity.this.f29470A;
            if (relativeLayout == null) {
                AbstractC3159y.y("rlLoadingAction");
                relativeLayout = null;
            }
            relativeLayout.setVisibility(0);
            View findViewById = FileExplorerActivity.this.findViewById(e.f2164v1);
            FileExplorerActivity fileExplorerActivity = FileExplorerActivity.this;
            TextView textView = (TextView) findViewById;
            textView.setTypeface(j.f2272g.u());
            if (file instanceof File) {
                string = fileExplorerActivity.getString(h.f2240h, ((File) file).getName());
            } else if (file instanceof DocumentFile) {
                string = fileExplorerActivity.getString(h.f2240h, ((DocumentFile) file).getName());
            } else {
                string = fileExplorerActivity.getString(h.f2240h);
            }
            textView.setText(string);
        }

        @Override // J4.d
        public void g() {
        }

        @Override // J4.d
        public void h(Object file) {
            AbstractC3159y.i(file, "file");
        }

        @Override // J4.d
        public void i() {
            FileExplorerActivity.this.f29501r0 = null;
            FileExplorerActivity.this.l4();
            RelativeLayout relativeLayout = FileExplorerActivity.this.f29470A;
            if (relativeLayout == null) {
                AbstractC3159y.y("rlLoadingAction");
                relativeLayout = null;
            }
            relativeLayout.setVisibility(8);
            FileExplorerActivity.q4(FileExplorerActivity.this, false, 1, null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class f0 implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return a.a(Long.valueOf(((DocumentFile) obj2).length()), Long.valueOf(((DocumentFile) obj).length()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$g, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2507g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f29568a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f29569b;

        /* renamed from: d, reason: collision with root package name */
        int f29571d;

        C2507g(d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f29569b = obj;
            this.f29571d |= Integer.MIN_VALUE;
            return FileExplorerActivity.this.D3(this);
        }
    }

    /* loaded from: classes4.dex */
    public static final class g0 implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return a.a(Boolean.valueOf(((DocumentFile) obj2).isDirectory()), Boolean.valueOf(((DocumentFile) obj).isDirectory()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$h, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2508h extends l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29572a;

        C2508h(d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C2508h(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, d dVar) {
            return ((C2508h) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f29572a == 0) {
                t.b(obj);
                if (FileExplorerActivity.this.f29490R != null) {
                    FileExplorerActivity fileExplorerActivity = FileExplorerActivity.this;
                    b bVar = fileExplorerActivity.f29490R;
                    AbstractC3159y.f(bVar);
                    fileExplorerActivity.f29501r0 = bVar.b();
                }
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes4.dex */
    public static final class h0 implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return a.a(Long.valueOf(((File) obj2).length()), Long.valueOf(((File) obj).length()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$i, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2509i extends l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29574a;

        C2509i(d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C2509i(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, d dVar) {
            return ((C2509i) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            MenuItem menuItem;
            MenuItem menuItem2;
            MenuItem menuItem3;
            MenuItem menuItem4;
            MenuItem menuItem5;
            Menu menu;
            Menu menu2;
            Menu menu3;
            Menu menu4;
            Menu menu5;
            Menu menu6;
            Q5.b.e();
            if (this.f29574a == 0) {
                t.b(obj);
                b bVar = FileExplorerActivity.this.f29490R;
                AbstractC3159y.f(bVar);
                bVar.i(false);
                if (FileExplorerActivity.this.f29501r0 != null) {
                    AbstractC3159y.f(FileExplorerActivity.this.f29501r0);
                    if (!r5.isEmpty()) {
                        Toolbar toolbar = FileExplorerActivity.this.f29488P;
                        MenuItem menuItem6 = null;
                        if (toolbar != null && (menu6 = toolbar.getMenu()) != null) {
                            menuItem = menu6.findItem(e.f2114f);
                        } else {
                            menuItem = null;
                        }
                        if (menuItem != null) {
                            menuItem.setVisible(true);
                        }
                        Toolbar toolbar2 = FileExplorerActivity.this.f29488P;
                        if (toolbar2 != null && (menu5 = toolbar2.getMenu()) != null) {
                            menuItem2 = menu5.findItem(e.f2105c);
                        } else {
                            menuItem2 = null;
                        }
                        if (menuItem2 != null) {
                            menuItem2.setVisible(true);
                        }
                        Toolbar toolbar3 = FileExplorerActivity.this.f29488P;
                        if (toolbar3 != null && (menu4 = toolbar3.getMenu()) != null) {
                            menuItem3 = menu4.findItem(e.f2102b);
                        } else {
                            menuItem3 = null;
                        }
                        if (menuItem3 != null) {
                            menuItem3.setVisible(false);
                        }
                        Toolbar toolbar4 = FileExplorerActivity.this.f29488P;
                        if (toolbar4 != null && (menu3 = toolbar4.getMenu()) != null) {
                            menuItem4 = menu3.findItem(e.f2099a);
                        } else {
                            menuItem4 = null;
                        }
                        if (menuItem4 != null) {
                            menuItem4.setVisible(false);
                        }
                        Toolbar toolbar5 = FileExplorerActivity.this.f29488P;
                        if (toolbar5 != null && (menu2 = toolbar5.getMenu()) != null) {
                            menuItem5 = menu2.findItem(e.f2108d);
                        } else {
                            menuItem5 = null;
                        }
                        if (menuItem5 != null) {
                            menuItem5.setVisible(false);
                        }
                        Toolbar toolbar6 = FileExplorerActivity.this.f29488P;
                        if (toolbar6 != null && (menu = toolbar6.getMenu()) != null) {
                            menuItem6 = menu.findItem(e.f2111e);
                        }
                        if (menuItem6 != null) {
                            menuItem6.setVisible(false);
                        }
                    }
                }
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes4.dex */
    public static final class i0 implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return a.a(Boolean.valueOf(((File) obj2).isDirectory()), Boolean.valueOf(((File) obj).isDirectory()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$j, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2510j extends l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        Object f29576a;

        /* renamed from: b, reason: collision with root package name */
        int f29577b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.O f29579d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f29580e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.uptodown.core.activities.FileExplorerActivity$j$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ FileExplorerActivity f29581a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(FileExplorerActivity fileExplorerActivity) {
                super(0);
                this.f29581a = fileExplorerActivity;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5577invoke();
                return L5.I.f6474a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5577invoke() {
                AlertDialog alertDialog = this.f29581a.f29487O;
                if (alertDialog != null) {
                    alertDialog.dismiss();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.uptodown.core.activities.FileExplorerActivity$j$b */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ FileExplorerActivity f29582a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(FileExplorerActivity fileExplorerActivity) {
                super(0);
                this.f29582a = fileExplorerActivity;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5578invoke();
                return L5.I.f6474a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5578invoke() {
                AlertDialog alertDialog = this.f29582a.f29487O;
                if (alertDialog != null) {
                    alertDialog.dismiss();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.uptodown.core.activities.FileExplorerActivity$j$c */
        /* loaded from: classes4.dex */
        public static final class c extends l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f29583a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ FileExplorerActivity f29584b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(FileExplorerActivity fileExplorerActivity, d dVar) {
                super(2, dVar);
                this.f29584b = fileExplorerActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new c(this.f29584b, dVar);
            }

            @Override // X5.n
            public final Object invoke(i6.M m8, d dVar) {
                return ((c) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f29583a == 0) {
                    t.b(obj);
                    this.f29584b.p4(false);
                    return L5.I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2510j(kotlin.jvm.internal.O o8, String str, d dVar) {
            super(2, dVar);
            this.f29579d = o8;
            this.f29580e = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C2510j(this.f29579d, this.f29580e, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, d dVar) {
            return ((C2510j) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.jvm.internal.O o8;
            kotlin.jvm.internal.O o9;
            Object e8 = Q5.b.e();
            int i8 = this.f29577b;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 != 2) {
                        if (i8 == 3) {
                            t.b(obj);
                            return L5.I.f6474a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o8 = (kotlin.jvm.internal.O) this.f29576a;
                    t.b(obj);
                    o8.f33743a = ((Boolean) obj).booleanValue();
                } else {
                    o9 = (kotlin.jvm.internal.O) this.f29576a;
                    t.b(obj);
                    o9.f33743a = ((Boolean) obj).booleanValue();
                }
            } else {
                t.b(obj);
                if (FileExplorerActivity.this.f29497Y != null) {
                    o9 = this.f29579d;
                    N4.e eVar = new N4.e();
                    File file = FileExplorerActivity.this.f29497Y;
                    AbstractC3159y.f(file);
                    String str = this.f29580e;
                    FileExplorerActivity fileExplorerActivity = FileExplorerActivity.this;
                    a aVar = new a(fileExplorerActivity);
                    this.f29576a = o9;
                    this.f29577b = 1;
                    obj = eVar.d(file, str, fileExplorerActivity, aVar, this);
                    if (obj == e8) {
                        return e8;
                    }
                    o9.f33743a = ((Boolean) obj).booleanValue();
                } else if (FileExplorerActivity.this.f29493U != null) {
                    o8 = this.f29579d;
                    N4.e eVar2 = new N4.e();
                    DocumentFile documentFile = FileExplorerActivity.this.f29493U;
                    AbstractC3159y.f(documentFile);
                    String str2 = this.f29580e;
                    FileExplorerActivity fileExplorerActivity2 = FileExplorerActivity.this;
                    b bVar = new b(fileExplorerActivity2);
                    this.f29576a = o8;
                    this.f29577b = 2;
                    obj = eVar2.d(documentFile, str2, fileExplorerActivity2, bVar, this);
                    if (obj == e8) {
                        return e8;
                    }
                    o8.f33743a = ((Boolean) obj).booleanValue();
                }
            }
            if (this.f29579d.f33743a) {
                J0 c8 = C2812b0.c();
                c cVar = new c(FileExplorerActivity.this, null);
                this.f29576a = null;
                this.f29577b = 3;
                if (AbstractC2825i.g(c8, cVar, this) == e8) {
                    return e8;
                }
            }
            return L5.I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$k, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2511k extends l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29585a;

        C2511k(d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C2511k(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, d dVar) {
            return ((C2511k) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f29585a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                FileExplorerActivity fileExplorerActivity = FileExplorerActivity.this;
                this.f29585a = 1;
                if (fileExplorerActivity.S3(this) == e8) {
                    return e8;
                }
            }
            return L5.I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$l, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2512l extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f29587a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f29588b;

        /* renamed from: d, reason: collision with root package name */
        int f29590d;

        C2512l(d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f29588b = obj;
            this.f29590d |= Integer.MIN_VALUE;
            return FileExplorerActivity.this.S3(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$m, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2513m extends l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29591a;

        C2513m(d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C2513m(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, d dVar) {
            return ((C2513m) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f29591a == 0) {
                t.b(obj);
                if (FileExplorerActivity.this.f29490R != null) {
                    FileExplorerActivity fileExplorerActivity = FileExplorerActivity.this;
                    b bVar = fileExplorerActivity.f29490R;
                    AbstractC3159y.f(bVar);
                    fileExplorerActivity.f29501r0 = bVar.b();
                }
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$n, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2514n extends l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29593a;

        C2514n(d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C2514n(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, d dVar) {
            return ((C2514n) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            MenuItem menuItem;
            MenuItem menuItem2;
            MenuItem menuItem3;
            MenuItem menuItem4;
            MenuItem menuItem5;
            Menu menu;
            Menu menu2;
            Menu menu3;
            Menu menu4;
            Menu menu5;
            Menu menu6;
            Q5.b.e();
            if (this.f29593a == 0) {
                t.b(obj);
                b bVar = FileExplorerActivity.this.f29490R;
                AbstractC3159y.f(bVar);
                bVar.i(false);
                if (FileExplorerActivity.this.f29501r0 != null) {
                    AbstractC3159y.f(FileExplorerActivity.this.f29501r0);
                    if (!r5.isEmpty()) {
                        Toolbar toolbar = FileExplorerActivity.this.f29488P;
                        MenuItem menuItem6 = null;
                        if (toolbar != null && (menu6 = toolbar.getMenu()) != null) {
                            menuItem = menu6.findItem(e.f2114f);
                        } else {
                            menuItem = null;
                        }
                        if (menuItem != null) {
                            menuItem.setVisible(true);
                        }
                        Toolbar toolbar2 = FileExplorerActivity.this.f29488P;
                        if (toolbar2 != null && (menu5 = toolbar2.getMenu()) != null) {
                            menuItem2 = menu5.findItem(e.f2105c);
                        } else {
                            menuItem2 = null;
                        }
                        if (menuItem2 != null) {
                            menuItem2.setVisible(true);
                        }
                        Toolbar toolbar3 = FileExplorerActivity.this.f29488P;
                        if (toolbar3 != null && (menu4 = toolbar3.getMenu()) != null) {
                            menuItem3 = menu4.findItem(e.f2102b);
                        } else {
                            menuItem3 = null;
                        }
                        if (menuItem3 != null) {
                            menuItem3.setVisible(false);
                        }
                        Toolbar toolbar4 = FileExplorerActivity.this.f29488P;
                        if (toolbar4 != null && (menu3 = toolbar4.getMenu()) != null) {
                            menuItem4 = menu3.findItem(e.f2099a);
                        } else {
                            menuItem4 = null;
                        }
                        if (menuItem4 != null) {
                            menuItem4.setVisible(false);
                        }
                        Toolbar toolbar5 = FileExplorerActivity.this.f29488P;
                        if (toolbar5 != null && (menu2 = toolbar5.getMenu()) != null) {
                            menuItem5 = menu2.findItem(e.f2108d);
                        } else {
                            menuItem5 = null;
                        }
                        if (menuItem5 != null) {
                            menuItem5.setVisible(false);
                        }
                        Toolbar toolbar6 = FileExplorerActivity.this.f29488P;
                        if (toolbar6 != null && (menu = toolbar6.getMenu()) != null) {
                            menuItem6 = menu.findItem(e.f2111e);
                        }
                        if (menuItem6 != null) {
                            menuItem6.setVisible(false);
                        }
                    }
                }
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$o, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2515o extends l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29595a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ File f29596b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f29597c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ J4.e f29598d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ FileExplorerActivity f29599e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.uptodown.core.activities.FileExplorerActivity$o$a */
        /* loaded from: classes4.dex */
        public static final class a extends l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f29600a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ FileExplorerActivity f29601b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(FileExplorerActivity fileExplorerActivity, d dVar) {
                super(2, dVar);
                this.f29601b = fileExplorerActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new a(this.f29601b, dVar);
            }

            @Override // X5.n
            public final Object invoke(i6.M m8, d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f29600a == 0) {
                    t.b(obj);
                    this.f29601b.n5();
                    return L5.I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2515o(File file, String str, J4.e eVar, FileExplorerActivity fileExplorerActivity, d dVar) {
            super(2, dVar);
            this.f29596b = file;
            this.f29597c = str;
            this.f29598d = eVar;
            this.f29599e = fileExplorerActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C2515o(this.f29596b, this.f29597c, this.f29598d, this.f29599e, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, d dVar) {
            return ((C2515o) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f29595a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        t.b(obj);
                        return L5.I.f6474a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                x xVar = new x();
                File file = this.f29596b;
                String str = this.f29597c;
                J4.e eVar = this.f29598d;
                this.f29595a = 1;
                if (xVar.m(file, str, eVar, this) == e8) {
                    return e8;
                }
            }
            J0 c8 = C2812b0.c();
            a aVar = new a(this.f29599e, null);
            this.f29595a = 2;
            if (AbstractC2825i.g(c8, aVar, this) == e8) {
                return e8;
            }
            return L5.I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$p, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2516p extends l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29602a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ File f29603b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Uri f29604c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ J4.e f29605d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ FileExplorerActivity f29606e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.uptodown.core.activities.FileExplorerActivity$p$a */
        /* loaded from: classes4.dex */
        public static final class a extends l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f29607a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ FileExplorerActivity f29608b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(FileExplorerActivity fileExplorerActivity, d dVar) {
                super(2, dVar);
                this.f29608b = fileExplorerActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new a(this.f29608b, dVar);
            }

            @Override // X5.n
            public final Object invoke(i6.M m8, d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f29607a == 0) {
                    t.b(obj);
                    this.f29608b.n5();
                    return L5.I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2516p(File file, Uri uri, J4.e eVar, FileExplorerActivity fileExplorerActivity, d dVar) {
            super(2, dVar);
            this.f29603b = file;
            this.f29604c = uri;
            this.f29605d = eVar;
            this.f29606e = fileExplorerActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C2516p(this.f29603b, this.f29604c, this.f29605d, this.f29606e, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, d dVar) {
            return ((C2516p) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f29602a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        t.b(obj);
                        return L5.I.f6474a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                x xVar = new x();
                File file = this.f29603b;
                Uri uri = this.f29604c;
                J4.e eVar = this.f29605d;
                Context applicationContext = this.f29606e.getApplicationContext();
                AbstractC3159y.h(applicationContext, "applicationContext");
                this.f29602a = 1;
                if (xVar.l(file, uri, eVar, applicationContext, this) == e8) {
                    return e8;
                }
            }
            J0 c8 = C2812b0.c();
            a aVar = new a(this.f29606e, null);
            this.f29602a = 2;
            if (AbstractC2825i.g(c8, aVar, this) == e8) {
                return e8;
            }
            return L5.I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$q, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2517q extends l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29609a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ DocumentFile f29610b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f29611c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ J4.e f29612d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ FileExplorerActivity f29613e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.uptodown.core.activities.FileExplorerActivity$q$a */
        /* loaded from: classes4.dex */
        public static final class a extends l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f29614a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ FileExplorerActivity f29615b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(FileExplorerActivity fileExplorerActivity, d dVar) {
                super(2, dVar);
                this.f29615b = fileExplorerActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new a(this.f29615b, dVar);
            }

            @Override // X5.n
            public final Object invoke(i6.M m8, d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f29614a == 0) {
                    t.b(obj);
                    this.f29615b.n5();
                    return L5.I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2517q(DocumentFile documentFile, String str, J4.e eVar, FileExplorerActivity fileExplorerActivity, d dVar) {
            super(2, dVar);
            this.f29610b = documentFile;
            this.f29611c = str;
            this.f29612d = eVar;
            this.f29613e = fileExplorerActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C2517q(this.f29610b, this.f29611c, this.f29612d, this.f29613e, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, d dVar) {
            return ((C2517q) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f29609a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        t.b(obj);
                        return L5.I.f6474a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                x xVar = new x();
                DocumentFile documentFile = this.f29610b;
                String str = this.f29611c;
                J4.e eVar = this.f29612d;
                Context applicationContext = this.f29613e.getApplicationContext();
                AbstractC3159y.h(applicationContext, "applicationContext");
                this.f29609a = 1;
                if (xVar.k(documentFile, str, eVar, applicationContext, this) == e8) {
                    return e8;
                }
            }
            J0 c8 = C2812b0.c();
            a aVar = new a(this.f29613e, null);
            this.f29609a = 2;
            if (AbstractC2825i.g(c8, aVar, this) == e8) {
                return e8;
            }
            return L5.I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$r, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2518r extends l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29616a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ DocumentFile f29617b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Uri f29618c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ J4.e f29619d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ FileExplorerActivity f29620e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.uptodown.core.activities.FileExplorerActivity$r$a */
        /* loaded from: classes4.dex */
        public static final class a extends l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f29621a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ FileExplorerActivity f29622b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(FileExplorerActivity fileExplorerActivity, d dVar) {
                super(2, dVar);
                this.f29622b = fileExplorerActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new a(this.f29622b, dVar);
            }

            @Override // X5.n
            public final Object invoke(i6.M m8, d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f29621a == 0) {
                    t.b(obj);
                    this.f29622b.n5();
                    return L5.I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2518r(DocumentFile documentFile, Uri uri, J4.e eVar, FileExplorerActivity fileExplorerActivity, d dVar) {
            super(2, dVar);
            this.f29617b = documentFile;
            this.f29618c = uri;
            this.f29619d = eVar;
            this.f29620e = fileExplorerActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C2518r(this.f29617b, this.f29618c, this.f29619d, this.f29620e, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, d dVar) {
            return ((C2518r) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f29616a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        t.b(obj);
                        return L5.I.f6474a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                x xVar = new x();
                DocumentFile documentFile = this.f29617b;
                Uri uri = this.f29618c;
                J4.e eVar = this.f29619d;
                Context applicationContext = this.f29620e.getApplicationContext();
                AbstractC3159y.h(applicationContext, "applicationContext");
                this.f29616a = 1;
                if (xVar.j(documentFile, uri, eVar, applicationContext, this) == e8) {
                    return e8;
                }
            }
            J0 c8 = C2812b0.c();
            a aVar = new a(this.f29620e, null);
            this.f29616a = 2;
            if (AbstractC2825i.g(c8, aVar, this) == e8) {
                return e8;
            }
            return L5.I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$s, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2519s extends l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29623a;

        C2519s(d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C2519s(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, d dVar) {
            return ((C2519s) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f29623a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                FileExplorerActivity fileExplorerActivity = FileExplorerActivity.this;
                this.f29623a = 1;
                if (fileExplorerActivity.Y3(this) == e8) {
                    return e8;
                }
            }
            return L5.I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$t, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2520t extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f29625a;

        /* renamed from: b, reason: collision with root package name */
        Object f29626b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f29627c;

        /* renamed from: e, reason: collision with root package name */
        int f29629e;

        C2520t(d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f29627c = obj;
            this.f29629e |= Integer.MIN_VALUE;
            return FileExplorerActivity.this.Y3(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$u, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2521u extends l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29630a;

        C2521u(d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C2521u(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, d dVar) {
            return ((C2521u) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f29630a == 0) {
                t.b(obj);
                RelativeLayout relativeLayout = FileExplorerActivity.this.f29511z;
                if (relativeLayout == null) {
                    AbstractC3159y.y("rlLoading");
                    relativeLayout = null;
                }
                relativeLayout.setVisibility(0);
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$v, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2522v extends l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        Object f29632a;

        /* renamed from: b, reason: collision with root package name */
        int f29633b;

        /* renamed from: c, reason: collision with root package name */
        int f29634c;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.Q f29636e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.uptodown.core.activities.FileExplorerActivity$v$a */
        /* loaded from: classes4.dex */
        public static final class a extends l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f29637a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ FileExplorerActivity f29638b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f29639c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(FileExplorerActivity fileExplorerActivity, int i8, d dVar) {
                super(2, dVar);
                this.f29638b = fileExplorerActivity;
                this.f29639c = i8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new a(this.f29638b, this.f29639c, dVar);
            }

            @Override // X5.n
            public final Object invoke(i6.M m8, d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f29637a == 0) {
                    t.b(obj);
                    b bVar = this.f29638b.f29490R;
                    AbstractC3159y.f(bVar);
                    bVar.notifyItemRemoved(this.f29639c);
                    return L5.I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2522v(kotlin.jvm.internal.Q q8, d dVar) {
            super(2, dVar);
            this.f29636e = q8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C2522v(this.f29636e, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, d dVar) {
            return ((C2522v) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x004b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x006d -> B:5:0x0088). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0085 -> B:5:0x0088). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = Q5.b.e()
                int r1 = r9.f29634c
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L1f
                if (r1 != r3) goto L17
                int r1 = r9.f29633b
                java.lang.Object r4 = r9.f29632a
                java.util.Iterator r4 = (java.util.Iterator) r4
                L5.t.b(r10)
                goto L88
            L17:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1f:
                L5.t.b(r10)
                com.uptodown.core.activities.FileExplorerActivity r10 = com.uptodown.core.activities.FileExplorerActivity.this
                H4.b r10 = com.uptodown.core.activities.FileExplorerActivity.B2(r10)
                if (r10 == 0) goto L8a
                com.uptodown.core.activities.FileExplorerActivity r10 = com.uptodown.core.activities.FileExplorerActivity.this
                H4.b r10 = com.uptodown.core.activities.FileExplorerActivity.B2(r10)
                kotlin.jvm.internal.AbstractC3159y.f(r10)
                java.util.ArrayList r10 = r10.b()
                kotlin.jvm.internal.Q r1 = r9.f29636e
                int r4 = r10.size()
                r1.f33745a = r4
                java.util.Iterator r10 = r10.iterator()
                r4 = r10
                r10 = 0
            L45:
                boolean r1 = r4.hasNext()
                if (r1 == 0) goto L8a
                int r1 = r10 + 1
                java.lang.Object r5 = r4.next()
                boolean r6 = r5 instanceof java.io.File
                if (r6 == 0) goto L61
                N4.g r6 = new N4.g
                r6.<init>()
                java.io.File r5 = (java.io.File) r5
                boolean r5 = r6.a(r5)
                goto L6d
            L61:
                boolean r6 = r5 instanceof androidx.documentfile.provider.DocumentFile
                if (r6 == 0) goto L6c
                androidx.documentfile.provider.DocumentFile r5 = (androidx.documentfile.provider.DocumentFile) r5
                boolean r5 = r5.delete()
                goto L6d
            L6c:
                r5 = 0
            L6d:
                if (r5 == 0) goto L88
                i6.J0 r5 = i6.C2812b0.c()
                com.uptodown.core.activities.FileExplorerActivity$v$a r6 = new com.uptodown.core.activities.FileExplorerActivity$v$a
                com.uptodown.core.activities.FileExplorerActivity r7 = com.uptodown.core.activities.FileExplorerActivity.this
                r8 = 0
                r6.<init>(r7, r10, r8)
                r9.f29632a = r4
                r9.f29633b = r1
                r9.f29634c = r3
                java.lang.Object r10 = i6.AbstractC2825i.g(r5, r6, r9)
                if (r10 != r0) goto L88
                return r0
            L88:
                r10 = r1
                goto L45
            L8a:
                L5.I r10 = L5.I.f6474a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uptodown.core.activities.FileExplorerActivity.C2522v.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$w, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2523w extends l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29640a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.Q f29642c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2523w(kotlin.jvm.internal.Q q8, d dVar) {
            super(2, dVar);
            this.f29642c = q8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C2523w(this.f29642c, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, d dVar) {
            return ((C2523w) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f29640a == 0) {
                t.b(obj);
                b bVar = FileExplorerActivity.this.f29490R;
                AbstractC3159y.f(bVar);
                bVar.i(false);
                RelativeLayout relativeLayout = FileExplorerActivity.this.f29511z;
                if (relativeLayout == null) {
                    AbstractC3159y.y("rlLoading");
                    relativeLayout = null;
                }
                relativeLayout.setVisibility(8);
                FileExplorerActivity fileExplorerActivity = FileExplorerActivity.this;
                Toast.makeText(fileExplorerActivity, fileExplorerActivity.getString(h.f2262s, String.valueOf(this.f29642c.f33745a)), 1).show();
                FileExplorerActivity.this.l4();
                FileExplorerActivity.this.p4(false);
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$x, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2524x implements c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ProgressBar f29643a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f29644b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ EditText f29645c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ FileExplorerActivity f29646d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ TextView f29647e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ TextView f29648f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ RelativeLayout f29649g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ TextView f29650h;

        C2524x(ProgressBar progressBar, TextView textView, EditText editText, FileExplorerActivity fileExplorerActivity, TextView textView2, TextView textView3, RelativeLayout relativeLayout, TextView textView4) {
            this.f29643a = progressBar;
            this.f29644b = textView;
            this.f29645c = editText;
            this.f29646d = fileExplorerActivity;
            this.f29647e = textView2;
            this.f29648f = textView3;
            this.f29649g = relativeLayout;
            this.f29650h = textView4;
        }

        @Override // J4.c
        public void a(String fileName) {
            AbstractC3159y.i(fileName, "fileName");
            this.f29648f.setText(fileName);
            this.f29649g.setVisibility(8);
            this.f29647e.setVisibility(8);
            this.f29650h.setText(this.f29646d.getString(h.f2232d));
        }

        @Override // J4.c
        public void b(String filesCount) {
            AbstractC3159y.i(filesCount, "filesCount");
            this.f29645c.setFocusable(false);
            this.f29645c.setFocusableInTouchMode(false);
            this.f29645c.clearFocus();
            this.f29643a.setVisibility(0);
            this.f29644b.setVisibility(0);
            this.f29644b.setText(this.f29646d.getString(h.f2270z, filesCount));
            this.f29647e.setVisibility(8);
        }

        @Override // J4.c
        public void c(int i8, String filesCount) {
            AbstractC3159y.i(filesCount, "filesCount");
            this.f29643a.setProgress(i8);
            this.f29644b.setText(filesCount);
        }

        @Override // J4.c
        public void onError(String str) {
            this.f29648f.setText(str);
            this.f29643a.setVisibility(0);
            this.f29647e.setVisibility(8);
            this.f29650h.setText(this.f29646d.getString(h.f2232d));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$y, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2525y extends l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29651a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ EditText f29653c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2525y(EditText editText, d dVar) {
            super(2, dVar);
            this.f29653c = editText;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C2525y(this.f29653c, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, d dVar) {
            return ((C2525y) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f29651a == 0) {
                t.b(obj);
                FileExplorerActivity.this.H3(this.f29653c.getText().toString());
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$z, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2526z implements J4.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f29654a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FileExplorerActivity f29655b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f29656c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ProgressBar f29657d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ TextView f29658e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ TextView f29659f;

        C2526z(TextView textView, FileExplorerActivity fileExplorerActivity, View view, ProgressBar progressBar, TextView textView2, TextView textView3) {
            this.f29654a = textView;
            this.f29655b = fileExplorerActivity;
            this.f29656c = view;
            this.f29657d = progressBar;
            this.f29658e = textView2;
            this.f29659f = textView3;
        }

        @Override // J4.e
        public void a() {
            this.f29654a.setText(this.f29655b.getString(h.f2252n));
            this.f29657d.setIndeterminate(false);
            this.f29657d.setProgress(0);
            this.f29659f.setText(this.f29655b.getString(h.f2232d));
        }

        @Override // J4.e
        public void b(int i8) {
            this.f29654a.setText(this.f29655b.getString(h.f2248l, String.valueOf(i8)));
            this.f29657d.setIndeterminate(false);
            this.f29657d.setProgress(100);
            this.f29659f.setText(this.f29655b.getString(h.f2232d));
        }

        @Override // J4.e
        public void c() {
            this.f29654a.setText(this.f29655b.getString(h.f2250m));
            ((RadioGroup) this.f29656c.findViewById(e.f2072R)).setVisibility(8);
            TextView textView = this.f29655b.f29479G;
            if (textView == null) {
                AbstractC3159y.y("tvSelectedPath");
                textView = null;
            }
            textView.setVisibility(8);
            this.f29657d.setVisibility(0);
            this.f29657d.setIndeterminate(true);
            this.f29658e.setVisibility(8);
        }

        @Override // J4.e
        public void d(long j8) {
            this.f29654a.setText(this.f29655b.getString(h.f2250m) + ' ' + new N4.g().c(j8));
        }
    }

    public FileExplorerActivity() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: F4.w
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                FileExplorerActivity.S4(FileExplorerActivity.this, (ActivityResult) obj);
            }
        });
        AbstractC3159y.h(registerForActivityResult, "registerForActivityResul…        }\n        }\n    }");
        this.f29475C0 = registerForActivityResult;
    }

    private final InterfaceC2855x0 A3(ArrayList arrayList, DocumentFile documentFile, c cVar) {
        InterfaceC2855x0 d8;
        d8 = AbstractC2829k.d(i6.N.a(C2812b0.b()), null, null, new C2503c(arrayList, documentFile, cVar, this, null), 3, null);
        return d8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A4(View view) {
    }

    private final InterfaceC2855x0 B3(ArrayList arrayList, File file, c cVar) {
        InterfaceC2855x0 d8;
        d8 = AbstractC2829k.d(i6.N.a(C2812b0.b()), null, null, new C2504d(arrayList, file, cVar, this, null), 3, null);
        return d8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B4(final FileExplorerActivity this$0, CompoundButton compoundButton, boolean z8) {
        AbstractC3159y.i(this$0, "this$0");
        if (z8) {
            this$0.f29498Z = !this$0.f29498Z;
            RadioButton radioButton = this$0.f29486N;
            AbstractC3159y.f(radioButton);
            radioButton.setOnClickListener(new View.OnClickListener() { // from class: F4.z
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FileExplorerActivity.C4(FileExplorerActivity.this, view);
                }
            });
            RadioButton radioButton2 = this$0.f29484L;
            AbstractC3159y.f(radioButton2);
            radioButton2.setOnClickListener(new View.OnClickListener() { // from class: F4.A
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FileExplorerActivity.D4(view);
                }
            });
            RadioButton radioButton3 = this$0.f29485M;
            AbstractC3159y.f(radioButton3);
            radioButton3.setOnClickListener(new View.OnClickListener() { // from class: F4.B
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FileExplorerActivity.E4(view);
                }
            });
        }
    }

    private final void C3() {
        AbstractC2829k.d(i6.N.a(C2812b0.b()), null, null, new C2505e(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C4(FileExplorerActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.f29498Z = !this$0.f29498Z;
        this$0.P4();
        this$0.c5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object D3(P5.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.uptodown.core.activities.FileExplorerActivity.C2507g
            if (r0 == 0) goto L13
            r0 = r7
            com.uptodown.core.activities.FileExplorerActivity$g r0 = (com.uptodown.core.activities.FileExplorerActivity.C2507g) r0
            int r1 = r0.f29571d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29571d = r1
            goto L18
        L13:
            com.uptodown.core.activities.FileExplorerActivity$g r0 = new com.uptodown.core.activities.FileExplorerActivity$g
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f29569b
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f29571d
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
            java.lang.Object r2 = r0.f29568a
            com.uptodown.core.activities.FileExplorerActivity r2 = (com.uptodown.core.activities.FileExplorerActivity) r2
            L5.t.b(r7)
            goto L55
        L3d:
            L5.t.b(r7)
            i6.I r7 = i6.C2812b0.b()
            com.uptodown.core.activities.FileExplorerActivity$h r2 = new com.uptodown.core.activities.FileExplorerActivity$h
            r2.<init>(r5)
            r0.f29568a = r6
            r0.f29571d = r4
            java.lang.Object r7 = i6.AbstractC2825i.g(r7, r2, r0)
            if (r7 != r1) goto L54
            return r1
        L54:
            r2 = r6
        L55:
            i6.J0 r7 = i6.C2812b0.c()
            com.uptodown.core.activities.FileExplorerActivity$i r4 = new com.uptodown.core.activities.FileExplorerActivity$i
            r4.<init>(r5)
            r0.f29568a = r5
            r0.f29571d = r3
            java.lang.Object r7 = i6.AbstractC2825i.g(r7, r4, r0)
            if (r7 != r1) goto L69
            return r1
        L69:
            L5.I r7 = L5.I.f6474a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.core.activities.FileExplorerActivity.D3(P5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D4(View view) {
    }

    private final void E3() {
        AlertDialog alertDialog = this.f29487O;
        if (alertDialog != null) {
            AbstractC3159y.f(alertDialog);
            alertDialog.dismiss();
        }
        Integer num = null;
        View inflate = getLayoutInflater().inflate(E4.f.f2182f, (ViewGroup) null, false);
        TextView textView = (TextView) inflate.findViewById(e.f2088W0);
        j.a aVar = j.f2272g;
        textView.setTypeface(aVar.u());
        Context context = textView.getContext();
        int i8 = h.f2254o;
        b bVar = this.f29490R;
        if (bVar != null) {
            num = Integer.valueOf(bVar.a());
        }
        textView.setText(context.getString(i8, String.valueOf(num)));
        TextView textView2 = (TextView) inflate.findViewById(e.f2136m0);
        textView2.setText(getString(h.f2245j0));
        textView2.setTypeface(aVar.t());
        textView2.setOnClickListener(new View.OnClickListener() { // from class: F4.K
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FileExplorerActivity.F3(FileExplorerActivity.this, view);
            }
        });
        TextView textView3 = (TextView) inflate.findViewById(e.f2175z0);
        textView3.setText(getString(h.f2243i0));
        textView3.setTypeface(aVar.t());
        textView3.setOnClickListener(new View.OnClickListener() { // from class: F4.L
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FileExplorerActivity.G3(FileExplorerActivity.this, view);
            }
        });
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(inflate);
        AlertDialog create = builder.create();
        this.f29487O = create;
        AbstractC3159y.f(create);
        Window window = create.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        AlertDialog alertDialog2 = this.f29487O;
        AbstractC3159y.f(alertDialog2);
        alertDialog2.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E4(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F3(FileExplorerActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.X3();
        AlertDialog alertDialog = this$0.f29487O;
        AbstractC3159y.f(alertDialog);
        alertDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F4(FileExplorerActivity this$0, CompoundButton compoundButton, boolean z8) {
        AbstractC3159y.i(this$0, "this$0");
        new G4.a(this$0).H(z8);
        SearchView searchView = this$0.f29481I;
        AbstractC3159y.f(searchView);
        this$0.v3(searchView.getQuery().toString(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G3(FileExplorerActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AlertDialog alertDialog = this$0.f29487O;
        AbstractC3159y.f(alertDialog);
        alertDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G4(FileExplorerActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H3(String str) {
        AbstractC2829k.d(i6.N.a(C2812b0.b()), null, null, new C2510j(new kotlin.jvm.internal.O(), str, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H4(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0090, code lost:
    
        if (g6.n.r(r15, ".zip", false, 2, null) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00a6, code lost:
    
        r15 = (android.widget.TextView) r7.findViewById(E4.e.f2031D0);
        r15.setVisibility(0);
        r15.setTypeface(r10.u());
        r15.setOnClickListener(new F4.X(r16, r17));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00d0, code lost:
    
        if (g6.n.r(r4, ".zip", false, 2, null) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00e6, code lost:
    
        r4 = (android.widget.TextView) r7.findViewById(E4.e.f2046I0);
        r4.setVisibility(0);
        r4.setTypeface(r10.u());
        r4.setOnClickListener(new F4.Y(r16, r17));
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e4, code lost:
    
        if (g6.n.r(r4, ".zip", false, 2, null) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a4, code lost:
    
        if (g6.n.r(r15, ".zip", false, 2, null) == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void I3(final java.lang.Object r17, final int r18) {
        /*
            Method dump skipped, instructions count: 593
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.core.activities.FileExplorerActivity.I3(java.lang.Object, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I4(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J3(Object obj, FileExplorerActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        if (obj instanceof File) {
            this$0.O4((File) obj);
        } else if (obj instanceof DocumentFile) {
            this$0.N4((DocumentFile) obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean J4(FileExplorerActivity this$0, MenuItem item) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(item, "item");
        int itemId = item.getItemId();
        if (itemId == e.f2117g) {
            b bVar = this$0.f29490R;
            if (bVar != null) {
                AbstractC3159y.f(bVar);
                if (bVar.c()) {
                    this$0.l4();
                } else {
                    this$0.i5();
                }
                b bVar2 = this$0.f29490R;
                AbstractC3159y.f(bVar2);
                AbstractC3159y.f(this$0.f29490R);
                bVar2.i(!r2.c());
            }
        } else if (itemId == e.f2105c) {
            this$0.c4();
        } else if (itemId == e.f2111e) {
            this$0.E3();
        } else if (itemId == e.f2099a) {
            this$0.Z3(null);
        } else if (itemId == e.f2102b) {
            this$0.C3();
        } else if (itemId == e.f2108d) {
            this$0.R3();
        } else if (itemId == e.f2114f) {
            this$0.R4();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K3(FileExplorerActivity this$0, Object obj, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.Z3(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K4(FileExplorerActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        SearchView searchView = this$0.f29481I;
        if (searchView != null) {
            searchView.setIconified(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L3(FileExplorerActivity this$0, Object obj, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.f4(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L4(FileExplorerActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        RelativeLayout relativeLayout = this$0.f29483K;
        AbstractC3159y.f(relativeLayout);
        if (relativeLayout.getVisibility() == 0) {
            view.animate().rotation(0.0f).start();
            RelativeLayout relativeLayout2 = this$0.f29483K;
            AbstractC3159y.f(relativeLayout2);
            relativeLayout2.setVisibility(8);
            return;
        }
        view.animate().rotation(180.0f).start();
        RelativeLayout relativeLayout3 = this$0.f29483K;
        AbstractC3159y.f(relativeLayout3);
        relativeLayout3.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M3(Object obj, FileExplorerActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        if (obj instanceof File) {
            File file = (File) obj;
            if (file.exists()) {
                this$0.h5(file.getAbsolutePath());
                return;
            }
            return;
        }
        if (obj instanceof DocumentFile) {
            DocumentFile documentFile = (DocumentFile) obj;
            if (documentFile.exists()) {
                this$0.h5(documentFile.getUri().getPath());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M4(FileExplorerActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.f29498Z = !this$0.f29498Z;
        this$0.P4();
        this$0.d5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N3(FileExplorerActivity this$0, int i8, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.f29502s0 = false;
        b bVar = this$0.f29490R;
        AbstractC3159y.f(bVar);
        bVar.h(i8);
        this$0.i5();
        this$0.C3();
        AlertDialog alertDialog = this$0.f29487O;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N4(DocumentFile documentFile) {
        Uri uri = documentFile.getUri();
        AbstractC3159y.h(uri, "documentFile.uri");
        m5(uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O3(FileExplorerActivity this$0, int i8, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.f29502s0 = true;
        b bVar = this$0.f29490R;
        AbstractC3159y.f(bVar);
        bVar.h(i8);
        this$0.i5();
        this$0.R3();
        AlertDialog alertDialog = this$0.f29487O;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O4(File file) {
        Uri uri = FileProvider.getUriForFile(this, getApplicationContext().getPackageName() + ".provider", file);
        AbstractC3159y.h(uri, "uri");
        m5(uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P3(FileExplorerActivity this$0, Object obj, int i8, View view) {
        String name;
        AbstractC3159y.i(this$0, "this$0");
        this$0.f29502s0 = false;
        if (obj instanceof File) {
            File file = (File) obj;
            if (new N4.g().a(file)) {
                b bVar = this$0.f29490R;
                if (bVar != null) {
                    bVar.f(i8);
                }
                name = file.getName();
            }
            name = "";
        } else {
            if (obj instanceof DocumentFile) {
                DocumentFile documentFile = (DocumentFile) obj;
                if (documentFile.delete()) {
                    b bVar2 = this$0.f29490R;
                    if (bVar2 != null) {
                        bVar2.f(i8);
                    }
                    name = documentFile.getName();
                }
            }
            name = "";
        }
        if (name != null && name.length() != 0) {
            Toast.makeText(this$0, this$0.getString(h.f2260r, name), 1).show();
        }
        AlertDialog alertDialog = this$0.f29487O;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    private final void P4() {
        AbstractC2829k.d(i6.N.a(C2812b0.b()), null, null, new H(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q3(Object obj, FileExplorerActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        L4.h l8 = j.f2272g.l();
        AbstractC3159y.f(l8);
        if (l8.e() != null) {
            if (obj instanceof File) {
                File file = (File) obj;
                if (!file.isDirectory()) {
                    Application application = this$0.getApplication();
                    AbstractC3159y.g(application, "null cannot be cast to non-null type com.uptodown.core.UptodownCoreApplication");
                    ((j) application).R(file);
                }
            } else if (obj instanceof DocumentFile) {
                Application application2 = this$0.getApplication();
                AbstractC3159y.g(application2, "null cannot be cast to non-null type com.uptodown.core.UptodownCoreApplication");
                ((j) application2).Q((DocumentFile) obj);
            }
        } else {
            this$0.f29500q0 = obj;
            this$0.S0();
        }
        AlertDialog alertDialog = this$0.f29487O;
        if (alertDialog != null) {
            alertDialog.dismiss();
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
    public final java.lang.Object Q4(P5.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.uptodown.core.activities.FileExplorerActivity.I
            if (r0 == 0) goto L13
            r0 = r7
            com.uptodown.core.activities.FileExplorerActivity$I r0 = (com.uptodown.core.activities.FileExplorerActivity.I) r0
            int r1 = r0.f29528d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29528d = r1
            goto L18
        L13:
            com.uptodown.core.activities.FileExplorerActivity$I r0 = new com.uptodown.core.activities.FileExplorerActivity$I
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f29526b
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f29528d
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
            java.lang.Object r2 = r0.f29525a
            com.uptodown.core.activities.FileExplorerActivity r2 = (com.uptodown.core.activities.FileExplorerActivity) r2
            L5.t.b(r7)
            goto L55
        L3d:
            L5.t.b(r7)
            i6.I r7 = i6.C2812b0.b()
            com.uptodown.core.activities.FileExplorerActivity$J r2 = new com.uptodown.core.activities.FileExplorerActivity$J
            r2.<init>(r5)
            r0.f29525a = r6
            r0.f29528d = r4
            java.lang.Object r7 = i6.AbstractC2825i.g(r7, r2, r0)
            if (r7 != r1) goto L54
            return r1
        L54:
            r2 = r6
        L55:
            i6.J0 r7 = i6.C2812b0.c()
            com.uptodown.core.activities.FileExplorerActivity$K r4 = new com.uptodown.core.activities.FileExplorerActivity$K
            r4.<init>(r5)
            r0.f29525a = r5
            r0.f29528d = r3
            java.lang.Object r7 = i6.AbstractC2825i.g(r7, r4, r0)
            if (r7 != r1) goto L69
            return r1
        L69:
            L5.I r7 = L5.I.f6474a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.core.activities.FileExplorerActivity.Q4(P5.d):java.lang.Object");
    }

    private final void R3() {
        this.f29502s0 = true;
        AbstractC2829k.d(i6.N.a(C2812b0.b()), null, null, new C2511k(null), 3, null);
    }

    private final void R4() {
        if (this.f29497Y != null) {
            ArrayList arrayList = this.f29501r0;
            AbstractC3159y.f(arrayList);
            File file = this.f29497Y;
            AbstractC3159y.f(file);
            new I4.b(arrayList, file, this.f29512z0, this.f29502s0, this);
            return;
        }
        if (this.f29493U != null) {
            ArrayList arrayList2 = this.f29501r0;
            AbstractC3159y.f(arrayList2);
            DocumentFile documentFile = this.f29493U;
            AbstractC3159y.f(documentFile);
            new I4.b(arrayList2, documentFile, this.f29512z0, this.f29502s0, this);
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
    public final java.lang.Object S3(P5.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.uptodown.core.activities.FileExplorerActivity.C2512l
            if (r0 == 0) goto L13
            r0 = r7
            com.uptodown.core.activities.FileExplorerActivity$l r0 = (com.uptodown.core.activities.FileExplorerActivity.C2512l) r0
            int r1 = r0.f29590d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29590d = r1
            goto L18
        L13:
            com.uptodown.core.activities.FileExplorerActivity$l r0 = new com.uptodown.core.activities.FileExplorerActivity$l
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f29588b
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f29590d
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
            java.lang.Object r2 = r0.f29587a
            com.uptodown.core.activities.FileExplorerActivity r2 = (com.uptodown.core.activities.FileExplorerActivity) r2
            L5.t.b(r7)
            goto L55
        L3d:
            L5.t.b(r7)
            i6.I r7 = i6.C2812b0.b()
            com.uptodown.core.activities.FileExplorerActivity$m r2 = new com.uptodown.core.activities.FileExplorerActivity$m
            r2.<init>(r5)
            r0.f29587a = r6
            r0.f29590d = r4
            java.lang.Object r7 = i6.AbstractC2825i.g(r7, r2, r0)
            if (r7 != r1) goto L54
            return r1
        L54:
            r2 = r6
        L55:
            i6.J0 r7 = i6.C2812b0.c()
            com.uptodown.core.activities.FileExplorerActivity$n r4 = new com.uptodown.core.activities.FileExplorerActivity$n
            r4.<init>(r5)
            r0.f29587a = r5
            r0.f29590d = r3
            java.lang.Object r7 = i6.AbstractC2825i.g(r7, r4, r0)
            if (r7 != r1) goto L69
            return r1
        L69:
            L5.I r7 = L5.I.f6474a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.core.activities.FileExplorerActivity.S3(P5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S4(FileExplorerActivity this$0, ActivityResult activityResult) {
        String str;
        Uri uri;
        Bundle extras;
        AbstractC3159y.i(this$0, "this$0");
        if (activityResult.getResultCode() == 145) {
            Intent data = activityResult.getData();
            TextView textView = null;
            if (data != null && (extras = data.getExtras()) != null) {
                str = extras.getString("path_selected");
            } else {
                str = null;
            }
            this$0.f29508x0 = str;
            if (str != null) {
                this$0.f29506w0 = null;
                TextView textView2 = this$0.f29479G;
                if (textView2 == null) {
                    AbstractC3159y.y("tvSelectedPath");
                } else {
                    textView = textView2;
                }
                textView.setText(this$0.f29508x0);
                return;
            }
            Intent data2 = activityResult.getData();
            if (data2 != null) {
                uri = data2.getData();
            } else {
                uri = null;
            }
            if (uri != null) {
                this$0.f29506w0 = uri;
                this$0.f29508x0 = null;
                String lastPathSegment = uri.getLastPathSegment();
                AbstractC3159y.f(lastPathSegment);
                String substring = lastPathSegment.substring(n.X(lastPathSegment, ":", 0, false, 6, null) + 1);
                AbstractC3159y.h(substring, "this as java.lang.String).substring(startIndex)");
                TextView textView3 = this$0.f29479G;
                if (textView3 == null) {
                    AbstractC3159y.y("tvSelectedPath");
                } else {
                    textView = textView3;
                }
                textView.setText(this$0.getString(h.f2247k0) + '/' + substring);
            }
        }
    }

    private final InterfaceC2855x0 T3(DocumentFile documentFile, Uri uri, J4.e eVar) {
        InterfaceC2855x0 d8;
        d8 = AbstractC2829k.d(i6.N.a(C2812b0.b()), null, null, new C2518r(documentFile, uri, eVar, this, null), 3, null);
        return d8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T4() {
        LinearLayout linearLayout = this.f29476D;
        LinearLayout linearLayout2 = null;
        if (linearLayout == null) {
            AbstractC3159y.y("llBreadcrumb");
            linearLayout = null;
        }
        if (linearLayout.getChildCount() > 1) {
            LinearLayout linearLayout3 = this.f29476D;
            if (linearLayout3 == null) {
                AbstractC3159y.y("llBreadcrumb");
                linearLayout3 = null;
            }
            LinearLayout linearLayout4 = this.f29476D;
            if (linearLayout4 == null) {
                AbstractC3159y.y("llBreadcrumb");
            } else {
                linearLayout2 = linearLayout4;
            }
            linearLayout3.removeViewAt(linearLayout2.getChildCount() - 1);
        }
    }

    private final InterfaceC2855x0 U3(DocumentFile documentFile, String str, J4.e eVar) {
        InterfaceC2855x0 d8;
        d8 = AbstractC2829k.d(i6.N.a(C2812b0.b()), null, null, new C2517q(documentFile, str, eVar, this, null), 3, null);
        return d8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U4() {
        LinearLayout linearLayout = this.f29476D;
        LinearLayout linearLayout2 = null;
        if (linearLayout == null) {
            AbstractC3159y.y("llBreadcrumb");
            linearLayout = null;
        }
        linearLayout.removeAllViews();
        LayoutInflater layoutInflater = getLayoutInflater();
        int i8 = E4.f.f2178b;
        LinearLayout linearLayout3 = this.f29476D;
        if (linearLayout3 == null) {
            AbstractC3159y.y("llBreadcrumb");
            linearLayout3 = null;
        }
        View inflate = layoutInflater.inflate(i8, (ViewGroup) linearLayout3, false);
        AbstractC3159y.g(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout4 = (LinearLayout) inflate;
        TextView textView = (TextView) linearLayout4.findViewById(e.f2167w1);
        if (this.f29499p0) {
            textView.setText(getString(h.f2247k0));
        } else {
            textView.setText(getString(h.f2220U));
        }
        textView.setTypeface(j.f2272g.u());
        LinearLayout linearLayout5 = this.f29476D;
        if (linearLayout5 == null) {
            AbstractC3159y.y("llBreadcrumb");
        } else {
            linearLayout2 = linearLayout5;
        }
        linearLayout2.addView(linearLayout4);
    }

    private final InterfaceC2855x0 V3(File file, Uri uri, J4.e eVar) {
        InterfaceC2855x0 d8;
        d8 = AbstractC2829k.d(i6.N.a(C2812b0.b()), null, null, new C2516p(file, uri, eVar, this, null), 3, null);
        return d8;
    }

    private final void V4() {
        Intent intent = new Intent();
        DocumentFile documentFile = this.f29493U;
        if (documentFile != null) {
            AbstractC3159y.f(documentFile);
            if (documentFile.canWrite()) {
                DocumentFile documentFile2 = this.f29493U;
                AbstractC3159y.f(documentFile2);
                intent.setData(documentFile2.getUri());
            } else {
                o5();
                return;
            }
        } else {
            File file = this.f29497Y;
            AbstractC3159y.f(file);
            if (file.canWrite()) {
                File file2 = this.f29497Y;
                AbstractC3159y.f(file2);
                intent.putExtra("path_selected", file2.getAbsolutePath());
            } else {
                o5();
                return;
            }
        }
        intent.putExtra("sdcard_selected", this.f29499p0);
        setResult(145, intent);
        finish();
    }

    private final InterfaceC2855x0 W3(File file, String str, J4.e eVar) {
        InterfaceC2855x0 d8;
        d8 = AbstractC2829k.d(i6.N.a(C2812b0.b()), null, null, new C2515o(file, str, eVar, this, null), 3, null);
        return d8;
    }

    private final void W4() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: F4.C
            @Override // java.lang.Runnable
            public final void run() {
                FileExplorerActivity.X4(FileExplorerActivity.this);
            }
        });
    }

    private final void X3() {
        AbstractC2829k.d(i6.N.a(C2812b0.b()), null, null, new C2519s(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X4(FileExplorerActivity this$0) {
        AbstractC3159y.i(this$0, "this$0");
        HorizontalScrollView horizontalScrollView = this$0.f29477E;
        LinearLayout linearLayout = null;
        if (horizontalScrollView == null) {
            AbstractC3159y.y("svBreadcrumb");
            horizontalScrollView = null;
        }
        LinearLayout linearLayout2 = this$0.f29476D;
        if (linearLayout2 == null) {
            AbstractC3159y.y("llBreadcrumb");
            linearLayout2 = null;
        }
        int right = linearLayout2.getRight();
        LinearLayout linearLayout3 = this$0.f29476D;
        if (linearLayout3 == null) {
            AbstractC3159y.y("llBreadcrumb");
        } else {
            linearLayout = linearLayout3;
        }
        horizontalScrollView.scrollTo(right, linearLayout.getTop());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object Y3(P5.d r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.uptodown.core.activities.FileExplorerActivity.C2520t
            if (r0 == 0) goto L13
            r0 = r9
            com.uptodown.core.activities.FileExplorerActivity$t r0 = (com.uptodown.core.activities.FileExplorerActivity.C2520t) r0
            int r1 = r0.f29629e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29629e = r1
            goto L18
        L13:
            com.uptodown.core.activities.FileExplorerActivity$t r0 = new com.uptodown.core.activities.FileExplorerActivity$t
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f29627c
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f29629e
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L50
            if (r2 == r5) goto L44
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            L5.t.b(r9)
            goto L9d
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L38:
            java.lang.Object r2 = r0.f29626b
            kotlin.jvm.internal.Q r2 = (kotlin.jvm.internal.Q) r2
            java.lang.Object r4 = r0.f29625a
            com.uptodown.core.activities.FileExplorerActivity r4 = (com.uptodown.core.activities.FileExplorerActivity) r4
            L5.t.b(r9)
            goto L87
        L44:
            java.lang.Object r2 = r0.f29626b
            kotlin.jvm.internal.Q r2 = (kotlin.jvm.internal.Q) r2
            java.lang.Object r5 = r0.f29625a
            com.uptodown.core.activities.FileExplorerActivity r5 = (com.uptodown.core.activities.FileExplorerActivity) r5
            L5.t.b(r9)
            goto L70
        L50:
            L5.t.b(r9)
            kotlin.jvm.internal.Q r9 = new kotlin.jvm.internal.Q
            r9.<init>()
            i6.J0 r2 = i6.C2812b0.c()
            com.uptodown.core.activities.FileExplorerActivity$u r7 = new com.uptodown.core.activities.FileExplorerActivity$u
            r7.<init>(r6)
            r0.f29625a = r8
            r0.f29626b = r9
            r0.f29629e = r5
            java.lang.Object r2 = i6.AbstractC2825i.g(r2, r7, r0)
            if (r2 != r1) goto L6e
            return r1
        L6e:
            r5 = r8
            r2 = r9
        L70:
            i6.I r9 = i6.C2812b0.b()
            com.uptodown.core.activities.FileExplorerActivity$v r7 = new com.uptodown.core.activities.FileExplorerActivity$v
            r7.<init>(r2, r6)
            r0.f29625a = r5
            r0.f29626b = r2
            r0.f29629e = r4
            java.lang.Object r9 = i6.AbstractC2825i.g(r9, r7, r0)
            if (r9 != r1) goto L86
            return r1
        L86:
            r4 = r5
        L87:
            i6.J0 r9 = i6.C2812b0.c()
            com.uptodown.core.activities.FileExplorerActivity$w r5 = new com.uptodown.core.activities.FileExplorerActivity$w
            r5.<init>(r2, r6)
            r0.f29625a = r6
            r0.f29626b = r6
            r0.f29629e = r3
            java.lang.Object r9 = i6.AbstractC2825i.g(r9, r5, r0)
            if (r9 != r1) goto L9d
            return r1
        L9d:
            L5.I r9 = L5.I.f6474a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.core.activities.FileExplorerActivity.Y3(P5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y4(String str) {
        CharSequence charSequence;
        boolean q8 = new G4.a(this).q();
        if (str == null) {
            SearchView searchView = this.f29481I;
            if (searchView != null) {
                charSequence = searchView.getQuery();
            } else {
                charSequence = null;
            }
            str = String.valueOf(charSequence);
        }
        if (str.length() > 0 || !q8) {
            ArrayList arrayList = this.f29495W;
            if (arrayList != null) {
                AbstractC3159y.f(arrayList);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    File file = (File) obj;
                    String name = file.getName();
                    AbstractC3159y.h(name, "file.name");
                    if (n.F(name, str, true)) {
                        if (!q8) {
                            String name2 = file.getName();
                            AbstractC3159y.h(name2, "file.name");
                            if (!n.C(name2, ".", false, 2, null)) {
                            }
                        }
                        arrayList2.add(obj);
                    }
                }
                this.f29496X = arrayList2;
                return;
            }
            ArrayList arrayList3 = this.f29491S;
            if (arrayList3 != null) {
                AbstractC3159y.f(arrayList3);
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : arrayList3) {
                    DocumentFile documentFile = (DocumentFile) obj2;
                    String name3 = documentFile.getName();
                    AbstractC3159y.f(name3);
                    if (n.F(name3, str, true)) {
                        if (!q8) {
                            String name4 = documentFile.getName();
                            AbstractC3159y.f(name4);
                            if (!n.C(name4, ".", false, 2, null)) {
                            }
                        }
                        arrayList4.add(obj2);
                    }
                }
                this.f29492T = arrayList4;
                return;
            }
            return;
        }
        ArrayList arrayList5 = this.f29495W;
        if (arrayList5 != null) {
            this.f29496X = arrayList5;
            return;
        }
        ArrayList arrayList6 = this.f29491S;
        if (arrayList6 != null) {
            this.f29492T = arrayList6;
        }
    }

    private final void Z3(Object obj) {
        kotlin.jvm.internal.T t8;
        AlertDialog alertDialog;
        if (!isFinishing()) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            LayoutInflater layoutInflater = getLayoutInflater();
            AbstractC3159y.h(layoutInflater, "layoutInflater");
            View inflate = layoutInflater.inflate(E4.f.f2183g, (ViewGroup) null, false);
            TextView textView = (TextView) inflate.findViewById(e.f2101a1);
            j.a aVar = j.f2272g;
            textView.setTypeface(aVar.t());
            TextView textView2 = (TextView) inflate.findViewById(e.f2076S0);
            textView2.setTypeface(aVar.u());
            RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(e.f2081U);
            final EditText editText = (EditText) inflate.findViewById(e.f2138n);
            editText.setTypeface(aVar.u());
            TextView textView3 = (TextView) inflate.findViewById(e.f2085V0);
            textView3.setTypeface(aVar.u());
            textView3.setText(".zip");
            ((TextView) inflate.findViewById(e.f2094Y0)).setTypeface(aVar.u());
            TextView textView4 = (TextView) inflate.findViewById(e.f2091X0);
            textView4.setTypeface(aVar.u());
            TextView textView5 = (TextView) inflate.findViewById(e.f2050J1);
            textView5.setTypeface(aVar.t());
            TextView textView6 = (TextView) inflate.findViewById(e.f2139n0);
            textView6.setTypeface(aVar.t());
            TextView textView7 = (TextView) inflate.findViewById(e.f2022A0);
            textView7.setTypeface(aVar.t());
            ProgressBar progressBar = (ProgressBar) inflate.findViewById(e.f2030D);
            kotlin.jvm.internal.T t9 = new kotlin.jvm.internal.T();
            ArrayList arrayList = new ArrayList();
            t9.f33747a = arrayList;
            if (obj != null) {
                arrayList.add(obj);
            } else {
                b bVar = this.f29490R;
                AbstractC3159y.f(bVar);
                t9.f33747a = bVar.b();
            }
            final ArrayList arrayList2 = new ArrayList();
            if (!((Collection) t9.f33747a).isEmpty()) {
                Iterator it = ((ArrayList) t9.f33747a).iterator();
                String str = "";
                while (it.hasNext()) {
                    Object next = it.next();
                    Iterator it2 = it;
                    kotlin.jvm.internal.T t10 = t9;
                    if (next instanceof File) {
                        str = str + ((File) next).getName() + '\n';
                        arrayList2.add(next);
                    } else if (next instanceof DocumentFile) {
                        str = str + ((DocumentFile) next).getName() + '\n';
                    }
                    it = it2;
                    t9 = t10;
                }
                t8 = t9;
                textView4.setText(str);
            } else {
                t8 = t9;
            }
            final kotlin.jvm.internal.T t11 = new kotlin.jvm.internal.T();
            final C2524x c2524x = new C2524x(progressBar, textView5, editText, this, textView6, textView2, relativeLayout, textView7);
            final kotlin.jvm.internal.T t12 = t8;
            textView6.setOnClickListener(new View.OnClickListener() { // from class: F4.I
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FileExplorerActivity.a4(editText, t12, this, arrayList2, t11, c2524x, view);
                }
            });
            textView7.setOnClickListener(new View.OnClickListener() { // from class: F4.J
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FileExplorerActivity.b4(kotlin.jvm.internal.T.this, this, view);
                }
            });
            builder.setView(inflate);
            this.f29487O = builder.create();
            if (!isFinishing() && (alertDialog = this.f29487O) != null) {
                AbstractC3159y.f(alertDialog);
                Window window = alertDialog.getWindow();
                if (window != null) {
                    window.setBackgroundDrawable(new ColorDrawable(0));
                }
                AlertDialog alertDialog2 = this.f29487O;
                AbstractC3159y.f(alertDialog2);
                alertDialog2.show();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z4() {
        String str;
        DocumentFile documentFile = this.f29493U;
        RecyclerView recyclerView = null;
        if (documentFile != null) {
            AbstractC3159y.f(documentFile);
            String lastPathSegment = documentFile.getUri().getLastPathSegment();
            if (lastPathSegment != null) {
                str = lastPathSegment.substring(n.X(lastPathSegment, ":", 0, false, 6, null) + 1);
                AbstractC3159y.h(str, "this as java.lang.String).substring(startIndex)");
            } else {
                str = "";
            }
            if (this.f29499p0) {
                if (str.length() == 0) {
                    TextView textView = this.f29507x;
                    if (textView == null) {
                        AbstractC3159y.y("tvBreadCrumb");
                        textView = null;
                    }
                    textView.setText(getString(h.f2247k0));
                } else {
                    t3();
                }
            } else {
                TextView textView2 = this.f29507x;
                if (textView2 == null) {
                    AbstractC3159y.y("tvBreadCrumb");
                    textView2 = null;
                }
                textView2.setText(getString(h.f2220U) + '/' + str);
            }
        } else {
            File file = this.f29497Y;
            if (file != null) {
                if (AbstractC3159y.d(file, Environment.getExternalStorageDirectory())) {
                    TextView textView3 = this.f29507x;
                    if (textView3 == null) {
                        AbstractC3159y.y("tvBreadCrumb");
                        textView3 = null;
                    }
                    textView3.setText(getString(h.f2220U));
                } else {
                    u3();
                }
            }
        }
        if (this.f29490R == null) {
            this.f29490R = new b(this.f29510y0);
            RecyclerView recyclerView2 = this.f29509y;
            if (recyclerView2 == null) {
                AbstractC3159y.y("rvFiles");
            } else {
                recyclerView = recyclerView2;
            }
            recyclerView.setAdapter(this.f29490R);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f29492T;
        if (arrayList2 != null) {
            AbstractC3159y.f(arrayList2);
            arrayList.addAll(arrayList2);
        } else {
            ArrayList arrayList3 = this.f29496X;
            if (arrayList3 != null) {
                AbstractC3159y.f(arrayList3);
                arrayList.addAll(arrayList3);
            }
        }
        b bVar = this.f29490R;
        AbstractC3159y.f(bVar);
        bVar.g(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a4(EditText editText, kotlin.jvm.internal.T itemsToCompress, FileExplorerActivity this$0, ArrayList filesPath, kotlin.jvm.internal.T compressFilesJob, C2524x compressListener, View view) {
        int i8;
        String str;
        AbstractC3159y.i(itemsToCompress, "$itemsToCompress");
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(filesPath, "$filesPath");
        AbstractC3159y.i(compressFilesJob, "$compressFilesJob");
        AbstractC3159y.i(compressListener, "$compressListener");
        if (editText.getText().toString().length() > 0) {
            if (!((Collection) itemsToCompress.f33747a).isEmpty()) {
                File file = this$0.f29497Y;
                long j8 = 0;
                if (file != null) {
                    AbstractC3159y.f(file);
                    long usableSpace = file.getUsableSpace();
                    Iterator it = filesPath.iterator();
                    while (it.hasNext()) {
                        j8 += ((File) it.next()).length();
                    }
                    if (usableSpace > j8 * 2) {
                        StringBuilder sb = new StringBuilder();
                        File file2 = this$0.f29497Y;
                        if (file2 != null) {
                            str = file2.getAbsolutePath();
                        } else {
                            str = null;
                        }
                        sb.append(str);
                        sb.append('/');
                        sb.append((Object) editText.getText());
                        sb.append(".zip");
                        File file3 = new File(sb.toString());
                        if (!file3.exists()) {
                            j.f2272g.d(this$0, editText);
                            compressFilesJob.f33747a = this$0.B3(filesPath, file3, compressListener);
                            return;
                        } else {
                            Toast.makeText(this$0, this$0.getString(h.f2236f, editText.getText()), 0).show();
                            return;
                        }
                    }
                    Toast.makeText(this$0, this$0.getString(h.f2207H), 0).show();
                    return;
                }
                if (this$0.f29493U != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = ((ArrayList) itemsToCompress.f33747a).iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (next instanceof DocumentFile) {
                            arrayList.add(next);
                        }
                    }
                    N4.f fVar = new N4.f();
                    Context applicationContext = this$0.getApplicationContext();
                    AbstractC3159y.h(applicationContext, "applicationContext");
                    DocumentFile documentFile = this$0.f29493U;
                    AbstractC3159y.f(documentFile);
                    long l8 = fVar.l(applicationContext, documentFile);
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        j8 += ((DocumentFile) it3.next()).length();
                    }
                    if (l8 > j8 * 2) {
                        String str2 = ((Object) editText.getText()) + ".zip";
                        DocumentFile documentFile2 = this$0.f29493U;
                        AbstractC3159y.f(documentFile2);
                        DocumentFile[] listFiles = documentFile2.listFiles();
                        AbstractC3159y.h(listFiles, "currentDirectoryDocumentFile!!.listFiles()");
                        int length = listFiles.length;
                        boolean z8 = false;
                        int i9 = 0;
                        while (i9 < length) {
                            if (AbstractC3159y.d(listFiles[i9].getName(), str2)) {
                                i8 = 1;
                                Toast.makeText(this$0, this$0.getString(h.f2236f, editText.getText()), 0).show();
                                z8 = true;
                            } else {
                                i8 = 1;
                            }
                            i9 += i8;
                        }
                        if (!z8) {
                            j.f2272g.d(this$0, editText);
                            DocumentFile documentFile3 = this$0.f29493U;
                            AbstractC3159y.f(documentFile3);
                            DocumentFile createFile = documentFile3.createFile(new N4.f().i(str2), str2);
                            AbstractC3159y.f(createFile);
                            compressFilesJob.f33747a = this$0.A3(arrayList, createFile, compressListener);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        Toast.makeText(this$0, h.f2238g, 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a5() {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory != null) {
            this.f29497Y = externalStorageDirectory;
            this.f29493U = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b4(kotlin.jvm.internal.T compressFilesJob, FileExplorerActivity this$0, View view) {
        AbstractC3159y.i(compressFilesJob, "$compressFilesJob");
        AbstractC3159y.i(this$0, "this$0");
        InterfaceC2855x0 interfaceC2855x0 = (InterfaceC2855x0) compressFilesJob.f33747a;
        if (interfaceC2855x0 != null) {
            InterfaceC2855x0.a.a(interfaceC2855x0, null, 1, null);
        }
        AlertDialog alertDialog = this$0.f29487O;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b5() {
        int i8;
        MenuItem menuItem;
        MenuItem menuItem2;
        MenuItem menuItem3;
        Menu menu;
        Menu menu2;
        Menu menu3;
        Menu menu4;
        MenuItem menuItem4;
        MenuItem menuItem5;
        MenuItem menuItem6;
        Menu menu5;
        Menu menu6;
        Menu menu7;
        Menu menu8;
        b bVar = this.f29490R;
        if (bVar != null) {
            AbstractC3159y.f(bVar);
            i8 = bVar.a();
        } else {
            i8 = 0;
        }
        MenuItem menuItem7 = null;
        if (i8 > 0) {
            Toolbar toolbar = this.f29488P;
            if (toolbar != null && (menu8 = toolbar.getMenu()) != null) {
                menuItem4 = menu8.findItem(e.f2111e);
            } else {
                menuItem4 = null;
            }
            if (menuItem4 != null) {
                menuItem4.setEnabled(true);
            }
            Toolbar toolbar2 = this.f29488P;
            if (toolbar2 != null && (menu7 = toolbar2.getMenu()) != null) {
                menuItem5 = menu7.findItem(e.f2102b);
            } else {
                menuItem5 = null;
            }
            if (menuItem5 != null) {
                menuItem5.setEnabled(true);
            }
            Toolbar toolbar3 = this.f29488P;
            if (toolbar3 != null && (menu6 = toolbar3.getMenu()) != null) {
                menuItem6 = menu6.findItem(e.f2108d);
            } else {
                menuItem6 = null;
            }
            if (menuItem6 != null) {
                menuItem6.setEnabled(true);
            }
            Toolbar toolbar4 = this.f29488P;
            if (toolbar4 != null && (menu5 = toolbar4.getMenu()) != null) {
                menuItem7 = menu5.findItem(e.f2099a);
            }
            if (menuItem7 != null) {
                menuItem7.setEnabled(true);
            }
        } else {
            Toolbar toolbar5 = this.f29488P;
            if (toolbar5 != null && (menu4 = toolbar5.getMenu()) != null) {
                menuItem = menu4.findItem(e.f2111e);
            } else {
                menuItem = null;
            }
            if (menuItem != null) {
                menuItem.setEnabled(false);
            }
            Toolbar toolbar6 = this.f29488P;
            if (toolbar6 != null && (menu3 = toolbar6.getMenu()) != null) {
                menuItem2 = menu3.findItem(e.f2102b);
            } else {
                menuItem2 = null;
            }
            if (menuItem2 != null) {
                menuItem2.setEnabled(false);
            }
            Toolbar toolbar7 = this.f29488P;
            if (toolbar7 != null && (menu2 = toolbar7.getMenu()) != null) {
                menuItem3 = menu2.findItem(e.f2108d);
            } else {
                menuItem3 = null;
            }
            if (menuItem3 != null) {
                menuItem3.setEnabled(false);
            }
            Toolbar toolbar8 = this.f29488P;
            if (toolbar8 != null && (menu = toolbar8.getMenu()) != null) {
                menuItem7 = menu.findItem(e.f2099a);
            }
            if (menuItem7 != null) {
                menuItem7.setEnabled(false);
            }
        }
        TextView textView = this.f29489Q;
        if (textView != null) {
            textView.setText(getString(h.f2200A, String.valueOf(i8)));
        }
    }

    private final void c4() {
        AlertDialog alertDialog;
        if (!isFinishing()) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            LayoutInflater layoutInflater = getLayoutInflater();
            AbstractC3159y.h(layoutInflater, "layoutInflater");
            View inflate = layoutInflater.inflate(E4.f.f2185i, (ViewGroup) null, false);
            TextView textView = (TextView) inflate.findViewById(e.f2104b1);
            j.a aVar = j.f2272g;
            textView.setTypeface(aVar.t());
            ((TextView) inflate.findViewById(e.f2079T0)).setTypeface(aVar.u());
            final EditText editText = (EditText) inflate.findViewById(e.f2141o);
            editText.setTypeface(aVar.u());
            TextView textView2 = (TextView) inflate.findViewById(e.f2142o0);
            textView2.setTypeface(aVar.t());
            TextView textView3 = (TextView) inflate.findViewById(e.f2025B0);
            textView3.setTypeface(aVar.t());
            textView2.setOnClickListener(new View.OnClickListener() { // from class: F4.x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FileExplorerActivity.d4(editText, this, view);
                }
            });
            textView3.setOnClickListener(new View.OnClickListener() { // from class: F4.y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FileExplorerActivity.e4(FileExplorerActivity.this, view);
                }
            });
            builder.setView(inflate);
            this.f29487O = builder.create();
            if (!isFinishing() && (alertDialog = this.f29487O) != null) {
                AbstractC3159y.f(alertDialog);
                Window window = alertDialog.getWindow();
                if (window != null) {
                    window.setBackgroundDrawable(new ColorDrawable(0));
                }
                AlertDialog alertDialog2 = this.f29487O;
                AbstractC3159y.f(alertDialog2);
                alertDialog2.show();
            }
        }
    }

    private final void c5() {
        if (!this.f29498Z) {
            RadioButton radioButton = this.f29486N;
            AbstractC3159y.f(radioButton);
            radioButton.setBackground(ContextCompat.getDrawable(this, E4.d.f2010j));
            RadioButton radioButton2 = this.f29485M;
            AbstractC3159y.f(radioButton2);
            radioButton2.setBackground(ContextCompat.getDrawable(this, E4.d.f2013m));
            RadioButton radioButton3 = this.f29484L;
            AbstractC3159y.f(radioButton3);
            radioButton3.setBackground(ContextCompat.getDrawable(this, E4.d.f2005e));
            return;
        }
        RadioButton radioButton4 = this.f29486N;
        AbstractC3159y.f(radioButton4);
        radioButton4.setBackground(ContextCompat.getDrawable(this, E4.d.f2012l));
        RadioButton radioButton5 = this.f29485M;
        AbstractC3159y.f(radioButton5);
        radioButton5.setBackground(ContextCompat.getDrawable(this, E4.d.f2015o));
        RadioButton radioButton6 = this.f29484L;
        AbstractC3159y.f(radioButton6);
        radioButton6.setBackground(ContextCompat.getDrawable(this, E4.d.f2007g));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d4(EditText editText, FileExplorerActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        if (editText.getText().toString().length() > 0) {
            AbstractC2829k.d(i6.N.a(C2812b0.b()), null, null, new C2525y(editText, null), 3, null);
        } else {
            Toast.makeText(this$0, h.f2238g, 0).show();
        }
    }

    private final void d5() {
        if (!this.f29498Z) {
            RadioButton radioButton = this.f29484L;
            AbstractC3159y.f(radioButton);
            radioButton.setBackground(ContextCompat.getDrawable(this, E4.d.f2006f));
            RadioButton radioButton2 = this.f29485M;
            AbstractC3159y.f(radioButton2);
            radioButton2.setBackground(ContextCompat.getDrawable(this, E4.d.f2013m));
            RadioButton radioButton3 = this.f29486N;
            AbstractC3159y.f(radioButton3);
            radioButton3.setBackground(ContextCompat.getDrawable(this, E4.d.f2009i));
            return;
        }
        RadioButton radioButton4 = this.f29484L;
        AbstractC3159y.f(radioButton4);
        radioButton4.setBackground(ContextCompat.getDrawable(this, E4.d.f2008h));
        RadioButton radioButton5 = this.f29485M;
        AbstractC3159y.f(radioButton5);
        radioButton5.setBackground(ContextCompat.getDrawable(this, E4.d.f2015o));
        RadioButton radioButton6 = this.f29486N;
        AbstractC3159y.f(radioButton6);
        radioButton6.setBackground(ContextCompat.getDrawable(this, E4.d.f2011k));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e4(FileExplorerActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AlertDialog alertDialog = this$0.f29487O;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    private final void e5() {
        if (!this.f29498Z) {
            RadioButton radioButton = this.f29485M;
            AbstractC3159y.f(radioButton);
            radioButton.setBackground(ContextCompat.getDrawable(this, E4.d.f2014n));
            RadioButton radioButton2 = this.f29484L;
            AbstractC3159y.f(radioButton2);
            radioButton2.setBackground(ContextCompat.getDrawable(this, E4.d.f2005e));
            RadioButton radioButton3 = this.f29486N;
            AbstractC3159y.f(radioButton3);
            radioButton3.setBackground(ContextCompat.getDrawable(this, E4.d.f2009i));
            return;
        }
        RadioButton radioButton4 = this.f29485M;
        AbstractC3159y.f(radioButton4);
        radioButton4.setBackground(ContextCompat.getDrawable(this, E4.d.f2016p));
        RadioButton radioButton5 = this.f29484L;
        AbstractC3159y.f(radioButton5);
        radioButton5.setBackground(ContextCompat.getDrawable(this, E4.d.f2007g));
        RadioButton radioButton6 = this.f29486N;
        AbstractC3159y.f(radioButton6);
        radioButton6.setBackground(ContextCompat.getDrawable(this, E4.d.f2011k));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f4(final Object obj) {
        String str;
        AlertDialog alertDialog;
        if (!isFinishing()) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            LayoutInflater layoutInflater = getLayoutInflater();
            AbstractC3159y.h(layoutInflater, "layoutInflater");
            TextView textView = null;
            View inflate = layoutInflater.inflate(E4.f.f2186j, (ViewGroup) null, false);
            TextView textView2 = (TextView) inflate.findViewById(e.f2107c1);
            j.a aVar = j.f2272g;
            textView2.setTypeface(aVar.t());
            TextView textView3 = (TextView) inflate.findViewById(e.f2082U0);
            textView3.setTypeface(aVar.u());
            RadioButton radioButton = (RadioButton) inflate.findViewById(e.f2051K);
            radioButton.setTypeface(aVar.u());
            RadioButton radioButton2 = (RadioButton) inflate.findViewById(e.f2054L);
            radioButton2.setTypeface(aVar.u());
            View findViewById = inflate.findViewById(e.f2073R0);
            AbstractC3159y.h(findViewById, "view.findViewById(R.id.t…decompress_selected_path)");
            TextView textView4 = (TextView) findViewById;
            this.f29479G = textView4;
            if (textView4 == null) {
                AbstractC3159y.y("tvSelectedPath");
                textView4 = null;
            }
            textView4.setTypeface(aVar.u());
            final kotlin.jvm.internal.T t8 = new kotlin.jvm.internal.T();
            if (obj instanceof File) {
                t8.f33747a = ((File) obj).getParent();
            } else if (obj instanceof DocumentFile) {
                DocumentFile documentFile = this.f29493U;
                AbstractC3159y.f(documentFile);
                String lastPathSegment = documentFile.getUri().getLastPathSegment();
                if (lastPathSegment != null) {
                    DocumentFile documentFile2 = this.f29493U;
                    AbstractC3159y.f(documentFile2);
                    String lastPathSegment2 = documentFile2.getUri().getLastPathSegment();
                    AbstractC3159y.f(lastPathSegment2);
                    str = lastPathSegment.substring(n.X(lastPathSegment2, ":", 0, false, 6, null) + 1);
                    AbstractC3159y.h(str, "this as java.lang.String).substring(startIndex)");
                } else {
                    str = null;
                }
                t8.f33747a = getString(h.f2247k0) + '/' + str;
            }
            TextView textView5 = this.f29479G;
            if (textView5 == null) {
                AbstractC3159y.y("tvSelectedPath");
                textView5 = null;
            }
            textView5.setText((CharSequence) t8.f33747a);
            this.f29508x0 = (String) t8.f33747a;
            TextView textView6 = (TextView) inflate.findViewById(e.f2139n0);
            textView6.setTypeface(aVar.t());
            TextView textView7 = (TextView) inflate.findViewById(e.f2028C0);
            textView7.setTypeface(aVar.t());
            ProgressBar progressBar = (ProgressBar) inflate.findViewById(e.f2033E);
            TextView textView8 = this.f29479G;
            if (textView8 == null) {
                AbstractC3159y.y("tvSelectedPath");
            } else {
                textView = textView8;
            }
            textView.setOnClickListener(new View.OnClickListener() { // from class: F4.Q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FileExplorerActivity.g4(FileExplorerActivity.this, view);
                }
            });
            radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: F4.S
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z8) {
                    FileExplorerActivity.h4(FileExplorerActivity.this, t8, compoundButton, z8);
                }
            });
            radioButton2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: F4.T
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z8) {
                    FileExplorerActivity.i4(FileExplorerActivity.this, compoundButton, z8);
                }
            });
            final kotlin.jvm.internal.T t9 = new kotlin.jvm.internal.T();
            final C2526z c2526z = new C2526z(textView3, this, inflate, progressBar, textView6, textView7);
            textView6.setOnClickListener(new View.OnClickListener() { // from class: F4.U
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FileExplorerActivity.j4(obj, this, t9, c2526z, view);
                }
            });
            textView7.setOnClickListener(new View.OnClickListener() { // from class: F4.V
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FileExplorerActivity.k4(kotlin.jvm.internal.T.this, this, view);
                }
            });
            builder.setView(inflate);
            this.f29487O = builder.create();
            if (!isFinishing() && (alertDialog = this.f29487O) != null) {
                AbstractC3159y.f(alertDialog);
                Window window = alertDialog.getWindow();
                if (window != null) {
                    window.setBackgroundDrawable(new ColorDrawable(0));
                }
                AlertDialog alertDialog2 = this.f29487O;
                AbstractC3159y.f(alertDialog2);
                alertDialog2.show();
            }
        }
    }

    private final void f5(boolean z8) {
        LinearLayout linearLayout = null;
        if (z8) {
            TextView textView = this.f29478F;
            if (textView == null) {
                AbstractC3159y.y("tvEmptyDirectory");
                textView = null;
            }
            textView.setText(getString(h.f2205F));
        } else {
            TextView textView2 = this.f29478F;
            if (textView2 == null) {
                AbstractC3159y.y("tvEmptyDirectory");
                textView2 = null;
            }
            textView2.setText(getString(h.f2233d0));
        }
        LinearLayout linearLayout2 = this.f29474C;
        if (linearLayout2 == null) {
            AbstractC3159y.y("llEmptyDirectory");
        } else {
            linearLayout = linearLayout2;
        }
        linearLayout.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g4(FileExplorerActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        Intent intent = new Intent(this$0.getApplicationContext(), (Class<?>) FileExplorerActivity.class);
        intent.putExtra("select_path", 1);
        this$0.f29475C0.launch(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g5(String str) {
        int i8 = 0;
        if (str != null) {
            ArrayList arrayList = this.f29492T;
            if (arrayList != null) {
                AbstractC3159y.f(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    DocumentFile documentFile = (DocumentFile) it.next();
                    if (documentFile.getName() != null && n.s(documentFile.getName(), str, true)) {
                        break;
                    } else {
                        i8++;
                    }
                }
            } else {
                ArrayList arrayList2 = this.f29496X;
                if (arrayList2 != null) {
                    AbstractC3159y.f(arrayList2);
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext() && !n.s(((File) it2.next()).getName(), str, true)) {
                        i8++;
                    }
                }
            }
        }
        RecyclerView recyclerView = this.f29509y;
        if (recyclerView == null) {
            AbstractC3159y.y("rvFiles");
            recyclerView = null;
        }
        recyclerView.scrollToPosition(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h4(FileExplorerActivity this$0, kotlin.jvm.internal.T parentPath, CompoundButton compoundButton, boolean z8) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(parentPath, "$parentPath");
        if (z8) {
            TextView textView = this$0.f29479G;
            TextView textView2 = null;
            if (textView == null) {
                AbstractC3159y.y("tvSelectedPath");
                textView = null;
            }
            textView.setVisibility(8);
            TextView textView3 = this$0.f29479G;
            if (textView3 == null) {
                AbstractC3159y.y("tvSelectedPath");
            } else {
                textView2 = textView3;
            }
            textView2.setText((CharSequence) parentPath.f33747a);
        }
    }

    private final void h5(String str) {
        if (str != null) {
            Intent intent = new Intent("android.intent.action.SEND");
            Uri uriForFile = FileProvider.getUriForFile(this, getPackageName() + ".provider", new File(str));
            intent.setType(getContentResolver().getType(uriForFile));
            intent.putExtra("android.intent.extra.STREAM", uriForFile);
            startActivity(Intent.createChooser(intent, getString(h.f2219T)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i4(FileExplorerActivity this$0, CompoundButton compoundButton, boolean z8) {
        AbstractC3159y.i(this$0, "this$0");
        if (z8) {
            TextView textView = this$0.f29479G;
            if (textView == null) {
                AbstractC3159y.y("tvSelectedPath");
                textView = null;
            }
            textView.setVisibility(0);
        }
    }

    private final void i5() {
        MenuItem menuItem;
        MenuItem menuItem2;
        MenuItem menuItem3;
        MenuItem menuItem4;
        MenuItem menuItem5;
        MenuItem menuItem6;
        Menu menu;
        Menu menu2;
        Menu menu3;
        Menu menu4;
        Menu menu5;
        Menu menu6;
        Menu menu7;
        Toolbar toolbar = this.f29488P;
        MenuItem menuItem7 = null;
        if (toolbar != null && (menu7 = toolbar.getMenu()) != null) {
            menuItem = menu7.findItem(e.f2117g);
        } else {
            menuItem = null;
        }
        if (menuItem != null) {
            menuItem.setVisible(false);
        }
        Toolbar toolbar2 = this.f29488P;
        if (toolbar2 != null && (menu6 = toolbar2.getMenu()) != null) {
            menuItem2 = menu6.findItem(e.f2111e);
        } else {
            menuItem2 = null;
        }
        if (menuItem2 != null) {
            menuItem2.setVisible(true);
        }
        Toolbar toolbar3 = this.f29488P;
        if (toolbar3 != null && (menu5 = toolbar3.getMenu()) != null) {
            menuItem3 = menu5.findItem(e.f2105c);
        } else {
            menuItem3 = null;
        }
        if (menuItem3 != null) {
            menuItem3.setVisible(true);
        }
        Toolbar toolbar4 = this.f29488P;
        if (toolbar4 != null && (menu4 = toolbar4.getMenu()) != null) {
            menuItem4 = menu4.findItem(e.f2102b);
        } else {
            menuItem4 = null;
        }
        if (menuItem4 != null) {
            menuItem4.setVisible(true);
        }
        Toolbar toolbar5 = this.f29488P;
        if (toolbar5 != null && (menu3 = toolbar5.getMenu()) != null) {
            menuItem5 = menu3.findItem(e.f2099a);
        } else {
            menuItem5 = null;
        }
        if (menuItem5 != null) {
            menuItem5.setVisible(true);
        }
        Toolbar toolbar6 = this.f29488P;
        if (toolbar6 != null && (menu2 = toolbar6.getMenu()) != null) {
            menuItem6 = menu2.findItem(e.f2108d);
        } else {
            menuItem6 = null;
        }
        if (menuItem6 != null) {
            menuItem6.setVisible(true);
        }
        b5();
        ArrayList arrayList = this.f29501r0;
        if (arrayList != null) {
            AbstractC3159y.f(arrayList);
            if (!arrayList.isEmpty()) {
                Toolbar toolbar7 = this.f29488P;
                if (toolbar7 != null && (menu = toolbar7.getMenu()) != null) {
                    menuItem7 = menu.findItem(e.f2114f);
                }
                if (menuItem7 != null) {
                    menuItem7.setVisible(true);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j4(Object file, FileExplorerActivity this$0, kotlin.jvm.internal.T decompressFilesJob, C2526z decompressFileListener, View view) {
        long usableSpace;
        Long l8;
        AbstractC3159y.i(file, "$file");
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(decompressFilesJob, "$decompressFilesJob");
        AbstractC3159y.i(decompressFileListener, "$decompressFileListener");
        if (file instanceof File) {
            if (this$0.f29508x0 != null) {
                File file2 = this$0.f29497Y;
                if (file2 != null) {
                    l8 = Long.valueOf(file2.getUsableSpace());
                } else {
                    l8 = null;
                }
                AbstractC3159y.f(l8);
                File file3 = (File) file;
                if (l8.longValue() > file3.length() * 2) {
                    String str = this$0.f29508x0;
                    AbstractC3159y.f(str);
                    decompressFilesJob.f33747a = this$0.W3(file3, str, decompressFileListener);
                    return;
                }
                return;
            }
            if (this$0.f29506w0 != null) {
                N4.f fVar = new N4.f();
                Context applicationContext = this$0.getApplicationContext();
                AbstractC3159y.h(applicationContext, "applicationContext");
                Uri uri = this$0.f29506w0;
                AbstractC3159y.f(uri);
                File file4 = (File) file;
                if (fVar.k(applicationContext, uri) > file4.length() * 2) {
                    Uri uri2 = this$0.f29506w0;
                    AbstractC3159y.f(uri2);
                    decompressFilesJob.f33747a = this$0.V3(file4, uri2, decompressFileListener);
                    return;
                }
                return;
            }
            return;
        }
        if (file instanceof DocumentFile) {
            if (this$0.f29508x0 != null) {
                File file5 = this$0.f29497Y;
                if (file5 == null) {
                    File externalStorageDirectory = Environment.getExternalStorageDirectory();
                    if (externalStorageDirectory != null) {
                        usableSpace = externalStorageDirectory.getUsableSpace();
                    } else {
                        usableSpace = 0;
                    }
                } else {
                    AbstractC3159y.f(file5);
                    usableSpace = file5.getUsableSpace();
                }
                DocumentFile documentFile = (DocumentFile) file;
                if (usableSpace > documentFile.length() * 2) {
                    String str2 = this$0.f29508x0;
                    AbstractC3159y.f(str2);
                    decompressFilesJob.f33747a = this$0.U3(documentFile, str2, decompressFileListener);
                    return;
                }
                return;
            }
            if (this$0.f29506w0 != null) {
                N4.f fVar2 = new N4.f();
                Context applicationContext2 = this$0.getApplicationContext();
                AbstractC3159y.h(applicationContext2, "applicationContext");
                Uri uri3 = this$0.f29506w0;
                AbstractC3159y.f(uri3);
                DocumentFile documentFile2 = (DocumentFile) file;
                if (fVar2.k(applicationContext2, uri3) > documentFile2.length() * 2) {
                    Uri uri4 = this$0.f29506w0;
                    AbstractC3159y.f(uri4);
                    decompressFilesJob.f33747a = this$0.T3(documentFile2, uri4, decompressFileListener);
                    return;
                }
                return;
            }
            DocumentFile documentFile3 = this$0.f29493U;
            if (documentFile3 != null) {
                AbstractC3159y.f(documentFile3);
                Uri uri5 = documentFile3.getUri();
                AbstractC3159y.h(uri5, "currentDirectoryDocumentFile!!.uri");
                decompressFilesJob.f33747a = this$0.T3((DocumentFile) file, uri5, decompressFileListener);
                return;
            }
            File file6 = this$0.f29497Y;
            if (file6 != null) {
                AbstractC3159y.f(file6);
                String absolutePath = file6.getAbsolutePath();
                AbstractC3159y.h(absolutePath, "currentDirFile!!.absolutePath");
                decompressFilesJob.f33747a = this$0.U3((DocumentFile) file, absolutePath, decompressFileListener);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j5() {
        if (this.f29498Z) {
            ArrayList arrayList = this.f29492T;
            if (arrayList != null) {
                AbstractC3159y.f(arrayList);
                if (arrayList.size() > 1) {
                    AbstractC1246t.B(arrayList, new P());
                }
                ArrayList arrayList2 = this.f29492T;
                AbstractC3159y.f(arrayList2);
                if (arrayList2.size() > 1) {
                    AbstractC1246t.B(arrayList2, new Q());
                }
            }
            ArrayList arrayList3 = this.f29496X;
            if (arrayList3 != null) {
                AbstractC3159y.f(arrayList3);
                if (arrayList3.size() > 1) {
                    AbstractC1246t.B(arrayList3, new R());
                }
                ArrayList arrayList4 = this.f29496X;
                AbstractC3159y.f(arrayList4);
                if (arrayList4.size() > 1) {
                    AbstractC1246t.B(arrayList4, new S());
                    return;
                }
                return;
            }
            return;
        }
        ArrayList arrayList5 = this.f29492T;
        if (arrayList5 != null) {
            AbstractC3159y.f(arrayList5);
            if (arrayList5.size() > 1) {
                AbstractC1246t.B(arrayList5, new L());
            }
            ArrayList arrayList6 = this.f29492T;
            AbstractC3159y.f(arrayList6);
            if (arrayList6.size() > 1) {
                AbstractC1246t.B(arrayList6, new M());
            }
        }
        ArrayList arrayList7 = this.f29496X;
        if (arrayList7 != null) {
            AbstractC3159y.f(arrayList7);
            if (arrayList7.size() > 1) {
                AbstractC1246t.B(arrayList7, new N());
            }
            ArrayList arrayList8 = this.f29496X;
            AbstractC3159y.f(arrayList8);
            if (arrayList8.size() > 1) {
                AbstractC1246t.B(arrayList8, new O());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k4(kotlin.jvm.internal.T decompressFilesJob, FileExplorerActivity this$0, View view) {
        AbstractC3159y.i(decompressFilesJob, "$decompressFilesJob");
        AbstractC3159y.i(this$0, "this$0");
        InterfaceC2855x0 interfaceC2855x0 = (InterfaceC2855x0) decompressFilesJob.f33747a;
        if (interfaceC2855x0 != null) {
            InterfaceC2855x0.a.a(interfaceC2855x0, null, 1, null);
        }
        AlertDialog alertDialog = this$0.f29487O;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k5() {
        if (this.f29498Z) {
            ArrayList arrayList = this.f29492T;
            if (arrayList != null) {
                AbstractC3159y.f(arrayList);
                if (arrayList.size() > 1) {
                    AbstractC1246t.B(arrayList, new X());
                }
                ArrayList arrayList2 = this.f29492T;
                AbstractC3159y.f(arrayList2);
                if (arrayList2.size() > 1) {
                    AbstractC1246t.B(arrayList2, new Y());
                }
            }
            ArrayList arrayList3 = this.f29496X;
            if (arrayList3 != null) {
                AbstractC3159y.f(arrayList3);
                if (arrayList3.size() > 1) {
                    AbstractC1246t.B(arrayList3, new Z());
                }
                ArrayList arrayList4 = this.f29496X;
                AbstractC3159y.f(arrayList4);
                if (arrayList4.size() > 1) {
                    AbstractC1246t.B(arrayList4, new a0());
                    return;
                }
                return;
            }
            return;
        }
        ArrayList arrayList5 = this.f29492T;
        if (arrayList5 != null) {
            AbstractC3159y.f(arrayList5);
            if (arrayList5.size() > 1) {
                AbstractC1246t.B(arrayList5, new T());
            }
            ArrayList arrayList6 = this.f29492T;
            AbstractC3159y.f(arrayList6);
            if (arrayList6.size() > 1) {
                AbstractC1246t.B(arrayList6, new U());
            }
        }
        ArrayList arrayList7 = this.f29496X;
        if (arrayList7 != null) {
            AbstractC3159y.f(arrayList7);
            if (arrayList7.size() > 1) {
                AbstractC1246t.B(arrayList7, new V());
            }
            ArrayList arrayList8 = this.f29496X;
            AbstractC3159y.f(arrayList8);
            if (arrayList8.size() > 1) {
                AbstractC1246t.B(arrayList8, new W());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l4() {
        MenuItem menuItem;
        MenuItem menuItem2;
        MenuItem menuItem3;
        MenuItem menuItem4;
        MenuItem menuItem5;
        MenuItem menuItem6;
        Menu menu;
        Menu menu2;
        Menu menu3;
        Menu menu4;
        Menu menu5;
        Menu menu6;
        Menu menu7;
        TextView textView = this.f29489Q;
        if (textView != null) {
            textView.setText(getString(h.f2226a));
        }
        Toolbar toolbar = this.f29488P;
        MenuItem menuItem7 = null;
        if (toolbar != null && (menu7 = toolbar.getMenu()) != null) {
            menuItem = menu7.findItem(e.f2117g);
        } else {
            menuItem = null;
        }
        if (menuItem != null) {
            menuItem.setVisible(true);
        }
        Toolbar toolbar2 = this.f29488P;
        if (toolbar2 != null && (menu6 = toolbar2.getMenu()) != null) {
            menuItem2 = menu6.findItem(e.f2105c);
        } else {
            menuItem2 = null;
        }
        if (menuItem2 != null) {
            menuItem2.setVisible(true);
        }
        Toolbar toolbar3 = this.f29488P;
        if (toolbar3 != null && (menu5 = toolbar3.getMenu()) != null) {
            menuItem3 = menu5.findItem(e.f2111e);
        } else {
            menuItem3 = null;
        }
        if (menuItem3 != null) {
            menuItem3.setVisible(false);
        }
        Toolbar toolbar4 = this.f29488P;
        if (toolbar4 != null && (menu4 = toolbar4.getMenu()) != null) {
            menuItem4 = menu4.findItem(e.f2102b);
        } else {
            menuItem4 = null;
        }
        if (menuItem4 != null) {
            menuItem4.setVisible(false);
        }
        Toolbar toolbar5 = this.f29488P;
        if (toolbar5 != null && (menu3 = toolbar5.getMenu()) != null) {
            menuItem5 = menu3.findItem(e.f2099a);
        } else {
            menuItem5 = null;
        }
        if (menuItem5 != null) {
            menuItem5.setVisible(false);
        }
        Toolbar toolbar6 = this.f29488P;
        if (toolbar6 != null && (menu2 = toolbar6.getMenu()) != null) {
            menuItem6 = menu2.findItem(e.f2108d);
        } else {
            menuItem6 = null;
        }
        if (menuItem6 != null) {
            menuItem6.setVisible(false);
        }
        Toolbar toolbar7 = this.f29488P;
        if (toolbar7 != null && (menu = toolbar7.getMenu()) != null) {
            menuItem7 = menu.findItem(e.f2114f);
        }
        if (menuItem7 != null) {
            menuItem7.setVisible(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l5() {
        if (this.f29498Z) {
            ArrayList arrayList = this.f29492T;
            if (arrayList != null) {
                AbstractC3159y.f(arrayList);
                if (arrayList.size() > 1) {
                    AbstractC1246t.B(arrayList, new f0());
                }
                ArrayList arrayList2 = this.f29492T;
                AbstractC3159y.f(arrayList2);
                if (arrayList2.size() > 1) {
                    AbstractC1246t.B(arrayList2, new g0());
                }
            }
            ArrayList arrayList3 = this.f29496X;
            if (arrayList3 != null) {
                AbstractC3159y.f(arrayList3);
                if (arrayList3.size() > 1) {
                    AbstractC1246t.B(arrayList3, new h0());
                }
                ArrayList arrayList4 = this.f29496X;
                AbstractC3159y.f(arrayList4);
                if (arrayList4.size() > 1) {
                    AbstractC1246t.B(arrayList4, new i0());
                    return;
                }
                return;
            }
            return;
        }
        ArrayList arrayList5 = this.f29492T;
        if (arrayList5 != null) {
            AbstractC3159y.f(arrayList5);
            if (arrayList5.size() > 1) {
                AbstractC1246t.B(arrayList5, new b0());
            }
            ArrayList arrayList6 = this.f29492T;
            AbstractC3159y.f(arrayList6);
            if (arrayList6.size() > 1) {
                AbstractC1246t.B(arrayList6, new c0());
            }
        }
        ArrayList arrayList7 = this.f29496X;
        if (arrayList7 != null) {
            AbstractC3159y.f(arrayList7);
            if (arrayList7.size() > 1) {
                AbstractC1246t.B(arrayList7, new d0());
            }
            ArrayList arrayList8 = this.f29496X;
            AbstractC3159y.f(arrayList8);
            if (arrayList8.size() > 1) {
                AbstractC1246t.B(arrayList8, new e0());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m4(DocumentFile documentFile) {
        Application application = getApplication();
        AbstractC3159y.g(application, "null cannot be cast to non-null type com.uptodown.core.UptodownCoreApplication");
        Uri uri = documentFile.getUri();
        AbstractC3159y.h(uri, "documentFile.uri");
        ((j) application).F(uri, new B(documentFile), this);
    }

    private final void m5(Uri uri) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setDataAndType(uri, getContentResolver().getType(uri));
        intent.addFlags(1);
        startActivity(Intent.createChooser(intent, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n4(File file) {
        Application application = getApplication();
        AbstractC3159y.g(application, "null cannot be cast to non-null type com.uptodown.core.UptodownCoreApplication");
        ((j) application).G(file, new A(file), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n5() {
        b bVar = this.f29490R;
        AbstractC3159y.f(bVar);
        bVar.i(false);
        l4();
        p4(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o4(String str) {
        RelativeLayout relativeLayout = this.f29511z;
        if (relativeLayout == null) {
            AbstractC3159y.y("rlLoading");
            relativeLayout = null;
        }
        relativeLayout.setVisibility(0);
        if (this.f29493U == null && this.f29497Y == null) {
            a5();
        }
        new I4.c(this.f29493U, this.f29497Y, this, new D(str));
    }

    private final void o5() {
        Toast.makeText(this, getString(h.f2269y), 1).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p4(boolean z8) {
        SearchView searchView;
        if (z8 && (searchView = this.f29481I) != null) {
            z3(searchView);
        }
        o4(null);
    }

    static /* synthetic */ void q4(FileExplorerActivity fileExplorerActivity, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = true;
        }
        fileExplorerActivity.p4(z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r4(FileExplorerActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.V4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s4(FileExplorerActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.finish();
    }

    private final void t3() {
        DocumentFile documentFile = this.f29493U;
        AbstractC3159y.f(documentFile);
        String lastPathSegment = documentFile.getUri().getLastPathSegment();
        LinearLayout linearLayout = this.f29476D;
        LinearLayout linearLayout2 = null;
        if (linearLayout == null) {
            AbstractC3159y.y("llBreadcrumb");
            linearLayout = null;
        }
        if (linearLayout.findViewWithTag(lastPathSegment) == null) {
            LayoutInflater layoutInflater = getLayoutInflater();
            int i8 = E4.f.f2177a;
            LinearLayout linearLayout3 = this.f29476D;
            if (linearLayout3 == null) {
                AbstractC3159y.y("llBreadcrumb");
                linearLayout3 = null;
            }
            View inflate = layoutInflater.inflate(i8, (ViewGroup) linearLayout3, false);
            AbstractC3159y.g(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
            LinearLayout linearLayout4 = (LinearLayout) inflate;
            linearLayout4.setTag(lastPathSegment);
            TextView textView = (TextView) linearLayout4.findViewById(e.f2157t0);
            AbstractC3159y.f(lastPathSegment);
            String substring = lastPathSegment.substring(n.X(lastPathSegment, ":", 0, false, 6, null) + 1);
            AbstractC3159y.h(substring, "this as java.lang.String).substring(startIndex)");
            if (substring.length() > 0) {
                String substring2 = lastPathSegment.substring(n.X(lastPathSegment, ":", 0, false, 6, null) + 1);
                AbstractC3159y.h(substring2, "this as java.lang.String).substring(startIndex)");
                String substring3 = substring2.substring(n.X(substring2, "/", 0, false, 6, null) + 1);
                AbstractC3159y.h(substring3, "this as java.lang.String).substring(startIndex)");
                if (substring3.length() > 0) {
                    String substring4 = substring2.substring(n.X(substring2, "/", 0, false, 6, null) + 1);
                    AbstractC3159y.h(substring4, "this as java.lang.String).substring(startIndex)");
                    textView.setText(substring4);
                } else {
                    String substring5 = substring2.substring(n.X(substring2, ":", 0, false, 6, null) + 1);
                    AbstractC3159y.h(substring5, "this as java.lang.String).substring(startIndex)");
                    textView.setText(substring5);
                }
            }
            textView.setTypeface(j.f2272g.u());
            LinearLayout linearLayout5 = this.f29476D;
            if (linearLayout5 == null) {
                AbstractC3159y.y("llBreadcrumb");
            } else {
                linearLayout2 = linearLayout5;
            }
            linearLayout2.addView(linearLayout4);
            L5.I i9 = L5.I.f6474a;
            W4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t4(final FileExplorerActivity this$0, CompoundButton compoundButton, boolean z8) {
        AbstractC3159y.i(this$0, "this$0");
        if (z8) {
            this$0.f29498Z = !this$0.f29498Z;
            RadioButton radioButton = this$0.f29484L;
            AbstractC3159y.f(radioButton);
            radioButton.setOnClickListener(new View.OnClickListener() { // from class: F4.E
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FileExplorerActivity.u4(FileExplorerActivity.this, view);
                }
            });
            RadioButton radioButton2 = this$0.f29485M;
            AbstractC3159y.f(radioButton2);
            radioButton2.setOnClickListener(new View.OnClickListener() { // from class: F4.F
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FileExplorerActivity.v4(view);
                }
            });
            RadioButton radioButton3 = this$0.f29486N;
            AbstractC3159y.f(radioButton3);
            radioButton3.setOnClickListener(new View.OnClickListener() { // from class: F4.G
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FileExplorerActivity.w4(view);
                }
            });
        }
    }

    private final void u3() {
        File file = this.f29497Y;
        AbstractC3159y.f(file);
        String absolutePath = file.getAbsolutePath();
        LinearLayout linearLayout = this.f29476D;
        LinearLayout linearLayout2 = null;
        if (linearLayout == null) {
            AbstractC3159y.y("llBreadcrumb");
            linearLayout = null;
        }
        if (linearLayout.findViewWithTag(absolutePath) == null) {
            LayoutInflater layoutInflater = getLayoutInflater();
            int i8 = E4.f.f2177a;
            LinearLayout linearLayout3 = this.f29476D;
            if (linearLayout3 == null) {
                AbstractC3159y.y("llBreadcrumb");
                linearLayout3 = null;
            }
            View inflate = layoutInflater.inflate(i8, (ViewGroup) linearLayout3, false);
            AbstractC3159y.g(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
            LinearLayout linearLayout4 = (LinearLayout) inflate;
            linearLayout4.setTag(absolutePath);
            TextView textView = (TextView) linearLayout4.findViewById(e.f2157t0);
            File file2 = this.f29497Y;
            AbstractC3159y.f(file2);
            String path = file2.getPath();
            AbstractC3159y.h(path, "currentDirFile!!.path");
            Uri parse = Uri.parse(path);
            AbstractC3159y.h(parse, "parse(this)");
            textView.setText(parse.getLastPathSegment());
            textView.setTypeface(j.f2272g.u());
            LinearLayout linearLayout5 = this.f29476D;
            if (linearLayout5 == null) {
                AbstractC3159y.y("llBreadcrumb");
            } else {
                linearLayout2 = linearLayout5;
            }
            linearLayout2.addView(linearLayout4);
            L5.I i9 = L5.I.f6474a;
            W4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u4(FileExplorerActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.f29498Z = !this$0.f29498Z;
        this$0.P4();
        this$0.d5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v3(String str, String str2) {
        if (!isFinishing()) {
            RelativeLayout relativeLayout = this.f29511z;
            if (relativeLayout == null) {
                AbstractC3159y.y("rlLoading");
                relativeLayout = null;
            }
            relativeLayout.setVisibility(0);
            AbstractC2829k.d(i6.N.a(C2812b0.b()), null, null, new C2502b(str, str2, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v4(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w3() {
        b bVar = this.f29490R;
        AbstractC3159y.f(bVar);
        if (bVar.getItemCount() == 0) {
            DocumentFile documentFile = this.f29493U;
            if (documentFile != null) {
                AbstractC3159y.f(documentFile);
                f5(documentFile.canRead());
                return;
            }
            File file = this.f29497Y;
            if (file != null) {
                AbstractC3159y.f(file);
                f5(file.canRead());
                return;
            }
            return;
        }
        LinearLayout linearLayout = this.f29474C;
        if (linearLayout == null) {
            AbstractC3159y.y("llEmptyDirectory");
            linearLayout = null;
        }
        linearLayout.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w4(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x3() {
        Uri n8 = new N4.f().n(this);
        LinearLayout linearLayout = null;
        if (n8 != null) {
            this.f29493U = DocumentFile.fromTreeUri(this, n8);
            this.f29497Y = null;
            q4(this, false, 1, null);
            return;
        }
        LinearLayout linearLayout2 = this.f29472B;
        if (linearLayout2 == null) {
            AbstractC3159y.y("llPermissionExplanation");
            linearLayout2 = null;
        }
        linearLayout2.setVisibility(0);
        RecyclerView recyclerView = this.f29509y;
        if (recyclerView == null) {
            AbstractC3159y.y("rvFiles");
            recyclerView = null;
        }
        recyclerView.setVisibility(8);
        LinearLayout linearLayout3 = this.f29472B;
        if (linearLayout3 == null) {
            AbstractC3159y.y("llPermissionExplanation");
        } else {
            linearLayout = linearLayout3;
        }
        View findViewById = linearLayout.findViewById(e.f2122h1);
        AbstractC3159y.h(findViewById, "llPermissionExplanation.…(R.id.tv_grant_access_sd)");
        TextView textView = (TextView) findViewById;
        textView.setTypeface(j.f2272g.u());
        textView.setOnClickListener(new View.OnClickListener() { // from class: F4.H
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FileExplorerActivity.y3(FileExplorerActivity.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x4(final FileExplorerActivity this$0, CompoundButton compoundButton, boolean z8) {
        AbstractC3159y.i(this$0, "this$0");
        if (z8) {
            this$0.f29498Z = !this$0.f29498Z;
            RadioButton radioButton = this$0.f29485M;
            AbstractC3159y.f(radioButton);
            radioButton.setOnClickListener(new View.OnClickListener() { // from class: F4.M
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FileExplorerActivity.y4(FileExplorerActivity.this, view);
                }
            });
            RadioButton radioButton2 = this$0.f29484L;
            AbstractC3159y.f(radioButton2);
            radioButton2.setOnClickListener(new View.OnClickListener() { // from class: F4.N
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FileExplorerActivity.z4(view);
                }
            });
            RadioButton radioButton3 = this$0.f29486N;
            AbstractC3159y.f(radioButton3);
            radioButton3.setOnClickListener(new View.OnClickListener() { // from class: F4.P
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FileExplorerActivity.A4(view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y3(FileExplorerActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.n0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y4(FileExplorerActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.f29498Z = !this$0.f29498Z;
        this$0.P4();
        this$0.e5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z3(SearchView searchView) {
        searchView.setOnQueryTextListener(null);
        searchView.setQuery("", false);
        searchView.setOnQueryTextListener(this.f29471A0);
        Object systemService = getSystemService("input_method");
        AbstractC3159y.g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(searchView.getWindowToken(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z4(View view) {
    }

    @Override // F4.a1
    public void a1() {
        Object obj;
        super.a1();
        L4.h l8 = j.f2272g.l();
        AbstractC3159y.f(l8);
        if (l8.e() != null && (obj = this.f29500q0) != null) {
            AbstractC3159y.f(obj);
            if (obj instanceof File) {
                File file = (File) obj;
                if (!file.isDirectory()) {
                    Application application = getApplication();
                    AbstractC3159y.g(application, "null cannot be cast to non-null type com.uptodown.core.UptodownCoreApplication");
                    ((j) application).R(file);
                    return;
                }
                return;
            }
            if (obj instanceof DocumentFile) {
                Application application2 = getApplication();
                AbstractC3159y.g(application2, "null cannot be cast to non-null type com.uptodown.core.UptodownCoreApplication");
                ((j) application2).Q((DocumentFile) obj);
            }
        }
    }

    @Override // F4.r
    public void c0() {
        I(getString(h.f2227a0));
    }

    @Override // F4.r
    public void d0() {
        Uri n8 = new N4.f().n(this);
        if (n8 != null) {
            LinearLayout linearLayout = this.f29472B;
            if (linearLayout == null) {
                AbstractC3159y.y("llPermissionExplanation");
                linearLayout = null;
            }
            linearLayout.setVisibility(8);
            RecyclerView recyclerView = this.f29509y;
            if (recyclerView == null) {
                AbstractC3159y.y("rvFiles");
                recyclerView = null;
            }
            recyclerView.setVisibility(0);
            this.f29493U = DocumentFile.fromTreeUri(this, n8);
            this.f29497Y = null;
            q4(this, false, 1, null);
        }
    }

    @Override // F4.a1
    public void d1() {
    }

    @Override // F4.r
    public void e0() {
        I(getString(h.f2258q));
    }

    @Override // F4.r
    public void f0() {
        I(getString(h.f2227a0));
    }

    @Override // F4.r
    public void h0() {
        q4(this, false, 1, null);
        if (!T()) {
            q0();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        setContentView(E4.f.f2194r);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("subdir") && (string = extras.getString("subdir")) != null) {
                boolean z8 = extras.getBoolean("subdir_sd");
                this.f29499p0 = z8;
                if (z8) {
                    Uri n8 = new N4.f().n(this);
                    if (n8 != null) {
                        DocumentFile fromTreeUri = DocumentFile.fromTreeUri(this, n8);
                        if (fromTreeUri != null && string.length() > 0) {
                            Iterator it = n.s0(string, new String[]{"/"}, false, 0, 6, null).iterator();
                            while (it.hasNext() && (fromTreeUri = fromTreeUri.findFile((String) it.next())) != null) {
                            }
                        }
                        this.f29493U = fromTreeUri;
                        this.f29497Y = null;
                    }
                } else {
                    this.f29497Y = new File(string);
                    this.f29493U = null;
                }
            }
            if (extras.containsKey("select_path") && extras.getInt("select_path") == 1) {
                this.f29503t0 = true;
                View findViewById = findViewById(e.f2174z);
                AbstractC3159y.h(findViewById, "findViewById(R.id.ll_options)");
                View findViewById2 = findViewById(e.f2098Z1);
                AbstractC3159y.h(findViewById2, "findViewById(R.id.view_options_shadow)");
                ((LinearLayout) findViewById).setVisibility(0);
                findViewById2.setVisibility(0);
                TextView textView = (TextView) findViewById(e.f2062N1);
                this.f29480H = textView;
                if (textView != null) {
                    textView.setTypeface(j.f2272g.t());
                }
                TextView textView2 = this.f29480H;
                if (textView2 != null) {
                    textView2.setOnClickListener(new View.OnClickListener() { // from class: F4.s
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            FileExplorerActivity.r4(FileExplorerActivity.this, view);
                        }
                    });
                }
                TextView textView3 = (TextView) findViewById(e.f2160u0);
                textView3.setTypeface(j.f2272g.t());
                textView3.setOnClickListener(new View.OnClickListener() { // from class: F4.f0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        FileExplorerActivity.s4(FileExplorerActivity.this, view);
                    }
                });
            }
        }
        this.f29488P = (Toolbar) findViewById(e.f2133l0);
        TextView textView4 = (TextView) findViewById(e.f2086V1);
        this.f29489Q = textView4;
        if (textView4 != null) {
            textView4.setText(getString(h.f2226a));
        }
        TextView textView5 = this.f29489Q;
        if (textView5 != null) {
            textView5.setTypeface(j.f2272g.u());
        }
        Toolbar toolbar = this.f29488P;
        if (toolbar != null) {
            toolbar.setNavigationIcon(ContextCompat.getDrawable(this, E4.d.f2002b));
        }
        Toolbar toolbar2 = this.f29488P;
        if (toolbar2 != null) {
            toolbar2.setNavigationOnClickListener(new View.OnClickListener() { // from class: F4.g0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FileExplorerActivity.G4(FileExplorerActivity.this, view);
                }
            });
        }
        Toolbar toolbar3 = this.f29488P;
        if (toolbar3 != null) {
            toolbar3.inflateMenu(E4.g.f2199a);
        }
        Toolbar toolbar4 = this.f29488P;
        if (toolbar4 != null) {
            toolbar4.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() { // from class: F4.h0
                @Override // androidx.appcompat.widget.Toolbar.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    boolean J42;
                    J42 = FileExplorerActivity.J4(FileExplorerActivity.this, menuItem);
                    return J42;
                }
            });
        }
        l4();
        View findViewById3 = findViewById(e.f2165w);
        AbstractC3159y.h(findViewById3, "findViewById(R.id.layout_breadcrumb_main)");
        this.f29476D = (LinearLayout) findViewById3;
        View findViewById4 = findViewById(e.f2127j0);
        AbstractC3159y.h(findViewById4, "findViewById(R.id.sv_breadcumb)");
        this.f29477E = (HorizontalScrollView) findViewById4;
        LinearLayout linearLayout = this.f29476D;
        if (linearLayout == null) {
            AbstractC3159y.y("llBreadcrumb");
            linearLayout = null;
        }
        View findViewById5 = linearLayout.findViewById(e.f2167w1);
        AbstractC3159y.h(findViewById5, "llBreadcrumb.findViewById(R.id.tv_main_path)");
        TextView textView6 = (TextView) findViewById5;
        this.f29507x = textView6;
        if (textView6 == null) {
            AbstractC3159y.y("tvBreadCrumb");
            textView6 = null;
        }
        j.a aVar = j.f2272g;
        textView6.setTypeface(aVar.u());
        View findViewById6 = findViewById(e.f2110d1);
        AbstractC3159y.h(findViewById6, "findViewById(R.id.tv_empty_dir)");
        TextView textView7 = (TextView) findViewById6;
        this.f29478F = textView7;
        if (textView7 == null) {
            AbstractC3159y.y("tvEmptyDirectory");
            textView7 = null;
        }
        textView7.setTypeface(aVar.u());
        SearchView searchView = (SearchView) findViewById(e.f2112e0);
        this.f29481I = searchView;
        if (searchView != null) {
            searchView.setOnQueryTextListener(this.f29471A0);
        }
        SearchView searchView2 = this.f29481I;
        if (searchView2 != null) {
            searchView2.setOnClickListener(new View.OnClickListener() { // from class: F4.i0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FileExplorerActivity.K4(FileExplorerActivity.this, view);
                }
            });
        }
        ImageView imageView = (ImageView) findViewById(e.f2159u);
        this.f29482J = imageView;
        AbstractC3159y.f(imageView);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: F4.j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FileExplorerActivity.L4(FileExplorerActivity.this, view);
            }
        });
        this.f29483K = (RelativeLayout) findViewById(e.f2090X);
        RadioButton radioButton = (RadioButton) findViewById(e.f2057M);
        this.f29484L = radioButton;
        AbstractC3159y.f(radioButton);
        radioButton.setTypeface(aVar.u());
        RadioButton radioButton2 = this.f29484L;
        AbstractC3159y.f(radioButton2);
        radioButton2.setOnClickListener(new View.OnClickListener() { // from class: F4.k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FileExplorerActivity.M4(FileExplorerActivity.this, view);
            }
        });
        RadioButton radioButton3 = this.f29484L;
        AbstractC3159y.f(radioButton3);
        radioButton3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: F4.t
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z9) {
                FileExplorerActivity.t4(FileExplorerActivity.this, compoundButton, z9);
            }
        });
        RadioButton radioButton4 = (RadioButton) findViewById(e.f2066P);
        this.f29485M = radioButton4;
        AbstractC3159y.f(radioButton4);
        radioButton4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: F4.u
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z9) {
                FileExplorerActivity.x4(FileExplorerActivity.this, compoundButton, z9);
            }
        });
        RadioButton radioButton5 = (RadioButton) findViewById(e.f2048J);
        this.f29486N = radioButton5;
        AbstractC3159y.f(radioButton5);
        radioButton5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: F4.v
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z9) {
                FileExplorerActivity.B4(FileExplorerActivity.this, compoundButton, z9);
            }
        });
        CheckBox checkBox = (CheckBox) findViewById(e.f2129k);
        checkBox.setTypeface(aVar.u());
        checkBox.setChecked(new G4.a(this).q());
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: F4.D
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z9) {
                FileExplorerActivity.F4(FileExplorerActivity.this, compoundButton, z9);
            }
        });
        d5();
        View findViewById7 = findViewById(e.f2106c0);
        AbstractC3159y.h(findViewById7, "findViewById(R.id.rv_files)");
        RecyclerView recyclerView = (RecyclerView) findViewById7;
        this.f29509y = recyclerView;
        if (recyclerView == null) {
            AbstractC3159y.y("rvFiles");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
        RecyclerView recyclerView2 = this.f29509y;
        if (recyclerView2 == null) {
            AbstractC3159y.y("rvFiles");
            recyclerView2 = null;
        }
        recyclerView2.addItemDecoration(new s((int) getResources().getDimension(E4.c.f2000a)));
        RecyclerView recyclerView3 = this.f29509y;
        if (recyclerView3 == null) {
            AbstractC3159y.y("rvFiles");
            recyclerView3 = null;
        }
        recyclerView3.setItemAnimator(new DefaultItemAnimator());
        View findViewById8 = findViewById(e.f2087W);
        AbstractC3159y.h(findViewById8, "findViewById(R.id.rl_loading_file_explorer)");
        RelativeLayout relativeLayout = (RelativeLayout) findViewById8;
        this.f29511z = relativeLayout;
        if (relativeLayout == null) {
            AbstractC3159y.y("rlLoading");
            relativeLayout = null;
        }
        relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: F4.O
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FileExplorerActivity.H4(view);
            }
        });
        View findViewById9 = findViewById(e.f2084V);
        AbstractC3159y.h(findViewById9, "findViewById(R.id.rl_loading_action)");
        RelativeLayout relativeLayout2 = (RelativeLayout) findViewById9;
        this.f29470A = relativeLayout2;
        if (relativeLayout2 == null) {
            AbstractC3159y.y("rlLoadingAction");
            relativeLayout2 = null;
        }
        relativeLayout2.setOnClickListener(new View.OnClickListener() { // from class: F4.a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FileExplorerActivity.I4(view);
            }
        });
        View findViewById10 = findViewById(e.f2168x);
        AbstractC3159y.h(findViewById10, "findViewById(R.id.ll_empty_dir)");
        this.f29474C = (LinearLayout) findViewById10;
        View findViewById11 = findViewById(e.f2021A);
        AbstractC3159y.h(findViewById11, "findViewById(R.id.ll_sd_permissions_explanation)");
        this.f29472B = (LinearLayout) findViewById11;
        TextView textView8 = (TextView) findViewById(e.f2077S1);
        this.f29505v0 = textView8;
        if (textView8 != null) {
            textView8.setTypeface(aVar.t());
        }
        TabLayout tabLayout = (TabLayout) findViewById(e.f2130k0);
        this.f29504u0 = tabLayout;
        AbstractC3159y.f(tabLayout);
        TabLayout.Tab text = tabLayout.newTab().setText(getString(h.f2220U));
        AbstractC3159y.h(text, "tabsStorage!!.newTab().s…string.internal_storage))");
        text.setId(0);
        TabLayout tabLayout2 = this.f29504u0;
        AbstractC3159y.f(tabLayout2);
        tabLayout2.addTab(text);
        TabLayout tabLayout3 = this.f29504u0;
        AbstractC3159y.f(tabLayout3);
        TabLayout.Tab text2 = tabLayout3.newTab().setText(getString(h.f2247k0));
        AbstractC3159y.h(text2, "tabsStorage!!.newTab().s…String(R.string.sd_card))");
        text2.setId(1);
        TabLayout tabLayout4 = this.f29504u0;
        AbstractC3159y.f(tabLayout4);
        tabLayout4.addTab(text2);
        TabLayout tabLayout5 = this.f29504u0;
        AbstractC3159y.f(tabLayout5);
        ViewGroupKt.get(tabLayout5, 0).setSelected(true);
        TabLayout tabLayout6 = this.f29504u0;
        AbstractC3159y.f(tabLayout6);
        tabLayout6.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new F());
        if (U()) {
            q4(this, false, 1, null);
            ArrayList c8 = new u().c(this);
            this.f29494V = c8;
            if (c8 != null && !c8.isEmpty()) {
                TabLayout tabLayout7 = this.f29504u0;
                if (tabLayout7 != null) {
                    tabLayout7.setVisibility(0);
                }
                TextView textView9 = this.f29505v0;
                if (textView9 != null) {
                    textView9.setVisibility(0);
                }
            } else {
                TabLayout tabLayout8 = this.f29504u0;
                if (tabLayout8 != null) {
                    tabLayout8.setVisibility(8);
                }
                TextView textView10 = this.f29505v0;
                if (textView10 != null) {
                    textView10.setVisibility(8);
                }
            }
        } else {
            K();
        }
        getOnBackPressedDispatcher().addCallback(this, this.f29473B0);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i8, KeyEvent event) {
        AbstractC3159y.i(event, "event");
        if (i8 == 82) {
            Toolbar toolbar = this.f29488P;
            AbstractC3159y.f(toolbar);
            toolbar.showOverflowMenu();
            return true;
        }
        return super.onKeyDown(i8, event);
    }
}
