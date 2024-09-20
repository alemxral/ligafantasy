package com.mbridge.msdk.click;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.click.m;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.e.a;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ah;
import java.util.concurrent.Semaphore;

/* loaded from: classes4.dex */
public final class n extends e implements a.InterfaceC0401a {

    /* renamed from: a, reason: collision with root package name */
    private f f18185a;

    /* renamed from: b, reason: collision with root package name */
    private JumpLoaderResult f18186b;

    /* renamed from: d, reason: collision with root package name */
    private boolean f18188d;

    /* renamed from: e, reason: collision with root package name */
    private Context f18189e;

    /* renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.e.b f18190f;

    /* renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.click.entity.a f18191g;

    /* renamed from: c, reason: collision with root package name */
    private boolean f18187c = true;

    /* renamed from: h, reason: collision with root package name */
    private Handler f18192h = new Handler(Looper.getMainLooper());

    public n(Context context) {
        this.f18189e = context;
        this.f18190f = new com.mbridge.msdk.foundation.same.e.b(context, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(String str, f fVar, boolean z8, String str2, String str3, CampaignEx campaignEx, boolean z9, boolean z10, int i8) {
        a aVar;
        this.f18185a = fVar;
        this.f18188d = z8;
        com.mbridge.msdk.click.entity.b bVar = new com.mbridge.msdk.click.entity.b();
        bVar.a(this.f18189e);
        bVar.a(str);
        bVar.c(z8);
        bVar.b(str2);
        bVar.c(str3);
        bVar.a(campaignEx);
        bVar.a(z9);
        bVar.b(z10);
        bVar.a(i8);
        if (str.startsWith("tcp")) {
            k kVar = new k(bVar);
            kVar.a(this.f18185a);
            kVar.a(new j() { // from class: com.mbridge.msdk.click.n.1
                @Override // com.mbridge.msdk.click.j
                public final void a(JumpLoaderResult jumpLoaderResult) {
                    n.this.f18186b = jumpLoaderResult;
                }
            });
            aVar = kVar;
        } else {
            aVar = new a(this.f18189e, str, str2, str3, campaignEx, z9, z10, i8);
        }
        this.f18190f.a(aVar, this);
    }

    @Override // com.mbridge.msdk.click.e
    public final void a() {
        this.f18187c = false;
    }

    @Override // com.mbridge.msdk.foundation.same.e.a.InterfaceC0401a
    public final void a(a.b bVar) {
        if (bVar == a.b.FINISH && this.f18187c) {
            this.f18192h.post(new Runnable() { // from class: com.mbridge.msdk.click.n.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (n.this.f18185a != null) {
                        if (n.this.f18186b.isSuccess()) {
                            n.this.f18185a.b(n.this.f18186b);
                        } else {
                            n.this.f18185a.a(n.this.f18186b, n.this.f18186b.getMsg());
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class a extends com.mbridge.msdk.foundation.same.e.a {

        /* renamed from: c, reason: collision with root package name */
        private final Context f18197c;

        /* renamed from: d, reason: collision with root package name */
        private String f18198d;

        /* renamed from: e, reason: collision with root package name */
        private String f18199e;

        /* renamed from: f, reason: collision with root package name */
        private String f18200f;

        /* renamed from: g, reason: collision with root package name */
        private CampaignEx f18201g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f18202h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f18203i;

        /* renamed from: j, reason: collision with root package name */
        private int f18204j;

        /* renamed from: b, reason: collision with root package name */
        private final Semaphore f18196b = new Semaphore(0);

        /* renamed from: k, reason: collision with root package name */
        private m.a f18205k = new m.a() { // from class: com.mbridge.msdk.click.n.a.1
            @Override // com.mbridge.msdk.click.m.a
            public final boolean a(String str) {
                boolean a8 = a.a(a.this, str);
                if (a8) {
                    a();
                }
                return a8;
            }

            @Override // com.mbridge.msdk.click.m.a
            public final boolean b(String str) {
                boolean a8 = a.a(a.this, str);
                if (a8) {
                    a();
                }
                return a8;
            }

            @Override // com.mbridge.msdk.click.m.a
            public final boolean c(String str) {
                return false;
            }

            @Override // com.mbridge.msdk.click.m.a
            public final void a(String str, boolean z8, String str2) {
                a.a(a.this, str);
                n.this.f18186b.setContent(str2);
                a();
            }

            @Override // com.mbridge.msdk.click.m.a
            public final void a(int i8, String str, String str2, String str3) {
                if (!TextUtils.isEmpty(str2)) {
                    n.this.f18186b.setExceptionMsg(str2);
                }
                if (!TextUtils.isEmpty(str3)) {
                    n.this.f18186b.setContent(str3);
                }
                a.a(a.this, str);
                a();
            }

            private void a() {
                synchronized (n.this) {
                    n.this.f18186b.setSuccess(true);
                    a.a(a.this);
                }
            }
        };

        public a(Context context, String str, String str2, String str3, CampaignEx campaignEx, boolean z8, boolean z9, int i8) {
            this.f18197c = context;
            this.f18198d = str;
            this.f18199e = str2;
            this.f18200f = str3;
            this.f18201g = campaignEx;
            this.f18202h = z8;
            this.f18203i = z9;
            this.f18204j = i8;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x01f0 A[EDGE_INSN: B:85:0x01f0->B:34:0x01f0 BREAK  A[LOOP:0: B:16:0x005a->B:58:0x01e9], SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private com.mbridge.msdk.click.entity.JumpLoaderResult a(java.lang.String r16, boolean r17, boolean r18, com.mbridge.msdk.foundation.entity.CampaignEx r19, int r20) {
            /*
                Method dump skipped, instructions count: 497
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.n.a.a(java.lang.String, boolean, boolean, com.mbridge.msdk.foundation.entity.CampaignEx, int):com.mbridge.msdk.click.entity.JumpLoaderResult");
        }

        @Override // com.mbridge.msdk.foundation.same.e.a
        public final void cancelTask() {
        }

        @Override // com.mbridge.msdk.foundation.same.e.a
        public final void pauseTask(boolean z8) {
        }

        @Override // com.mbridge.msdk.foundation.same.e.a
        public final void runTask() {
            if (n.this.f18185a != null) {
                n.this.f18185a.a(null);
            }
            n.this.f18186b = new JumpLoaderResult();
            n.this.f18186b.setUrl(this.f18198d);
            n.this.f18186b = a(this.f18198d, this.f18202h, this.f18203i, this.f18201g, this.f18204j);
            if (!TextUtils.isEmpty(n.this.f18186b.getExceptionMsg())) {
                n.this.f18186b.setSuccess(true);
            }
            if (!n.this.f18187c || !n.this.f18186b.isSuccess()) {
                return;
            }
            if (n.this.f18191g != null) {
                n.this.f18186b.setStatusCode(n.this.f18191g.f18113f);
            }
            CampaignEx campaignEx = this.f18201g;
            JumpLoaderResult jumpLoaderResult = n.this.f18186b;
            com.mbridge.msdk.click.entity.a aVar = n.this.f18191g;
            String str = this.f18199e;
            String str2 = this.f18200f;
            Context context = this.f18197c;
            m.a aVar2 = this.f18205k;
            Semaphore semaphore = this.f18196b;
            if (!ah.a.b(jumpLoaderResult.getUrl()) && 200 == aVar.f18113f && !TextUtils.isEmpty(jumpLoaderResult.getContent()) && !jumpLoaderResult.getContent().contains("EXCEPTION_CAMPAIGN_NOT_ACTIVE")) {
                jumpLoaderResult.setType(2);
                if (!TextUtils.isEmpty(jumpLoaderResult.getContent())) {
                    new m().a(str, str2, context, jumpLoaderResult.getUrl(), jumpLoaderResult.getContent(), aVar2);
                } else {
                    try {
                        new m().a(str, str2, context, jumpLoaderResult.getUrl(), aVar2);
                    } catch (Exception e8) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("WebViewSpiderLoaderDiff", e8.getMessage());
                        }
                    }
                }
                semaphore.acquireUninterruptibly();
                return;
            }
            if (aVar != null) {
                jumpLoaderResult.setType(1);
                jumpLoaderResult.setExceptionMsg(aVar.f18115h);
                jumpLoaderResult.setStatusCode(aVar.f18113f);
                jumpLoaderResult.setHeader(aVar.a());
                jumpLoaderResult.setContent(aVar.f18114g);
            }
            o.a(jumpLoaderResult.getUrl(), campaignEx, jumpLoaderResult);
        }

        private boolean a(String str) {
            return !URLUtil.isNetworkUrl(str);
        }

        static /* synthetic */ boolean a(a aVar, String str) {
            return o.a(str, aVar.f18201g, n.this.f18186b);
        }

        static /* synthetic */ void a(a aVar) {
            aVar.f18196b.release();
        }
    }
}
