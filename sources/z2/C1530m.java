package Z2;

import com.stripe.android.model.o;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: Z2.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1530m implements Y2.b {

    /* renamed from: a, reason: collision with root package name */
    public static final C1530m f13334a = new C1530m();

    /* renamed from: b, reason: collision with root package name */
    private static final o.p f13335b = o.p.f24525o;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f13336c = false;

    private C1530m() {
    }

    @Override // Y2.b
    public Set a(boolean z8) {
        return M5.a0.i(Y2.a.f13012d, Y2.a.f13010b);
    }

    @Override // Y2.b
    public Y2.h b() {
        return C1531n.f13338a;
    }

    @Override // Y2.b
    public boolean c(Y2.d metadata) {
        AbstractC3159y.i(metadata, "metadata");
        return true;
    }

    @Override // Y2.b
    public boolean d() {
        return f13336c;
    }

    @Override // Y2.b
    public o.p getType() {
        return f13335b;
    }
}
