package com.mbridge.msdk.newreward.function.d.c;

import android.text.TextUtils;
import androidx.work.WorkRequest;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.DownloadProgress;
import com.mbridge.msdk.foundation.download.DownloadResourceType;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.download.OnProgressStateListener;
import com.mbridge.msdk.foundation.download.core.DownloadRequest;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.newreward.a.c.a;
import com.mbridge.msdk.newreward.function.common.MBridgeError;
import java.io.File;
import java.util.UUID;

/* loaded from: classes4.dex */
public final class y extends q implements OnDownloadStateListener<com.mbridge.msdk.newreward.function.d.a.b>, OnProgressStateListener<com.mbridge.msdk.newreward.function.d.a.b>, a.InterfaceC0413a {

    /* renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.newreward.function.d.a.b f21134a;

    /* renamed from: b, reason: collision with root package name */
    private final com.mbridge.msdk.newreward.function.d.a.a f21135b;

    /* renamed from: c, reason: collision with root package name */
    private final n f21136c;

    /* renamed from: d, reason: collision with root package name */
    private final String f21137d;

    /* renamed from: e, reason: collision with root package name */
    private final String f21138e;

    /* renamed from: f, reason: collision with root package name */
    private final String f21139f;

    /* renamed from: g, reason: collision with root package name */
    private DownloadMessage f21140g;

    /* renamed from: i, reason: collision with root package name */
    private int f21142i;

    /* renamed from: j, reason: collision with root package name */
    private DownloadRequest f21143j;

    /* renamed from: k, reason: collision with root package name */
    private String f21144k;

    /* renamed from: l, reason: collision with root package name */
    private x f21145l;

    /* renamed from: m, reason: collision with root package name */
    private String f21146m;

    /* renamed from: o, reason: collision with root package name */
    private boolean f21148o;

    /* renamed from: h, reason: collision with root package name */
    private boolean f21141h = false;

    /* renamed from: n, reason: collision with root package name */
    private volatile boolean f21147n = false;

