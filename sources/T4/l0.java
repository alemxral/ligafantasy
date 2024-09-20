package T4;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* loaded from: classes4.dex */
public final class l0 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f10729a;

    /* renamed from: b, reason: collision with root package name */
    public final CheckBox f10730b;

    /* renamed from: c, reason: collision with root package name */
    public final EditText f10731c;

    /* renamed from: d, reason: collision with root package name */
    public final EditText f10732d;

    /* renamed from: e, reason: collision with root package name */
    public final EditText f10733e;

    /* renamed from: f, reason: collision with root package name */
    public final ImageView f10734f;

    /* renamed from: g, reason: collision with root package name */
    public final LinearLayout f10735g;

    /* renamed from: h, reason: collision with root package name */
    public final RelativeLayout f10736h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f10737i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f10738j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f10739k;

    /* renamed from: l, reason: collision with root package name */
    public final TextView f10740l;

    private l0(LinearLayout linearLayout, CheckBox checkBox, EditText editText, EditText editText2, EditText editText3, ImageView imageView, LinearLayout linearLayout2, RelativeLayout relativeLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f10729a = linearLayout;
        this.f10730b = checkBox;
        this.f10731c = editText;
        this.f10732d = editText2;
        this.f10733e = editText3;
        this.f10734f = imageView;
        this.f10735g = linearLayout2;
        this.f10736h = relativeLayout;
        this.f10737i = textView;
        this.f10738j = textView2;
        this.f10739k = textView3;
        this.f10740l = textView4;
    }

    public static l0 a(View view) {
        int i8 = R.id.cb_condiciones;
        CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, R.id.cb_condiciones);
        if (checkBox != null) {
            i8 = R.id.et_email_sign_up;
            EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.et_email_sign_up);
            if (editText != null) {
                i8 = R.id.et_pass_sign_up;
                EditText editText2 = (EditText) ViewBindings.findChildViewById(view, R.id.et_pass_sign_up);
                if (editText2 != null) {
                    i8 = R.id.et_user_sign_up;
                    EditText editText3 = (EditText) ViewBindings.findChildViewById(view, R.id.et_user_sign_up);
                    if (editText3 != null) {
                        i8 = R.id.iv_google;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_google);
                        if (imageView != null) {
                            LinearLayout linearLayout = (LinearLayout) view;
                            i8 = R.id.rl_google_login;
                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_google_login);
                            if (relativeLayout != null) {
                                i8 = R.id.tv_already_signed_up;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_already_signed_up);
                                if (textView != null) {
                                    i8 = R.id.tv_continue_with_login;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_continue_with_login);
                                    if (textView2 != null) {
                                        i8 = R.id.tv_login_google;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_login_google);
                                        if (textView3 != null) {
                                            i8 = R.id.tv_sign_up;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_sign_up);
                                            if (textView4 != null) {
                                                return new l0(linearLayout, checkBox, editText, editText2, editText3, imageView, linearLayout, relativeLayout, textView, textView2, textView3, textView4);
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
        return this.f10729a;
    }
}
