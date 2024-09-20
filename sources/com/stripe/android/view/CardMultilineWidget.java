package com.stripe.android.view;

import M5.AbstractC1246t;
import a6.AbstractC1577b;
import a6.C1576a;
import a6.InterfaceC1580e;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.ViewModelStoreOwner;
import b3.C1873h;
import b3.EnumC1870e;
import b3.w;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.model.a;
import com.stripe.android.model.o;
import com.stripe.android.model.p;
import com.stripe.android.view.A;
import com.stripe.android.view.L;
import com.stripe.android.view.PostalCodeEditText;
import com.stripe.android.view.StripeEditText;
import i6.AbstractC2829k;
import j2.AbstractC3049A;
import j2.AbstractC3053E;
import j2.AbstractC3055G;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l2.f;
import l6.InterfaceC3349K;
import l6.InterfaceC3358f;
import l6.InterfaceC3359g;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class CardMultilineWidget extends LinearLayout {

    /* renamed from: A, reason: collision with root package name */
    private final InterfaceC1580e f27198A;

    /* renamed from: B, reason: collision with root package name */
    private final InterfaceC1580e f27199B;

    /* renamed from: C, reason: collision with root package name */
    private final InterfaceC1580e f27200C;

    /* renamed from: D, reason: collision with root package name */
    private final InterfaceC1580e f27201D;

    /* renamed from: a, reason: collision with root package name */
    private boolean f27202a;

    /* renamed from: b, reason: collision with root package name */
    private final G2.j f27203b;

    /* renamed from: c, reason: collision with root package name */
    private final CardNumberEditText f27204c;

    /* renamed from: d, reason: collision with root package name */
    private final CardBrandView f27205d;

    /* renamed from: e, reason: collision with root package name */
    private final ExpiryDateEditText f27206e;

    /* renamed from: f, reason: collision with root package name */
    private final CvcEditText f27207f;

    /* renamed from: g, reason: collision with root package name */
    private final PostalCodeEditText f27208g;

    /* renamed from: h, reason: collision with root package name */
    private final LinearLayout f27209h;

    /* renamed from: i, reason: collision with root package name */
    private final CardNumberTextInputLayout f27210i;

    /* renamed from: j, reason: collision with root package name */
    private final TextInputLayout f27211j;

    /* renamed from: k, reason: collision with root package name */
    private final TextInputLayout f27212k;

    /* renamed from: l, reason: collision with root package name */
    private final TextInputLayout f27213l;

    /* renamed from: m, reason: collision with root package name */
    private final C2451i0 f27214m;

    /* renamed from: n, reason: collision with root package name */
    private final List f27215n;

    /* renamed from: o, reason: collision with root package name */
    private A f27216o;

    /* renamed from: p, reason: collision with root package name */
    private final i f27217p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f27218q;

    /* renamed from: r, reason: collision with root package name */
    private String f27219r;

    /* renamed from: s, reason: collision with root package name */
    private String f27220s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f27221t;

    /* renamed from: u, reason: collision with root package name */
    private final InterfaceC1580e f27222u;

    /* renamed from: v, reason: collision with root package name */
    private ViewModelStoreOwner f27223v;

    /* renamed from: w, reason: collision with root package name */
    private String f27224w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f27225x;

    /* renamed from: y, reason: collision with root package name */
    private final InterfaceC1580e f27226y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f27227z;

    /* renamed from: F, reason: collision with root package name */
    static final /* synthetic */ e6.i[] f27196F = {kotlin.jvm.internal.U.e(new kotlin.jvm.internal.E(CardMultilineWidget.class, "usZipCodeRequired", "getUsZipCodeRequired()Z", 0)), kotlin.jvm.internal.U.e(new kotlin.jvm.internal.E(CardMultilineWidget.class, "expirationDatePlaceholderRes", "getExpirationDatePlaceholderRes$payments_core_release()Ljava/lang/Integer;", 0)), kotlin.jvm.internal.U.e(new kotlin.jvm.internal.E(CardMultilineWidget.class, "cardNumberErrorListener", "getCardNumberErrorListener$payments_core_release()Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;", 0)), kotlin.jvm.internal.U.e(new kotlin.jvm.internal.E(CardMultilineWidget.class, "expirationDateErrorListener", "getExpirationDateErrorListener$payments_core_release()Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;", 0)), kotlin.jvm.internal.U.e(new kotlin.jvm.internal.E(CardMultilineWidget.class, "cvcErrorListener", "getCvcErrorListener$payments_core_release()Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;", 0)), kotlin.jvm.internal.U.e(new kotlin.jvm.internal.E(CardMultilineWidget.class, "postalCodeErrorListener", "getPostalCodeErrorListener$payments_core_release()Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;", 0))};

    /* renamed from: E, reason: collision with root package name */
    private static final g f27195E = new g(null);

    /* renamed from: G, reason: collision with root package name */
    public static final int f27197G = 8;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function1 {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return L5.I.f6474a;
        }

        public final void invoke(boolean z8) {
            CardMultilineWidget.this.getCardNumberTextInputLayout().setLoading$payments_core_release(z8);
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3160z implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5553invoke();
            return L5.I.f6474a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5553invoke() {
            CardMultilineWidget.this.getExpiryDateEditText().requestFocus();
            A a8 = CardMultilineWidget.this.f27216o;
            if (a8 != null) {
                a8.e();
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3160z implements Function1 {
        c() {
            super(1);
        }

        public final void a(EnumC1870e brand) {
            AbstractC3159y.i(brand, "brand");
            CardMultilineWidget.this.getCardBrandView$payments_core_release().setBrand(brand);
            CardMultilineWidget.this.z();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((EnumC1870e) obj);
            return L5.I.f6474a;
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3160z implements Function1 {
        d() {
            super(1);
        }

        public final void a(EnumC1870e brand) {
            AbstractC3159y.i(brand, "brand");
            CardMultilineWidget.this.A(brand);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((EnumC1870e) obj);
            return L5.I.f6474a;
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3160z implements Function1 {
        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List) obj);
            return L5.I.f6474a;
        }

        public final void invoke(List brands) {
            AbstractC3159y.i(brands, "brands");
            EnumC1870e brand = CardMultilineWidget.this.getCardBrandView$payments_core_release().getBrand();
            CardMultilineWidget.this.getCardBrandView$payments_core_release().setPossibleBrands(brands);
            if (!brands.contains(brand)) {
                CardMultilineWidget.this.getCardBrandView$payments_core_release().setBrand(EnumC1870e.f14433w);
            }
            EnumC1870e enumC1870e = (EnumC1870e) AbstractC1246t.o0(brands);
            if (enumC1870e == null) {
                enumC1870e = EnumC1870e.f14433w;
            }
            CardMultilineWidget.this.A(enumC1870e);
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3160z implements Function0 {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5554invoke();
            return L5.I.f6474a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5554invoke() {
            CardMultilineWidget.this.getCvcEditText().requestFocus();
            A a8 = CardMultilineWidget.this.f27216o;
            if (a8 != null) {
                a8.a();
            }
        }
    }

    /* loaded from: classes4.dex */
    private static final class g {
        private g() {
        }

        public /* synthetic */ g(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class h implements TextWatcher {
        public h() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            CardMultilineWidget.this.setShouldShowErrorIcon$payments_core_release(false);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }
    }

    /* loaded from: classes4.dex */
    public static final class i extends Q0 {
        i() {
        }

        @Override // com.stripe.android.view.Q0, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            super.afterTextChanged(editable);
            CardMultilineWidget.l(CardMultilineWidget.this);
        }
    }

    /* loaded from: classes4.dex */
    static final class j extends AbstractC3160z implements X5.n {

        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f27237a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LifecycleOwner f27238b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Lifecycle.State f27239c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC3358f f27240d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ CardMultilineWidget f27241e;

            /* renamed from: com.stripe.android.view.CardMultilineWidget$j$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0686a extends kotlin.coroutines.jvm.internal.l implements X5.n {

                /* renamed from: a, reason: collision with root package name */
                int f27242a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC3358f f27243b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ CardMultilineWidget f27244c;

                /* renamed from: com.stripe.android.view.CardMultilineWidget$j$a$a$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0687a implements InterfaceC3359g {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ CardMultilineWidget f27245a;

                    public C0687a(CardMultilineWidget cardMultilineWidget) {
                        this.f27245a = cardMultilineWidget;
                    }

                    @Override // l6.InterfaceC3359g
                    public final Object emit(Object obj, P5.d dVar) {
                        this.f27245a.getCardBrandView$payments_core_release().setCbcEligible(((Boolean) obj).booleanValue());
                        return L5.I.f6474a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0686a(InterfaceC3358f interfaceC3358f, P5.d dVar, CardMultilineWidget cardMultilineWidget) {
                    super(2, dVar);
                    this.f27243b = interfaceC3358f;
                    this.f27244c = cardMultilineWidget;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final P5.d create(Object obj, P5.d dVar) {
                    return new C0686a(this.f27243b, dVar, this.f27244c);
                }

                @Override // X5.n
                public final Object invoke(i6.M m8, P5.d dVar) {
                    return ((C0686a) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = Q5.b.e();
                    int i8 = this.f27242a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            L5.t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        L5.t.b(obj);
                        InterfaceC3358f interfaceC3358f = this.f27243b;
                        C0687a c0687a = new C0687a(this.f27244c);
                        this.f27242a = 1;
                        if (interfaceC3358f.collect(c0687a, this) == e8) {
                            return e8;
                        }
                    }
                    return L5.I.f6474a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(LifecycleOwner lifecycleOwner, Lifecycle.State state, InterfaceC3358f interfaceC3358f, P5.d dVar, CardMultilineWidget cardMultilineWidget) {
                super(2, dVar);
                this.f27239c = state;
                this.f27240d = interfaceC3358f;
                this.f27241e = cardMultilineWidget;
                this.f27238b = lifecycleOwner;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f27238b, this.f27239c, this.f27240d, dVar, this.f27241e);
            }

            @Override // X5.n
            public final Object invoke(i6.M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(L5.I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = Q5.b.e();
                int i8 = this.f27237a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        L5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    L5.t.b(obj);
                    LifecycleOwner lifecycleOwner = this.f27238b;
                    Lifecycle.State state = this.f27239c;
                    C0686a c0686a = new C0686a(this.f27240d, null, this.f27241e);
                    this.f27237a = 1;
                    if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycleOwner, state, c0686a, this) == e8) {
                        return e8;
                    }
                }
                return L5.I.f6474a;
            }
        }

        j() {
            super(2);
        }

        public final void a(LifecycleOwner doWithCardWidgetViewModel, O viewModel) {
            AbstractC3159y.i(doWithCardWidgetViewModel, "$this$doWithCardWidgetViewModel");
            AbstractC3159y.i(viewModel, "viewModel");
            if (CardMultilineWidget.this.getOnBehalfOf() != null && !AbstractC3159y.d(viewModel.e(), CardMultilineWidget.this.getOnBehalfOf())) {
                viewModel.g(CardMultilineWidget.this.getOnBehalfOf());
            }
            InterfaceC3349K f8 = viewModel.f();
            CardMultilineWidget cardMultilineWidget = CardMultilineWidget.this;
            AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(doWithCardWidgetViewModel), null, null, new a(doWithCardWidgetViewModel, Lifecycle.State.STARTED, f8, null, cardMultilineWidget), 3, null);
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((LifecycleOwner) obj, (O) obj2);
            return L5.I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f27246a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str) {
            super(2);
            this.f27246a = str;
        }

        public final void a(LifecycleOwner doWithCardWidgetViewModel, O viewModel) {
            AbstractC3159y.i(doWithCardWidgetViewModel, "$this$doWithCardWidgetViewModel");
            AbstractC3159y.i(viewModel, "viewModel");
            viewModel.g(this.f27246a);
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((LifecycleOwner) obj, (O) obj2);
            return L5.I.f6474a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class l extends AbstractC1577b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CardMultilineWidget f27247b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Object obj, CardMultilineWidget cardMultilineWidget) {
            super(obj);
            this.f27247b = cardMultilineWidget;
        }

        @Override // a6.AbstractC1577b
        protected void a(e6.i property, Object obj, Object obj2) {
            AbstractC3159y.i(property, "property");
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            ((Boolean) obj).booleanValue();
            if (booleanValue) {
                this.f27247b.getPostalCodeEditText$payments_core_release().setConfig$payments_core_release(PostalCodeEditText.b.f27549b);
            } else {
                this.f27247b.getPostalCodeEditText$payments_core_release().setConfig$payments_core_release(PostalCodeEditText.b.f27548a);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class m extends AbstractC1577b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CardMultilineWidget f27248b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Object obj, CardMultilineWidget cardMultilineWidget) {
            super(obj);
            this.f27248b = cardMultilineWidget;
        }

        @Override // a6.AbstractC1577b
        protected void a(e6.i property, Object obj, Object obj2) {
            String str;
            AbstractC3159y.i(property, "property");
            Integer num = (Integer) obj2;
            TextInputLayout expiryTextInputLayout = this.f27248b.getExpiryTextInputLayout();
            if (num != null) {
                str = this.f27248b.getResources().getString(num.intValue());
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            expiryTextInputLayout.setPlaceholderText(str);
        }
    }

    /* loaded from: classes4.dex */
    public static final class n extends AbstractC1577b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CardMultilineWidget f27249b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Object obj, CardMultilineWidget cardMultilineWidget) {
            super(obj);
            this.f27249b = cardMultilineWidget;
        }

        @Override // a6.AbstractC1577b
        protected void a(e6.i property, Object obj, Object obj2) {
            AbstractC3159y.i(property, "property");
            this.f27249b.getCardNumberEditText().setErrorMessageListener((StripeEditText.c) obj2);
        }
    }

    /* loaded from: classes4.dex */
    public static final class o extends AbstractC1577b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CardMultilineWidget f27250b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Object obj, CardMultilineWidget cardMultilineWidget) {
            super(obj);
            this.f27250b = cardMultilineWidget;
        }

        @Override // a6.AbstractC1577b
        protected void a(e6.i property, Object obj, Object obj2) {
            AbstractC3159y.i(property, "property");
            this.f27250b.getExpiryDateEditText().setErrorMessageListener((StripeEditText.c) obj2);
        }
    }

    /* loaded from: classes4.dex */
    public static final class p extends AbstractC1577b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CardMultilineWidget f27251b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(Object obj, CardMultilineWidget cardMultilineWidget) {
            super(obj);
            this.f27251b = cardMultilineWidget;
        }

        @Override // a6.AbstractC1577b
        protected void a(e6.i property, Object obj, Object obj2) {
            AbstractC3159y.i(property, "property");
            this.f27251b.getCvcEditText().setErrorMessageListener((StripeEditText.c) obj2);
        }
    }

    /* loaded from: classes4.dex */
    public static final class q extends AbstractC1577b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CardMultilineWidget f27252b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(Object obj, CardMultilineWidget cardMultilineWidget) {
            super(obj);
            this.f27252b = cardMultilineWidget;
        }

        @Override // a6.AbstractC1577b
        protected void a(e6.i property, Object obj, Object obj2) {
            AbstractC3159y.i(property, "property");
            this.f27252b.getPostalCodeEditText$payments_core_release().setErrorMessageListener((StripeEditText.c) obj2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardMultilineWidget(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, false, 12, null);
        AbstractC3159y.i(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(EnumC1870e enumC1870e) {
        this.f27207f.q(enumC1870e, this.f27219r, this.f27220s, this.f27212k);
    }

    static /* synthetic */ void B(CardMultilineWidget cardMultilineWidget, EnumC1870e enumC1870e, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            enumC1870e = cardMultilineWidget.getBrand();
        }
        cardMultilineWidget.A(enumC1870e);
    }

    private final void C(StripeEditText stripeEditText, int i8) {
        Drawable drawable = ContextCompat.getDrawable(getContext(), i8);
        if (drawable != null) {
            stripeEditText.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        }
    }

    private final Collection<StripeEditText> getAllFields() {
        return M5.a0.i(this.f27204c, this.f27206e, this.f27207f, this.f27208g);
    }

    private final w.b getExpirationDate() {
        return this.f27206e.getValidatedDate();
    }

    @VisibleForTesting
    public static /* synthetic */ void getShouldShowErrorIcon$payments_core_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(CardMultilineWidget this$0, String text) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(text, "text");
        EnumC1870e implicitCardBrandForCbc$payments_core_release = this$0.f27204c.getImplicitCardBrandForCbc$payments_core_release();
        if (implicitCardBrandForCbc$payments_core_release == EnumC1870e.f14433w) {
            implicitCardBrandForCbc$payments_core_release = null;
        }
        if (implicitCardBrandForCbc$payments_core_release == null) {
            implicitCardBrandForCbc$payments_core_release = this$0.f27204c.getCardBrand();
        }
        if (implicitCardBrandForCbc$payments_core_release.p(text)) {
            this$0.z();
            if (this$0.f27202a) {
                this$0.f27208g.requestFocus();
            }
            A a8 = this$0.f27216o;
            if (a8 != null) {
                a8.b();
            }
        } else if (!this$0.f27227z) {
            this$0.q();
        }
        this$0.f27207f.setShouldShowError(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(CardMultilineWidget this$0, String it) {
        A a8;
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(it, "it");
        if (this$0.y() && this$0.f27208g.p() && (a8 = this$0.f27216o) != null) {
            a8.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(int i8, CardMultilineWidget this$0, View view, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        AbstractC3159y.i(this$0, "this$0");
        int width = view.getWidth() + i8;
        CardNumberEditText cardNumberEditText = this$0.f27204c;
        cardNumberEditText.setPadding(cardNumberEditText.getPaddingLeft(), cardNumberEditText.getPaddingTop(), width, cardNumberEditText.getPaddingBottom());
    }

    public static final /* synthetic */ L l(CardMultilineWidget cardMultilineWidget) {
        cardMultilineWidget.getClass();
        return null;
    }

    private final void o(boolean z8) {
        int i8;
        int i9;
        int i10;
        int i11;
        if (z8) {
            i8 = AbstractC3053E.f32877l0;
        } else {
            i8 = AbstractC3053E.f32860d;
        }
        this.f27211j.setHint(getResources().getString(i8));
        if (z8) {
            i9 = AbstractC3049A.f32784y;
        } else {
            i9 = -1;
        }
        this.f27207f.setNextFocusForwardId(i9);
        this.f27207f.setNextFocusDownId(i9);
        int i12 = 0;
        if (z8) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f27213l.setVisibility(i10);
        CvcEditText cvcEditText = this.f27207f;
        if (i10 == 8) {
            i11 = 6;
        } else {
            i11 = 5;
        }
        cvcEditText.setImeOptions(i11);
        TextInputLayout textInputLayout = this.f27212k;
        ViewGroup.LayoutParams layoutParams = textInputLayout.getLayoutParams();
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            if (z8) {
                i12 = getResources().getDimensionPixelSize(j2.y.f33093a);
            }
            layoutParams2.setMarginEnd(i12);
            textInputLayout.setLayoutParams(layoutParams2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    private final void p(AttributeSet attributeSet) {
        Context context = getContext();
        AbstractC3159y.h(context, "getContext(...)");
        int[] CardElement = AbstractC3055G.f32908b;
        AbstractC3159y.h(CardElement, "CardElement");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, CardElement, 0, 0);
        this.f27202a = obtainStyledAttributes.getBoolean(AbstractC3055G.f32911e, this.f27202a);
        this.f27221t = obtainStyledAttributes.getBoolean(AbstractC3055G.f32909c, this.f27221t);
        setUsZipCodeRequired(obtainStyledAttributes.getBoolean(AbstractC3055G.f32910d, getUsZipCodeRequired()));
        obtainStyledAttributes.recycle();
    }

    private final void q() {
        if (getBrand().p(this.f27207f.getFieldText$payments_core_release())) {
            return;
        }
        this.f27205d.setShouldShowErrorIcon(this.f27225x);
    }

    private final void r() {
        this.f27206e.setDeleteEmptyListener(new C2466q(this.f27204c));
        this.f27207f.setDeleteEmptyListener(new C2466q(this.f27206e));
        this.f27208g.setDeleteEmptyListener(new C2466q(this.f27207f));
    }

    private final void s() {
        this.f27204c.getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.E
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z8) {
                CardMultilineWidget.t(CardMultilineWidget.this, view, z8);
            }
        });
        this.f27206e.getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.F
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z8) {
                CardMultilineWidget.u(CardMultilineWidget.this, view, z8);
            }
        });
        this.f27207f.getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.G
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z8) {
                CardMultilineWidget.v(CardMultilineWidget.this, view, z8);
            }
        });
        this.f27208g.getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.H
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z8) {
                CardMultilineWidget.w(CardMultilineWidget.this, view, z8);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(CardMultilineWidget this$0, View view, boolean z8) {
        A a8;
        AbstractC3159y.i(this$0, "this$0");
        if (z8 && (a8 = this$0.f27216o) != null) {
            a8.d(A.a.f27096a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(CardMultilineWidget this$0, View view, boolean z8) {
        A a8;
        AbstractC3159y.i(this$0, "this$0");
        if (z8 && (a8 = this$0.f27216o) != null) {
            a8.d(A.a.f27097b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(CardMultilineWidget this$0, View view, boolean z8) {
        AbstractC3159y.i(this$0, "this$0");
        if (z8) {
            if (!this$0.f27227z) {
                this$0.q();
            }
            A a8 = this$0.f27216o;
            if (a8 != null) {
                a8.d(A.a.f27098c);
                return;
            }
            return;
        }
        this$0.f27205d.setShouldShowErrorIcon(this$0.f27225x);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(CardMultilineWidget this$0, View view, boolean z8) {
        A a8;
        AbstractC3159y.i(this$0, "this$0");
        if (this$0.f27202a && z8 && (a8 = this$0.f27216o) != null) {
            a8.d(A.a.f27099d);
        }
    }

    private final void x() {
        this.f27204c.setErrorMessageListener(getCardNumberErrorListener$payments_core_release());
        this.f27206e.setErrorMessageListener(getExpirationDateErrorListener$payments_core_release());
        this.f27207f.setErrorMessageListener(getCvcErrorListener$payments_core_release());
        this.f27208g.setErrorMessageListener(getPostalCodeErrorListener$payments_core_release());
    }

    private final boolean y() {
        if ((this.f27221t || getUsZipCodeRequired()) && this.f27202a) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z() {
        B(this, null, 1, null);
        this.f27205d.setShouldShowErrorIcon(this.f27225x);
    }

    public final boolean D() {
        boolean z8;
        boolean z9;
        boolean z10;
        String postalCode$payments_core_release;
        boolean z11;
        Object obj;
        if (getValidatedCardNumber$payments_core_release() != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (getExpirationDate() != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.f27207f.getCvc$payments_core_release() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f27204c.setShouldShowError(!z8);
        this.f27206e.setShouldShowError(!z9);
        this.f27207f.setShouldShowError(!z10);
        PostalCodeEditText postalCodeEditText = this.f27208g;
        if ((!this.f27221t && !getUsZipCodeRequired()) || ((postalCode$payments_core_release = this.f27208g.getPostalCode$payments_core_release()) != null && !g6.n.u(postalCode$payments_core_release))) {
            z11 = false;
        } else {
            z11 = true;
        }
        postalCodeEditText.setShouldShowError(z11);
        Iterator<T> it = getAllFields().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((StripeEditText) obj).getShouldShowError()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        StripeEditText stripeEditText = (StripeEditText) obj;
        if (stripeEditText != null) {
            stripeEditText.requestFocus();
        }
        if (!z8 || !z9 || !z10 || this.f27208g.getShouldShowError()) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ EnumC1870e getBrand() {
        return this.f27205d.getBrand();
    }

    public final CardBrandView getCardBrandView$payments_core_release() {
        return this.f27205d;
    }

    public final CardNumberEditText getCardNumberEditText() {
        return this.f27204c;
    }

    public final StripeEditText.c getCardNumberErrorListener$payments_core_release() {
        return (StripeEditText.c) this.f27198A.getValue(this, f27196F[2]);
    }

    public final CardNumberTextInputLayout getCardNumberTextInputLayout() {
        return this.f27210i;
    }

    public C1873h getCardParams() {
        String str;
        String str2;
        String str3;
        String str4 = null;
        if (!D()) {
            setShouldShowErrorIcon$payments_core_release(true);
            return null;
        }
        setShouldShowErrorIcon$payments_core_release(false);
        w.b validatedDate = this.f27206e.getValidatedDate();
        if (validatedDate != null) {
            Editable text = this.f27207f.getText();
            if (text != null) {
                str = text.toString();
            } else {
                str = null;
            }
            Editable text2 = this.f27208g.getText();
            if (text2 != null) {
                str2 = text2.toString();
            } else {
                str2 = null;
            }
            if (!this.f27202a) {
                str2 = null;
            }
            EnumC1870e brand = getBrand();
            Set d8 = M5.a0.d("CardMultilineView");
            f.c validatedCardNumber$payments_core_release = getValidatedCardNumber$payments_core_release();
            if (validatedCardNumber$payments_core_release != null) {
                str3 = validatedCardNumber$payments_core_release.c();
            } else {
                str3 = null;
            }
            if (str3 == null) {
                str3 = "";
            }
            String str5 = str3;
            int a8 = validatedDate.a();
            int b8 = validatedDate.b();
            a.C0498a c0498a = new a.C0498a();
            if (str2 != null && !g6.n.u(str2)) {
                str4 = str2;
            }
            return new C1873h(brand, d8, str5, a8, b8, str, null, c0498a.g(str4).a(), null, null, 832, null);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final CvcEditText getCvcEditText() {
        return this.f27207f;
    }

    public final StripeEditText.c getCvcErrorListener$payments_core_release() {
        return (StripeEditText.c) this.f27200C.getValue(this, f27196F[4]);
    }

    public final TextInputLayout getCvcInputLayout() {
        return this.f27212k;
    }

    public final StripeEditText.c getExpirationDateErrorListener$payments_core_release() {
        return (StripeEditText.c) this.f27199B.getValue(this, f27196F[3]);
    }

    public final Integer getExpirationDatePlaceholderRes$payments_core_release() {
        return (Integer) this.f27226y.getValue(this, f27196F[1]);
    }

    public final ExpiryDateEditText getExpiryDateEditText() {
        return this.f27206e;
    }

    public final TextInputLayout getExpiryTextInputLayout() {
        return this.f27211j;
    }

    public final Set<L.a> getInvalidFields$payments_core_release() {
        String postalCode$payments_core_release;
        L.a aVar = L.a.f27390a;
        L.a aVar2 = null;
        if (getValidatedCardNumber$payments_core_release() != null) {
            aVar = null;
        }
        L.a aVar3 = L.a.f27391b;
        if (getExpirationDate() != null) {
            aVar3 = null;
        }
        L.a aVar4 = L.a.f27392c;
        if (this.f27207f.getCvc$payments_core_release() != null) {
            aVar4 = null;
        }
        L.a aVar5 = L.a.f27393d;
        if (y() && ((postalCode$payments_core_release = this.f27208g.getPostalCode$payments_core_release()) == null || g6.n.u(postalCode$payments_core_release))) {
            aVar2 = aVar5;
        }
        return AbstractC1246t.b1(AbstractC1246t.r(aVar, aVar3, aVar4, aVar2));
    }

    public final String getOnBehalfOf() {
        return this.f27224w;
    }

    public final o.e getPaymentMethodBillingDetails() {
        o.e.a paymentMethodBillingDetailsBuilder = getPaymentMethodBillingDetailsBuilder();
        if (paymentMethodBillingDetailsBuilder != null) {
            return paymentMethodBillingDetailsBuilder.a();
        }
        return null;
    }

    public final o.e.a getPaymentMethodBillingDetailsBuilder() {
        if (this.f27202a && D()) {
            return new o.e.a().b(new a.C0498a().g(this.f27208g.getPostalCode$payments_core_release()).a());
        }
        return null;
    }

    public p.c getPaymentMethodCard() {
        C1873h cardParams = getCardParams();
        if (cardParams != null) {
            String i8 = cardParams.i();
            String c8 = cardParams.c();
            int e8 = cardParams.e();
            int f8 = cardParams.f();
            return new p.c(i8, Integer.valueOf(e8), Integer.valueOf(f8), c8, null, cardParams.b(), this.f27205d.c(), 16, null);
        }
        return null;
    }

    public com.stripe.android.model.p getPaymentMethodCreateParams() {
        p.c paymentMethodCard = getPaymentMethodCard();
        if (paymentMethodCard != null) {
            return p.e.e(com.stripe.android.model.p.f24568u, paymentMethodCard, getPaymentMethodBillingDetails(), null, null, 12, null);
        }
        return null;
    }

    public final PostalCodeEditText getPostalCodeEditText$payments_core_release() {
        return this.f27208g;
    }

    public final StripeEditText.c getPostalCodeErrorListener$payments_core_release() {
        return (StripeEditText.c) this.f27201D.getValue(this, f27196F[5]);
    }

    public final boolean getPostalCodeRequired() {
        return this.f27221t;
    }

    public final TextInputLayout getPostalInputLayout$payments_core_release() {
        return this.f27213l;
    }

    public final LinearLayout getSecondRowLayout() {
        return this.f27209h;
    }

    public final boolean getShouldShowErrorIcon$payments_core_release() {
        return this.f27225x;
    }

    public final boolean getUsZipCodeRequired() {
        return ((Boolean) this.f27222u.getValue(this, f27196F[0])).booleanValue();
    }

    public final f.c getValidatedCardNumber$payments_core_release() {
        return this.f27204c.getValidatedCardNumber$payments_core_release();
    }

    public final ViewModelStoreOwner getViewModelStoreOwner$payments_core_release() {
        return this.f27223v;
    }

    @Override // android.view.View
    public boolean isEnabled() {
        return this.f27218q;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f27207f.setHint((CharSequence) null);
        this.f27214m.c(this);
        P.a(this, this.f27223v, new j());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f27214m.b(this);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        AbstractC3159y.i(state, "state");
        if (state instanceof Bundle) {
            Bundle bundle = (Bundle) state;
            setOnBehalfOf(bundle.getString("state_on_behalf_of"));
            super.onRestoreInstanceState(bundle.getParcelable("state_remaining_state"));
            return;
        }
        super.onRestoreInstanceState(state);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        super.onSaveInstanceState();
        return BundleKt.bundleOf(L5.x.a("state_remaining_state", super.onSaveInstanceState()), L5.x.a("state_on_behalf_of", this.f27224w));
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z8) {
        super.onWindowFocusChanged(z8);
        if (z8) {
            z();
        }
    }

    public void setCardHint(String cardHint) {
        AbstractC3159y.i(cardHint, "cardHint");
        this.f27210i.setPlaceholderText(cardHint);
    }

    public void setCardInputListener(A a8) {
        this.f27216o = a8;
    }

    public void setCardNumber(String str) {
        this.f27204c.setText(str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setCardNumberErrorListener(StripeEditText.c listener) {
        AbstractC3159y.i(listener, "listener");
        setCardNumberErrorListener$payments_core_release(listener);
    }

    public final void setCardNumberErrorListener$payments_core_release(StripeEditText.c cVar) {
        AbstractC3159y.i(cVar, "<set-?>");
        this.f27198A.setValue(this, f27196F[2], cVar);
    }

    public void setCardNumberTextWatcher(TextWatcher textWatcher) {
        this.f27204c.addTextChangedListener(textWatcher);
    }

    public void setCardValidCallback(L l8) {
        Iterator<T> it = getAllFields().iterator();
        while (it.hasNext()) {
            ((StripeEditText) it.next()).removeTextChangedListener(this.f27217p);
        }
        if (l8 != null) {
            Iterator<T> it2 = getAllFields().iterator();
            while (it2.hasNext()) {
                ((StripeEditText) it2.next()).addTextChangedListener(this.f27217p);
            }
        }
    }

    public void setCvcCode(String str) {
        this.f27207f.setText(str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setCvcErrorListener(StripeEditText.c listener) {
        AbstractC3159y.i(listener, "listener");
        setCvcErrorListener$payments_core_release(listener);
    }

    public final void setCvcErrorListener$payments_core_release(StripeEditText.c cVar) {
        AbstractC3159y.i(cVar, "<set-?>");
        this.f27200C.setValue(this, f27196F[4], cVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final /* synthetic */ void setCvcIcon(Integer num) {
        boolean z8;
        if (num != null) {
            C(this.f27207f, num.intValue());
        }
        if (num != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f27227z = z8;
    }

    public final void setCvcLabel(String str) {
        this.f27219r = str;
        B(this, null, 1, null);
    }

    public void setCvcNumberTextWatcher(TextWatcher textWatcher) {
        this.f27207f.addTextChangedListener(textWatcher);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setCvcPlaceholderText(String str) {
        this.f27220s = str;
        B(this, null, 1, null);
    }

    @Override // android.view.View
    public void setEnabled(boolean z8) {
        super.setEnabled(z8);
        Iterator it = this.f27215n.iterator();
        while (it.hasNext()) {
            ((TextInputLayout) it.next()).setEnabled(z8);
        }
        this.f27218q = z8;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setExpirationDateErrorListener(StripeEditText.c listener) {
        AbstractC3159y.i(listener, "listener");
        setExpirationDateErrorListener$payments_core_release(listener);
    }

    public final void setExpirationDateErrorListener$payments_core_release(StripeEditText.c cVar) {
        AbstractC3159y.i(cVar, "<set-?>");
        this.f27199B.setValue(this, f27196F[3], cVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setExpirationDatePlaceholderRes(@StringRes Integer num) {
        setExpirationDatePlaceholderRes$payments_core_release(num);
    }

    public final void setExpirationDatePlaceholderRes$payments_core_release(Integer num) {
        this.f27226y.setValue(this, f27196F[1], num);
    }

    public void setExpiryDateTextWatcher(TextWatcher textWatcher) {
        this.f27206e.addTextChangedListener(textWatcher);
    }

    public final void setOnBehalfOf(String str) {
        if (!AbstractC3159y.d(this.f27224w, str)) {
            if (isAttachedToWindow()) {
                P.a(this, this.f27223v, new k(str));
            }
            this.f27224w = str;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setPostalCodeErrorListener(StripeEditText.c cVar) {
        setPostalCodeErrorListener$payments_core_release(cVar);
    }

    public final void setPostalCodeErrorListener$payments_core_release(StripeEditText.c cVar) {
        this.f27201D.setValue(this, f27196F[5], cVar);
    }

    public final void setPostalCodeRequired(boolean z8) {
        this.f27221t = z8;
    }

    public void setPostalCodeTextWatcher(TextWatcher textWatcher) {
        this.f27208g.addTextChangedListener(textWatcher);
    }

    public final void setPreferredNetworks(List<? extends EnumC1870e> preferredNetworks) {
        AbstractC3159y.i(preferredNetworks, "preferredNetworks");
        this.f27205d.setMerchantPreferredNetworks(preferredNetworks);
    }

    public final void setShouldShowErrorIcon$payments_core_release(boolean z8) {
        boolean z9;
        if (this.f27225x != z8) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f27225x = z8;
        if (z9) {
            z();
        }
    }

    public final void setShouldShowPostalCode(boolean z8) {
        this.f27202a = z8;
        o(z8);
    }

    public final void setUsZipCodeRequired(boolean z8) {
        this.f27222u.setValue(this, f27196F[0], Boolean.valueOf(z8));
    }

    public final void setViewModelStoreOwner$payments_core_release(ViewModelStoreOwner viewModelStoreOwner) {
        this.f27223v = viewModelStoreOwner;
    }

    public /* synthetic */ CardMultilineWidget(Context context, AttributeSet attributeSet, int i8, boolean z8, int i9, AbstractC3151p abstractC3151p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? 0 : i8, (i9 & 8) != 0 ? true : z8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardMultilineWidget(Context context, AttributeSet attributeSet, int i8, boolean z8) {
        super(context, attributeSet, i8);
        AbstractC3159y.i(context, "context");
        this.f27202a = z8;
        G2.j b8 = G2.j.b(LayoutInflater.from(context), this);
        AbstractC3159y.h(b8, "inflate(...)");
        this.f27203b = b8;
        CardNumberEditText etCardNumber = b8.f3125d;
        AbstractC3159y.h(etCardNumber, "etCardNumber");
        this.f27204c = etCardNumber;
        CardBrandView cardBrandView = b8.f3123b;
        AbstractC3159y.h(cardBrandView, "cardBrandView");
        this.f27205d = cardBrandView;
        ExpiryDateEditText etExpiry = b8.f3127f;
        AbstractC3159y.h(etExpiry, "etExpiry");
        this.f27206e = etExpiry;
        CvcEditText etCvc = b8.f3126e;
        AbstractC3159y.h(etCvc, "etCvc");
        this.f27207f = etCvc;
        PostalCodeEditText etPostalCode = b8.f3128g;
        AbstractC3159y.h(etPostalCode, "etPostalCode");
        this.f27208g = etPostalCode;
        LinearLayout secondRowLayout = b8.f3129h;
        AbstractC3159y.h(secondRowLayout, "secondRowLayout");
        this.f27209h = secondRowLayout;
        CardNumberTextInputLayout tlCardNumber = b8.f3130i;
        AbstractC3159y.h(tlCardNumber, "tlCardNumber");
        this.f27210i = tlCardNumber;
        TextInputLayout tlExpiry = b8.f3132k;
        AbstractC3159y.h(tlExpiry, "tlExpiry");
        this.f27211j = tlExpiry;
        TextInputLayout tlCvc = b8.f3131j;
        AbstractC3159y.h(tlCvc, "tlCvc");
        this.f27212k = tlCvc;
        TextInputLayout tlPostalCode = b8.f3133l;
        AbstractC3159y.h(tlPostalCode, "tlPostalCode");
        this.f27213l = tlPostalCode;
        this.f27214m = new C2451i0();
        List p8 = AbstractC1246t.p(tlCardNumber, tlExpiry, tlCvc, tlPostalCode);
        this.f27215n = p8;
        this.f27217p = new i();
        C1576a c1576a = C1576a.f13550a;
        this.f27222u = new l(Boolean.FALSE, this);
        this.f27226y = new m(Integer.valueOf(AbstractC3053E.f32875k0), this);
        this.f27198A = new n(new C2439c0(tlCardNumber), this);
        this.f27199B = new o(new C2439c0(tlExpiry), this);
        this.f27200C = new p(new C2439c0(tlCvc), this);
        this.f27201D = new q(new C2439c0(tlPostalCode), this);
        setOrientation(1);
        Iterator it = p8.iterator();
        while (true) {
            ColorStateList colorStateList = null;
            if (!it.hasNext()) {
                break;
            }
            TextInputLayout textInputLayout = (TextInputLayout) it.next();
            EditText editText = textInputLayout.getEditText();
            if (editText != null) {
                colorStateList = editText.getHintTextColors();
            }
            textInputLayout.setPlaceholderTextColor(colorStateList);
        }
        p(attributeSet);
        x();
        s();
        r();
        this.f27205d.setTintColorInt$payments_core_release(this.f27204c.getHintTextColors().getDefaultColor());
        this.f27204c.setCompletionCallback$payments_core_release(new b());
        this.f27204c.setBrandChangeCallback$payments_core_release(new c());
        this.f27204c.setImplicitCardBrandChangeCallback$payments_core_release(new d());
        this.f27204c.setPossibleCardBrandsCallback$payments_core_release(new e());
        this.f27206e.setCompletionCallback$payments_core_release(new f());
        this.f27207f.setAfterTextChangedListener(new StripeEditText.a() { // from class: com.stripe.android.view.B
            @Override // com.stripe.android.view.StripeEditText.a
            public final void a(String str) {
                CardMultilineWidget.h(CardMultilineWidget.this, str);
            }
        });
        this.f27208g.setAfterTextChangedListener(new StripeEditText.a() { // from class: com.stripe.android.view.C
            @Override // com.stripe.android.view.StripeEditText.a
            public final void a(String str) {
                CardMultilineWidget.i(CardMultilineWidget.this, str);
            }
        });
        o(this.f27202a);
        CardNumberEditText.B(this.f27204c, 0, 1, null);
        z();
        Iterator<T> it2 = getAllFields().iterator();
        while (it2.hasNext()) {
            ((StripeEditText) it2.next()).addTextChangedListener(new h());
        }
        this.f27204c.setLoadingCallback$payments_core_release(new a());
        this.f27208g.setConfig$payments_core_release(PostalCodeEditText.b.f27548a);
        this.f27218q = true;
        final int dimensionPixelSize = getResources().getDimensionPixelSize(j2.y.f33094b);
        this.f27205d.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.stripe.android.view.D
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
                CardMultilineWidget.j(dimensionPixelSize, this, view, i9, i10, i11, i12, i13, i14, i15, i16);
            }
        });
    }
}
