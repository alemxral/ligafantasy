package H4;

import E4.f;
import J4.g;
import R4.e;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class b extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    private final g f3509a;

    /* renamed from: b, reason: collision with root package name */
    private ArrayList f3510b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f3511c;

    /* renamed from: d, reason: collision with root package name */
    private boolean[] f3512d;

    public b(g listener) {
        AbstractC3159y.i(listener, "listener");
        this.f3509a = listener;
    }

    public final int a() {
        boolean[] zArr = this.f3512d;
        if (zArr == null) {
            return 0;
        }
        AbstractC3159y.f(zArr);
        int i8 = 0;
        for (boolean z8 : zArr) {
            if (z8) {
                i8++;
            }
        }
        return i8;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        if (this.f3510b != null) {
            boolean[] zArr = this.f3512d;
            AbstractC3159y.f(zArr);
            int length = zArr.length;
            for (int i8 = 0; i8 < length; i8++) {
                if (zArr[i8]) {
                    ArrayList arrayList2 = this.f3510b;
                    AbstractC3159y.f(arrayList2);
                    arrayList.add(arrayList2.get(i8));
                }
            }
        }
        return arrayList;
    }

    public final boolean c() {
        return this.f3511c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(e viewHolder, int i8) {
        AbstractC3159y.i(viewHolder, "viewHolder");
        ArrayList arrayList = this.f3510b;
        if (arrayList != null) {
            AbstractC3159y.f(arrayList);
            Object obj = arrayList.get(i8);
            AbstractC3159y.h(obj, "data!![pos]");
            boolean z8 = this.f3511c;
            boolean[] zArr = this.f3512d;
            AbstractC3159y.f(zArr);
            viewHolder.c(obj, z8, zArr[i8]);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public e onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3159y.i(viewGroup, "viewGroup");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(f.f2195s, viewGroup, false);
        AbstractC3159y.h(inflate, "from(viewGroup.context).…e_item, viewGroup, false)");
        return new e(inflate, this.f3509a);
    }

    public final void f(int i8) {
        ArrayList arrayList = this.f3510b;
        if (arrayList != null && i8 >= 0) {
            AbstractC3159y.f(arrayList);
            if (i8 <= arrayList.size()) {
                ArrayList arrayList2 = this.f3510b;
                AbstractC3159y.f(arrayList2);
                arrayList2.remove(i8);
                notifyItemRemoved(i8);
            }
        }
    }

    public final void g(ArrayList arrayList) {
        if (arrayList != null) {
            this.f3510b = arrayList;
            this.f3512d = new boolean[arrayList.size()];
        } else {
            this.f3510b = new ArrayList();
            this.f3512d = new boolean[0];
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        ArrayList arrayList = this.f3510b;
        if (arrayList != null) {
            AbstractC3159y.f(arrayList);
            return arrayList.size();
        }
        return 0;
    }

    public final void h(int i8) {
        boolean[] zArr = this.f3512d;
        AbstractC3159y.f(zArr);
        AbstractC3159y.f(this.f3512d);
        zArr[i8] = !r1[i8];
        notifyItemChanged(i8);
    }

    public final void i(boolean z8) {
        this.f3511c = z8;
        if (!z8) {
            ArrayList arrayList = this.f3510b;
            if (arrayList != null) {
                AbstractC3159y.f(arrayList);
                this.f3512d = new boolean[arrayList.size()];
            } else {
                this.f3512d = new boolean[0];
            }
        }
        notifyDataSetChanged();
    }
}
