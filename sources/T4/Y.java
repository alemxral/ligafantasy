package T4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* loaded from: classes4.dex */
public final class Y implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f10356a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f10357b;

    /* renamed from: c, reason: collision with root package name */
    public final RelativeLayout f10358c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f10359d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f10360e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f10361f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f10362g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f10363h;

    private Y(RelativeLayout relativeLayout, ImageView imageView, RelativeLayout relativeLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.f10356a = relativeLayout;
        this.f10357b = imageView;
        this.f10358c = relativeLayout2;
        this.f10359d = textView;
        this.f10360e = textView2;
        this.f10361f = textView3;
        this.f10362g = textView4;
        this.f10363h = textView5;
    }

    public static Y a(View view) {
        int i8 = R.id.iv_top_app_logo_organization;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_top_app_logo_organization);
        if (imageView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            i8 = R.id.tv_top_app_desc_organization;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_top_app_desc_organization);
            if (textView != null) {
                i8 = R.id.tv_top_app_downloads_counter_organization;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_top_app_downloads_counter_organization);
                if (textView2 != null) {
                    i8 = R.id.tv_top_app_name_organization;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_top_app_name_organization);
                    if (textView3 != null) {
                        i8 = R.id.tv_top_app_status_organization;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_top_app_status_organization);
                        if (textView4 != null) {
                            i8 = R.id.tv_top_app_valoration_organization;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_top_app_valoration_organization);
                            if (textView5 != null) {
                                return new Y(relativeLayout, imageView, relativeLayout, textView, textView2, textView3, textView4, textView5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static Y c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.organization_top_item_card, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f10356a;
    }
}
