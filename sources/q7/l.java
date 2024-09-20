package Q7;

import J7.o;
import Q7.l;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class l extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    public final List f8414a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f8415b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f8416c;

    /* renamed from: d, reason: collision with root package name */
    public final Typeface f8417d;

    /* loaded from: classes5.dex */
    public static final class a extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        public final Typeface f8418a;

        /* renamed from: b, reason: collision with root package name */
        public final TextView f8419b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View rootView, Typeface typeface) {
            super(rootView);
            AbstractC3159y.i(rootView, "rootView");
            this.f8418a = typeface;
            View findViewById = rootView.findViewById(I1.b.f3782a1);
            AbstractC3159y.h(findViewById, "rootView.findViewById(R.id.tv_publisher_link_name)");
            this.f8419b = (TextView) findViewById;
        }

        public static final void a(Context context, o item, View view) {
            AbstractC3159y.i(context, "$context");
            AbstractC3159y.i(item, "$item");
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(item.f5687b));
            context.startActivity(intent);
        }

        public final void b(final Context context, final o item, Integer num) {
            AbstractC3159y.i(context, "context");
            AbstractC3159y.i(item, "item");
            SpannableString spannableString = new SpannableString(item.f5686a);
            spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
            TextView textView = this.f8419b;
            textView.setText(spannableString);
            if (num != null) {
                textView.setTextColor(num.intValue());
            }
            Typeface typeface = this.f8418a;
            if (typeface != null) {
                textView.setTypeface(typeface);
            }
            if (item.f5687b.length() > 0) {
                this.itemView.setOnClickListener(new View.OnClickListener() { // from class: Q7.k
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        l.a.a(context, item, view);
                    }
                });
            }
        }
    }

    public l(List items, Context context, Integer num, Typeface typeface) {
        AbstractC3159y.i(items, "items");
        AbstractC3159y.i(context, "context");
        this.f8414a = items;
        this.f8415b = context;
        this.f8416c = num;
        this.f8417d = typeface;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f8414a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i8) {
        a holder = (a) viewHolder;
        AbstractC3159y.i(holder, "holder");
        holder.b(this.f8415b, (o) this.f8414a.get(i8), this.f8416c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i8) {
        AbstractC3159y.i(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(I1.c.f3872w, parent, false);
        AbstractC3159y.h(view, "view");
        return new a(view, this.f8417d);
    }
}
