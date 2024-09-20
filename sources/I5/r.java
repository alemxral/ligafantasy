package i5;

import X4.C1501k;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.leanback.app.BackgroundManager;
import androidx.leanback.app.BrowseSupportFragment;
import androidx.leanback.widget.ArrayObjectAdapter;
import androidx.leanback.widget.ListRowPresenter;
import androidx.leanback.widget.PageRow;
import androidx.leanback.widget.Presenter;
import androidx.leanback.widget.PresenterSelector;
import androidx.leanback.widget.Row;
import com.uptodown.R;
import com.uptodown.tv.ui.activity.TvSearchActivity;
import e5.C2640a;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class r extends BrowseSupportFragment {

    /* renamed from: c, reason: collision with root package name */
    public static final a f31639c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    private static C2798p f31640d;

    /* renamed from: e, reason: collision with root package name */
    private static C2796n f31641e;

    /* renamed from: f, reason: collision with root package name */
    private static T f31642f;

    /* renamed from: a, reason: collision with root package name */
    private BackgroundManager f31643a;

    /* renamed from: b, reason: collision with root package name */
    private ArrayObjectAdapter f31644b;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    private static final class b extends BrowseSupportFragment.FragmentFactory {
        @Override // androidx.leanback.app.BrowseSupportFragment.FragmentFactory
        public Fragment createFragment(Object obj) {
            AbstractC3159y.g(obj, "null cannot be cast to non-null type androidx.leanback.widget.Row");
            long id = ((Row) obj).getHeaderItem().getId();
            if (id == 1) {
                if (r.f31640d == null) {
                    r.f31640d = new C2798p();
                }
                return r.f31640d;
            }
            if (id == 2) {
                if (r.f31641e == null) {
                    r.f31641e = new C2796n();
                }
                return r.f31641e;
            }
            if (id == 3) {
                if (r.f31642f == null) {
                    r.f31642f = T.f31598f.a(new C1501k(-1, "Top", null, 4, null));
                }
                return r.f31642f;
            }
            if (id == 4) {
                return new C2801t();
            }
            return null;
        }
    }

    /* loaded from: classes5.dex */
    public static final class c extends PresenterSelector {
        c() {
        }

        @Override // androidx.leanback.widget.PresenterSelector
        public Presenter getPresenter(Object o8) {
            AbstractC3159y.i(o8, "o");
            return new g5.j();
        }
    }

    private final void o() {
        PageRow pageRow = new PageRow(new C2640a(1L, "Home", R.drawable.vector_tv_header_home));
        ArrayObjectAdapter arrayObjectAdapter = this.f31644b;
        AbstractC3159y.f(arrayObjectAdapter);
        arrayObjectAdapter.add(pageRow);
        PageRow pageRow2 = new PageRow(new C2640a(2L, "Games", R.drawable.vector_tv_header_games));
        ArrayObjectAdapter arrayObjectAdapter2 = this.f31644b;
        AbstractC3159y.f(arrayObjectAdapter2);
        arrayObjectAdapter2.add(pageRow2);
        PageRow pageRow3 = new PageRow(new C2640a(3L, "Top", R.drawable.vector_tv_header_top));
        ArrayObjectAdapter arrayObjectAdapter3 = this.f31644b;
        AbstractC3159y.f(arrayObjectAdapter3);
        arrayObjectAdapter3.add(pageRow3);
        PageRow pageRow4 = new PageRow(new C2640a(4L, "Management", R.drawable.vector_tv_header_management));
        ArrayObjectAdapter arrayObjectAdapter4 = this.f31644b;
        AbstractC3159y.f(arrayObjectAdapter4);
        arrayObjectAdapter4.add(pageRow4);
    }

    private final void p() {
        ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(new ListRowPresenter());
        this.f31644b = arrayObjectAdapter;
        setAdapter(arrayObjectAdapter);
        o();
        startEntranceTransition();
    }

    private final void q() {
        setHeadersState(1);
        setHeaderPresenterSelector(new c());
        setBadgeDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.vector_uptodown_app_store_white));
        setHeadersTransitionOnBackEnabled(true);
        setBrandColor(ContextCompat.getColor(requireContext(), R.color.tv_background_gradient_end));
        setSearchAffordanceColor(ContextCompat.getColor(requireContext(), R.color.transparent));
        setOnSearchClickedListener(new View.OnClickListener() { // from class: i5.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r.r(r.this, view);
            }
        });
        prepareEntranceTransition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(r this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.startActivity(new Intent(this$0.getActivity(), (Class<?>) TvSearchActivity.class));
    }

    @Override // androidx.leanback.app.BrowseSupportFragment, androidx.leanback.app.BaseSupportFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        q();
        p();
        BackgroundManager backgroundManager = BackgroundManager.getInstance(getActivity());
        this.f31643a = backgroundManager;
        if (backgroundManager != null) {
            backgroundManager.attach(requireActivity().getWindow());
        }
        getMainFragmentRegistry().registerFragment(PageRow.class, new b());
    }
}
