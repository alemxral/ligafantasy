package com.mbridge.msdk.newreward.function.c.b.a;

import android.text.TextUtils;
import androidx.work.WorkRequest;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.newreward.a.c.a;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import com.mbridge.msdk.newreward.function.common.MBridgeError;
import com.mbridge.msdk.newreward.function.common.MBridgeOffsetManager;
import com.mbridge.msdk.newreward.function.d.c.n;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes4.dex */
public final class d implements a.InterfaceC0413a, com.mbridge.msdk.newreward.function.c.b.a {

    /* renamed from: a, reason: collision with root package name */
    com.mbridge.msdk.newreward.function.c.a.a f20897a;

    /* renamed from: b, reason: collision with root package name */
    com.mbridge.msdk.newreward.a.b.b f20898b;

    /* renamed from: c, reason: collision with root package name */
    com.mbridge.msdk.newreward.function.c.c f20899c;

    /* renamed from: d, reason: collision with root package name */
    com.mbridge.msdk.newreward.a.e f20900d;

    /* renamed from: e, reason: collision with root package name */
    com.mbridge.msdk.newreward.function.c.b.b.c f20901e;

    /* renamed from: i, reason: collision with root package name */
    private Map f20905i;

    /* renamed from: f, reason: collision with root package name */
    private String f20902f = UUID.randomUUID().toString();

    /* renamed from: g, reason: collision with root package name */
    private String f20903g = UUID.randomUUID().toString();

    /* renamed from: h, reason: collision with root package name */
    private long f20904h = WorkRequest.MIN_BACKOFF_MILLIS;

    /* renamed from: j, reason: collision with root package name */
    private volatile boolean f20906j = false;

    /* loaded from: classes4.dex */
    private class b implements com.mbridge.msdk.newreward.a.b.b {
        private b() {
        }

        @Override // com.mbridge.msdk.newreward.a.b.b
        public final void a(Object obj) {
            com.mbridge.msdk.newreward.a.c.a.a().a(d.this.f20902f);
            d dVar = d.this;
            dVar.f20898b.a(dVar.f20899c.a("type", 2, "object", obj));
        }

        @Override // com.mbridge.msdk.newreward.a.b.b
        public final void a(com.mbridge.msdk.foundation.c.b bVar) {
            d dVar = d.this;
            com.mbridge.msdk.newreward.function.c.b.b.e eVar = new com.mbridge.msdk.newreward.function.c.b.b.e(bVar, dVar.f20900d, dVar.f20899c, 2);
            com.mbridge.msdk.newreward.function.c.b.b.c cVar = d.this.f20901e;
            if (cVar == null || !cVar.a(eVar)) {
                com.mbridge.msdk.newreward.a.c.a.a().a(d.this.f20902f);
                com.mbridge.msdk.newreward.function.e.c.a().b().a(d.this.f20900d.p(), d.this.f20900d.w(), d.this.f20900d.A(), d.this.f20900d.z(), MBridgeCommon.CampaignState.STATE_LOAD_FAILED_RESOURCE_DOWNLOAD_ERROR);
                d.this.f20898b.a(bVar);
                return;
            }
            d.this.f20901e.a(eVar, this);
        }
    }

    private int b() {
        com.mbridge.msdk.newreward.function.f.e r8;
        com.mbridge.msdk.videocommon.d.c b8;
        try {
            com.mbridge.msdk.newreward.a.e eVar = this.f20900d;
            return (eVar == null || (r8 = eVar.r()) == null || (b8 = r8.b()) == null) ? MBridgeCommon.DEFAULT_LOAD_TIMEOUT : b8.F() * 1000;
        } catch (Exception unused) {
            return MBridgeCommon.DEFAULT_LOAD_TIMEOUT;
        }
    }

    public final void a(com.mbridge.msdk.newreward.function.c.a.a aVar) {
        this.f20897a = aVar;
        this.f20901e = new com.mbridge.msdk.newreward.function.c.b.b.c(aVar);
    }

