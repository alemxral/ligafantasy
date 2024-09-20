package G2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import j2.AbstractC3049A;
import j2.AbstractC3051C;

/* loaded from: classes4.dex */
public final class i implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final View f3119a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f3120b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f3121c;

    private i(View view, ImageView imageView, ImageView imageView2) {
        this.f3119a = view;
        this.f3120b = imageView;
        this.f3121c = imageView2;
    }

    public static i a(View view) {
        int i8 = AbstractC3049A.f32772m;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i8);
        if (imageView != null) {
            i8 = AbstractC3049A.f32725C;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i8);
            if (imageView2 != null) {
                return new i(view, imageView, imageView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static i b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(AbstractC3051C.f32797j, viewGroup);
            return a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.f3119a;
    }
}
