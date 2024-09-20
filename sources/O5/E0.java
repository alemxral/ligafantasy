package o5;

import E4.j;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.MBridgeConstans;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class E0 extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private final T4.o0 f36547a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f36548b;

    /* renamed from: c, reason: collision with root package name */
    private final W4.J f36549c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f36550d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E0(T4.o0 binding, Context context, W4.J j8, boolean z8) {
        super(binding.getRoot());
        AbstractC3159y.i(binding, "binding");
        AbstractC3159y.i(context, "context");
        this.f36547a = binding;
        this.f36548b = context;
        this.f36549c = j8;
        this.f36550d = z8;
        binding.f10775d.setOnClickListener(new View.OnClickListener() { // from class: o5.C0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                E0.c(E0.this, view);
            }
        });
        binding.f10776e.setOnClickListener(new View.OnClickListener() { // from class: o5.D0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                E0.d(E0.this, view);
            }
        });
        TextView textView = binding.f10777f;
        j.a aVar = E4.j.f2272g;
        textView.setTypeface(aVar.t());
        binding.f10776e.setTypeface(aVar.t());
        binding.f10778g.setTypeface(aVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(E0 this$0, View view) {
        int bindingAdapterPosition;
        AbstractC3159y.i(this$0, "this$0");
        if (this$0.f36549c != null && (bindingAdapterPosition = this$0.getBindingAdapterPosition()) != -1) {
            this$0.f36549c.a(bindingAdapterPosition);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(E0 this$0, View view) {
        int bindingAdapterPosition;
        AbstractC3159y.i(this$0, "this$0");
        if (this$0.f36549c != null && (bindingAdapterPosition = this$0.getBindingAdapterPosition()) != -1) {
            this$0.f36549c.e(bindingAdapterPosition);
        }
    }

    public final void e(X4.D item) {
        AbstractC3159y.i(item, "item");
        com.squareup.picasso.s.h().l(item.c()).l(R.drawable.shape_bg_placeholder).n(UptodownApp.f27990B.f0(this.f36548b)).i(this.f36547a.f10773b);
        this.f36547a.f10777f.setText(item.d());
        if (!g6.n.t(item.e(), MBridgeConstans.ENDCARD_URL_TYPE_PL, false, 2, null)) {
            this.f36547a.f10778g.setText(item.e());
        }
        if (this.f36550d) {
            this.f36547a.f10776e.setText(this.f36548b.getString(R.string.cancel_registration));
            this.f36547a.f10776e.setBackground(ContextCompat.getDrawable(this.f36548b, R.drawable.ripple_cancel_button));
        } else {
            this.f36547a.f10776e.setText(this.f36548b.getString(R.string.pre_registration_title));
            this.f36547a.f10776e.setBackground(ContextCompat.getDrawable(this.f36548b, R.drawable.ripple_blue_primary_button));
        }
    }
}
