package r4;

import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: r4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3688a {

    /* renamed from: a, reason: collision with root package name */
    private final String f37640a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f37641b;

    public C3688a(String str, boolean z8) {
        this.f37640a = str;
        this.f37641b = z8;
    }

    public static /* synthetic */ C3688a b(C3688a c3688a, String str, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = c3688a.f37640a;
        }
        if ((i8 & 2) != 0) {
            z8 = c3688a.f37641b;
        }
        return c3688a.a(str, z8);
    }

    public final C3688a a(String str, boolean z8) {
        return new C3688a(str, z8);
    }

    public final String c() {
        return this.f37640a;
    }

    public final boolean d() {
        return this.f37641b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3688a)) {
            return false;
        }
        C3688a c3688a = (C3688a) obj;
        if (AbstractC3159y.d(this.f37640a, c3688a.f37640a) && this.f37641b == c3688a.f37641b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        String str = this.f37640a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (hashCode * 31) + androidx.compose.foundation.a.a(this.f37641b);
    }

    public String toString() {
        return "FormFieldEntry(value=" + this.f37640a + ", isComplete=" + this.f37641b + ")";
    }
}
