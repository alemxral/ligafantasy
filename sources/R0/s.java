package r0;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class s implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Task f37520a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ t f37521b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(t tVar, Task task) {
        this.f37521b = tVar;
        this.f37520a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        I i8;
        I i9;
        I i10;
        InterfaceC3671b interfaceC3671b;
        try {
            interfaceC3671b = this.f37521b.f37523b;
            Task task = (Task) interfaceC3671b.a(this.f37520a);
            if (task == null) {
                this.f37521b.d(new NullPointerException("Continuation returned null"));
                return;
            }
            t tVar = this.f37521b;
            Executor executor = k.f37505b;
            task.e(executor, tVar);
            task.d(executor, this.f37521b);
            task.a(executor, this.f37521b);
        } catch (C3677h e8) {
            if (e8.getCause() instanceof Exception) {
                i10 = this.f37521b.f37524c;
                i10.q((Exception) e8.getCause());
            } else {
                i9 = this.f37521b.f37524c;
                i9.q(e8);
            }
        } catch (Exception e9) {
            i8 = this.f37521b.f37524c;
            i8.q(e9);
        }
    }
}
