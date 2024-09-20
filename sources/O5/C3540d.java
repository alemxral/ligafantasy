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
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: o5.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3540d extends AbstractC3548h {

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1481d f36736b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC1478a f36737c;

    /* renamed from: d, reason: collision with root package name */
    private RelativeLayout f36738d;

    /* renamed from: e, reason: collision with root package name */
    private ImageView f36739e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f36740f;

    /* renamed from: g, reason: collision with root package name */
    private TextView f36741g;

    /* renamed from: h, reason: collision with root package name */
    private TextView f36742h;

    /* renamed from: i, reason: collision with root package name */
    private final ProgressBar f36743i;

    /* renamed from: j, reason: collision with root package name */
    private final TextView f36744j;

    /* renamed from: k, reason: collision with root package name */
    private final TextView f36745k;

    /* renamed from: l, reason: collision with root package name */
    private final LinearLayout f36746l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3540d(View itemView, InterfaceC1481d listener, InterfaceC1478a interfaceC1478a, Context context) {
        super(itemView, context);
        AbstractC3159y.i(itemView, "itemView");
        AbstractC3159y.i(listener, "listener");
        AbstractC3159y.i(context, "context");
        this.f36736b = listener;
        this.f36737c = interfaceC1478a;
        View findViewById = itemView.findViewById(R.id.rl_app_info_item);
        AbstractC3159y.h(findViewById, "itemView.findViewById(R.id.rl_app_info_item)");
        this.f36738d = (RelativeLayout) findViewById;
        View findViewById2 = itemView.findViewById(R.id.iv_logo_app_info_item);
        AbstractC3159y.h(findViewById2, "itemView.findViewById(R.id.iv_logo_app_info_item)");
        this.f36739e = (ImageView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.tv_name_app_info_item);
        AbstractC3159y.h(findViewById3, "itemView.findViewById(R.id.tv_name_app_info_item)");
        this.f36740f = (TextView) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.tv_desc_app_info_item);
        AbstractC3159y.h(findViewById4, "itemView.findViewById(R.id.tv_desc_app_info_item)");
        this.f36741g = (TextView) findViewById4;
        View findViewById5 = itemView.findViewById(R.id.tv_status_app_info_item);
        AbstractC3159y.h(findViewById5, "itemView.findViewById(R.….tv_status_app_info_item)");
        this.f36742h = (TextView) findViewById5;
        this.f36743i = (ProgressBar) itemView.findViewById(R.id.pb_progress_app_info_item);
        TextView textView = (TextView) itemView.findViewById(R.id.tv_progress_app_info_item);
        this.f36744j = textView;
        TextView textView2 = (TextView) itemView.findViewById(R.id.tv_verified_app_info_item);
        this.f36745k = textView2;
        this.f36746l = (LinearLayout) itemView.findViewById(R.id.ll_progress_app_info_item);
        TextView textView3 = this.f36740f;
        j.a aVar = E4.j.f2272g;
        textView3.setTypeface(aVar.t());
        this.f36741g.setTypeface(aVar.u());
        this.f36742h.setTypeface(aVar.u());
        if (textView != null) {
            textView.setTypeface(aVar.u());
        }
        if (textView2 != null) {
            textView2.setTypeface(aVar.u());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(C3540d this$0, C1498h app, int i8, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(app, "$app");
        InterfaceC1478a interfaceC1478a = this$0.f36737c;
        if (interfaceC1478a != null) {
            interfaceC1478a.a(app, i8);
            return true;
        }
        return true;
    }

    public final void m(final C1498h app, final int i8) {
        TextView textView;
        LinearLayout linearLayout;
        AbstractC3159y.i(app, "app");
        c(this.f36738d, this.f36736b, app);
        this.f36738d.setOnLongClickListener(new View.OnLongClickListener() { // from class: o5.c
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean n8;
                n8 = C3540d.n(C3540d.this, app, i8, view);
                return n8;
            }
        });
        i(app, this.f36740f, this.f36741g);
        h(this.f36739e, app.m0());
        ProgressBar progressBar = this.f36743i;
        if (progressBar != null && (textView = this.f36744j) != null && (linearLayout = this.f36746l) != null) {
            e(app, progressBar, this.f36739e, this.f36741g, textView, this.f36742h, linearLayout);
        } else {
            g(app.y0(), this.f36742h, this.f36741g);
        }
    }
}
