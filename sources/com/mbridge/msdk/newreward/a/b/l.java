package com.mbridge.msdk.newreward.a.b;

import android.text.TextUtils;
import androidx.browser.trusted.sharing.ShareTarget;
import com.mbridge.msdk.e.a.p;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.newreward.function.common.MBridgeTaskManager;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class l implements com.mbridge.msdk.newreward.a.b.a {

    /* renamed from: a, reason: collision with root package name */
    private String f20768a;

    /* loaded from: classes4.dex */
    private static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.foundation.c.b f20769a;

        /* renamed from: b, reason: collision with root package name */
        private final com.mbridge.msdk.newreward.a.b.b f20770b;

        public a(com.mbridge.msdk.foundation.c.b bVar, com.mbridge.msdk.newreward.a.b.b bVar2) {
            this.f20769a = bVar;
            this.f20770b = bVar2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.mbridge.msdk.foundation.c.b bVar;
            com.mbridge.msdk.newreward.a.b.b bVar2 = this.f20770b;
            if (bVar2 != null && (bVar = this.f20769a) != null) {
                bVar2.a(bVar);
            }
        }
    }

    /* loaded from: classes4.dex */
    private static class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final String f20773a;

        /* renamed from: b, reason: collision with root package name */
        private JSONObject f20774b;

        /* renamed from: c, reason: collision with root package name */
        private final com.mbridge.msdk.newreward.a.b.b f20775c;

        public c(String str, JSONObject jSONObject, com.mbridge.msdk.newreward.a.b.b bVar) {
            this.f20773a = str;
            this.f20774b = jSONObject;
            this.f20775c = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.mbridge.msdk.videocommon.d.c cVar;
            if (this.f20775c != null && this.f20774b != null) {
                try {
                    String k8 = com.mbridge.msdk.foundation.controller.c.m().k();
                    if (ai.a(this.f20774b)) {
                        JSONObject optJSONObject = this.f20774b.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
                        this.f20774b = optJSONObject;
                        if (optJSONObject != null) {
                            if (optJSONObject.optInt("vtag_status", 0) == 1) {
                                String e8 = com.mbridge.msdk.videocommon.d.b.a().e(k8, this.f20773a);
                                if (!TextUtils.isEmpty(e8)) {
                                    this.f20774b = com.mbridge.msdk.c.h.a().a(new JSONObject(e8), this.f20774b);
                                }
                            }
                            if (com.mbridge.msdk.videocommon.d.b.e(this.f20774b.toString())) {
                                this.f20774b.put("current_time", System.currentTimeMillis());
                                com.mbridge.msdk.videocommon.d.b.a().a(k8, this.f20773a, this.f20774b.toString());
                            }
                            cVar = com.mbridge.msdk.videocommon.d.c.c(this.f20774b.toString());
                            this.f20775c.a(cVar);
                        }
                    } else {
                        com.mbridge.msdk.videocommon.d.b.a().d(k8, this.f20773a);
                    }
                    cVar = null;
                    this.f20775c.a(cVar);
                } catch (Throwable th) {
                    ad.b("ReqRewardUnitSettingService", th.getMessage());
                }
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.a.b.a
    public final void a(Object obj, com.mbridge.msdk.newreward.a.b.b bVar) throws IOException {
        String str;
        int i8;
        int d8;
        String j8;
        if (obj != null) {
            com.mbridge.msdk.newreward.function.g.c cVar = (com.mbridge.msdk.newreward.function.g.c) obj;
            String k8 = com.mbridge.msdk.foundation.controller.c.m().k();
            this.f20768a = cVar.b();
            cVar.b(com.mbridge.msdk.newreward.function.d.b.g.f21086b);
            if (com.mbridge.msdk.videocommon.d.b.a().d(this.f20768a)) {
                return;
            }
            com.mbridge.msdk.videocommon.d.b.a().a(this.f20768a);
            try {
                com.mbridge.msdk.videocommon.d.c f8 = com.mbridge.msdk.videocommon.d.b.a().f(k8, this.f20768a);
                if (f8 == null) {
                    j8 = "";
                } else {
                    j8 = f8.j();
                }
                cVar.b(j8);
            } catch (Throwable th) {
                ad.b("ReqRewardUnitSettingService", th.getMessage());
            }
            try {
                if (com.mbridge.msdk.foundation.same.net.g.d.f().f19698r) {
                    str = com.mbridge.msdk.foundation.same.net.g.d.f().f19664J;
                } else {
                    str = com.mbridge.msdk.foundation.same.net.g.d.f().f19663I;
                }
                if (com.mbridge.msdk.foundation.same.net.g.d.f().f19698r) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("uri", str);
                    jSONObject.put(DataSchemeDataSource.SCHEME_DATA, cVar.d());
                    com.mbridge.msdk.foundation.same.net.m.a().a(com.mbridge.msdk.foundation.same.net.g.d.f().f19692l, com.mbridge.msdk.foundation.same.net.g.d.f().f19696p, jSONObject.toString(), true, new b(this.f20768a, bVar));
                    return;
                }
                com.mbridge.msdk.newreward.function.d.b.g gVar = new com.mbridge.msdk.newreward.function.d.b.g(str);
                gVar.a(cVar.c());
                gVar.a((com.mbridge.msdk.newreward.function.d.b.e) new b(this.f20768a, bVar));
                byte[] o8 = gVar.o();
                if (o8 != null) {
                    i8 = o8.length;
                } else {
                    i8 = 0;
                }
                HashMap hashMap = new HashMap();
                hashMap.put(com.mbridge.msdk.foundation.same.net.h.e.f19720h, String.valueOf(i8));
                gVar.a((Map<String, String>) hashMap);
                if (o8 != null && (d8 = com.mbridge.msdk.foundation.same.net.g.d.f().d()) > 0 && i8 > d8) {
                    gVar.a(1);
                    gVar.a("Content-Type", ShareTarget.ENCODING_TYPE_URL_ENCODED);
                }
                com.mbridge.msdk.newreward.function.d.b.f.a().a(gVar);
                return;
            } catch (Exception e8) {
                throw new IOException(e8);
            }
        }
        throw new IOException("ReqRewardUnitSettingService doReq: params is null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class b implements com.mbridge.msdk.foundation.same.net.e<JSONObject>, com.mbridge.msdk.newreward.function.d.b.e {

        /* renamed from: a, reason: collision with root package name */
        private final String f20771a;

        /* renamed from: b, reason: collision with root package name */
        private final com.mbridge.msdk.newreward.a.b.b f20772b;

        public b(String str, com.mbridge.msdk.newreward.a.b.b bVar) {
            this.f20771a = str;
            this.f20772b = bVar;
        }

        @Override // com.mbridge.msdk.newreward.function.d.b.e
        public final void a(JSONObject jSONObject, p<JSONObject> pVar) {
            com.mbridge.msdk.videocommon.d.b.a().b(this.f20771a);
            MBridgeTaskManager.commonExecute(new c(this.f20771a, jSONObject, this.f20772b));
        }

        @Override // com.mbridge.msdk.foundation.same.net.e
        public final void onCancel() {
        }

        @Override // com.mbridge.msdk.foundation.same.net.e
        public final void onError(com.mbridge.msdk.foundation.same.net.b.a aVar) {
            com.mbridge.msdk.videocommon.d.b.a().b(this.f20771a);
            MBridgeTaskManager.commonExecute(new a(new com.mbridge.msdk.foundation.c.b(880002, aVar.getMessage()), this.f20772b));
        }

        @Override // com.mbridge.msdk.foundation.same.net.e
        public final void onFinish() {
        }

        @Override // com.mbridge.msdk.foundation.same.net.e
        public final void onNetworking() {
        }

        @Override // com.mbridge.msdk.foundation.same.net.e
        public final void onPreExecute() {
        }

        @Override // com.mbridge.msdk.foundation.same.net.e
        public final void onProgressChange(long j8, long j9) {
        }

        @Override // com.mbridge.msdk.foundation.same.net.e
        public final void onRetry() {
        }

        @Override // com.mbridge.msdk.foundation.same.net.e
        public final void onSuccess(com.mbridge.msdk.foundation.same.net.k<JSONObject> kVar) {
            com.mbridge.msdk.videocommon.d.b.a().b(this.f20771a);
            MBridgeTaskManager.commonExecute(new c(this.f20771a, kVar.f19748c, this.f20772b));
        }

        @Override // com.mbridge.msdk.newreward.function.d.b.e
        public final void a(p<JSONObject> pVar, com.mbridge.msdk.newreward.function.d.b.d dVar) {
            com.mbridge.msdk.videocommon.d.b.a().b(this.f20771a);
            MBridgeTaskManager.commonExecute(new a(new com.mbridge.msdk.foundation.c.b(880002, dVar.a()), this.f20772b));
        }
    }
}
