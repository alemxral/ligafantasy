package com.google.android.gms.internal.measurement;

import R.AbstractC1319p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class J0 extends M0 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ N0 f15344e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ X0 f15345f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J0(X0 x02, N0 n02) {
        super(x02, true);
        this.f15345f = x02;
        this.f15344e = n02;
    }

    @Override // com.google.android.gms.internal.measurement.M0
    final void a() {
        InterfaceC2005h0 interfaceC2005h0;
        interfaceC2005h0 = this.f15345f.f15597i;
        ((InterfaceC2005h0) AbstractC1319p.l(interfaceC2005h0)).registerOnMeasurementEventListener(this.f15344e);
    }
}
