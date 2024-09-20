package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C2051m6;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class Y3 {

    /* renamed from: a, reason: collision with root package name */
    protected long f16382a;

    /* renamed from: b, reason: collision with root package name */
    protected long f16383b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC2236o f16384c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C2160a4 f16385d;

    public Y3(C2160a4 c2160a4) {
        this.f16385d = c2160a4;
        this.f16384c = new X3(this, c2160a4.f16764a);
        long elapsedRealtime = c2160a4.f16764a.a().elapsedRealtime();
        this.f16382a = elapsedRealtime;
        this.f16383b = elapsedRealtime;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.f16384c.b();
        this.f16382a = 0L;
        this.f16383b = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(long j8) {
        this.f16384c.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(long j8) {
        this.f16385d.h();
        this.f16384c.b();
        this.f16382a = j8;
        this.f16383b = j8;
    }

    public final boolean d(boolean z8, boolean z9, long j8) {
        this.f16385d.h();
        this.f16385d.i();
        C2051m6.c();
        if (this.f16385d.f16764a.z().B(null, AbstractC2217k1.f16584h0)) {
            if (this.f16385d.f16764a.o()) {
                this.f16385d.f16764a.F().f16146o.b(this.f16385d.f16764a.a().currentTimeMillis());
            }
        } else {
            this.f16385d.f16764a.F().f16146o.b(this.f16385d.f16764a.a().currentTimeMillis());
        }
        long j9 = j8 - this.f16382a;
        if (!z8 && j9 < 1000) {
            this.f16385d.f16764a.d().v().b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j9));
            return false;
        }
        if (!z9) {
            j9 = j8 - this.f16383b;
            this.f16383b = j8;
        }
        this.f16385d.f16764a.d().v().b("Recording user engagement, ms", Long.valueOf(j9));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j9);
        y4.y(this.f16385d.f16764a.K().s(!this.f16385d.f16764a.z().D()), bundle, true);
        if (!z9) {
            this.f16385d.f16764a.I().u("auto", "_e", bundle);
        }
        this.f16382a = j8;
        this.f16384c.b();
        this.f16384c.d(3600000L);
        return true;
    }
}
