package com.google.android.gms.internal.measurement;

import R.AbstractC1319p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class F0 extends M0 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f15308e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f15309f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ boolean f15310g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ BinderC1969d0 f15311h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ X0 f15312i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F0(X0 x02, String str, String str2, boolean z8, BinderC1969d0 binderC1969d0) {
        super(x02, true);
        this.f15312i = x02;
        this.f15308e = str;
        this.f15309f = str2;
        this.f15310g = z8;
        this.f15311h = binderC1969d0;
    }

    @Override // com.google.android.gms.internal.measurement.M0
    final void a() {
        InterfaceC2005h0 interfaceC2005h0;
        interfaceC2005h0 = this.f15312i.f15597i;
        ((InterfaceC2005h0) AbstractC1319p.l(interfaceC2005h0)).getUserProperties(this.f15308e, this.f15309f, this.f15310g, this.f15311h);
    }

    @Override // com.google.android.gms.internal.measurement.M0
    protected final void b() {
        this.f15311h.G(null);
    }
}
