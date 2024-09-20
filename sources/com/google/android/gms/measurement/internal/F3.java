package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* loaded from: classes3.dex */
final class F3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ComponentName f16096a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ J3 f16097b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public F3(J3 j32, ComponentName componentName) {
        this.f16097b = j32;
        this.f16096a = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        K3.M(this.f16097b.f16172c, this.f16096a);
    }
}
