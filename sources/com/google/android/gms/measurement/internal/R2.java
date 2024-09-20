package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class R2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f16254a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Y2 f16255b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public R2(Y2 y22, AtomicReference atomicReference) {
        this.f16255b = y22;
        this.f16254a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f16254a) {
            try {
                try {
                    this.f16254a.set(Double.valueOf(this.f16255b.f16764a.z().k(this.f16255b.f16764a.B().s(), AbstractC2217k1.f16559Q)));
                } finally {
                    this.f16254a.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
