package com.stripe.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import b3.C1859D;
import com.stripe.android.view.N0;
import j2.AbstractC3053E;
import java.util.Currency;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class L0 extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private final N0 f27396a;

    /* renamed from: b, reason: collision with root package name */
    private final int f27397b;

    /* renamed from: c, reason: collision with root package name */
    private final int f27398c;

    /* renamed from: d, reason: collision with root package name */
    private final int f27399d;

    /* renamed from: e, reason: collision with root package name */
    private final G2.t f27400e;

    public /* synthetic */ L0(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3151p abstractC3151p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? 0 : i8);
    }

    @Override // android.view.View
    public void setSelected(boolean z8) {
        if (z8) {
            this.f27400e.f3164c.setTextColor(this.f27397b);
            this.f27400e.f3163b.setTextColor(this.f27397b);
            this.f27400e.f3165d.setTextColor(this.f27397b);
            this.f27400e.f3166e.setVisibility(0);
            return;
        }
        this.f27400e.f3164c.setTextColor(this.f27399d);
        this.f27400e.f3163b.setTextColor(this.f27398c);
        this.f27400e.f3165d.setTextColor(this.f27399d);
        this.f27400e.f3166e.setVisibility(4);
    }

    public final void setShippingMethod(C1859D shippingMethod) {
        AbstractC3159y.i(shippingMethod, "shippingMethod");
        this.f27400e.f3164c.setText(shippingMethod.f());
        this.f27400e.f3163b.setText(shippingMethod.e());
        TextView textView = this.f27400e.f3165d;
        long b8 = shippingMethod.b();
        Currency c8 = shippingMethod.c();
        String string = getContext().getString(AbstractC3053E.f32821D0);
        AbstractC3159y.h(string, "getString(...)");
        textView.setText(E0.b(b8, c8, string));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L0(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3159y.i(context, "context");
        N0 n02 = new N0(context);
        this.f27396a = n02;
        G2.t b8 = G2.t.b(LayoutInflater.from(context), this);
        AbstractC3159y.h(b8, "inflate(...)");
        this.f27400e = b8;
        int a8 = n02.a();
        int d8 = n02.d();
        int e8 = n02.e();
        N0.a aVar = N0.f27423g;
        this.f27397b = aVar.b(a8) ? ContextCompat.getColor(context, j2.x.f33084a) : a8;
        this.f27399d = aVar.b(d8) ? ContextCompat.getColor(context, j2.x.f33086c) : d8;
        this.f27398c = aVar.b(e8) ? ContextCompat.getColor(context, j2.x.f33087d) : e8;
    }
}
