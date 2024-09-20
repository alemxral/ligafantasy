package com.google.android.gms.internal.measurement;

import R.AbstractC1319p;
import android.app.Activity;

/* loaded from: classes3.dex */
final class U0 extends M0 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Activity f15567e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ BinderC1969d0 f15568f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ W0 f15569g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U0(W0 w02, Activity activity, BinderC1969d0 binderC1969d0) {
        super(w02.f15580a, true);
        this.f15569g = w02;
        this.f15567e = activity;
        this.f15568f = binderC1969d0;
    }

    @Override // com.google.android.gms.internal.measurement.M0
    final void a() {
        InterfaceC2005h0 interfaceC2005h0;
        interfaceC2005h0 = this.f15569g.f15580a.f15597i;
        ((InterfaceC2005h0) AbstractC1319p.l(interfaceC2005h0)).onActivitySaveInstanceState(Z.b.m0(this.f15567e), this.f15568f, this.f15378b);
    }
}
