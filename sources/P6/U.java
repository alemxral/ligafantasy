package P6;

import M5.AbstractC1239l;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class U {

    /* renamed from: h, reason: collision with root package name */
    public static final a f7999h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f8000a;

    /* renamed from: b, reason: collision with root package name */
    public int f8001b;

    /* renamed from: c, reason: collision with root package name */
    public int f8002c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8003d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8004e;

    /* renamed from: f, reason: collision with root package name */
    public U f8005f;

    /* renamed from: g, reason: collision with root package name */
    public U f8006g;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public U() {
        this.f8000a = new byte[8192];
        this.f8004e = true;
        this.f8003d = false;
    }

    public final void a() {
        int i8;
        U u8 = this.f8006g;
        if (u8 != this) {
            AbstractC3159y.f(u8);
            if (!u8.f8004e) {
                return;
            }
            int i9 = this.f8002c - this.f8001b;
            U u9 = this.f8006g;
            AbstractC3159y.f(u9);
            int i10 = 8192 - u9.f8002c;
            U u10 = this.f8006g;
            AbstractC3159y.f(u10);
            if (u10.f8003d) {
                i8 = 0;
            } else {
                U u11 = this.f8006g;
                AbstractC3159y.f(u11);
                i8 = u11.f8001b;
            }
            if (i9 > i10 + i8) {
                return;
            }
            U u12 = this.f8006g;
            AbstractC3159y.f(u12);
            f(u12, i9);
            b();
            V.b(this);
            return;
        }
        throw new IllegalStateException("cannot compact".toString());
    }

    public final U b() {
        U u8 = this.f8005f;
        if (u8 == this) {
            u8 = null;
        }
        U u9 = this.f8006g;
        AbstractC3159y.f(u9);
        u9.f8005f = this.f8005f;
        U u10 = this.f8005f;
        AbstractC3159y.f(u10);
        u10.f8006g = this.f8006g;
        this.f8005f = null;
        this.f8006g = null;
        return u8;
    }

    public final U c(U segment) {
        AbstractC3159y.i(segment, "segment");
        segment.f8006g = this;
        segment.f8005f = this.f8005f;
        U u8 = this.f8005f;
        AbstractC3159y.f(u8);
        u8.f8006g = segment;
        this.f8005f = segment;
        return segment;
    }

    public final U d() {
        this.f8003d = true;
        return new U(this.f8000a, this.f8001b, this.f8002c, true, false);
    }

    public final U e(int i8) {
        U c8;
        if (i8 > 0 && i8 <= this.f8002c - this.f8001b) {
            if (i8 >= 1024) {
                c8 = d();
            } else {
                c8 = V.c();
                byte[] bArr = this.f8000a;
                byte[] bArr2 = c8.f8000a;
                int i9 = this.f8001b;
                AbstractC1239l.j(bArr, bArr2, 0, i9, i9 + i8, 2, null);
            }
            c8.f8002c = c8.f8001b + i8;
            this.f8001b += i8;
            U u8 = this.f8006g;
            AbstractC3159y.f(u8);
            u8.c(c8);
            return c8;
        }
        throw new IllegalArgumentException("byteCount out of range".toString());
    }

    public final void f(U sink, int i8) {
        AbstractC3159y.i(sink, "sink");
        if (sink.f8004e) {
            int i9 = sink.f8002c;
            if (i9 + i8 > 8192) {
                if (!sink.f8003d) {
                    int i10 = sink.f8001b;
                    if ((i9 + i8) - i10 <= 8192) {
                        byte[] bArr = sink.f8000a;
                        AbstractC1239l.j(bArr, bArr, 0, i10, i9, 2, null);
                        sink.f8002c -= sink.f8001b;
                        sink.f8001b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            byte[] bArr2 = this.f8000a;
            byte[] bArr3 = sink.f8000a;
            int i11 = sink.f8002c;
            int i12 = this.f8001b;
            AbstractC1239l.d(bArr2, bArr3, i11, i12, i12 + i8);
            sink.f8002c += i8;
            this.f8001b += i8;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }

    public U(byte[] data, int i8, int i9, boolean z8, boolean z9) {
        AbstractC3159y.i(data, "data");
        this.f8000a = data;
        this.f8001b = i8;
        this.f8002c = i9;
        this.f8003d = z8;
        this.f8004e = z9;
    }
}
