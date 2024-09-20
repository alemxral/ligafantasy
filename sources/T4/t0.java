package T4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* loaded from: classes4.dex */
public final class t0 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f10884a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f10885b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f10886c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f10887d;

    /* renamed from: e, reason: collision with root package name */
    public final LinearLayout f10888e;

    /* renamed from: f, reason: collision with root package name */
    public final NestedScrollView f10889f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f10890g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f10891h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f10892i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f10893j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f10894k;

    /* renamed from: l, reason: collision with root package name */
    public final TextView f10895l;

    /* renamed from: m, reason: collision with root package name */
    public final TextView f10896m;

    /* renamed from: n, reason: collision with root package name */
    public final TextView f10897n;

    /* renamed from: o, reason: collision with root package name */
    public final TextView f10898o;

    private t0(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, LinearLayout linearLayout, NestedScrollView nestedScrollView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9) {
        this.f10884a = relativeLayout;
        this.f10885b = imageView;
        this.f10886c = imageView2;
        this.f10887d = imageView3;
        this.f10888e = linearLayout;
        this.f10889f = nestedScrollView;
        this.f10890g = textView;
        this.f10891h = textView2;
        this.f10892i = textView3;
        this.f10893j = textView4;
        this.f10894k = textView5;
        this.f10895l = textView6;
        this.f10896m = textView7;
        this.f10897n = textView8;
        this.f10898o = textView9;
    }

    public static t0 a(View view) {
        int i8 = R.id.iv_customization_turbo_welcome_popup;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_customization_turbo_welcome_popup);
        if (imageView != null) {
            i8 = R.id.iv_highlighted_comments_turbo_welcome_popup;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_highlighted_comments_turbo_welcome_popup);
            if (imageView2 != null) {
                i8 = R.id.iv_no_ads_turbo_welcome_popup;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_no_ads_turbo_welcome_popup);
                if (imageView3 != null) {
                    i8 = R.id.ll_content_turbo;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_content_turbo);
                    if (linearLayout != null) {
                        i8 = R.id.nsv_turbo_welcome_popup;
                        NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, R.id.nsv_turbo_welcome_popup);
                        if (nestedScrollView != null) {
                            i8 = R.id.tv_customization_desc_turbo_welcome_popup;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_customization_desc_turbo_welcome_popup);
                            if (textView != null) {
                                i8 = R.id.tv_customization_turbo_welcome_popup;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_customization_turbo_welcome_popup);
                                if (textView2 != null) {
                                    i8 = R.id.tv_desc_turbo_welcome_popup;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_desc_turbo_welcome_popup);
                                    if (textView3 != null) {
                                        i8 = R.id.tv_highlighted_comments_desc_turbo_welcome_popup;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_highlighted_comments_desc_turbo_welcome_popup);
                                        if (textView4 != null) {
                                            i8 = R.id.tv_highlighted_comments_turbo_welcome_popup;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_highlighted_comments_turbo_welcome_popup);
                                            if (textView5 != null) {
                                                i8 = R.id.tv_no_ads_desc_turbo_welcome_popup;
                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_no_ads_desc_turbo_welcome_popup);
                                                if (textView6 != null) {
                                                    i8 = R.id.tv_no_ads_turbo_welcome_popup;
                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_no_ads_turbo_welcome_popup);
                                                    if (textView7 != null) {
                                                        i8 = R.id.tv_start_turbo_welcome_popup;
                                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_start_turbo_welcome_popup);
                                                        if (textView8 != null) {
                                                            i8 = R.id.tv_title_turbo_welcome_popup;
                                                            TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title_turbo_welcome_popup);
                                                            if (textView9 != null) {
                                                                return new t0((RelativeLayout) view, imageView, imageView2, imageView3, linearLayout, nestedScrollView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9);
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

    public static t0 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static t0 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.uptodown_turbo_welcome_popup, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f10884a;
    }
}
