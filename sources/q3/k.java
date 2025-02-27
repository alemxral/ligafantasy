package Q3;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.progressindicator.CircularProgressIndicator;

/* loaded from: classes4.dex */
public final class k implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f8245a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f8246b;

    /* renamed from: c, reason: collision with root package name */
    public final CircularProgressIndicator f8247c;

    private k(LinearLayout linearLayout, ImageView imageView, CircularProgressIndicator circularProgressIndicator) {
        this.f8245a = linearLayout;
        this.f8246b = imageView;
        this.f8247c = circularProgressIndicator;
    }

    public static k a(View view) {
        int i8 = P3.d.f7927a;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i8);
        if (imageView != null) {
            i8 = P3.d.f7948v;
            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) ViewBindings.findChildViewById(view, i8);
            if (circularProgressIndicator != null) {
                return new k((LinearLayout) view, imageView, circularProgressIndicator);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f8245a;
    }
}
