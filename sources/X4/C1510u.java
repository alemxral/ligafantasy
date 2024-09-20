package X4;

import android.content.Context;
import android.content.res.Resources;
import com.uptodown.activities.preferences.SettingsPreferences;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONObject;

/* renamed from: X4.u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1510u extends AbstractC1493c {

    /* renamed from: n, reason: collision with root package name */
    public static final a f12703n = new a(null);

    /* renamed from: k, reason: collision with root package name */
    private final long f12704k;

    /* renamed from: l, reason: collision with root package name */
    private final String f12705l;

    /* renamed from: m, reason: collision with root package name */
    private String f12706m;

    /* renamed from: X4.u$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final void a(Context context) {
            AbstractC3159y.i(context, "context");
            SettingsPreferences.f29309b.b(context);
        }

        public final boolean b(Context context, long j8) {
            AbstractC3159y.i(context, "context");
            if (j8 > -1) {
                return AbstractC1493c.f12472j.a(d(context), j8);
            }
            return false;
        }

        public final C1510u c(JSONObject jsonObjectData) {
            String str;
            String str2;
            long j8;
            AbstractC3159y.i(jsonObjectData, "jsonObjectData");
            if (!jsonObjectData.isNull("imgURL")) {
                str = jsonObjectData.getString("imgURL");
                com.squareup.picasso.s.h().l(str).d();
            } else {
                str = null;
            }
            if (!jsonObjectData.isNull("packageName")) {
                str2 = jsonObjectData.getString("packageName");
            } else {
                str2 = null;
            }
            if (!jsonObjectData.isNull("appID")) {
                j8 = jsonObjectData.getLong("appID");
            } else {
                j8 = -1;
            }
            if (j8 <= -1 || str2 == null || str == null) {
                return null;
            }
            return new C1510u(j8, str2, str);
        }

        public final C1510u d(Context context) {
            AbstractC3159y.i(context, "context");
            return SettingsPreferences.f29309b.p(context);
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1510u(long j8, String packageName, String imageUrl) {
        super(j8, packageName, imageUrl, "interstitial");
        AbstractC3159y.i(packageName, "packageName");
        AbstractC3159y.i(imageUrl, "imageUrl");
        this.f12704k = j8;
        this.f12705l = packageName;
        this.f12706m = imageUrl;
    }

    public final String A(Resources resources) {
        AbstractC3159y.i(resources, "resources");
        return n();
    }

    public void B(String str) {
        AbstractC3159y.i(str, "<set-?>");
        this.f12706m = str;
    }

    @Override // X4.AbstractC1493c
    public long k() {
        return this.f12704k;
    }

    @Override // X4.AbstractC1493c
    public String n() {
        return this.f12706m;
    }

    @Override // X4.AbstractC1493c
    public String r() {
        return this.f12705l;
    }

    @Override // X4.AbstractC1493c
    public void t(Context context) {
        AbstractC3159y.i(context, "context");
        SettingsPreferences.f29309b.r0(context, this);
    }
}
