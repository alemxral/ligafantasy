package J3;

import j2.AbstractC3053E;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    private final int f4810a;

    /* renamed from: b, reason: collision with root package name */
    private final int f4811b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f4812c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f4813d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f4814e;

    /* renamed from: f, reason: collision with root package name */
    private final Function0 f4815f;

    /* loaded from: classes4.dex */
    public interface a {

        /* renamed from: J3.G$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0093a implements a {

            /* renamed from: a, reason: collision with root package name */
            private final boolean f4816a;

            /* renamed from: b, reason: collision with root package name */
            private final boolean f4817b;

            /* renamed from: c, reason: collision with root package name */
            private final Function0 f4818c;

            public C0093a(boolean z8, boolean z9, Function0 onEditIconPressed) {
                AbstractC3159y.i(onEditIconPressed, "onEditIconPressed");
                this.f4816a = z8;
                this.f4817b = z9;
                this.f4818c = onEditIconPressed;
            }

            public final boolean a() {
                return this.f4817b;
            }

            public final Function0 b() {
                return this.f4818c;
            }

            public final boolean c() {
                return this.f4816a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0093a)) {
                    return false;
                }
                C0093a c0093a = (C0093a) obj;
                if (this.f4816a == c0093a.f4816a && this.f4817b == c0093a.f4817b && AbstractC3159y.d(this.f4818c, c0093a.f4818c)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return (((androidx.compose.foundation.a.a(this.f4816a) * 31) + androidx.compose.foundation.a.a(this.f4817b)) * 31) + this.f4818c.hashCode();
            }

            public String toString() {
                return "Maybe(isEditing=" + this.f4816a + ", canEdit=" + this.f4817b + ", onEditIconPressed=" + this.f4818c + ")";
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f4819a = new b();

            private b() {
            }

            public boolean equals(Object obj) {
                if (this == obj || (obj instanceof b)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 2105449614;
            }

            public String toString() {
                return "Never";
            }
        }
    }

    public G(int i8, int i9, boolean z8, boolean z9, boolean z10, Function0 onEditIconPressed) {
        AbstractC3159y.i(onEditIconPressed, "onEditIconPressed");
        this.f4810a = i8;
        this.f4811b = i9;
        this.f4812c = z8;
        this.f4813d = z9;
        this.f4814e = z10;
        this.f4815f = onEditIconPressed;
    }

    public final int a() {
        return this.f4811b;
    }

    public final int b() {
        if (this.f4814e) {
            return AbstractC3053E.f32869h0;
        }
        return AbstractC3053E.f32871i0;
    }

    public final int c() {
        return this.f4810a;
    }

    public final Function0 d() {
        return this.f4815f;
    }

    public final boolean e() {
        return this.f4813d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g8 = (G) obj;
        if (this.f4810a == g8.f4810a && this.f4811b == g8.f4811b && this.f4812c == g8.f4812c && this.f4813d == g8.f4813d && this.f4814e == g8.f4814e && AbstractC3159y.d(this.f4815f, g8.f4815f)) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.f4812c;
    }

    public final boolean g() {
        return this.f4814e;
    }

    public int hashCode() {
        return (((((((((this.f4810a * 31) + this.f4811b) * 31) + androidx.compose.foundation.a.a(this.f4812c)) * 31) + androidx.compose.foundation.a.a(this.f4813d)) * 31) + androidx.compose.foundation.a.a(this.f4814e)) * 31) + this.f4815f.hashCode();
    }

    public String toString() {
        return "PaymentSheetTopBarState(icon=" + this.f4810a + ", contentDescription=" + this.f4811b + ", showTestModeLabel=" + this.f4812c + ", showEditMenu=" + this.f4813d + ", isEditing=" + this.f4814e + ", onEditIconPressed=" + this.f4815f + ")";
    }
}
