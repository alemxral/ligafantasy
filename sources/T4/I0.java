package T4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* loaded from: classes4.dex */
public final class I0 implements ViewBinding {

    /* renamed from: A, reason: collision with root package name */
    public final TextView f10137A;

    /* renamed from: B, reason: collision with root package name */
    public final TextView f10138B;

    /* renamed from: C, reason: collision with root package name */
    public final TextView f10139C;

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f10140a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f10141b;

    /* renamed from: c, reason: collision with root package name */
    public final LinearLayout f10142c;

    /* renamed from: d, reason: collision with root package name */
    public final RelativeLayout f10143d;

    /* renamed from: e, reason: collision with root package name */
    public final RelativeLayout f10144e;

    /* renamed from: f, reason: collision with root package name */
    public final LinearLayout f10145f;

    /* renamed from: g, reason: collision with root package name */
    public final RelativeLayout f10146g;

    /* renamed from: h, reason: collision with root package name */
    public final RelativeLayout f10147h;

    /* renamed from: i, reason: collision with root package name */
    public final RelativeLayout f10148i;

    /* renamed from: j, reason: collision with root package name */
    public final RelativeLayout f10149j;

    /* renamed from: k, reason: collision with root package name */
    public final SwitchCompat f10150k;

    /* renamed from: l, reason: collision with root package name */
    public final SwitchCompat f10151l;

    /* renamed from: m, reason: collision with root package name */
    public final SwitchCompat f10152m;

    /* renamed from: n, reason: collision with root package name */
    public final TextView f10153n;

    /* renamed from: o, reason: collision with root package name */
    public final TextView f10154o;

    /* renamed from: p, reason: collision with root package name */
    public final TextView f10155p;

    /* renamed from: q, reason: collision with root package name */
    public final TextView f10156q;

    /* renamed from: r, reason: collision with root package name */
    public final TextView f10157r;

    /* renamed from: s, reason: collision with root package name */
    public final TextView f10158s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f10159t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f10160u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f10161v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f10162w;

    /* renamed from: x, reason: collision with root package name */
    public final TextView f10163x;

    /* renamed from: y, reason: collision with root package name */
    public final TextView f10164y;

    /* renamed from: z, reason: collision with root package name */
    public final TextView f10165z;

    private I0(RelativeLayout relativeLayout, ImageView imageView, LinearLayout linearLayout, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, LinearLayout linearLayout2, RelativeLayout relativeLayout4, RelativeLayout relativeLayout5, RelativeLayout relativeLayout6, RelativeLayout relativeLayout7, SwitchCompat switchCompat, SwitchCompat switchCompat2, SwitchCompat switchCompat3, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, TextView textView16) {
        this.f10140a = relativeLayout;
        this.f10141b = imageView;
        this.f10142c = linearLayout;
        this.f10143d = relativeLayout2;
        this.f10144e = relativeLayout3;
        this.f10145f = linearLayout2;
        this.f10146g = relativeLayout4;
        this.f10147h = relativeLayout5;
        this.f10148i = relativeLayout6;
        this.f10149j = relativeLayout7;
        this.f10150k = switchCompat;
        this.f10151l = switchCompat2;
        this.f10152m = switchCompat3;
        this.f10153n = textView;
        this.f10154o = textView2;
        this.f10155p = textView3;
        this.f10156q = textView4;
        this.f10157r = textView5;
        this.f10158s = textView6;
        this.f10159t = textView7;
        this.f10160u = textView8;
        this.f10161v = textView9;
        this.f10162w = textView10;
        this.f10163x = textView11;
        this.f10164y = textView12;
        this.f10165z = textView13;
        this.f10137A = textView14;
        this.f10138B = textView15;
        this.f10139C = textView16;
    }

