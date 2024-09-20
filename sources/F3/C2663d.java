package f3;

import com.stripe.android.model.Source;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: f3.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2663d {

    /* renamed from: a, reason: collision with root package name */
    private final String f31007a;

    /* renamed from: b, reason: collision with root package name */
    private final int f31008b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f31009c;

    /* renamed from: d, reason: collision with root package name */
    private final String f31010d;

    /* renamed from: e, reason: collision with root package name */
    private final Source f31011e;

    /* renamed from: f, reason: collision with root package name */
    private final String f31012f;

    public C2663d(String clientSecret, int i8, boolean z8, String str, Source source, String str2) {
        AbstractC3159y.i(clientSecret, "clientSecret");
        this.f31007a = clientSecret;
        this.f31008b = i8;
        this.f31009c = z8;
        this.f31010d = str;
        this.f31011e = source;
        this.f31012f = str2;
    }

    public final boolean a() {
        return this.f31009c;
    }

    public final String b() {
        return this.f31007a;
    }

    public final int c() {
        return this.f31008b;
    }

    public final String d() {
        return this.f31010d;
    }

    public final String e() {
        return this.f31012f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2663d)) {
            return false;
        }
        C2663d c2663d = (C2663d) obj;
        if (AbstractC3159y.d(this.f31007a, c2663d.f31007a) && this.f31008b == c2663d.f31008b && this.f31009c == c2663d.f31009c && AbstractC3159y.d(this.f31010d, c2663d.f31010d) && AbstractC3159y.d(this.f31011e, c2663d.f31011e) && AbstractC3159y.d(this.f31012f, c2663d.f31012f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = ((((this.f31007a.hashCode() * 31) + this.f31008b) * 31) + androidx.compose.foundation.a.a(this.f31009c)) * 31;
        String str = this.f31010d;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (hashCode3 + hashCode) * 31;
        Source source = this.f31011e;
        if (source == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = source.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        String str2 = this.f31012f;
        if (str2 != null) {
            i8 = str2.hashCode();
        }
        return i10 + i8;
    }

    public String toString() {
        return "Validated(clientSecret=" + this.f31007a + ", flowOutcome=" + this.f31008b + ", canCancelSource=" + this.f31009c + ", sourceId=" + this.f31010d + ", source=" + this.f31011e + ", stripeAccountId=" + this.f31012f + ")";
    }
}
