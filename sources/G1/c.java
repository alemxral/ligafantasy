package G1;

import G1.b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class c implements b.a {

    /* renamed from: a, reason: collision with root package name */
    private final BlockingQueue f3079a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f3080b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque f3081c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    private b f3082d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f3079a = linkedBlockingQueue;
        this.f3080b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void b() {
        b bVar = (b) this.f3081c.poll();
        this.f3082d = bVar;
        if (bVar != null) {
            bVar.c(this.f3080b);
        }
    }

    @Override // G1.b.a
    public void a(b bVar) {
        this.f3082d = null;
        b();
    }

    public void c(b bVar) {
        bVar.a(this);
        this.f3081c.add(bVar);
        if (this.f3082d == null) {
            b();
        }
    }
}
