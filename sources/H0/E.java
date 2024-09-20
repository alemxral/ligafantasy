package H0;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f3249a = new AtomicInteger();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f3250b = new AtomicInteger();

    public void a() {
        this.f3250b.getAndIncrement();
    }

    public void b() {
        this.f3249a.getAndIncrement();
    }

    public void c() {
        this.f3250b.set(0);
    }
}
