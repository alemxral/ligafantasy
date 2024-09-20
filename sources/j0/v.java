package J0;

import J0.B;

/* loaded from: classes3.dex */
final class v extends B.e.AbstractC0087e {

    /* renamed from: a, reason: collision with root package name */
    private final int f4646a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4647b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4648c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f4649d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends B.e.AbstractC0087e.a {

        /* renamed from: a, reason: collision with root package name */
        private Integer f4650a;

        /* renamed from: b, reason: collision with root package name */
        private String f4651b;

        /* renamed from: c, reason: collision with root package name */
        private String f4652c;

        /* renamed from: d, reason: collision with root package name */
        private Boolean f4653d;

        @Override // J0.B.e.AbstractC0087e.a
        public B.e.AbstractC0087e a() {
            String str = "";
            if (this.f4650a == null) {
                str = " platform";
            }
            if (this.f4651b == null) {
                str = str + " version";
            }
            if (this.f4652c == null) {
                str = str + " buildVersion";
            }
            if (this.f4653d == null) {
                str = str + " jailbroken";
            }
            if (str.isEmpty()) {
                return new v(this.f4650a.intValue(), this.f4651b, this.f4652c, this.f4653d.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // J0.B.e.AbstractC0087e.a
        public B.e.AbstractC0087e.a b(String str) {
            if (str != null) {
                this.f4652c = str;
                return this;
            }
            throw new NullPointerException("Null buildVersion");
        }

        @Override // J0.B.e.AbstractC0087e.a
        public B.e.AbstractC0087e.a c(boolean z8) {
            this.f4653d = Boolean.valueOf(z8);
            return this;
        }

        @Override // J0.B.e.AbstractC0087e.a
        public B.e.AbstractC0087e.a d(int i8) {
            this.f4650a = Integer.valueOf(i8);
            return this;
        }

        @Override // J0.B.e.AbstractC0087e.a
        public B.e.AbstractC0087e.a e(String str) {
            if (str != null) {
                this.f4651b = str;
                return this;
            }
            throw new NullPointerException("Null version");
        }
    }

    @Override // J0.B.e.AbstractC0087e
    public String b() {
        return this.f4648c;
    }

    @Override // J0.B.e.AbstractC0087e
    public int c() {
        return this.f4646a;
    }

    @Override // J0.B.e.AbstractC0087e
    public String d() {
        return this.f4647b;
    }

    @Override // J0.B.e.AbstractC0087e
    public boolean e() {
        return this.f4649d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.e.AbstractC0087e)) {
            return false;
        }
        B.e.AbstractC0087e abstractC0087e = (B.e.AbstractC0087e) obj;
        if (this.f4646a == abstractC0087e.c() && this.f4647b.equals(abstractC0087e.d()) && this.f4648c.equals(abstractC0087e.b()) && this.f4649d == abstractC0087e.e()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i8;
        int hashCode = (((((this.f4646a ^ 1000003) * 1000003) ^ this.f4647b.hashCode()) * 1000003) ^ this.f4648c.hashCode()) * 1000003;
        if (this.f4649d) {
            i8 = 1231;
        } else {
            i8 = 1237;
        }
        return hashCode ^ i8;
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.f4646a + ", version=" + this.f4647b + ", buildVersion=" + this.f4648c + ", jailbroken=" + this.f4649d + "}";
    }

    private v(int i8, String str, String str2, boolean z8) {
        this.f4646a = i8;
        this.f4647b = str;
        this.f4648c = str2;
        this.f4649d = z8;
    }
}
