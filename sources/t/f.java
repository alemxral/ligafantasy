package t;

import java.util.Arrays;
import t.l;

/* loaded from: classes3.dex */
final class f extends l {

    /* renamed from: a, reason: collision with root package name */
    private final long f38092a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f38093b;

    /* renamed from: c, reason: collision with root package name */
    private final long f38094c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f38095d;

    /* renamed from: e, reason: collision with root package name */
    private final String f38096e;

    /* renamed from: f, reason: collision with root package name */
    private final long f38097f;

    /* renamed from: g, reason: collision with root package name */
    private final o f38098g;

    /* loaded from: classes3.dex */
    static final class b extends l.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f38099a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f38100b;

        /* renamed from: c, reason: collision with root package name */
        private Long f38101c;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f38102d;

        /* renamed from: e, reason: collision with root package name */
        private String f38103e;

        /* renamed from: f, reason: collision with root package name */
        private Long f38104f;

        /* renamed from: g, reason: collision with root package name */
        private o f38105g;

        @Override // t.l.a
        public l a() {
            String str = "";
            if (this.f38099a == null) {
                str = " eventTimeMs";
            }
            if (this.f38101c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f38104f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new f(this.f38099a.longValue(), this.f38100b, this.f38101c.longValue(), this.f38102d, this.f38103e, this.f38104f.longValue(), this.f38105g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // t.l.a
        public l.a b(Integer num) {
            this.f38100b = num;
            return this;
        }

        @Override // t.l.a
        public l.a c(long j8) {
            this.f38099a = Long.valueOf(j8);
            return this;
        }

        @Override // t.l.a
        public l.a d(long j8) {
            this.f38101c = Long.valueOf(j8);
            return this;
        }

        @Override // t.l.a
        public l.a e(o oVar) {
            this.f38105g = oVar;
            return this;
        }

        @Override // t.l.a
        l.a f(byte[] bArr) {
            this.f38102d = bArr;
            return this;
        }

        @Override // t.l.a
        l.a g(String str) {
            this.f38103e = str;
            return this;
        }

        @Override // t.l.a
        public l.a h(long j8) {
            this.f38104f = Long.valueOf(j8);
            return this;
        }
    }

    @Override // t.l
    public Integer b() {
        return this.f38093b;
    }

    @Override // t.l
    public long c() {
        return this.f38092a;
    }

    @Override // t.l
    public long d() {
        return this.f38094c;
    }

    @Override // t.l
    public o e() {
        return this.f38098g;
    }

    public boolean equals(Object obj) {
        Integer num;
        byte[] f8;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f38092a == lVar.c() && ((num = this.f38093b) != null ? num.equals(lVar.b()) : lVar.b() == null) && this.f38094c == lVar.d()) {
            byte[] bArr = this.f38095d;
            if (lVar instanceof f) {
                f8 = ((f) lVar).f38095d;
            } else {
                f8 = lVar.f();
            }
            if (Arrays.equals(bArr, f8) && ((str = this.f38096e) != null ? str.equals(lVar.g()) : lVar.g() == null) && this.f38097f == lVar.h()) {
                o oVar = this.f38098g;
                if (oVar == null) {
                    if (lVar.e() == null) {
                        return true;
                    }
                } else if (oVar.equals(lVar.e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // t.l
    public byte[] f() {
        return this.f38095d;
    }

    @Override // t.l
    public String g() {
        return this.f38096e;
    }

    @Override // t.l
    public long h() {
        return this.f38097f;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        long j8 = this.f38092a;
        int i8 = (((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f38093b;
        int i9 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j9 = this.f38094c;
        int hashCode3 = (((((i8 ^ hashCode) * 1000003) ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f38095d)) * 1000003;
        String str = this.f38096e;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        long j10 = this.f38097f;
        int i10 = (((hashCode3 ^ hashCode2) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003;
        o oVar = this.f38098g;
        if (oVar != null) {
            i9 = oVar.hashCode();
        }
        return i10 ^ i9;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f38092a + ", eventCode=" + this.f38093b + ", eventUptimeMs=" + this.f38094c + ", sourceExtension=" + Arrays.toString(this.f38095d) + ", sourceExtensionJsonProto3=" + this.f38096e + ", timezoneOffsetSeconds=" + this.f38097f + ", networkConnectionInfo=" + this.f38098g + "}";
    }

    private f(long j8, Integer num, long j9, byte[] bArr, String str, long j10, o oVar) {
        this.f38092a = j8;
        this.f38093b = num;
        this.f38094c = j9;
        this.f38095d = bArr;
        this.f38096e = str;
        this.f38097f = j10;
        this.f38098g = oVar;
    }
}
