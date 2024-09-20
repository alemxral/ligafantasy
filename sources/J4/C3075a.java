package j4;

import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.AbstractC3151p;

/* renamed from: j4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3075a {

    /* renamed from: a, reason: collision with root package name */
    private final long f33146a;

    /* renamed from: b, reason: collision with root package name */
    private final long f33147b;

    /* renamed from: c, reason: collision with root package name */
    private final long f33148c;

    /* renamed from: d, reason: collision with root package name */
    private final long f33149d;

    /* renamed from: e, reason: collision with root package name */
    private final long f33150e;

    public /* synthetic */ C3075a(long j8, long j9, long j10, long j11, long j12, AbstractC3151p abstractC3151p) {
        this(j8, j9, j10, j11, j12);
    }

    public final long a() {
        return this.f33146a;
    }

    public final long b() {
        return this.f33148c;
    }

    public final long c() {
        return this.f33147b;
    }

    public final long d() {
        return this.f33150e;
    }

    public final long e() {
        return this.f33149d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3075a)) {
            return false;
        }
        C3075a c3075a = (C3075a) obj;
        if (Color.m2972equalsimpl0(this.f33146a, c3075a.f33146a) && Color.m2972equalsimpl0(this.f33147b, c3075a.f33147b) && Color.m2972equalsimpl0(this.f33148c, c3075a.f33148c) && Color.m2972equalsimpl0(this.f33149d, c3075a.f33149d) && Color.m2972equalsimpl0(this.f33150e, c3075a.f33150e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((Color.m2978hashCodeimpl(this.f33146a) * 31) + Color.m2978hashCodeimpl(this.f33147b)) * 31) + Color.m2978hashCodeimpl(this.f33148c)) * 31) + Color.m2978hashCodeimpl(this.f33149d)) * 31) + Color.m2978hashCodeimpl(this.f33150e);
    }

    public String toString() {
        return "PrimaryButtonColors(background=" + Color.m2979toStringimpl(this.f33146a) + ", onBackground=" + Color.m2979toStringimpl(this.f33147b) + ", border=" + Color.m2979toStringimpl(this.f33148c) + ", successBackground=" + Color.m2979toStringimpl(this.f33149d) + ", onSuccessBackground=" + Color.m2979toStringimpl(this.f33150e) + ")";
    }

    private C3075a(long j8, long j9, long j10, long j11, long j12) {
        this.f33146a = j8;
        this.f33147b = j9;
        this.f33148c = j10;
        this.f33149d = j11;
        this.f33150e = j12;
    }
}
