package com.mbridge.msdk.mbbanner.common.b;

import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes4.dex */
public class e implements H5DownLoadManager.IH5SourceDownloadListener {

    /* renamed from: a, reason: collision with root package name */
    private static final String f20302a = "e";

    /* renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.c.b f20303b;

    /* renamed from: c, reason: collision with root package name */
    private String f20304c;

    /* renamed from: d, reason: collision with root package name */
    private CampaignEx f20305d;

    public e(com.mbridge.msdk.mbbanner.common.c.b bVar, String str, CampaignEx campaignEx) {
        this.f20303b = bVar;
        this.f20304c = str;
        this.f20305d = campaignEx;
    }

    @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
    public void onFailed(String str, String str2) {
        ad.c(f20302a, "DownloadBannerUrlListener HTML FAIL:" + str);
        com.mbridge.msdk.mbbanner.common.c.b bVar = this.f20303b;
        if (bVar != null) {
            bVar.a(this.f20304c, 3, str, false, this.f20305d);
        }
    }

    @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
    public void onSuccess(String str, String str2, boolean z8) {
        ad.c(f20302a, "DownloadBannerUrlListener HTML SUCCESS:" + str);
        com.mbridge.msdk.mbbanner.common.c.b bVar = this.f20303b;
        if (bVar != null) {
            bVar.a(this.f20304c, 3, str, true, this.f20305d);
        }
    }
}
