package G2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.stripe.android.view.PaymentAuthWebView;
import j2.AbstractC3049A;
import j2.AbstractC3051C;

/* loaded from: classes4.dex */
public final class o implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final CoordinatorLayout f3145a;

    /* renamed from: b, reason: collision with root package name */
    public final CircularProgressIndicator f3146b;

    /* renamed from: c, reason: collision with root package name */
    public final Toolbar f3147c;

    /* renamed from: d, reason: collision with root package name */
    public final PaymentAuthWebView f3148d;

    /* renamed from: e, reason: collision with root package name */
    public final FrameLayout f3149e;

    private o(CoordinatorLayout coordinatorLayout, CircularProgressIndicator circularProgressIndicator, Toolbar toolbar, PaymentAuthWebView paymentAuthWebView, FrameLayout frameLayout) {
        this.f3145a = coordinatorLayout;
        this.f3146b = circularProgressIndicator;
        this.f3147c = toolbar;
        this.f3148d = paymentAuthWebView;
        this.f3149e = frameLayout;
    }

    public static o a(View view) {
        int i8 = AbstractC3049A.f32730H;
        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) ViewBindings.findChildViewById(view, i8);
        if (circularProgressIndicator != null) {
            i8 = AbstractC3049A.f32764h0;
            Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, i8);
            if (toolbar != null) {
                i8 = AbstractC3049A.f32768j0;
                PaymentAuthWebView paymentAuthWebView = (PaymentAuthWebView) ViewBindings.findChildViewById(view, i8);
                if (paymentAuthWebView != null) {
                    i8 = AbstractC3049A.f32770k0;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i8);
                    if (frameLayout != null) {
                        return new o((CoordinatorLayout) view, circularProgressIndicator, toolbar, paymentAuthWebView, frameLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static o c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static o d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(AbstractC3051C.f32804q, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f3145a;
    }
}
