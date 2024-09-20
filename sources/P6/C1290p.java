package P6;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: P6.p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1290p implements Z {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1281g f8088a;

    /* renamed from: b, reason: collision with root package name */
    private final Inflater f8089b;

    /* renamed from: c, reason: collision with root package name */
    private int f8090c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f8091d;

    public C1290p(InterfaceC1281g source, Inflater inflater) {
        AbstractC3159y.i(source, "source");
        AbstractC3159y.i(inflater, "inflater");
        this.f8088a = source;
        this.f8089b = inflater;
    }

    private final void e() {
        int i8 = this.f8090c;
        if (i8 == 0) {
            return;
        }
        int remaining = i8 - this.f8089b.getRemaining();
        this.f8090c -= remaining;
        this.f8088a.skip(remaining);
    }

    public final long a(C1279e sink, long j8) {
        AbstractC3159y.i(sink, "sink");
        if (j8 >= 0) {
            if (!this.f8091d) {
                if (j8 == 0) {
                    return 0L;
                }
                try {
                    U F8 = sink.F(1);
                    int min = (int) Math.min(j8, 8192 - F8.f8002c);
                    b();
                    int inflate = this.f8089b.inflate(F8.f8000a, F8.f8002c, min);
                    e();
                    if (inflate > 0) {
                        F8.f8002c += inflate;
                        long j9 = inflate;
                        sink.w(sink.x() + j9);
                        return j9;
                    }
                    if (F8.f8001b == F8.f8002c) {
                        sink.f8043a = F8.b();
                        V.b(F8);
                    }
                    return 0L;
                } catch (DataFormatException e8) {
                    throw new IOException(e8);
                }
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j8).toString());
    }

    public final boolean b() {
        if (!this.f8089b.needsInput()) {
            return false;
        }
        if (this.f8088a.exhausted()) {
            return true;
        }
        U u8 = this.f8088a.i().f8043a;
        AbstractC3159y.f(u8);
        int i8 = u8.f8002c;
        int i9 = u8.f8001b;
        int i10 = i8 - i9;
        this.f8090c = i10;
        this.f8089b.setInput(u8.f8000a, i9, i10);
        return false;
    }

    @Override // P6.Z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f8091d) {
            return;
        }
        this.f8089b.end();
        this.f8091d = true;
        this.f8088a.close();
    }

    @Override // P6.Z
    public a0 timeout() {
        return this.f8088a.timeout();
    }

    @Override // P6.Z
    public long y(C1279e sink, long j8) {
        AbstractC3159y.i(sink, "sink");
        do {
            long a8 = a(sink, j8);
            if (a8 > 0) {
                return a8;
            }
            if (this.f8089b.finished() || this.f8089b.needsDictionary()) {
                return -1L;
            }
        } while (!this.f8088a.exhausted());
        throw new EOFException("source exhausted prematurely");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1290p(Z source, Inflater inflater) {
        this(L.d(source), inflater);
        AbstractC3159y.i(source, "source");
        AbstractC3159y.i(inflater, "inflater");
    }
}
