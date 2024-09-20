package T4;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* renamed from: T4.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1367e implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f10494a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f10495b;

    /* renamed from: c, reason: collision with root package name */
    public final LinearLayout f10496c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayout f10497d;

    /* renamed from: e, reason: collision with root package name */
    public final LinearLayout f10498e;

    /* renamed from: f, reason: collision with root package name */
    public final LinearLayout f10499f;

    /* renamed from: g, reason: collision with root package name */
    public final LinearLayout f10500g;

    /* renamed from: h, reason: collision with root package name */
    public final ProgressBar f10501h;

    /* renamed from: i, reason: collision with root package name */
    public final RelativeLayout f10502i;

    /* renamed from: j, reason: collision with root package name */
    public final RelativeLayout f10503j;

    /* renamed from: k, reason: collision with root package name */
    public final RelativeLayout f10504k;

    /* renamed from: l, reason: collision with root package name */
    public final TextView f10505l;

    /* renamed from: m, reason: collision with root package name */
    public final TextView f10506m;

    /* renamed from: n, reason: collision with root package name */
    public final TextView f10507n;

    /* renamed from: o, reason: collision with root package name */
    public final TextView f10508o;

    /* renamed from: p, reason: collision with root package name */
    public final TextView f10509p;

    /* renamed from: q, reason: collision with root package name */
    public final TextView f10510q;

    /* renamed from: r, reason: collision with root package name */
    public final TextView f10511r;

    /* renamed from: s, reason: collision with root package name */
    public final TextView f10512s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f10513t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f10514u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f10515v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f10516w;

    /* renamed from: x, reason: collision with root package name */
    public final TextView f10517x;

    /* renamed from: y, reason: collision with root package name */
    public final TextView f10518y;

    /* renamed from: z, reason: collision with root package name */
    public final View f10519z;

    private C1367e(RelativeLayout relativeLayout, ImageView imageView, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, ProgressBar progressBar, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, View view) {
        this.f10494a = relativeLayout;
        this.f10495b = imageView;
        this.f10496c = linearLayout;
        this.f10497d = linearLayout2;
        this.f10498e = linearLayout3;
        this.f10499f = linearLayout4;
        this.f10500g = linearLayout5;
        this.f10501h = progressBar;
        this.f10502i = relativeLayout2;
        this.f10503j = relativeLayout3;
        this.f10504k = relativeLayout4;
        this.f10505l = textView;
        this.f10506m = textView2;
        this.f10507n = textView3;
        this.f10508o = textView4;
        this.f10509p = textView5;
        this.f10510q = textView6;
        this.f10511r = textView7;
        this.f10512s = textView8;
        this.f10513t = textView9;
        this.f10514u = textView10;
        this.f10515v = textView11;
        this.f10516w = textView12;
        this.f10517x = textView13;
        this.f10518y = textView14;
        this.f10519z = view;
    }

    public static C1367e a(View view) {
        int i8 = R.id.iv_logo_app_detail;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_logo_app_detail);
        if (imageView != null) {
            i8 = R.id.ll_download_info_app_detail;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_download_info_app_detail);
            if (linearLayout != null) {
                i8 = R.id.ll_downloads_counter_app_detail;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_downloads_counter_app_detail);
                if (linearLayout2 != null) {
                    i8 = R.id.ll_info_app_detail;
                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_info_app_detail);
                    if (linearLayout3 != null) {
                        i8 = R.id.ll_last_update_app_detail;
                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_last_update_app_detail);
                        if (linearLayout4 != null) {
                            i8 = R.id.ll_valoration_app_detail;
                            LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_valoration_app_detail);
                            if (linearLayout5 != null) {
                                i8 = R.id.pb_progress_app_detail;
                                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.pb_progress_app_detail);
                                if (progressBar != null) {
                                    i8 = R.id.rl_head_main_info;
                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_head_main_info);
                                    if (relativeLayout != null) {
                                        i8 = R.id.rl_logo_app_detail;
                                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_logo_app_detail);
                                        if (relativeLayout2 != null) {
                                            i8 = R.id.rl_valoration_app_detail;
                                            RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_valoration_app_detail);
                                            if (relativeLayout3 != null) {
                                                i8 = R.id.tv_author_app_detail;
                                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_author_app_detail);
                                                if (textView != null) {
                                                    i8 = R.id.tv_author_onboard_badge;
                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_author_onboard_badge);
                                                    if (textView2 != null) {
                                                        i8 = R.id.tv_downloads_counter_app_detail;
                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_downloads_counter_app_detail);
                                                        if (textView3 != null) {
                                                            i8 = R.id.tv_downloads_label_app_detail;
                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_downloads_label_app_detail);
                                                            if (textView4 != null) {
                                                                i8 = R.id.tv_iaps_badge_app_detail;
                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_iaps_badge_app_detail);
                                                                if (textView5 != null) {
                                                                    i8 = R.id.tv_last_update_app_detail;
                                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_last_update_app_detail);
                                                                    if (textView6 != null) {
                                                                        i8 = R.id.tv_last_update_label_app_detail;
                                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_last_update_label_app_detail);
                                                                        if (textView7 != null) {
                                                                            i8 = R.id.tv_name_app_detail;
                                                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_name_app_detail);
                                                                            if (textView8 != null) {
                                                                                i8 = R.id.tv_phase_app_detail;
                                                                                TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_phase_app_detail);
                                                                                if (textView9 != null) {
                                                                                    i8 = R.id.tv_progress_app_detail;
                                                                                    TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_progress_app_detail);
                                                                                    if (textView10 != null) {
                                                                                        i8 = R.id.tv_reviews_counter_app_detail;
                                                                                        TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_reviews_counter_app_detail);
                                                                                        if (textView11 != null) {
                                                                                            i8 = R.id.tv_valoration_app_detail;
                                                                                            TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_valoration_app_detail);
                                                                                            if (textView12 != null) {
                                                                                                i8 = R.id.tv_verified_app_detail;
                                                                                                TextView textView13 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_verified_app_detail);
                                                                                                if (textView13 != null) {
                                                                                                    i8 = R.id.tv_version_app_detail;
                                                                                                    TextView textView14 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_version_app_detail);
                                                                                                    if (textView14 != null) {
                                                                                                        i8 = R.id.v_separator_downloads_app_detail;
                                                                                                        View findChildViewById = ViewBindings.findChildViewById(view, R.id.v_separator_downloads_app_detail);
                                                                                                        if (findChildViewById != null) {
                                                                                                            return new C1367e((RelativeLayout) view, imageView, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, progressBar, relativeLayout, relativeLayout2, relativeLayout3, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, findChildViewById);
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
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f10494a;
    }
}
