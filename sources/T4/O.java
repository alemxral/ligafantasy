package T4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* loaded from: classes4.dex */
public final class O implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f10275a;

    /* renamed from: b, reason: collision with root package name */
    public final K f10276b;

    /* renamed from: c, reason: collision with root package name */
    public final RecyclerView f10277c;

    /* renamed from: d, reason: collision with root package name */
    public final Toolbar f10278d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f10279e;

    private O(RelativeLayout relativeLayout, K k8, RecyclerView recyclerView, Toolbar toolbar, TextView textView) {
        this.f10275a = relativeLayout;
        this.f10276b = k8;
        this.f10277c = recyclerView;
        this.f10278d = toolbar;
        this.f10279e = textView;
    }

    public static O a(View view) {
        int i8 = R.id.loading_view_my_apps;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.loading_view_my_apps);
        if (findChildViewById != null) {
            K a8 = K.a(findChildViewById);
            i8 = R.id.rv_my_apps;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_my_apps);
            if (recyclerView != null) {
                i8 = R.id.toolbar_my_apps;
                Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, R.id.toolbar_my_apps);
                if (toolbar != null) {
                    i8 = R.id.tv_toolbar_title_my_apps;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_toolbar_title_my_apps);
                    if (textView != null) {
                        return new O((RelativeLayout) view, a8, recyclerView, toolbar, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static O c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static O d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.my_apps, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f10275a;
    }
}
