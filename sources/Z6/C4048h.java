package z6;

import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: z6.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C4048h {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4061v f40542a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f40543b;

    public C4048h(InterfaceC4061v writer) {
        AbstractC3159y.i(writer, "writer");
        this.f40542a = writer;
        this.f40543b = true;
    }

    public final boolean a() {
        return this.f40543b;
    }

    public void b() {
        this.f40543b = true;
    }

    public void c() {
        this.f40543b = false;
    }

    public void d(byte b8) {
        this.f40542a.writeLong(b8);
    }

    public final void e(char c8) {
        this.f40542a.a(c8);
    }

    public void f(double d8) {
        this.f40542a.c(String.valueOf(d8));
    }

    public void g(float f8) {
        this.f40542a.c(String.valueOf(f8));
    }

    public void h(int i8) {
        this.f40542a.writeLong(i8);
    }

    public void i(long j8) {
        this.f40542a.writeLong(j8);
    }

    public final void j(String v8) {
        AbstractC3159y.i(v8, "v");
        this.f40542a.c(v8);
    }

    public void k(short s8) {
        this.f40542a.writeLong(s8);
    }

    public void l(boolean z8) {
        this.f40542a.c(String.valueOf(z8));
    }

    public void m(String value) {
        AbstractC3159y.i(value, "value");
        this.f40542a.b(value);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void n(boolean z8) {
        this.f40543b = z8;
    }

    public void o() {
    }

    public void p() {
    }
}
