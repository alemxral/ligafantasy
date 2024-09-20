package g4;

import android.text.SpannableString;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final SpannableString f31216a;

    /* renamed from: b, reason: collision with root package name */
    private final SpannableString f31217b;

    /* renamed from: c, reason: collision with root package name */
    private final String f31218c;

    public d(SpannableString primaryText, SpannableString secondaryText, String placeId) {
        AbstractC3159y.i(primaryText, "primaryText");
        AbstractC3159y.i(secondaryText, "secondaryText");
        AbstractC3159y.i(placeId, "placeId");
        this.f31216a = primaryText;
        this.f31217b = secondaryText;
        this.f31218c = placeId;
    }

    public final String a() {
        return this.f31218c;
    }

    public final SpannableString b() {
        return this.f31216a;
    }

    public final SpannableString c() {
        return this.f31217b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (AbstractC3159y.d(this.f31216a, dVar.f31216a) && AbstractC3159y.d(this.f31217b, dVar.f31217b) && AbstractC3159y.d(this.f31218c, dVar.f31218c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f31216a.hashCode() * 31) + this.f31217b.hashCode()) * 31) + this.f31218c.hashCode();
    }

    public String toString() {
        SpannableString spannableString = this.f31216a;
        SpannableString spannableString2 = this.f31217b;
        return "AutocompletePrediction(primaryText=" + ((Object) spannableString) + ", secondaryText=" + ((Object) spannableString2) + ", placeId=" + this.f31218c + ")";
    }
}
