package o5;

import E4.j;
import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class G0 extends RecyclerView.ViewHolder {

    /* renamed from: h, reason: collision with root package name */
    public static final a f36560h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final W4.F f36561a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f36562b;

    /* renamed from: c, reason: collision with root package name */
    private int f36563c;

    /* renamed from: d, reason: collision with root package name */
    private final TextView f36564d;

    /* renamed from: e, reason: collision with root package name */
    private final TextView f36565e;

    /* renamed from: f, reason: collision with root package name */
    private final RelativeLayout f36566f;

    /* renamed from: g, reason: collision with root package name */
    private final TextView f36567g;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G0(View itemView, W4.F listener, Context context) {
        super(itemView);
        AbstractC3159y.i(itemView, "itemView");
        AbstractC3159y.i(listener, "listener");
        AbstractC3159y.i(context, "context");
        this.f36561a = listener;
        this.f36562b = context;
        View findViewById = itemView.findViewById(R.id.tv_updates_available_updates);
        AbstractC3159y.h(findViewById, "itemView.findViewById(R.…pdates_available_updates)");
        TextView textView = (TextView) findViewById;
        this.f36564d = textView;
        View findViewById2 = itemView.findViewById(R.id.tv_download_all_update);
        AbstractC3159y.h(findViewById2, "itemView.findViewById(R.id.tv_download_all_update)");
        TextView textView2 = (TextView) findViewById2;
        this.f36565e = textView2;
        View findViewById3 = itemView.findViewById(R.id.rl_updates_available_container);
        AbstractC3159y.h(findViewById3, "itemView.findViewById(R.…ates_available_container)");
        this.f36566f = (RelativeLayout) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.tv_updates_available_value_updates);
        AbstractC3159y.h(findViewById4, "itemView.findViewById(R.…_available_value_updates)");
        TextView textView3 = (TextView) findViewById4;
        this.f36567g = textView3;
        j.a aVar = E4.j.f2272g;
        textView.setTypeface(aVar.t());
        textView2.setTypeface(aVar.t());
        textView3.setTypeface(aVar.u());
        textView2.setOnClickListener(new View.OnClickListener() { // from class: o5.F0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                G0.b(G0.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(G0 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.f36561a.a();
    }

    private final void d() {
        this.f36565e.setText(android.R.string.cancel);
        this.f36565e.setBackground(ContextCompat.getDrawable(this.f36562b, R.drawable.ripple_cancel_all_button));
        this.f36565e.setTextColor(ContextCompat.getColor(this.f36562b, R.color.white));
        this.f36565e.setVisibility(0);
    }

    private final void e() {
        this.f36565e.setText(R.string.download_all_updates);
        this.f36565e.setBackground(ContextCompat.getDrawable(this.f36562b, R.drawable.ripple_blue_primary_button));
        this.f36565e.setTextColor(ContextCompat.getColor(this.f36562b, R.color.white));
        this.f36565e.setVisibility(0);
    }

    private final void f() {
        this.f36565e.setText(R.string.install_all);
        this.f36565e.setBackground(ContextCompat.getDrawable(this.f36562b, R.drawable.ripple_install_button));
        this.f36565e.setTextColor(ContextCompat.getColor(this.f36562b, R.color.accent_green));
        this.f36565e.setVisibility(0);
    }

    public final void c(int i8, int i9) {
        this.f36563c = i9;
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 != 2) {
                    this.f36565e.setVisibility(4);
                } else {
                    d();
                }
            } else {
                f();
            }
        } else {
            e();
        }
        if (i9 == 0) {
            this.f36564d.setText(this.f36562b.getString(R.string.no_pending_updates));
            this.f36566f.setVisibility(8);
        } else {
            this.f36564d.setText(this.f36562b.getString(R.string.my_downloads_pending));
            this.f36567g.setText(String.valueOf(this.f36563c));
            this.f36566f.setVisibility(0);
        }
    }
}
