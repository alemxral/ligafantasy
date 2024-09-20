package com.mbridge.msdk.mbsignalcommon.commonwebview;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ah;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.webview.ProgressBar;
import com.mbridge.msdk.mbsignalcommon.base.BaseWebView;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public class CommonWebView extends LinearLayout {
    public static int DEFAULT_JUMP_TIMEOUT = 10000;

    /* renamed from: a, reason: collision with root package name */
    protected ToolBar f20496a;

    /* renamed from: b, reason: collision with root package name */
    protected ToolBar f20497b;

    /* renamed from: c, reason: collision with root package name */
    protected ProgressBar f20498c;

    /* renamed from: d, reason: collision with root package name */
    protected BaseWebView f20499d;

    /* renamed from: e, reason: collision with root package name */
    private int f20500e;

    /* renamed from: f, reason: collision with root package name */
    private int f20501f;

    /* renamed from: g, reason: collision with root package name */
    private RelativeLayout f20502g;

    /* renamed from: h, reason: collision with root package name */
    private View.OnClickListener f20503h;

    /* renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.mbsignalcommon.commonwebview.b f20504i;

    /* renamed from: j, reason: collision with root package name */
    private com.mbridge.msdk.mbsignalcommon.commonwebview.a f20505j;

    /* renamed from: k, reason: collision with root package name */
    private View.OnClickListener f20506k;

    /* renamed from: l, reason: collision with root package name */
    private View.OnClickListener f20507l;

    /* renamed from: m, reason: collision with root package name */
    private View.OnClickListener f20508m;

    /* renamed from: n, reason: collision with root package name */
    private View.OnClickListener f20509n;

    /* renamed from: o, reason: collision with root package name */
    private Handler f20510o;

    /* renamed from: p, reason: collision with root package name */
    private int f20511p;

    /* renamed from: q, reason: collision with root package name */
    private WebViewClient f20512q;

    /* renamed from: r, reason: collision with root package name */
    private String f20513r;

    /* renamed from: s, reason: collision with root package name */
    private b f20514s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f20515t;

    /* renamed from: u, reason: collision with root package name */
    private final Runnable f20516u;

    /* loaded from: classes4.dex */
    public interface a {
        void a();
    }

    /* loaded from: classes4.dex */
    public interface b {
        void a(String str);
    }

    public CommonWebView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f20516u = new Runnable() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.1
            @Override // java.lang.Runnable
            public final void run() {
                ad.b("CommonWebView", "webview js!！超时上限：" + CommonWebView.this.f20511p + "ms");
                if (CommonWebView.this.f20514s != null) {
                    CommonWebView.this.f20515t = false;
                    CommonWebView.this.f20514s.a(CommonWebView.this.f20513r);
                }
            }
        };
        init();
    }

    static /* synthetic */ void k(CommonWebView commonWebView) {
        commonWebView.f20510o.removeCallbacks(commonWebView.f20516u);
    }

    public void addWebChromeClient(WebChromeClient webChromeClient) {
        this.f20505j.a(webChromeClient);
    }

    public void addWebViewClient(WebViewClient webViewClient) {
        this.f20504i.a(webViewClient);
    }

    public View findToolBarButton(String str) {
        View view;
        ToolBar toolBar;
        ToolBar toolBar2 = this.f20496a;
        if (toolBar2 != null) {
            view = toolBar2.getItem(str);
        } else {
            view = null;
        }
        if (view == null && (toolBar = this.f20497b) != null) {
            return toolBar.getItem(str);
        }
        return view;
    }

    public String getUrl() {
        BaseWebView baseWebView = this.f20499d;
        if (baseWebView == null) {
            return "";
        }
        return baseWebView.getUrl();
    }

    public WebView getWebView() {
        return this.f20499d;
    }

    public void hideCustomizedToolBar() {
        ToolBar toolBar = this.f20496a;
        if (toolBar != null) {
            toolBar.setVisibility(8);
        }
    }

    public void hideDefaultToolBar() {
        ToolBar toolBar = this.f20497b;
        if (toolBar != null) {
            toolBar.setVisibility(8);
        }
    }

    public void hideToolBarButton(String str) {
        View findToolBarButton = findToolBarButton(str);
        if (findToolBarButton != null) {
            findToolBarButton.setVisibility(8);
        }
    }

    public void hideToolBarTitle() {
        this.f20496a.hideTitle();
    }

    public void init() {
        setOrientation(1);
        setGravity(17);
        this.f20502g = new RelativeLayout(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 1.0f;
        addView(this.f20502g, layoutParams);
        this.f20500e = ai.a(getContext(), 40.0f);
        this.f20501f = ai.a(getContext(), 40.0f);
        this.f20504i = new com.mbridge.msdk.mbsignalcommon.commonwebview.b();
        this.f20505j = new com.mbridge.msdk.mbsignalcommon.commonwebview.a();
        initWebview();
    }

    public void initWebview() {
        try {
            if (this.f20499d == null) {
                this.f20499d = new BaseWebView(getContext());
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(10);
            this.f20499d.setLayoutParams(layoutParams);
            BaseWebView baseWebView = this.f20499d;
            com.mbridge.msdk.mbsignalcommon.base.b bVar = baseWebView.mWebViewClient;
            baseWebView.setWebViewClient(this.f20504i);
            this.f20499d.setWebChromeClient(this.f20505j);
            addWebViewClient(bVar);
        } catch (Throwable th) {
            ad.a("CommonWebView", "webview is error", th);
        }
        this.f20502g.addView(this.f20499d);
    }

    public void loadUrl(String str) {
        this.f20499d.loadUrl(str);
        if (this.f20512q != null) {
            a();
        }
    }

    public void onBackwardClicked(View.OnClickListener onClickListener) {
        this.f20506k = onClickListener;
    }

    public void onForwardClicked(View.OnClickListener onClickListener) {
        this.f20507l = onClickListener;
    }

    public void onOpenByBrowserClicked(View.OnClickListener onClickListener) {
        this.f20509n = onClickListener;
    }

    public void onRefreshClicked(View.OnClickListener onClickListener) {
        this.f20508m = onClickListener;
    }

    public void removeWebChromeClient(WebChromeClient webChromeClient) {
        this.f20505j.b(webChromeClient);
    }

    public void removeWebViewClient(WebViewClient webViewClient) {
        this.f20504i.b(webViewClient);
    }

    public void setCustomizedToolBarFloating() {
        ((ViewGroup) this.f20496a.getParent()).removeView(this.f20496a);
        this.f20502g.addView(this.f20496a);
    }

    public void setCustomizedToolBarUnfloating() {
        ((ViewGroup) this.f20496a.getParent()).removeView(this.f20496a);
        addView(this.f20496a, 0);
    }

    public void setExitsClickListener(View.OnClickListener onClickListener) {
        this.f20503h = onClickListener;
    }

    public void setPageLoadTimtout(int i8) {
        this.f20511p = i8;
        if (this.f20510o == null) {
            this.f20510o = new Handler(Looper.getMainLooper());
        }
        if (this.f20512q == null) {
            WebViewClient webViewClient = new WebViewClient() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.7
                @Override // android.webkit.WebViewClient
                public final void onPageFinished(WebView webView, String str) {
                    CommonWebView.this.f20515t = false;
                    CommonWebView.k(CommonWebView.this);
                }

                @Override // android.webkit.WebViewClient
                public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    CommonWebView.this.f20513r = str;
                    if (!CommonWebView.this.f20515t) {
                        CommonWebView.this.f20515t = true;
                        CommonWebView.this.a();
                    }
                }

                @Override // android.webkit.WebViewClient
                public final void onReceivedError(WebView webView, int i9, String str, String str2) {
                    CommonWebView.this.f20515t = false;
                    CommonWebView.k(CommonWebView.this);
                }

                @Override // android.webkit.WebViewClient
                public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    CommonWebView.this.f20513r = str;
                    if (CommonWebView.this.f20515t) {
                        CommonWebView.k(CommonWebView.this);
                    }
                    CommonWebView.this.f20515t = true;
                    CommonWebView.this.a();
                    return false;
                }
            };
            this.f20512q = webViewClient;
            addWebViewClient(webViewClient);
        }
    }

    public void setPageLoadTimtoutListener(b bVar) {
        this.f20514s = bVar;
    }

    public void setToolBarTitle(String str, int i8) {
        this.f20496a.setTitle(str, i8);
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        addWebChromeClient(webChromeClient);
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        addWebViewClient(webViewClient);
    }

    public void showCustomizedToolBar() {
        ToolBar toolBar = this.f20496a;
        if (toolBar != null) {
            toolBar.setVisibility(0);
        }
    }

    public void showDefaultToolBar() {
        ToolBar toolBar = this.f20497b;
        if (toolBar != null) {
            toolBar.setVisibility(0);
        }
    }

    public void showToolBarButton(String str) {
        View findToolBarButton = findToolBarButton(str);
        if (findToolBarButton != null) {
            findToolBarButton.setVisibility(0);
        }
    }

    public void showToolBarTitle() {
        this.f20496a.showTitle();
    }

    public void useCustomizedToolBar(ArrayList<ToolBar.b> arrayList, boolean z8) {
        a(arrayList, z8);
    }

    public void useDeeplink() {
        addWebViewClient(new WebViewClient() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.6
            @Override // android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (ah.a.b(str)) {
                    ah.a.a(CommonWebView.this.getContext(), str, null);
                }
                return CommonWebView.this.a(webView, str);
            }
        });
    }

    public void useDefaultToolBar() {
        if (this.f20497b == null) {
            this.f20497b = new ToolBar(getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, this.f20501f);
            layoutParams.bottomMargin = 0;
            this.f20497b.setLayoutParams(layoutParams);
            this.f20497b.setBackgroundColor(-1);
            this.f20497b.setOnItemClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BaseWebView baseWebView = CommonWebView.this.f20499d;
                    if (baseWebView != null) {
                        baseWebView.stopLoading();
                        String str = (String) view.getTag();
                        if (TextUtils.equals(str, ToolBar.BACKWARD)) {
                            CommonWebView.this.f20497b.getItem(ToolBar.FORWARD).setEnabled(true);
                            if (CommonWebView.this.f20499d.canGoBack()) {
                                CommonWebView.this.f20499d.goBack();
                            }
                            CommonWebView.this.f20497b.getItem(ToolBar.BACKWARD).setEnabled(CommonWebView.this.f20499d.canGoBack());
                            if (CommonWebView.this.f20506k != null) {
                                CommonWebView.this.f20506k.onClick(view);
                                return;
                            }
                            return;
                        }
                        if (TextUtils.equals(str, ToolBar.FORWARD)) {
                            CommonWebView.this.f20497b.getItem(ToolBar.BACKWARD).setEnabled(true);
                            if (CommonWebView.this.f20499d.canGoForward()) {
                                CommonWebView.this.f20499d.goForward();
                            }
                            CommonWebView.this.f20497b.getItem(ToolBar.FORWARD).setEnabled(CommonWebView.this.f20499d.canGoForward());
                            if (CommonWebView.this.f20507l != null) {
                                CommonWebView.this.f20507l.onClick(view);
                                return;
                            }
                            return;
                        }
                        if (TextUtils.equals(str, ToolBar.REFRESH)) {
                            CommonWebView.this.f20497b.getItem(ToolBar.BACKWARD).setEnabled(CommonWebView.this.f20499d.canGoBack());
                            CommonWebView.this.f20497b.getItem(ToolBar.FORWARD).setEnabled(CommonWebView.this.f20499d.canGoForward());
                            CommonWebView.this.f20499d.reload();
                            if (CommonWebView.this.f20508m != null) {
                                CommonWebView.this.f20508m.onClick(view);
                                return;
                            }
                            return;
                        }
                        if (TextUtils.equals(str, ToolBar.EXITS)) {
                            if (CommonWebView.this.f20503h != null) {
                                CommonWebView.this.f20503h.onClick(view);
                            }
                        } else if (TextUtils.equals(str, ToolBar.OPEN_BY_BROWSER)) {
                            if (CommonWebView.this.f20509n != null) {
                                CommonWebView.this.f20509n.onClick(view);
                            }
                            com.mbridge.msdk.click.c.c(CommonWebView.this.getContext(), CommonWebView.this.f20499d.getUrl());
                        }
                    }
                }
            });
            addWebViewClient(new WebViewClient() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.5
                @Override // android.webkit.WebViewClient
                public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    CommonWebView.this.f20497b.getItem(ToolBar.BACKWARD).setEnabled(true);
                    CommonWebView.this.f20497b.getItem(ToolBar.FORWARD).setEnabled(false);
                    return false;
                }
            });
            addView(this.f20497b);
        }
    }

    public void useProgressBar() {
        ProgressBar progressBar = new ProgressBar(getContext());
        this.f20498c = progressBar;
        progressBar.setLayoutParams(new LinearLayout.LayoutParams(-1, 4));
        addWebViewClient(new WebViewClient() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.2
            @Override // android.webkit.WebViewClient
            public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                ad.c("CommonWebView", "newProgress! 开始! = " + str);
                CommonWebView.this.f20498c.setVisible(true);
                CommonWebView.this.f20498c.setProgressState(5);
            }
        });
        addWebChromeClient(new WebChromeClient() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.3
            @Override // android.webkit.WebChromeClient
            public final void onProgressChanged(WebView webView, int i8) {
                ad.c("CommonWebView", "newProgress! = " + i8);
                if (i8 == 100) {
                    CommonWebView.this.f20498c.setProgressState(7);
                    new Handler().postDelayed(new Runnable() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.3.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            CommonWebView.this.f20498c.setVisible(false);
                        }
                    }, 200L);
                }
            }
        });
        addView(this.f20498c);
        this.f20498c.initResource(true);
    }

    public void setToolBarTitle(String str) {
        this.f20496a.setTitle(str);
    }

    public void useCustomizedToolBar(ArrayList<ToolBar.b> arrayList) {
        a(arrayList, false);
    }

    public CommonWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20516u = new Runnable() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.1
            @Override // java.lang.Runnable
            public final void run() {
                ad.b("CommonWebView", "webview js!！超时上限：" + CommonWebView.this.f20511p + "ms");
                if (CommonWebView.this.f20514s != null) {
                    CommonWebView.this.f20515t = false;
                    CommonWebView.this.f20514s.a(CommonWebView.this.f20513r);
                }
            }
        };
        init();
    }

    private void a(ArrayList<ToolBar.b> arrayList, boolean z8) {
        if (this.f20496a != null) {
            return;
        }
        ToolBar.a aVar = new ToolBar.a();
        aVar.f20527a = 40;
        ToolBar.a.f20525b = 80;
        ToolBar toolBar = new ToolBar(getContext(), aVar, arrayList);
        this.f20496a = toolBar;
        toolBar.setBackgroundColor(Color.argb(153, 255, 255, 255));
        if (z8) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.f20500e);
            layoutParams.addRule(10);
            this.f20496a.setLayoutParams(layoutParams);
            this.f20502g.addView(this.f20496a);
            return;
        }
        this.f20496a.setLayoutParams(new LinearLayout.LayoutParams(-1, this.f20500e));
        addView(this.f20496a, 0);
    }

    public CommonWebView(Context context) {
        super(context);
        this.f20516u = new Runnable() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.1
            @Override // java.lang.Runnable
            public final void run() {
                ad.b("CommonWebView", "webview js!！超时上限：" + CommonWebView.this.f20511p + "ms");
                if (CommonWebView.this.f20514s != null) {
                    CommonWebView.this.f20515t = false;
                    CommonWebView.this.f20514s.a(CommonWebView.this.f20513r);
                }
            }
        };
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(WebView webView, String str) {
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
                        if (!TextUtils.isEmpty(str2) && getContext().getPackageManager().getLaunchIntentForPackage(str2) != null) {
                            parseUri.setFlags(268435456);
                            getContext().startActivity(parseUri);
                            return true;
                        }
                    } catch (Throwable th) {
                        ad.b("CommonWebView", th.getMessage());
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
                        ad.b("CommonWebView", th2.getMessage());
                    }
                }
                if (com.mbridge.msdk.click.c.d(getContext(), str)) {
                    ad.b("CommonWebView", "openDeepLink");
                    return true;
                }
                if (!TextUtils.isEmpty(str)) {
                    return !(str.startsWith("http") || str.startsWith("https"));
                }
            }
            return false;
        } catch (Throwable th3) {
            ad.b("CommonWebView", th3.getMessage());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.f20510o.postDelayed(this.f20516u, this.f20511p);
    }
}
