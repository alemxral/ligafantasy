package com.mbridge.msdk.video.signal.factory;

import android.app.Activity;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.bt.module.MBridgeBTContainer;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.signal.a;
import com.mbridge.msdk.video.signal.a.i;
import com.mbridge.msdk.video.signal.a.j;
import com.mbridge.msdk.video.signal.a.k;
import com.mbridge.msdk.video.signal.a.m;
import com.mbridge.msdk.video.signal.a.n;
import com.mbridge.msdk.video.signal.a.o;
import com.mbridge.msdk.video.signal.a.q;
import com.mbridge.msdk.video.signal.c;
import com.mbridge.msdk.video.signal.d;
import com.mbridge.msdk.video.signal.f;
import com.mbridge.msdk.video.signal.g;
import java.util.List;

/* loaded from: classes4.dex */
public final class b extends a {

    /* renamed from: h, reason: collision with root package name */
    private Activity f22926h;

    /* renamed from: i, reason: collision with root package name */
    private WebView f22927i;

    /* renamed from: j, reason: collision with root package name */
    private MBridgeVideoView f22928j;

    /* renamed from: k, reason: collision with root package name */
    private MBridgeContainerView f22929k;

    /* renamed from: l, reason: collision with root package name */
    private CampaignEx f22930l;

    /* renamed from: m, reason: collision with root package name */
    private MBridgeBTContainer f22931m;

    /* renamed from: n, reason: collision with root package name */
    private a.InterfaceC0437a f22932n;

    /* renamed from: o, reason: collision with root package name */
    private String f22933o;

    /* renamed from: p, reason: collision with root package name */
    private List<CampaignEx> f22934p;

    public b(Activity activity) {
        this.f22926h = activity;
    }

    public final void a(k kVar) {
        this.f22920b = kVar;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public final com.mbridge.msdk.video.signal.b getActivityProxy() {
        WebView webView = this.f22927i;
        if (webView == null) {
            return super.getActivityProxy();
        }
        if (this.f22919a == null) {
            this.f22919a = new i(webView);
        }
        return this.f22919a;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public final com.mbridge.msdk.video.signal.i getIJSRewardVideoV1() {
        Activity activity;
        MBridgeContainerView mBridgeContainerView = this.f22929k;
        if (mBridgeContainerView != null && (activity = this.f22926h) != null) {
            if (this.f22924f == null) {
                this.f22924f = new o(activity, mBridgeContainerView);
            }
            return this.f22924f;
        }
        return super.getIJSRewardVideoV1();
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public final c getJSBTModule() {
        if (this.f22926h != null && this.f22931m != null) {
            if (this.f22925g == null) {
                this.f22925g = new j(this.f22926h, this.f22931m);
            }
            return this.f22925g;
        }
        return super.getJSBTModule();
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public final d getJSCommon() {
        CampaignEx campaignEx;
        List<CampaignEx> list;
        Activity activity = this.f22926h;
        if (activity != null && (campaignEx = this.f22930l) != null) {
            if (this.f22920b == null) {
                this.f22920b = new k(activity, campaignEx);
            }
            if (this.f22930l.getDynamicTempCode() == 5 && (list = this.f22934p) != null) {
                d dVar = this.f22920b;
                if (dVar instanceof k) {
                    ((k) dVar).a(list);
                }
            }
            this.f22920b.a(this.f22926h);
            this.f22920b.a(this.f22933o);
            this.f22920b.a(this.f22932n);
            return this.f22920b;
        }
        return super.getJSCommon();
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public final f getJSContainerModule() {
        MBridgeContainerView mBridgeContainerView = this.f22929k;
        if (mBridgeContainerView == null) {
            return super.getJSContainerModule();
        }
        if (this.f22923e == null) {
            this.f22923e = new m(mBridgeContainerView);
        }
        return this.f22923e;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public final g getJSNotifyProxy() {
        WebView webView = this.f22927i;
        if (webView == null) {
            return super.getJSNotifyProxy();
        }
        if (this.f22922d == null) {
            this.f22922d = new n(webView);
        }
        return this.f22922d;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public final com.mbridge.msdk.video.signal.j getJSVideoModule() {
        MBridgeVideoView mBridgeVideoView = this.f22928j;
        if (mBridgeVideoView == null) {
            return super.getJSVideoModule();
        }
        if (this.f22921c == null) {
            this.f22921c = new q(mBridgeVideoView);
        }
        return this.f22921c;
    }

    public final void a(List<CampaignEx> list) {
        this.f22934p = list;
    }

    public b(Activity activity, MBridgeBTContainer mBridgeBTContainer, WebView webView) {
        this.f22926h = activity;
        this.f22931m = mBridgeBTContainer;
        this.f22927i = webView;
    }

    public b(Activity activity, WebView webView, MBridgeVideoView mBridgeVideoView, MBridgeContainerView mBridgeContainerView, CampaignEx campaignEx, a.InterfaceC0437a interfaceC0437a) {
        this.f22926h = activity;
        this.f22927i = webView;
        this.f22928j = mBridgeVideoView;
        this.f22929k = mBridgeContainerView;
        this.f22930l = campaignEx;
        this.f22932n = interfaceC0437a;
        this.f22933o = mBridgeVideoView.getUnitId();
    }
}
