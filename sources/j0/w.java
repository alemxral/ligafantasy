package J0;

import J0.B;

/* loaded from: classes3.dex */
final class w extends B.e.f {

    /* renamed from: a, reason: collision with root package name */
    private final String f4654a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends B.e.f.a {

        /* renamed from: a, reason: collision with root package name */
        private String f4655a;

        @Override // J0.B.e.f.a
        public B.e.f a() {
            String str = "";
            if (this.f4655a == null) {
                str = " identifier";
            }
            if (str.isEmpty()) {
                return new w(this.f4655a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // J0.B.e.f.a
        public B.e.f.a b(String str) {
            if (str != null) {
                this.f4655a = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }
    }

    @Override // J0.B.e.f
    public String b() {
        return this.f4654a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof B.e.f) {
            return this.f4654a.equals(((B.e.f) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f4654a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "User{identifier=" + this.f4654a + "}";
    }

    private w(String str) {
        this.f4654a = str;
    }
}
