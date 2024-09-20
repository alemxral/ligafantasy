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
import com.uptodown.util.views.UsernameTextView;

/* renamed from: T4.e0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1368e0 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f10520a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f10521b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f10522c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f10523d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f10524e;

    /* renamed from: f, reason: collision with root package name */
    public final ImageView f10525f;

    /* renamed from: g, reason: collision with root package name */
    public final ImageView f10526g;

    /* renamed from: h, reason: collision with root package name */
    public final ImageView f10527h;

    /* renamed from: i, reason: collision with root package name */
    public final ImageView f10528i;

    /* renamed from: j, reason: collision with root package name */
    public final ImageView f10529j;

    /* renamed from: k, reason: collision with root package name */
    public final LinearLayout f10530k;

    /* renamed from: l, reason: collision with root package name */
    public final LinearLayout f10531l;

    /* renamed from: m, reason: collision with root package name */
    public final LinearLayout f10532m;

    /* renamed from: n, reason: collision with root package name */
    public final TextView f10533n;

    /* renamed from: o, reason: collision with root package name */
    public final TextView f10534o;

    /* renamed from: p, reason: collision with root package name */
    public final TextView f10535p;

    /* renamed from: q, reason: collision with root package name */
    public final TextView f10536q;

    /* renamed from: r, reason: collision with root package name */
    public final TextView f10537r;

    /* renamed from: s, reason: collision with root package name */
    public final TextView f10538s;

    /* renamed from: t, reason: collision with root package name */
    public final UsernameTextView f10539t;

    private C1368e0(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7, ImageView imageView8, ImageView imageView9, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, UsernameTextView usernameTextView) {
        this.f10520a = relativeLayout;
        this.f10521b = imageView;
        this.f10522c = imageView2;
        this.f10523d = imageView3;
        this.f10524e = imageView4;
        this.f10525f = imageView5;
        this.f10526g = imageView6;
        this.f10527h = imageView7;
        this.f10528i = imageView8;
        this.f10529j = imageView9;
        this.f10530k = linearLayout;
        this.f10531l = linearLayout2;
        this.f10532m = linearLayout3;
        this.f10533n = textView;
        this.f10534o = textView2;
        this.f10535p = textView3;
        this.f10536q = textView4;
        this.f10537r = textView5;
        this.f10538s = textView6;
        this.f10539t = usernameTextView;
    }

    public static C1368e0 a(View view) {
        int i8 = R.id.iv_author_verified_review;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_author_verified_review);
        if (imageView != null) {
            i8 = R.id.iv_avatar_review;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_avatar_review);
            if (imageView2 != null) {
                i8 = R.id.iv_likes_counter_review;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_likes_counter_review);
                if (imageView3 != null) {
                    i8 = R.id.iv_star1_review;
                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_star1_review);
                    if (imageView4 != null) {
                        i8 = R.id.iv_star2_review;
                        ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_star2_review);
                        if (imageView5 != null) {
                            i8 = R.id.iv_star3_review;
                            ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_star3_review);
                            if (imageView6 != null) {
                                i8 = R.id.iv_star4_review;
                                ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_star4_review);
                                if (imageView7 != null) {
                                    i8 = R.id.iv_star5_review;
                                    ImageView imageView8 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_star5_review);
                                    if (imageView8 != null) {
                                        i8 = R.id.iv_turbo_mark_review;
                                        ImageView imageView9 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_turbo_mark_review);
                                        if (imageView9 != null) {
                                            i8 = R.id.ll_likes_review;
                                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_likes_review);
                                            if (linearLayout != null) {
                                                i8 = R.id.ll_reviews_counter_review;
                                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_reviews_counter_review);
                                                if (linearLayout2 != null) {
                                                    i8 = R.id.ll_stars_review;
                                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_stars_review);
                                                    if (linearLayout3 != null) {
                                                        i8 = R.id.tv_body_review;
                                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_body_review);
                                                        if (textView != null) {
                                                            i8 = R.id.tv_date_review;
                                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_date_review);
                                                            if (textView2 != null) {
                                                                i8 = R.id.tv_likes_counter_review;
                                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_likes_counter_review);
                                                                if (textView3 != null) {
                                                                    i8 = R.id.tv_reply_review;
                                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_reply_review);
                                                                    if (textView4 != null) {
                                                                        i8 = R.id.tv_reviews_counter_review;
                                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_reviews_counter_review);
                                                                        if (textView5 != null) {
                                                                            i8 = R.id.tv_show_more_review;
                                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_show_more_review);
                                                                            if (textView6 != null) {
                                                                                i8 = R.id.tv_username_review;
                                                                                UsernameTextView usernameTextView = (UsernameTextView) ViewBindings.findChildViewById(view, R.id.tv_username_review);
                                                                                if (usernameTextView != null) {
                                                                                    return new C1368e0((RelativeLayout) view, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, linearLayout, linearLayout2, linearLayout3, textView, textView2, textView3, textView4, textView5, textView6, usernameTextView);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static C1368e0 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C1368e0 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.review_turbo, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f10520a;
    }
}
