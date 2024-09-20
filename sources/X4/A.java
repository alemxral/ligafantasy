package X4;

import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.uptodown.UptodownApp;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    private long f12304a;

    /* renamed from: b, reason: collision with root package name */
    private String f12305b;

    /* renamed from: c, reason: collision with root package name */
    private String f12306c;

    /* renamed from: d, reason: collision with root package name */
    private String f12307d;

    /* renamed from: e, reason: collision with root package name */
    private String f12308e;

    /* renamed from: f, reason: collision with root package name */
    private String f12309f;

    /* renamed from: g, reason: collision with root package name */
    private String f12310g;

    /* renamed from: h, reason: collision with root package name */
    private String f12311h;

    /* renamed from: i, reason: collision with root package name */
    private String f12312i;

    /* renamed from: j, reason: collision with root package name */
    private long f12313j;

    /* renamed from: k, reason: collision with root package name */
    private C1498h f12314k;

    /* renamed from: l, reason: collision with root package name */
    private ArrayList f12315l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    private ArrayList f12316m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    private ArrayList f12317n = new ArrayList();

    public final String a() {
        return this.f12312i;
    }

    public final ArrayList b() {
        return this.f12316m;
    }

    public final String c() {
        return this.f12310g;
    }

    public final String d() {
        if (this.f12310g != null) {
            return this.f12310g + UptodownApp.f27990B.r() + ":webp";
        }
        return null;
    }

    public final String e() {
        return this.f12311h;
    }

    public final ArrayList f() {
        return this.f12315l;
    }

    public final String g() {
        return this.f12308e;
    }

    public final C1498h h() {
        return this.f12314k;
    }

    public final ArrayList i() {
        return this.f12317n;
    }

    public final String j() {
        return this.f12305b;
    }

    public final String k() {
        return this.f12309f;
    }

    public final String l() {
        return this.f12307d;
    }

    public final String m() {
        return this.f12306c;
    }

    public final ArrayList n(JSONArray jsonArray) {
        AbstractC3159y.i(jsonArray, "jsonArray");
        ArrayList arrayList = new ArrayList();
        int length = jsonArray.length();
        for (int i8 = 0; i8 < length; i8++) {
            C1498h c1498h = new C1498h();
            JSONObject jsonObjectCarouselApp = jsonArray.getJSONObject(i8);
            AbstractC3159y.h(jsonObjectCarouselApp, "jsonObjectCarouselApp");
            c1498h.b(jsonObjectCarouselApp);
            arrayList.add(c1498h);
        }
        return arrayList;
    }

    public final void o(JSONObject jsonObject) {
        AbstractC3159y.i(jsonObject, "jsonObject");
        if (!jsonObject.isNull("info")) {
            JSONObject jSONObject = jsonObject.getJSONObject("info");
            if (!jSONObject.isNull("name")) {
                this.f12305b = jSONObject.getString("name");
            }
            if (!jSONObject.isNull("webpage")) {
                this.f12306c = jSONObject.getString("webpage");
            }
            if (!jSONObject.isNull("twitter")) {
                this.f12307d = jSONObject.getString("twitter");
            }
            if (!jSONObject.isNull("instagram")) {
                this.f12308e = jSONObject.getString("instagram");
            }
            if (!jSONObject.isNull("tiktok")) {
                this.f12309f = jSONObject.getString("tiktok");
            }
            if (!jSONObject.isNull("feature")) {
                this.f12310g = jSONObject.getString("feature");
            }
            if (!jSONObject.isNull(RewardPlus.ICON)) {
                this.f12311h = jSONObject.getString(RewardPlus.ICON);
            }
            if (!jSONObject.isNull("mainAppID")) {
                this.f12313j = jSONObject.getLong("mainAppID");
            }
            if (!jSONObject.isNull("organizationID")) {
                this.f12304a = jSONObject.getLong("organizationID");
            }
            if (!jSONObject.isNull("bio")) {
                this.f12312i = jSONObject.getString("bio");
            }
        }
        if (!jsonObject.isNull("mainApp")) {
            C1498h c1498h = new C1498h();
            JSONObject jSONObject2 = jsonObject.getJSONObject("mainApp");
            AbstractC3159y.h(jSONObject2, "jsonObject.getJSONObject(\"mainApp\")");
            c1498h.b(jSONObject2);
            this.f12314k = c1498h;
        }
        if (!jsonObject.isNull("importantApps")) {
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jsonObject.optJSONArray("importantApps");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i8 = 0; i8 < length; i8++) {
                    C1498h c1498h2 = new C1498h();
                    JSONObject jsonObjectImportantApp = optJSONArray.getJSONObject(i8);
                    AbstractC3159y.h(jsonObjectImportantApp, "jsonObjectImportantApp");
                    c1498h2.b(jsonObjectImportantApp);
                    arrayList.add(c1498h2);
                }
            }
            if (!arrayList.isEmpty()) {
                this.f12315l = arrayList;
            }
        }
        if (!jsonObject.isNull("carouselApps")) {
            ArrayList arrayList2 = new ArrayList();
            JSONArray jSONArray = jsonObject.getJSONArray("carouselApps");
            int length2 = jSONArray.length();
            for (int i9 = 0; i9 < length2; i9++) {
                C1498h c1498h3 = new C1498h();
                JSONObject jsonObjectCarouselApp = jSONArray.getJSONObject(i9);
                AbstractC3159y.h(jsonObjectCarouselApp, "jsonObjectCarouselApp");
                c1498h3.b(jsonObjectCarouselApp);
                arrayList2.add(c1498h3);
            }
            if (!arrayList2.isEmpty()) {
                this.f12316m = arrayList2;
            }
        }
        if (!jsonObject.isNull("apps")) {
            ArrayList arrayList3 = new ArrayList();
            JSONArray jSONArray2 = jsonObject.getJSONArray("apps");
            int length3 = jSONArray2.length();
            for (int i10 = 0; i10 < length3; i10++) {
                C1498h c1498h4 = new C1498h();
                JSONObject jsonObjectCarouselApp2 = jSONArray2.getJSONObject(i10);
                AbstractC3159y.h(jsonObjectCarouselApp2, "jsonObjectCarouselApp");
                c1498h4.b(jsonObjectCarouselApp2);
                arrayList3.add(c1498h4);
            }
            if (!arrayList3.isEmpty()) {
                this.f12317n = arrayList3;
            }
        }
    }

    public final void p(ArrayList arrayList) {
        AbstractC3159y.i(arrayList, "<set-?>");
        this.f12317n = arrayList;
    }
}
