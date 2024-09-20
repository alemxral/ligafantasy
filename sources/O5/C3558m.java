package o5;

import E4.j;
import W4.InterfaceC1478a;
import W4.InterfaceC1481d;
import X4.C1498h;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.uptodown.R;
import com.uptodown.util.views.CropImageView;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: o5.m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3558m extends AbstractC3548h {

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC1481d f36811b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1478a f36812c;

    /* renamed from: d, reason: collision with root package name */
    private CropImageView f36813d;

    /* renamed from: e, reason: collision with root package name */
    private final ProgressBar f36814e;

    /* renamed from: f, reason: collision with root package name */
    private ImageView f36815f;

    /* renamed from: g, reason: collision with root package name */
    private TextView f36816g;

    /* renamed from: h, reason: collision with root package name */
    private TextView f36817h;

    /* renamed from: i, reason: collision with root package name */
    private final TextView f36818i;

    /* renamed from: j, reason: collision with root package name */
    private final TextView f36819j;

    /* renamed from: k, reason: collision with root package name */
    private final LinearLayout f36820k;

    /* renamed from: l, reason: collision with root package name */
    private TextView f36821l;

    /* renamed from: m, reason: collision with root package name */
    private String f36822m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3558m(View itemView, InterfaceC1481d listener, InterfaceC1478a actionsClickListener, Context context) {
        super(itemView, context);
        AbstractC3159y.i(itemView, "itemView");
        AbstractC3159y.i(listener, "listener");
        AbstractC3159y.i(actionsClickListener, "actionsClickListener");
        AbstractC3159y.i(context, "context");
        this.f36811b = listener;
        this.f36812c = actionsClickListener;
        View findViewById = itemView.findViewById(R.id.iv_featured);
        AbstractC3159y.h(findViewById, "itemView.findViewById(R.id.iv_featured)");
        this.f36813d = (CropImageView) findViewById;
        View findViewById2 = itemView.findViewById(R.id.pb_progress_card);
        AbstractC3159y.h(findViewById2, "itemView.findViewById(R.id.pb_progress_card)");
        this.f36814e = (ProgressBar) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.iv_logo_card);
        AbstractC3159y.h(findViewById3, "itemView.findViewById(R.id.iv_logo_card)");
        this.f36815f = (ImageView) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.tv_titulo_card);
        AbstractC3159y.h(findViewById4, "itemView.findViewById(R.id.tv_titulo_card)");
        this.f36816g = (TextView) findViewById4;
        View findViewById5 = itemView.findViewById(R.id.tv_resumen_card);
        AbstractC3159y.h(findViewById5, "itemView.findViewById(R.id.tv_resumen_card)");
        this.f36817h = (TextView) findViewById5;
        View findViewById6 = itemView.findViewById(R.id.tv_progress_card);
        AbstractC3159y.h(findViewById6, "itemView.findViewById(R.id.tv_progress_card)");
        TextView textView = (TextView) findViewById6;
        this.f36818i = textView;
        View findViewById7 = itemView.findViewById(R.id.tv_verified_card);
        AbstractC3159y.h(findViewById7, "itemView.findViewById(R.id.tv_verified_card)");
        TextView textView2 = (TextView) findViewById7;
        this.f36819j = textView2;
        View findViewById8 = itemView.findViewById(R.id.ll_progress_card);
        AbstractC3159y.h(findViewById8, "itemView.findViewById(R.id.ll_progress_card)");
        this.f36820k = (LinearLayout) findViewById8;
        View findViewById9 = itemView.findViewById(R.id.tv_status_card);
        AbstractC3159y.h(findViewById9, "itemView.findViewById(R.id.tv_status_card)");
        this.f36821l = (TextView) findViewById9;
        TextView textView3 = this.f36816g;
        j.a aVar = E4.j.f2272g;
        textView3.setTypeface(aVar.t());
        this.f36817h.setTypeface(aVar.u());
        this.f36821l.setTypeface(aVar.u());
        textView.setTypeface(aVar.u());
        textView2.setTypeface(aVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(C3558m this$0, C1498h app, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(app, "$app");
        this$0.f36812c.a(app, -1);
        return true;
    }

    public final void m(final C1498h app) {
        AbstractC3159y.i(app, "app");
        this.f36822m = app.y0();
        com.squareup.picasso.s.h().l(app.e0()).l(R.color.main_blue).i(this.f36813d);
        View itemView = this.itemView;
        AbstractC3159y.h(itemView, "itemView");
        c(itemView, this.f36811b, app);
        i(app, this.f36816g, this.f36817h);
        h(this.f36815f, app.l0());
        e(app, this.f36814e, this.f36815f, this.f36817h, this.f36818i, this.f36821l, this.f36820k);
        this.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: o5.l
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean n8;
                n8 = C3558m.n(C3558m.this, app, view);
                return n8;
            }
        });
    }

    public final String o() {
        return this.f36822m;
    }
}
