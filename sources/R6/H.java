package R6;

import java.io.IOException;

/* loaded from: classes5.dex */
public class H implements InterfaceC1335d, y0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f8768a;

    /* renamed from: b, reason: collision with root package name */
    private final C1357y f8769b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public H(int i8, C1357y c1357y) {
        this.f8768a = i8;
        this.f8769b = c1357y;
    }

    @Override // R6.InterfaceC1335d
    public AbstractC1351s d() {
        try {
            return g();
        } catch (IOException e8) {
            throw new r(e8.getMessage(), e8);
        }
    }

    @Override // R6.y0
    public AbstractC1351s g() {
        return new G(this.f8768a, this.f8769b.d());
    }
}
