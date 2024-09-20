package com.google.firebase.installations;

import com.google.firebase.installations.g;

/* loaded from: classes3.dex */
final class a extends g {

    /* renamed from: a, reason: collision with root package name */
    private final String f17243a;

    /* renamed from: b, reason: collision with root package name */
    private final long f17244b;

    /* renamed from: c, reason: collision with root package name */
    private final long f17245c;

    /* loaded from: classes3.dex */
    static final class b extends g.a {

        /* renamed from: a, reason: collision with root package name */
        private String f17246a;

        /* renamed from: b, reason: collision with root package name */
        private Long f17247b;

        /* renamed from: c, reason: collision with root package name */
        private Long f17248c;

        @Override // com.google.firebase.installations.g.a
        public g a() {
            String str = "";
            if (this.f17246a == null) {
                str = " token";
            }
            if (this.f17247b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f17248c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new a(this.f17246a, this.f17247b.longValue(), this.f17248c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.g.a
        public g.a b(String str) {
            if (str != null) {
                this.f17246a = str;
                return this;
            }
            throw new NullPointerException("Null token");
        }

        @Override // com.google.firebase.installations.g.a
        public g.a c(long j8) {
            this.f17248c = Long.valueOf(j8);
            return this;
        }

        @Override // com.google.firebase.installations.g.a
        public g.a d(long j8) {
            this.f17247b = Long.valueOf(j8);
            return this;
        }
    }

    @Override // com.google.firebase.installations.g
    public String b() {
        return this.f17243a;
    }

    @Override // com.google.firebase.installations.g
    public long c() {
        return this.f17245c;
    }

    @Override // com.google.firebase.installations.g
    public long d() {
        return this.f17244b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f17243a.equals(gVar.b()) && this.f17244b == gVar.d() && this.f17245c == gVar.c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f17243a.hashCode() ^ 1000003) * 1000003;
        long j8 = this.f17244b;
        long j9 = this.f17245c;
        return ((hashCode ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ ((int) (j9 ^ (j9 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f17243a + ", tokenExpirationTimestamp=" + this.f17244b + ", tokenCreationTimestamp=" + this.f17245c + "}";
    }

    private a(String str, long j8, long j9) {
        this.f17243a = str;
        this.f17244b = j8;
        this.f17245c = j9;
    }
}
