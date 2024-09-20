package G2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import j2.AbstractC3049A;
import j2.AbstractC3051C;

/* loaded from: classes4.dex */
public final class u implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final View f3167a;

    /* renamed from: b, reason: collision with root package name */
    public final RecyclerView f3168b;

    private u(View view, RecyclerView recyclerView) {
        this.f3167a = view;
        this.f3168b = recyclerView;
    }

    public static u a(View view) {
        int i8 = AbstractC3049A.f32738P;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i8);
        if (recyclerView != null) {
            return new u(view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static u b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(AbstractC3051C.f32811x, viewGroup);
            return a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.f3167a;
    }
}
