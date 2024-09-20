package com.mbridge.msdk.video.module.a.a;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.db.p;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.module.a.a.k;
import java.io.File;
import java.util.Map;

/* loaded from: classes4.dex */
public class o extends k {

    /* renamed from: k, reason: collision with root package name */
    protected int f22565k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f22566l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f22567m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f22568n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f22569o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f22570p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f22571q;

    /* renamed from: r, reason: collision with root package name */
    private Map<Integer, String> f22572r;

    /* renamed from: s, reason: collision with root package name */
    private MBridgeVideoView.a f22573s;

    /* renamed from: t, reason: collision with root package name */
    private int f22574t;

    public o(CampaignEx campaignEx, com.mbridge.msdk.videocommon.b.c cVar, com.mbridge.msdk.videocommon.download.a aVar, String str, String str2, com.mbridge.msdk.video.module.a.a aVar2, int i8, boolean z8) {
        super(campaignEx, aVar, cVar, str, str2, aVar2, i8, z8);
        this.f22571q = false;
        this.f22565k = 0;
        this.f22574t = -1;
        if (this.f22528a) {
            this.f22572r = campaignEx.getAdvImpList();
        }
        this.f22565k = campaignEx.getVideoCompleteTime();
    }

    @Override // com.mbridge.msdk.video.module.a.a.k, com.mbridge.msdk.video.module.a.a.f, com.mbridge.msdk.video.module.a.a
    public void a(int i8, final Object obj) {
        int i9;
        CampaignEx campaignEx;
        try {
            if (i8 != 2) {
                int i10 = 0;
                if (i8 != 20) {
                    if (i8 != 130) {
                        if (i8 != 6) {
                            if (i8 != 7) {
                                if (i8 != 15) {
                                    if (i8 != 16) {
                                        switch (i8) {
                                            case 11:
                                                com.mbridge.msdk.videocommon.download.b.getInstance().b(false);
                                                d();
                                                break;
                                            case 12:
                                                Runnable runnable = new Runnable() { // from class: com.mbridge.msdk.video.module.a.a.o.1
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        Object obj2 = obj;
                                                        if (obj2 instanceof String) {
                                                            o.this.a((String) obj2);
                                                        }
                                                    }
                                                };
                                                com.mbridge.msdk.foundation.controller.d.a();
                                                com.mbridge.msdk.foundation.same.f.b.b().execute(runnable);
                                                d();
                                                b();
                                                c();
                                                k.AnonymousClass4 anonymousClass4 = new Runnable() { // from class: com.mbridge.msdk.video.module.a.a.k.4
                                                    public AnonymousClass4() {
                                                    }

                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        com.mbridge.msdk.videocommon.download.a aVar;
                                                        try {
                                                            if (af.a().a("c_r_v_f_w_s_e", false)) {
                                                                return;
                                                            }
                                                            k kVar = k.this;
                                                            if (kVar.f22528a && (aVar = kVar.f22532e) != null) {
                                                                if (aVar.l() != null && !TextUtils.isEmpty(k.this.f22532e.l().getVideoUrlEncode())) {
                                                                    p.a(com.mbridge.msdk.foundation.db.h.a(com.mbridge.msdk.foundation.controller.c.m().c())).b(k.this.f22532e.l().getVideoUrlEncode());
                                                                }
                                                                if (!TextUtils.isEmpty(k.this.f22532e.h())) {
                                                                    File file = new File(k.this.f22532e.h());
                                                                    if (file.exists() && file.isFile() && file.delete()) {
                                                                        ad.a("NotifyListener", "DEL File :" + file.getAbsolutePath());
                                                                    }
                                                                }
                                                            }
                                                        } catch (Exception e8) {
                                                            e8.printStackTrace();
                                                        }
                                                    }
                                                };
                                                com.mbridge.msdk.foundation.controller.d.a();
                                                com.mbridge.msdk.foundation.same.f.b.b().execute(anonymousClass4);
                                                com.mbridge.msdk.videocommon.download.b.getInstance().b(false);
                                                break;
                                            case 13:
                                                b();
                                                c();
                                                break;
                                        }
                                    }
                                } else {
                                    g();
                                    f();
                                    e();
                                    if (af.a().a("i_l_s_t_r_i", false) && !this.f22569o) {
                                        this.f22569o = true;
                                        MBridgeVideoView.a aVar = this.f22573s;
                                        if (aVar != null) {
                                            aVar.a();
                                        }
                                    }
                                    if (obj != null && (obj instanceof MBridgeVideoView.b)) {
                                        int i11 = ((MBridgeVideoView.b) obj).f22496a;
                                        i10 = ((MBridgeVideoView.b) obj).f22497b;
                                        i9 = i11;
                                    } else {
                                        i9 = 0;
                                    }
                                    if (i10 == 0 && (campaignEx = this.f22529b) != null) {
                                        i10 = campaignEx.getVideoLength();
                                    }
                                    com.mbridge.msdk.video.module.b.b.a(com.mbridge.msdk.foundation.controller.c.m().c(), this.f22529b, i9, i10, this.f22537j);
                                    com.mbridge.msdk.video.module.b.b.a(this.f22529b, this.f22572r, this.f22534g, i9);
                                    if (!this.f22570p) {
                                        this.f22570p = true;
                                        com.mbridge.msdk.video.module.b.b.a(this.f22529b, this.f22534g);
                                    }
                                    if (!this.f22571q) {
                                        int i12 = this.f22565k;
                                        if (i12 != 0) {
                                            i10 = i12;
                                        }
                                        if (i9 >= i10) {
                                            this.f22571q = true;
                                            i8 = 17;
                                        }
                                    }
                                    ad.b("NotifyListener", "onPlayProgress:" + i9);
                                    this.f22574t = i9;
                                }
                            } else if (this.f22528a && obj != null && (obj instanceof Integer)) {
                                int intValue = ((Integer) obj).intValue();
                                if (intValue == 2) {
                                    if (!this.f22567m) {
                                        this.f22567m = true;
                                        com.mbridge.msdk.video.module.b.b.b(com.mbridge.msdk.foundation.controller.c.m().c(), this.f22529b);
                                    }
                                } else if (intValue == 1 && !this.f22566l) {
                                    this.f22566l = true;
                                    com.mbridge.msdk.video.module.b.b.c(com.mbridge.msdk.foundation.controller.c.m().c(), this.f22529b);
                                }
                            }
                        }
                    } else if (obj instanceof Integer) {
                        this.f22565k = ((Integer) obj).intValue();
                    }
                } else if (af.a().a("i_l_s_t_r_i", false) && (obj instanceof MBridgeVideoView.a)) {
                    this.f22573s = (MBridgeVideoView.a) obj;
                }
                this.f22536i.a(i8, obj);
            }
            if (this.f22528a && !this.f22568n) {
                this.f22568n = true;
                d();
                com.mbridge.msdk.video.module.b.b.e(com.mbridge.msdk.foundation.controller.c.m().c(), this.f22529b);
            }
            this.f22536i.a(i8, obj);
        } catch (Throwable th) {
            ad.a("NotifyListener", th.getMessage(), th);
        }
    }
}