    public static I0 a(View view) {
        int i8 = R.id.iv_logo_wizard_privacy;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_logo_wizard_privacy);
        if (imageView != null) {
            i8 = R.id.ll_buttons_bottom_gdpr;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_buttons_bottom_gdpr);
            if (linearLayout != null) {
                i8 = R.id.rl_ads_wizard_privacy;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_ads_wizard_privacy);
                if (relativeLayout != null) {
                    i8 = R.id.rl_analytics_wizard_privacy;
                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_analytics_wizard_privacy);
                    if (relativeLayout2 != null) {
                        i8 = R.id.rl_content_wizard_privacy;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.rl_content_wizard_privacy);
                        if (linearLayout2 != null) {
                            i8 = R.id.rl_device_analysis_wizard_privacy;
                            RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_device_analysis_wizard_privacy);
                            if (relativeLayout3 != null) {
                                i8 = R.id.rl_error_log_wizard_privacy;
                                RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_error_log_wizard_privacy);
                                if (relativeLayout4 != null) {
                                    i8 = R.id.rl_forgotten_right_wizard_privacy;
                                    RelativeLayout relativeLayout5 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_forgotten_right_wizard_privacy);
                                    if (relativeLayout5 != null) {
                                        i8 = R.id.rl_header_wizard_privacy;
                                        RelativeLayout relativeLayout6 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_header_wizard_privacy);
                                        if (relativeLayout6 != null) {
                                            i8 = R.id.s_analytics_wizard_privacy;
                                            SwitchCompat switchCompat = (SwitchCompat) ViewBindings.findChildViewById(view, R.id.s_analytics_wizard_privacy);
                                            if (switchCompat != null) {
                                                i8 = R.id.s_device_analysis_wizard_privacy;
                                                SwitchCompat switchCompat2 = (SwitchCompat) ViewBindings.findChildViewById(view, R.id.s_device_analysis_wizard_privacy);
                                                if (switchCompat2 != null) {
                                                    i8 = R.id.s_error_log_wizard_privacy;
                                                    SwitchCompat switchCompat3 = (SwitchCompat) ViewBindings.findChildViewById(view, R.id.s_error_log_wizard_privacy);
                                                    if (switchCompat3 != null) {
                                                        i8 = R.id.tv_accept_all_gdpr;
                                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_accept_all_gdpr);
                                                        if (textView != null) {
                                                            i8 = R.id.tv_content_wizard_privacy;
                                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_content_wizard_privacy);
                                                            if (textView2 != null) {
                                                                i8 = R.id.tv_decline_all_gdpr;
                                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_decline_all_gdpr);
                                                                if (textView3 != null) {
                                                                    i8 = R.id.tv_description_ads_wizard_privacy;
                                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_description_ads_wizard_privacy);
                                                                    if (textView4 != null) {
                                                                        i8 = R.id.tv_description_analytics_wizard_privacy;
                                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_description_analytics_wizard_privacy);
                                                                        if (textView5 != null) {
                                                                            i8 = R.id.tv_description_device_analysis_wizard_privacy;
                                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_description_device_analysis_wizard_privacy);
                                                                            if (textView6 != null) {
                                                                                i8 = R.id.tv_description_error_log_wizard_privacy;
                                                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_description_error_log_wizard_privacy);
                                                                                if (textView7 != null) {
                                                                                    i8 = R.id.tv_description_forgotten_right_wizard_privacy;
                                                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_description_forgotten_right_wizard_privacy);
                                                                                    if (textView8 != null) {
                                                                                        i8 = R.id.tv_header_title_wizard_privacy;
                                                                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_header_title_wizard_privacy);
                                                                                        if (textView9 != null) {
                                                                                            i8 = R.id.tv_title_ads_wizard_privacy;
                                                                                            TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title_ads_wizard_privacy);
                                                                                            if (textView10 != null) {
                                                                                                i8 = R.id.tv_title_analytics_wizard_privacy;
                                                                                                TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title_analytics_wizard_privacy);
                                                                                                if (textView11 != null) {
                                                                                                    i8 = R.id.tv_title_device_analysis_wizard_privacy;
                                                                                                    TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title_device_analysis_wizard_privacy);
                                                                                                    if (textView12 != null) {
                                                                                                        i8 = R.id.tv_title_error_log_wizard_privacy;
                                                                                                        TextView textView13 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title_error_log_wizard_privacy);
                                                                                                        if (textView13 != null) {
                                                                                                            i8 = R.id.tv_title_forgotten_right_wizard_privacy;
                                                                                                            TextView textView14 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title_forgotten_right_wizard_privacy);
                                                                                                            if (textView14 != null) {
                                                                                                                i8 = R.id.tv_title_wizard_privacy;
                                                                                                                TextView textView15 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title_wizard_privacy);
                                                                                                                if (textView15 != null) {
                                                                                                                    i8 = R.id.tv_warning_device_analysis_wizard_privacy;
                                                                                                                    TextView textView16 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_warning_device_analysis_wizard_privacy);
                                                                                                                    if (textView16 != null) {
                                                                                                                        return new I0((RelativeLayout) view, imageView, linearLayout, relativeLayout, relativeLayout2, linearLayout2, relativeLayout3, relativeLayout4, relativeLayout5, relativeLayout6, switchCompat, switchCompat2, switchCompat3, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static I0 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static I0 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.wizard_privacy, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f10140a;
    }
}
