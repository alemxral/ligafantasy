package Q7;

import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class d extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    public final List f8376a;

    public d(List disclosures) {
        AbstractC3159y.i(disclosures, "disclosures");
        this.f8376a = disclosures;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f8376a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i8) {
        f holder = (f) viewHolder;
        AbstractC3159y.i(holder, "holder");
        e disclosure = (e) this.f8376a.get(i8);
        holder.getClass();
        AbstractC3159y.i(disclosure, "disclosure");
        holder.f8392k.setText(disclosure.f8377a);
        holder.f8391j.setText(disclosure.f8378b);
        holder.f8390i.setText(disclosure.f8379c);
        holder.f8389h.setText(disclosure.f8380d);
        holder.f8388g.setText(disclosure.f8381e);
        J7.c cVar = O7.d.f7798f;
        if (cVar != null) {
            Integer num = cVar.f5538i;
            if (num != null) {
                int intValue = num.intValue();
                holder.f8392k.setTextColor(intValue);
                holder.f8387f.setTextColor(intValue);
                holder.f8391j.setTextColor(intValue);
                holder.f8386e.setTextColor(intValue);
                holder.f8390i.setTextColor(intValue);
                holder.f8385d.setTextColor(intValue);
                holder.f8389h.setTextColor(intValue);
                holder.f8384c.setTextColor(intValue);
                holder.f8388g.setTextColor(intValue);
                holder.f8383b.setTextColor(intValue);
            }
            Integer num2 = cVar.f5530a;
            if (num2 != null) {
                holder.f8382a.setBackgroundColor(num2.intValue());
            }
        }
        J7.b bVar = O7.d.f7797e;
        if (bVar != null) {
            Typeface typeface = bVar.f5529b;
            if (typeface != null) {
                holder.f8392k.setTypeface(typeface);
                holder.f8387f.setTypeface(typeface);
                holder.f8391j.setTypeface(typeface);
                holder.f8386e.setTypeface(typeface);
                holder.f8390i.setTypeface(typeface);
                holder.f8385d.setTypeface(typeface);
                holder.f8389h.setTypeface(typeface);
                holder.f8384c.setTypeface(typeface);
                holder.f8388g.setTypeface(typeface);
            }
            Typeface typeface2 = bVar.f5528a;
            if (typeface2 != null) {
                holder.f8383b.setTypeface(typeface2);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i8) {
        AbstractC3159y.i(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(I1.c.f3864o, parent, false);
        AbstractC3159y.h(view, "view");
        return new f(view);
    }
}
