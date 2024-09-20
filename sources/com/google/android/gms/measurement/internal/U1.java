package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class U1 extends FutureTask implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    private final long f16288a;

    /* renamed from: b, reason: collision with root package name */
    final boolean f16289b;

    /* renamed from: c, reason: collision with root package name */
    private final String f16290c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ W1 f16291d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U1(W1 w12, Runnable runnable, boolean z8, String str) {
        super(runnable, null);
        AtomicLong atomicLong;
        this.f16291d = w12;
        AbstractC1319p.l(str);
        atomicLong = W1.f16311l;
        long andIncrement = atomicLong.getAndIncrement();
        this.f16288a = andIncrement;
        this.f16290c = str;
        this.f16289b = z8;
        if (andIncrement == Long.MAX_VALUE) {
            w12.f16764a.d().r().a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        U1 u12 = (U1) obj;
        boolean z8 = this.f16289b;
        if (z8 != u12.f16289b) {
            if (z8) {
                return -1;
            }
        } else {
            long j8 = this.f16288a;
            long j9 = u12.f16288a;
            if (j8 < j9) {
                return -1;
            }
            if (j8 <= j9) {
                this.f16291d.f16764a.d().t().b("Two tasks share the same index. index", Long.valueOf(this.f16288a));
                return 0;
            }
        }
        return 1;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th) {
        this.f16291d.f16764a.d().r().b(this.f16290c, th);
        super.setException(th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U1(W1 w12, Callable callable, boolean z8, String str) {
        super(callable);
        AtomicLong atomicLong;
        this.f16291d = w12;
        AbstractC1319p.l("Task exception on worker thread");
        atomicLong = W1.f16311l;
        long andIncrement = atomicLong.getAndIncrement();
        this.f16288a = andIncrement;
        this.f16290c = "Task exception on worker thread";
        this.f16289b = z8;
        if (andIncrement == Long.MAX_VALUE) {
            w12.f16764a.d().r().a("Tasks index overflow");
        }
    }
}
