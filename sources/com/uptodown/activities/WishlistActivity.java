package com.uptodown.activities;

import A4.V1;
import D4.V;
import E4.j;
import L5.C1224h;
import L5.InterfaceC1227k;
import M5.AbstractC1246t;
import T4.G0;
import X4.C1498h;
import X4.C1505o;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.L;
import com.uptodown.activities.WishlistActivity;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.M;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.U;
import kotlin.jvm.internal.Y;
import l5.AbstractC3337y;
import l5.C3313a;
import l5.C3319g;
import l5.C3326n;
import l5.C3329q;
import l6.InterfaceC3349K;
import l6.InterfaceC3359g;

/* loaded from: classes4.dex */
public final class WishlistActivity extends V1 {

    /* renamed from: u0, reason: collision with root package name */
    public static final a f29045u0 = new a(null);

    /* renamed from: s0, reason: collision with root package name */
    private V f29048s0;

    /* renamed from: q0, reason: collision with root package name */
    private final InterfaceC1227k f29046q0 = L5.l.b(new b());

    /* renamed from: r0, reason: collision with root package name */
    private final InterfaceC1227k f29047r0 = new ViewModelLazy(U.b(L.class), new k(this), new j(this), new l(null, this));

    /* renamed from: t0, reason: collision with root package name */
    private d f29049t0 = new d();

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
        public final G0 invoke() {
            return G0.c(WishlistActivity.this.getLayoutInflater());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3160z implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ X4.U f29052b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f29053c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f29054a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ WishlistActivity f29055b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ X4.U f29056c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f29057d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(WishlistActivity wishlistActivity, X4.U u8, int i8, P5.d dVar) {
                super(2, dVar);
                this.f29055b = wishlistActivity;
                this.f29056c = u8;
                this.f29057d = i8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f29055b, this.f29056c, this.f29057d, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = Q5.b.e();
                int i8 = this.f29054a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        L5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    L5.t.b(obj);
                    WishlistActivity wishlistActivity = this.f29055b;
                    X4.U u8 = this.f29056c;
                    int i9 = this.f29057d;
                    this.f29054a = 1;
                    if (wishlistActivity.U4(u8, i9, this) == e8) {
                        return e8;
                    }
                }
                return L5.I.f6474a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(X4.U u8, int i8) {
            super(0);
            this.f29052b = u8;
            this.f29053c = i8;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5573invoke();
            return L5.I.f6474a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5573invoke() {
            AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(WishlistActivity.this), null, null, new a(WishlistActivity.this, this.f29052b, this.f29053c, null), 3, null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements W4.M {

        /* loaded from: classes4.dex */
        public static final class a implements W4.r {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ WishlistActivity f29059a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f29060b;

            a(WishlistActivity wishlistActivity, int i8) {
                this.f29059a = wishlistActivity;
                this.f29060b = i8;
            }

            @Override // W4.r
            public void c(int i8) {
                WishlistActivity wishlistActivity = this.f29059a;
                String string = wishlistActivity.getString(R.string.error_cant_enqueue_download);
                AbstractC3159y.h(string, "getString(R.string.error_cant_enqueue_download)");
                wishlistActivity.e2(string);
            }

            @Override // W4.r
            public void f(C1498h appInfo) {
                AbstractC3159y.i(appInfo, "appInfo");
                String L8 = appInfo.L();
                if (L8 != null && L8.length() != 0) {
                    if (!new C3319g().r(appInfo.y0(), this.f29059a)) {
                        this.f29059a.T4(appInfo, this.f29060b);
                        return;
                    } else {
                        this.f29059a.m4(new C3319g().z(this.f29059a, appInfo.y0()));
                        return;
                    }
                }
                WishlistActivity wishlistActivity = this.f29059a;
                String string = wishlistActivity.getString(R.string.dialog_msg_download_not_available, appInfo.s0());
                AbstractC3159y.h(string, "getString(R.string.dialo…_available, appInfo.name)");
                wishlistActivity.e2(string);
            }
        }

        d() {
        }

        @Override // W4.J
        public void a(int i8) {
            if (UptodownApp.f27990B.a0() && WishlistActivity.this.f29048s0 != null) {
                AbstractC3159y.f(WishlistActivity.this.f29048s0);
                if (!r0.a().isEmpty()) {
                    V v8 = WishlistActivity.this.f29048s0;
                    AbstractC3159y.f(v8);
                    Object obj = v8.a().get(i8);
                    AbstractC3159y.h(obj, "adapter!!.wishlist[position]");
                    WishlistActivity.this.G2(((X4.U) obj).a());
                }
            }
        }

        @Override // W4.J
        public void b(View v8, int i8) {
            AbstractC3159y.i(v8, "v");
            if (UptodownApp.f27990B.a0() && WishlistActivity.this.f29048s0 != null) {
                AbstractC3159y.f(WishlistActivity.this.f29048s0);
                if (!r3.a().isEmpty()) {
                    WishlistActivity wishlistActivity = WishlistActivity.this;
                    V v9 = wishlistActivity.f29048s0;
                    AbstractC3159y.f(v9);
                    Object obj = v9.a().get(i8);
                    AbstractC3159y.h(obj, "adapter!!.wishlist[position]");
                    wishlistActivity.J4((X4.U) obj, i8);
                }
            }
        }

        @Override // W4.M
        public void c(int i8) {
            if (WishlistActivity.this.f29048s0 != null) {
                AbstractC3159y.f(WishlistActivity.this.f29048s0);
                if (!r0.a().isEmpty()) {
                    WishlistActivity wishlistActivity = WishlistActivity.this;
                    V v8 = wishlistActivity.f29048s0;
                    AbstractC3159y.f(v8);
                    new S4.i(wishlistActivity, ((X4.U) v8.a().get(i8)).a(), new a(WishlistActivity.this, i8), LifecycleOwnerKt.getLifecycleScope(WishlistActivity.this));
                }
            }
        }

        @Override // W4.M
        public void d(int i8) {
            if (WishlistActivity.this.f29048s0 != null) {
                AbstractC3159y.f(WishlistActivity.this.f29048s0);
                if (!r2.a().isEmpty()) {
                    V v8 = WishlistActivity.this.f29048s0;
                    AbstractC3159y.f(v8);
                    Object obj = v8.a().get(i8);
                    AbstractC3159y.h(obj, "adapter!!.wishlist[position]");
                    X4.U u8 = (X4.U) obj;
                    String f8 = u8.f();
                    if (f8 != null && f8.length() != 0) {
                        PackageManager packageManager = WishlistActivity.this.getPackageManager();
                        String f9 = u8.f();
                        AbstractC3159y.f(f9);
                        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(f9);
                        if (launchIntentForPackage != null) {
                            WishlistActivity.this.startActivity(launchIntentForPackage);
                            return;
                        }
                        WishlistActivity wishlistActivity = WishlistActivity.this;
                        String string = wishlistActivity.getString(R.string.error_open_app, u8.e());
                        AbstractC3159y.h(string, "getString(R.string.error…p, selectedWishlist.name)");
                        wishlistActivity.e2(string);
                        return;
                    }
                    WishlistActivity wishlistActivity2 = WishlistActivity.this;
                    String string2 = wishlistActivity2.getString(R.string.error_open_app, u8.e());
                    AbstractC3159y.h(string2, "getString(R.string.error…p, selectedWishlist.name)");
                    wishlistActivity2.e2(string2);
                }
            }
        }

        @Override // W4.J
        public void e(int i8) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3160z implements Function1 {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f29062a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ WishlistActivity f29063b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ X4.U f29064c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(WishlistActivity wishlistActivity, X4.U u8, P5.d dVar) {
                super(2, dVar);
                this.f29063b = wishlistActivity;
                this.f29064c = u8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f29063b, this.f29064c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                int i8;
                V v8;
                ArrayList a8;
                Q5.b.e();
                if (this.f29062a == 0) {
                    L5.t.b(obj);
                    V v9 = this.f29063b.f29048s0;
                    if (v9 != null && (a8 = v9.a()) != null) {
                        i8 = a8.indexOf(this.f29064c);
                    } else {
                        i8 = -1;
                    }
                    if (i8 > -1 && (v8 = this.f29063b.f29048s0) != null) {
                        v8.notifyItemChanged(i8);
                    }
                    return L5.I.f6474a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        e() {
            super(1);
        }

        public final void a(X4.U wishlist) {
            AbstractC3159y.i(wishlist, "wishlist");
            AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(WishlistActivity.this), C2812b0.c(), null, new a(WishlistActivity.this, wishlist, null), 2, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((X4.U) obj);
            return L5.I.f6474a;
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29065a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ WishlistActivity f29067a;

            a(WishlistActivity wishlistActivity) {
                this.f29067a = wishlistActivity;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3337y abstractC3337y, P5.d dVar) {
                if (abstractC3337y instanceof AbstractC3337y.a) {
                    this.f29067a.L4().f10104b.f10172b.setVisibility(0);
                } else if (abstractC3337y instanceof AbstractC3337y.c) {
                    AbstractC3337y.c cVar = (AbstractC3337y.c) abstractC3337y;
                    this.f29067a.I4(((L.a) cVar.a()).a());
                    if (((L.a) cVar.a()).a().size() == 0) {
                        this.f29067a.L4().f10108f.setVisibility(0);
                        this.f29067a.L4().f10107e.setVisibility(0);
                    }
                    this.f29067a.L4().f10104b.f10172b.setVisibility(8);
                } else {
                    boolean z8 = abstractC3337y instanceof AbstractC3337y.b;
                }
                return L5.I.f6474a;
            }
        }

        f(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new f(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f29065a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K e9 = WishlistActivity.this.M4().e();
                a aVar = new a(WishlistActivity.this);
                this.f29065a = 1;
                if (e9.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f29068a;

        /* renamed from: b, reason: collision with root package name */
        int f29069b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f29070c;

        /* renamed from: e, reason: collision with root package name */
        int f29072e;

        g(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f29070c = obj;
            this.f29072e |= Integer.MIN_VALUE;
            return WishlistActivity.this.U4(null, 0, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29073a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ X4.U f29074b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ WishlistActivity f29075c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f29076d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(X4.U u8, WishlistActivity wishlistActivity, int i8, P5.d dVar) {
            super(2, dVar);
            this.f29074b = u8;
            this.f29075c = wishlistActivity;
            this.f29076d = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new h(this.f29074b, this.f29075c, this.f29076d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((h) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f29073a == 0) {
                L5.t.b(obj);
                this.f29074b.i(this.f29075c);
                V v8 = this.f29075c.f29048s0;
                AbstractC3159y.f(v8);
                return v8.a().remove(this.f29076d);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class i extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29077a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f29079c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(int i8, P5.d dVar) {
            super(2, dVar);
            this.f29079c = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new i(this.f29079c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((i) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f29077a == 0) {
                L5.t.b(obj);
                V v8 = WishlistActivity.this.f29048s0;
                AbstractC3159y.f(v8);
                v8.notifyItemRemoved(this.f29079c);
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29080a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentActivity componentActivity) {
            super(0);
            this.f29080a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f29080a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29081a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentActivity componentActivity) {
            super(0);
            this.f29081a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f29081a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class l extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f29082a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29083b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f29082a = function0;
            this.f29083b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f29082a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f29083b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class m extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29084a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f29086c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str, P5.d dVar) {
            super(2, dVar);
            this.f29086c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new m(this.f29086c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((m) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String str;
            Object obj2;
            Q5.b.e();
            if (this.f29084a == 0) {
                L5.t.b(obj);
                if (WishlistActivity.this.f29048s0 != null) {
                    AbstractC3159y.f(WishlistActivity.this.f29048s0);
                    if ((!r4.a().isEmpty()) && (str = this.f29086c) != null && str.length() != 0) {
                        V v8 = WishlistActivity.this.f29048s0;
                        AbstractC3159y.f(v8);
                        ArrayList a8 = v8.a();
                        String str2 = this.f29086c;
                        Iterator it = a8.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj2 = it.next();
                                if (AbstractC3159y.d(((X4.U) obj2).f(), str2)) {
                                    break;
                                }
                            } else {
                                obj2 = null;
                                break;
                            }
                        }
                        V v9 = WishlistActivity.this.f29048s0;
                        AbstractC3159y.f(v9);
                        int r02 = AbstractC1246t.r0(v9.a(), (X4.U) obj2);
                        if (r02 > -1) {
                            V v10 = WishlistActivity.this.f29048s0;
                            AbstractC3159y.f(v10);
                            v10.notifyItemChanged(r02);
                        } else {
                            WishlistActivity.this.S4();
                        }
                        return L5.I.f6474a;
                    }
                }
                WishlistActivity.this.S4();
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I4(ArrayList arrayList) {
        V v8 = this.f29048s0;
        if (v8 == null) {
            this.f29048s0 = new V(arrayList, this, this.f29049t0);
            L4().f10105c.setAdapter(this.f29048s0);
        } else {
            AbstractC3159y.f(v8);
            v8.d(arrayList);
            S4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J4(X4.U u8, int i8) {
        Y y8 = Y.f33752a;
        String string = getString(R.string.dialog_wishlist_msg);
        AbstractC3159y.h(string, "getString(R.string.dialog_wishlist_msg)");
        String format = String.format(string, Arrays.copyOf(new Object[]{u8.e()}, 1));
        AbstractC3159y.h(format, "format(...)");
        Z1(format, new c(u8, i8));
    }

    private final void K4(C1498h c1498h, C1505o c1505o) {
        c1505o.b(c1498h);
        int l02 = c1505o.l0(this);
        if (l02 >= 0) {
            M2(this, l02);
            return;
        }
        Toast.makeText(this, getString(R.string.error_cant_enqueue_download) + " (108)", 1).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final G0 L4() {
        return (G0) this.f29046q0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final L M4() {
        return (L) this.f29047r0.getValue();
    }

    private final void N4() {
        setContentView(L4().getRoot());
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
        G0 L42 = L4();
        if (drawable != null) {
            L42.f10106d.setNavigationIcon(drawable);
            L42.f10106d.setNavigationContentDescription(getString(R.string.back));
        }
        L42.f10106d.setNavigationOnClickListener(new View.OnClickListener() { // from class: A4.n4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WishlistActivity.O4(WishlistActivity.this, view);
            }
        });
        TextView textView = L42.f10109g;
        j.a aVar = E4.j.f2272g;
        textView.setTypeface(aVar.t());
        L42.f10105c.setLayoutManager(new LinearLayoutManager(this, 1, false));
        L42.f10105c.setItemAnimator(new DefaultItemAnimator());
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setSupportsChangeAnimations(false);
        int dimension = (int) getResources().getDimension(R.dimen.margin_m);
        L4().f10105c.addItemDecoration(new n5.m(dimension, dimension));
        L42.f10105c.setItemAnimator(defaultItemAnimator);
        L42.f10108f.setTypeface(aVar.u());
        L42.f10107e.setTypeface(aVar.u());
        L42.f10107e.setOnClickListener(new View.OnClickListener() { // from class: A4.o4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WishlistActivity.P4(WishlistActivity.this, view);
            }
        });
        L42.f10104b.f10172b.setOnClickListener(new View.OnClickListener() { // from class: A4.p4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WishlistActivity.Q4(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O4(WishlistActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P4(WishlistActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.setResult(1);
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q4(View view) {
    }

    private final void R4() {
        M4().d(this, new e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S4() {
        V v8 = this.f29048s0;
        if (v8 != null) {
            v8.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T4(C1498h c1498h, int i8) {
        C3326n.a aVar = C3326n.f34490t;
        Context applicationContext = getApplicationContext();
        AbstractC3159y.h(applicationContext, "applicationContext");
        C3326n a8 = aVar.a(applicationContext);
        a8.a();
        C1505o Z7 = a8.Z(String.valueOf(c1498h.f0()));
        a8.g();
        if (Z7 != null) {
            int Z8 = Z7.Z();
            if (1 <= Z8 && Z8 < 100) {
                if (Z7.X() != null) {
                    C3313a c3313a = new C3313a();
                    Context applicationContext2 = getApplicationContext();
                    AbstractC3159y.h(applicationContext2, "applicationContext");
                    c3313a.a(applicationContext2, Z7.X());
                    V v8 = this.f29048s0;
                    if (v8 != null) {
                        v8.notifyItemChanged(i8);
                        return;
                    }
                    return;
                }
                return;
            }
            if (Z7.Z() == 100) {
                File f8 = new C3329q().f(this);
                String X7 = Z7.X();
                AbstractC3159y.f(X7);
                UptodownApp.f27990B.Y(new File(f8, X7), this, c1498h.t0());
                return;
            }
            Z7.n0(this);
            V v9 = this.f29048s0;
            if (v9 != null) {
                v9.notifyItemChanged(i8);
                return;
            }
            return;
        }
        C1505o c1505o = new C1505o();
        try {
            String W02 = c1498h.W0();
            AbstractC3159y.f(W02);
            c1505o.G0(Long.parseLong(W02));
        } catch (NumberFormatException e8) {
            e8.printStackTrace();
        }
        K4(c1498h, c1505o);
        V v10 = this.f29048s0;
        AbstractC3159y.f(v10);
        ((X4.U) v10.a().get(i8)).l(String.valueOf(c1498h.f0()));
        V v11 = this.f29048s0;
        if (v11 != null) {
            v11.notifyItemChanged(i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object U4(X4.U r7, int r8, P5.d r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.uptodown.activities.WishlistActivity.g
            if (r0 == 0) goto L13
            r0 = r9
            com.uptodown.activities.WishlistActivity$g r0 = (com.uptodown.activities.WishlistActivity.g) r0
            int r1 = r0.f29072e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29072e = r1
            goto L18
        L13:
            com.uptodown.activities.WishlistActivity$g r0 = new com.uptodown.activities.WishlistActivity$g
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f29070c
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f29072e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            L5.t.b(r9)
            goto L6d
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            int r8 = r0.f29069b
            java.lang.Object r7 = r0.f29068a
            com.uptodown.activities.WishlistActivity r7 = (com.uptodown.activities.WishlistActivity) r7
            L5.t.b(r9)
            goto L59
        L3f:
            L5.t.b(r9)
            i6.I r9 = i6.C2812b0.b()
            com.uptodown.activities.WishlistActivity$h r2 = new com.uptodown.activities.WishlistActivity$h
            r2.<init>(r7, r6, r8, r5)
            r0.f29068a = r6
            r0.f29069b = r8
            r0.f29072e = r4
            java.lang.Object r7 = i6.AbstractC2825i.g(r9, r2, r0)
            if (r7 != r1) goto L58
            return r1
        L58:
            r7 = r6
        L59:
            i6.J0 r9 = i6.C2812b0.c()
            com.uptodown.activities.WishlistActivity$i r2 = new com.uptodown.activities.WishlistActivity$i
            r2.<init>(r8, r5)
            r0.f29068a = r5
            r0.f29072e = r3
            java.lang.Object r7 = i6.AbstractC2825i.g(r9, r2, r0)
            if (r7 != r1) goto L6d
            return r1
        L6d:
            L5.I r7 = L5.I.f6474a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.WishlistActivity.U4(X4.U, int, P5.d):java.lang.Object");
    }

    public final void V4(String str) {
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new m(str, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2489a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        N4();
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new f(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2489a, F4.a1, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        R4();
    }

    @Override // A4.V1
    protected void p4() {
    }
}
