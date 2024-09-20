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
import com.mbridge.msdk.foundation.download.download.ResourceManager;
import com.mbridge.msdk.foundation.download.resource.MBResourceManager;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ao;
import com.mbridge.msdk.newreward.a.c.a;
import com.mbridge.msdk.newreward.function.common.MBridgeError;
import java.util.UUID;

/* loaded from: classes4.dex */
public final class v extends q implements OnDownloadStateListener<com.mbridge.msdk.newreward.function.d.a.b>, OnProgressStateListener<com.mbridge.msdk.newreward.function.d.a.b>, a.InterfaceC0413a {

    /* renamed from: a, reason: collision with root package name */
    private final String f21118a;

    /* renamed from: b, reason: collision with root package name */
    private final String f21119b;

    /* renamed from: c, reason: collision with root package name */
    private final String f21120c;

    /* renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.d.a.b f21121d;

    /* renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.d.a.a f21122e;

    /* renamed from: f, reason: collision with root package name */
    private c f21123f;

    /* renamed from: g, reason: collision with root package name */
    private String f21124g;

    /* renamed from: h, reason: collision with root package name */
    private DownloadMessage f21125h;

    /* renamed from: i, reason: collision with root package name */
    private DownloadRequest f21126i;

    /* renamed from: j, reason: collision with root package name */
    private String f21127j;

    /* renamed from: k, reason: collision with root package name */
    private x f21128k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f21129l;

    /* renamed from: m, reason: collision with root package name */
    private String f21130m;

