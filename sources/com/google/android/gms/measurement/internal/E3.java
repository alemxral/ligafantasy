package com.google.android.gms.measurement.internal;

import m0.InterfaceC3391d;

/* loaded from: classes3.dex */
final class E3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC3391d f16085a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ J3 f16086b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public E3(J3 j32, InterfaceC3391d interfaceC3391d) {
        this.f16086b = j32;
        this.f16085a = interfaceC3391d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f16086b) {
            try {
                this.f16086b.f16170a = false;
                if (!this.f16086b.f16172c.z()) {
                    this.f16086b.f16172c.f16764a.d().v().a("Connected to service");
                    this.f16086b.f16172c.x(this.f16085a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
