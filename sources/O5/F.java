package o5;

import D4.C1107p;
import W4.InterfaceC1478a;
import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class F extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private W4.s f36551a;

    /* renamed from: b, reason: collision with root package name */
    private RelativeLayout f36552b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f36553c;

    /* renamed from: d, reason: collision with root package name */
    private RecyclerView f36554d;

    /* renamed from: e, reason: collision with root package name */
    private GridLayoutManager f36555e;

    /* renamed from: f, reason: collision with root package name */
    private C1107p f36556f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(View itemView, W4.s listener, InterfaceC1478a actionsClickListener, Context context) {
        super(itemView);
        AbstractC3159y.i(itemView, "itemView");
        AbstractC3159y.i(listener, "listener");
        AbstractC3159y.i(actionsClickListener, "actionsClickListener");
        AbstractC3159y.i(context, "context");
        this.f36551a = listener;
        View findViewById = itemView.findViewById(R.id.rl_title_home_recycler_view_top);
        AbstractC3159y.h(findViewById, "itemView.findViewById(R.…e_home_recycler_view_top)");
        this.f36552b = (RelativeLayout) findViewById;
        View findViewById2 = itemView.findViewById(R.id.tv_title_home_recycler_view_top);
        AbstractC3159y.h(findViewById2, "itemView.findViewById(R.…e_home_recycler_view_top)");
        this.f36553c = (TextView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.rv_home_recycler_view_top);
        AbstractC3159y.h(findViewById3, "itemView.findViewById(R.…v_home_recycler_view_top)");
        this.f36554d = (RecyclerView) findViewById3;
        this.f36555e = new GridLayoutManager(itemView.getContext(), 3, 0, false);
        this.f36556f = new C1107p(this.f36551a, actionsClickListener, context);
        this.f36553c.setTypeface(E4.j.f2272g.t());
        this.f36554d.setLayoutManager(this.f36555e);
        this.f36554d.setAdapter(this.f36556f);
        this.f36554d.setItemAnimator(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(F this$0, X4.N topByCategory, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(topByCategory, "$topByCategory");
        this$0.f36551a.c(topByCategory);
    }

    public final void b(final X4.N topByCategory) {
        AbstractC3159y.i(topByCategory, "topByCategory");
        this.f36552b.setOnClickListener(new View.OnClickListener() { // from class: o5.E
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                F.c(F.this, topByCategory, view);
            }
        });
        this.f36553c.setText(topByCategory.b().f());
        this.f36556f.d(topByCategory.a());
    }

    public final C1107p d() {
        return this.f36556f;
    }
}
