package com.mbridge.msdk.video.bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.dycreator.baseview.cusview.SoundImageView;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.d.b;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.an;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.mbsignalcommon.windvane.g;
import com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener;
import com.mbridge.msdk.playercommon.PlayerErrorConstant;
import com.mbridge.msdk.playercommon.PlayerView;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.video.bt.a.d;
import com.mbridge.msdk.widget.FeedBackButton;
import java.io.File;
import org.json.JSONObject;
import y1.AbstractC3969b;
import y1.C3968a;
import y1.EnumC3975h;
import z1.C4014b;
import z1.C4016d;
import z1.EnumC4013a;
import z1.EnumC4015c;

/* loaded from: classes4.dex */
public class MBridgeBTVideoView extends BTBaseView {

    /* renamed from: K, reason: collision with root package name */
    private static boolean f21896K = false;

    /* renamed from: Q, reason: collision with root package name */
    private static long f21897Q;

    /* renamed from: A, reason: collision with root package name */
    private AbstractC3969b f21898A;

    /* renamed from: B, reason: collision with root package name */
    private C3968a f21899B;

    /* renamed from: C, reason: collision with root package name */
    private C4014b f21900C;

    /* renamed from: D, reason: collision with root package name */
    private a f21901D;

    /* renamed from: E, reason: collision with root package name */
    private int f21902E;

    /* renamed from: F, reason: collision with root package name */
    private int f21903F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f21904G;

    /* renamed from: H, reason: collision with root package name */
    private int f21905H;

    /* renamed from: I, reason: collision with root package name */
    private int f21906I;

    /* renamed from: J, reason: collision with root package name */
    private String f21907J;

    /* renamed from: L, reason: collision with root package name */
    private boolean f21908L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f21909M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f21910N;

    /* renamed from: O, reason: collision with root package name */
    private RelativeLayout f21911O;

    /* renamed from: P, reason: collision with root package name */
    private ProgressBar f21912P;

    /* renamed from: p, reason: collision with root package name */
    private PlayerView f21913p;

    /* renamed from: q, reason: collision with root package name */
    private SoundImageView f21914q;

    /* renamed from: r, reason: collision with root package name */
    private TextView f21915r;

    /* renamed from: s, reason: collision with root package name */
    private View f21916s;

    /* renamed from: t, reason: collision with root package name */
    private FeedBackButton f21917t;

    /* renamed from: u, reason: collision with root package name */
    private ImageView f21918u;

    /* renamed from: v, reason: collision with root package name */
    private WebView f21919v;

    /* renamed from: w, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.download.a f21920w;

    /* renamed from: x, reason: collision with root package name */
    private int f21921x;

    /* renamed from: y, reason: collision with root package name */
    private int f21922y;

