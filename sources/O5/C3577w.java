package o5;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: o5.w, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3577w extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private ImageView f36895a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f36896b;

    /* renamed from: c, reason: collision with root package name */
    private ProgressBar f36897c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3577w(View itemView) {
        super(itemView);
        AbstractC3159y.i(itemView, "itemView");
        View findViewById = itemView.findViewById(R.id.iv_icon_fqi);
        AbstractC3159y.h(findViewById, "itemView.findViewById(R.id.iv_icon_fqi)");
        this.f36895a = (ImageView) findViewById;
        View findViewById2 = itemView.findViewById(R.id.tv_counter_fqi);
        AbstractC3159y.h(findViewById2, "itemView.findViewById(R.id.tv_counter_fqi)");
        this.f36896b = (TextView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.pb_fqi);
        AbstractC3159y.h(findViewById3, "itemView.findViewById(R.id.pb_fqi)");
        this.f36897c = (ProgressBar) findViewById3;
        this.f36896b.setTypeface(E4.j.f2272g.t());
    }

    public final ImageView a() {
        return this.f36895a;
    }

    public final ProgressBar b() {
        return this.f36897c;
    }

    public final TextView c() {
        return this.f36896b;
    }
}
