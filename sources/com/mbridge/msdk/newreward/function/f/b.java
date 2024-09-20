package com.mbridge.msdk.newreward.function.f;

import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final int f21200a;

    /* renamed from: b, reason: collision with root package name */
    private final String f21201b;

    /* renamed from: c, reason: collision with root package name */
    private final String f21202c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f21203d;

    /* renamed from: g, reason: collision with root package name */
    private Handler f21206g;

    /* renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.c.c f21208i;

    /* renamed from: l, reason: collision with root package name */
    private com.mbridge.msdk.newreward.a.d f21211l;

    /* renamed from: j, reason: collision with root package name */
    private volatile boolean f21209j = false;

    /* renamed from: k, reason: collision with root package name */
    private volatile boolean f21210k = false;

    /* renamed from: e, reason: collision with root package name */
    private int f21204e = af.a().a(MBridgeCommon.SettingConfig.KEY_SETTING_CONFIG_LOAD_CHECK_INTERVAL, 120000);

    /* renamed from: h, reason: collision with root package name */
    private long f21207h = af.a().a(MBridgeCommon.SettingConfig.KEY_SETTING_CONFIG_LOAD_TOKEN_VALIDITY_PERIOD, 1800000);

    /* renamed from: f, reason: collision with root package name */
    private boolean f21205f = af.a().a(MBridgeCommon.SettingConfig.KEY_SETTING_CONFIG_LOAD_CHECK_OPTIMIZED, false);

    public b(int i8, String str, String str2, boolean z8) {
        this.f21200a = i8;
        this.f21201b = str;
        this.f21202c = str2;
        this.f21203d = z8;
    }

    public final void a(com.mbridge.msdk.newreward.function.c.c cVar, com.mbridge.msdk.newreward.a.d dVar) {
        if (cVar != null && dVar != null) {
            if (!this.f21205f) {
                a();
                return;
            }
            this.f21211l = dVar;
            this.f21208i = cVar;
            HandlerThread handlerThread = new HandlerThread("load_check_controller");
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper());
            this.f21206g = handler;
            handler.postDelayed(new Runnable() { // from class: com.mbridge.msdk.newreward.function.f.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        b.a(b.this);
                    } catch (Exception e8) {
                        ad.a("LoadCheckController", "startCheckTask error: " + e8.getMessage());
                    }
                    b.this.f21206g.postDelayed(this, b.this.f21204e);
                }
            }, this.f21204e);
            return;
        }
        a();
    }

    private void a() {
        com.mbridge.msdk.newreward.function.e.c.a().b().b(this.f21200a, this.f21201b, this.f21202c);
    }

    private void a(com.mbridge.msdk.newreward.a.e eVar, com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.a.b.b bVar2) {
        eVar.y().a(bVar, bVar2);
    }

    private com.mbridge.msdk.newreward.a.e a(com.mbridge.msdk.newreward.function.d.a.b bVar) {
        com.mbridge.msdk.newreward.a.e eVar = new com.mbridge.msdk.newreward.a.e(false, this.f21200a, bVar.f(), this.f21202c, bVar.g());
        eVar.e(bVar.e());
        eVar.e(30000);
        eVar.f(MBridgeCommon.DEFAULT_LOAD_TIMEOUT);
        eVar.d(this.f21201b);
        eVar.e(true);
        eVar.f(false);
        eVar.g(false);
        return eVar;
    }

    static /* synthetic */ void a(b bVar) {
        if (bVar.f21211l.a() != null) {
            Iterator<com.mbridge.msdk.newreward.a.e> it = bVar.f21211l.a().iterator();
            while (it.hasNext()) {
                if (it.next().s() == 1) {
                    return;
                }
            }
        }
        if (bVar.f21209j) {
            return;
        }
        bVar.f21209j = true;
        com.mbridge.msdk.newreward.function.e.c.a().b().a(bVar.f21200a, bVar.f21201b, bVar.f21202c, bVar.f21203d, new com.mbridge.msdk.newreward.function.e.b() { // from class: com.mbridge.msdk.newreward.function.f.b.2
            @Override // com.mbridge.msdk.newreward.function.e.b
            public final void a(List<com.mbridge.msdk.newreward.function.d.a.b> list) {
                b.a(b.this, list);
            }

            @Override // com.mbridge.msdk.newreward.function.e.b
            public final void a() {
                b.a(b.this, (com.mbridge.msdk.newreward.a.e) null, (com.mbridge.msdk.newreward.function.d.a.b) null);
            }
        });
    }

    static /* synthetic */ void a(b bVar, List list) {
        Iterator it = list.iterator();
        final com.mbridge.msdk.newreward.function.d.a.b bVar2 = null;
        final com.mbridge.msdk.newreward.function.d.a.b bVar3 = null;
        while (it.hasNext()) {
            com.mbridge.msdk.newreward.function.d.a.b bVar4 = (com.mbridge.msdk.newreward.function.d.a.b) it.next();
            if (bVar4.g()) {
                long G8 = bVar4.G();
                if (G8 == 0) {
                    com.mbridge.msdk.newreward.function.e.c.a().b().b(bVar4.a(), bVar4.b(), bVar4.c(), bVar4.e(), 8);
                } else if (TextUtils.isEmpty(bVar4.f())) {
                    com.mbridge.msdk.newreward.function.e.c.a().b().b(bVar4.a(), bVar4.b(), bVar4.c(), bVar4.e(), 8);
                } else if (System.currentTimeMillis() - G8 > bVar.f21207h && bVar4.s() == null) {
                    com.mbridge.msdk.newreward.function.e.c.a().b().b(bVar4.a(), bVar4.b(), bVar4.c(), bVar4.e(), 8);
                } else if (bVar4.q() > 0.0d || bVar4.E() == 1) {
                    if (bVar3 != null && bVar4.q() <= bVar3.q()) {
                    }
                    bVar3 = bVar4;
                } else {
                    com.mbridge.msdk.newreward.function.e.c.a().b().b(bVar4.a(), bVar4.b(), bVar4.c(), bVar4.e(), 8);
                }
            } else if (bVar4.G() == 0) {
                com.mbridge.msdk.newreward.function.e.c.a().b().b(bVar4.a(), bVar4.b(), bVar4.c(), bVar4.e(), 8);
            } else if (bVar4.C() == null || bVar4.C().size() == 0) {
                com.mbridge.msdk.newreward.function.e.c.a().b().b(bVar4.a(), bVar4.b(), bVar4.c(), bVar4.e(), 8);
            } else {
                if (bVar3 != null && bVar4.G() <= bVar3.G()) {
                }
                bVar3 = bVar4;
            }
        }
        if (list.size() != 0 && !bVar.f21210k) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                com.mbridge.msdk.newreward.function.d.a.b bVar5 = (com.mbridge.msdk.newreward.function.d.a.b) it2.next();
                if (bVar5 != bVar3 && bVar5.s() != null && (bVar2 == null || bVar5.G() > bVar2.G())) {
                    bVar2 = bVar5;
                }
            }
        }
        if (!bVar.f21210k && bVar2 != null) {
            bVar.f21210k = true;
            final com.mbridge.msdk.newreward.a.e a8 = bVar.a(bVar2);
            try {
                com.mbridge.msdk.newreward.function.c.c cVar = bVar.f21208i;
                cVar.a(a8, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_CHECK, cVar.a("check_type", "download_start_resource", "campaign", bVar2));
            } catch (Exception e8) {
                ad.b("LoadCheckController", "handlerAnthonyNeedDownloadCampaign error: " + e8.getMessage());
            }
            bVar.a(a8, bVar2, new com.mbridge.msdk.newreward.a.b.b() { // from class: com.mbridge.msdk.newreward.function.f.b.4
                @Override // com.mbridge.msdk.newreward.a.b.b
                public final void a(Object obj) {
                    b.this.f21210k = false;
                    try {
                        b.this.f21208i.a(a8, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_CHECK, b.this.f21208i.a("check_type", "download_success", "campaign", bVar2));
                    } catch (Exception e9) {
                        ad.b("LoadCheckController", "handlerAnthonyNeedDownloadCampaign error: " + e9.getMessage());
                    }
                }

                @Override // com.mbridge.msdk.newreward.a.b.b
                public final void a(com.mbridge.msdk.foundation.c.b bVar6) {
                    b.this.f21210k = false;
                    try {
                        b.this.f21208i.a(a8, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_CHECK, b.this.f21208i.a("check_type", "download_failed", "campaign", bVar2));
                    } catch (Exception e9) {
                        ad.b("LoadCheckController", "handlerAnthonyNeedDownloadCampaign error: " + e9.getMessage());
                    }
                }
            });
        }
        if (bVar3 != null) {
            List<CampaignEx> C8 = bVar3.C();
            final com.mbridge.msdk.newreward.a.e a9 = bVar.a(bVar3);
            if (C8 == null) {
                try {
                    com.mbridge.msdk.newreward.function.c.c cVar2 = bVar.f21208i;
                    cVar2.a(a9, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_CHECK, cVar2.a("check_type", "check_start_campaign"));
                } catch (Exception e9) {
                    ad.b("LoadCheckController", "handlerLoadFailedCampaigns error: " + e9.getMessage());
                }
                com.mbridge.msdk.newreward.function.c.c cVar3 = bVar.f21208i;
                cVar3.a(cVar3.a("command_manager", cVar3, "adapter_model", a9), new com.mbridge.msdk.newreward.a.b.b() { // from class: com.mbridge.msdk.newreward.function.f.b.5
                    @Override // com.mbridge.msdk.newreward.a.b.b
                    public final void a(Object obj) {
                        b.a(b.this, bVar3, a9);
                    }

                    @Override // com.mbridge.msdk.newreward.a.b.b
                    public final void a(com.mbridge.msdk.foundation.c.b bVar6) {
                        b.a(b.this, a9, bVar3);
                    }
                });
                return;
            }
            try {
                com.mbridge.msdk.newreward.function.c.c cVar4 = bVar.f21208i;
                cVar4.a(a9, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_CHECK, cVar4.a("check_type", "check_start_resource"));
            } catch (Exception e10) {
                ad.b("LoadCheckController", "handlerLoadFailedCampaigns error: " + e10.getMessage());
            }
            bVar.a(a9, bVar3, new com.mbridge.msdk.newreward.a.b.b() { // from class: com.mbridge.msdk.newreward.function.f.b.3
                @Override // com.mbridge.msdk.newreward.a.b.b
                public final void a(Object obj) {
                    b.a(b.this, bVar3, a9);
                }

                @Override // com.mbridge.msdk.newreward.a.b.b
                public final void a(com.mbridge.msdk.foundation.c.b bVar6) {
                    b.a(b.this, a9, bVar3);
                }
            });
            return;
        }
        bVar.f21209j = false;
    }

    static /* synthetic */ void a(b bVar, com.mbridge.msdk.newreward.a.e eVar, com.mbridge.msdk.newreward.function.d.a.b bVar2) {
        Map a8;
        bVar.f21209j = false;
        if (eVar == null) {
            return;
        }
        try {
            if (bVar2 == null) {
                a8 = bVar.f21208i.a("check_type", "check_failed");
            } else {
                a8 = bVar.f21208i.a("check_type", "check_failed", "campaign", bVar2);
            }
            bVar.f21208i.a(eVar, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_CHECK, a8);
        } catch (Exception e8) {
            ad.b("LoadCheckController", "reportLoadCheckFailed error: " + e8.getMessage());
        }
    }

    static /* synthetic */ void a(b bVar, com.mbridge.msdk.newreward.function.d.a.b bVar2, com.mbridge.msdk.newreward.a.e eVar) {
        bVar.f21209j = false;
        if (eVar == null) {
            return;
        }
        com.mbridge.msdk.newreward.function.c.c cVar = bVar.f21208i;
        cVar.a(eVar, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_CHECK, cVar.a("check_type", "check_success", "campaign", bVar2));
        eVar.d(true);
        if (!bVar2.g() || bVar2.q() <= 0.0d) {
            bVar.f21211l.a(eVar);
        }
    }
}
