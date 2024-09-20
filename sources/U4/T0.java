package U4;

import D4.C1100i;
import W4.InterfaceC1478a;
import X4.C1498h;
import X4.C1501k;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.MainActivity;
import com.uptodown.activities.preferences.SettingsPreferences;
import d2.InterfaceC2541e;
import i6.AbstractC2829k;
import i6.C2812b0;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes5.dex */
public final class T0 extends Fragment {

    /* renamed from: n, reason: collision with root package name */
    public static final a f11482n = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private C1501k f11483a;

    /* renamed from: b, reason: collision with root package name */
    private C1100i f11484b;

    /* renamed from: e, reason: collision with root package name */
    private X4.N f11487e;

    /* renamed from: f, reason: collision with root package name */
    private X4.N f11488f;

    /* renamed from: g, reason: collision with root package name */
    private C1498h f11489g;

    /* renamed from: h, reason: collision with root package name */
    private RelativeLayout f11490h;

    /* renamed from: i, reason: collision with root package name */
    private RecyclerView f11491i;

    /* renamed from: j, reason: collision with root package name */
    private View f11492j;

    /* renamed from: c, reason: collision with root package name */
    private ArrayList f11485c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private ArrayList f11486d = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    private W4.s f11493k = new d();

    /* renamed from: l, reason: collision with root package name */
    private final b f11494l = new b();

