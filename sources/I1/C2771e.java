package i1;

import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: i1.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2771e {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC2770d f31459a;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC2770d f31460b;

    /* renamed from: c, reason: collision with root package name */
    private final double f31461c;

    public C2771e(EnumC2770d performance, EnumC2770d crashlytics, double d8) {
        AbstractC3159y.i(performance, "performance");
        AbstractC3159y.i(crashlytics, "crashlytics");
        this.f31459a = performance;
        this.f31460b = crashlytics;
        this.f31461c = d8;
    }

    public final EnumC2770d a() {
        return this.f31460b;
    }

    public final EnumC2770d b() {
        return this.f31459a;
    }

    public final double c() {
        return this.f31461c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2771e)) {
            return false;
        }
        C2771e c2771e = (C2771e) obj;
        if (this.f31459a == c2771e.f31459a && this.f31460b == c2771e.f31460b && AbstractC3159y.d(Double.valueOf(this.f31461c), Double.valueOf(c2771e.f31461c))) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f31459a.hashCode() * 31) + this.f31460b.hashCode()) * 31) + androidx.compose.animation.core.b.a(this.f31461c);
    }

    public String toString() {
        return "DataCollectionStatus(performance=" + this.f31459a + ", crashlytics=" + this.f31460b + ", sessionSamplingRate=" + this.f31461c + ')';
    }

    public /* synthetic */ C2771e(EnumC2770d enumC2770d, EnumC2770d enumC2770d2, double d8, int i8, AbstractC3151p abstractC3151p) {
        this((i8 & 1) != 0 ? EnumC2770d.COLLECTION_SDK_NOT_INSTALLED : enumC2770d, (i8 & 2) != 0 ? EnumC2770d.COLLECTION_SDK_NOT_INSTALLED : enumC2770d2, (i8 & 4) != 0 ? 1.0d : d8);
    }
}
