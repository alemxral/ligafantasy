package T4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;
import com.uptodown.util.views.UsernameTextView;

/* loaded from: classes4.dex */
public final class y0 implements ViewBinding {

    /* renamed from: A, reason: collision with root package name */
    public final TextView f10977A;

    /* renamed from: B, reason: collision with root package name */
    public final UsernameTextView f10978B;

    /* renamed from: C, reason: collision with root package name */
    public final TextView f10979C;

    /* renamed from: D, reason: collision with root package name */
    public final z0 f10980D;

    /* renamed from: E, reason: collision with root package name */
    public final z0 f10981E;

    /* renamed from: F, reason: collision with root package name */
    public final z0 f10982F;

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f10983a;

    /* renamed from: b, reason: collision with root package name */
    public final z0 f10984b;

    /* renamed from: c, reason: collision with root package name */
    public final GridLayout f10985c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f10986d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f10987e;

    /* renamed from: f, reason: collision with root package name */
    public final ImageView f10988f;

    /* renamed from: g, reason: collision with root package name */
    public final LinearLayout f10989g;

    /* renamed from: h, reason: collision with root package name */
    public final LinearLayout f10990h;

    /* renamed from: i, reason: collision with root package name */
    public final LinearLayout f10991i;

    /* renamed from: j, reason: collision with root package name */
    public final LinearLayout f10992j;

    /* renamed from: k, reason: collision with root package name */
    public final LinearLayout f10993k;

    /* renamed from: l, reason: collision with root package name */
    public final LinearLayout f10994l;

    /* renamed from: m, reason: collision with root package name */
    public final z0 f10995m;

    /* renamed from: n, reason: collision with root package name */
    public final RelativeLayout f10996n;

    /* renamed from: o, reason: collision with root package name */
    public final RelativeLayout f10997o;

    /* renamed from: p, reason: collision with root package name */
    public final RelativeLayout f10998p;

    /* renamed from: q, reason: collision with root package name */
    public final z0 f10999q;

    /* renamed from: r, reason: collision with root package name */
    public final ScrollView f11000r;

    /* renamed from: s, reason: collision with root package name */
    public final TextView f11001s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f11002t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f11003u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f11004v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f11005w;

    /* renamed from: x, reason: collision with root package name */
    public final TextView f11006x;

    /* renamed from: y, reason: collision with root package name */
    public final TextView f11007y;

    /* renamed from: z, reason: collision with root package name */
    public final TextView f11008z;

    private y0(RelativeLayout relativeLayout, z0 z0Var, GridLayout gridLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, z0 z0Var2, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, z0 z0Var3, ScrollView scrollView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, UsernameTextView usernameTextView, TextView textView10, z0 z0Var4, z0 z0Var5, z0 z0Var6) {
        this.f10983a = relativeLayout;
        this.f10984b = z0Var;
        this.f10985c = gridLayout;
        this.f10986d = imageView;
        this.f10987e = imageView2;
        this.f10988f = imageView3;
        this.f10989g = linearLayout;
        this.f10990h = linearLayout2;
        this.f10991i = linearLayout3;
        this.f10992j = linearLayout4;
        this.f10993k = linearLayout5;
        this.f10994l = linearLayout6;
        this.f10995m = z0Var2;
        this.f10996n = relativeLayout2;
        this.f10997o = relativeLayout3;
        this.f10998p = relativeLayout4;
        this.f10999q = z0Var3;
        this.f11000r = scrollView;
        this.f11001s = textView;
        this.f11002t = textView2;
        this.f11003u = textView3;
        this.f11004v = textView4;
        this.f11005w = textView5;
        this.f11006x = textView6;
        this.f11007y = textView7;
        this.f11008z = textView8;
        this.f10977A = textView9;
        this.f10978B = usernameTextView;
        this.f10979C = textView10;
        this.f10980D = z0Var4;
        this.f10981E = z0Var5;
        this.f10982F = z0Var6;
    }

