package J3;

import b3.EnumC1870e;
import java.util.List;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import m4.t0;
import y2.AbstractC3984c;
import y2.InterfaceC3983b;

/* renamed from: J3.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1207o {

    /* renamed from: a, reason: collision with root package name */
    private final b f5330a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5331b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3983b f5332c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f5333d;

    /* renamed from: e, reason: collision with root package name */
    private final a f5334e;

    /* renamed from: f, reason: collision with root package name */
    private final List f5335f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f5336g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f5337h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC3983b f5338i;

    /* renamed from: J3.o$a */
    /* loaded from: classes4.dex */
    public static final class a implements t0 {

        /* renamed from: a, reason: collision with root package name */
        private final EnumC1870e f5339a;

        public a(EnumC1870e brand) {
            AbstractC3159y.i(brand, "brand");
            this.f5339a = brand;
        }

        public final EnumC1870e a() {
            return this.f5339a;
        }

        @Override // m4.t0
        public InterfaceC3983b b() {
            return AbstractC3984c.b(this.f5339a.h());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && this.f5339a == ((a) obj).f5339a) {
                return true;
            }
            return false;
        }

        @Override // m4.t0
        public Integer getIcon() {
            return Integer.valueOf(this.f5339a.l());
        }

        public int hashCode() {
            return this.f5339a.hashCode();
        }

        public String toString() {
            return "CardBrandChoice(brand=" + this.f5339a + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: J3.o$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f5340a = new b("Idle", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final b f5341b = new b("Updating", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final b f5342c = new b("Removing", 2);

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ b[] f5343d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ R5.a f5344e;

        static {
            b[] a8 = a();
            f5343d = a8;
            f5344e = R5.b.a(a8);
        }

        private b(String str, int i8) {
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f5340a, f5341b, f5342c};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f5343d.clone();
        }
    }

    public C1207o(b status, String last4, InterfaceC3983b displayName, boolean z8, a selectedBrand, List availableBrands, boolean z9, boolean z10, InterfaceC3983b interfaceC3983b) {
        AbstractC3159y.i(status, "status");
        AbstractC3159y.i(last4, "last4");
        AbstractC3159y.i(displayName, "displayName");
        AbstractC3159y.i(selectedBrand, "selectedBrand");
        AbstractC3159y.i(availableBrands, "availableBrands");
        this.f5330a = status;
        this.f5331b = last4;
        this.f5332c = displayName;
        this.f5333d = z8;
        this.f5334e = selectedBrand;
        this.f5335f = availableBrands;
        this.f5336g = z9;
        this.f5337h = z10;
        this.f5338i = interfaceC3983b;
    }

    public final List a() {
        return this.f5335f;
    }

    public final boolean b() {
        return this.f5336g;
    }

    public final boolean c() {
        return this.f5333d;
    }

    public final boolean d() {
        return this.f5337h;
    }

    public final InterfaceC3983b e() {
        return this.f5332c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1207o)) {
            return false;
        }
        C1207o c1207o = (C1207o) obj;
        if (this.f5330a == c1207o.f5330a && AbstractC3159y.d(this.f5331b, c1207o.f5331b) && AbstractC3159y.d(this.f5332c, c1207o.f5332c) && this.f5333d == c1207o.f5333d && AbstractC3159y.d(this.f5334e, c1207o.f5334e) && AbstractC3159y.d(this.f5335f, c1207o.f5335f) && this.f5336g == c1207o.f5336g && this.f5337h == c1207o.f5337h && AbstractC3159y.d(this.f5338i, c1207o.f5338i)) {
            return true;
        }
        return false;
    }

    public final InterfaceC3983b f() {
        return this.f5338i;
    }

    public final String g() {
        return this.f5331b;
    }

    public final a h() {
        return this.f5334e;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((((((((this.f5330a.hashCode() * 31) + this.f5331b.hashCode()) * 31) + this.f5332c.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f5333d)) * 31) + this.f5334e.hashCode()) * 31) + this.f5335f.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f5336g)) * 31) + androidx.compose.foundation.a.a(this.f5337h)) * 31;
        InterfaceC3983b interfaceC3983b = this.f5338i;
        if (interfaceC3983b == null) {
            hashCode = 0;
        } else {
            hashCode = interfaceC3983b.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final b i() {
        return this.f5330a;
    }

    public String toString() {
        return "EditPaymentMethodViewState(status=" + this.f5330a + ", last4=" + this.f5331b + ", displayName=" + this.f5332c + ", canUpdate=" + this.f5333d + ", selectedBrand=" + this.f5334e + ", availableBrands=" + this.f5335f + ", canRemove=" + this.f5336g + ", confirmRemoval=" + this.f5337h + ", error=" + this.f5338i + ")";
    }

    public /* synthetic */ C1207o(b bVar, String str, InterfaceC3983b interfaceC3983b, boolean z8, a aVar, List list, boolean z9, boolean z10, InterfaceC3983b interfaceC3983b2, int i8, AbstractC3151p abstractC3151p) {
        this(bVar, str, interfaceC3983b, z8, aVar, list, z9, (i8 & 128) != 0 ? false : z10, (i8 & 256) != 0 ? null : interfaceC3983b2);
    }
}
