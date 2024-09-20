package y5;

import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f39871a;

    /* renamed from: b, reason: collision with root package name */
    public String f39872b;

    /* renamed from: c, reason: collision with root package name */
    public String f39873c;

    public f(int i8, String provider_name, String policy_url, String domains) {
        AbstractC3159y.i(provider_name, "provider_name");
        AbstractC3159y.i(policy_url, "policy_url");
        AbstractC3159y.i(domains, "domains");
        this.f39871a = i8;
        this.f39872b = provider_name;
        this.f39873c = policy_url;
    }

    public final B6.l a() {
        return new B6.l(this.f39871a, this.f39872b, null, null, null, null, null, null, null, this.f39873c, null, null, 0, false, false, null, null, null, null, null, 914940);
    }
}
