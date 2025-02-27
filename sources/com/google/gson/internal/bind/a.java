package com.google.gson.internal.bind;

import com.google.gson.d;
import com.google.gson.f;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.k;
import j$.util.Objects;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import p1.c;

/* loaded from: classes3.dex */
public final class a extends c {

    /* renamed from: p, reason: collision with root package name */
    private static final Writer f17705p = new C0384a();

    /* renamed from: q, reason: collision with root package name */
    private static final k f17706q = new k("closed");

    /* renamed from: m, reason: collision with root package name */
    private final List f17707m;

    /* renamed from: n, reason: collision with root package name */
    private String f17708n;

    /* renamed from: o, reason: collision with root package name */
    private f f17709o;

    /* renamed from: com.google.gson.internal.bind.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class C0384a extends Writer {
        C0384a() {
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i8, int i9) {
            throw new AssertionError();
        }
    }

    public a() {
        super(f17705p);
        this.f17707m = new ArrayList();
        this.f17709o = h.f17547a;
    }

    private f U() {
        return (f) this.f17707m.get(r0.size() - 1);
    }

    private void V(f fVar) {
        if (this.f17708n != null) {
            if (!fVar.i() || m()) {
                ((i) U()).p(this.f17708n, fVar);
            }
            this.f17708n = null;
            return;
        }
        if (this.f17707m.isEmpty()) {
            this.f17709o = fVar;
            return;
        }
        f U7 = U();
        if (U7 instanceof d) {
            ((d) U7).p(fVar);
            return;
        }
        throw new IllegalStateException();
    }

    @Override // p1.c
    public c M(double d8) {
        if (!r() && (Double.isNaN(d8) || Double.isInfinite(d8))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d8);
        }
        V(new k(Double.valueOf(d8)));
        return this;
    }

    @Override // p1.c
    public c N(long j8) {
        V(new k(Long.valueOf(j8)));
        return this;
    }

    @Override // p1.c
    public c O(Boolean bool) {
        if (bool == null) {
            return x();
        }
        V(new k(bool));
        return this;
    }

    @Override // p1.c
    public c P(Number number) {
        if (number == null) {
            return x();
        }
        if (!r()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        V(new k(number));
        return this;
    }

    @Override // p1.c
    public c Q(String str) {
        if (str == null) {
            return x();
        }
        V(new k(str));
        return this;
    }

    @Override // p1.c
    public c R(boolean z8) {
        V(new k(Boolean.valueOf(z8)));
        return this;
    }

    public f T() {
        if (this.f17707m.isEmpty()) {
            return this.f17709o;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f17707m);
    }

    @Override // p1.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f17707m.isEmpty()) {
            this.f17707m.add(f17706q);
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override // p1.c
    public c e() {
        d dVar = new d();
        V(dVar);
        this.f17707m.add(dVar);
        return this;
    }

    @Override // p1.c
    public c f() {
        i iVar = new i();
        V(iVar);
        this.f17707m.add(iVar);
        return this;
    }

    @Override // p1.c, java.io.Flushable
    public void flush() {
    }

    @Override // p1.c
    public c h() {
        if (!this.f17707m.isEmpty() && this.f17708n == null) {
            if (U() instanceof d) {
                this.f17707m.remove(r0.size() - 1);
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // p1.c
    public c l() {
        if (!this.f17707m.isEmpty() && this.f17708n == null) {
            if (U() instanceof i) {
                this.f17707m.remove(r0.size() - 1);
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // p1.c
    public c u(String str) {
        Objects.requireNonNull(str, "name == null");
        if (!this.f17707m.isEmpty() && this.f17708n == null) {
            if (U() instanceof i) {
                this.f17708n = str;
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // p1.c
    public c x() {
        V(h.f17547a);
        return this;
    }
}
