package i6;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: i6.D, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2805D {

    /* renamed from: a, reason: collision with root package name */
    public final Object f31665a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f31666b;

    public C2805D(Object obj, Function1 function1) {
        this.f31665a = obj;
        this.f31666b = function1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2805D)) {
            return false;
        }
        C2805D c2805d = (C2805D) obj;
        if (AbstractC3159y.d(this.f31665a, c2805d.f31665a) && AbstractC3159y.d(this.f31666b, c2805d.f31666b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        Object obj = this.f31665a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return (hashCode * 31) + this.f31666b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.f31665a + ", onCancellation=" + this.f31666b + ')';
    }
}
