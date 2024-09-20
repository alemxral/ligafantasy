package g4;

import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final g f31219a;

    public e(g place) {
        AbstractC3159y.i(place, "place");
        this.f31219a = place;
    }

    public final g a() {
        return this.f31219a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e) && AbstractC3159y.d(this.f31219a, ((e) obj).f31219a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f31219a.hashCode();
    }

    public String toString() {
        return "FetchPlaceResponse(place=" + this.f31219a + ")";
    }
}
