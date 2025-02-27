package com.mbridge.msdk.newreward.a.b;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.newreward.function.common.MBridgeError;
import com.mbridge.msdk.newreward.function.d.c.q;
import com.mbridge.msdk.newreward.function.d.c.x;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes4.dex */
public final class f implements a {

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.c.c f20740a;

    /* renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.newreward.a.e f20741b;

    /* renamed from: c, reason: collision with root package name */
    private int f20742c = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.mbridge.msdk.newreward.a.b.f$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f20746a;

        static {
            int[] iArr = new int[com.mbridge.msdk.newreward.function.c.e.values().length];
            f20746a = iArr;
            try {
                iArr[com.mbridge.msdk.newreward.function.c.e.REPORT_DOWNLOAD_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20746a[com.mbridge.msdk.newreward.function.c.e.REPORT_DOWNLOAD_END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.a.b.a
    public final void a(Object obj, final b bVar) throws IOException {
        com.mbridge.msdk.newreward.function.d.a.a aVar = (com.mbridge.msdk.newreward.function.d.a.a) obj;
        final com.mbridge.msdk.newreward.function.d.c.d<?> f8 = aVar.f();
        if (aVar.h().F() != null) {
            if (aVar.h().F().containsKey("command_manager")) {
                this.f20740a = (com.mbridge.msdk.newreward.function.c.c) aVar.h().F().get("command_manager");
            }
            if (aVar.h().F().containsKey("adapter_model")) {
                this.f20741b = (com.mbridge.msdk.newreward.a.e) aVar.h().F().get("adapter_model");
            }
        }
        if (f8 == null) {
            bVar.a(aVar);
            return;
        }
        if (f8.e() == 1) {
            this.f20742c = 1;
        } else {
            this.f20742c = 2;
        }
        a(com.mbridge.msdk.newreward.function.c.e.REPORT_DOWNLOAD_START, 0, aVar, null);
        f8.k().a(0, new x() { // from class: com.mbridge.msdk.newreward.a.b.f.1
            @Override // com.mbridge.msdk.newreward.function.d.c.x
            public final void a(com.mbridge.msdk.newreward.function.d.a.b bVar2, com.mbridge.msdk.newreward.function.d.a.a aVar2, q qVar) {
            }

            @Override // com.mbridge.msdk.newreward.function.d.c.x
            public final void b(com.mbridge.msdk.newreward.function.d.a.b bVar2, com.mbridge.msdk.newreward.function.d.a.a aVar2, q qVar) {
                f.this.a(com.mbridge.msdk.newreward.function.c.e.REPORT_DOWNLOAD_END, 1, aVar2, null);
                if (f8.c()) {
                    bVar.a(aVar2);
                }
            }

            @Override // com.mbridge.msdk.newreward.function.d.c.x
            public final void a(com.mbridge.msdk.newreward.function.d.a.b bVar2, com.mbridge.msdk.newreward.function.d.a.a aVar2, q qVar, MBridgeError mBridgeError) {
                f.this.a(com.mbridge.msdk.newreward.function.c.e.REPORT_DOWNLOAD_END, 3, aVar2, mBridgeError);
                a(bVar2, bVar, aVar2, mBridgeError, "errorCode: 3202 errorMessage: ");
            }

            private void a(com.mbridge.msdk.newreward.function.d.a.b bVar2, b bVar3, com.mbridge.msdk.newreward.function.d.a.a aVar2, MBridgeError mBridgeError, String str) {
                if (bVar2.x()) {
                    try {
                        bVar3.a(aVar2);
                        return;
                    } catch (Exception e8) {
                        if (MBridgeConstans.DEBUG) {
                            ad.a("ReqEcService", "doReq: ", e8);
                            return;
                        }
                        return;
                    }
                }
                try {
                    if (f8.c()) {
                        return;
                    }
                    bVar3.a(com.mbridge.msdk.foundation.c.a.a(mBridgeError.getErrorCode(), 880007, str + mBridgeError.getErrorMessage()));
                } catch (Exception e9) {
                    if (MBridgeConstans.DEBUG) {
                        ad.a("ReqEcService", "doReq: ", e9);
                    }
                }
            }

            @Override // com.mbridge.msdk.newreward.function.d.c.x
            public final void b(com.mbridge.msdk.newreward.function.d.a.b bVar2, com.mbridge.msdk.newreward.function.d.a.a aVar2, q qVar, MBridgeError mBridgeError) {
                f.this.a(com.mbridge.msdk.newreward.function.c.e.REPORT_DOWNLOAD_END, 2, aVar2, mBridgeError);
                a(bVar2, bVar, aVar2, mBridgeError, "errorCode: 3401 errorMessage: ");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.newreward.function.c.e eVar, int i8, com.mbridge.msdk.newreward.function.d.a.a aVar, MBridgeError mBridgeError) {
        if (this.f20740a == null || this.f20741b == null) {
            return;
        }
        try {
            Map a8 = this.f20740a.a("resource_type", 3, "scenes", 1, "url", aVar.f().j(), CampaignEx.JSON_KEY_READY_RATE, 100, "mraid_type", Integer.valueOf(aVar.i() ? 1 : 0));
            int i9 = AnonymousClass2.f20746a[eVar.ordinal()];
            if (i9 != 1) {
                if (i9 == 2 && this.f20742c == 2) {
                    a8.put("result", Integer.valueOf(i8));
                    if (i8 != 1 && mBridgeError != null) {
                        a8.put("reason", mBridgeError.getErrorMessage());
                    }
                    this.f20740a.a(this.f20741b, eVar, a8);
                    return;
                }
                return;
            }
            a8.put("cache", Integer.valueOf(this.f20742c));
            this.f20740a.a(this.f20741b, eVar, a8);
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
    }
}
