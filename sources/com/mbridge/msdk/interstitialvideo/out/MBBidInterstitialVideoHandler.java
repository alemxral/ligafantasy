package com.mbridge.msdk.interstitialvideo.out;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.b;
import com.mbridge.msdk.foundation.tools.ab;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.newreward.b.d;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.reward.b.a;

/* loaded from: classes4.dex */
public class MBBidInterstitialVideoHandler {

    /* renamed from: a, reason: collision with root package name */
    private a f20219a;

    /* renamed from: b, reason: collision with root package name */
    private String f20220b;

    /* renamed from: c, reason: collision with root package name */
    private String f20221c;

    /* renamed from: d, reason: collision with root package name */
    private String f20222d;

    /* renamed from: e, reason: collision with root package name */
    private String f20223e;

    /* renamed from: f, reason: collision with root package name */
    private String f20224f;

    /* renamed from: g, reason: collision with root package name */
    private String f20225g;

    /* renamed from: h, reason: collision with root package name */
    private d f20226h;

    /* renamed from: j, reason: collision with root package name */
    private InterstitialVideoListener f20228j;

    /* renamed from: p, reason: collision with root package name */
    private int f20234p;

    /* renamed from: q, reason: collision with root package name */
    private int f20235q;

    /* renamed from: r, reason: collision with root package name */
    private int f20236r;

    /* renamed from: i, reason: collision with root package name */
    private boolean f20227i = false;

    /* renamed from: k, reason: collision with root package name */
    private int f20229k = 2;

    /* renamed from: l, reason: collision with root package name */
    private boolean f20230l = false;

    /* renamed from: m, reason: collision with root package name */
    private boolean f20231m = false;

    /* renamed from: n, reason: collision with root package name */
    private boolean f20232n = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f20233o = false;

    public MBBidInterstitialVideoHandler(Context context, String str, String str2) {
        if (c.m().c() == null && context != null) {
            c.m().b(context);
        }
        String e8 = ai.e(str2);
        if (!TextUtils.isEmpty(e8)) {
            ai.b(str2, e8);
        }
        this.f20220b = str2;
        this.f20221c = str;
    }

    private void a(String str, String str2) {
        try {
            if (this.f20219a == null) {
                a aVar = new a();
                this.f20219a = aVar;
                aVar.a(true);
                this.f20219a.b(true);
                this.f20219a.b(str, str2);
            }
        } catch (Throwable th) {
            ad.a("MBBidRewardVideoHandler", th.getMessage(), th);
        }
    }

    private void b(String str, String str2) {
        if (this.f20226h == null) {
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            this.f20226h = new d(287, str, str2, true);
        }
    }

