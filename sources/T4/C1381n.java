package T4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* renamed from: T4.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1381n implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f10755a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f10756b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f10757c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f10758d;

    private C1381n(LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3) {
        this.f10755a = linearLayout;
        this.f10756b = textView;
        this.f10757c = textView2;
        this.f10758d = textView3;
    }

    public static C1381n a(View view) {
        int i8 = R.id.tv_close_dialog_pre_register;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_close_dialog_pre_register);
        if (textView != null) {
            i8 = R.id.tv_description_dialog_pre_register;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_description_dialog_pre_register);
            if (textView2 != null) {
                i8 = R.id.tv_title_dialog_pre_register;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title_dialog_pre_register);
                if (textView3 != null) {
                    return new C1381n((LinearLayout) view, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static C1381n c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C1381n d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.dialog_coming_soon, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f10755a;
    }
}
