package e4;

import L5.InterfaceC1227k;
import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3160z;
import x6.AbstractC3964y;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@t6.g
/* renamed from: e4.n0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC2624n0 {
    public static final b Companion;

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC1227k f30749a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC2624n0 f30750b = new EnumC2624n0("Text", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC2624n0 f30751c = new EnumC2624n0("Ascii", 1);

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC2624n0 f30752d = new EnumC2624n0("Number", 2);

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC2624n0 f30753e = new EnumC2624n0("Phone", 3);

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC2624n0 f30754f = new EnumC2624n0("Uri", 4);

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC2624n0 f30755g = new EnumC2624n0("Email", 5);

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC2624n0 f30756h = new EnumC2624n0("Password", 6);

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC2624n0 f30757i = new EnumC2624n0("NumberPassword", 7);

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ EnumC2624n0[] f30758j;

    /* renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ R5.a f30759k;

    /* renamed from: e4.n0$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f30760a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t6.b invoke() {
            return AbstractC3964y.a("com.stripe.android.ui.core.elements.KeyboardType", EnumC2624n0.values(), new String[]{MimeTypes.BASE_TYPE_TEXT, "ascii", "number", HintConstants.AUTOFILL_HINT_PHONE, "uri", NotificationCompat.CATEGORY_EMAIL, HintConstants.AUTOFILL_HINT_PASSWORD, "number_password"}, new Annotation[][]{null, null, null, null, null, null, null, null}, null);
        }
    }

    /* renamed from: e4.n0$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        private final /* synthetic */ t6.b a() {
            return (t6.b) EnumC2624n0.f30749a.getValue();
        }

        public final t6.b serializer() {
            return a();
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    static {
        EnumC2624n0[] a8 = a();
        f30758j = a8;
        f30759k = R5.b.a(a8);
        Companion = new b(null);
        f30749a = L5.l.a(L5.o.f6492b, a.f30760a);
    }

    private EnumC2624n0(String str, int i8) {
    }

    private static final /* synthetic */ EnumC2624n0[] a() {
        return new EnumC2624n0[]{f30750b, f30751c, f30752d, f30753e, f30754f, f30755g, f30756h, f30757i};
    }

    public static EnumC2624n0 valueOf(String str) {
        return (EnumC2624n0) Enum.valueOf(EnumC2624n0.class, str);
    }

    public static EnumC2624n0[] values() {
        return (EnumC2624n0[]) f30758j.clone();
    }
}
