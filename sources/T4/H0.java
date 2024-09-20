package T4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* loaded from: classes4.dex */
public final class H0 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f10113a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f10114b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f10115c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayout f10116d;

    /* renamed from: e, reason: collision with root package name */
    public final ProgressBar f10117e;

    /* renamed from: f, reason: collision with root package name */
    public final RelativeLayout f10118f;

    /* renamed from: g, reason: collision with root package name */
    public final RelativeLayout f10119g;

    /* renamed from: h, reason: collision with root package name */
    public final RelativeLayout f10120h;

    /* renamed from: i, reason: collision with root package name */
    public final RelativeLayout f10121i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f10122j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f10123k;

    /* renamed from: l, reason: collision with root package name */
    public final TextView f10124l;

    /* renamed from: m, reason: collision with root package name */
    public final TextView f10125m;

    /* renamed from: n, reason: collision with root package name */
    public final TextView f10126n;

    private H0(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, ProgressBar progressBar, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, RelativeLayout relativeLayout5, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.f10113a = relativeLayout;
        this.f10114b = imageView;
        this.f10115c = imageView2;
        this.f10116d = linearLayout;
        this.f10117e = progressBar;
        this.f10118f = relativeLayout2;
        this.f10119g = relativeLayout3;
        this.f10120h = relativeLayout4;
        this.f10121i = relativeLayout5;
        this.f10122j = textView;
        this.f10123k = textView2;
        this.f10124l = textView3;
        this.f10125m = textView4;
        this.f10126n = textView5;
    }

    public static H0 a(View view) {
        int i8 = R.id.iv_cancel_wishlist_item;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_cancel_wishlist_item);
        if (imageView != null) {
            i8 = R.id.iv_icon_wishlist_item;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_icon_wishlist_item);
            if (imageView2 != null) {
                i8 = R.id.ll_info_wishlist_item;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_info_wishlist_item);
                if (linearLayout != null) {
                    i8 = R.id.pb_progress_wishlist_item;
                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.pb_progress_wishlist_item);
                    if (progressBar != null) {
                        i8 = R.id.rl_actions_wishlist_item;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_actions_wishlist_item);
                        if (relativeLayout != null) {
                            i8 = R.id.rl_cancel_wishlist_item;
                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_cancel_wishlist_item);
                            if (relativeLayout2 != null) {
                                i8 = R.id.rl_container_wishlist_item;
                                RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_container_wishlist_item);
                                if (relativeLayout3 != null) {
                                    i8 = R.id.rl_icon_progress_wishlist_item;
                                    RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_icon_progress_wishlist_item);
                                    if (relativeLayout4 != null) {
                                        i8 = R.id.tv_action_wishlist_item;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_action_wishlist_item);
                                        if (textView != null) {
                                            i8 = R.id.tv_name_wishlist_item;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_name_wishlist_item);
                                            if (textView2 != null) {
                                                i8 = R.id.tv_pending_wishlist_item;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_pending_wishlist_item);
                                                if (textView3 != null) {
                                                    i8 = R.id.tv_status_wishlist_item;
                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_status_wishlist_item);
                                                    if (textView4 != null) {
                                                        i8 = R.id.tv_version_wishlist_item;
                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_version_wishlist_item);
                                                        if (textView5 != null) {
                                                            return new H0((RelativeLayout) view, imageView, imageView2, linearLayout, progressBar, relativeLayout, relativeLayout2, relativeLayout3, relativeLayout4, textView, textView2, textView3, textView4, textView5);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static H0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.wishlist_item, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f10113a;
    }
}
