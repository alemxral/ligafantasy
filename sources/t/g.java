package t;

import java.util.List;
import t.m;

/* loaded from: classes3.dex */
final class g extends m {

    /* renamed from: a, reason: collision with root package name */
    private final long f38106a;

    /* renamed from: b, reason: collision with root package name */
    private final long f38107b;

    /* renamed from: c, reason: collision with root package name */
    private final k f38108c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f38109d;

    /* renamed from: e, reason: collision with root package name */
    private final String f38110e;

    /* renamed from: f, reason: collision with root package name */
    private final List f38111f;

    /* renamed from: g, reason: collision with root package name */
    private final p f38112g;

    /* loaded from: classes3.dex */
    static final class b extends m.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f38113a;

        /* renamed from: b, reason: collision with root package name */
        private Long f38114b;

        /* renamed from: c, reason: collision with root package name */
        private k f38115c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f38116d;

        /* renamed from: e, reason: collision with root package name */
        private String f38117e;

        /* renamed from: f, reason: collision with root package name */
        private List f38118f;

        /* renamed from: g, reason: collision with root package name */
        private p f38119g;

        @Override // t.m.a
        public m a() {
            String str = "";
            if (this.f38113a == null) {
                str = " requestTimeMs";
            }
            if (this.f38114b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new g(this.f38113a.longValue(), this.f38114b.longValue(), this.f38115c, this.f38116d, this.f38117e, this.f38118f, this.f38119g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // t.m.a
        public m.a b(k kVar) {
            this.f38115c = kVar;
            return this;
        }

        @Override // t.m.a
        public m.a c(List list) {
            this.f38118f = list;
            return this;
        }

        @Override // t.m.a
        m.a d(Integer num) {
            this.f38116d = num;
            return this;
        }

        @Override // t.m.a
        m.a e(String str) {
            this.f38117e = str;
            return this;
        }

        @Override // t.m.a
        public m.a f(p pVar) {
            this.f38119g = pVar;
            return this;
        }

        @Override // t.m.a
        public m.a g(long j8) {
            this.f38113a = Long.valueOf(j8);
            return this;
        }

        @Override // t.m.a
        public m.a h(long j8) {
            this.f38114b = Long.valueOf(j8);
            return this;
        }
    }

    @Override // t.m
    public k b() {
        return this.f38108c;
    }

    @Override // t.m
    public List c() {
        return this.f38111f;
    }

    @Override // t.m
    public Integer d() {
        return this.f38109d;
    }

    @Override // t.m
    public String e() {
        return this.f38110e;
    }

    public boolean equals(Object obj) {
        k kVar;
        Integer num;
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f38106a == mVar.g() && this.f38107b == mVar.h() && ((kVar = this.f38108c) != null ? kVar.equals(mVar.b()) : mVar.b() == null) && ((num = this.f38109d) != null ? num.equals(mVar.d()) : mVar.d() == null) && ((str = this.f38110e) != null ? str.equals(mVar.e()) : mVar.e() == null) && ((list = this.f38111f) != null ? list.equals(mVar.c()) : mVar.c() == null)) {
            p pVar = this.f38112g;
            if (pVar == null) {
                if (mVar.f() == null) {
                    return true;
                }
            } else if (pVar.equals(mVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // t.m
    public p f() {
        return this.f38112g;
    }

    @Override // t.m
    public long g() {
        return this.f38106a;
    }

    @Override // t.m
    public long h() {
        return this.f38107b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        long j8 = this.f38106a;
        long j9 = this.f38107b;
        int i8 = (((((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j9 >>> 32) ^ j9))) * 1000003;
        k kVar = this.f38108c;
        int i9 = 0;
        if (kVar == null) {
            hashCode = 0;
        } else {
            hashCode = kVar.hashCode();
        }
        int i10 = (i8 ^ hashCode) * 1000003;
        Integer num = this.f38109d;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i11 = (i10 ^ hashCode2) * 1000003;
        String str = this.f38110e;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i12 = (i11 ^ hashCode3) * 1000003;
        List list = this.f38111f;
        if (list == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = list.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        p pVar = this.f38112g;
        if (pVar != null) {
            i9 = pVar.hashCode();
        }
        return i13 ^ i9;
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f38106a + ", requestUptimeMs=" + this.f38107b + ", clientInfo=" + this.f38108c + ", logSource=" + this.f38109d + ", logSourceName=" + this.f38110e + ", logEvents=" + this.f38111f + ", qosTier=" + this.f38112g + "}";
    }

    private g(long j8, long j9, k kVar, Integer num, String str, List list, p pVar) {
        this.f38106a = j8;
        this.f38107b = j9;
        this.f38108c = kVar;
        this.f38109d = num;
        this.f38110e = str;
        this.f38111f = list;
        this.f38112g = pVar;
    }
}
