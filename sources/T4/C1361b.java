package T4;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* renamed from: T4.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1361b implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f10384a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f10385b;

    /* renamed from: c, reason: collision with root package name */
    public final RelativeLayout f10386c;

    /* renamed from: d, reason: collision with root package name */
    public final RelativeLayout f10387d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f10388e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f10389f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f10390g;

    private C1361b(RelativeLayout relativeLayout, ImageView imageView, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, TextView textView, TextView textView2, TextView textView3) {
        this.f10384a = relativeLayout;
        this.f10385b = imageView;
        this.f10386c = relativeLayout2;
        this.f10387d = relativeLayout3;
        this.f10388e = textView;
        this.f10389f = textView2;
        this.f10390g = textView3;
    }

    public static C1361b a(View view) {
        int i8 = R.id.iv_icon_affiliated;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_icon_affiliated);
        if (imageView != null) {
            i8 = R.id.rl_container_affiliated;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_container_affiliated);
            if (relativeLayout != null) {
                i8 = R.id.rl_container_stroke_affiliated;
                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_container_stroke_affiliated);
                if (relativeLayout2 != null) {
                    i8 = R.id.tv_button_affiliated;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_button_affiliated);
                    if (textView != null) {
                        i8 = R.id.tv_description_affiliated;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_description_affiliated);
                        if (textView2 != null) {
                            i8 = R.id.tv_title_affiliated;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title_affiliated);
                            if (textView3 != null) {
                                return new C1361b((RelativeLayout) view, imageView, relativeLayout, relativeLayout2, textView, textView2, textView3);
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
        return this.f10384a;
    }
}
