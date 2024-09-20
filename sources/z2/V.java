package Z2;

import com.stripe.android.model.o;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class V implements Y2.b {

    /* renamed from: a, reason: collision with root package name */
    public static final V f13275a = new V();

    /* renamed from: b, reason: collision with root package name */
    private static final o.p f13276b = o.p.f24507M;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f13277c = false;

    private V() {
    }

    @Override // Y2.b
    public Set a(boolean z8) {
        return M5.a0.i(Y2.a.f13010b, Y2.a.f13012d);
    }

    @Override // Y2.b
    public Y2.h b() {
        return W.f13278a;
    }

    @Override // Y2.b
    public boolean c(Y2.d metadata) {
        AbstractC3159y.i(metadata, "metadata");
        return false;
    }

    @Override // Y2.b
    public boolean d() {
        return f13277c;
    }

    @Override // Y2.b
    public o.p getType() {
        return f13276b;
    }
}
