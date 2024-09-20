package O7;

import E6.f;
import H7.g;
import L7.j;
import L7.k;
import L7.m;
import L7.o;
import L7.q;
import L7.s;
import L7.u;
import L7.v;
import L7.w;
import L7.x;
import M7.l;
import android.app.Application;
import android.net.ConnectivityManager;
import androidx.core.os.ConfigurationCompat;
import com.inmobi.cmp.ChoiceCmp;
import com.inmobi.cmp.data.model.ChoiceStyle;
import com.inmobi.cmp.data.storage.SharedStorage;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3159y;
import r1.C3680a;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: A, reason: collision with root package name */
    public static k f7791A;

    /* renamed from: B, reason: collision with root package name */
    public static s f7792B;

    /* renamed from: b, reason: collision with root package name */
    public static Application f7794b;

    /* renamed from: c, reason: collision with root package name */
    public static K7.a f7795c;

    /* renamed from: e, reason: collision with root package name */
    public static J7.b f7797e;

    /* renamed from: f, reason: collision with root package name */
    public static J7.c f7798f;

    /* renamed from: g, reason: collision with root package name */
    public static y5.s f7799g;

    /* renamed from: h, reason: collision with root package name */
    public static f f7800h;

    /* renamed from: i, reason: collision with root package name */
    public static SharedStorage f7801i;

    /* renamed from: j, reason: collision with root package name */
    public static K7.b f7802j;

    /* renamed from: k, reason: collision with root package name */
    public static g f7803k;

    /* renamed from: l, reason: collision with root package name */
    public static G5.c f7804l;

    /* renamed from: m, reason: collision with root package name */
    public static C6.a f7805m;

    /* renamed from: o, reason: collision with root package name */
    public static C3680a f7807o;

    /* renamed from: p, reason: collision with root package name */
    public static M7.c f7808p;

    /* renamed from: q, reason: collision with root package name */
    public static q f7809q;

    /* renamed from: r, reason: collision with root package name */
    public static L7.c f7810r;

    /* renamed from: s, reason: collision with root package name */
    public static L7.f f7811s;

    /* renamed from: t, reason: collision with root package name */
    public static j f7812t;

    /* renamed from: u, reason: collision with root package name */
    public static u f7813u;

    /* renamed from: v, reason: collision with root package name */
    public static w f7814v;

    /* renamed from: w, reason: collision with root package name */
    public static m f7815w;

    /* renamed from: x, reason: collision with root package name */
    public static o f7816x;

    /* renamed from: y, reason: collision with root package name */
    public static L7.g f7817y;

    /* renamed from: z, reason: collision with root package name */
    public static L7.a f7818z;

    /* renamed from: a, reason: collision with root package name */
    public static final d f7793a = new d();

    /* renamed from: d, reason: collision with root package name */
    public static ChoiceStyle f7796d = new ChoiceStyle();

    /* renamed from: n, reason: collision with root package name */
    public static String f7806n = "";

    public final Locale a() {
        if (f7794b != null) {
            Locale locale = ConfigurationCompat.getLocales(b().getResources().getConfiguration()).get(0);
            if (locale == null) {
                locale = Locale.US;
            }
            AbstractC3159y.h(locale, "{\n            Configurat…0] ?: Locale.US\n        }");
            return locale;
        }
        Locale locale2 = Locale.US;
        AbstractC3159y.h(locale2, "{\n            Locale.US\n        }");
        return locale2;
    }

    public final Application b() {
        Application application = f7794b;
        if (application != null) {
            return application;
        }
        AbstractC3159y.y(MimeTypes.BASE_TYPE_APPLICATION);
        return null;
    }

    public final L7.f c() {
        if (f7811s == null) {
            f7811s = new L7.f(m(), n(), ChoiceCmp.INSTANCE.getCallback());
        }
        L7.f fVar = f7811s;
        if (fVar == null) {
            AbstractC3159y.y("consentRepository_");
            return null;
        }
        return fVar;
    }

    public final M7.c d() {
        if (f7808p == null) {
            f7808p = new M7.c();
        }
        M7.c cVar = f7808p;
        if (cVar == null) {
            AbstractC3159y.y("coreUiLabelsResolver");
            return null;
        }
        return cVar;
    }

    public final G5.c e() {
        G5.c cVar = f7804l;
        if (cVar == null) {
            return new G5.c(null, null, null, 7);
        }
        return cVar;
    }

    public final j f() {
        if (f7812t == null) {
            f7812t = new j(m(), ChoiceCmp.INSTANCE.getCallback());
        }
        j jVar = f7812t;
        if (jVar == null) {
            AbstractC3159y.y("gbcConsentRepository_");
            return null;
        }
        return jVar;
    }

    public final C3680a g() {
        if (f7807o == null) {
            f7807o = new C3680a();
        }
        C3680a c3680a = f7807o;
        if (c3680a == null) {
            AbstractC3159y.y("gppModel");
            return null;
        }
        return c3680a;
    }

    public final C6.a h() {
        C6.a aVar = f7805m;
        if (aVar == null) {
            return new C6.a(null, null, null, null, 15);
        }
        return aVar;
    }

    public final K7.a i() {
        if (f7795c == null) {
            Object systemService = b().getSystemService("connectivity");
            if (systemService != null) {
                f7795c = new K7.a((ConnectivityManager) systemService);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
            }
        }
        K7.a aVar = f7795c;
        if (aVar == null) {
            AbstractC3159y.y("networkUtil_");
            return null;
        }
        return aVar;
    }

    public final f j() {
        f fVar = f7800h;
        if (fVar == null) {
            return new f(null, null, null, null, null, null, 63);
        }
        return fVar;
    }

    public final u k() {
        if (f7813u == null) {
            K7.a i8 = i();
            SharedStorage m8 = m();
            K7.b l8 = l();
            ChoiceCmp choiceCmp = ChoiceCmp.INSTANCE;
            f7813u = new v(i8, m8, l8, new l(choiceCmp.getCallback(), d()), choiceCmp.getAppPackageId(), choiceCmp.getPCode());
        }
        u uVar = f7813u;
        if (uVar == null) {
            AbstractC3159y.y("portalConfigRepository_");
            return null;
        }
        return uVar;
    }

    public final K7.b l() {
        if (f7802j == null) {
            f7802j = new K7.c();
        }
        K7.b bVar = f7802j;
        if (bVar == null) {
            AbstractC3159y.y("requestApi_");
            return null;
        }
        return bVar;
    }

    public final SharedStorage m() {
        if (f7801i == null) {
            f7801i = new SharedStorage(b());
        }
        SharedStorage sharedStorage = f7801i;
        if (sharedStorage == null) {
            AbstractC3159y.y("storage_");
            return null;
        }
        return sharedStorage;
    }

    public final y5.s n() {
        if (f7799g == null) {
            f7799g = new y5.s(null);
        }
        y5.s sVar = f7799g;
        if (sVar == null) {
            AbstractC3159y.y("tcModel");
            return null;
        }
        return sVar;
    }

    public final g o() {
        E6.a aVar;
        if (f7803k == null) {
            y5.s n8 = n();
            ChoiceCmp choiceCmp = ChoiceCmp.INSTANCE;
            f portalConfig$app_release = choiceCmp.getPortalConfig$app_release();
            if (portalConfig$app_release == null) {
                aVar = null;
            } else {
                aVar = portalConfig$app_release.f2373b;
            }
            f7803k = new g(n8, aVar, i(), l(), choiceCmp.getCallback(), choiceCmp.getAppPackageId());
        }
        g gVar = f7803k;
        if (gVar == null) {
            AbstractC3159y.y("tracking");
            return null;
        }
        return gVar;
    }

    public final w p() {
        if (f7814v == null) {
            f7814v = new x(a(), i(), m(), l(), new M7.m(d()));
        }
        w wVar = f7814v;
        if (wVar == null) {
            AbstractC3159y.y("translationsTextRepository_");
            return null;
        }
        return wVar;
    }
}
