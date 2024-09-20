package X4;

import X4.L;
import X4.T;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.uptodown.UptodownApp;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X4.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1498h implements Parcelable {

    /* renamed from: A, reason: collision with root package name */
    private long f12530A;

    /* renamed from: A0, reason: collision with root package name */
    private String f12531A0;

    /* renamed from: B, reason: collision with root package name */
    private long f12532B;

    /* renamed from: B0, reason: collision with root package name */
    private int f12533B0;

    /* renamed from: C, reason: collision with root package name */
    private int f12534C;

    /* renamed from: C0, reason: collision with root package name */
    private String f12535C0;

    /* renamed from: D, reason: collision with root package name */
    private String f12536D;

    /* renamed from: D0, reason: collision with root package name */
    private c f12537D0;

    /* renamed from: E, reason: collision with root package name */
    private String f12538E;

    /* renamed from: E0, reason: collision with root package name */
    private HashMap f12539E0;

    /* renamed from: F, reason: collision with root package name */
    private String f12540F;

    /* renamed from: F0, reason: collision with root package name */
    private int f12541F0;

    /* renamed from: G, reason: collision with root package name */
    private String f12542G;

    /* renamed from: G0, reason: collision with root package name */
    private int f12543G0;

    /* renamed from: H, reason: collision with root package name */
    private String f12544H;

    /* renamed from: H0, reason: collision with root package name */
    private int f12545H0;

    /* renamed from: I, reason: collision with root package name */
    private String f12546I;

    /* renamed from: I0, reason: collision with root package name */
    private boolean f12547I0;

    /* renamed from: J, reason: collision with root package name */
    private int f12548J;

    /* renamed from: J0, reason: collision with root package name */
    private boolean f12549J0;

    /* renamed from: K, reason: collision with root package name */
    private ArrayList f12550K;

    /* renamed from: K0, reason: collision with root package name */
    private transient ArrayList f12551K0;

    /* renamed from: L, reason: collision with root package name */
    private ArrayList f12552L;

    /* renamed from: M, reason: collision with root package name */
    private String f12553M;

    /* renamed from: N, reason: collision with root package name */
    private String f12554N;

    /* renamed from: O, reason: collision with root package name */
    private ArrayList f12555O;

    /* renamed from: P, reason: collision with root package name */
    private ArrayList f12556P;

    /* renamed from: Q, reason: collision with root package name */
    private ArrayList f12557Q;

    /* renamed from: R, reason: collision with root package name */
    private ArrayList f12558R;

    /* renamed from: S, reason: collision with root package name */
    private ArrayList f12559S;

    /* renamed from: T, reason: collision with root package name */
    private ArrayList f12560T;

    /* renamed from: U, reason: collision with root package name */
    private ArrayList f12561U;

    /* renamed from: V, reason: collision with root package name */
    private H f12562V;

    /* renamed from: W, reason: collision with root package name */
    private String f12563W;

    /* renamed from: X, reason: collision with root package name */
    private String f12564X;

    /* renamed from: Y, reason: collision with root package name */
    private String f12565Y;

    /* renamed from: Z, reason: collision with root package name */
    private int f12566Z;

    /* renamed from: a, reason: collision with root package name */
    private long f12567a;

    /* renamed from: b, reason: collision with root package name */
    private String f12568b;

    /* renamed from: c, reason: collision with root package name */
    private String f12569c;

    /* renamed from: d, reason: collision with root package name */
    private long f12570d;

    /* renamed from: e, reason: collision with root package name */
    private String f12571e;

    /* renamed from: f, reason: collision with root package name */
    private String f12572f;

    /* renamed from: g, reason: collision with root package name */
    private String f12573g;

    /* renamed from: h, reason: collision with root package name */
    private String f12574h;

    /* renamed from: i, reason: collision with root package name */
    private int f12575i;

    /* renamed from: j, reason: collision with root package name */
    private int f12576j;

    /* renamed from: k, reason: collision with root package name */
    private String f12577k;

    /* renamed from: l, reason: collision with root package name */
    private String f12578l;

    /* renamed from: m, reason: collision with root package name */
    private String f12579m;

    /* renamed from: n, reason: collision with root package name */
    private String f12580n;

    /* renamed from: o, reason: collision with root package name */
    private String f12581o;

    /* renamed from: p, reason: collision with root package name */
    private int f12582p;

    /* renamed from: p0, reason: collision with root package name */
    private String f12583p0;

    /* renamed from: q, reason: collision with root package name */
    private int f12584q;

    /* renamed from: q0, reason: collision with root package name */
    private String f12585q0;

    /* renamed from: r, reason: collision with root package name */
    private int f12586r;

    /* renamed from: r0, reason: collision with root package name */
    private String f12587r0;

    /* renamed from: s, reason: collision with root package name */
    private int f12588s;

    /* renamed from: s0, reason: collision with root package name */
    private String f12589s0;

    /* renamed from: t, reason: collision with root package name */
    private int f12590t;

    /* renamed from: t0, reason: collision with root package name */
    private String f12591t0;

    /* renamed from: u, reason: collision with root package name */
    private int f12592u;

    /* renamed from: u0, reason: collision with root package name */
    private String f12593u0;

    /* renamed from: v, reason: collision with root package name */
    private int f12594v;

    /* renamed from: v0, reason: collision with root package name */
    private long f12595v0;

    /* renamed from: w, reason: collision with root package name */
    private String f12596w;

    /* renamed from: w0, reason: collision with root package name */
    private String f12597w0;

    /* renamed from: x, reason: collision with root package name */
    private C1501k f12598x;

    /* renamed from: x0, reason: collision with root package name */
    private String f12599x0;

    /* renamed from: y, reason: collision with root package name */
    private int f12600y;

    /* renamed from: y0, reason: collision with root package name */
    private String f12601y0;

    /* renamed from: z, reason: collision with root package name */
    private String f12602z;

    /* renamed from: z0, reason: collision with root package name */
    private int f12603z0;

    /* renamed from: L0, reason: collision with root package name */
    public static final b f12529L0 = new b(null);
    public static Parcelable.Creator<C1498h> CREATOR = new a();

    /* renamed from: X4.h$a */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1498h createFromParcel(Parcel source) {
            AbstractC3159y.i(source, "source");
            return new C1498h(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1498h[] newArray(int i8) {
            return new C1498h[i8];
        }
    }

    /* renamed from: X4.h$b */
    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public final C1498h a(JSONObject jsonObjectData) {
            AbstractC3159y.i(jsonObjectData, "jsonObjectData");
            C1498h c1498h = new C1498h();
            c1498h.b(jsonObjectData);
            return c1498h;
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: X4.h$c */
    /* loaded from: classes5.dex */
    public enum c {
        UPDATE,
        PROMOTED,
        LATEST,
        EDITOR_CHOICE,
        TRENDING,
        NONE
    }

    public C1498h() {
        this.f12570d = -1L;
        this.f12530A = -1L;
        this.f12532B = -1L;
        this.f12537D0 = c.NONE;
        this.f12539E0 = new HashMap();
    }

    private final void s1(JSONObject jSONObject) {
        if (!jSONObject.isNull("appID")) {
            this.f12567a = jSONObject.getLong("appID");
        }
        if (!jSONObject.isNull("name")) {
            this.f12568b = jSONObject.getString("name");
        }
        if (!jSONObject.isNull("license")) {
            this.f12574h = jSONObject.getString("license");
        }
        if (!jSONObject.isNull("lastVersionCode")) {
            this.f12570d = jSONObject.getLong("lastVersionCode");
        }
        if (!jSONObject.isNull("shortDescription")) {
            this.f12572f = jSONObject.getString("shortDescription");
        }
        if (!jSONObject.isNull("iconURL")) {
            this.f12578l = jSONObject.getString("iconURL");
        } else if (!jSONObject.isNull(RewardPlus.ICON)) {
            this.f12578l = jSONObject.getString(RewardPlus.ICON);
        }
        if (!jSONObject.isNull("feature")) {
            this.f12579m = jSONObject.getString("feature");
        } else if (!jSONObject.isNull("imageURL")) {
            this.f12579m = jSONObject.getString("imageURL");
        }
        if (!jSONObject.isNull("author")) {
            this.f12580n = jSONObject.getString("author");
        }
        if (!jSONObject.isNull("size")) {
            this.f12573g = jSONObject.getString("size");
        }
        if (!jSONObject.isNull("downloads")) {
            this.f12575i = jSONObject.getInt("downloads");
        }
        if (!jSONObject.isNull("weeklyDownloads")) {
            this.f12576j = jSONObject.getInt("weeklyDownloads");
        }
        if (!jSONObject.isNull("lastUpdate")) {
            this.f12577k = jSONObject.getString("lastUpdate");
        }
        if (!jSONObject.isNull("urlShare")) {
            this.f12571e = jSONObject.getString("urlShare");
        }
        if (!jSONObject.isNull("description")) {
            String string = jSONObject.getString("description");
            AbstractC3159y.h(string, "jsonObjectData.getString(\"description\")");
            this.f12581o = g6.n.A(g6.n.A(g6.n.A(string, "</h2>", "</h2><br />", false, 4, null), "</h3>", "</h3><br />", false, 4, null), "\n", "<br />", false, 4, null);
        }
        if (!jSONObject.isNull(CampaignEx.JSON_KEY_STAR)) {
            this.f12582p = jSONObject.getInt(CampaignEx.JSON_KEY_STAR);
        }
        if (!jSONObject.isNull("ratingCount")) {
            this.f12584q = jSONObject.getInt("ratingCount");
        }
        if (!jSONObject.isNull("ratingCount1")) {
            this.f12586r = jSONObject.getInt("ratingCount1");
        }
        if (!jSONObject.isNull("ratingCount2")) {
            this.f12588s = jSONObject.getInt("ratingCount2");
        }
        if (!jSONObject.isNull("ratingCount3")) {
            this.f12590t = jSONObject.getInt("ratingCount3");
        }
        if (!jSONObject.isNull("ratingCount4")) {
            this.f12592u = jSONObject.getInt("ratingCount4");
        }
        if (!jSONObject.isNull("ratingCount5")) {
            this.f12594v = jSONObject.getInt("ratingCount5");
        }
        if (!jSONObject.isNull("packagename")) {
            this.f12596w = jSONObject.getString("packagename");
        } else if (!jSONObject.isNull("packageName")) {
            this.f12596w = jSONObject.getString("packageName");
        }
        if (!jSONObject.isNull("categoryData")) {
            C1501k c1501k = new C1501k(0, null, null, 7, null);
            this.f12598x = c1501k;
            AbstractC3159y.f(c1501k);
            JSONObject jSONObject2 = jSONObject.getJSONObject("categoryData");
            AbstractC3159y.h(jSONObject2, "jsonObjectData.getJSONObject(\"categoryData\")");
            c1501k.s(jSONObject2);
        }
        if (!jSONObject.isNull("permissionCount")) {
            this.f12600y = jSONObject.getInt("permissionCount");
        }
        if (!jSONObject.isNull("md5Signature")) {
            this.f12536D = jSONObject.getString("md5Signature");
        }
        if (!jSONObject.isNull("activeADEX")) {
            this.f12534C = jSONObject.getInt("activeADEX");
        }
        if (!jSONObject.isNull("pegi")) {
            this.f12540F = jSONObject.getString("pegi");
        }
        if (!jSONObject.isNull("technicalData")) {
            this.f12544H = jSONObject.getString("technicalData");
        }
        if (!jSONObject.isNull("versionRequired")) {
            this.f12546I = jSONObject.getString("versionRequired");
        }
        if (!jSONObject.isNull("fromUnity")) {
            this.f12548J = jSONObject.getInt("fromUnity");
        }
        if (!jSONObject.isNull("compatibleFile")) {
            JSONObject jSONObject3 = jSONObject.getJSONObject("compatibleFile");
            if (!jSONObject3.isNull("densities")) {
                JSONArray jSONArray = jSONObject3.getJSONArray("densities");
                this.f12550K = new ArrayList();
                int length = jSONArray.length();
                for (int i8 = 0; i8 < length; i8++) {
                    ArrayList arrayList = this.f12550K;
                    if (arrayList != null) {
                        arrayList.add(jSONArray.getString(i8));
                    }
                }
            }
            if (!jSONObject3.isNull("abis")) {
                JSONArray jSONArray2 = jSONObject3.getJSONArray("abis");
                this.f12552L = new ArrayList();
                int length2 = jSONArray2.length();
                for (int i9 = 0; i9 < length2; i9++) {
                    ArrayList arrayList2 = this.f12552L;
                    if (arrayList2 != null) {
                        arrayList2.add(jSONArray2.getString(i9));
                    }
                }
            }
            if (!jSONObject3.isNull("fileID")) {
                this.f12530A = jSONObject3.getLong("fileID");
            }
            if (!jSONObject3.isNull("minSDK")) {
                this.f12602z = jSONObject3.getString("minSDK");
            }
            if (!jSONObject3.isNull("version")) {
                this.f12569c = jSONObject3.getString("version");
            }
            if (!jSONObject3.isNull("sha256")) {
                this.f12542G = jSONObject3.getString("sha256");
            }
            if (!jSONObject3.isNull("url_apk")) {
                this.f12538E = jSONObject3.getString("url_apk");
            }
        }
        if (!jSONObject.isNull("website")) {
            this.f12553M = jSONObject.getString("website");
        }
        if (!jSONObject.isNull("downloadStatus")) {
            String string2 = jSONObject.getString("downloadStatus");
            this.f12554N = string2;
            if (g6.n.t(string2, "PreRegister", false, 2, null)) {
                JSONObject jSONObject4 = jSONObject.getJSONObject("preRegister");
                if (!jSONObject4.isNull("date")) {
                    this.f12563W = jSONObject4.getString("date");
                }
                if (!jSONObject4.isNull("countPreRegistered")) {
                    this.f12564X = jSONObject4.getString("countPreRegistered");
                }
            }
        }
        if (!jSONObject.isNull("newFeatures")) {
            this.f12565Y = jSONObject.getString("newFeatures");
        }
        if (!jSONObject.isNull("onBoard")) {
            this.f12566Z = jSONObject.getInt("onBoard");
        }
        if (!jSONObject.isNull("responsibilities")) {
            this.f12583p0 = jSONObject.getString("responsibilities");
        }
        if (!jSONObject.isNull(TypedValues.CycleType.S_WAVE_PHASE)) {
            this.f12585q0 = jSONObject.getString(TypedValues.CycleType.S_WAVE_PHASE);
        }
        if (!jSONObject.isNull("deviceType")) {
            this.f12587r0 = jSONObject.getString("deviceType");
        }
        if (!jSONObject.isNull("translations")) {
            this.f12539E0 = new HashMap();
            if (jSONObject.getJSONObject("translations") != null) {
                JSONObject jSONObject5 = jSONObject.getJSONObject("translations");
                if (!jSONObject5.isNull("try")) {
                    HashMap hashMap = this.f12539E0;
                    AbstractC3159y.f(hashMap);
                    String string3 = jSONObject5.getString("try");
                    AbstractC3159y.h(string3, "jsonObjectTranslations.g…ring(TRANSLATION_KEY_TRY)");
                    hashMap.put("try", string3);
                }
                if (!jSONObject5.isNull("supportedDevice")) {
                    HashMap hashMap2 = this.f12539E0;
                    AbstractC3159y.f(hashMap2);
                    String string4 = jSONObject5.getString("supportedDevice");
                    AbstractC3159y.h(string4, "jsonObjectTranslations.g…ION_KEY_SUPPORTED_DEVICE)");
                    hashMap2.put("supportedDevice", string4);
                }
            }
        }
        if (!jSONObject.isNull("readingModeText")) {
            this.f12589s0 = jSONObject.getString("readingModeText");
        }
        if (!jSONObject.isNull("externalDownloadURL")) {
            this.f12591t0 = jSONObject.getString("externalDownloadURL");
        }
        if (!jSONObject.isNull("externalDownloadText")) {
            this.f12593u0 = jSONObject.getString("externalDownloadText");
        }
        if (!jSONObject.isNull("organizationID")) {
            this.f12595v0 = jSONObject.getLong("organizationID");
        }
        if (!jSONObject.isNull("editorNameNew")) {
            this.f12597w0 = jSONObject.getString("editorNameNew");
        }
        if (!jSONObject.isNull("editorAvatar")) {
            this.f12599x0 = jSONObject.getString("editorAvatar");
        }
        if (!jSONObject.isNull("showReviewedBy")) {
            this.f12533B0 = jSONObject.getInt("showReviewedBy");
        }
        if (!jSONObject.isNull("editorJobTitle")) {
            this.f12601y0 = jSONObject.getString("editorJobTitle");
        }
        if (!jSONObject.isNull("totalVersions")) {
            this.f12603z0 = jSONObject.getInt("totalVersions");
        }
        if (!jSONObject.isNull("disclaimerText")) {
            this.f12531A0 = jSONObject.getString("disclaimerText");
        }
        if (!jSONObject.isNull("tagID")) {
            int i10 = jSONObject.getInt("tagID");
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                if (i10 == 5) {
                                    this.f12537D0 = c.EDITOR_CHOICE;
                                }
                            } else {
                                this.f12537D0 = c.PROMOTED;
                            }
                        } else {
                            this.f12537D0 = c.UPDATE;
                        }
                    } else {
                        this.f12537D0 = c.LATEST;
                    }
                } else {
                    this.f12537D0 = c.TRENDING;
                }
            } else {
                this.f12537D0 = c.NONE;
            }
            if (!jSONObject.isNull("tag")) {
                this.f12535C0 = jSONObject.getString("tag");
            }
        }
        if (!jSONObject.isNull("promoted")) {
            this.f12541F0 = jSONObject.getInt("promoted");
        }
        if (!jSONObject.isNull("containsAds")) {
            this.f12543G0 = jSONObject.getInt("containsAds");
        }
        if (!jSONObject.isNull("hasAlternatives")) {
            if (jSONObject.getBoolean("hasAlternatives")) {
                this.f12545H0 = 1;
            } else {
                this.f12545H0 = 0;
            }
        }
    }

    public final int A0() {
        return this.f12600y;
    }

    public final void A1(ArrayList arrayList) {
        this.f12558R = arrayList;
    }

    public final String B0() {
        return this.f12585q0;
    }

    public final void B1(H h8) {
        this.f12562V = h8;
    }

    public final String C0() {
        return this.f12563W;
    }

    public final void C1(ArrayList arrayList) {
        this.f12555O = arrayList;
    }

    public final String D0() {
        return this.f12564X;
    }

    public final void D1(ArrayList arrayList) {
        this.f12560T = arrayList;
    }

    public final ArrayList E0() {
        return this.f12557Q;
    }

    public final void E1(ArrayList arrayList) {
        this.f12556P = arrayList;
    }

    public final int F0() {
        return this.f12582p;
    }

    public final void F1(ArrayList arrayList) {
        this.f12561U = arrayList;
    }

    public final String G() {
        return this.f12531A0;
    }

    public final int G0() {
        return this.f12584q;
    }

    public final int H0() {
        return this.f12586r;
    }

    public final String I() {
        return this.f12554N;
    }

    public final int I0() {
        return this.f12588s;
    }

    public final int J0() {
        return this.f12590t;
    }

    public final int K0() {
        return this.f12592u;
    }

    public final String L() {
        return this.f12538E;
    }

    public final int L0() {
        return this.f12594v;
    }

    public final String M0() {
        return this.f12589s0;
    }

    public final ArrayList N0() {
        return this.f12558R;
    }

    public final H O0() {
        return this.f12562V;
    }

    public final String P0() {
        return this.f12583p0;
    }

    public final int Q() {
        return this.f12575i;
    }

    public final ArrayList Q0() {
        return this.f12555O;
    }

    public final ArrayList R0() {
        return this.f12560T;
    }

    public final String S0() {
        return this.f12542G;
    }

    public final String T() {
        return this.f12599x0;
    }

    public final String T0() {
        return this.f12572f;
    }

    public final int U0() {
        return this.f12533B0;
    }

    public final String V() {
        return this.f12601y0;
    }

    public final ArrayList V0() {
        return this.f12556P;
    }

    public final String W0() {
        return this.f12573g;
    }

    public final String X() {
        return this.f12597w0;
    }

    public final ArrayList X0() {
        return this.f12552L;
    }

    public final String Y() {
        return this.f12593u0;
    }

    public final ArrayList Y0() {
        return this.f12550K;
    }

    public final String Z() {
        return this.f12591t0;
    }

    public final String Z0() {
        return this.f12535C0;
    }

    public final ArrayList a0() {
        return this.f12559S;
    }

    public final c a1() {
        return this.f12537D0;
    }

    public final void b(JSONObject jsonObjectData) {
        AbstractC3159y.i(jsonObjectData, "jsonObjectData");
        if (jsonObjectData.has(MBridgeConstans.DYNAMIC_VIEW_WX_APP)) {
            JSONObject jSONObject = jsonObjectData.getJSONObject(MBridgeConstans.DYNAMIC_VIEW_WX_APP);
            AbstractC3159y.h(jSONObject, "jsonObjectData.getJSONObject(\"app\")");
            s1(jSONObject);
        } else {
            s1(jsonObjectData);
        }
        if (jsonObjectData.has("videos")) {
            JSONArray jSONArray = jsonObjectData.getJSONArray("videos");
            this.f12561U = new ArrayList();
            int length = jSONArray.length();
            for (int i8 = 0; i8 < length; i8++) {
                T.b bVar = T.f12439c;
                Object obj = jSONArray.get(i8);
                AbstractC3159y.g(obj, "null cannot be cast to non-null type org.json.JSONObject");
                T a8 = bVar.a((JSONObject) obj);
                ArrayList arrayList = this.f12561U;
                AbstractC3159y.f(arrayList);
                arrayList.add(a8);
            }
        }
        if (jsonObjectData.has("screenshots")) {
            JSONArray jSONArray2 = jsonObjectData.getJSONArray("screenshots");
            this.f12560T = new ArrayList();
            int length2 = jSONArray2.length();
            for (int i9 = 0; i9 < length2; i9++) {
                L.b bVar2 = L.f12393e;
                Object obj2 = jSONArray2.get(i9);
                AbstractC3159y.g(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                L b8 = bVar2.b((JSONObject) obj2);
                ArrayList arrayList2 = this.f12560T;
                if (arrayList2 != null) {
                    arrayList2.add(b8);
                }
            }
        }
    }

    public final String b0() {
        return this.f12579m;
    }

    public final String b1() {
        return this.f12544H;
    }

    public final boolean c() {
        if (!r1() && !o1() && l1()) {
            return true;
        }
        return false;
    }

    public final String c0() {
        if (this.f12579m != null) {
            UptodownApp.a aVar = UptodownApp.f27990B;
            if (aVar.A() > 0) {
                return this.f12579m + ':' + aVar.A() + ":webp";
            }
            return e0();
        }
        return null;
    }

    public final int c1() {
        return this.f12603z0;
    }

    public final String d0() {
        if (this.f12579m != null) {
            return this.f12579m + UptodownApp.f27990B.q() + ":webp";
        }
        return null;
    }

    public final String d1(String key) {
        AbstractC3159y.i(key, "key");
        HashMap hashMap = this.f12539E0;
        if (hashMap != null) {
            return (String) hashMap.get(key);
        }
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return hashCode();
    }

    public final String e() {
        String str = this.f12563W;
        if (str != null && str.length() != 0) {
            String str2 = this.f12563W;
            AbstractC3159y.f(str2);
            return g6.n.A(str2, "-", "/", false, 4, null);
        }
        return null;
    }

    public final String e0() {
        if (this.f12579m != null) {
            return this.f12579m + UptodownApp.f27990B.r() + ":webp";
        }
        return null;
    }

    public final String e1() {
        return this.f12571e;
    }

    public final int f() {
        return this.f12534C;
    }

    public final long f0() {
        return this.f12530A;
    }

    public final long f1() {
        return this.f12532B;
    }

    public final int g0() {
        return this.f12548J;
    }

    public final String g1() {
        return this.f12569c;
    }

    public final int h0() {
        return this.f12545H0;
    }

    public final String h1() {
        return this.f12546I;
    }

    public final long i() {
        return this.f12567a;
    }

    public final String i0() {
        if (this.f12579m != null) {
            return this.f12579m + UptodownApp.f27990B.s() + ":webp";
        }
        return null;
    }

    public final ArrayList i1() {
        return this.f12561U;
    }

    public final long j(I responseJson) {
        int i8;
        JSONObject jSONObject;
        AbstractC3159y.i(responseJson, "responseJson");
        try {
            if (!responseJson.b() && responseJson.d() != null) {
                String d8 = responseJson.d();
                AbstractC3159y.f(d8);
                JSONObject jSONObject2 = new JSONObject(d8);
                if (!jSONObject2.isNull("success")) {
                    i8 = jSONObject2.getInt("success");
                } else {
                    i8 = 0;
                }
                if (!jSONObject2.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                    jSONObject = jSONObject2.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                } else {
                    jSONObject = null;
                }
                if (i8 == 1 && jSONObject != null && !jSONObject.isNull("appID")) {
                    return jSONObject.getLong("appID");
                }
            }
            return 0L;
        } catch (JSONException e8) {
            e8.printStackTrace();
            return -1L;
        }
    }

    public final String j0() {
        return this.f12578l;
    }

    public final String j1() {
        return this.f12553M;
    }

    public final String k() {
        return this.f12580n;
    }

    public final String k0(int i8) {
        if (this.f12578l != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(':');
            sb.append(i8);
            return this.f12578l + sb.toString() + ":webp";
        }
        return null;
    }

    public final boolean k1() {
        if (this.f12530A >= 0) {
            return true;
        }
        return false;
    }

    public final String l0() {
        if (this.f12578l != null) {
            return this.f12578l + UptodownApp.f27990B.t() + ":webp";
        }
        return null;
    }

    public final boolean l1() {
        if (this.f12603z0 > 1) {
            return true;
        }
        return false;
    }

    public final String m0() {
        if (this.f12578l != null) {
            return this.f12578l + UptodownApp.f27990B.u() + ":webp";
        }
        return null;
    }

    public final boolean m1() {
        return AbstractC3159y.d(this.f12554N, "Discontinued");
    }

    public final C1501k n() {
        return this.f12598x;
    }

    public final String n0() {
        return this.f12577k;
    }

    public final boolean n1() {
        if (this.f12554N != null && !p1() && !m1() && !o1() && !r1()) {
            return true;
        }
        return false;
    }

    public final int o() {
        return this.f12543G0;
    }

    public final long o0() {
        return this.f12570d;
    }

    public final boolean o1() {
        return AbstractC3159y.d(this.f12554N, "ExternalDownload");
    }

    public final String p0() {
        return this.f12574h;
    }

    public final boolean p1() {
        return AbstractC3159y.d(this.f12554N, "PreRegister");
    }

    public final String q0() {
        return this.f12536D;
    }

    public final boolean q1() {
        if (this.f12541F0 == 1) {
            return true;
        }
        return false;
    }

    public final String r0() {
        return this.f12602z;
    }

    public final boolean r1() {
        return AbstractC3159y.d(this.f12554N, "ReadingMode");
    }

    public final String s() {
        return this.f12581o;
    }

    public final String s0() {
        return this.f12568b;
    }

    public final String t0() {
        return this.f12565Y;
    }

    public final void t1(long j8) {
        this.f12567a = j8;
    }

    public String toString() {
        return "AppInfo(appID=" + this.f12567a + ", name=" + this.f12568b + ", versionName=" + this.f12569c + ", lastVersionCode=" + this.f12570d + ", urlShare=" + this.f12571e + ", shortDescription=" + this.f12572f + ", size=" + this.f12573g + ", license=" + this.f12574h + ", downloads=" + this.f12575i + ", weeklyDownloads=" + this.f12576j + ", lastUpdate=" + this.f12577k + ", icon=" + this.f12578l + ", feature=" + this.f12579m + ", author=" + this.f12580n + ", description=" + this.f12581o + ", rating=" + this.f12582p + ", ratingCount=" + this.f12584q + ", ratingCount1=" + this.f12586r + ", ratingCount2=" + this.f12588s + ", ratingCount3=" + this.f12590t + ", ratingCount4=" + this.f12592u + ", ratingCount5=" + this.f12594v + ", packagename=" + this.f12596w + ", screenShots=" + this.f12560T + ", category=" + this.f12598x + ", permissionCount=" + this.f12600y + ", minsdk=" + this.f12602z + ", similars=" + this.f12556P + ", promotedApps=" + this.f12557Q + ", relatedPosts=" + this.f12558R + ", md5signature=" + this.f12536D + ", downloadUrl=" + this.f12538E + ", reviews=" + this.f12555O + ", fileID=" + this.f12530A + ", oldVersions=" + this.f12551K0 + ", activeADEX=" + this.f12534C + ", sha256=" + this.f12542G + ", technicalData=" + this.f12544H + ", versionRequired=" + this.f12546I + ", fromUnity=" + this.f12548J + ", webAuthor=" + this.f12553M + ", downloadStatus=" + this.f12554N + ", devOnBoard=" + this.f12566Z + ", responsibilities=" + this.f12583p0 + ", phase=" + this.f12585q0 + ", readingModeText=" + this.f12589s0 + ", externalDownloadUrl=" + this.f12591t0 + ", externalDownloadText=" + this.f12593u0 + ", organizationID=" + this.f12595v0 + ", editorName=" + this.f12597w0 + ", totalVersions=" + this.f12603z0 + ", disclaimerText=" + this.f12531A0 + ')';
    }

    public final int u() {
        return this.f12566Z;
    }

    public final boolean u0() {
        return this.f12547I0;
    }

    public final void u1(ArrayList arrayList) {
        this.f12559S = arrayList;
    }

    public final boolean v0() {
        return this.f12549J0;
    }

    public final void v1(String str) {
        this.f12579m = str;
    }

    public final ArrayList w0() {
        return this.f12551K0;
    }

    public final void w1(boolean z8) {
        this.f12547I0 = z8;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        AbstractC3159y.i(parcel, "parcel");
        parcel.writeLong(this.f12567a);
        parcel.writeString(this.f12568b);
        parcel.writeString(this.f12569c);
        parcel.writeLong(this.f12570d);
        parcel.writeString(this.f12571e);
        parcel.writeString(this.f12572f);
        parcel.writeString(this.f12573g);
        parcel.writeString(this.f12574h);
        parcel.writeInt(this.f12575i);
        parcel.writeInt(this.f12576j);
        parcel.writeString(this.f12577k);
        parcel.writeString(this.f12578l);
        parcel.writeString(this.f12579m);
        parcel.writeString(this.f12580n);
        parcel.writeString(this.f12581o);
        parcel.writeInt(this.f12582p);
        parcel.writeInt(this.f12584q);
        parcel.writeInt(this.f12586r);
        parcel.writeInt(this.f12588s);
        parcel.writeInt(this.f12590t);
        parcel.writeInt(this.f12592u);
        parcel.writeInt(this.f12594v);
        parcel.writeString(this.f12596w);
        parcel.writeParcelable(this.f12598x, i8);
        parcel.writeInt(this.f12600y);
        parcel.writeString(this.f12602z);
        parcel.writeString(this.f12536D);
        parcel.writeString(this.f12538E);
        parcel.writeLong(this.f12530A);
        parcel.writeInt(this.f12534C);
        parcel.writeString(this.f12542G);
        parcel.writeString(this.f12544H);
        parcel.writeString(this.f12546I);
        parcel.writeInt(this.f12548J);
        parcel.writeStringList(this.f12550K);
        parcel.writeStringList(this.f12552L);
        parcel.writeString(this.f12553M);
        parcel.writeString(this.f12554N);
        parcel.writeString(this.f12540F);
        parcel.writeInt(this.f12566Z);
        parcel.writeString(this.f12587r0);
        parcel.writeMap(this.f12539E0);
        parcel.writeString(this.f12589s0);
        parcel.writeString(this.f12591t0);
        parcel.writeString(this.f12593u0);
        parcel.writeLong(this.f12595v0);
        parcel.writeString(this.f12597w0);
        parcel.writeInt(this.f12603z0);
        parcel.writeString(this.f12583p0);
        parcel.writeString(this.f12565Y);
        parcel.writeString(this.f12563W);
        parcel.writeString(this.f12564X);
        parcel.writeString(this.f12599x0);
        parcel.writeString(this.f12601y0);
        parcel.writeString(this.f12531A0);
        parcel.writeInt(this.f12533B0);
        parcel.writeInt(this.f12543G0);
        parcel.writeInt(this.f12545H0);
    }

    public final long x0() {
        return this.f12595v0;
    }

    public final void x1(boolean z8) {
        this.f12549J0 = z8;
    }

    public final String y0() {
        return this.f12596w;
    }

    public final void y1(ArrayList arrayList) {
        this.f12551K0 = arrayList;
    }

    public final String z() {
        return this.f12587r0;
    }

    public final String z0() {
        return this.f12540F;
    }

    public final void z1(ArrayList arrayList) {
        this.f12557Q = arrayList;
    }

    public C1498h(Parcel source) {
        Object readParcelable;
        AbstractC3159y.i(source, "source");
        this.f12570d = -1L;
        this.f12530A = -1L;
        this.f12532B = -1L;
        this.f12537D0 = c.NONE;
        this.f12539E0 = new HashMap();
        this.f12567a = source.readLong();
        this.f12568b = source.readString();
        this.f12569c = source.readString();
        this.f12570d = source.readLong();
        this.f12571e = source.readString();
        this.f12572f = source.readString();
        this.f12573g = source.readString();
        this.f12574h = source.readString();
        this.f12575i = source.readInt();
        this.f12576j = source.readInt();
        this.f12577k = source.readString();
        this.f12578l = source.readString();
        this.f12579m = source.readString();
        this.f12580n = source.readString();
        this.f12581o = source.readString();
        this.f12582p = source.readInt();
        this.f12584q = source.readInt();
        this.f12586r = source.readInt();
        this.f12588s = source.readInt();
        this.f12590t = source.readInt();
        this.f12592u = source.readInt();
        this.f12594v = source.readInt();
        this.f12596w = source.readString();
        if (Build.VERSION.SDK_INT >= 33) {
            readParcelable = source.readParcelable(C1501k.class.getClassLoader(), C1501k.class);
            this.f12598x = (C1501k) readParcelable;
        } else {
            this.f12598x = (C1501k) source.readParcelable(C1501k.class.getClassLoader());
        }
        this.f12600y = source.readInt();
        this.f12602z = source.readString();
        this.f12536D = source.readString();
        this.f12538E = source.readString();
        this.f12530A = source.readLong();
        this.f12534C = source.readInt();
        this.f12542G = source.readString();
        this.f12544H = source.readString();
        this.f12546I = source.readString();
        this.f12548J = source.readInt();
        this.f12550K = source.createStringArrayList();
        this.f12552L = source.createStringArrayList();
        this.f12553M = source.readString();
        this.f12554N = source.readString();
        this.f12540F = source.readString();
        this.f12566Z = source.readInt();
        this.f12587r0 = source.readString();
        HashMap readHashMap = source.readHashMap(ClassLoader.getSystemClassLoader());
        AbstractC3159y.g(readHashMap, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.String> }");
        this.f12539E0 = readHashMap;
        this.f12589s0 = source.readString();
        this.f12591t0 = source.readString();
        this.f12593u0 = source.readString();
        this.f12595v0 = source.readLong();
        this.f12597w0 = source.readString();
        this.f12603z0 = source.readInt();
        this.f12583p0 = source.readString();
        this.f12565Y = source.readString();
        this.f12563W = source.readString();
        this.f12564X = source.readString();
        this.f12599x0 = source.readString();
        this.f12601y0 = source.readString();
        this.f12531A0 = source.readString();
        this.f12533B0 = source.readInt();
        this.f12543G0 = source.readInt();
        this.f12545H0 = source.readInt();
    }
}
