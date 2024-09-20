package P6;

import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: P6.m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1287m implements Z {

    /* renamed from: a, reason: collision with root package name */
    private final Z f8081a;

    public AbstractC1287m(Z delegate) {
        AbstractC3159y.i(delegate, "delegate");
        this.f8081a = delegate;
    }

    public final Z a() {
        return this.f8081a;
    }

    @Override // P6.Z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f8081a.close();
    }

    @Override // P6.Z
    public a0 timeout() {
        return this.f8081a.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f8081a + ')';
    }

    @Override // P6.Z
    public long y(C1279e sink, long j8) {
        AbstractC3159y.i(sink, "sink");
        return this.f8081a.y(sink, j8);
    }
}
