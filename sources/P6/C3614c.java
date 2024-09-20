package p6;

import i6.I;
import n6.AbstractC3500n;

/* renamed from: p6.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3614c extends AbstractC3617f {

    /* renamed from: g, reason: collision with root package name */
    public static final C3614c f37092g = new C3614c();

    private C3614c() {
        super(AbstractC3623l.f37105c, AbstractC3623l.f37106d, AbstractC3623l.f37107e, AbstractC3623l.f37103a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // i6.I
    public I limitedParallelism(int i8) {
        AbstractC3500n.a(i8);
        if (i8 >= AbstractC3623l.f37105c) {
            return this;
        }
        return super.limitedParallelism(i8);
    }

    @Override // i6.I
    public String toString() {
        return "Dispatchers.Default";
    }
}
