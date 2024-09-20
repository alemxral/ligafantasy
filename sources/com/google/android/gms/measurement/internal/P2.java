package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class P2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f16238a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Y2 f16239b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public P2(Y2 y22, AtomicReference atomicReference) {
        this.f16239b = y22;
        this.f16238a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f16238a) {
            try {
                try {
                    this.f16238a.set(Long.valueOf(this.f16239b.f16764a.z().r(this.f16239b.f16764a.B().s(), AbstractC2217k1.f16557O)));
                } finally {
                    this.f16238a.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
