package com.mbridge.msdk.mbbanner.common.c;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.c.k;
import com.mbridge.msdk.foundation.download.download.HTMLResourceManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.e;
import com.mbridge.msdk.foundation.same.report.i;
import com.mbridge.msdk.foundation.tools.ab;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.mbbanner.common.b.f;
import com.mbridge.msdk.mbbanner.common.util.BannerUtils;
import com.mbridge.msdk.mbbanner.view.MBBannerWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.g;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.widget.MBAdChoice;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import x1.AbstractC3859b;
import y1.AbstractC3969b;
import y1.C3968a;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: A, reason: collision with root package name */
    private float f20354A;

    /* renamed from: B, reason: collision with root package name */
    private float f20355B;

    /* renamed from: a, reason: collision with root package name */
    protected com.mbridge.msdk.mbbanner.common.b.c f20359a;

    /* renamed from: b, reason: collision with root package name */
    protected CampaignEx f20360b;

    /* renamed from: c, reason: collision with root package name */
    protected final MBBannerView f20361c;

    /* renamed from: d, reason: collision with root package name */
    protected boolean f20362d;

    /* renamed from: e, reason: collision with root package name */
    protected final String f20363e;

    /* renamed from: f, reason: collision with root package name */
    com.mbridge.msdk.click.a f20364f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f20365g;

    /* renamed from: h, reason: collision with root package name */
    private ImageView f20366h;

    /* renamed from: i, reason: collision with root package name */
    private MBBannerWebView f20367i;

    /* renamed from: j, reason: collision with root package name */
    private ImageView f20368j;

    /* renamed from: k, reason: collision with root package name */
    private ImageView f20369k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f20370l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f20371m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f20372n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f20373o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f20374p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f20375q;

    /* renamed from: r, reason: collision with root package name */
    private final String f20376r;

    /* renamed from: s, reason: collision with root package name */
    private List<CampaignEx> f20377s;

    /* renamed from: u, reason: collision with root package name */
    private int f20379u;

    /* renamed from: w, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.communication.a f20381w;

    /* renamed from: x, reason: collision with root package name */
    private AbstractC3969b f20382x;

    /* renamed from: t, reason: collision with root package name */
    private int f20378t = 1;

    /* renamed from: v, reason: collision with root package name */
    private final long f20380v = 15000;

    /* renamed from: y, reason: collision with root package name */
    private final Handler f20383y = new Handler(Looper.getMainLooper()) { // from class: com.mbridge.msdk.mbbanner.common.c.d.1
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1) {
                try {
                    if (d.this.f20382x != null) {
                        C3968a.a(d.this.f20382x).b();
                        d.this.f20382x.c();
                        d.this.f20382x = null;
                    }
                } catch (Throwable th) {
                    ad.a("BannerShowManager", th.getMessage());
                }
            }
        }
    };

    /* renamed from: z, reason: collision with root package name */
    private final com.mbridge.msdk.foundation.same.e.a f20384z = new com.mbridge.msdk.foundation.same.e.a() { // from class: com.mbridge.msdk.mbbanner.common.c.d.6
        @Override // com.mbridge.msdk.foundation.same.e.a
        public final void cancelTask() {
        }

        @Override // com.mbridge.msdk.foundation.same.e.a
        public final void pauseTask(boolean z8) {
        }

        @Override // com.mbridge.msdk.foundation.same.e.a
        public final void runTask() {
            d.this.a("banner render failed because render is timeout");
        }
    };

    /* renamed from: C, reason: collision with root package name */
    private final View.OnClickListener f20356C = new View.OnClickListener() { // from class: com.mbridge.msdk.mbbanner.common.c.d.7
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            d dVar = d.this;
            if (dVar.f20362d) {
                d.b(dVar);
            }
        }
    };

    /* renamed from: D, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.b.a f20357D = new com.mbridge.msdk.mbbanner.common.b.a() { // from class: com.mbridge.msdk.mbbanner.common.c.d.8
        @Override // com.mbridge.msdk.mbbanner.common.b.a
        public final void a(int i8) {
            if (i8 == 2) {
                d.c(d.this);
            } else {
                d.this.f();
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.a
        public final void b(int i8) {
            if (i8 == 1) {
                d.this.d();
                d.this.a("", 1);
            } else {
                d.this.c();
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.a
        public final void a(String str) {
            d.b(d.this);
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.a
        public final void a() {
            d.b(d.this);
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.a
        public final void a(CampaignEx campaignEx) {
            d.this.a(campaignEx, false, "");
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.a
        public final void a(boolean z8) {
            d dVar = d.this;
            if (dVar.f20359a != null) {
                dVar.f20375q = z8;
                if (z8) {
                    d.this.f20359a.c();
                } else {
                    d.this.f20359a.d();
                }
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.a
        public final void a(boolean z8, String str) {
            try {
                if (d.this.f20359a != null) {
                    if (TextUtils.isEmpty(str)) {
                        d.this.f20359a.a();
                        d.this.f20359a.b();
                    } else {
                        CampaignEx parseCampaignWithBackData = CampaignEx.parseCampaignWithBackData(CampaignEx.campaignToJsonObject(d.this.f20360b));
                        parseCampaignWithBackData.setClickURL(str);
                        d.this.a(parseCampaignWithBackData, z8, str);
                    }
                }
            } catch (Exception e8) {
                ad.b("BannerShowManager", e8.getMessage());
            }
        }
    };

    /* renamed from: E, reason: collision with root package name */
    private com.mbridge.msdk.mbsignalcommon.b.b f20358E = new com.mbridge.msdk.mbsignalcommon.b.b() { // from class: com.mbridge.msdk.mbbanner.common.c.d.4
        @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView, String str) {
            d.this.f20372n = true;
            ad.b("BannerCallJS", "fireOnJSBridgeConnected");
            g.a().a(webView);
            d.this.f20374p = true;
            CampaignEx campaignEx = d.this.f20360b;
            if (campaignEx == null || campaignEx.isHasMBTplMark()) {
                return;
            }
            d.this.d();
            d.this.a("", 1);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView, int i8, String str, String str2) {
            d.this.a(str);
            d.this.a(str, 2);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView) {
            d.this.c();
        }
    };

    public d(MBBannerView mBBannerView, com.mbridge.msdk.mbbanner.common.b.c cVar, String str, String str2, boolean z8, k kVar) {
        this.f20365g = z8;
        this.f20361c = mBBannerView;
        this.f20363e = str2;
        this.f20376r = str;
        this.f20359a = new f(cVar, kVar);
    }

    static /* synthetic */ void l(d dVar) {
        if (dVar.f20366h != null) {
            MBBannerWebView mBBannerWebView = dVar.f20367i;
            if (mBBannerWebView != null) {
                mBBannerWebView.setVisibility(8);
            }
            if (dVar.f20366h.getVisibility() != 0) {
                dVar.f20366h.setVisibility(0);
            }
            if (dVar.f20361c != null) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(10);
                dVar.f20366h.setScaleType(ImageView.ScaleType.FIT_XY);
                if (dVar.f20366h.getParent() == null) {
                    dVar.f20361c.addView(dVar.f20366h, layoutParams);
                }
                dVar.d(true);
            }
        }
    }

    public void a(CampaignEx campaignEx, boolean z8, String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (this.f20361c != null) {
            MBBannerWebView mBBannerWebView = this.f20367i;
            if (mBBannerWebView != null && mBBannerWebView.getParent() != null) {
                this.f20361c.removeView(this.f20367i);
            }
            if (this.f20366h == null) {
                ImageView imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.m().c());
                this.f20366h = imageView;
                imageView.setOnTouchListener(new View.OnTouchListener() { // from class: com.mbridge.msdk.mbbanner.common.c.d.10
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        d.this.f20354A = motionEvent.getRawX();
                        d.this.f20355B = motionEvent.getRawY();
                        ad.b("BannerShowManager", d.this.f20354A + "  " + d.this.f20355B);
                        return false;
                    }
                });
                this.f20366h.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.mbbanner.common.c.d.11
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        d.this.a(BannerUtils.managerCampaignEX(com.mbridge.msdk.mbsignalcommon.communication.d.a(d.this.f20354A, d.this.f20355B), d.this.f20360b), false, "");
                    }
                });
            }
            String imageUrl = this.f20360b.getImageUrl();
            if (!TextUtils.isEmpty(imageUrl)) {
                com.mbridge.msdk.foundation.same.c.b.a(com.mbridge.msdk.foundation.controller.c.m().c()).a(imageUrl, new com.mbridge.msdk.foundation.same.c.c() { // from class: com.mbridge.msdk.mbbanner.common.c.d.12
                    @Override // com.mbridge.msdk.foundation.same.c.c
                    public final void onFailedLoad(String str, String str2) {
                        d.this.a("banner show failed because banner default view is exception");
                    }

                    @Override // com.mbridge.msdk.foundation.same.c.c
                    public final void onSuccessLoad(Bitmap bitmap, String str) {
                        if (d.this.f20366h != null) {
                            d.this.f20366h.setImageBitmap(bitmap);
                        }
                        d.this.f20372n = true;
                        d.l(d.this);
                        d.this.f();
                        d.this.g();
                        d dVar = d.this;
                        if (!dVar.f20362d) {
                            dVar.d();
                        }
                    }
                });
                return;
            } else {
                a("banner show failed because campain is exception");
                return;
            }
        }
        a("banner show failed because banner view is exception");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0235  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d() {
        /*
            Method dump skipped, instructions count: 1081
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbbanner.common.c.d.d():void");
    }

    private synchronized boolean e() {
        boolean isReport;
        isReport = this.f20360b.isReport();
        if (!isReport) {
            this.f20360b.setReport(true);
        }
        return isReport;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        ImageView imageView;
        if (!this.f20365g || (imageView = this.f20368j) == null) {
            return;
        }
        if (imageView.getVisibility() != 0) {
            this.f20368j.setVisibility(0);
            this.f20368j.setOnClickListener(this.f20356C);
        }
        if (this.f20368j.getParent() != null || this.f20361c == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 12.0f), ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 12.0f));
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        this.f20361c.addView(this.f20368j, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f20361c == null) {
            return;
        }
        CampaignEx campaignEx = this.f20360b;
        if (campaignEx == null || campaignEx.getPrivacyButtonTemplateVisibility() == 1) {
            MBAdChoice mBAdChoice = new MBAdChoice(com.mbridge.msdk.foundation.controller.c.m().c());
            mBAdChoice.setCampaign(this.f20360b);
            mBAdChoice.setFeedbackDialogEventListener(new com.mbridge.msdk.foundation.d.a() { // from class: com.mbridge.msdk.mbbanner.common.c.d.2
                @Override // com.mbridge.msdk.foundation.d.a
                public final void a() {
                    String str;
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                            jSONObject.put(NotificationCompat.CATEGORY_STATUS, 1);
                        }
                        str = jSONObject.toString();
                    } catch (Throwable th) {
                        ad.a("BannerShowManager", th.getMessage(), th);
                        str = "";
                    }
                    g.a().a((WebView) d.this.f20367i, "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
                }

                @Override // com.mbridge.msdk.foundation.d.a
                public final void b() {
                    String str;
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                            jSONObject.put(NotificationCompat.CATEGORY_STATUS, 2);
                        }
                        str = jSONObject.toString();
                    } catch (Throwable th) {
                        ad.a("BannerShowManager", th.getMessage(), th);
                        str = "";
                    }
                    g.a().a((WebView) d.this.f20367i, "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
                }

                @Override // com.mbridge.msdk.foundation.d.a
                public final void a(String str) {
                    String str2;
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                            jSONObject.put(NotificationCompat.CATEGORY_STATUS, 1);
                        }
                        str2 = jSONObject.toString();
                    } catch (Throwable th) {
                        ad.a("BannerShowManager", th.getMessage(), th);
                        str2 = "";
                    }
                    g.a().a((WebView) d.this.f20367i, "onFeedbackAlertStatusNotify", Base64.encodeToString(str2.getBytes(), 2));
                }
            });
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 6.0f), ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 6.0f));
            layoutParams.addRule(11);
            layoutParams.addRule(12);
            this.f20361c.addView(mBAdChoice, layoutParams);
        }
    }

    private boolean b() {
        String a8 = a(this.f20360b);
        if (TextUtils.isEmpty(a8)) {
            return false;
        }
        if (this.f20361c != null) {
            if (this.f20367i == null) {
                try {
                    MBBannerWebView mBBannerWebView = new MBBannerWebView(com.mbridge.msdk.foundation.controller.c.m().c());
                    this.f20367i = mBBannerWebView;
                    mBBannerWebView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                    this.f20367i.setWebViewClient(new com.mbridge.msdk.mbbanner.view.a(this.f20363e, this.f20377s, this.f20357D));
                } catch (Throwable unused) {
                    a("banner show failed because WebView is not available and try to show default", 1);
                    return false;
                }
            }
            ImageView imageView = this.f20366h;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            if (this.f20367i.getVisibility() != 0) {
                this.f20367i.setVisibility(0);
            }
            if (this.f20367i.getParent() == null) {
                this.f20361c.addView(this.f20367i);
                d(this.f20360b.isMraid());
            }
            if (this.f20360b.isMraid()) {
                g();
            }
            f();
            com.mbridge.msdk.mbbanner.common.communication.a aVar = new com.mbridge.msdk.mbbanner.common.communication.a(this.f20361c.getContext(), this.f20376r, this.f20363e);
            this.f20381w = aVar;
            aVar.a(this.f20377s);
            this.f20381w.a(this.f20357D);
            this.f20381w.a(this.f20379u);
            this.f20367i.setWebViewListener(this.f20358E);
            this.f20367i.setObject(this.f20381w);
            if (!a8.startsWith("file")) {
                if (this.f20360b.isActiveOm()) {
                    a8 = com.mbridge.msdk.a.b.c(a8);
                }
                this.f20367i.loadDataWithBaseURL(this.f20360b.getBannerUrl(), a8, "text/html", "utf-8", null);
            } else {
                this.f20367i.loadUrl(a8);
            }
            MBBannerWebView mBBannerWebView2 = this.f20367i;
            if (mBBannerWebView2 != null) {
                mBBannerWebView2.postDelayed(new Runnable() { // from class: com.mbridge.msdk.mbbanner.common.c.d.9
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str;
                        try {
                            if (d.this.f20367i != null) {
                                if (d.this.f20378t == 2) {
                                    str = "false";
                                } else {
                                    str = "true";
                                }
                                d.this.f20367i.evaluateJavascript("(function() {\n    var videos = document.getElementsByTagName('video');\n    for (var i = 0; i < videos.length; i++) {\n    videos[i].muted = " + str + ";\n    }\n    var audios = document.getElementsByTagName('audio');\n    for (var i = 0; i < audios.length; i++) {\n    audios[i].muted = " + str + ";\n    }\n    })()", null);
                            }
                        } catch (Exception e8) {
                            e8.printStackTrace();
                        }
                    }
                }, 1000L);
            }
        } else {
            a("banner render failed because banner view is null", 2);
            a("banner show failed because banner view is exception");
        }
        return true;
    }

    public final void a(boolean z8, int i8) {
        this.f20379u = i8;
        if (i8 == 0) {
            k d8 = h.a().d(com.mbridge.msdk.foundation.controller.c.m().k(), this.f20363e);
            if (d8 == null) {
                return;
            } else {
                z8 = d8.f() == 1;
            }
        }
        this.f20365g = z8;
    }

    public final void a(boolean z8) {
        this.f20365g = z8;
    }

    private String a(CampaignEx campaignEx) {
        String str;
        String str2 = "";
        if (campaignEx == null) {
            return "";
        }
        String htmlContentFromUrl = HTMLResourceManager.getInstance().getHtmlContentFromUrl(campaignEx.getBannerUrl());
        if (TextUtils.isEmpty(htmlContentFromUrl)) {
            String bannerHtml = campaignEx.getBannerHtml();
            if (campaignEx.isActiveOm()) {
                try {
                    File file = new File(bannerHtml);
                    if (file.exists()) {
                        str2 = ab.b(file);
                    }
                    str = AbstractC3859b.a(MBridgeConstans.OMID_JS_SERVICE_CONTENT, str2);
                } catch (Exception unused) {
                    File file2 = new File(bannerHtml);
                    if (file2.exists() && file2.isFile() && file2.canRead()) {
                        str = "file:////" + bannerHtml;
                    }
                }
                return str;
            }
            File file3 = new File(bannerHtml);
            if (file3.exists() && file3.isFile() && file3.canRead()) {
                str = "file:////" + bannerHtml;
                return str;
            }
            return bannerHtml;
        }
        return AbstractC3859b.a(MBridgeConstans.OMID_JS_SERVICE_CONTENT, htmlContentFromUrl);
    }

    public final void c(boolean z8) {
        this.f20371m = z8;
        d();
    }

    private void c(final CampaignEx campaignEx, final Context context, String str) {
        if (!TextUtils.isEmpty(campaignEx.getImpressionURL())) {
            new Thread(new Runnable() { // from class: com.mbridge.msdk.mbbanner.common.c.d.3
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        com.mbridge.msdk.foundation.db.k.a(com.mbridge.msdk.foundation.db.h.a(context)).a(campaignEx.getId());
                    } catch (Exception e8) {
                        ad.b("BannerShowManager", e8.getMessage());
                    }
                }
            }).start();
            com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getImpressionURL(), false, true, com.mbridge.msdk.click.a.a.f18059g);
        }
        if (TextUtils.isEmpty(str) || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().p() == null) {
            return;
        }
        com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getNativeVideoTracking().p(), false, false);
    }

    static /* synthetic */ void c(d dVar) {
        ImageView imageView;
        if (dVar.f20365g && (imageView = dVar.f20368j) != null && imageView.getVisibility() == 0) {
            dVar.f20368j.setVisibility(8);
            dVar.f20368j.setOnClickListener(null);
            if (dVar.f20361c == null || dVar.f20368j.getParent() == null) {
                return;
            }
            dVar.f20361c.removeView(dVar.f20368j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (this.f20360b == null || e()) {
            return;
        }
        this.f20383y.removeCallbacks(this.f20384z);
        com.mbridge.msdk.mbbanner.common.b.c cVar = this.f20359a;
        if (cVar != null) {
            cVar.a(str);
        }
        com.mbridge.msdk.foundation.same.report.k.a(com.mbridge.msdk.foundation.controller.c.m().c(), this.f20360b, this.f20363e, str);
    }

    public final void a() {
        AbstractC3969b abstractC3969b = this.f20382x;
        if (abstractC3969b != null) {
            abstractC3969b.c();
            this.f20382x = null;
            ad.a("omsdk", " adSession.finish() ");
        }
        if (this.f20359a != null) {
            this.f20359a = null;
        }
        MBBannerWebView mBBannerWebView = this.f20367i;
        if (mBBannerWebView != null) {
            mBBannerWebView.setWebViewListener(null);
        }
        if (this.f20358E != null) {
            this.f20358E = null;
        }
        ImageView imageView = this.f20368j;
        if (imageView != null) {
            imageView.setOnClickListener(null);
        }
        ImageView imageView2 = this.f20366h;
        if (imageView2 != null) {
            imageView2.setOnClickListener(null);
        }
        MBBannerView mBBannerView = this.f20361c;
        if (mBBannerView != null) {
            mBBannerView.removeAllViews();
        }
        MBBannerWebView mBBannerWebView2 = this.f20367i;
        if (mBBannerWebView2 != null) {
            mBBannerWebView2.release();
        }
        com.mbridge.msdk.mbbanner.common.communication.a aVar = this.f20381w;
        if (aVar != null) {
            aVar.a();
        }
        if (this.f20357D != null) {
            this.f20357D = null;
        }
        com.mbridge.msdk.foundation.d.b.a().c(this.f20363e);
    }

    public final void b(boolean z8) {
        this.f20370l = z8;
        d();
        if (z8) {
            return;
        }
        CampaignEx campaignEx = this.f20360b;
        String str = this.f20363e;
        if (campaignEx != null) {
            String a8 = com.mbridge.msdk.mbsignalcommon.mraid.c.a(campaignEx.getId());
            if (TextUtils.isEmpty(a8)) {
                return;
            }
            new i(com.mbridge.msdk.foundation.controller.c.m().c()).b(campaignEx.getRequestId(), campaignEx.getRequestIdNotice(), campaignEx.getId(), str, a8, campaignEx.isBidCampaign());
            com.mbridge.msdk.mbsignalcommon.mraid.c.b(campaignEx.getId());
        }
    }

    private void b(CampaignEx campaignEx, Context context, String str) {
        if (campaignEx != null) {
            try {
                if (TextUtils.isEmpty(campaignEx.getOnlyImpressionURL())) {
                    return;
                }
                com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getOnlyImpressionURL(), false, true, com.mbridge.msdk.click.a.a.f18060h);
            } catch (Throwable th) {
                ad.b("BannerShowManager", th.getMessage());
            }
        }
    }

    static /* synthetic */ void b(d dVar) {
        MBBannerWebView mBBannerWebView = dVar.f20367i;
        if (mBBannerWebView != null && mBBannerWebView.getParent() != null) {
            dVar.f20361c.removeView(dVar.f20367i);
        }
        ImageView imageView = dVar.f20366h;
        if (imageView != null && imageView.getParent() != null) {
            dVar.f20366h.setVisibility(8);
            dVar.f20361c.removeView(dVar.f20366h);
        }
        ImageView imageView2 = dVar.f20368j;
        if (imageView2 != null && imageView2.getParent() != null) {
            dVar.f20361c.removeView(dVar.f20368j);
            dVar.f20368j.setVisibility(8);
        }
        com.mbridge.msdk.foundation.d.b.a().c(dVar.f20363e);
        ImageView imageView3 = dVar.f20369k;
        if (imageView3 != null && imageView3.getParent() != null) {
            dVar.f20361c.removeView(dVar.f20369k);
            dVar.f20369k.setVisibility(8);
        }
        com.mbridge.msdk.mbbanner.common.a.a a8 = com.mbridge.msdk.mbbanner.common.a.a.a().b(dVar.f20363e).d(dVar.f20360b.getRequestId()).e(dVar.f20360b.getRequestIdNotice()).c(dVar.f20360b.getId()).f(dVar.f20360b.getCreativeId() + "").a(dVar.f20360b.isBidCampaign());
        String str = dVar.f20363e;
        if (a8 != null) {
            a8.a("2000069");
            if (e.a().b()) {
                e.a().a(a8.b());
            } else {
                com.mbridge.msdk.foundation.same.report.h.a(a8.b(), com.mbridge.msdk.foundation.controller.c.m().c(), str);
            }
        }
        BannerUtils.inserCloseId(dVar.f20363e, dVar.f20377s);
        com.mbridge.msdk.mbbanner.common.b.c cVar = dVar.f20359a;
        if (cVar != null) {
            cVar.e();
        }
    }

    private void a(CampaignEx campaignEx, Context context, String str) {
        if (campaignEx != null) {
            try {
                List<String> pv_urls = campaignEx.getPv_urls();
                if (pv_urls == null || pv_urls.size() <= 0) {
                    return;
                }
                Iterator<String> it = pv_urls.iterator();
                while (it.hasNext()) {
                    com.mbridge.msdk.click.a.a(context, campaignEx, str, it.next(), false, true);
                }
            } catch (Throwable th) {
                ad.b("BannerShowManager", th.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i8) {
        if (this.f20360b != null) {
            com.mbridge.msdk.mbbanner.common.d.a.a(com.mbridge.msdk.mbbanner.common.a.a.a().c(this.f20360b.getId()).b(this.f20363e).d(this.f20360b.getRequestId()).e(this.f20360b.getRequestIdNotice()).g(str).a(i8).a(this.f20360b.isBidCampaign()), this.f20363e);
        }
    }

    public final void a(int i8, int i9, int i10, int i11) {
        if (i8 == i10 && i9 == i11) {
            return;
        }
        MBBannerWebView mBBannerWebView = this.f20367i;
        ad.b("BannerCallJS", "fireOnBannerViewSizeChange");
        try {
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(mBBannerWebView, i8, i9);
        } catch (Throwable th) {
            ad.a("BannerCallJS", "fireOnBannerViewSizeChange", th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.mbridge.msdk.foundation.entity.CampaignUnit r5) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbbanner.common.c.d.a(com.mbridge.msdk.foundation.entity.CampaignUnit):void");
    }

    private void d(boolean z8) {
        if (this.f20361c != null) {
            View b8 = com.mbridge.msdk.foundation.d.b.a().b(this.f20363e);
            if (com.mbridge.msdk.foundation.d.b.a().b() && z8 && b8 != null) {
                ViewGroup viewGroup = (ViewGroup) b8.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(b8);
                }
                b8.setVisibility(0);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) b8.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new RelativeLayout.LayoutParams(com.mbridge.msdk.foundation.d.b.f19150b, com.mbridge.msdk.foundation.d.b.f19149a);
                }
                layoutParams.addRule(12);
                b8.setLayoutParams(layoutParams);
                this.f20361c.addView(b8);
            }
            com.mbridge.msdk.foundation.d.b.a().a(this.f20363e, new com.mbridge.msdk.foundation.d.a() { // from class: com.mbridge.msdk.mbbanner.common.c.d.5
                @Override // com.mbridge.msdk.foundation.d.a
                public final void a() {
                    String str;
                    d.this.f20361c.onPause();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                            jSONObject.put(NotificationCompat.CATEGORY_STATUS, 1);
                        }
                        str = jSONObject.toString();
                    } catch (Throwable th) {
                        ad.a("BannerShowManager", th.getMessage(), th);
                        str = "";
                    }
                    g.a().a((WebView) d.this.f20367i, "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
                }

                @Override // com.mbridge.msdk.foundation.d.a
                public final void b() {
                    String str;
                    d.this.f20361c.onResume();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                            jSONObject.put(NotificationCompat.CATEGORY_STATUS, 2);
                        }
                        str = jSONObject.toString();
                    } catch (Throwable th) {
                        ad.a("BannerShowManager", th.getMessage(), th);
                        str = "";
                    }
                    g.a().a((WebView) d.this.f20367i, "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
                }

                @Override // com.mbridge.msdk.foundation.d.a
                public final void a(String str) {
                    String str2;
                    d.this.f20361c.onResume();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                            jSONObject.put(NotificationCompat.CATEGORY_STATUS, 2);
                        }
                        str2 = jSONObject.toString();
                    } catch (Throwable th) {
                        ad.a("BannerShowManager", th.getMessage(), th);
                        str2 = "";
                    }
                    g.a().a((WebView) d.this.f20367i, "onFeedbackAlertStatusNotify", Base64.encodeToString(str2.getBytes(), 2));
                }
            });
            this.f20360b.setCampaignUnitId(this.f20363e);
            com.mbridge.msdk.foundation.d.b.a().a(this.f20363e, this.f20360b);
        }
    }
}
