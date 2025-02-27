package X4;

import android.content.Context;
import android.content.res.Resources;
import com.uptodown.activities.preferences.SettingsPreferences;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONObject;

/* renamed from: X4.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1500j extends AbstractC1493c {

    /* renamed from: n, reason: collision with root package name */
    public static final a f12617n = new a(null);

    /* renamed from: k, reason: collision with root package name */
    private final long f12618k;

    /* renamed from: l, reason: collision with root package name */
    private final String f12619l;

    /* renamed from: m, reason: collision with root package name */
    private String f12620m;

    /* renamed from: X4.j$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final void a(Context context) {
            AbstractC3159y.i(context, "context");
            SettingsPreferences.f29309b.a(context);
        }

        public final boolean b(Context context, long j8) {
            AbstractC3159y.i(context, "context");
            if (j8 > -1) {
                return AbstractC1493c.f12472j.a(d(context), j8);
            }
            return false;
        }

        public final C1500j c(JSONObject jsonObjectData) {
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
            return new C1500j(j8, str2, str);
        }

        public final C1500j d(Context context) {
            AbstractC3159y.i(context, "context");
            return SettingsPreferences.f29309b.g(context);
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1500j(long j8, String packageName, String imageUrl) {
        super(j8, packageName, imageUrl, "banner");
        AbstractC3159y.i(packageName, "packageName");
        AbstractC3159y.i(imageUrl, "imageUrl");
        this.f12618k = j8;
        this.f12619l = packageName;
        this.f12620m = imageUrl;
    }

    public final String A(Resources resources) {
        AbstractC3159y.i(resources, "resources");
        return n();
    }

    public void B(String str) {
        AbstractC3159y.i(str, "<set-?>");
        this.f12620m = str;
    }

    @Override // X4.AbstractC1493c
    public long k() {
        return this.f12618k;
    }

    @Override // X4.AbstractC1493c
    public String n() {
        return this.f12620m;
    }

    @Override // X4.AbstractC1493c
    public String r() {
        return this.f12619l;
    }

    @Override // X4.AbstractC1493c
    public void t(Context context) {
        AbstractC3159y.i(context, "context");
        SettingsPreferences.f29309b.q0(context, this);
    }
}
