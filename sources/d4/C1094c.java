package D4;

import E4.j;
import W4.InterfaceC1487j;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: D4.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1094c extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    private Context f1655a;

    /* renamed from: b, reason: collision with root package name */
    private ArrayList f1656b;

    /* renamed from: c, reason: collision with root package name */
    private int f1657c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC1487j f1658d;

    /* renamed from: D4.c$a */
    /* loaded from: classes4.dex */
    public final class a extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        private final ImageView f1659a;

        /* renamed from: b, reason: collision with root package name */
        private final TextView f1660b;

        /* renamed from: c, reason: collision with root package name */
        private final TextView f1661c;

        /* renamed from: d, reason: collision with root package name */
        private final RadioButton f1662d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C1094c f1663e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C1094c c1094c, View itemView) {
            super(itemView);
            AbstractC3159y.i(itemView, "itemView");
            this.f1663e = c1094c;
            View findViewById = itemView.findViewById(R.id.iv_path);
            AbstractC3159y.h(findViewById, "itemView.findViewById(R.id.iv_path)");
            this.f1659a = (ImageView) findViewById;
            View findViewById2 = itemView.findViewById(R.id.tv_path_name);
            AbstractC3159y.h(findViewById2, "itemView.findViewById(R.id.tv_path_name)");
            TextView textView = (TextView) findViewById2;
            this.f1660b = textView;
            View findViewById3 = itemView.findViewById(R.id.tv_path_detail);
            AbstractC3159y.h(findViewById3, "itemView.findViewById(R.id.tv_path_detail)");
            TextView textView2 = (TextView) findViewById3;
            this.f1661c = textView2;
            View findViewById4 = itemView.findViewById(R.id.rb_path);
            AbstractC3159y.h(findViewById4, "itemView.findViewById(R.id.rb_path)");
            this.f1662d = (RadioButton) findViewById4;
            j.a aVar = E4.j.f2272g;
            textView.setTypeface(aVar.u());
            textView2.setTypeface(aVar.u());
        }

        public final ImageView a() {
            return this.f1659a;
        }

        public final RadioButton b() {
            return this.f1662d;
        }

        public final TextView c() {
            return this.f1661c;
        }

        public final TextView d() {
            return this.f1660b;
        }
    }

    public C1094c(Context context, ArrayList arrayList, int i8, InterfaceC1487j listener) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(listener, "listener");
        this.f1655a = context;
        this.f1656b = arrayList;
        this.f1657c = i8;
        this.f1658d = listener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C1094c this$0, int i8, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.f1657c = i8;
        this$0.f1658d.a(i8);
        this$0.notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a holder, final int i8) {
        boolean z8 = false;
        AbstractC3159y.i(holder, "holder");
        ArrayList arrayList = this.f1656b;
        AbstractC3159y.f(arrayList);
        if (((K4.e) arrayList.get(i8)).d()) {
            holder.a().setImageResource(R.drawable.vector_more_info_size);
            TextView d8 = holder.d();
            Resources resources = this.f1655a.getResources();
            N4.g gVar = new N4.g();
            ArrayList arrayList2 = this.f1656b;
            AbstractC3159y.f(arrayList2);
            d8.setText(resources.getString(R.string.sd_card_free, gVar.c(((K4.e) arrayList2.get(i8)).a())));
        } else {
            holder.a().setImageResource(R.drawable.vector_more_info_requirements);
            TextView d9 = holder.d();
            Resources resources2 = this.f1655a.getResources();
            N4.g gVar2 = new N4.g();
            ArrayList arrayList3 = this.f1656b;
            AbstractC3159y.f(arrayList3);
            d9.setText(resources2.getString(R.string.internal_memory_free, gVar2.c(((K4.e) arrayList3.get(i8)).a())));
        }
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: D4.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1094c.c(C1094c.this, i8, view);
            }
        });
        TextView c8 = holder.c();
        ArrayList arrayList4 = this.f1656b;
        AbstractC3159y.f(arrayList4);
        c8.setText(((K4.e) arrayList4.get(i8)).b());
        RadioButton b8 = holder.b();
        if (this.f1657c == i8) {
            z8 = true;
        }
        b8.setChecked(z8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup parent, int i8) {
        AbstractC3159y.i(parent, "parent");
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.download_path, parent, false);
        AbstractC3159y.h(itemView, "itemView");
        return new a(this, itemView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        ArrayList arrayList = this.f1656b;
        if (arrayList == null) {
            return 0;
        }
        AbstractC3159y.f(arrayList);
        return arrayList.size();
    }
}
