package o5;

import E4.j;
import X4.C1496f;
import X4.C1505o;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.workers.DownloadApkWorker;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3307A;
import l5.C3326n;
import l5.C3329q;

/* loaded from: classes5.dex */
public final class L0 extends AbstractC3554k {

    /* renamed from: d, reason: collision with root package name */
    private final W4.E f36584d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f36585e;

    /* renamed from: f, reason: collision with root package name */
    private final ImageView f36586f;

    /* renamed from: g, reason: collision with root package name */
    private final TextView f36587g;

    /* renamed from: h, reason: collision with root package name */
    private final ProgressBar f36588h;

    /* renamed from: i, reason: collision with root package name */
    private final TextView f36589i;

    /* renamed from: j, reason: collision with root package name */
    private final TextView f36590j;

    /* renamed from: k, reason: collision with root package name */
    private final TextView f36591k;

    /* renamed from: l, reason: collision with root package name */
    private final RelativeLayout f36592l;

    /* renamed from: m, reason: collision with root package name */
    private final TextView f36593m;

    /* renamed from: n, reason: collision with root package name */
    private final ImageView f36594n;

    /* renamed from: o, reason: collision with root package name */
    private final RelativeLayout f36595o;

    /* renamed from: p, reason: collision with root package name */
    private final TextView f36596p;

    /* renamed from: q, reason: collision with root package name */
    private final RelativeLayout f36597q;

    /* renamed from: r, reason: collision with root package name */
    private final RelativeLayout f36598r;

    /* renamed from: s, reason: collision with root package name */
    private final TextView f36599s;

