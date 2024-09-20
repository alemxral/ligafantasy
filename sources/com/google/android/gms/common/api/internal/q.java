package com.google.android.gms.common.api.internal;

import O.C1258b;
import P.a;
import Q.C1301b;
import R.AbstractC1306c;
import R.InterfaceC1313j;
import android.os.Handler;
import android.util.Log;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class q implements AbstractC1306c.InterfaceC0181c, Q.x {

    /* renamed from: a, reason: collision with root package name */
    private final a.f f15172a;

    /* renamed from: b, reason: collision with root package name */
    private final C1301b f15173b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC1313j f15174c = null;

    /* renamed from: d, reason: collision with root package name */
    private Set f15175d = null;

    /* renamed from: e, reason: collision with root package name */
    private boolean f15176e = false;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C1939c f15177f;

    public q(C1939c c1939c, a.f fVar, C1301b c1301b) {
        this.f15177f = c1939c;
        this.f15172a = fVar;
        this.f15173b = c1301b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        InterfaceC1313j interfaceC1313j;
        if (this.f15176e && (interfaceC1313j = this.f15174c) != null) {
            this.f15172a.p(interfaceC1313j, this.f15175d);
        }
    }

    @Override // Q.x
    public final void a(C1258b c1258b) {
        Map map;
        map = this.f15177f.f15128j;
        n nVar = (n) map.get(this.f15173b);
        if (nVar != null) {
            nVar.I(c1258b);
        }
    }

    @Override // R.AbstractC1306c.InterfaceC0181c
    public final void b(C1258b c1258b) {
        Handler handler;
        handler = this.f15177f.f15132n;
        handler.post(new p(this, c1258b));
    }

    @Override // Q.x
    public final void c(InterfaceC1313j interfaceC1313j, Set set) {
        if (interfaceC1313j != null && set != null) {
            this.f15174c = interfaceC1313j;
            this.f15175d = set;
            i();
        } else {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            a(new C1258b(4));
        }
    }

    @Override // Q.x
    public final void d(int i8) {
        Map map;
        boolean z8;
        map = this.f15177f.f15128j;
        n nVar = (n) map.get(this.f15173b);
        if (nVar != null) {
            z8 = nVar.f15163q;
            if (z8) {
                nVar.I(new C1258b(17));
            } else {
                nVar.i(i8);
            }
        }
    }
}
