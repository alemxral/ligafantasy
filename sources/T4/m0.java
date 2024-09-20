package T4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* loaded from: classes4.dex */
public final class m0 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f10748a;

    /* renamed from: b, reason: collision with root package name */
    public final EditText f10749b;

    /* renamed from: c, reason: collision with root package name */
    public final EditText f10750c;

    /* renamed from: d, reason: collision with root package name */
    public final K f10751d;

    /* renamed from: e, reason: collision with root package name */
    public final Toolbar f10752e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f10753f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f10754g;

    private m0(RelativeLayout relativeLayout, EditText editText, EditText editText2, K k8, Toolbar toolbar, TextView textView, TextView textView2) {
        this.f10748a = relativeLayout;
        this.f10749b = editText;
        this.f10750c = editText2;
        this.f10751d = k8;
        this.f10752e = toolbar;
        this.f10753f = textView;
        this.f10754g = textView2;
    }

    public static m0 a(View view) {
        int i8 = R.id.et_email_suggestions;
        EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.et_email_suggestions);
        if (editText != null) {
            i8 = R.id.et_msg_suggestions;
            EditText editText2 = (EditText) ViewBindings.findChildViewById(view, R.id.et_msg_suggestions);
            if (editText2 != null) {
                i8 = R.id.loading_view_suggestions;
                View findChildViewById = ViewBindings.findChildViewById(view, R.id.loading_view_suggestions);
                if (findChildViewById != null) {
                    K a8 = K.a(findChildViewById);
                    i8 = R.id.toolbar_suggestions;
                    Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, R.id.toolbar_suggestions);
                    if (toolbar != null) {
                        i8 = R.id.tv_send_suggestions;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_send_suggestions);
                        if (textView != null) {
                            i8 = R.id.tv_title_suggestions;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title_suggestions);
                            if (textView2 != null) {
                                return new m0((RelativeLayout) view, editText, editText2, a8, toolbar, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static m0 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static m0 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.suggestions, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f10748a;
    }
}
