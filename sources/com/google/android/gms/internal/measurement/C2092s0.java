package com.google.android.gms.internal.measurement;

import R.AbstractC1319p;
import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.s0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2092s0 extends M0 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Bundle f15870e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ X0 f15871f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2092s0(X0 x02, Bundle bundle) {
        super(x02, true);
        this.f15871f = x02;
        this.f15870e = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.M0
    final void a() {
        InterfaceC2005h0 interfaceC2005h0;
        interfaceC2005h0 = this.f15871f.f15597i;
        ((InterfaceC2005h0) AbstractC1319p.l(interfaceC2005h0)).setConditionalUserProperty(this.f15870e, this.f15377a);
    }
}
