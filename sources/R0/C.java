package r0;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class C implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Task f37486a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ D f37487b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C(D d8, Task task) {
        this.f37487b = d8;
        this.f37486a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3678i interfaceC3678i;
        try {
            interfaceC3678i = this.f37487b.f37489b;
            Task a8 = interfaceC3678i.a(this.f37486a.j());
            if (a8 == null) {
                this.f37487b.d(new NullPointerException("Continuation returned null"));
                return;
            }
            D d8 = this.f37487b;
            Executor executor = k.f37505b;
            a8.e(executor, d8);
            a8.d(executor, this.f37487b);
            a8.a(executor, this.f37487b);
        } catch (CancellationException unused) {
            this.f37487b.c();
        } catch (C3677h e8) {
            if (e8.getCause() instanceof Exception) {
                this.f37487b.d((Exception) e8.getCause());
            } else {
                this.f37487b.d(e8);
            }
        } catch (Exception e9) {
            this.f37487b.d(e9);
        }
    }
}
