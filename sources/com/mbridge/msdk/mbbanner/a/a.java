package com.mbridge.msdk.mbbanner.a;

import android.text.TextUtils;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.c.j;
import com.mbridge.msdk.c.k;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.aq;
import com.mbridge.msdk.mbbanner.common.a.b;
import com.mbridge.msdk.mbbanner.common.c.c;
import com.mbridge.msdk.out.BannerAdListener;
import com.mbridge.msdk.out.BannerSize;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.out.MBridgeIds;
import java.util.List;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static String f20255a = "BannerController";

    /* renamed from: b, reason: collision with root package name */
    private String f20256b;

    /* renamed from: c, reason: collision with root package name */
    private String f20257c;

    /* renamed from: d, reason: collision with root package name */
    private MBridgeIds f20258d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f20259e;

    /* renamed from: f, reason: collision with root package name */
    private int f20260f;

    /* renamed from: g, reason: collision with root package name */
    private MBBannerView f20261g;

    /* renamed from: h, reason: collision with root package name */
    private int f20262h;

    /* renamed from: i, reason: collision with root package name */
    private int f20263i;

    /* renamed from: j, reason: collision with root package name */
    private int f20264j;

    /* renamed from: l, reason: collision with root package name */
    private BannerAdListener f20266l;

    /* renamed from: m, reason: collision with root package name */
    private CampaignUnit f20267m;

    /* renamed from: n, reason: collision with root package name */
    private c f20268n;

    /* renamed from: o, reason: collision with root package name */
    private k f20269o;

    /* renamed from: p, reason: collision with root package name */
    private j f20270p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f20271q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f20272r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f20273s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f20274t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f20275u;

    /* renamed from: k, reason: collision with root package name */
    private int f20265k = -1;

    /* renamed from: v, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.b.c f20276v = new com.mbridge.msdk.mbbanner.common.b.c() { // from class: com.mbridge.msdk.mbbanner.a.a.1
        @Override // com.mbridge.msdk.mbbanner.common.b.c
        public final void a(List<CampaignEx> list) {
            if (a.this.f20266l != null) {
                a.this.f20266l.onLoadSuccessed(a.this.f20258d);
            }
            ad.b(a.f20255a, "onShowSuccessed:");
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.c
        public final void b() {
            if (a.this.f20266l != null) {
                a.this.f20266l.onLeaveApp(a.this.f20258d);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.c
        public final void c() {
            if (a.this.f20266l != null) {
                a.this.f20266l.showFullScreen(a.this.f20258d);
                a.this.f20275u = true;
                com.mbridge.msdk.mbbanner.common.c.a.a().a(2, a.this.f20257c, a.this.f20256b, null, null);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.c
        public final void d() {
            if (a.this.f20266l != null) {
                a.this.f20266l.closeFullScreen(a.this.f20258d);
                a.this.f20275u = false;
                com.mbridge.msdk.mbbanner.common.c.a.a().a(3, a.this.f20257c, a.this.f20256b, new b(a.this.f20263i + "x" + a.this.f20262h, a.this.f20264j * 1000), a.this.f20277w);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.c
        public final void e() {
            if (a.this.f20266l != null) {
                a.this.f20266l.onCloseBanner(a.this.f20258d);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.c
        public final void a(CampaignEx campaignEx) {
            a.this.d();
            if (a.this.f20266l != null) {
                a.this.f20266l.onLogImpression(a.this.f20258d);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.c
        public final void a(String str) {
            a.this.b(str);
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.c
        public final void a() {
            if (a.this.f20266l != null) {
                a.this.f20266l.onClick(a.this.f20258d);
            }
        }
    };

    /* renamed from: w, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.b.b f20277w = new com.mbridge.msdk.mbbanner.common.b.b() { // from class: com.mbridge.msdk.mbbanner.a.a.2
        @Override // com.mbridge.msdk.mbbanner.common.b.b
        public final void a(String str, CampaignUnit campaignUnit, boolean z8) {
            a.this.f20267m = campaignUnit;
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.b
        public final void b(com.mbridge.msdk.foundation.c.b bVar) {
            boolean z8;
            CampaignEx campaignEx;
            if (a.this.f20266l != null) {
                a.this.f20266l.onLoadFailed(a.this.f20258d, "banner res load failed");
            }
            a.this.d();
            String str = "";
            if (bVar != null) {
                String b8 = bVar.b();
                if (!TextUtils.isEmpty(b8)) {
                    str = b8;
                }
                z8 = bVar.e();
                campaignEx = bVar.c();
            } else {
                z8 = false;
                campaignEx = null;
            }
            com.mbridge.msdk.foundation.same.report.k.a(com.mbridge.msdk.foundation.controller.c.m().c(), str, a.this.f20256b, z8, campaignEx);
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.b
        public final void a(com.mbridge.msdk.foundation.c.b bVar) {
            String str;
            CampaignEx campaignEx;
            boolean z8;
            str = "";
            if (bVar != null) {
                String b8 = bVar.b();
                str = TextUtils.isEmpty(b8) ? "" : b8;
                campaignEx = bVar.c();
                z8 = bVar.e();
            } else {
                campaignEx = null;
                z8 = false;
            }
            if (a.this.f20266l != null) {
                a.this.f20266l.onLoadFailed(a.this.f20258d, str);
            }
            a.this.d();
            try {
                com.mbridge.msdk.foundation.same.report.k.a(com.mbridge.msdk.foundation.controller.c.m().c(), str, a.this.f20256b, z8, campaignEx);
            } catch (Exception unused) {
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.b
        public final void a(String str, boolean z8) {
            if (a.this.f20267m != null) {
                try {
                    com.mbridge.msdk.foundation.same.report.k.a(com.mbridge.msdk.foundation.controller.c.m().c(), a.this.f20267m.getAds(), a.this.f20256b, z8);
                } catch (Exception unused) {
                }
            }
            if (a.this.f20261g != null) {
                a.this.f20274t = true;
                a.this.i();
            }
        }
    };

    public a(MBBannerView mBBannerView, BannerSize bannerSize, String str, String str2) {
        this.f20261g = mBBannerView;
        if (bannerSize != null) {
            this.f20262h = bannerSize.getHeight();
            this.f20263i = bannerSize.getWidth();
        }
        this.f20256b = str2;
        str = TextUtils.isEmpty(str) ? "" : str;
        this.f20257c = str;
        this.f20258d = new MBridgeIds(str, this.f20256b);
        String k8 = com.mbridge.msdk.foundation.controller.c.m().k();
        String b8 = com.mbridge.msdk.foundation.controller.c.m().b();
        if (this.f20270p == null) {
            this.f20270p = new j();
        }
        this.f20270p.a(com.mbridge.msdk.foundation.controller.c.m().c(), k8, b8, this.f20256b);
        h();
    }

    private int b(int i8) {
        if (i8 <= 0) {
            return i8;
        }
        if (i8 < 10) {
            return 10;
        }
        return i8 > 180 ? SubsamplingScaleImageView.ORIENTATION_180 : i8;
    }

    private void h() {
        k d8 = h.a().d(com.mbridge.msdk.foundation.controller.c.m().k(), this.f20256b);
        this.f20269o = d8;
        if (d8 == null) {
            this.f20269o = k.d(this.f20256b);
        }
        if (this.f20265k == -1) {
            this.f20264j = b(this.f20269o.q());
        }
        if (this.f20260f == 0) {
            boolean z8 = this.f20269o.f() == 1;
            this.f20259e = z8;
            c cVar = this.f20268n;
            if (cVar != null) {
                cVar.a(z8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (this.f20273s || !this.f20274t) {
            return;
        }
        MBBannerView mBBannerView = this.f20261g;
        if (this.f20267m != null) {
            if (this.f20268n == null) {
                this.f20268n = new c(mBBannerView, this.f20276v, this.f20257c, this.f20256b, this.f20259e, this.f20269o);
            }
            this.f20268n.b(this.f20271q);
            this.f20268n.c(this.f20272r);
            this.f20268n.a(this.f20259e, this.f20260f);
            this.f20268n.a(this.f20267m);
        } else {
            b("banner show failed because campain is exception");
        }
        this.f20274t = false;
    }

    private void j() {
        MBBannerView mBBannerView = this.f20261g;
        if (mBBannerView != null) {
            if (this.f20271q && this.f20272r && !this.f20275u && !aq.a(mBBannerView, 1)) {
                com.mbridge.msdk.mbbanner.common.c.a.a().a(3, this.f20257c, this.f20256b, new b(this.f20263i + "x" + this.f20262h, this.f20264j * 1000), this.f20277w);
            } else {
                com.mbridge.msdk.mbbanner.common.c.a.a().a(2, this.f20257c, this.f20256b, null, null);
            }
            if (this.f20271q) {
                return;
            }
            com.mbridge.msdk.mbbanner.common.c.a.a().a(4, this.f20257c, this.f20256b, null, null);
            com.mbridge.msdk.mbbanner.common.c.a.a().a(this.f20256b);
        }
    }

    private void k() {
        j();
        c cVar = this.f20268n;
        if (cVar != null) {
            cVar.b(this.f20271q);
            this.f20268n.c(this.f20272r);
        }
    }

    public final void c() {
        this.f20273s = true;
        if (this.f20266l != null) {
            this.f20266l = null;
        }
        if (this.f20277w != null) {
            this.f20277w = null;
        }
        if (this.f20276v != null) {
            this.f20276v = null;
        }
        if (this.f20261g != null) {
            this.f20261g = null;
        }
        com.mbridge.msdk.mbbanner.common.c.a.a().a(4, this.f20257c, this.f20256b, null, null);
        com.mbridge.msdk.mbbanner.common.c.a.a().a(this.f20256b);
        com.mbridge.msdk.mbbanner.common.c.a.a().b();
        c cVar = this.f20268n;
        if (cVar != null) {
            cVar.a();
        }
    }

    public final void d() {
        if (this.f20273s) {
            return;
        }
        j();
        h();
        b bVar = new b(this.f20263i + "x" + this.f20262h, this.f20264j * 1000);
        bVar.b(this.f20257c);
        bVar.a(true);
        com.mbridge.msdk.mbbanner.common.c.a.a().b(this.f20257c, this.f20256b, bVar, this.f20277w);
    }

    public final void e() {
        com.mbridge.msdk.mbbanner.common.c.a.a().a(4, this.f20257c, this.f20256b, new b(this.f20263i + "x" + this.f20262h, this.f20264j * 1000), this.f20277w);
    }

    public final void f() {
        com.mbridge.msdk.mbbanner.common.c.a.a().a(3, this.f20257c, this.f20256b, new b(this.f20263i + "x" + this.f20262h, this.f20264j * 1000), this.f20277w);
    }

    public final String b() {
        CampaignUnit campaignUnit = this.f20267m;
        if (campaignUnit != null) {
            return com.mbridge.msdk.foundation.same.c.a(campaignUnit.getAds());
        }
        return "";
    }

    public final String a() {
        CampaignUnit campaignUnit = this.f20267m;
        if (campaignUnit != null && campaignUnit.getRequestId() != null) {
            return this.f20267m.getRequestId();
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        BannerAdListener bannerAdListener = this.f20266l;
        if (bannerAdListener != null) {
            bannerAdListener.onLoadFailed(this.f20258d, str);
        }
        ad.b(f20255a, "showFailed:" + str);
        d();
    }

    public final void a(BannerSize bannerSize) {
        if (bannerSize != null) {
            this.f20262h = bannerSize.getHeight();
            this.f20263i = bannerSize.getWidth();
        }
    }

    public final void a(int i8) {
        int b8 = b(i8);
        this.f20265k = b8;
        this.f20264j = b8;
    }

    public final void b(boolean z8) {
        this.f20271q = z8;
        k();
        i();
    }

    public final void a(boolean z8) {
        this.f20259e = z8;
        this.f20260f = z8 ? 1 : 2;
    }

    public final void a(String str) {
        boolean z8;
        if (this.f20262h >= 1 && this.f20263i >= 1) {
            try {
                z8 = com.mbridge.msdk.mbsignalcommon.webEnvCheck.a.a(com.mbridge.msdk.foundation.controller.c.m().c());
            } catch (Exception unused) {
                z8 = false;
            }
            if (!z8) {
                BannerAdListener bannerAdListener = this.f20266l;
                if (bannerAdListener != null) {
                    bannerAdListener.onLoadFailed(this.f20258d, "banner load failed because WebView is not available");
                    return;
                }
                return;
            }
            b bVar = new b(this.f20263i + "x" + this.f20262h, this.f20264j * 1000);
            bVar.a(str);
            bVar.b(this.f20257c);
            com.mbridge.msdk.mbbanner.common.c.a.a().a(this.f20257c, this.f20256b, bVar, this.f20277w);
            com.mbridge.msdk.mbbanner.common.c.a.a().a(1, this.f20257c, this.f20256b, bVar, this.f20277w);
            return;
        }
        BannerAdListener bannerAdListener2 = this.f20266l;
        if (bannerAdListener2 != null) {
            bannerAdListener2.onLoadFailed(this.f20258d, "banner load failed because params are exception");
        }
    }

    public final void c(boolean z8) {
        this.f20272r = z8;
        k();
    }

    public final void a(BannerAdListener bannerAdListener) {
        this.f20266l = bannerAdListener;
    }

    public final void a(int i8, int i9, int i10, int i11) {
        c cVar = this.f20268n;
        if (cVar != null) {
            cVar.a(i8, i9, i10, i11);
        }
    }
}