    public v(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.a.a aVar, c cVar) {
        this.f21129l = false;
        this.f21121d = bVar;
        this.f21122e = aVar;
        this.f21123f = cVar;
        this.f21124g = cVar.j();
        String a8 = com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_RES);
        String md5 = SameMD5.getMD5(ao.b(this.f21124g));
        this.f21118a = md5;
        this.f21119b = a8 + "/";
        this.f21120c = a8 + "/" + md5;
        this.f21123f.a(true);
        String resDirFromCampaign = ResourceManager.getinstance().getResDirFromCampaign(this.f21124g);
        if (!TextUtils.isEmpty(resDirFromCampaign)) {
            this.f21129l = true;
            this.f21123f.a(1);
            this.f21123f.a(resDirFromCampaign);
            this.f21123f.b(true);
            this.f21123f.a(false);
        }
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.p
    public final void a(int i8, x xVar) {
        this.f21128k = xVar;
        int v8 = this.f21121d.v();
        this.f21127j = UUID.randomUUID().toString();
        if (xVar != null) {
            xVar.a(this.f21121d, this.f21122e, this);
        }
        if (this.f21129l) {
            x xVar2 = this.f21128k;
            if (xVar2 != null) {
                xVar2.b(this.f21121d, this.f21122e, this);
                return;
            }
            return;
        }
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f21127j, v8, this);
        String str = this.f21118a + ".zip";
        this.f21130m = this.f21119b + str;
        this.f21125h = new DownloadMessage(this.f21121d, this.f21124g, str, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_ZIP);
        DownloadRequest build = MBDownloadManager.getInstance().download(this.f21125h).withReadTimeout(WorkRequest.MIN_BACKOFF_MILLIS).withConnectTimeout(WorkRequest.MIN_BACKOFF_MILLIS).withWriteTimeout(WorkRequest.MIN_BACKOFF_MILLIS).withDownloadPriority(DownloadPriority.HIGH).withHttpRetryCounter(5).withDirectoryPathInternal(this.f21119b).withDownloadStateListener(this).withProgressStateListener(this).with("do_us_fi_re", Boolean.toString(true)).build();
        this.f21126i = build;
        build.start();
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public final void onCancelDownload(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage) {
        int i8;
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeDownloader", "onCancelDownload: " + downloadMessage);
        }
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f21127j);
        String str = this.f21126i.get("cache", "2");
        c cVar = this.f21123f;
        if (TextUtils.equals(str, "2")) {
            i8 = 2;
        } else {
            i8 = 1;
        }
        cVar.a(i8);
        this.f21123f.b(false);
        this.f21123f.a(false);
        if (this.f21123f.c()) {
            x xVar = this.f21128k;
            if (xVar != null) {
                xVar.b(this.f21121d, this.f21122e, this);
                return;
            }
            return;
        }
        x xVar2 = this.f21128k;
        if (xVar2 != null) {
            xVar2.a(this.f21121d, this.f21122e, this, new MBridgeError(4, MBridgeError.ERROR_MESSAGE_DOWNLOAD_DOWNLOAD_TIMEOUT));
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public final void onDownloadComplete(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage) {
        x xVar;
        com.mbridge.msdk.newreward.function.d.a.b bVar;
        com.mbridge.msdk.newreward.function.d.a.a aVar;
        MBridgeError mBridgeError;
        x xVar2;
        int i8;
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeDownloader", "onDownloadComplete: " + downloadMessage);
        }
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f21127j);
        try {
            try {
                MBResourceManager.getInstance().unZip(this.f21130m, this.f21120c);
                String resDirFromCampaign = ResourceManager.getinstance().getResDirFromCampaign(this.f21124g);
                if (!TextUtils.isEmpty(resDirFromCampaign)) {
                    String str = this.f21126i.get("cache", "2");
                    c cVar = this.f21123f;
                    if (TextUtils.equals(str, "2")) {
                        i8 = 2;
                    } else {
                        i8 = 1;
                    }
                    cVar.a(i8);
                    this.f21123f.b(true);
                    this.f21123f.a(false);
                    this.f21123f.a(2);
                    this.f21123f.a(resDirFromCampaign);
                }
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    ad.a("MBridgeDownloader", "onDownloadComplete.unZip: " + e8.getMessage());
                }
                if (this.f21123f.c()) {
                    xVar2 = this.f21128k;
                    if (xVar2 == null) {
                        return;
                    }
                } else {
                    xVar = this.f21128k;
                    if (xVar != null) {
                        bVar = this.f21121d;
                        aVar = this.f21122e;
                        mBridgeError = new MBridgeError(6, MBridgeError.ERROR_MESSAGE_DOWNLOAD_UN_ZIP_ERROR);
                    } else {
                        return;
                    }
                }
            }
            if (this.f21123f.c()) {
                xVar2 = this.f21128k;
                if (xVar2 == null) {
                    return;
                }
                xVar2.b(this.f21121d, this.f21122e, this);
                return;
            }
            xVar = this.f21128k;
            if (xVar != null) {
                bVar = this.f21121d;
                aVar = this.f21122e;
                mBridgeError = new MBridgeError(6, MBridgeError.ERROR_MESSAGE_DOWNLOAD_UN_ZIP_ERROR);
                xVar.a(bVar, aVar, this, mBridgeError);
            }
        } catch (Throwable th) {
            if (this.f21123f.c()) {
                x xVar3 = this.f21128k;
                if (xVar3 != null) {
                    xVar3.b(this.f21121d, this.f21122e, this);
                }
            } else {
                x xVar4 = this.f21128k;
                if (xVar4 != null) {
                    xVar4.a(this.f21121d, this.f21122e, this, new MBridgeError(6, MBridgeError.ERROR_MESSAGE_DOWNLOAD_UN_ZIP_ERROR));
                }
            }
            throw th;
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public final void onDownloadError(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage, DownloadError downloadError) {
        int i8;
        String str;
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f21127j);
        String str2 = this.f21126i.get("cache", "2");
        c cVar = this.f21123f;
        if (TextUtils.equals(str2, "2")) {
            i8 = 2;
        } else {
            i8 = 1;
        }
        cVar.a(i8);
        this.f21123f.b(false);
        this.f21123f.a(false);
        if (this.f21123f.c()) {
            x xVar = this.f21128k;
            if (xVar != null) {
                xVar.b(this.f21121d, this.f21122e, this);
                return;
            }
            return;
        }
        if (this.f21128k != null) {
            c cVar2 = this.f21123f;
            if (cVar2 != null) {
                int h8 = cVar2.h();
                if (h8 != 2) {
                    if (h8 != 3) {
                        if (h8 == 4) {
                            str = MBridgeError.ERROR_MESSAGE_DOWNLOAD_EC_TEMPLATE_ERROR;
                        }
                    } else {
                        str = MBridgeError.ERROR_MESSAGE_DOWNLOAD_BIG_TEMPLATE_ERROR;
                    }
                } else {
                    str = MBridgeError.ERROR_MESSAGE_DOWNLOAD_VIDEO_TEMPLATE_ERROR;
                }
                MBridgeError mBridgeError = new MBridgeError(2, str);
                mBridgeError.setException(downloadError.getException());
                this.f21128k.a(this.f21121d, this.f21122e, this, mBridgeError);
            }
            str = MBridgeError.ERROR_MESSAGE_DOWNLOAD_NETWORK_ERROR;
            MBridgeError mBridgeError2 = new MBridgeError(2, str);
            mBridgeError2.setException(downloadError.getException());
            this.f21128k.a(this.f21121d, this.f21122e, this, mBridgeError2);
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public final void onDownloadStart(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage) {
    }

    @Override // com.mbridge.msdk.foundation.download.OnProgressStateListener
    public final void onProgress(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage, DownloadProgress downloadProgress) {
    }

    @Override // com.mbridge.msdk.newreward.a.c.a.InterfaceC0413a
    public final void a(String str, long j8) {
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeDownloader", "onTimeout: " + str);
        }
        DownloadRequest downloadRequest = this.f21126i;
        if (downloadRequest != null) {
            downloadRequest.cancel(this.f21125h);
        }
    }
}
