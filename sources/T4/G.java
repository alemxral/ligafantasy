package T4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* loaded from: classes4.dex */
public final class G implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f10098a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f10099b;

    /* renamed from: c, reason: collision with root package name */
    public final RelativeLayout f10100c;

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f10101d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f10102e;

    private G(LinearLayout linearLayout, ImageView imageView, RelativeLayout relativeLayout, RecyclerView recyclerView, TextView textView) {
        this.f10098a = linearLayout;
        this.f10099b = imageView;
        this.f10100c = relativeLayout;
        this.f10101d = recyclerView;
        this.f10102e = textView;
    }

    public static G a(View view) {
        int i8 = R.id.iv_more_home_recycler_view_top;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_more_home_recycler_view_top);
        if (imageView != null) {
            i8 = R.id.rl_title_home_recycler_view_top;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_title_home_recycler_view_top);
            if (relativeLayout != null) {
                i8 = R.id.rv_home_recycler_view_top;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_home_recycler_view_top);
                if (recyclerView != null) {
                    i8 = R.id.tv_title_home_recycler_view_top;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title_home_recycler_view_top);
                    if (textView != null) {
                        return new G((LinearLayout) view, imageView, relativeLayout, recyclerView, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static G c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static G d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.home_recycler_view_top, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f10098a;
    }
}