    /* renamed from: z, reason: collision with root package name */
    private int f21923z;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class a extends DefaultVideoPlayerStatusListener {

        /* renamed from: a, reason: collision with root package name */
        private MBridgeBTVideoView f21927a;

        /* renamed from: b, reason: collision with root package name */
        private WebView f21928b;

        /* renamed from: c, reason: collision with root package name */
        private C4014b f21929c;

        /* renamed from: d, reason: collision with root package name */
        private String f21930d;

        /* renamed from: e, reason: collision with root package name */
        private String f21931e;

        /* renamed from: f, reason: collision with root package name */
        private int f21932f;

        /* renamed from: g, reason: collision with root package name */
        private int f21933g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f21934h;

        /* renamed from: l, reason: collision with root package name */
        private int f21938l;

        /* renamed from: m, reason: collision with root package name */
        private int f21939m;

        /* renamed from: i, reason: collision with root package name */
        private boolean f21935i = false;

        /* renamed from: j, reason: collision with root package name */
        private boolean f21936j = false;

        /* renamed from: k, reason: collision with root package name */
        private boolean f21937k = false;

        /* renamed from: n, reason: collision with root package name */
        private boolean f21940n = false;

        public a(MBridgeBTVideoView mBridgeBTVideoView, WebView webView, C4014b c4014b) {
            this.f21927a = mBridgeBTVideoView;
            this.f21928b = webView;
            this.f21929c = c4014b;
            if (mBridgeBTVideoView != null) {
                this.f21930d = mBridgeBTVideoView.f21771d;
                this.f21931e = mBridgeBTVideoView.f21770c;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x00a7 A[Catch: Exception -> 0x006f, TryCatch #0 {Exception -> 0x006f, blocks: (B:15:0x002f, B:17:0x0037, B:20:0x0044, B:21:0x009b, B:23:0x00a7, B:25:0x00b1, B:31:0x0071), top: B:14:0x002f }] */
        /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(int r3, int r4) {
            /*
                r2 = this;
                java.lang.String r0 = "DefaultVideoPlayerStatusListener"
                r2.f21938l = r3
                r2.f21939m = r4
                com.mbridge.msdk.foundation.tools.af r3 = com.mbridge.msdk.foundation.tools.af.a()
                java.lang.String r4 = "h_c_r_w_p_c"
                r1 = 0
                boolean r3 = r3.a(r4, r1)
                if (r3 != 0) goto L15
                goto Lc2
            L15:
                int r3 = r2.f21938l
                r4 = 100
                if (r3 == r4) goto Lc2
                int r4 = r2.f21939m
                if (r4 != 0) goto Lc2
                boolean r4 = r2.f21940n
                if (r4 != 0) goto Lc2
                if (r3 == 0) goto Lc2
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r3 = r2.f21927a
                if (r3 == 0) goto Lc2
                com.mbridge.msdk.foundation.entity.CampaignEx r3 = r3.f21769b
                if (r3 != 0) goto L2f
                goto Lc2
            L2f:
                int r3 = r3.getAdType()     // Catch: java.lang.Exception -> L6f
                r4 = 94
                if (r3 == r4) goto L71
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r3 = r2.f21927a     // Catch: java.lang.Exception -> L6f
                com.mbridge.msdk.foundation.entity.CampaignEx r3 = r3.f21769b     // Catch: java.lang.Exception -> L6f
                int r3 = r3.getAdType()     // Catch: java.lang.Exception -> L6f
                r4 = 287(0x11f, float:4.02E-43)
                if (r3 != r4) goto L44
                goto L71
            L44:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L6f
                r3.<init>()     // Catch: java.lang.Exception -> L6f
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r4 = r2.f21927a     // Catch: java.lang.Exception -> L6f
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r4.f21769b     // Catch: java.lang.Exception -> L6f
                java.lang.String r4 = r4.getId()     // Catch: java.lang.Exception -> L6f
                r3.append(r4)     // Catch: java.lang.Exception -> L6f
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r4 = r2.f21927a     // Catch: java.lang.Exception -> L6f
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r4.f21769b     // Catch: java.lang.Exception -> L6f
                java.lang.String r4 = r4.getVideoUrlEncode()     // Catch: java.lang.Exception -> L6f
                r3.append(r4)     // Catch: java.lang.Exception -> L6f
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r4 = r2.f21927a     // Catch: java.lang.Exception -> L6f
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r4.f21769b     // Catch: java.lang.Exception -> L6f
                java.lang.String r4 = r4.getBidToken()     // Catch: java.lang.Exception -> L6f
                r3.append(r4)     // Catch: java.lang.Exception -> L6f
                java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L6f
                goto L9b
            L6f:
                r3 = move-exception
                goto Lb7
            L71:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L6f
                r3.<init>()     // Catch: java.lang.Exception -> L6f
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r4 = r2.f21927a     // Catch: java.lang.Exception -> L6f
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r4.f21769b     // Catch: java.lang.Exception -> L6f
                java.lang.String r4 = r4.getRequestId()     // Catch: java.lang.Exception -> L6f
                r3.append(r4)     // Catch: java.lang.Exception -> L6f
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r4 = r2.f21927a     // Catch: java.lang.Exception -> L6f
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r4.f21769b     // Catch: java.lang.Exception -> L6f
                java.lang.String r4 = r4.getId()     // Catch: java.lang.Exception -> L6f
                r3.append(r4)     // Catch: java.lang.Exception -> L6f
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r4 = r2.f21927a     // Catch: java.lang.Exception -> L6f
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r4.f21769b     // Catch: java.lang.Exception -> L6f
                java.lang.String r4 = r4.getVideoUrlEncode()     // Catch: java.lang.Exception -> L6f
                r3.append(r4)     // Catch: java.lang.Exception -> L6f
                java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L6f
            L9b:
                com.mbridge.msdk.videocommon.download.b r4 = com.mbridge.msdk.videocommon.download.b.getInstance()     // Catch: java.lang.Exception -> L6f
                java.lang.String r1 = r2.f21931e     // Catch: java.lang.Exception -> L6f
                com.mbridge.msdk.videocommon.download.a r3 = r4.a(r1, r3)     // Catch: java.lang.Exception -> L6f
                if (r3 == 0) goto Lc2
                r3.p()     // Catch: java.lang.Exception -> L6f
                r3 = 1
                r2.f21940n = r3     // Catch: java.lang.Exception -> L6f
                boolean r3 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch: java.lang.Exception -> L6f
                if (r3 == 0) goto Lc2
                java.lang.String r3 = "CDRate is : 0  and start download when player create!"
                com.mbridge.msdk.foundation.tools.ad.b(r0, r3)     // Catch: java.lang.Exception -> L6f
                goto Lc2
            Lb7:
                boolean r4 = com.mbridge.msdk.MBridgeConstans.DEBUG
                if (r4 == 0) goto Lc2
                java.lang.String r3 = r3.getMessage()
                com.mbridge.msdk.foundation.tools.ad.b(r0, r3)
            Lc2:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.bt.module.MBridgeBTVideoView.a.a(int, int):void");
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public final void onBufferingEnd() {
            try {
                super.onBufferingEnd();
                C4014b c4014b = this.f21929c;
                if (c4014b != null) {
                    c4014b.b();
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public final void onBufferingStart(String str) {
            try {
                super.onBufferingStart(str);
                C4014b c4014b = this.f21929c;
                if (c4014b != null) {
                    c4014b.c();
                }
                if ((str.equals(PlayerErrorConstant.PREPARE_TIMEOUT) || str.equals(PlayerErrorConstant.PLAYERING_TIMEOUT)) && this.f21928b != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", BTBaseView.f21766n);
                        jSONObject.put("id", this.f21930d);
                        jSONObject.put(DataSchemeDataSource.SCHEME_DATA, new JSONObject());
                        g.a().a(this.f21928b, "onPlayerTimeout", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e8) {
                        d.c().a(this.f21928b, e8.getMessage());
                    }
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public final void onPlayCompleted() {
            super.onPlayCompleted();
            MBridgeBTVideoView mBridgeBTVideoView = this.f21927a;
            CampaignEx campaignEx = mBridgeBTVideoView.f21769b;
            if (campaignEx != null) {
                if (campaignEx.getVideoCompleteTime() > 0) {
                    this.f21927a.f21915r.setText(v.a(c.m().c(), "mbridge_reward_video_view_reward_time_complete", TypedValues.Custom.S_STRING));
                } else {
                    this.f21927a.f21915r.setText(MBridgeConstans.ENDCARD_URL_TYPE_PL);
                }
            } else {
                mBridgeBTVideoView.f21915r.setText(MBridgeConstans.ENDCARD_URL_TYPE_PL);
            }
            this.f21927a.f21913p.setClickable(false);
            WebView webView = this.f21928b;
            if (webView != null) {
                BTBaseView.a(webView, "onPlayerFinish", this.f21930d);
            }
            C4014b c4014b = this.f21929c;
            if (c4014b != null) {
                c4014b.d();
                ad.a("omsdk", "play:  videoEvents.complete()");
            }
            this.f21932f = this.f21933g;
            boolean unused = MBridgeBTVideoView.f21896K = true;
            this.f21927a.stop();
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public final void onPlayError(String str) {
            super.onPlayError(str);
            if (this.f21928b != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", BTBaseView.f21767o);
                    jSONObject.put("id", this.f21930d);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(CampaignEx.JSON_NATIVE_VIDEO_ERROR, str);
                    jSONObject2.put("id", this.f21930d);
                    jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                    g.a().a(this.f21928b, "onPlayerFailed", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e8) {
                    d.c().a(this.f21928b, e8.getMessage());
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:90:0x02c9 A[Catch: Exception -> 0x0291, TRY_LEAVE, TryCatch #1 {Exception -> 0x0291, blocks: (B:70:0x023a, B:72:0x023e, B:78:0x0246, B:80:0x024a, B:82:0x024f, B:84:0x025b, B:87:0x0266, B:88:0x02bd, B:90:0x02c9, B:94:0x0293), top: B:69:0x023a }] */
        /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onPlayProgress(int r11, int r12) {
            /*
                Method dump skipped, instructions count: 752
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.bt.module.MBridgeBTVideoView.a.onPlayProgress(int, int):void");
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public final void onPlaySetDataSourceError(String str) {
            super.onPlaySetDataSourceError(str);
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public final void onPlayStarted(int i8) {
            super.onPlayStarted(i8);
            if (!this.f21934h) {
                this.f21927a.f21912P.setMax(i8);
                WebView webView = this.f21928b;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerPlay", this.f21930d);
                }
                this.f21934h = true;
            }
            boolean unused = MBridgeBTVideoView.f21896K = false;
        }
    }

    public MBridgeBTVideoView(Context context) {
        super(context);
        this.f21921x = 0;
        this.f21922y = 0;
        this.f21923z = 0;
        this.f21902E = 2;
        this.f21904G = false;
        this.f21905H = 2;
        this.f21906I = 1;
        this.f21908L = false;
        this.f21909M = false;
        this.f21910N = false;
    }

    public int getMute() {
        return this.f21902E;
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void init(Context context) {
        int findLayout = findLayout("mbridge_reward_videoview_item");
        if (findLayout > 0) {
            this.f21773f.inflate(findLayout, this);
            boolean c8 = c();
            this.f21775h = c8;
            if (!c8) {
                ad.b(BTBaseView.TAG, "MBridgeVideoView init fail");
            }
            a();
        }
        f21896K = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        View rootView;
        int i8;
        int i9;
        super.onAttachedToWindow();
        if (!this.f21910N) {
            this.f21905H = d.c().e(this.f21770c);
        }
        View view = this.f21916s;
        int i10 = 0;
        if (view != null) {
            if (this.f21922y == 0) {
                i9 = 8;
            } else {
                i9 = 0;
            }
            view.setVisibility(i9);
        }
        SoundImageView soundImageView = this.f21914q;
        if (soundImageView != null) {
            if (this.f21923z == 0) {
                i8 = 8;
            } else {
                i8 = 0;
            }
            soundImageView.setVisibility(i8);
        }
        CampaignEx campaignEx = this.f21769b;
        if (campaignEx != null) {
            campaignEx.setCampaignUnitId(this.f21770c);
            b.a().a(this.f21770c + "_1", this.f21769b);
        }
        TextView textView = this.f21915r;
        if (textView != null) {
            if (this.f21921x == 0) {
                i10 = 8;
            }
            textView.setVisibility(i10);
            if (this.f21915r.getVisibility() == 0 && b.a().b()) {
                b.a().a(this.f21770c + "_1", this.f21917t);
            }
        }
        if (this.f21898A != null && (rootView = getRootView()) != null) {
            this.f21898A.f(rootView);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void onDestory() {
        try {
            PlayerView playerView = this.f21913p;
            if (playerView != null) {
                playerView.setOnClickListener(null);
                this.f21913p.release();
                this.f21913p = null;
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a(TypedValues.TransitionType.S_DURATION, Long.valueOf(System.currentTimeMillis() - f21897Q));
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000146", this.f21769b, dVar);
            }
            SoundImageView soundImageView = this.f21914q;
            if (soundImageView != null) {
                soundImageView.setOnClickListener(null);
            }
            View view = this.f21916s;
            if (view != null) {
                view.setOnClickListener(null);
            }
            if (this.f21919v != null) {
                this.f21919v = null;
            }
            if (this.f21898A != null) {
                this.f21898A = null;
            }
            if (this.f21900C != null) {
                this.f21900C = null;
            }
            setOnClickListener(null);
        } catch (Throwable th) {
            ad.a(BTBaseView.TAG, th.getMessage());
        }
    }

    public void onPause() {
        PlayerView playerView = this.f21913p;
        if (playerView != null) {
            boolean isPlayIng = playerView.isPlayIng();
            this.f21909M = isPlayIng;
            this.f21913p.setIsBTVideoPlaying(isPlayIng);
            this.f21913p.onPause();
        }
    }

    public void onResume() {
        PlayerView playerView = this.f21913p;
        if (playerView != null) {
            playerView.setDesk(true);
            this.f21913p.setIsCovered(false);
            if (this.f21909M) {
                this.f21913p.start(true);
            }
        }
    }

    public void onStop() {
        PlayerView playerView = this.f21913p;
        if (playerView != null) {
            playerView.setIsCovered(true);
        }
    }

    public void pause() {
        try {
            PlayerView playerView = this.f21913p;
            if (playerView != null) {
                playerView.pause();
                C4014b c4014b = this.f21900C;
                if (c4014b != null) {
                    c4014b.j();
                    ad.a("omsdk", "play:  videoEvents.pause()");
                }
                WebView webView = this.f21919v;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerPause", this.f21771d);
                }
            }
        } catch (Exception e8) {
            ad.a(BTBaseView.TAG, e8.getMessage(), e8);
        }
    }

    public void play() {
        a aVar;
        CampaignEx campaignEx;
        try {
            if (!this.f21910N) {
                String d8 = d();
                this.f21907J = d8;
                this.f21913p.initVFPData(d8, this.f21769b.getVideoUrlEncode(), this.f21901D);
                if (this.f21905H == 1) {
                    playMute();
                } else {
                    playUnMute();
                }
                try {
                    C3968a c3968a = this.f21899B;
                    if (c3968a != null) {
                        c3968a.b();
                    }
                    if (this.f21900C != null) {
                        float duration = this.f21913p.getDuration();
                        float f8 = 0.0f;
                        if (duration == 0.0f && (campaignEx = this.f21769b) != null) {
                            duration = campaignEx.getVideoLength();
                        }
                        C4014b c4014b = this.f21900C;
                        if (getMute() == 2) {
                            f8 = 1.0f;
                        }
                        c4014b.m(duration, f8);
                        ad.a("omsdk", "play: videoEvents.start()");
                    }
                } catch (IllegalArgumentException e8) {
                    ad.a(BTBaseView.TAG, e8.getMessage());
                }
                if (!this.f21913p.playVideo() && (aVar = this.f21901D) != null) {
                    aVar.onPlayError("play video failed");
                }
                this.f21910N = true;
                return;
            }
            if (this.f21904G) {
                this.f21913p.playVideo(0);
                this.f21904G = false;
            } else {
                this.f21913p.start(false);
            }
            try {
                C4014b c4014b2 = this.f21900C;
                if (c4014b2 != null) {
                    c4014b2.k();
                    ad.a("omsdk", "play:  videoEvents.resume()");
                }
            } catch (IllegalArgumentException e9) {
                ad.a(BTBaseView.TAG, e9.getMessage());
            }
            WebView webView = this.f21919v;
            if (webView != null) {
                BTBaseView.a(webView, "onPlayerPlay", this.f21771d);
                return;
            }
            return;
        } catch (Exception e10) {
            ad.a(BTBaseView.TAG, e10.getMessage(), e10);
        }
        ad.a(BTBaseView.TAG, e10.getMessage(), e10);
    }

    public boolean playMute() {
        try {
            PlayerView playerView = this.f21913p;
            if (playerView != null && this.f21919v != null) {
                playerView.closeSound();
                this.f21914q.setSoundStatus(false);
                this.f21902E = 1;
                try {
                    C4014b c4014b = this.f21900C;
                    if (c4014b != null) {
                        c4014b.o(0.0f);
                    }
                } catch (IllegalArgumentException e8) {
                    ad.a("OMSDK", e8.getMessage());
                }
                BTBaseView.a(this.f21919v, "onPlayerMute", this.f21771d);
                return true;
            }
        } catch (Exception e9) {
            ad.b(BTBaseView.TAG, e9.getMessage());
        }
        return false;
    }

    public boolean playUnMute() {
        try {
            PlayerView playerView = this.f21913p;
            if (playerView != null && this.f21919v != null) {
                playerView.openSound();
                this.f21914q.setSoundStatus(true);
                this.f21902E = 2;
                try {
                    C4014b c4014b = this.f21900C;
                    if (c4014b != null) {
                        c4014b.o(1.0f);
                    }
                } catch (IllegalArgumentException e8) {
                    ad.a("OMSDK", e8.getMessage());
                }
                BTBaseView.a(this.f21919v, "onUnmute", this.f21771d);
                return true;
            }
            return false;
        } catch (Exception e9) {
            ad.b(BTBaseView.TAG, e9.getMessage());
            return false;
        }
    }

    public void preLoadData() {
        String str;
        int r8;
        if (this.f21769b.getAdType() != 94 && this.f21769b.getAdType() != 287) {
            str = this.f21769b.getId() + this.f21769b.getVideoUrlEncode() + this.f21769b.getBidToken();
        } else {
            str = this.f21769b.getRequestId() + this.f21769b.getId() + this.f21769b.getVideoUrlEncode();
        }
        com.mbridge.msdk.videocommon.download.a a8 = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f21770c, str);
        if (a8 != null) {
            this.f21920w = a8;
        }
        this.f21903F = e();
        try {
            CampaignEx campaignEx = this.f21769b;
            if (campaignEx != null && campaignEx.isActiveOm()) {
                this.f21898A = com.mbridge.msdk.a.b.a(getContext(), false, this.f21769b.getOmid(), this.f21769b.getRequestId(), this.f21769b.getId(), this.f21770c, "", this.f21769b.getRequestIdNotice());
            }
            AbstractC3969b abstractC3969b = this.f21898A;
            if (abstractC3969b != null) {
                PlayerView playerView = this.f21913p;
                if (playerView != null) {
                    abstractC3969b.d(playerView);
                }
                SoundImageView soundImageView = this.f21914q;
                if (soundImageView != null) {
                    this.f21898A.a(soundImageView, EnumC3975h.OTHER, null);
                }
                TextView textView = this.f21915r;
                if (textView != null) {
                    this.f21898A.a(textView, EnumC3975h.OTHER, null);
                }
                View view = this.f21916s;
                if (view != null) {
                    this.f21898A.a(view, EnumC3975h.VIDEO_CONTROLS, null);
                }
                this.f21899B = C3968a.a(this.f21898A);
                this.f21900C = C4014b.g(this.f21898A);
                this.f21898A.g();
                this.f21899B.c(C4016d.b(true, EnumC4015c.STANDALONE));
            }
        } catch (Throwable th) {
            ad.a(BTBaseView.TAG, th.getMessage());
        }
        String d8 = d();
        this.f21907J = d8;
        if (this.f21775h && !TextUtils.isEmpty(d8) && this.f21769b != null) {
            AbstractC3969b abstractC3969b2 = this.f21898A;
            if (abstractC3969b2 != null) {
                abstractC3969b2.d(this.f21913p);
                AbstractC3969b abstractC3969b3 = this.f21898A;
                SoundImageView soundImageView2 = this.f21914q;
                EnumC3975h enumC3975h = EnumC3975h.OTHER;
                abstractC3969b3.a(soundImageView2, enumC3975h, null);
                this.f21898A.a(this.f21915r, enumC3975h, null);
                this.f21898A.a(this.f21916s, EnumC3975h.VIDEO_CONTROLS, null);
            }
            a aVar = new a(this, this.f21919v, this.f21900C);
            this.f21901D = aVar;
            CampaignEx campaignEx2 = this.f21769b;
            if (campaignEx2 != null) {
                if (campaignEx2.getReady_rate() != -1) {
                    r8 = campaignEx2.getReady_rate();
                } else {
                    r8 = com.mbridge.msdk.videocommon.d.b.a().a(c.m().k(), this.f21770c, false).r();
                }
            } else {
                r8 = com.mbridge.msdk.videocommon.d.b.a().a(c.m().k(), this.f21770c, false).r();
            }
            aVar.a(r8, com.mbridge.msdk.videocommon.d.b.a().a(c.m().k(), this.f21770c, false).s());
            this.f21913p.setDesk(false);
            this.f21913p.initBufferIngParam(this.f21903F);
            soundOperate(this.f21902E, -1, null);
        }
        f21896K = false;
    }

    public void resume() {
        try {
            PlayerView playerView = this.f21913p;
            if (playerView != null) {
                if (this.f21904G) {
                    playerView.playVideo(0);
                    this.f21904G = false;
                } else {
                    playerView.onResume();
                }
                try {
                    C4014b c4014b = this.f21900C;
                    if (c4014b != null) {
                        c4014b.k();
                        ad.a("omsdk", "play:  videoEvents.resume()");
                    }
                } catch (IllegalArgumentException e8) {
                    ad.a(BTBaseView.TAG, e8.getMessage());
                }
                WebView webView = this.f21919v;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerResume", this.f21771d);
                }
            }
        } catch (Exception e9) {
            ad.b(BTBaseView.TAG, e9.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void setCampaign(CampaignEx campaignEx) {
        super.setCampaign(campaignEx);
        if (campaignEx != null && campaignEx.getVideoCompleteTime() > 0) {
            this.f21915r.setBackgroundResource(v.a(c.m().c(), "mbridge_reward_video_time_count_num_bg", "drawable"));
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, ai.a(c.m().c(), 30.0f));
            int a8 = ai.a(c.m().c(), 5.0f);
            layoutParams.setMargins(a8, 0, 0, 0);
            this.f21915r.setPadding(a8, 0, a8, 0);
            this.f21915r.setLayoutParams(layoutParams);
            return;
        }
        this.f21915r.setBackgroundResource(v.a(c.m().c(), "mbridge_reward_shape_progress", "drawable"));
        this.f21915r.setWidth(ai.a(c.m().c(), 30.0f));
    }

    public void setCloseViewVisable(int i8) {
        int i9;
        View view = this.f21916s;
        if (i8 == 0) {
            i9 = 4;
        } else {
            i9 = 0;
        }
        view.setVisibility(i9);
    }

    public void setCountDownTextViewVisable(int i8) {
        int i9;
        TextView textView = this.f21915r;
        if (i8 == 0) {
            i9 = 4;
        } else {
            i9 = 0;
        }
        textView.setVisibility(i9);
    }

    public void setCreateWebView(WebView webView) {
        this.f21919v = webView;
    }

    public void setNotchPadding(int i8, int i9, int i10, int i11) {
        if (i8 <= 0) {
            i8 = this.f21911O.getPaddingLeft();
        }
        if (i9 <= 0) {
            i9 = this.f21911O.getPaddingRight();
        }
        if (i10 <= 0) {
            i10 = this.f21911O.getPaddingTop();
        }
        if (i11 <= 0) {
            i11 = this.f21911O.getPaddingBottom();
        }
        ad.b(BTBaseView.TAG, "NOTCH BTVideoView " + String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11)));
        this.f21911O.setPadding(i8, i10, i9, i11);
    }

    public void setOrientation(int i8) {
        this.f21906I = i8;
    }

    public void setPlaybackParams(float f8) {
        PlayerView playerView = this.f21913p;
        if (playerView != null) {
            playerView.setPlaybackParams(f8);
        }
    }

    public void setProgressBarState(int i8) {
        int i9;
        ProgressBar progressBar = this.f21912P;
        if (progressBar != null) {
            if (i8 == 0) {
                i9 = 8;
            } else {
                i9 = 0;
            }
            progressBar.setVisibility(i9);
            CampaignEx campaignEx = this.f21769b;
            if (campaignEx != null && campaignEx.getProgressBarShow() == 1) {
                this.f21912P.setVisibility(0);
            }
        }
    }

    public void setShowClose(int i8) {
        this.f21922y = i8;
    }

    public void setShowMute(int i8) {
        this.f21923z = i8;
    }

    public void setShowTime(int i8) {
        this.f21921x = i8;
    }

    public void setSoundImageViewVisble(int i8) {
        int i9;
        SoundImageView soundImageView = this.f21914q;
        if (i8 == 0) {
            i9 = 4;
        } else {
            i9 = 0;
        }
        soundImageView.setVisibility(i9);
    }

    public void setVolume(float f8, float f9) {
        PlayerView playerView = this.f21913p;
        if (playerView != null) {
            playerView.setVolume(f8, f9);
        }
    }

    public void soundOperate(int i8, int i9, String str) {
        if (this.f21775h) {
            this.f21902E = i8;
            if (i8 == 1) {
                this.f21914q.setSoundStatus(false);
                this.f21913p.closeSound();
            } else if (i8 == 2) {
                this.f21914q.setSoundStatus(true);
                this.f21913p.openSound();
            }
            if (i9 == 1) {
                this.f21914q.setVisibility(8);
            } else if (i9 == 2) {
                this.f21914q.setVisibility(0);
            }
        }
    }

    public void stop() {
        try {
            PlayerView playerView = this.f21913p;
            if (playerView != null) {
                playerView.pause();
                this.f21913p.stop();
                this.f21904G = true;
                WebView webView = this.f21919v;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerStop", this.f21771d);
                }
            }
        } catch (Exception e8) {
            ad.a(BTBaseView.TAG, e8.getMessage(), e8);
        }
    }

    private boolean c() {
        try {
            this.f21913p = (PlayerView) findViewById(findID("mbridge_vfpv"));
            this.f21914q = (SoundImageView) findViewById(findID("mbridge_sound_switch"));
            this.f21915r = (TextView) findViewById(findID("mbridge_tv_count"));
            this.f21916s = findViewById(findID("mbridge_rl_playing_close"));
            this.f21911O = (RelativeLayout) findViewById(findID("mbridge_top_control"));
            this.f21912P = (ProgressBar) findViewById(findID("mbridge_video_progress_bar"));
            this.f21913p.setIsBTVideo(true);
            this.f21917t = (FeedBackButton) findViewById(findID("mbridge_native_endcard_feed_btn"));
            this.f21918u = (ImageView) findViewById(findID("mbridge_iv_link"));
            return isNotNULL(this.f21913p, this.f21914q, this.f21915r, this.f21916s);
        } catch (Throwable th) {
            ad.a(BTBaseView.TAG, th.getMessage(), th);
            return false;
        }
    }

    private String d() {
        String str = "";
        try {
            str = this.f21769b.getVideoUrlEncode();
            com.mbridge.msdk.videocommon.download.a aVar = this.f21920w;
            if (aVar == null) {
                return str;
            }
            String h8 = aVar.h();
            return !an.a(h8) ? new File(h8).exists() ? h8 : str : str;
        } catch (Throwable th) {
            ad.a(BTBaseView.TAG, th.getMessage(), th);
            return str;
        }
    }

    private int e() {
        try {
            com.mbridge.msdk.videocommon.d.a b8 = com.mbridge.msdk.videocommon.d.b.a().b();
            if (b8 == null) {
                com.mbridge.msdk.videocommon.d.b.a().c();
            }
            r0 = b8 != null ? (int) b8.h() : 5;
            ad.c(BTBaseView.TAG, "MBridgeBaseView buffetTimeout:" + r0);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return r0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(int i8, int i9) {
        if (i9 != 0) {
            try {
                return ai.a(Double.valueOf(i8 / i9)) + "";
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return i9 + "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public final void a() {
        super.a();
        if (this.f21775h) {
            this.f21914q.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTVideoView.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    boolean isSilent = MBridgeBTVideoView.this.f21913p.isSilent();
                    if (MBridgeBTVideoView.this.f21919v != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("code", BTBaseView.f21766n);
                            jSONObject.put("id", MBridgeBTVideoView.this.f21771d);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(CampaignEx.JSON_NATIVE_VIDEO_MUTE, MBridgeBTVideoView.this.f21902E);
                            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                            g.a().a(MBridgeBTVideoView.this.f21919v, "onPlayerMuteBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                            ad.a("OperateViews", "onPlayerMuteBtnClicked isMute = " + isSilent + " mute = " + MBridgeBTVideoView.this.f21902E);
                        } catch (Exception e8) {
                            d.c().a(MBridgeBTVideoView.this.f21919v, e8.getMessage());
                        }
                    }
                }
            });
            this.f21916s.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTVideoView.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (MBridgeBTVideoView.this.f21919v != null) {
                        BTBaseView.a(MBridgeBTVideoView.this.f21919v, "onPlayerCloseBtnClicked", MBridgeBTVideoView.this.f21771d);
                    }
                }
            });
            setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTVideoView.3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (MBridgeBTVideoView.this.f21900C != null) {
                        MBridgeBTVideoView.this.f21900C.a(EnumC4013a.CLICK);
                    }
                    if (MBridgeBTVideoView.this.f21919v != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("code", BTBaseView.f21766n);
                            jSONObject.put("id", MBridgeBTVideoView.this.f21771d);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("x", String.valueOf(view.getX()));
                            jSONObject2.put("y", String.valueOf(view.getY()));
                            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                            g.a().a(MBridgeBTVideoView.this.f21919v, "onClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                        } catch (Exception unused) {
                            d.c().a(MBridgeBTVideoView.this.f21919v, "onClicked", MBridgeBTVideoView.this.f21771d);
                        }
                    }
                }
            });
        }
    }

    public MBridgeBTVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21921x = 0;
        this.f21922y = 0;
        this.f21923z = 0;
        this.f21902E = 2;
        this.f21904G = false;
        this.f21905H = 2;
        this.f21906I = 1;
        this.f21908L = false;
        this.f21909M = false;
        this.f21910N = false;
    }
}
