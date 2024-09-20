package com.google.android.gms.common.api.internal;

import O.C1258b;
import P.a;
import Q.C1301b;
import android.util.Log;
import java.util.Map;

/* loaded from: classes3.dex */
final class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1258b f15170a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ q f15171b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(q qVar, C1258b c1258b) {
        this.f15171b = qVar;
        this.f15170a = c1258b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        C1301b c1301b;
        a.f fVar;
        a.f fVar2;
        a.f fVar3;
        a.f fVar4;
        q qVar = this.f15171b;
        map = qVar.f15177f.f15128j;
        c1301b = qVar.f15173b;
        n nVar = (n) map.get(c1301b);
        if (nVar == null) {
            return;
        }
        if (this.f15170a.I()) {
            this.f15171b.f15176e = true;
            fVar = this.f15171b.f15172a;
            if (fVar.n()) {
                this.f15171b.i();
                return;
            }
            try {
                q qVar2 = this.f15171b;
                fVar3 = qVar2.f15172a;
                fVar4 = qVar2.f15172a;
                fVar3.p(null, fVar4.c());
                return;
            } catch (SecurityException e8) {
                Log.e("GoogleApiManager", "Failed to get service from broker. ", e8);
                fVar2 = this.f15171b.f15172a;
                fVar2.d("Failed to get service from broker.");
                nVar.H(new C1258b(10), null);
                return;
            }
        }
        nVar.H(this.f15170a, null);
    }
}
