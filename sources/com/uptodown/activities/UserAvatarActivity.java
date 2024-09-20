package com.uptodown.activities;

import D4.N;
import E4.j;
import L5.C1224h;
import L5.InterfaceC1227k;
import T4.u0;
import W4.InterfaceC1483f;
import X4.C1499i;
import X4.Q;
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
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.uptodown.R;
import com.uptodown.activities.H;
import com.uptodown.activities.UserAvatarActivity;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.M;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.U;
import l5.AbstractC3337y;
import l5.C3312F;
import l5.C3323k;
import l6.InterfaceC3349K;
import l6.InterfaceC3359g;

/* loaded from: classes4.dex */
public final class UserAvatarActivity extends AbstractActivityC2489a {

    /* renamed from: Q, reason: collision with root package name */
    private N f28973Q;

    /* renamed from: R, reason: collision with root package name */
    private N f28974R;

    /* renamed from: S, reason: collision with root package name */
    private int f28975S;

    /* renamed from: O, reason: collision with root package name */
    private final InterfaceC1227k f28971O = L5.l.b(new a());

    /* renamed from: P, reason: collision with root package name */
    private final InterfaceC1227k f28972P = new ViewModelLazy(U.b(H.class), new h(this), new g(this), new i(null, this));

    /* renamed from: T, reason: collision with root package name */
    private final AtomicBoolean f28976T = new AtomicBoolean(false);

