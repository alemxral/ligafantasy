package s;

/* renamed from: s.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3699a extends AbstractC3701c {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f37676a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f37677b;

    /* renamed from: c, reason: collision with root package name */
    private final EnumC3702d f37678c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3699a(Integer num, Object obj, EnumC3702d enumC3702d) {
        this.f37676a = num;
        if (obj != null) {
            this.f37677b = obj;
            if (enumC3702d != null) {
                this.f37678c = enumC3702d;
                return;
            }
            throw new NullPointerException("Null priority");
        }
        throw new NullPointerException("Null payload");
    }

    @Override // s.AbstractC3701c
    public Integer a() {
        return this.f37676a;
    }

    @Override // s.AbstractC3701c
    public Object b() {
        return this.f37677b;
    }

    @Override // s.AbstractC3701c
    public EnumC3702d c() {
        return this.f37678c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3701c)) {
            return false;
        }
        AbstractC3701c abstractC3701c = (AbstractC3701c) obj;
        Integer num = this.f37676a;
        if (num != null ? num.equals(abstractC3701c.a()) : abstractC3701c.a() == null) {
            if (this.f37677b.equals(abstractC3701c.b()) && this.f37678c.equals(abstractC3701c.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        Integer num = this.f37676a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return ((((hashCode ^ 1000003) * 1000003) ^ this.f37677b.hashCode()) * 1000003) ^ this.f37678c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.f37676a + ", payload=" + this.f37677b + ", priority=" + this.f37678c + "}";
    }
}
