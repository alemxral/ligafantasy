package o5;

import E4.j;
import W4.InterfaceC1478a;
import W4.InterfaceC1481d;
import W4.InterfaceC1482e;
import X4.C1498h;
import X4.C1503m;
import X4.C1505o;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.workers.DownloadApkWorker;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3319g;
import l5.C3326n;
import n5.C3475c;

/* renamed from: o5.v0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3576v0 extends AbstractC3548h {

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1481d f36877b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1482e f36878c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC1478a f36879d;

    /* renamed from: e, reason: collision with root package name */
    private Context f36880e;

    /* renamed from: f, reason: collision with root package name */
    private RelativeLayout f36881f;

    /* renamed from: g, reason: collision with root package name */
    private ImageView f36882g;

    /* renamed from: h, reason: collision with root package name */
    private TextView f36883h;

    /* renamed from: i, reason: collision with root package name */
    private TextView f36884i;

    /* renamed from: j, reason: collision with root package name */
    private TextView f36885j;

    /* renamed from: k, reason: collision with root package name */
    private TextView f36886k;

    /* renamed from: l, reason: collision with root package name */
    private TextView f36887l;

    /* renamed from: m, reason: collision with root package name */
    private TextView f36888m;

    /* renamed from: n, reason: collision with root package name */
    private LinearLayout f36889n;

    /* renamed from: o, reason: collision with root package name */
    private LinearLayout f36890o;

    /* renamed from: p, reason: collision with root package name */
    private TextView f36891p;

    /* renamed from: q, reason: collision with root package name */
    private ProgressBar f36892q;

    /* renamed from: r, reason: collision with root package name */
    private TextView f36893r;

    /* renamed from: s, reason: collision with root package name */
    private TextView f36894s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3576v0(View itemView, InterfaceC1481d listener, InterfaceC1482e topItemsListener, InterfaceC1478a actionsClickListener, Context context) {
        super(itemView, context);
        AbstractC3159y.i(itemView, "itemView");
        AbstractC3159y.i(listener, "listener");
        AbstractC3159y.i(topItemsListener, "topItemsListener");
        AbstractC3159y.i(actionsClickListener, "actionsClickListener");
        AbstractC3159y.i(context, "context");
        this.f36877b = listener;
        this.f36878c = topItemsListener;
        this.f36879d = actionsClickListener;
        this.f36880e = context;
        View findViewById = itemView.findViewById(R.id.rl_app_info_top_by_cat_item);
        AbstractC3159y.h(findViewById, "itemView.findViewById(R.…app_info_top_by_cat_item)");
        this.f36881f = (RelativeLayout) findViewById;
        View findViewById2 = itemView.findViewById(R.id.iv_logo_app_info_top_by_cat_item);
        AbstractC3159y.h(findViewById2, "itemView.findViewById(R.…app_info_top_by_cat_item)");
        this.f36882g = (ImageView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.tv_name_app_info_top_by_cat_item);
        AbstractC3159y.h(findViewById3, "itemView.findViewById(R.…app_info_top_by_cat_item)");
        this.f36883h = (TextView) findViewById3;
        this.f36884i = (TextView) itemView.findViewById(R.id.tv_number_app_info_top_by_cat_item);
        View findViewById4 = itemView.findViewById(R.id.tv_desc_app_info_top_by_cat_item);
        AbstractC3159y.h(findViewById4, "itemView.findViewById(R.…app_info_top_by_cat_item)");
        this.f36885j = (TextView) findViewById4;
        View findViewById5 = itemView.findViewById(R.id.tv_action_app_info_top_by_cat_info_item);
        AbstractC3159y.h(findViewById5, "itemView.findViewById(R.…nfo_top_by_cat_info_item)");
        this.f36886k = (TextView) findViewById5;
        this.f36887l = (TextView) itemView.findViewById(R.id.tv_valoration_app_info_top_by_cat_info_item);
        this.f36888m = (TextView) itemView.findViewById(R.id.tv_downloads_counter_app_info_top_by_cat_info_item);
        this.f36889n = (LinearLayout) itemView.findViewById(R.id.ll_info_app_info_top_by_cat_info_item);
        View findViewById6 = itemView.findViewById(R.id.ll_download_app_info_top_by_cat_info_item);
        AbstractC3159y.h(findViewById6, "itemView.findViewById(R.…nfo_top_by_cat_info_item)");
        this.f36890o = (LinearLayout) findViewById6;
        View findViewById7 = itemView.findViewById(R.id.tv_progress_app_info_top_by_cat_info_item);
        AbstractC3159y.h(findViewById7, "itemView.findViewById(R.…nfo_top_by_cat_info_item)");
        this.f36891p = (TextView) findViewById7;
        View findViewById8 = itemView.findViewById(R.id.pb_progress_app_info_top_by_cat_item);
        AbstractC3159y.h(findViewById8, "itemView.findViewById(R.…app_info_top_by_cat_item)");
        this.f36892q = (ProgressBar) findViewById8;
        View findViewById9 = itemView.findViewById(R.id.tv_verified_app_info_top_by_cat_info_item);
        AbstractC3159y.h(findViewById9, "itemView.findViewById(R.…nfo_top_by_cat_info_item)");
        this.f36893r = (TextView) findViewById9;
        this.f36894s = (TextView) itemView.findViewById(R.id.tv_badge_promoted);
        TextView textView = this.f36883h;
        j.a aVar = E4.j.f2272g;
        textView.setTypeface(aVar.t());
        TextView textView2 = this.f36884i;
        if (textView2 != null) {
            textView2.setTypeface(aVar.t());
        }
        TextView textView3 = this.f36887l;
        if (textView3 != null) {
            textView3.setTypeface(aVar.u());
        }
        TextView textView4 = this.f36888m;
        if (textView4 != null) {
            textView4.setTypeface(aVar.u());
        }
        this.f36885j.setTypeface(aVar.u());
        this.f36886k.setTypeface(aVar.t());
        this.f36893r.setTypeface(aVar.u());
        this.f36891p.setTypeface(aVar.u());
        TextView textView5 = this.f36894s;
        if (textView5 != null) {
            textView5.setTypeface(aVar.u());
        }
    }

    private final void A(int i8, long j8, final C1498h c1498h, final int i9) {
        C3475c.f36184a.e(this.f36892q, this.f36882g);
        LinearLayout linearLayout = this.f36889n;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        this.f36886k.setText(R.string.option_button_cancel);
        this.f36886k.setBackground(ContextCompat.getDrawable(this.f36880e, R.drawable.shape_stroke_blue_primary));
        this.f36886k.setTextColor(ContextCompat.getColor(this.f36880e, R.color.blue_primary));
        this.f36886k.setOnClickListener(new View.OnClickListener() { // from class: o5.t0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3576v0.B(C3576v0.this, c1498h, i9, view);
            }
        });
        this.f36885j.setVisibility(8);
        this.f36890o.setVisibility(0);
        if (i8 == 0) {
            this.f36891p.setText(this.f36880e.getString(R.string.status_download_update_pending));
            this.f36892q.setIndeterminate(true);
        } else {
            this.f36892q.setIndeterminate(false);
            this.f36891p.setText(this.f36880e.getString(R.string.percent_of_total_size, Integer.valueOf(i8), new N4.g().c(j8)));
            this.f36892q.setProgress(i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(C3576v0 this$0, C1498h app, int i8, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(app, "$app");
        this$0.f36878c.b(app, i8);
    }

    private final void C(final C1498h c1498h, final int i8) {
        w(c1498h, i8);
        this.f36886k.setText(R.string.option_button_install);
        this.f36886k.setOnClickListener(new View.OnClickListener() { // from class: o5.r0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3576v0.D(C3576v0.this, c1498h, i8, view);
            }
        });
        this.f36886k.setBackground(ContextCompat.getDrawable(this.f36880e, R.drawable.ripple_install_button));
        this.f36886k.setTextColor(ContextCompat.getColor(this.f36880e, R.color.white));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(C3576v0 this$0, C1498h app, int i8, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(app, "$app");
        this$0.f36878c.a(app, i8);
        this$0.E();
    }

    private final void E() {
        C3475c.f36184a.e(this.f36892q, this.f36882g);
        LinearLayout linearLayout = this.f36889n;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        this.f36886k.setVisibility(8);
        this.f36885j.setVisibility(8);
        this.f36890o.setVisibility(0);
        this.f36891p.setText(this.f36880e.getString(R.string.installing));
        this.f36892q.setIndeterminate(true);
    }

    private final void F(C1498h c1498h, int i8) {
        w(c1498h, i8);
        this.f36886k.setText(R.string.open);
        this.f36886k.setBackground(ContextCompat.getDrawable(this.f36880e, R.drawable.ripple_blue_primary_button));
        this.f36886k.setTextColor(ContextCompat.getColor(this.f36880e, R.color.white));
    }

    private final void G(final C1498h c1498h, final int i8) {
        w(c1498h, i8);
        this.f36886k.setText(this.f36880e.getString(R.string.status_download_update));
        this.f36886k.setOnClickListener(new View.OnClickListener() { // from class: o5.u0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3576v0.H(C3576v0.this, c1498h, i8, view);
            }
        });
        this.f36886k.setTextColor(ContextCompat.getColor(this.f36880e, R.color.white));
        this.f36886k.setBackground(ContextCompat.getDrawable(this.f36880e, R.drawable.ripple_install_button));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(C3576v0 this$0, C1498h app, int i8, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(app, "$app");
        this$0.f36878c.a(app, i8);
        this$0.E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean s(C3576v0 this$0, C1498h app, int i8, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(app, "$app");
        this$0.f36879d.a(app, i8);
        return true;
    }

    private final String t(long j8) {
        if (j8 < 1000) {
            return String.valueOf(j8);
        }
        if (j8 < 1000000) {
            kotlin.jvm.internal.Y y8 = kotlin.jvm.internal.Y.f33752a;
            String format = String.format(Locale.getDefault(), "%dK", Arrays.copyOf(new Object[]{Integer.valueOf(((int) j8) / 1000)}, 1));
            AbstractC3159y.h(format, "format(...)");
            return format;
        }
        kotlin.jvm.internal.Y y9 = kotlin.jvm.internal.Y.f33752a;
        String format2 = String.format(Locale.getDefault(), "%dM", Arrays.copyOf(new Object[]{Integer.valueOf(((int) j8) / 1000000)}, 1));
        AbstractC3159y.h(format2, "format(...)");
        return format2;
    }

    private final void u(final C1498h c1498h, final int i8) {
        this.f36886k.setOnClickListener(new View.OnClickListener() { // from class: o5.q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3576v0.v(C3576v0.this, c1498h, i8, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(C3576v0 this$0, C1498h app, int i8, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(app, "$app");
        this$0.f36878c.a(app, i8);
    }

    private final void w(final C1498h c1498h, final int i8) {
        C3475c.f36184a.c(this.f36892q, this.f36882g);
        this.f36886k.setOnClickListener(new View.OnClickListener() { // from class: o5.s0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3576v0.x(C3576v0.this, c1498h, i8, view);
            }
        });
        this.f36890o.setVisibility(8);
        this.f36885j.setVisibility(0);
        this.f36886k.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(C3576v0 this$0, C1498h app, int i8, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(app, "$app");
        this$0.f36878c.a(app, i8);
    }

    private final void y(C1498h c1498h, int i8) {
        X4.O o8;
        boolean z8;
        boolean z9;
        String y02;
        u(c1498h, i8);
        C3326n a8 = C3326n.f34490t.a(this.f36880e);
        a8.a();
        C1505o Z7 = a8.Z(String.valueOf(c1498h.f0()));
        if (Z7 == null && (y02 = c1498h.y0()) != null && y02.length() != 0) {
            String y03 = c1498h.y0();
            AbstractC3159y.f(y03);
            Z7 = a8.a0(y03);
        }
        String y04 = c1498h.y0();
        if (y04 != null && y04.length() != 0) {
            String y05 = c1498h.y0();
            AbstractC3159y.f(y05);
            o8 = a8.u0(y05);
        } else {
            o8 = null;
        }
        boolean r8 = new C3319g().r(c1498h.y0(), this.f36880e);
        boolean z10 = true;
        if (UptodownApp.f27990B.V("downloadApkWorker", this.f36880e) && DownloadApkWorker.f29987k.c(c1498h.i())) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (Z7 != null && Z7.I() == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (Z7 == null || !Z7.h0()) {
            z10 = false;
        }
        if (Z7 != null && (z8 || z10)) {
            A(Z7.Z(), Z7.a0(), c1498h, i8);
        } else if (o8 != null && o8.b()) {
            A(o8.o(), o8.s(), c1498h, i8);
        } else if (r8) {
            if (o8 != null) {
                if (o8.o() != 100 && !z9) {
                    z(c1498h, i8);
                } else {
                    G(c1498h, i8);
                }
            } else {
                F(c1498h, i8);
            }
        } else if (z9) {
            C(c1498h, i8);
        } else {
            z(c1498h, i8);
        }
        a8.g();
    }

    private final void z(C1498h c1498h, int i8) {
        w(c1498h, i8);
        this.f36886k.setText(R.string.updates_button_download_app);
        this.f36886k.setBackground(ContextCompat.getDrawable(this.f36880e, R.drawable.ripple_blue_primary_button));
        this.f36886k.setTextColor(ContextCompat.getColor(this.f36880e, R.color.white));
    }

    public final void r(final C1498h app, int i8, final int i9) {
        AbstractC3159y.i(app, "app");
        this.f36881f.setOnLongClickListener(new View.OnLongClickListener() { // from class: o5.p0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean s8;
                s8 = C3576v0.s(C3576v0.this, app, i9, view);
                return s8;
            }
        });
        c(this.f36881f, this.f36877b, app);
        TextView textView = this.f36884i;
        if (textView != null) {
            textView.setText(this.f36880e.getResources().getString(R.string.top_index_format, String.valueOf(i8)));
        }
        if (app.F0() > 0 && app.Q() > 0) {
            TextView textView2 = this.f36887l;
            if (textView2 != null) {
                textView2.setText(String.valueOf(app.F0() / 10.0d));
            }
            TextView textView3 = this.f36888m;
            if (textView3 != null) {
                textView3.setText(this.f36880e.getString(R.string.downloads_counter_multiple, t(app.Q())));
            }
            LinearLayout linearLayout = this.f36889n;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
        } else {
            LinearLayout linearLayout2 = this.f36889n;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(4);
            }
        }
        this.f36883h.setText(app.s0());
        String s8 = app.s();
        if (s8 != null && s8.length() != 0) {
            TextView textView4 = this.f36885j;
            C1503m.a aVar = C1503m.f12631f;
            String s9 = app.s();
            AbstractC3159y.f(s9);
            textView4.setText(aVar.c(new SpannableStringBuilder(s9)));
        } else {
            this.f36885j.setText(app.k());
        }
        h(this.f36882g, app.l0());
        y(app, i9);
    }
}
