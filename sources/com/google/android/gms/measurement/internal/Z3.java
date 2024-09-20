package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C1949a7;
import com.google.android.gms.internal.measurement.W5;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class Z3 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2160a4 f16396a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Z3(C2160a4 c2160a4) {
        this.f16396a = c2160a4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.f16396a.h();
        if (this.f16396a.f16764a.F().v(this.f16396a.f16764a.a().currentTimeMillis())) {
            this.f16396a.f16764a.F().f16143l.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.f16396a.f16764a.d().v().a("Detected application was in foreground");
                c(this.f16396a.f16764a.a().currentTimeMillis(), false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(long j8, boolean z8) {
        this.f16396a.h();
        this.f16396a.u();
        if (this.f16396a.f16764a.F().v(j8)) {
            this.f16396a.f16764a.F().f16143l.a(true);
            C1949a7.c();
            if (this.f16396a.f16764a.z().B(null, AbstractC2217k1.f16600p0)) {
                this.f16396a.f16764a.B().v();
            }
        }
        this.f16396a.f16764a.F().f16146o.b(j8);
        if (this.f16396a.f16764a.F().f16143l.b()) {
            c(j8, z8);
        }
    }

    final void c(long j8, boolean z8) {
        this.f16396a.h();
        if (!this.f16396a.f16764a.o()) {
            return;
        }
        this.f16396a.f16764a.F().f16146o.b(j8);
        this.f16396a.f16764a.d().v().b("Session started, time", Long.valueOf(this.f16396a.f16764a.a().elapsedRealtime()));
        long j9 = j8 / 1000;
        this.f16396a.f16764a.I().M("auto", "_sid", Long.valueOf(j9), j8);
        this.f16396a.f16764a.F().f16147p.b(j9);
        this.f16396a.f16764a.F().f16143l.a(false);
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", j9);
        if (this.f16396a.f16764a.z().B(null, AbstractC2217k1.f16576d0) && z8) {
            bundle.putLong("_aib", 1L);
        }
        this.f16396a.f16764a.I().v("auto", "_s", j8, bundle);
        W5.c();
        if (this.f16396a.f16764a.z().B(null, AbstractC2217k1.f16582g0)) {
            String a8 = this.f16396a.f16764a.F().f16152u.a();
            if (!TextUtils.isEmpty(a8)) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", a8);
                this.f16396a.f16764a.I().v("auto", "_ssr", j8, bundle2);
            }
        }
    }
}
