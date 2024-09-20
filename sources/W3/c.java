package w3;

import M5.Q;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import y3.AbstractC3991f;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Map f38989a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC3991f.a f38990b;

    public c(Map fieldValuePairs, AbstractC3991f.a userRequestedReuse) {
        AbstractC3159y.i(fieldValuePairs, "fieldValuePairs");
        AbstractC3159y.i(userRequestedReuse, "userRequestedReuse");
        this.f38989a = fieldValuePairs;
        this.f38990b = userRequestedReuse;
    }

    public final Map a() {
        return this.f38989a;
    }

    public final AbstractC3991f.a b() {
        return this.f38990b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (AbstractC3159y.d(this.f38989a, cVar.f38989a) && this.f38990b == cVar.f38990b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f38989a.hashCode() * 31) + this.f38990b.hashCode();
    }

    public String toString() {
        return "FormFieldValues(fieldValuePairs=" + this.f38989a + ", userRequestedReuse=" + this.f38990b + ")";
    }

    public /* synthetic */ c(Map map, AbstractC3991f.a aVar, int i8, AbstractC3151p abstractC3151p) {
        this((i8 & 1) != 0 ? Q.h() : map, aVar);
    }
}
