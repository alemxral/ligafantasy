package r0;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class v implements E {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f37526a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f37527b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC3673d f37528c;

    public v(Executor executor, InterfaceC3673d interfaceC3673d) {
        this.f37526a = executor;
        this.f37528c = interfaceC3673d;
    }

    @Override // r0.E
    public final void a(Task task) {
        if (task.l()) {
            synchronized (this.f37527b) {
                try {
                    if (this.f37528c == null) {
                        return;
                    }
                    this.f37526a.execute(new u(this));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
