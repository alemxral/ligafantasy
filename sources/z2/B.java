package Z2;

import com.stripe.android.model.o;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class B implements Y2.b {

    /* renamed from: a, reason: collision with root package name */
    public static final B f13237a = new B();

    /* renamed from: b, reason: collision with root package name */
    private static final o.p f13238b = o.p.f24531u;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f13239c = false;

    private B() {
    }

    @Override // Y2.b
    public Set a(boolean z8) {
        return M5.a0.d(Y2.a.f13010b);
    }

    @Override // Y2.b
    public Y2.h b() {
        return C.f13240a;
    }

    @Override // Y2.b
    public boolean c(Y2.d metadata) {
        AbstractC3159y.i(metadata, "metadata");
        return true;
    }

    @Override // Y2.b
    public boolean d() {
        return f13239c;
    }

    @Override // Y2.b
    public o.p getType() {
        return f13238b;
    }
}
