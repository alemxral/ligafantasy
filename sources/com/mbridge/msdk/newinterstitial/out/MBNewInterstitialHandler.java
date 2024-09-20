package com.mbridge.msdk.newinterstitial.out;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.c.h;
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
public class MBNewInterstitialHandler implements BaseExtraInterfaceForHandler {

    /* renamed from: a, reason: collision with root package name */
    private String f20662a;

    /* renamed from: b, reason: collision with root package name */
    private String f20663b;

    /* renamed from: c, reason: collision with root package name */
    private String f20664c;

    /* renamed from: d, reason: collision with root package name */
    private String f20665d;

    /* renamed from: e, reason: collision with root package name */
    private String f20666e;

    /* renamed from: f, reason: collision with root package name */
    private a f20667f;

    /* renamed from: g, reason: collision with root package name */
    private String f20668g;

    /* renamed from: h, reason: collision with root package name */
    private d f20669h;

    /* renamed from: j, reason: collision with root package name */
    private NewInterstitialListener f20671j;

    /* renamed from: p, reason: collision with root package name */
    private int f20677p;

    /* renamed from: q, reason: collision with root package name */
    private int f20678q;

    /* renamed from: r, reason: collision with root package name */
    private int f20679r;

    /* renamed from: i, reason: collision with root package name */
    private boolean f20670i = false;

    /* renamed from: k, reason: collision with root package name */
    private int f20672k = 2;

    /* renamed from: l, reason: collision with root package name */
    private boolean f20673l = false;

    /* renamed from: m, reason: collision with root package name */
    private boolean f20674m = false;

    /* renamed from: n, reason: collision with root package name */
    private boolean f20675n = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f20676o = false;

    public MBNewInterstitialHandler(Context context, String str, String str2) {
        if (c.m().c() == null && context != null) {
            c.m().b(context);
        }
        String e8 = ai.e(str2);
        if (!TextUtils.isEmpty(e8)) {
            ai.b(str2, e8);
        }
        this.f20662a = str;
        this.f20668g = str2;
    }

    private void a(String str, String str2) {
        try {
            if (this.f20667f == null) {
                a aVar = new a();
                this.f20667f = aVar;
                aVar.a(true);
                this.f20667f.b(str, str2);
                h.a().e(str2);
            }
        } catch (Throwable th) {
            ad.a("MBRewardVideoHandler", th.getMessage(), th);
        }
    }

    private void b(String str, String str2) {
        if (this.f20669h == null) {
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            this.f20669h = new d(287, str, TextUtils.isEmpty(str2) ? "" : str2, false);
            h.a().e(str2);
        }
    }

