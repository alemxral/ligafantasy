package T4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* loaded from: classes4.dex */
public final class u0 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f10908a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f10909b;

    /* renamed from: c, reason: collision with root package name */
    public final LinearLayout f10910c;

    /* renamed from: d, reason: collision with root package name */
    public final K f10911d;

    /* renamed from: e, reason: collision with root package name */
    public final RecyclerView f10912e;

    /* renamed from: f, reason: collision with root package name */
    public final RecyclerView f10913f;

    /* renamed from: g, reason: collision with root package name */
    public final Toolbar f10914g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f10915h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f10916i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f10917j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f10918k;

    /* renamed from: l, reason: collision with root package name */
    public final TextView f10919l;

    private u0(RelativeLayout relativeLayout, ImageView imageView, LinearLayout linearLayout, K k8, RecyclerView recyclerView, RecyclerView recyclerView2, Toolbar toolbar, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.f10908a = relativeLayout;
        this.f10909b = imageView;
        this.f10910c = linearLayout;
        this.f10911d = k8;
        this.f10912e = recyclerView;
        this.f10913f = recyclerView2;
        this.f10914g = toolbar;
        this.f10915h = textView;
        this.f10916i = textView2;
        this.f10917j = textView3;
        this.f10918k = textView4;
        this.f10919l = textView5;
    }

    public static u0 a(View view) {
        int i8 = R.id.iv_turbo_avatar_title_avatar_activity;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_turbo_avatar_title_avatar_activity);
        if (imageView != null) {
            i8 = R.id.ll_turbo_separator_avatar_activity;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_turbo_separator_avatar_activity);
            if (linearLayout != null) {
                i8 = R.id.loading_view_avatar;
                View findChildViewById = ViewBindings.findChildViewById(view, R.id.loading_view_avatar);
                if (findChildViewById != null) {
                    K a8 = K.a(findChildViewById);
                    i8 = R.id.rv_avatar_activity;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_avatar_activity);
                    if (recyclerView != null) {
                        i8 = R.id.rv_turbo_avatar_activity;
                        RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_turbo_avatar_activity);
                        if (recyclerView2 != null) {
                            i8 = R.id.toolbar_avatar_activity;
                            Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, R.id.toolbar_avatar_activity);
                            if (toolbar != null) {
                                i8 = R.id.tv_avatars_title_avatar_activity;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_avatars_title_avatar_activity);
                                if (textView != null) {
                                    i8 = R.id.tv_save_avatar_activity;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_save_avatar_activity);
                                    if (textView2 != null) {
                                        i8 = R.id.tv_title_avatar_activity;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title_avatar_activity);
                                        if (textView3 != null) {
                                            i8 = R.id.tv_toolbar_title_avatar_activity;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_toolbar_title_avatar_activity);
                                            if (textView4 != null) {
                                                i8 = R.id.tv_turbo_avatar_title_avatar_activity;
                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_turbo_avatar_title_avatar_activity);
                                                if (textView5 != null) {
                                                    return new u0((RelativeLayout) view, imageView, linearLayout, a8, recyclerView, recyclerView2, toolbar, textView, textView2, textView3, textView4, textView5);
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

    public static u0 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static u0 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.user_avatar_activity, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f10908a;
    }
}
