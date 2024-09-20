package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import m0.InterfaceC3391d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.z3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2294z3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ D4 f16937a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f16938b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C2270v f16939c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f16940d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ K3 f16941e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2294z3(K3 k32, boolean z8, D4 d42, boolean z9, C2270v c2270v, String str) {
        this.f16941e = k32;
        this.f16937a = d42;
        this.f16938b = z9;
        this.f16939c = c2270v;
        this.f16940d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3391d interfaceC3391d;
        C2270v c2270v;
        K3 k32 = this.f16941e;
        interfaceC3391d = k32.f16189d;
        if (interfaceC3391d == null) {
            k32.f16764a.d().r().a("Discarding data. Failed to send event to service");
            return;
        }
        AbstractC1319p.l(this.f16937a);
        K3 k33 = this.f16941e;
        if (this.f16938b) {
            c2270v = null;
        } else {
            c2270v = this.f16939c;
        }
        k33.r(interfaceC3391d, c2270v, this.f16937a);
        this.f16941e.E();
    }
}
