package com.mbridge.msdk.click;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.click.m;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.e.a;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ah;
import java.util.concurrent.Semaphore;

/* loaded from: classes4.dex */
public final class k extends com.mbridge.msdk.foundation.same.e.a {

    /* renamed from: b, reason: collision with root package name */
    private Context f18136b;

    /* renamed from: c, reason: collision with root package name */
    private String f18137c;

    /* renamed from: d, reason: collision with root package name */
    private String f18138d;

    /* renamed from: e, reason: collision with root package name */
    private String f18139e;

    /* renamed from: f, reason: collision with root package name */
    private CampaignEx f18140f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f18141g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f18142h;

    /* renamed from: i, reason: collision with root package name */
    private int f18143i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f18144j;

    /* renamed from: k, reason: collision with root package name */
    private com.mbridge.msdk.click.entity.a f18145k;

    /* renamed from: l, reason: collision with root package name */
    private JumpLoaderResult f18146l;

    /* renamed from: m, reason: collision with root package name */
    private f f18147m;

    /* renamed from: n, reason: collision with root package name */
    private j f18148n;

    /* renamed from: a, reason: collision with root package name */
    private final Semaphore f18135a = new Semaphore(0);

    /* renamed from: o, reason: collision with root package name */
    private final m.a f18149o = new m.a() { // from class: com.mbridge.msdk.click.k.1
        @Override // com.mbridge.msdk.click.m.a
        public final boolean a(String str) {
            boolean a8 = k.a(k.this, str);
            if (a8) {
                a();
            }
            return a8;
        }

        @Override // com.mbridge.msdk.click.m.a
        public final boolean b(String str) {
            boolean a8 = k.a(k.this, str);
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
            k.a(k.this, str);
            k.this.f18146l.setContent(str2);
            a();
        }

        private void a() {
            synchronized (this) {
                try {
                    k.this.f18146l.setSuccess(true);
                    if (k.this.f18148n != null) {
                        k.this.f18148n.a(k.this.f18146l);
                    }
                    k.c(k.this);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.mbridge.msdk.click.m.a
        public final void a(int i8, String str, String str2, String str3) {
            if (!TextUtils.isEmpty(str2)) {
                k.this.f18146l.setExceptionMsg(str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                k.this.f18146l.setContent(str3);
            }
            k.a(k.this, str);
            a();
        }
    };

    public k(com.mbridge.msdk.click.entity.b bVar) {
        this.f18136b = bVar.a();
        this.f18137c = bVar.b();
        this.f18138d = bVar.c();
        this.f18139e = bVar.d();
        this.f18140f = bVar.e();
        this.f18141g = bVar.f();
        this.f18142h = bVar.g();
        this.f18143i = bVar.i();
        this.f18144j = bVar.h();
    }

    static /* synthetic */ void c(k kVar) {
        kVar.f18135a.release();
    }

    @Override // com.mbridge.msdk.foundation.same.e.a
    public final void cancelTask() {
    }

    @Override // com.mbridge.msdk.foundation.same.e.a
    public final void pauseTask(boolean z8) {
    }

    @Override // com.mbridge.msdk.foundation.same.e.a
    public final void runTask() {
        f fVar = this.f18147m;
        if (fVar != null) {
            fVar.a(null);
        }
        JumpLoaderResult jumpLoaderResult = new JumpLoaderResult();
        this.f18146l = jumpLoaderResult;
        jumpLoaderResult.setUrl(this.f18137c);
        JumpLoaderResult a8 = a(this.f18137c);
        this.f18146l = a8;
        if (!TextUtils.isEmpty(a8.getExceptionMsg())) {
            this.f18146l.setSuccess(true);
        }
        if (this.mState != a.b.RUNNING) {
            j jVar = this.f18148n;
            if (jVar != null) {
                jVar.a(this.f18146l);
                return;
            }
            return;
        }
        if (!this.f18146l.isSuccess()) {
            j jVar2 = this.f18148n;
            if (jVar2 != null) {
                jVar2.a(this.f18146l);
                return;
            }
            return;
        }
        com.mbridge.msdk.click.entity.a aVar = this.f18145k;
        if (aVar != null) {
            this.f18146l.setStatusCode(aVar.f18113f);
        }
        JumpLoaderResult jumpLoaderResult2 = this.f18146l;
        com.mbridge.msdk.click.entity.a aVar2 = this.f18145k;
        String str = this.f18138d;
        String str2 = this.f18139e;
        Context context = this.f18136b;
        m.a aVar3 = this.f18149o;
        j jVar3 = this.f18148n;
        Semaphore semaphore = this.f18135a;
        if (!ah.a.b(jumpLoaderResult2.getUrl()) && 200 == aVar2.f18113f && !TextUtils.isEmpty(jumpLoaderResult2.getContent()) && !jumpLoaderResult2.getContent().contains("EXCEPTION_CAMPAIGN_NOT_ACTIVE")) {
            jumpLoaderResult2.setType(2);
            if (!TextUtils.isEmpty(jumpLoaderResult2.getContent())) {
                new m().a(str, str2, context, jumpLoaderResult2.getUrl(), jumpLoaderResult2.getContent(), aVar3);
            } else {
                try {
                    new m().a(str, str2, context, jumpLoaderResult2.getUrl(), aVar3);
                } catch (Exception unused) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("TAG", "webview spider start error");
                    }
                }
            }
            semaphore.acquireUninterruptibly();
            return;
        }
        if (aVar2 != null) {
            jumpLoaderResult2.setType(1);
            jumpLoaderResult2.setExceptionMsg(aVar2.f18115h);
            jumpLoaderResult2.setStatusCode(aVar2.f18113f);
            jumpLoaderResult2.setHeader(aVar2.a());
            jumpLoaderResult2.setContent(aVar2.f18114g);
        }
        String url = jumpLoaderResult2.getUrl();
        if (ah.a.b(url)) {
            jumpLoaderResult2.setCode(1);
            jumpLoaderResult2.setUrl(url);
            jumpLoaderResult2.setjumpDone(true);
        } else {
            jumpLoaderResult2.setCode(2);
            jumpLoaderResult2.setUrl(url);
        }
        if (jVar3 != null) {
            jVar3.a(jumpLoaderResult2);
        }
    }

    private String b(String str) {
        if (this.f18144j) {
            String a8 = com.mbridge.msdk.c.b.a(this.f18136b, str);
            if (!TextUtils.isEmpty(a8)) {
                str = str + a8;
            }
        }
        com.mbridge.msdk.f.b.a();
        return str;
    }

    public final void a(f fVar) {
        this.f18147m = fVar;
    }

    public final void a(j jVar) {
        this.f18148n = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016a A[EDGE_INSN: B:72:0x016a->B:34:0x016a BREAK  A[LOOP:0: B:11:0x003d->B:53:0x0162], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.mbridge.msdk.click.entity.JumpLoaderResult a(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.k.a(java.lang.String):com.mbridge.msdk.click.entity.JumpLoaderResult");
    }

    static /* synthetic */ boolean a(k kVar, String str) {
        CampaignEx campaignEx = kVar.f18140f;
        JumpLoaderResult jumpLoaderResult = kVar.f18146l;
        if (ah.a.b(jumpLoaderResult.getUrl())) {
            jumpLoaderResult.setCode(1);
            jumpLoaderResult.setUrl(str);
            jumpLoaderResult.setjumpDone(true);
            return true;
        }
        jumpLoaderResult.setCode(2);
        jumpLoaderResult.setUrl(str);
        return false;
    }
}