    /* renamed from: m, reason: collision with root package name */
    private final c f11495m = new c();

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final T0 a(C1501k category) {
            AbstractC3159y.i(category, "category");
            T0 t02 = new T0();
            t02.setArguments(category.I());
            return t02;
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    public static final class c implements W4.q {
        c() {
        }

        @Override // W4.q
        public void a(X4.N topByCategoryReceived) {
            AbstractC3159y.i(topByCategoryReceived, "topByCategoryReceived");
            T0.this.f11488f = topByCategoryReceived;
        }

        @Override // W4.q
        public void b(ArrayList topsByCategoryReceived) {
            C1100i c1100i;
            AbstractC3159y.i(topsByCategoryReceived, "topsByCategoryReceived");
            if (topsByCategoryReceived.size() > 0 && T0.this.r() != null && (c1100i = T0.this.f11484b) != null) {
                C1501k r8 = T0.this.r();
                AbstractC3159y.f(r8);
                c1100i.m(topsByCategoryReceived, r8);
            }
        }

        @Override // W4.q
        public void c(ArrayList featuresReceived) {
            AbstractC3159y.i(featuresReceived, "featuresReceived");
            T0.this.f11486d = featuresReceived;
        }

        @Override // W4.q
        public void d(ArrayList floatingCategories) {
            AbstractC3159y.i(floatingCategories, "floatingCategories");
            C1100i c1100i = T0.this.f11484b;
            if (c1100i != null) {
                c1100i.i(floatingCategories);
            }
        }

        @Override // W4.q
        public void e(C1498h appInfo) {
            AbstractC3159y.i(appInfo, "appInfo");
            T0.this.f11489g = appInfo;
        }

        @Override // W4.q
        public void f() {
            T0.this.p();
        }

        @Override // W4.q
        public void g(C1498h appReplacement) {
            AbstractC3159y.i(appReplacement, "appReplacement");
            C1100i c1100i = T0.this.f11484b;
            if (c1100i != null) {
                c1100i.b(appReplacement);
            }
        }

        @Override // W4.q
        public void h(X4.N topByCategoryReceived) {
            AbstractC3159y.i(topByCategoryReceived, "topByCategoryReceived");
            C1100i c1100i = T0.this.f11484b;
            if (c1100i != null) {
                c1100i.k(topByCategoryReceived);
            }
        }

        @Override // W4.q
        public void i(X4.N recentsByCategoryReceived) {
            AbstractC3159y.i(recentsByCategoryReceived, "recentsByCategoryReceived");
            T0.this.f11487e = recentsByCategoryReceived;
        }

        @Override // W4.q
        public void j(ArrayList categoriesReceived) {
            AbstractC3159y.i(categoriesReceived, "categoriesReceived");
            T0.this.f11485c = categoriesReceived;
        }
    }

    /* loaded from: classes5.dex */
    public static final class d implements W4.s {
        d() {
        }

        @Override // W4.InterfaceC1484g
        public void a(C1501k category) {
            AbstractC3159y.i(category, "category");
            if (UptodownApp.f27990B.a0()) {
                FragmentActivity activity = T0.this.getActivity();
                AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                ((MainActivity) activity).R7(category);
            }
        }

        @Override // W4.InterfaceC1481d
        public void b(C1498h app) {
            AbstractC3159y.i(app, "app");
            if (UptodownApp.f27990B.a0() && T0.this.getActivity() != null && (T0.this.getActivity() instanceof MainActivity)) {
                FragmentActivity activity = T0.this.getActivity();
                AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                ((MainActivity) activity).G2(app.i());
            }
        }

        @Override // W4.s
        public void c(X4.N topByCategory) {
            AbstractC3159y.i(topByCategory, "topByCategory");
            if (UptodownApp.f27990B.a0()) {
                FragmentActivity activity = T0.this.getActivity();
                AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                ((MainActivity) activity).R7(topByCategory.b());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f11504a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f11505b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ T0 f11506c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, T0 t02, P5.d dVar) {
            super(2, dVar);
            this.f11505b = str;
            this.f11506c = t02;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new e(this.f11505b, this.f11506c, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C1100i c1100i;
            Q5.b.e();
            if (this.f11504a == 0) {
                L5.t.b(obj);
                String str = this.f11505b;
                if (str != null && str.length() != 0 && this.f11506c.f11491i != null && (c1100i = this.f11506c.f11484b) != null) {
                    String str2 = this.f11505b;
                    RecyclerView recyclerView = this.f11506c.f11491i;
                    AbstractC3159y.f(recyclerView);
                    c1100i.w(str2, recyclerView);
                }
                return L5.I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
    
        if (r0.isEmpty() == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p() {
        /*
            r7 = this;
            D4.i r0 = r7.f11484b
            if (r0 == 0) goto L14
            if (r0 == 0) goto Lb
            java.util.ArrayList r0 = r0.r()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 == 0) goto L14
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L33
        L14:
            D4.i r0 = new D4.i
            W4.s r1 = r7.f11493k
            U4.T0$b r2 = r7.f11494l
            android.content.Context r3 = r7.requireContext()
            java.lang.String r4 = "requireContext()"
            kotlin.jvm.internal.AbstractC3159y.h(r3, r4)
            java.lang.Class<U4.T0> r4 = U4.T0.class
            java.lang.String r4 = r4.getSimpleName()
            java.lang.String r5 = "this.javaClass.simpleName"
            kotlin.jvm.internal.AbstractC3159y.h(r4, r5)
            r0.<init>(r1, r2, r3, r4)
            r7.f11484b = r0
        L33:
            java.util.ArrayList r0 = r7.f11486d
            int r0 = r0.size()
            if (r0 <= 0) goto L5e
            java.util.ArrayList r0 = r7.f11485c
            int r0 = r0.size()
            if (r0 <= 0) goto L5e
            D4.i r1 = r7.f11484b
            if (r1 == 0) goto L54
            java.util.ArrayList r2 = r7.f11486d
            java.util.ArrayList r3 = r7.f11485c
            X4.N r4 = r7.f11487e
            X4.h r5 = r7.f11489g
            X4.N r6 = r7.f11488f
            r1.p(r2, r3, r4, r5, r6)
        L54:
            androidx.recyclerview.widget.RecyclerView r0 = r7.f11491i
            if (r0 != 0) goto L59
            goto L5e
        L59:
            D4.i r1 = r7.f11484b
            r0.setAdapter(r1)
        L5e:
            android.widget.RelativeLayout r0 = r7.f11490h
            if (r0 != 0) goto L63
            goto L68
        L63:
            r1 = 8
            r0.setVisibility(r1)
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: U4.T0.p():void");
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            C1501k c1501k = new C1501k(0, null, null, 7, null);
            this.f11483a = c1501k;
            AbstractC3159y.f(c1501k);
            c1501k.G(arguments);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC3159y.i(inflater, "inflater");
        if (this.f11492j == null) {
            View inflate = inflater.inflate(R.layout.parent_category_fragment, viewGroup, false);
            this.f11492j = inflate;
            AbstractC3159y.f(inflate);
            this.f11490h = (RelativeLayout) inflate.findViewById(R.id.loading_view_parent_category_fragment);
            View view = this.f11492j;
            AbstractC3159y.f(view);
            RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
            this.f11491i = recyclerView;
            if (recyclerView != null) {
                recyclerView.setItemAnimator(null);
            }
            RecyclerView recyclerView2 = this.f11491i;
            if (recyclerView2 != null) {
                recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
            }
            RecyclerView recyclerView3 = this.f11491i;
            if (recyclerView3 != null) {
                recyclerView3.addItemDecoration(new n5.q((int) getResources().getDimension(R.dimen.margin_m)));
            }
            RelativeLayout relativeLayout = this.f11490h;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
            }
        } else {
            RelativeLayout relativeLayout2 = this.f11490h;
            if (relativeLayout2 != null) {
                relativeLayout2.setVisibility(8);
            }
        }
        q();
        return this.f11492j;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        InterfaceC2541e o8 = UptodownApp.f27990B.o();
        if (o8 != null) {
            o8.pause();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        InterfaceC2541e o8;
        super.onResume();
        UptodownApp.a aVar = UptodownApp.f27990B;
        InterfaceC2541e n8 = aVar.n();
        if (n8 != null) {
            n8.pause();
        }
        if (getContext() != null) {
            Context requireContext = requireContext();
            AbstractC3159y.h(requireContext, "requireContext()");
            if (aVar.f(requireContext)) {
                SettingsPreferences.a aVar2 = SettingsPreferences.f29309b;
                Context requireContext2 = requireContext();
                AbstractC3159y.h(requireContext2, "requireContext()");
                if (aVar2.l(requireContext2) > 0 && (o8 = aVar.o()) != null) {
                    o8.play();
                }
            }
        }
    }

    public final void q() {
        Context requireContext = requireContext();
        AbstractC3159y.h(requireContext, "requireContext()");
        c cVar = this.f11495m;
        C1501k c1501k = this.f11483a;
        AbstractC3159y.f(c1501k);
        new S4.h(requireContext, cVar, c1501k, LifecycleOwnerKt.getLifecycleScope(this));
    }

    public final C1501k r() {
        return this.f11483a;
    }

    public final void s() {
        RecyclerView recyclerView = this.f11491i;
        if (recyclerView != null) {
            recyclerView.smoothScrollToPosition(0);
        }
    }

    public final void t(String str) {
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new e(str, this, null), 2, null);
    }

    /* loaded from: classes5.dex */
    public static final class b implements InterfaceC1478a {

        /* loaded from: classes5.dex */
        static final class a extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ T0 f11497a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C1498h f11498b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(T0 t02, C1498h c1498h) {
                super(0);
                this.f11497a = t02;
                this.f11498b = c1498h;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m77invoke();
                return L5.I.f6474a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m77invoke() {
                this.f11497a.t(this.f11498b.y0());
            }
        }

        b() {
        }

        @Override // W4.InterfaceC1478a
        public void a(C1498h appInfo, int i8) {
            AbstractC3159y.i(appInfo, "appInfo");
            if (T0.this.getActivity() instanceof MainActivity) {
                FragmentActivity activity = T0.this.getActivity();
                AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                RelativeLayout H52 = ((MainActivity) activity).H5();
                if (H52 == null || H52.getVisibility() != 0) {
                    FragmentActivity activity2 = T0.this.getActivity();
                    AbstractC3159y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                    ((MainActivity) activity2).a7(appInfo, new a(T0.this, appInfo));
                    Context requireContext = T0.this.requireContext();
                    AbstractC3159y.h(requireContext, "requireContext()");
                    new S4.i(requireContext, appInfo.i(), new C0228b(T0.this), LifecycleOwnerKt.getLifecycleScope(T0.this));
                }
            }
        }

        /* renamed from: U4.T0$b$b, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0228b implements W4.r {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ T0 f11499a;

            /* renamed from: U4.T0$b$b$a */
            /* loaded from: classes5.dex */
            static final class a extends AbstractC3160z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ T0 f11500a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C1498h f11501b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(T0 t02, C1498h c1498h) {
                    super(0);
                    this.f11500a = t02;
                    this.f11501b = c1498h;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m78invoke();
                    return L5.I.f6474a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m78invoke() {
                    this.f11500a.t(this.f11501b.y0());
                }
            }

            C0228b(T0 t02) {
                this.f11499a = t02;
            }

            @Override // W4.r
            public void f(C1498h appInfo) {
                AbstractC3159y.i(appInfo, "appInfo");
                FragmentActivity activity = this.f11499a.getActivity();
                AbstractC3159y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
                ((MainActivity) activity).a7(appInfo, new a(this.f11499a, appInfo));
            }

            @Override // W4.r
            public void c(int i8) {
            }
        }
    }
}
