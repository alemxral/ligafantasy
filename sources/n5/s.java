package n5;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.activities.preferences.SettingsPreferences;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class s extends RecyclerView.ItemDecoration {

    /* renamed from: a, reason: collision with root package name */
    private final int f36212a;

    public s(int i8) {
        this.f36212a = i8;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        AbstractC3159y.i(outRect, "outRect");
        AbstractC3159y.i(view, "view");
        AbstractC3159y.i(parent, "parent");
        AbstractC3159y.i(state, "state");
        SettingsPreferences.a aVar = SettingsPreferences.f29309b;
        Context context = view.getContext();
        AbstractC3159y.h(context, "view.context");
        if (AbstractC3159y.d(aVar.q(context), "ar")) {
            outRect.right = this.f36212a;
            outRect.left = 0;
            if (parent.getChildLayoutPosition(view) == state.getItemCount() - 1) {
                outRect.left = this.f36212a;
                return;
            }
            return;
        }
        outRect.left = this.f36212a;
        outRect.right = 0;
        if (parent.getChildLayoutPosition(view) == state.getItemCount() - 1) {
            outRect.right = this.f36212a;
        }
    }
}
