package x2;

import androidx.browser.trusted.sharing.ShareTarget;
import java.io.OutputStream;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: x2.G, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3869G {

    /* renamed from: a, reason: collision with root package name */
    private Map f39101a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f39102b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: x2.G$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f39103b = new a(ShareTarget.METHOD_GET, 0, ShareTarget.METHOD_GET);

        /* renamed from: c, reason: collision with root package name */
        public static final a f39104c = new a(ShareTarget.METHOD_POST, 1, ShareTarget.METHOD_POST);

        /* renamed from: d, reason: collision with root package name */
        public static final a f39105d = new a("DELETE", 2, "DELETE");

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ a[] f39106e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ R5.a f39107f;

        /* renamed from: a, reason: collision with root package name */
        private final String f39108a;

        static {
            a[] a8 = a();
            f39106e = a8;
            f39107f = R5.b.a(a8);
        }

        private a(String str, int i8, String str2) {
            this.f39108a = str2;
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f39103b, f39104c, f39105d};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f39106e.clone();
        }

        public final String b() {
            return this.f39108a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: x2.G$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final b f39109b = new b("Form", 0, ShareTarget.ENCODING_TYPE_URL_ENCODED);

        /* renamed from: c, reason: collision with root package name */
        public static final b f39110c = new b("MultipartForm", 1, ShareTarget.ENCODING_TYPE_MULTIPART);

        /* renamed from: d, reason: collision with root package name */
        public static final b f39111d = new b("Json", 2, "application/json");

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ b[] f39112e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ R5.a f39113f;

        /* renamed from: a, reason: collision with root package name */
        private final String f39114a;

        static {
            b[] a8 = a();
            f39112e = a8;
            f39113f = R5.b.a(a8);
        }

        private b(String str, int i8, String str2) {
            this.f39114a = str2;
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f39109b, f39110c, f39111d};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f39112e.clone();
        }

        public final String b() {
            return this.f39114a;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f39114a;
        }
    }

    public abstract Map a();

    public abstract a b();

    public Map c() {
        return this.f39101a;
    }

    public abstract Iterable d();

    public boolean e() {
        return this.f39102b;
    }

    public abstract String f();

    public void g(OutputStream outputStream) {
        AbstractC3159y.i(outputStream, "outputStream");
    }
}
