package com.mbridge.msdk.reward.b;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.b.e;
import com.mbridge.msdk.foundation.tools.ab;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final Context f21647a;

    /* renamed from: b, reason: collision with root package name */
    private final String f21648b;

    public c(Context context, String str) {
        this.f21647a = context;
        this.f21648b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CopyOnWriteArrayList<CampaignEx> a8;
        if (this.f21647a != null && !TextUtils.isEmpty(this.f21648b)) {
            try {
                com.mbridge.msdk.reward.c.a.a(this.f21647a, this.f21648b);
                ab.a();
                ab.a(e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_RES));
                ab.a(e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_HTML));
                com.mbridge.msdk.videocommon.d.b.a().c(this.f21648b);
                if (!af.a().a("c_d_v_w_i", false) && !TextUtils.isEmpty(this.f21648b) && (a8 = com.mbridge.msdk.videocommon.a.a.a().a(this.f21648b, 1)) != null && a8.size() > 0) {
                    com.mbridge.msdk.videocommon.download.b.getInstance().createUnitCache(this.f21647a, this.f21648b, a8, 94, (com.mbridge.msdk.videocommon.listener.a) null);
                }
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    ad.a("RewardVideoControllerInitTask", "initRewardVideoController task ", e8);
                }
            }
        }
    }
}
