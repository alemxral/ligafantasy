package com.mbridge.msdk.foundation.same.f;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static ThreadPoolExecutor f19552a;

    /* renamed from: b, reason: collision with root package name */
    private static ThreadPoolExecutor f19553b;

    /* renamed from: c, reason: collision with root package name */
    private static ThreadPoolExecutor f19554c;

    /* renamed from: d, reason: collision with root package name */
    private static ThreadPoolExecutor f19555d;

    /* renamed from: e, reason: collision with root package name */
    private static Handler f19556e;

    /* renamed from: f, reason: collision with root package name */
    private static ThreadPoolExecutor f19557f;

    /* renamed from: g, reason: collision with root package name */
    private static ThreadPoolExecutor f19558g;

    /* renamed from: h, reason: collision with root package name */
    private static ThreadPoolExecutor f19559h;

    /* loaded from: classes4.dex */
    private static class a extends Handler {
        public a() {
            super(Looper.getMainLooper());
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            super.handleMessage(message);
        }
    }

    public static ThreadPoolExecutor a() {
        if (f19553b == null) {
            f19553b = new ThreadPoolExecutor(2, 5, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(10), new ThreadFactory() { // from class: com.mbridge.msdk.foundation.same.f.b.1
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                    newThread.setName("BitmapThreadPool");
                    return newThread;
                }
            }, new ThreadPoolExecutor.DiscardPolicy());
        }
        return f19553b;
    }

    public static ThreadPoolExecutor b() {
        if (f19552a == null) {
            f19552a = new ThreadPoolExecutor(5, 15, 15L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(100), new ThreadFactory() { // from class: com.mbridge.msdk.foundation.same.f.b.2
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                    newThread.setName("CommonThreadPool");
                    return newThread;
                }
            }, new ThreadPoolExecutor.DiscardPolicy());
        }
        return f19552a;
    }

    public static ThreadPoolExecutor c() {
        if (f19554c == null) {
            ThreadFactory threadFactory = new ThreadFactory() { // from class: com.mbridge.msdk.foundation.same.f.b.3
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                    newThread.setName("mb-image-download-tread");
                    return newThread;
                }
            };
            int availableProcessors = (Runtime.getRuntime().availableProcessors() * 2) + 1;
            f19554c = new ThreadPoolExecutor(availableProcessors, availableProcessors, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(30), threadFactory, new ThreadPoolExecutor.DiscardPolicy());
        }
        return f19554c;
    }

    public static ThreadPoolExecutor d() {
        if (f19555d == null) {
            ThreadFactory threadFactory = new ThreadFactory() { // from class: com.mbridge.msdk.foundation.same.f.b.4
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                    newThread.setName("mb-image-download-tread");
                    return newThread;
                }
            };
            int availableProcessors = (Runtime.getRuntime().availableProcessors() * 2) + 1;
            f19555d = new ThreadPoolExecutor(availableProcessors, availableProcessors, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(30), threadFactory, new ThreadPoolExecutor.DiscardPolicy());
        }
        return f19555d;
    }

    public static Handler e() {
        if (f19556e == null) {
            f19556e = new a();
        }
        return f19556e;
    }

    public static ThreadPoolExecutor f() {
        if (f19557f == null) {
            f19557f = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(1), new ThreadFactory() { // from class: com.mbridge.msdk.foundation.same.f.b.5
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                    newThread.setName("NwtThreadPool");
                    return newThread;
                }
            }, new ThreadPoolExecutor.DiscardPolicy());
        }
        return f19557f;
    }

    public static ThreadPoolExecutor g() {
        if (f19558g == null) {
            f19558g = new ThreadPoolExecutor(5, 15, 5L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(100), new ThreadFactory() { // from class: com.mbridge.msdk.foundation.same.f.b.6
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                    newThread.setName("ReportThreadPool");
                    return newThread;
                }
            }, new ThreadPoolExecutor.DiscardPolicy());
        }
        return f19558g;
    }

    public static ThreadPoolExecutor h() {
        if (f19559h == null) {
            ThreadFactory threadFactory = new ThreadFactory() { // from class: com.mbridge.msdk.foundation.same.f.b.7
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    Thread thread = new Thread(runnable);
                    thread.setName("rv-load-tread");
                    return thread;
                }
            };
            int availableProcessors = (Runtime.getRuntime().availableProcessors() * 2) + 1;
            f19559h = new ThreadPoolExecutor(availableProcessors, availableProcessors * 2, 5L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(30), threadFactory, new ThreadPoolExecutor.DiscardPolicy());
        }
        return f19559h;
    }
}
