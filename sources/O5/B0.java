package o5;

import D4.C1105n;
import W4.InterfaceC1478a;
import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class B0 extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private W4.s f36528a;

    /* renamed from: b, reason: collision with root package name */
    private Context f36529b;

    /* renamed from: c, reason: collision with root package name */
    private RelativeLayout f36530c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f36531d;

    /* renamed from: e, reason: collision with root package name */
    private final C1105n f36532e;

    /* renamed from: f, reason: collision with root package name */
    private RecyclerView f36533f;

    /* renamed from: g, reason: collision with root package name */
    private LinearLayoutManager f36534g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B0(View itemView, W4.s listener, InterfaceC1478a actionsClickListener, Context context) {
        super(itemView);
        AbstractC3159y.i(itemView, "itemView");
        AbstractC3159y.i(listener, "listener");
        AbstractC3159y.i(actionsClickListener, "actionsClickListener");
        AbstractC3159y.i(context, "context");
        this.f36528a = listener;
        this.f36529b = context;
        View findViewById = itemView.findViewById(R.id.rl_title_home_recycler_view_top);
        AbstractC3159y.h(findViewById, "itemView.findViewById(R.…e_home_recycler_view_top)");
        this.f36530c = (RelativeLayout) findViewById;
        View findViewById2 = itemView.findViewById(R.id.tv_title_home_recycler_view_top);
        AbstractC3159y.h(findViewById2, "itemView.findViewById(R.…e_home_recycler_view_top)");
        this.f36531d = (TextView) findViewById2;
        C1105n c1105n = new C1105n(this.f36528a, actionsClickListener, this.f36529b);
        this.f36532e = c1105n;
        View findViewById3 = itemView.findViewById(R.id.rv_home_recycler_view_top);
        AbstractC3159y.h(findViewById3, "itemView.findViewById(R.…v_home_recycler_view_top)");
        this.f36533f = (RecyclerView) findViewById3;
        this.f36534g = new LinearLayoutManager(itemView.getContext(), 0, false);
        this.f36531d.setTypeface(E4.j.f2272g.t());
        this.f36533f.setLayoutManager(this.f36534g);
        this.f36533f.setItemAnimator(null);
        this.f36533f.setAdapter(c1105n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(B0 this$0, X4.N topByCategory, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(topByCategory, "$topByCategory");
        this$0.f36528a.c(topByCategory);
    }

    public final void b(final X4.N topByCategory) {
        AbstractC3159y.i(topByCategory, "topByCategory");
        this.f36530c.setOnClickListener(new View.OnClickListener() { // from class: o5.A0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                B0.c(B0.this, topByCategory, view);
            }
        });
        this.f36531d.setText(topByCategory.b().f());
        if (AbstractC3159y.d(topByCategory.b().f(), this.f36529b.getResources().getString(R.string.top_downloads_title))) {
            this.f36532e.b(topByCategory.a(), true);
        } else {
            this.f36532e.b(topByCategory.a(), false);
        }
    }

    public final C1105n d() {
        return this.f36532e;
    }
}
