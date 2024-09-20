package com.stripe.android.view;

import M5.AbstractC1246t;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListPopupWindow;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.FrameMetricsAggregator;
import b3.EnumC1870e;
import com.stripe.android.model.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l6.AbstractC3351M;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class CardBrandView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final G2.i f27179a;

    /* renamed from: b, reason: collision with root package name */
    private final ImageView f27180b;

    /* renamed from: c, reason: collision with root package name */
    private final ImageView f27181c;

    /* renamed from: d, reason: collision with root package name */
    private final ListPopupWindow f27182d;

    /* renamed from: e, reason: collision with root package name */
    private l6.v f27183e;

    /* loaded from: classes4.dex */
    public static final class a extends View.BaseSavedState implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0685a();

        /* renamed from: a, reason: collision with root package name */
        private final Parcelable f27184a;

        /* renamed from: b, reason: collision with root package name */
        private final b f27185b;

        /* renamed from: com.stripe.android.view.CardBrandView$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0685a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new a(parcel.readParcelable(a.class.getClassLoader()), b.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Parcelable parcelable, b state) {
            super(parcelable);
            AbstractC3159y.i(state, "state");
            this.f27184a = parcelable;
            this.f27185b = state;
        }

        public final b b() {
            return this.f27185b;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC3159y.d(this.f27184a, aVar.f27184a) && AbstractC3159y.d(this.f27185b, aVar.f27185b);
        }

        public int hashCode() {
            Parcelable parcelable = this.f27184a;
            return ((parcelable == null ? 0 : parcelable.hashCode()) * 31) + this.f27185b.hashCode();
        }

        public String toString() {
            return "SavedState(superSavedState=" + this.f27184a + ", state=" + this.f27185b + ")";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeParcelable(this.f27184a, i8);
            this.f27185b.writeToParcel(out, i8);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardBrandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC3159y.i(context, "context");
    }

    private final void d() {
        EnumC1870e e8;
        if (getState().i().size() > 1) {
            e8 = AbstractC2474w.a(getState().o(), getState().i(), getState().f());
        } else {
            e8 = getState().e();
        }
        if (getBrand() != e8) {
            setBrand(e8);
        }
        j();
    }

    private final void e(EnumC1870e enumC1870e) {
        Object value;
        if (enumC1870e != null) {
            l6.v vVar = this.f27183e;
            do {
                value = vVar.getValue();
            } while (!vVar.a(value, b.c((b) value, false, false, null, enumC1870e, null, null, false, false, 0, TypedValues.PositionType.TYPE_PERCENT_WIDTH, null)));
            d();
        }
    }

    private final void f() {
        Context context = getContext();
        AbstractC3159y.h(context, "getContext(...)");
        C2473v c2473v = new C2473v(context, getPossibleBrands(), getBrand());
        this.f27182d.setAdapter(c2473v);
        this.f27182d.setModal(true);
        this.f27182d.setWidth(i(c2473v));
        this.f27182d.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.stripe.android.view.y
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i8, long j8) {
                CardBrandView.g(CardBrandView.this, adapterView, view, i8, j8);
            }
        });
        this.f27182d.setAnchorView(this.f27180b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(CardBrandView this$0, AdapterView adapterView, View view, int i8, long j8) {
        AbstractC3159y.i(this$0, "this$0");
        EnumC1870e enumC1870e = (EnumC1870e) AbstractC1246t.p0(this$0.getPossibleBrands(), i8 - 1);
        if (enumC1870e != null) {
            this$0.e(enumC1870e);
        }
        this$0.f27182d.dismiss();
    }

    private final b getState() {
        return (b) this.f27183e.getValue();
    }

    private final int i(C2473v c2473v) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = c2473v.getCount();
        int i8 = 0;
        for (int i9 = 0; i9 < count; i9++) {
            View view = c2473v.getView(i9, null, this);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i8 = d6.m.d(i8, view.getMeasuredWidth());
        }
        return i8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        if (getState().e() == b3.EnumC1870e.f14433w) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void j() {
        /*
            r4 = this;
            android.widget.ImageView r0 = r4.f27180b
            boolean r1 = r4.getShouldShowErrorIcon()
            if (r1 == 0) goto L15
            com.stripe.android.view.CardBrandView$b r1 = r4.getState()
            b3.e r1 = r1.e()
            int r1 = r1.k()
            goto L34
        L15:
            boolean r1 = r4.getShouldShowCvc()
            if (r1 == 0) goto L28
            com.stripe.android.view.CardBrandView$b r1 = r4.getState()
            b3.e r1 = r1.e()
            int r1 = r1.g()
            goto L34
        L28:
            com.stripe.android.view.CardBrandView$b r1 = r4.getState()
            b3.e r1 = r1.e()
            int r1 = r1.l()
        L34:
            r0.setBackgroundResource(r1)
            boolean r0 = r4.getShouldShowErrorIcon()
            r1 = 0
            if (r0 == 0) goto L40
        L3e:
            r0 = r1
            goto L63
        L40:
            boolean r0 = r4.getShouldShowCvc()
            if (r0 == 0) goto L4f
            int r0 = r4.getTintColorInt$payments_core_release()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L63
        L4f:
            int r0 = r4.getTintColorInt$payments_core_release()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.stripe.android.view.CardBrandView$b r2 = r4.getState()
            b3.e r2 = r2.e()
            b3.e r3 = b3.EnumC1870e.f14433w
            if (r2 != r3) goto L3e
        L63:
            android.widget.ImageView r2 = r4.f27180b
            if (r0 == 0) goto L72
            int r0 = r0.intValue()
            android.graphics.PorterDuffColorFilter r1 = new android.graphics.PorterDuffColorFilter
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.LIGHTEN
            r1.<init>(r0, r3)
        L72:
            r2.setColorFilter(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.CardBrandView.j():void");
    }

    private final void k() {
        if (h() && getPossibleBrands().size() > 1 && !getShouldShowCvc() && !getShouldShowErrorIcon()) {
            f();
            setOnClickListener(new View.OnClickListener() { // from class: com.stripe.android.view.x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CardBrandView.l(CardBrandView.this, view);
                }
            });
            this.f27181c.setVisibility(0);
        } else {
            setOnClickListener(null);
            this.f27181c.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(CardBrandView this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        if (this$0.f27182d.isShowing()) {
            this$0.f27182d.dismiss();
        } else {
            this$0.f27182d.show();
        }
    }

    private final void setState(b bVar) {
        this.f27183e.setValue(bVar);
    }

    public final p.c.C0523c c() {
        String str;
        EnumC1870e brand = getBrand();
        if (brand == EnumC1870e.f14433w) {
            brand = null;
        }
        if (brand != null) {
            str = brand.f();
        } else {
            str = null;
        }
        p.c.C0523c c0523c = new p.c.C0523c(str);
        if (!h() || getPossibleBrands().size() <= 1) {
            return null;
        }
        return c0523c;
    }

    public final EnumC1870e getBrand() {
        return getState().e();
    }

    public final List<EnumC1870e> getMerchantPreferredNetworks() {
        return getState().f();
    }

    public final List<EnumC1870e> getPossibleBrands() {
        return getState().i();
    }

    public final boolean getShouldShowCvc() {
        return getState().j();
    }

    public final boolean getShouldShowErrorIcon() {
        return getState().k();
    }

    public final int getTintColorInt$payments_core_release() {
        return getState().n();
    }

    public final boolean h() {
        return getState().s();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        a aVar;
        b bVar;
        Parcelable superState;
        if (parcelable instanceof a) {
            aVar = (a) parcelable;
        } else {
            aVar = null;
        }
        if (aVar == null || (bVar = aVar.b()) == null) {
            bVar = new b(false, false, null, null, null, null, false, false, 0, FrameMetricsAggregator.EVERY_DURATION, null);
        }
        setState(bVar);
        d();
        k();
        if (aVar != null && (superState = aVar.getSuperState()) != null) {
            parcelable = superState;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        return new a(super.onSaveInstanceState(), getState());
    }

    public final void setBrand(EnumC1870e value) {
        Object value2;
        AbstractC3159y.i(value, "value");
        l6.v vVar = this.f27183e;
        do {
            value2 = vVar.getValue();
        } while (!vVar.a(value2, b.c((b) value2, false, false, value, null, null, null, false, false, 0, TypedValues.PositionType.TYPE_PERCENT_Y, null)));
        d();
        k();
    }

    public final void setCbcEligible(boolean z8) {
        Object value;
        l6.v vVar = this.f27183e;
        do {
            value = vVar.getValue();
        } while (!vVar.a(value, b.c((b) value, z8, false, null, null, null, null, false, false, 0, TypedValues.PositionType.TYPE_POSITION_TYPE, null)));
        k();
    }

    public final void setMerchantPreferredNetworks(List<? extends EnumC1870e> value) {
        Object value2;
        AbstractC3159y.i(value, "value");
        l6.v vVar = this.f27183e;
        do {
            value2 = vVar.getValue();
        } while (!vVar.a(value2, b.c((b) value2, false, false, null, null, null, value, false, false, 0, 479, null)));
        d();
    }

    public final void setPossibleBrands(List<? extends EnumC1870e> value) {
        Object value2;
        AbstractC3159y.i(value, "value");
        l6.v vVar = this.f27183e;
        do {
            value2 = vVar.getValue();
        } while (!vVar.a(value2, b.c((b) value2, false, false, null, null, value, null, false, false, 0, 495, null)));
        d();
        k();
    }

    public final void setShouldShowCvc(boolean z8) {
        Object value;
        l6.v vVar = this.f27183e;
        do {
            value = vVar.getValue();
        } while (!vVar.a(value, b.c((b) value, false, false, null, null, null, null, z8, false, 0, 447, null)));
        j();
    }

    public final void setShouldShowErrorIcon(boolean z8) {
        Object value;
        l6.v vVar = this.f27183e;
        do {
            value = vVar.getValue();
        } while (!vVar.a(value, b.c((b) value, false, false, null, null, null, null, false, z8, 0, 383, null)));
        j();
    }

    public final void setTintColorInt$payments_core_release(int i8) {
        Object value;
        l6.v vVar = this.f27183e;
        do {
            value = vVar.getValue();
        } while (!vVar.a(value, b.c((b) value, false, false, null, null, null, null, false, false, i8, 255, null)));
    }

    public /* synthetic */ CardBrandView(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3151p abstractC3151p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? 0 : i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardBrandView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3159y.i(context, "context");
        G2.i b8 = G2.i.b(LayoutInflater.from(context), this);
        AbstractC3159y.h(b8, "inflate(...)");
        this.f27179a = b8;
        ImageView icon = b8.f3121c;
        AbstractC3159y.h(icon, "icon");
        this.f27180b = icon;
        ImageView chevron = b8.f3120b;
        AbstractC3159y.h(chevron, "chevron");
        this.f27181c = chevron;
        this.f27182d = new ListPopupWindow(context);
        this.f27183e = AbstractC3351M.a(new b(false, false, null, null, null, null, false, false, 0, FrameMetricsAggregator.EVERY_DURATION, null));
        setClickable(false);
        setFocusable(false);
        d();
        k();
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final boolean f27186a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f27187b;

        /* renamed from: c, reason: collision with root package name */
        private final EnumC1870e f27188c;

        /* renamed from: d, reason: collision with root package name */
        private final EnumC1870e f27189d;

        /* renamed from: e, reason: collision with root package name */
        private final List f27190e;

        /* renamed from: f, reason: collision with root package name */
        private final List f27191f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f27192g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f27193h;

        /* renamed from: i, reason: collision with root package name */
        private final int f27194i;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                boolean z8 = parcel.readInt() != 0;
                boolean z9 = parcel.readInt() != 0;
                EnumC1870e valueOf = EnumC1870e.valueOf(parcel.readString());
                EnumC1870e valueOf2 = parcel.readInt() == 0 ? null : EnumC1870e.valueOf(parcel.readString());
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i8 = 0; i8 != readInt; i8++) {
                    arrayList.add(EnumC1870e.valueOf(parcel.readString()));
                }
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                for (int i9 = 0; i9 != readInt2; i9++) {
                    arrayList2.add(EnumC1870e.valueOf(parcel.readString()));
                }
                return new b(z8, z9, valueOf, valueOf2, arrayList, arrayList2, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        public b(boolean z8, boolean z9, EnumC1870e brand, EnumC1870e enumC1870e, List possibleBrands, List merchantPreferredNetworks, boolean z10, boolean z11, int i8) {
            AbstractC3159y.i(brand, "brand");
            AbstractC3159y.i(possibleBrands, "possibleBrands");
            AbstractC3159y.i(merchantPreferredNetworks, "merchantPreferredNetworks");
            this.f27186a = z8;
            this.f27187b = z9;
            this.f27188c = brand;
            this.f27189d = enumC1870e;
            this.f27190e = possibleBrands;
            this.f27191f = merchantPreferredNetworks;
            this.f27192g = z10;
            this.f27193h = z11;
            this.f27194i = i8;
        }

        public static /* synthetic */ b c(b bVar, boolean z8, boolean z9, EnumC1870e enumC1870e, EnumC1870e enumC1870e2, List list, List list2, boolean z10, boolean z11, int i8, int i9, Object obj) {
            boolean z12;
            boolean z13;
            EnumC1870e enumC1870e3;
            EnumC1870e enumC1870e4;
            List list3;
            List list4;
            boolean z14;
            boolean z15;
            int i10;
            if ((i9 & 1) != 0) {
                z12 = bVar.f27186a;
            } else {
                z12 = z8;
            }
            if ((i9 & 2) != 0) {
                z13 = bVar.f27187b;
            } else {
                z13 = z9;
            }
            if ((i9 & 4) != 0) {
                enumC1870e3 = bVar.f27188c;
            } else {
                enumC1870e3 = enumC1870e;
            }
            if ((i9 & 8) != 0) {
                enumC1870e4 = bVar.f27189d;
            } else {
                enumC1870e4 = enumC1870e2;
            }
            if ((i9 & 16) != 0) {
                list3 = bVar.f27190e;
            } else {
                list3 = list;
            }
            if ((i9 & 32) != 0) {
                list4 = bVar.f27191f;
            } else {
                list4 = list2;
            }
            if ((i9 & 64) != 0) {
                z14 = bVar.f27192g;
            } else {
                z14 = z10;
            }
            if ((i9 & 128) != 0) {
                z15 = bVar.f27193h;
            } else {
                z15 = z11;
            }
            if ((i9 & 256) != 0) {
                i10 = bVar.f27194i;
            } else {
                i10 = i8;
            }
            return bVar.b(z12, z13, enumC1870e3, enumC1870e4, list3, list4, z14, z15, i10);
        }

        public final b b(boolean z8, boolean z9, EnumC1870e brand, EnumC1870e enumC1870e, List possibleBrands, List merchantPreferredNetworks, boolean z10, boolean z11, int i8) {
            AbstractC3159y.i(brand, "brand");
            AbstractC3159y.i(possibleBrands, "possibleBrands");
            AbstractC3159y.i(merchantPreferredNetworks, "merchantPreferredNetworks");
            return new b(z8, z9, brand, enumC1870e, possibleBrands, merchantPreferredNetworks, z10, z11, i8);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final EnumC1870e e() {
            return this.f27188c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f27186a == bVar.f27186a && this.f27187b == bVar.f27187b && this.f27188c == bVar.f27188c && this.f27189d == bVar.f27189d && AbstractC3159y.d(this.f27190e, bVar.f27190e) && AbstractC3159y.d(this.f27191f, bVar.f27191f) && this.f27192g == bVar.f27192g && this.f27193h == bVar.f27193h && this.f27194i == bVar.f27194i;
        }

        public final List f() {
            return this.f27191f;
        }

        public int hashCode() {
            int a8 = ((((androidx.compose.foundation.a.a(this.f27186a) * 31) + androidx.compose.foundation.a.a(this.f27187b)) * 31) + this.f27188c.hashCode()) * 31;
            EnumC1870e enumC1870e = this.f27189d;
            return ((((((((((a8 + (enumC1870e == null ? 0 : enumC1870e.hashCode())) * 31) + this.f27190e.hashCode()) * 31) + this.f27191f.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f27192g)) * 31) + androidx.compose.foundation.a.a(this.f27193h)) * 31) + this.f27194i;
        }

        public final List i() {
            return this.f27190e;
        }

        public final boolean j() {
            return this.f27192g;
        }

        public final boolean k() {
            return this.f27193h;
        }

        public final int n() {
            return this.f27194i;
        }

        public final EnumC1870e o() {
            return this.f27189d;
        }

        public final boolean s() {
            return this.f27186a;
        }

        public String toString() {
            return "State(isCbcEligible=" + this.f27186a + ", isLoading=" + this.f27187b + ", brand=" + this.f27188c + ", userSelectedBrand=" + this.f27189d + ", possibleBrands=" + this.f27190e + ", merchantPreferredNetworks=" + this.f27191f + ", shouldShowCvc=" + this.f27192g + ", shouldShowErrorIcon=" + this.f27193h + ", tintColor=" + this.f27194i + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeInt(this.f27186a ? 1 : 0);
            out.writeInt(this.f27187b ? 1 : 0);
            out.writeString(this.f27188c.name());
            EnumC1870e enumC1870e = this.f27189d;
            if (enumC1870e == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(enumC1870e.name());
            }
            List list = this.f27190e;
            out.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                out.writeString(((EnumC1870e) it.next()).name());
            }
            List list2 = this.f27191f;
            out.writeInt(list2.size());
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                out.writeString(((EnumC1870e) it2.next()).name());
            }
            out.writeInt(this.f27192g ? 1 : 0);
            out.writeInt(this.f27193h ? 1 : 0);
            out.writeInt(this.f27194i);
        }

        public /* synthetic */ b(boolean z8, boolean z9, EnumC1870e enumC1870e, EnumC1870e enumC1870e2, List list, List list2, boolean z10, boolean z11, int i8, int i9, AbstractC3151p abstractC3151p) {
            this((i9 & 1) != 0 ? false : z8, (i9 & 2) != 0 ? false : z9, (i9 & 4) != 0 ? EnumC1870e.f14433w : enumC1870e, (i9 & 8) != 0 ? null : enumC1870e2, (i9 & 16) != 0 ? AbstractC1246t.m() : list, (i9 & 32) != 0 ? AbstractC1246t.m() : list2, (i9 & 64) != 0 ? false : z10, (i9 & 128) != 0 ? false : z11, (i9 & 256) == 0 ? i8 : 0);
        }
    }
}
