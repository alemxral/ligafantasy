package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import android.os.Bundle;

/* loaded from: classes3.dex */
final class n4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f16692a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f16693b = "_err";

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Bundle f16694c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ o4 f16695d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n4(o4 o4Var, String str, String str2, Bundle bundle) {
        this.f16695d = o4Var;
        this.f16692a = str;
        this.f16694c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16695d.f16707a.k((C2270v) AbstractC1319p.l(this.f16695d.f16707a.h0().y0(this.f16692a, this.f16693b, this.f16694c, "auto", this.f16695d.f16707a.a().currentTimeMillis(), false, true)), this.f16692a);
    }
}
