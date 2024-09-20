package com.mbridge.msdk.newinterstitial.out;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.b;
import com.mbridge.msdk.foundation.tools.ab;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.newreward.b.d;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.out.BaseExtraInterfaceForHandler;
import com.mbridge.msdk.reward.b.a;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class MBBidNewInterstitialHandler implements BaseExtraInterfaceForHandler {

    /* renamed from: a, reason: collision with root package name */
    private final String f20644a;

    /* renamed from: b, reason: collision with root package name */
    private String f20645b;

    /* renamed from: c, reason: collision with root package name */
    private String f20646c;

    /* renamed from: d, reason: collision with root package name */
    private String f20647d;

    /* renamed from: e, reason: collision with root package name */
    private String f20648e;

    /* renamed from: f, reason: collision with root package name */
    private a f20649f;

    /* renamed from: g, reason: collision with root package name */
    private String f20650g;

    /* renamed from: h, reason: collision with root package name */
    private d f20651h;

    /* renamed from: j, reason: collision with root package name */
    private NewInterstitialListener f20653j;

    /* renamed from: p, reason: collision with root package name */
    private int f20659p;

    /* renamed from: q, reason: collision with root package name */
    private int f20660q;

    /* renamed from: r, reason: collision with root package name */
    private int f20661r;

    /* renamed from: i, reason: collision with root package name */
    private boolean f20652i = false;

    /* renamed from: k, reason: collision with root package name */
    private int f20654k = 2;

    /* renamed from: l, reason: collision with root package name */
    private boolean f20655l = false;

    /* renamed from: m, reason: collision with root package name */
    private boolean f20656m = false;

    /* renamed from: n, reason: collision with root package name */
    private boolean f20657n = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f20658o = false;

    public MBBidNewInterstitialHandler(Context context, String str, String str2) {
        if (c.m().c() == null && context != null) {
            c.m().b(context);
        }
        String e8 = ai.e(str2);
        if (!TextUtils.isEmpty(e8)) {
            ai.b(str2, e8);
        }
        this.f20644a = str;
        this.f20650g = str2;
    }

    private void a(String str, String str2) {
        try {
            if (this.f20649f == null) {
                a aVar = new a();
                this.f20649f = aVar;
                aVar.a(true);
                this.f20649f.b(true);
                this.f20649f.b(str, str2);
            }
        } catch (Throwable th) {
            ad.a("MBBidNewInterstitialHandler", th.getMessage(), th);
        }
    }

    private void b(String str, String str2) {
        if (this.f20651h == null) {
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            this.f20651h = new d(287, str, str2, true);
        }
    }

    public void clearVideoCache() {
        if (this.f20652i) {
            return;
        }
        try {
            if (this.f20649f != null) {
                ab.b();
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public String getCreativeIdWithUnitId() {
        if (this.f20652i) {
            d dVar = this.f20651h;
            if (dVar == null) {
                return "";
            }
            return dVar.d();
        }
        a aVar = this.f20649f;
        if (aVar == null) {
            return "";
        }
        return aVar.d();
    }

    public String getRequestId() {
        if (this.f20652i) {
            d dVar = this.f20651h;
            if (dVar == null) {
                return "";
            }
            return dVar.c();
        }
        a aVar = this.f20649f;
        if (aVar == null) {
            return "";
        }
        return aVar.a();
    }

    public boolean isBidReady() {
        if (this.f20652i) {
            d dVar = this.f20651h;
            if (dVar == null) {
                return false;
            }
            return dVar.b();
        }
        a aVar = this.f20649f;
        if (aVar == null) {
            return false;
        }
        return aVar.d(true);
    }

    public void loadFormSelfFilling() {
        boolean a8 = b.a().a("new_bridge_new_interstitial_video");
        this.f20652i = a8;
        if (a8) {
            b();
            d dVar = this.f20651h;
            if (dVar != null) {
                dVar.a(false, "");
                return;
            }
            return;
        }
        a();
        if (this.f20649f != null) {
            this.f20649f.a(false, com.mbridge.msdk.foundation.same.report.d.c.a().a(1, 287, this.f20650g, true, 1));
        }
    }

    public void loadFromBid(String str) {
        boolean a8 = b.a().a("new_bridge_new_interstitial_video");
        this.f20652i = a8;
        if (a8) {
            b();
            d dVar = this.f20651h;
            if (dVar != null) {
                dVar.a(true, str);
                return;
            }
            return;
        }
        a();
        if (this.f20649f != null) {
            this.f20649f.a(true, str, com.mbridge.msdk.foundation.same.report.d.c.a().a(1, 287, this.f20650g, true, 2));
        }
    }

    public void playVideoMute(int i8) {
        this.f20654k = i8;
        if (this.f20652i) {
            d dVar = this.f20651h;
            if (dVar != null) {
                dVar.a(i8);
                return;
            }
            return;
        }
        a aVar = this.f20649f;
        if (aVar != null) {
            aVar.a(i8);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.f20646c = str;
        this.f20645b = str2;
        this.f20647d = str3;
        this.f20648e = str4;
        this.f20657n = true;
        this.f20658o = true;
    }

    @Override // com.mbridge.msdk.out.BaseExtraInterfaceForHandler
    public void setExtraInfo(JSONObject jSONObject) {
        c.m().a(this.f20650g, jSONObject);
    }

    public void setIVRewardEnable(int i8, int i9) {
        this.f20659p = i8;
        this.f20660q = i9;
        this.f20661r = com.mbridge.msdk.foundation.same.a.f19386J;
    }

    public void setInterstitialVideoListener(NewInterstitialListener newInterstitialListener) {
        this.f20653j = newInterstitialListener;
        this.f20655l = true;
        this.f20656m = true;
    }

    public void setRewardVideoListener(NewInterstitialListener newInterstitialListener) {
        this.f20653j = newInterstitialListener;
        this.f20655l = true;
        this.f20656m = true;
    }

    public void showFromBid() {
        if (this.f20652i) {
            b();
            d dVar = this.f20651h;
            if (dVar != null) {
                dVar.a("");
                return;
            }
            return;
        }
        a();
        if (this.f20649f != null) {
            this.f20649f.a((String) null, (String) null, (String) null, com.mbridge.msdk.foundation.same.report.d.c.a().a(1, 287, this.f20650g, false, -1));
        }
    }

    private void b() {
        if (this.f20651h == null) {
            b(this.f20644a, this.f20650g);
        }
        if (this.f20655l) {
            d dVar = this.f20651h;
            if (dVar != null) {
                dVar.a(new NewInterstitialListenerWrapper(this.f20653j));
            }
            this.f20655l = false;
        }
        if (this.f20658o) {
            MBridgeGlobalCommon.setAlertDialogText(this.f20650g, this.f20646c, this.f20645b, this.f20647d, this.f20648e);
            this.f20658o = false;
        }
        d dVar2 = this.f20651h;
        if (dVar2 != null) {
            dVar2.a(this.f20654k);
            this.f20651h.a(this.f20659p, this.f20661r, this.f20660q);
        }
    }

    public void setIVRewardEnable(int i8, double d8) {
        this.f20659p = i8;
        this.f20660q = (int) (d8 * 100.0d);
        this.f20661r = com.mbridge.msdk.foundation.same.a.f19385I;
    }

    private void a() {
        if (this.f20649f == null) {
            a(this.f20644a, this.f20650g);
        }
        if (this.f20656m) {
            a aVar = this.f20649f;
            if (aVar != null) {
                aVar.a(new com.mbridge.msdk.newinterstitial.a.a(this.f20653j, this.f20650g, true));
            }
            this.f20656m = false;
        }
        if (this.f20657n) {
            a aVar2 = this.f20649f;
            if (aVar2 != null) {
                aVar2.a(this.f20646c, this.f20645b, this.f20647d, this.f20648e);
            }
            this.f20657n = false;
        }
        a aVar3 = this.f20649f;
        if (aVar3 != null) {
            aVar3.a(this.f20654k);
            this.f20649f.a(this.f20659p, this.f20661r, this.f20660q);
        }
    }

    public MBBidNewInterstitialHandler(String str, String str2) {
        this.f20644a = str;
        this.f20650g = str2;
    }
}
