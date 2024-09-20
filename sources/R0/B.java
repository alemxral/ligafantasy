package r0;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class B implements E {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f37483a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f37484b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC3676g f37485c;

    public B(Executor executor, InterfaceC3676g interfaceC3676g) {
        this.f37483a = executor;
        this.f37485c = interfaceC3676g;
    }

    @Override // r0.E
    public final void a(Task task) {
        if (task.n()) {
            synchronized (this.f37484b) {
                try {
                    if (this.f37485c == null) {
                        return;
                    }
                    this.f37483a.execute(new RunnableC3669A(this, task));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
