package E1;

import F1.b;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import y1.EnumC3977j;

/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private static WindowManager f1919a;

    /* renamed from: b, reason: collision with root package name */
    private static String[] f1920b = {"x", "y", "width", "height"};

    /* renamed from: c, reason: collision with root package name */
    static float f1921c = Resources.getSystem().getDisplayMetrics().density;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1922a;

        static {
            int[] iArr = new int[EnumC3977j.values().length];
            f1922a = iArr;
            try {
                iArr[EnumC3977j.NOT_DETECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        final float f1923a;

        /* renamed from: b, reason: collision with root package name */
        final float f1924b;

        b(float f8, float f9) {
            this.f1923a = f8;
            this.f1924b = f9;
        }
    }

    static float a(int i8) {
        return i8 / f1921c;
    }

    private static b b(JSONObject jSONObject) {
        float f8;
        float f9;
        if (f1919a != null) {
            Point point = new Point(0, 0);
            f1919a.getDefaultDisplay().getRealSize(point);
            f8 = a(point.x);
            f9 = a(point.y);
        } else {
            f8 = 0.0f;
            f9 = 0.0f;
        }
        return new b(f8, f9);
    }

    public static JSONObject c(int i8, int i9, int i10, int i11) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", a(i8));
            jSONObject.put("y", a(i9));
            jSONObject.put("width", a(i10));
            jSONObject.put("height", a(i11));
        } catch (JSONException e8) {
            d.b("Error with creating viewStateObject", e8);
        }
        return jSONObject;
    }

    public static void d(Context context) {
        if (context != null) {
            f1921c = context.getResources().getDisplayMetrics().density;
            f1919a = (WindowManager) context.getSystemService("window");
        }
    }

    public static void e(JSONObject jSONObject, b.a aVar) {
        B1.e a8 = aVar.a();
        JSONArray jSONArray = new JSONArray();
        Iterator it = aVar.c().iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", a8.d());
            jSONObject.put("friendlyObstructionPurpose", a8.b());
            jSONObject.put("friendlyObstructionReason", a8.a());
        } catch (JSONException e8) {
            d.b("Error with setting friendly obstruction", e8);
        }
    }

    public static void f(JSONObject jSONObject, Boolean bool) {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e8) {
            d.b("Error with setting has window focus", e8);
        }
    }

    public static void g(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e8) {
            d.b("Error with setting ad session id", e8);
        }
    }

    public static void h(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e8) {
            d.b("JSONException during JSONObject.put for name [" + str + "]", e8);
        }
    }

    public static void i(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
                jSONObject.put("childViews", optJSONArray);
            }
            optJSONArray.put(jSONObject2);
        } catch (JSONException e8) {
            e8.printStackTrace();
        }
    }

    public static void j(JSONObject jSONObject, EnumC3977j enumC3977j) {
        try {
            jSONObject.put("noOutputDevice", l(enumC3977j));
        } catch (JSONException e8) {
            d.b("Error with setting output device status", e8);
        }
    }

    private static boolean k(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        if (jSONArray != null && jSONArray2 != null && jSONArray.length() == jSONArray2.length()) {
            return true;
        }
        return false;
    }

    private static boolean l(EnumC3977j enumC3977j) {
        if (a.f1922a[enumC3977j.ordinal()] == 1) {
            return true;
        }
        return false;
    }

    public static void m(JSONObject jSONObject) {
        b b8 = b(jSONObject);
        try {
            jSONObject.put("width", b8.f1923a);
            jSONObject.put("height", b8.f1924b);
        } catch (JSONException e8) {
            e8.printStackTrace();
        }
    }

    public static void n(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e8) {
            d.b("Error with setting not visible reason", e8);
        }
    }

    private static boolean o(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!k(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i8 = 0; i8 < optJSONArray.length(); i8++) {
            if (!u(optJSONArray.optJSONObject(i8), optJSONArray2.optJSONObject(i8))) {
                return false;
            }
        }
        return true;
    }

    private static boolean p(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!k(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i8 = 0; i8 < optJSONArray.length(); i8++) {
            if (!optJSONArray.optString(i8, "").equals(optJSONArray2.optString(i8, ""))) {
                return false;
            }
        }
        return true;
    }

    private static boolean q(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")));
    }

    private static boolean r(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice")));
    }

    private static boolean s(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : f1920b) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    private static boolean t(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    public static boolean u(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject != null && jSONObject2 != null && s(jSONObject, jSONObject2) && t(jSONObject, jSONObject2) && r(jSONObject, jSONObject2) && q(jSONObject, jSONObject2) && p(jSONObject, jSONObject2) && o(jSONObject, jSONObject2)) {
            return true;
        }
        return false;
    }
}
