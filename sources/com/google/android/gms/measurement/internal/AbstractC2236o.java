package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import android.os.Handler;
import com.google.android.gms.internal.measurement.HandlerC1960c0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2236o {

    /* renamed from: d, reason: collision with root package name */
    private static volatile Handler f16696d;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2263t2 f16697a;

    /* renamed from: b, reason: collision with root package name */
    private final Runnable f16698b;

    /* renamed from: c, reason: collision with root package name */
    private volatile long f16699c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2236o(InterfaceC2263t2 interfaceC2263t2) {
        AbstractC1319p.l(interfaceC2263t2);
        this.f16697a = interfaceC2263t2;
        this.f16698b = new RunnableC2231n(this, interfaceC2263t2);
    }

    private final Handler f() {
        Handler handler;
        if (f16696d != null) {
            return f16696d;
        }
        synchronized (AbstractC2236o.class) {
            try {
                if (f16696d == null) {
                    f16696d = new HandlerC1960c0(this.f16697a.c().getMainLooper());
                }
                handler = f16696d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.f16699c = 0L;
        f().removeCallbacks(this.f16698b);
    }

    public abstract void c();

    public final void d(long j8) {
        b();
        if (j8 >= 0) {
            this.f16699c = this.f16697a.a().currentTimeMillis();
            if (!f().postDelayed(this.f16698b, j8)) {
                this.f16697a.d().r().b("Failed to schedule delayed post. time", Long.valueOf(j8));
            }
        }
    }

    public final boolean e() {
        return this.f16699c != 0;
    }
}
