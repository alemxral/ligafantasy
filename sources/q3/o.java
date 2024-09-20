package q3;

import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private final List f37360a;

    /* renamed from: b, reason: collision with root package name */
    private final com.stripe.android.paymentsheet.p f37361b;

    public o(List items, com.stripe.android.paymentsheet.p pVar) {
        AbstractC3159y.i(items, "items");
        this.f37360a = items;
        this.f37361b = pVar;
    }

    public final List a() {
        return this.f37360a;
    }

    public final com.stripe.android.paymentsheet.p b() {
        return this.f37361b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (AbstractC3159y.d(this.f37360a, oVar.f37360a) && AbstractC3159y.d(this.f37361b, oVar.f37361b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f37360a.hashCode() * 31;
        com.stripe.android.paymentsheet.p pVar = this.f37361b;
        if (pVar == null) {
            hashCode = 0;
        } else {
            hashCode = pVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "PaymentOptionsState(items=" + this.f37360a + ", selectedItem=" + this.f37361b + ")";
    }
}
