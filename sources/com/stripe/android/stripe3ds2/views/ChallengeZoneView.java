package com.stripe.android.stripe3ds2.views;

import M5.N;
import Q3.h;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.annotation.DrawableRes;
import androidx.core.widget.CompoundButtonCompat;
import d6.i;
import d6.m;
import g6.n;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class ChallengeZoneView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private final ThreeDS2HeaderTextView f26966a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreeDS2TextView f26967b;

    /* renamed from: c, reason: collision with root package name */
    private final ThreeDS2Button f26968c;

    /* renamed from: d, reason: collision with root package name */
    private final ThreeDS2Button f26969d;

    /* renamed from: e, reason: collision with root package name */
    private final ThreeDS2TextView f26970e;

    /* renamed from: f, reason: collision with root package name */
    private final RadioGroup f26971f;

    /* renamed from: g, reason: collision with root package name */
    private final FrameLayout f26972g;

    /* renamed from: h, reason: collision with root package name */
    private final RadioButton f26973h;

    /* renamed from: i, reason: collision with root package name */
    private final RadioButton f26974i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChallengeZoneView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC3159y.i(context, "context");
    }

    public final void a(String str, T3.d dVar) {
        if (str != null && !n.u(str)) {
            this.f26966a.a(str, dVar);
        } else {
            this.f26966a.setVisibility(8);
        }
    }

    public final void b(String str, T3.d dVar) {
        if (str != null && !n.u(str)) {
            this.f26967b.a(str, dVar);
        } else {
            this.f26967b.setVisibility(8);
        }
    }

    public final void c(String str, T3.b bVar) {
        if (str != null && !n.u(str)) {
            this.f26969d.setVisibility(0);
            this.f26969d.setText(str);
            this.f26969d.setButtonCustomization(bVar);
        }
    }

    public final void d(String str, T3.b bVar) {
        if (str != null && !n.u(str)) {
            this.f26968c.setText(str);
            this.f26968c.setButtonCustomization(bVar);
        } else {
            this.f26968c.setVisibility(8);
        }
    }

    public final void e(String str, T3.d dVar, T3.b bVar) {
        RadioButton radioButton;
        if (str != null && !n.u(str)) {
            this.f26970e.a(str, dVar);
            if (bVar != null) {
                i s8 = m.s(0, this.f26971f.getChildCount());
                ArrayList<RadioButton> arrayList = new ArrayList();
                Iterator it = s8.iterator();
                while (it.hasNext()) {
                    View childAt = this.f26971f.getChildAt(((N) it).nextInt());
                    if (childAt instanceof RadioButton) {
                        radioButton = (RadioButton) childAt;
                    } else {
                        radioButton = null;
                    }
                    if (radioButton != null) {
                        arrayList.add(radioButton);
                    }
                }
                for (RadioButton radioButton2 : arrayList) {
                    String e8 = bVar.e();
                    if (e8 != null && !n.u(e8)) {
                        CompoundButtonCompat.setButtonTintList(radioButton2, ColorStateList.valueOf(Color.parseColor(bVar.e())));
                    }
                    String k8 = bVar.k();
                    if (k8 != null && !n.u(k8)) {
                        radioButton2.setTextColor(Color.parseColor(bVar.k()));
                    }
                }
            }
            this.f26970e.setVisibility(0);
            this.f26971f.setVisibility(0);
        }
    }

    public final FrameLayout getChallengeEntryView$3ds2sdk_release() {
        return this.f26972g;
    }

    public final ThreeDS2HeaderTextView getInfoHeader$3ds2sdk_release() {
        return this.f26966a;
    }

    public final ThreeDS2TextView getInfoTextView$3ds2sdk_release() {
        return this.f26967b;
    }

    public final ThreeDS2Button getResendButton$3ds2sdk_release() {
        return this.f26969d;
    }

    public final ThreeDS2Button getSubmitButton$3ds2sdk_release() {
        return this.f26968c;
    }

    public final RadioButton getWhitelistNoRadioButton$3ds2sdk_release() {
        return this.f26974i;
    }

    public final RadioGroup getWhitelistRadioGroup$3ds2sdk_release() {
        return this.f26971f;
    }

    public final RadioButton getWhitelistYesRadioButton$3ds2sdk_release() {
        return this.f26973h;
    }

    public final ThreeDS2TextView getWhitelistingLabel$3ds2sdk_release() {
        return this.f26970e;
    }

    public final boolean getWhitelistingSelection$3ds2sdk_release() {
        if (this.f26971f.getCheckedRadioButtonId() == P3.d.f7938l) {
            return true;
        }
        return false;
    }

    public final void setChallengeEntryView(View challengeEntryView) {
        AbstractC3159y.i(challengeEntryView, "challengeEntryView");
        this.f26972g.addView(challengeEntryView);
    }

    public final void setInfoTextIndicator(@DrawableRes int i8) {
        this.f26967b.setCompoundDrawablesRelativeWithIntrinsicBounds(i8, 0, 0, 0);
    }

    public final void setResendButtonClickListener(View.OnClickListener onClickListener) {
        this.f26969d.setOnClickListener(onClickListener);
    }

    public final void setSubmitButtonClickListener(View.OnClickListener onClickListener) {
        this.f26968c.setOnClickListener(onClickListener);
    }

    public /* synthetic */ ChallengeZoneView(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3151p abstractC3151p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? 0 : i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeZoneView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3159y.i(context, "context");
        h b8 = h.b(LayoutInflater.from(context), this);
        AbstractC3159y.h(b8, "inflate(...)");
        ThreeDS2HeaderTextView czvHeader = b8.f8226c;
        AbstractC3159y.h(czvHeader, "czvHeader");
        this.f26966a = czvHeader;
        ThreeDS2TextView czvInfo = b8.f8227d;
        AbstractC3159y.h(czvInfo, "czvInfo");
        this.f26967b = czvInfo;
        ThreeDS2Button czvSubmitButton = b8.f8229f;
        AbstractC3159y.h(czvSubmitButton, "czvSubmitButton");
        this.f26968c = czvSubmitButton;
        ThreeDS2Button czvResendButton = b8.f8228e;
        AbstractC3159y.h(czvResendButton, "czvResendButton");
        this.f26969d = czvResendButton;
        ThreeDS2TextView czvWhitelistingLabel = b8.f8233j;
        AbstractC3159y.h(czvWhitelistingLabel, "czvWhitelistingLabel");
        this.f26970e = czvWhitelistingLabel;
        RadioGroup czvWhitelistRadioGroup = b8.f8231h;
        AbstractC3159y.h(czvWhitelistRadioGroup, "czvWhitelistRadioGroup");
        this.f26971f = czvWhitelistRadioGroup;
        FrameLayout czvEntryView = b8.f8225b;
        AbstractC3159y.h(czvEntryView, "czvEntryView");
        this.f26972g = czvEntryView;
        RadioButton czvWhitelistYesButton = b8.f8232i;
        AbstractC3159y.h(czvWhitelistYesButton, "czvWhitelistYesButton");
        this.f26973h = czvWhitelistYesButton;
        RadioButton czvWhitelistNoButton = b8.f8230g;
        AbstractC3159y.h(czvWhitelistNoButton, "czvWhitelistNoButton");
        this.f26974i = czvWhitelistNoButton;
    }
}
