package T4;

import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* loaded from: classes4.dex */
public final class Q implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f10293a;

    /* renamed from: b, reason: collision with root package name */
    public final RadioButton f10294b;

    /* renamed from: c, reason: collision with root package name */
    public final RadioButton f10295c;

    /* renamed from: d, reason: collision with root package name */
    public final RadioButton f10296d;

    /* renamed from: e, reason: collision with root package name */
    public final RadioGroup f10297e;

    /* renamed from: f, reason: collision with root package name */
    public final RelativeLayout f10298f;

    /* renamed from: g, reason: collision with root package name */
    public final RelativeLayout f10299g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f10300h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f10301i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f10302j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f10303k;

    /* renamed from: l, reason: collision with root package name */
    public final TextView f10304l;

    private Q(RelativeLayout relativeLayout, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, RadioGroup radioGroup, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.f10293a = relativeLayout;
        this.f10294b = radioButton;
        this.f10295c = radioButton2;
        this.f10296d = radioButton3;
        this.f10297e = radioGroup;
        this.f10298f = relativeLayout2;
        this.f10299g = relativeLayout3;
        this.f10300h = textView;
        this.f10301i = textView2;
        this.f10302j = textView3;
        this.f10303k = textView4;
        this.f10304l = textView5;
    }

    public static Q a(View view) {
        int i8 = R.id.rb_date_mdf;
        RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, R.id.rb_date_mdf);
        if (radioButton != null) {
            i8 = R.id.rb_name_mdf;
            RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, R.id.rb_name_mdf);
            if (radioButton2 != null) {
                i8 = R.id.rb_size_mdf;
                RadioButton radioButton3 = (RadioButton) ViewBindings.findChildViewById(view, R.id.rb_size_mdf);
                if (radioButton3 != null) {
                    i8 = R.id.rg_sort_downloads;
                    RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, R.id.rg_sort_downloads);
                    if (radioGroup != null) {
                        i8 = R.id.rl_my_downloads_selector;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_my_downloads_selector);
                        if (relativeLayout != null) {
                            i8 = R.id.rl_my_downloads_sort;
                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_my_downloads_sort);
                            if (relativeLayout2 != null) {
                                i8 = R.id.tv_delete_all_downloads;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_delete_all_downloads);
                                if (textView != null) {
                                    i8 = R.id.tv_delete_selected_downloads;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_delete_selected_downloads);
                                    if (textView2 != null) {
                                        i8 = R.id.tv_label_order_by_mdf;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_label_order_by_mdf);
                                        if (textView3 != null) {
                                            i8 = R.id.tv_label_selected_items;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_label_selected_items);
                                            if (textView4 != null) {
                                                i8 = R.id.tv_selector_downloads;
                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_selector_downloads);
                                                if (textView5 != null) {
                                                    return new Q((RelativeLayout) view, radioButton, radioButton2, radioButton3, radioGroup, relativeLayout, relativeLayout2, textView, textView2, textView3, textView4, textView5);
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

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f10293a;
    }
}
