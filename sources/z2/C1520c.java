package Z2;

import com.stripe.android.model.o;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: Z2.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1520c implements Y2.b {

    /* renamed from: a, reason: collision with root package name */
    public static final C1520c f13294a = new C1520c();

    /* renamed from: b, reason: collision with root package name */
    private static final o.p f13295b = o.p.f24536z;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f13296c = false;

    private C1520c() {
    }

    @Override // Y2.b
    public Set a(boolean z8) {
        return M5.a0.i(Y2.a.f13011c, Y2.a.f13010b);
    }

    @Override // Y2.b
    public Y2.h b() {
        return C1521d.f13298a;
    }

    @Override // Y2.b
    public boolean c(Y2.d metadata) {
        AbstractC3159y.i(metadata, "metadata");
        return false;
    }

    @Override // Y2.b
    public boolean d() {
        return f13296c;
    }

    @Override // Y2.b
    public o.p getType() {
        return f13295b;
    }
}
