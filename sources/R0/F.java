package r0;

import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    private final Object f37491a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private Queue f37492b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f37493c;

    public final void a(E e8) {
        synchronized (this.f37491a) {
            try {
                if (this.f37492b == null) {
                    this.f37492b = new ArrayDeque();
                }
                this.f37492b.add(e8);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Task task) {
        E e8;
        synchronized (this.f37491a) {
            if (this.f37492b != null && !this.f37493c) {
                this.f37493c = true;
                while (true) {
                    synchronized (this.f37491a) {
                        try {
                            e8 = (E) this.f37492b.poll();
                            if (e8 == null) {
                                this.f37493c = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    e8.a(task);
                }
            }
        }
    }
}
