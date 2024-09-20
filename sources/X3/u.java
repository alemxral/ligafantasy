package X3;

import androidx.exifinterface.media.ExifInterface;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class u {

    /* renamed from: b, reason: collision with root package name */
    public static final a f12292b;

    /* renamed from: c, reason: collision with root package name */
    public static final u f12293c = new u("VerificationSuccessful", 0, "Y");

    /* renamed from: d, reason: collision with root package name */
    public static final u f12294d = new u("VerificationDenied", 1, "N");

    /* renamed from: e, reason: collision with root package name */
    public static final u f12295e = new u("VerificationNotPerformed", 2, "U");

    /* renamed from: f, reason: collision with root package name */
    public static final u f12296f = new u("VerificationAttempted", 3, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS);

    /* renamed from: g, reason: collision with root package name */
    public static final u f12297g = new u("ChallengeAdditionalAuth", 4, "C");

    /* renamed from: h, reason: collision with root package name */
    public static final u f12298h = new u("ChallengeDecoupledAuth", 5, "D");

    /* renamed from: i, reason: collision with root package name */
    public static final u f12299i = new u("VerificationRejected", 6, "R");

    /* renamed from: j, reason: collision with root package name */
    public static final u f12300j = new u("InformationOnly", 7, "I");

    /* renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ u[] f12301k;

    /* renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ R5.a f12302l;

    /* renamed from: a, reason: collision with root package name */
    private final String f12303a;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final u a(String str) {
            Object obj = null;
            if (str == null) {
                return null;
            }
            Iterator<E> it = u.c().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (AbstractC3159y.d(((u) next).b(), str)) {
                    obj = next;
                    break;
                }
            }
            return (u) obj;
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    static {
        u[] a8 = a();
        f12301k = a8;
        f12302l = R5.b.a(a8);
        f12292b = new a(null);
    }

    private u(String str, int i8, String str2) {
        this.f12303a = str2;
    }

    private static final /* synthetic */ u[] a() {
        return new u[]{f12293c, f12294d, f12295e, f12296f, f12297g, f12298h, f12299i, f12300j};
    }

    public static R5.a c() {
        return f12302l;
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f12301k.clone();
    }

    public final String b() {
        return this.f12303a;
    }
}
