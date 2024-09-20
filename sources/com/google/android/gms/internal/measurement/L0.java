package com.google.android.gms.internal.measurement;

import R.AbstractC1319p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class L0 extends M0 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f15369e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f15370f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Object f15371g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ boolean f15372h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ X0 f15373i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L0(X0 x02, String str, String str2, Object obj, boolean z8) {
        super(x02, true);
        this.f15373i = x02;
        this.f15369e = str;
        this.f15370f = str2;
        this.f15371g = obj;
        this.f15372h = z8;
    }

    @Override // com.google.android.gms.internal.measurement.M0
    final void a() {
        InterfaceC2005h0 interfaceC2005h0;
        interfaceC2005h0 = this.f15373i.f15597i;
        ((InterfaceC2005h0) AbstractC1319p.l(interfaceC2005h0)).setUserProperty(this.f15369e, this.f15370f, Z.b.m0(this.f15371g), this.f15372h, this.f15377a);
    }
}
