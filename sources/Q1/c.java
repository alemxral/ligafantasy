package Q1;

import java.security.Provider;
import java.security.SecureRandom;

/* loaded from: classes4.dex */
public final class c extends b {

    /* renamed from: c, reason: collision with root package name */
    private Provider f8161c;

    /* renamed from: d, reason: collision with root package name */
    private Provider f8162d;

    /* renamed from: e, reason: collision with root package name */
    private Provider f8163e;

    public c() {
        this(null, null, null, null, null);
    }

    public Provider d() {
        Provider provider = this.f8162d;
        if (provider == null) {
            return a();
        }
        return provider;
    }

    public Provider e() {
        Provider provider = this.f8161c;
        if (provider == null) {
            return a();
        }
        return provider;
    }

    public Provider f() {
        Provider provider = this.f8163e;
        if (provider == null) {
            return a();
        }
        return provider;
    }

    public c(Provider provider, Provider provider2, Provider provider3, Provider provider4, SecureRandom secureRandom) {
        super(provider, secureRandom);
        this.f8161c = provider2;
        this.f8162d = provider3;
        this.f8163e = provider4;
    }
}
