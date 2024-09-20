package com.google.android.gms.internal.measurement;

import R.AbstractC1319p;
import android.app.Activity;

/* loaded from: classes3.dex */
final class S0 extends M0 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Activity f15531e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ W0 f15532f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S0(W0 w02, Activity activity) {
        super(w02.f15580a, true);
        this.f15532f = w02;
        this.f15531e = activity;
    }

    @Override // com.google.android.gms.internal.measurement.M0
    final void a() {
        InterfaceC2005h0 interfaceC2005h0;
        interfaceC2005h0 = this.f15532f.f15580a.f15597i;
        ((InterfaceC2005h0) AbstractC1319p.l(interfaceC2005h0)).onActivityPaused(Z.b.m0(this.f15531e), this.f15378b);
    }
}
