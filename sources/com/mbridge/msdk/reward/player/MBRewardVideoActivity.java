package com.mbridge.msdk.reward.player;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.reward.adapter.RewardUnitCacheManager;
import com.mbridge.msdk.scheme.applet.AppletModelManager;
import com.mbridge.msdk.video.bt.module.MBTempContainer;
import com.mbridge.msdk.video.bt.module.MBridgeBTContainer;
import com.mbridge.msdk.video.bt.module.b.h;
import com.mbridge.msdk.video.dynview.e.d;
import com.mbridge.msdk.video.signal.activity.AbstractJSActivity;
import com.mbridge.msdk.videocommon.a;
import com.mbridge.msdk.videocommon.b.c;
import com.mbridge.msdk.videocommon.download.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class MBRewardVideoActivity extends AbstractJSActivity {
    public static String INTENT_EXTRADATA = "extraData";
    public static String INTENT_ISBID = "isBid";
    public static String INTENT_ISBIG_OFFER = "isBigOffer";
    public static String INTENT_ISIV = "isIV";
    public static String INTENT_IVREWARD_MODETYPE = "ivRewardMode";
    public static String INTENT_IVREWARD_VALUE = "ivRewardValue";
    public static String INTENT_IVREWARD_VALUETYPE = "ivRewardValueType";
    public static String INTENT_LOCAL_REQUEST_ID = "lRid";
    public static String INTENT_MUTE = "mute";
    public static String INTENT_REWARD = "reward";
    public static String INTENT_UNITID = "unitId";
    public static String INTENT_USERID = "userId";
    public static String SAVE_STATE_KEY_REPORT = "hasRelease";

    /* renamed from: A, reason: collision with root package name */
    private boolean f21667A;

    /* renamed from: I, reason: collision with root package name */
    private String f21675I;

    /* renamed from: J, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.report.d.b f21676J;

    /* renamed from: L, reason: collision with root package name */
    private boolean f21678L;

    /* renamed from: a, reason: collision with root package name */
    private String f21681a;

    /* renamed from: b, reason: collision with root package name */
    private String f21682b;

    /* renamed from: c, reason: collision with root package name */
    private String f21683c;

    /* renamed from: d, reason: collision with root package name */
    private c f21684d;

    /* renamed from: h, reason: collision with root package name */
    private int f21688h;

    /* renamed from: i, reason: collision with root package name */
    private int f21689i;

    /* renamed from: j, reason: collision with root package name */
    private int f21690j;

    /* renamed from: m, reason: collision with root package name */
    private h f21693m;

    /* renamed from: n, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.d.c f21694n;

    /* renamed from: q, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.download.a f21697q;

    /* renamed from: r, reason: collision with root package name */
    private CampaignEx f21698r;

    /* renamed from: s, reason: collision with root package name */
    private List<com.mbridge.msdk.videocommon.download.a> f21699s;

    /* renamed from: t, reason: collision with root package name */
    private List<CampaignEx> f21700t;

    /* renamed from: u, reason: collision with root package name */
    private MBTempContainer f21701u;

    /* renamed from: v, reason: collision with root package name */
    private MBridgeBTContainer f21702v;

    /* renamed from: w, reason: collision with root package name */
    private WindVaneWebView f21703w;

    /* renamed from: x, reason: collision with root package name */
    private com.mbridge.msdk.video.bt.module.a.a f21704x;

    /* renamed from: y, reason: collision with root package name */
    private String f21705y;

    /* renamed from: z, reason: collision with root package name */
    private String f21706z;

    /* renamed from: e, reason: collision with root package name */
    private int f21685e = 2;

    /* renamed from: f, reason: collision with root package name */
    private boolean f21686f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f21687g = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f21691k = false;

    /* renamed from: l, reason: collision with root package name */
    private boolean f21692l = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f21695o = false;

    /* renamed from: p, reason: collision with root package name */
    private boolean f21696p = false;

    /* renamed from: B, reason: collision with root package name */
    private int f21668B = 1;

    /* renamed from: C, reason: collision with root package name */
    private int f21669C = 0;

    /* renamed from: D, reason: collision with root package name */
    private int f21670D = 0;

    /* renamed from: E, reason: collision with root package name */
    private int f21671E = 0;

    /* renamed from: F, reason: collision with root package name */
    private int f21672F = 0;

    /* renamed from: G, reason: collision with root package name */
    private int f21673G = 0;

    /* renamed from: H, reason: collision with root package name */
    private int f21674H = 0;

    /* renamed from: K, reason: collision with root package name */
    private boolean f21677K = false;

    /* renamed from: M, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.e.a f21679M = new com.mbridge.msdk.video.dynview.e.a() { // from class: com.mbridge.msdk.reward.player.MBRewardVideoActivity.1
        @Override // com.mbridge.msdk.video.dynview.e.a
        public final void a(Map<String, Object> map) {
            if (map == null) {
                return;
            }
            if (map.containsKey(CampaignEx.JSON_NATIVE_VIDEO_MUTE)) {
                MBRewardVideoActivity.this.f21685e = ((Integer) map.get(CampaignEx.JSON_NATIVE_VIDEO_MUTE)).intValue();
            }
            if (map.containsKey("position")) {
                int intValue = ((Integer) map.get("position")).intValue();
                if (MBRewardVideoActivity.this.f21700t != null && MBRewardVideoActivity.this.f21700t.size() > 0 && intValue >= 1) {
                    MBRewardVideoActivity mBRewardVideoActivity = MBRewardVideoActivity.this;
                    mBRewardVideoActivity.f21698r = (CampaignEx) mBRewardVideoActivity.f21700t.get(intValue);
                    MBRewardVideoActivity.b(MBRewardVideoActivity.this);
                    int i8 = intValue - 1;
                    if (MBRewardVideoActivity.this.f21700t.get(i8) != null) {
                        MBRewardVideoActivity mBRewardVideoActivity2 = MBRewardVideoActivity.this;
                        MBRewardVideoActivity.b(mBRewardVideoActivity2, ((CampaignEx) mBRewardVideoActivity2.f21700t.get(i8)).getVideoLength());
                    }
                    MBRewardVideoActivity mBRewardVideoActivity3 = MBRewardVideoActivity.this;
                    MBRewardVideoActivity.this.f21698r.setVideoCompleteTime(mBRewardVideoActivity3.a(mBRewardVideoActivity3.f21698r.getVideoCompleteTime(), MBRewardVideoActivity.this.f21668B));
                    MBRewardVideoActivity.this.f21698r.setShowIndex(MBRewardVideoActivity.this.f21668B);
                    MBRewardVideoActivity.this.f21698r.setShowType(1);
                    MBRewardVideoActivity mBRewardVideoActivity4 = MBRewardVideoActivity.this;
                    mBRewardVideoActivity4.a(mBRewardVideoActivity4.f21698r);
                }
            }
        }
    };

    /* renamed from: N, reason: collision with root package name */
    private d f21680N = new d() { // from class: com.mbridge.msdk.reward.player.MBRewardVideoActivity.2
        @Override // com.mbridge.msdk.video.dynview.e.d
        public final void a(CampaignEx campaignEx) {
            if (campaignEx != null) {
                if (MBRewardVideoActivity.this.f21702v != null) {
                    new com.mbridge.msdk.video.dynview.h.b().b(MBRewardVideoActivity.this.f21702v, 500L);
                }
                MBRewardVideoActivity.this.f21698r = campaignEx;
                MBRewardVideoActivity.this.f21698r.setShowType(2);
                MBRewardVideoActivity mBRewardVideoActivity = MBRewardVideoActivity.this;
                mBRewardVideoActivity.a(mBRewardVideoActivity.f21698r);
                return;
            }
            MBRewardVideoActivity.this.a("campaign is null");
        }

        @Override // com.mbridge.msdk.video.dynview.e.d
        public final void a() {
            if (MBRewardVideoActivity.this.f21702v != null) {
                new com.mbridge.msdk.video.dynview.h.b().b(MBRewardVideoActivity.this.f21702v, 500L);
            }
            MBRewardVideoActivity.this.f21691k = true;
            MBRewardVideoActivity.this.b();
            if (MBRewardVideoActivity.this.f21701u != null) {
                MBRewardVideoActivity.this.f21701u.setNotchPadding(MBRewardVideoActivity.this.f21674H, MBRewardVideoActivity.this.f21670D, MBRewardVideoActivity.this.f21672F, MBRewardVideoActivity.this.f21671E, MBRewardVideoActivity.this.f21673G);
            }
        }
    };

    /* loaded from: classes4.dex */
    private static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final List<com.mbridge.msdk.videocommon.download.a> f21711a;

        /* renamed from: b, reason: collision with root package name */
        private final String f21712b;

        /* renamed from: c, reason: collision with root package name */
        private final String f21713c;

        public a(List<com.mbridge.msdk.videocommon.download.a> list, String str, String str2) {
            this.f21711a = list;
            this.f21712b = str;
            this.f21713c = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                List<com.mbridge.msdk.videocommon.download.a> list = this.f21711a;
                if (list != null && list.size() > 0) {
                    for (com.mbridge.msdk.videocommon.download.a aVar : this.f21711a) {
                        if (aVar != null && aVar.l() != null) {
                            CampaignEx l8 = aVar.l();
                            try {
                                AppletModelManager.getInstance().remove(l8);
                            } catch (Exception e8) {
                                if (MBridgeConstans.DEBUG) {
                                    ad.a("MBRewardVideoActivity", "AppletModelManager remove error", e8);
                                }
                            }
                            String str = l8.getRequestId() + l8.getId() + l8.getVideoUrlEncode();
                            j c8 = com.mbridge.msdk.videocommon.download.b.getInstance().c(this.f21712b);
                            if (c8 != null) {
                                try {
                                    c8.b(str);
                                } catch (Exception e9) {
                                    if (MBridgeConstans.DEBUG) {
                                        ad.b("DownLoadManager", e9.getMessage());
                                    }
                                }
                            }
                            if (l8.getRewardTemplateMode() != null) {
                                if (!TextUtils.isEmpty(l8.getRewardTemplateMode().e())) {
                                    com.mbridge.msdk.videocommon.a.b(this.f21712b + "_" + l8.getId() + "_" + this.f21713c + "_" + l8.getRewardTemplateMode().e());
                                    com.mbridge.msdk.videocommon.a.b(l8.getAdType(), l8);
                                }
                                if (!TextUtils.isEmpty(l8.getCMPTEntryUrl())) {
                                    com.mbridge.msdk.videocommon.a.b(this.f21712b + "_" + this.f21713c + "_" + l8.getCMPTEntryUrl());
                                }
                                com.mbridge.msdk.videocommon.a.a.a().a(l8);
                            }
                        }
                    }
                }
            } catch (Exception e10) {
                ad.a("MBRewardVideoActivity", e10.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final List<com.mbridge.msdk.videocommon.download.a> f21714a;

        /* renamed from: b, reason: collision with root package name */
        private final String f21715b;

        public b(String str, List<com.mbridge.msdk.videocommon.download.a> list) {
            this.f21714a = list;
            this.f21715b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                List<com.mbridge.msdk.videocommon.download.a> list = this.f21714a;
                if (list != null && list.size() > 0) {
                    for (com.mbridge.msdk.videocommon.download.a aVar : this.f21714a) {
                        if (aVar != null && aVar.l() != null) {
                            com.mbridge.msdk.videocommon.a.a.a().a(aVar.l(), this.f21715b);
                        }
                    }
                }
            } catch (Throwable th) {
                ad.b("MBRewardVideoActivity", th.getMessage());
            }
        }
    }

    private void b(CampaignEx campaignEx) {
    }

    public void changeHalfScreenPadding(int i8) {
        try {
            CampaignEx campaignEx = this.f21698r;
            if (campaignEx != null && campaignEx.getAdSpaceT() == 2) {
                getWindow().getDecorView().setBackground(new ColorDrawable(0));
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f21701u.getLayoutParams();
                int a8 = ai.a(this, 58.0f);
                int a9 = ai.a(this, 104.0f);
                if (this.f21698r.getRewardTemplateMode().b() == 0) {
                    if (i8 == 2) {
                        layoutParams.setMargins(a9, a8, a9, a8);
                    } else {
                        layoutParams.setMargins(a8, a9, a8, a9);
                    }
                } else if (this.f21698r.getRewardTemplateMode().b() == 2) {
                    layoutParams.setMargins(a9, a8, a9, a8);
                } else {
                    layoutParams.setMargins(a8, a9, a8, a9);
                }
                this.f21701u.setLayoutParams(layoutParams);
            }
        } catch (Throwable th) {
            ad.b("MBRewardVideoActivity", th.getMessage());
        }
    }

    public int findID(String str) {
        return v.a(getApplicationContext(), str, "id");
    }

    public int findLayout(String str) {
        return v.a(getApplicationContext(), str, TtmlNode.TAG_LAYOUT);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        com.mbridge.msdk.foundation.controller.c.m().b(0);
        MBTempContainer mBTempContainer = this.f21701u;
        if (mBTempContainer != null) {
            mBTempContainer.onDestroy();
            this.f21701u = null;
        }
        MBridgeBTContainer mBridgeBTContainer = this.f21702v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onDestroy();
            this.f21702v = null;
        }
        com.mbridge.msdk.foundation.d.b.a().c(this.f21681a);
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        MBTempContainer mBTempContainer = this.f21701u;
        if (mBTempContainer != null) {
            mBTempContainer.onBackPressed();
        }
        MBridgeBTContainer mBridgeBTContainer = this.f21702v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onBackPressed();
        }
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f21701u != null) {
            changeHalfScreenPadding(configuration.orientation);
            this.f21701u.onConfigurationChanged(configuration);
        }
        MBridgeBTContainer mBridgeBTContainer = this.f21702v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onConfigurationChanged(configuration);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.activity.MBBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i8;
        WindVaneWebView windVaneWebView;
        List<com.mbridge.msdk.videocommon.download.a> list;
        String str = "";
        super.onCreate(bundle);
        MBridgeConstans.isRewardActivityShowing = true;
        com.mbridge.msdk.foundation.controller.c.m().a(this);
        try {
            Intent intent = getIntent();
            this.f21681a = intent.getStringExtra(INTENT_UNITID);
            this.f21682b = intent.getStringExtra(MBridgeConstans.PLACEMENT_ID);
            this.f21684d = c.b(intent.getStringExtra(INTENT_REWARD));
            this.f21683c = intent.getStringExtra(INTENT_USERID);
            this.f21685e = intent.getIntExtra(INTENT_MUTE, 2);
            this.f21686f = intent.getBooleanExtra(INTENT_ISIV, false);
            com.mbridge.msdk.foundation.controller.c m8 = com.mbridge.msdk.foundation.controller.c.m();
            int i9 = 94;
            if (this.f21686f) {
                i8 = 287;
            } else {
                i8 = 94;
            }
            m8.b(i8);
            this.f21687g = intent.getBooleanExtra(INTENT_ISBID, false);
            this.f21706z = intent.getStringExtra(INTENT_EXTRADATA);
            boolean booleanExtra = intent.getBooleanExtra("is_refactor", false);
            this.f21677K = booleanExtra;
            if (booleanExtra) {
                this.f21693m = MBridgeGlobalCommon.showRewardListener;
            } else {
                this.f21693m = com.mbridge.msdk.reward.b.a.f21537f.get(this.f21681a);
            }
            if (this.f21686f) {
                this.f21688h = intent.getIntExtra(INTENT_IVREWARD_MODETYPE, 0);
                this.f21689i = intent.getIntExtra(INTENT_IVREWARD_VALUETYPE, 0);
                this.f21690j = intent.getIntExtra(INTENT_IVREWARD_VALUE, 0);
            }
            this.f21691k = intent.getBooleanExtra(INTENT_ISBIG_OFFER, false);
            this.f21699s = com.mbridge.msdk.videocommon.download.b.getInstance().b(this.f21681a);
            this.f21700t = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f21681a);
            int findLayout = findLayout("mbridge_more_offer_activity");
            if (findLayout < 0) {
                a("no mbridge_more_offer_activity layout");
                return;
            }
            setContentView(findLayout);
            if (TextUtils.isEmpty(this.f21681a)) {
                a("data empty error");
                return;
            }
            com.mbridge.msdk.video.signal.factory.b bVar = new com.mbridge.msdk.video.signal.factory.b(this);
            this.jsFactory = bVar;
            registerJsFactory(bVar);
            if (this.f21693m == null) {
                a("showRewardListener is null");
                return;
            }
            com.mbridge.msdk.videocommon.d.c cVar = RewardUnitCacheManager.getInstance().get(this.f21682b, this.f21681a);
            this.f21694n = cVar;
            if (cVar == null) {
                com.mbridge.msdk.videocommon.d.c a8 = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.f21681a);
                this.f21694n = a8;
                if (a8 == null) {
                    this.f21694n = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.f21681a, this.f21686f);
                }
            }
            com.mbridge.msdk.videocommon.d.c cVar2 = this.f21694n;
            if (cVar2 != null) {
                this.f21684d.a(cVar2.m());
                this.f21684d.a(this.f21694n.n());
            }
            c cVar3 = this.f21684d;
            if (cVar3 != null && cVar3.b() <= 0) {
                this.f21684d.a(1);
            }
            int a9 = v.a(this, "mbridge_reward_activity_open", "anim");
            int a10 = v.a(this, "mbridge_reward_activity_stay", "anim");
            if (a9 > 1 && a10 > 1) {
                overridePendingTransition(a9, a10);
            }
            if (bundle != null) {
                try {
                    this.f21696p = bundle.getBoolean(SAVE_STATE_KEY_REPORT);
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
            }
            ad.a("DynamicViewCampaignResourceDownloader", "进入 show，大模板 " + this.f21691k);
            if (!this.f21691k) {
                List<com.mbridge.msdk.videocommon.download.a> list2 = this.f21699s;
                if (list2 != null && list2.size() > 0) {
                    this.f21697q = this.f21699s.get(0);
                }
                com.mbridge.msdk.videocommon.download.a aVar = this.f21697q;
                if (aVar != null) {
                    this.f21698r = aVar.l();
                    this.f21697q.e(true);
                    this.f21697q.f(false);
                    CampaignEx campaignEx = this.f21698r;
                    if (campaignEx != null) {
                        this.f21675I = campaignEx.getCurrentLocalRid();
                        this.f21698r.setShowIndex(1);
                        this.f21698r.setShowType(1);
                        com.mbridge.msdk.reward.b.a.f21534b = this.f21698r.getEcppv();
                        com.mbridge.msdk.click.c.a(com.mbridge.msdk.foundation.controller.c.m().c(), this.f21698r.getMaitve(), this.f21698r.getMaitve_src());
                    }
                }
                if (this.f21697q == null || this.f21698r == null || this.f21684d == null) {
                    a("data empty error");
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.f21698r);
                b(arrayList);
                b();
                if (!com.mbridge.msdk.f.b.a()) {
                    a();
                    return;
                }
                return;
            }
            b(this.f21700t);
            this.f21705y = "";
            List<CampaignEx> list3 = this.f21700t;
            if (list3 != null && list3.size() > 0) {
                CampaignEx campaignEx2 = this.f21700t.get(0);
                str = campaignEx2.getCMPTEntryUrl();
                this.f21705y = campaignEx2.getRequestId();
                this.f21675I = campaignEx2.getCurrentLocalRid();
                com.mbridge.msdk.reward.b.a.f21534b = campaignEx2.getEcppv();
                com.mbridge.msdk.click.c.a(com.mbridge.msdk.foundation.controller.c.m().c(), campaignEx2.getMaitve(), campaignEx2.getMaitve_src());
            }
            a.C0439a a11 = com.mbridge.msdk.videocommon.a.a(this.f21681a + "_" + this.f21705y + "_" + str);
            com.mbridge.msdk.videocommon.download.a aVar2 = null;
            if (a11 != null) {
                windVaneWebView = a11.a();
            } else {
                windVaneWebView = null;
            }
            this.f21703w = windVaneWebView;
            if (windVaneWebView == null) {
                if (this.f21697q == null && (list = this.f21699s) != null && list.size() > 0) {
                    this.f21697q = this.f21699s.get(0);
                }
                if (this.f21697q == null) {
                    com.mbridge.msdk.videocommon.download.b bVar2 = com.mbridge.msdk.videocommon.download.b.getInstance();
                    if (this.f21686f) {
                        i9 = 287;
                    }
                    String str2 = this.f21681a;
                    boolean z8 = this.f21687g;
                    j c8 = bVar2.c(str2);
                    if (c8 != null) {
                        aVar2 = c8.b(i9, z8);
                    }
                    this.f21697q = aVar2;
                }
                com.mbridge.msdk.videocommon.download.a aVar3 = this.f21697q;
                if (aVar3 != null) {
                    this.f21698r = aVar3.l();
                    this.f21697q.e(true);
                    this.f21697q.f(false);
                }
                if (this.f21697q != null && this.f21698r != null && this.f21684d != null) {
                    this.f21691k = false;
                    List<CampaignEx> a12 = com.mbridge.msdk.videocommon.a.a.a().a(this.f21700t);
                    if (a12 == null) {
                        a("no available campaign");
                        return;
                    }
                    int size = a12.size();
                    if (size == 0) {
                        a("no available campaign");
                        return;
                    }
                    if (a12.get(0) != null && (this.f21677K || a12.get(0).isDynamicView())) {
                        if (size == 1) {
                            CampaignEx campaignEx3 = a12.get(0);
                            this.f21698r = campaignEx3;
                            if (campaignEx3 != null) {
                                this.f21675I = campaignEx3.getCurrentLocalRid();
                                this.f21698r.setCampaignIsFiltered(true);
                            }
                            a(this.f21698r);
                        } else {
                            a(a12);
                        }
                    } else {
                        b();
                    }
                }
                a("data empty error");
                return;
            }
            c();
            if (!com.mbridge.msdk.f.b.a()) {
                a();
            }
        } catch (Throwable th) {
            b(this.f21700t);
            a("onCreate error" + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, com.mbridge.msdk.activity.MBBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.mbridge.msdk.foundation.same.report.d.c.a().a("2000151", this.f21698r);
        try {
            h hVar = this.f21693m;
            if (hVar instanceof com.mbridge.msdk.video.bt.module.b.b) {
                com.mbridge.msdk.video.bt.module.b.b bVar = (com.mbridge.msdk.video.bt.module.b.b) hVar;
                if (!bVar.f21957b && !bVar.f21958c) {
                    hVar.a(this.f21676J, "show fail : unexpected destroy");
                }
            }
        } catch (Throwable th) {
            ad.b("MBRewardVideoActivity", th.getMessage());
        }
        com.mbridge.msdk.video.module.b.b.a(this.f21681a);
        try {
            List<CampaignEx> list = this.f21700t;
            if (list != null && list.size() > 0) {
                Iterator<CampaignEx> it = this.f21700t.iterator();
                while (it.hasNext()) {
                    c(it.next());
                }
            }
            CampaignEx campaignEx = this.f21698r;
            if (campaignEx != null) {
                c(campaignEx);
            }
        } catch (Throwable th2) {
            ad.b("MBRewardVideoActivity", th2.getMessage());
        }
        MBTempContainer mBTempContainer = this.f21701u;
        if (mBTempContainer != null) {
            mBTempContainer.onDestroy();
            this.f21701u = null;
        }
        MBridgeBTContainer mBridgeBTContainer = this.f21702v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onDestroy();
            this.f21702v = null;
        }
        this.f21679M = null;
        this.f21680N = null;
        com.mbridge.msdk.foundation.d.b.a().c(this.f21681a + "_1");
        com.mbridge.msdk.foundation.d.b.a().c(this.f21681a + "_2");
        com.mbridge.msdk.foundation.same.f.b.b().execute(new a(this.f21699s, this.f21681a, this.f21705y));
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        MBTempContainer mBTempContainer = this.f21701u;
        if (mBTempContainer != null) {
            mBTempContainer.onPause();
        }
        MBridgeBTContainer mBridgeBTContainer = this.f21702v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onPause();
        }
    }

    @Override // android.app.Activity
    protected void onRestart() {
        super.onRestart();
        MBTempContainer mBTempContainer = this.f21701u;
        if (mBTempContainer != null) {
            mBTempContainer.onRestart();
        }
        MBridgeBTContainer mBridgeBTContainer = this.f21702v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onRestart();
        }
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, com.mbridge.msdk.activity.MBBaseActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (com.mbridge.msdk.foundation.d.b.f19151c) {
            return;
        }
        com.mbridge.msdk.foundation.controller.c.m().a(this);
        try {
            com.mbridge.msdk.foundation.same.f.b.b().execute(new b(this.f21681a, this.f21699s));
        } catch (Throwable th) {
            ad.b("MBRewardVideoActivity", th.getMessage());
        }
        MBTempContainer mBTempContainer = this.f21701u;
        if (mBTempContainer != null) {
            mBTempContainer.onResume();
        }
        MBridgeBTContainer mBridgeBTContainer = this.f21702v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onResume();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean(SAVE_STATE_KEY_REPORT, this.f21696p);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        if (com.mbridge.msdk.foundation.d.b.f19151c) {
            return;
        }
        new com.mbridge.msdk.foundation.d.a() { // from class: com.mbridge.msdk.reward.player.MBRewardVideoActivity.4
            @Override // com.mbridge.msdk.foundation.d.a
            public final void a() {
                MBRewardVideoActivity.this.onPause();
            }

            @Override // com.mbridge.msdk.foundation.d.a
            public final void b() {
                MBRewardVideoActivity.this.onResume();
            }

            @Override // com.mbridge.msdk.foundation.d.a
            public final void a(String str) {
                MBRewardVideoActivity.this.onResume();
            }
        };
        MBTempContainer mBTempContainer = this.f21701u;
        if (mBTempContainer != null) {
            mBTempContainer.onStart();
            this.f21698r.setCampaignUnitId(this.f21681a);
            com.mbridge.msdk.foundation.d.b.a().a(this.f21681a + "_1", this.f21698r);
        }
        MBridgeBTContainer mBridgeBTContainer = this.f21702v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onStart();
            List<CampaignEx> list = this.f21700t;
            if (list != null && list.size() > 0) {
                CampaignEx campaignEx = this.f21700t.get(0);
                campaignEx.setCampaignUnitId(this.f21681a);
                com.mbridge.msdk.foundation.d.b.a().a(this.f21681a + "_1", campaignEx);
            }
        }
        if (!this.f21667A) {
            com.mbridge.msdk.foundation.d.b.a().a(this.f21681a + "_1", 1);
            com.mbridge.msdk.foundation.d.b.a().c(this.f21681a + "_2");
            this.f21667A = true;
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        MBridgeConstans.isRewardActivityShowing = false;
        super.onStop();
        MBTempContainer mBTempContainer = this.f21701u;
        if (mBTempContainer != null) {
            mBTempContainer.onStop();
        }
        MBridgeBTContainer mBridgeBTContainer = this.f21702v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onStop();
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i8) {
        super.setTheme(v.a(this, "mbridge_transparent_theme", TtmlNode.TAG_STYLE));
    }

    @Override // com.mbridge.msdk.activity.MBBaseActivity
    public void setTopControllerPadding(int i8, int i9, int i10, int i11, int i12) {
        this.f21670D = i9;
        this.f21672F = i10;
        this.f21671E = i11;
        this.f21673G = i12;
        this.f21674H = i8;
        MBTempContainer mBTempContainer = this.f21701u;
        if (mBTempContainer != null) {
            mBTempContainer.setNotchPadding(i8, i9, i10, i11, i12);
        }
        MBridgeBTContainer mBridgeBTContainer = this.f21702v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.setNotchPadding(i8, i9, i10, i11, i12);
        }
        com.mbridge.msdk.video.dynview.a.a.f21984e = i8;
        com.mbridge.msdk.video.dynview.a.a.f21980a = i9;
        com.mbridge.msdk.video.dynview.a.a.f21981b = i10;
        com.mbridge.msdk.video.dynview.a.a.f21982c = i11;
        com.mbridge.msdk.video.dynview.a.a.f21983d = i12;
    }

    static /* synthetic */ int b(MBRewardVideoActivity mBRewardVideoActivity) {
        int i8 = mBRewardVideoActivity.f21668B;
        mBRewardVideoActivity.f21668B = i8 + 1;
        return i8;
    }

    private void c() {
        RewardPlus rewardPlus;
        List<CampaignEx> list;
        int findID = findID("mbridge_bt_container");
        if (findID < 0) {
            a("no mbridge_webview_framelayout in mbridge_more_offer_activity layout");
        }
        MBridgeBTContainer mBridgeBTContainer = (MBridgeBTContainer) findViewById(findID);
        this.f21702v = mBridgeBTContainer;
        if (mBridgeBTContainer == null) {
            a("env error");
        }
        this.f21702v.setVisibility(0);
        com.mbridge.msdk.video.bt.module.a.a d8 = d();
        this.f21704x = d8;
        this.f21702v.setBTContainerCallback(d8);
        this.f21702v.setShowRewardVideoListener(this.f21693m);
        this.f21702v.setChoiceOneCallback(this.f21680N);
        this.f21702v.setCampaigns(this.f21700t);
        this.f21702v.setCampaignDownLoadTasks(this.f21699s);
        this.f21702v.setRewardUnitSetting(this.f21694n);
        this.f21702v.setUnitId(this.f21681a);
        this.f21702v.setPlacementId(this.f21682b);
        this.f21702v.setUserId(this.f21683c);
        this.f21702v.setActivity(this);
        CampaignEx campaignEx = this.f21698r;
        if (((campaignEx != null && (rewardPlus = campaignEx.getRewardPlus()) != null) || (this.f21700t.get(0) != null && (rewardPlus = this.f21700t.get(0).getRewardPlus()) != null)) && !TextUtils.isEmpty(rewardPlus.getName()) && rewardPlus.getAmount() > 0) {
            c cVar = new c(rewardPlus.getName(), rewardPlus.getAmount());
            if (cVar.b() < 0) {
                cVar.a(1);
            }
            this.f21684d = cVar;
        }
        this.f21702v.setReward(this.f21684d);
        this.f21702v.setIVRewardEnable(this.f21688h, this.f21689i, this.f21690j);
        this.f21702v.setIV(this.f21686f);
        this.f21702v.setMute(this.f21685e);
        this.f21702v.setJSFactory((com.mbridge.msdk.video.signal.factory.b) this.jsFactory);
        this.f21702v.setDeveloperExtraData(this.f21706z);
        this.f21702v.init(this);
        this.f21702v.onCreate(this.f21677K);
        if (!com.mbridge.msdk.f.b.a() || (list = this.f21700t) == null || list.size() <= 0 || this.f21700t.get(0) == null) {
            return;
        }
        b(this.f21700t.get(0));
    }

    private com.mbridge.msdk.video.bt.module.a.a d() {
        if (this.f21704x == null) {
            this.f21704x = new com.mbridge.msdk.video.bt.module.a.a() { // from class: com.mbridge.msdk.reward.player.MBRewardVideoActivity.3
                @Override // com.mbridge.msdk.video.bt.module.a.a
                public final void a() {
                    if (MBRewardVideoActivity.this.f21693m != null) {
                        MBRewardVideoActivity.this.f21693m.a(MBRewardVideoActivity.this.f21676J);
                    }
                }

                @Override // com.mbridge.msdk.video.bt.module.a.a
                public final void b(String str, String str2) {
                    if (MBRewardVideoActivity.this.f21693m != null) {
                        MBRewardVideoActivity.this.f21693m.b(str, str2);
                    }
                }

                @Override // com.mbridge.msdk.video.bt.module.a.a
                public final void a(boolean z8, c cVar) {
                    if (MBRewardVideoActivity.this.f21693m != null) {
                        MBRewardVideoActivity.this.f21693m.a(MBRewardVideoActivity.this.f21676J, z8, cVar);
                    }
                }

                @Override // com.mbridge.msdk.video.bt.module.a.a
                public final void a(boolean z8, int i8) {
                    if (MBRewardVideoActivity.this.f21693m != null) {
                        MBRewardVideoActivity.this.f21693m.a(z8, i8);
                    }
                }

                @Override // com.mbridge.msdk.video.bt.module.a.a
                public final void a(String str) {
                    if (MBRewardVideoActivity.this.f21693m != null) {
                        MBRewardVideoActivity.this.f21693m.a(MBRewardVideoActivity.this.f21676J, str);
                    }
                }

                @Override // com.mbridge.msdk.video.bt.module.a.a
                public final void a(boolean z8, String str, String str2) {
                    if (MBRewardVideoActivity.this.f21693m != null) {
                        MBRewardVideoActivity.this.f21693m.a(z8, str, str2);
                    }
                }

                @Override // com.mbridge.msdk.video.bt.module.a.a
                public final void a(String str, String str2) {
                    if (MBRewardVideoActivity.this.f21693m != null) {
                        MBRewardVideoActivity.this.f21693m.a(str, str2);
                    }
                }

                @Override // com.mbridge.msdk.video.bt.module.a.a
                public final void a(int i8, String str, String str2) {
                    if (MBRewardVideoActivity.this.f21693m != null) {
                        MBRewardVideoActivity.this.f21693m.a(i8, str, str2);
                    }
                }
            };
        }
        return this.f21704x;
    }

    static /* synthetic */ int b(MBRewardVideoActivity mBRewardVideoActivity, int i8) {
        int i9 = mBRewardVideoActivity.f21669C - i8;
        mBRewardVideoActivity.f21669C = i9;
        return i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        List<CampaignEx> list;
        RewardPlus rewardPlus;
        CampaignEx campaignEx;
        List<CampaignEx> list2;
        int findID = findID("mbridge_temp_container");
        if (findID < 0) {
            a("no id mbridge_bt_container in mbridge_more_offer_activity layout");
        }
        MBTempContainer mBTempContainer = (MBTempContainer) findViewById(findID);
        this.f21701u = mBTempContainer;
        if (mBTempContainer == null) {
            a("env error");
        }
        List<CampaignEx> list3 = this.f21700t;
        if (list3 != null && list3.size() > 0 && this.f21700t.get(0).isDynamicView()) {
            new com.mbridge.msdk.video.dynview.h.b().c(this.f21701u, 500L);
        } else {
            this.f21701u.setVisibility(0);
        }
        changeHalfScreenPadding(-1);
        this.f21701u.setActivity(this);
        this.f21701u.setBidCampaign(this.f21687g);
        this.f21701u.setBigOffer(this.f21691k);
        this.f21701u.setUnitId(this.f21681a);
        this.f21701u.setCampaign(this.f21698r);
        if (this.f21698r.getDynamicTempCode() == 5 && (list2 = this.f21700t) != null && list2.size() > 1) {
            View findViewById = findViewById(findID("mbridge_reward_root_container"));
            if (findViewById != null) {
                findViewById.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            }
            this.f21701u.removeAllViews();
            this.f21701u.setCampOrderViewData(this.f21700t, this.f21669C);
            this.f21701u.setCamPlayOrderCallback(this.f21679M, this.f21668B);
        }
        this.f21701u.setCampaignDownLoadTask(this.f21697q);
        this.f21701u.setIV(this.f21686f);
        CampaignEx campaignEx2 = this.f21698r;
        if (campaignEx2 != null && campaignEx2.getAdSpaceT() == 2) {
            this.f21701u.setIVRewardEnable(0, 0, 0);
        } else {
            this.f21701u.setIVRewardEnable(this.f21688h, this.f21689i, this.f21690j);
        }
        this.f21701u.setMute(this.f21685e);
        CampaignEx campaignEx3 = this.f21698r;
        if (((campaignEx3 != null && (rewardPlus = campaignEx3.getRewardPlus()) != null) || ((list = this.f21700t) != null && list.size() > 0 && this.f21700t.get(0) != null && (rewardPlus = this.f21700t.get(0).getRewardPlus()) != null)) && !TextUtils.isEmpty(rewardPlus.getName()) && rewardPlus.getAmount() > 0) {
            c cVar = new c(rewardPlus.getName(), rewardPlus.getAmount());
            if (cVar.b() < 0) {
                cVar.a(1);
            }
            this.f21684d = cVar;
        }
        this.f21701u.setReward(this.f21684d);
        this.f21701u.setRewardUnitSetting(this.f21694n);
        this.f21701u.setPlacementId(this.f21682b);
        this.f21701u.setUserId(this.f21683c);
        this.f21701u.setShowRewardListener(this.f21693m);
        this.f21701u.setDeveloperExtraData(this.f21706z);
        this.f21701u.init(this);
        this.f21701u.onCreate();
        if (!com.mbridge.msdk.f.b.a() || (campaignEx = this.f21698r) == null) {
            return;
        }
        b(campaignEx);
    }

    private void a() {
        try {
            ViewGroup viewGroup = (ViewGroup) getWindow().getDecorView();
            BitmapDrawable a8 = com.mbridge.msdk.foundation.controller.c.m().a(this.f21681a, this.f21686f ? 287 : 94);
            if (a8 != null) {
                ImageView imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.m().c());
                ai.a(imageView, a8, getResources().getDisplayMetrics());
                ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).addView(imageView, new ViewGroup.LayoutParams(-1, -1));
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    private void a(List<CampaignEx> list) {
        int i8;
        if (list == null) {
            a("no available campaign");
            return;
        }
        if (list.size() == 0) {
            a("no available campaign");
            return;
        }
        if (list.get(0) != null) {
            i8 = list.get(0).getDynamicTempCode();
            this.f21675I = list.get(0).getCurrentLocalRid();
        } else {
            i8 = 0;
        }
        if (i8 != 5) {
            c();
            return;
        }
        for (CampaignEx campaignEx : list) {
            if (campaignEx != null) {
                this.f21669C += campaignEx.getVideoLength();
            }
        }
        CampaignEx campaignEx2 = list.get(0);
        if (campaignEx2 != null) {
            int a8 = a(campaignEx2.getVideoCompleteTime(), this.f21668B);
            this.f21698r = campaignEx2;
            campaignEx2.setCampaignIsFiltered(true);
            this.f21668B = 1;
            this.f21698r.setVideoCompleteTime(a8);
            this.f21698r.setShowIndex(this.f21668B);
            this.f21698r.setShowType(1);
            a(this.f21698r);
            return;
        }
        a("campaign is less");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignEx campaignEx) {
        CampaignEx l8;
        try {
            List<com.mbridge.msdk.videocommon.download.a> list = this.f21699s;
            if (list != null && list.size() > 0) {
                for (com.mbridge.msdk.videocommon.download.a aVar : this.f21699s) {
                    if (aVar != null && (l8 = aVar.l()) != null && TextUtils.equals(l8.getId(), campaignEx.getId()) && TextUtils.equals(l8.getRequestId(), campaignEx.getRequestId())) {
                        this.f21697q = aVar;
                    }
                }
            }
            this.f21691k = true;
            b();
            MBTempContainer mBTempContainer = this.f21701u;
            if (mBTempContainer != null) {
                mBTempContainer.setNotchPadding(this.f21674H, this.f21670D, this.f21672F, this.f21671E, this.f21673G);
            }
        } catch (Exception e8) {
            ad.b("MBRewardVideoActivity", e8.getMessage());
            a("more offer to one offer exception");
        }
    }

    private void c(CampaignEx campaignEx) {
        if (campaignEx != null) {
            if (!TextUtils.isEmpty(campaignEx.getImageUrl())) {
                com.mbridge.msdk.foundation.same.c.b.a(com.mbridge.msdk.foundation.controller.c.m().c()).a(campaignEx.getImageUrl());
            }
            if (TextUtils.isEmpty(campaignEx.getIconUrl())) {
                return;
            }
            com.mbridge.msdk.foundation.same.c.b.a(com.mbridge.msdk.foundation.controller.c.m().c()).a(campaignEx.getIconUrl());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        ad.b("MBRewardVideoActivity", str);
        b(this.f21700t);
        h hVar = this.f21693m;
        if (hVar != null) {
            hVar.a(this.f21676J, str);
        }
        finish();
    }

    private void b(List<CampaignEx> list) {
        CampaignEx campaignEx;
        if (this.f21678L) {
            return;
        }
        if (list == null) {
            try {
                if (this.f21691k) {
                    list = this.f21700t;
                } else {
                    list = new ArrayList<>();
                    List<com.mbridge.msdk.videocommon.download.a> list2 = this.f21699s;
                    if (list2 != null && list2.get(0) != null && this.f21699s.get(0).l() != null) {
                        list.add(this.f21699s.get(0).l());
                    }
                }
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    e8.printStackTrace();
                    return;
                }
                return;
            }
        }
        String str = "";
        if (list != null && !list.isEmpty() && (campaignEx = list.get(0)) != null) {
            str = campaignEx.getCurrentLocalRid();
        }
        if (!TextUtils.isEmpty(str)) {
            this.f21676J = com.mbridge.msdk.foundation.same.report.d.c.a().b(str);
        }
        if (this.f21676J == null) {
            this.f21676J = new com.mbridge.msdk.foundation.same.report.d.b();
            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
            dVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, this.f21681a);
            dVar.a(CampaignEx.JSON_KEY_HB, Integer.valueOf(this.f21687g ? 1 : 0));
            dVar.a("adtp", Integer.valueOf(this.f21686f ? 287 : 94));
            dVar.a("lrid", this.f21675I);
            dVar.a("his_reason", "show campaign is null");
            this.f21676J.a("2000129", dVar);
        }
        if (list != null) {
            this.f21676J.b(list);
        }
        this.f21678L = true;
        com.mbridge.msdk.reward.c.a.a.a().a("2000129", this.f21676J);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(int i8, int i9) {
        List<CampaignEx> list = this.f21700t;
        if (list == null || list.size() == 0) {
            return i8;
        }
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f21700t.size(); i12++) {
            if (this.f21700t.get(0) != null) {
                if (i12 == 0) {
                    i11 = this.f21700t.get(0).getVideoCompleteTime();
                }
                i10 += this.f21700t.get(i12).getVideoLength();
            }
        }
        if (i9 == 1) {
            if (i8 == 0) {
                if (i10 >= 45) {
                    return 45;
                }
            } else if (i10 > i8) {
                if (i8 > 45) {
                    return 45;
                }
                return i8;
            }
            return i10;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < i9 - 1; i14++) {
            if (this.f21700t.get(i14) != null) {
                i13 += this.f21700t.get(i14).getVideoLength();
            }
        }
        if (i11 > i13) {
            return i11 - i13;
        }
        return 0;
    }
}
