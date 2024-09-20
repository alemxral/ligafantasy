package com.google.android.gms.internal.measurement;

import R.AbstractC1319p;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.x0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2132x0 extends M0 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f15938e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ X0 f15939f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2132x0(X0 x02, String str) {
        super(x02, true);
        this.f15939f = x02;
        this.f15938e = str;
    }

    @Override // com.google.android.gms.internal.measurement.M0
    final void a() {
        InterfaceC2005h0 interfaceC2005h0;
        interfaceC2005h0 = this.f15939f.f15597i;
        ((InterfaceC2005h0) AbstractC1319p.l(interfaceC2005h0)).beginAdUnitExposure(this.f15938e, this.f15378b);
    }
}
