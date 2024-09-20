package o5;

import E4.j;
import X4.C1496f;
import X4.C1498h;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3307A;

/* renamed from: o5.x, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3579x extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private final Context f36900a;

    /* renamed from: b, reason: collision with root package name */
    private final ImageView f36901b;

    /* renamed from: c, reason: collision with root package name */
    private final TextView f36902c;

    /* renamed from: d, reason: collision with root package name */
    private final TextView f36903d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3579x(View itemView, Context context) {
        super(itemView);
        AbstractC3159y.i(itemView, "itemView");
        AbstractC3159y.i(context, "context");
        this.f36900a = context;
        View findViewById = itemView.findViewById(R.id.iv_logo_app);
        AbstractC3159y.h(findViewById, "itemView.findViewById(R.id.iv_logo_app)");
        this.f36901b = (ImageView) findViewById;
        View findViewById2 = itemView.findViewById(R.id.tv_app_name);
        AbstractC3159y.h(findViewById2, "itemView.findViewById(R.id.tv_app_name)");
        TextView textView = (TextView) findViewById2;
        this.f36902c = textView;
        View findViewById3 = itemView.findViewById(R.id.tv_app_version);
        AbstractC3159y.h(findViewById3, "itemView.findViewById(R.id.tv_app_version)");
        TextView textView2 = (TextView) findViewById3;
        this.f36903d = textView2;
        j.a aVar = E4.j.f2272g;
        textView.setTypeface(aVar.t());
        textView2.setTypeface(aVar.u());
    }

    public final void a(C1496f c1496f) {
        if (c1496f != null) {
            this.f36901b.setImageDrawable(C3307A.f34459a.j(this.f36900a, c1496f.Q()));
            this.f36902c.setText(c1496f.I());
            this.f36903d.setText(c1496f.h0());
        }
    }

    public final void b(C1498h c1498h) {
        if (c1498h != null) {
            String m02 = c1498h.m0();
            if (m02 != null && m02.length() != 0) {
                com.squareup.picasso.s.h().l(c1498h.m0()).n(UptodownApp.f27990B.f0(this.f36900a)).i(this.f36901b);
            } else {
                this.f36901b.setImageDrawable(ContextCompat.getDrawable(this.f36900a, R.drawable.vector_app_icon_placeholder));
            }
            this.f36902c.setText(c1498h.s0());
            this.f36903d.setText(c1498h.g1());
        }
    }
}
