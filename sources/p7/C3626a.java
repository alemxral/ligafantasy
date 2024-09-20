package p7;

import q7.AbstractC3664a;

/* renamed from: p7.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3626a {

    /* renamed from: a, reason: collision with root package name */
    private int f37117a;

    /* renamed from: b, reason: collision with root package name */
    private int f37118b;

    /* renamed from: c, reason: collision with root package name */
    private int f37119c;

    /* renamed from: d, reason: collision with root package name */
    private short[][][] f37120d;

    /* renamed from: e, reason: collision with root package name */
    private short[][][] f37121e;

    /* renamed from: f, reason: collision with root package name */
    private short[][] f37122f;

    /* renamed from: g, reason: collision with root package name */
    private short[] f37123g;

    public C3626a(byte b8, byte b9, short[][][] sArr, short[][][] sArr2, short[][] sArr3, short[] sArr4) {
        int i8 = b8 & 255;
        this.f37117a = i8;
        int i9 = b9 & 255;
        this.f37118b = i9;
        this.f37119c = i9 - i8;
        this.f37120d = sArr;
        this.f37121e = sArr2;
        this.f37122f = sArr3;
        this.f37123g = sArr4;
    }

    public short[][][] a() {
        return this.f37120d;
    }

    public short[][][] b() {
        return this.f37121e;
    }

    public short[] c() {
        return this.f37123g;
    }

    public short[][] d() {
        return this.f37122f;
    }

    public int e() {
        return this.f37119c;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C3626a)) {
            return false;
        }
        C3626a c3626a = (C3626a) obj;
        if (this.f37117a != c3626a.f() || this.f37118b != c3626a.g() || this.f37119c != c3626a.e() || !AbstractC3664a.k(this.f37120d, c3626a.a()) || !AbstractC3664a.k(this.f37121e, c3626a.b()) || !AbstractC3664a.j(this.f37122f, c3626a.d()) || !AbstractC3664a.i(this.f37123g, c3626a.c())) {
            return false;
        }
        return true;
    }

    public int f() {
        return this.f37117a;
    }

    public int g() {
        return this.f37118b;
    }

    public int hashCode() {
        return (((((((((((this.f37117a * 37) + this.f37118b) * 37) + this.f37119c) * 37) + E7.a.q(this.f37120d)) * 37) + E7.a.q(this.f37121e)) * 37) + E7.a.p(this.f37122f)) * 37) + E7.a.o(this.f37123g);
    }
}
