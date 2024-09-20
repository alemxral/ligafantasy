package o5;

import W4.InterfaceC1478a;
import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: o5.B, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3531B extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private W4.s f36521a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1478a f36522b;

    /* renamed from: c, reason: collision with root package name */
    private RelativeLayout f36523c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f36524d;

    /* renamed from: e, reason: collision with root package name */
    private RecyclerView f36525e;

    /* renamed from: f, reason: collision with root package name */
    private LinearLayoutManager f36526f;

    /* renamed from: g, reason: collision with root package name */
    private final D4.I f36527g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3531B(View itemView, W4.s listener, InterfaceC1478a actionsClickListener, Context context) {
        super(itemView);
        AbstractC3159y.i(itemView, "itemView");
        AbstractC3159y.i(listener, "listener");
        AbstractC3159y.i(actionsClickListener, "actionsClickListener");
        AbstractC3159y.i(context, "context");
        this.f36521a = listener;
        this.f36522b = actionsClickListener;
        View findViewById = itemView.findViewById(R.id.rl_title_home_recycler_view_top);
        AbstractC3159y.h(findViewById, "itemView.findViewById(R.…e_home_recycler_view_top)");
        this.f36523c = (RelativeLayout) findViewById;
        View findViewById2 = itemView.findViewById(R.id.tv_title_home_recycler_view_top);
        AbstractC3159y.h(findViewById2, "itemView.findViewById(R.…e_home_recycler_view_top)");
        this.f36524d = (TextView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.rv_home_recycler_view_top);
        AbstractC3159y.h(findViewById3, "itemView.findViewById(R.…v_home_recycler_view_top)");
        this.f36525e = (RecyclerView) findViewById3;
        this.f36526f = new LinearLayoutManager(itemView.getContext(), 0, false);
        D4.I i8 = new D4.I(this.f36521a, actionsClickListener, context);
        this.f36527g = i8;
        this.f36524d.setTypeface(E4.j.f2272g.t());
        this.f36525e.setLayoutManager(this.f36526f);
        this.f36525e.setItemAnimator(null);
        this.f36525e.setAdapter(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C3531B this$0, X4.N topByCategory, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(topByCategory, "$topByCategory");
        this$0.f36521a.c(topByCategory);
    }

    public final void b(final X4.N topByCategory) {
        AbstractC3159y.i(topByCategory, "topByCategory");
        this.f36523c.setOnClickListener(new View.OnClickListener() { // from class: o5.A
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3531B.c(C3531B.this, topByCategory, view);
            }
        });
        this.f36524d.setText(topByCategory.b().f());
        this.f36527g.c(topByCategory.a());
    }

    public final D4.I d() {
        return this.f36527g;
    }
}