    public void clearVideoCache() {
        if (this.f20670i) {
            return;
        }
        try {
            if (this.f20667f != null) {
                ab.b();
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public String getCreativeIdWithUnitId() {
        if (this.f20670i) {
            d dVar = this.f20669h;
            if (dVar == null) {
                return "";
            }
            return dVar.d();
        }
        a aVar = this.f20667f;
        if (aVar == null) {
            return "";
        }
        return aVar.d();
    }

    public String getRequestId() {
        if (this.f20670i) {
            d dVar = this.f20669h;
            if (dVar == null) {
                return "";
            }
            return dVar.c();
        }
        a aVar = this.f20667f;
        if (aVar == null) {
            return "";
        }
        return aVar.a();
    }

    public boolean isReady() {
        if (this.f20670i) {
            d dVar = this.f20669h;
            if (dVar == null) {
                return false;
            }
            return dVar.b();
        }
        a aVar = this.f20667f;
        if (aVar == null) {
            return false;
        }
        return aVar.d(true);
    }

    public void load() {
        boolean a8 = b.a().a("new_bridge_new_interstitial_video");
        this.f20670i = a8;
        if (a8) {
            b();
            d dVar = this.f20669h;
            if (dVar != null) {
                dVar.a(true, "");
                return;
            }
            return;
        }
        a();
        if (this.f20667f != null) {
            this.f20667f.a(true, com.mbridge.msdk.foundation.same.report.d.c.a().a(0, 287, this.f20668g, true, 2));
        }
    }

    public void loadFormSelfFilling() {
        boolean a8 = b.a().a("new_bridge_new_interstitial_video");
        this.f20670i = a8;
        if (a8) {
            b();
            d dVar = this.f20669h;
            if (dVar != null) {
                dVar.a(false, "");
                return;
            }
            return;
        }
        a();
        if (this.f20667f != null) {
            this.f20667f.a(false, com.mbridge.msdk.foundation.same.report.d.c.a().a(0, 287, this.f20668g, true, 1));
        }
    }

    public void playVideoMute(int i8) {
        this.f20672k = i8;
        if (this.f20670i) {
            d dVar = this.f20669h;
            if (dVar != null) {
                dVar.a(i8);
                return;
            }
            return;
        }
        a aVar = this.f20667f;
        if (aVar != null) {
            aVar.a(i8);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.f20663b = str;
        this.f20664c = str2;
        this.f20665d = str3;
        this.f20666e = str4;
        this.f20675n = true;
        this.f20676o = true;
    }

    @Override // com.mbridge.msdk.out.BaseExtraInterfaceForHandler
    public void setExtraInfo(JSONObject jSONObject) {
        c.m().a(this.f20668g, jSONObject);
    }

    public void setIVRewardEnable(int i8, int i9) {
        this.f20677p = i8;
        this.f20678q = i9;
        this.f20679r = com.mbridge.msdk.foundation.same.a.f19386J;
    }

    public void setInterstitialVideoListener(NewInterstitialListener newInterstitialListener) {
        this.f20671j = newInterstitialListener;
        this.f20673l = true;
        this.f20674m = true;
    }

    public void setRewardVideoListener(NewInterstitialListener newInterstitialListener) {
        this.f20671j = newInterstitialListener;
        this.f20673l = true;
        this.f20674m = true;
    }

    public void show() {
        if (this.f20670i) {
            b();
            d dVar = this.f20669h;
            if (dVar != null) {
                dVar.a("");
                return;
            }
            return;
        }
        a();
        if (this.f20667f != null) {
            this.f20667f.a((String) null, (String) null, (String) null, com.mbridge.msdk.foundation.same.report.d.c.a().a(0, 287, this.f20668g, false, -1));
        }
    }

    private void b() {
        if (this.f20669h == null) {
            b(this.f20662a, this.f20668g);
        }
        if (this.f20673l) {
            d dVar = this.f20669h;
            if (dVar != null) {
                dVar.a(new NewInterstitialListenerWrapper(this.f20671j));
            }
            this.f20673l = false;
        }
        if (this.f20676o) {
            MBridgeGlobalCommon.setAlertDialogText(this.f20668g, this.f20663b, this.f20664c, this.f20665d, this.f20666e);
            this.f20676o = false;
        }
        d dVar2 = this.f20669h;
        if (dVar2 != null) {
            dVar2.a(this.f20677p, this.f20679r, this.f20678q);
            this.f20669h.a(this.f20672k);
        }
    }

    public void setIVRewardEnable(int i8, double d8) {
        this.f20677p = i8;
        this.f20678q = (int) (d8 * 100.0d);
        this.f20679r = com.mbridge.msdk.foundation.same.a.f19385I;
    }

    private void a() {
        if (this.f20667f == null) {
            a(this.f20662a, this.f20668g);
        }
        if (this.f20674m) {
            a aVar = this.f20667f;
            if (aVar != null) {
                aVar.a(new com.mbridge.msdk.newinterstitial.a.a(this.f20671j, this.f20668g, false));
            }
            this.f20674m = false;
        }
        if (this.f20675n) {
            a aVar2 = this.f20667f;
            if (aVar2 != null) {
                aVar2.a(this.f20663b, this.f20664c, this.f20665d, this.f20666e);
            }
            this.f20675n = false;
        }
        a aVar3 = this.f20667f;
        if (aVar3 != null) {
            aVar3.a(this.f20677p, this.f20679r, this.f20678q);
            this.f20667f.a(this.f20672k);
        }
    }

    public MBNewInterstitialHandler(String str, String str2) {
        this.f20662a = str;
        this.f20668g = str2;
    }
}
