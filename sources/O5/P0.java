package o5;

import E4.j;
import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class P0 extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private final W4.G f36624a;

    /* renamed from: b, reason: collision with root package name */
    private final LinearLayout f36625b;

    /* renamed from: c, reason: collision with root package name */
    private final TextView f36626c;

    /* renamed from: d, reason: collision with root package name */
    private final ImageView f36627d;

    /* renamed from: e, reason: collision with root package name */
    private final TextView f36628e;

    /* renamed from: f, reason: collision with root package name */
    private final TextView f36629f;

    /* renamed from: g, reason: collision with root package name */
    private final RelativeLayout f36630g;

    /* renamed from: h, reason: collision with root package name */
    private final ImageView f36631h;

    /* renamed from: i, reason: collision with root package name */
    private final int f36632i;

    /* renamed from: j, reason: collision with root package name */
    private long f36633j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P0(View itemView, W4.G listener) {
        super(itemView);
        AbstractC3159y.i(itemView, "itemView");
        AbstractC3159y.i(listener, "listener");
        this.f36624a = listener;
        View findViewById = itemView.findViewById(R.id.ll_uptodown_protect);
        AbstractC3159y.h(findViewById, "itemView.findViewById(R.id.ll_uptodown_protect)");
        this.f36625b = (LinearLayout) findViewById;
        View findViewById2 = itemView.findViewById(R.id.tv_uptodown_protect);
        AbstractC3159y.h(findViewById2, "itemView.findViewById(R.id.tv_uptodown_protect)");
        TextView textView = (TextView) findViewById2;
        this.f36626c = textView;
        View findViewById3 = itemView.findViewById(R.id.iv_shield);
        AbstractC3159y.h(findViewById3, "itemView.findViewById(R.id.iv_shield)");
        this.f36627d = (ImageView) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.tv_title);
        AbstractC3159y.h(findViewById4, "itemView.findViewById(R.id.tv_title)");
        TextView textView2 = (TextView) findViewById4;
        this.f36628e = textView2;
        View findViewById5 = itemView.findViewById(R.id.tv_msg);
        AbstractC3159y.h(findViewById5, "itemView.findViewById(R.id.tv_msg)");
        TextView textView3 = (TextView) findViewById5;
        this.f36629f = textView3;
        View findViewById6 = itemView.findViewById(R.id.rl_reload);
        AbstractC3159y.h(findViewById6, "itemView.findViewById(R.id.rl_reload)");
        this.f36630g = (RelativeLayout) findViewById6;
        View findViewById7 = itemView.findViewById(R.id.iv_reload);
        AbstractC3159y.h(findViewById7, "itemView.findViewById(R.id.iv_reload)");
        this.f36631h = (ImageView) findViewById7;
        this.f36632i = 600;
        j.a aVar = E4.j.f2272g;
        textView.setTypeface(aVar.t());
        textView2.setTypeface(aVar.u());
        textView3.setTypeface(aVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(P0 this$0, Context context, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(context, "$context");
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this$0.f36633j > this$0.f36632i) {
            this$0.f36633j = currentTimeMillis;
            Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.rotate);
            loadAnimation.setRepeatCount(-1);
            this$0.f36631h.startAnimation(loadAnimation);
            this$0.f36624a.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(P0 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.f36624a.a();
    }

    public final void d(ArrayList arrayList, final Context context) {
        AbstractC3159y.i(context, "context");
        this.f36625b.setVisibility(0);
        this.f36630g.setOnClickListener(new View.OnClickListener() { // from class: o5.M0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                P0.e(P0.this, context, view);
            }
        });
        if (arrayList != null && arrayList.size() > 0) {
            this.f36627d.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_shield_protect_bad));
            this.f36628e.setText(R.string.positives_title_security_badge);
            this.f36629f.setText(R.string.positives_msg_security_badge);
            this.f36630g.setBackground(ContextCompat.getDrawable(context, R.drawable.ripple_cancel_button));
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: o5.N0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    P0.f(P0.this, view);
                }
            });
        } else {
            this.f36627d.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_shield_protect_ok));
            this.f36628e.setText(R.string.no_positives_title_security_badge);
            this.f36629f.setText(R.string.no_positives_msg_security_badge);
            this.f36630g.setBackground(ContextCompat.getDrawable(context, R.drawable.ripple_blue_primary_button));
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: o5.O0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    P0.g(view);
                }
            });
        }
        if (this.f36631h.getAnimation() != null && this.f36631h.getAnimation().getRepeatCount() != 0) {
            this.f36631h.getAnimation().setRepeatCount(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(View view) {
    }
}
