package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class V2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f16304a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Y2 f16305b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public V2(Y2 y22, boolean z8) {
        this.f16305b = y22;
        this.f16304a = z8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean o8 = this.f16305b.f16764a.o();
        boolean n8 = this.f16305b.f16764a.n();
        this.f16305b.f16764a.k(this.f16304a);
        if (n8 == this.f16304a) {
            this.f16305b.f16764a.d().v().b("Default data collection state already set to", Boolean.valueOf(this.f16304a));
        }
        if (this.f16305b.f16764a.o() == o8 || this.f16305b.f16764a.o() != this.f16305b.f16764a.n()) {
            this.f16305b.f16764a.d().x().c("Default data collection is different than actual status", Boolean.valueOf(this.f16304a), Boolean.valueOf(o8));
        }
        this.f16305b.P();
    }
}
