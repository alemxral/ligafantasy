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

/* renamed from: o5.x0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3580x0 extends AbstractC3548h {

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1481d f36904b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1478a f36905c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f36906d;

    /* renamed from: e, reason: collision with root package name */
    private RelativeLayout f36907e;

    /* renamed from: f, reason: collision with root package name */
    private ImageView f36908f;

    /* renamed from: g, reason: collision with root package name */
    private final ProgressBar f36909g;

    /* renamed from: h, reason: collision with root package name */
    private TextView f36910h;

    /* renamed from: i, reason: collision with root package name */
    private TextView f36911i;

    /* renamed from: j, reason: collision with root package name */
    private TextView f36912j;

    /* renamed from: k, reason: collision with root package name */
    private TextView f36913k;

    /* renamed from: l, reason: collision with root package name */
    private final TextView f36914l;

    /* renamed from: m, reason: collision with root package name */
    private final TextView f36915m;

    /* renamed from: n, reason: collision with root package name */
    private final LinearLayout f36916n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3580x0(View itemView, InterfaceC1481d listener, InterfaceC1478a interfaceC1478a, Context context) {
        super(itemView, context);
        AbstractC3159y.i(itemView, "itemView");
        AbstractC3159y.i(listener, "listener");
        AbstractC3159y.i(context, "context");
        this.f36904b = listener;
        this.f36905c = interfaceC1478a;
        this.f36906d = context;
        View findViewById = itemView.findViewById(R.id.rl_app_info_top_by_cat_small_item);
        AbstractC3159y.h(findViewById, "itemView.findViewById(R.…fo_top_by_cat_small_item)");
        this.f36907e = (RelativeLayout) findViewById;
        View findViewById2 = itemView.findViewById(R.id.iv_logo_app_info_top_by_cat_small_item);
        AbstractC3159y.h(findViewById2, "itemView.findViewById(R.…fo_top_by_cat_small_item)");
        this.f36908f = (ImageView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.pb_progress_app_info_top_by_cat_small_item);
        AbstractC3159y.h(findViewById3, "itemView.findViewById(R.…fo_top_by_cat_small_item)");
        this.f36909g = (ProgressBar) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.tv_name_app_info_top_by_cat_small_item);
        AbstractC3159y.h(findViewById4, "itemView.findViewById(R.…fo_top_by_cat_small_item)");
        this.f36910h = (TextView) findViewById4;
        this.f36911i = (TextView) itemView.findViewById(R.id.tv_number_app_info_top_by_cat_small_item);
        View findViewById5 = itemView.findViewById(R.id.tv_desc_app_info_top_by_cat_small_item);
        AbstractC3159y.h(findViewById5, "itemView.findViewById(R.…fo_top_by_cat_small_item)");
        this.f36912j = (TextView) findViewById5;
        View findViewById6 = itemView.findViewById(R.id.tv_status_app_info_top_by_cat_small_item);
        AbstractC3159y.h(findViewById6, "itemView.findViewById(R.…fo_top_by_cat_small_item)");
        this.f36913k = (TextView) findViewById6;
        View findViewById7 = itemView.findViewById(R.id.tv_progress_app_info_top_by_cat_small_item);
        AbstractC3159y.h(findViewById7, "itemView.findViewById(R.…fo_top_by_cat_small_item)");
        TextView textView = (TextView) findViewById7;
        this.f36914l = textView;
        View findViewById8 = itemView.findViewById(R.id.tv_verified_app_info_top_by_cat_small_item);
        AbstractC3159y.h(findViewById8, "itemView.findViewById(R.…fo_top_by_cat_small_item)");
        TextView textView2 = (TextView) findViewById8;
        this.f36915m = textView2;
        View findViewById9 = itemView.findViewById(R.id.ll_progress_app_info_top_by_cat_small_item);
        AbstractC3159y.h(findViewById9, "itemView.findViewById(R.…fo_top_by_cat_small_item)");
        this.f36916n = (LinearLayout) findViewById9;
        TextView textView3 = this.f36910h;
        j.a aVar = E4.j.f2272g;
        textView3.setTypeface(aVar.t());
        TextView textView4 = this.f36911i;
        if (textView4 != null) {
            textView4.setTypeface(aVar.t());
        }
        this.f36912j.setTypeface(aVar.u());
        this.f36913k.setTypeface(aVar.u());
        textView.setTypeface(aVar.u());
        textView2.setTypeface(aVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(C3580x0 this$0, C1498h app, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(app, "$app");
        InterfaceC1478a interfaceC1478a = this$0.f36905c;
        if (interfaceC1478a != null) {
            interfaceC1478a.a(app, this$0.getPosition());
            return true;
        }
        return true;
    }

    public final void m(final C1498h app, int i8) {
        AbstractC3159y.i(app, "app");
        c(this.f36907e, this.f36904b, app);
        this.f36907e.setOnLongClickListener(new View.OnLongClickListener() { // from class: o5.w0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean n8;
                n8 = C3580x0.n(C3580x0.this, app, view);
                return n8;
            }
        });
        if (i8 > 0) {
            TextView textView = this.f36911i;
            if (textView != null) {
                textView.setText(this.itemView.getContext().getResources().getString(R.string.top_index_format, String.valueOf(i8)));
            }
            TextView textView2 = this.f36911i;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
        } else {
            TextView textView3 = this.f36911i;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
        }
        i(app, this.f36910h, this.f36912j);
        h(this.f36908f, app.m0());
        e(app, this.f36909g, this.f36908f, this.f36912j, this.f36914l, this.f36913k, this.f36916n);
    }
}