    public void clearVideoCache() {
        if (this.f20227i) {
            return;
        }
        try {
            if (this.f20219a != null) {
                ab.b();
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public String getCreativeIdWithUnitId() {
        if (this.f20227i) {
            d dVar = this.f20226h;
            if (dVar == null) {
                return "";
            }
            return dVar.d();
        }
        a aVar = this.f20219a;
        if (aVar == null) {
            return "";
        }
        return aVar.d();
    }

    public String getRequestId() {
        if (this.f20227i) {
            d dVar = this.f20226h;
            if (dVar == null) {
                return "";
            }
            return dVar.c();
        }
        a aVar = this.f20219a;
        if (aVar == null) {
            return "";
        }
        return aVar.a();
    }

    public boolean isBidReady() {
        if (this.f20227i) {
            d dVar = this.f20226h;
            if (dVar == null) {
                return false;
            }
            return dVar.b();
        }
        a aVar = this.f20219a;
        if (aVar == null) {
            return false;
        }
        return aVar.d(true);
    }

    public void loadFormSelfFilling() {
        boolean a8 = b.a().a("new_bridge_reward_video");
        this.f20227i = a8;
        if (a8) {
            b();
            d dVar = this.f20226h;
            if (dVar != null) {
                dVar.a(false, "");
                return;
            }
            return;
        }
        a();
        if (this.f20219a != null) {
            this.f20219a.a(false, com.mbridge.msdk.foundation.same.report.d.c.a().a(1, 287, this.f20220b, true, 1));
        }
    }

    public void loadFromBid(String str) {
        boolean a8 = b.a().a("new_bridge_reward_video");
        this.f20227i = a8;
        if (a8) {
            b();
            d dVar = this.f20226h;
            if (dVar != null) {
                dVar.a(true, str);
                return;
            }
            return;
        }
        a();
        if (this.f20219a != null) {
            this.f20219a.a(true, str, com.mbridge.msdk.foundation.same.report.d.c.a().a(1, 287, this.f20220b, true, 2));
        }
    }

    public void playVideoMute(int i8) {
        this.f20229k = i8;
        if (this.f20227i) {
            d dVar = this.f20226h;
            if (dVar != null) {
                dVar.a(i8);
                return;
            }
            return;
        }
        a aVar = this.f20219a;
        if (aVar != null) {
            aVar.a(i8);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.f20222d = str;
        this.f20223e = str2;
        this.f20224f = str3;
        this.f20225g = str4;
        this.f20232n = true;
        this.f20233o = true;
    }

    public void setIVRewardEnable(int i8, int i9) {
        this.f20234p = i8;
        this.f20235q = i9;
        this.f20236r = com.mbridge.msdk.foundation.same.a.f19386J;
    }

    public void setInterstitialVideoListener(InterstitialVideoListener interstitialVideoListener) {
        this.f20228j = interstitialVideoListener;
        this.f20231m = true;
        this.f20230l = true;
    }

    public void setRewardVideoListener(InterstitialVideoListener interstitialVideoListener) {
        this.f20228j = interstitialVideoListener;
        this.f20231m = true;
        this.f20230l = true;
    }

    public void showFromBid() {
        if (this.f20227i) {
            b();
            d dVar = this.f20226h;
            if (dVar != null) {
                dVar.a("");
                return;
            }
            return;
        }
        a();
        if (this.f20219a != null) {
            this.f20219a.a((String) null, (String) null, (String) null, com.mbridge.msdk.foundation.same.report.d.c.a().a(1, 287, this.f20220b, false, -1));
        }
    }

    private void b() {
        if (this.f20226h == null) {
            b(this.f20221c, this.f20220b);
        }
        if (this.f20230l) {
            d dVar = this.f20226h;
            if (dVar != null) {
                dVar.a(new InterstitialVideoListenerWrapper(this.f20228j));
            }
            this.f20230l = false;
        }
        if (this.f20233o) {
            MBridgeGlobalCommon.setAlertDialogText(this.f20220b, this.f20222d, this.f20223e, this.f20224f, this.f20225g);
            this.f20233o = false;
        }
        d dVar2 = this.f20226h;
        if (dVar2 != null) {
            dVar2.a(this.f20234p, this.f20236r, this.f20235q);
            this.f20226h.a(this.f20229k);
        }
    }

    public void setIVRewardEnable(int i8, double d8) {
        this.f20234p = i8;
        this.f20235q = (int) (d8 * 100.0d);
        this.f20236r = com.mbridge.msdk.foundation.same.a.f19385I;
    }

    private void a() {
        if (this.f20219a == null) {
            a(this.f20221c, this.f20220b);
        }
        if (this.f20231m) {
            a aVar = this.f20219a;
            if (aVar != null) {
                aVar.a(new com.mbridge.msdk.interstitialvideo.a.a(this.f20228j, this.f20220b, true));
            }
            this.f20231m = false;
        }
        if (this.f20232n) {
            a aVar2 = this.f20219a;
            if (aVar2 != null) {
                aVar2.a(this.f20222d, this.f20223e, this.f20224f, this.f20225g);
            }
            this.f20232n = false;
        }
        a aVar3 = this.f20219a;
        if (aVar3 != null) {
            aVar3.a(this.f20234p, this.f20236r, this.f20235q);
            this.f20219a.a(this.f20229k);
        }
    }

    public MBBidInterstitialVideoHandler(String str, String str2) {
        this.f20220b = str2;
        this.f20221c = str;
    }
}
