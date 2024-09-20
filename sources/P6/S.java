package P6;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class S implements InterfaceC1280f {

    /* renamed from: a, reason: collision with root package name */
    public final X f7991a;

    /* renamed from: b, reason: collision with root package name */
    public final C1279e f7992b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7993c;

    public S(X sink) {
        AbstractC3159y.i(sink, "sink");
        this.f7991a = sink;
        this.f7992b = new C1279e();
    }

    @Override // P6.X
    public void C(C1279e source, long j8) {
        AbstractC3159y.i(source, "source");
        if (!this.f7993c) {
            this.f7992b.C(source, j8);
            emitCompleteSegments();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // P6.InterfaceC1280f
    public C1279e buffer() {
        return this.f7992b;
    }

    @Override // P6.X, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f7993c) {
            try {
                if (this.f7992b.x() > 0) {
                    X x8 = this.f7991a;
                    C1279e c1279e = this.f7992b;
                    x8.C(c1279e, c1279e.x());
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                this.f7991a.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.f7993c = true;
            if (th != null) {
                throw th;
            }
        }
    }

    @Override // P6.InterfaceC1280f
    public InterfaceC1280f emitCompleteSegments() {
        if (!this.f7993c) {
            long e8 = this.f7992b.e();
            if (e8 > 0) {
                this.f7991a.C(this.f7992b, e8);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // P6.InterfaceC1280f, P6.X, java.io.Flushable
    public void flush() {
        if (!this.f7993c) {
            if (this.f7992b.x() > 0) {
                X x8 = this.f7991a;
                C1279e c1279e = this.f7992b;
                x8.C(c1279e, c1279e.x());
            }
            this.f7991a.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f7993c;
    }

    @Override // P6.InterfaceC1280f
    public OutputStream outputStream() {
        return new a();
    }

    @Override // P6.X
    public a0 timeout() {
        return this.f7991a.timeout();
    }

    public String toString() {
        return "buffer(" + this.f7991a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        AbstractC3159y.i(source, "source");
        if (!this.f7993c) {
            int write = this.f7992b.write(source);
            emitCompleteSegments();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // P6.InterfaceC1280f
    public InterfaceC1280f writeByte(int i8) {
        if (!this.f7993c) {
            this.f7992b.writeByte(i8);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // P6.InterfaceC1280f
    public InterfaceC1280f writeDecimalLong(long j8) {
        if (!this.f7993c) {
            this.f7992b.writeDecimalLong(j8);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // P6.InterfaceC1280f
    public InterfaceC1280f writeHexadecimalUnsignedLong(long j8) {
        if (!this.f7993c) {
            this.f7992b.writeHexadecimalUnsignedLong(j8);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // P6.InterfaceC1280f
    public InterfaceC1280f writeInt(int i8) {
        if (!this.f7993c) {
            this.f7992b.writeInt(i8);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // P6.InterfaceC1280f
    public InterfaceC1280f writeShort(int i8) {
        if (!this.f7993c) {
            this.f7992b.writeShort(i8);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // P6.InterfaceC1280f
    public InterfaceC1280f writeUtf8(String string) {
        AbstractC3159y.i(string, "string");
        if (!this.f7993c) {
            this.f7992b.writeUtf8(string);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    /* loaded from: classes5.dex */
    public static final class a extends OutputStream {
        a() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            S.this.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            S s8 = S.this;
            if (!s8.f7993c) {
                s8.flush();
            }
        }

        public String toString() {
            return S.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i8) {
            S s8 = S.this;
            if (!s8.f7993c) {
                s8.f7992b.writeByte((byte) i8);
                S.this.emitCompleteSegments();
                return;
            }
            throw new IOException("closed");
        }

        @Override // java.io.OutputStream
        public void write(byte[] data, int i8, int i9) {
            AbstractC3159y.i(data, "data");
            S s8 = S.this;
            if (!s8.f7993c) {
                s8.f7992b.write(data, i8, i9);
                S.this.emitCompleteSegments();
                return;
            }
            throw new IOException("closed");
        }
    }

    @Override // P6.InterfaceC1280f
    public InterfaceC1280f write(byte[] source) {
        AbstractC3159y.i(source, "source");
        if (!this.f7993c) {
            this.f7992b.write(source);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // P6.InterfaceC1280f
    public InterfaceC1280f write(byte[] source, int i8, int i9) {
        AbstractC3159y.i(source, "source");
        if (!this.f7993c) {
            this.f7992b.write(source, i8, i9);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }
}
