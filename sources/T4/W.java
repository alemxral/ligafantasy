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
import com.uptodown.views.FullWidthImageView;

/* loaded from: classes4.dex */
public final class W implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f10338a;

    /* renamed from: b, reason: collision with root package name */
    public final FullWidthImageView f10339b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f10340c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayout f10341d;

    /* renamed from: e, reason: collision with root package name */
    public final LinearLayout f10342e;

    /* renamed from: f, reason: collision with root package name */
    public final ProgressBar f10343f;

    /* renamed from: g, reason: collision with root package name */
    public final RelativeLayout f10344g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f10345h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f10346i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f10347j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f10348k;

    /* renamed from: l, reason: collision with root package name */
    public final TextView f10349l;

    /* renamed from: m, reason: collision with root package name */
    public final TextView f10350m;

    /* renamed from: n, reason: collision with root package name */
    public final TextView f10351n;

    /* renamed from: o, reason: collision with root package name */
    public final TextView f10352o;

    /* renamed from: p, reason: collision with root package name */
    public final TextView f10353p;

    private W(RelativeLayout relativeLayout, FullWidthImageView fullWidthImageView, ImageView imageView, LinearLayout linearLayout, LinearLayout linearLayout2, ProgressBar progressBar, RelativeLayout relativeLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9) {
        this.f10338a = relativeLayout;
        this.f10339b = fullWidthImageView;
        this.f10340c = imageView;
        this.f10341d = linearLayout;
        this.f10342e = linearLayout2;
        this.f10343f = progressBar;
        this.f10344g = relativeLayout2;
        this.f10345h = textView;
        this.f10346i = textView2;
        this.f10347j = textView3;
        this.f10348k = textView4;
        this.f10349l = textView5;
        this.f10350m = textView6;
        this.f10351n = textView7;
        this.f10352o = textView8;
        this.f10353p = textView9;
    }

    public static W a(View view) {
        int i8 = R.id.iv_top_app_feature_organization;
        FullWidthImageView fullWidthImageView = (FullWidthImageView) ViewBindings.findChildViewById(view, R.id.iv_top_app_feature_organization);
        if (fullWidthImageView != null) {
            i8 = R.id.iv_top_app_logo_organization;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_top_app_logo_organization);
            if (imageView != null) {
                i8 = R.id.ll_progress_top_organization;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_progress_top_organization);
                if (linearLayout != null) {
                    i8 = R.id.ll_top_app_desc_organization;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_top_app_desc_organization);
                    if (linearLayout2 != null) {
                        i8 = R.id.pb_progress_logo_organization;
                        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.pb_progress_logo_organization);
                        if (progressBar != null) {
                            i8 = R.id.rl_logo_organization;
                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_logo_organization);
                            if (relativeLayout != null) {
                                i8 = R.id.tv_progress_top_organization;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_progress_top_organization);
                                if (textView != null) {
                                    i8 = R.id.tv_top_app_desc_organization;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_top_app_desc_organization);
                                    if (textView2 != null) {
                                        i8 = R.id.tv_top_app_download_organization;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_top_app_download_organization);
                                        if (textView3 != null) {
                                            i8 = R.id.tv_top_app_downloads_counter_organization;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_top_app_downloads_counter_organization);
                                            if (textView4 != null) {
                                                i8 = R.id.tv_top_app_name_organization;
                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_top_app_name_organization);
                                                if (textView5 != null) {
                                                    i8 = R.id.tv_top_app_status_organization;
                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_top_app_status_organization);
                                                    if (textView6 != null) {
                                                        i8 = R.id.tv_top_app_title_organization;
                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_top_app_title_organization);
                                                        if (textView7 != null) {
                                                            i8 = R.id.tv_top_app_valoration_organization;
                                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_top_app_valoration_organization);
                                                            if (textView8 != null) {
                                                                i8 = R.id.tv_verified_top_organization;
                                                                TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_verified_top_organization);
                                                                if (textView9 != null) {
                                                                    return new W((RelativeLayout) view, fullWidthImageView, imageView, linearLayout, linearLayout2, progressBar, relativeLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static W c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.organization_main_app_card, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f10338a;
    }
}
