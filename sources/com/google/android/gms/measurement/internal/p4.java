package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class p4 {

    /* renamed from: a, reason: collision with root package name */
    com.google.android.gms.internal.measurement.X1 f16726a;

    /* renamed from: b, reason: collision with root package name */
    List f16727b;

    /* renamed from: c, reason: collision with root package name */
    List f16728c;

    /* renamed from: d, reason: collision with root package name */
    long f16729d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ r4 f16730e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ p4(r4 r4Var, m0.z zVar) {
        this.f16730e = r4Var;
    }

    private static final long b(com.google.android.gms.internal.measurement.M1 m12) {
        return ((m12.E() / 1000) / 60) / 60;
    }

    public final boolean a(long j8, com.google.android.gms.internal.measurement.M1 m12) {
        AbstractC1319p.l(m12);
        if (this.f16728c == null) {
            this.f16728c = new ArrayList();
        }
        if (this.f16727b == null) {
            this.f16727b = new ArrayList();
        }
        if (!this.f16728c.isEmpty() && b((com.google.android.gms.internal.measurement.M1) this.f16728c.get(0)) != b(m12)) {
            return false;
        }
        long a8 = this.f16729d + m12.a();
        this.f16730e.U();
        if (a8 >= Math.max(0, ((Integer) AbstractC2217k1.f16589k.a(null)).intValue())) {
            return false;
        }
        this.f16729d = a8;
        this.f16728c.add(m12);
        this.f16727b.add(Long.valueOf(j8));
        int size = this.f16728c.size();
        this.f16730e.U();
        if (size >= Math.max(1, ((Integer) AbstractC2217k1.f16591l.a(null)).intValue())) {
            return false;
        }
        return true;
    }
}
