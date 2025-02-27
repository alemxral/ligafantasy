package K4;

import android.os.Build;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import java.io.File;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private File f5947a;

    /* renamed from: b, reason: collision with root package name */
    private String f5948b;

    /* renamed from: c, reason: collision with root package name */
    private String f5949c;

    /* renamed from: d, reason: collision with root package name */
    private String f5950d;

    /* renamed from: e, reason: collision with root package name */
    private long f5951e;

    /* renamed from: f, reason: collision with root package name */
    private String f5952f;

    private final void b(JSONObject jSONObject) {
        try {
            if (!jSONObject.isNull("name")) {
                this.f5948b = jSONObject.getString("name");
            }
            if (!jSONObject.isNull("sha256")) {
                this.f5949c = jSONObject.getString("sha256");
            }
            if (!jSONObject.isNull(RewardPlus.ICON)) {
                this.f5950d = jSONObject.getString(RewardPlus.ICON);
            }
            if (!jSONObject.isNull("size")) {
                this.f5951e = jSONObject.getLong("size");
            }
            if (!jSONObject.isNull("senderDeviceName")) {
                this.f5952f = jSONObject.getString("senderDeviceName");
            }
        } catch (JSONException e8) {
            e8.printStackTrace();
        }
    }

    public final void a(File f8) {
        AbstractC3159y.i(f8, "f");
        this.f5947a = f8;
        this.f5948b = f8.getName();
        this.f5949c = N4.d.f7188a.e(f8.getAbsolutePath());
        this.f5951e = f8.length();
        this.f5952f = Build.MANUFACTURER + ' ' + Build.MODEL;
    }

    public final void c(String json) {
        AbstractC3159y.i(json, "json");
        b(new JSONObject(json));
    }

    public final File d() {
        return this.f5947a;
    }

    public final String e() {
        return this.f5948b;
    }

    public final String f() {
        return this.f5952f;
    }

    public final String g() {
        return this.f5949c;
    }

    public final long h() {
        return this.f5951e;
    }

    public final String i() {
        try {
            JSONObject jSONObject = new JSONObject();
            String str = this.f5948b;
            if (str != null) {
                jSONObject.put("name", str);
            }
            String str2 = this.f5949c;
            if (str2 != null) {
                jSONObject.put("sha256", str2);
            }
            String str3 = this.f5950d;
            if (str3 != null) {
                jSONObject.put(RewardPlus.ICON, str3);
            }
            long j8 = this.f5951e;
            if (j8 > 0) {
                jSONObject.put("size", j8);
            }
            String str4 = this.f5952f;
            if (str4 != null) {
                jSONObject.put("senderDeviceName", str4);
            }
            return jSONObject.toString(2);
        } catch (JSONException e8) {
            e8.printStackTrace();
            return null;
        }
    }
}
