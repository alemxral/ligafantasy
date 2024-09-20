package com.google.android.gms.common.api.internal;

import android.app.Dialog;

/* loaded from: classes3.dex */
final class A extends Q.r {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Dialog f15086a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ B f15087b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public A(B b8, Dialog dialog) {
        this.f15087b = b8;
        this.f15086a = dialog;
    }

    @Override // Q.r
    public final void a() {
        this.f15087b.f15089b.o();
        if (this.f15086a.isShowing()) {
            this.f15086a.dismiss();
        }
    }
}
