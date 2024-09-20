package T4;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;
import com.uptodown.views.ScrollableTextView;

/* renamed from: T4.z, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1392z implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f11009a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f11010b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f11011c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f11012d;

    /* renamed from: e, reason: collision with root package name */
    public final ProgressBar f11013e;

    /* renamed from: f, reason: collision with root package name */
    public final RelativeLayout f11014f;

    /* renamed from: g, reason: collision with root package name */
    public final RelativeLayout f11015g;

    /* renamed from: h, reason: collision with root package name */
    public final RelativeLayout f11016h;

    /* renamed from: i, reason: collision with root package name */
    public final RelativeLayout f11017i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f11018j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f11019k;

    /* renamed from: l, reason: collision with root package name */
    public final TextView f11020l;

    /* renamed from: m, reason: collision with root package name */
    public final TextView f11021m;

    /* renamed from: n, reason: collision with root package name */
    public final TextView f11022n;

    /* renamed from: o, reason: collision with root package name */
    public final ScrollableTextView f11023o;

    /* renamed from: p, reason: collision with root package name */
    public final ScrollableTextView f11024p;

    private C1392z(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ProgressBar progressBar, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, RelativeLayout relativeLayout5, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, ScrollableTextView scrollableTextView, ScrollableTextView scrollableTextView2) {
        this.f11009a = relativeLayout;
        this.f11010b = imageView;
        this.f11011c = imageView2;
        this.f11012d = imageView3;
        this.f11013e = progressBar;
        this.f11014f = relativeLayout2;
        this.f11015g = relativeLayout3;
        this.f11016h = relativeLayout4;
        this.f11017i = relativeLayout5;
        this.f11018j = textView;
        this.f11019k = textView2;
        this.f11020l = textView3;
        this.f11021m = textView4;
        this.f11022n = textView5;
        this.f11023o = scrollableTextView;
        this.f11024p = scrollableTextView2;
    }

    public static C1392z a(View view) {
        int i8 = R.id.iv_cancel_downloading;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_cancel_downloading);
        if (imageView != null) {
            i8 = R.id.iv_resume_downloading;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_resume_downloading);
            if (imageView2 != null) {
                i8 = R.id.iv_status_pre_register;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_status_pre_register);
                if (imageView3 != null) {
                    i8 = R.id.pb_download_button;
                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.pb_download_button);
                    if (progressBar != null) {
                        i8 = R.id.rl_status_download;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_status_download);
                        if (relativeLayout != null) {
                            i8 = R.id.rl_status_downloading;
                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_status_downloading);
                            if (relativeLayout2 != null) {
                                i8 = R.id.rl_status_loading;
                                RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_status_loading);
                                if (relativeLayout3 != null) {
                                    i8 = R.id.rl_status_pre_register;
                                    RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_status_pre_register);
                                    if (relativeLayout4 != null) {
                                        i8 = R.id.tv_enqueue_download;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_enqueue_download);
                                        if (textView != null) {
                                            i8 = R.id.tv_open_download_button;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_open_download_button);
                                            if (textView2 != null) {
                                                i8 = R.id.tv_percentage_downloaded;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_percentage_downloaded);
                                                if (textView3 != null) {
                                                    i8 = R.id.tv_size_downloaded;
                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_size_downloaded);
                                                    if (textView4 != null) {
                                                        i8 = R.id.tv_size_total;
                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_size_total);
                                                        if (textView5 != null) {
                                                            i8 = R.id.tv_status_download;
                                                            ScrollableTextView scrollableTextView = (ScrollableTextView) ViewBindings.findChildViewById(view, R.id.tv_status_download);
                                                            if (scrollableTextView != null) {
                                                                i8 = R.id.tv_status_pre_register;
                                                                ScrollableTextView scrollableTextView2 = (ScrollableTextView) ViewBindings.findChildViewById(view, R.id.tv_status_pre_register);
                                                                if (scrollableTextView2 != null) {
                                                                    return new C1392z((RelativeLayout) view, imageView, imageView2, imageView3, progressBar, relativeLayout, relativeLayout2, relativeLayout3, relativeLayout4, textView, textView2, textView3, textView4, textView5, scrollableTextView, scrollableTextView2);
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
        return this.f11009a;
    }
}
