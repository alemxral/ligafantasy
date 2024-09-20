package o5;

import E4.j;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import com.uptodown.util.views.UsernameTextView;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3307A;
import l5.C3323k;

/* renamed from: o5.h0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3549h0 extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private final Context f36775a;

    /* renamed from: b, reason: collision with root package name */
    private final W4.A f36776b;

    /* renamed from: c, reason: collision with root package name */
    private final ImageView f36777c;

    /* renamed from: d, reason: collision with root package name */
    private final UsernameTextView f36778d;

    /* renamed from: e, reason: collision with root package name */
    private final ImageView f36779e;

    /* renamed from: f, reason: collision with root package name */
    private final TextView f36780f;

    /* renamed from: g, reason: collision with root package name */
    private final TextView f36781g;

    /* renamed from: h, reason: collision with root package name */
    private final TextView f36782h;

    /* renamed from: i, reason: collision with root package name */
    private final TextView f36783i;

    /* renamed from: j, reason: collision with root package name */
    private final ImageView f36784j;

    /* renamed from: k, reason: collision with root package name */
    private final LinearLayout f36785k;

    /* renamed from: l, reason: collision with root package name */
    private final LinearLayout f36786l;

    /* renamed from: m, reason: collision with root package name */
    private final ImageView f36787m;

    /* renamed from: n, reason: collision with root package name */
    private final ImageView f36788n;

    /* renamed from: o, reason: collision with root package name */
    private final ImageView f36789o;

    /* renamed from: p, reason: collision with root package name */
    private final ImageView f36790p;

    /* renamed from: q, reason: collision with root package name */
    private final ImageView f36791q;

    /* renamed from: r, reason: collision with root package name */
    private final ImageView f36792r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3549h0(View itemView, Context context, W4.A listener) {
        super(itemView);
        AbstractC3159y.i(itemView, "itemView");
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(listener, "listener");
        this.f36775a = context;
        this.f36776b = listener;
        View findViewById = itemView.findViewById(R.id.iv_avatar_review);
        AbstractC3159y.h(findViewById, "itemView.findViewById(R.id.iv_avatar_review)");
        this.f36777c = (ImageView) findViewById;
        View findViewById2 = itemView.findViewById(R.id.tv_username_review);
        AbstractC3159y.h(findViewById2, "itemView.findViewById(R.id.tv_username_review)");
        UsernameTextView usernameTextView = (UsernameTextView) findViewById2;
        this.f36778d = usernameTextView;
        View findViewById3 = itemView.findViewById(R.id.iv_author_verified_review);
        AbstractC3159y.h(findViewById3, "itemView.findViewById(R.…v_author_verified_review)");
        this.f36779e = (ImageView) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.tv_date_review);
        AbstractC3159y.h(findViewById4, "itemView.findViewById(R.id.tv_date_review)");
        TextView textView = (TextView) findViewById4;
        this.f36780f = textView;
        View findViewById5 = itemView.findViewById(R.id.tv_body_review);
        AbstractC3159y.h(findViewById5, "itemView.findViewById(R.id.tv_body_review)");
        TextView textView2 = (TextView) findViewById5;
        this.f36781g = textView2;
        View findViewById6 = itemView.findViewById(R.id.tv_reviews_counter_review);
        AbstractC3159y.h(findViewById6, "itemView.findViewById(R.…v_reviews_counter_review)");
        TextView textView3 = (TextView) findViewById6;
        this.f36782h = textView3;
        View findViewById7 = itemView.findViewById(R.id.tv_likes_counter_review);
        AbstractC3159y.h(findViewById7, "itemView.findViewById(R.….tv_likes_counter_review)");
        TextView textView4 = (TextView) findViewById7;
        this.f36783i = textView4;
        View findViewById8 = itemView.findViewById(R.id.iv_likes_counter_review);
        AbstractC3159y.h(findViewById8, "itemView.findViewById(R.….iv_likes_counter_review)");
        this.f36784j = (ImageView) findViewById8;
        View findViewById9 = itemView.findViewById(R.id.ll_reviews_counter_review);
        AbstractC3159y.h(findViewById9, "itemView.findViewById(R.…l_reviews_counter_review)");
        this.f36785k = (LinearLayout) findViewById9;
        View findViewById10 = itemView.findViewById(R.id.ll_likes_review);
        AbstractC3159y.h(findViewById10, "itemView.findViewById(R.id.ll_likes_review)");
        this.f36786l = (LinearLayout) findViewById10;
        View findViewById11 = itemView.findViewById(R.id.iv_star1_review);
        AbstractC3159y.h(findViewById11, "itemView.findViewById(R.id.iv_star1_review)");
        this.f36787m = (ImageView) findViewById11;
        View findViewById12 = itemView.findViewById(R.id.iv_star2_review);
        AbstractC3159y.h(findViewById12, "itemView.findViewById(R.id.iv_star2_review)");
        this.f36788n = (ImageView) findViewById12;
        View findViewById13 = itemView.findViewById(R.id.iv_star3_review);
        AbstractC3159y.h(findViewById13, "itemView.findViewById(R.id.iv_star3_review)");
        this.f36789o = (ImageView) findViewById13;
        View findViewById14 = itemView.findViewById(R.id.iv_star4_review);
        AbstractC3159y.h(findViewById14, "itemView.findViewById(R.id.iv_star4_review)");
        this.f36790p = (ImageView) findViewById14;
        View findViewById15 = itemView.findViewById(R.id.iv_star5_review);
        AbstractC3159y.h(findViewById15, "itemView.findViewById(R.id.iv_star5_review)");
        this.f36791q = (ImageView) findViewById15;
        View findViewById16 = itemView.findViewById(R.id.iv_turbo_mark_review);
        AbstractC3159y.h(findViewById16, "itemView.findViewById(R.id.iv_turbo_mark_review)");
        ImageView imageView = (ImageView) findViewById16;
        this.f36792r = imageView;
        j.a aVar = E4.j.f2272g;
        usernameTextView.setTypeface(aVar.t());
        textView.setTypeface(aVar.u());
        textView2.setTypeface(aVar.u());
        textView3.setTypeface(aVar.u());
        textView4.setTypeface(aVar.u());
        imageView.setVisibility(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void g(final X4.K r8, final int r9) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.C3549h0.g(X4.K, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(C3549h0 this$0, int i8, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.f36776b.d(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(C3549h0 this$0, int i8, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.f36776b.d(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(C3549h0 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(view, "view");
        W4.A a8 = this$0.f36776b;
        Object tag = view.getTag();
        AbstractC3159y.g(tag, "null cannot be cast to non-null type kotlin.Int");
        a8.e(((Integer) tag).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(C3549h0 this$0, X4.K item, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(item, "$item");
        AbstractC3159y.i(view, "view");
        n5.k.a(this$0.f36775a, this$0.f36784j);
        if (!C3307A.f34459a.i(item.j())) {
            W4.A a8 = this$0.f36776b;
            Object tag = view.getTag();
            AbstractC3159y.g(tag, "null cannot be cast to non-null type kotlin.Int");
            a8.b(((Integer) tag).intValue());
            this$0.f36783i.setText(String.valueOf(item.k() + 1));
        }
    }

    public final void e(X4.K item, int i8) {
        AbstractC3159y.i(item, "item");
        g(item, i8);
        this.f36787m.setImageDrawable(ContextCompat.getDrawable(this.f36775a, R.drawable.vector_star_on));
        this.f36788n.setImageDrawable(ContextCompat.getDrawable(this.f36775a, R.drawable.vector_star_off));
        this.f36789o.setImageDrawable(ContextCompat.getDrawable(this.f36775a, R.drawable.vector_star_off));
        this.f36790p.setImageDrawable(ContextCompat.getDrawable(this.f36775a, R.drawable.vector_star_off));
        this.f36791q.setImageDrawable(ContextCompat.getDrawable(this.f36775a, R.drawable.vector_star_off));
        if (item.n() >= 2) {
            this.f36788n.setImageDrawable(ContextCompat.getDrawable(this.f36775a, R.drawable.vector_star_on));
        }
        if (item.n() >= 3) {
            this.f36789o.setImageDrawable(ContextCompat.getDrawable(this.f36775a, R.drawable.vector_star_on));
        }
        if (item.n() >= 4) {
            this.f36790p.setImageDrawable(ContextCompat.getDrawable(this.f36775a, R.drawable.vector_star_on));
        }
        if (item.n() == 5) {
            this.f36791q.setImageDrawable(ContextCompat.getDrawable(this.f36775a, R.drawable.vector_star_on));
        }
    }

    public final void f(X4.K item, int i8) {
        AbstractC3159y.i(item, "item");
        g(item, i8);
        this.f36787m.setImageDrawable(ContextCompat.getDrawable(this.f36775a, R.drawable.vector_star_on_turbo));
        this.f36788n.setImageDrawable(ContextCompat.getDrawable(this.f36775a, R.drawable.vector_star_off_turbo));
        this.f36789o.setImageDrawable(ContextCompat.getDrawable(this.f36775a, R.drawable.vector_star_off_turbo));
        this.f36790p.setImageDrawable(ContextCompat.getDrawable(this.f36775a, R.drawable.vector_star_off_turbo));
        this.f36791q.setImageDrawable(ContextCompat.getDrawable(this.f36775a, R.drawable.vector_star_off_turbo));
        if (item.n() >= 2) {
            this.f36788n.setImageDrawable(ContextCompat.getDrawable(this.f36775a, R.drawable.vector_star_on_turbo));
        }
        if (item.n() >= 3) {
            this.f36789o.setImageDrawable(ContextCompat.getDrawable(this.f36775a, R.drawable.vector_star_on_turbo));
        }
        if (item.n() >= 4) {
            this.f36790p.setImageDrawable(ContextCompat.getDrawable(this.f36775a, R.drawable.vector_star_on_turbo));
        }
        if (item.n() == 5) {
            this.f36791q.setImageDrawable(ContextCompat.getDrawable(this.f36775a, R.drawable.vector_star_on_turbo));
        }
        this.f36792r.setVisibility(0);
        C3323k.f34483a.a(this.f36777c);
    }
}
