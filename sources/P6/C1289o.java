package P6;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: P6.o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1289o implements Z {

    /* renamed from: a, reason: collision with root package name */
    private byte f8083a;

    /* renamed from: b, reason: collision with root package name */
    private final T f8084b;

    /* renamed from: c, reason: collision with root package name */
    private final Inflater f8085c;

    /* renamed from: d, reason: collision with root package name */
    private final C1290p f8086d;

    /* renamed from: e, reason: collision with root package name */
    private final CRC32 f8087e;

    public C1289o(Z source) {
        AbstractC3159y.i(source, "source");
        T t8 = new T(source);
        this.f8084b = t8;
        Inflater inflater = new Inflater(true);
        this.f8085c = inflater;
        this.f8086d = new C1290p((InterfaceC1281g) t8, inflater);
        this.f8087e = new CRC32();
    }

    private final void a(String str, int i8, int i9) {
        if (i9 == i8) {
            return;
        }
        String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i9), Integer.valueOf(i8)}, 3));
        AbstractC3159y.h(format, "format(this, *args)");
        throw new IOException(format);
    }

    private final void b() {
        boolean z8;
        this.f8084b.require(10L);
        byte l8 = this.f8084b.f7996b.l(3L);
        if (((l8 >> 1) & 1) == 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            f(this.f8084b.f7996b, 0L, 10L);
        }
        a("ID1ID2", 8075, this.f8084b.readShort());
        this.f8084b.skip(8L);
        if (((l8 >> 2) & 1) == 1) {
            this.f8084b.require(2L);
            if (z8) {
                f(this.f8084b.f7996b, 0L, 2L);
            }
            long readShortLe = this.f8084b.f7996b.readShortLe() & 65535;
            this.f8084b.require(readShortLe);
            if (z8) {
                f(this.f8084b.f7996b, 0L, readShortLe);
            }
            this.f8084b.skip(readShortLe);
        }
        if (((l8 >> 3) & 1) == 1) {
            long indexOf = this.f8084b.indexOf((byte) 0);
            if (indexOf != -1) {
                if (z8) {
                    f(this.f8084b.f7996b, 0L, indexOf + 1);
                }
                this.f8084b.skip(indexOf + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((l8 >> 4) & 1) == 1) {
            long indexOf2 = this.f8084b.indexOf((byte) 0);
            if (indexOf2 != -1) {
                if (z8) {
                    f(this.f8084b.f7996b, 0L, indexOf2 + 1);
                }
                this.f8084b.skip(indexOf2 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z8) {
            a("FHCRC", this.f8084b.readShortLe(), (short) this.f8087e.getValue());
            this.f8087e.reset();
        }
    }

    private final void e() {
        a("CRC", this.f8084b.readIntLe(), (int) this.f8087e.getValue());
        a("ISIZE", this.f8084b.readIntLe(), (int) this.f8085c.getBytesWritten());
    }

    private final void f(C1279e c1279e, long j8, long j9) {
        U u8 = c1279e.f8043a;
        AbstractC3159y.f(u8);
        while (true) {
            int i8 = u8.f8002c;
            int i9 = u8.f8001b;
            if (j8 < i8 - i9) {
                break;
            }
            j8 -= i8 - i9;
            u8 = u8.f8005f;
            AbstractC3159y.f(u8);
        }
        while (j9 > 0) {
            int min = (int) Math.min(u8.f8002c - r7, j9);
            this.f8087e.update(u8.f8000a, (int) (u8.f8001b + j8), min);
            j9 -= min;
            u8 = u8.f8005f;
            AbstractC3159y.f(u8);
            j8 = 0;
        }
    }

    @Override // P6.Z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f8086d.close();
    }

    @Override // P6.Z
    public a0 timeout() {
        return this.f8084b.timeout();
    }

    @Override // P6.Z
    public long y(C1279e sink, long j8) {
        AbstractC3159y.i(sink, "sink");
        if (j8 >= 0) {
            if (j8 == 0) {
                return 0L;
            }
            if (this.f8083a == 0) {
                b();
                this.f8083a = (byte) 1;
            }
            if (this.f8083a == 1) {
                long x8 = sink.x();
                long y8 = this.f8086d.y(sink, j8);
                if (y8 != -1) {
                    f(sink, x8, y8);
                    return y8;
                }
                this.f8083a = (byte) 2;
            }
            if (this.f8083a == 2) {
                e();
                this.f8083a = (byte) 3;
                if (!this.f8084b.exhausted()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1L;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j8).toString());
    }
}
