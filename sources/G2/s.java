package G2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.stripe.android.view.SelectShippingMethodWidget;
import j2.AbstractC3049A;
import j2.AbstractC3051C;

/* loaded from: classes4.dex */
public final class s implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final FrameLayout f3160a;

    /* renamed from: b, reason: collision with root package name */
    public final SelectShippingMethodWidget f3161b;

    private s(FrameLayout frameLayout, SelectShippingMethodWidget selectShippingMethodWidget) {
        this.f3160a = frameLayout;
        this.f3161b = selectShippingMethodWidget;
    }

    public static s a(View view) {
        int i8 = AbstractC3049A.f32734L;
        SelectShippingMethodWidget selectShippingMethodWidget = (SelectShippingMethodWidget) ViewBindings.findChildViewById(view, i8);
        if (selectShippingMethodWidget != null) {
            return new s((FrameLayout) view, selectShippingMethodWidget);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static s c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(AbstractC3051C.f32809v, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f3160a;
    }
}
