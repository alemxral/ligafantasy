package T4;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* renamed from: T4.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1378k implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f10702a;

    /* renamed from: b, reason: collision with root package name */
    public final LinearLayout f10703b;

    /* renamed from: c, reason: collision with root package name */
    public final LinearLayout f10704c;

    /* renamed from: d, reason: collision with root package name */
    public final View f10705d;

    /* renamed from: e, reason: collision with root package name */
    public final View f10706e;

    /* renamed from: f, reason: collision with root package name */
    public final View f10707f;

    /* renamed from: g, reason: collision with root package name */
    public final View f10708g;

    /* renamed from: h, reason: collision with root package name */
    public final View f10709h;

    /* renamed from: i, reason: collision with root package name */
    public final View f10710i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f10711j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f10712k;

    /* renamed from: l, reason: collision with root package name */
    public final TextView f10713l;

    /* renamed from: m, reason: collision with root package name */
    public final TextView f10714m;

    /* renamed from: n, reason: collision with root package name */
    public final TextView f10715n;

    /* renamed from: o, reason: collision with root package name */
    public final TextView f10716o;

    /* renamed from: p, reason: collision with root package name */
    public final TextView f10717p;

    /* renamed from: q, reason: collision with root package name */
    public final TextView f10718q;

    private C1378k(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, View view, View view2, View view3, View view4, View view5, View view6, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8) {
        this.f10702a = linearLayout;
        this.f10703b = linearLayout2;
        this.f10704c = linearLayout3;
        this.f10705d = view;
        this.f10706e = view2;
        this.f10707f = view3;
        this.f10708g = view4;
        this.f10709h = view5;
        this.f10710i = view6;
        this.f10711j = textView;
        this.f10712k = textView2;
        this.f10713l = textView3;
        this.f10714m = textView4;
        this.f10715n = textView5;
        this.f10716o = textView6;
        this.f10717p = textView7;
        this.f10718q = textView8;
    }

    public static C1378k a(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i8 = R.id.ll_reviews_counter_chart;
        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_reviews_counter_chart);
        if (linearLayout2 != null) {
            i8 = R.id.star1_graphical_value_app_detail;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.star1_graphical_value_app_detail);
            if (findChildViewById != null) {
                i8 = R.id.star2_graphical_value_app_detail;
                View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.star2_graphical_value_app_detail);
                if (findChildViewById2 != null) {
                    i8 = R.id.star3_graphical_value_app_detail;
                    View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.star3_graphical_value_app_detail);
                    if (findChildViewById3 != null) {
                        i8 = R.id.star4_graphical_value_app_detail;
                        View findChildViewById4 = ViewBindings.findChildViewById(view, R.id.star4_graphical_value_app_detail);
                        if (findChildViewById4 != null) {
                            i8 = R.id.star5_graphical_value_app_detail;
                            View findChildViewById5 = ViewBindings.findChildViewById(view, R.id.star5_graphical_value_app_detail);
                            if (findChildViewById5 != null) {
                                i8 = R.id.star5_graphical_value_app_detail_background;
                                View findChildViewById6 = ViewBindings.findChildViewById(view, R.id.star5_graphical_value_app_detail_background);
                                if (findChildViewById6 != null) {
                                    i8 = R.id.tv_chart_1_value;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_chart_1_value);
                                    if (textView != null) {
                                        i8 = R.id.tv_chart_2_value;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_chart_2_value);
                                        if (textView2 != null) {
                                            i8 = R.id.tv_chart_3_value;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_chart_3_value);
                                            if (textView3 != null) {
                                                i8 = R.id.tv_chart_4_value;
                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_chart_4_value);
                                                if (textView4 != null) {
                                                    i8 = R.id.tv_chart_5_value;
                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_chart_5_value);
                                                    if (textView5 != null) {
                                                        i8 = R.id.tv_review_rating_app_detail;
                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_review_rating_app_detail);
                                                        if (textView6 != null) {
                                                            i8 = R.id.tv_reviews_count_app_detail;
                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_reviews_count_app_detail);
                                                            if (textView7 != null) {
                                                                i8 = R.id.tv_reviews_title_app_detail;
                                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_reviews_title_app_detail);
                                                                if (textView8 != null) {
                                                                    return new C1378k(linearLayout, linearLayout, linearLayout2, findChildViewById, findChildViewById2, findChildViewById3, findChildViewById4, findChildViewById5, findChildViewById6, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8);
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

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f10702a;
    }
}
