package com.mbridge.msdk.foundation.webview;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.mbridge.msdk.activity.MBCommonActivity;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.c.i;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ah;
import com.mbridge.msdk.foundation.webview.BrowserView;
import com.mbridge.msdk.out.BaseTrackingListener;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public class a implements BrowserView.a {

    /* renamed from: a, reason: collision with root package name */
    private static String f20165a = "a";

    /* renamed from: b, reason: collision with root package name */
    private int f20166b;

    /* renamed from: d, reason: collision with root package name */
    private String f20168d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f20169e;

    /* renamed from: f, reason: collision with root package name */
    private BaseTrackingListener f20170f;

    /* renamed from: g, reason: collision with root package name */
    private BrowserView f20171g;

    /* renamed from: h, reason: collision with root package name */
    private CampaignEx f20172h;

    /* renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.click.a f20173i;

    /* renamed from: j, reason: collision with root package name */
    private Context f20174j;

    /* renamed from: l, reason: collision with root package name */
    private JumpLoaderResult f20176l;

    /* renamed from: o, reason: collision with root package name */
    private long f20179o;

    /* renamed from: c, reason: collision with root package name */
    private boolean f20167c = true;

    /* renamed from: m, reason: collision with root package name */
    private boolean f20177m = false;

    /* renamed from: n, reason: collision with root package name */
    private final Runnable f20178n = new Runnable() { // from class: com.mbridge.msdk.foundation.webview.a.1
        @Override // java.lang.Runnable
        public final void run() {
            ad.b(a.f20165a, "webview js！超时上限：" + a.this.f20166b + "ms");
            if (a.this.f20173i != null && a.this.f20176l != null) {
                a.this.f20176l.setSuccess(false);
                a.this.f20176l.setUrl(a.this.f20168d);
                a.this.f20176l.setType(2);
                a.this.f20176l.setExceptionMsg("linktype 8 time out");
                a.this.f20173i.a(a.this.f20176l, a.this.f20172h, 1, false);
            }
            a aVar = a.this;
            if (aVar.d(null, aVar.f20168d) && !a.this.f20177m) {
                a.this.f20177m = true;
                a aVar2 = a.this;
                aVar2.a(aVar2.f20174j, a.this.f20168d, a.this.f20172h);
            }
            if (a.this.f20170f != null) {
                a.this.f20170f.onFinishRedirection(a.this.f20172h, a.this.f20168d);
            }
        }
    };

    /* renamed from: k, reason: collision with root package name */
    private Handler f20175k = new Handler(Looper.getMainLooper());

    public a(Context context, CampaignEx campaignEx, com.mbridge.msdk.click.a aVar, BrowserView browserView, BaseTrackingListener baseTrackingListener) {
        this.f20166b = 10000;
        this.f20176l = null;
        this.f20174j = context;
        this.f20172h = campaignEx;
        this.f20171g = browserView;
        this.f20170f = baseTrackingListener;
        g b8 = h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
        if (b8 == null) {
            h.a();
            b8 = i.a();
        }
        this.f20173i = aVar;
        this.f20176l = new JumpLoaderResult();
        this.f20166b = (int) b8.aq();
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
    public final void a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(WebView webView, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            Uri parse = Uri.parse(str);
            if (!parse.getScheme().equals("http") && !parse.getScheme().equals("https")) {
                if (parse.getScheme().equals("intent")) {
                    Intent parseUri = Intent.parseUri(str, 1);
                    try {
                        String str2 = parseUri.getPackage();
                        if (!TextUtils.isEmpty(str2)) {
                            if (this.f20174j.getPackageManager().getLaunchIntentForPackage(str2) != null) {
                                return false;
                            }
                        }
                    } catch (Throwable th) {
                        ad.b(f20165a, th.getMessage());
                    }
                    try {
                        String stringExtra = parseUri.getStringExtra("browser_fallback_url");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            Uri parse2 = Uri.parse(str);
                            if (!parse2.getScheme().equals("http")) {
                                if (!parse2.getScheme().equals("https")) {
                                    str = stringExtra;
                                }
                            }
                            return true;
                        }
                    } catch (Throwable th2) {
                        ad.b(f20165a, th2.getMessage());
                    }
                }
                if (com.mbridge.msdk.click.c.d(this.f20174j, str)) {
                    ad.b(f20165a, "openDeepLink");
                    return false;
                }
            }
            return true;
        } catch (Throwable th3) {
            ad.b(f20165a, th3.getMessage());
            return true;
        }
    }

    private boolean e(WebView webView, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Uri parse = Uri.parse(str);
            if (!parse.getScheme().equals("http") && !parse.getScheme().equals("https")) {
                if (parse.getScheme().equals("intent")) {
                    Intent parseUri = Intent.parseUri(str, 1);
                    try {
                        String str2 = parseUri.getPackage();
                        if (!TextUtils.isEmpty(str2) && this.f20174j.getPackageManager().getLaunchIntentForPackage(str2) != null) {
                            parseUri.setFlags(268435456);
                            this.f20174j.startActivity(parseUri);
                            this.f20177m = true;
                            return true;
                        }
                    } catch (Throwable th) {
                        ad.b(f20165a, th.getMessage());
                    }
                    try {
                        String stringExtra = parseUri.getStringExtra("browser_fallback_url");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            Uri parse2 = Uri.parse(str);
                            if (!parse2.getScheme().equals("http") && !parse2.getScheme().equals("https")) {
                                str = stringExtra;
                            }
                            webView.loadUrl(stringExtra);
                            return false;
                        }
                    } catch (Throwable th2) {
                        ad.b(f20165a, th2.getMessage());
                    }
                }
                if (com.mbridge.msdk.click.c.d(this.f20174j, str)) {
                    ad.b(f20165a, "openDeepLink");
                    this.f20177m = true;
                    return true;
                }
            }
            return false;
        } catch (Throwable th3) {
            ad.b(f20165a, th3.getMessage());
            return false;
        }
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
    public final void c(WebView webView, final String str) {
        ad.b(f20165a, "onPageFinished1  " + str);
        if (this.f20167c) {
            this.f20179o = 0L;
            this.f20167c = false;
            com.mbridge.msdk.foundation.same.f.b.g().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.webview.a.3
                @Override // java.lang.Runnable
                public final void run() {
                    if (a.this.f20170f != null) {
                        a.this.f20170f.onFinishRedirection(a.this.f20172h, str);
                    }
                    if (a.this.f20173i != null && a.this.f20176l != null) {
                        a.this.f20176l.setSuccess(true);
                        a.this.f20176l.setUrl(str);
                        a.this.f20176l.setType(2);
                        a.this.f20173i.a(a.this.f20176l, a.this.f20172h, 1, true);
                    }
                }
            });
            if (TextUtils.isEmpty(str)) {
                return;
            }
            c();
            Uri parse = Uri.parse(str);
            if ((parse.getScheme().equals("http") || parse.getScheme().equals("https")) && !this.f20177m) {
                this.f20177m = true;
                a(this.f20174j, str, this.f20172h);
            }
        }
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
    public final boolean b(WebView webView, final String str) {
        ad.b(f20165a, "shouldOverrideUrlLoading1  " + str);
        this.f20167c = false;
        if (ah.a.b(str) && ah.a.a(this.f20174j, str, null)) {
            this.f20177m = true;
        }
        boolean e8 = e(webView, str);
        if (e8) {
            this.f20179o = 0L;
            this.f20167c = false;
            c();
            com.mbridge.msdk.foundation.same.f.b.g().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.webview.a.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (a.this.f20173i != null && a.this.f20176l != null) {
                        a.this.f20176l.setSuccess(true);
                        a.this.f20176l.setUrl(str);
                        a.this.f20176l.setType(2);
                        a.this.f20173i.a(a.this.f20176l, a.this.f20172h, 1, true);
                    }
                    if (a.this.f20170f != null) {
                        a.this.f20170f.onFinishRedirection(a.this.f20172h, str);
                    }
                }
            });
        }
        return e8;
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
    public final void a(WebView webView, String str) {
        if (this.f20179o == 0) {
            this.f20179o = System.currentTimeMillis();
            if (!this.f20169e) {
                this.f20169e = true;
                d();
            }
        }
        this.f20168d = str;
        this.f20167c = true;
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
    public final void a(WebView webView, String str, Bitmap bitmap) {
        if (this.f20179o == 0) {
            this.f20179o = System.currentTimeMillis();
            if (!this.f20169e) {
                this.f20169e = true;
                d();
            }
            this.f20177m = false;
        }
        this.f20168d = str;
        this.f20167c = true;
    }

    private void c() {
        this.f20175k.removeCallbacks(this.f20178n);
    }

    private void d() {
        this.f20175k.postDelayed(this.f20178n, this.f20166b);
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
    public final void a(WebView webView, int i8, final String str, final String str2) {
        ad.d(f20165a, str);
        c();
        com.mbridge.msdk.foundation.same.f.b.g().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.webview.a.4
            @Override // java.lang.Runnable
            public final void run() {
                if (a.this.f20170f != null) {
                    a.this.f20170f.onFinishRedirection(a.this.f20172h, str2);
                }
                if (a.this.f20173i != null && a.this.f20176l != null) {
                    a.this.f20176l.setSuccess(false);
                    a.this.f20176l.setUrl(str2);
                    a.this.f20176l.setType(2);
                    a.this.f20176l.setExceptionMsg(str);
                    a.this.f20173i.a(a.this.f20176l, a.this.f20172h, 1, true);
                }
            }
        });
        if (!d(webView, str2) || this.f20177m) {
            return;
        }
        this.f20177m = true;
        a(this.f20174j, str2, this.f20172h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, String str, CampaignEx campaignEx) {
        if (context == null) {
            return;
        }
        if (campaignEx != null) {
            campaignEx.getCurrentLocalRid();
        }
        try {
            int i8 = MBCommonActivity.f17854d;
            Intent intent = new Intent(context, (Class<?>) MBCommonActivity.class);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            b.f20188a.put(str, this.f20171g);
            if (ah.a.a(str)) {
                str = "https://play.google.com/store/apps/details?id=" + str.replace("market://details?id=", "");
            }
            intent.putExtra("url", str);
            ad.c("url", "webview url = " + str);
            intent.setFlags(805306368);
            intent.putExtra("mvcommon", campaignEx);
            context.startActivity(intent);
        } catch (Exception unused) {
            ah.a(context, str, this.f20170f, campaignEx, new ArrayList());
        }
    }
}
