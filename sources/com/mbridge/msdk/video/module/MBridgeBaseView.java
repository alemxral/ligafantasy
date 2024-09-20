package com.mbridge.msdk.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.video.module.a.a;
import com.mbridge.msdk.video.module.a.a.f;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class MBridgeBaseView extends RelativeLayout {
    public static final String TAG = "MBridgeBaseView";

    /* renamed from: a, reason: collision with root package name */
    protected Context f22241a;

    /* renamed from: b, reason: collision with root package name */
    protected CampaignEx f22242b;

    /* renamed from: c, reason: collision with root package name */
    protected LayoutInflater f22243c;

    /* renamed from: d, reason: collision with root package name */
    protected int f22244d;

    /* renamed from: e, reason: collision with root package name */
    protected a f22245e;

    /* renamed from: f, reason: collision with root package name */
    protected boolean f22246f;

    /* renamed from: g, reason: collision with root package name */
    protected float f22247g;

    /* renamed from: h, reason: collision with root package name */
    protected float f22248h;

    /* renamed from: i, reason: collision with root package name */
    protected boolean f22249i;

    /* renamed from: j, reason: collision with root package name */
    protected int f22250j;

    /* renamed from: k, reason: collision with root package name */
    protected boolean f22251k;

    /* renamed from: l, reason: collision with root package name */
    protected int f22252l;

    /* renamed from: m, reason: collision with root package name */
    protected int f22253m;

    public MBridgeBaseView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final JSONObject a(int i8) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(com.mbridge.msdk.foundation.same.a.f19407h, ai.b(c.m().c(), this.f22247g));
                jSONObject2.put(com.mbridge.msdk.foundation.same.a.f19408i, ai.b(c.m().c(), this.f22248h));
                jSONObject2.put(com.mbridge.msdk.foundation.same.a.f19412m, i8);
                try {
                    this.f22244d = getContext().getResources().getConfiguration().orientation;
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
                jSONObject2.put(com.mbridge.msdk.foundation.same.a.f19410k, this.f22244d);
                jSONObject2.put(com.mbridge.msdk.foundation.same.a.f19411l, ai.d(getContext()));
                return jSONObject2;
            } catch (JSONException e9) {
                e = e9;
                jSONObject = jSONObject2;
                e.printStackTrace();
                return jSONObject;
            }
        } catch (JSONException e10) {
            e = e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String d() {
        return a(0).toString();
    }

    public void defaultShow() {
        ad.a(TAG, "defaultShow");
    }

    public int filterFindViewId(boolean z8, String str) {
        if (z8) {
            return findDyID(str);
        }
        return findID(str);
    }

    public int findColor(String str) {
        return v.a(this.f22241a.getApplicationContext(), str, "color");
    }

    public int findDrawable(String str) {
        return v.a(this.f22241a.getApplicationContext(), str, "drawable");
    }

    public int findDyID(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.hashCode();
        }
        return -1;
    }

    public int findID(String str) {
        return v.a(this.f22241a.getApplicationContext(), str, "id");
    }

    public int findLayout(String str) {
        return v.a(this.f22241a.getApplicationContext(), str, TtmlNode.TAG_LAYOUT);
    }

    public CampaignEx getCampaign() {
        return this.f22242b;
    }

    public LinearLayout.LayoutParams getParentLinearLayoutParams() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return (LinearLayout.LayoutParams) layoutParams;
        }
        return null;
    }

    public RelativeLayout.LayoutParams getParentRelativeLayoutParams() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            return (RelativeLayout.LayoutParams) layoutParams;
        }
        return null;
    }

    public abstract void init(Context context);

    public boolean isLandscape() {
        if (this.f22241a.getResources().getConfiguration().orientation == 2) {
            return true;
        }
        return false;
    }

    public boolean isNotNULL(View... viewArr) {
        if (viewArr == null) {
            return false;
        }
        int length = viewArr.length;
        int i8 = 0;
        boolean z8 = false;
        while (i8 < length) {
            if (viewArr[i8] == null) {
                return false;
            }
            i8++;
            z8 = true;
        }
        return z8;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        this.f22244d = configuration.orientation;
        super.onConfigurationChanged(configuration);
        Log.d(TAG, "onConfigurationChanged:" + configuration.orientation);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f22247g = motionEvent.getRawX();
        this.f22248h = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onSelfConfigurationChanged(Configuration configuration) {
        this.f22244d = configuration.orientation;
        Log.d(TAG, "onSelfConfigurationChanged:" + configuration.orientation);
    }

    public void setCampaign(CampaignEx campaignEx) {
        this.f22242b = campaignEx;
    }

    public void setLayoutCenter(int i8, int i9) {
        RelativeLayout.LayoutParams parentRelativeLayoutParams = getParentRelativeLayoutParams();
        LinearLayout.LayoutParams parentLinearLayoutParams = getParentLinearLayoutParams();
        if (parentRelativeLayoutParams != null) {
            parentRelativeLayoutParams.addRule(13);
            if (i8 != -999) {
                parentRelativeLayoutParams.width = i8;
            }
            if (i9 != -999) {
                parentRelativeLayoutParams.height = i9;
            }
            setLayoutParams(parentRelativeLayoutParams);
            return;
        }
        if (parentLinearLayoutParams != null) {
            parentLinearLayoutParams.gravity = 17;
            if (i8 != -999) {
                parentLinearLayoutParams.width = i8;
            }
            if (i9 != -999) {
                parentLinearLayoutParams.height = i9;
            }
            setLayoutParams(parentLinearLayoutParams);
        }
    }

    public void setLayoutParam(int i8, int i9, int i10, int i11) {
        RelativeLayout.LayoutParams parentRelativeLayoutParams = getParentRelativeLayoutParams();
        LinearLayout.LayoutParams parentLinearLayoutParams = getParentLinearLayoutParams();
        if (parentRelativeLayoutParams != null) {
            parentRelativeLayoutParams.topMargin = i9;
            parentRelativeLayoutParams.leftMargin = i8;
            if (i10 != -999) {
                parentRelativeLayoutParams.width = i10;
            }
            if (i11 != -999) {
                parentRelativeLayoutParams.height = i11;
            }
            setLayoutParams(parentRelativeLayoutParams);
            return;
        }
        if (parentLinearLayoutParams != null) {
            parentLinearLayoutParams.topMargin = i9;
            parentLinearLayoutParams.leftMargin = i8;
            if (i10 != -999) {
                parentLinearLayoutParams.width = i10;
            }
            if (i11 != -999) {
                parentLinearLayoutParams.height = i11;
            }
            setLayoutParams(parentLinearLayoutParams);
        }
    }

    public void setMatchParent() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        } else {
            layoutParams.height = -1;
            layoutParams.width = -1;
        }
    }

    public void setNotifyListener(a aVar) {
        this.f22245e = aVar;
    }

    public void setWrapContent() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        } else {
            layoutParams.height = -2;
            layoutParams.width = -2;
        }
    }

    public MBridgeBaseView(Context context, AttributeSet attributeSet, boolean z8, int i8, boolean z9, int i9, int i10) {
        super(context, attributeSet);
        this.f22244d = 1;
        this.f22245e = new f();
        this.f22246f = false;
        this.f22252l = 1;
        this.f22253m = 0;
        this.f22241a = context;
        this.f22243c = LayoutInflater.from(context);
        this.f22249i = z8;
        this.f22250j = i8;
        this.f22251k = z9;
        this.f22252l = i9;
        this.f22253m = i10;
        init(context);
    }

    public MBridgeBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22244d = 1;
        this.f22245e = new f();
        this.f22246f = false;
        this.f22252l = 1;
        this.f22253m = 0;
        this.f22241a = context;
        this.f22243c = LayoutInflater.from(context);
        init(context);
    }
}
