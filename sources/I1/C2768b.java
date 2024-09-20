package i1;

import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: i1.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2768b {

    /* renamed from: a, reason: collision with root package name */
    private final String f31417a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31418b;

    /* renamed from: c, reason: collision with root package name */
    private final String f31419c;

    /* renamed from: d, reason: collision with root package name */
    private final String f31420d;

    /* renamed from: e, reason: collision with root package name */
    private final m f31421e;

    /* renamed from: f, reason: collision with root package name */
    private final C2767a f31422f;

    public C2768b(String appId, String deviceModel, String sessionSdkVersion, String osVersion, m logEnvironment, C2767a androidAppInfo) {
        AbstractC3159y.i(appId, "appId");
        AbstractC3159y.i(deviceModel, "deviceModel");
        AbstractC3159y.i(sessionSdkVersion, "sessionSdkVersion");
        AbstractC3159y.i(osVersion, "osVersion");
        AbstractC3159y.i(logEnvironment, "logEnvironment");
        AbstractC3159y.i(androidAppInfo, "androidAppInfo");
        this.f31417a = appId;
        this.f31418b = deviceModel;
        this.f31419c = sessionSdkVersion;
        this.f31420d = osVersion;
        this.f31421e = logEnvironment;
        this.f31422f = androidAppInfo;
    }

    public final C2767a a() {
        return this.f31422f;
    }

    public final String b() {
        return this.f31417a;
    }

    public final String c() {
        return this.f31418b;
    }

    public final m d() {
        return this.f31421e;
    }

    public final String e() {
        return this.f31420d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2768b)) {
            return false;
        }
        C2768b c2768b = (C2768b) obj;
        if (AbstractC3159y.d(this.f31417a, c2768b.f31417a) && AbstractC3159y.d(this.f31418b, c2768b.f31418b) && AbstractC3159y.d(this.f31419c, c2768b.f31419c) && AbstractC3159y.d(this.f31420d, c2768b.f31420d) && this.f31421e == c2768b.f31421e && AbstractC3159y.d(this.f31422f, c2768b.f31422f)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f31419c;
    }

    public int hashCode() {
        return (((((((((this.f31417a.hashCode() * 31) + this.f31418b.hashCode()) * 31) + this.f31419c.hashCode()) * 31) + this.f31420d.hashCode()) * 31) + this.f31421e.hashCode()) * 31) + this.f31422f.hashCode();
    }

    public String toString() {
        return "ApplicationInfo(appId=" + this.f31417a + ", deviceModel=" + this.f31418b + ", sessionSdkVersion=" + this.f31419c + ", osVersion=" + this.f31420d + ", logEnvironment=" + this.f31421e + ", androidAppInfo=" + this.f31422f + ')';
    }
}
