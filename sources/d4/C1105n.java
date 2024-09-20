package D4;

import D4.C1105n;
import E4.j;
import M5.AbstractC1246t;
import W4.InterfaceC1478a;
import W4.InterfaceC1481d;
import X4.C1498h;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3159y;
import o5.AbstractC3548h;

/* renamed from: D4.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1105n extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC1481d f1732a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1478a f1733b;

    /* renamed from: c, reason: collision with root package name */
    private Context f1734c;

    /* renamed from: d, reason: collision with root package name */
    private ArrayList f1735d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f1736e;

    /* renamed from: D4.n$a */
    /* loaded from: classes4.dex */
    public final class a extends AbstractC3548h {

        /* renamed from: b, reason: collision with root package name */
        private InterfaceC1481d f1737b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC1478a f1738c;

        /* renamed from: d, reason: collision with root package name */
        private Context f1739d;

        /* renamed from: e, reason: collision with root package name */
        private final ImageView f1740e;

        /* renamed from: f, reason: collision with root package name */
        private final ImageView f1741f;

        /* renamed from: g, reason: collision with root package name */
        private final ProgressBar f1742g;

        /* renamed from: h, reason: collision with root package name */
        private final TextView f1743h;

        /* renamed from: i, reason: collision with root package name */
        private final TextView f1744i;

        /* renamed from: j, reason: collision with root package name */
        private final TextView f1745j;

        /* renamed from: k, reason: collision with root package name */
        private final TextView f1746k;

        /* renamed from: l, reason: collision with root package name */
        private final TextView f1747l;

        /* renamed from: m, reason: collision with root package name */
        private final LinearLayout f1748m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ C1105n f1749n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C1105n c1105n, View itemView, InterfaceC1481d listener, InterfaceC1478a actionsClickListener, Context context) {
            super(itemView, context);
            AbstractC3159y.i(itemView, "itemView");
            AbstractC3159y.i(listener, "listener");
            AbstractC3159y.i(actionsClickListener, "actionsClickListener");
            AbstractC3159y.i(context, "context");
            this.f1749n = c1105n;
            this.f1737b = listener;
            this.f1738c = actionsClickListener;
            this.f1739d = context;
            this.f1740e = (ImageView) itemView.findViewById(R.id.iv_home_card_featured_item);
            this.f1741f = (ImageView) itemView.findViewById(R.id.iv_logo_home_card_featured_item);
            View findViewById = itemView.findViewById(R.id.pb_progress_home_card_featured_item);
            AbstractC3159y.h(findViewById, "itemView.findViewById(R.…_home_card_featured_item)");
            this.f1742g = (ProgressBar) findViewById;
            TextView textView = (TextView) itemView.findViewById(R.id.tv_name_home_card_featured_item);
            this.f1743h = textView;
            TextView textView2 = (TextView) itemView.findViewById(R.id.tv_desc_home_card_featured_item);
            this.f1744i = textView2;
            this.f1745j = (TextView) itemView.findViewById(R.id.tv_status_home_card_featured_item);
            View findViewById2 = itemView.findViewById(R.id.tv_progress_home_card_featured_item);
            AbstractC3159y.h(findViewById2, "itemView.findViewById(R.…_home_card_featured_item)");
            TextView textView3 = (TextView) findViewById2;
            this.f1746k = textView3;
            View findViewById3 = itemView.findViewById(R.id.tv_verified_home_card_featured_item);
            AbstractC3159y.h(findViewById3, "itemView.findViewById(R.…_home_card_featured_item)");
            TextView textView4 = (TextView) findViewById3;
            this.f1747l = textView4;
            View findViewById4 = itemView.findViewById(R.id.ll_progress_home_card_featured_item);
            AbstractC3159y.h(findViewById4, "itemView.findViewById(R.…_home_card_featured_item)");
            this.f1748m = (LinearLayout) findViewById4;
            j.a aVar = E4.j.f2272g;
            textView.setTypeface(aVar.t());
            textView2.setTypeface(aVar.u());
            textView3.setTypeface(aVar.u());
            textView4.setTypeface(aVar.u());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean n(a this$0, C1498h app, int i8, View view) {
            AbstractC3159y.i(this$0, "this$0");
            AbstractC3159y.i(app, "$app");
            this$0.f1738c.a(app, i8);
            return true;
        }

        public final void m(final C1498h app, int i8, final int i9) {
            AbstractC3159y.i(app, "app");
            this.itemView.setLayoutParams(b(new RelativeLayout.LayoutParams(-2, -2), this.f1739d, i8, 20));
            String e02 = app.e0();
            if (e02 != null && e02.length() != 0) {
                com.squareup.picasso.s.h().l(app.i0()).n(UptodownApp.f27990B.e0(this.f1739d)).a().f().l(R.drawable.shape_bg_placeholder).i(this.f1740e);
            } else {
                this.f1740e.setImageDrawable(ContextCompat.getDrawable(this.f1739d, R.drawable.shape_bg_placeholder));
            }
            View itemView = this.itemView;
            AbstractC3159y.h(itemView, "itemView");
            c(itemView, this.f1737b, app);
            this.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: D4.m
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    boolean n8;
                    n8 = C1105n.a.n(C1105n.a.this, app, i9, view);
                    return n8;
                }
            });
            TextView tvName = this.f1743h;
            AbstractC3159y.h(tvName, "tvName");
            TextView tvDesc = this.f1744i;
            AbstractC3159y.h(tvDesc, "tvDesc");
            i(app, tvName, tvDesc);
            ImageView ivIcon = this.f1741f;
            AbstractC3159y.h(ivIcon, "ivIcon");
            h(ivIcon, app.m0());
            ProgressBar progressBar = this.f1742g;
            ImageView ivIcon2 = this.f1741f;
            AbstractC3159y.h(ivIcon2, "ivIcon");
            TextView tvDesc2 = this.f1744i;
            AbstractC3159y.h(tvDesc2, "tvDesc");
            e(app, progressBar, ivIcon2, tvDesc2, this.f1746k, this.f1745j, this.f1748m);
        }
    }

    /* renamed from: D4.n$b */
    /* loaded from: classes4.dex */
    public final class b extends AbstractC3548h {

        /* renamed from: b, reason: collision with root package name */
        private InterfaceC1481d f1750b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC1478a f1751c;

        /* renamed from: d, reason: collision with root package name */
        private Context f1752d;

        /* renamed from: e, reason: collision with root package name */
        private final ImageView f1753e;

        /* renamed from: f, reason: collision with root package name */
        private final ProgressBar f1754f;

        /* renamed from: g, reason: collision with root package name */
        private final ImageView f1755g;

        /* renamed from: h, reason: collision with root package name */
        private final TextView f1756h;

        /* renamed from: i, reason: collision with root package name */
        private final TextView f1757i;

        /* renamed from: j, reason: collision with root package name */
        private final TextView f1758j;

        /* renamed from: k, reason: collision with root package name */
        private final TextView f1759k;

        /* renamed from: l, reason: collision with root package name */
        private final TextView f1760l;

        /* renamed from: m, reason: collision with root package name */
        private final LinearLayout f1761m;

        /* renamed from: n, reason: collision with root package name */
        private final TextView f1762n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ C1105n f1763o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C1105n c1105n, View itemView, InterfaceC1481d listener, InterfaceC1478a actionsClickListener, Context context) {
            super(itemView, context);
            AbstractC3159y.i(itemView, "itemView");
            AbstractC3159y.i(listener, "listener");
            AbstractC3159y.i(actionsClickListener, "actionsClickListener");
            AbstractC3159y.i(context, "context");
            this.f1763o = c1105n;
            this.f1750b = listener;
            this.f1751c = actionsClickListener;
            this.f1752d = context;
            this.f1753e = (ImageView) itemView.findViewById(R.id.iv_home_top_card_featured_item);
            View findViewById = itemView.findViewById(R.id.pb_progress_home_card_top_featured_item);
            AbstractC3159y.h(findViewById, "itemView.findViewById(R.…e_card_top_featured_item)");
            this.f1754f = (ProgressBar) findViewById;
            this.f1755g = (ImageView) itemView.findViewById(R.id.iv_logo_home_card_top_featured_item);
            TextView textView = (TextView) itemView.findViewById(R.id.tv_name_home_card_top_featured_item);
            this.f1756h = textView;
            TextView textView2 = (TextView) itemView.findViewById(R.id.tv_number_card_top_featured_download);
            this.f1757i = textView2;
            TextView textView3 = (TextView) itemView.findViewById(R.id.tv_desc_home_card_top_featured_item);
            this.f1758j = textView3;
            View findViewById2 = itemView.findViewById(R.id.tv_progress_home_card_top_featured_item);
            AbstractC3159y.h(findViewById2, "itemView.findViewById(R.…e_card_top_featured_item)");
            TextView textView4 = (TextView) findViewById2;
            this.f1759k = textView4;
            View findViewById3 = itemView.findViewById(R.id.tv_verified_home_card_top_featured_item);
            AbstractC3159y.h(findViewById3, "itemView.findViewById(R.…e_card_top_featured_item)");
            TextView textView5 = (TextView) findViewById3;
            this.f1760l = textView5;
            View findViewById4 = itemView.findViewById(R.id.ll_progress_home_card_top_featured_item);
            AbstractC3159y.h(findViewById4, "itemView.findViewById(R.…e_card_top_featured_item)");
            this.f1761m = (LinearLayout) findViewById4;
            this.f1762n = (TextView) itemView.findViewById(R.id.tv_status_home_card_top_featured_item);
            j.a aVar = E4.j.f2272g;
            textView.setTypeface(aVar.t());
            textView2.setTypeface(aVar.t());
            textView3.setTypeface(aVar.u());
            textView4.setTypeface(aVar.u());
            textView5.setTypeface(aVar.u());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean n(b this$0, C1498h app, int i8, View view) {
            AbstractC3159y.i(this$0, "this$0");
            AbstractC3159y.i(app, "$app");
            this$0.f1751c.a(app, i8);
            return true;
        }

        public final void m(final C1498h app, int i8, final int i9, boolean z8) {
            AbstractC3159y.i(app, "app");
            int dimension = (int) this.f1752d.getResources().getDimension(R.dimen.margin_m);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            if (z8) {
                layoutParams.setMargins(dimension, 0, dimension, dimension);
            } else {
                layoutParams.setMargins(dimension, 0, 0, dimension);
            }
            ViewGroup.LayoutParams layoutParams2 = this.f1753e.getLayoutParams();
            AbstractC3159y.g(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
            if (i8 >= 10) {
                marginLayoutParams.setMarginStart((int) this.f1752d.getResources().getDimension(R.dimen.top_card_featured_margin_index_ten));
            } else {
                marginLayoutParams.setMarginStart(0);
            }
            this.f1753e.setLayoutParams(marginLayoutParams);
            this.itemView.setLayoutParams(layoutParams);
            this.f1757i.setText(String.valueOf(i8));
            String e02 = app.e0();
            if (e02 != null && e02.length() != 0) {
                com.squareup.picasso.s.h().l(app.i0()).n(UptodownApp.f27990B.e0(this.f1752d)).a().f().l(R.drawable.shape_bg_placeholder).i(this.f1753e);
            } else {
                this.f1753e.setImageDrawable(ContextCompat.getDrawable(this.f1752d, R.drawable.shape_bg_placeholder));
            }
            View itemView = this.itemView;
            AbstractC3159y.h(itemView, "itemView");
            c(itemView, this.f1750b, app);
            this.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: D4.o
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    boolean n8;
                    n8 = C1105n.b.n(C1105n.b.this, app, i9, view);
                    return n8;
                }
            });
            TextView tvName = this.f1756h;
            AbstractC3159y.h(tvName, "tvName");
            TextView tvDesc = this.f1758j;
            AbstractC3159y.h(tvDesc, "tvDesc");
            i(app, tvName, tvDesc);
            ImageView ivIcon = this.f1755g;
            AbstractC3159y.h(ivIcon, "ivIcon");
            h(ivIcon, app.m0());
            ProgressBar progressBar = this.f1754f;
            ImageView ivIcon2 = this.f1755g;
            AbstractC3159y.h(ivIcon2, "ivIcon");
            TextView tvDesc2 = this.f1758j;
            AbstractC3159y.h(tvDesc2, "tvDesc");
            e(app, progressBar, ivIcon2, tvDesc2, this.f1759k, this.f1762n, this.f1761m);
        }
    }

    public C1105n(InterfaceC1481d listener, InterfaceC1478a actionsClickListener, Context context) {
        AbstractC3159y.i(listener, "listener");
        AbstractC3159y.i(actionsClickListener, "actionsClickListener");
        AbstractC3159y.i(context, "context");
        this.f1732a = listener;
        this.f1733b = actionsClickListener;
        this.f1734c = context;
        this.f1735d = new ArrayList();
    }

    public final ArrayList a() {
        return this.f1735d;
    }

    public final void b(ArrayList appList, boolean z8) {
        AbstractC3159y.i(appList, "appList");
        this.f1736e = z8;
        this.f1735d = appList;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f1735d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int i8) {
        AbstractC3159y.i(holder, "holder");
        if (holder instanceof a) {
            Object obj = this.f1735d.get(i8);
            AbstractC3159y.h(obj, "apps[position]");
            ((a) holder).m((C1498h) obj, i8 + 1, i8);
        } else if (holder instanceof b) {
            int i9 = i8 + 1;
            if (AbstractC3159y.d(this.f1735d.get(i8), AbstractC1246t.y0(this.f1735d))) {
                Object obj2 = this.f1735d.get(i8);
                AbstractC3159y.h(obj2, "apps[position]");
                ((b) holder).m((C1498h) obj2, i9, i8, true);
            } else {
                Object obj3 = this.f1735d.get(i8);
                AbstractC3159y.h(obj3, "apps[position]");
                ((b) holder).m((C1498h) obj3, i9, i8, false);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i8) {
        AbstractC3159y.i(parent, "parent");
        if (this.f1736e) {
            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_card_top_featured_item, parent, false);
            AbstractC3159y.h(itemView, "itemView");
            return new b(this, itemView, this.f1732a, this.f1733b, this.f1734c);
        }
        View itemView2 = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_card_featured_item, parent, false);
        AbstractC3159y.h(itemView2, "itemView");
        return new a(this, itemView2, this.f1732a, this.f1733b, this.f1734c);
    }
}
