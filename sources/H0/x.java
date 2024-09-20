package H0;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public abstract class x {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f3408a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AtomicLong f3409b;

        /* renamed from: H0.x$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C0053a extends AbstractRunnableC1171e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Runnable f3410a;

            C0053a(Runnable runnable) {
                this.f3410a = runnable;
            }

            @Override // H0.AbstractRunnableC1171e
            public void a() {
                this.f3410a.run();
            }
        }

        a(String str, AtomicLong atomicLong) {
            this.f3408a = str;
            this.f3409b = atomicLong;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(new C0053a(runnable));
            newThread.setName(this.f3408a + this.f3409b.getAndIncrement());
            return newThread;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b extends AbstractRunnableC1171e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f3412a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ExecutorService f3413b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f3414c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ TimeUnit f3415d;

        b(String str, ExecutorService executorService, long j8, TimeUnit timeUnit) {
            this.f3412a = str;
            this.f3413b = executorService;
            this.f3414c = j8;
            this.f3415d = timeUnit;
        }

        @Override // H0.AbstractRunnableC1171e
        public void a() {
            try {
                E0.f.f().b("Executing shutdown hook for " + this.f3412a);
                this.f3413b.shutdown();
                if (!this.f3413b.awaitTermination(this.f3414c, this.f3415d)) {
                    E0.f.f().b(this.f3412a + " did not shut down in the allocated time. Requesting immediate shutdown.");
                    this.f3413b.shutdownNow();
                }
            } catch (InterruptedException unused) {
                E0.f.f().b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.f3412a));
                this.f3413b.shutdownNow();
            }
        }
    }

    private static void a(String str, ExecutorService executorService) {
        b(str, executorService, 2L, TimeUnit.SECONDS);
    }

    private static void b(String str, ExecutorService executorService, long j8, TimeUnit timeUnit) {
        Runtime.getRuntime().addShutdownHook(new Thread(new b(str, executorService, j8, timeUnit), "Crashlytics Shutdown Hook for " + str));
    }

    public static ExecutorService c(String str) {
        ExecutorService e8 = e(d(str), new ThreadPoolExecutor.DiscardPolicy());
        a(str, e8);
        return e8;
    }

    public static ThreadFactory d(String str) {
        return new a(str, new AtomicLong(1L));
    }

    private static ExecutorService e(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }
}
