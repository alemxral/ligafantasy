package com.google.android.gms.internal.measurement;

import R.AbstractC1319p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class G0 extends M0 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f15318e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Object f15319f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ X0 f15320g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G0(X0 x02, boolean z8, int i8, String str, Object obj, Object obj2, Object obj3) {
        super(x02, false);
        this.f15320g = x02;
        this.f15318e = str;
        this.f15319f = obj;
    }

    @Override // com.google.android.gms.internal.measurement.M0
    final void a() {
        InterfaceC2005h0 interfaceC2005h0;
        interfaceC2005h0 = this.f15320g.f15597i;
        ((InterfaceC2005h0) AbstractC1319p.l(interfaceC2005h0)).logHealthData(5, this.f15318e, Z.b.m0(this.f15319f), Z.b.m0(null), Z.b.m0(null));
    }
}
