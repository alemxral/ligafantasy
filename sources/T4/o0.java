package T4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* loaded from: classes4.dex */
public final class o0 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f10772a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f10773b;

    /* renamed from: c, reason: collision with root package name */
    public final LinearLayout f10774c;

    /* renamed from: d, reason: collision with root package name */
    public final RelativeLayout f10775d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f10776e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f10777f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f10778g;

    private o0(RelativeLayout relativeLayout, ImageView imageView, LinearLayout linearLayout, RelativeLayout relativeLayout2, TextView textView, TextView textView2, TextView textView3) {
        this.f10772a = relativeLayout;
        this.f10773b = imageView;
        this.f10774c = linearLayout;
        this.f10775d = relativeLayout2;
        this.f10776e = textView;
        this.f10777f = textView2;
        this.f10778g = textView3;
    }

    public static o0 a(View view) {
        int i8 = R.id.iv_icon_upcoming_release_item;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_icon_upcoming_release_item);
        if (imageView != null) {
            i8 = R.id.ll_upcoming_release;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_upcoming_release);
            if (linearLayout != null) {
                i8 = R.id.rl_container_upcoming_release_item;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_container_upcoming_release_item);
                if (relativeLayout != null) {
                    i8 = R.id.tv_action_upcoming_release_item;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_action_upcoming_release_item);
                    if (textView != null) {
                        i8 = R.id.tv_name_upcoming_release_item;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_name_upcoming_release_item);
                        if (textView2 != null) {
                            i8 = R.id.tv_release_date_upcoming_release_item;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_release_date_upcoming_release_item);
                            if (textView3 != null) {
                                return new o0((RelativeLayout) view, imageView, linearLayout, relativeLayout, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static o0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.upcoming_release_item, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f10772a;
    }
}
