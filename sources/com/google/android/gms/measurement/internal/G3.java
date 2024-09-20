package com.google.android.gms.measurement.internal;

import m0.InterfaceC3391d;

/* loaded from: classes3.dex */
final class G3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC3391d f16108a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ J3 f16109b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public G3(J3 j32, InterfaceC3391d interfaceC3391d) {
        this.f16109b = j32;
        this.f16108a = interfaceC3391d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f16109b) {
            try {
                this.f16109b.f16170a = false;
                if (!this.f16109b.f16172c.z()) {
                    this.f16109b.f16172c.f16764a.d().q().a("Connected to remote service");
                    this.f16109b.f16172c.x(this.f16108a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
