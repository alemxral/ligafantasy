package H0;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: H0.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C1185t implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    private final a f3389a;

    /* renamed from: b, reason: collision with root package name */
    private final O0.i f3390b;

    /* renamed from: c, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f3391c;

    /* renamed from: d, reason: collision with root package name */
    private final E0.a f3392d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f3393e = new AtomicBoolean(false);

    /* renamed from: H0.t$a */
    /* loaded from: classes3.dex */
    interface a {
        void a(O0.i iVar, Thread thread, Throwable th);
    }

    public C1185t(a aVar, O0.i iVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, E0.a aVar2) {
        this.f3389a = aVar;
        this.f3390b = iVar;
        this.f3391c = uncaughtExceptionHandler;
        this.f3392d = aVar2;
    }

    private boolean b(Thread thread, Throwable th) {
        if (thread == null) {
            E0.f.f().d("Crashlytics will not record uncaught exception; null thread");
            return false;
        }
        if (th == null) {
            E0.f.f().d("Crashlytics will not record uncaught exception; null throwable");
            return false;
        }
        if (this.f3392d.b()) {
            E0.f.f().b("Crashlytics will not record uncaught exception; native crash exists for session.");
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        return this.f3393e.get();
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        this.f3393e.set(true);
        try {
            try {
                if (b(thread, th)) {
                    this.f3389a.a(this.f3390b, thread, th);
                } else {
                    E0.f.f().b("Uncaught exception will not be recorded by Crashlytics.");
                }
            } catch (Exception e8) {
                E0.f.f().e("An error occurred in the uncaught exception handler", e8);
            }
            E0.f.f().b("Completed exception processing. Invoking default exception handler.");
            this.f3391c.uncaughtException(thread, th);
            this.f3393e.set(false);
        } catch (Throwable th2) {
            E0.f.f().b("Completed exception processing. Invoking default exception handler.");
            this.f3391c.uncaughtException(thread, th);
            this.f3393e.set(false);
            throw th2;
        }
    }
}
