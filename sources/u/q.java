package u;

import java.util.Set;
import s.C3700b;
import s.InterfaceC3703e;

/* loaded from: classes3.dex */
final class q implements s.g {

    /* renamed from: a, reason: collision with root package name */
    private final Set f38448a;

    /* renamed from: b, reason: collision with root package name */
    private final p f38449b;

    /* renamed from: c, reason: collision with root package name */
    private final t f38450c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(Set set, p pVar, t tVar) {
        this.f38448a = set;
        this.f38449b = pVar;
        this.f38450c = tVar;
    }

    @Override // s.g
    public s.f a(String str, Class cls, C3700b c3700b, InterfaceC3703e interfaceC3703e) {
        if (this.f38448a.contains(c3700b)) {
            return new s(this.f38449b, str, c3700b, interfaceC3703e, this.f38450c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", c3700b, this.f38448a));
    }
}
