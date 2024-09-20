package com.google.firebase.analytics;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.X0;
import java.util.List;
import java.util.Map;
import m0.v;

/* loaded from: classes3.dex */
final class a implements v {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ X0 f17168a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(X0 x02) {
        this.f17168a = x02;
    }

    @Override // m0.v
    public final int a(String str) {
        return this.f17168a.m(str);
    }

    @Override // m0.v
    public final long b() {
        return this.f17168a.n();
    }

    @Override // m0.v
    public final List c(String str, String str2) {
        return this.f17168a.x(str, str2);
    }

    @Override // m0.v
    public final Map d(String str, String str2, boolean z8) {
        return this.f17168a.y(str, str2, z8);
    }

    @Override // m0.v
    public final void e(Bundle bundle) {
        this.f17168a.c(bundle);
    }

    @Override // m0.v
    public final String f() {
        return this.f17168a.t();
    }

    @Override // m0.v
    public final String g() {
        return this.f17168a.u();
    }

    @Override // m0.v
    public final void h(String str, String str2, Bundle bundle) {
        this.f17168a.G(str, str2, bundle);
    }

    @Override // m0.v
    public final void i(String str) {
        this.f17168a.C(str);
    }

    @Override // m0.v
    public final String j() {
        return this.f17168a.v();
    }

    @Override // m0.v
    public final String k() {
        return this.f17168a.w();
    }

    @Override // m0.v
    public final void l(String str, String str2, Bundle bundle) {
        this.f17168a.D(str, str2, bundle);
    }

    @Override // m0.v
    public final void m(String str) {
        this.f17168a.E(str);
    }
}
