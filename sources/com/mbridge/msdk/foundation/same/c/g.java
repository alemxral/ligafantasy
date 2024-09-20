package com.mbridge.msdk.foundation.same.c;

import com.mbridge.msdk.foundation.tools.af;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static AtomicBoolean f19530a;

    /* renamed from: b, reason: collision with root package name */
    private static AtomicBoolean f19531b;

    /* renamed from: c, reason: collision with root package name */
    private static ThreadPoolExecutor f19532c;

    public static ThreadPoolExecutor a() {
        if (f19532c == null) {
            int availableProcessors = (Runtime.getRuntime().availableProcessors() * 2) + 1;
            f19532c = new ThreadPoolExecutor(availableProcessors, availableProcessors, 5L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactory() { // from class: com.mbridge.msdk.foundation.same.c.g.1
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    Thread thread = new Thread(runnable);
                    thread.setName("mb-image-loader-thread");
                    return thread;
                }
            }, new ThreadPoolExecutor.DiscardPolicy());
        }
        f19532c.allowCoreThreadTimeOut(true);
        return f19532c;
    }

    public static boolean b() {
        if (f19530a == null) {
            f19530a = new AtomicBoolean(af.a().a("u_i_l_l_n", true));
        }
        AtomicBoolean atomicBoolean = f19530a;
        if (atomicBoolean != null && atomicBoolean.get()) {
            return true;
        }
        return false;
    }

    public static boolean c() {
        if (f19531b == null) {
            f19531b = new AtomicBoolean(af.a().a("u_i_l_l_b_d", false));
        }
        AtomicBoolean atomicBoolean = f19531b;
        if (atomicBoolean == null || !atomicBoolean.get()) {
            return false;
        }
        return true;
    }
}
