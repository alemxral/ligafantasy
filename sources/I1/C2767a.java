package i1;

import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: i1.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2767a {

    /* renamed from: a, reason: collision with root package name */
    private final String f31413a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31414b;

    /* renamed from: c, reason: collision with root package name */
    private final String f31415c;

    /* renamed from: d, reason: collision with root package name */
    private final String f31416d;

    public C2767a(String packageName, String versionName, String appBuildVersion, String deviceManufacturer) {
        AbstractC3159y.i(packageName, "packageName");
        AbstractC3159y.i(versionName, "versionName");
        AbstractC3159y.i(appBuildVersion, "appBuildVersion");
        AbstractC3159y.i(deviceManufacturer, "deviceManufacturer");
        this.f31413a = packageName;
        this.f31414b = versionName;
        this.f31415c = appBuildVersion;
        this.f31416d = deviceManufacturer;
    }

    public final String a() {
        return this.f31415c;
    }

    public final String b() {
        return this.f31416d;
    }

    public final String c() {
        return this.f31413a;
    }

    public final String d() {
        return this.f31414b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2767a)) {
            return false;
        }
        C2767a c2767a = (C2767a) obj;
        if (AbstractC3159y.d(this.f31413a, c2767a.f31413a) && AbstractC3159y.d(this.f31414b, c2767a.f31414b) && AbstractC3159y.d(this.f31415c, c2767a.f31415c) && AbstractC3159y.d(this.f31416d, c2767a.f31416d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f31413a.hashCode() * 31) + this.f31414b.hashCode()) * 31) + this.f31415c.hashCode()) * 31) + this.f31416d.hashCode();
    }

    public String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f31413a + ", versionName=" + this.f31414b + ", appBuildVersion=" + this.f31415c + ", deviceManufacturer=" + this.f31416d + ')';
    }
}
