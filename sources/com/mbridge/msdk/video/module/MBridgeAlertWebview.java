package com.mbridge.msdk.video.module;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.g.a;
import com.mbridge.msdk.foundation.same.report.k;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.mbsignalcommon.windvane.g;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.video.signal.factory.b;
import com.mbridge.msdk.videocommon.download.d;
import com.mbridge.msdk.videocommon.download.e;

/* loaded from: classes4.dex */
public class MBridgeAlertWebview extends MBridgeH5EndCardView {

    /* renamed from: x, reason: collision with root package name */
    private String f22239x;

    public MBridgeAlertWebview(Context context) {
        super(context);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView
    protected final RelativeLayout.LayoutParams b() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        return layoutParams;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView
    public void preLoadData(b bVar) {
        String a8 = a();
        if (this.f22246f && this.f22242b != null && !TextUtils.isEmpty(a8)) {
            a aVar = new a(this.f22242b);
            aVar.a(this.f22242b.getAppName());
            this.f22330q.setDownloadListener(aVar);
            this.f22330q.setCampaignId(this.f22242b.getId());
            setCloseVisible(8);
            this.f22330q.setApiManagerJSFactory(bVar);
            this.f22330q.setWebViewListener(new com.mbridge.msdk.mbsignalcommon.b.b() { // from class: com.mbridge.msdk.video.module.MBridgeAlertWebview.1
                @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
                public final void a(WebView webView, String str) {
                    super.a(webView, str);
                    ad.b("MBridgeAlertWebview", "finish+" + str);
                    g.a().a(webView);
                }

                @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
                public final void a(WebView webView, int i8, String str, String str2) {
                    super.a(webView, i8, str, str2);
                    ad.b("MBridgeAlertWebview", "onReceivedError");
                    if (MBridgeAlertWebview.this.f22334u) {
                        return;
                    }
                    ad.a(MBridgeBaseView.TAG, "onReceivedError,url:" + str2);
                    MBridgeAlertWebview mBridgeAlertWebview = MBridgeAlertWebview.this;
                    k.a(mBridgeAlertWebview.f22241a, mBridgeAlertWebview.f22242b, mBridgeAlertWebview.f22239x, MBridgeAlertWebview.this.unitId, 2, str, 1);
                    MBridgeAlertWebview.this.f22334u = true;
                }

                @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
                public final void a(WebView webView, int i8) {
                    String str;
                    super.a(webView, i8);
                    ad.b("MBridgeAlertWebview", "readyState  :  " + i8);
                    MBridgeAlertWebview mBridgeAlertWebview = MBridgeAlertWebview.this;
                    if (mBridgeAlertWebview.f22334u) {
                        return;
                    }
                    boolean z8 = i8 == 1;
                    mBridgeAlertWebview.f22333t = z8;
                    if (z8) {
                        str = "readyState state is " + i8;
                    } else {
                        str = "";
                    }
                    String str2 = str;
                    MBridgeAlertWebview mBridgeAlertWebview2 = MBridgeAlertWebview.this;
                    k.a(mBridgeAlertWebview2.f22241a, mBridgeAlertWebview2.f22242b, mBridgeAlertWebview2.f22239x, MBridgeAlertWebview.this.unitId, i8, str2, 1);
                }
            });
            setHtmlSource(e.a().b(a8));
            this.f22333t = false;
            if (TextUtils.isEmpty(this.f22332s)) {
                ad.a(MBridgeBaseView.TAG, "load url:" + a8);
                this.f22330q.loadUrl(a8);
            } else {
                ad.a(MBridgeBaseView.TAG, "load html...");
                this.f22330q.loadDataWithBaseURL(a8, this.f22332s, "text/html", C.UTF8_NAME, null);
            }
            this.f22330q.setBackgroundColor(0);
            setBackgroundColor(0);
            return;
        }
        this.f22245e.a(101, "");
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView
    public void webviewshow() {
        RelativeLayout relativeLayout = this.f22328o;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundColor(0);
        }
        super.webviewshow();
        k.a(this.f22241a, this.f22242b, this.f22239x, this.unitId, 2, 1);
    }

    public MBridgeAlertWebview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView
    public final String a() {
        if (!TextUtils.isEmpty(this.unitId)) {
            com.mbridge.msdk.videocommon.d.b.a().a(c.m().k(), this.unitId, false);
            String str = com.mbridge.msdk.videocommon.d.c.f22986a;
            this.f22239x = str;
            if (!TextUtils.isEmpty(str)) {
                return d.a().a(this.f22239x);
            }
            return "";
        }
        return "";
    }
}
