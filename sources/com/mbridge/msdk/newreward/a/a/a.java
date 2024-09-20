package com.mbridge.msdk.newreward.a.a;

import com.mbridge.msdk.newout.RewardVideoListener;
import com.mbridge.msdk.newreward.a.e;
import com.mbridge.msdk.newreward.function.c.c;
import com.mbridge.msdk.out.MBridgeIds;

/* loaded from: classes4.dex */
public abstract class a implements com.mbridge.msdk.newreward.a.b.b {

    /* renamed from: d, reason: collision with root package name */
    private static String f20708d = "LoadController";

    /* renamed from: a, reason: collision with root package name */
    protected c f20709a;

    /* renamed from: b, reason: collision with root package name */
    protected MBridgeIds f20710b;

    /* renamed from: c, reason: collision with root package name */
    protected e f20711c;

    /* renamed from: e, reason: collision with root package name */
    private RewardVideoListener f20712e;

    public a(c cVar) {
        this.f20709a = cVar;
    }

    public final void a(int i8, Object obj) {
        if (i8 == 1) {
            if (this.f20711c.h()) {
                return;
            }
            c cVar = this.f20709a;
            e eVar = this.f20711c;
            cVar.a(eVar, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_V3_CAMPAIGN_SUCCESS, cVar.a("metrics_data", obj, "auto_load", Integer.valueOf(eVar.B() ? 2 : 1), "cache", 2));
            if (this.f20712e != null) {
                this.f20711c.c(true);
                this.f20712e.onLoadSuccess(this.f20710b);
                return;
            }
            return;
        }
        if (i8 != 2) {
            return;
        }
        this.f20711c.b(2);
        if (this.f20711c.i()) {
            return;
        }
        c cVar2 = this.f20709a;
        cVar2.a(this.f20711c, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_VIDEO_CAMPAIGN_SUCCESS, cVar2.a("cache", 2));
        if (this.f20712e != null) {
            this.f20711c.d(true);
            this.f20712e.onVideoLoadSuccess(this.f20710b);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b(final com.mbridge.msdk.foundation.c.b bVar) {
        c cVar = this.f20709a;
        cVar.b(cVar.a("adapter_model", this.f20711c, "command_manager", cVar, "scene", 2, "reason", bVar), new com.mbridge.msdk.newreward.a.b.b() { // from class: com.mbridge.msdk.newreward.a.a.a.2
            @Override // com.mbridge.msdk.newreward.a.b.b
            public final void a(Object obj) {
                a.this.a(1, obj);
                a.this.a(2, obj);
            }

            @Override // com.mbridge.msdk.newreward.a.b.b
            public final void a(com.mbridge.msdk.foundation.c.b bVar2) {
                a aVar = a.this;
                aVar.a(aVar.f20710b, bVar);
            }
        });
    }

    public final void a(MBridgeIds mBridgeIds, com.mbridge.msdk.foundation.c.b bVar) {
        this.f20711c.b(2);
        if (this.f20711c.i()) {
            return;
        }
        c cVar = this.f20709a;
        cVar.a(this.f20711c, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_FAILED, cVar.a("metrics_data", bVar));
        if (this.f20712e != null) {
            this.f20711c.d(true);
            RewardVideoListener rewardVideoListener = this.f20712e;
            if (rewardVideoListener != null) {
                rewardVideoListener.onVideoLoadFail(mBridgeIds, bVar.b());
            }
        }
    }

    public final void a(e eVar) {
        eVar.b(1);
        this.f20711c = eVar;
        this.f20712e = eVar.D();
        MBridgeIds mBridgeIds = (MBridgeIds) this.f20709a.a((Object) null, com.mbridge.msdk.newreward.function.c.e.CREATE_BIDS);
        this.f20710b = mBridgeIds;
        mBridgeIds.setLocalRequestId(this.f20711c.z());
        this.f20710b.setBidToken(this.f20711c.C());
        c cVar = this.f20709a;
        cVar.c(cVar.a("command_type", com.mbridge.msdk.newreward.function.c.e.PRE_HANDLE_LOAD, "command_manager", cVar, "adapter_model", this.f20711c), new com.mbridge.msdk.newreward.a.b.b() { // from class: com.mbridge.msdk.newreward.a.a.a.1
            @Override // com.mbridge.msdk.newreward.a.b.b
            public final void a(Object obj) {
                a aVar = a.this;
                c cVar2 = aVar.f20709a;
                cVar2.a(cVar2.a("command_manager", cVar2, "adapter_model", aVar.f20711c), a.this);
            }

            @Override // com.mbridge.msdk.newreward.a.b.b
            public final void a(com.mbridge.msdk.foundation.c.b bVar) {
                a aVar = a.this;
                aVar.a(aVar.f20710b, bVar);
            }
        });
    }
}
