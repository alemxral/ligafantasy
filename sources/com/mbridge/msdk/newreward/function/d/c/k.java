package com.mbridge.msdk.newreward.function.d.c;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes4.dex */
public final class k extends c {
    public k(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.a.a aVar) {
        super(bVar, aVar);
        a(false);
        b(true);
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.c
    protected final boolean a_() {
        return true;
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.o
    public final int h() {
        return 2;
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.o
    public final String j() {
        CampaignEx g8;
        if (b() == null || (g8 = b().g()) == null || g8.getRewardTemplateMode() == null || TextUtils.isEmpty(g8.getRewardTemplateMode().e())) {
            return "";
        }
        return g8.getRewardTemplateMode().e();
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.o
    public final q k() {
        return new z(a(), b(), this);
    }
}
