package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class J2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f16168a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Y2 f16169b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public J2(Y2 y22, AtomicReference atomicReference) {
        this.f16169b = y22;
        this.f16168a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f16168a) {
            try {
                try {
                    this.f16168a.set(Boolean.valueOf(this.f16169b.f16764a.z().B(this.f16169b.f16764a.B().s(), AbstractC2217k1.f16555M)));
                } finally {
                    this.f16168a.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
