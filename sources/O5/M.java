package o5;

import E4.j;
import W4.InterfaceC1478a;
import X4.C1498h;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class M extends AbstractC3548h {

    /* renamed from: b, reason: collision with root package name */
    private W4.s f36601b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1478a f36602c;

    /* renamed from: d, reason: collision with root package name */
    private Context f36603d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f36604e;

    /* renamed from: f, reason: collision with root package name */
    private RecyclerView f36605f;

    /* renamed from: g, reason: collision with root package name */
    private final ProgressBar f36606g;

    /* renamed from: h, reason: collision with root package name */
    private ImageView f36607h;

    /* renamed from: i, reason: collision with root package name */
    private TextView f36608i;

    /* renamed from: j, reason: collision with root package name */
    private TextView f36609j;

    /* renamed from: k, reason: collision with root package name */
    private final TextView f36610k;

    /* renamed from: l, reason: collision with root package name */
    private final TextView f36611l;

    /* renamed from: m, reason: collision with root package name */
    private final TextView f36612m;

    /* renamed from: n, reason: collision with root package name */
    private final LinearLayout f36613n;

    /* renamed from: o, reason: collision with root package name */
    private D4.D f36614o;

    /* renamed from: p, reason: collision with root package name */
    private String f36615p;

    /* loaded from: classes5.dex */
    public static final class a implements W4.C {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1498h f36617b;

        a(C1498h c1498h) {
            this.f36617b = c1498h;
        }

        @Override // W4.C
        public void a(X4.L screenshot) {
            AbstractC3159y.i(screenshot, "screenshot");
            M.this.f36601b.b(this.f36617b);
        }

        @Override // W4.C
        public void b(X4.L screenshot) {
            AbstractC3159y.i(screenshot, "screenshot");
            D4.D d8 = M.this.f36614o;
            if (d8 != null) {
                d8.c(screenshot);
            }
        }

        @Override // W4.C
        public void c(X4.T video) {
            AbstractC3159y.i(video, "video");
        }

        @Override // W4.C
        public void d(X4.T video) {
            AbstractC3159y.i(video, "video");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(View itemView, W4.s listener, InterfaceC1478a actionsClickListener, Context context) {
        super(itemView, context);
        AbstractC3159y.i(itemView, "itemView");
        AbstractC3159y.i(listener, "listener");
        AbstractC3159y.i(actionsClickListener, "actionsClickListener");
        AbstractC3159y.i(context, "context");
        this.f36601b = listener;
        this.f36602c = actionsClickListener;
        this.f36603d = context;
        View findViewById = itemView.findViewById(R.id.tv_title_home_gallery_featured);
        AbstractC3159y.h(findViewById, "itemView.findViewById(R.…le_home_gallery_featured)");
        this.f36604e = (TextView) findViewById;
        View findViewById2 = itemView.findViewById(R.id.rv_screenshots_home_gallery_featured);
        AbstractC3159y.h(findViewById2, "itemView.findViewById(R.…ts_home_gallery_featured)");
        this.f36605f = (RecyclerView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.pb_progress_gallery_featured_item);
        AbstractC3159y.h(findViewById3, "itemView.findViewById(R.…ss_gallery_featured_item)");
        this.f36606g = (ProgressBar) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.iv_logo_gallery_featured_item);
        AbstractC3159y.h(findViewById4, "itemView.findViewById(R.…go_gallery_featured_item)");
        this.f36607h = (ImageView) findViewById4;
        View findViewById5 = itemView.findViewById(R.id.tv_name_gallery_featured_item);
        AbstractC3159y.h(findViewById5, "itemView.findViewById(R.…me_gallery_featured_item)");
        this.f36608i = (TextView) findViewById5;
        View findViewById6 = itemView.findViewById(R.id.tv_desc_gallery_featured_item);
        AbstractC3159y.h(findViewById6, "itemView.findViewById(R.…sc_gallery_featured_item)");
        this.f36609j = (TextView) findViewById6;
        View findViewById7 = itemView.findViewById(R.id.tv_status_gallery_featured_item);
        AbstractC3159y.h(findViewById7, "itemView.findViewById(R.…us_gallery_featured_item)");
        TextView textView = (TextView) findViewById7;
        this.f36610k = textView;
        View findViewById8 = itemView.findViewById(R.id.tv_progress_gallery_featured_item);
        AbstractC3159y.h(findViewById8, "itemView.findViewById(R.…ss_gallery_featured_item)");
        TextView textView2 = (TextView) findViewById8;
        this.f36611l = textView2;
        View findViewById9 = itemView.findViewById(R.id.tv_verified_gallery_featured_item);
        AbstractC3159y.h(findViewById9, "itemView.findViewById(R.…ed_gallery_featured_item)");
        TextView textView3 = (TextView) findViewById9;
        this.f36612m = textView3;
        View findViewById10 = itemView.findViewById(R.id.ll_progress_gallery_featured_item);
        AbstractC3159y.h(findViewById10, "itemView.findViewById(R.…ss_gallery_featured_item)");
        this.f36613n = (LinearLayout) findViewById10;
        TextView textView4 = this.f36604e;
        j.a aVar = E4.j.f2272g;
        textView4.setTypeface(aVar.t());
        this.f36608i.setTypeface(aVar.t());
        this.f36609j.setTypeface(aVar.u());
        textView2.setTypeface(aVar.u());
        textView3.setTypeface(aVar.u());
        textView.setTypeface(aVar.u());
        int dimension = (int) this.f36603d.getResources().getDimension(R.dimen.margin_m);
        this.f36605f.setLayoutManager(new LinearLayoutManager(this.f36603d, 0, false));
        this.f36605f.addItemDecoration(new n5.s(dimension));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean q(M this$0, C1498h app, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(app, "$app");
        this$0.f36602c.a(app, -1);
        return true;
    }

    private final void r(C1498h c1498h) {
        if (this.f36614o == null) {
            a aVar = new a(c1498h);
            ArrayList arrayList = new ArrayList();
            ArrayList R02 = c1498h.R0();
            AbstractC3159y.f(R02);
            arrayList.addAll(R02);
            D4.D d8 = new D4.D(arrayList, aVar);
            this.f36614o = d8;
            this.f36605f.setAdapter(d8);
        }
    }

    private final void t(View view, final C1498h c1498h) {
        view.setOnClickListener(new View.OnClickListener() { // from class: o5.L
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                M.u(M.this, c1498h, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(M this$0, C1498h app, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(app, "$app");
        this$0.f36601b.b(app);
    }

    public final void p(final C1498h app) {
        AbstractC3159y.i(app, "app");
        this.f36615p = app.y0();
        this.f36604e.setText(this.f36603d.getString(R.string.home_fragment_download_app_title, app.s0()));
        View itemView = this.itemView;
        AbstractC3159y.h(itemView, "itemView");
        t(itemView, app);
        this.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: o5.K
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean q8;
                q8 = M.q(M.this, app, view);
                return q8;
            }
        });
        ArrayList R02 = app.R0();
        if (R02 != null && !R02.isEmpty()) {
            r(app);
        }
        i(app, this.f36608i, this.f36609j);
        h(this.f36607h, app.m0());
        e(app, this.f36606g, this.f36607h, this.f36609j, this.f36611l, this.f36610k, this.f36613n);
    }

    public final String s() {
        return this.f36615p;
    }
}