    public y(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.a.a aVar, n nVar, int i8) {
        this.f21148o = false;
        this.f21134a = bVar;
        this.f21135b = aVar;
        this.f21136c = nVar;
        this.f21142i = i8;
        String j8 = nVar.j();
        this.f21137d = j8;
        String str = com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_VC) + File.separator;
        this.f21138e = str;
        String a8 = com.mbridge.msdk.newreward.function.h.a.a(j8);
        this.f21139f = a8;
        this.f21146m = str + a8;
        nVar.a(new File(this.f21146m));
        nVar.a(true);
        File file = new File(this.f21146m);
        if (file.exists() && file.isFile()) {
            this.f21148o = true;
            nVar.a(1);
            nVar.b(true);
            nVar.a(false);
        }
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.p
    public final void a(int i8, x xVar) {
        int i9;
        this.f21145l = xVar;
        if (TextUtils.isEmpty(this.f21137d)) {
            if (this.f21136c.c()) {
                x xVar2 = this.f21145l;
                if (xVar2 != null) {
                    xVar2.a(this.f21134a, this.f21135b, this);
                    this.f21145l.b(this.f21134a, this.f21135b, this);
                    return;
                }
                return;
            }
            x xVar3 = this.f21145l;
            if (xVar3 != null) {
                xVar3.a(this.f21134a, this.f21135b, this);
                this.f21145l.a(this.f21134a, this.f21135b, this, new MBridgeError(5, MBridgeError.ERROR_MESSAGE_DOWNLOAD_RESOURCE_URL_ERROR));
                return;
            }
            return;
        }
        if (this.f21148o) {
            x xVar4 = this.f21145l;
            if (xVar4 != null) {
                xVar4.a(this.f21134a, this.f21135b, this);
                this.f21145l.b(this.f21134a, this.f21135b, this);
                return;
            }
            return;
        }
        this.f21147n = false;
        int v8 = this.f21134a.v();
        this.f21144k = UUID.randomUUID().toString();
        int videoCtnType = this.f21135b.g().getVideoCtnType();
        if (i8 == 1 || (i9 = this.f21142i) == 100) {
            this.f21141h = false;
            this.f21140g = new DownloadMessage(this.f21134a, this.f21137d, this.f21139f, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_VIDEO);
        } else if (videoCtnType == 1) {
            this.f21141h = false;
            this.f21140g = new DownloadMessage(this.f21134a, this.f21137d, this.f21139f, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_VIDEO);
        } else {
            this.f21141h = true;
            this.f21140g = new DownloadMessage(this.f21134a, this.f21137d, this.f21139f, i9, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_VIDEO);
        }
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f21144k, v8, this);
        DownloadRequest build = MBDownloadManager.getInstance().download(this.f21140g).withReadTimeout(WorkRequest.MIN_BACKOFF_MILLIS).withConnectTimeout(WorkRequest.MIN_BACKOFF_MILLIS).withWriteTimeout(WorkRequest.MIN_BACKOFF_MILLIS).withDownloadPriority(DownloadPriority.HIGH).withHttpRetryCounter(5).withDirectoryPathInternal(this.f21138e).withDownloadStateListener(this).withProgressStateListener(this).with("do_us_fi_re", Boolean.toString(true)).build();
        this.f21143j = build;
        build.start();
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public final void onCancelDownload(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage) {
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeDownloader", "onCancelDownload taskID: " + this.f21144k);
        }
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f21144k);
        if (this.f21147n) {
            x xVar = this.f21145l;
            if (xVar != null) {
                xVar.b(this.f21134a, this.f21135b, this, new MBridgeError(4, MBridgeError.ERROR_MESSAGE_DOWNLOAD_DOWNLOAD_TIMEOUT));
                return;
            }
            return;
        }
        x xVar2 = this.f21145l;
        if (xVar2 != null) {
            xVar2.a(this.f21134a, this.f21135b, this, new MBridgeError(2, MBridgeError.ERROR_MESSAGE_DOWNLOAD_NETWORK_ERROR));
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public final void onDownloadComplete(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage) {
        int i8;
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeDownloader", "onDownloadComplete taskID: " + this.f21144k);
        }
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f21144k);
        String str = this.f21143j.get("cache", "2");
        n nVar = this.f21136c;
        int i9 = 2;
        if (TextUtils.equals(str, "2")) {
            i8 = 2;
        } else {
            i8 = 1;
        }
        nVar.a(i8);
        this.f21136c.b(true);
        this.f21136c.a(false);
        n nVar2 = this.f21136c;
        if (!TextUtils.equals(this.f21143j.get("cache", "2"), "2")) {
            i9 = 1;
        }
        nVar2.a(i9);
        x xVar = this.f21145l;
        if (xVar != null) {
            xVar.b(this.f21134a, this.f21135b, this);
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public final void onDownloadError(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage, DownloadError downloadError) {
        int i8;
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeDownloader", "onDownloadError taskID: " + this.f21144k);
        }
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f21144k);
        String str = this.f21143j.get("cache", "2");
        n nVar = this.f21136c;
        if (TextUtils.equals(str, "2")) {
            i8 = 2;
        } else {
            i8 = 1;
        }
        nVar.a(i8);
        this.f21136c.b(false);
        this.f21136c.a(false);
        MBridgeError mBridgeError = new MBridgeError(2, MBridgeError.ERROR_MESSAGE_DOWNLOAD_VIDEO_ERROR);
        mBridgeError.setException(downloadError.getException());
        x xVar = this.f21145l;
        if (xVar != null) {
            xVar.a(this.f21134a, this.f21135b, this, mBridgeError);
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public final void onDownloadStart(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage) {
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeDownloader", "onDownloadStart taskID: " + this.f21144k);
        }
        x xVar = this.f21145l;
        if (xVar != null) {
            xVar.a(this.f21134a, this.f21135b, this);
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnProgressStateListener
    public final void onProgress(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage, DownloadProgress downloadProgress) {
        int i8;
        if (downloadProgress.getCurrentDownloadRate() >= this.f21142i) {
            String str = this.f21143j.get("cache", "2");
            n nVar = this.f21136c;
            if (TextUtils.equals(str, "2")) {
                i8 = 2;
            } else {
                i8 = 1;
            }
            nVar.a(i8);
            this.f21136c.b(true);
            this.f21136c.a(false);
            if (this.f21141h) {
                this.f21143j.cancel(downloadMessage);
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.a.c.a.InterfaceC0413a
    public final void a(String str, long j8) {
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeDownloader", "onTimeout taskID: " + str);
        }
        if (this.f21143j != null) {
            this.f21147n = true;
            this.f21143j.cancel(this.f21140g);
        }
    }
}
