package com.mbridge.msdk.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.internal.view.SupportMenu;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.dycreator.baseview.MBHeatLevelLayoutView;
import com.mbridge.msdk.dycreator.baseview.MBStarLevelLayoutView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.d.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.report.d.d;
import com.mbridge.msdk.foundation.same.report.k;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.ao;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import com.mbridge.msdk.shake.MBShakeView;
import com.mbridge.msdk.video.dynview.e.g;
import com.mbridge.msdk.video.dynview.widget.MBridgeLevelLayoutView;
import com.mbridge.msdk.video.module.a.a.j;
import com.mbridge.msdk.video.signal.factory.b;
import com.mbridge.msdk.videocommon.view.RoundImageView;
import com.mbridge.msdk.videocommon.view.StarLevelView;
import com.mbridge.msdk.widget.FeedBackButton;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class MBridgeNativeEndCardView extends MBridgeNativeEndCardViewDiff {

    /* renamed from: A, reason: collision with root package name */
    private LinearLayout f22358A;

    /* renamed from: B, reason: collision with root package name */
    private LinearLayout f22359B;

    /* renamed from: C, reason: collision with root package name */
    private Runnable f22360C;

    /* renamed from: D, reason: collision with root package name */
    private Runnable f22361D;

    /* renamed from: E, reason: collision with root package name */
    private RelativeLayout f22362E;

    /* renamed from: F, reason: collision with root package name */
    private b f22363F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f22364G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f22365H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f22366I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f22367J;

    /* renamed from: K, reason: collision with root package name */
    private int f22368K;

    /* renamed from: L, reason: collision with root package name */
    private AlphaAnimation f22369L;

    /* renamed from: M, reason: collision with root package name */
    private int f22370M;

    /* renamed from: N, reason: collision with root package name */
    private int f22371N;

    /* renamed from: O, reason: collision with root package name */
    private int f22372O;

    /* renamed from: P, reason: collision with root package name */
    private int f22373P;

    /* renamed from: Q, reason: collision with root package name */
    private Bitmap f22374Q;

    /* renamed from: R, reason: collision with root package name */
    private View f22375R;

    /* renamed from: S, reason: collision with root package name */
    private FeedBackButton f22376S;

    /* renamed from: T, reason: collision with root package name */
    private String f22377T;

    /* renamed from: U, reason: collision with root package name */
    private CampaignUnit f22378U;

    /* renamed from: V, reason: collision with root package name */
    private MBShakeView f22379V;

    /* renamed from: W, reason: collision with root package name */
    private com.mbridge.msdk.shake.b f22380W;
    private MBridgeBaitClickView aa;
    private boolean ab;
    private int ac;
    private String ad;

    /* renamed from: n, reason: collision with root package name */
    private ViewGroup f22381n;

    /* renamed from: o, reason: collision with root package name */
    private ViewGroup f22382o;

    /* renamed from: p, reason: collision with root package name */
    private RelativeLayout f22383p;

    /* renamed from: q, reason: collision with root package name */
    private ImageView f22384q;

    /* renamed from: r, reason: collision with root package name */
    private ImageView f22385r;

    /* renamed from: s, reason: collision with root package name */
    private ImageView f22386s;

    /* renamed from: t, reason: collision with root package name */
    private ImageView f22387t;

    /* renamed from: u, reason: collision with root package name */
    private TextView f22388u;

    /* renamed from: v, reason: collision with root package name */
    private ImageView f22389v;

    /* renamed from: w, reason: collision with root package name */
    private ImageView f22390w;

    /* renamed from: x, reason: collision with root package name */
    private TextView f22391x;

    /* renamed from: y, reason: collision with root package name */
    private TextView f22392y;

    /* renamed from: z, reason: collision with root package name */
    private TextView f22393z;

    public MBridgeNativeEndCardView(Context context) {
        super(context);
        this.f22364G = false;
        this.f22365H = false;
        this.f22366I = false;
        this.f22367J = false;
        this.f22368K = 0;
        this.ab = false;
        this.ac = 1;
    }

    static /* synthetic */ void p(MBridgeNativeEndCardView mBridgeNativeEndCardView) {
        CampaignEx campaignEx = mBridgeNativeEndCardView.f22242b;
        if (campaignEx != null) {
            campaignEx.setCampaignUnitId(mBridgeNativeEndCardView.f22377T);
            com.mbridge.msdk.foundation.d.b.a().a(mBridgeNativeEndCardView.f22377T + "_2", mBridgeNativeEndCardView.f22242b);
        }
        if (com.mbridge.msdk.foundation.d.b.a().b()) {
            com.mbridge.msdk.foundation.d.b.a().a(mBridgeNativeEndCardView.f22377T + "_2", new a() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.4
                @Override // com.mbridge.msdk.foundation.d.a
                public final void a() {
                    MBridgeNativeEndCardView.this.f22367J = true;
                }

                @Override // com.mbridge.msdk.foundation.d.a
                public final void b() {
                    MBridgeNativeEndCardView.this.f22367J = false;
                }

                @Override // com.mbridge.msdk.foundation.d.a
                public final void a(String str) {
                    MBridgeNativeEndCardView.this.f22367J = false;
                }
            });
            com.mbridge.msdk.foundation.d.b.a().c(mBridgeNativeEndCardView.f22377T + "_1");
            if (mBridgeNativeEndCardView.f22376S != null) {
                com.mbridge.msdk.foundation.d.b.a().a(mBridgeNativeEndCardView.f22377T + "_2", mBridgeNativeEndCardView.f22376S);
                return;
            }
            return;
        }
        FeedBackButton feedBackButton = mBridgeNativeEndCardView.f22376S;
        if (feedBackButton != null) {
            feedBackButton.setVisibility(8);
        }
    }

    public Bitmap blurBitmap(Bitmap bitmap) {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_4444);
            RenderScript create = RenderScript.create(this.f22241a.getApplicationContext());
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap);
            Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
            create2.setRadius(25.0f);
            create2.setInput(createFromBitmap);
            create2.forEach(createFromBitmap2);
            createFromBitmap2.copyTo(createBitmap);
            create.destroy();
            return createBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean canBackPress() {
        View view = this.f22375R;
        if (view != null && view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public void clearMoreOfferBitmap() {
        CampaignUnit campaignUnit;
        CampaignEx campaignEx = this.f22242b;
        if (campaignEx != null && campaignEx.isDynamicView() && (campaignUnit = this.f22378U) != null && campaignUnit.getAds() != null && this.f22378U.getAds().size() > 0) {
            Iterator<CampaignEx> it = this.f22378U.getAds().iterator();
            while (it.hasNext()) {
                CampaignEx next = it.next();
                if (!TextUtils.isEmpty(next.getIconUrl())) {
                    com.mbridge.msdk.foundation.same.c.b.a(c.m().c()).a(next.getIconUrl());
                }
            }
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
    }

    public boolean isDyXmlSuccess() {
        return this.ab;
    }

    public void notifyShowListener() {
        this.f22245e.a(110, "");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        int parseInt;
        int parseInt2;
        int i8;
        MBridgeBaitClickView mBridgeBaitClickView;
        super.onAttachedToWindow();
        if (this.f22360C == null) {
            this.f22360C = new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.1
                @Override // java.lang.Runnable
                public final void run() {
                    MBridgeNativeEndCardView.this.f22365H = true;
                    if (MBridgeNativeEndCardView.this.f22375R != null) {
                        MBridgeNativeEndCardView.this.f22375R.setVisibility(0);
                    }
                }
            };
        }
        Runnable runnable = this.f22360C;
        if (runnable != null) {
            postDelayed(runnable, this.f22368K * 1000);
            if (!this.f22366I) {
                this.f22366I = true;
            }
            try {
                CampaignEx campaignEx = this.f22242b;
                if (campaignEx != null && campaignEx.isDynamicView()) {
                    String str = this.f22242b.getendcard_url();
                    if (TextUtils.isEmpty(str)) {
                        str = this.f22242b.getEndScreenUrl();
                    }
                    String a8 = ao.a(str, "alac");
                    if (!TextUtils.isEmpty(a8) && a8.equals("1") && this.f22242b.getAutoShowStoreMiniCard() != 1) {
                        postDelayed(new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.8
                            @Override // java.lang.Runnable
                            public final void run() {
                                MBridgeNativeEndCardView.this.f22242b.setTriggerClickSource(2);
                                MBridgeNativeEndCardView.this.f22242b.setClickType(1);
                                MBridgeNativeEndCardView.a(MBridgeNativeEndCardView.this, 2);
                            }
                        }, 1000L);
                    }
                }
            } catch (Throwable th) {
                ad.b(MBridgeBaseView.TAG, th.getMessage());
            }
        }
        try {
            CampaignEx campaignEx2 = this.f22242b;
            if (campaignEx2 != null && campaignEx2.isDynamicView()) {
                String str2 = this.f22242b.getendcard_url();
                if (TextUtils.isEmpty(str2)) {
                    str2 = this.f22242b.getEndScreenUrl();
                }
                String a9 = ao.a(str2, "bait_click");
                try {
                    i8 = Integer.parseInt(a9);
                } catch (Throwable th2) {
                    ad.b(MBridgeBaseView.TAG, th2.getMessage());
                    i8 = 1;
                }
                if (!TextUtils.isEmpty(a9) && i8 != 0 && (mBridgeBaitClickView = this.aa) != null) {
                    mBridgeBaitClickView.setVisibility(0);
                    this.aa.init(1342177280, i8);
                    if (this.f22242b.getEcTemplateId() == 1302) {
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setShape(0);
                        gradientDrawable.setColor(1342177280);
                        gradientDrawable.setStroke(0, SupportMenu.CATEGORY_MASK);
                        gradientDrawable.setCornerRadius(25.0f);
                        this.aa.setBackground(gradientDrawable);
                    }
                    this.aa.startAnimation();
                    this.aa.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.7
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            MBridgeNativeEndCardView.this.f22242b.setTriggerClickSource(2);
                            MBridgeNativeEndCardView.a(MBridgeNativeEndCardView.this, 0);
                        }
                    });
                }
            }
        } catch (Throwable th3) {
            ad.b(MBridgeBaseView.TAG, th3.getMessage());
        }
        try {
            CampaignEx campaignEx3 = this.f22242b;
            if (campaignEx3 != null && campaignEx3.isDynamicView()) {
                String str3 = this.f22242b.getendcard_url();
                if (TextUtils.isEmpty(str3)) {
                    str3 = this.f22242b.getEndScreenUrl();
                }
                String a10 = ao.a(str3, "shake_show");
                String a11 = ao.a(str3, "shake_strength");
                String a12 = ao.a(str3, "shake_time");
                if (!TextUtils.isEmpty(a10) && a10.equals("1") && this.f22379V == null) {
                    MBridgeBaitClickView mBridgeBaitClickView2 = this.aa;
                    if (mBridgeBaitClickView2 != null) {
                        mBridgeBaitClickView2.setVisibility(8);
                    }
                    MBShakeView mBShakeView = new MBShakeView(getContext());
                    this.f22379V = mBShakeView;
                    mBShakeView.initView(this.f22242b.getAdCall(), true);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                    if (!isLandscape()) {
                        layoutParams.addRule(2, filterFindViewId(this.ab, "mbridge_iv_logo"));
                        layoutParams.addRule(14);
                        this.f22379V.setPadding(0, 0, 0, ai.a(getContext(), 20.0f));
                    } else {
                        layoutParams.addRule(13);
                    }
                    this.f22379V.setLayoutParams(layoutParams);
                    RelativeLayout relativeLayout = this.f22383p;
                    if (relativeLayout != null && relativeLayout.isShown()) {
                        this.f22383p.addView(this.f22379V);
                        TextView textView = this.ctaView;
                        if (textView != null) {
                            textView.setVisibility(4);
                        }
                        this.ctaView.setVisibility(4);
                        this.f22379V.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.5
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                MBridgeNativeEndCardView.this.f22242b.setTriggerClickSource(5);
                                MBridgeNativeEndCardView.a(MBridgeNativeEndCardView.this, 0);
                            }
                        });
                        int i9 = 10;
                        if (!TextUtils.isEmpty(a11) && (parseInt2 = Integer.parseInt(a11)) > 0) {
                            i9 = parseInt2;
                        }
                        boolean isEmpty = TextUtils.isEmpty(a12);
                        int i10 = DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS;
                        if (!isEmpty && (parseInt = Integer.parseInt(a12)) > 0) {
                            i10 = parseInt * 1000;
                        }
                        this.f22380W = new com.mbridge.msdk.shake.b(i9, i10) { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.6
                            @Override // com.mbridge.msdk.shake.b
                            public final void a() {
                                if ((com.mbridge.msdk.f.b.a() && MBridgeNativeEndCardView.this.checkChinaShakeState()) || MBridgeNativeEndCardView.this.f22367J || !MBridgeNativeEndCardView.this.f22366I) {
                                    return;
                                }
                                MBridgeNativeEndCardView mBridgeNativeEndCardView = MBridgeNativeEndCardView.this;
                                mBridgeNativeEndCardView.f22247g = 0.0f;
                                mBridgeNativeEndCardView.f22248h = 0.0f;
                                mBridgeNativeEndCardView.f22242b.setTriggerClickSource(5);
                                MBridgeNativeEndCardView.a(MBridgeNativeEndCardView.this, 4);
                            }
                        };
                        com.mbridge.msdk.shake.a.a().a(this.f22380W);
                    }
                }
            }
        } catch (Throwable th4) {
            ad.b(MBridgeBaseView.TAG, th4.getMessage());
        }
        try {
            CampaignEx campaignEx4 = this.f22242b;
            if (campaignEx4 != null && campaignEx4.getAutoShowStoreMiniCard() != 0 && !TextUtils.isEmpty(this.f22242b.getDeepLinkURL())) {
                long showStoreMiniCardDelayTime = this.f22242b.getShowStoreMiniCardDelayTime();
                if (showStoreMiniCardDelayTime == 0) {
                    showStoreMiniCardDelayTime = 1;
                }
                if (this.f22361D == null) {
                    this.f22361D = new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.9
                        @Override // java.lang.Runnable
                        public final void run() {
                            MBridgeNativeEndCardView.this.f22242b.setTriggerClickSource(2);
                            MBridgeNativeEndCardView.this.f22242b.setClickType(1);
                            MBridgeNativeEndCardView.a(MBridgeNativeEndCardView.this, 2);
                        }
                    };
                }
                postDelayed(this.f22361D, showStoreMiniCardDelayTime * 1000);
            }
        } catch (Throwable th5) {
            ad.b(MBridgeBaseView.TAG, th5.getMessage());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f22360C;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f22361D;
        if (runnable2 != null) {
            removeCallbacks(runnable2);
        }
        if (this.f22380W != null) {
            com.mbridge.msdk.shake.a.a().b(this.f22380W);
            this.f22380W = null;
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        CampaignEx campaignEx = this.f22242b;
        if (campaignEx != null && campaignEx.isDynamicView()) {
            return;
        }
        RelativeLayout relativeLayout = this.f22362E;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(4);
        }
        int i8 = configuration.orientation;
        this.f22244d = i8;
        if (i8 == 2) {
            removeView(this.f22381n);
            a(this.f22382o);
        } else {
            removeView(this.f22382o);
            a(this.f22381n);
        }
    }

    public void preLoadData(b bVar) {
        this.f22363F = bVar;
        try {
            if (this.f22242b != null && this.f22246f) {
                com.mbridge.msdk.foundation.same.c.b.a(this.f22241a.getApplicationContext()).a(this.f22242b.getImageUrl(), new com.mbridge.msdk.foundation.same.c.c() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.11
                    @Override // com.mbridge.msdk.foundation.same.c.c
                    public final void onFailedLoad(String str, String str2) {
                    }

                    @Override // com.mbridge.msdk.foundation.same.c.c
                    public final void onSuccessLoad(Bitmap bitmap, String str) {
                        if (bitmap != null && !bitmap.isRecycled()) {
                            try {
                                if (MBridgeNativeEndCardView.this.f22385r != null) {
                                    MBridgeNativeEndCardView mBridgeNativeEndCardView = MBridgeNativeEndCardView.this;
                                    if (mBridgeNativeEndCardView.f22249i) {
                                        mBridgeNativeEndCardView.f22385r.setBackground(null);
                                    }
                                    MBridgeNativeEndCardView.this.f22385r.setImageBitmap(bitmap);
                                }
                                MBridgeNativeEndCardView.a(MBridgeNativeEndCardView.this, bitmap);
                            } catch (Throwable unused) {
                                if (MBridgeNativeEndCardView.this.f22384q != null) {
                                    MBridgeNativeEndCardView.this.f22384q.setVisibility(4);
                                }
                            }
                        }
                    }
                });
                com.mbridge.msdk.foundation.same.c.b.a(this.f22241a.getApplicationContext()).a(this.f22242b.getIconUrl(), new j(this.f22386s, ai.a(c.m().c(), 8.0f)));
                this.f22391x.setText(this.f22242b.getAppName());
                TextView textView = this.ctaView;
                if (textView != null) {
                    textView.setText(this.f22242b.getAdCall());
                }
                TextView textView2 = this.f22392y;
                if (textView2 != null) {
                    textView2.setText(this.f22242b.getAppDesc());
                }
                TextView textView3 = this.f22393z;
                if (textView3 != null) {
                    textView3.setText(this.f22242b.getNumberRating() + ")");
                }
                this.f22358A.removeAllViews();
                double rating = this.f22242b.getRating();
                if (rating <= 0.0d) {
                    rating = 5.0d;
                }
                LinearLayout linearLayout = this.f22358A;
                if (linearLayout instanceof StarLevelView) {
                    ((StarLevelView) linearLayout).initScore(rating);
                }
                LinearLayout linearLayout2 = this.f22358A;
                if (linearLayout2 instanceof MBridgeLevelLayoutView) {
                    ((MBridgeLevelLayoutView) linearLayout2).setRatingAndUser(rating, this.f22242b.getNumberRating());
                }
                LinearLayout linearLayout3 = this.f22358A;
                if (linearLayout3 instanceof MBStarLevelLayoutView) {
                    ((MBStarLevelLayoutView) linearLayout3).setRating((int) rating);
                }
                LinearLayout linearLayout4 = this.f22359B;
                if (linearLayout4 != null && (linearLayout4 instanceof MBHeatLevelLayoutView)) {
                    ((MBHeatLevelLayoutView) linearLayout4).setHeatCount(this.f22242b.getNumberRating());
                }
                if (!TextUtils.isEmpty(this.f22242b.getendcard_url()) && this.f22242b.getendcard_url().contains("alecfc=1")) {
                    this.f22364G = true;
                }
                String language = Locale.getDefault().getLanguage();
                if (!TextUtils.isEmpty(language) && language.equals("zh")) {
                    this.f22387t.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_reward_flag_cn", "drawable", c.m().g())));
                    this.ad = "广告";
                } else {
                    this.f22387t.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_reward_flag_en", "drawable", c.m().g())));
                    this.ad = "AD";
                }
                if (this.ac == 0) {
                    ImageView imageView = this.f22387t;
                    if (imageView != null) {
                        imageView.setVisibility(4);
                    }
                    ImageView imageView2 = this.f22389v;
                    if (imageView2 != null) {
                        imageView2.setVisibility(4);
                    }
                    TextView textView4 = this.f22388u;
                    if (textView4 != null) {
                        textView4.setVisibility(0);
                        this.f22388u.setText(this.ad);
                    }
                }
                ai.a(2, this.f22390w, this.f22242b, this.f22241a, true, new a() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.12
                    @Override // com.mbridge.msdk.foundation.d.a
                    public final void a() {
                        MBridgeNativeEndCardView.this.f22367J = true;
                    }

                    @Override // com.mbridge.msdk.foundation.d.a
                    public final void b() {
                        MBridgeNativeEndCardView.this.f22367J = false;
                    }

                    @Override // com.mbridge.msdk.foundation.d.a
                    public final void a(String str) {
                        MBridgeNativeEndCardView.this.f22367J = false;
                    }
                });
                if (!this.f22365H) {
                    this.f22375R.setVisibility(8);
                }
            }
        } catch (Throwable th) {
            ad.a(MBridgeBaseView.TAG, th.getMessage());
        }
    }

    public void release() {
        try {
            removeAllViews();
            AlphaAnimation alphaAnimation = this.f22369L;
            if (alphaAnimation != null) {
                alphaAnimation.cancel();
            }
            this.f22360C = null;
        } catch (Exception e8) {
            ad.b(MBridgeBaseView.TAG, e8.getMessage());
        }
    }

    public void setCloseBtnDelay(int i8) {
        this.f22368K = i8;
    }

    public void setLayout() {
        String str;
        if (this.f22249i) {
            if (com.mbridge.msdk.f.b.a()) {
                str = "cn_";
            } else {
                str = "en_";
            }
            com.mbridge.msdk.video.dynview.c a8 = new com.mbridge.msdk.video.dynview.j.c().a(getContext(), this.f22242b, this.f22250j, str);
            this.ac = a8.n();
            com.mbridge.msdk.video.dynview.b.a().a(a8, new g() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.10
                @Override // com.mbridge.msdk.video.dynview.e.g
                public final void a(com.mbridge.msdk.video.dynview.a aVar) {
                    if (aVar != null) {
                        MBridgeNativeEndCardView.this.addView(aVar.a());
                        MBridgeNativeEndCardView.this.ab = aVar.c();
                        if (!MBridgeNativeEndCardView.this.ctaViewCanGet(aVar.a(), MBridgeNativeEndCardView.this.ab)) {
                            MBridgeNativeEndCardView.this.ab = false;
                            MBridgeNativeEndCardView mBridgeNativeEndCardView = MBridgeNativeEndCardView.this;
                            mBridgeNativeEndCardView.f22249i = false;
                            mBridgeNativeEndCardView.a();
                        } else {
                            MBridgeNativeEndCardView mBridgeNativeEndCardView2 = MBridgeNativeEndCardView.this;
                            mBridgeNativeEndCardView2.f22246f = mBridgeNativeEndCardView2.b(aVar.a());
                            MBridgeNativeEndCardView.this.b();
                        }
                        MBridgeNativeEndCardView mBridgeNativeEndCardView3 = MBridgeNativeEndCardView.this;
                        CampaignEx campaignEx = mBridgeNativeEndCardView3.f22242b;
                        if (campaignEx != null) {
                            campaignEx.setECTemplateRenderSucc(mBridgeNativeEndCardView3.ab);
                        }
                    }
                }

                @Override // com.mbridge.msdk.video.dynview.e.g
                public final void a(com.mbridge.msdk.video.dynview.c.a aVar) {
                    ad.b(MBridgeBaseView.TAG, "errorMsg:" + aVar.b());
                }
            });
            return;
        }
        a();
    }

    public void setMoreOfferCampaignUnit(CampaignUnit campaignUnit) {
        MBShakeView mBShakeView;
        CampaignEx campaignEx = this.f22242b;
        if (campaignEx != null && campaignEx.isDynamicView()) {
            this.f22378U = campaignUnit;
            if (campaignUnit != null && campaignUnit.getAds() != null && this.f22378U.getAds().size() > 5 && (mBShakeView = this.f22379V) != null) {
                mBShakeView.setPadding(0, 0, 0, ai.a(getContext(), 5.0f));
            }
        }
    }

    public void setNotchPadding(int i8, int i9, int i10, int i11) {
        ad.b(MBridgeBaseView.TAG, "NOTCH NativeEndCard " + String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11)));
        this.f22370M = i8;
        this.f22371N = i9;
        this.f22372O = i10;
        this.f22373P = i11;
        f();
    }

    public void setOnPause() {
        this.f22366I = false;
    }

    public void setOnResume() {
        this.f22366I = true;
    }

    public void setUnitId(String str) {
        this.f22377T = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        r1 = "mbridge_reward_endcard_native_half_landscape";
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        r3 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002e, code lost:
    
        if (r6.f22251k != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        if (r6.f22251k != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int e() {
        /*
            r6 = this;
            int r0 = r6.f22252l
            java.lang.String r1 = "mbridge_reward_endcard_native_land"
            java.lang.String r2 = "mbridge_reward_endcard_native_half_landscape"
            java.lang.String r3 = "mbridge_reward_endcard_native_hor"
            java.lang.String r4 = "mbridge_reward_endcard_native_half_portrait"
            if (r0 != 0) goto L1e
            boolean r0 = r6.f22251k
            if (r0 == 0) goto L11
            r3 = r4
        L11:
            boolean r0 = r6.isLandscape()
            if (r0 == 0) goto L31
            boolean r0 = r6.f22251k
            if (r0 == 0) goto L1c
        L1b:
            r1 = r2
        L1c:
            r3 = r1
            goto L31
        L1e:
            r5 = 1
            if (r0 != r5) goto L27
            boolean r5 = r6.f22251k
            if (r5 == 0) goto L29
            r3 = r4
            goto L29
        L27:
            java.lang.String r3 = ""
        L29:
            r4 = 2
            if (r0 != r4) goto L31
            boolean r0 = r6.f22251k
            if (r0 == 0) goto L1c
            goto L1b
        L31:
            int r0 = r6.findLayout(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.e():int");
    }

    private void f() {
        RelativeLayout relativeLayout;
        if (!this.f22246f || (relativeLayout = this.f22362E) == null) {
            return;
        }
        relativeLayout.postDelayed(new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.3
            @Override // java.lang.Runnable
            public final void run() {
                if (MBridgeNativeEndCardView.this.f22362E != null) {
                    CampaignEx campaignEx = MBridgeNativeEndCardView.this.f22242b;
                    if (campaignEx != null && !campaignEx.isDynamicView() && MBridgeNativeEndCardView.this.f22242b.getAdSpaceT() != 2) {
                        MBridgeNativeEndCardView.this.f22362E.setPadding(MBridgeNativeEndCardView.this.f22370M, MBridgeNativeEndCardView.this.f22372O, MBridgeNativeEndCardView.this.f22371N, MBridgeNativeEndCardView.this.f22373P);
                        MBridgeNativeEndCardView.this.f22362E.startAnimation(MBridgeNativeEndCardView.this.f22369L);
                    }
                    MBridgeNativeEndCardView.this.f22362E.setVisibility(0);
                }
                if (MBridgeNativeEndCardView.this.f22375R != null && MBridgeNativeEndCardView.this.f22375R.getVisibility() != 0 && MBridgeNativeEndCardView.this.f22365H) {
                    MBridgeNativeEndCardView.this.f22375R.setVisibility(0);
                }
                MBridgeNativeEndCardView.p(MBridgeNativeEndCardView.this);
            }
        }, 200L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public final void c() {
        if (this.f22246f) {
            this.f22383p.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.14
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (MBridgeNativeEndCardView.this.f22364G) {
                        MBridgeNativeEndCardView.this.f22242b.setTriggerClickSource(2);
                        MBridgeNativeEndCardView.a(MBridgeNativeEndCardView.this, 1);
                    }
                }
            });
            this.f22375R.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.15
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (MBridgeNativeEndCardView.this.f22249i) {
                        try {
                            com.mbridge.msdk.video.dynview.moffer.a.a().b();
                        } catch (Exception e8) {
                            ad.b(MBridgeBaseView.TAG, e8.getMessage());
                        }
                        try {
                            CampaignEx campaignEx = MBridgeNativeEndCardView.this.f22242b;
                            if (campaignEx != null) {
                                String a8 = ao.a(campaignEx.getendcard_url(), "ecid");
                                String a9 = ao.a(MBridgeNativeEndCardView.this.f22242b.getendcard_url(), "mof");
                                d dVar = new d();
                                dVar.a("type", "choseFromTwoClose");
                                dVar.a("endcard_id", a8);
                                dVar.a("mof", a9);
                                com.mbridge.msdk.video.module.b.a.a("2000103", MBridgeNativeEndCardView.this.f22242b, dVar);
                            }
                        } catch (Exception e9) {
                            if (MBridgeConstans.DEBUG) {
                                e9.printStackTrace();
                            }
                        }
                    }
                    try {
                        d dVar2 = new d();
                        dVar2.a("type", 2);
                        com.mbridge.msdk.foundation.same.report.d.c.a().a("2000152", dVar2);
                        com.mbridge.msdk.foundation.same.report.d.c.a().a("2000134", MBridgeNativeEndCardView.this.f22242b);
                    } catch (Throwable th) {
                        if (MBridgeConstans.DEBUG) {
                            th.printStackTrace();
                        }
                    }
                    MBridgeNativeEndCardView.this.f22245e.a(104, "");
                }
            });
            TextView textView = this.ctaView;
            if (textView != null) {
                textView.setOnClickListener(new com.mbridge.msdk.widget.a() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.16
                    @Override // com.mbridge.msdk.widget.a
                    protected final void a(View view) {
                        MBridgeNativeEndCardView.this.f22242b.setTriggerClickSource(1);
                        MBridgeNativeEndCardView.a(MBridgeNativeEndCardView.this, 0);
                    }
                });
            }
            this.f22386s.setOnClickListener(new com.mbridge.msdk.widget.a() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.17
                @Override // com.mbridge.msdk.widget.a
                protected final void a(View view) {
                    if (MBridgeNativeEndCardView.this.ctaView != null) {
                        if (!com.mbridge.msdk.f.b.a() || MBridgeNativeEndCardView.this.checkProgressBarIntercepted()) {
                            MBridgeNativeEndCardView.this.f22242b.setTriggerClickSource(2);
                            MBridgeNativeEndCardView.a(MBridgeNativeEndCardView.this, 0);
                        }
                    }
                }
            });
            this.f22385r.setOnClickListener(new com.mbridge.msdk.widget.a() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.2
                @Override // com.mbridge.msdk.widget.a
                protected final void a(View view) {
                    if (MBridgeNativeEndCardView.this.ctaView != null) {
                        if (!com.mbridge.msdk.f.b.a() || MBridgeNativeEndCardView.this.checkProgressBarIntercepted()) {
                            MBridgeNativeEndCardView.this.f22242b.setTriggerClickSource(2);
                            MBridgeNativeEndCardView.a(MBridgeNativeEndCardView.this, 0);
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        int e8 = e();
        if (e8 > 0) {
            this.f22246f = b(e8);
            b();
            CampaignEx campaignEx = this.f22242b;
            if (campaignEx != null) {
                campaignEx.setECTemplateRenderSucc(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        c();
        if (!this.f22246f) {
            this.f22245e.a(104, "");
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 100.0f);
        this.f22369L = alphaAnimation;
        alphaAnimation.setDuration(200L);
    }

    public MBridgeNativeEndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22364G = false;
        this.f22365H = false;
        this.f22366I = false;
        this.f22367J = false;
        this.f22368K = 0;
        this.ab = false;
        this.ac = 1;
    }

    private void a(View view) {
        if (view == null) {
            setLayout();
            preLoadData(this.f22363F);
        } else {
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            addView(view);
            b(view);
            c();
        }
        f();
    }

    private boolean b(int i8) {
        if (isLandscape()) {
            ViewGroup viewGroup = (ViewGroup) this.f22243c.inflate(i8, (ViewGroup) null);
            this.f22382o = viewGroup;
            addView(viewGroup);
            return b(this.f22382o);
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f22243c.inflate(i8, (ViewGroup) null);
        this.f22381n = viewGroup2;
        addView(viewGroup2);
        return b(this.f22381n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(View view) {
        try {
            this.f22383p = (RelativeLayout) view.findViewById(filterFindViewId(this.ab, "mbridge_native_ec_layout"));
            this.f22385r = (ImageView) view.findViewById(filterFindViewId(this.ab, "mbridge_iv_adbanner"));
            this.f22386s = (ImageView) view.findViewById(filterFindViewId(this.ab, "mbridge_iv_icon"));
            this.f22387t = (ImageView) view.findViewById(filterFindViewId(this.ab, "mbridge_iv_flag"));
            this.f22388u = (TextView) view.findViewById(filterFindViewId(this.ab, "mbridge_tv_flag"));
            this.f22389v = (ImageView) view.findViewById(filterFindViewId(this.ab, "mbridge_iv_logo"));
            this.f22390w = (ImageView) view.findViewById(filterFindViewId(this.ab, "mbridge_iv_link"));
            this.f22391x = (TextView) view.findViewById(filterFindViewId(this.ab, "mbridge_tv_apptitle"));
            this.f22358A = (LinearLayout) view.findViewById(filterFindViewId(this.ab, "mbridge_sv_starlevel"));
            this.f22359B = (LinearLayout) view.findViewById(filterFindViewId(this.ab, "mbridge_sv_heat_count_level"));
            this.f22375R = view.findViewById(filterFindViewId(this.ab, "mbridge_iv_close"));
            this.ctaView = (TextView) view.findViewById(filterFindViewId(this.ab, "mbridge_tv_cta"));
            this.f22376S = (FeedBackButton) view.findViewById(filterFindViewId(this.ab, "mbridge_native_endcard_feed_btn"));
            this.f22362E = (RelativeLayout) view.findViewById(filterFindViewId(this.ab, "mbridge_native_ec_controller"));
            this.f22384q = (ImageView) view.findViewById(filterFindViewId(this.ab, "mbridge_iv_adbanner_bg"));
            this.aa = (MBridgeBaitClickView) findViewById(filterFindViewId(this.ab, "mbridge_animation_click_view"));
            this.f22392y = (TextView) view.findViewById(filterFindViewId(this.ab, "mbridge_tv_appdesc"));
            if (this.f22249i) {
                ImageView imageView = this.f22385r;
                if (imageView != null && (imageView instanceof RoundImageView)) {
                    ((RoundImageView) imageView).setBorderRadius(10);
                }
                ImageView imageView2 = this.f22386s;
                if (imageView2 != null && (imageView2 instanceof RoundImageView)) {
                    ((RoundImageView) imageView2).setBorderRadius(10);
                }
                return isNotNULL(this.f22385r, this.f22386s, this.f22391x, this.f22358A, this.f22375R, this.ctaView);
            }
            TextView textView = (TextView) view.findViewById(filterFindViewId(this.ab, "mbridge_tv_number"));
            this.f22393z = textView;
            return isNotNULL(this.f22385r, this.f22386s, this.f22391x, this.f22392y, textView, this.f22358A, this.f22375R, this.ctaView);
        } catch (Throwable th) {
            ad.a(MBridgeBaseView.TAG, th.getMessage(), th);
            return false;
        }
    }

    public MBridgeNativeEndCardView(Context context, AttributeSet attributeSet, boolean z8, int i8, boolean z9, int i9, int i10) {
        super(context, attributeSet, z8, i8, z9, i9, i10);
        this.f22364G = false;
        this.f22365H = false;
        this.f22366I = false;
        this.f22367J = false;
        this.f22368K = 0;
        this.ab = false;
        this.ac = 1;
    }

    static /* synthetic */ void a(MBridgeNativeEndCardView mBridgeNativeEndCardView, final Bitmap bitmap) {
        try {
            com.mbridge.msdk.foundation.same.f.b.f().execute(new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.13
                @Override // java.lang.Runnable
                public final void run() {
                    MBridgeNativeEndCardView mBridgeNativeEndCardView2 = MBridgeNativeEndCardView.this;
                    mBridgeNativeEndCardView2.f22374Q = mBridgeNativeEndCardView2.blurBitmap(bitmap);
                    if (MBridgeNativeEndCardView.this.f22374Q != null && !MBridgeNativeEndCardView.this.f22374Q.isRecycled() && MBridgeNativeEndCardView.this.f22384q != null) {
                        MBridgeNativeEndCardView.this.f22384q.post(new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.13.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                MBridgeNativeEndCardView mBridgeNativeEndCardView3 = MBridgeNativeEndCardView.this;
                                if (mBridgeNativeEndCardView3.f22249i) {
                                    mBridgeNativeEndCardView3.f22384q.setBackground(null);
                                }
                                ad.b("async", "执行异步加载图");
                                MBridgeNativeEndCardView.this.f22384q.setImageBitmap(MBridgeNativeEndCardView.this.f22374Q);
                            }
                        });
                    }
                }
            });
        } catch (Exception e8) {
            ad.a(MBridgeBaseView.TAG, e8.getMessage());
        }
    }

    static /* synthetic */ void a(MBridgeNativeEndCardView mBridgeNativeEndCardView, int i8) {
        JSONObject jSONObject;
        CampaignEx campaignEx = mBridgeNativeEndCardView.f22242b;
        if (campaignEx != null && campaignEx.isDynamicView()) {
            try {
                CampaignEx.c rewardTemplateMode = mBridgeNativeEndCardView.f22242b.getRewardTemplateMode();
                String str = "";
                if (rewardTemplateMode != null) {
                    str = rewardTemplateMode.f() + "";
                }
                k.a(c.m().c(), "end_card_click", mBridgeNativeEndCardView.f22242b.getCampaignUnitId(), mBridgeNativeEndCardView.f22242b.isBidCampaign(), mBridgeNativeEndCardView.f22242b.getRequestId(), mBridgeNativeEndCardView.f22242b.getRequestIdNotice(), mBridgeNativeEndCardView.f22242b.getId(), str);
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject();
        } catch (JSONException e9) {
            e = e9;
        }
        try {
            jSONObject.put(com.mbridge.msdk.foundation.same.a.f19409j, mBridgeNativeEndCardView.a(i8));
            if (mBridgeNativeEndCardView.f22242b.getDynamicTempCode() == 5) {
                jSONObject.put("camp_position", 0);
            }
        } catch (JSONException e10) {
            e = e10;
            jSONObject2 = jSONObject;
            e.printStackTrace();
            jSONObject = jSONObject2;
            mBridgeNativeEndCardView.f22242b.setClickTempSource(2);
            mBridgeNativeEndCardView.f22245e.a(105, jSONObject);
        }
        mBridgeNativeEndCardView.f22242b.setClickTempSource(2);
        mBridgeNativeEndCardView.f22245e.a(105, jSONObject);
    }
}
