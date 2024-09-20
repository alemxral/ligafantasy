package com.uptodown.activities;

import D4.Q;
import E4.j;
import L5.C1224h;
import L5.InterfaceC1227k;
import T4.x0;
import X4.C1498h;
import X4.K;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.autofill.HintConstants;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.snackbar.Snackbar;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.I;
import com.uptodown.activities.UserCommentsActivity;
import com.uptodown.util.views.UsernameTextView;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.M;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.U;
import l5.AbstractC3337y;
import l5.C3307A;
import l5.C3323k;
import l6.InterfaceC3349K;
import l6.InterfaceC3359g;

/* loaded from: classes4.dex */
public final class UserCommentsActivity extends AbstractActivityC2489a {

    /* renamed from: Q, reason: collision with root package name */
    private Q f28996Q;

    /* renamed from: O, reason: collision with root package name */
    private final InterfaceC1227k f28994O = L5.l.b(new a());

    /* renamed from: P, reason: collision with root package name */
    private final InterfaceC1227k f28995P = new ViewModelLazy(U.b(I.class), new g(this), new f(this), new h(null, this));

    /* renamed from: R, reason: collision with root package name */
    private c f28997R = new c();

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x0 invoke() {
            return x0.c(UserCommentsActivity.this.getLayoutInflater());
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends RecyclerView.OnScrollListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LinearLayoutManager f28999a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ UserCommentsActivity f29000b;

        b(LinearLayoutManager linearLayoutManager, UserCommentsActivity userCommentsActivity) {
            this.f28999a = linearLayoutManager;
            this.f29000b = userCommentsActivity;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i8, int i9) {
            AbstractC3159y.i(recyclerView, "recyclerView");
            if (i9 > 0) {
                int findFirstVisibleItemPosition = this.f28999a.findFirstVisibleItemPosition();
                int childCount = this.f28999a.getChildCount();
                int itemCount = this.f28999a.getItemCount();
                if (!this.f29000b.j3().i() && childCount + findFirstVisibleItemPosition >= itemCount) {
                    Q q8 = this.f29000b.f28996Q;
                    if (q8 != null) {
                        q8.c(true);
                    }
                    this.f29000b.h3();
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements W4.H {

        /* loaded from: classes4.dex */
        public static final class a implements W4.r {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ UserCommentsActivity f29002a;

            a(UserCommentsActivity userCommentsActivity) {
                this.f29002a = userCommentsActivity;
            }

            @Override // W4.r
            public void c(int i8) {
            }

            @Override // W4.r
            public void f(C1498h appInfo) {
                AbstractC3159y.i(appInfo, "appInfo");
                Intent intent = new Intent(this.f29002a, (Class<?>) AppDetailActivity.class);
                intent.putExtra("appInfo", appInfo);
                UserCommentsActivity userCommentsActivity = this.f29002a;
                userCommentsActivity.startActivity(intent, UptodownApp.f27990B.a(userCommentsActivity));
            }
        }

        c() {
        }

        @Override // W4.H
        public void a(int i8) {
            Intent intent = new Intent(UserCommentsActivity.this, (Class<?>) RepliesActivity.class);
            Q q8 = UserCommentsActivity.this.f28996Q;
            AbstractC3159y.f(q8);
            Object obj = q8.b().get(i8);
            X4.K k8 = (X4.K) obj;
            k8.Y((String) UserCommentsActivity.this.j3().l().getValue());
            AbstractC3159y.h(obj, "adapter!!.reviews[positi…wModel.userAvatar.value }");
            k8.e0(((Boolean) UserCommentsActivity.this.j3().p().getValue()).booleanValue() ? 1 : 0);
            k8.h0((String) UserCommentsActivity.this.j3().o().getValue());
            intent.putExtra("review", k8);
            intent.putExtra(HintConstants.AUTOFILL_HINT_USERNAME, (String) UserCommentsActivity.this.j3().n().getValue());
            UserCommentsActivity userCommentsActivity = UserCommentsActivity.this;
            userCommentsActivity.startActivity(intent, UptodownApp.f27990B.a(userCommentsActivity));
        }

        @Override // W4.H
        public void b(int i8) {
            if (UptodownApp.f27990B.a0()) {
                C3307A c3307a = C3307A.f34459a;
                Q q8 = UserCommentsActivity.this.f28996Q;
                AbstractC3159y.f(q8);
                if (!c3307a.i(((X4.K) q8.b().get(i8)).j())) {
                    I j32 = UserCommentsActivity.this.j3();
                    UserCommentsActivity userCommentsActivity = UserCommentsActivity.this;
                    Q q9 = userCommentsActivity.f28996Q;
                    AbstractC3159y.f(q9);
                    Object obj = q9.b().get(i8);
                    AbstractC3159y.h(obj, "adapter!!.reviews[position]");
                    j32.q(userCommentsActivity, (X4.K) obj);
                }
            }
        }

        @Override // W4.H
        public void c(int i8) {
            if (UptodownApp.f27990B.a0()) {
                UserCommentsActivity userCommentsActivity = UserCommentsActivity.this;
                Q q8 = userCommentsActivity.f28996Q;
                AbstractC3159y.f(q8);
                new S4.i(userCommentsActivity, ((X4.K) q8.b().get(i8)).c(), new a(UserCommentsActivity.this), LifecycleOwnerKt.getLifecycleScope(UserCommentsActivity.this));
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29003a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ UserCommentsActivity f29005a;

            a(UserCommentsActivity userCommentsActivity) {
                this.f29005a = userCommentsActivity;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3337y abstractC3337y, P5.d dVar) {
                if (abstractC3337y instanceof AbstractC3337y.a) {
                    this.f29005a.g3().f10952d.f10172b.setVisibility(0);
                } else if (abstractC3337y instanceof AbstractC3337y.c) {
                    AbstractC3337y.c cVar = (AbstractC3337y.c) abstractC3337y;
                    if (((I.a) cVar.a()).b() != null && ((I.a) cVar.a()).c()) {
                        String f8 = ((I.a) cVar.a()).b().f();
                        if (f8 != null && f8.length() != 0) {
                            com.squareup.picasso.s.h().l(X4.Q.f12424k.c(((I.a) cVar.a()).b().c())).n(UptodownApp.f27990B.f0(this.f29005a)).i(this.f29005a.g3().f10950b);
                        }
                        this.f29005a.g3().f10959k.setText(((I.a) cVar.a()).b().n());
                        UsernameTextView.a aVar = UsernameTextView.f29975k;
                        UsernameTextView usernameTextView = this.f29005a.g3().f10959k;
                        AbstractC3159y.h(usernameTextView, "binding.tvUsernameUserComment");
                        aVar.a(usernameTextView, ((I.a) cVar.a()).b().I(), ((I.a) cVar.a()).b().u());
                        this.f29005a.g3().f10956h.setText(((I.a) cVar.a()).b().o());
                        if (((I.a) cVar.a()).b().I()) {
                            this.f29005a.g3().f10951c.setVisibility(0);
                            C3323k.a aVar2 = C3323k.f34483a;
                            ImageView imageView = this.f29005a.g3().f10950b;
                            AbstractC3159y.h(imageView, "binding.ivAvatarUserComment");
                            aVar2.a(imageView);
                        }
                        if (!((I.a) cVar.a()).a().isEmpty()) {
                            if (this.f29005a.f28996Q != null) {
                                Q q8 = this.f29005a.f28996Q;
                                AbstractC3159y.f(q8);
                                q8.a(((I.a) cVar.a()).a());
                            } else {
                                this.f29005a.f28996Q = new Q(((I.a) cVar.a()).a(), this.f29005a.f28997R);
                                this.f29005a.g3().f10954f.setAdapter(this.f29005a.f28996Q);
                            }
                        }
                        Q q9 = this.f29005a.f28996Q;
                        if (q9 != null) {
                            q9.c(false);
                        }
                        this.f29005a.g3().f10960l.setVisibility(0);
                    } else {
                        this.f29005a.g3().f10957i.setTypeface(E4.j.f2272g.u());
                        this.f29005a.g3().f10957i.setVisibility(0);
                        this.f29005a.g3().f10953e.setVisibility(8);
                    }
                    this.f29005a.j3().r(false);
                    this.f29005a.g3().f10952d.f10172b.setVisibility(8);
                } else {
                    boolean z8 = abstractC3337y instanceof AbstractC3337y.b;
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
            int i8 = this.f29003a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K h8 = UserCommentsActivity.this.j3().h();
                a aVar = new a(UserCommentsActivity.this);
                this.f29003a = 1;
                if (h8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29006a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ UserCommentsActivity f29008a;

            a(UserCommentsActivity userCommentsActivity) {
                this.f29008a = userCommentsActivity;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3337y abstractC3337y, P5.d dVar) {
                if (abstractC3337y instanceof AbstractC3337y.c) {
                    AbstractC3337y.c cVar = (AbstractC3337y.c) abstractC3337y;
                    if (((K.c) cVar.a()).b() == 1) {
                        Q q8 = this.f29008a.f28996Q;
                        if (q8 != null) {
                            q8.d(((K.c) cVar.a()).a());
                        }
                    } else {
                        Snackbar.make(this.f29008a.g3().f10954f, R.string.error_generico, -1).show();
                    }
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
            int i8 = this.f29006a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K k8 = UserCommentsActivity.this.j3().k();
                a aVar = new a(UserCommentsActivity.this);
                this.f29006a = 1;
                if (k8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29009a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f29009a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f29009a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29010a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f29010a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f29010a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f29011a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29012b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f29011a = function0;
            this.f29012b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f29011a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f29012b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final x0 g3() {
        return (x0) this.f28994O.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h3() {
        CharSequence charSequence = (CharSequence) j3().m().getValue();
        if (charSequence != null && charSequence.length() != 0) {
            j3().r(true);
            j3().g(this);
        }
    }

    private final String i3() {
        Bundle extras;
        if (getIntent() != null && (extras = getIntent().getExtras()) != null && extras.containsKey("userID")) {
            return extras.getString("userID");
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final I j3() {
        return (I) this.f28995P.getValue();
    }

    private final void k3() {
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
        if (drawable != null) {
            g3().f10955g.setNavigationIcon(drawable);
            g3().f10955g.setNavigationContentDescription(getString(R.string.back));
        }
        g3().f10955g.setNavigationOnClickListener(new View.OnClickListener() { // from class: A4.Z3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserCommentsActivity.l3(UserCommentsActivity.this, view);
            }
        });
        TextView textView = g3().f10958j;
        j.a aVar = E4.j.f2272g;
        textView.setTypeface(aVar.t());
        g3().f10959k.setTypeface(aVar.t());
        g3().f10956h.setTypeface(aVar.u());
        int dimension = (int) getResources().getDimension(R.dimen.margin_m);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, 1, false);
        g3().f10954f.addItemDecoration(new n5.r(dimension, dimension, dimension, dimension));
        g3().f10954f.setLayoutManager(linearLayoutManager);
        String str = null;
        g3().f10954f.setItemAnimator(null);
        g3().f10954f.addOnScrollListener(new b(linearLayoutManager, this));
        Object value = j3().m().getValue();
        X4.Q e8 = X4.Q.f12424k.e(this);
        if (e8 != null) {
            str = e8.getId();
        }
        if (AbstractC3159y.d(value, str)) {
            g3().f10953e.setVisibility(8);
        }
        h3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l3(UserCommentsActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.getOnBackPressedDispatcher().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2489a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(g3().getRoot());
        j3().m().setValue(i3());
        k3();
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new d(null), 2, null);
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new e(null), 2, null);
    }
}
