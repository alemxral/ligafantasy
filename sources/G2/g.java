package G2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import j2.AbstractC3049A;
import j2.AbstractC3051C;

/* loaded from: classes4.dex */
public final class g implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f3113a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatImageView f3114b;

    /* renamed from: c, reason: collision with root package name */
    public final AppCompatImageView f3115c;

    /* renamed from: d, reason: collision with root package name */
    public final AppCompatTextView f3116d;

    private g(LinearLayout linearLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView) {
        this.f3113a = linearLayout;
        this.f3114b = appCompatImageView;
        this.f3115c = appCompatImageView2;
        this.f3116d = appCompatTextView;
    }

    public static g a(View view) {
        int i8 = AbstractC3049A.f32771l;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i8);
        if (appCompatImageView != null) {
            i8 = AbstractC3049A.f32725C;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i8);
            if (appCompatImageView2 != null) {
                i8 = AbstractC3049A.f32728F;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i8);
                if (appCompatTextView != null) {
                    return new g((LinearLayout) view, appCompatImageView, appCompatImageView2, appCompatTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static g c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(AbstractC3051C.f32794g, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f3113a;
    }
}
