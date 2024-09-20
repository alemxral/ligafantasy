package com.stripe.android.view;

import M5.AbstractC1246t;
import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import androidx.appcompat.R;
import androidx.compose.runtime.internal.StabilityInferred;
import com.stripe.android.view.C2469s;
import j2.AbstractC3053E;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class BecsDebitBsbEditText extends StripeEditText {

    /* renamed from: s, reason: collision with root package name */
    private static final b f27138s = new b(null);

    /* renamed from: t, reason: collision with root package name */
    public static final int f27139t = 8;

    /* renamed from: p, reason: collision with root package name */
    private final C2469s f27140p;

    /* renamed from: q, reason: collision with root package name */
    private Function1 f27141q;

    /* renamed from: r, reason: collision with root package name */
    private Function0 f27142r;

    /* loaded from: classes4.dex */
    public static final class a extends Q0 {

        /* renamed from: a, reason: collision with root package name */
        private boolean f27143a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f27144b;

        /* renamed from: c, reason: collision with root package name */
        private String f27145c;

        a() {
        }

        @Override // com.stripe.android.view.Q0, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            boolean z8;
            String str;
            if (this.f27143a) {
                return;
            }
            boolean z9 = true;
            this.f27143a = true;
            if (!BecsDebitBsbEditText.this.f() && (str = this.f27145c) != null) {
                BecsDebitBsbEditText.this.setText(str);
                Integer num = this.f27144b;
                if (num != null) {
                    BecsDebitBsbEditText becsDebitBsbEditText = BecsDebitBsbEditText.this;
                    becsDebitBsbEditText.setSelection(d6.m.k(num.intValue(), 0, becsDebitBsbEditText.getFieldText$payments_core_release().length()));
                }
            }
            String str2 = null;
            this.f27145c = null;
            this.f27144b = null;
            this.f27143a = false;
            if (BecsDebitBsbEditText.this.getBank() == null && BecsDebitBsbEditText.this.getFieldText$payments_core_release().length() >= 2) {
                z8 = true;
            } else {
                z8 = false;
            }
            BecsDebitBsbEditText becsDebitBsbEditText2 = BecsDebitBsbEditText.this;
            if (z8) {
                str2 = becsDebitBsbEditText2.getResources().getString(AbstractC3053E.f32846S);
            }
            becsDebitBsbEditText2.setErrorMessage$payments_core_release(str2);
            BecsDebitBsbEditText becsDebitBsbEditText3 = BecsDebitBsbEditText.this;
            if (becsDebitBsbEditText3.getErrorMessage$payments_core_release() == null) {
                z9 = false;
            }
            becsDebitBsbEditText3.setShouldShowError(z9);
            BecsDebitBsbEditText.this.getOnBankChangedCallback().invoke(BecsDebitBsbEditText.this.getBank());
            BecsDebitBsbEditText.this.r(z8);
            if (BecsDebitBsbEditText.this.q()) {
                BecsDebitBsbEditText.this.getOnCompletedCallback().invoke();
            }
        }

        @Override // com.stripe.android.view.Q0, android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
            String str;
            if (this.f27143a || i8 > 4) {
                return;
            }
            Integer num = null;
            if (charSequence != null) {
                str = charSequence.toString();
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            StringBuilder sb = new StringBuilder();
            int length = str.length();
            for (int i11 = 0; i11 < length; i11++) {
                char charAt = str.charAt(i11);
                if (Character.isDigit(charAt)) {
                    sb.append(charAt);
                }
            }
            String sb2 = sb.toString();
            AbstractC3159y.h(sb2, "toString(...)");
            String p8 = BecsDebitBsbEditText.this.p(sb2);
            this.f27145c = p8;
            if (p8 != null) {
                num = Integer.valueOf(p8.length());
            }
            this.f27144b = num;
        }
    }

    /* loaded from: classes4.dex */
    private static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f27147a = new c();

        c() {
            super(1);
        }

        public final void a(C2469s.a aVar) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C2469s.a) obj);
            return L5.I.f6474a;
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f27148a = new d();

        d() {
            super(0);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5552invoke() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5552invoke();
            return L5.I.f6474a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BecsDebitBsbEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC3159y.i(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2469s.a getBank() {
        return this.f27140p.a(getFieldText$payments_core_release());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String p(String str) {
        if (str.length() >= 3) {
            return AbstractC1246t.w0(AbstractC1246t.p(g6.n.U0(str, 3), g6.n.V0(str, str.length() - 3)), "-", null, null, 0, null, null, 62, null);
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean q() {
        if (getBank() != null && getFieldText$payments_core_release().length() == 7) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(boolean z8) {
        int i8;
        if (z8) {
            i8 = j2.z.f33133n;
        } else {
            i8 = j2.z.f33126g;
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(i8, 0, 0, 0);
    }

    public final String getBsb$payments_core_release() {
        String str;
        if (getFieldText$payments_core_release().length() < 2) {
            str = getResources().getString(AbstractC3053E.f32845R);
        } else if (getBank() == null) {
            str = getResources().getString(AbstractC3053E.f32846S);
        } else if (getFieldText$payments_core_release().length() < 7) {
            str = getResources().getString(AbstractC3053E.f32845R);
        } else {
            str = null;
        }
        setErrorMessage$payments_core_release(str);
        String fieldText$payments_core_release = getFieldText$payments_core_release();
        StringBuilder sb = new StringBuilder();
        int length = fieldText$payments_core_release.length();
        for (int i8 = 0; i8 < length; i8++) {
            char charAt = fieldText$payments_core_release.charAt(i8);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        AbstractC3159y.h(sb2, "toString(...)");
        if (!q()) {
            return null;
        }
        return sb2;
    }

    public final Function1 getOnBankChangedCallback() {
        return this.f27141q;
    }

    public final Function0 getOnCompletedCallback() {
        return this.f27142r;
    }

    public final void setOnBankChangedCallback(Function1 function1) {
        AbstractC3159y.i(function1, "<set-?>");
        this.f27141q = function1;
    }

    public final void setOnCompletedCallback(Function0 function0) {
        AbstractC3159y.i(function0, "<set-?>");
        this.f27142r = function0;
    }

    public /* synthetic */ BecsDebitBsbEditText(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3151p abstractC3151p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? R.attr.editTextStyle : i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BecsDebitBsbEditText(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3159y.i(context, "context");
        this.f27140p = new C2469s(context, false, 2, null);
        this.f27141q = c.f27147a;
        this.f27142r = d.f27148a;
        setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(7)});
        setInputType(2);
        addTextChangedListener(new a());
    }
}
