package com.mbridge.msdk.dycreator.bus;

import android.util.Log;

/* loaded from: classes4.dex */
final class BackgroundPoster implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final PendingPostQueue f18621a = new PendingPostQueue();

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f18622b;

    /* renamed from: c, reason: collision with root package name */
    private final EventBus f18623c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BackgroundPoster(EventBus eventBus) {
        this.f18623c = eventBus;
    }

    public final void enqueue(Subscription subscription, Object obj) {
        PendingPost a8 = PendingPost.a(subscription, obj);
        synchronized (this) {
            try {
                this.f18621a.a(a8);
                if (!this.f18622b) {
                    this.f18622b = true;
                    EventBus.f18624a.execute(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                try {
                    PendingPost a8 = this.f18621a.a(1000);
                    if (a8 == null) {
                        synchronized (this) {
                            a8 = this.f18621a.a();
                            if (a8 == null) {
                                this.f18622b = false;
                                this.f18622b = false;
                                return;
                            }
                        }
                    }
                    this.f18623c.a(a8);
                } catch (InterruptedException e8) {
                    Log.w("Event", Thread.currentThread().getName() + " was interruppted", e8);
                    this.f18622b = false;
                    return;
                }
            } catch (Throwable th) {
                this.f18622b = false;
                throw th;
            }
        }
    }
}
