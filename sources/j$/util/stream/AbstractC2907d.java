package j$.util.stream;

/* renamed from: j$.util.stream.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2907d {

    /* renamed from: a, reason: collision with root package name */
    protected final int f32484a;

    /* renamed from: b, reason: collision with root package name */
    protected int f32485b;

    /* renamed from: c, reason: collision with root package name */
    protected int f32486c;

    /* renamed from: d, reason: collision with root package name */
    protected long[] f32487d;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC2907d() {
        this.f32484a = 4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC2907d(int i8) {
        if (i8 >= 0) {
            this.f32484a = Math.max(4, 32 - Integer.numberOfLeadingZeros(i8 - 1));
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " + i8);
        }
    }

    public abstract void clear();

    public final long count() {
        int i8 = this.f32486c;
        return i8 == 0 ? this.f32485b : this.f32487d[i8] + this.f32485b;
    }
}
