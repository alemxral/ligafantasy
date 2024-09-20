package com.google.android.gms.internal.measurement;

import R.AbstractC1319p;
import android.app.Activity;

/* loaded from: classes3.dex */
final class Q0 extends M0 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Activity f15517e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ W0 f15518f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q0(W0 w02, Activity activity) {
        super(w02.f15580a, true);
        this.f15518f = w02;
        this.f15517e = activity;
    }

    @Override // com.google.android.gms.internal.measurement.M0
    final void a() {
        InterfaceC2005h0 interfaceC2005h0;
        interfaceC2005h0 = this.f15518f.f15580a.f15597i;
        ((InterfaceC2005h0) AbstractC1319p.l(interfaceC2005h0)).onActivityResumed(Z.b.m0(this.f15517e), this.f15378b);
    }
}
