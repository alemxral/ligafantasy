package m4;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import y2.InterfaceC3983b;

/* loaded from: classes4.dex */
public abstract class x0 {

    /* loaded from: classes4.dex */
    public static final class a extends x0 {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC3983b f35762a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f35763b;

        /* renamed from: c, reason: collision with root package name */
        private final C0823a f35764c;

        /* renamed from: d, reason: collision with root package name */
        private final List f35765d;

        /* renamed from: m4.x0$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0823a implements t0 {

            /* renamed from: a, reason: collision with root package name */
            private final String f35766a;

            /* renamed from: b, reason: collision with root package name */
            private final InterfaceC3983b f35767b;

            /* renamed from: c, reason: collision with root package name */
            private final int f35768c;

            public C0823a(String id, InterfaceC3983b label, int i8) {
                AbstractC3159y.i(id, "id");
                AbstractC3159y.i(label, "label");
                this.f35766a = id;
                this.f35767b = label;
                this.f35768c = i8;
            }

            public final String a() {
                return this.f35766a;
            }

            @Override // m4.t0
            public InterfaceC3983b b() {
                return this.f35767b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0823a)) {
                    return false;
                }
                C0823a c0823a = (C0823a) obj;
                if (AbstractC3159y.d(this.f35766a, c0823a.f35766a) && AbstractC3159y.d(this.f35767b, c0823a.f35767b) && this.f35768c == c0823a.f35768c) {
                    return true;
                }
                return false;
            }

            @Override // m4.t0
            public Integer getIcon() {
                return Integer.valueOf(this.f35768c);
            }

            public int hashCode() {
                return (((this.f35766a.hashCode() * 31) + this.f35767b.hashCode()) * 31) + this.f35768c;
            }

            public String toString() {
                return "Item(id=" + this.f35766a + ", label=" + this.f35767b + ", icon=" + this.f35768c + ")";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC3983b title, boolean z8, C0823a currentItem, List items) {
            super(null);
            AbstractC3159y.i(title, "title");
            AbstractC3159y.i(currentItem, "currentItem");
            AbstractC3159y.i(items, "items");
            this.f35762a = title;
            this.f35763b = z8;
            this.f35764c = currentItem;
            this.f35765d = items;
        }

        public final C0823a a() {
            return this.f35764c;
        }

        public final boolean b() {
            return this.f35763b;
        }

        public final List c() {
            return this.f35765d;
        }

        public final InterfaceC3983b d() {
            return this.f35762a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (AbstractC3159y.d(this.f35762a, aVar.f35762a) && this.f35763b == aVar.f35763b && AbstractC3159y.d(this.f35764c, aVar.f35764c) && AbstractC3159y.d(this.f35765d, aVar.f35765d)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f35762a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f35763b)) * 31) + this.f35764c.hashCode()) * 31) + this.f35765d.hashCode();
        }

        public String toString() {
            return "Dropdown(title=" + this.f35762a + ", hide=" + this.f35763b + ", currentItem=" + this.f35764c + ", items=" + this.f35765d + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends x0 {

        /* renamed from: a, reason: collision with root package name */
        private final List f35769a;

        /* renamed from: b, reason: collision with root package name */
        private final List f35770b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List staticIcons, List animatedIcons) {
            super(null);
            AbstractC3159y.i(staticIcons, "staticIcons");
            AbstractC3159y.i(animatedIcons, "animatedIcons");
            this.f35769a = staticIcons;
            this.f35770b = animatedIcons;
        }

        public final List a() {
            return this.f35770b;
        }

        public final List b() {
            return this.f35769a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (AbstractC3159y.d(this.f35769a, bVar.f35769a) && AbstractC3159y.d(this.f35770b, bVar.f35770b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f35769a.hashCode() * 31) + this.f35770b.hashCode();
        }

        public String toString() {
            return "MultiTrailing(staticIcons=" + this.f35769a + ", animatedIcons=" + this.f35770b + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends x0 {

        /* renamed from: e, reason: collision with root package name */
        public static final int f35771e = 0;

        /* renamed from: a, reason: collision with root package name */
        private final int f35772a;

        /* renamed from: b, reason: collision with root package name */
        private final Integer f35773b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f35774c;

        /* renamed from: d, reason: collision with root package name */
        private final Function0 f35775d;

        public /* synthetic */ c(int i8, Integer num, boolean z8, Function0 function0, int i9, AbstractC3151p abstractC3151p) {
            this(i8, (i9 & 2) != 0 ? null : num, z8, (i9 & 8) != 0 ? null : function0);
        }

        public final Integer a() {
            return this.f35773b;
        }

        public final int b() {
            return this.f35772a;
        }

        public final Function0 c() {
            return this.f35775d;
        }

        public final boolean d() {
            return this.f35774c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f35772a == cVar.f35772a && AbstractC3159y.d(this.f35773b, cVar.f35773b) && this.f35774c == cVar.f35774c && AbstractC3159y.d(this.f35775d, cVar.f35775d)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int i8 = this.f35772a * 31;
            Integer num = this.f35773b;
            int i9 = 0;
            if (num == null) {
                hashCode = 0;
            } else {
                hashCode = num.hashCode();
            }
            int a8 = (((i8 + hashCode) * 31) + androidx.compose.foundation.a.a(this.f35774c)) * 31;
            Function0 function0 = this.f35775d;
            if (function0 != null) {
                i9 = function0.hashCode();
            }
            return a8 + i9;
        }

        public String toString() {
            return "Trailing(idRes=" + this.f35772a + ", contentDescription=" + this.f35773b + ", isTintable=" + this.f35774c + ", onClick=" + this.f35775d + ")";
        }

        public c(int i8, Integer num, boolean z8, Function0 function0) {
            super(null);
            this.f35772a = i8;
            this.f35773b = num;
            this.f35774c = z8;
            this.f35775d = function0;
        }
    }

    public /* synthetic */ x0(AbstractC3151p abstractC3151p) {
        this();
    }

    private x0() {
    }
}
