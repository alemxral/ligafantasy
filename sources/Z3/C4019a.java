package z3;

import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import y2.InterfaceC3983b;

/* renamed from: z3.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4019a {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f40047a;

    /* renamed from: b, reason: collision with root package name */
    private final C0922a f40048b;

    /* renamed from: z3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0922a {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC3983b f40049a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f40050b;

        public C0922a(InterfaceC3983b label, boolean z8) {
            AbstractC3159y.i(label, "label");
            this.f40049a = label;
            this.f40050b = z8;
        }

        public final InterfaceC3983b a() {
            return this.f40049a;
        }

        public final boolean b() {
            return this.f40050b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0922a)) {
                return false;
            }
            C0922a c0922a = (C0922a) obj;
            if (AbstractC3159y.d(this.f40049a, c0922a.f40049a) && this.f40050b == c0922a.f40050b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f40049a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f40050b);
        }

        public String toString() {
            return "BuyButtonOverride(label=" + this.f40049a + ", lockEnabled=" + this.f40050b + ")";
        }
    }

    public C4019a(boolean z8, C0922a c0922a) {
        this.f40047a = z8;
        this.f40048b = c0922a;
    }

    public final C0922a a() {
        return this.f40048b;
    }

    public final boolean b() {
        return this.f40047a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4019a)) {
            return false;
        }
        C4019a c4019a = (C4019a) obj;
        if (this.f40047a == c4019a.f40047a && AbstractC3159y.d(this.f40048b, c4019a.f40048b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int a8 = androidx.compose.foundation.a.a(this.f40047a) * 31;
        C0922a c0922a = this.f40048b;
        if (c0922a == null) {
            hashCode = 0;
        } else {
            hashCode = c0922a.hashCode();
        }
        return a8 + hashCode;
    }

    public String toString() {
        return "BuyButtonState(visible=" + this.f40047a + ", buyButtonOverride=" + this.f40048b + ")";
    }

    public /* synthetic */ C4019a(boolean z8, C0922a c0922a, int i8, AbstractC3151p abstractC3151p) {
        this(z8, (i8 & 2) != 0 ? null : c0922a);
    }
}