    /* renamed from: t, reason: collision with root package name */
    private final ImageView f36600t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L0(View itemView, W4.E e8, Context context) {
        super(itemView, context);
        AbstractC3159y.i(itemView, "itemView");
        AbstractC3159y.i(context, "context");
        this.f36584d = e8;
        this.f36585e = context;
        View findViewById = itemView.findViewById(R.id.iv_icon_update_item);
        AbstractC3159y.h(findViewById, "itemView.findViewById(R.id.iv_icon_update_item)");
        this.f36586f = (ImageView) findViewById;
        View findViewById2 = itemView.findViewById(R.id.tv_name_update_item);
        AbstractC3159y.h(findViewById2, "itemView.findViewById(R.id.tv_name_update_item)");
        TextView textView = (TextView) findViewById2;
        this.f36587g = textView;
        View findViewById3 = itemView.findViewById(R.id.pb_progress_update_item);
        AbstractC3159y.h(findViewById3, "itemView.findViewById(R.….pb_progress_update_item)");
        this.f36588h = (ProgressBar) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.tv_version_update_item);
        AbstractC3159y.h(findViewById4, "itemView.findViewById(R.id.tv_version_update_item)");
        TextView textView2 = (TextView) findViewById4;
        this.f36589i = textView2;
        View findViewById5 = itemView.findViewById(R.id.tv_verified_by_uptodown_update_item);
        AbstractC3159y.h(findViewById5, "itemView.findViewById(R.…_by_uptodown_update_item)");
        TextView textView3 = (TextView) findViewById5;
        this.f36590j = textView3;
        View findViewById6 = itemView.findViewById(R.id.tv_action_update_item);
        AbstractC3159y.h(findViewById6, "itemView.findViewById(R.id.tv_action_update_item)");
        TextView textView4 = (TextView) findViewById6;
        this.f36591k = textView4;
        View findViewById7 = itemView.findViewById(R.id.rl_actions_update_item);
        AbstractC3159y.h(findViewById7, "itemView.findViewById(R.id.rl_actions_update_item)");
        this.f36592l = (RelativeLayout) findViewById7;
        View findViewById8 = itemView.findViewById(R.id.tv_excluded_update_item);
        AbstractC3159y.h(findViewById8, "itemView.findViewById(R.….tv_excluded_update_item)");
        TextView textView5 = (TextView) findViewById8;
        this.f36593m = textView5;
        View findViewById9 = itemView.findViewById(R.id.iv_version_details_update_item);
        AbstractC3159y.h(findViewById9, "itemView.findViewById(R.…sion_details_update_item)");
        this.f36594n = (ImageView) findViewById9;
        View findViewById10 = itemView.findViewById(R.id.rl_version_details_update_item);
        AbstractC3159y.h(findViewById10, "itemView.findViewById(R.…sion_details_update_item)");
        this.f36595o = (RelativeLayout) findViewById10;
        View findViewById11 = itemView.findViewById(R.id.tv_version_details_update_item);
        AbstractC3159y.h(findViewById11, "itemView.findViewById(R.…sion_details_update_item)");
        TextView textView6 = (TextView) findViewById11;
        this.f36596p = textView6;
        View findViewById12 = itemView.findViewById(R.id.rl_container_update_item);
        AbstractC3159y.h(findViewById12, "itemView.findViewById(R.…rl_container_update_item)");
        RelativeLayout relativeLayout = (RelativeLayout) findViewById12;
        this.f36597q = relativeLayout;
        View findViewById13 = itemView.findViewById(R.id.rl_cancel_update_item);
        AbstractC3159y.h(findViewById13, "itemView.findViewById(R.id.rl_cancel_update_item)");
        this.f36598r = (RelativeLayout) findViewById13;
        View findViewById14 = itemView.findViewById(R.id.tv_pending_update_item);
        AbstractC3159y.h(findViewById14, "itemView.findViewById(R.id.tv_pending_update_item)");
        TextView textView7 = (TextView) findViewById14;
        this.f36599s = textView7;
        View findViewById15 = itemView.findViewById(R.id.iv_cancel_update_item);
        AbstractC3159y.h(findViewById15, "itemView.findViewById(R.id.iv_cancel_update_item)");
        ImageView imageView = (ImageView) findViewById15;
        this.f36600t = imageView;
        relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: o5.I0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                L0.k(L0.this, view);
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() { // from class: o5.J0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                L0.l(L0.this, view);
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() { // from class: o5.K0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                L0.m(L0.this, view);
            }
        });
        j.a aVar = E4.j.f2272g;
        textView.setTypeface(aVar.t());
        textView2.setTypeface(aVar.u());
        textView3.setTypeface(aVar.u());
        textView7.setTypeface(aVar.t());
        textView6.setTypeface(aVar.u());
        textView5.setTypeface(aVar.t());
        textView4.setTypeface(aVar.t());
    }

    private final void A() {
        this.f36598r.setVisibility(8);
        this.f36591k.setText(this.f36585e.getString(R.string.updates_button_update_app));
        this.f36591k.setTextColor(ContextCompat.getColor(this.f36585e, R.color.blue_primary));
        this.f36591k.setBackground(ContextCompat.getDrawable(this.f36585e, R.drawable.ripple_download_icon_button));
        this.f36594n.setVisibility(8);
        this.f36590j.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(L0 this$0, View view) {
        int bindingAdapterPosition;
        AbstractC3159y.i(this$0, "this$0");
        if (this$0.f36584d != null && (bindingAdapterPosition = this$0.getBindingAdapterPosition()) != -1) {
            this$0.f36584d.a(bindingAdapterPosition);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(L0 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        W4.E e8 = this$0.f36584d;
        if (e8 != null) {
            e8.c(this$0.getBindingAdapterPosition());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(L0 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        W4.E e8 = this$0.f36584d;
        if (e8 != null) {
            e8.e(this$0.getBindingAdapterPosition());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(C1496f app, L0 this$0, View view) {
        AbstractC3159y.i(app, "$app");
        AbstractC3159y.i(this$0, "this$0");
        if (UptodownApp.f27990B.a0()) {
            if (!app.Y()) {
                W4.E e8 = this$0.f36584d;
                if (e8 != null) {
                    e8.b(this$0.getBindingAdapterPosition());
                    return;
                }
                return;
            }
            W4.E e9 = this$0.f36584d;
            if (e9 != null) {
                e9.f(this$0.getBindingAdapterPosition());
            }
        }
    }

    private final void p(C1496f c1496f) {
        if (c1496f.f()) {
            this.itemView.setAlpha(0.3f);
        } else {
            this.itemView.setAlpha(1.0f);
        }
    }

    private final void q() {
        this.f36596p.setVisibility(8);
        this.f36595o.setVisibility(8);
        this.f36594n.setScaleY(1.0f);
        this.f36594n.setContentDescription(this.f36585e.getString(R.string.cd_expand_version_details));
    }

    private final void r() {
        this.f36595o.setVisibility(0);
        this.f36596p.setVisibility(0);
        this.f36594n.setScaleY(-1.0f);
        this.f36594n.setContentDescription(this.f36585e.getString(R.string.cd_collapse_version_details));
    }

    private final void s() {
        this.f36599s.setVisibility(0);
        this.f36591k.setVisibility(8);
        this.f36594n.setVisibility(8);
        this.f36598r.setVisibility(0);
    }

    private final void t() {
        this.f36598r.setVisibility(8);
        this.f36594n.setVisibility(0);
        this.f36591k.setText(this.f36585e.getString(R.string.updates_button_download_app));
        this.f36591k.setTextColor(ContextCompat.getColor(this.f36585e, R.color.white));
        this.f36591k.setBackground(ContextCompat.getDrawable(this.f36585e, R.drawable.ripple_blue_primary_button));
        this.f36590j.setVisibility(8);
    }

    private final void u(C1496f c1496f) {
        if (c1496f.c0() == C1496f.c.OUTDATED) {
            this.f36591k.setVisibility(0);
        } else {
            this.f36591k.setVisibility(8);
        }
        this.f36588h.setIndeterminate(false);
    }

    private final void v() {
        this.f36598r.setVisibility(8);
        this.f36594n.setVisibility(0);
        this.f36591k.setText(this.f36585e.getString(R.string.updates_button_download_app));
        this.f36591k.setTextColor(ContextCompat.getColor(this.f36585e, R.color.white));
        this.f36591k.setBackground(ContextCompat.getDrawable(this.f36585e, R.drawable.ripple_blue_primary_button));
        this.f36590j.setVisibility(8);
    }

    private final void w() {
        this.f36599s.setVisibility(8);
        this.f36591k.setVisibility(8);
        this.f36594n.setVisibility(0);
        this.f36598r.setVisibility(0);
        this.f36589i.setVisibility(0);
        this.f36593m.setVisibility(8);
        this.f36590j.setVisibility(0);
    }

    private final void x(String str) {
        this.f36593m.setText(str);
        this.f36593m.setVisibility(0);
        this.f36591k.setVisibility(8);
        this.f36590j.setVisibility(8);
        this.f36592l.setVisibility(8);
    }

    private final void y() {
        this.f36598r.setVisibility(8);
        this.f36591k.setVisibility(8);
        this.f36589i.setVisibility(0);
        this.f36589i.setText(this.f36585e.getString(R.string.installing));
        this.f36590j.setVisibility(0);
        this.f36588h.setIndeterminate(true);
        this.f36592l.setVisibility(8);
        e(this.f36588h, this.f36586f);
    }

    private final void z() {
        this.f36598r.setVisibility(8);
        this.f36594n.setVisibility(0);
        this.f36591k.setText(this.f36585e.getString(R.string.updates_button_resume));
        this.f36591k.setTextColor(ContextCompat.getColor(this.f36585e, R.color.white));
        this.f36591k.setBackground(ContextCompat.getDrawable(this.f36585e, R.drawable.ripple_blue_primary_button));
        this.f36589i.setVisibility(0);
        this.f36590j.setVisibility(8);
    }

    public final void n(final C1496f app) {
        String str;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        AbstractC3159y.i(app, "app");
        u(app);
        p(app);
        this.f36586f.setImageDrawable(C3307A.f34459a.k(this.f36585e, app.Q(), R.drawable.vector_uptodown_logo_bag_disabled));
        this.f36587g.setText(app.I());
        C3326n a8 = C3326n.f34490t.a(this.f36585e);
        a8.a();
        String Q8 = app.Q();
        AbstractC3159y.f(Q8);
        X4.O u02 = a8.u0(Q8);
        String Q9 = app.Q();
        AbstractC3159y.f(Q9);
        C1505o a02 = a8.a0(Q9);
        a8.g();
        if (u02 != null) {
            this.f36589i.setText(u02.z());
        } else {
            this.f36589i.setText(app.h0());
        }
        K4.a h8 = E4.j.f2272g.h();
        if (h8 != null) {
            str = h8.b();
        } else {
            str = null;
        }
        if (g6.n.s(str, app.Q(), true)) {
            y();
        } else if (u02 != null) {
            if (u02.j() != null) {
                File g8 = new C3329q().g(this.f36585e);
                String j8 = u02.j();
                AbstractC3159y.f(j8);
                z8 = new File(g8, j8).exists();
            } else {
                z8 = false;
            }
            if (!z8) {
                if (u02.o() > 0) {
                    u02.X(0);
                    a8.a();
                    a8.r1(u02);
                    a8.g();
                }
                UptodownApp.a aVar = UptodownApp.f27990B;
                if (aVar.O(this.f36585e)) {
                    String Q10 = app.Q();
                    AbstractC3159y.f(Q10);
                    if (!aVar.R(Q10) && !u02.b()) {
                        if (aVar.h()) {
                            t();
                        } else {
                            v();
                        }
                    } else {
                        s();
                    }
                } else if (aVar.W("downloadApkWorker", this.f36585e)) {
                    if (DownloadApkWorker.f29987k.d(app.c(), u02.u())) {
                        if (a02 != null) {
                            this.f36589i.setText(this.itemView.getContext().getString(R.string.percent_of_total_size, Integer.valueOf(a02.Z()), new N4.g().c(a02.a0())));
                        }
                        s();
                    } else {
                        if (a02 != null && a02.h0()) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            s();
                        } else if (aVar.h()) {
                            t();
                        } else {
                            v();
                        }
                    }
                } else {
                    if (a02 != null && a02.Z() == 100) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12 && u02.o() != 100) {
                        v();
                    } else {
                        A();
                    }
                }
            } else {
                ArrayList G8 = UptodownApp.f27990B.G();
                if (G8 != null) {
                    Iterator it = G8.iterator();
                    while (it.hasNext()) {
                        if (g6.n.s(((C1496f) it.next()).Q(), u02.n(), true)) {
                            z9 = true;
                            break;
                        }
                    }
                }
                z9 = false;
                if (a02 == null) {
                    if (z9 && u02.o() != 100) {
                        s();
                    } else if (u02.b()) {
                        this.f36589i.setText(this.itemView.getContext().getString(R.string.percent_of_total_size, Integer.valueOf(u02.o()), new N4.g().c(u02.s())));
                        w();
                    } else {
                        int o8 = u02.o();
                        if (1 <= o8 && o8 < 100) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            z();
                        } else {
                            A();
                        }
                    }
                } else if (a02.h0() && a02.Z() != 100) {
                    s();
                } else if (DownloadApkWorker.f29987k.d(app.c(), u02.u())) {
                    this.f36589i.setText(this.itemView.getContext().getString(R.string.percent_of_total_size, Integer.valueOf(a02.Z()), new N4.g().c(a02.a0())));
                    w();
                } else {
                    int Z7 = a02.Z();
                    if (1 <= Z7 && Z7 < 100) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        z();
                    } else {
                        A();
                    }
                }
            }
            if (a02 == null) {
                this.f36588h.setProgress(u02.o());
                if (u02.b()) {
                    e(this.f36588h, this.f36586f);
                } else {
                    app.H0(false);
                    c(this.f36588h, this.f36586f);
                }
            } else {
                this.f36588h.setProgress(a02.Z());
                if (DownloadApkWorker.f29987k.d(app.c(), u02.u())) {
                    e(this.f36588h, this.f36586f);
                } else {
                    app.H0(false);
                    c(this.f36588h, this.f36586f);
                }
            }
        } else {
            v();
        }
        if (u02 != null && u02.f() == 1) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z14 && !u02.b()) {
            String string = this.f36585e.getString(R.string.skipped_update);
            AbstractC3159y.h(string, "context.getString(R.string.skipped_update)");
            x(string);
        } else if (app.i() == 1 && (u02 == null || !u02.b())) {
            String string2 = this.f36585e.getString(R.string.disabled_updates);
            AbstractC3159y.h(string2, "context.getString(R.string.disabled_updates)");
            x(string2);
        } else {
            this.f36592l.setVisibility(0);
            this.f36593m.setVisibility(8);
        }
        if (app.Y()) {
            this.f36596p.setText(app.g0());
            r();
        } else {
            q();
        }
        if (app.g0() == null) {
            this.f36596p.setVisibility(8);
            this.f36595o.setVisibility(8);
            this.f36594n.setVisibility(8);
        } else if (app.Y()) {
            this.f36596p.setText(app.g0());
            r();
        } else {
            q();
        }
        this.f36594n.setOnClickListener(new View.OnClickListener() { // from class: o5.H0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                L0.o(C1496f.this, this, view);
            }
        });
    }
}
