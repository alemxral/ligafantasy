package O;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
final class L extends N {

    /* renamed from: f, reason: collision with root package name */
    private final Callable f7630f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ L(Callable callable, K k8) {
        super();
        this.f7630f = callable;
    }

    @Override // O.N
    final String a() {
        try {
            return (String) this.f7630f.call();
        } catch (Exception e8) {
            throw new RuntimeException(e8);
        }
    }
}
