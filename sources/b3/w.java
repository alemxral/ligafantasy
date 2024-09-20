package b3;

import L5.s;
import com.stripe.android.view.X;
import g6.AbstractC2725a;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public abstract class w {

    /* loaded from: classes4.dex */
    public static final class a extends w {

        /* renamed from: f, reason: collision with root package name */
        public static final C0360a f14572f = new C0360a(null);

        /* renamed from: g, reason: collision with root package name */
        private static final a f14573g = new a("", "");

        /* renamed from: a, reason: collision with root package name */
        private final String f14574a;

        /* renamed from: b, reason: collision with root package name */
        private final String f14575b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f14576c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f14577d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f14578e;

        /* renamed from: b3.w$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0360a {
            private C0360a() {
            }

            public final a a(String input) {
                AbstractC3159y.i(input, "input");
                for (int i8 = 0; i8 < input.length(); i8++) {
                    char charAt = input.charAt(i8);
                    if (!Character.isDigit(charAt) && !AbstractC2725a.c(charAt) && charAt != '/') {
                        return b();
                    }
                }
                StringBuilder sb = new StringBuilder();
                int length = input.length();
                for (int i9 = 0; i9 < length; i9++) {
                    char charAt2 = input.charAt(i9);
                    if (Character.isDigit(charAt2)) {
                        sb.append(charAt2);
                    }
                }
                String sb2 = sb.toString();
                AbstractC3159y.h(sb2, "toString(...)");
                return new a(g6.n.U0(sb2, 2), g6.n.P0(sb2, 2));
            }

            public final a b() {
                return a.f14573g;
            }

            public /* synthetic */ C0360a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String month, String year) {
            super(null);
            Object b8;
            boolean z8;
            boolean z9;
            AbstractC3159y.i(month, "month");
            AbstractC3159y.i(year, "year");
            this.f14574a = month;
            this.f14575b = year;
            boolean z10 = false;
            try {
                s.a aVar = L5.s.f6498b;
                int parseInt = Integer.parseInt(month);
                if (1 <= parseInt && parseInt < 13) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                b8 = L5.s.b(Boolean.valueOf(z9));
            } catch (Throwable th) {
                s.a aVar2 = L5.s.f6498b;
                b8 = L5.s.b(L5.t.a(th));
            }
            this.f14576c = ((Boolean) (L5.s.g(b8) ? Boolean.FALSE : b8)).booleanValue();
            if (this.f14574a.length() + this.f14575b.length() == 4) {
                z8 = true;
            } else {
                z8 = false;
            }
            this.f14577d = z8;
            if (!z8 && this.f14574a.length() + this.f14575b.length() > 0) {
                z10 = true;
            }
            this.f14578e = z10;
        }

        public final String b() {
            return this.f14574a;
        }

        public final String c() {
            return this.f14575b;
        }

        public final boolean d() {
            return this.f14577d;
        }

        public final boolean e() {
            return this.f14576c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (AbstractC3159y.d(this.f14574a, aVar.f14574a) && AbstractC3159y.d(this.f14575b, aVar.f14575b)) {
                return true;
            }
            return false;
        }

        public final boolean f() {
            return this.f14578e;
        }

        public final b g() {
            Object b8;
            String str = this.f14574a;
            String str2 = this.f14575b;
            try {
                s.a aVar = L5.s.f6498b;
                b8 = L5.s.b(new b(Integer.parseInt(str), X.f27626a.a(Integer.parseInt(str2))));
            } catch (Throwable th) {
                s.a aVar2 = L5.s.f6498b;
                b8 = L5.s.b(L5.t.a(th));
            }
            if (L5.s.g(b8)) {
                b8 = null;
            }
            return (b) b8;
        }

        public int hashCode() {
            return (this.f14574a.hashCode() * 31) + this.f14575b.hashCode();
        }

        public String toString() {
            return "Unvalidated(month=" + this.f14574a + ", year=" + this.f14575b + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends w {

        /* renamed from: a, reason: collision with root package name */
        private final int f14579a;

        /* renamed from: b, reason: collision with root package name */
        private final int f14580b;

        public b(int i8, int i9) {
            super(null);
            this.f14579a = i8;
            this.f14580b = i9;
        }

        public final int a() {
            return this.f14579a;
        }

        public final int b() {
            return this.f14580b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f14579a == bVar.f14579a && this.f14580b == bVar.f14580b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f14579a * 31) + this.f14580b;
        }

        public String toString() {
            return "Validated(month=" + this.f14579a + ", year=" + this.f14580b + ")";
        }
    }

    private w() {
    }

    public /* synthetic */ w(AbstractC3151p abstractC3151p) {
        this();
    }
}
