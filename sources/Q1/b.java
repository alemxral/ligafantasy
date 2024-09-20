package Q1;

import java.security.Provider;
import java.security.SecureRandom;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private Provider f8159a;

    /* renamed from: b, reason: collision with root package name */
    private SecureRandom f8160b;

    public b() {
        this(null, null);
    }

    public Provider a() {
        return this.f8159a;
    }

    public SecureRandom b() {
        SecureRandom secureRandom = this.f8160b;
        if (secureRandom == null) {
            return new SecureRandom();
        }
        return secureRandom;
    }

    public void c(Provider provider) {
        this.f8159a = provider;
    }

    public b(Provider provider, SecureRandom secureRandom) {
        this.f8159a = provider;
        this.f8160b = secureRandom;
    }
}
