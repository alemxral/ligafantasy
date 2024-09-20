package P6;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: P6.n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1288n extends a0 {

    /* renamed from: f, reason: collision with root package name */
    private a0 f8082f;

    public C1288n(a0 delegate) {
        AbstractC3159y.i(delegate, "delegate");
        this.f8082f = delegate;
    }

    @Override // P6.a0
    public a0 a() {
        return this.f8082f.a();
    }

    @Override // P6.a0
    public a0 b() {
        return this.f8082f.b();
    }

    @Override // P6.a0
    public long c() {
        return this.f8082f.c();
    }

    @Override // P6.a0
    public a0 d(long j8) {
        return this.f8082f.d(j8);
    }

    @Override // P6.a0
    public boolean e() {
        return this.f8082f.e();
    }

    @Override // P6.a0
    public void f() {
        this.f8082f.f();
    }

    @Override // P6.a0
    public a0 g(long j8, TimeUnit unit) {
        AbstractC3159y.i(unit, "unit");
        return this.f8082f.g(j8, unit);
    }

    public final a0 i() {
        return this.f8082f;
    }

    public final C1288n j(a0 delegate) {
        AbstractC3159y.i(delegate, "delegate");
        this.f8082f = delegate;
        return this;
    }
}
