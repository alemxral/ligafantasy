package n5;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class n extends RecyclerView.ItemDecoration {

    /* renamed from: a, reason: collision with root package name */
    private final int f36203a;

    /* renamed from: b, reason: collision with root package name */
    private final int f36204b;

    public n(Context context, int i8) {
        AbstractC3159y.i(context, "context");
        this.f36203a = i8;
        this.f36204b = context.getResources().getDimensionPixelSize(R.dimen.margin_m);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        AbstractC3159y.i(outRect, "outRect");
        AbstractC3159y.i(view, "view");
        AbstractC3159y.i(parent, "parent");
        AbstractC3159y.i(state, "state");
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        int i8 = this.f36203a;
        int i9 = childAdapterPosition % i8;
        int i10 = this.f36204b;
        outRect.left = (i9 * i10) / i8;
        outRect.right = i10 - (((i9 + 1) * i10) / i8);
        if (childAdapterPosition >= i8) {
            outRect.top = i10;
        }
    }
}
