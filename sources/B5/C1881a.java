package b5;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import androidx.autofill.HintConstants;
import c5.AbstractC1928c;
import c5.C1930e;
import c5.k;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: b5.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1881a {

    /* renamed from: i, reason: collision with root package name */
    public static final C0363a f14760i = new C0363a(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f14761a;

    /* renamed from: b, reason: collision with root package name */
    public final long f14762b;

    /* renamed from: c, reason: collision with root package name */
    public final long f14763c;

    /* renamed from: d, reason: collision with root package name */
    public final String f14764d;

    /* renamed from: e, reason: collision with root package name */
    public final String f14765e;

    /* renamed from: f, reason: collision with root package name */
    public final int f14766f;

    /* renamed from: g, reason: collision with root package name */
    public final int f14767g;

    /* renamed from: h, reason: collision with root package name */
    public final String f14768h;

    /* renamed from: b5.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0363a {
        public C0363a(AbstractC3151p abstractC3151p) {
        }
    }

    /* renamed from: b5.a$b */
    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f14769a = Build.MODEL;

        /* renamed from: b, reason: collision with root package name */
        public final String f14770b = Build.MANUFACTURER;

        /* renamed from: c, reason: collision with root package name */
        public final String f14771c = Build.BRAND;

        public final JSONObject a() {
            JSONObject jSONObject = new JSONObject();
            String str = this.f14769a;
            if (str != null && str.length() != 0) {
                jSONObject.put("model", this.f14769a);
            }
            String str2 = this.f14770b;
            if (str2 != null && str2.length() != 0) {
                jSONObject.put("manufacturer", this.f14770b);
            }
            String str3 = this.f14771c;
            if (str3 != null && str3.length() != 0) {
                jSONObject.put("brand", this.f14771c);
            }
            if (jSONObject.length() > 0) {
                return jSONObject;
            }
            return null;
        }
    }

    public C1881a(Context context, String token) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(token, "token");
        this.f14761a = token;
        this.f14762b = -1L;
        this.f14763c = -1L;
        this.f14762b = new C1930e(context).a();
        String country = Locale.getDefault().getCountry();
        this.f14764d = country;
        if (country == null || country.length() == 0) {
            Object systemService = context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
            AbstractC3159y.g(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            this.f14764d = ((TelephonyManager) systemService).getNetworkCountryIso();
        }
        k kVar = k.f14978a;
        String packageName = context.getPackageName();
        AbstractC3159y.h(packageName, "context.packageName");
        this.f14765e = kVar.a(context, packageName);
        try {
            PackageManager packageManager = context.getPackageManager();
            AbstractC3159y.h(packageManager, "context.packageManager");
            String packageName2 = context.getPackageName();
            AbstractC3159y.h(packageName2, "context.packageName");
            PackageInfo a8 = AbstractC1928c.a(packageManager, packageName2, 0);
            this.f14763c = kVar.e(a8);
            if (kVar.g(a8)) {
                this.f14767g = 1;
            } else {
                this.f14767g = 0;
            }
        } catch (PackageManager.NameNotFoundException e8) {
            e8.printStackTrace();
        }
        long j8 = this.f14763c;
        long j9 = this.f14762b;
        if (j8 > j9) {
            if (j9 == -1) {
                this.f14766f = 0;
            } else {
                this.f14766f = 1;
            }
        } else {
            this.f14766f = 0;
        }
        this.f14768h = Locale.getDefault().getLanguage();
    }

    public final JSONObject a(Context context) {
        boolean z8;
        AbstractC3159y.i(context, "context");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("token", this.f14761a);
        jSONObject.put("sdkVersion", Build.VERSION.SDK_INT);
        String str = this.f14764d;
        if (str != null && str.length() != 0) {
            String str2 = this.f14764d;
            AbstractC3159y.f(str2);
            String upperCase = str2.toUpperCase(Locale.ROOT);
            AbstractC3159y.h(upperCase, "toUpperCase(...)");
            jSONObject.put("countryCode", upperCase);
        }
        String str3 = this.f14765e;
        if (str3 != null && str3.length() != 0) {
            jSONObject.put("installer", this.f14765e);
        }
        jSONObject.put("update", this.f14766f);
        jSONObject.put("isSystemApp", this.f14767g);
        JSONObject a8 = new b().a();
        if (a8 != null) {
            jSONObject.put("device", a8);
        }
        String[] strArr = Build.SUPPORTED_ABIS;
        if (strArr != null) {
            if (strArr.length == 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (!z8) {
                JSONArray jSONArray = new JSONArray();
                for (String str4 : strArr) {
                    jSONArray.put(str4);
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put("abis", jSONArray);
                }
            }
        }
        String str5 = this.f14768h;
        if (str5 != null && str5.length() != 0) {
            jSONObject.put("deviceLanguageCode", this.f14768h);
        }
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (string != null) {
            jSONObject.put("identifier", string);
        }
        return jSONObject;
    }
}
