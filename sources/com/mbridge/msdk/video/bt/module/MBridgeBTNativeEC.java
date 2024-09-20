package com.mbridge.msdk.video.bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.c.b;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.mbsignalcommon.windvane.g;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.video.bt.a.d;
import com.mbridge.msdk.video.module.a.a.e;
import com.mbridge.msdk.video.module.a.a.j;
import com.mbridge.msdk.video.signal.a.k;
import com.mbridge.msdk.videocommon.d.c;
import com.mbridge.msdk.videocommon.view.RoundImageView;
import com.mbridge.msdk.videocommon.view.StarLevelView;
import com.mbridge.msdk.widget.a;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class MBridgeBTNativeEC extends MBridgeBTNativeECDiff {

    /* renamed from: A, reason: collision with root package name */
    private TextView f21868A;

    /* renamed from: B, reason: collision with root package name */
    private StarLevelView f21869B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f21870C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f21871D;

    /* renamed from: E, reason: collision with root package name */
    private int f21872E;

    /* renamed from: F, reason: collision with root package name */
    private Runnable f21873F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f21874G;

    /* renamed from: H, reason: collision with root package name */
    private View f21875H;

    /* renamed from: I, reason: collision with root package name */
    private String f21876I;

    /* renamed from: J, reason: collision with root package name */
    private k f21877J;

    /* renamed from: K, reason: collision with root package name */
    private WebView f21878K;

    /* renamed from: p, reason: collision with root package name */
    private ViewGroup f21879p;

    /* renamed from: q, reason: collision with root package name */
    private ViewGroup f21880q;

    /* renamed from: r, reason: collision with root package name */
    private RelativeLayout f21881r;

    /* renamed from: s, reason: collision with root package name */
    private ImageView f21882s;

    /* renamed from: t, reason: collision with root package name */
    private RoundImageView f21883t;

    /* renamed from: u, reason: collision with root package name */
    private ImageView f21884u;

    /* renamed from: v, reason: collision with root package name */
    private ImageView f21885v;

    /* renamed from: w, reason: collision with root package name */
    private ImageView f21886w;

    /* renamed from: x, reason: collision with root package name */
    private ImageView f21887x;

    /* renamed from: y, reason: collision with root package name */
    private TextView f21888y;

    /* renamed from: z, reason: collision with root package name */
    private TextView f21889z;

    public MBridgeBTNativeEC(Context context) {
        super(context);
        this.f21870C = false;
        this.f21871D = false;
        this.f21872E = 0;
        this.f21874G = false;
    }

    public Bitmap blurBitmap(Bitmap bitmap) {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            RenderScript create = RenderScript.create(this.f21768a.getApplicationContext());
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap);
            Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
            create2.setRadius(10.0f);
            create2.setInput(createFromBitmap);
            create2.forEach(createFromBitmap2);
            createFromBitmap2.copyTo(createBitmap);
            bitmap.recycle();
            create.destroy();
            return createBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.MBridgeBTNativeECDiff, com.mbridge.msdk.video.bt.module.BTBaseView
    public void init(Context context) {
        String str;
        boolean b8;
        if (isLandscape()) {
            str = "mbridge_reward_endcard_native_land";
        } else {
            str = "mbridge_reward_endcard_native_hor";
        }
        int findLayout = findLayout(str);
        if (findLayout > 0) {
            if (isLandscape()) {
                ViewGroup viewGroup = (ViewGroup) this.f21773f.inflate(findLayout, (ViewGroup) null);
                this.f21880q = viewGroup;
                addView(viewGroup);
                b8 = b(this.f21880q);
            } else {
                ViewGroup viewGroup2 = (ViewGroup) this.f21773f.inflate(findLayout, (ViewGroup) null);
                this.f21879p = viewGroup2;
                addView(viewGroup2);
                b8 = b(this.f21879p);
            }
            this.f21775h = b8;
            a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f21873F == null) {
            this.f21873F = new Runnable() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTNativeEC.1
                @Override // java.lang.Runnable
                public final void run() {
                    MBridgeBTNativeEC.this.f21871D = true;
                    if (MBridgeBTNativeEC.this.f21875H != null) {
                        MBridgeBTNativeEC.this.f21875H.setVisibility(0);
                    }
                }
            };
        }
        Runnable runnable = this.f21873F;
        if (runnable != null) {
            postDelayed(runnable, this.f21872E * 1000);
        }
        if (!this.f21775h && this.f21878K != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("id", this.f21771d);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, this.f21876I);
                jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                ad.a(BTBaseView.TAG, "NativeEC Call H5 onCloseBtnClicked " + jSONObject.toString());
            } catch (JSONException e8) {
                ad.a(BTBaseView.TAG, e8.getMessage());
            }
            g.a().a(this.f21878K, "onCloseBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        }
        if (this.f21878K != null) {
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("id", this.f21771d);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, this.f21876I);
                jSONObject3.put(DataSchemeDataSource.SCHEME_DATA, jSONObject4);
                ad.a(BTBaseView.TAG, "NativeEC Call H5 onEndCardShow " + jSONObject3.toString());
            } catch (JSONException e9) {
                ad.a(BTBaseView.TAG, e9.getMessage());
            }
            g.a().a(this.f21878K, "onNativeECShow", Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.MBridgeBTNativeECDiff, com.mbridge.msdk.video.bt.module.BTBaseView
    public void onDestory() {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f21873F;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        int i8 = configuration.orientation;
        this.f21774g = i8;
        if (i8 == 2) {
            removeView(this.f21879p);
            a(this.f21880q);
        } else {
            removeView(this.f21880q);
            a(this.f21879p);
        }
    }

    public void preLoadData() {
        Bitmap blurBitmap;
        try {
            CampaignEx campaignEx = this.f21769b;
            if (campaignEx != null && this.f21775h) {
                if (campaignEx.getCbd() > -2) {
                    this.f21872E = this.f21769b.getCbd();
                } else {
                    c cVar = this.f21772e;
                    if (cVar != null) {
                        this.f21872E = cVar.p();
                    }
                }
                b.a(this.f21768a.getApplicationContext()).a(this.f21769b.getImageUrl(), new e(this.f21883t, this.f21769b, this.f21876I));
                b.a(this.f21768a.getApplicationContext()).a(this.f21769b.getIconUrl(), new j(this.f21884u, ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 8.0f)));
                this.f21888y.setText(this.f21769b.getAppName());
                this.f21889z.setText(this.f21769b.getAppDesc());
                this.f21868A.setText(this.f21769b.getNumberRating() + ")");
                this.f21869B.removeAllViews();
                if (com.mbridge.msdk.f.b.a()) {
                    setChinaCTAData(this.f21769b);
                }
                double rating = this.f21769b.getRating();
                if (rating <= 0.0d) {
                    rating = 5.0d;
                }
                this.f21869B.initScore(rating);
                try {
                    Bitmap a8 = a(this.f21883t.getDrawable());
                    if (a8 != null && (blurBitmap = blurBitmap(a8)) != null) {
                        this.f21882s.setImageBitmap(blurBitmap);
                    }
                } catch (Throwable unused) {
                    this.f21882s.setVisibility(8);
                }
                if (!TextUtils.isEmpty(this.f21769b.getendcard_url()) && this.f21769b.getendcard_url().contains("alecfc=1")) {
                    this.f21870C = true;
                }
                if (!TextUtils.isEmpty(this.f21769b.getendcard_url()) && this.f21769b.getendcard_url().contains("wlgo=1")) {
                    this.f21874G = true;
                }
                String language = Locale.getDefault().getLanguage();
                if (!TextUtils.isEmpty(language) && language.equals("zh")) {
                    this.f21885v.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_reward_flag_cn", "drawable", com.mbridge.msdk.foundation.controller.c.m().g())));
                } else {
                    this.f21885v.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_reward_flag_en", "drawable", com.mbridge.msdk.foundation.controller.c.m().g())));
                }
                if (!this.f21874G) {
                    this.f21885v.setVisibility(4);
                    this.f21887x.setVisibility(4);
                }
                ai.a(2, this.f21886w, this.f21769b, this.f21768a, true, null);
                if (!this.f21871D) {
                    this.f21875H.setVisibility(8);
                }
            }
        } catch (Throwable th) {
            ad.a(BTBaseView.TAG, th.getMessage());
        }
    }

    public void setCreateWebView(WebView webView) {
        this.f21878K = webView;
    }

    public void setJSCommon(k kVar) {
        this.f21877J = kVar;
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void setUnitId(String str) {
        this.f21876I = str;
    }

    private boolean b(View view) {
        try {
            this.f21881r = (RelativeLayout) view.findViewById(findID("mbridge_native_ec_layout"));
            this.f21882s = (ImageView) view.findViewById(findID("mbridge_iv_adbanner_bg"));
            this.f21883t = (RoundImageView) view.findViewById(findID("mbridge_iv_adbanner"));
            this.f21884u = (ImageView) view.findViewById(findID("mbridge_iv_icon"));
            this.f21885v = (ImageView) view.findViewById(findID("mbridge_iv_flag"));
            this.f21886w = (ImageView) view.findViewById(findID("mbridge_iv_link"));
            this.f21888y = (TextView) view.findViewById(findID("mbridge_tv_apptitle"));
            this.f21889z = (TextView) view.findViewById(findID("mbridge_tv_appdesc"));
            this.f21868A = (TextView) view.findViewById(findID("mbridge_tv_number"));
            this.f21869B = (StarLevelView) view.findViewById(findID("mbridge_sv_starlevel"));
            this.f21875H = view.findViewById(findID("mbridge_iv_close"));
            this.ctaView = view.findViewById(findID("mbridge_tv_cta"));
            this.f21887x = (ImageView) view.findViewById(findID("mbridge_iv_logo"));
            return isNotNULL(this.f21882s, this.f21883t, this.f21884u, this.f21888y, this.f21889z, this.f21868A, this.f21869B, this.f21875H, this.ctaView);
        } catch (Throwable th) {
            ad.a(BTBaseView.TAG, th.getMessage(), th);
            return false;
        }
    }

    private void a(View view) {
        if (view == null) {
            init(this.f21768a);
            preLoadData();
            return;
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        addView(view);
        b(view);
        a();
    }

    public MBridgeBTNativeEC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21870C = false;
        this.f21871D = false;
        this.f21872E = 0;
        this.f21874G = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public final void a() {
        if (this.f21775h) {
            this.f21881r.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTNativeEC.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (MBridgeBTNativeEC.this.f21870C) {
                        MBridgeBTNativeEC.a(MBridgeBTNativeEC.this, 1, view.getContext());
                        MBridgeBTNativeEC.a(MBridgeBTNativeEC.this, view.getX(), view.getY());
                    }
                }
            });
            this.f21875H.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTNativeEC.3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (MBridgeBTNativeEC.this.f21878K != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", MBridgeBTNativeEC.this.f21771d);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, MBridgeBTNativeEC.this.f21876I);
                            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                            ad.a(BTBaseView.TAG, "NativeEC Call H5 onCloseBtnClicked " + jSONObject.toString());
                        } catch (JSONException e8) {
                            ad.a(BTBaseView.TAG, e8.getMessage());
                        }
                        g.a().a(MBridgeBTNativeEC.this.f21878K, "onCloseBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }
            });
            this.ctaView.setOnClickListener(new a() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTNativeEC.4
                @Override // com.mbridge.msdk.widget.a
                protected final void a(View view) {
                    MBridgeBTNativeEC.a(MBridgeBTNativeEC.this, 0, view.getContext());
                    MBridgeBTNativeEC.a(MBridgeBTNativeEC.this, view.getX(), view.getY());
                }
            });
            this.f21884u.setOnClickListener(new a() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTNativeEC.5
                @Override // com.mbridge.msdk.widget.a
                protected final void a(View view) {
                    if (!com.mbridge.msdk.f.b.a() || MBridgeBTNativeEC.this.checkChinaProgressBarStatus()) {
                        MBridgeBTNativeEC.a(MBridgeBTNativeEC.this, 0, view.getContext());
                    }
                    MBridgeBTNativeEC.a(MBridgeBTNativeEC.this, view.getX(), view.getY());
                }
            });
            this.f21883t.setOnClickListener(new a() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTNativeEC.6
                @Override // com.mbridge.msdk.widget.a
                protected final void a(View view) {
                    if (!com.mbridge.msdk.f.b.a() || MBridgeBTNativeEC.this.checkChinaProgressBarStatus()) {
                        MBridgeBTNativeEC.a(MBridgeBTNativeEC.this, 0, view.getContext());
                    }
                    MBridgeBTNativeEC.a(MBridgeBTNativeEC.this, view.getX(), view.getY());
                }
            });
        }
    }

    private Bitmap a(Drawable drawable) {
        try {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            return createBitmap;
        } catch (Throwable th) {
            ad.a(BTBaseView.TAG, th.getMessage());
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0001, B:5:0x0006, B:6:0x001a, B:8:0x001e, B:10:0x0024, B:11:0x0029, B:13:0x002d, B:14:0x0034, B:23:0x0016), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ void a(com.mbridge.msdk.video.bt.module.MBridgeBTNativeEC r2, int r3, android.content.Context r4) {
        /*
            r0 = 0
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L10 org.json.JSONException -> L15
            r1.<init>()     // Catch: java.lang.Throwable -> L10 org.json.JSONException -> L15
            java.lang.String r0 = com.mbridge.msdk.foundation.same.a.f19409j     // Catch: java.lang.Throwable -> L10 org.json.JSONException -> L12
            org.json.JSONObject r3 = r2.a(r3)     // Catch: java.lang.Throwable -> L10 org.json.JSONException -> L12
            r1.put(r0, r3)     // Catch: java.lang.Throwable -> L10 org.json.JSONException -> L12
            goto L1a
        L10:
            r2 = move-exception
            goto L39
        L12:
            r3 = move-exception
            r0 = r1
            goto L16
        L15:
            r3 = move-exception
        L16:
            r3.printStackTrace()     // Catch: java.lang.Throwable -> L10
            r1 = r0
        L1a:
            com.mbridge.msdk.video.signal.a.k r3 = r2.f21877J     // Catch: java.lang.Throwable -> L10
            if (r3 == 0) goto L42
            boolean r3 = com.mbridge.msdk.f.b.a()     // Catch: java.lang.Throwable -> L10
            if (r3 == 0) goto L29
            com.mbridge.msdk.video.signal.a.k r3 = r2.f21877J     // Catch: java.lang.Throwable -> L10
            r2.doChinaJumpClick(r4, r3)     // Catch: java.lang.Throwable -> L10
        L29:
            com.mbridge.msdk.video.signal.a.k r2 = r2.f21877J     // Catch: java.lang.Throwable -> L10
            if (r1 == 0) goto L32
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> L10
            goto L34
        L32:
            java.lang.String r3 = ""
        L34:
            r4 = 1
            r2.click(r4, r3)     // Catch: java.lang.Throwable -> L10
            goto L42
        L39:
            java.lang.String r3 = "BTBaseView"
            java.lang.String r2 = r2.getMessage()
            com.mbridge.msdk.foundation.tools.ad.a(r3, r2)
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.bt.module.MBridgeBTNativeEC.a(com.mbridge.msdk.video.bt.module.MBridgeBTNativeEC, int, android.content.Context):void");
    }

    static /* synthetic */ void a(MBridgeBTNativeEC mBridgeBTNativeEC, float f8, float f9) {
        if (mBridgeBTNativeEC.f21878K != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", BTBaseView.f21766n);
                jSONObject.put("id", mBridgeBTNativeEC.f21771d);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("x", String.valueOf(f8));
                jSONObject2.put("y", String.valueOf(f9));
                jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                g.a().a(mBridgeBTNativeEC.f21878K, "onClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            } catch (Exception unused) {
                d.c().a(mBridgeBTNativeEC.f21878K, "onClicked", mBridgeBTNativeEC.f21771d);
            }
        }
    }
}
