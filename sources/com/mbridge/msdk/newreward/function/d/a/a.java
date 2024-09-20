package com.mbridge.msdk.newreward.function.d.a;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.newreward.function.d.c.d;
import com.mbridge.msdk.newreward.function.d.c.f;
import com.mbridge.msdk.newreward.function.d.c.g;
import com.mbridge.msdk.newreward.function.d.c.h;
import com.mbridge.msdk.newreward.function.d.c.j;
import com.mbridge.msdk.newreward.function.d.c.k;
import com.mbridge.msdk.newreward.function.d.c.l;
import com.mbridge.msdk.newreward.function.d.c.m;
import com.mbridge.msdk.newreward.function.d.c.n;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private b f21010a;

    /* renamed from: b, reason: collision with root package name */
    private CampaignEx f21011b;

    /* renamed from: c, reason: collision with root package name */
    private String f21012c;

    /* renamed from: d, reason: collision with root package name */
    private String f21013d;

    /* renamed from: e, reason: collision with root package name */
    private String f21014e;

    /* renamed from: f, reason: collision with root package name */
    private d<?> f21015f;

    /* renamed from: g, reason: collision with root package name */
    private n f21016g;

    /* renamed from: h, reason: collision with root package name */
    private d<?> f21017h;

    /* renamed from: i, reason: collision with root package name */
    private l f21018i;

    /* renamed from: j, reason: collision with root package name */
    private h f21019j;

    /* renamed from: k, reason: collision with root package name */
    private m f21020k;

    public a(b bVar) {
        this.f21010a = bVar;
    }

    public final m a() {
        CampaignEx.c rewardTemplateMode;
        m mVar = this.f21020k;
        if (mVar != null) {
            return mVar;
        }
        CampaignEx campaignEx = this.f21011b;
        if (campaignEx == null || (rewardTemplateMode = campaignEx.getRewardTemplateMode()) == null) {
            return null;
        }
        String c8 = rewardTemplateMode.c();
        if (TextUtils.isEmpty(c8)) {
            return null;
        }
        if (this.f21020k == null) {
            this.f21020k = new m(this.f21010a, this, c8);
        }
        return this.f21020k;
    }

    public final h b() {
        h hVar = this.f21019j;
        if (hVar != null) {
            return hVar;
        }
        CampaignEx campaignEx = this.f21011b;
        if (campaignEx == null || TextUtils.isEmpty(campaignEx.getEndScreenUrl())) {
            return null;
        }
        if (this.f21019j == null) {
            this.f21019j = new h(this.f21010a, this);
        }
        return this.f21019j;
    }

    public final d<?> c() {
        d<?> dVar = this.f21015f;
        if (dVar != null) {
            return dVar;
        }
        CampaignEx campaignEx = this.f21011b;
        if (campaignEx == null || campaignEx.getRewardTemplateMode() == null) {
            return null;
        }
        String e8 = campaignEx.getRewardTemplateMode().e();
        if (TextUtils.isEmpty(e8)) {
            return null;
        }
        if (this.f21015f == null) {
            if (com.mbridge.msdk.newreward.function.h.a.b(e8)) {
                this.f21015f = new g(this.f21010a, this);
            } else {
                this.f21015f = new k(this.f21010a, this);
            }
        }
        return this.f21015f;
    }

    public final n d() {
        n nVar = this.f21016g;
        if (nVar != null) {
            return nVar;
        }
        CampaignEx campaignEx = this.f21011b;
        if (campaignEx == null || TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
            return null;
        }
        if (this.f21016g == null) {
            this.f21016g = new n(this.f21010a, this);
        }
        return this.f21016g;
    }

    public final l e() {
        l lVar = this.f21018i;
        if (lVar != null) {
            return lVar;
        }
        CampaignEx campaignEx = this.f21011b;
        if (campaignEx == null || TextUtils.isEmpty(campaignEx.getMraid())) {
            return null;
        }
        if (this.f21018i == null) {
            this.f21018i = new l(this.f21010a, this);
        }
        return this.f21018i;
    }

    public final d<?> f() {
        d<?> dVar = this.f21017h;
        if (dVar != null) {
            return dVar;
        }
        CampaignEx campaignEx = this.f21011b;
        if (campaignEx == null) {
            return null;
        }
        String str = campaignEx.getendcard_url();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.f21017h == null) {
            if (com.mbridge.msdk.newreward.function.h.a.b(str)) {
                if (ai.l(str)) {
                    this.f21017h = new j(this.f21010a, this);
                } else {
                    this.f21017h = new f(this.f21010a, this);
                }
            } else {
                this.f21017h = new j(this.f21010a, this);
            }
        }
        return this.f21017h;
    }

    public final CampaignEx g() {
        return this.f21011b;
    }

    public final b h() {
        return this.f21010a;
    }

    public final boolean i() {
        CampaignEx campaignEx = this.f21011b;
        if (campaignEx != null) {
            return campaignEx.isMraid();
        }
        return false;
    }

    public final void b(String str) {
        this.f21013d = str;
    }

    public final void a(String str) {
        this.f21012c = str;
    }

    public final void a(CampaignEx campaignEx) {
        this.f21011b = campaignEx;
    }

    public final void c(String str) {
        this.f21014e = str;
    }
}
