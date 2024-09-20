package n5;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class r extends RecyclerView.ItemDecoration {

    /* renamed from: a, reason: collision with root package name */
    private final int f36208a;

    /* renamed from: b, reason: collision with root package name */
    private final int f36209b;

    /* renamed from: c, reason: collision with root package name */
    private final int f36210c;

    /* renamed from: d, reason: collision with root package name */
    private final int f36211d;

    public r(int i8, int i9, int i10, int i11) {
        this.f36208a = i8;
        this.f36209b = i9;
        this.f36210c = i10;
        this.f36211d = i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        AbstractC3159y.i(outRect, "outRect");
        AbstractC3159y.i(view, "view");
        AbstractC3159y.i(parent, "parent");
        AbstractC3159y.i(state, "state");
        outRect.left = this.f36208a;
        outRect.right = this.f36209b;
        outRect.bottom = this.f36210c;
        outRect.top = this.f36211d;
        if (parent.getChildLayoutPosition(view) > 0) {
            outRect.top = 0;
        }
    }
}
