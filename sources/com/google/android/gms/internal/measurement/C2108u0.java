package com.google.android.gms.internal.measurement;

import R.AbstractC1319p;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.u0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2108u0 extends M0 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f15896e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f15897f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ BinderC1969d0 f15898g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ X0 f15899h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2108u0(X0 x02, String str, String str2, BinderC1969d0 binderC1969d0) {
        super(x02, true);
        this.f15899h = x02;
        this.f15896e = str;
        this.f15897f = str2;
        this.f15898g = binderC1969d0;
    }

    @Override // com.google.android.gms.internal.measurement.M0
    final void a() {
        InterfaceC2005h0 interfaceC2005h0;
        interfaceC2005h0 = this.f15899h.f15597i;
        ((InterfaceC2005h0) AbstractC1319p.l(interfaceC2005h0)).getConditionalUserProperties(this.f15896e, this.f15897f, this.f15898g);
    }

    @Override // com.google.android.gms.internal.measurement.M0
    protected final void b() {
        this.f15898g.G(null);
    }
}
