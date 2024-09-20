package N3;

import P5.d;
import i6.M;
import kotlin.jvm.internal.AbstractC3159y;
import l6.InterfaceC3349K;

/* loaded from: classes4.dex */
public interface c {

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f7184a;

        /* renamed from: b, reason: collision with root package name */
        private final int f7185b;

        public a(String clientSecret, int i8) {
            AbstractC3159y.i(clientSecret, "clientSecret");
            this.f7184a = clientSecret;
            this.f7185b = i8;
        }

        public final String a() {
            return this.f7184a;
        }

        public final int b() {
            return this.f7185b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (AbstractC3159y.d(this.f7184a, aVar.f7184a) && this.f7185b == aVar.f7185b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f7184a.hashCode() * 31) + this.f7185b;
        }

        public String toString() {
            return "Config(clientSecret=" + this.f7184a + ", maxAttempts=" + this.f7185b + ")";
        }
    }

    Object a(d dVar);

    void b(M m8);

    void c();

    InterfaceC3349K getState();
}
