package Z2;

import com.stripe.android.model.o;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class O implements Y2.b {

    /* renamed from: a, reason: collision with root package name */
    public static final O f13263a = new O();

    /* renamed from: b, reason: collision with root package name */
    private static final o.p f13264b = o.p.f24498D;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f13265c = false;

    private O() {
    }

    @Override // Y2.b
    public Set a(boolean z8) {
        return M5.a0.f();
    }

    @Override // Y2.b
    public Y2.h b() {
        return P.f13266a;
    }

    @Override // Y2.b
    public boolean c(Y2.d metadata) {
        AbstractC3159y.i(metadata, "metadata");
        return metadata.Y();
    }

    @Override // Y2.b
    public boolean d() {
        return f13265c;
    }

    @Override // Y2.b
    public o.p getType() {
        return f13264b;
    }
}
