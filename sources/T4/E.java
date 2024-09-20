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
public final class E implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f10076a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f10077b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f10078c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayout f10079d;

    /* renamed from: e, reason: collision with root package name */
    public final ProgressBar f10080e;

    /* renamed from: f, reason: collision with root package name */
    public final RelativeLayout f10081f;

    /* renamed from: g, reason: collision with root package name */
    public final RelativeLayout f10082g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f10083h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f10084i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f10085j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f10086k;

    /* renamed from: l, reason: collision with root package name */
    public final TextView f10087l;

    /* renamed from: m, reason: collision with root package name */
    public final TextView f10088m;

    /* renamed from: n, reason: collision with root package name */
    public final TextView f10089n;

    private E(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, ProgressBar progressBar, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
        this.f10076a = relativeLayout;
        this.f10077b = imageView;
        this.f10078c = imageView2;
        this.f10079d = linearLayout;
        this.f10080e = progressBar;
        this.f10081f = relativeLayout2;
        this.f10082g = relativeLayout3;
        this.f10083h = textView;
        this.f10084i = textView2;
        this.f10085j = textView3;
        this.f10086k = textView4;
        this.f10087l = textView5;
        this.f10088m = textView6;
        this.f10089n = textView7;
    }

    public static E a(View view) {
        int i8 = R.id.iv_home_card_featured_item;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_home_card_featured_item);
        if (imageView != null) {
            i8 = R.id.iv_logo_home_card_featured_item;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_logo_home_card_featured_item);
            if (imageView2 != null) {
                i8 = R.id.ll_progress_home_card_featured_item;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_progress_home_card_featured_item);
                if (linearLayout != null) {
                    i8 = R.id.pb_progress_home_card_featured_item;
                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.pb_progress_home_card_featured_item);
                    if (progressBar != null) {
                        RelativeLayout relativeLayout = (RelativeLayout) view;
                        i8 = R.id.rl_logo_home_card_featured_item;
                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_logo_home_card_featured_item);
                        if (relativeLayout2 != null) {
                            i8 = R.id.tv_desc_home_card_featured_item;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_desc_home_card_featured_item);
                            if (textView != null) {
                                i8 = R.id.tv_desc_home_card_featured_item_holder;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_desc_home_card_featured_item_holder);
                                if (textView2 != null) {
                                    i8 = R.id.tv_name_home_card_featured_item;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_name_home_card_featured_item);
                                    if (textView3 != null) {
                                        i8 = R.id.tv_name_home_card_featured_item_holder;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_name_home_card_featured_item_holder);
                                        if (textView4 != null) {
                                            i8 = R.id.tv_progress_home_card_featured_item;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_progress_home_card_featured_item);
                                            if (textView5 != null) {
                                                i8 = R.id.tv_status_home_card_featured_item;
                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_status_home_card_featured_item);
                                                if (textView6 != null) {
                                                    i8 = R.id.tv_verified_home_card_featured_item;
                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_verified_home_card_featured_item);
                                                    if (textView7 != null) {
                                                        return new E(relativeLayout, imageView, imageView2, linearLayout, progressBar, relativeLayout, relativeLayout2, textView, textView2, textView3, textView4, textView5, textView6, textView7);
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

    public static E c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.home_card_featured_item, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f10076a;
    }
}
