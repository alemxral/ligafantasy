package com.mbridge.msdk.newreward.b;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.newout.RewardVideoListener;
import com.mbridge.msdk.newreward.a.e;
import com.mbridge.msdk.newreward.a.f;
import com.mbridge.msdk.newreward.function.common.MBridgeDailyPlayModel;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class d extends a implements RewardVideoListener, c {

    /* renamed from: d, reason: collision with root package name */
    RewardVideoListener f20854d;

    /* renamed from: e, reason: collision with root package name */
    private int f20855e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f20856f;

    /* renamed from: g, reason: collision with root package name */
    private int f20857g;

    /* renamed from: h, reason: collision with root package name */
    private int f20858h;

    /* renamed from: i, reason: collision with root package name */
    private int f20859i;

    public d(int i8, String str, String str2, boolean z8) {
        super(i8, str, str2, z8);
        this.f20855e = 2;
        this.f20856f = false;
        if (i8 == 287) {
            this.f20855e = com.mbridge.msdk.foundation.same.a.f19399W;
        } else {
            this.f20855e = com.mbridge.msdk.foundation.same.a.f19398V;
        }
    }

    @Override // com.mbridge.msdk.newreward.b.a
    final void a() {
        this.f20845b.a(this.f20844a, this.f20846c);
    }

    @Override // com.mbridge.msdk.newreward.b.c
    public final boolean b() {
        return this.f20845b.d();
    }

    public final String c() {
        e b8;
        com.mbridge.msdk.newreward.function.f.a x8;
        com.mbridge.msdk.newreward.function.d.a.b b9;
        com.mbridge.msdk.newreward.a.c cVar = this.f20845b;
        if (cVar == null || (b8 = cVar.b()) == null || (x8 = b8.x()) == null || (b9 = x8.b()) == null) {
            return "";
        }
        String d8 = b9.d();
        if (TextUtils.isEmpty(d8)) {
            return "";
        }
        return d8;
    }

    public final String d() {
        e b8;
        com.mbridge.msdk.newreward.function.f.a x8;
        com.mbridge.msdk.newreward.function.d.a.b b9;
        com.mbridge.msdk.newreward.a.c cVar = this.f20845b;
        if (cVar == null || (b8 = cVar.b()) == null || (x8 = b8.x()) == null || (b9 = x8.b()) == null) {
            return "";
        }
        return com.mbridge.msdk.foundation.same.c.a(b9.C());
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public final void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
        RewardVideoListener rewardVideoListener = this.f20854d;
        if (rewardVideoListener != null) {
            rewardVideoListener.onAdClose(mBridgeIds, rewardInfo);
        }
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public final void onAdCloseWithIVReward(MBridgeIds mBridgeIds, boolean z8, int i8) {
        RewardVideoListener rewardVideoListener = this.f20854d;
        if (rewardVideoListener != null) {
            rewardVideoListener.onAdCloseWithIVReward(mBridgeIds, z8, i8);
        }
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public final void onAdShow(MBridgeIds mBridgeIds) {
        try {
            ((MBridgeDailyPlayModel) this.f20844a.a((Object) null, com.mbridge.msdk.newreward.function.c.e.CREATE_DAILY)).insertDailyCap();
        } catch (Exception e8) {
            ad.b("RewardVideoController", "updateDailyShowCap error:" + e8.getMessage());
        }
        RewardVideoListener rewardVideoListener = this.f20854d;
        if (rewardVideoListener != null) {
            rewardVideoListener.onAdShow(mBridgeIds);
        }
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public final void onEndcardShow(MBridgeIds mBridgeIds) {
        RewardVideoListener rewardVideoListener = this.f20854d;
        if (rewardVideoListener != null) {
            rewardVideoListener.onEndcardShow(mBridgeIds);
        }
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public final void onLoadSuccess(MBridgeIds mBridgeIds) {
        RewardVideoListener rewardVideoListener = this.f20854d;
        if (rewardVideoListener != null) {
            rewardVideoListener.onLoadSuccess(mBridgeIds);
        }
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public final void onShowFail(MBridgeIds mBridgeIds, String str) {
        RewardVideoListener rewardVideoListener = this.f20854d;
        if (rewardVideoListener != null) {
            rewardVideoListener.onShowFail(mBridgeIds, str);
        }
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public final void onVideoAdClicked(MBridgeIds mBridgeIds) {
        RewardVideoListener rewardVideoListener = this.f20854d;
        if (rewardVideoListener != null) {
            rewardVideoListener.onVideoAdClicked(mBridgeIds);
        }
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public final void onVideoComplete(MBridgeIds mBridgeIds) {
        RewardVideoListener rewardVideoListener = this.f20854d;
        if (rewardVideoListener != null) {
            rewardVideoListener.onVideoComplete(mBridgeIds);
        }
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public final void onVideoLoadFail(MBridgeIds mBridgeIds, String str) {
        RewardVideoListener rewardVideoListener = this.f20854d;
        if (rewardVideoListener != null) {
            rewardVideoListener.onVideoLoadFail(mBridgeIds, str);
        }
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public final void onVideoLoadSuccess(MBridgeIds mBridgeIds) {
        RewardVideoListener rewardVideoListener = this.f20854d;
        if (rewardVideoListener != null) {
            rewardVideoListener.onVideoLoadSuccess(mBridgeIds);
        }
    }

    @Override // com.mbridge.msdk.newreward.b.c
    public final void a(boolean z8, String str) {
        f fVar = new f(this.f20844a);
        e eVar = new e(z8, this.f20846c.e(), str, this.f20846c.c(), this.f20846c.f());
        eVar.d(this.f20846c.d());
        eVar.d(this.f20855e);
        eVar.c(com.mbridge.msdk.foundation.controller.c.m().k());
        eVar.c(this.f20846c.f() ? 2 : 1);
        eVar.e(com.mbridge.msdk.newreward.function.h.b.a(str));
        eVar.b(this.f20856f);
        eVar.a(this.f20857g, this.f20858h, this.f20859i);
        this.f20845b.a(eVar, fVar);
    }

    @Override // com.mbridge.msdk.newreward.b.c
    public final void a(String str) {
        this.f20845b.c();
    }

    public final void a(int i8) {
        this.f20855e = i8;
        com.mbridge.msdk.newreward.a.c cVar = this.f20845b;
        if (cVar != null) {
            Iterator<e> it = cVar.a().iterator();
            while (it.hasNext()) {
                it.next().d(i8);
            }
        }
    }

    public final void a(int i8, int i9, int i10) {
        this.f20857g = i8;
        this.f20858h = i9;
        if (i9 == com.mbridge.msdk.foundation.same.a.f19386J) {
            this.f20859i = i10 < 0 ? 5 : i10;
        }
        if (i9 == com.mbridge.msdk.foundation.same.a.f19385I) {
            this.f20859i = i10 < 0 ? 80 : i10;
        }
        com.mbridge.msdk.newreward.function.h.a.a(this.f20846c.c(), i8, i9, i10);
    }

    public final void a(boolean z8) {
        this.f20856f = z8;
    }

    @Override // com.mbridge.msdk.newreward.b.c
    public final void a(RewardVideoListener rewardVideoListener) {
        this.f20854d = rewardVideoListener;
        this.f20845b.a(this);
    }
}
