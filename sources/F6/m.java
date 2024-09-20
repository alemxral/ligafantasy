package F6;

import F6.w;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class m {

    /* renamed from: c, reason: collision with root package name */
    private Runnable f2908c;

    /* renamed from: d, reason: collision with root package name */
    private ExecutorService f2909d;

    /* renamed from: a, reason: collision with root package name */
    private int f2906a = 64;

    /* renamed from: b, reason: collision with root package name */
    private int f2907b = 5;

    /* renamed from: e, reason: collision with root package name */
    private final Deque f2910e = new ArrayDeque();

    /* renamed from: f, reason: collision with root package name */
    private final Deque f2911f = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    private final Deque f2912g = new ArrayDeque();

    private void d(Deque deque, Object obj, boolean z8) {
        int f8;
        Runnable runnable;
        synchronized (this) {
            try {
                if (deque.remove(obj)) {
                    if (z8) {
                        e();
                    }
                    f8 = f();
                    runnable = this.f2908c;
                } else {
                    throw new AssertionError("Call wasn't in-flight!");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (f8 == 0 && runnable != null) {
            runnable.run();
        }
    }

    private void e() {
        if (this.f2911f.size() >= this.f2906a || this.f2910e.isEmpty()) {
            return;
        }
        Iterator it = this.f2910e.iterator();
        while (it.hasNext()) {
            android.support.v4.media.a.a(it.next());
            if (g(null) < this.f2907b) {
                it.remove();
                this.f2911f.add(null);
                b().execute(null);
            }
            if (this.f2911f.size() >= this.f2906a) {
                return;
            }
        }
    }

    private int g(w.a aVar) {
        Iterator it = this.f2911f.iterator();
        if (!it.hasNext()) {
            return 0;
        }
        android.support.v4.media.a.a(it.next());
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a(w wVar) {
        this.f2912g.add(wVar);
    }

    public synchronized ExecutorService b() {
        try {
            if (this.f2909d == null) {
                this.f2909d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), G6.c.B("OkHttp Dispatcher", false));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f2909d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(w wVar) {
        d(this.f2912g, wVar, false);
    }

    public synchronized int f() {
        return this.f2911f.size() + this.f2912g.size();
    }
}
