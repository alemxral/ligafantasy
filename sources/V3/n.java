package V3;

import L5.s;
import L5.t;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.spec.ECGenParameterSpec;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class n implements g {

    /* renamed from: b, reason: collision with root package name */
    private static final a f11914b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final String f11915c = V3.a.f11878b.toString();

    /* renamed from: a, reason: collision with root package name */
    private final U3.c f11916a;

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public n(U3.c errorReporter) {
        AbstractC3159y.i(errorReporter, "errorReporter");
        this.f11916a = errorReporter;
    }

    @Override // V3.g
    public KeyPair a() {
        Object b8;
        try {
            s.a aVar = s.f6498b;
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(f11915c);
            keyPairGenerator.initialize(new ECGenParameterSpec(R1.a.f8614d.d()));
            b8 = s.b(keyPairGenerator.generateKeyPair());
        } catch (Throwable th) {
            s.a aVar2 = s.f6498b;
            b8 = s.b(t.a(th));
        }
        Throwable e8 = s.e(b8);
        if (e8 != null) {
            this.f11916a.i(e8);
        }
        Throwable e9 = s.e(b8);
        if (e9 == null) {
            AbstractC3159y.h(b8, "getOrElse(...)");
            return (KeyPair) b8;
        }
        throw new R3.b(e9);
    }
}
