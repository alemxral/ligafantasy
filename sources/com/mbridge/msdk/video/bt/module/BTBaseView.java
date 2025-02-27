package com.mbridge.msdk.video.bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.a;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.mbsignalcommon.windvane.g;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.video.bt.a.d;
import com.mbridge.msdk.videocommon.d.c;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class BTBaseView extends FrameLayout {
    public static final String TAG = "BTBaseView";

    /* renamed from: n, reason: collision with root package name */
    protected static int f21766n = 0;

    /* renamed from: o, reason: collision with root package name */
    protected static int f21767o = 1;

    /* renamed from: a, reason: collision with root package name */
    protected Context f21768a;

    /* renamed from: b, reason: collision with root package name */
    protected CampaignEx f21769b;

    /* renamed from: c, reason: collision with root package name */
    protected String f21770c;

    /* renamed from: d, reason: collision with root package name */
    protected String f21771d;

    /* renamed from: e, reason: collision with root package name */
    protected c f21772e;

    /* renamed from: f, reason: collision with root package name */
    protected LayoutInflater f21773f;

    /* renamed from: g, reason: collision with root package name */
    protected int f21774g;

    /* renamed from: h, reason: collision with root package name */
    protected boolean f21775h;

    /* renamed from: i, reason: collision with root package name */
    protected float f21776i;

    /* renamed from: j, reason: collision with root package name */
    protected float f21777j;

    /* renamed from: k, reason: collision with root package name */
    protected Rect f21778k;

    /* renamed from: l, reason: collision with root package name */
    protected int f21779l;

    /* renamed from: m, reason: collision with root package name */
    protected int f21780m;

    public BTBaseView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a() {
    }

    public void defaultShow() {
        ad.a(TAG, "defaultShow");
    }

    public int findColor(String str) {
        return v.a(this.f21768a.getApplicationContext(), str, "color");
    }

    public int findDrawable(String str) {
        return v.a(this.f21768a.getApplicationContext(), str, "drawable");
    }

    public int findID(String str) {
        return v.a(this.f21768a.getApplicationContext(), str, "id");
    }

    public int findLayout(String str) {
        return v.a(this.f21768a.getApplicationContext(), str, TtmlNode.TAG_LAYOUT);
    }

    public CampaignEx getCampaign() {
        return this.f21769b;
    }

    public String getInstanceId() {
        return this.f21771d;
    }

    public FrameLayout.LayoutParams getParentFrameLayoutParams() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            return (FrameLayout.LayoutParams) layoutParams;
        }
        return null;
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

    public Rect getRect() {
        return this.f21778k;
    }

    public String getUnitId() {
        return this.f21770c;
    }

    public int getViewHeight() {
        return this.f21780m;
    }

    public int getViewWidth() {
        return this.f21779l;
    }

    public abstract void init(Context context);

    public boolean isLandscape() {
        if (this.f21768a.getResources().getConfiguration().orientation == 2) {
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
        this.f21774g = configuration.orientation;
        super.onConfigurationChanged(configuration);
    }

    public abstract void onDestory();

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f21776i = motionEvent.getRawX();
        this.f21777j = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onSelfConfigurationChanged(Configuration configuration) {
        this.f21774g = configuration.orientation;
    }

    public void setCampaign(CampaignEx campaignEx) {
        this.f21769b = campaignEx;
    }

    public void setInstanceId(String str) {
        this.f21771d = str;
    }

    public void setLayout(int i8, int i9) {
        this.f21779l = i8;
        this.f21780m = i9;
    }

    public void setLayoutCenter(int i8, int i9) {
        FrameLayout.LayoutParams parentFrameLayoutParams = getParentFrameLayoutParams();
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
            return;
        }
        if (parentFrameLayoutParams != null) {
            parentFrameLayoutParams.gravity = 17;
            if (i8 != -999) {
                parentFrameLayoutParams.width = i8;
            }
            if (i9 != -999) {
                parentFrameLayoutParams.height = i9;
            }
            setLayoutParams(parentFrameLayoutParams);
        }
    }

    public void setLayoutParam(int i8, int i9, int i10, int i11) {
        FrameLayout.LayoutParams parentFrameLayoutParams = getParentFrameLayoutParams();
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
            return;
        }
        if (parentFrameLayoutParams != null) {
            parentFrameLayoutParams.topMargin = i9;
            parentFrameLayoutParams.leftMargin = i8;
            if (i10 != -999) {
                parentFrameLayoutParams.width = i10;
            }
            if (i11 != -999) {
                parentFrameLayoutParams.height = i11;
            }
            setLayoutParams(parentFrameLayoutParams);
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

    public void setRect(Rect rect) {
        this.f21778k = rect;
    }

    public void setRewardUnitSetting(c cVar) {
        this.f21772e = cVar;
    }

    public void setUnitId(String str) {
        this.f21770c = str;
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

    public BTBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21771d = "";
        this.f21774g = 1;
        this.f21775h = false;
        this.f21768a = context;
        this.f21773f = LayoutInflater.from(context);
        init(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final JSONObject a(int i8) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(a.f19407h, ai.b(com.mbridge.msdk.foundation.controller.c.m().c(), this.f21776i));
                jSONObject2.put(a.f19408i, ai.b(com.mbridge.msdk.foundation.controller.c.m().c(), this.f21777j));
                jSONObject2.put(a.f19412m, i8);
                try {
                    this.f21774g = getContext().getResources().getConfiguration().orientation;
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
                jSONObject2.put(a.f19410k, this.f21774g);
                jSONObject2.put(a.f19411l, ai.d(getContext()));
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
    public static void a(WebView webView, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f21766n);
            jSONObject.put("id", str2);
            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, new JSONObject());
            g.a().a(webView, str, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e8) {
            d.c().a(webView, e8.getMessage());
            ad.a(TAG, e8.getMessage());
        }
    }
}
