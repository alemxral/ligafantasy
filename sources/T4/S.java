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
public final class S implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f10305a;

    /* renamed from: b, reason: collision with root package name */
    public final K f10306b;

    /* renamed from: c, reason: collision with root package name */
    public final RecyclerView f10307c;

    /* renamed from: d, reason: collision with root package name */
    public final Toolbar f10308d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f10309e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f10310f;

    private S(RelativeLayout relativeLayout, K k8, RecyclerView recyclerView, Toolbar toolbar, TextView textView, TextView textView2) {
        this.f10305a = relativeLayout;
        this.f10306b = k8;
        this.f10307c = recyclerView;
        this.f10308d = toolbar;
        this.f10309e = textView;
        this.f10310f = textView2;
    }

    public static S a(View view) {
        int i8 = R.id.loading_view_notification_registry;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.loading_view_notification_registry);
        if (findChildViewById != null) {
            K a8 = K.a(findChildViewById);
            i8 = R.id.rv_notifications_registry;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_notifications_registry);
            if (recyclerView != null) {
                i8 = R.id.toolbar_notifications_registry;
                Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, R.id.toolbar_notifications_registry);
                if (toolbar != null) {
                    i8 = R.id.tv_no_data_notifications_registry;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_no_data_notifications_registry);
                    if (textView != null) {
                        i8 = R.id.tv_title_notifications_registry;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title_notifications_registry);
                        if (textView2 != null) {
                            return new S((RelativeLayout) view, a8, recyclerView, toolbar, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static S c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static S d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.notifications_registry_activity, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f10305a;
    }
}
