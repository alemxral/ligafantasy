package com.mbridge.msdk.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.video.module.a.a.j;
import com.mbridge.msdk.video.signal.factory.b;

/* loaded from: classes4.dex */
public class MBridgeVideoEndCoverView extends MBridgeBaseView {

    /* renamed from: n, reason: collision with root package name */
    private final String f22418n;

    /* renamed from: o, reason: collision with root package name */
    private View f22419o;

    /* renamed from: p, reason: collision with root package name */
    private ImageView f22420p;

    /* renamed from: q, reason: collision with root package name */
    private ImageView f22421q;

    /* renamed from: r, reason: collision with root package name */
    private TextView f22422r;

    /* renamed from: s, reason: collision with root package name */
    private TextView f22423s;

    /* renamed from: t, reason: collision with root package name */
    private TextView f22424t;

    /* renamed from: u, reason: collision with root package name */
    private b f22425u;

    public MBridgeVideoEndCoverView(Context context) {
        super(context);
        this.f22418n = "MBridgeVideoEndCoverView";
    }

    private boolean a(View view) {
        if (view == null) {
            return true;
        }
        try {
            this.f22420p = (ImageView) view.findViewById(findID("mbridge_vec_iv_icon"));
            this.f22421q = (ImageView) view.findViewById(findID("mbridge_vec_iv_close"));
            this.f22422r = (TextView) view.findViewById(findID("mbridge_vec_tv_title"));
            this.f22423s = (TextView) view.findViewById(findID("mbridge_vec_tv_desc"));
            this.f22424t = (TextView) view.findViewById(findID("mbridge_vec_btn"));
            return true;
        } catch (Throwable th) {
            ad.b("MBridgeVideoEndCoverView", th.getMessage());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public final void c() {
        super.c();
        this.f22421q.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeVideoEndCoverView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MBridgeVideoEndCoverView.this.f22245e.a(104, "");
            }
        });
        this.f22420p.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeVideoEndCoverView.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MBridgeVideoEndCoverView.this.a();
            }
        });
        this.f22424t.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeVideoEndCoverView.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MBridgeVideoEndCoverView.this.a();
            }
        });
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
        int findLayout = findLayout("mbridge_reward_videoend_cover");
        if (findLayout >= 0) {
            View inflate = this.f22243c.inflate(findLayout, (ViewGroup) null);
            this.f22419o = inflate;
            if (inflate != null) {
                this.f22246f = a(inflate);
                addView(this.f22419o, -1, -1);
                c();
            }
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f22247g = motionEvent.getRawX();
        this.f22248h = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        this.f22244d = configuration.orientation;
        removeView(this.f22419o);
        View view = this.f22419o;
        if (view == null) {
            init(this.f22241a);
            preLoadData(this.f22425u);
            return;
        }
        if (view.getParent() != null) {
            ((ViewGroup) this.f22419o.getParent()).removeView(this.f22419o);
        }
        addView(this.f22419o);
        a(this.f22419o);
        c();
    }

    public void preLoadData(b bVar) {
        ImageView imageView;
        this.f22425u = bVar;
        try {
            CampaignEx campaignEx = this.f22242b;
            if (campaignEx != null && this.f22246f && campaignEx != null) {
                if (!TextUtils.isEmpty(campaignEx.getIconUrl()) && (imageView = this.f22420p) != null) {
                    com.mbridge.msdk.foundation.same.c.b.a(this.f22241a.getApplicationContext()).a(this.f22242b.getIconUrl(), new j(imageView, ai.a(c.m().c(), 8.0f)));
                }
                TextView textView = this.f22422r;
                if (textView != null) {
                    textView.setText(this.f22242b.getAppName());
                }
                TextView textView2 = this.f22424t;
                if (textView2 != null) {
                    textView2.setText(this.f22242b.getAdCall());
                }
                TextView textView3 = this.f22423s;
                if (textView3 != null) {
                    textView3.setText(this.f22242b.getAppDesc());
                }
            }
        } catch (Throwable th) {
            ad.a("MBridgeVideoEndCoverView", th.getMessage());
        }
    }

    public MBridgeVideoEndCoverView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22418n = "MBridgeVideoEndCoverView";
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|2|3|(2:4|5)|(5:6|7|8|9|10)|11|12|13|14|15|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0082, code lost:
    
        r0.printStackTrace();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void a() {
        /*
            r6 = this;
            r0 = 0
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L7e
            r1.<init>()     // Catch: org.json.JSONException -> L7e
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L64
            r2.<init>()     // Catch: org.json.JSONException -> L64
            java.lang.String r1 = com.mbridge.msdk.foundation.same.a.f19407h     // Catch: org.json.JSONException -> L62
            com.mbridge.msdk.foundation.controller.c r3 = com.mbridge.msdk.foundation.controller.c.m()     // Catch: org.json.JSONException -> L62
            android.content.Context r3 = r3.c()     // Catch: org.json.JSONException -> L62
            float r4 = r6.f22247g     // Catch: org.json.JSONException -> L62
            int r3 = com.mbridge.msdk.foundation.tools.ai.b(r3, r4)     // Catch: org.json.JSONException -> L62
            r2.put(r1, r3)     // Catch: org.json.JSONException -> L62
            java.lang.String r1 = com.mbridge.msdk.foundation.same.a.f19408i     // Catch: org.json.JSONException -> L62
            com.mbridge.msdk.foundation.controller.c r3 = com.mbridge.msdk.foundation.controller.c.m()     // Catch: org.json.JSONException -> L62
            android.content.Context r3 = r3.c()     // Catch: org.json.JSONException -> L62
            float r4 = r6.f22248h     // Catch: org.json.JSONException -> L62
            int r3 = com.mbridge.msdk.foundation.tools.ai.b(r3, r4)     // Catch: org.json.JSONException -> L62
            r2.put(r1, r3)     // Catch: org.json.JSONException -> L62
            java.lang.String r1 = com.mbridge.msdk.foundation.same.a.f19412m     // Catch: org.json.JSONException -> L62
            r3 = 0
            r2.put(r1, r3)     // Catch: org.json.JSONException -> L62
            android.content.Context r1 = r6.getContext()     // Catch: java.lang.Exception -> L48
            android.content.res.Resources r1 = r1.getResources()     // Catch: java.lang.Exception -> L48
            android.content.res.Configuration r1 = r1.getConfiguration()     // Catch: java.lang.Exception -> L48
            int r1 = r1.orientation     // Catch: java.lang.Exception -> L48
            r6.f22244d = r1     // Catch: java.lang.Exception -> L48
            goto L4c
        L48:
            r1 = move-exception
            r1.printStackTrace()     // Catch: org.json.JSONException -> L62
        L4c:
            java.lang.String r1 = com.mbridge.msdk.foundation.same.a.f19410k     // Catch: org.json.JSONException -> L62
            int r3 = r6.f22244d     // Catch: org.json.JSONException -> L62
            r2.put(r1, r3)     // Catch: org.json.JSONException -> L62
            java.lang.String r1 = com.mbridge.msdk.foundation.same.a.f19411l     // Catch: org.json.JSONException -> L62
            android.content.Context r3 = r6.getContext()     // Catch: org.json.JSONException -> L62
            float r3 = com.mbridge.msdk.foundation.tools.ai.d(r3)     // Catch: org.json.JSONException -> L62
            double r3 = (double) r3     // Catch: org.json.JSONException -> L62
            r2.put(r1, r3)     // Catch: org.json.JSONException -> L62
            goto L71
        L62:
            r1 = move-exception
            goto L68
        L64:
            r2 = move-exception
            r5 = r2
            r2 = r1
            r1 = r5
        L68:
            java.lang.String r3 = "MBridgeVideoEndCoverView"
            java.lang.String r1 = r1.getMessage()     // Catch: org.json.JSONException -> L7e
            com.mbridge.msdk.foundation.tools.ad.b(r3, r1)     // Catch: org.json.JSONException -> L7e
        L71:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L7e
            r1.<init>()     // Catch: org.json.JSONException -> L7e
            java.lang.String r0 = com.mbridge.msdk.foundation.same.a.f19409j     // Catch: org.json.JSONException -> L7c
            r1.put(r0, r2)     // Catch: org.json.JSONException -> L7c
            goto L85
        L7c:
            r0 = move-exception
            goto L82
        L7e:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L82:
            r0.printStackTrace()
        L85:
            com.mbridge.msdk.video.module.a.a r0 = r6.f22245e
            r2 = 105(0x69, float:1.47E-43)
            r0.a(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.MBridgeVideoEndCoverView.a():void");
    }
}
