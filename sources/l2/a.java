package L2;

import kotlin.jvm.internal.AbstractC3159y;
import t2.AbstractC3790k;

/* loaded from: classes4.dex */
public final class a extends AbstractC3790k {

    /* renamed from: f, reason: collision with root package name */
    private final String f6038f;

    /* renamed from: g, reason: collision with root package name */
    private final O2.a f6039g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, O2.a accountStatus) {
        super(null, null, 0, null, null, 31, null);
        AbstractC3159y.i(accountStatus, "accountStatus");
        this.f6038f = str;
        this.f6039g = accountStatus;
    }

    @Override // t2.AbstractC3790k
    public String a() {
        return "alreadyLoggedIntoLinkError";
    }

    @Override // t2.AbstractC3790k
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (AbstractC3159y.d(this.f6038f, aVar.f6038f) && this.f6039g == aVar.f6039g) {
            return true;
        }
        return false;
    }

    @Override // t2.AbstractC3790k
    public int hashCode() {
        int hashCode;
        String str = this.f6038f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (hashCode * 31) + this.f6039g.hashCode();
    }

    @Override // t2.AbstractC3790k, java.lang.Throwable
    public String toString() {
        return "AlreadyLoggedInLinkException(email=" + this.f6038f + ", accountStatus=" + this.f6039g + ")";
    }
}
