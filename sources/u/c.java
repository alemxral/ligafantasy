package u;

import s.AbstractC3701c;
import s.C3700b;
import s.InterfaceC3703e;
import u.o;

/* loaded from: classes3.dex */
final class c extends o {

    /* renamed from: a, reason: collision with root package name */
    private final p f38412a;

    /* renamed from: b, reason: collision with root package name */
    private final String f38413b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC3701c f38414c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3703e f38415d;

    /* renamed from: e, reason: collision with root package name */
    private final C3700b f38416e;

    /* loaded from: classes3.dex */
    static final class b extends o.a {

        /* renamed from: a, reason: collision with root package name */
        private p f38417a;

        /* renamed from: b, reason: collision with root package name */
        private String f38418b;

        /* renamed from: c, reason: collision with root package name */
        private AbstractC3701c f38419c;

        /* renamed from: d, reason: collision with root package name */
        private InterfaceC3703e f38420d;

        /* renamed from: e, reason: collision with root package name */
        private C3700b f38421e;

        @Override // u.o.a
        public o a() {
            String str = "";
            if (this.f38417a == null) {
                str = " transportContext";
            }
            if (this.f38418b == null) {
                str = str + " transportName";
            }
            if (this.f38419c == null) {
                str = str + " event";
            }
            if (this.f38420d == null) {
                str = str + " transformer";
            }
            if (this.f38421e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new c(this.f38417a, this.f38418b, this.f38419c, this.f38420d, this.f38421e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // u.o.a
        o.a b(C3700b c3700b) {
            if (c3700b != null) {
                this.f38421e = c3700b;
                return this;
            }
            throw new NullPointerException("Null encoding");
        }

        @Override // u.o.a
        o.a c(AbstractC3701c abstractC3701c) {
            if (abstractC3701c != null) {
                this.f38419c = abstractC3701c;
                return this;
            }
            throw new NullPointerException("Null event");
        }

        @Override // u.o.a
        o.a d(InterfaceC3703e interfaceC3703e) {
            if (interfaceC3703e != null) {
                this.f38420d = interfaceC3703e;
                return this;
            }
            throw new NullPointerException("Null transformer");
        }

        @Override // u.o.a
        public o.a e(p pVar) {
            if (pVar != null) {
                this.f38417a = pVar;
                return this;
            }
            throw new NullPointerException("Null transportContext");
        }

        @Override // u.o.a
        public o.a f(String str) {
            if (str != null) {
                this.f38418b = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }
    }

    @Override // u.o
    public C3700b b() {
        return this.f38416e;
    }

    @Override // u.o
    AbstractC3701c c() {
        return this.f38414c;
    }

    @Override // u.o
    InterfaceC3703e e() {
        return this.f38415d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f38412a.equals(oVar.f()) && this.f38413b.equals(oVar.g()) && this.f38414c.equals(oVar.c()) && this.f38415d.equals(oVar.e()) && this.f38416e.equals(oVar.b())) {
            return true;
        }
        return false;
    }

    @Override // u.o
    public p f() {
        return this.f38412a;
    }

    @Override // u.o
    public String g() {
        return this.f38413b;
    }

    public int hashCode() {
        return ((((((((this.f38412a.hashCode() ^ 1000003) * 1000003) ^ this.f38413b.hashCode()) * 1000003) ^ this.f38414c.hashCode()) * 1000003) ^ this.f38415d.hashCode()) * 1000003) ^ this.f38416e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f38412a + ", transportName=" + this.f38413b + ", event=" + this.f38414c + ", transformer=" + this.f38415d + ", encoding=" + this.f38416e + "}";
    }

    private c(p pVar, String str, AbstractC3701c abstractC3701c, InterfaceC3703e interfaceC3703e, C3700b c3700b) {
        this.f38412a = pVar;
        this.f38413b = str;
        this.f38414c = abstractC3701c;
        this.f38415d = interfaceC3703e;
        this.f38416e = c3700b;
    }
}
