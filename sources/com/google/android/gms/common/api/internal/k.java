package com.google.android.gms.common.api.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f15151a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ n f15152b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(n nVar, int i8) {
        this.f15152b = nVar;
        this.f15151a = i8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15152b.k(this.f15151a);
    }
}
