package T4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;
import com.uptodown.views.FullWidthImageView;

/* loaded from: classes4.dex */
public final class U implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f10317a;

    /* renamed from: b, reason: collision with root package name */
    public final FullWidthImageView f10318b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f10319c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f10320d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f10321e;

    /* renamed from: f, reason: collision with root package name */
    public final ImageView f10322f;

    /* renamed from: g, reason: collision with root package name */
    public final K f10323g;

    /* renamed from: h, reason: collision with root package name */
    public final RelativeLayout f10324h;

    /* renamed from: i, reason: collision with root package name */
    public final RelativeLayout f10325i;

    /* renamed from: j, reason: collision with root package name */
    public final RecyclerView f10326j;

    /* renamed from: k, reason: collision with root package name */
    public final ScrollView f10327k;

    /* renamed from: l, reason: collision with root package name */
    public final Toolbar f10328l;

    /* renamed from: m, reason: collision with root package name */
    public final TextView f10329m;

    /* renamed from: n, reason: collision with root package name */
    public final TextView f10330n;

    /* renamed from: o, reason: collision with root package name */
    public final TextView f10331o;

    /* renamed from: p, reason: collision with root package name */
    public final TextView f10332p;

    /* renamed from: q, reason: collision with root package name */
    public final TextView f10333q;

    /* renamed from: r, reason: collision with root package name */
    public final View f10334r;

    private U(RelativeLayout relativeLayout, FullWidthImageView fullWidthImageView, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, K k8, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RecyclerView recyclerView, ScrollView scrollView, Toolbar toolbar, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, View view) {
        this.f10317a = relativeLayout;
        this.f10318b = fullWidthImageView;
        this.f10319c = imageView;
        this.f10320d = imageView2;
        this.f10321e = imageView3;
        this.f10322f = imageView4;
        this.f10323g = k8;
        this.f10324h = relativeLayout2;
        this.f10325i = relativeLayout3;
        this.f10326j = recyclerView;
        this.f10327k = scrollView;
        this.f10328l = toolbar;
        this.f10329m = textView;
        this.f10330n = textView2;
        this.f10331o = textView3;
        this.f10332p = textView4;
        this.f10333q = textView5;
        this.f10334r = view;
    }

    public static U a(View view) {
        int i8 = R.id.iv_feature_organization;
        FullWidthImageView fullWidthImageView = (FullWidthImageView) ViewBindings.findChildViewById(view, R.id.iv_feature_organization);
        if (fullWidthImageView != null) {
            i8 = R.id.iv_instagram_organization;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_instagram_organization);
            if (imageView != null) {
                i8 = R.id.iv_logo_organization;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_logo_organization);
                if (imageView2 != null) {
                    i8 = R.id.iv_tiktok_organization;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_tiktok_organization);
                    if (imageView3 != null) {
                        i8 = R.id.iv_twitter_organization;
                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_twitter_organization);
                        if (imageView4 != null) {
                            i8 = R.id.loading_view_organization;
                            View findChildViewById = ViewBindings.findChildViewById(view, R.id.loading_view_organization);
                            if (findChildViewById != null) {
                                K a8 = K.a(findChildViewById);
                                i8 = R.id.rl_description_organization;
                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_description_organization);
                                if (relativeLayout != null) {
                                    i8 = R.id.rl_details_organization;
                                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_details_organization);
                                    if (relativeLayout2 != null) {
                                        i8 = R.id.rv_organization;
                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_organization);
                                        if (recyclerView != null) {
                                            i8 = R.id.sv_organization;
                                            ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, R.id.sv_organization);
                                            if (scrollView != null) {
                                                i8 = R.id.toolbar_organization;
                                                Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, R.id.toolbar_organization);
                                                if (toolbar != null) {
                                                    i8 = R.id.tv_description_organization;
                                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_description_organization);
                                                    if (textView != null) {
                                                        i8 = R.id.tv_name_organization;
                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_name_organization);
                                                        if (textView2 != null) {
                                                            i8 = R.id.tv_read_more_organization;
                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_read_more_organization);
                                                            if (textView3 != null) {
                                                                i8 = R.id.tv_toolbar_title_organization;
                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_toolbar_title_organization);
                                                                if (textView4 != null) {
                                                                    i8 = R.id.tv_web_organization;
                                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_web_organization);
                                                                    if (textView5 != null) {
                                                                        i8 = R.id.v_description_shadow_organization;
                                                                        View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.v_description_shadow_organization);
                                                                        if (findChildViewById2 != null) {
                                                                            return new U((RelativeLayout) view, fullWidthImageView, imageView, imageView2, imageView3, imageView4, a8, relativeLayout, relativeLayout2, recyclerView, scrollView, toolbar, textView, textView2, textView3, textView4, textView5, findChildViewById2);
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

    public static U c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static U d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.organization_activity, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f10317a;
    }
}
