package o5;

import D4.C1100i;
import D4.C1103l;
import M5.AbstractC1246t;
import W4.InterfaceC1478a;
import X4.C1501k;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3159y;
import n5.C3478f;

/* renamed from: o5.z, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3583z extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private W4.s f36921a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1478a f36922b;

    /* renamed from: c, reason: collision with root package name */
    private Context f36923c;

    /* renamed from: d, reason: collision with root package name */
    private RecyclerView f36924d;

    /* renamed from: e, reason: collision with root package name */
    private C1103l f36925e;

    /* renamed from: f, reason: collision with root package name */
    private LinearLayoutManager f36926f;

    /* renamed from: g, reason: collision with root package name */
    private LinearLayout f36927g;

    /* renamed from: h, reason: collision with root package name */
    private final C3478f f36928h;

    /* renamed from: i, reason: collision with root package name */
    private int f36929i;

    /* renamed from: o5.z$a */
    /* loaded from: classes5.dex */
    public static final class a extends RecyclerView.OnScrollListener {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i8) {
            AbstractC3159y.i(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i8);
            C3583z c3583z = C3583z.this;
            c3583z.f36929i = c3583z.f36926f.findFirstCompletelyVisibleItemPosition();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3583z(View itemView, W4.s sVar, InterfaceC1478a actionsClickListener, Context context) {
        super(itemView);
        AbstractC3159y.i(itemView, "itemView");
        AbstractC3159y.i(actionsClickListener, "actionsClickListener");
        AbstractC3159y.i(context, "context");
        this.f36921a = sVar;
        this.f36922b = actionsClickListener;
        this.f36923c = context;
        View findViewById = itemView.findViewById(R.id.rv_home_features);
        AbstractC3159y.h(findViewById, "itemView.findViewById(R.id.rv_home_features)");
        this.f36924d = (RecyclerView) findViewById;
        this.f36925e = new C1103l(this.f36921a, actionsClickListener, this.f36923c);
        this.f36926f = new LinearLayoutManager(itemView.getContext(), 0, false);
        View findViewById2 = itemView.findViewById(R.id.ll_categories);
        AbstractC3159y.h(findViewById2, "itemView.findViewById(R.id.ll_categories)");
        this.f36927g = (LinearLayout) findViewById2;
        C3478f c3478f = new C3478f();
        this.f36928h = c3478f;
        this.f36929i = 102;
        c3478f.attachToRecyclerView(this.f36924d);
        this.f36924d.setLayoutManager(this.f36926f);
        this.f36924d.setAdapter(this.f36925e);
        this.f36924d.addOnScrollListener(new a());
    }

    private final void e(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            final C1501k c1501k = (C1501k) it.next();
            View inflate = LayoutInflater.from(this.f36923c).inflate(R.layout.home_header_category, (ViewGroup) this.f36927g, false);
            AbstractC3159y.g(inflate, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) inflate;
            textView.setTypeface(E4.j.f2272g.t());
            textView.setText(c1501k.f());
            if (AbstractC3159y.d(c1501k, AbstractC1246t.y0(arrayList))) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.setMargins((int) this.f36923c.getResources().getDimension(R.dimen.margin_m), 0, (int) this.f36923c.getResources().getDimension(R.dimen.margin_m), 0);
                textView.setLayoutParams(layoutParams);
            }
            textView.setOnClickListener(new View.OnClickListener() { // from class: o5.y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C3583z.f(C3583z.this, c1501k, view);
                }
            });
            this.f36927g.addView(textView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(C3583z this$0, C1501k category, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(category, "$category");
        W4.s sVar = this$0.f36921a;
        if (sVar != null) {
            sVar.a(category);
        }
    }

    public final void d(C1100i.b homeHeader) {
        AbstractC3159y.i(homeHeader, "homeHeader");
        if (!homeHeader.b().isEmpty()) {
            this.f36924d.scrollToPosition(this.f36929i);
            this.f36924d.smoothScrollBy(1, 0);
            this.f36925e.c(homeHeader.b());
        }
        if (this.f36927g.getChildCount() == 0) {
            e(homeHeader.a());
        }
    }
}
