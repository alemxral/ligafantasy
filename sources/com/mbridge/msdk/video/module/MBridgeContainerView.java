package com.mbridge.msdk.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.same.report.d.c;
import com.mbridge.msdk.foundation.same.report.d.d;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.ao;
import com.mbridge.msdk.foundation.tools.r;
import com.mbridge.msdk.mbsignalcommon.windvane.g;
import com.mbridge.msdk.video.dynview.moffer.a;
import com.mbridge.msdk.video.dynview.widget.MBridgeOrderCampView;
import com.mbridge.msdk.video.module.a.a.i;
import com.mbridge.msdk.video.module.a.a.k;
import com.mbridge.msdk.video.module.a.a.l;
import com.mbridge.msdk.video.signal.f;
import com.mbridge.msdk.video.signal.factory.b;
import com.mbridge.msdk.video.signal.h;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class MBridgeContainerView extends MBridgeBaseView implements f, h {

    /* renamed from: A, reason: collision with root package name */
    private int f22271A;

    /* renamed from: B, reason: collision with root package name */
    private int f22272B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f22273C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f22274D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f22275E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f22276F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f22277G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f22278H;

    /* renamed from: I, reason: collision with root package name */
    private int f22279I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f22280J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f22281K;

    /* renamed from: L, reason: collision with root package name */
    private int f22282L;

    /* renamed from: M, reason: collision with root package name */
    private int f22283M;

    /* renamed from: N, reason: collision with root package name */
    private int f22284N;

    /* renamed from: O, reason: collision with root package name */
    private int f22285O;

    /* renamed from: P, reason: collision with root package name */
    private int f22286P;

    /* renamed from: Q, reason: collision with root package name */
    private String f22287Q;

    /* renamed from: R, reason: collision with root package name */
    private b f22288R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f22289S;

    /* renamed from: T, reason: collision with root package name */
    private boolean f22290T;

    /* renamed from: U, reason: collision with root package name */
    private List<CampaignEx> f22291U;

    /* renamed from: n, reason: collision with root package name */
    private MBridgePlayableView f22292n;

    /* renamed from: o, reason: collision with root package name */
    private MBridgeClickCTAView f22293o;

    /* renamed from: p, reason: collision with root package name */
    private MBridgeClickMiniCardView f22294p;

    /* renamed from: q, reason: collision with root package name */
    private MBridgeNativeEndCardView f22295q;

    /* renamed from: r, reason: collision with root package name */
    private MBridgeH5EndCardView f22296r;

    /* renamed from: s, reason: collision with root package name */
    private MBridgeVastEndCardView f22297s;

    /* renamed from: t, reason: collision with root package name */
    private MBridgeLandingPageView f22298t;

    /* renamed from: u, reason: collision with root package name */
    private MBridgeVideoEndCoverView f22299u;

    /* renamed from: v, reason: collision with root package name */
    private MBridgeAlertWebview f22300v;

    /* renamed from: w, reason: collision with root package name */
    private MBridgeOrderCampView f22301w;

    /* renamed from: x, reason: collision with root package name */
    private String f22302x;

    /* renamed from: y, reason: collision with root package name */
    private int f22303y;

    /* renamed from: z, reason: collision with root package name */
    private int f22304z;

    public MBridgeContainerView(Context context) {
        super(context);
        this.f22304z = 1;
        this.f22271A = 1;
        this.f22272B = 1;
        this.f22273C = false;
        this.f22274D = false;
        this.f22275E = false;
        this.f22276F = true;
        this.f22277G = false;
        this.f22278H = false;
        this.f22280J = false;
        this.f22281K = false;
        this.f22289S = false;
        this.f22290T = false;
        this.f22291U = new ArrayList();
    }

    private void b() {
        if (this.f22296r == null) {
            a(this.f22288R, 2);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f22296r;
        if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.isLoadSuccess()) {
            this.f22280J = true;
            addView(this.f22296r);
            webviewshow();
            onConfigurationChanged(getResources().getConfiguration());
            this.f22296r.excuteTask();
            this.f22296r.setNotchValue(this.f22287Q, this.f22282L, this.f22283M, this.f22284N, this.f22285O);
            n nVar = new n();
            nVar.f(this.f22242b.getRequestId());
            nVar.g(this.f22242b.getRequestIdNotice());
            nVar.e(this.f22242b.getId());
            nVar.d(this.f22242b.isMraid() ? n.f19335a : n.f19336b);
            com.mbridge.msdk.foundation.same.report.h.d(nVar, this.f22241a, this.f22302x);
        } else {
            e();
            MBridgeH5EndCardView mBridgeH5EndCardView2 = this.f22296r;
            if (mBridgeH5EndCardView2 != null) {
                mBridgeH5EndCardView2.reportRenderResult("timeout", 3);
                this.f22296r.setError(true);
            }
        }
        MBridgeH5EndCardView mBridgeH5EndCardView3 = this.f22296r;
        if (mBridgeH5EndCardView3 != null) {
            mBridgeH5EndCardView3.setUnitId(this.f22302x);
        }
    }

    private void e() {
        this.f22304z = 1;
        if (this.f22295q == null) {
            a(this.f22288R, 2);
        }
        addView(this.f22295q);
        onConfigurationChanged(getResources().getConfiguration());
        this.f22295q.notifyShowListener();
        this.f22290T = true;
        bringToFront();
    }

    private void f() {
        if (this.f22294p == null) {
            b(-2);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        if (this.f22275E && this.f22276F) {
            this.f22276F = false;
            layoutParams.width = 1;
            layoutParams.height = 1;
        }
        addView(this.f22294p, layoutParams);
    }

    private void g() {
        if (this.f22300v == null) {
            MBridgeAlertWebview mBridgeAlertWebview = new MBridgeAlertWebview(this.f22241a);
            this.f22300v = mBridgeAlertWebview;
            mBridgeAlertWebview.setUnitId(this.f22302x);
            this.f22300v.setCampaign(this.f22242b);
        }
        this.f22300v.preLoadData(this.f22288R);
    }

    private void h() {
        this.f22274D = false;
        this.f22290T = false;
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            int i8 = 0;
            for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                View childAt = viewGroup.getChildAt(i8);
                if (!(childAt instanceof MBridgeContainerView)) {
                    viewGroup.bringChildToFront(childAt);
                } else {
                    i8++;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void i() {
        /*
            r11 = this;
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r11.f22242b
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.String r0 = r0.getendcard_url()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 404(0x194, float:5.66E-43)
            if (r1 != 0) goto L27
            java.lang.String r1 = "ecid"
            java.lang.String r0 = com.mbridge.msdk.foundation.tools.ao.a(r0, r1)     // Catch: java.lang.Throwable -> L1d
            int r2 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L1d
            r7 = r2
            goto L29
        L1d:
            r0 = move-exception
            java.lang.String r1 = "MBridgeBaseView"
            java.lang.String r0 = r0.getMessage()
            com.mbridge.msdk.foundation.tools.ad.b(r1, r0)
        L27:
            r7 = 404(0x194, float:5.66E-43)
        L29:
            com.mbridge.msdk.video.module.MBridgeNativeEndCardView r0 = new com.mbridge.msdk.video.module.MBridgeNativeEndCardView
            android.content.Context r4 = r11.f22241a
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r11.f22242b
            int r1 = r1.getAdSpaceT()
            r2 = 2
            if (r1 != r2) goto L39
            r1 = 1
            r8 = 1
            goto L3b
        L39:
            r1 = 0
            r8 = 0
        L3b:
            int r9 = r11.f22252l
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r11.f22242b
            int r10 = r1.getMof_tplid()
            r5 = 0
            r6 = 1
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r11.f22295q = r0
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r11.f22242b
            int r0 = r0.getDynamicTempCode()
            r1 = 5
            if (r0 != r1) goto L6b
            com.mbridge.msdk.video.module.a.a r0 = r11.f22245e
            if (r0 == 0) goto L63
            boolean r1 = r0 instanceof com.mbridge.msdk.video.module.a.a.k
            if (r1 == 0) goto L63
            com.mbridge.msdk.video.module.a.a.k r0 = (com.mbridge.msdk.video.module.a.a.k) r0
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r11.f22242b
            r0.a(r1)
        L63:
            com.mbridge.msdk.video.module.MBridgeNativeEndCardView r0 = r11.f22295q
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r11.f22242b
            r0.setCampaign(r1)
            goto L72
        L6b:
            com.mbridge.msdk.video.module.MBridgeNativeEndCardView r0 = r11.f22295q
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = r11.f22242b
            r0.setCampaign(r1)
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.MBridgeContainerView.i():void");
    }

    public void addOrderViewData(List<CampaignEx> list) {
        if (list == null) {
            return;
        }
        this.f22291U = list;
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (view != null) {
            a(view);
            super.addView(view);
        } else {
            ad.b(MBridgeBaseView.TAG, "view is null");
        }
    }

    public boolean canBackPress() {
        if (this.f22295q != null) {
            return false;
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f22296r;
        if (mBridgeH5EndCardView != null) {
            return mBridgeH5EndCardView.canBackPress();
        }
        MBridgeLandingPageView mBridgeLandingPageView = this.f22298t;
        if (mBridgeLandingPageView != null) {
            return mBridgeLandingPageView.canBackPress();
        }
        MBridgePlayableView mBridgePlayableView = this.f22292n;
        if (mBridgePlayableView == null) {
            return false;
        }
        return mBridgePlayableView.canBackPress();
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void configurationChanged(int i8, int i9, int i10) {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f22294p;
        if (mBridgeClickMiniCardView != null && mBridgeClickMiniCardView.getVisibility() == 0) {
            this.f22294p.resizeMiniCard(i8, i9);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void defaultShow() {
        super.defaultShow();
    }

    @Override // com.mbridge.msdk.video.signal.f
    public boolean endCardShowing() {
        return this.f22273C;
    }

    public boolean endcardIsPlayable() {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f22296r;
        if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.isPlayable()) {
            return true;
        }
        return false;
    }

    public MBridgeH5EndCardView getH5EndCardView() {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f22296r;
        if (mBridgeH5EndCardView == null) {
            return this.f22292n;
        }
        return mBridgeH5EndCardView;
    }

    public CampaignEx getReSetCampaign() {
        if (!this.f22242b.isDynamicView() || !TextUtils.isEmpty(this.f22242b.getendcard_url())) {
            return null;
        }
        int size = this.f22291U.size();
        int i8 = 0;
        int i9 = 0;
        while (true) {
            if (i9 < size) {
                if (this.f22291U.get(i9) != null && this.f22291U.get(i9).getId() == this.f22242b.getId()) {
                    i8 = i9 - 1;
                    break;
                }
                i9++;
            } else {
                break;
            }
        }
        if (i8 < 0 || i8 >= size || this.f22291U.get(i8) == null) {
            return null;
        }
        return this.f22291U.get(i8);
    }

    public boolean getShowingTransparent() {
        return this.f22275E;
    }

    public String getUnitID() {
        return this.f22302x;
    }

    public int getVideoInteractiveType() {
        return this.f22303y;
    }

    public int getVideoSkipTime() {
        return this.f22279I;
    }

    public void handlerPlayableException(String str) {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f22296r;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.handlerPlayableException(str);
            if (!this.f22280J) {
                return;
            }
        }
        a();
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void hideAlertWebview() {
        if (!isLast()) {
            if (this.f22289S && !this.f22290T) {
                h();
                this.f22289S = false;
            }
            MBridgeAlertWebview mBridgeAlertWebview = this.f22300v;
            if (mBridgeAlertWebview != null && mBridgeAlertWebview.getParent() != null) {
                removeView(this.f22300v);
                MBridgeClickCTAView mBridgeClickCTAView = this.f22293o;
                if (mBridgeClickCTAView != null && mBridgeClickCTAView.getParent() != null) {
                    setWrapContent();
                    ViewGroup.LayoutParams layoutParams = getLayoutParams();
                    if (layoutParams instanceof RelativeLayout.LayoutParams) {
                        ((RelativeLayout.LayoutParams) layoutParams).addRule(12, -1);
                    }
                }
            }
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
        setVisibility(0);
    }

    public void install(CampaignEx campaignEx) {
        this.f22245e.a(105, campaignEx);
    }

    public boolean isLast() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null || viewGroup.indexOfChild(this) != 0) {
            return false;
        }
        return true;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void ivRewardAdsWithoutVideo(String str) {
        this.f22245e.a(103, str);
    }

    public boolean miniCardLoaded() {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f22294p;
        if (mBridgeClickMiniCardView != null && mBridgeClickMiniCardView.isLoadSuccess()) {
            return true;
        }
        return false;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public boolean miniCardShowing() {
        return this.f22274D;
    }

    @Override // com.mbridge.msdk.video.signal.h
    public void notifyCloseBtn(int i8) {
        MBridgePlayableView mBridgePlayableView = this.f22292n;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.notifyCloseBtn(i8);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f22296r;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.notifyCloseBtn(i8);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        MBridgeBaseView[] mBridgeBaseViewArr = {this.f22292n, this.f22293o, this.f22294p, this.f22295q, this.f22296r, this.f22297s, this.f22298t, this.f22299u};
        for (int i8 = 0; i8 < 8; i8++) {
            MBridgeBaseView mBridgeBaseView = mBridgeBaseViewArr[i8];
            if (mBridgeBaseView != null && (mBridgeBaseView instanceof MBridgeClickMiniCardView)) {
                mBridgeBaseView.onSelfConfigurationChanged(configuration);
            } else if (mBridgeBaseView != null && mBridgeBaseView.getVisibility() == 0 && mBridgeBaseView.getParent() != null && !isLast()) {
                mBridgeBaseView.onSelfConfigurationChanged(configuration);
            }
        }
    }

    public void onEndcardBackPress() {
        if (this.f22295q == null && this.f22297s == null) {
            if (this.f22298t != null) {
                this.f22245e.a(103, "");
                return;
            }
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f22296r;
            if (mBridgeH5EndCardView != null) {
                mBridgeH5EndCardView.onBackPress();
                return;
            }
            return;
        }
        this.f22245e.a(104, "");
        try {
            a.a().b();
        } catch (Exception e8) {
            ad.b(MBridgeBaseView.TAG, e8.getMessage());
        }
    }

    public void onMiniEndcardBackPress() {
        if (this.f22274D) {
            this.f22245e.a(107, "");
        }
    }

    public void onPlayableBackPress() {
        MBridgePlayableView mBridgePlayableView = this.f22292n;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.onBackPress();
        }
    }

    public void orientation(Configuration configuration) {
        MBridgeH5EndCardView[] mBridgeH5EndCardViewArr = {this.f22292n, this.f22294p, this.f22296r, this.f22300v};
        for (int i8 = 0; i8 < 4; i8++) {
            MBridgeH5EndCardView mBridgeH5EndCardView = mBridgeH5EndCardViewArr[i8];
            if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.getVisibility() == 0) {
                mBridgeH5EndCardView.orientation(getResources().getConfiguration());
            }
        }
    }

    public void preLoadData(final b bVar) {
        this.f22288R = bVar;
        CampaignEx campaignEx = this.f22242b;
        if (campaignEx != null) {
            if (campaignEx.getPlayable_ads_without_video() == 2) {
                if (this.f22292n == null) {
                    this.f22292n = new MBridgePlayableView(this.f22241a);
                }
                this.f22292n.setCloseDelayShowTime(this.f22271A);
                this.f22292n.setPlayCloseBtnTm(this.f22272B);
                this.f22292n.setCampaign(this.f22242b);
                this.f22292n.setNotifyListener(new i(this.f22245e) { // from class: com.mbridge.msdk.video.module.MBridgeContainerView.4
                    @Override // com.mbridge.msdk.video.module.a.a.i, com.mbridge.msdk.video.module.a.a.f, com.mbridge.msdk.video.module.a.a
                    public final void a(int i8, Object obj) {
                        int i9;
                        super.a(i8, obj);
                        if (i8 == 100) {
                            MBridgeContainerView.this.webviewshow();
                            MBridgeContainerView mBridgeContainerView = MBridgeContainerView.this;
                            mBridgeContainerView.onConfigurationChanged(mBridgeContainerView.getResources().getConfiguration());
                            n nVar = new n();
                            nVar.f(MBridgeContainerView.this.f22242b.getRequestId());
                            nVar.g(MBridgeContainerView.this.f22242b.getRequestIdNotice());
                            nVar.e(MBridgeContainerView.this.f22242b.getId());
                            if (MBridgeContainerView.this.f22242b.isMraid()) {
                                i9 = n.f19335a;
                            } else {
                                i9 = n.f19336b;
                            }
                            nVar.d(i9);
                            MBridgeContainerView mBridgeContainerView2 = MBridgeContainerView.this;
                            com.mbridge.msdk.foundation.same.report.h.d(nVar, mBridgeContainerView2.f22241a, mBridgeContainerView2.f22302x);
                        }
                    }
                });
                this.f22292n.preLoadData(bVar);
            } else {
                b(this.f22303y);
                if (this.f22242b.isDynamicView()) {
                    try {
                        a(bVar, Integer.valueOf(this.f22242b.getVideo_end_type()));
                    } catch (Throwable th) {
                        ad.b(MBridgeBaseView.TAG, th.getMessage());
                        new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeContainerView.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                MBridgeContainerView mBridgeContainerView = MBridgeContainerView.this;
                                mBridgeContainerView.a(bVar, Integer.valueOf(mBridgeContainerView.f22242b.getVideo_end_type()));
                            }
                        });
                    }
                    if (!ai.l(this.f22242b.getendcard_url())) {
                        try {
                            String a8 = ao.a(this.f22242b.getendcard_url(), "mof");
                            if (!TextUtils.isEmpty(a8) && Integer.parseInt(a8) == 1) {
                                a.a().a(this.f22242b, 2);
                            }
                        } catch (Exception e8) {
                            ad.b(MBridgeBaseView.TAG, e8.getMessage());
                        }
                    }
                } else {
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeContainerView.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            MBridgeContainerView mBridgeContainerView = MBridgeContainerView.this;
                            mBridgeContainerView.a(bVar, Integer.valueOf(mBridgeContainerView.f22242b.getVideo_end_type()));
                        }
                    }, getVideoSkipTime());
                }
            }
            g();
        }
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void readyStatus(int i8) {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f22296r;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.readyStatus(i8);
        }
    }

    public void release() {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f22296r;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.release();
            this.f22296r = null;
        }
        MBridgePlayableView mBridgePlayableView = this.f22292n;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.release();
        }
        MBridgeLandingPageView mBridgeLandingPageView = this.f22298t;
        if (mBridgeLandingPageView != null) {
            mBridgeLandingPageView.release();
        }
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.f22295q;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.clearMoreOfferBitmap();
            this.f22295q.release();
        }
        if (this.f22245e != null) {
            this.f22245e = null;
        }
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void resizeMiniCard(int i8, int i9, int i10) {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f22294p;
        if (mBridgeClickMiniCardView != null) {
            mBridgeClickMiniCardView.resizeMiniCard(i8, i9);
            this.f22294p.setRadius(i10);
            removeAllViews();
            setMatchParent();
            this.f22290T = true;
            bringToFront();
            f();
        }
    }

    public void setCloseDelayTime(int i8) {
        this.f22271A = i8;
    }

    public void setEndscreenType(int i8) {
        this.f22304z = i8;
    }

    public void setJSFactory(b bVar) {
        this.f22288R = bVar;
    }

    public void setMBridgeClickMiniCardViewTransparent() {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f22294p;
        if (mBridgeClickMiniCardView != null) {
            mBridgeClickMiniCardView.setMBridgeClickMiniCardViewTransparent();
            this.f22294p.setMBridgeClickMiniCardViewClickable(false);
        }
    }

    public void setNotchPadding(int i8, int i9, int i10, int i11, int i12) {
        ad.b(MBridgeBaseView.TAG, "NOTCH ContainerView " + String.format("%1s-%2s-%3s-%4s-%5s", Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i8)));
        this.f22286P = i8;
        this.f22282L = i9;
        this.f22283M = i10;
        this.f22284N = i11;
        this.f22285O = i12;
        this.f22287Q = r.a(i8, i9, i10, i11, i12);
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.f22295q;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.setNotchPadding(i9, i10, i11, i12);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f22296r;
        if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.f22330q != null) {
            mBridgeH5EndCardView.setNotchValue(this.f22287Q, i9, i10, i11, i12);
            g.a().a((WebView) this.f22296r.f22330q, "oncutoutfetched", Base64.encodeToString(this.f22287Q.getBytes(), 0));
        }
        MBridgePlayableView mBridgePlayableView = this.f22292n;
        if (mBridgePlayableView != null && mBridgePlayableView.f22330q != null) {
            mBridgePlayableView.setNotchValue(this.f22287Q, i9, i10, i11, i12);
            g.a().a((WebView) this.f22292n.f22330q, "oncutoutfetched", Base64.encodeToString(this.f22287Q.getBytes(), 0));
        }
        MBridgeOrderCampView mBridgeOrderCampView = this.f22301w;
        if (mBridgeOrderCampView != null) {
            mBridgeOrderCampView.setNotchPadding(i9, i10, i11, i12);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void setNotifyListener(com.mbridge.msdk.video.module.a.a aVar) {
        super.setNotifyListener(aVar);
        MBridgeBaseView[] mBridgeBaseViewArr = {this.f22292n, this.f22293o, this.f22294p, this.f22295q, this.f22296r, this.f22297s, this.f22298t, this.f22299u};
        for (int i8 = 0; i8 < 8; i8++) {
            MBridgeBaseView mBridgeBaseView = mBridgeBaseViewArr[i8];
            if (mBridgeBaseView != null) {
                if (mBridgeBaseView instanceof MBridgeClickMiniCardView) {
                    mBridgeBaseView.setNotifyListener(new com.mbridge.msdk.video.module.a.a.g(this.f22294p, aVar));
                } else {
                    mBridgeBaseView.setNotifyListener(new i(aVar));
                }
            }
        }
    }

    public void setOnPause() {
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.f22295q;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.setOnPause();
        }
    }

    public void setOnResume() {
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.f22295q;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.setOnResume();
        }
    }

    public void setPlayCloseBtnTm(int i8) {
        this.f22272B = i8;
    }

    public void setRewardStatus(boolean z8) {
        this.f22281K = z8;
    }

    public void setShowingTransparent(boolean z8) {
        this.f22275E = z8;
    }

    public void setUnitID(String str) {
        this.f22302x = str;
    }

    public void setVideoInteractiveType(int i8) {
        CampaignEx campaignEx = this.f22242b;
        if (campaignEx != null && campaignEx.isDynamicView()) {
            int a8 = com.mbridge.msdk.video.dynview.i.a.a(this.f22242b);
            if (a8 == 100) {
                this.f22303y = i8;
                return;
            } else {
                this.f22303y = a8;
                return;
            }
        }
        this.f22303y = i8;
    }

    public void setVideoSkipTime(int i8) {
        this.f22279I = i8;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public boolean showAlertWebView() {
        MBridgeAlertWebview mBridgeAlertWebview = this.f22300v;
        if (mBridgeAlertWebview == null || !mBridgeAlertWebview.isLoadSuccess()) {
            return false;
        }
        setMatchParent();
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup.indexOfChild(this) != viewGroup.getChildCount() - 1 && !this.f22290T) {
            removeAllViews();
            bringToFront();
            this.f22289S = true;
        }
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f22294p;
        if (mBridgeClickMiniCardView != null && mBridgeClickMiniCardView.getParent() != null) {
            return false;
        }
        if (this.f22300v == null) {
            g();
        }
        MBridgeAlertWebview mBridgeAlertWebview2 = this.f22300v;
        if (mBridgeAlertWebview2 != null && mBridgeAlertWebview2.getParent() != null) {
            removeView(this.f22300v);
        }
        addView(this.f22300v);
        setBackgroundColor(0);
        this.f22300v.webviewshow();
        return true;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showEndcard(int i8) {
        CampaignEx campaignEx = this.f22242b;
        if (campaignEx != null) {
            if (i8 != 1) {
                if (i8 != 100) {
                    if (i8 != 3) {
                        if (i8 != 4) {
                            if (i8 != 5) {
                                removeAllViews();
                                setMatchParent();
                                this.f22290T = true;
                                bringToFront();
                                a();
                                this.f22245e.a(117, "");
                            } else {
                                this.f22245e.a(106, "");
                            }
                        } else {
                            this.f22245e.a(113, "");
                            removeAllViews();
                            setMatchParent();
                            if (this.f22298t == null) {
                                a(this.f22288R, 4);
                            }
                            this.f22298t.setUnitId(this.f22302x);
                            this.f22298t.preLoadData(this.f22288R);
                            addView(this.f22298t);
                            this.f22290T = true;
                            bringToFront();
                        }
                    } else {
                        removeAllViews();
                        setMatchParent();
                        if (this.f22297s == null) {
                            a(this.f22288R, 3);
                        }
                        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                        layoutParams.addRule(13, -1);
                        addView(this.f22297s, layoutParams);
                        this.f22297s.notifyShowListener();
                        this.f22290T = true;
                        bringToFront();
                    }
                } else {
                    if (campaignEx.getPlayable_ads_without_video() == 2) {
                        this.f22278H = true;
                    }
                    a(this.f22292n);
                    setMatchParent();
                    e();
                }
            } else {
                this.f22245e.a(104, "");
            }
        }
        this.f22273C = true;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showMiniCard(int i8, int i9, int i10, int i11, int i12) {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f22294p;
        if (mBridgeClickMiniCardView != null) {
            mBridgeClickMiniCardView.setMiniCardLocation(i8, i9, i10, i11);
            this.f22294p.setRadius(i12);
            this.f22294p.setCloseVisible(8);
            this.f22294p.setClickable(false);
            removeAllViews();
            setMatchParent();
            this.f22290T = true;
            bringToFront();
            f();
            if (!this.f22277G) {
                this.f22277G = true;
                this.f22245e.a(109, "");
                this.f22245e.a(117, "");
            }
        }
    }

    public void showOrderCampView() {
        MBridgeOrderCampView mBridgeOrderCampView = new MBridgeOrderCampView(this.f22241a);
        this.f22301w = mBridgeOrderCampView;
        mBridgeOrderCampView.setCampaignExes(this.f22291U);
        com.mbridge.msdk.video.module.a.a aVar = this.f22245e;
        if (aVar != null && (aVar instanceof k)) {
            ((k) aVar).a(this.f22291U);
        }
        this.f22301w.setNotifyListener(new i(this.f22245e));
        this.f22301w.setRewarded(this.f22281K);
        this.f22301w.setNotchPadding(this.f22282L, this.f22283M, this.f22284N, this.f22285O);
        this.f22301w.setCampOrderViewBuildCallback(new com.mbridge.msdk.video.dynview.e.b() { // from class: com.mbridge.msdk.video.module.MBridgeContainerView.3
            @Override // com.mbridge.msdk.video.dynview.e.b
            public final void a() {
                com.mbridge.msdk.video.module.a.a aVar2 = MBridgeContainerView.this.f22245e;
                if (aVar2 != null) {
                    aVar2.a(117, "");
                }
            }

            @Override // com.mbridge.msdk.video.dynview.e.b
            public final void b() {
                if (MBridgeContainerView.this.f22242b.getAdSpaceT() == 2) {
                    MBridgeContainerView.this.showVideoEndCover();
                } else {
                    MBridgeContainerView mBridgeContainerView = MBridgeContainerView.this;
                    mBridgeContainerView.showEndcard(mBridgeContainerView.f22242b.getVideo_end_type());
                }
            }
        });
        this.f22301w.createView(this);
    }

    public void showPlayableView() {
        if (this.f22242b != null && !this.f22278H) {
            removeAllViews();
            setMatchParent();
            if (this.f22292n == null) {
                preLoadData(this.f22288R);
            }
            addView(this.f22292n);
            MBridgePlayableView mBridgePlayableView = this.f22292n;
            if (mBridgePlayableView != null) {
                mBridgePlayableView.setUnitId(this.f22302x);
                CampaignEx campaignEx = this.f22242b;
                if (campaignEx != null && campaignEx.isMraid() && this.f22242b.getPlayable_ads_without_video() == 2) {
                    this.f22292n.setCloseVisible(0);
                }
                this.f22292n.setNotchValue(this.f22287Q, this.f22282L, this.f22283M, this.f22284N, this.f22285O);
            }
            this.f22290T = true;
            bringToFront();
        }
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showVideoClickView(int i8) {
        CampaignEx campaignEx;
        if (this.f22242b != null) {
            if (i8 != -1) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        MBridgeClickCTAView mBridgeClickCTAView = this.f22293o;
                        if (mBridgeClickCTAView != null && mBridgeClickCTAView.getParent() != null) {
                            removeView(this.f22293o);
                        }
                        MBridgeAlertWebview mBridgeAlertWebview = this.f22300v;
                        if (mBridgeAlertWebview != null && mBridgeAlertWebview.getParent() != null) {
                            return;
                        }
                        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f22294p;
                        if (mBridgeClickMiniCardView == null || mBridgeClickMiniCardView.getParent() == null) {
                            try {
                                CampaignEx campaignEx2 = this.f22242b;
                                if (campaignEx2 != null && campaignEx2.getPlayable_ads_without_video() == 1) {
                                    setMatchParent();
                                    f();
                                }
                            } catch (Exception e8) {
                                e8.printStackTrace();
                            }
                        }
                        if (miniCardLoaded()) {
                            MBridgeH5EndCardView mBridgeH5EndCardView = this.f22296r;
                            if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.getParent() != null) {
                                removeView(this.f22296r);
                            }
                            this.f22245e.a(112, "");
                            CampaignEx campaignEx3 = this.f22242b;
                            if (campaignEx3 != null && !campaignEx3.isHasReportAdTrackPause()) {
                                this.f22242b.setHasReportAdTrackPause(true);
                                com.mbridge.msdk.video.module.b.b.f(this.f22241a, this.f22242b);
                            }
                            if (this.f22275E) {
                                this.f22245e.a(115, "");
                            } else {
                                this.f22290T = true;
                                bringToFront();
                                webviewshow();
                                onConfigurationChanged(getResources().getConfiguration());
                            }
                            this.f22274D = true;
                            return;
                        }
                        h();
                        return;
                    }
                    return;
                }
                if (this.f22273C) {
                    return;
                }
                MBridgeH5EndCardView mBridgeH5EndCardView2 = this.f22296r;
                if (mBridgeH5EndCardView2 != null && mBridgeH5EndCardView2.getParent() != null) {
                    removeView(this.f22296r);
                }
                MBridgeClickMiniCardView mBridgeClickMiniCardView2 = this.f22294p;
                if (mBridgeClickMiniCardView2 != null && mBridgeClickMiniCardView2.getParent() != null) {
                    removeView(this.f22294p);
                }
                MBridgeClickCTAView mBridgeClickCTAView2 = this.f22293o;
                if (mBridgeClickCTAView2 == null || mBridgeClickCTAView2.getParent() == null) {
                    try {
                        CampaignEx campaignEx4 = this.f22242b;
                        if (campaignEx4 != null && campaignEx4.getPlayable_ads_without_video() == 1) {
                            this.f22290T = true;
                            if (this.f22293o == null) {
                                b(-1);
                            }
                            if (this.f22293o != null && ((campaignEx = this.f22242b) == null || !campaignEx.isDynamicView())) {
                                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                                layoutParams.addRule(12, -1);
                                addView(this.f22293o, 0, layoutParams);
                            }
                        }
                    } catch (Exception e9) {
                        e9.printStackTrace();
                    }
                }
                if (isLast()) {
                    bringToFront();
                    return;
                }
                return;
            }
            if (!isLast() && !endCardShowing()) {
                h();
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showVideoEndCover() {
        removeAllViews();
        setMatchParent();
        MBridgeVideoEndCoverView mBridgeVideoEndCoverView = this.f22299u;
        if (mBridgeVideoEndCoverView == null) {
            b bVar = this.f22288R;
            this.f22288R = bVar;
            if (mBridgeVideoEndCoverView == null) {
                MBridgeVideoEndCoverView mBridgeVideoEndCoverView2 = new MBridgeVideoEndCoverView(this.f22241a);
                this.f22299u = mBridgeVideoEndCoverView2;
                mBridgeVideoEndCoverView2.setCampaign(this.f22242b);
                this.f22299u.setNotifyListener(new i(this.f22245e));
                this.f22299u.preLoadData(bVar);
            }
        }
        addView(this.f22299u);
        onConfigurationChanged(getResources().getConfiguration());
        this.f22290T = true;
        bringToFront();
    }

    @Override // com.mbridge.msdk.video.signal.h
    public void toggleCloseBtn(int i8) {
        MBridgePlayableView mBridgePlayableView = this.f22292n;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.toggleCloseBtn(i8);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f22296r;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.toggleCloseBtn(i8);
        }
    }

    public void triggerCloseBtn(String str) {
        try {
            d dVar = new d();
            dVar.a("type", 2);
            c.a().a("2000152", dVar);
            c.a().a("2000134", this.f22242b);
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                th.printStackTrace();
            }
        }
        if (this.f22242b != null) {
            this.f22245e.a(122, "");
            this.f22245e.a(104, "");
        }
    }

    public void webviewshow() {
        try {
            d dVar = new d();
            dVar.a("type", 3);
            c.a().a("2000133", this.f22242b, dVar);
        } catch (Exception unused) {
        }
        MBridgeH5EndCardView[] mBridgeH5EndCardViewArr = {this.f22292n, this.f22294p, this.f22296r, this.f22300v};
        for (int i8 = 0; i8 < 4; i8++) {
            MBridgeH5EndCardView mBridgeH5EndCardView = mBridgeH5EndCardViewArr[i8];
            if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.getVisibility() == 0 && mBridgeH5EndCardView.getParent() != null && !isLast()) {
                mBridgeH5EndCardView.webviewshow();
            }
        }
    }

    private void a(View view) {
        if (view != null) {
            try {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
            } catch (Throwable th) {
                ad.a(MBridgeBaseView.TAG, th.getMessage(), th);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (view != null) {
            a(view);
            super.addView(view, layoutParams);
        } else {
            ad.b(MBridgeBaseView.TAG, "view is null");
        }
    }

    private void a() {
        CampaignEx campaignEx = this.f22242b;
        if (campaignEx != null) {
            boolean isDynamicView = campaignEx.isDynamicView();
            boolean l8 = ai.l(this.f22242b.getendcard_url());
            if (isDynamicView && !l8 && !this.f22242b.isMraid()) {
                e();
                return;
            }
        }
        if (this.f22304z == 2 && !this.f22280J) {
            b();
        } else {
            e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(b bVar, Integer num) {
        com.mbridge.msdk.video.module.a.a aVar;
        CampaignEx campaignEx;
        this.f22288R = bVar;
        CampaignEx campaignEx2 = this.f22242b;
        if (campaignEx2 != null) {
            if (num == null) {
                num = Integer.valueOf(campaignEx2.getVideo_end_type());
            }
            if (!isLast()) {
                h();
            }
            int intValue = num.intValue();
            if (intValue != 1) {
                if (intValue == 3) {
                    if (this.f22297s == null) {
                        this.f22297s = new MBridgeVastEndCardView(this.f22241a);
                    }
                    this.f22297s.setCampaign(this.f22242b);
                    this.f22297s.setNotifyListener(new l(this.f22245e));
                    this.f22297s.preLoadData(bVar);
                    return;
                }
                if (intValue == 4) {
                    if (this.f22298t == null) {
                        this.f22298t = new MBridgeLandingPageView(this.f22241a);
                    }
                    this.f22298t.setCampaign(this.f22242b);
                    this.f22298t.setNotifyListener(new i(this.f22245e));
                    return;
                }
                if (intValue != 5) {
                    if (this.f22304z == 2) {
                        boolean isDynamicView = this.f22242b.isDynamicView();
                        boolean l8 = ai.l(this.f22242b.getendcard_url());
                        if ((!isDynamicView || l8 || (campaignEx = this.f22242b) == null || campaignEx.isMraid()) && this.f22242b.getAdSpaceT() != 2) {
                            if (this.f22296r == null) {
                                this.f22296r = new MBridgeH5EndCardView(this.f22241a);
                                try {
                                    d dVar = new d();
                                    dVar.a("type", 3);
                                    c.a().a("2000154", this.f22242b, dVar);
                                } catch (Throwable th) {
                                    ad.b(MBridgeBaseView.TAG, th.getMessage());
                                }
                            }
                            if (this.f22242b.getDynamicTempCode() == 5 && (aVar = this.f22245e) != null && (aVar instanceof k)) {
                                ((k) aVar).a(this.f22242b);
                            }
                            this.f22296r.setCampaign(this.f22242b);
                            this.f22296r.setCloseDelayShowTime(this.f22271A);
                            this.f22296r.setNotifyListener(new i(this.f22245e));
                            this.f22296r.setUnitId(this.f22302x);
                            this.f22296r.setNotchValue(this.f22287Q, this.f22282L, this.f22283M, this.f22284N, this.f22285O);
                            this.f22296r.preLoadData(bVar);
                            if (this.f22275E) {
                                return;
                            }
                            addView(this.f22296r);
                            return;
                        }
                        return;
                    }
                    CampaignEx campaignEx3 = this.f22242b;
                    int b8 = (campaignEx3 == null || campaignEx3.getRewardTemplateMode() == null) ? 0 : this.f22242b.getRewardTemplateMode().b();
                    if (this.f22295q == null) {
                        if (this.f22242b.isDynamicView()) {
                            i();
                        } else {
                            MBridgeNativeEndCardView mBridgeNativeEndCardView = new MBridgeNativeEndCardView(this.f22241a, null, false, -1, this.f22242b.getAdSpaceT() == 2, b8, this.f22242b.getMof_tplid());
                            this.f22295q = mBridgeNativeEndCardView;
                            mBridgeNativeEndCardView.setCampaign(this.f22242b);
                        }
                    }
                    this.f22295q.setLayout();
                    if (this.f22242b.isDynamicView()) {
                        if (a.a().a(this.f22242b.getRequestId() + "_" + this.f22242b.getId())) {
                            try {
                                a.a().a(this.f22295q, this.f22242b.getRequestId() + "_" + this.f22242b.getId(), new i(this.f22245e));
                            } catch (Exception e8) {
                                ad.b(MBridgeBaseView.TAG, e8.getMessage());
                            }
                        } else {
                            try {
                                String a8 = ao.a(this.f22242b.getendcard_url(), "mof");
                                if (!TextUtils.isEmpty(a8) && Integer.parseInt(a8) == 1) {
                                    a.a().a(this.f22242b, this.f22295q, new i(this.f22245e), 2);
                                }
                            } catch (Exception e9) {
                                ad.b(MBridgeBaseView.TAG, e9.getMessage());
                            }
                        }
                    }
                    this.f22295q.setUnitId(this.f22302x);
                    this.f22295q.setCloseBtnDelay(this.f22271A);
                    this.f22295q.setNotifyListener(new i(this.f22245e));
                    this.f22295q.preLoadData(bVar);
                    this.f22295q.setNotchPadding(this.f22282L, this.f22283M, this.f22284N, this.f22285O);
                }
            }
        }
    }

    public MBridgeContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22304z = 1;
        this.f22271A = 1;
        this.f22272B = 1;
        this.f22273C = false;
        this.f22274D = false;
        this.f22275E = false;
        this.f22276F = true;
        this.f22277G = false;
        this.f22278H = false;
        this.f22280J = false;
        this.f22281K = false;
        this.f22289S = false;
        this.f22290T = false;
        this.f22291U = new ArrayList();
    }

    private void b(int i8) {
        if (i8 != -3) {
            if (i8 != -2) {
                if (this.f22293o == null) {
                    this.f22293o = new MBridgeClickCTAView(this.f22241a);
                }
                this.f22293o.setCampaign(this.f22242b);
                this.f22293o.setUnitId(this.f22302x);
                this.f22293o.setNotifyListener(new i(this.f22245e));
                this.f22293o.preLoadData(this.f22288R);
                return;
            }
            CampaignEx campaignEx = this.f22242b;
            if (campaignEx == null || campaignEx.getVideo_end_type() != 2) {
                return;
            }
            if (this.f22294p == null) {
                this.f22294p = new MBridgeClickMiniCardView(this.f22241a);
            }
            this.f22294p.setCampaign(this.f22242b);
            MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f22294p;
            mBridgeClickMiniCardView.setNotifyListener(new com.mbridge.msdk.video.module.a.a.g(mBridgeClickMiniCardView, this.f22245e));
            this.f22294p.preLoadData(this.f22288R);
            setMatchParent();
            f();
            h();
        }
    }
}
