package com.google.android.gms.measurement;

import R.AbstractC1319p;
import android.os.Bundle;
import com.google.android.gms.measurement.internal.Y1;
import com.google.android.gms.measurement.internal.Y2;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class a extends d {

    /* renamed from: a, reason: collision with root package name */
    private final Y1 f15980a;

    /* renamed from: b, reason: collision with root package name */
    private final Y2 f15981b;

    public a(Y1 y12) {
        super(null);
        AbstractC1319p.l(y12);
        this.f15980a = y12;
        this.f15981b = y12.I();
    }

    @Override // m0.v
    public final int a(String str) {
        this.f15981b.Q(str);
        return 25;
    }

    @Override // m0.v
    public final long b() {
        return this.f15980a.N().t0();
    }

    @Override // m0.v
    public final List c(String str, String str2) {
        return this.f15981b.Z(str, str2);
    }

    @Override // m0.v
    public final Map d(String str, String str2, boolean z8) {
        return this.f15981b.a0(str, str2, z8);
    }

    @Override // m0.v
    public final void e(Bundle bundle) {
        this.f15981b.D(bundle);
    }

    @Override // m0.v
    public final String f() {
        return this.f15981b.V();
    }

    @Override // m0.v
    public final String g() {
        return this.f15981b.W();
    }

    @Override // m0.v
    public final void h(String str, String str2, Bundle bundle) {
        this.f15981b.r(str, str2, bundle);
    }

    @Override // m0.v
    public final void i(String str) {
        this.f15980a.y().l(str, this.f15980a.a().elapsedRealtime());
    }

    @Override // m0.v
    public final String j() {
        return this.f15981b.X();
    }

    @Override // m0.v
    public final String k() {
        return this.f15981b.V();
    }

    @Override // m0.v
    public final void l(String str, String str2, Bundle bundle) {
        this.f15980a.I().o(str, str2, bundle);
    }

    @Override // m0.v
    public final void m(String str) {
        this.f15980a.y().m(str, this.f15980a.a().elapsedRealtime());
    }
}