    public static y0 a(View view) {
        int i8 = R.id.downloads_user_fragment;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.downloads_user_fragment);
        if (findChildViewById != null) {
            z0 a8 = z0.a(findChildViewById);
            i8 = R.id.gl_user_fragment;
            GridLayout gridLayout = (GridLayout) ViewBindings.findChildViewById(view, R.id.gl_user_fragment);
            if (gridLayout != null) {
                i8 = R.id.iv_dark_mode_user_fragment;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_dark_mode_user_fragment);
                if (imageView != null) {
                    i8 = R.id.iv_support_user_fragment;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_support_user_fragment);
                    if (imageView2 != null) {
                        i8 = R.id.iv_user_avatar_user_fragment;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_user_avatar_user_fragment);
                        if (imageView3 != null) {
                            i8 = R.id.ll_manage_subscription_user_fragment;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_manage_subscription_user_fragment);
                            if (linearLayout != null) {
                                i8 = R.id.ll_notifications_user_fragment;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_notifications_user_fragment);
                                if (linearLayout2 != null) {
                                    i8 = R.id.ll_security_user_fragment;
                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_security_user_fragment);
                                    if (linearLayout3 != null) {
                                        i8 = R.id.ll_settings_user_fragment;
                                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_settings_user_fragment);
                                        if (linearLayout4 != null) {
                                            i8 = R.id.ll_support_user_fragment;
                                            LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_support_user_fragment);
                                            if (linearLayout5 != null) {
                                                i8 = R.id.ll_user_fragment;
                                                LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_user_fragment);
                                                if (linearLayout6 != null) {
                                                    i8 = R.id.myapps_user_fragment;
                                                    View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.myapps_user_fragment);
                                                    if (findChildViewById2 != null) {
                                                        z0 a9 = z0.a(findChildViewById2);
                                                        i8 = R.id.rl_toolbar_user_fragment;
                                                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_toolbar_user_fragment);
                                                        if (relativeLayout != null) {
                                                            i8 = R.id.rl_user_avatar_user_fragment;
                                                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_user_avatar_user_fragment);
                                                            if (relativeLayout2 != null) {
                                                                i8 = R.id.rl_user_info_user_fragment;
                                                                RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_user_info_user_fragment);
                                                                if (relativeLayout3 != null) {
                                                                    i8 = R.id.rollback_user_fragment;
                                                                    View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.rollback_user_fragment);
                                                                    if (findChildViewById3 != null) {
                                                                        z0 a10 = z0.a(findChildViewById3);
                                                                        i8 = R.id.sv_user_fragment;
                                                                        ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, R.id.sv_user_fragment);
                                                                        if (scrollView != null) {
                                                                            i8 = R.id.tv_edit_profile_user_fragment;
                                                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_edit_profile_user_fragment);
                                                                            if (textView != null) {
                                                                                i8 = R.id.tv_log_out_user_fragment;
                                                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_log_out_user_fragment);
                                                                                if (textView2 != null) {
                                                                                    i8 = R.id.tv_manage_subscription_user_fragment;
                                                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_manage_subscription_user_fragment);
                                                                                    if (textView3 != null) {
                                                                                        i8 = R.id.tv_notifications_user_fragment;
                                                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_notifications_user_fragment);
                                                                                        if (textView4 != null) {
                                                                                            i8 = R.id.tv_registered_ago_user_fragment;
                                                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_registered_ago_user_fragment);
                                                                                            if (textView5 != null) {
                                                                                                i8 = R.id.tv_reviews_counter_user_fragment;
                                                                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_reviews_counter_user_fragment);
                                                                                                if (textView6 != null) {
                                                                                                    i8 = R.id.tv_security_user_fragment;
                                                                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_security_user_fragment);
                                                                                                    if (textView7 != null) {
                                                                                                        i8 = R.id.tv_settings_user_fragment;
                                                                                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_settings_user_fragment);
                                                                                                        if (textView8 != null) {
                                                                                                            i8 = R.id.tv_support_user_fragment;
                                                                                                            TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_support_user_fragment);
                                                                                                            if (textView9 != null) {
                                                                                                                i8 = R.id.tv_username_user_fragment;
                                                                                                                UsernameTextView usernameTextView = (UsernameTextView) ViewBindings.findChildViewById(view, R.id.tv_username_user_fragment);
                                                                                                                if (usernameTextView != null) {
                                                                                                                    i8 = R.id.tv_web_user_fragment;
                                                                                                                    TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_web_user_fragment);
                                                                                                                    if (textView10 != null) {
                                                                                                                        i8 = R.id.upcoming_releases_user_fragment;
                                                                                                                        View findChildViewById4 = ViewBindings.findChildViewById(view, R.id.upcoming_releases_user_fragment);
                                                                                                                        if (findChildViewById4 != null) {
                                                                                                                            z0 a11 = z0.a(findChildViewById4);
                                                                                                                            i8 = R.id.updates_user_fragment;
                                                                                                                            View findChildViewById5 = ViewBindings.findChildViewById(view, R.id.updates_user_fragment);
                                                                                                                            if (findChildViewById5 != null) {
                                                                                                                                z0 a12 = z0.a(findChildViewById5);
                                                                                                                                i8 = R.id.wishlist_user_fragment;
                                                                                                                                View findChildViewById6 = ViewBindings.findChildViewById(view, R.id.wishlist_user_fragment);
                                                                                                                                if (findChildViewById6 != null) {
                                                                                                                                    return new y0((RelativeLayout) view, a8, gridLayout, imageView, imageView2, imageView3, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, a9, relativeLayout, relativeLayout2, relativeLayout3, a10, scrollView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, usernameTextView, textView10, a11, a12, z0.a(findChildViewById6));
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static y0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.user_fragment, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f10983a;
    }
}
