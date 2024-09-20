package G2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import j2.AbstractC3049A;
import j2.AbstractC3051C;

/* loaded from: classes4.dex */
public final class n implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final View f3141a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatImageView f3142b;

    /* renamed from: c, reason: collision with root package name */
    public final AppCompatImageView f3143c;

    /* renamed from: d, reason: collision with root package name */
    public final AppCompatTextView f3144d;

    private n(View view, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView) {
        this.f3141a = view;
        this.f3142b = appCompatImageView;
        this.f3143c = appCompatImageView2;
        this.f3144d = appCompatTextView;
    }

    public static n a(View view) {
        int i8 = AbstractC3049A.f32759f;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i8);
        if (appCompatImageView != null) {
            i8 = AbstractC3049A.f32771l;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i8);
            if (appCompatImageView2 != null) {
                i8 = AbstractC3049A.f32775p;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i8);
                if (appCompatTextView != null) {
                    return new n(view, appCompatImageView, appCompatImageView2, appCompatTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static n b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(AbstractC3051C.f32803p, viewGroup);
            return a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.f3141a;
    }
}
