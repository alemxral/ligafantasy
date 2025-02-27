package D4;

import T4.H0;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3159y;
import o5.e1;

/* loaded from: classes4.dex */
public final class V extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList f1648a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f1649b;

    /* renamed from: c, reason: collision with root package name */
    private final W4.M f1650c;

    public V(ArrayList wishlist, Context context, W4.M listener) {
        AbstractC3159y.i(wishlist, "wishlist");
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(listener, "listener");
        this.f1648a = wishlist;
        this.f1649b = context;
        this.f1650c = listener;
    }

    public final ArrayList a() {
        return this.f1648a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(e1 viewHolder, int i8) {
        AbstractC3159y.i(viewHolder, "viewHolder");
        Object obj = this.f1648a.get(i8);
        AbstractC3159y.h(obj, "wishlist[pos]");
        viewHolder.n((X4.U) obj);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public e1 onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3159y.i(viewGroup, "viewGroup");
        H0 c8 = H0.c(LayoutInflater.from(this.f1649b), viewGroup, false);
        AbstractC3159y.h(c8, "inflate(LayoutInflater.f…ntext), viewGroup, false)");
        return new e1(c8, this.f1649b, this.f1650c);
    }

    public final void d(ArrayList arrayList) {
        if (arrayList != null) {
            this.f1648a = new ArrayList(arrayList);
        } else {
            this.f1648a = new ArrayList();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f1648a.size();
    }
}