    /* renamed from: U, reason: collision with root package name */
    private final d f28977U = new d();

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final u0 invoke() {
            return u0.c(UserAvatarActivity.this.getLayoutInflater());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28979a;

        b(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f28979a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                if (UserAvatarActivity.this.f28976T.compareAndSet(false, true)) {
                    UserAvatarActivity userAvatarActivity = UserAvatarActivity.this;
                    this.f28979a = 1;
                    if (userAvatarActivity.t3(this) == e8) {
                        return e8;
                    }
                }
                return L5.I.f6474a;
            }
            UserAvatarActivity.this.f28976T.set(false);
            return L5.I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28981a;

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
            Q5.b.e();
            if (this.f28981a == 0) {
                L5.t.b(obj);
                UserAvatarActivity.this.n3();
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements InterfaceC1483f {
        d() {
        }

        @Override // W4.InterfaceC1483f
        public void a(C1499i avatar, int i8) {
            AbstractC3159y.i(avatar, "avatar");
            if (avatar.f()) {
                if (UserAvatarActivity.this.o3().f().getValue() != null) {
                    Object value = UserAvatarActivity.this.o3().f().getValue();
                    AbstractC3159y.f(value);
                    if (((Q) value).z(UserAvatarActivity.this)) {
                        Object value2 = UserAvatarActivity.this.o3().f().getValue();
                        AbstractC3159y.f(value2);
                        if (((Q) value2).G()) {
                            N n8 = UserAvatarActivity.this.f28973Q;
                            AbstractC3159y.f(n8);
                            if (n8.c() != -1) {
                                N n9 = UserAvatarActivity.this.f28973Q;
                                AbstractC3159y.f(n9);
                                N n10 = UserAvatarActivity.this.f28973Q;
                                AbstractC3159y.f(n10);
                                n9.notifyItemChanged(n10.c());
                                N n11 = UserAvatarActivity.this.f28973Q;
                                AbstractC3159y.f(n11);
                                n11.d(-1);
                                N n12 = UserAvatarActivity.this.f28973Q;
                                AbstractC3159y.f(n12);
                                n12.notifyItemChanged(i8);
                            }
                            N n13 = UserAvatarActivity.this.f28974R;
                            if (n13 != null) {
                                N n14 = UserAvatarActivity.this.f28974R;
                                AbstractC3159y.f(n14);
                                n13.notifyItemChanged(n14.c());
                            }
                            N n15 = UserAvatarActivity.this.f28974R;
                            if (n15 != null) {
                                n15.d(i8);
                            }
                            N n16 = UserAvatarActivity.this.f28974R;
                            if (n16 != null) {
                                n16.notifyItemChanged(i8);
                                return;
                            }
                            return;
                        }
                    }
                }
                C3323k.r(new C3323k(), UserAvatarActivity.this, C3312F.f34471c.c(UserAvatarActivity.this), null, 4, null);
                return;
            }
            if (UserAvatarActivity.this.f28974R != null) {
                N n17 = UserAvatarActivity.this.f28974R;
                AbstractC3159y.f(n17);
                if (n17.c() != -1) {
                    N n18 = UserAvatarActivity.this.f28974R;
                    AbstractC3159y.f(n18);
                    N n19 = UserAvatarActivity.this.f28974R;
                    AbstractC3159y.f(n19);
                    n18.notifyItemChanged(n19.c());
                    N n20 = UserAvatarActivity.this.f28974R;
                    AbstractC3159y.f(n20);
                    n20.d(-1);
                    N n21 = UserAvatarActivity.this.f28974R;
                    AbstractC3159y.f(n21);
                    n21.notifyItemChanged(i8);
                }
            }
            N n22 = UserAvatarActivity.this.f28973Q;
            AbstractC3159y.f(n22);
            N n23 = UserAvatarActivity.this.f28973Q;
            AbstractC3159y.f(n23);
            n22.notifyItemChanged(n23.c());
            N n24 = UserAvatarActivity.this.f28973Q;
            AbstractC3159y.f(n24);
            n24.d(i8);
            N n25 = UserAvatarActivity.this.f28973Q;
            AbstractC3159y.f(n25);
            n25.notifyItemChanged(i8);
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28984a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ UserAvatarActivity f28986a;

            a(UserAvatarActivity userAvatarActivity) {
                this.f28986a = userAvatarActivity;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3337y abstractC3337y, P5.d dVar) {
                if (abstractC3337y instanceof AbstractC3337y.a) {
                    this.f28986a.l3().f10911d.f10172b.setVisibility(0);
                } else if (abstractC3337y instanceof AbstractC3337y.c) {
                    this.f28986a.l3().f10911d.f10172b.setVisibility(8);
                    this.f28986a.l3().f10917j.setVisibility(0);
                    AbstractC3337y.c cVar = (AbstractC3337y.c) abstractC3337y;
                    this.f28986a.k3(((H.a) cVar.a()).a(), ((H.a) cVar.a()).b());
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
            int i8 = this.f28984a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K d8 = UserAvatarActivity.this.o3().d();
                a aVar = new a(UserAvatarActivity.this);
                this.f28984a = 1;
                if (d8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28987a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ UserAvatarActivity f28989a;

            a(UserAvatarActivity userAvatarActivity) {
                this.f28989a = userAvatarActivity;
            }

            public final Object b(boolean z8, P5.d dVar) {
                if (z8) {
                    UserAvatarActivity userAvatarActivity = this.f28989a;
                    Toast.makeText(userAvatarActivity, userAvatarActivity.getString(R.string.avatar_activity_changed_success), 1).show();
                    this.f28989a.finish();
                }
                return L5.I.f6474a;
            }

            @Override // l6.InterfaceC3359g
            public /* bridge */ /* synthetic */ Object emit(Object obj, P5.d dVar) {
                return b(((Boolean) obj).booleanValue(), dVar);
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
            int i8 = this.f28987a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K e9 = UserAvatarActivity.this.o3().e();
                a aVar = new a(UserAvatarActivity.this);
                this.f28987a = 1;
                if (e9.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28990a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f28990a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f28990a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28991a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentActivity componentActivity) {
            super(0);
            this.f28991a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f28991a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f28992a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28993b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f28992a = function0;
            this.f28993b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f28992a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f28993b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k3(ArrayList arrayList, ArrayList arrayList2) {
        boolean z8;
        int i8 = 0;
        if (this.f28973Q == null) {
            this.f28973Q = new N(arrayList, this.f28977U, 0, this.f28975S, false, 16, null);
            l3().f10912e.setAdapter(this.f28973Q);
            l3().f10915h.setVisibility(0);
        }
        l3().f10910c.setVisibility(8);
        if (!arrayList2.isEmpty()) {
            l3().f10910c.setVisibility(0);
            Q e8 = Q.f12424k.e(this);
            if (e8 != null) {
                z8 = e8.G();
            } else {
                z8 = false;
            }
            if (this.f28974R == null) {
                this.f28974R = new N(arrayList2, this.f28977U, 1, 0, z8, 8, null);
                l3().f10913f.setAdapter(this.f28974R);
                l3().f10913f.setVisibility(0);
            }
        } else {
            l3().f10910c.setVisibility(8);
            l3().f10913f.setVisibility(8);
        }
        Iterator it = arrayList.iterator();
        int i9 = 0;
        while (true) {
            if (it.hasNext()) {
                if (((C1499i) it.next()).b() == 1) {
                    break;
                } else {
                    i9++;
                }
            } else {
                i9 = -1;
                break;
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (true) {
            if (it2.hasNext()) {
                if (((C1499i) it2.next()).b() == 1) {
                    break;
                } else {
                    i8++;
                }
            } else {
                i8 = -1;
                break;
            }
        }
        if (i9 > -1) {
            N n8 = this.f28973Q;
            if (n8 != null) {
                n8.d(i9);
            }
            N n9 = this.f28973Q;
            if (n9 != null) {
                n9.notifyItemChanged(i9);
                return;
            }
            return;
        }
        if (i8 > -1) {
            N n10 = this.f28974R;
            if (n10 != null) {
                n10.d(i8);
            }
            N n11 = this.f28974R;
            if (n11 != null) {
                n11.notifyItemChanged(i8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final u0 l3() {
        return (u0) this.f28971O.getValue();
    }

    private final int m3() {
        int i8 = getResources().getDisplayMetrics().widthPixels;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.margin_m);
        int i9 = 6;
        while (true) {
            if ((i8 - ((i9 + 1) * dimensionPixelSize)) / i9 > getResources().getDimensionPixelSize(R.dimen.icon_size_l)) {
                break;
            }
            i9--;
            if (i9 <= 0) {
                i9 = 1;
                break;
            }
        }
        this.f28975S = (i8 - (dimensionPixelSize * (i9 + 1))) / i9;
        return i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n3() {
        o3().c(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final H o3() {
        return (H) this.f28972P.getValue();
    }

    private final void p3() {
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
        u0 l32 = l3();
        if (drawable != null) {
            l32.f10914g.setNavigationIcon(drawable);
            l32.f10914g.setNavigationContentDescription(getString(R.string.back));
        }
        l32.f10914g.setNavigationOnClickListener(new View.OnClickListener() { // from class: A4.W3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserAvatarActivity.q3(UserAvatarActivity.this, view);
            }
        });
        TextView textView = l32.f10918k;
        j.a aVar = E4.j.f2272g;
        textView.setTypeface(aVar.t());
        l32.f10917j.setTypeface(aVar.t());
        l32.f10916i.setTypeface(aVar.t());
        l32.f10915h.setTypeface(aVar.t());
        l32.f10919l.setTypeface(aVar.t());
        l32.f10916i.setOnClickListener(new View.OnClickListener() { // from class: A4.X3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserAvatarActivity.r3(UserAvatarActivity.this, view);
            }
        });
        if (o3().f().getValue() != null) {
            Object value = o3().f().getValue();
            AbstractC3159y.f(value);
            if (((Q) value).G()) {
                l32.f10909b.setOnClickListener(new View.OnClickListener() { // from class: A4.Y3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        UserAvatarActivity.s3(UserAvatarActivity.this, view);
                    }
                });
            }
        }
        int m32 = m3();
        l32.f10912e.setLayoutManager(new GridLayoutManager(this, m32));
        l32.f10912e.addItemDecoration(new n5.n(this, m32));
        l32.f10913f.setLayoutManager(new LinearLayoutManager(this, 0, false));
        l32.f10913f.addItemDecoration(new n5.u(this));
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new c(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q3(UserAvatarActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r3(UserAvatarActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this$0), null, null, new b(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s3(UserAvatarActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        C3323k.r(new C3323k(), this$0, C3312F.f34471c.c(this$0), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t3(P5.d r7) {
        /*
            r6 = this;
            androidx.lifecycle.LifecycleCoroutineScope r0 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r6)
            i6.J0 r1 = i6.C2812b0.c()
            com.uptodown.activities.UserAvatarActivity$f r3 = new com.uptodown.activities.UserAvatarActivity$f
            r7 = 0
            r3.<init>(r7)
            r4 = 2
            r5 = 0
            r2 = 0
            i6.AbstractC2825i.d(r0, r1, r2, r3, r4, r5)
            D4.N r0 = r6.f28973Q
            r1 = -1
            if (r0 == 0) goto L3b
            kotlin.jvm.internal.AbstractC3159y.f(r0)
            int r0 = r0.c()
            if (r0 == r1) goto L3b
            D4.N r7 = r6.f28973Q
            kotlin.jvm.internal.AbstractC3159y.f(r7)
            java.util.ArrayList r7 = r7.b()
            D4.N r0 = r6.f28973Q
            kotlin.jvm.internal.AbstractC3159y.f(r0)
            int r0 = r0.c()
            java.lang.Object r7 = r7.get(r0)
            X4.i r7 = (X4.C1499i) r7
            goto L60
        L3b:
            D4.N r0 = r6.f28974R
            if (r0 == 0) goto L60
            kotlin.jvm.internal.AbstractC3159y.f(r0)
            int r0 = r0.c()
            if (r0 == r1) goto L60
            D4.N r7 = r6.f28974R
            kotlin.jvm.internal.AbstractC3159y.f(r7)
            java.util.ArrayList r7 = r7.b()
            D4.N r0 = r6.f28974R
            kotlin.jvm.internal.AbstractC3159y.f(r0)
            int r0 = r0.c()
            java.lang.Object r7 = r7.get(r0)
            X4.i r7 = (X4.C1499i) r7
        L60:
            if (r7 == 0) goto L69
            com.uptodown.activities.H r0 = r6.o3()
            r0.g(r6, r7)
        L69:
            L5.I r7 = L5.I.f6474a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.UserAvatarActivity.t3(P5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2489a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(l3().getRoot());
        o3().f().setValue(Q.f12424k.e(this));
        p3();
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new e(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2489a, F4.a1, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        n3();
    }
}
