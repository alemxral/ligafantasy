package o5;

import E4.j;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3159y;
import o5.C3584z0;

/* renamed from: o5.z0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3584z0 extends RecyclerView.ViewHolder {

    /* renamed from: o5.z0$a */
    /* loaded from: classes5.dex */
    public static final class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f36931a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f36932b;

        a(TextView textView, View view) {
            this.f36931a = textView;
            this.f36932b = view;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(TextView tvDescription, View view, View view2) {
            AbstractC3159y.i(tvDescription, "$tvDescription");
            if (tvDescription.getMaxLines() == 3) {
                tvDescription.setMaxLines(Integer.MAX_VALUE);
                view.setVisibility(8);
            } else {
                tvDescription.setMaxLines(3);
                view.setVisibility(0);
            }
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f36931a.getViewTreeObserver().removeOnPreDrawListener(this);
            if (n5.v.a(this.f36931a)) {
                final View findViewById = this.f36932b.findViewById(R.id.shadow_description_category_description);
                TextView textView = (TextView) this.f36932b.findViewById(R.id.tv_read_more_category_description);
                textView.setTypeface(E4.j.f2272g.t());
                textView.setVisibility(0);
                final TextView textView2 = this.f36931a;
                textView.setOnClickListener(new View.OnClickListener() { // from class: o5.y0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C3584z0.a.b(textView2, findViewById, view);
                    }
                });
                findViewById.setVisibility(0);
                return true;
            }
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3584z0(View itemView, String str, String str2) {
        super(itemView);
        AbstractC3159y.i(itemView, "itemView");
        if (str != null && str.length() != 0) {
            View findViewById = itemView.findViewById(R.id.tv_top_by_category_description);
            AbstractC3159y.h(findViewById, "itemView.findViewById(R.…_by_category_description)");
            TextView textView = (TextView) findViewById;
            j.a aVar = E4.j.f2272g;
            textView.setTypeface(aVar.u());
            textView.setText(str);
            textView.getViewTreeObserver().addOnPreDrawListener(new a(textView, itemView));
            if (str2 != null && str2.length() != 0) {
                View findViewById2 = itemView.findViewById(R.id.tv_top_by_category_title);
                AbstractC3159y.h(findViewById2, "itemView.findViewById(R.…tv_top_by_category_title)");
                TextView textView2 = (TextView) findViewById2;
                textView2.setTypeface(aVar.t());
                textView2.setText(str2);
                textView2.setVisibility(0);
                return;
            }
            return;
        }
        itemView.setVisibility(8);
    }
}
