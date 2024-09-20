package G2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.view.CountryTextInputLayout;
import com.stripe.android.view.StripeEditText;
import j2.AbstractC3049A;
import j2.AbstractC3051C;

/* loaded from: classes4.dex */
public final class f implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final View f3097a;

    /* renamed from: b, reason: collision with root package name */
    public final CountryTextInputLayout f3098b;

    /* renamed from: c, reason: collision with root package name */
    public final StripeEditText f3099c;

    /* renamed from: d, reason: collision with root package name */
    public final StripeEditText f3100d;

    /* renamed from: e, reason: collision with root package name */
    public final StripeEditText f3101e;

    /* renamed from: f, reason: collision with root package name */
    public final StripeEditText f3102f;

    /* renamed from: g, reason: collision with root package name */
    public final StripeEditText f3103g;

    /* renamed from: h, reason: collision with root package name */
    public final StripeEditText f3104h;

    /* renamed from: i, reason: collision with root package name */
    public final StripeEditText f3105i;

    /* renamed from: j, reason: collision with root package name */
    public final TextInputLayout f3106j;

    /* renamed from: k, reason: collision with root package name */
    public final TextInputLayout f3107k;

    /* renamed from: l, reason: collision with root package name */
    public final TextInputLayout f3108l;

    /* renamed from: m, reason: collision with root package name */
    public final TextInputLayout f3109m;

    /* renamed from: n, reason: collision with root package name */
    public final TextInputLayout f3110n;

    /* renamed from: o, reason: collision with root package name */
    public final TextInputLayout f3111o;

    /* renamed from: p, reason: collision with root package name */
    public final TextInputLayout f3112p;

    private f(View view, CountryTextInputLayout countryTextInputLayout, StripeEditText stripeEditText, StripeEditText stripeEditText2, StripeEditText stripeEditText3, StripeEditText stripeEditText4, StripeEditText stripeEditText5, StripeEditText stripeEditText6, StripeEditText stripeEditText7, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, TextInputLayout textInputLayout4, TextInputLayout textInputLayout5, TextInputLayout textInputLayout6, TextInputLayout textInputLayout7) {
        this.f3097a = view;
        this.f3098b = countryTextInputLayout;
        this.f3099c = stripeEditText;
        this.f3100d = stripeEditText2;
        this.f3101e = stripeEditText3;
        this.f3102f = stripeEditText4;
        this.f3103g = stripeEditText5;
        this.f3104h = stripeEditText6;
        this.f3105i = stripeEditText7;
        this.f3106j = textInputLayout;
        this.f3107k = textInputLayout2;
        this.f3108l = textInputLayout3;
        this.f3109m = textInputLayout4;
        this.f3110n = textInputLayout5;
        this.f3111o = textInputLayout6;
        this.f3112p = textInputLayout7;
    }

    public static f a(View view) {
        int i8 = AbstractC3049A.f32773n;
        CountryTextInputLayout countryTextInputLayout = (CountryTextInputLayout) ViewBindings.findChildViewById(view, i8);
        if (countryTextInputLayout != null) {
            i8 = AbstractC3049A.f32776q;
            StripeEditText stripeEditText = (StripeEditText) ViewBindings.findChildViewById(view, i8);
            if (stripeEditText != null) {
                i8 = AbstractC3049A.f32777r;
                StripeEditText stripeEditText2 = (StripeEditText) ViewBindings.findChildViewById(view, i8);
                if (stripeEditText2 != null) {
                    i8 = AbstractC3049A.f32779t;
                    StripeEditText stripeEditText3 = (StripeEditText) ViewBindings.findChildViewById(view, i8);
                    if (stripeEditText3 != null) {
                        i8 = AbstractC3049A.f32782w;
                        StripeEditText stripeEditText4 = (StripeEditText) ViewBindings.findChildViewById(view, i8);
                        if (stripeEditText4 != null) {
                            i8 = AbstractC3049A.f32783x;
                            StripeEditText stripeEditText5 = (StripeEditText) ViewBindings.findChildViewById(view, i8);
                            if (stripeEditText5 != null) {
                                i8 = AbstractC3049A.f32785z;
                                StripeEditText stripeEditText6 = (StripeEditText) ViewBindings.findChildViewById(view, i8);
                                if (stripeEditText6 != null) {
                                    i8 = AbstractC3049A.f32723A;
                                    StripeEditText stripeEditText7 = (StripeEditText) ViewBindings.findChildViewById(view, i8);
                                    if (stripeEditText7 != null) {
                                        i8 = AbstractC3049A.f32745W;
                                        TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, i8);
                                        if (textInputLayout != null) {
                                            i8 = AbstractC3049A.f32746X;
                                            TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, i8);
                                            if (textInputLayout2 != null) {
                                                i8 = AbstractC3049A.f32748Z;
                                                TextInputLayout textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(view, i8);
                                                if (textInputLayout3 != null) {
                                                    i8 = AbstractC3049A.f32754c0;
                                                    TextInputLayout textInputLayout4 = (TextInputLayout) ViewBindings.findChildViewById(view, i8);
                                                    if (textInputLayout4 != null) {
                                                        i8 = AbstractC3049A.f32756d0;
                                                        TextInputLayout textInputLayout5 = (TextInputLayout) ViewBindings.findChildViewById(view, i8);
                                                        if (textInputLayout5 != null) {
                                                            i8 = AbstractC3049A.f32760f0;
                                                            TextInputLayout textInputLayout6 = (TextInputLayout) ViewBindings.findChildViewById(view, i8);
                                                            if (textInputLayout6 != null) {
                                                                i8 = AbstractC3049A.f32762g0;
                                                                TextInputLayout textInputLayout7 = (TextInputLayout) ViewBindings.findChildViewById(view, i8);
                                                                if (textInputLayout7 != null) {
                                                                    return new f(view, countryTextInputLayout, stripeEditText, stripeEditText2, stripeEditText3, stripeEditText4, stripeEditText5, stripeEditText6, stripeEditText7, textInputLayout, textInputLayout2, textInputLayout3, textInputLayout4, textInputLayout5, textInputLayout6, textInputLayout7);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static f b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(AbstractC3051C.f32793f, viewGroup);
            return a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.f3097a;
    }
}
