package r0;

/* loaded from: classes3.dex */
final class u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ v f37525a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(v vVar) {
        this.f37525a = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC3673d interfaceC3673d;
        InterfaceC3673d interfaceC3673d2;
        obj = this.f37525a.f37527b;
        synchronized (obj) {
            try {
                v vVar = this.f37525a;
                interfaceC3673d = vVar.f37528c;
                if (interfaceC3673d != null) {
                    interfaceC3673d2 = vVar.f37528c;
                    interfaceC3673d2.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
