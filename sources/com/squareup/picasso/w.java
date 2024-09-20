package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.squareup.picasso.s;
import com.squareup.picasso.v;
import i2.InterfaceC2774b;
import i2.InterfaceC2777e;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public class w {

    /* renamed from: m, reason: collision with root package name */
    private static final AtomicInteger f23388m = new AtomicInteger();

    /* renamed from: a, reason: collision with root package name */
    private final s f23389a;

    /* renamed from: b, reason: collision with root package name */
    private final v.b f23390b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f23391c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f23392d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f23393e = true;

    /* renamed from: f, reason: collision with root package name */
    private int f23394f;

    /* renamed from: g, reason: collision with root package name */
    private int f23395g;

    /* renamed from: h, reason: collision with root package name */
    private int f23396h;

    /* renamed from: i, reason: collision with root package name */
    private int f23397i;

    /* renamed from: j, reason: collision with root package name */
    private Drawable f23398j;

    /* renamed from: k, reason: collision with root package name */
    private Drawable f23399k;

    /* renamed from: l, reason: collision with root package name */
    private Object f23400l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(s sVar, Uri uri, int i8) {
        if (!sVar.f23317n) {
            this.f23389a = sVar;
            this.f23390b = new v.b(uri, i8, sVar.f23314k);
            return;
        }
        throw new IllegalStateException("Picasso instance already shut down. Cannot submit new requests.");
    }

    private v c(long j8) {
        int andIncrement = f23388m.getAndIncrement();
        v a8 = this.f23390b.a();
        a8.f23351a = andIncrement;
        a8.f23352b = j8;
        boolean z8 = this.f23389a.f23316m;
        if (z8) {
            C.u("Main", "created", a8.g(), a8.toString());
        }
        v p8 = this.f23389a.p(a8);
        if (p8 != a8) {
            p8.f23351a = andIncrement;
            p8.f23352b = j8;
            if (z8) {
                C.u("Main", "changed", p8.d(), "into " + p8);
            }
        }
        return p8;
    }

    private Drawable h() {
        int i8 = this.f23394f;
        if (i8 != 0) {
            return this.f23389a.f23307d.getDrawable(i8);
        }
        return this.f23398j;
    }

    public w a() {
        this.f23390b.b(17);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w b() {
        this.f23400l = null;
        return this;
    }

    public void d() {
        e(null);
    }

    public void e(InterfaceC2774b interfaceC2774b) {
        long nanoTime = System.nanoTime();
        if (!this.f23392d) {
            if (this.f23390b.c()) {
                if (!this.f23390b.d()) {
                    this.f23390b.f(s.f.LOW);
                }
                v c8 = c(nanoTime);
                String h8 = C.h(c8, new StringBuilder());
                if (o.a(this.f23396h) && this.f23389a.m(h8) != null) {
                    if (this.f23389a.f23316m) {
                        C.u("Main", "completed", c8.g(), "from " + s.e.MEMORY);
                    }
                    if (interfaceC2774b != null) {
                        interfaceC2774b.b();
                        return;
                    }
                    return;
                }
                this.f23389a.o(new h(this.f23389a, c8, this.f23396h, this.f23397i, this.f23400l, h8, interfaceC2774b));
                return;
            }
            return;
        }
        throw new IllegalStateException("Fit cannot be used with fetch.");
    }

    public w f() {
        this.f23392d = true;
        return this;
    }

    public Bitmap g() {
        long nanoTime = System.nanoTime();
        C.d();
        if (!this.f23392d) {
            if (!this.f23390b.c()) {
                return null;
            }
            v c8 = c(nanoTime);
            j jVar = new j(this.f23389a, c8, this.f23396h, this.f23397i, this.f23400l, C.h(c8, new StringBuilder()));
            s sVar = this.f23389a;
            return RunnableC2405c.g(sVar, sVar.f23308e, sVar.f23309f, sVar.f23310g, jVar).t();
        }
        throw new IllegalStateException("Fit cannot be used with get.");
    }

    public void i(ImageView imageView) {
        j(imageView, null);
    }

    public void j(ImageView imageView, InterfaceC2774b interfaceC2774b) {
        Bitmap m8;
        long nanoTime = System.nanoTime();
        C.c();
        if (imageView != null) {
            if (!this.f23390b.c()) {
                this.f23389a.b(imageView);
                if (this.f23393e) {
                    t.d(imageView, h());
                    return;
                }
                return;
            }
            if (this.f23392d) {
                if (!this.f23390b.e()) {
                    int width = imageView.getWidth();
                    int height = imageView.getHeight();
                    if (width != 0 && height != 0) {
                        this.f23390b.g(width, height);
                    } else {
                        if (this.f23393e) {
                            t.d(imageView, h());
                        }
                        this.f23389a.e(imageView, new f(this, imageView, interfaceC2774b));
                        return;
                    }
                } else {
                    throw new IllegalStateException("Fit cannot be used with resize.");
                }
            }
            v c8 = c(nanoTime);
            String g8 = C.g(c8);
            if (o.a(this.f23396h) && (m8 = this.f23389a.m(g8)) != null) {
                this.f23389a.b(imageView);
                s sVar = this.f23389a;
                Context context = sVar.f23307d;
                s.e eVar = s.e.MEMORY;
                t.c(imageView, context, m8, eVar, this.f23391c, sVar.f23315l);
                if (this.f23389a.f23316m) {
                    C.u("Main", "completed", c8.g(), "from " + eVar);
                }
                if (interfaceC2774b != null) {
                    interfaceC2774b.b();
                    return;
                }
                return;
            }
            if (this.f23393e) {
                t.d(imageView, h());
            }
            this.f23389a.g(new k(this.f23389a, imageView, c8, this.f23396h, this.f23397i, this.f23395g, this.f23399k, g8, this.f23400l, interfaceC2774b, this.f23391c));
            return;
        }
        throw new IllegalArgumentException("Target must not be null.");
    }

    public void k(A a8) {
        Bitmap m8;
        long nanoTime = System.nanoTime();
        C.c();
        if (a8 != null) {
            if (!this.f23392d) {
                Drawable drawable = null;
                if (!this.f23390b.c()) {
                    this.f23389a.c(a8);
                    if (this.f23393e) {
                        drawable = h();
                    }
                    a8.b(drawable);
                    return;
                }
                v c8 = c(nanoTime);
                String g8 = C.g(c8);
                if (o.a(this.f23396h) && (m8 = this.f23389a.m(g8)) != null) {
                    this.f23389a.c(a8);
                    a8.c(m8, s.e.MEMORY);
                    return;
                } else {
                    if (this.f23393e) {
                        drawable = h();
                    }
                    a8.b(drawable);
                    this.f23389a.g(new B(this.f23389a, a8, c8, this.f23396h, this.f23397i, this.f23399k, g8, this.f23400l, this.f23395g));
                    return;
                }
            }
            throw new IllegalStateException("Fit cannot be used with a Target.");
        }
        throw new IllegalArgumentException("Target must not be null.");
    }

    public w l(int i8) {
        if (this.f23393e) {
            if (i8 != 0) {
                if (this.f23398j == null) {
                    this.f23394f = i8;
                    return this;
                }
                throw new IllegalStateException("Placeholder image already set.");
            }
            throw new IllegalArgumentException("Placeholder image resource invalid.");
        }
        throw new IllegalStateException("Already explicitly declared as no placeholder.");
    }

    public w m(int i8, int i9) {
        this.f23390b.g(i8, i9);
        return this;
    }

    public w n(InterfaceC2777e interfaceC2777e) {
        this.f23390b.h(interfaceC2777e);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w o() {
        this.f23392d = false;
        return this;
    }
}
