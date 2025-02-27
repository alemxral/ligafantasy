package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.U6;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class V3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final long f16306a;

    /* renamed from: b, reason: collision with root package name */
    final long f16307b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ W3 f16308c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public V3(W3 w32, long j8, long j9) {
        this.f16308c = w32;
        this.f16306a = j8;
        this.f16307b = j9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16308c.f16327b.f16764a.f().z(new Runnable() { // from class: com.google.android.gms.measurement.internal.U3
            @Override // java.lang.Runnable
            public final void run() {
                V3 v32 = V3.this;
                W3 w32 = v32.f16308c;
                long j8 = v32.f16306a;
                long j9 = v32.f16307b;
                w32.f16327b.h();
                w32.f16327b.f16764a.d().q().a("Application going to the background");
                w32.f16327b.f16764a.F().f16149r.a(true);
                w32.f16327b.s(true);
                if (!w32.f16327b.f16764a.z().D()) {
                    w32.f16327b.f16412f.b(j9);
                    w32.f16327b.f16412f.d(false, false, j9);
                }
                U6.c();
                if (w32.f16327b.f16764a.z().B(null, AbstractC2217k1.f16539D0)) {
                    w32.f16327b.f16764a.d().u().b("Application backgrounded at: timestamp_millis", Long.valueOf(j8));
                } else {
                    w32.f16327b.f16764a.I().v("auto", "_ab", j8, new Bundle());
                }
            }
        });
    }
}
