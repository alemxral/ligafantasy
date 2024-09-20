package G2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import j2.AbstractC3049A;
import j2.AbstractC3051C;

/* loaded from: classes4.dex */
public final class t implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final View f3162a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f3163b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f3164c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f3165d;

    /* renamed from: e, reason: collision with root package name */
    public final AppCompatImageView f3166e;

    private t(View view, TextView textView, TextView textView2, TextView textView3, AppCompatImageView appCompatImageView) {
        this.f3162a = view;
        this.f3163b = textView;
        this.f3164c = textView2;
        this.f3165d = textView3;
        this.f3166e = appCompatImageView;
    }

    public static t a(View view) {
        int i8 = AbstractC3049A.f32774o;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i8);
        if (textView != null) {
            i8 = AbstractC3049A.f32728F;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i8);
            if (textView2 != null) {
                i8 = AbstractC3049A.f32729G;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i8);
                if (textView3 != null) {
                    i8 = AbstractC3049A.f32735M;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i8);
                    if (appCompatImageView != null) {
                        return new t(view, textView, textView2, textView3, appCompatImageView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static t b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(AbstractC3051C.f32810w, viewGroup);
            return a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.f3162a;
    }
}
