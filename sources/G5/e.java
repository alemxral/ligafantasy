package g5;

import X4.C1498h;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.leanback.widget.ImageCardView;
import androidx.leanback.widget.Presenter;
import com.squareup.picasso.s;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class e extends Presenter {

    /* renamed from: a, reason: collision with root package name */
    private int f31254a = -1;

    /* renamed from: b, reason: collision with root package name */
    private int f31255b = -1;

    /* renamed from: c, reason: collision with root package name */
    private int f31256c = -1;

    /* renamed from: d, reason: collision with root package name */
    private int f31257d = -1;

    /* loaded from: classes5.dex */
    public static final class a extends ImageCardView {
        a(Context context) {
            super(context);
        }

        @Override // androidx.leanback.widget.BaseCardView, android.view.View
        public void setSelected(boolean z8) {
            e.this.b(this, z8);
            super.setSelected(z8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(ImageCardView imageCardView, boolean z8) {
        int i8;
        int i9;
        if (z8) {
            i8 = this.f31254a;
        } else {
            i8 = this.f31255b;
        }
        if (z8) {
            i9 = this.f31257d;
        } else {
            i9 = this.f31256c;
        }
        imageCardView.setBackgroundColor(i8);
        View findViewById = imageCardView.findViewById(R.id.info_field);
        if (findViewById != null) {
            findViewById.setBackgroundColor(i8);
        }
        TextView textView = (TextView) imageCardView.findViewById(R.id.title_text);
        if (textView != null) {
            textView.setTextColor(i9);
        }
        TextView textView2 = (TextView) imageCardView.findViewById(R.id.content_text);
        if (textView2 != null) {
            textView2.setTextColor(i9);
        }
    }

    @Override // androidx.leanback.widget.Presenter
    public void onBindViewHolder(Presenter.ViewHolder viewHolder, Object item) {
        AbstractC3159y.i(viewHolder, "viewHolder");
        AbstractC3159y.i(item, "item");
        View view = viewHolder.view;
        AbstractC3159y.g(view, "null cannot be cast to non-null type androidx.leanback.widget.ImageCardView");
        ImageCardView imageCardView = (ImageCardView) view;
        if (item instanceof C1498h) {
            C1498h c1498h = (C1498h) item;
            imageCardView.setTitleText(c1498h.s0());
            imageCardView.setContentText(c1498h.T0());
            TextView textView = (TextView) imageCardView.findViewById(R.id.title_text);
            if (textView != null) {
                textView.setVisibility(0);
                textView.setTextColor(this.f31256c);
                textView.setTypeface(E4.j.f2272g.t());
            }
            TextView textView2 = (TextView) imageCardView.findViewById(R.id.content_text);
            if (textView2 != null) {
                textView2.setVisibility(0);
                textView2.setTextColor(this.f31256c);
                textView2.setTypeface(E4.j.f2272g.u());
                textView2.setMaxLines(2);
                textView2.setLines(2);
            }
            Resources resources = imageCardView.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.tv_card_height);
            imageCardView.setMainImageDimensions(dimensionPixelSize, resources.getDimensionPixelSize(R.dimen.tv_card_height));
            s.h().l(c1498h.k0(dimensionPixelSize)).l(R.drawable.shape_bg_placeholder).i(imageCardView.getMainImageView());
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.margin_m);
            imageCardView.setPadding(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
            return;
        }
        if (item instanceof e5.c) {
            Resources resources2 = imageCardView.getResources();
            imageCardView.setMainImageDimensions(resources2.getDimensionPixelSize(R.dimen.tv_card_height) / 2, resources2.getDimensionPixelSize(R.dimen.tv_card_height) / 2);
            int dimensionPixelSize3 = resources2.getDimensionPixelSize(R.dimen.margin_m) * 5;
            imageCardView.setPadding(dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize3);
            imageCardView.setMainImage(ContextCompat.getDrawable(imageCardView.getContext(), R.drawable.vector_plus));
            TextView textView3 = (TextView) imageCardView.findViewById(R.id.title_text);
            if (textView3 != null) {
                textView3.setVisibility(8);
                textView3.setText("");
            }
            TextView textView4 = (TextView) imageCardView.findViewById(R.id.content_text);
            if (textView4 != null) {
                textView4.setVisibility(8);
                textView4.setText("");
            }
        }
    }

    @Override // androidx.leanback.widget.Presenter
    public Presenter.ViewHolder onCreateViewHolder(ViewGroup parent) {
        AbstractC3159y.i(parent, "parent");
        if (parent.getContext() != null) {
            this.f31255b = ContextCompat.getColor(parent.getContext(), R.color.white);
            this.f31254a = ContextCompat.getColor(parent.getContext(), R.color.main_blue_pressed);
            this.f31256c = ContextCompat.getColor(parent.getContext(), R.color.white);
            this.f31257d = ContextCompat.getColor(parent.getContext(), R.color.white);
            a aVar = new a(parent.getContext());
            aVar.setFocusable(true);
            aVar.setFocusableInTouchMode(true);
            b(aVar, false);
            return new Presenter.ViewHolder(aVar);
        }
        return null;
    }

    @Override // androidx.leanback.widget.Presenter
    public void onUnbindViewHolder(Presenter.ViewHolder viewHolder) {
        AbstractC3159y.i(viewHolder, "viewHolder");
        View view = viewHolder.view;
        AbstractC3159y.g(view, "null cannot be cast to non-null type androidx.leanback.widget.ImageCardView");
        ImageCardView imageCardView = (ImageCardView) view;
        imageCardView.setBadgeImage(null);
        imageCardView.setMainImage(null);
    }
}
