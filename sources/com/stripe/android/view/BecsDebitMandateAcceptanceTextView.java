package com.stripe.android.view;

import a6.AbstractC1577b;
import a6.C1576a;
import a6.InterfaceC1580e;
import android.R;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class BecsDebitMandateAcceptanceTextView extends AppCompatTextView {

    /* renamed from: c, reason: collision with root package name */
    static final /* synthetic */ e6.i[] f27149c = {kotlin.jvm.internal.U.e(new kotlin.jvm.internal.E(BecsDebitMandateAcceptanceTextView.class, "companyName", "getCompanyName()Ljava/lang/String;", 0))};

    /* renamed from: d, reason: collision with root package name */
    public static final int f27150d = 8;

    /* renamed from: a, reason: collision with root package name */
    private final C2471t f27151a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1580e f27152b;

    /* loaded from: classes4.dex */
    public static final class a extends AbstractC1577b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ BecsDebitMandateAcceptanceTextView f27153b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, BecsDebitMandateAcceptanceTextView becsDebitMandateAcceptanceTextView) {
            super(obj);
            this.f27153b = becsDebitMandateAcceptanceTextView;
        }

        @Override // a6.AbstractC1577b
        protected void a(e6.i property, Object obj, Object obj2) {
            CharSequence charSequence;
            AbstractC3159y.i(property, "property");
            String str = (String) obj2;
            BecsDebitMandateAcceptanceTextView becsDebitMandateAcceptanceTextView = this.f27153b;
            if (!(!g6.n.u(str))) {
                str = null;
            }
            if (str == null || (charSequence = this.f27153b.f27151a.a(str)) == null) {
                charSequence = "";
            }
            becsDebitMandateAcceptanceTextView.setText(charSequence);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BecsDebitMandateAcceptanceTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC3159y.i(context, "context");
    }

    public final String getCompanyName() {
        return (String) this.f27152b.getValue(this, f27149c[0]);
    }

    public final void setCompanyName(String str) {
        AbstractC3159y.i(str, "<set-?>");
        this.f27152b.setValue(this, f27149c[0], str);
    }

    public /* synthetic */ BecsDebitMandateAcceptanceTextView(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3151p abstractC3151p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? R.attr.textViewStyle : i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BecsDebitMandateAcceptanceTextView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3159y.i(context, "context");
        this.f27151a = new C2471t(context);
        setMovementMethod(LinkMovementMethod.getInstance());
        C1576a c1576a = C1576a.f13550a;
        this.f27152b = new a("", this);
    }
}
