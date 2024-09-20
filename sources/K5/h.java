package k5;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.leanback.widget.Presenter;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class h extends Presenter.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private final ImageView f33530a;

    /* renamed from: b, reason: collision with root package name */
    private final TextView f33531b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(View view) {
        super(view);
        AbstractC3159y.i(view, "view");
        View findViewById = view.findViewById(R.id.iv_icon);
        AbstractC3159y.h(findViewById, "view.findViewById(R.id.iv_icon)");
        this.f33530a = (ImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.tv_name);
        AbstractC3159y.h(findViewById2, "view.findViewById(R.id.tv_name)");
        TextView textView = (TextView) findViewById2;
        this.f33531b = textView;
        textView.setTypeface(E4.j.f2272g.u());
    }

    public final void a(e5.b tvManageAppsItem) {
        AbstractC3159y.i(tvManageAppsItem, "tvManageAppsItem");
        this.f33531b.setText(tvManageAppsItem.c());
        this.f33530a.setImageResource(tvManageAppsItem.a());
    }
}
