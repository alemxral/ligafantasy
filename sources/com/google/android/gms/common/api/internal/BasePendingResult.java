package com.google.android.gms.common.api.internal;

import P.g;
import P.j;
import R.AbstractC1319p;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
/* loaded from: classes3.dex */
public abstract class BasePendingResult<R extends P.j> extends P.g {

    /* renamed from: m, reason: collision with root package name */
    static final ThreadLocal f15090m = new D();

    /* renamed from: b, reason: collision with root package name */
    protected final a f15092b;

    /* renamed from: c, reason: collision with root package name */
    protected final WeakReference f15093c;

    /* renamed from: g, reason: collision with root package name */
    private P.j f15097g;

    /* renamed from: h, reason: collision with root package name */
    private Status f15098h;

    /* renamed from: i, reason: collision with root package name */
    private volatile boolean f15099i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f15100j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f15101k;

    /* renamed from: a, reason: collision with root package name */
    private final Object f15091a = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final CountDownLatch f15094d = new CountDownLatch(1);

    /* renamed from: e, reason: collision with root package name */
    private final ArrayList f15095e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private final AtomicReference f15096f = new AtomicReference();

    /* renamed from: l, reason: collision with root package name */
    private boolean f15102l = false;

    /* loaded from: classes3.dex */
    public static class a extends e0.i {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i8 = message.what;
            if (i8 != 1) {
                if (i8 != 2) {
                    Log.wtf("BasePendingResult", "Don't know how to handle message: " + i8, new Exception());
                    return;
                }
                ((BasePendingResult) message.obj).d(Status.f15078i);
                return;
            }
            Pair pair = (Pair) message.obj;
            android.support.v4.media.a.a(pair.first);
            P.j jVar = (P.j) pair.second;
            try {
                throw null;
            } catch (RuntimeException e8) {
                BasePendingResult.j(jVar);
                throw e8;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BasePendingResult(P.f fVar) {
        Looper mainLooper;
        if (fVar != null) {
            mainLooper = fVar.c();
        } else {
            mainLooper = Looper.getMainLooper();
        }
        this.f15092b = new a(mainLooper);
        this.f15093c = new WeakReference(fVar);
    }

    private final P.j g() {
        P.j jVar;
        synchronized (this.f15091a) {
            AbstractC1319p.p(!this.f15099i, "Result has already been consumed.");
            AbstractC1319p.p(e(), "Result is not ready.");
            jVar = this.f15097g;
            this.f15097g = null;
            this.f15099i = true;
        }
        android.support.v4.media.a.a(this.f15096f.getAndSet(null));
        return (P.j) AbstractC1319p.l(jVar);
    }

    private final void h(P.j jVar) {
        this.f15097g = jVar;
        this.f15098h = jVar.getStatus();
        this.f15094d.countDown();
        ArrayList arrayList = this.f15095e;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((g.a) arrayList.get(i8)).a(this.f15098h);
        }
        this.f15095e.clear();
    }

    @Override // P.g
    public final void a(g.a aVar) {
        boolean z8;
        if (aVar != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        AbstractC1319p.b(z8, "Callback cannot be null.");
        synchronized (this.f15091a) {
            try {
                if (e()) {
                    aVar.a(this.f15098h);
                } else {
                    this.f15095e.add(aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // P.g
    public final P.j b(long j8, TimeUnit timeUnit) {
        if (j8 > 0) {
            AbstractC1319p.k("await must not be called on the UI thread when time is greater than zero.");
        }
        AbstractC1319p.p(!this.f15099i, "Result has already been consumed.");
        AbstractC1319p.p(true, "Cannot await if then() has been called.");
        try {
            if (!this.f15094d.await(j8, timeUnit)) {
                d(Status.f15078i);
            }
        } catch (InterruptedException unused) {
            d(Status.f15076g);
        }
        AbstractC1319p.p(e(), "Result is not ready.");
        return g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract P.j c(Status status);

    public final void d(Status status) {
        synchronized (this.f15091a) {
            try {
                if (!e()) {
                    f(c(status));
                    this.f15101k = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean e() {
        if (this.f15094d.getCount() == 0) {
            return true;
        }
        return false;
    }

    public final void f(P.j jVar) {
        synchronized (this.f15091a) {
            try {
                if (!this.f15101k && !this.f15100j) {
                    e();
                    AbstractC1319p.p(!e(), "Results have already been set");
                    AbstractC1319p.p(!this.f15099i, "Result has already been consumed");
                    h(jVar);
                    return;
                }
                j(jVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i() {
        boolean z8 = true;
        if (!this.f15102l && !((Boolean) f15090m.get()).booleanValue()) {
            z8 = false;
        }
        this.f15102l = z8;
    }

    public static void j(P.j jVar) {
    }
}
