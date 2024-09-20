package com.mbridge.msdk.c;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.r;
import com.mbridge.msdk.foundation.tools.v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static int f17871a = 1500;

    /* renamed from: G, reason: collision with root package name */
    private long f17878G;

    /* renamed from: I, reason: collision with root package name */
    private ArrayList<Integer> f17880I;

    /* renamed from: J, reason: collision with root package name */
    private d f17881J;

    /* renamed from: K, reason: collision with root package name */
    private C0388b f17882K;

    /* renamed from: P, reason: collision with root package name */
    private HashMap<String, String> f17887P;

    /* renamed from: Q, reason: collision with root package name */
    private String f17888Q;

    /* renamed from: V, reason: collision with root package name */
    private int f17893V;

    /* renamed from: Y, reason: collision with root package name */
    private String f17896Y;

    /* renamed from: Z, reason: collision with root package name */
    private Map<String, String> f17897Z;
    private boolean aE;
    private JSONArray aG;
    private JSONObject aH;
    private long aJ;
    private long aO;
    private boolean aP;
    private String aV;
    private String aZ;
    private int ai;
    private String al;
    private String am;
    private int ap;
    private int aq;
    private int ar;
    private int as;
    private long av;
    private long aw;

    /* renamed from: m, reason: collision with root package name */
    private int f17909m;

    /* renamed from: o, reason: collision with root package name */
    private List<com.mbridge.msdk.foundation.entity.a> f17911o;

    /* renamed from: q, reason: collision with root package name */
    private long f17913q;

    /* renamed from: r, reason: collision with root package name */
    private com.mbridge.msdk.c.a f17914r;

    /* renamed from: s, reason: collision with root package name */
    private String f17915s;

    /* renamed from: t, reason: collision with root package name */
    private Map<String, a> f17916t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f17917u;

    /* renamed from: v, reason: collision with root package name */
    private int f17918v;

    /* renamed from: b, reason: collision with root package name */
    private boolean f17898b = false;

    /* renamed from: c, reason: collision with root package name */
    private JSONArray f17899c = new JSONArray();

    /* renamed from: d, reason: collision with root package name */
    private JSONArray f17900d = new JSONArray();

    /* renamed from: e, reason: collision with root package name */
    private String f17901e = "";

    /* renamed from: f, reason: collision with root package name */
    private int f17902f = 0;

    /* renamed from: g, reason: collision with root package name */
    private int f17903g = 0;

    /* renamed from: h, reason: collision with root package name */
    private int f17904h = 2;

    /* renamed from: i, reason: collision with root package name */
    private int f17905i = 0;

    /* renamed from: j, reason: collision with root package name */
    private String f17906j = "";

    /* renamed from: k, reason: collision with root package name */
    private String f17907k = "";

    /* renamed from: l, reason: collision with root package name */
    private String f17908l = "";

    /* renamed from: n, reason: collision with root package name */
    private int f17910n = 0;

    /* renamed from: p, reason: collision with root package name */
    private int f17912p = 0;

    /* renamed from: w, reason: collision with root package name */
    private int f17919w = 1;

    /* renamed from: x, reason: collision with root package name */
    private boolean f17920x = false;

    /* renamed from: y, reason: collision with root package name */
    private String f17921y = "";

    /* renamed from: z, reason: collision with root package name */
    private String f17922z = "";

    /* renamed from: A, reason: collision with root package name */
    private String f17872A = "";

    /* renamed from: B, reason: collision with root package name */
    private String f17873B = "";

    /* renamed from: C, reason: collision with root package name */
    private String f17874C = "";

    /* renamed from: D, reason: collision with root package name */
    private int f17875D = 120;

    /* renamed from: E, reason: collision with root package name */
    private String f17876E = com.mbridge.msdk.foundation.same.net.g.d.f().f19688h;

    /* renamed from: F, reason: collision with root package name */
    private String f17877F = com.mbridge.msdk.foundation.same.net.g.d.f().f19692l;

    /* renamed from: H, reason: collision with root package name */
    private int f17879H = f17871a;

    /* renamed from: L, reason: collision with root package name */
    private int f17883L = 0;

    /* renamed from: M, reason: collision with root package name */
    private long f17884M = 86400;

    /* renamed from: N, reason: collision with root package name */
    private int f17885N = 0;

    /* renamed from: O, reason: collision with root package name */
    private int f17886O = 3;

    /* renamed from: R, reason: collision with root package name */
    private boolean f17889R = true;

    /* renamed from: S, reason: collision with root package name */
    private int f17890S = 0;

    /* renamed from: T, reason: collision with root package name */
    private boolean f17891T = false;

    /* renamed from: U, reason: collision with root package name */
    private boolean f17892U = false;

    /* renamed from: W, reason: collision with root package name */
    private int f17894W = 0;

    /* renamed from: X, reason: collision with root package name */
    private int f17895X = 0;
    private String aa = "1.0";
    private int ab = 30;
    private int ac = 9377;
    private int ad = 0;
    private int ae = 5;
    private int af = 1;
    private int ag = 8000;
    private String ah = "";
    private int aj = 10;
    private int ak = 120;
    private String an = "";
    private String ao = "";
    private String at = "";
    private String au = "";
    private List<Integer> ax = new ArrayList();
    private int ay = 3;
    private int az = 0;
    private int aA = 3;
    private int aB = 0;
    private int aC = 10;
    private int aD = 600;
    private int aF = 0;
    private String aI = "";
    private int aK = 8000;
    private int aL = 1;
    private long aM = 10;
    private int aN = 3;
    private int aQ = 1;
    private int aR = 1;
    private int aS = 1;
    private int aT = 1;
    private String aU = "";
    private int aW = 1300;
    private int aX = 0;
    private int aY = 0;

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private List<String> f17926a;

        /* renamed from: b, reason: collision with root package name */
        private List<String> f17927b;

        /* renamed from: c, reason: collision with root package name */
        private List<String> f17928c;

        /* renamed from: d, reason: collision with root package name */
        private List<String> f17929d;

        public final List<String> a() {
            return this.f17926a;
        }

        public final List<String> b() {
            return this.f17927b;
        }

        public final List<String> c() {
            return this.f17928c;
        }

        public final List<String> d() {
            return this.f17929d;
        }

        public final void a(JSONObject jSONObject) {
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("x");
                if (optJSONArray != null) {
                    this.f17928c = r.a(optJSONArray);
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("y");
                if (optJSONArray2 != null) {
                    this.f17929d = r.a(optJSONArray2);
                }
                JSONArray optJSONArray3 = jSONObject.optJSONArray("width");
                if (optJSONArray3 != null) {
                    this.f17927b = r.a(optJSONArray3);
                }
                JSONArray optJSONArray4 = jSONObject.optJSONArray("height");
                if (optJSONArray4 != null) {
                    this.f17926a = r.a(optJSONArray4);
                }
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    e8.printStackTrace();
                }
            }
        }
    }

    public static String a(Context context, String str) {
        try {
            g b8 = h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
            if (b8 != null && ((b) b8).f17897Z != null) {
                String host = Uri.parse(str).getHost();
                Iterator<Map.Entry<String, String>> it = ((b) b8).f17897Z.entrySet().iterator();
                while (it.hasNext()) {
                    String key = it.next().getKey();
                    if (!TextUtils.isEmpty(host) && host.contains(key)) {
                        String str2 = ((b) b8).f17897Z.get(key);
                        if (TextUtils.isEmpty(str2)) {
                            return "";
                        }
                        return str2.replace("{gaid}", com.mbridge.msdk.foundation.tools.e.c());
                    }
                }
                return "";
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    private static Map<String, a> e(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                a aVar = new a();
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                if (optJSONObject != null) {
                    aVar.a(optJSONObject);
                }
                hashMap.put(next, aVar);
            }
            return hashMap;
        } catch (JSONException e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
            return null;
        } catch (Exception e9) {
            if (MBridgeConstans.DEBUG) {
                e9.printStackTrace();
            }
            return null;
        }
    }

    public final long A() {
        return this.f17878G;
    }

    public final ArrayList<Integer> B() {
        return this.f17880I;
    }

    public final d C() {
        return this.f17881J;
    }

    public final C0388b D() {
        return this.f17882K;
    }

    public final long E() {
        return this.f17884M;
    }

    public final int F() {
        return this.f17886O;
    }

    public final HashMap<String, String> G() {
        return this.f17887P;
    }

    public final String H() {
        return this.f17888Q;
    }

    public final int I() {
        return this.f17890S;
    }

    public final int J() {
        return this.f17893V;
    }

    public final int K() {
        return this.f17894W;
    }

    public final JSONArray L() {
        return this.f17899c;
    }

    public final JSONArray M() {
        return this.f17900d;
    }

    public final String N() {
        return this.aa;
    }

    public final int O() {
        return this.af;
    }

    public final int P() {
        return this.ag;
    }

    public final int Q() {
        return this.aj;
    }

    public final int R() {
        return this.ai;
    }

    public final int S() {
        return this.ak;
    }

    public final String T() {
        return this.al;
    }

    public final String U() {
        return this.am;
    }

    public final String V() {
        return this.an;
    }

    public final String W() {
        return this.ao;
    }

    public final int X() {
        return this.ap;
    }

    public final int Y() {
        return this.aq;
    }

    public final int Z() {
        return this.ar;
    }

    public final int aA() {
        return this.aX;
    }

    public final int aB() {
        return this.aY;
    }

    public final boolean aC() {
        return this.f17889R;
    }

    public final boolean aD() {
        return this.f17917u;
    }

    public final boolean aE() {
        return this.f17920x;
    }

    public final boolean aF() {
        return this.f17891T;
    }

    public final boolean aG() {
        return this.f17898b;
    }

    public final boolean aH() {
        return this.f17892U;
    }

    public final boolean aI() {
        return this.aE;
    }

    public final boolean aJ() {
        return this.aP;
    }

    public final void aK() {
        String language = Locale.getDefault().getLanguage();
        if (TextUtils.isEmpty(this.f17874C) || TextUtils.isEmpty(this.f17872A) || TextUtils.isEmpty(this.f17873B) || TextUtils.isEmpty(this.f17922z)) {
            if (!TextUtils.isEmpty(language) && language.equals("zh")) {
                this.f17874C = "确认关闭？";
                this.f17872A = "关闭后您将不会获得任何奖励噢~ ";
                this.f17873B = "确认关闭";
                this.f17922z = "继续观看";
            } else {
                this.f17874C = "Confirm to close? ";
                this.f17872A = "You will not be rewarded after closing the window";
                this.f17873B = "Close it";
                this.f17922z = "Continue";
            }
        }
        if (TextUtils.isEmpty(this.f17874C) || TextUtils.isEmpty(this.f17872A) || TextUtils.isEmpty(this.f17873B) || TextUtils.isEmpty(this.f17921y)) {
            if (!TextUtils.isEmpty(language) && language.equals("zh")) {
                this.f17874C = "确认关闭？";
                this.f17872A = "关闭后您将不会获得任何奖励噢~ ";
                this.f17873B = "确认关闭";
                this.f17921y = "继续试玩";
                return;
            }
            this.f17874C = "Confirm to close? ";
            this.f17872A = "You will not be rewarded after closing the window";
            this.f17873B = "Close it";
            this.f17921y = "Continue";
        }
    }

    public final int aa() {
        return this.as;
    }

    public final long ab() {
        return this.av;
    }

    public final long ac() {
        if (this.aw <= 0) {
            this.aw = 7200L;
        }
        return this.aw;
    }

    public final int ad() {
        return this.ay;
    }

    public final int ae() {
        return this.az;
    }

    public final int af() {
        return this.aA;
    }

    public final int ag() {
        return this.aB;
    }

    public final int ah() {
        return this.aC;
    }

    public final int ai() {
        return this.aD;
    }

    public final int aj() {
        return this.aF;
    }

    public final JSONArray ak() {
        return this.aG;
    }

    public final JSONObject al() {
        return this.aH;
    }

    public final String am() {
        return this.aI;
    }

    public final long an() {
        return this.aJ;
    }

    public final int ao() {
        return this.aK;
    }

    public final int ap() {
        return this.aL;
    }

    public final long aq() {
        return this.aM * 1000;
    }

    public final int ar() {
        return this.aN;
    }

    public final long as() {
        return this.aO;
    }

    public final int at() {
        return this.aQ;
    }

    public final int au() {
        return this.aR;
    }

    public final int av() {
        return this.aS;
    }

    public final int aw() {
        return this.aT;
    }

    public final String ax() {
        return this.aU;
    }

    public final String ay() {
        return this.aV;
    }

    public final int az() {
        return this.aW;
    }

    public final int b() {
        return this.f17902f;
    }

    public final int c() {
        return this.f17903g;
    }

    public final int d() {
        return this.f17904h;
    }

    public final String f() {
        return this.f17906j;
    }

    public final String g() {
        return this.f17907k;
    }

    public final String h() {
        return this.f17908l;
    }

    public final int i() {
        return this.f17909m;
    }

    public final int j() {
        return this.f17910n;
    }

    public final List<com.mbridge.msdk.foundation.entity.a> k() {
        return this.f17911o;
    }

    public final int l() {
        return this.f17912p;
    }

    public final long m() {
        return this.f17913q;
    }

    public final com.mbridge.msdk.c.a n() {
        return this.f17914r;
    }

    public final String o() {
        return this.f17915s;
    }

    public final Map<String, a> p() {
        return this.f17916t;
    }

    public final int q() {
        return this.f17918v;
    }

    public final int r() {
        return this.f17919w;
    }

    public final String s() {
        return this.f17921y;
    }

    public final String t() {
        return this.f17922z;
    }

    public String toString() {
        return " cfc=" + this.f17918v + " getpf=" + this.f17884M + " rurl=" + this.aE;
    }

    public final String u() {
        return this.f17872A;
    }

    public final String v() {
        return this.f17873B;
    }

    public final String w() {
        return this.f17874C;
    }

    public final int x() {
        return this.f17875D;
    }

    public final String y() {
        return this.f17876E;
    }

    public final String z() {
        return this.f17877F;
    }

    public final void b(int i8) {
        this.f17903g = i8;
    }

    public final void c(int i8) {
        this.f17904h = i8;
    }

    public final void d(int i8) {
        this.f17905i = i8;
    }

    public final void f(int i8) {
        this.f17910n = i8;
    }

    public final void g(int i8) {
        this.f17912p = i8;
    }

    public final void h(int i8) {
        this.f17918v = i8;
    }

    public final void i(int i8) {
        this.f17919w = i8;
    }

    public final void j(int i8) {
        this.f17875D = i8;
    }

    public final void k(int i8) {
        this.f17886O = i8;
    }

    public final void l(int i8) {
        this.f17890S = i8;
    }

    public final void m(int i8) {
        this.f17893V = i8;
    }

    public final void n(int i8) {
        this.f17894W = i8;
    }

    public final void o(int i8) {
        if (i8 > 0) {
            this.aj = i8;
        }
    }

    public final void p(int i8) {
        this.ai = i8;
    }

    public final void q(int i8) {
        this.ak = i8;
    }

    public final void r(int i8) {
        this.aF = i8;
    }

    public final void s(int i8) {
        this.aL = i8;
    }

    public final void t(int i8) {
        this.aN = i8;
    }

    public final void u(int i8) {
        this.aQ = i8;
    }

    public final void v(int i8) {
        this.aR = i8;
    }

    public final void w(int i8) {
        this.aS = i8;
    }

    public final void x(int i8) {
        this.aT = i8;
    }

    public final boolean y(int i8) {
        return this.ax.contains(Integer.valueOf(i8));
    }

    public final void b(String str) {
        this.am = str;
    }

    public final void c(String str) {
        this.an = str;
    }

    public final void d(String str) {
        this.ao = str;
    }

    public final void f(boolean z8) {
        this.aP = z8;
    }

    public final void b(long j8) {
        this.av = j8;
    }

    public final void c(long j8) {
        this.aw = j8;
    }

    public final void d(long j8) {
        this.aJ = j8;
    }

    public final void b(boolean z8) {
        this.f17920x = z8;
    }

    public final void c(boolean z8) {
        this.f17891T = z8;
    }

    public final void d(boolean z8) {
        this.f17898b = z8;
    }

    /* JADX WARN: Removed duplicated region for block: B:174:0x06a1 A[Catch: Exception -> 0x023e, TryCatch #12 {Exception -> 0x023e, blocks: (B:8:0x0017, B:11:0x0064, B:14:0x00ac, B:33:0x0150, B:35:0x0232, B:36:0x0242, B:38:0x0258, B:39:0x0291, B:42:0x02ad, B:44:0x02c7, B:46:0x02cd, B:47:0x02d3, B:49:0x02d9, B:51:0x02df, B:53:0x02e6, B:56:0x02e9, B:58:0x02ef, B:59:0x02f9, B:61:0x035d, B:63:0x0365, B:66:0x036c, B:68:0x0372, B:69:0x037a, B:71:0x0380, B:74:0x038c, B:77:0x0392, B:97:0x0451, B:106:0x0497, B:127:0x051f, B:133:0x0540, B:135:0x054e, B:137:0x055e, B:138:0x0567, B:172:0x0695, B:174:0x06a1, B:175:0x06ab, B:177:0x06b7, B:211:0x0692, B:214:0x058a, B:217:0x057a, B:220:0x053e, B:228:0x048e, B:256:0x0354, B:258:0x025d, B:260:0x0267, B:262:0x026d, B:263:0x0273, B:265:0x0279, B:267:0x028f, B:271:0x014d, B:272:0x00a8, B:273:0x0060, B:149:0x058c, B:207:0x060a, B:183:0x068e, B:155:0x0612, B:157:0x061c, B:159:0x0626, B:161:0x062e, B:163:0x0643, B:164:0x0656, B:166:0x0660, B:168:0x0668, B:170:0x067d, B:185:0x05af, B:187:0x05b9, B:189:0x05c3, B:191:0x05cb, B:196:0x05e2, B:198:0x05ec, B:200:0x05f4, B:99:0x0469, B:102:0x047b, B:105:0x0486, B:144:0x057c, B:147:0x0587, B:231:0x0305, B:232:0x0317, B:234:0x031d, B:237:0x0329, B:240:0x0333, B:243:0x0341, B:250:0x034b, B:252:0x0351, B:16:0x0102, B:18:0x010a, B:20:0x0110, B:21:0x0116, B:23:0x011c, B:25:0x0126, B:27:0x0142, B:31:0x014a, B:129:0x0530, B:132:0x053b), top: B:7:0x0017, inners: #0, #1, #2, #3, #9, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x06b7 A[Catch: Exception -> 0x023e, TRY_LEAVE, TryCatch #12 {Exception -> 0x023e, blocks: (B:8:0x0017, B:11:0x0064, B:14:0x00ac, B:33:0x0150, B:35:0x0232, B:36:0x0242, B:38:0x0258, B:39:0x0291, B:42:0x02ad, B:44:0x02c7, B:46:0x02cd, B:47:0x02d3, B:49:0x02d9, B:51:0x02df, B:53:0x02e6, B:56:0x02e9, B:58:0x02ef, B:59:0x02f9, B:61:0x035d, B:63:0x0365, B:66:0x036c, B:68:0x0372, B:69:0x037a, B:71:0x0380, B:74:0x038c, B:77:0x0392, B:97:0x0451, B:106:0x0497, B:127:0x051f, B:133:0x0540, B:135:0x054e, B:137:0x055e, B:138:0x0567, B:172:0x0695, B:174:0x06a1, B:175:0x06ab, B:177:0x06b7, B:211:0x0692, B:214:0x058a, B:217:0x057a, B:220:0x053e, B:228:0x048e, B:256:0x0354, B:258:0x025d, B:260:0x0267, B:262:0x026d, B:263:0x0273, B:265:0x0279, B:267:0x028f, B:271:0x014d, B:272:0x00a8, B:273:0x0060, B:149:0x058c, B:207:0x060a, B:183:0x068e, B:155:0x0612, B:157:0x061c, B:159:0x0626, B:161:0x062e, B:163:0x0643, B:164:0x0656, B:166:0x0660, B:168:0x0668, B:170:0x067d, B:185:0x05af, B:187:0x05b9, B:189:0x05c3, B:191:0x05cb, B:196:0x05e2, B:198:0x05ec, B:200:0x05f4, B:99:0x0469, B:102:0x047b, B:105:0x0486, B:144:0x057c, B:147:0x0587, B:231:0x0305, B:232:0x0317, B:234:0x031d, B:237:0x0329, B:240:0x0333, B:243:0x0341, B:250:0x034b, B:252:0x0351, B:16:0x0102, B:18:0x010a, B:20:0x0110, B:21:0x0116, B:23:0x011c, B:25:0x0126, B:27:0x0142, B:31:0x014a, B:129:0x0530, B:132:0x053b), top: B:7:0x0017, inners: #0, #1, #2, #3, #9, #11 }] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.mbridge.msdk.c.g a(org.json.JSONObject r17) {
        /*
            Method dump skipped, instructions count: 1739
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.c.b.a(org.json.JSONObject):com.mbridge.msdk.c.g");
    }

    public final int e() {
        return this.f17905i;
    }

    /* renamed from: com.mbridge.msdk.c.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0388b {

        /* renamed from: a, reason: collision with root package name */
        private String f17938a;

        /* renamed from: b, reason: collision with root package name */
        private JSONArray f17939b;

        /* renamed from: c, reason: collision with root package name */
        private String f17940c;

        /* renamed from: d, reason: collision with root package name */
        private String f17941d;

        /* renamed from: e, reason: collision with root package name */
        private String f17942e;

        /* renamed from: f, reason: collision with root package name */
        private String f17943f;

        public static C0388b a(JSONObject jSONObject) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            C0388b c0388b = new C0388b();
            Context c8 = com.mbridge.msdk.foundation.controller.c.m().c();
            c0388b.f17943f = jSONObject.optString(CampaignEx.JSON_KEY_TITLE, c8.getString(v.a(c8, "mbridge_cm_feedback_dialog_title", TypedValues.Custom.S_STRING)));
            c0388b.f17938a = jSONObject.optString("cancel", c8.getString(v.a(c8, "mbridge_cm_feedback_dialog_close_close", TypedValues.Custom.S_STRING)));
            c0388b.f17941d = jSONObject.optString("submit", c8.getString(v.a(c8, "mbridge_cm_feedback_dialog_close_submit", TypedValues.Custom.S_STRING)));
            c0388b.f17942e = jSONObject.optString("submit_notice", c8.getString(v.a(c8, "mbridge_cm_feedback_dialog_submit_notice", TypedValues.Custom.S_STRING)));
            c0388b.f17940c = jSONObject.optString("privacy", c8.getString(v.a(c8, "mbridge_cm_feedback_dialog_privacy_des", TypedValues.Custom.S_STRING)));
            JSONArray optJSONArray = jSONObject.optJSONArray("content");
            c0388b.f17939b = optJSONArray;
            if (optJSONArray == null) {
                JSONArray jSONArray = new JSONArray();
                c0388b.f17939b = jSONArray;
                jSONArray.put(c8.getString(v.a(c8, "mbridge_cm_feedback_dialog_content_not_play", TypedValues.Custom.S_STRING)));
                c0388b.f17939b.put(c8.getString(v.a(c8, "mbridge_cm_feedback_dialog_content_sound_problems", TypedValues.Custom.S_STRING)));
                c0388b.f17939b.put(c8.getString(v.a(c8, "mbridge_cm_feedback_dialog_content_misleading", TypedValues.Custom.S_STRING)));
                c0388b.f17939b.put(c8.getString(v.a(c8, "mbridge_cm_feedback_dialog_content_fraud", TypedValues.Custom.S_STRING)));
                c0388b.f17939b.put(c8.getString(v.a(c8, "mbridge_cm_feedback_dialog_content_por_violence", TypedValues.Custom.S_STRING)));
                c0388b.f17939b.put(c8.getString(v.a(c8, "mbridge_cm_feedback_dialog_content_other", TypedValues.Custom.S_STRING)));
            }
            return c0388b;
        }

        public final JSONArray b() {
            return this.f17939b;
        }

        public final String c() {
            return this.f17940c;
        }

        public final String d() {
            return this.f17941d;
        }

        public final String e() {
            return this.f17942e;
        }

        public final String f() {
            return this.f17943f;
        }

        public final String a() {
            return this.f17938a;
        }
    }

    public final void e(int i8) {
        this.f17909m = i8;
    }

    public final void e(long j8) {
        this.aM = j8;
    }

    public final void e(boolean z8) {
        this.aE = z8;
    }

    public final String a() {
        return this.f17901e;
    }

    public final void a(int i8) {
        this.f17902f = i8;
    }

    public final void a(long j8) {
        this.f17913q = j8;
    }

    public final void a(String str) {
        this.f17888Q = str;
    }

    public final void a(boolean z8) {
        this.f17917u = z8;
    }
}
