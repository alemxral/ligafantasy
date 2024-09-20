package X4;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import androidx.work.WorkManager;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.preferences.SettingsPreferences;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.Y;
import l5.C3333u;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class Q implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private String f12425a;

    /* renamed from: b, reason: collision with root package name */
    private String f12426b;

    /* renamed from: c, reason: collision with root package name */
    private String f12427c;

    /* renamed from: d, reason: collision with root package name */
    private String f12428d;

    /* renamed from: e, reason: collision with root package name */
    private String f12429e;

    /* renamed from: f, reason: collision with root package name */
    private long f12430f;

    /* renamed from: g, reason: collision with root package name */
    private String f12431g;

    /* renamed from: h, reason: collision with root package name */
    private String f12432h;

    /* renamed from: i, reason: collision with root package name */
    private String f12433i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f12434j;

    /* renamed from: k, reason: collision with root package name */
    public static final b f12424k = new b(null);
    public static Parcelable.Creator<Q> CREATOR = new a();

    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Q createFromParcel(Parcel source) {
            AbstractC3159y.i(source, "source");
            return new Q(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Q[] newArray(int i8) {
            return new Q[i8];
        }
    }

    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public final void a(Context context) {
            AbstractC3159y.i(context, "context");
            b(context);
            SettingsPreferences.f29309b.j1(context, null);
            UptodownApp.a aVar = UptodownApp.f27990B;
            if (aVar.W("PreRegisterWorker", context)) {
                WorkManager.getInstance(context).cancelAllWorkByTag("PreRegisterWorker");
            }
            if (aVar.W("GetUserDataWorker", context)) {
                WorkManager.getInstance(context).cancelAllWorkByTag("GetUserDataWorker");
            }
            D.f12322f.a(context);
            new C3333u().f(context);
        }

        public final void b(Context context) {
            AbstractC3159y.i(context, "context");
            SharedPreferences.Editor edit = context.getSharedPreferences("SharedPreferencesUser", 0).edit();
            edit.remove("user_id");
            edit.remove("user_email");
            edit.remove("user_name");
            edit.remove("user_picture");
            edit.remove("registered_timestamp");
            edit.remove("is_turbo");
            edit.remove("username_format");
            edit.apply();
            SettingsPreferences.f29309b.l1(context, false);
        }

        public final String c(String str) {
            if (str != null) {
                return str + UptodownApp.f27990B.t() + ":webp";
            }
            return null;
        }

        public final String d(String str) {
            if (str != null) {
                return str + UptodownApp.f27990B.m() + ":webp";
            }
            return null;
        }

        public final Q e(Context context) {
            Q q8;
            AbstractC3159y.i(context, "context");
            SharedPreferences sharedPreferences = context.getSharedPreferences("SharedPreferencesUser", 0);
            if (sharedPreferences.contains("user_id")) {
                q8 = new Q();
                q8.V(sharedPreferences.getString("user_id", null));
            } else {
                q8 = null;
            }
            if (sharedPreferences.contains("user_email")) {
                if (q8 == null) {
                    q8 = new Q();
                }
                q8.T(sharedPreferences.getString("user_email", null));
            }
            if (sharedPreferences.contains("user_name")) {
                if (q8 == null) {
                    q8 = new Q();
                }
                q8.X(sharedPreferences.getString("user_name", null));
            }
            if (q8 != null) {
                if (sharedPreferences.contains("user_picture")) {
                    q8.Q(sharedPreferences.getString("user_picture", null));
                }
                if (sharedPreferences.contains("registered_timestamp")) {
                    q8.Y(sharedPreferences.getLong("registered_timestamp", -1L));
                }
                if (sharedPreferences.contains("is_turbo")) {
                    q8.Z(sharedPreferences.getString("is_turbo", null));
                }
                if (sharedPreferences.contains("username_format")) {
                    q8.a0(sharedPreferences.getString("username_format", "type0"));
                }
            }
            return q8;
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public Q() {
        this.f12430f = -1L;
        this.f12431g = "type0";
    }

    public final boolean G() {
        boolean z8;
        String str = this.f12433i;
        if (str != null && str.length() != 0) {
            z8 = false;
        } else {
            z8 = true;
        }
        return !z8;
    }

    public final boolean I() {
        return this.f12434j;
    }

    public final void L(Context context) {
        AbstractC3159y.i(context, "context");
        SharedPreferences.Editor edit = context.getSharedPreferences("SharedPreferencesUser", 0).edit();
        edit.putString("user_id", this.f12425a);
        edit.putString("user_email", this.f12426b);
        edit.putString("user_picture", this.f12427c);
        edit.putString("user_name", this.f12428d);
        edit.putLong("registered_timestamp", this.f12430f);
        edit.putString("is_turbo", this.f12433i);
        edit.putString("username_format", this.f12431g);
        edit.apply();
    }

    public final void Q(String str) {
        this.f12427c = str;
    }

    public final void T(String str) {
        this.f12426b = str;
    }

    public final void V(String str) {
        this.f12425a = str;
    }

    public final void X(String str) {
        this.f12428d = str;
    }

    public final void Y(long j8) {
        this.f12430f = j8;
    }

    public final void Z(String str) {
        this.f12433i = str;
    }

    public final void a0(String str) {
        this.f12431g = str;
    }

    public final String b(Context context) {
        String string;
        String string2;
        String string3;
        AbstractC3159y.i(context, "context");
        long j8 = 1000;
        long currentTimeMillis = (System.currentTimeMillis() / j8) - this.f12430f;
        if (currentTimeMillis == 1) {
            string = context.getString(R.string.unit_time_second);
            AbstractC3159y.h(string, "context.getString(R.string.unit_time_second)");
        } else {
            string = context.getString(R.string.unit_time_seconds);
            AbstractC3159y.h(string, "context.getString(R.string.unit_time_seconds)");
        }
        if (currentTimeMillis >= 60) {
            long j9 = 60;
            currentTimeMillis /= j9;
            if (currentTimeMillis == 1) {
                string = context.getString(R.string.unit_time_minute);
                AbstractC3159y.h(string, "context.getString(R.string.unit_time_minute)");
            } else {
                string = context.getString(R.string.unit_time_minutes);
                AbstractC3159y.h(string, "context.getString(R.string.unit_time_minutes)");
            }
            if (currentTimeMillis >= 60) {
                currentTimeMillis /= j9;
                if (currentTimeMillis == 1) {
                    string2 = context.getString(R.string.unit_time_hour);
                    AbstractC3159y.h(string2, "context.getString(R.string.unit_time_hour)");
                } else {
                    string2 = context.getString(R.string.unit_time_hours);
                    AbstractC3159y.h(string2, "context.getString(R.string.unit_time_hours)");
                }
                string = string2;
                if (currentTimeMillis >= 24) {
                    currentTimeMillis /= 24;
                    if (currentTimeMillis == 1) {
                        string3 = context.getString(R.string.unit_time_day);
                        AbstractC3159y.h(string3, "context.getString(R.string.unit_time_day)");
                    } else {
                        string3 = context.getString(R.string.unit_time_days);
                        AbstractC3159y.h(string3, "context.getString(R.string.unit_time_days)");
                    }
                    string = string3;
                    if (8 <= currentTimeMillis && currentTimeMillis < 30) {
                        currentTimeMillis /= 7;
                        if (currentTimeMillis == 1) {
                            string = context.getString(R.string.unit_time_week);
                            AbstractC3159y.h(string, "context.getString(R.string.unit_time_week)");
                        } else {
                            string = context.getString(R.string.unit_time_weeks);
                            AbstractC3159y.h(string, "context.getString(R.string.unit_time_weeks)");
                        }
                    } else if (31 <= currentTimeMillis && currentTimeMillis < 365) {
                        currentTimeMillis /= 30;
                        if (currentTimeMillis == 1) {
                            string = context.getString(R.string.unit_time_month);
                            AbstractC3159y.h(string, "context.getString(R.string.unit_time_month)");
                        } else {
                            string = context.getString(R.string.unit_time_months);
                            AbstractC3159y.h(string, "context.getString(R.string.unit_time_months)");
                        }
                    } else if (currentTimeMillis > 365) {
                        String format = new SimpleDateFormat("yyyy", Locale.getDefault()).format(new Date(this.f12430f * j8));
                        Y y8 = Y.f33752a;
                        String string4 = context.getString(R.string.in_year);
                        AbstractC3159y.h(string4, "context.getString(R.string.in_year)");
                        String format2 = String.format(string4, Arrays.copyOf(new Object[]{format}, 1));
                        AbstractC3159y.h(format2, "format(...)");
                        return format2;
                    }
                }
            }
        }
        if (currentTimeMillis == 0) {
            String string5 = context.getString(R.string.time_now);
            AbstractC3159y.h(string5, "context.getString(R.string.time_now)");
            return string5;
        }
        Y y9 = Y.f33752a;
        String string6 = context.getString(R.string.time_ago);
        AbstractC3159y.h(string6, "context.getString(R.string.time_ago)");
        String format3 = String.format(string6, Arrays.copyOf(new Object[]{Long.valueOf(currentTimeMillis), string}, 2));
        AbstractC3159y.h(format3, "format(...)");
        return format3;
    }

    public final String c() {
        return this.f12427c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return hashCode();
    }

    public final String e() {
        if (this.f12427c != null) {
            StringBuilder sb = new StringBuilder();
            String str = this.f12427c;
            AbstractC3159y.f(str);
            sb.append(str);
            sb.append(UptodownApp.f27990B.l());
            sb.append(":webp");
            return sb.toString();
        }
        return null;
    }

    public final String f() {
        return f12424k.d(this.f12427c);
    }

    public final String getId() {
        return this.f12425a;
    }

    public final void i(JSONObject jsonObject) {
        AbstractC3159y.i(jsonObject, "jsonObject");
        if (!jsonObject.isNull(HintConstants.AUTOFILL_HINT_USERNAME)) {
            this.f12428d = jsonObject.getString(HintConstants.AUTOFILL_HINT_USERNAME);
        }
        if (!jsonObject.isNull("registeredTimeAgo")) {
            this.f12432h = jsonObject.getString("registeredTimeAgo");
        }
        if (!jsonObject.isNull("avatar")) {
            this.f12427c = jsonObject.getString("avatar");
        }
        if (!jsonObject.isNull("isTurbo")) {
            boolean z8 = true;
            if (jsonObject.getInt("isTurbo") != 1) {
                z8 = false;
            }
            this.f12434j = z8;
        }
        if (!jsonObject.isNull("usernameFormat")) {
            this.f12431g = jsonObject.getString("usernameFormat");
        }
    }

    public final void j(Context context, JSONObject jsonObject) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(jsonObject, "jsonObject");
        if (!jsonObject.isNull("udata")) {
            JSONObject jSONObject = jsonObject.getJSONObject("udata");
            if (!jSONObject.isNull("id")) {
                this.f12425a = jSONObject.getString("id");
            }
            if (!jSONObject.isNull(HintConstants.AUTOFILL_HINT_USERNAME)) {
                this.f12428d = jSONObject.getString(HintConstants.AUTOFILL_HINT_USERNAME);
            }
            if (!jSONObject.isNull("avatar")) {
                this.f12427c = jSONObject.getString("avatar");
            }
            if (!jSONObject.isNull("registeredTimestamp")) {
                this.f12430f = jSONObject.getLong("registeredTimestamp");
            }
            if (!jSONObject.isNull("usernameFormat")) {
                String string = jSONObject.getString("usernameFormat");
                AbstractC3159y.h(string, "jsonUser.getString(Const…es.FIELD_USERNAME_FORMAT)");
                if (string.length() > 0) {
                    this.f12431g = jSONObject.getString("usernameFormat");
                }
            }
        }
        if (!jsonObject.isNull("utoken")) {
            SettingsPreferences.f29309b.j1(context, jsonObject.getString("utoken"));
        } else {
            f12424k.b(context);
        }
        if (!jsonObject.isNull("turboToken")) {
            this.f12433i = jsonObject.getString("turboToken");
        }
    }

    public final String k() {
        return this.f12426b;
    }

    public final String n() {
        return this.f12428d;
    }

    public final String o() {
        return this.f12432h;
    }

    public final long s() {
        return this.f12430f;
    }

    public final String u() {
        return this.f12431g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        AbstractC3159y.i(parcel, "parcel");
        parcel.writeString(this.f12425a);
        parcel.writeString(this.f12426b);
        parcel.writeString(this.f12427c);
        parcel.writeString(this.f12428d);
        parcel.writeString(this.f12429e);
        parcel.writeString(this.f12433i);
        parcel.writeString(this.f12431g);
        parcel.writeLong(this.f12430f);
    }

    public final boolean z(Context context) {
        AbstractC3159y.i(context, "context");
        if (SettingsPreferences.f29309b.J(context) != null) {
            return true;
        }
        return false;
    }

    public Q(Parcel source) {
        AbstractC3159y.i(source, "source");
        this.f12430f = -1L;
        this.f12431g = "type0";
        this.f12425a = source.readString();
        this.f12426b = source.readString();
        this.f12427c = source.readString();
        this.f12428d = source.readString();
        this.f12429e = source.readString();
        this.f12433i = source.readString();
        this.f12431g = source.readString();
        this.f12430f = source.readLong();
    }
}
