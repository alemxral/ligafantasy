package J1;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
class b implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final InputStream f4708a;

    /* renamed from: b, reason: collision with root package name */
    private final Charset f4709b;

    /* renamed from: c, reason: collision with root package name */
    private byte[] f4710c;

    /* renamed from: d, reason: collision with root package name */
    private int f4711d;

    /* renamed from: e, reason: collision with root package name */
    private int f4712e;

    /* loaded from: classes3.dex */
    class a extends ByteArrayOutputStream {
        a(int i8) {
            super(i8);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i8 = ((ByteArrayOutputStream) this).count;
            if (i8 > 0 && ((ByteArrayOutputStream) this).buf[i8 - 1] == 13) {
                i8--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i8, b.this.f4709b.name());
            } catch (UnsupportedEncodingException e8) {
                throw new AssertionError(e8);
            }
        }
    }

    public b(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    private void b() {
        InputStream inputStream = this.f4708a;
        byte[] bArr = this.f4710c;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f4711d = 0;
            this.f4712e = read;
            return;
        }
        throw new EOFException();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f4708a) {
            try {
                if (this.f4710c != null) {
                    this.f4710c = null;
                    this.f4708a.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String e() {
        int i8;
        byte[] bArr;
        int i9;
        synchronized (this.f4708a) {
            try {
                if (this.f4710c != null) {
                    if (this.f4711d >= this.f4712e) {
                        b();
                    }
                    for (int i10 = this.f4711d; i10 != this.f4712e; i10++) {
                        byte[] bArr2 = this.f4710c;
                        if (bArr2[i10] == 10) {
                            int i11 = this.f4711d;
                            if (i10 != i11) {
                                i9 = i10 - 1;
                                if (bArr2[i9] == 13) {
                                    String str = new String(bArr2, i11, i9 - i11, this.f4709b.name());
                                    this.f4711d = i10 + 1;
                                    return str;
                                }
                            }
                            i9 = i10;
                            String str2 = new String(bArr2, i11, i9 - i11, this.f4709b.name());
                            this.f4711d = i10 + 1;
                            return str2;
                        }
                    }
                    a aVar = new a((this.f4712e - this.f4711d) + 80);
                    loop1: while (true) {
                        byte[] bArr3 = this.f4710c;
                        int i12 = this.f4711d;
                        aVar.write(bArr3, i12, this.f4712e - i12);
                        this.f4712e = -1;
                        b();
                        i8 = this.f4711d;
                        while (i8 != this.f4712e) {
                            bArr = this.f4710c;
                            if (bArr[i8] == 10) {
                                break loop1;
                            }
                            i8++;
                        }
                    }
                    int i13 = this.f4711d;
                    if (i8 != i13) {
                        aVar.write(bArr, i13, i8 - i13);
                    }
                    this.f4711d = i8 + 1;
                    return aVar.toString();
                }
                throw new IOException("LineReader is closed");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public b(InputStream inputStream, int i8, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i8 >= 0) {
            if (charset.equals(c.f4714a)) {
                this.f4708a = inputStream;
                this.f4709b = charset;
                this.f4710c = new byte[i8];
                return;
            }
            throw new IllegalArgumentException("Unsupported encoding");
        }
        throw new IllegalArgumentException("capacity <= 0");
    }
}
