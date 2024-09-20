package Q3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.stripe.android.stripe3ds2.views.ThreeDS2Button;
import com.stripe.android.stripe3ds2.views.ThreeDS2HeaderTextView;
import com.stripe.android.stripe3ds2.views.ThreeDS2TextView;

/* loaded from: classes4.dex */
public final class h implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final View f8224a;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f8225b;

    /* renamed from: c, reason: collision with root package name */
    public final ThreeDS2HeaderTextView f8226c;

    /* renamed from: d, reason: collision with root package name */
    public final ThreeDS2TextView f8227d;

    /* renamed from: e, reason: collision with root package name */
    public final ThreeDS2Button f8228e;

    /* renamed from: f, reason: collision with root package name */
    public final ThreeDS2Button f8229f;

    /* renamed from: g, reason: collision with root package name */
    public final RadioButton f8230g;

    /* renamed from: h, reason: collision with root package name */
    public final RadioGroup f8231h;

    /* renamed from: i, reason: collision with root package name */
    public final RadioButton f8232i;

    /* renamed from: j, reason: collision with root package name */
    public final ThreeDS2TextView f8233j;

    private h(View view, FrameLayout frameLayout, ThreeDS2HeaderTextView threeDS2HeaderTextView, ThreeDS2TextView threeDS2TextView, ThreeDS2Button threeDS2Button, ThreeDS2Button threeDS2Button2, RadioButton radioButton, RadioGroup radioGroup, RadioButton radioButton2, ThreeDS2TextView threeDS2TextView2) {
        this.f8224a = view;
        this.f8225b = frameLayout;
        this.f8226c = threeDS2HeaderTextView;
        this.f8227d = threeDS2TextView;
        this.f8228e = threeDS2Button;
        this.f8229f = threeDS2Button2;
        this.f8230g = radioButton;
        this.f8231h = radioGroup;
        this.f8232i = radioButton2;
        this.f8233j = threeDS2TextView2;
    }

    public static h a(View view) {
        int i8 = P3.d.f7931e;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i8);
        if (frameLayout != null) {
            i8 = P3.d.f7932f;
            ThreeDS2HeaderTextView threeDS2HeaderTextView = (ThreeDS2HeaderTextView) ViewBindings.findChildViewById(view, i8);
            if (threeDS2HeaderTextView != null) {
                i8 = P3.d.f7933g;
                ThreeDS2TextView threeDS2TextView = (ThreeDS2TextView) ViewBindings.findChildViewById(view, i8);
                if (threeDS2TextView != null) {
                    i8 = P3.d.f7934h;
                    ThreeDS2Button threeDS2Button = (ThreeDS2Button) ViewBindings.findChildViewById(view, i8);
                    if (threeDS2Button != null) {
                        i8 = P3.d.f7935i;
                        ThreeDS2Button threeDS2Button2 = (ThreeDS2Button) ViewBindings.findChildViewById(view, i8);
                        if (threeDS2Button2 != null) {
                            i8 = P3.d.f7936j;
                            RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, i8);
                            if (radioButton != null) {
                                i8 = P3.d.f7937k;
                                RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, i8);
                                if (radioGroup != null) {
                                    i8 = P3.d.f7938l;
                                    RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, i8);
                                    if (radioButton2 != null) {
                                        i8 = P3.d.f7939m;
                                        ThreeDS2TextView threeDS2TextView2 = (ThreeDS2TextView) ViewBindings.findChildViewById(view, i8);
                                        if (threeDS2TextView2 != null) {
                                            return new h(view, frameLayout, threeDS2HeaderTextView, threeDS2TextView, threeDS2Button, threeDS2Button2, radioButton, radioGroup, radioButton2, threeDS2TextView2);
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

    public static h b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(P3.e.f7960h, viewGroup);
            return a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.f8224a;
    }
}
