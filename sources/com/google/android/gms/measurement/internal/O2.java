package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class O2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f16230a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Y2 f16231b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public O2(Y2 y22, AtomicReference atomicReference) {
        this.f16231b = y22;
        this.f16230a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f16230a) {
            try {
                try {
                    this.f16230a.set(this.f16231b.f16764a.z().x(this.f16231b.f16764a.B().s(), AbstractC2217k1.f16556N));
                } finally {
                    this.f16230a.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
