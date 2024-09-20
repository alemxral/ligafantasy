package M2;

/* loaded from: classes4.dex */
public interface e {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f6898a = new a("RequiresSignUp", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f6899b = new a("RequiresVerification", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final a f6900c = new a("Verified", 2);

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ a[] f6901d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ R5.a f6902e;

        static {
            a[] a8 = a();
            f6901d = a8;
            f6902e = R5.b.a(a8);
        }

        private a(String str, int i8) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f6898a, f6899b, f6900c};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f6901d.clone();
        }
    }

    void a(boolean z8);

    void b(boolean z8);

    void c(a aVar);

    void d();

    void e();

    void f(Throwable th);

    void g();

    void h(boolean z8, Throwable th);

    void i(Throwable th);

    void j();

    void k();

    void l();
}