    @Override // com.mbridge.msdk.newreward.function.c.b.a
    public final void a(com.mbridge.msdk.newreward.function.c.b bVar, com.mbridge.msdk.newreward.a.b.b bVar2) {
        try {
            this.f20898b = bVar2;
            int b8 = b();
            com.mbridge.msdk.newreward.a.c.a.a().a(this.f20902f, b8, this);
            bVar.a(com.mbridge.msdk.newreward.function.c.e.REQ_CAMPAIGN);
            Map map = (Map) bVar.b();
            this.f20905i = map;
            this.f20899c = (com.mbridge.msdk.newreward.function.c.c) map.get("command_manager");
            com.mbridge.msdk.newreward.a.e eVar = (com.mbridge.msdk.newreward.a.e) this.f20905i.get("adapter_model");
            this.f20900d = eVar;
            eVar.f(b8);
            com.mbridge.msdk.newreward.function.c.c cVar = this.f20899c;
            com.mbridge.msdk.newreward.a.e eVar2 = this.f20900d;
            cVar.a(eVar2, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_V3_START, cVar.a("auto_load", Integer.valueOf(eVar2.B() ? 2 : 1), "hst", com.mbridge.msdk.foundation.same.net.g.d.f().a(this.f20900d.C())));
            this.f20897a.a(bVar, new a(bVar, this.f20905i));
            long a8 = af.a().a(MBridgeCommon.SettingConfig.KEY_SETTING_CONFIG_RETRY_STRATEGY, MBridgeCommon.SettingConfig.KEY_SETTING_CONFIG_RETRY_STRATEGY_CAMPAIGN_RETRY_TIMEOUT, 0);
            this.f20904h = a8;
            if (a8 > 0) {
                com.mbridge.msdk.newreward.a.c.a.a().a(this.f20903g, this.f20904h, this);
            }
            com.mbridge.msdk.newreward.function.e.c.a().b().a(this.f20900d.p(), this.f20900d.w(), this.f20900d.A(), this.f20900d.z(), !TextUtils.isEmpty(this.f20900d.C()), this.f20900d.C(), this.f20900d.L());
        } catch (Exception e8) {
            ad.a("LoadControllerReceiver", "action", e8);
            if (this.f20900d != null) {
                com.mbridge.msdk.newreward.function.e.c.a().b().a(this.f20900d.p(), this.f20900d.w(), this.f20900d.A(), this.f20900d.z(), 8);
            }
            com.mbridge.msdk.newreward.a.c.a.a().a(this.f20903g);
            com.mbridge.msdk.newreward.a.c.a.a().a(this.f20902f);
            if (bVar2 != null) {
                bVar2.a(new com.mbridge.msdk.foundation.c.b(880020, e8.getMessage()));
            }
        }
    }

    /* loaded from: classes4.dex */
    private final class a implements com.mbridge.msdk.newreward.a.b.b {

        /* renamed from: b, reason: collision with root package name */
        private final com.mbridge.msdk.newreward.function.c.b f20908b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f20909c;

        public a(com.mbridge.msdk.newreward.function.c.b bVar, Map map) {
            this.f20908b = bVar;
            this.f20909c = map;
        }

        @Override // com.mbridge.msdk.newreward.a.b.b
        public final void a(Object obj) {
            com.mbridge.msdk.foundation.c.b a8;
            com.mbridge.msdk.newreward.a.c.a.a().a(d.this.f20903g);
            if (d.this.f20906j) {
                return;
            }
            d.this.f20906j = true;
            com.mbridge.msdk.newreward.function.d.a.b bVar = (com.mbridge.msdk.newreward.function.d.a.b) obj;
            d dVar = d.this;
            com.mbridge.msdk.newreward.function.c.c cVar = dVar.f20899c;
            com.mbridge.msdk.newreward.a.e eVar = dVar.f20900d;
            cVar.a(eVar, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_V3_RES_SUCCESS, cVar.a("metrics_data", bVar, "auto_load", Integer.valueOf(eVar.B() ? 2 : 1), "result", 1, "cache", 2, "timeout", Integer.valueOf(d.this.f20900d.I()), "hst", bVar != null ? bVar.H() : ""));
            d dVar2 = d.this;
            dVar2.f20898b.a(dVar2.f20899c.a("type", 1, "object", bVar));
            ((MBridgeOffsetManager) d.this.f20899c.a((Object) null, com.mbridge.msdk.newreward.function.c.e.CREATE_OFFSET)).increaseOffset(bVar.s().size());
            d dVar3 = d.this;
            com.mbridge.msdk.newreward.function.c.c cVar2 = dVar3.f20899c;
            cVar2.d(cVar2.a("adapter_model", dVar3.f20900d, "campaign", bVar));
            try {
                d dVar4 = d.this;
                com.mbridge.msdk.newreward.function.c.c cVar3 = dVar4.f20899c;
                cVar3.c(cVar3.a("adapter_model", dVar4.f20900d, "campaign", bVar));
                this.f20908b.a(com.mbridge.msdk.newreward.function.c.e.REQ_DOWN_CAMPAIGN);
                this.f20909c.put("campaign", bVar);
                this.f20908b.a(this.f20909c);
                d dVar5 = d.this;
                dVar5.f20897a.a(this.f20908b, new b());
            } catch (MBridgeError e8) {
                com.mbridge.msdk.newreward.a.c.a.a().a(d.this.f20902f);
                com.mbridge.msdk.newreward.function.e.c.a().b().a(bVar.a(), bVar.b(), bVar.c(), bVar.e(), 403);
                if (e8.getErrorMessage().contains("APP ALREADY INSTALLED")) {
                    a8 = com.mbridge.msdk.foundation.c.a.a(e8.getErrorCode(), 880021, "errorCode: 3507 errorMessage: data load failed, errorMsg is " + e8.getErrorMessage());
                } else {
                    a8 = com.mbridge.msdk.foundation.c.a.a(e8.getErrorCode(), 880003, "errorCode: 3507 errorMessage: data load failed, errorMsg is " + e8.getErrorMessage());
                }
                d.this.f20898b.a(a8);
            }
        }

