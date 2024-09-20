package D4;

import W4.InterfaceC1478a;
import X4.C1498h;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3159y;
import o5.C3540d;

/* renamed from: D4.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1107p extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    private W4.s f1767a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC1478a f1768b;

    /* renamed from: c, reason: collision with root package name */
    private Context f1769c;

    /* renamed from: d, reason: collision with root package name */
    private ArrayList f1770d;

    public C1107p(W4.s listener, InterfaceC1478a actionsClickListener, Context context) {
        AbstractC3159y.i(listener, "listener");
        AbstractC3159y.i(actionsClickListener, "actionsClickListener");
        AbstractC3159y.i(context, "context");
        this.f1767a = listener;
        this.f1768b = actionsClickListener;
        this.f1769c = context;
        this.f1770d = new ArrayList();
    }

    public final ArrayList a() {
        return this.f1770d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C3540d holder, int i8) {
        AbstractC3159y.i(holder, "holder");
        Object obj = this.f1770d.get(i8);
        AbstractC3159y.h(obj, "apps[position]");
        holder.m((C1498h) obj, i8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C3540d onCreateViewHolder(ViewGroup parent, int i8) {
        AbstractC3159y.i(parent, "parent");
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.app_info_item_small, parent, false);
        AbstractC3159y.h(itemView, "itemView");
        return new C3540d(itemView, this.f1767a, this.f1768b, this.f1769c);
    }

    public final void d(ArrayList appList) {
        AbstractC3159y.i(appList, "appList");
        ArrayList arrayList = this.f1770d;
        arrayList.clear();
        arrayList.addAll(appList);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f1770d.size();
    }
}
