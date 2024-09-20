package com.google.android.gms.internal.measurement;

import R.AbstractC1319p;
import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class K0 extends M0 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Long f15349e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f15350f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f15351g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ Bundle f15352h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ boolean f15353i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ boolean f15354j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ X0 f15355k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K0(X0 x02, Long l8, String str, String str2, Bundle bundle, boolean z8, boolean z9) {
        super(x02, true);
        this.f15355k = x02;
        this.f15349e = l8;
        this.f15350f = str;
        this.f15351g = str2;
        this.f15352h = bundle;
        this.f15353i = z8;
        this.f15354j = z9;
    }

    @Override // com.google.android.gms.internal.measurement.M0
    final void a() {
        long longValue;
        InterfaceC2005h0 interfaceC2005h0;
        Long l8 = this.f15349e;
        if (l8 == null) {
            longValue = this.f15377a;
        } else {
            longValue = l8.longValue();
        }
        long j8 = longValue;
        interfaceC2005h0 = this.f15355k.f15597i;
        ((InterfaceC2005h0) AbstractC1319p.l(interfaceC2005h0)).logEvent(this.f15350f, this.f15351g, this.f15352h, this.f15353i, this.f15354j, j8);
    }
}
