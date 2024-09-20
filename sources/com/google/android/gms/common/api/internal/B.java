package com.google.android.gms.common.api.internal;

import O.C1258b;
import R.AbstractC1319p;
import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class B implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final z f15088a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C f15089b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public B(C c8, z zVar) {
        this.f15089b = c8;
        this.f15088a = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f15089b.f15103b) {
            return;
        }
        C1258b b8 = this.f15088a.b();
        if (b8.G()) {
            C c8 = this.f15089b;
            c8.f15107a.startActivityForResult(GoogleApiActivity.a(c8.b(), (PendingIntent) AbstractC1319p.l(b8.z()), this.f15088a.a(), false), 1);
            return;
        }
        C c9 = this.f15089b;
        if (c9.f15106e.b(c9.b(), b8.s(), null) != null) {
            C c10 = this.f15089b;
            c10.f15106e.w(c10.b(), c10.f15107a, b8.s(), 2, this.f15089b);
            return;
        }
        if (b8.s() != 18) {
            this.f15089b.l(b8, this.f15088a.a());
            return;
        }
        C c11 = this.f15089b;
        Dialog r8 = c11.f15106e.r(c11.b(), c11);
        C c12 = this.f15089b;
        c12.f15106e.s(c12.b().getApplicationContext(), new A(this, r8));
    }
}
