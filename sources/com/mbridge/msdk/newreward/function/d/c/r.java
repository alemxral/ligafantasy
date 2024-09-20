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
import com.mbridge.msdk.foundation.download.resource.MBResourceManager;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.newreward.a.c.a;
import com.mbridge.msdk.newreward.function.common.MBridgeError;
import java.io.File;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
abstract class r extends q implements OnDownloadStateListener<com.mbridge.msdk.newreward.function.d.a.b>, OnProgressStateListener<com.mbridge.msdk.newreward.function.d.a.b>, a.InterfaceC0413a {

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.d.a.b f21106a;

    /* renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.d.a.a f21107b;

    /* renamed from: c, reason: collision with root package name */
    private b f21108c;

    /* renamed from: d, reason: collision with root package name */
    private String f21109d;

    /* renamed from: e, reason: collision with root package name */
    private String f21110e;

    /* renamed from: f, reason: collision with root package name */
    private DownloadMessage f21111f;

    /* renamed from: g, reason: collision with root package name */
    private DownloadRequest f21112g;

    /* renamed from: h, reason: collision with root package name */
    private String f21113h;

    /* renamed from: i, reason: collision with root package name */
    private String f21114i;

    /* renamed from: j, reason: collision with root package name */
    private x f21115j;

    /* renamed from: k, reason: collision with root package name */
    private String f21116k = com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_XML) + File.separator;

    /* renamed from: l, reason: collision with root package name */
    private boolean f21117l;

    /* JADX INFO: Access modifiers changed from: protected */
    public r(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.a.a aVar, b bVar2) {
        this.f21117l = false;
        this.f21106a = bVar;
        this.f21107b = aVar;
        this.f21108c = bVar2;
        this.f21109d = bVar2.j();
        String a8 = com.mbridge.msdk.newreward.function.h.a.a(this.f21109d);
        this.f21110e = a8;
        this.f21114i = this.f21116k + a8.replace(".zip", "").replace(".xml", "");
        this.f21108c.a(true);
        File a9 = a(this.f21114i);
        if (a9 != null && a9.exists()) {
            this.f21117l = true;
            this.f21108c.a(1);
            this.f21108c.a(a9);
            this.f21108c.b(true);
            this.f21108c.a(false);
        }
    }

    protected abstract String a();

    @Override // com.mbridge.msdk.newreward.function.d.c.p
    public void a(int i8, x xVar) {
        this.f21115j = xVar;
        if (xVar != null) {
            xVar.a(this.f21106a, this.f21107b, this);
        }
        if (this.f21117l) {
            if (xVar != null) {
                xVar.b(this.f21106a, this.f21107b, this);
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(this.f21109d)) {
            if (this.f21108c.c()) {
                if (xVar != null) {
                    xVar.b(this.f21106a, this.f21107b, this);
                    return;
                }
                return;
            } else {
                if (xVar != null) {
                    xVar.a(this.f21106a, this.f21107b, this, new MBridgeError(5, MBridgeError.ERROR_MESSAGE_DOWNLOAD_RESOURCE_URL_ERROR));
                    return;
                }
                return;
            }
        }
        int v8 = this.f21106a.v();
        this.f21113h = UUID.randomUUID().toString();
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f21113h, v8, this);
        this.f21111f = new DownloadMessage(this.f21106a, this.f21109d, this.f21110e, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_ZIP);
        DownloadRequest build = MBDownloadManager.getInstance().download(this.f21111f).withReadTimeout(WorkRequest.MIN_BACKOFF_MILLIS).withConnectTimeout(WorkRequest.MIN_BACKOFF_MILLIS).withWriteTimeout(WorkRequest.MIN_BACKOFF_MILLIS).withDownloadPriority(DownloadPriority.HIGH).withHttpRetryCounter(5).withDirectoryPathInternal(this.f21116k).withDownloadStateListener(this).withProgressStateListener(this).with("do_us_fi_re", Boolean.toString(true)).build();
        this.f21112g = build;
        build.start();
    }

    public com.mbridge.msdk.newreward.function.d.a.a b() {
        return this.f21107b;
    }

    public com.mbridge.msdk.newreward.function.d.a.b c() {
        return this.f21106a;
    }

    public a<?> d() {
        return this.f21108c;
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public void onCancelDownload(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage) {
        int i8;
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeDownloader", "onCancelDownload:  " + d().j());
        }
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f21113h);
        String str = this.f21112g.get("cache", "2");
        b bVar = this.f21108c;
        if (TextUtils.equals(str, "2")) {
            i8 = 2;
        } else {
            i8 = 1;
        }
        bVar.a(i8);
        this.f21108c.b(false);
        this.f21108c.a(false);
        if (this.f21108c.c()) {
            x xVar = this.f21115j;
            if (xVar != null) {
                xVar.b(this.f21106a, this.f21107b, this);
                return;
            }
            return;
        }
        x xVar2 = this.f21115j;
        if (xVar2 != null) {
            xVar2.a(this.f21106a, this.f21107b, this, new MBridgeError(4, MBridgeError.ERROR_MESSAGE_DOWNLOAD_DOWNLOAD_TIMEOUT));
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public void onDownloadComplete(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage) {
        x xVar;
        com.mbridge.msdk.newreward.function.d.a.b bVar;
        com.mbridge.msdk.newreward.function.d.a.a aVar;
        MBridgeError mBridgeError;
        x xVar2;
        int i8;
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeDownloader", "onDownloadComplete:  " + d().j() + " " + downloadMessage.getSaveFilePath());
        }
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f21113h);
        try {
            try {
                MBResourceManager.getInstance().unZip(downloadMessage.getSaveFilePath(), this.f21116k);
                String str = this.f21112g.get("cache", "2");
                b bVar2 = this.f21108c;
                if (TextUtils.equals(str, "2")) {
                    i8 = 2;
                } else {
                    i8 = 1;
                }
                bVar2.a(i8);
                this.f21108c.b(true);
                this.f21108c.a(false);
                this.f21108c.a(a(this.f21114i));
                this.f21108c.a(2);
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    ad.a("MBridgeDownloader", "onDownloadComplete.unZip: " + e8.getMessage());
                }
                if (this.f21108c.c()) {
                    xVar2 = this.f21115j;
                    if (xVar2 == null) {
                        return;
                    }
                } else {
                    xVar = this.f21115j;
                    if (xVar != null) {
                        bVar = this.f21106a;
                        aVar = this.f21107b;
                        mBridgeError = new MBridgeError(6, MBridgeError.ERROR_MESSAGE_DOWNLOAD_UN_ZIP_ERROR);
                    } else {
                        return;
                    }
                }
            }
            if (this.f21108c.c()) {
                xVar2 = this.f21115j;
                if (xVar2 == null) {
                    return;
                }
                xVar2.b(this.f21106a, this.f21107b, this);
                return;
            }
            xVar = this.f21115j;
            if (xVar != null) {
                bVar = this.f21106a;
                aVar = this.f21107b;
                mBridgeError = new MBridgeError(6, MBridgeError.ERROR_MESSAGE_DOWNLOAD_UN_ZIP_ERROR);
                xVar.a(bVar, aVar, this, mBridgeError);
            }
        } catch (Throwable th) {
            if (this.f21108c.c()) {
                x xVar3 = this.f21115j;
                if (xVar3 != null) {
                    xVar3.b(this.f21106a, this.f21107b, this);
                }
            } else {
                x xVar4 = this.f21115j;
                if (xVar4 != null) {
                    xVar4.a(this.f21106a, this.f21107b, this, new MBridgeError(6, MBridgeError.ERROR_MESSAGE_DOWNLOAD_UN_ZIP_ERROR));
                }
            }
            throw th;
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public void onDownloadError(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage, DownloadError downloadError) {
        int i8;
        String str;
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f21113h);
        String str2 = this.f21112g.get("cache", "2");
        b bVar = this.f21108c;
        if (TextUtils.equals(str2, "2")) {
            i8 = 2;
        } else {
            i8 = 1;
        }
        bVar.a(i8);
        this.f21108c.b(false);
        this.f21108c.a(false);
        if (this.f21115j != null) {
            b bVar2 = this.f21108c;
            if (bVar2 != null) {
                int h8 = bVar2.h();
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
                this.f21115j.a(this.f21106a, this.f21107b, this, mBridgeError);
            }
            str = MBridgeError.ERROR_MESSAGE_DOWNLOAD_NETWORK_ERROR;
            MBridgeError mBridgeError2 = new MBridgeError(2, str);
            mBridgeError2.setException(downloadError.getException());
            this.f21115j.a(this.f21106a, this.f21107b, this, mBridgeError2);
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public void onDownloadStart(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage) {
    }

    @Override // com.mbridge.msdk.foundation.download.OnProgressStateListener
    public void onProgress(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage, DownloadProgress downloadProgress) {
    }

    private File b(String str) {
        JSONArray jSONArray;
        String a8 = com.mbridge.msdk.newreward.function.h.a.a(new File(str + File.separator + "template_config.json"));
        if (TextUtils.isEmpty(a8)) {
            return null;
        }
        try {
            jSONArray = new JSONArray(a8);
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.a("MBridgeDownloader", "findTemplateFile: " + e8.getMessage());
            }
        }
        if (jSONArray.length() == 0) {
            return null;
        }
        for (int i8 = 0; i8 < jSONArray.length(); i8++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i8);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("xml_type", "");
                if (!TextUtils.isEmpty(optString) && TextUtils.equals(optString, a())) {
                    File file = new File(str + File.separator + optJSONObject.optString("name", ""));
                    if (file.exists()) {
                        return file;
                    }
                }
            }
        }
        return null;
    }

    @Override // com.mbridge.msdk.newreward.a.c.a.InterfaceC0413a
    public void a(String str, long j8) {
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeDownloader", "onTimeout: " + str + " " + d().j());
        }
        DownloadRequest downloadRequest = this.f21112g;
        if (downloadRequest != null) {
            downloadRequest.cancel(this.f21111f);
        }
    }

    private File a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str + ".xml");
        return (file.isFile() && file.exists()) ? file : b(str);
    }
}
