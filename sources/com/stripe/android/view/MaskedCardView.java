package com.stripe.android.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.core.widget.ImageViewCompat;
import b3.EnumC1870e;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import y4.AbstractC3993a;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class MaskedCardView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private EnumC1870e f27416a;

    /* renamed from: b, reason: collision with root package name */
    private String f27417b;

    /* renamed from: c, reason: collision with root package name */
    private final G2.n f27418c;

    /* renamed from: d, reason: collision with root package name */
    private final S0 f27419d;

    /* renamed from: e, reason: collision with root package name */
    private final C2477z f27420e;

    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27421a;

        static {
            int[] iArr = new int[EnumC1870e.values().length];
            try {
                iArr[EnumC1870e.f14427q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC1870e.f14428r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC1870e.f14429s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC1870e.f14430t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC1870e.f14425o.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC1870e.f14426p.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC1870e.f14431u.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC1870e.f14432v.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EnumC1870e.f14433w.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f27421a = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaskedCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC3159y.i(context, "context");
    }

    private final void a(ImageView imageView) {
        ImageViewCompat.setImageTintList(imageView, ColorStateList.valueOf(this.f27419d.d(true)));
    }

    private final void b() {
        int i8;
        AppCompatImageView appCompatImageView = this.f27418c.f3142b;
        Context context = getContext();
        switch (a.f27421a[this.f27416a.ordinal()]) {
            case 1:
                i8 = j2.z.f33122c;
                break;
            case 2:
                i8 = j2.z.f33114P;
                break;
            case 3:
                i8 = j2.z.f33115Q;
                break;
            case 4:
                i8 = j2.z.f33113O;
                break;
            case 5:
                i8 = j2.z.f33119U;
                break;
            case 6:
                i8 = j2.z.f33116R;
                break;
            case 7:
                i8 = j2.z.f33118T;
                break;
            case 8:
                i8 = j2.z.f33110L;
                break;
            case 9:
                i8 = AbstractC3993a.f39836r;
                break;
            default:
                throw new L5.p();
        }
        appCompatImageView.setImageDrawable(ContextCompat.getDrawable(context, i8));
    }

    private final void c() {
        int i8;
        AppCompatImageView appCompatImageView = this.f27418c.f3143c;
        if (isSelected()) {
            i8 = 0;
        } else {
            i8 = 4;
        }
        appCompatImageView.setVisibility(i8);
    }

    private final void d() {
        b();
        this.f27418c.f3144d.setText(this.f27420e.a(this.f27416a, this.f27417b, isSelected()));
    }

    public final EnumC1870e getCardBrand() {
        return this.f27416a;
    }

    @VisibleForTesting
    public final String getLast4() {
        return this.f27417b;
    }

    public final G2.n getViewBinding$payments_core_release() {
        return this.f27418c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if (r0 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setPaymentMethod(com.stripe.android.model.o r4) {
        /*
            r3 = this;
            java.lang.String r0 = "paymentMethod"
            kotlin.jvm.internal.AbstractC3159y.i(r4, r0)
            com.stripe.android.model.o$g r4 = r4.f24402h
            b3.e$a r0 = b3.EnumC1870e.f14423m
            r1 = 0
            if (r4 == 0) goto Lf
            java.lang.String r2 = r4.f24473l
            goto L10
        Lf:
            r2 = r1
        L10:
            b3.e r0 = r0.b(r2)
            b3.e r2 = b3.EnumC1870e.f14433w
            if (r0 == r2) goto L19
            goto L1a
        L19:
            r0 = r1
        L1a:
            if (r0 != 0) goto L25
            if (r4 == 0) goto L21
            b3.e r0 = r4.f24462a
            goto L22
        L21:
            r0 = r1
        L22:
            if (r0 != 0) goto L25
            goto L26
        L25:
            r2 = r0
        L26:
            r3.f27416a = r2
            if (r4 == 0) goto L2c
            java.lang.String r1 = r4.f24469h
        L2c:
            r3.f27417b = r1
            r3.d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.MaskedCardView.setPaymentMethod(com.stripe.android.model.o):void");
    }

    @Override // android.view.View
    public void setSelected(boolean z8) {
        super.setSelected(z8);
        c();
        d();
    }

    public /* synthetic */ MaskedCardView(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3151p abstractC3151p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? 0 : i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaskedCardView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3159y.i(context, "context");
        this.f27416a = EnumC1870e.f14433w;
        G2.n b8 = G2.n.b(LayoutInflater.from(context), this);
        AbstractC3159y.h(b8, "inflate(...)");
        this.f27418c = b8;
        S0 s02 = new S0(context);
        this.f27419d = s02;
        Resources resources = getResources();
        AbstractC3159y.h(resources, "getResources(...)");
        this.f27420e = new C2477z(resources, s02);
        AppCompatImageView brandIcon = b8.f3142b;
        AbstractC3159y.h(brandIcon, "brandIcon");
        a(brandIcon);
        AppCompatImageView checkIcon = b8.f3143c;
        AbstractC3159y.h(checkIcon, "checkIcon");
        a(checkIcon);
    }
}
