package r0;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class x implements E {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f37531a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f37532b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC3674e f37533c;

    public x(Executor executor, InterfaceC3674e interfaceC3674e) {
        this.f37531a = executor;
        this.f37533c = interfaceC3674e;
    }

    @Override // r0.E
    public final void a(Task task) {
        synchronized (this.f37532b) {
            try {
                if (this.f37533c == null) {
                    return;
                }
                this.f37531a.execute(new w(this, task));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
