package com.mbridge.msdk.video.module;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.k;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.video.dynview.a;
import com.mbridge.msdk.video.dynview.e.g;
import com.mbridge.msdk.video.dynview.j.c;
import com.mbridge.msdk.video.module.a.a.e;
import com.mbridge.msdk.video.signal.factory.b;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class MBridgeClickCTAView extends MBridgeClickCTAViewDiff {

    /* renamed from: n, reason: collision with root package name */
    private ViewGroup f22254n;

    /* renamed from: o, reason: collision with root package name */
    private ImageView f22255o;

    /* renamed from: p, reason: collision with root package name */
    private TextView f22256p;

    /* renamed from: q, reason: collision with root package name */
    private TextView f22257q;

    /* renamed from: r, reason: collision with root package name */
    private String f22258r;

    /* renamed from: s, reason: collision with root package name */
    private float f22259s;

    /* renamed from: t, reason: collision with root package name */
    private float f22260t;

    /* renamed from: u, reason: collision with root package name */
    private int f22261u;

    /* renamed from: v, reason: collision with root package name */
    private ObjectAnimator f22262v;

    public MBridgeClickCTAView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b() {
        this.f22254n = (ViewGroup) findViewById(findID("mbridge_viewgroup_ctaroot"));
        this.f22255o = (ImageView) findViewById(findID("mbridge_iv_appicon"));
        this.f22256p = (TextView) findViewById(findID("mbridge_tv_title"));
        TextView textView = (TextView) findViewById(findID("mbridge_tv_install"));
        this.ctaTv = textView;
        return isNotNULL(this.f22254n, this.f22255o, this.f22256p, textView);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeClickCTAViewDiff, com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ObjectAnimator objectAnimator = this.f22262v;
        if (objectAnimator != null) {
            try {
                objectAnimator.start();
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ObjectAnimator objectAnimator = this.f22262v;
        if (objectAnimator != null) {
            try {
                objectAnimator.cancel();
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f22259s = motionEvent.getRawX();
        this.f22260t = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        this.f22261u = configuration.orientation;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeClickCTAViewDiff
    public void preLoadData(b bVar) {
        CampaignEx campaignEx = this.f22242b;
        if (campaignEx != null) {
            if (campaignEx.isDynamicView()) {
                com.mbridge.msdk.video.dynview.b.a().a(new c().b(this, this.f22242b), new g() { // from class: com.mbridge.msdk.video.module.MBridgeClickCTAView.1
                    @Override // com.mbridge.msdk.video.dynview.e.g
                    public final void a(a aVar) {
                        if (aVar != null) {
                            this.addView(aVar.a());
                            MBridgeClickCTAView mBridgeClickCTAView = MBridgeClickCTAView.this;
                            mBridgeClickCTAView.f22246f = mBridgeClickCTAView.b();
                            MBridgeClickCTAView mBridgeClickCTAView2 = MBridgeClickCTAView.this;
                            mBridgeClickCTAView2.f22257q = (TextView) mBridgeClickCTAView2.findViewById(mBridgeClickCTAView2.findID("mbridge_tv_desc"));
                            MBridgeClickCTAView.this.c();
                        }
                    }

                    @Override // com.mbridge.msdk.video.dynview.e.g
                    public final void a(com.mbridge.msdk.video.dynview.c.a aVar) {
                        ad.b(MBridgeBaseView.TAG, "errorMsg:" + aVar.b());
                    }
                });
            } else {
                int findLayout = findLayout("mbridge_reward_clickable_cta");
                if (findLayout >= 0) {
                    this.f22243c.inflate(findLayout, this);
                    this.f22246f = b();
                    c();
                    setWrapContent();
                }
            }
            if (this.f22246f) {
                if (com.mbridge.msdk.f.b.a()) {
                    setChinaCTAData();
                }
                this.ctaTv.setText(this.f22242b.getAdCall());
                if (!TextUtils.isEmpty(this.f22242b.getIconUrl())) {
                    com.mbridge.msdk.foundation.same.c.b.a(this.f22241a.getApplicationContext()).a(this.f22242b.getIconUrl(), new e(this.f22255o, this.f22242b, this.f22258r) { // from class: com.mbridge.msdk.video.module.MBridgeClickCTAView.5
                        @Override // com.mbridge.msdk.video.module.a.a.e, com.mbridge.msdk.foundation.same.c.c
                        public final void onFailedLoad(String str, String str2) {
                            super.onFailedLoad(str, str2);
                            MBridgeClickCTAView.this.a();
                        }
                    });
                } else {
                    a();
                }
                if (this.f22256p != null && !TextUtils.isEmpty(this.f22242b.getAppName())) {
                    this.f22256p.setText(this.f22242b.getAppName());
                }
                if (this.f22257q != null && !TextUtils.isEmpty(this.f22242b.getAppDesc())) {
                    this.f22257q.setText(this.f22242b.getAppDesc());
                }
            }
        }
    }

    public void setObjectAnimator(ObjectAnimator objectAnimator) {
        this.f22262v = objectAnimator;
    }

    public void setUnitId(String str) {
        this.f22258r = str;
    }

    public MBridgeClickCTAView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public final void c() {
        super.c();
        if (this.f22246f) {
            CampaignEx campaignEx = this.f22242b;
            if (campaignEx != null && campaignEx.isDynamicView()) {
                setOnClickListener(new com.mbridge.msdk.widget.a() { // from class: com.mbridge.msdk.video.module.MBridgeClickCTAView.2
                    @Override // com.mbridge.msdk.widget.a
                    protected final void a(View view) {
                        MBridgeClickCTAView.b(MBridgeClickCTAView.this);
                    }
                });
            }
            this.ctaTv.setOnClickListener(new com.mbridge.msdk.widget.a() { // from class: com.mbridge.msdk.video.module.MBridgeClickCTAView.3
                @Override // com.mbridge.msdk.widget.a
                protected final void a(View view) {
                    MBridgeClickCTAView.b(MBridgeClickCTAView.this);
                }
            });
            ImageView imageView = this.f22255o;
            if (imageView != null) {
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeClickCTAView.4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        ImageView imageView = this.f22255o;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    static /* synthetic */ void b(MBridgeClickCTAView mBridgeClickCTAView) {
        JSONObject jSONObject;
        JSONException e8;
        CampaignEx campaignEx = mBridgeClickCTAView.f22242b;
        if (campaignEx != null && campaignEx.isDynamicView()) {
            try {
                CampaignEx.c rewardTemplateMode = mBridgeClickCTAView.f22242b.getRewardTemplateMode();
                String str = "";
                if (rewardTemplateMode != null) {
                    str = rewardTemplateMode.f() + "";
                }
                k.a(com.mbridge.msdk.foundation.controller.c.m().c(), "cta_click", mBridgeClickCTAView.f22242b.getCampaignUnitId(), mBridgeClickCTAView.f22242b.isBidCampaign(), mBridgeClickCTAView.f22242b.getRequestId(), mBridgeClickCTAView.f22242b.getRequestIdNotice(), mBridgeClickCTAView.f22242b.getId(), str);
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
        try {
            jSONObject = new JSONObject();
        } catch (JSONException e10) {
            jSONObject = null;
            e8 = e10;
        }
        try {
            jSONObject.put(com.mbridge.msdk.foundation.same.a.f19409j, mBridgeClickCTAView.a(0));
        } catch (JSONException e11) {
            e8 = e11;
            e8.printStackTrace();
            mBridgeClickCTAView.f22242b.setTriggerClickSource(1);
            mBridgeClickCTAView.f22242b.setClickTempSource(1);
            mBridgeClickCTAView.f22245e.a(105, jSONObject);
        }
        mBridgeClickCTAView.f22242b.setTriggerClickSource(1);
        mBridgeClickCTAView.f22242b.setClickTempSource(1);
        mBridgeClickCTAView.f22245e.a(105, jSONObject);
    }
}
