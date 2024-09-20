package com.mbridge.msdk.interstitialvideo.out;

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
import com.mbridge.msdk.reward.b.a;

/* loaded from: classes4.dex */
public class MBInterstitialVideoHandler {

    /* renamed from: a, reason: collision with root package name */
    private String f20237a;

    /* renamed from: b, reason: collision with root package name */
    private a f20238b;

    /* renamed from: c, reason: collision with root package name */
    private String f20239c;

    /* renamed from: d, reason: collision with root package name */
    private String f20240d;

    /* renamed from: e, reason: collision with root package name */
    private String f20241e;

    /* renamed from: f, reason: collision with root package name */
    private String f20242f;

    /* renamed from: g, reason: collision with root package name */
    private String f20243g;

    /* renamed from: h, reason: collision with root package name */
    private d f20244h;

    /* renamed from: j, reason: collision with root package name */
    private InterstitialVideoListener f20246j;

    /* renamed from: p, reason: collision with root package name */
    private int f20252p;

    /* renamed from: q, reason: collision with root package name */
    private int f20253q;

    /* renamed from: r, reason: collision with root package name */
    private int f20254r;

    /* renamed from: i, reason: collision with root package name */
    private boolean f20245i = false;

    /* renamed from: k, reason: collision with root package name */
    private int f20247k = 2;

    /* renamed from: l, reason: collision with root package name */
    private boolean f20248l = false;

    /* renamed from: m, reason: collision with root package name */
    private boolean f20249m = false;

    /* renamed from: n, reason: collision with root package name */
    private boolean f20250n = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f20251o = false;

    public MBInterstitialVideoHandler(Context context, String str, String str2) {
        if (c.m().c() == null && context != null) {
            c.m().b(context);
        }
        String e8 = ai.e(str2);
        if (!TextUtils.isEmpty(e8)) {
            ai.b(str2, e8);
        }
        this.f20237a = str;
        this.f20239c = str2;
    }

    private void a(String str, String str2) {
        try {
            if (this.f20238b == null) {
                a aVar = new a();
                this.f20238b = aVar;
                aVar.a(true);
                this.f20238b.b(str, str2);
                h.a().e(str2);
            }
        } catch (Throwable th) {
            ad.a("MBRewardVideoHandler", th.getMessage(), th);
        }
    }

    private void b(String str, String str2) {
        if (this.f20244h == null) {
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            this.f20244h = new d(287, str, TextUtils.isEmpty(str2) ? "" : str2, false);
            h.a().e(str2);
        }
    }

    public void clearVideoCache() {
        if (this.f20245i) {
            return;
        }
        try {
            if (this.f20238b != null) {
                ab.b();
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public String getCreativeIdWithUnitId() {
        if (this.f20245i) {
            d dVar = this.f20244h;
            if (dVar == null) {
                return "";
            }
            return dVar.d();
        }
        a aVar = this.f20238b;
        if (aVar == null) {
            return "";
        }
        return aVar.d();
    }

    public String getRequestId() {
        if (this.f20245i) {
            d dVar = this.f20244h;
            if (dVar == null) {
                return "";
            }
            return dVar.c();
        }
        a aVar = this.f20238b;
        if (aVar == null) {
            return "";
        }
        return aVar.a();
    }

    public boolean isReady() {
        if (this.f20245i) {
            d dVar = this.f20244h;
            if (dVar == null) {
                return false;
            }
            return dVar.b();
        }
        a aVar = this.f20238b;
        if (aVar == null) {
            return false;
        }
        return aVar.d(true);
    }

    public void load() {
        boolean a8 = b.a().a("new_bridge_reward_video");
        this.f20245i = a8;
        if (a8) {
            b();
            d dVar = this.f20244h;
            if (dVar != null) {
                dVar.a(true, "");
                return;
            }
            return;
        }
        a();
        if (this.f20238b != null) {
            this.f20238b.a(true, com.mbridge.msdk.foundation.same.report.d.c.a().a(0, 287, this.f20239c, true, 2));
        }
    }

    public void loadFormSelfFilling() {
        boolean a8 = b.a().a("new_bridge_reward_video");
        this.f20245i = a8;
        if (a8) {
            b();
            d dVar = this.f20244h;
            if (dVar != null) {
                dVar.a(false, "");
                return;
            }
            return;
        }
        a();
        if (this.f20238b != null) {
            this.f20238b.a(false, com.mbridge.msdk.foundation.same.report.d.c.a().a(0, 287, this.f20239c, true, 1));
        }
    }

    public void playVideoMute(int i8) {
        this.f20247k = i8;
        if (this.f20245i) {
            d dVar = this.f20244h;
            if (dVar != null) {
                dVar.a(i8);
                return;
            }
            return;
        }
        a aVar = this.f20238b;
        if (aVar != null) {
            aVar.a(i8);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.f20240d = str;
        this.f20241e = str2;
        this.f20242f = str3;
        this.f20243g = str4;
        this.f20250n = true;
        this.f20251o = true;
    }

    public void setIVRewardEnable(int i8, int i9) {
        this.f20252p = i8;
        this.f20253q = i9;
        this.f20254r = com.mbridge.msdk.foundation.same.a.f19386J;
    }

    public void setInterstitialVideoListener(InterstitialVideoListener interstitialVideoListener) {
        this.f20246j = interstitialVideoListener;
        this.f20249m = true;
        this.f20248l = true;
    }

    public void setRewardVideoListener(InterstitialVideoListener interstitialVideoListener) {
        this.f20246j = interstitialVideoListener;
        this.f20249m = true;
        this.f20248l = true;
    }

    public void show() {
        if (this.f20245i) {
            b();
            d dVar = this.f20244h;
            if (dVar != null) {
                dVar.a("");
                return;
            }
            return;
        }
        a();
        if (this.f20238b != null) {
            this.f20238b.a((String) null, (String) null, (String) null, com.mbridge.msdk.foundation.same.report.d.c.a().a(0, 287, this.f20239c, false, -1));
        }
    }

    private void b() {
        if (this.f20244h == null) {
            b(this.f20237a, this.f20239c);
        }
        if (this.f20248l) {
            this.f20244h.a(new InterstitialVideoListenerWrapper(this.f20246j));
            this.f20248l = false;
        }
        if (this.f20251o) {
            MBridgeGlobalCommon.setAlertDialogText(this.f20239c, this.f20240d, this.f20241e, this.f20242f, this.f20243g);
            this.f20251o = false;
        }
        d dVar = this.f20244h;
        if (dVar != null) {
            dVar.a(this.f20252p, this.f20254r, this.f20253q);
            this.f20244h.a(this.f20247k);
        }
    }

    public void setIVRewardEnable(int i8, double d8) {
        this.f20252p = i8;
        this.f20253q = (int) (d8 * 100.0d);
        this.f20254r = com.mbridge.msdk.foundation.same.a.f19385I;
    }

    private void a() {
        if (this.f20238b == null) {
            a(this.f20237a, this.f20239c);
        }
        if (this.f20249m) {
            this.f20238b.a(new com.mbridge.msdk.interstitialvideo.a.a(this.f20246j, this.f20239c, false));
            this.f20249m = false;
        }
        if (this.f20250n) {
            this.f20238b.a(this.f20240d, this.f20241e, this.f20242f, this.f20243g);
            this.f20250n = false;
        }
        a aVar = this.f20238b;
        if (aVar != null) {
            aVar.a(this.f20252p, this.f20254r, this.f20253q);
            this.f20238b.a(this.f20247k);
        }
    }

    public MBInterstitialVideoHandler(String str, String str2) {
        this.f20239c = str2;
        this.f20237a = str;
    }
}
