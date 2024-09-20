package H0;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import r0.InterfaceC3671b;

/* renamed from: H0.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1178l {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f3305a;

    /* renamed from: b, reason: collision with root package name */
    private Task f3306b = r0.l.e(null);

    /* renamed from: c, reason: collision with root package name */
    private final Object f3307c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final ThreadLocal f3308d = new ThreadLocal();

    /* renamed from: H0.l$a */
    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1178l.this.f3308d.set(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H0.l$b */
    /* loaded from: classes3.dex */
    public class b implements InterfaceC3671b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callable f3310a;

        b(Callable callable) {
            this.f3310a = callable;
        }

        @Override // r0.InterfaceC3671b
        public Object a(Task task) {
            return this.f3310a.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H0.l$c */
    /* loaded from: classes3.dex */
    public class c implements InterfaceC3671b {
        c() {
        }

        @Override // r0.InterfaceC3671b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(Task task) {
            return null;
        }
    }

    public C1178l(Executor executor) {
        this.f3305a = executor;
        executor.execute(new a());
    }

    private Task d(Task task) {
        return task.f(this.f3305a, new c());
    }

    private boolean e() {
        return Boolean.TRUE.equals(this.f3308d.get());
    }

    private InterfaceC3671b f(Callable callable) {
        return new b(callable);
    }

    public void b() {
        if (e()) {
        } else {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
    }

    public Executor c() {
        return this.f3305a;
    }

    public Task g(Callable callable) {
        Task f8;
        synchronized (this.f3307c) {
            f8 = this.f3306b.f(this.f3305a, f(callable));
            this.f3306b = d(f8);
        }
        return f8;
    }

    public Task h(Callable callable) {
        Task h8;
        synchronized (this.f3307c) {
            h8 = this.f3306b.h(this.f3305a, f(callable));
            this.f3306b = d(h8);
        }
        return h8;
    }
}
