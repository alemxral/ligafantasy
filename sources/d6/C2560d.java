package d6;

/* renamed from: d6.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C2560d implements InterfaceC2561e {

    /* renamed from: a, reason: collision with root package name */
    private final float f30175a;

    /* renamed from: b, reason: collision with root package name */
    private final float f30176b;

    public C2560d(float f8, float f9) {
        this.f30175a = f8;
        this.f30176b = f9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // d6.InterfaceC2561e
    public /* bridge */ /* synthetic */ boolean a(Comparable comparable, Comparable comparable2) {
        return e(((Number) comparable).floatValue(), ((Number) comparable2).floatValue());
    }

    public boolean b(float f8) {
        if (f8 >= this.f30175a && f8 <= this.f30176b) {
            return true;
        }
        return false;
    }

    @Override // d6.InterfaceC2562f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Float getEndInclusive() {
        return Float.valueOf(this.f30176b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // d6.InterfaceC2561e
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return b(((Number) comparable).floatValue());
    }

    @Override // d6.InterfaceC2562f
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Float getStart() {
        return Float.valueOf(this.f30175a);
    }

    public boolean e(float f8, float f9) {
        if (f8 <= f9) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2560d) {
            if (!isEmpty() || !((C2560d) obj).isEmpty()) {
                C2560d c2560d = (C2560d) obj;
                if (this.f30175a != c2560d.f30175a || this.f30176b != c2560d.f30176b) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.floatToIntBits(this.f30175a) * 31) + Float.floatToIntBits(this.f30176b);
    }

    @Override // d6.InterfaceC2561e, d6.InterfaceC2562f
    public boolean isEmpty() {
        if (this.f30175a > this.f30176b) {
            return true;
        }
        return false;
    }

    public String toString() {
        return this.f30175a + ".." + this.f30176b;
    }
}
