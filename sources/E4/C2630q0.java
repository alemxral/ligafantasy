package e4;

import java.util.List;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: e4.q0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2630q0 {

    /* renamed from: b, reason: collision with root package name */
    public static final a f30786b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f30787c = 8;

    /* renamed from: a, reason: collision with root package name */
    private final List f30788a;

    /* renamed from: e4.q0$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public C2630q0(List items) {
        AbstractC3159y.i(items, "items");
        this.f30788a = items;
    }

    public final List a() {
        return this.f30788a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2630q0) && AbstractC3159y.d(this.f30788a, ((C2630q0) obj).f30788a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f30788a.hashCode();
    }

    public String toString() {
        return "LayoutSpec(items=" + this.f30788a + ")";
    }
}