        @Override // com.mbridge.msdk.newreward.a.b.b
        public final void a(com.mbridge.msdk.foundation.c.b bVar) {
            d dVar = d.this;
            com.mbridge.msdk.newreward.function.c.b.b.e eVar = new com.mbridge.msdk.newreward.function.c.b.b.e(bVar, dVar.f20900d, dVar.f20899c, 1);
            if (!d.this.f20901e.a(eVar)) {
                com.mbridge.msdk.newreward.a.c.a.a().a(d.this.f20903g);
                com.mbridge.msdk.newreward.a.c.a.a().a(d.this.f20902f);
                if (d.this.f20906j) {
                    return;
                }
                d.this.f20906j = true;
                try {
                    d dVar2 = d.this;
                    com.mbridge.msdk.newreward.function.c.c cVar = dVar2.f20899c;
                    com.mbridge.msdk.newreward.a.e eVar2 = dVar2.f20900d;
                    cVar.a(eVar2, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_V3_RES_FAIL, cVar.a("auto_load", Integer.valueOf(eVar2.B() ? 2 : 1), "result", Integer.valueOf(bVar.m() ? 1 : 2), "code", Integer.valueOf(bVar.i()), "reason", bVar.b(), "timeout", Integer.valueOf(d.this.f20900d.I()), "hst", bVar.j(), "err_desc", bVar.l()));
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
                ((MBridgeOffsetManager) d.this.f20899c.a((Object) null, com.mbridge.msdk.newreward.function.c.e.CREATE_OFFSET)).resetOffset();
                if (bVar != null) {
                    try {
                        if (bVar.a("campaign_request_error_type") != null) {
                            com.mbridge.msdk.newreward.function.e.c.a().b().a(d.this.f20900d.p(), d.this.f20900d.w(), d.this.f20900d.A(), d.this.f20900d.z(), ((Integer) bVar.a("campaign_request_error_type")).intValue());
                        }
                    } catch (Exception unused) {
                    }
                }
                d.this.f20898b.a(bVar);
                return;
            }
            d.this.f20901e.a(eVar, this);
        }
    }

    @Override // com.mbridge.msdk.newreward.a.c.a.InterfaceC0413a
    public final void a(String str, long j8) {
        if (TextUtils.equals(str, this.f20902f)) {
            com.mbridge.msdk.newreward.function.e.c.a().b().a(this.f20900d.p(), this.f20900d.w(), this.f20900d.A(), this.f20900d.z(), MBridgeCommon.CampaignState.STATE_LOAD_FAILED_TIMEOUT);
            String a8 = a();
            this.f20898b.a(new com.mbridge.msdk.foundation.c.b(880010, "errorCode: 3401 errorMessage: " + a8));
            return;
        }
        if (!TextUtils.equals(str, this.f20903g) || this.f20901e == null) {
            return;
        }
        com.mbridge.msdk.newreward.function.c.b.b.e eVar = new com.mbridge.msdk.newreward.function.c.b.b.e(null, this.f20900d, this.f20899c, 3);
        com.mbridge.msdk.newreward.function.c.b bVar = new com.mbridge.msdk.newreward.function.c.b();
        bVar.a(com.mbridge.msdk.newreward.function.c.e.REQ_CAMPAIGN);
        com.mbridge.msdk.newreward.function.c.c cVar = this.f20899c;
        bVar.a(cVar.a("adapter_model", this.f20900d, "command_manager", cVar));
        this.f20901e.a(eVar, new a(bVar, this.f20905i));
    }

    private String a() {
        StringBuilder sb = new StringBuilder();
        try {
            com.mbridge.msdk.newreward.a.e eVar = this.f20900d;
            if (eVar != null && eVar.x() != null) {
                com.mbridge.msdk.newreward.function.d.a.b b8 = this.f20900d.x().b();
                if (b8 != null && b8.s() != null && b8.s().size() > 0) {
                    for (com.mbridge.msdk.newreward.function.d.a.a aVar : b8.s()) {
                        if (aVar != null) {
                            n d8 = aVar.d();
                            if (d8 != null && !d8.c()) {
                                sb.append(" video timeout ");
                            }
                            com.mbridge.msdk.newreward.function.d.c.d<?> c8 = aVar.c();
                            if (c8 != null && !c8.c()) {
                                sb.append(" video_template timeout ");
                            }
                            com.mbridge.msdk.newreward.function.d.c.d<?> f8 = aVar.f();
                            if (f8 != null && !f8.c()) {
                                sb.append(" ec_template timeout ");
                            }
                        }
                    }
                } else {
                    sb.append(" load timeout ");
                }
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
        return sb.toString();
    }
}
