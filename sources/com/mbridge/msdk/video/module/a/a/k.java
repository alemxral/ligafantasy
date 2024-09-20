package com.mbridge.msdk.video.module.a.a;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.an;
import com.mbridge.msdk.foundation.tools.z;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class k extends f {

    /* renamed from: a, reason: collision with root package name */
    protected boolean f22528a;

    /* renamed from: b, reason: collision with root package name */
    protected CampaignEx f22529b;

    /* renamed from: c, reason: collision with root package name */
    protected List<CampaignEx> f22530c;

    /* renamed from: d, reason: collision with root package name */
    protected boolean f22531d;

    /* renamed from: e, reason: collision with root package name */
    protected com.mbridge.msdk.videocommon.download.a f22532e;

    /* renamed from: f, reason: collision with root package name */
    protected com.mbridge.msdk.videocommon.b.c f22533f;

    /* renamed from: g, reason: collision with root package name */
    protected String f22534g;

    /* renamed from: h, reason: collision with root package name */
    protected String f22535h;

    /* renamed from: i, reason: collision with root package name */
    protected com.mbridge.msdk.video.module.a.a f22536i;

    /* renamed from: j, reason: collision with root package name */
    protected int f22537j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f22538k = false;

    /* renamed from: l, reason: collision with root package name */
    private boolean f22539l = false;

    /* renamed from: m, reason: collision with root package name */
    private boolean f22540m = false;

    public k(CampaignEx campaignEx, com.mbridge.msdk.videocommon.download.a aVar, com.mbridge.msdk.videocommon.b.c cVar, String str, String str2, com.mbridge.msdk.video.module.a.a aVar2, int i8, boolean z8) {
        this.f22531d = false;
        this.f22536i = new f();
        this.f22537j = 1;
        if (!z8 && campaignEx != null && an.b(str2) && aVar != null && aVar2 != null) {
            this.f22529b = campaignEx;
            this.f22535h = str;
            this.f22534g = str2;
            this.f22532e = aVar;
            this.f22533f = cVar;
            this.f22536i = aVar2;
            this.f22528a = true;
            this.f22537j = i8;
            this.f22531d = false;
            return;
        }
        if (z8 && campaignEx != null && an.b(str2) && aVar2 != null) {
            this.f22529b = campaignEx;
            this.f22535h = str;
            this.f22534g = str2;
            this.f22532e = aVar;
            this.f22533f = cVar;
            this.f22536i = aVar2;
            this.f22528a = true;
            this.f22537j = i8;
            this.f22531d = true;
        }
    }

    public final void a(CampaignEx campaignEx) {
        this.f22529b = campaignEx;
    }

    public final void b(int i8) {
        CampaignEx campaignEx = this.f22529b;
        if (campaignEx != null) {
            String noticeUrl = campaignEx.getNoticeUrl();
            if (TextUtils.isEmpty(noticeUrl)) {
                return;
            }
            if (i8 == 1 || i8 == 2) {
                if (!noticeUrl.contains("endscreen_type")) {
                    StringBuilder sb = new StringBuilder(noticeUrl);
                    if (noticeUrl.contains("?")) {
                        sb.append("&endscreen_type=");
                        sb.append(i8);
                    } else {
                        sb.append("?endscreen_type=");
                        sb.append(i8);
                    }
                    noticeUrl = sb.toString();
                } else if (i8 == 2) {
                    if (noticeUrl.contains("endscreen_type=1")) {
                        noticeUrl = noticeUrl.replace("endscreen_type=1", "endscreen_type=2");
                    }
                } else if (noticeUrl.contains("endscreen_type=2")) {
                    noticeUrl = noticeUrl.replace("endscreen_type=2", "endscreen_type=1");
                }
                this.f22529b.setNoticeUrl(noticeUrl);
            }
        }
    }

    public final void c() {
        try {
            Runnable runnable = new Runnable() { // from class: com.mbridge.msdk.video.module.a.a.k.2
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        k kVar = k.this;
                        if (kVar.f22528a && kVar.f22529b != null && an.b(kVar.f22534g)) {
                            com.mbridge.msdk.videocommon.a.a a8 = com.mbridge.msdk.videocommon.a.a.a();
                            k kVar2 = k.this;
                            a8.a(kVar2.f22529b, kVar2.f22534g);
                        }
                    } catch (Exception e8) {
                        if (MBridgeConstans.DEBUG) {
                            e8.printStackTrace();
                        }
                    }
                    try {
                        com.mbridge.msdk.videocommon.a.a a9 = com.mbridge.msdk.videocommon.a.a.a();
                        k kVar3 = k.this;
                        a9.c(kVar3.f22535h, kVar3.f22529b.getAdType());
                    } catch (Exception e9) {
                        if (MBridgeConstans.DEBUG) {
                            e9.printStackTrace();
                        }
                    } catch (Throwable th) {
                        ad.a("NotifyListener", th.getMessage());
                    }
                }
            };
            com.mbridge.msdk.foundation.controller.d.a();
            com.mbridge.msdk.foundation.same.f.b.b().execute(runnable);
        } catch (Throwable th) {
            ad.a("NotifyListener", th.getMessage(), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void d() {
        com.mbridge.msdk.videocommon.download.a aVar = this.f22532e;
        if (aVar != null) {
            aVar.f(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e() {
        CampaignEx campaignEx;
        Map<String, Long> map;
        String str;
        try {
            CampaignEx campaignEx2 = this.f22529b;
            if (campaignEx2 != null && campaignEx2.isDynamicView() && this.f22531d && !this.f22529b.isCampaignIsFiltered()) {
                this.f22539l = true;
                return;
            }
            if (this.f22528a && (campaignEx = this.f22529b) != null && !TextUtils.isEmpty(campaignEx.getOnlyImpressionURL()) && (map = com.mbridge.msdk.foundation.same.a.d.f19442k) != null && !map.containsKey(this.f22529b.getOnlyImpressionURL()) && !this.f22539l) {
                com.mbridge.msdk.foundation.same.a.d.f19442k.put(this.f22529b.getOnlyImpressionURL(), Long.valueOf(System.currentTimeMillis()));
                String onlyImpressionURL = this.f22529b.getOnlyImpressionURL();
                if (this.f22529b.getSpareOfferFlag() == 1) {
                    str = onlyImpressionURL + "&to=1&cbt=" + this.f22529b.getCbt() + "&tmorl=" + this.f22537j;
                } else {
                    str = onlyImpressionURL + "&to=0&cbt=" + this.f22529b.getCbt() + "&tmorl=" + this.f22537j;
                }
                String str2 = str;
                if (!this.f22531d || this.f22529b.isCampaignIsFiltered()) {
                    com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), this.f22529b, this.f22534g, str2, false, true, com.mbridge.msdk.click.a.a.f18060h);
                    c();
                }
                this.f22539l = true;
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void f() {
        String str;
        try {
            if (this.f22528a && !this.f22538k && !TextUtils.isEmpty(this.f22529b.getImpressionURL())) {
                this.f22538k = true;
                if (this.f22529b.isBidCampaign() && this.f22529b != null) {
                    try {
                        HashMap hashMap = new HashMap();
                        List<com.mbridge.msdk.foundation.entity.d> a8 = com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.m().c()).a(this.f22529b.getCampaignUnitId(), this.f22529b.getRequestId());
                        if (a8 != null && a8.size() > 0 && a8.get(0) != null) {
                            if (a8.get(0).c() == 1) {
                                hashMap.put("encrypt_p=", "encrypt_p=" + a8.get(0).b());
                                hashMap.put("irlfa=", "irlfa=1");
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    String str2 = (String) entry.getKey();
                                    String str3 = (String) entry.getValue();
                                    CampaignEx campaignEx = this.f22529b;
                                    campaignEx.setImpressionURL(campaignEx.getImpressionURL().replaceAll(str2, str3));
                                    CampaignEx campaignEx2 = this.f22529b;
                                    campaignEx2.setOnlyImpressionURL(campaignEx2.getOnlyImpressionURL().replaceAll(str2, str3));
                                }
                            }
                            ad.a("BidReplaceCampignDao", "removeReplace count " + com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.m().c()).a(this.f22529b.getRequestId()));
                        }
                    } catch (Exception e8) {
                        e8.printStackTrace();
                    }
                }
                String impressionURL = this.f22529b.getImpressionURL();
                if (this.f22529b.getSpareOfferFlag() == 1) {
                    str = impressionURL + "&to=1&cbt=" + this.f22529b.getCbt() + "&tmorl=" + this.f22537j;
                } else {
                    str = impressionURL + "&to=0&cbt=" + this.f22529b.getCbt() + "&tmorl=" + this.f22537j;
                }
                com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), this.f22529b, this.f22534g, str, false, true, com.mbridge.msdk.click.a.a.f18059g);
                com.mbridge.msdk.video.module.b.b.a(com.mbridge.msdk.foundation.controller.c.m().c(), this.f22529b);
                new Thread(new Runnable() { // from class: com.mbridge.msdk.video.module.a.a.k.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            com.mbridge.msdk.foundation.db.k.a(com.mbridge.msdk.foundation.db.h.a(com.mbridge.msdk.foundation.controller.c.m().c())).a(k.this.f22529b.getId());
                        } catch (Throwable th) {
                            ad.a("NotifyListener", th.getMessage(), th);
                        }
                    }
                }).start();
                if (this.f22528a && com.mbridge.msdk.foundation.same.a.d.f19441j != null && !TextUtils.isEmpty(this.f22529b.getId())) {
                    com.mbridge.msdk.foundation.same.a.d.a(this.f22534g, this.f22529b, "reward");
                }
            }
        } catch (Throwable th) {
            ad.a("NotifyListener", th.getMessage(), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void g() {
        CampaignEx campaignEx;
        List<String> pv_urls;
        try {
            if (this.f22528a && !this.f22540m && (campaignEx = this.f22529b) != null) {
                this.f22540m = true;
                if ((!campaignEx.isDynamicView() || !this.f22531d || this.f22529b.isCampaignIsFiltered()) && (pv_urls = this.f22529b.getPv_urls()) != null && pv_urls.size() > 0) {
                    Iterator<String> it = pv_urls.iterator();
                    while (it.hasNext()) {
                        com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), this.f22529b, this.f22534g, it.next(), false, true);
                    }
                }
            }
        } catch (Throwable th) {
            ad.b("NotifyListener", th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void h() {
        CampaignEx campaignEx = this.f22529b;
        if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getCampaignUnitId()) && this.f22529b.getNativeVideoTracking() != null && this.f22529b.getNativeVideoTracking().o() != null) {
            Context c8 = com.mbridge.msdk.foundation.controller.c.m().c();
            CampaignEx campaignEx2 = this.f22529b;
            com.mbridge.msdk.click.a.a(c8, campaignEx2, campaignEx2.getCampaignUnitId(), this.f22529b.getNativeVideoTracking().o(), false, false);
        }
    }

    public final void a(List<CampaignEx> list) {
        this.f22530c = list;
    }

    @Override // com.mbridge.msdk.video.module.a.a.f, com.mbridge.msdk.video.module.a.a
    public void a(int i8, Object obj) {
        super.a(i8, obj);
        this.f22536i.a(i8, obj);
    }

    public final void a(int i8) {
        if (this.f22529b != null) {
            if (i8 == 1 || i8 == 2) {
                com.mbridge.msdk.video.module.b.b.a(com.mbridge.msdk.foundation.controller.c.m().c(), this.f22529b, i8, this.f22537j);
            }
        }
    }

    public final void a() {
        if (!this.f22528a || this.f22529b == null) {
            return;
        }
        com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n("2000061", this.f22529b.getId(), this.f22529b.getRequestId(), this.f22529b.getRequestIdNotice(), this.f22534g, z.l(com.mbridge.msdk.foundation.controller.c.m().c()));
        nVar.d(this.f22529b.isMraid() ? com.mbridge.msdk.foundation.entity.n.f19335a : com.mbridge.msdk.foundation.entity.n.f19336b);
        com.mbridge.msdk.foundation.same.report.h.b(nVar, com.mbridge.msdk.foundation.controller.c.m().c(), this.f22534g);
    }

    public final void a(int i8, String str) {
        if (this.f22529b != null) {
            com.mbridge.msdk.foundation.same.report.h.c(new com.mbridge.msdk.foundation.entity.n("2000062", this.f22529b.getId(), this.f22529b.getRequestId(), this.f22529b.getRequestIdNotice(), this.f22534g, z.l(com.mbridge.msdk.foundation.controller.c.m().c()), i8, str), com.mbridge.msdk.foundation.controller.c.m().c(), this.f22534g);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(String str) {
        try {
            if (this.f22529b != null) {
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a("url", this.f22529b.getVideoUrlEncode());
                dVar.a("reason", str);
                String noticeUrl = this.f22529b.getNoticeUrl();
                String clickURL = this.f22529b.getClickURL();
                if (TextUtils.isEmpty(noticeUrl)) {
                    if (!TextUtils.isEmpty(clickURL)) {
                        dVar.a("offer_url", clickURL);
                    }
                } else {
                    dVar.a("offer_url", noticeUrl);
                }
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000021", this.f22529b, dVar);
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void b() {
        Runnable runnable = new Runnable() { // from class: com.mbridge.msdk.video.module.a.a.k.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    k kVar = k.this;
                    if (kVar.f22528a && kVar.f22529b != null && an.b(kVar.f22534g) && com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                        com.mbridge.msdk.foundation.db.j a8 = com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.h.a(com.mbridge.msdk.foundation.controller.c.m().c()));
                        com.mbridge.msdk.foundation.entity.f fVar = new com.mbridge.msdk.foundation.entity.f();
                        fVar.a(System.currentTimeMillis());
                        fVar.b(k.this.f22534g);
                        fVar.a(k.this.f22529b.getId());
                        a8.a(fVar);
                    }
                } catch (Throwable th) {
                    ad.a("NotifyListener", th.getMessage(), th);
                }
            }
        };
        com.mbridge.msdk.foundation.controller.d.a();
        com.mbridge.msdk.foundation.same.f.b.b().execute(runnable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b(String str) {
        List<CampaignEx> list;
        if (this.f22529b == null || (list = this.f22530c) == null || list.size() == 0 || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("camp_position")) {
                this.f22529b = this.f22530c.get(jSONObject.getInt("camp_position"));
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.b("NotifyListener", e8.getMessage());
            }
        }
    }
}
