package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import java.lang.Thread;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class T1 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    private final String f16276a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ W1 f16277b;

    public T1(W1 w12, String str) {
        this.f16277b = w12;
        AbstractC1319p.l(str);
        this.f16276a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f16277b.f16764a.d().r().b(this.f16276a, th);
    }
}
