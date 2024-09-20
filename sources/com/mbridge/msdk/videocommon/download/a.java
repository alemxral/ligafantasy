package com.mbridge.msdk.videocommon.download;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.k;
import com.mbridge.msdk.foundation.db.p;
import com.mbridge.msdk.foundation.db.q;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.DownloadProgress;
import com.mbridge.msdk.foundation.download.DownloadResourceType;
import com.mbridge.msdk.foundation.download.DownloadStatus;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.download.OnProgressStateListener;
import com.mbridge.msdk.foundation.download.core.DownloadRequest;
import com.mbridge.msdk.foundation.download.utils.Objects;
import com.mbridge.msdk.foundation.download.utils.Utils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.m;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.tools.ab;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import java.io.File;
import java.io.Serializable;
import java.net.URL;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public final class a implements Serializable {

    /* renamed from: A, reason: collision with root package name */
    private int f23035A;

    /* renamed from: B, reason: collision with root package name */
    private File f23036B;

    /* renamed from: D, reason: collision with root package name */
    private int f23038D;

    /* renamed from: E, reason: collision with root package name */
    private int f23039E;

    /* renamed from: F, reason: collision with root package name */
    private int f23040F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f23041G;

    /* renamed from: H, reason: collision with root package name */
    private k f23042H;

    /* renamed from: I, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.d.c f23043I;

    /* renamed from: J, reason: collision with root package name */
    private k f23044J;

    /* renamed from: b, reason: collision with root package name */
    private int f23055b;

    /* renamed from: c, reason: collision with root package name */
    private int f23056c;

    /* renamed from: e, reason: collision with root package name */
    private volatile int f23058e;

    /* renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.listener.a f23060g;

    /* renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.listener.a f23061h;

    /* renamed from: i, reason: collision with root package name */
    private CampaignEx f23062i;

    /* renamed from: j, reason: collision with root package name */
    private String f23063j;

    /* renamed from: k, reason: collision with root package name */
    private Context f23064k;

    /* renamed from: l, reason: collision with root package name */
    private long f23065l;

    /* renamed from: m, reason: collision with root package name */
    private String f23066m;

    /* renamed from: n, reason: collision with root package name */
    private String f23067n;

    /* renamed from: o, reason: collision with root package name */
    private long f23068o;

    /* renamed from: p, reason: collision with root package name */
    private String f23069p;

    /* renamed from: r, reason: collision with root package name */
    private long f23071r;

    /* renamed from: u, reason: collision with root package name */
    private p f23074u;

    /* renamed from: w, reason: collision with root package name */
    private String f23076w;

    /* renamed from: x, reason: collision with root package name */
    private DownloadRequest f23077x;

    /* renamed from: y, reason: collision with root package name */
    private int f23078y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f23079z;

    /* renamed from: a, reason: collision with root package name */
    private boolean f23054a = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f23057d = false;

    /* renamed from: f, reason: collision with root package name */
    private CopyOnWriteArrayList<c> f23059f = new CopyOnWriteArrayList<>();

    /* renamed from: q, reason: collision with root package name */
    private boolean f23070q = false;

    /* renamed from: s, reason: collision with root package name */
    private int f23072s = 100;

    /* renamed from: t, reason: collision with root package name */
    private boolean f23073t = false;

    /* renamed from: v, reason: collision with root package name */
    private boolean f23075v = false;

    /* renamed from: C, reason: collision with root package name */
    private int f23037C = 1;

    /* renamed from: K, reason: collision with root package name */
    private boolean f23045K = false;

    /* renamed from: L, reason: collision with root package name */
    private boolean f23046L = false;

    /* renamed from: M, reason: collision with root package name */
    private boolean f23047M = false;

    /* renamed from: N, reason: collision with root package name */
    private boolean f23048N = false;

    /* renamed from: O, reason: collision with root package name */
    private boolean f23049O = false;

    /* renamed from: P, reason: collision with root package name */
    private boolean f23050P = false;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f23051Q = false;

    /* renamed from: R, reason: collision with root package name */
    private OnDownloadStateListener f23052R = new OnDownloadStateListener() { // from class: com.mbridge.msdk.videocommon.download.a.1
        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public final void onCancelDownload(DownloadMessage downloadMessage) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public final void onDownloadComplete(DownloadMessage downloadMessage) {
            String str;
            try {
                ad.b("CampaignDownLoadTask", "onDownloadComplete callback : " + a.this.f23068o + "    " + a.this.f23065l);
                if (a.this.f23074u == null) {
                    a.this.f23074u = p.a(com.mbridge.msdk.foundation.db.h.a(com.mbridge.msdk.foundation.controller.c.m().c()));
                }
                a.this.f23074u.a(a.this.f23066m, a.this.f23068o, 5);
                if (downloadMessage != null) {
                    try {
                        str = (String) downloadMessage.getExtra("responseHeaders");
                    } catch (Throwable th) {
                        ad.b("CampaignDownLoadTask", th.getMessage());
                    }
                    a aVar = a.this;
                    aVar.a(aVar.f23068o, true, str);
                    a.this.f23074u.a(a.this.f23066m, a.this.f23068o, 5);
                    a aVar2 = a.this;
                    aVar2.a(aVar2.f23068o, true, "");
                    a.a(a.this, 1, true);
                }
                str = "";
                a aVar3 = a.this;
                aVar3.a(aVar3.f23068o, true, str);
                a.this.f23074u.a(a.this.f23066m, a.this.f23068o, 5);
                a aVar22 = a.this;
                aVar22.a(aVar22.f23068o, true, "");
                a.a(a.this, 1, true);
            } catch (Exception e8) {
                ad.b("CampaignDownLoadTask", e8.getMessage());
            }
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public final void onDownloadError(DownloadMessage downloadMessage, DownloadError downloadError) {
            String str;
            if (a.this.f23077x != null && a.this.f23077x.getStatus() != DownloadStatus.CANCELLED) {
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a("cache", a.this.f23077x.get("cache", "2"));
                a aVar = a.this;
                aVar.a(aVar.f23062i, dVar);
                if (downloadError != null && downloadError.getException() != null) {
                    str = downloadError.getException().getMessage();
                } else {
                    str = "Video Download Error";
                }
                a.this.v();
                a.this.a(3, str, "");
                a.this.a(str);
                a aVar2 = a.this;
                a.a(aVar2, 3, aVar2.f23079z);
            }
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public final void onDownloadStart(DownloadMessage downloadMessage) {
            a.this.f23058e = 1;
            if (a.this.f23074u == null) {
                a.this.f23074u = p.a(com.mbridge.msdk.foundation.db.h.a(com.mbridge.msdk.foundation.controller.c.m().c()));
            }
            a.this.f23074u.a(a.this.f23062i, a.this.f23065l, a.this.f23069p, a.this.f23058e);
        }
    };

    /* renamed from: S, reason: collision with root package name */
    private OnProgressStateListener f23053S = new OnProgressStateListener() { // from class: com.mbridge.msdk.videocommon.download.a.2
        @Override // com.mbridge.msdk.foundation.download.OnProgressStateListener
        public final void onProgress(DownloadMessage downloadMessage, DownloadProgress downloadProgress) {
            try {
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a("cache", a.this.f23077x.get("cache", "2"));
                a aVar = a.this;
                aVar.a(aVar.f23062i, dVar);
                a.this.f23068o = downloadProgress.getCurrent();
                a.this.f23065l = downloadProgress.getTotal();
                a.this.f23078y = downloadProgress.getCurrentDownloadRate();
                if (a.this.f23072s != 100 && downloadProgress.getCurrentDownloadRate() >= a.this.f23072s) {
                    ad.b("CampaignDownLoadTask", "Rate : " + downloadProgress.getCurrentDownloadRate() + " ReadyRate & cdRate = " + a.this.f23072s + " " + a.this.f23056c);
                    if (!a.this.f23057d) {
                        a.this.f23057d = true;
                        if (!a.this.f23079z) {
                            a.a(a.this, 1, true);
                            a.this.a(downloadProgress.getCurrent(), false, "");
                        }
                        if (a.this.f23077x != null && a.this.f23037C == 2 && !a.this.f23079z) {
                            a.this.f23077x.cancel(downloadMessage);
                        }
                    }
                }
            } catch (Exception e8) {
                ad.b("CampaignDownLoadTask", e8.getMessage());
            }
        }
    };

    public a(Context context, CampaignEx campaignEx, String str, int i8) {
        File file;
        File file2;
        this.f23055b = 1;
        this.f23058e = 0;
        this.f23068o = 0L;
        int i9 = 100;
        this.f23041G = false;
        if (context == null && campaignEx == null) {
            return;
        }
        com.mbridge.msdk.c.g a8 = com.mbridge.msdk.c.h.a().a(com.mbridge.msdk.foundation.controller.c.m().k());
        if (a8 != null) {
            this.f23041G = a8.aF();
        }
        this.f23038D = com.mbridge.msdk.foundation.same.a.f19420u;
        this.f23039E = com.mbridge.msdk.foundation.same.a.f19421v;
        this.f23040F = com.mbridge.msdk.foundation.same.a.f19419t;
        this.f23071r = System.currentTimeMillis();
        this.f23064k = com.mbridge.msdk.foundation.controller.c.m().c();
        this.f23062i = campaignEx;
        this.f23063j = str;
        this.f23055b = i8;
        if (campaignEx != null) {
            this.f23066m = campaignEx.getVideoUrlEncode();
        }
        this.f23076w = ab.c(this.f23066m);
        this.f23067n = com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_VC) + File.separator;
        this.f23069p = this.f23067n + this.f23076w;
        ad.c("CampaignDownLoadTask", this.f23062i.getAppName() + " videoLocalPath:" + this.f23069p + " videoUrl: " + this.f23062i.getVideoUrlEncode() + " " + this.f23072s);
        try {
            if (!TextUtils.isEmpty(this.f23066m)) {
                if (!TextUtils.isEmpty(this.f23067n)) {
                    file = new File(this.f23067n);
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                } else {
                    file = null;
                }
                if (file != null && file.exists() && ((file2 = this.f23036B) == null || !file2.exists())) {
                    File file3 = new File(file + "/.nomedia");
                    this.f23036B = file3;
                    if (!file3.exists()) {
                        this.f23036B.createNewFile();
                    }
                }
                p a9 = p.a(com.mbridge.msdk.foundation.db.h.a(com.mbridge.msdk.foundation.controller.c.m().c()));
                m a10 = a9.a(this.f23066m, "");
                if (a10 != null) {
                    this.f23068o = a10.c();
                    if (this.f23058e != 2) {
                        this.f23058e = a10.b();
                    }
                    if (this.f23058e == 1) {
                        this.f23058e = 2;
                    }
                    this.f23065l = a10.d();
                    if (a10.a() > 0) {
                        this.f23071r = a10.a();
                    }
                    if (this.f23058e == 5) {
                        if (Objects.exists(new File(this.f23067n + this.f23076w), this.f23067n, this.f23076w)) {
                            this.f23069p = this.f23067n + this.f23076w;
                        } else {
                            u();
                        }
                    } else if (this.f23058e != 0) {
                        this.f23069p = this.f23067n + this.f23076w;
                    }
                } else {
                    a9.a(this.f23066m, this.f23071r);
                }
                try {
                    long j8 = this.f23065l;
                    if (j8 > 0) {
                        if (this.f23068o * 100 >= j8 * b(this.f23062i)) {
                            if (b(this.f23062i) != 100) {
                                if (this.f23058e == 5) {
                                }
                            }
                            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                            dVar.a("cache", 1);
                            a(this.f23062i, dVar);
                        }
                    }
                } catch (Exception e8) {
                    if (MBridgeConstans.DEBUG) {
                        e8.printStackTrace();
                    }
                }
                String str2 = this.f23066m;
                if (TextUtils.isEmpty(str2)) {
                    this.f23061h.a("VideoUrl is NULL, Please check it.", "");
                    return;
                }
                if (this.f23058e == 1) {
                    ad.a("CampaignDownLoadTask", "Run : Task is RUNNING, Will return.");
                    return;
                }
                if (this.f23058e == 5 && Utils.getDownloadRate(this.f23065l, this.f23068o) >= this.f23072s) {
                    ad.a("CampaignDownLoadTask", "Run : Video Done, Will callback.");
                    com.mbridge.msdk.videocommon.listener.a aVar = this.f23060g;
                    if (aVar != null) {
                        aVar.a(this.f23066m);
                    }
                    com.mbridge.msdk.videocommon.listener.a aVar2 = this.f23061h;
                    if (aVar2 != null) {
                        aVar2.a(this.f23066m);
                    }
                    try {
                        File file4 = new File(this.f23069p);
                        if (Objects.exists(file4, this.f23067n, this.f23076w) && file4.isFile()) {
                            file4.setLastModified(System.currentTimeMillis());
                        }
                    } catch (Exception e9) {
                        ad.b("CampaignDownLoadTask", e9.getMessage());
                    }
                    com.mbridge.msdk.foundation.same.report.d.d dVar2 = new com.mbridge.msdk.foundation.same.report.d.d();
                    dVar2.a("cache", 1);
                    a(this.f23062i, dVar2);
                    return;
                }
                if (this.f23055b == 3) {
                    ad.a("CampaignDownLoadTask", "Run : Dlnet is 3, Will callback.");
                    a(0L, false, "");
                    com.mbridge.msdk.foundation.same.report.d.d dVar3 = new com.mbridge.msdk.foundation.same.report.d.d();
                    dVar3.a("cache", 1);
                    a(this.f23062i, dVar3);
                    return;
                }
                try {
                    i9 = b(this.f23062i);
                } catch (Exception unused) {
                }
                c(i9);
                if (i9 == 0) {
                    com.mbridge.msdk.videocommon.listener.a aVar3 = this.f23060g;
                    if (aVar3 != null) {
                        aVar3.a(this.f23066m);
                    }
                    com.mbridge.msdk.videocommon.listener.a aVar4 = this.f23061h;
                    if (aVar4 != null) {
                        aVar4.a(this.f23066m);
                    }
                }
                DownloadMessage downloadMessage = new DownloadMessage(this.f23062i, str2, this.f23076w, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_VIDEO);
                downloadMessage.setUseCronetDownload(e(this.f23062i));
                downloadMessage.addExtra("resource_type", 4);
                this.f23077x = a(downloadMessage, this.f23052R, this.f23053S, "1");
            }
        } catch (Exception e10) {
            ad.c("CampaignDownLoadTask", e10.getMessage());
        }
    }

    private void u() {
        if (this.f23074u == null) {
            this.f23074u = p.a(com.mbridge.msdk.foundation.db.h.a(com.mbridge.msdk.foundation.controller.c.m().c()));
        }
        try {
            try {
                this.f23074u.b(this.f23066m);
                if (!af.a().a("r_d_v_b_l", true)) {
                    File file = new File(this.f23069p);
                    if (file.exists() && file.isFile()) {
                        file.delete();
                    }
                }
            } finally {
                this.f23058e = 0;
            }
        } catch (Throwable unused) {
            ad.b("CampaignDownLoadTask", "del DB or file failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        try {
            String str = com.mbridge.msdk.reward.b.a.f21534b;
            com.mbridge.msdk.reward.b.a.class.getMethod("insertExcludeId", String.class, CampaignEx.class).invoke(com.mbridge.msdk.reward.b.a.class.newInstance(), this.f23063j, this.f23062i);
            Class<?> cls = Class.forName("com.mbridge.msdk.mbnative.controller.NativeController");
            cls.getMethod("insertExcludeId", String.class, CampaignEx.class).invoke(cls.newInstance(), this.f23063j, this.f23062i);
        } catch (Exception e8) {
            ad.b("CampaignDownLoadTask", e8.getMessage());
        }
    }

    public final void o() {
        ad.b("CampaignDownLoadTask", "start()");
        try {
            if (TextUtils.isEmpty(this.f23066m)) {
                return;
            }
            if (this.f23066m != null) {
                ad.b("CampaignDownLoadTask", new URL(this.f23066m).getPath());
            }
            if (this.f23072s == 0 && this.f23037C == 2) {
                ad.b("CampaignDownLoadTask", "Can not start download because readyRate is 0 and videoCtnType is 2");
                return;
            }
            DownloadRequest downloadRequest = this.f23077x;
            if (downloadRequest != null) {
                downloadRequest.start();
            }
        } catch (Throwable unused) {
            com.mbridge.msdk.videocommon.listener.a aVar = this.f23060g;
            if (aVar != null) {
                aVar.a("VideoUrl is not illegal, Please check it.", "");
            }
            com.mbridge.msdk.videocommon.listener.a aVar2 = this.f23061h;
            if (aVar2 != null) {
                aVar2.a("VideoUrl is not illegal, Please check it.", "");
            }
        }
    }

    public final void p() {
        if (this.f23051Q) {
            return;
        }
        try {
            this.f23079z = true;
            if (this.f23037C == 1) {
                ad.b("CampaignDownLoadTask", "Can not call resume(), because videoCtnType = " + this.f23037C);
                return;
            }
            if (this.f23055b == 3) {
                ad.b("CampaignDownLoadTask", "Can not call resume(), because dlnet = " + this.f23055b);
                return;
            }
            ad.b("CampaignDownLoadTask", "resume()");
            this.f23049O = false;
            this.f23050P = false;
            DownloadMessage downloadMessage = new DownloadMessage(new Object(), this.f23066m, this.f23076w, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_VIDEO);
            downloadMessage.setUseCronetDownload(e(this.f23062i));
            DownloadRequest<?> a8 = a(downloadMessage, this.f23052R, this.f23053S, "2");
            this.f23077x = a8;
            a8.start();
        } catch (Exception e8) {
            ad.b("CampaignDownLoadTask", e8.getMessage());
        }
    }

    public final String q() {
        String str = "";
        if (this.f23055b == 3) {
            return "";
        }
        String str2 = this.f23067n + this.f23076w;
        File file = new File(str2);
        try {
            if (Objects.exists(file, this.f23067n, this.f23076w)) {
                if (file.isFile()) {
                    if (file.canRead()) {
                        if (file.length() > 0) {
                            this.f23069p = str2;
                        } else {
                            str = "file length is 0 ";
                        }
                    } else {
                        str = "file can not read ";
                    }
                } else {
                    str = "file is not file ";
                }
            } else {
                str = "file is not exist ";
            }
        } catch (Throwable th) {
            ad.b("CampaignDownLoadTask", th.getMessage());
            str = th.getMessage();
        }
        if (this.f23058e == 5 && !TextUtils.isEmpty(str)) {
            u();
        }
        return str;
    }

    public final void r() {
        if (this.f23059f != null) {
            this.f23059f = null;
        }
    }

    public final void s() {
        CampaignEx campaignEx;
        try {
            try {
                u();
                campaignEx = this.f23062i;
            } catch (Exception unused) {
                ad.b("CampaignDownLoadTask", "del file is failed");
            }
            if (campaignEx != null && campaignEx.getPlayable_ads_without_video() == 2) {
                return;
            }
            com.mbridge.msdk.videocommon.a.a a8 = com.mbridge.msdk.videocommon.a.a.a();
            if (a8 != null) {
                a8.a(this.f23062i);
            }
        } finally {
            this.f23058e = 0;
        }
    }

    public final String t() {
        if (this.f23051Q) {
            try {
                File file = new File(this.f23069p);
                if (file.exists() && file.isFile()) {
                    return this.f23069p;
                }
                return this.f23066m;
            } catch (Exception e8) {
                ad.b("CampaignDownLoadTask", e8.getMessage());
                return this.f23066m;
            }
        }
        try {
            File file2 = new File(this.f23069p);
            if (Objects.exists(file2, this.f23067n, this.f23076w) && file2.isFile()) {
                return this.f23069p;
            }
        } catch (Exception e9) {
            ad.b("CampaignDownLoadTask", e9.getMessage());
        }
        return this.f23066m;
    }

    public final void c(boolean z8) {
        this.f23047M = z8;
    }

    public final void d(boolean z8) {
        this.f23048N = z8;
    }

    public final String e() {
        return this.f23066m;
    }

    public final boolean f() {
        return this.f23075v;
    }

    public final long g() {
        return this.f23071r;
    }

    public final String h() {
        return this.f23069p;
    }

    public final boolean i() {
        return this.f23051Q;
    }

    public final long j() {
        return this.f23065l;
    }

    public final int k() {
        return this.f23058e;
    }

    public final CampaignEx l() {
        return this.f23062i;
    }

    public final long m() {
        return this.f23068o;
    }

    public final void n() {
        ad.b("CampaignDownLoadTask", "startForLoadRefactor()");
        try {
            if (TextUtils.isEmpty(this.f23066m)) {
                com.mbridge.msdk.videocommon.listener.a aVar = this.f23060g;
                if (aVar != null) {
                    aVar.a(this.f23066m);
                    return;
                }
                return;
            }
            if (this.f23066m != null) {
                ad.b("CampaignDownLoadTask", new URL(this.f23066m).getPath());
            }
            if (this.f23055b == 3) {
                ad.b("CampaignDownLoadTask", "startForLoadRefactor: Dlnet is 3, Will callback.");
                com.mbridge.msdk.videocommon.listener.a aVar2 = this.f23060g;
                if (aVar2 != null) {
                    aVar2.a(this.f23066m);
                    return;
                }
                return;
            }
            if (this.f23072s == 0 && this.f23037C == 2) {
                ad.b("CampaignDownLoadTask", "Can not start download because readyRate is 0 and videoCtnType is 2");
                com.mbridge.msdk.videocommon.listener.a aVar3 = this.f23060g;
                if (aVar3 != null) {
                    aVar3.a(this.f23066m);
                    return;
                }
                return;
            }
            try {
                if (this.f23058e == 5 && Utils.getDownloadRate(this.f23065l, this.f23068o) >= this.f23072s) {
                    if (Objects.exists(new File(this.f23067n + this.f23076w), this.f23067n, this.f23076w)) {
                        this.f23069p = this.f23067n + this.f23076w;
                        com.mbridge.msdk.videocommon.listener.a aVar4 = this.f23060g;
                        if (aVar4 != null) {
                            aVar4.a(this.f23066m);
                            return;
                        }
                        return;
                    }
                }
            } catch (Exception e8) {
                ad.b("CampaignDownLoadTask", "startForLoadRefactor: " + e8.getMessage());
            }
            DownloadRequest downloadRequest = this.f23077x;
            if (downloadRequest != null) {
                downloadRequest.start();
            }
        } catch (Throwable unused) {
            com.mbridge.msdk.videocommon.listener.a aVar5 = this.f23060g;
            if (aVar5 != null) {
                aVar5.a("VideoUrl is not illegal, Please check it.", "");
            }
        }
    }

    public final boolean c() {
        return this.f23047M;
    }

    public final boolean d() {
        return this.f23048N;
    }

    public final void e(boolean z8) {
        this.f23075v = z8;
    }

    public final void f(boolean z8) {
        this.f23070q = z8;
    }

    public final void b(boolean z8) {
        this.f23046L = z8;
    }

    public final void c(int i8) {
        ad.a("CampaignDownLoadTask", "set ready rate: " + i8);
        this.f23072s = i8;
    }

    public final void d(int i8) {
        this.f23035A = i8;
    }

    public final void e(int i8) {
        this.f23037C = i8;
    }

    private int d(CampaignEx campaignEx) {
        try {
            k kVar = this.f23044J;
            if (kVar != null) {
                return kVar.p();
            }
            return 100;
        } catch (Exception e8) {
            if (!MBridgeConstans.DEBUG) {
                return 100;
            }
            ad.b("CampaignDownLoadTask", e8.getMessage());
            return 100;
        }
    }

    private int e(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return 0;
        }
        try {
            if (campaignEx.getAabEntity() != null) {
                return campaignEx.getAabEntity().h3c;
            }
            return 0;
        } catch (Throwable th) {
            ad.b("CampaignDownLoadTask", th.getMessage());
            return 0;
        }
    }

    public final boolean b() {
        return this.f23046L;
    }

    private int c(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return 100;
        }
        try {
            if (campaignEx.getAdType() == 298) {
                if (this.f23042H == null) {
                    this.f23042H = com.mbridge.msdk.c.h.a().c(com.mbridge.msdk.foundation.controller.c.m().k(), this.f23063j);
                }
                return this.f23042H.p();
            }
            if (campaignEx.getAdType() == 42) {
                if (this.f23044J == null) {
                    this.f23044J = com.mbridge.msdk.c.h.a().d(com.mbridge.msdk.foundation.controller.c.m().k(), this.f23063j);
                }
                return d((CampaignEx) null);
            }
            if (this.f23043I == null) {
                this.f23043I = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.f23063j, false);
            }
            return this.f23043I.r();
        } catch (Throwable th) {
            ad.a("CampaignDownLoadTask", th.getMessage(), th);
            return 100;
        }
    }

    public final void b(int i8) {
        this.f23056c = i8;
    }

    private int b(CampaignEx campaignEx) {
        int c8;
        if (campaignEx == null) {
            return 100;
        }
        if (campaignEx.getReady_rate() != -1) {
            c8 = campaignEx.getReady_rate();
            ad.a("CampaignDownLoadTask", "ready_rate(campaign): " + c8);
        } else {
            c8 = c(campaignEx);
            ad.a("CampaignDownLoadTask", "ready_rate(reward_unit_setting): " + c8);
        }
        try {
            return Math.max(c8, 0);
        } catch (Exception unused) {
            return 100;
        }
    }

    public final void a(boolean z8) {
        this.f23045K = z8;
    }

    public final boolean a() {
        return this.f23045K;
    }

    public final void d(String str) {
        this.f23066m = str;
    }

    public final void a(int i8) {
        this.f23055b = i8;
    }

    public final void a(int i8, int i9) {
        this.f23058e = i8;
        if (this.f23074u == null) {
            this.f23074u = p.a(com.mbridge.msdk.foundation.db.h.a(com.mbridge.msdk.foundation.controller.c.m().c()));
        }
        this.f23074u.a(this.f23066m, i9, i8);
    }

    public final void b(String str) {
        v();
        a(2, str, "");
        this.f23058e = 4;
    }

    public final void a(CampaignEx campaignEx) {
        this.f23062i = campaignEx;
    }

    private DownloadRequest<?> a(DownloadMessage downloadMessage, OnDownloadStateListener onDownloadStateListener, OnProgressStateListener onProgressStateListener, String str) {
        return MBDownloadManager.getInstance().download(downloadMessage).withReadTimeout(this.f23038D).withConnectTimeout(this.f23040F).withWriteTimeout(this.f23039E).withDownloadPriority(DownloadPriority.HIGH).withHttpRetryCounter(1).withDirectoryPathInternal(this.f23067n).withDownloadStateListener(onDownloadStateListener).withProgressStateListener(onProgressStateListener).with("do_us_fi_re", Boolean.toString(this.f23041G)).with(CampaignEx.JSON_KEY_READY_RATE, String.valueOf(this.f23072s)).with("scenes", str).build();
    }

    public final void b(com.mbridge.msdk.videocommon.listener.a aVar) {
        this.f23061h = aVar;
    }

    public final void a(long j8, boolean z8, String str) {
        p pVar;
        ad.b("CampaignDownLoadTask", "setStateToDone 下载完成  ： mProgressSize" + this.f23068o + "  progressSize " + j8 + "  " + this.f23078y + "%   FileSize : " + this.f23065l + "  " + this.f23062i.getAppName());
        if (this.f23072s == 100 && this.f23055b != 3 && j8 != this.f23065l && !z8) {
            File file = new File(this.f23069p);
            ad.b("CampaignDownLoadTask", "progressSize = " + j8 + " fileSize = " + this.f23065l + " " + z8 + " absFileSize = " + (Objects.exists(file, this.f23067n, this.f23076w) ? file.length() : 0L));
            a("File size is not match witch download size.");
            return;
        }
        this.f23058e = 5;
        if (j8 == this.f23065l) {
            a(1, "", str);
        }
        long j9 = this.f23065l;
        if (j9 != 0 && (pVar = this.f23074u) != null) {
            pVar.b(this.f23066m, j9);
        }
        this.f23054a = false;
        a(j8, this.f23058e);
    }

    public final void c(String str) {
        this.f23069p = str;
    }

    public final void a(String str) {
        com.mbridge.msdk.videocommon.listener.a aVar = this.f23060g;
        if (aVar != null) {
            aVar.a(str, this.f23066m);
        }
        com.mbridge.msdk.videocommon.listener.a aVar2 = this.f23061h;
        if (aVar2 != null) {
            aVar2.a(str, this.f23066m);
        }
        ad.b("CampaignDownLoadTask", "Video download stop : " + str);
        if (this.f23058e == 4 || this.f23058e == 2 || this.f23058e == 5) {
            return;
        }
        this.f23058e = 4;
        CampaignEx campaignEx = this.f23062i;
        if (campaignEx != null && campaignEx.getRsIgnoreCheckRule() != null && this.f23062i.getRsIgnoreCheckRule().size() > 0 && this.f23062i.getRsIgnoreCheckRule().contains(0)) {
            ad.c("CampaignDownLoadTask", "Is not check video download status");
        } else {
            a(this.f23068o, this.f23058e);
        }
    }

    public final void a(c cVar) {
        CopyOnWriteArrayList<c> copyOnWriteArrayList = this.f23059f;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.add(cVar);
        }
    }

    public final void a(com.mbridge.msdk.videocommon.listener.a aVar) {
        this.f23060g = aVar;
    }

    private void a(long j8, int i8) {
        this.f23068o = j8;
        int i9 = this.f23072s;
        if (100 * j8 >= i9 * this.f23065l && !this.f23073t && i8 != 4) {
            if (i9 == 100 && i8 != 5) {
                this.f23058e = 5;
                return;
            }
            this.f23073t = true;
            ad.b("CampaignDownLoadTask", "UpdateListener : state: " + i8 + " progress : " + j8);
            String q8 = q();
            if (TextUtils.isEmpty(q8)) {
                com.mbridge.msdk.videocommon.listener.a aVar = this.f23060g;
                if (aVar != null) {
                    aVar.a(this.f23066m);
                }
                com.mbridge.msdk.videocommon.listener.a aVar2 = this.f23061h;
                if (aVar2 != null) {
                    aVar2.a(this.f23066m);
                }
            } else {
                com.mbridge.msdk.videocommon.listener.a aVar3 = this.f23060g;
                if (aVar3 != null) {
                    aVar3.a("file is not effective " + q8, this.f23066m);
                }
                com.mbridge.msdk.videocommon.listener.a aVar4 = this.f23061h;
                if (aVar4 != null) {
                    aVar4.a("file is not effective " + q8, this.f23066m);
                }
            }
        }
        if (!this.f23054a && j8 > 0) {
            this.f23054a = true;
            if (this.f23074u == null) {
                this.f23074u = p.a(com.mbridge.msdk.foundation.db.h.a(com.mbridge.msdk.foundation.controller.c.m().c()));
            }
            this.f23074u.a(this.f23066m, j8, this.f23058e);
        }
        CopyOnWriteArrayList<c> copyOnWriteArrayList = this.f23059f;
        if (copyOnWriteArrayList != null) {
            Iterator<c> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                c next = it.next();
                if (next != null) {
                    next.a(j8, i8);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i8, String str, String str2) {
        n nVar = new n(this.f23064k, this.f23062i, i8, Long.toString(this.f23071r != 0 ? System.currentTimeMillis() - this.f23071r : 0L), this.f23065l, this.f23035A);
        nVar.e(this.f23062i.getId());
        nVar.m(this.f23062i.getVideoUrlEncode());
        nVar.h(str);
        nVar.f(this.f23062i.getRequestId());
        nVar.s(this.f23062i.getCurrentLocalRid());
        nVar.g(this.f23062i.getRequestIdNotice());
        nVar.c(this.f23063j);
        nVar.t(str2);
        nVar.a(CampaignEx.JSON_KEY_READY_RATE, String.valueOf(this.f23072s));
        nVar.a("url", this.f23062i.getVideoUrlEncode());
        nVar.e(4);
        DownloadRequest downloadRequest = this.f23077x;
        if (downloadRequest != null) {
            nVar.a("scenes", downloadRequest.get("scenes", ""));
            nVar.a("resumed_breakpoint", this.f23077x.get("resumed_breakpoint", ""));
        }
        int i9 = this.f23035A;
        if (i9 == 94 || i9 == 287) {
            return;
        }
        q.a(com.mbridge.msdk.foundation.db.h.a(com.mbridge.msdk.foundation.controller.c.m().c())).a(nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.d.d dVar) {
        if (this.f23049O || campaignEx == null || dVar == null) {
            return;
        }
        this.f23049O = true;
        try {
            dVar.a("resource_type", 4);
            DownloadRequest downloadRequest = this.f23077x;
            if (downloadRequest != null) {
                dVar.a("scenes", downloadRequest.get("scenes", "1"));
                dVar.a("resumed_breakpoint", this.f23077x.get("resumed_breakpoint", "2"));
            } else {
                dVar.a("scenes", "1");
                dVar.a("resumed_breakpoint", "1");
            }
            dVar.a("url", campaignEx.getVideoUrlEncode());
            dVar.a(CampaignEx.JSON_KEY_READY_RATE, Integer.valueOf(this.f23072s));
            com.mbridge.msdk.foundation.same.report.d.c.a().a("m_download_start", campaignEx, dVar);
        } catch (Exception e8) {
            ad.b("CampaignDownLoadTask", e8.getMessage());
        }
    }

    static /* synthetic */ void a(a aVar, int i8, boolean z8) {
        if (aVar.f23050P) {
            return;
        }
        try {
            aVar.f23050P = true;
            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
            DownloadRequest downloadRequest = aVar.f23077x;
            if (downloadRequest != null) {
                dVar.a("scenes", downloadRequest.get("scenes", ""));
                dVar.a("url", aVar.f23066m);
                dVar.a("resumed_breakpoint", aVar.f23077x.get("resumed_breakpoint", ""));
                dVar.a("h3c", "");
            }
            dVar.a("resource_type", 4);
            dVar.a("file_size", Long.valueOf(aVar.f23065l));
            dVar.a(CampaignEx.JSON_KEY_READY_RATE, Integer.valueOf(aVar.f23072s));
            dVar.a("result", Integer.valueOf(i8));
            com.mbridge.msdk.foundation.same.report.d.c.a().a("m_download_end", aVar.f23062i, dVar);
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
    }
}
