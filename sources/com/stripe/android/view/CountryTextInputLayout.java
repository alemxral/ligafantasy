package com.stripe.android.view;

import a6.AbstractC1577b;
import a6.C1576a;
import a6.InterfaceC1580e;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.R;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.LocaleListCompat;
import com.google.android.material.textfield.TextInputLayout;
import j2.AbstractC3051C;
import j2.AbstractC3053E;
import j2.AbstractC3055G;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import v2.C3825a;
import v2.C3826b;

@StabilityInferred(parameters = 0)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class CountryTextInputLayout extends TextInputLayout {

    /* renamed from: a, reason: collision with root package name */
    private int f27313a;

    /* renamed from: b, reason: collision with root package name */
    private int f27314b;

    /* renamed from: c, reason: collision with root package name */
    private final AutoCompleteTextView f27315c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC1580e f27316d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Function1 f27317e;

    /* renamed from: f, reason: collision with root package name */
    private /* synthetic */ Function1 f27318f;

    /* renamed from: g, reason: collision with root package name */
    private Q f27319g;

    /* renamed from: i, reason: collision with root package name */
    static final /* synthetic */ e6.i[] f27310i = {kotlin.jvm.internal.U.e(new kotlin.jvm.internal.E(CountryTextInputLayout.class, "selectedCountryCode", "getSelectedCountryCode$payments_core_release()Lcom/stripe/android/core/model/CountryCode;", 0))};

    /* renamed from: h, reason: collision with root package name */
    private static final c f27309h = new c(null);

    /* renamed from: j, reason: collision with root package name */
    public static final int f27311j = 8;

    /* renamed from: k, reason: collision with root package name */
    private static final int f27312k = AbstractC3051C.f32800m;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f27320a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CountryTextInputLayout f27321b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, CountryTextInputLayout countryTextInputLayout) {
            super(1);
            this.f27320a = context;
            this.f27321b = countryTextInputLayout;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextView invoke(ViewGroup it) {
            AbstractC3159y.i(it, "it");
            View inflate = LayoutInflater.from(this.f27320a).inflate(this.f27321b.f27314b, it, false);
            AbstractC3159y.g(inflate, "null cannot be cast to non-null type android.widget.TextView");
            return (TextView) inflate;
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3160z implements Function1 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f27323b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f27323b = str;
        }

        public final void a(C3825a c3825a) {
            C3826b c3826b;
            CountryTextInputLayout countryTextInputLayout = CountryTextInputLayout.this;
            if (c3825a != null) {
                c3826b = c3825a.c();
            } else {
                c3826b = null;
            }
            countryTextInputLayout.setSelectedCountryCode$payments_core_release(c3826b);
            if (c3825a != null) {
                CountryTextInputLayout.this.j();
            } else {
                CountryTextInputLayout.this.setError(this.f27323b);
                CountryTextInputLayout.this.setErrorEnabled(true);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C3825a) obj);
            return L5.I.f6474a;
        }
    }

    /* loaded from: classes4.dex */
    private static final class c {
        private c() {
        }

        public /* synthetic */ c(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final C3826b f27324a;

        /* renamed from: b, reason: collision with root package name */
        private final Parcelable f27325b;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new d((C3826b) parcel.readParcelable(d.class.getClassLoader()), parcel.readParcelable(d.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        public d(C3826b countryCode, Parcelable parcelable) {
            AbstractC3159y.i(countryCode, "countryCode");
            this.f27324a = countryCode;
            this.f27325b = parcelable;
        }

        public final C3826b b() {
            return this.f27324a;
        }

        public final Parcelable c() {
            return this.f27325b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return AbstractC3159y.d(this.f27324a, dVar.f27324a) && AbstractC3159y.d(this.f27325b, dVar.f27325b);
        }

        public int hashCode() {
            int hashCode = this.f27324a.hashCode() * 31;
            Parcelable parcelable = this.f27325b;
            return hashCode + (parcelable == null ? 0 : parcelable.hashCode());
        }

        public String toString() {
            return "SelectedCountryState(countryCode=" + this.f27324a + ", superState=" + this.f27325b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeParcelable(this.f27324a, i8);
            out.writeParcelable(this.f27325b, i8);
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final e f27326a = new e();

        e() {
            super(1);
        }

        public final void a(C3825a it) {
            AbstractC3159y.i(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C3825a) obj);
            return L5.I.f6474a;
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final f f27327a = new f();

        f() {
            super(1);
        }

        public final void a(C3826b it) {
            AbstractC3159y.i(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C3826b) obj);
            return L5.I.f6474a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class g implements View.OnLayoutChangeListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f27329b;

        public g(boolean z8) {
            this.f27329b = z8;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
            view.removeOnLayoutChangeListener(this);
            CountryTextInputLayout.this.getCountryAutocomplete().setEnabled(this.f27329b);
        }
    }

    /* loaded from: classes4.dex */
    public static final class h extends AbstractC1577b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CountryTextInputLayout f27330b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Object obj, CountryTextInputLayout countryTextInputLayout) {
            super(obj);
            this.f27330b = countryTextInputLayout;
        }

        @Override // a6.AbstractC1577b
        protected void a(e6.i property, Object obj, Object obj2) {
            AbstractC3159y.i(property, "property");
            C3826b c3826b = (C3826b) obj2;
            if (c3826b != null) {
                this.f27330b.getCountryCodeChangeCallback().invoke(c3826b);
                C3825a d8 = v2.d.f38765a.d(c3826b, this.f27330b.getLocale());
                if (d8 != null) {
                    this.f27330b.getCountryChangeCallback$payments_core_release().invoke(d8);
                }
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CountryTextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC3159y.i(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(CountryTextInputLayout this$0, AdapterView adapterView, View view, int i8, long j8) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.o(this$0.f27319g.getItem(i8).c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(CountryTextInputLayout this$0, View view, boolean z8) {
        AbstractC3159y.i(this$0, "this$0");
        if (z8) {
            this$0.f27315c.showDropDown();
            return;
        }
        String obj = this$0.f27315c.getText().toString();
        v2.d dVar = v2.d.f38765a;
        C3826b e8 = dVar.e(obj, this$0.getLocale());
        if (e8 != null) {
            this$0.n(e8);
            return;
        }
        C3826b.C0893b c0893b = C3826b.Companion;
        if (dVar.d(c0893b.a(obj), this$0.getLocale()) != null) {
            this$0.n(c0893b.a(obj));
        }
    }

    @VisibleForTesting
    public static /* synthetic */ void getCountryAutocomplete$annotations() {
    }

    public static /* synthetic */ void getCountryChangeCallback$payments_core_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Locale getLocale() {
        Locale locale = LocaleListCompat.getAdjustedDefault().get(0);
        AbstractC3159y.f(locale);
        return locale;
    }

    @VisibleForTesting
    public static /* synthetic */ void getSelectedCountryCode$payments_core_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() {
        setError(null);
        setErrorEnabled(false);
    }

    private final AutoCompleteTextView k() {
        if (this.f27313a == 0) {
            return new AutoCompleteTextView(getContext(), null, R.attr.autoCompleteTextViewStyle);
        }
        return new AutoCompleteTextView(getContext(), null, 0, this.f27313a);
    }

    private final void m() {
        C3825a b8 = this.f27319g.b();
        this.f27315c.setText(b8.e());
        setSelectedCountryCode$payments_core_release(b8.c());
    }

    public final AutoCompleteTextView getCountryAutocomplete() {
        return this.f27315c;
    }

    public final Function1 getCountryChangeCallback$payments_core_release() {
        return this.f27317e;
    }

    public final Function1 getCountryCodeChangeCallback() {
        return this.f27318f;
    }

    public final C3825a getSelectedCountry$payments_core_release() {
        C3826b selectedCountryCode$payments_core_release = getSelectedCountryCode$payments_core_release();
        if (selectedCountryCode$payments_core_release != null) {
            return v2.d.f38765a.d(selectedCountryCode$payments_core_release, getLocale());
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final C3826b getSelectedCountryCode() {
        return getSelectedCountryCode$payments_core_release();
    }

    public final C3826b getSelectedCountryCode$payments_core_release() {
        return (C3826b) this.f27316d.getValue(this, f27310i[0]);
    }

    public final void l(d state) {
        AbstractC3159y.i(state, "state");
        super.onRestoreInstanceState(state.c());
        C3826b b8 = state.b();
        o(b8);
        n(b8);
        requestLayout();
    }

    public final void n(C3826b countryCode) {
        String str;
        AbstractC3159y.i(countryCode, "countryCode");
        v2.d dVar = v2.d.f38765a;
        C3825a d8 = dVar.d(countryCode, getLocale());
        if (d8 != null) {
            o(countryCode);
        } else {
            d8 = dVar.d(getSelectedCountryCode$payments_core_release(), getLocale());
        }
        AutoCompleteTextView autoCompleteTextView = this.f27315c;
        if (d8 != null) {
            str = d8.e();
        } else {
            str = null;
        }
        autoCompleteTextView.setText(str);
    }

    public final void o(C3826b countryCode) {
        AbstractC3159y.i(countryCode, "countryCode");
        j();
        if (!AbstractC3159y.d(getSelectedCountryCode$payments_core_release(), countryCode)) {
            setSelectedCountryCode$payments_core_release(countryCode);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.textfield.TextInputLayout, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof d) {
            l((d) parcelable);
        } else {
            super.onRestoreInstanceState(parcelable);
        }
    }

    @Override // com.google.android.material.textfield.TextInputLayout, android.view.View
    public Parcelable onSaveInstanceState() {
        C3825a selectedCountry$payments_core_release = getSelectedCountry$payments_core_release();
        if (selectedCountry$payments_core_release != null) {
            return new d(selectedCountry$payments_core_release.c(), super.onSaveInstanceState());
        }
        return super.onSaveInstanceState();
    }

    public final void p() {
        this.f27315c.performValidation();
    }

    public final void setAllowedCountryCodes$payments_core_release(Set<String> allowedCountryCodes) {
        AbstractC3159y.i(allowedCountryCodes, "allowedCountryCodes");
        if (this.f27319g.f(allowedCountryCodes)) {
            m();
        }
    }

    public final void setCountryChangeCallback$payments_core_release(Function1 function1) {
        AbstractC3159y.i(function1, "<set-?>");
        this.f27317e = function1;
    }

    public final void setCountryCodeChangeCallback(Function1 function1) {
        AbstractC3159y.i(function1, "<set-?>");
        this.f27318f = function1;
    }

    @VisibleForTesting
    public final void setCountrySelected$payments_core_release(C3826b countryCode) {
        AbstractC3159y.i(countryCode, "countryCode");
        n(countryCode);
    }

    @Override // com.google.android.material.textfield.TextInputLayout, android.view.View
    public void setEnabled(boolean z8) {
        super.setEnabled(z8);
        addOnLayoutChangeListener(new g(z8));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setSelectedCountryCode(C3826b c3826b) {
        setSelectedCountryCode$payments_core_release(c3826b);
    }

    public final void setSelectedCountryCode$payments_core_release(C3826b c3826b) {
        this.f27316d.setValue(this, f27310i[0], c3826b);
    }

    public /* synthetic */ CountryTextInputLayout(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3151p abstractC3151p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? com.google.android.material.R.attr.textInputStyle : i8);
    }

    @VisibleForTesting
    public final void setCountrySelected$payments_core_release(String countryCode) {
        AbstractC3159y.i(countryCode, "countryCode");
        n(C3826b.Companion.a(countryCode));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountryTextInputLayout(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3159y.i(context, "context");
        int i9 = f27312k;
        this.f27314b = i9;
        C1576a c1576a = C1576a.f13550a;
        this.f27316d = new h(null, this);
        this.f27317e = e.f27326a;
        this.f27318f = f.f27327a;
        int[] StripeCountryAutoCompleteTextInputLayout = AbstractC3055G.f32914h;
        AbstractC3159y.h(StripeCountryAutoCompleteTextInputLayout, "StripeCountryAutoCompleteTextInputLayout");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, StripeCountryAutoCompleteTextInputLayout, 0, 0);
        this.f27313a = obtainStyledAttributes.getResourceId(AbstractC3055G.f32915i, 0);
        this.f27314b = obtainStyledAttributes.getResourceId(AbstractC3055G.f32916j, i9);
        obtainStyledAttributes.recycle();
        AutoCompleteTextView k8 = k();
        this.f27315c = k8;
        addView(k8, new LinearLayout.LayoutParams(-1, -2));
        this.f27319g = new Q(context, v2.d.f38765a.f(getLocale()), this.f27314b, new a(context, this));
        k8.setThreshold(0);
        k8.setAdapter(this.f27319g);
        k8.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.stripe.android.view.T
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i10, long j8) {
                CountryTextInputLayout.e(CountryTextInputLayout.this, adapterView, view, i10, j8);
            }
        });
        k8.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.U
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z8) {
                CountryTextInputLayout.f(CountryTextInputLayout.this, view, z8);
            }
        });
        setSelectedCountryCode$payments_core_release(this.f27319g.b().c());
        m();
        String string = getResources().getString(AbstractC3053E.f32868h);
        AbstractC3159y.h(string, "getString(...)");
        k8.setValidator(new S(this.f27319g, new b(string)));
    }
}
