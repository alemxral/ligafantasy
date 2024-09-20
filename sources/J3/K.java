package J3;

import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.AbstractC3151p;

/* loaded from: classes4.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    private final long f4836a;

    /* renamed from: b, reason: collision with root package name */
    private final long f4837b;

    /* renamed from: c, reason: collision with root package name */
    private final long f4838c;

    /* renamed from: d, reason: collision with root package name */
    private final long f4839d;

    /* renamed from: e, reason: collision with root package name */
    private final long f4840e;

    public /* synthetic */ K(long j8, long j9, long j10, long j11, long j12, AbstractC3151p abstractC3151p) {
        this(j8, j9, j10, j11, j12);
    }

    public final long a() {
        return this.f4836a;
    }

    public final long b() {
        return this.f4840e;
    }

    public final long c() {
        return this.f4837b;
    }

    public final long d() {
        return this.f4839d;
    }

    public final long e() {
        return this.f4838c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K)) {
            return false;
        }
        K k8 = (K) obj;
        if (Color.m2972equalsimpl0(this.f4836a, k8.f4836a) && Color.m2972equalsimpl0(this.f4837b, k8.f4837b) && Color.m2972equalsimpl0(this.f4838c, k8.f4838c) && Color.m2972equalsimpl0(this.f4839d, k8.f4839d) && Color.m2972equalsimpl0(this.f4840e, k8.f4840e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((Color.m2978hashCodeimpl(this.f4836a) * 31) + Color.m2978hashCodeimpl(this.f4837b)) * 31) + Color.m2978hashCodeimpl(this.f4838c)) * 31) + Color.m2978hashCodeimpl(this.f4839d)) * 31) + Color.m2978hashCodeimpl(this.f4840e);
    }

    public String toString() {
        return "PrimaryButtonColors(background=" + Color.m2979toStringimpl(this.f4836a) + ", onBackground=" + Color.m2979toStringimpl(this.f4837b) + ", successBackground=" + Color.m2979toStringimpl(this.f4838c) + ", onSuccessBackground=" + Color.m2979toStringimpl(this.f4839d) + ", border=" + Color.m2979toStringimpl(this.f4840e) + ")";
    }

    private K(long j8, long j9, long j10, long j11, long j12) {
        this.f4836a = j8;
        this.f4837b = j9;
        this.f4838c = j10;
        this.f4839d = j11;
        this.f4840e = j12;
    }

    public /* synthetic */ K(long j8, long j9, long j10, long j11, long j12, int i8, AbstractC3151p abstractC3151p) {
        this((i8 & 1) != 0 ? Color.Companion.m3007getUnspecified0d7_KjU() : j8, (i8 & 2) != 0 ? Color.Companion.m3007getUnspecified0d7_KjU() : j9, (i8 & 4) != 0 ? Color.Companion.m3007getUnspecified0d7_KjU() : j10, (i8 & 8) != 0 ? Color.Companion.m3007getUnspecified0d7_KjU() : j11, (i8 & 16) != 0 ? Color.Companion.m3007getUnspecified0d7_KjU() : j12, null);
    }
}
