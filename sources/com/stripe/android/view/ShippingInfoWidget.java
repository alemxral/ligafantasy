package com.stripe.android.view;

import L5.InterfaceC1227k;
import M5.AbstractC1246t;
import android.content.Context;
import android.os.Build;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import b3.C1858C;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.model.a;
import j2.AbstractC3053E;
import j4.AbstractC3081g;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.C3156v;
import r2.AbstractC3685e;
import v2.C3825a;
import v2.C3826b;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class ShippingInfoWidget extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1227k f27573a;

    /* renamed from: b, reason: collision with root package name */
    private final G0 f27574b;

    /* renamed from: c, reason: collision with root package name */
    private List f27575c;

    /* renamed from: d, reason: collision with root package name */
    private List f27576d;

    /* renamed from: e, reason: collision with root package name */
    private final CountryTextInputLayout f27577e;

    /* renamed from: f, reason: collision with root package name */
    private final TextInputLayout f27578f;

    /* renamed from: g, reason: collision with root package name */
    private final TextInputLayout f27579g;

    /* renamed from: h, reason: collision with root package name */
    private final TextInputLayout f27580h;

    /* renamed from: i, reason: collision with root package name */
    private final TextInputLayout f27581i;

    /* renamed from: j, reason: collision with root package name */
    private final TextInputLayout f27582j;

    /* renamed from: k, reason: collision with root package name */
    private final TextInputLayout f27583k;

    /* renamed from: l, reason: collision with root package name */
    private final TextInputLayout f27584l;

    /* renamed from: m, reason: collision with root package name */
    private final StripeEditText f27585m;

    /* renamed from: n, reason: collision with root package name */
    private final StripeEditText f27586n;

    /* renamed from: o, reason: collision with root package name */
    private final StripeEditText f27587o;

    /* renamed from: p, reason: collision with root package name */
    private final StripeEditText f27588p;

    /* renamed from: q, reason: collision with root package name */
    private final StripeEditText f27589q;

    /* renamed from: r, reason: collision with root package name */
    private final StripeEditText f27590r;

    /* renamed from: s, reason: collision with root package name */
    private final StripeEditText f27591s;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f27592a = new a("Line1", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f27593b = new a("Line2", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final a f27594c = new a("City", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final a f27595d = new a("PostalCode", 3);

        /* renamed from: e, reason: collision with root package name */
        public static final a f27596e = new a("State", 4);

        /* renamed from: f, reason: collision with root package name */
        public static final a f27597f = new a("Phone", 5);

        /* renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ a[] f27598g;

        /* renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ R5.a f27599h;

        static {
            a[] a8 = a();
            f27598g = a8;
            f27599h = R5.b.a(a8);
        }

        private a(String str, int i8) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f27592a, f27593b, f27594c, f27595d, f27596e, f27597f};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f27598g.clone();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class b extends C3156v implements Function1 {
        b(Object obj) {
            super(1, obj, ShippingInfoWidget.class, "updateConfigForCountry", "updateConfigForCountry(Lcom/stripe/android/core/model/Country;)V", 0);
        }

        public final void d(C3825a p02) {
            AbstractC3159y.i(p02, "p0");
            ((ShippingInfoWidget) this.receiver).o(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            d((C3825a) obj);
            return L5.I.f6474a;
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f27600a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ShippingInfoWidget f27601b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, ShippingInfoWidget shippingInfoWidget) {
            super(0);
            this.f27600a = context;
            this.f27601b = shippingInfoWidget;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final G2.f invoke() {
            G2.f b8 = G2.f.b(LayoutInflater.from(this.f27600a), this.f27601b);
            AbstractC3159y.h(b8, "inflate(...)");
            return b8;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShippingInfoWidget(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC3159y.i(context, "context");
    }

    private final void b() {
        if (d(a.f27592a)) {
            this.f27578f.setVisibility(8);
        }
        if (d(a.f27593b)) {
            this.f27579g.setVisibility(8);
        }
        if (d(a.f27596e)) {
            this.f27583k.setVisibility(8);
        }
        if (d(a.f27594c)) {
            this.f27580h.setVisibility(8);
        }
        if (d(a.f27595d)) {
            this.f27582j.setVisibility(8);
        }
        if (d(a.f27597f)) {
            this.f27584l.setVisibility(8);
        }
    }

    private final void c() {
        this.f27577e.setCountryChangeCallback$payments_core_release(new b(this));
        this.f27591s.addTextChangedListener(new PhoneNumberFormattingTextWatcher());
        n();
        l();
        C3825a selectedCountry$payments_core_release = this.f27577e.getSelectedCountry$payments_core_release();
        if (selectedCountry$payments_core_release != null) {
            o(selectedCountry$payments_core_release);
        }
    }

    private final boolean d(a aVar) {
        return this.f27576d.contains(aVar);
    }

    private final boolean e(a aVar) {
        return this.f27575c.contains(aVar);
    }

    private final boolean f(a aVar) {
        if (!e(aVar) && !d(aVar)) {
            return true;
        }
        return false;
    }

    private final void g(com.stripe.android.model.a aVar) {
        this.f27587o.setText(aVar.b());
        String c8 = aVar.c();
        if (c8 != null && c8.length() > 0) {
            this.f27577e.setCountrySelected$payments_core_release(c8);
        }
        this.f27585m.setText(aVar.e());
        this.f27586n.setText(aVar.f());
        this.f27589q.setText(aVar.i());
        this.f27590r.setText(aVar.j());
    }

    private final C1858C getRawShippingInformation() {
        C3826b c3826b;
        a.C0498a b8 = new a.C0498a().b(this.f27587o.getFieldText$payments_core_release());
        C3825a selectedCountry$payments_core_release = this.f27577e.getSelectedCountry$payments_core_release();
        if (selectedCountry$payments_core_release != null) {
            c3826b = selectedCountry$payments_core_release.c();
        } else {
            c3826b = null;
        }
        return new C1858C(b8.d(c3826b).e(this.f27585m.getFieldText$payments_core_release()).f(this.f27586n.getFieldText$payments_core_release()).g(this.f27589q.getFieldText$payments_core_release()).h(this.f27590r.getFieldText$payments_core_release()).a(), this.f27588p.getFieldText$payments_core_release(), this.f27591s.getFieldText$payments_core_release());
    }

    private final G2.f getViewBinding() {
        return (G2.f) this.f27573a.getValue();
    }

    private final void i() {
        String string;
        String string2;
        String string3;
        TextInputLayout textInputLayout = this.f27578f;
        if (e(a.f27592a)) {
            string = getResources().getString(AbstractC3053E.f32876l);
        } else {
            string = getResources().getString(AbstractC3081g.f33174a);
        }
        textInputLayout.setHint(string);
        this.f27579g.setHint(getResources().getString(AbstractC3053E.f32878m));
        TextInputLayout textInputLayout2 = this.f27582j;
        if (e(a.f27595d)) {
            string2 = getResources().getString(AbstractC3053E.f32886q);
        } else {
            string2 = getResources().getString(AbstractC3685e.f37561g);
        }
        textInputLayout2.setHint(string2);
        TextInputLayout textInputLayout3 = this.f27583k;
        if (e(a.f27596e)) {
            string3 = getResources().getString(AbstractC3053E.f32892t);
        } else {
            string3 = getResources().getString(AbstractC3685e.f37562h);
        }
        textInputLayout3.setHint(string3);
        this.f27589q.setErrorMessage(getResources().getString(AbstractC3053E.f32818C));
        this.f27590r.setErrorMessage(getResources().getString(AbstractC3053E.f32822E));
    }

    private final void j() {
        String string;
        String string2;
        String string3;
        TextInputLayout textInputLayout = this.f27578f;
        if (e(a.f27592a)) {
            string = getResources().getString(AbstractC3053E.f32872j);
        } else {
            string = getResources().getString(AbstractC3685e.f37555a);
        }
        textInputLayout.setHint(string);
        this.f27579g.setHint(getResources().getString(AbstractC3053E.f32874k));
        TextInputLayout textInputLayout2 = this.f27582j;
        if (e(a.f27595d)) {
            string2 = getResources().getString(AbstractC3053E.f32890s);
        } else {
            string2 = getResources().getString(AbstractC3053E.f32888r);
        }
        textInputLayout2.setHint(string2);
        TextInputLayout textInputLayout3 = this.f27583k;
        if (e(a.f27596e)) {
            string3 = getResources().getString(AbstractC3053E.f32882o);
        } else {
            string3 = getResources().getString(AbstractC3685e.f37558d);
        }
        textInputLayout3.setHint(string3);
        this.f27589q.setErrorMessage(getResources().getString(AbstractC3053E.f32820D));
        this.f27590r.setErrorMessage(getResources().getString(AbstractC3053E.f32870i));
    }

    private final void k() {
        String string;
        String string2;
        String string3;
        TextInputLayout textInputLayout = this.f27578f;
        if (e(a.f27592a)) {
            string = getResources().getString(AbstractC3053E.f32872j);
        } else {
            string = getResources().getString(AbstractC3685e.f37555a);
        }
        textInputLayout.setHint(string);
        this.f27579g.setHint(getResources().getString(AbstractC3053E.f32874k));
        TextInputLayout textInputLayout2 = this.f27582j;
        if (e(a.f27595d)) {
            string2 = getResources().getString(AbstractC3053E.f32904z);
        } else {
            string2 = getResources().getString(AbstractC3053E.f32902y);
        }
        textInputLayout2.setHint(string2);
        TextInputLayout textInputLayout3 = this.f27583k;
        if (e(a.f27596e)) {
            string3 = getResources().getString(AbstractC3053E.f32896v);
        } else {
            string3 = getResources().getString(AbstractC3053E.f32894u);
        }
        textInputLayout3.setHint(string3);
        this.f27589q.setErrorMessage(getResources().getString(AbstractC3081g.f33196w));
        this.f27590r.setErrorMessage(getResources().getString(AbstractC3053E.f32824F));
    }

    private final void l() {
        String string;
        String string2;
        this.f27581i.setHint(getResources().getString(AbstractC3685e.f37559e));
        TextInputLayout textInputLayout = this.f27580h;
        if (e(a.f27594c)) {
            string = getResources().getString(AbstractC3053E.f32880n);
        } else {
            string = getResources().getString(AbstractC3685e.f37556b);
        }
        textInputLayout.setHint(string);
        TextInputLayout textInputLayout2 = this.f27584l;
        if (e(a.f27597f)) {
            string2 = getResources().getString(AbstractC3053E.f32884p);
        } else {
            string2 = getResources().getString(AbstractC3685e.f37560f);
        }
        textInputLayout2.setHint(string2);
        b();
    }

    private final void m() {
        String string;
        String string2;
        String string3;
        TextInputLayout textInputLayout = this.f27578f;
        if (e(a.f27592a)) {
            string = getResources().getString(AbstractC3053E.f32876l);
        } else {
            string = getResources().getString(AbstractC3081g.f33174a);
        }
        textInputLayout.setHint(string);
        this.f27579g.setHint(getResources().getString(AbstractC3053E.f32878m));
        TextInputLayout textInputLayout2 = this.f27582j;
        if (e(a.f27595d)) {
            string2 = getResources().getString(AbstractC3053E.f32900x);
        } else {
            string2 = getResources().getString(AbstractC3685e.f37564j);
        }
        textInputLayout2.setHint(string2);
        TextInputLayout textInputLayout3 = this.f27583k;
        if (e(a.f27596e)) {
            string3 = getResources().getString(AbstractC3053E.f32898w);
        } else {
            string3 = getResources().getString(AbstractC3685e.f37563i);
        }
        textInputLayout3.setHint(string3);
        this.f27589q.setErrorMessage(getResources().getString(AbstractC3081g.f33195v));
        this.f27590r.setErrorMessage(getResources().getString(AbstractC3053E.f32828H));
    }

    private final void n() {
        this.f27585m.setErrorMessageListener(new C2439c0(this.f27578f));
        this.f27587o.setErrorMessageListener(new C2439c0(this.f27580h));
        this.f27588p.setErrorMessageListener(new C2439c0(this.f27581i));
        this.f27589q.setErrorMessageListener(new C2439c0(this.f27582j));
        this.f27590r.setErrorMessageListener(new C2439c0(this.f27583k));
        this.f27591s.setErrorMessageListener(new C2439c0(this.f27584l));
        this.f27585m.setErrorMessage(getResources().getString(AbstractC3053E.f32826G));
        this.f27587o.setErrorMessage(getResources().getString(AbstractC3053E.f32866g));
        this.f27588p.setErrorMessage(getResources().getString(AbstractC3053E.f32814A));
        this.f27591s.setErrorMessage(getResources().getString(AbstractC3053E.f32816B));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(C3825a c3825a) {
        int i8;
        String c8 = c3825a.c().c();
        if (AbstractC3159y.d(c8, Locale.US.getCountry())) {
            m();
        } else if (AbstractC3159y.d(c8, Locale.UK.getCountry())) {
            j();
        } else if (AbstractC3159y.d(c8, Locale.CANADA.getCountry())) {
            i();
        } else {
            k();
        }
        p(c3825a);
        TextInputLayout textInputLayout = this.f27582j;
        if (v2.d.f38765a.b(c3825a.c()) && !d(a.f27595d)) {
            i8 = 0;
        } else {
            i8 = 8;
        }
        textInputLayout.setVisibility(i8);
    }

    private final void p(C3825a c3825a) {
        InputFilter[] inputFilterArr;
        StripeEditText stripeEditText = this.f27589q;
        if (AbstractC3159y.d(c3825a.c().c(), Locale.CANADA.getCountry())) {
            inputFilterArr = new InputFilter[]{new InputFilter.AllCaps()};
        } else {
            inputFilterArr = new InputFilter[0];
        }
        stripeEditText.setFilters(inputFilterArr);
    }

    public final List<a> getHiddenFields() {
        return this.f27576d;
    }

    public final List<a> getOptionalFields() {
        return this.f27575c;
    }

    public final C1858C getShippingInformation() {
        if (!q()) {
            return null;
        }
        return getRawShippingInformation();
    }

    public final void h(C1858C c1858c) {
        if (c1858c == null) {
            return;
        }
        com.stripe.android.model.a b8 = c1858c.b();
        if (b8 != null) {
            g(b8);
        }
        this.f27588p.setText(c1858c.c());
        this.f27591s.setText(c1858c.e());
    }

    public final boolean q() {
        String obj;
        Editable text;
        String obj2;
        Editable text2;
        String obj3;
        Editable text3;
        String obj4;
        Editable text4;
        String obj5;
        Editable text5;
        String obj6;
        String str;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        C3826b c8;
        Editable text6 = this.f27585m.getText();
        if (text6 == null || (obj = text6.toString()) == null || (text = this.f27588p.getText()) == null || (obj2 = text.toString()) == null || (text2 = this.f27587o.getText()) == null || (obj3 = text2.toString()) == null || (text3 = this.f27590r.getText()) == null || (obj4 = text3.toString()) == null || (text4 = this.f27589q.getText()) == null || (obj5 = text4.toString()) == null || (text5 = this.f27591s.getText()) == null || (obj6 = text5.toString()) == null) {
            return false;
        }
        this.f27577e.p();
        C3825a selectedCountry$payments_core_release = this.f27577e.getSelectedCountry$payments_core_release();
        G0 g02 = this.f27574b;
        if (selectedCountry$payments_core_release != null && (c8 = selectedCountry$payments_core_release.c()) != null) {
            str = c8.c();
        } else {
            str = null;
        }
        boolean a8 = g02.a(obj5, str, this.f27575c, this.f27576d);
        this.f27589q.setShouldShowError(!a8);
        if (g6.n.u(obj) && f(a.f27592a)) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f27585m.setShouldShowError(z8);
        if (g6.n.u(obj3) && f(a.f27594c)) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f27587o.setShouldShowError(z9);
        boolean u8 = g6.n.u(obj2);
        this.f27588p.setShouldShowError(u8);
        if (g6.n.u(obj4) && f(a.f27596e)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f27590r.setShouldShowError(z10);
        if (g6.n.u(obj6) && f(a.f27597f)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f27591s.setShouldShowError(z11);
        if (!a8 || z8 || z9 || z10 || u8 || z11 || selectedCountry$payments_core_release == null) {
            return false;
        }
        return true;
    }

    public final void setAllowedCountryCodes(Set<String> allowedCountryCodes) {
        AbstractC3159y.i(allowedCountryCodes, "allowedCountryCodes");
        this.f27577e.setAllowedCountryCodes$payments_core_release(allowedCountryCodes);
    }

    public final void setHiddenFields(List<? extends a> value) {
        AbstractC3159y.i(value, "value");
        this.f27576d = value;
        l();
        C3825a selectedCountry$payments_core_release = this.f27577e.getSelectedCountry$payments_core_release();
        if (selectedCountry$payments_core_release != null) {
            o(selectedCountry$payments_core_release);
        }
    }

    public final void setOptionalFields(List<? extends a> value) {
        AbstractC3159y.i(value, "value");
        this.f27575c = value;
        l();
        C3825a selectedCountry$payments_core_release = this.f27577e.getSelectedCountry$payments_core_release();
        if (selectedCountry$payments_core_release != null) {
            o(selectedCountry$payments_core_release);
        }
    }

    public /* synthetic */ ShippingInfoWidget(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3151p abstractC3151p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? 0 : i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShippingInfoWidget(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3159y.i(context, "context");
        this.f27573a = L5.l.b(new c(context, this));
        this.f27574b = new G0();
        this.f27575c = AbstractC1246t.m();
        this.f27576d = AbstractC1246t.m();
        CountryTextInputLayout countryAutocompleteAaw = getViewBinding().f3098b;
        AbstractC3159y.h(countryAutocompleteAaw, "countryAutocompleteAaw");
        this.f27577e = countryAutocompleteAaw;
        TextInputLayout tlAddressLine1Aaw = getViewBinding().f3106j;
        AbstractC3159y.h(tlAddressLine1Aaw, "tlAddressLine1Aaw");
        this.f27578f = tlAddressLine1Aaw;
        TextInputLayout tlAddressLine2Aaw = getViewBinding().f3107k;
        AbstractC3159y.h(tlAddressLine2Aaw, "tlAddressLine2Aaw");
        this.f27579g = tlAddressLine2Aaw;
        TextInputLayout tlCityAaw = getViewBinding().f3108l;
        AbstractC3159y.h(tlCityAaw, "tlCityAaw");
        this.f27580h = tlCityAaw;
        TextInputLayout tlNameAaw = getViewBinding().f3109m;
        AbstractC3159y.h(tlNameAaw, "tlNameAaw");
        this.f27581i = tlNameAaw;
        TextInputLayout tlPostalCodeAaw = getViewBinding().f3111o;
        AbstractC3159y.h(tlPostalCodeAaw, "tlPostalCodeAaw");
        this.f27582j = tlPostalCodeAaw;
        TextInputLayout tlStateAaw = getViewBinding().f3112p;
        AbstractC3159y.h(tlStateAaw, "tlStateAaw");
        this.f27583k = tlStateAaw;
        TextInputLayout tlPhoneNumberAaw = getViewBinding().f3110n;
        AbstractC3159y.h(tlPhoneNumberAaw, "tlPhoneNumberAaw");
        this.f27584l = tlPhoneNumberAaw;
        StripeEditText etAddressLineOneAaw = getViewBinding().f3099c;
        AbstractC3159y.h(etAddressLineOneAaw, "etAddressLineOneAaw");
        this.f27585m = etAddressLineOneAaw;
        StripeEditText etAddressLineTwoAaw = getViewBinding().f3100d;
        AbstractC3159y.h(etAddressLineTwoAaw, "etAddressLineTwoAaw");
        this.f27586n = etAddressLineTwoAaw;
        StripeEditText etCityAaw = getViewBinding().f3101e;
        AbstractC3159y.h(etCityAaw, "etCityAaw");
        this.f27587o = etCityAaw;
        StripeEditText etNameAaw = getViewBinding().f3102f;
        AbstractC3159y.h(etNameAaw, "etNameAaw");
        this.f27588p = etNameAaw;
        StripeEditText etPostalCodeAaw = getViewBinding().f3104h;
        AbstractC3159y.h(etPostalCodeAaw, "etPostalCodeAaw");
        this.f27589q = etPostalCodeAaw;
        StripeEditText etStateAaw = getViewBinding().f3105i;
        AbstractC3159y.h(etStateAaw, "etStateAaw");
        this.f27590r = etStateAaw;
        StripeEditText etPhoneNumberAaw = getViewBinding().f3103g;
        AbstractC3159y.h(etPhoneNumberAaw, "etPhoneNumberAaw");
        this.f27591s = etPhoneNumberAaw;
        setOrientation(1);
        if (Build.VERSION.SDK_INT >= 26) {
            etNameAaw.setAutofillHints(new String[]{"name"});
            I0.a(tlAddressLine1Aaw, new String[]{HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS});
            etPostalCodeAaw.setAutofillHints(new String[]{HintConstants.AUTOFILL_HINT_POSTAL_CODE});
            etPhoneNumberAaw.setAutofillHints(new String[]{HintConstants.AUTOFILL_HINT_PHONE});
        }
        c();
    }
}
