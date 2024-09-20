package com.uptodown.activities;

import E4.j;
import L5.C1224h;
import L5.InterfaceC1227k;
import W4.InterfaceC1481d;
import X4.C1498h;
import X4.C1505o;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.OrganizationActivity;
import com.uptodown.activities.r;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.M;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.U;
import l5.AbstractC3337y;
import l5.C3323k;
import l6.InterfaceC3349K;
import l6.InterfaceC3359g;

/* loaded from: classes4.dex */
public final class OrganizationActivity extends AbstractActivityC2489a {

    /* renamed from: O, reason: collision with root package name */
    private final InterfaceC1227k f28697O = L5.l.b(new a());

    /* renamed from: P, reason: collision with root package name */
    private final InterfaceC1227k f28698P = new ViewModelLazy(U.b(r.class), new e(this), new d(this), new f(null, this));

    /* renamed from: Q, reason: collision with root package name */
    private D4.w f28699Q;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T4.U invoke() {
            return T4.U.c(OrganizationActivity.this.getLayoutInflater());
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC1481d {
        b() {
        }

        @Override // W4.InterfaceC1481d
        public void b(C1498h app) {
            AbstractC3159y.i(app, "app");
            if (UptodownApp.f27990B.a0()) {
                OrganizationActivity.this.G2(app.i());
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28702a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ OrganizationActivity f28704a;

            a(OrganizationActivity organizationActivity) {
                this.f28704a = organizationActivity;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3337y abstractC3337y, P5.d dVar) {
                D4.w wVar;
                if (AbstractC3159y.d(abstractC3337y, AbstractC3337y.a.f34533a)) {
                    if (this.f28704a.f28699Q == null) {
                        this.f28704a.m3().f10323g.f10172b.setVisibility(0);
                    }
                } else if (abstractC3337y instanceof AbstractC3337y.c) {
                    AbstractC3337y.c cVar = (AbstractC3337y.c) abstractC3337y;
                    if (!((r.a) cVar.a()).a()) {
                        this.f28704a.o3(((r.a) cVar.a()).b());
                        this.f28704a.l3(((r.a) cVar.a()).b());
                    } else {
                        D4.w wVar2 = this.f28704a.f28699Q;
                        AbstractC3159y.f(wVar2);
                        wVar2.a(((r.a) cVar.a()).b().i());
                    }
                    this.f28704a.m3().f10323g.f10172b.setVisibility(8);
                    this.f28704a.m3().f10327k.setVisibility(0);
                    D4.w wVar3 = this.f28704a.f28699Q;
                    if (wVar3 != null) {
                        wVar3.c(false);
                    }
                } else if (AbstractC3159y.d(abstractC3337y, AbstractC3337y.b.f34534a) && (wVar = this.f28704a.f28699Q) != null) {
                    wVar.c(false);
                }
                return L5.I.f6474a;
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
            int i8 = this.f28702a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K h8 = OrganizationActivity.this.n3().h();
                a aVar = new a(OrganizationActivity.this);
                this.f28702a = 1;
                if (h8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28705a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f28705a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f28705a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28706a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f28706a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f28706a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f28707a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28708b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f28707a = function0;
            this.f28708b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f28707a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f28708b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28709a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1505o f28710b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ OrganizationActivity f28711c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(C1505o c1505o, OrganizationActivity organizationActivity, P5.d dVar) {
            super(2, dVar);
            this.f28710b = c1505o;
            this.f28711c = organizationActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new g(this.f28710b, this.f28711c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String Y7;
            Q5.b.e();
            if (this.f28709a == 0) {
                L5.t.b(obj);
                C1505o c1505o = this.f28710b;
                if (c1505o != null && (Y7 = c1505o.Y()) != null && Y7.length() != 0 && this.f28711c.f28699Q != null) {
                    D4.w wVar = this.f28711c.f28699Q;
                    AbstractC3159y.f(wVar);
                    String Y8 = this.f28710b.Y();
                    AbstractC3159y.f(Y8);
                    RecyclerView recyclerView = this.f28711c.m3().f10326j;
                    AbstractC3159y.h(recyclerView, "binding.rvOrganization");
                    wVar.d(Y8, recyclerView);
                }
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l3(X4.A a8) {
        String j8;
        if (this.f28699Q == null && (j8 = a8.j()) != null && j8.length() != 0) {
            b bVar = new b();
            String j9 = a8.j();
            AbstractC3159y.f(j9);
            this.f28699Q = new D4.w(bVar, j9);
            m3().f10326j.setAdapter(this.f28699Q);
        }
        D4.w wVar = this.f28699Q;
        if (wVar != null) {
            wVar.b(a8.h(), a8.f(), a8.b(), a8.i());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T4.U m3() {
        return (T4.U) this.f28697O.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final r n3() {
        return (r) this.f28698P.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o3(final X4.A a8) {
        String a9;
        String e8;
        if (!n3().l()) {
            final T4.U m32 = m3();
            m32.f10332p.setText(a8.j());
            String c8 = a8.c();
            if (c8 != null && c8.length() != 0 && (a9 = a8.a()) != null && a9.length() != 0 && (e8 = a8.e()) != null && e8.length() != 0) {
                String c9 = a8.c();
                if (c9 != null && c9.length() != 0) {
                    com.squareup.picasso.s.h().l(a8.d()).n(UptodownApp.f27990B.e0(this)).i(m32.f10318b);
                }
                String e9 = a8.e();
                if (e9 != null && e9.length() != 0) {
                    com.squareup.picasso.s.h().l(a8.e()).n(UptodownApp.f27990B.f0(this)).i(m32.f10320d);
                }
                TextView textView = m32.f10330n;
                j.a aVar = E4.j.f2272g;
                textView.setTypeface(aVar.t());
                m32.f10330n.setText(a8.j());
                m32.f10333q.setTypeface(aVar.t());
                m32.f10333q.setOnClickListener(new View.OnClickListener() { // from class: A4.v2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        OrganizationActivity.p3(X4.A.this, this, view);
                    }
                });
                String l8 = a8.l();
                if (l8 != null && l8.length() != 0) {
                    m32.f10322f.setVisibility(0);
                    m32.f10322f.setOnClickListener(new View.OnClickListener() { // from class: A4.w2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            OrganizationActivity.q3(OrganizationActivity.this, a8, view);
                        }
                    });
                }
                String g8 = a8.g();
                if (g8 != null && g8.length() != 0) {
                    m32.f10319c.setVisibility(0);
                    m32.f10319c.setOnClickListener(new View.OnClickListener() { // from class: A4.x2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            OrganizationActivity.r3(OrganizationActivity.this, a8, view);
                        }
                    });
                }
                String k8 = a8.k();
                if (k8 != null && k8.length() != 0) {
                    m32.f10321e.setVisibility(0);
                    m32.f10321e.setOnClickListener(new View.OnClickListener() { // from class: A4.y2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            OrganizationActivity.s3(OrganizationActivity.this, a8, view);
                        }
                    });
                }
                m32.f10329m.setTypeface(aVar.u());
                m32.f10329m.setText(a8.a());
                m32.f10331o.setTypeface(aVar.t());
                m32.f10331o.setOnClickListener(new View.OnClickListener() { // from class: A4.z2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        OrganizationActivity.t3(X4.A.this, m32, view);
                    }
                });
            } else {
                m3().f10325i.setVisibility(8);
            }
            n3().o(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p3(X4.A organization, OrganizationActivity this$0, View view) {
        AbstractC3159y.i(organization, "$organization");
        AbstractC3159y.i(this$0, "this$0");
        if (organization.m() != null) {
            C3323k c3323k = new C3323k();
            String m8 = organization.m();
            AbstractC3159y.f(m8);
            c3323k.q(this$0, m8, organization.j());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q3(OrganizationActivity this$0, X4.A organization, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(organization, "$organization");
        if (!this$0.isFinishing()) {
            C3323k c3323k = new C3323k();
            String l8 = organization.l();
            AbstractC3159y.f(l8);
            C3323k.r(c3323k, this$0, l8, null, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r3(OrganizationActivity this$0, X4.A organization, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(organization, "$organization");
        if (!this$0.isFinishing()) {
            C3323k c3323k = new C3323k();
            String g8 = organization.g();
            AbstractC3159y.f(g8);
            C3323k.r(c3323k, this$0, g8, null, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s3(OrganizationActivity this$0, X4.A organization, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(organization, "$organization");
        if (!this$0.isFinishing()) {
            C3323k c3323k = new C3323k();
            String k8 = organization.k();
            AbstractC3159y.f(k8);
            C3323k.r(c3323k, this$0, k8, null, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t3(X4.A organization, T4.U this_with, View view) {
        AbstractC3159y.i(organization, "$organization");
        AbstractC3159y.i(this_with, "$this_with");
        String a8 = organization.a();
        if (a8 != null && a8.length() != 0) {
            if (this_with.f10334r.getVisibility() == 0) {
                this_with.f10331o.setText(R.string.read_less_desc_app_detail);
                this_with.f10334r.setVisibility(8);
                this_with.f10329m.setMaxLines(Integer.MAX_VALUE);
                this_with.f10329m.setEllipsize(null);
                return;
            }
            this_with.f10331o.setText(R.string.read_more_desc_app_detail);
            this_with.f10334r.setVisibility(0);
            this_with.f10329m.setMaxLines(6);
            this_with.f10329m.setEllipsize(TextUtils.TruncateAt.END);
        }
    }

    private final void u3() {
        setContentView(m3().getRoot());
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
        final T4.U m32 = m3();
        if (drawable != null) {
            m32.f10328l.setNavigationIcon(drawable);
            m32.f10328l.setNavigationContentDescription(getString(R.string.back));
        }
        m32.f10328l.setNavigationOnClickListener(new View.OnClickListener() { // from class: A4.t2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OrganizationActivity.v3(OrganizationActivity.this, view);
            }
        });
        m32.f10332p.setTypeface(E4.j.f2272g.t());
        m32.f10326j.setLayoutManager(new LinearLayoutManager(this, 1, false));
        m32.f10326j.setItemAnimator(null);
        if (((CharSequence) n3().k().getValue()).length() > 0) {
            m32.f10332p.setText((CharSequence) n3().k().getValue());
        }
        m32.f10327k.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: A4.u2
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                OrganizationActivity.w3(OrganizationActivity.this, m32);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v3(OrganizationActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w3(OrganizationActivity this$0, T4.U this_with) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(this_with, "$this_with");
        if (!this$0.n3().i() && !this$0.n3().g()) {
            ScrollView scrollView = this_with.f10327k;
            if (scrollView.getChildAt(scrollView.getChildCount() - 1).getBottom() - (this_with.f10327k.getHeight() + this_with.f10327k.getScrollY()) <= 0 && !this$0.n3().i() && !this$0.n3().g()) {
                D4.w wVar = this$0.f28699Q;
                if (wVar != null) {
                    wVar.c(true);
                }
                this$0.y3();
            }
        }
    }

    private final void x3() {
        n3().e(this);
    }

    private final void y3() {
        n3().f(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2489a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null && (extras = intent.getExtras()) != null) {
            if (extras.containsKey("organizationID")) {
                n3().j().setValue(Long.valueOf(extras.getLong("organizationID")));
            }
            if (extras.containsKey("organizationName")) {
                l6.v k8 = n3().k();
                String string = extras.getString("organizationName");
                AbstractC3159y.f(string);
                k8.setValue(string);
            }
        }
        u3();
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new c(null), 2, null);
        x3();
    }

    public final void z3(C1505o c1505o) {
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new g(c1505o, this, null), 2, null);
    }
}
