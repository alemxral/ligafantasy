package u;

import java.util.Map;
import u.i;

/* loaded from: classes3.dex */
final class b extends i {

    /* renamed from: a, reason: collision with root package name */
    private final String f38400a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f38401b;

    /* renamed from: c, reason: collision with root package name */
    private final h f38402c;

    /* renamed from: d, reason: collision with root package name */
    private final long f38403d;

    /* renamed from: e, reason: collision with root package name */
    private final long f38404e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f38405f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0887b extends i.a {

        /* renamed from: a, reason: collision with root package name */
        private String f38406a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f38407b;

        /* renamed from: c, reason: collision with root package name */
        private h f38408c;

        /* renamed from: d, reason: collision with root package name */
        private Long f38409d;

        /* renamed from: e, reason: collision with root package name */
        private Long f38410e;

        /* renamed from: f, reason: collision with root package name */
        private Map f38411f;

        @Override // u.i.a
        public i d() {
            String str = "";
            if (this.f38406a == null) {
                str = " transportName";
            }
            if (this.f38408c == null) {
                str = str + " encodedPayload";
            }
            if (this.f38409d == null) {
                str = str + " eventMillis";
            }
            if (this.f38410e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f38411f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new b(this.f38406a, this.f38407b, this.f38408c, this.f38409d.longValue(), this.f38410e.longValue(), this.f38411f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // u.i.a
        protected Map e() {
            Map map = this.f38411f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // u.i.a
        public i.a f(Map map) {
            if (map != null) {
                this.f38411f = map;
                return this;
            }
            throw new NullPointerException("Null autoMetadata");
        }

        @Override // u.i.a
        public i.a g(Integer num) {
            this.f38407b = num;
            return this;
        }

        @Override // u.i.a
        public i.a h(h hVar) {
            if (hVar != null) {
                this.f38408c = hVar;
                return this;
            }
            throw new NullPointerException("Null encodedPayload");
        }

        @Override // u.i.a
        public i.a i(long j8) {
            this.f38409d = Long.valueOf(j8);
            return this;
        }

        @Override // u.i.a
        public i.a j(String str) {
            if (str != null) {
                this.f38406a = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }

        @Override // u.i.a
        public i.a k(long j8) {
            this.f38410e = Long.valueOf(j8);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // u.i
    public Map c() {
        return this.f38405f;
    }

    @Override // u.i
    public Integer d() {
        return this.f38401b;
    }

    @Override // u.i
    public h e() {
        return this.f38402c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f38400a.equals(iVar.j()) && ((num = this.f38401b) != null ? num.equals(iVar.d()) : iVar.d() == null) && this.f38402c.equals(iVar.e()) && this.f38403d == iVar.f() && this.f38404e == iVar.k() && this.f38405f.equals(iVar.c())) {
            return true;
        }
        return false;
    }

    @Override // u.i
    public long f() {
        return this.f38403d;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.f38400a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f38401b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode3 = (((hashCode2 ^ hashCode) * 1000003) ^ this.f38402c.hashCode()) * 1000003;
        long j8 = this.f38403d;
        int i8 = (hashCode3 ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        long j9 = this.f38404e;
        return ((i8 ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003) ^ this.f38405f.hashCode();
    }

    @Override // u.i
    public String j() {
        return this.f38400a;
    }

    @Override // u.i
    public long k() {
        return this.f38404e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f38400a + ", code=" + this.f38401b + ", encodedPayload=" + this.f38402c + ", eventMillis=" + this.f38403d + ", uptimeMillis=" + this.f38404e + ", autoMetadata=" + this.f38405f + "}";
    }

    private b(String str, Integer num, h hVar, long j8, long j9, Map map) {
        this.f38400a = str;
        this.f38401b = num;
        this.f38402c = hVar;
        this.f38403d = j8;
        this.f38404e = j9;
        this.f38405f = map;
    }
}
