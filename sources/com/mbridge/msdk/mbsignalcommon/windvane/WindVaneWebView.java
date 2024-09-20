package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.mbsignalcommon.base.BaseWebView;

/* loaded from: classes4.dex */
public class WindVaneWebView extends BaseWebView {

    /* renamed from: b, reason: collision with root package name */
    protected k f20564b;

    /* renamed from: c, reason: collision with root package name */
    protected c f20565c;

    /* renamed from: d, reason: collision with root package name */
    protected f f20566d;

    /* renamed from: e, reason: collision with root package name */
    private Object f20567e;

    /* renamed from: f, reason: collision with root package name */
    private Object f20568f;

    /* renamed from: g, reason: collision with root package name */
    private String f20569g;

    /* renamed from: h, reason: collision with root package name */
    private d f20570h;

    /* renamed from: i, reason: collision with root package name */
    private String f20571i;

    /* renamed from: j, reason: collision with root package name */
    private String f20572j;

    /* renamed from: k, reason: collision with root package name */
    private CampaignEx f20573k;

    /* renamed from: l, reason: collision with root package name */
    private int f20574l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f20575m;

    /* renamed from: n, reason: collision with root package name */
    private float f20576n;

    /* renamed from: o, reason: collision with root package name */
    private float f20577o;

    public WindVaneWebView(Context context) {
        super(context);
        this.f20575m = false;
        this.f20576n = 0.0f;
        this.f20577o = 0.0f;
    }

    public void clearWebView() {
        if (!this.f20575m) {
            loadUrl("about:blank");
        }
    }

    public CampaignEx getCampaignEx() {
        return this.f20573k;
    }

    public String getCampaignId() {
        return this.f20569g;
    }

    public Object getJsObject(String str) {
        f fVar = this.f20566d;
        if (fVar == null) {
            return null;
        }
        return fVar.a(str);
    }

    public String getLocalRequestId() {
        return this.f20572j;
    }

    public Object getMraidObject() {
        return this.f20568f;
    }

    public Object getObject() {
        return this.f20567e;
    }

    public String getRid() {
        return this.f20571i;
    }

    public c getSignalCommunication() {
        return this.f20565c;
    }

    public d getWebViewListener() {
        return this.f20570h;
    }

    public boolean isDestoryed() {
        return this.f20575m;
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        com.mbridge.msdk.mbsignalcommon.base.b bVar = this.mWebViewClient;
        if (bVar != null && (bVar.b() instanceof IntentFilter)) {
            String url = getUrl();
            if (!TextUtils.isEmpty(url) && url.contains("https://play.google.com")) {
                if (motionEvent.getAction() == 0) {
                    this.f20576n = motionEvent.getRawX();
                    this.f20577o = motionEvent.getRawY();
                } else {
                    float rawX = motionEvent.getRawX() - this.f20576n;
                    float y8 = motionEvent.getY() - this.f20577o;
                    if ((rawX >= 0.0f || rawX * (-1.0f) <= 48) && ((rawX <= 0.0f || rawX <= 48) && ((y8 >= 0.0f || (-1.0f) * y8 <= 48) && (y8 <= 0.0f || y8 <= 48)))) {
                        setClickable(false);
                        return true;
                    }
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void registerWindVanePlugin(Class cls) {
        f fVar = this.f20566d;
        if (fVar == null) {
            return;
        }
        fVar.a(cls.getSimpleName(), cls);
    }

    public void release() {
        try {
            if (!this.f20575m) {
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a("type", Integer.valueOf(this.f20574l));
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000135", this.f20573k, dVar);
            }
        } catch (Exception unused) {
        }
        try {
            setVisibility(8);
            removeAllViews();
            setDownloadListener(null);
            this.f20567e = null;
            if (ai.b(getContext()) == 0) {
                this.f20575m = true;
                destroy();
            } else {
                new Handler().postDelayed(new Runnable() { // from class: com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        WindVaneWebView.this.f20575m = true;
                        WindVaneWebView.this.destroy();
                    }
                }, r0 * 1000);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setApiManagerContext(Context context) {
        f fVar = this.f20566d;
        if (fVar != null) {
            fVar.a(context);
        }
    }

    public void setApiManagerJSFactory(Object obj) {
        f fVar = this.f20566d;
        if (fVar != null) {
            fVar.a(obj);
        }
    }

    public void setCampaignEx(CampaignEx campaignEx) {
        this.f20573k = campaignEx;
    }

    public void setCampaignId(String str) {
        this.f20569g = str;
    }

    public void setLocalRequestId(String str) {
        this.f20572j = str;
    }

    public void setMraidObject(Object obj) {
        this.f20568f = obj;
    }

    public void setObject(Object obj) {
        this.f20567e = obj;
    }

    public void setRid(String str) {
        this.f20571i = str;
    }

    public void setSignalCommunication(c cVar) {
        this.f20565c = cVar;
        cVar.a(this);
    }

    public void setTempTypeForMetrics(int i8) {
        this.f20574l = i8;
    }

    public void setWebViewChromeClient(k kVar) {
        this.f20564b = kVar;
        setWebChromeClient(kVar);
    }

    public void setWebViewListener(d dVar) {
        this.f20570h = dVar;
        k kVar = this.f20564b;
        if (kVar != null) {
            kVar.a(dVar);
        }
        com.mbridge.msdk.mbsignalcommon.base.b bVar = this.mWebViewClient;
        if (bVar != null) {
            bVar.a(dVar);
        }
    }

    public void setWebViewTransparent() {
        super.setTransparent();
    }

    @Override // com.mbridge.msdk.mbsignalcommon.base.BaseWebView
    protected final void a() {
        super.a();
        getSettings().setSavePassword(false);
        getSettings().setUserAgentString(getSettings().getUserAgentString() + " WindVane/3.0.2");
        if (this.f20564b == null) {
            this.f20564b = new k(this);
        }
        setWebViewChromeClient(this.f20564b);
        l lVar = new l();
        this.mWebViewClient = lVar;
        setWebViewClient(lVar);
        if (this.f20565c == null) {
            c iVar = new i(this.f20462a);
            this.f20565c = iVar;
            setSignalCommunication(iVar);
        }
        this.f20566d = new f(this.f20462a, this);
    }

    public WindVaneWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20575m = false;
        this.f20576n = 0.0f;
        this.f20577o = 0.0f;
    }

    public WindVaneWebView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f20575m = false;
        this.f20576n = 0.0f;
        this.f20577o = 0.0f;
    }
}
