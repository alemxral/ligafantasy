package b3;

import androidx.core.os.EnvironmentCompat;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: b3.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC1871f {

    /* renamed from: b, reason: collision with root package name */
    public static final a f14448b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC1871f f14449c = new EnumC1871f("Credit", 0, "credit");

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1871f f14450d = new EnumC1871f("Debit", 1, "debit");

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC1871f f14451e = new EnumC1871f("Prepaid", 2, "prepaid");

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC1871f f14452f = new EnumC1871f("Unknown", 3, EnvironmentCompat.MEDIA_UNKNOWN);

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumC1871f[] f14453g;

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ R5.a f14454h;

    /* renamed from: a, reason: collision with root package name */
    private final String f14455a;

    /* renamed from: b3.f$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final EnumC1871f a(String str) {
            Object obj;
            Iterator<E> it = EnumC1871f.c().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (AbstractC3159y.d(((EnumC1871f) obj).b(), str)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            return (EnumC1871f) obj;
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    static {
        EnumC1871f[] a8 = a();
        f14453g = a8;
        f14454h = R5.b.a(a8);
        f14448b = new a(null);
    }

    private EnumC1871f(String str, int i8, String str2) {
        this.f14455a = str2;
    }

    private static final /* synthetic */ EnumC1871f[] a() {
        return new EnumC1871f[]{f14449c, f14450d, f14451e, f14452f};
    }

    public static R5.a c() {
        return f14454h;
    }

    public static EnumC1871f valueOf(String str) {
        return (EnumC1871f) Enum.valueOf(EnumC1871f.class, str);
    }

    public static EnumC1871f[] values() {
        return (EnumC1871f[]) f14453g.clone();
    }

    public final String b() {
        return this.f14455a;
    }
}
