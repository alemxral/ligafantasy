package com.stripe.android.view;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.R;
import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import b3.EnumC1870e;
import com.google.android.material.textfield.TextInputLayout;
import j2.AbstractC3053E;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l2.h;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class CvcEditText extends StripeEditText {

    /* renamed from: p, reason: collision with root package name */
    private EnumC1870e f27331p;

    /* renamed from: q, reason: collision with root package name */
    private /* synthetic */ Function0 f27332q;

    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27333a;

        static {
            int[] iArr = new int[EnumC1870e.values().length];
            try {
                iArr[EnumC1870e.f14427q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f27333a = iArr;
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f27334a = new b();

        b() {
            super(0);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5556invoke() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5556invoke();
            return L5.I.f6474a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            CvcEditText.this.setShouldShowError(false);
            if (CvcEditText.this.f27331p.p(CvcEditText.this.getUnvalidatedCvc().a())) {
                CvcEditText.this.getCompletionCallback$payments_core_release().invoke();
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CvcEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC3159y.i(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h.b getUnvalidatedCvc() {
        return new h.b(getFieldText$payments_core_release());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(CvcEditText this$0, View view, boolean z8) {
        AbstractC3159y.i(this$0, "this$0");
        if (!z8 && this$0.getUnvalidatedCvc().c(this$0.f27331p.m())) {
            this$0.setShouldShowError(true);
        }
    }

    private final InputFilter[] p(EnumC1870e enumC1870e) {
        return new InputFilter[]{new InputFilter.LengthFilter(enumC1870e.m())};
    }

    @Override // com.stripe.android.view.StripeEditText
    protected String getAccessibilityText() {
        String string = getResources().getString(AbstractC3053E.f32858c, getText());
        AbstractC3159y.h(string, "getString(...)");
        return string;
    }

    public final Function0 getCompletionCallback$payments_core_release() {
        return this.f27332q;
    }

    public final h.c getCvc$payments_core_release() {
        return getUnvalidatedCvc().d(this.f27331p.m());
    }

    public final /* synthetic */ void q(EnumC1870e cardBrand, String str, String str2, TextInputLayout textInputLayout) {
        int i8;
        boolean z8;
        AbstractC3159y.i(cardBrand, "cardBrand");
        this.f27331p = cardBrand;
        setFilters(p(cardBrand));
        if (str == null) {
            if (cardBrand == EnumC1870e.f14427q) {
                str = getResources().getString(AbstractC3053E.f32857b0);
            } else {
                str = getResources().getString(AbstractC3053E.f32863e0);
            }
            AbstractC3159y.f(str);
        }
        if (getUnvalidatedCvc().a().length() > 0) {
            if (getUnvalidatedCvc().d(cardBrand.m()) == null) {
                z8 = true;
            } else {
                z8 = false;
            }
            setShouldShowError(z8);
        }
        if (textInputLayout != null) {
            textInputLayout.setHint(str);
            if (str2 == null) {
                Resources resources = getResources();
                if (a.f27333a[cardBrand.ordinal()] == 1) {
                    i8 = AbstractC3053E.f32861d0;
                } else {
                    i8 = AbstractC3053E.f32859c0;
                }
                str2 = resources.getString(i8);
            }
            textInputLayout.setPlaceholderText(str2);
            return;
        }
        setHint(str);
    }

    public final void setCompletionCallback$payments_core_release(Function0 function0) {
        AbstractC3159y.i(function0, "<set-?>");
        this.f27332q = function0;
    }

    public /* synthetic */ CvcEditText(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3151p abstractC3151p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? R.attr.editTextStyle : i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CvcEditText(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3159y.i(context, "context");
        EnumC1870e enumC1870e = EnumC1870e.f14433w;
        this.f27331p = enumC1870e;
        this.f27332q = b.f27334a;
        setErrorMessage(getResources().getString(AbstractC3053E.f32897v0));
        setHint(AbstractC3053E.f32863e0);
        setMaxLines(1);
        setFilters(p(enumC1870e));
        j();
        if (Build.VERSION.SDK_INT >= 26) {
            setAutofillHints(new String[]{HintConstants.AUTOFILL_HINT_CREDIT_CARD_SECURITY_CODE});
        }
        addTextChangedListener(new c());
        getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.W
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z8) {
                CvcEditText.m(CvcEditText.this, view, z8);
            }
        });
        setLayoutDirection(0);
    }
}
