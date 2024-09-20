package T4;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* loaded from: classes4.dex */
public final class F0 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f10093a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f10094b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f10095c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f10096d;

    /* renamed from: e, reason: collision with root package name */
    public final View f10097e;

    private F0(RelativeLayout relativeLayout, TextView textView, TextView textView2, TextView textView3, View view) {
        this.f10093a = relativeLayout;
        this.f10094b = textView;
        this.f10095c = textView2;
        this.f10096d = textView3;
        this.f10097e = view;
    }

    public static F0 a(View view) {
        int i8 = R.id.tv_read_more_whats_new;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_read_more_whats_new);
        if (textView != null) {
            i8 = R.id.tv_whats_new;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_whats_new);
            if (textView2 != null) {
                i8 = R.id.tv_whats_new_content;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_whats_new_content);
                if (textView3 != null) {
                    i8 = R.id.v_shadow_whats_new;
                    View findChildViewById = ViewBindings.findChildViewById(view, R.id.v_shadow_whats_new);
                    if (findChildViewById != null) {
                        return new F0((RelativeLayout) view, textView, textView2, textView3, findChildViewById);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f10093a;
    }
}
