package com.uptodown.activities;

import D4.C1109s;
import E4.j;
import L5.C1224h;
import L5.InterfaceC1227k;
import T4.S;
import X4.C1498h;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
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
import com.google.android.material.snackbar.Snackbar;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.NotificationsRegistryActivity;
import com.uptodown.activities.o;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.M;
import i6.N;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.U;
import l5.AbstractC3337y;
import l6.InterfaceC3349K;
import l6.InterfaceC3359g;

/* loaded from: classes4.dex */
public final class NotificationsRegistryActivity extends AbstractActivityC2489a {

    /* renamed from: Q, reason: collision with root package name */
    private boolean f28634Q;

    /* renamed from: S, reason: collision with root package name */
    private C1109s f28636S;

    /* renamed from: O, reason: collision with root package name */
    private final InterfaceC1227k f28632O = L5.l.b(new a());

    /* renamed from: P, reason: collision with root package name */
    private final InterfaceC1227k f28633P = new ViewModelLazy(U.b(o.class), new g(this), new f(this), new h(null, this));

    /* renamed from: R, reason: collision with root package name */
    private boolean f28635R = true;

    /* renamed from: T, reason: collision with root package name */
    private d f28637T = new d();

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final S invoke() {
            return S.c(NotificationsRegistryActivity.this.getLayoutInflater());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ File f28639a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ NotificationsRegistryActivity f28640b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f28641c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f28642a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ NotificationsRegistryActivity f28643b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f28644c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(NotificationsRegistryActivity notificationsRegistryActivity, int i8, P5.d dVar) {
                super(2, dVar);
                this.f28643b = notificationsRegistryActivity;
                this.f28644c = i8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f28643b, this.f28644c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = Q5.b.e();
                int i8 = this.f28642a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        L5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    L5.t.b(obj);
                    NotificationsRegistryActivity notificationsRegistryActivity = this.f28643b;
                    int i9 = this.f28644c;
                    this.f28642a = 1;
                    if (notificationsRegistryActivity.x3(i9, this) == e8) {
                        return e8;
                    }
                }
                return L5.I.f6474a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(File file, NotificationsRegistryActivity notificationsRegistryActivity, int i8) {
            super(0);
            this.f28639a = file;
            this.f28640b = notificationsRegistryActivity;
            this.f28641c = i8;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5569invoke();
            return L5.I.f6474a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5569invoke() {
            if (this.f28639a.delete()) {
                Snackbar.make(this.f28640b.o3().f10307c, this.f28640b.getString(R.string.snackbar_message_apk_deleted, this.f28639a.getName()), -1).show();
                AbstractC2829k.d(N.a(C2812b0.b()), null, null, new a(this.f28640b, this.f28641c, null), 3, null);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements W4.r {
        c() {
        }

        @Override // W4.r
        public void c(int i8) {
            Snackbar.make(NotificationsRegistryActivity.this.o3().f10307c, R.string.app_detail_not_found, -1).show();
        }

        @Override // W4.r
        public void f(C1498h appInfo) {
            AbstractC3159y.i(appInfo, "appInfo");
            Intent intent = new Intent(NotificationsRegistryActivity.this, (Class<?>) AppDetailActivity.class);
            intent.putExtra("appInfo", appInfo);
            NotificationsRegistryActivity notificationsRegistryActivity = NotificationsRegistryActivity.this;
            notificationsRegistryActivity.startActivity(intent, UptodownApp.f27990B.a(notificationsRegistryActivity));
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements W4.v {
        d() {
        }

        @Override // W4.v
        public void a(int i8) {
            NotificationsRegistryActivity.this.v3(i8, 1);
        }

        @Override // W4.v
        public void b(int i8) {
            NotificationsRegistryActivity.this.l3(i8);
        }

        @Override // W4.v
        public void c(int i8) {
            NotificationsRegistryActivity.this.v3(i8, 0);
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28647a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ NotificationsRegistryActivity f28649a;

            a(NotificationsRegistryActivity notificationsRegistryActivity) {
                this.f28649a = notificationsRegistryActivity;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3337y abstractC3337y, P5.d dVar) {
                if (abstractC3337y instanceof AbstractC3337y.a) {
                    this.f28649a.o3().f10306b.f10172b.setVisibility(0);
                } else if (abstractC3337y instanceof AbstractC3337y.c) {
                    this.f28649a.w3(((o.a) ((AbstractC3337y.c) abstractC3337y).a()).a());
                    this.f28649a.f28635R = false;
                    this.f28649a.f28634Q = false;
                    this.f28649a.o3().f10306b.f10172b.setVisibility(8);
                } else {
                    boolean z8 = abstractC3337y instanceof AbstractC3337y.b;
                }
                return L5.I.f6474a;
            }
        }

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
            Object e8 = Q5.b.e();
            int i8 = this.f28647a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K e9 = NotificationsRegistryActivity.this.q3().e();
                a aVar = new a(NotificationsRegistryActivity.this);
                this.f28647a = 1;
                if (e9.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28650a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f28650a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f28650a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28651a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f28651a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f28651a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f28652a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28653b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f28652a = function0;
            this.f28653b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f28652a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f28653b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class i extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f28654a;

        /* renamed from: b, reason: collision with root package name */
        int f28655b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f28656c;

        /* renamed from: e, reason: collision with root package name */
        int f28658e;

        i(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f28656c = obj;
            this.f28658e |= Integer.MIN_VALUE;
            return NotificationsRegistryActivity.this.x3(0, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28659a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f28661c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(int i8, P5.d dVar) {
            super(2, dVar);
            this.f28661c = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new j(this.f28661c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((j) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f28659a == 0) {
                L5.t.b(obj);
                String format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss", Locale.getDefault()).format(kotlin.coroutines.jvm.internal.b.d(System.currentTimeMillis()));
                AbstractC3159y.h(format, "formatter.format(System.currentTimeMillis())");
                o q32 = NotificationsRegistryActivity.this.q3();
                NotificationsRegistryActivity notificationsRegistryActivity = NotificationsRegistryActivity.this;
                C1109s c1109s = notificationsRegistryActivity.f28636S;
                AbstractC3159y.f(c1109s);
                Object obj2 = c1109s.a().get(this.f28661c);
                AbstractC3159y.h(obj2, "adapter!!.data[position]");
                q32.f(notificationsRegistryActivity, (X4.y) obj2, format);
                C1109s c1109s2 = NotificationsRegistryActivity.this.f28636S;
                AbstractC3159y.f(c1109s2);
                ((X4.y) c1109s2.a().get(this.f28661c)).k(NotificationsRegistryActivity.this.getString(R.string.file_deleted_notification, format));
                C1109s c1109s3 = NotificationsRegistryActivity.this.f28636S;
                AbstractC3159y.f(c1109s3);
                ((X4.y) c1109s3.a().get(this.f28661c)).i("no_action");
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28662a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f28664c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(int i8, P5.d dVar) {
            super(2, dVar);
            this.f28664c = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new k(this.f28664c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((k) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f28662a == 0) {
                L5.t.b(obj);
                C1109s c1109s = NotificationsRegistryActivity.this.f28636S;
                AbstractC3159y.f(c1109s);
                c1109s.notifyItemChanged(this.f28664c);
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l3(int i8) {
        C1109s c1109s = this.f28636S;
        if (c1109s != null) {
            AbstractC3159y.f(c1109s);
            if (c1109s.getItemCount() > i8) {
                o q32 = q3();
                C1109s c1109s2 = this.f28636S;
                AbstractC3159y.f(c1109s2);
                q32.c(this, ((X4.y) c1109s2.a().get(i8)).c());
                C1109s c1109s3 = this.f28636S;
                AbstractC3159y.f(c1109s3);
                c1109s3.a().remove(i8);
                C1109s c1109s4 = this.f28636S;
                AbstractC3159y.f(c1109s4);
                c1109s4.notifyItemRemoved(i8);
            }
        }
    }

    private final void m3(File file, int i8) {
        String string = getString(R.string.dialog_delete_download_msg, file.getName());
        AbstractC3159y.h(string, "getString(R.string.dialo…_download_msg, file.name)");
        Z1(string, new b(file, this, i8));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0076, code lost:
    
        if (r11.equals("preregister") == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00e4, code lost:
    
        if (r12 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e6, code lost:
    
        new S4.i(r10, java.lang.Long.parseLong(r12), new com.uptodown.activities.NotificationsRegistryActivity.c(r10), androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00fb, code lost:
    
        com.google.android.material.snackbar.Snackbar.make(o3().f10307c, getString(com.uptodown.R.string.msg_no_action_available), -1).show();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e0, code lost:
    
        if (r11.equals("upcoming_release") == false) goto L62;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000b. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void n3(java.lang.String r11, java.lang.String r12, int r13) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.NotificationsRegistryActivity.n3(java.lang.String, java.lang.String, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final S o3() {
        return (S) this.f28632O.getValue();
    }

    private final void p3() {
        q3().d(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o q3() {
        return (o) this.f28633P.getValue();
    }

    private final void r3() {
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
        if (drawable != null) {
            o3().f10308d.setNavigationIcon(drawable);
            o3().f10308d.setNavigationContentDescription(getString(R.string.back));
        }
        o3().f10308d.setNavigationOnClickListener(new View.OnClickListener() { // from class: A4.o2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NotificationsRegistryActivity.s3(NotificationsRegistryActivity.this, view);
            }
        });
        o3().f10308d.inflateMenu(R.menu.menu_notifications_registry);
        o3().f10308d.setOverflowIcon(ContextCompat.getDrawable(this, R.drawable.vector_menu_dots_color_adaptable));
        o3().f10308d.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() { // from class: A4.p2
            @Override // androidx.appcompat.widget.Toolbar.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean t32;
                t32 = NotificationsRegistryActivity.t3(NotificationsRegistryActivity.this, menuItem);
                return t32;
            }
        });
        TextView textView = o3().f10310f;
        j.a aVar = E4.j.f2272g;
        textView.setTypeface(aVar.t());
        o3().f10309e.setTypeface(aVar.u());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, 1, false);
        int dimension = (int) getResources().getDimension(R.dimen.margin_m);
        o3().f10307c.addItemDecoration(new n5.m(dimension, dimension));
        o3().f10307c.setLayoutManager(linearLayoutManager);
        o3().f10307c.setItemAnimator(new DefaultItemAnimator());
        o3().f10306b.f10172b.setOnClickListener(new View.OnClickListener() { // from class: A4.q2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NotificationsRegistryActivity.u3(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s3(NotificationsRegistryActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.getOnBackPressedDispatcher().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean t3(NotificationsRegistryActivity this$0, MenuItem item) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(item, "item");
        if (item.getItemId() == R.id.action_delete_all) {
            this$0.q3().b(this$0);
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u3(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v3(int i8, int i9) {
        C1109s c1109s = this.f28636S;
        if (c1109s != null) {
            AbstractC3159y.f(c1109s);
            if (c1109s.getItemCount() > i8) {
                C1109s c1109s2 = this.f28636S;
                AbstractC3159y.f(c1109s2);
                Object obj = c1109s2.a().get(i8);
                AbstractC3159y.h(obj, "adapter!!.data[position]");
                X4.y yVar = (X4.y) obj;
                if (yVar.a() != null) {
                    String a8 = yVar.a();
                    AbstractC3159y.f(a8);
                    List s02 = g6.n.s0(a8, new String[]{";"}, false, 0, 6, null);
                    if (s02.size() > i9) {
                        n3((String) s02.get(i9), yVar.b(), i8);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w3(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            C1109s c1109s = this.f28636S;
            if (c1109s == null) {
                this.f28636S = new C1109s(arrayList, this, this.f28637T);
                o3().f10307c.setAdapter(this.f28636S);
            } else {
                if (c1109s != null) {
                    c1109s.d(arrayList);
                }
                C1109s c1109s2 = this.f28636S;
                if (c1109s2 != null) {
                    c1109s2.notifyDataSetChanged();
                }
            }
            o3().f10309e.setVisibility(8);
            return;
        }
        C1109s c1109s3 = this.f28636S;
        if (c1109s3 != null) {
            c1109s3.d(new ArrayList());
        }
        C1109s c1109s4 = this.f28636S;
        if (c1109s4 != null) {
            c1109s4.notifyDataSetChanged();
        }
        o3().f10309e.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object x3(int r7, P5.d r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.uptodown.activities.NotificationsRegistryActivity.i
            if (r0 == 0) goto L13
            r0 = r8
            com.uptodown.activities.NotificationsRegistryActivity$i r0 = (com.uptodown.activities.NotificationsRegistryActivity.i) r0
            int r1 = r0.f28658e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28658e = r1
            goto L18
        L13:
            com.uptodown.activities.NotificationsRegistryActivity$i r0 = new com.uptodown.activities.NotificationsRegistryActivity$i
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f28656c
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f28658e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            L5.t.b(r8)
            goto L6d
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            int r7 = r0.f28655b
            java.lang.Object r2 = r0.f28654a
            com.uptodown.activities.NotificationsRegistryActivity r2 = (com.uptodown.activities.NotificationsRegistryActivity) r2
            L5.t.b(r8)
            goto L59
        L3f:
            L5.t.b(r8)
            i6.I r8 = i6.C2812b0.b()
            com.uptodown.activities.NotificationsRegistryActivity$j r2 = new com.uptodown.activities.NotificationsRegistryActivity$j
            r2.<init>(r7, r5)
            r0.f28654a = r6
            r0.f28655b = r7
            r0.f28658e = r4
            java.lang.Object r8 = i6.AbstractC2825i.g(r8, r2, r0)
            if (r8 != r1) goto L58
            return r1
        L58:
            r2 = r6
        L59:
            i6.J0 r8 = i6.C2812b0.c()
            com.uptodown.activities.NotificationsRegistryActivity$k r4 = new com.uptodown.activities.NotificationsRegistryActivity$k
            r4.<init>(r7, r5)
            r0.f28654a = r5
            r0.f28658e = r3
            java.lang.Object r7 = i6.AbstractC2825i.g(r8, r4, r0)
            if (r7 != r1) goto L6d
            return r1
        L6d:
            L5.I r7 = L5.I.f6474a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.NotificationsRegistryActivity.x3(int, P5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2489a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(o3().getRoot());
        r3();
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new e(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2489a, F4.a1, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f28635R) {
            p3();
        }
    }
}
