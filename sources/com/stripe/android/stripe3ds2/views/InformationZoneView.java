package com.stripe.android.stripe3ds2.views;

import Q3.j;
import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.motion.widget.Key;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.stripe.android.stripe3ds2.views.InformationZoneView;
import g6.n;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class InformationZoneView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final j f26975a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreeDS2TextView f26976b;

    /* renamed from: c, reason: collision with root package name */
    private final ThreeDS2TextView f26977c;

    /* renamed from: d, reason: collision with root package name */
    private final LinearLayout f26978d;

    /* renamed from: e, reason: collision with root package name */
    private final AppCompatImageView f26979e;

    /* renamed from: f, reason: collision with root package name */
    private final ThreeDS2TextView f26980f;

    /* renamed from: g, reason: collision with root package name */
    private final ThreeDS2TextView f26981g;

    /* renamed from: h, reason: collision with root package name */
    private final LinearLayout f26982h;

    /* renamed from: i, reason: collision with root package name */
    private final AppCompatImageView f26983i;

    /* renamed from: j, reason: collision with root package name */
    private int f26984j;

    /* renamed from: k, reason: collision with root package name */
    private int f26985k;

    /* renamed from: l, reason: collision with root package name */
    private final int f26986l;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InformationZoneView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC3159y.i(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(InformationZoneView this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.h(this$0.f26979e, this$0.f26976b, this$0.f26977c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(InformationZoneView this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.h(this$0.f26983i, this$0.f26980f, this$0.f26981g);
    }

    @VisibleForTesting
    public static /* synthetic */ void getExpandArrow$3ds2sdk_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getExpandContainer$3ds2sdk_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getExpandLabel$3ds2sdk_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getExpandText$3ds2sdk_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getWhyArrow$3ds2sdk_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getWhyContainer$3ds2sdk_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getWhyLabel$3ds2sdk_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getWhyText$3ds2sdk_release$annotations() {
    }

    private final void h(View view, TextView textView, final View view2) {
        boolean z8;
        int i8;
        int i9;
        int i10 = 0;
        if (view2.getVisibility() == 8) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            i8 = SubsamplingScaleImageView.ORIENTATION_180;
        } else {
            i8 = 0;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, Key.ROTATION, i8);
        ofFloat.setDuration(this.f26986l);
        ofFloat.start();
        textView.setEnabled(z8);
        view.setEnabled(z8);
        if (this.f26984j != 0) {
            if (this.f26985k == 0) {
                this.f26985k = textView.getTextColors().getDefaultColor();
            }
            if (z8) {
                i9 = this.f26984j;
            } else {
                i9 = this.f26985k;
            }
            textView.setTextColor(i9);
        }
        if (!z8) {
            i10 = 8;
        }
        view2.setVisibility(i10);
        if (z8) {
            view2.postDelayed(new Runnable() { // from class: a4.q
                @Override // java.lang.Runnable
                public final void run() {
                    InformationZoneView.i(view2);
                }
            }, this.f26986l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(View detailsView) {
        AbstractC3159y.i(detailsView, "$detailsView");
        Rect rect = new Rect(0, 0, detailsView.getWidth(), detailsView.getHeight());
        detailsView.getHitRect(rect);
        detailsView.requestRectangleOnScreen(rect, false);
    }

    public final void f(String str, String str2, T3.d dVar) {
        if (str != null && !n.u(str)) {
            this.f26980f.a(str, dVar);
            this.f26982h.setVisibility(0);
            this.f26981g.a(str2, dVar);
        }
    }

    public final void g(String str, String str2, T3.d dVar) {
        if (str != null && !n.u(str)) {
            this.f26976b.a(str, dVar);
            this.f26978d.setVisibility(0);
            this.f26977c.a(str2, dVar);
        }
    }

    public final AppCompatImageView getExpandArrow$3ds2sdk_release() {
        return this.f26983i;
    }

    public final LinearLayout getExpandContainer$3ds2sdk_release() {
        return this.f26982h;
    }

    public final ThreeDS2TextView getExpandLabel$3ds2sdk_release() {
        return this.f26980f;
    }

    public final ThreeDS2TextView getExpandText$3ds2sdk_release() {
        return this.f26981g;
    }

    public final int getToggleColor$3ds2sdk_release() {
        return this.f26984j;
    }

    public final AppCompatImageView getWhyArrow$3ds2sdk_release() {
        return this.f26979e;
    }

    public final LinearLayout getWhyContainer$3ds2sdk_release() {
        return this.f26978d;
    }

    public final ThreeDS2TextView getWhyLabel$3ds2sdk_release() {
        return this.f26976b;
    }

    public final ThreeDS2TextView getWhyText$3ds2sdk_release() {
        return this.f26977c;
    }

    public final void setToggleColor$3ds2sdk_release(int i8) {
        this.f26984j = i8;
    }

    public /* synthetic */ InformationZoneView(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3151p abstractC3151p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? 0 : i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InformationZoneView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3159y.i(context, "context");
        j c8 = j.c(LayoutInflater.from(context), this, true);
        AbstractC3159y.h(c8, "inflate(...)");
        this.f26975a = c8;
        ThreeDS2TextView whyLabel = c8.f8243h;
        AbstractC3159y.h(whyLabel, "whyLabel");
        this.f26976b = whyLabel;
        ThreeDS2TextView whyText = c8.f8244i;
        AbstractC3159y.h(whyText, "whyText");
        this.f26977c = whyText;
        LinearLayout whyContainer = c8.f8242g;
        AbstractC3159y.h(whyContainer, "whyContainer");
        this.f26978d = whyContainer;
        AppCompatImageView whyArrow = c8.f8241f;
        AbstractC3159y.h(whyArrow, "whyArrow");
        this.f26979e = whyArrow;
        ThreeDS2TextView expandLabel = c8.f8239d;
        AbstractC3159y.h(expandLabel, "expandLabel");
        this.f26980f = expandLabel;
        ThreeDS2TextView expandText = c8.f8240e;
        AbstractC3159y.h(expandText, "expandText");
        this.f26981g = expandText;
        LinearLayout expandContainer = c8.f8238c;
        AbstractC3159y.h(expandContainer, "expandContainer");
        this.f26982h = expandContainer;
        AppCompatImageView expandArrow = c8.f8237b;
        AbstractC3159y.h(expandArrow, "expandArrow");
        this.f26983i = expandArrow;
        this.f26986l = getResources().getInteger(R.integer.config_shortAnimTime);
        whyContainer.setOnClickListener(new View.OnClickListener() { // from class: a4.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InformationZoneView.d(InformationZoneView.this, view);
            }
        });
        expandContainer.setOnClickListener(new View.OnClickListener() { // from class: a4.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InformationZoneView.e(InformationZoneView.this, view);
            }
        });
    }
}
