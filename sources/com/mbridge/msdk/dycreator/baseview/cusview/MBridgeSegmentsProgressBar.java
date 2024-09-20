package com.mbridge.msdk.dycreator.baseview.cusview;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.v;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class MBridgeSegmentsProgressBar extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private final String f18487a;

    /* renamed from: b, reason: collision with root package name */
    private int f18488b;

    /* renamed from: c, reason: collision with root package name */
    private int f18489c;

    /* renamed from: d, reason: collision with root package name */
    private int f18490d;

    /* renamed from: e, reason: collision with root package name */
    private int f18491e;

    /* renamed from: f, reason: collision with root package name */
    private int f18492f;

    /* renamed from: g, reason: collision with root package name */
    private int f18493g;

    /* renamed from: h, reason: collision with root package name */
    private int f18494h;

    /* renamed from: i, reason: collision with root package name */
    private List<ProgressBar> f18495i;

    /* renamed from: j, reason: collision with root package name */
    private TextView f18496j;

    /* renamed from: k, reason: collision with root package name */
    private String f18497k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f18498l;

    public MBridgeSegmentsProgressBar(Context context) {
        super(context);
        this.f18487a = "MBridgeSegmentsProgressBar";
        this.f18489c = 1;
        this.f18490d = 20;
        this.f18491e = 10;
        this.f18492f = 1;
        this.f18493g = -1711276033;
        this.f18494h = -1;
        this.f18495i = new ArrayList();
        this.f18498l = false;
    }

    private void a() {
        Drawable drawable;
        try {
            this.f18498l = getContext().getResources().getConfiguration().locale.getLanguage().contains("zh");
        } catch (Throwable th) {
            ad.b("MBridgeSegmentsProgressBar", th.getMessage());
        }
        try {
            if (this.f18489c == 1) {
                setOrientation(1);
                if (TextUtils.isEmpty(this.f18497k)) {
                    this.f18497k = this.f18498l ? "正在播放第%s个，共%s个视频" : "The %s is playing, %s videos.";
                }
            }
            if (this.f18489c == 2) {
                setOrientation(0);
                if (TextUtils.isEmpty(this.f18497k)) {
                    this.f18497k = this.f18498l ? "广告 %s/%s" : "ADS %s/%s";
                }
            }
            this.f18495i.clear();
            removeAllViews();
            setBackground(c());
            TextView textView = new TextView(getContext());
            this.f18496j = textView;
            textView.setTextColor(-1);
            this.f18496j.setTextSize(12.0f);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            this.f18496j.setLayoutParams(layoutParams);
            if (this.f18489c == 1) {
                layoutParams.gravity = 5;
                TextView textView2 = this.f18496j;
                int i8 = this.f18490d;
                textView2.setPadding(i8 / 2, 15, i8 / 2, 5);
            }
            if (this.f18489c == 2) {
                this.f18496j.setGravity(16);
                TextView textView3 = this.f18496j;
                int i9 = this.f18490d;
                textView3.setPadding(i9 / 2, 0, i9 / 2, 0);
            }
            try {
                int a8 = v.a(getContext(), "mbridge_reward_video_icon", "drawable");
                if (a8 != 0 && (drawable = getContext().getResources().getDrawable(a8)) != null) {
                    drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                    this.f18496j.setCompoundDrawables(drawable, null, null, null);
                    this.f18496j.setCompoundDrawablePadding(5);
                }
            } catch (Throwable th2) {
                ad.b("MBridgeSegmentsProgressBar", th2.getMessage());
            }
            this.f18496j.setText(a(this.f18492f));
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(0);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 25);
            linearLayout.setLayoutParams(layoutParams2);
            for (int i10 = 0; i10 < this.f18488b; i10++) {
                ProgressBar progressBar = new ProgressBar(getContext(), null, R.attr.progressBarStyleHorizontal);
                progressBar.setMax(100);
                progressBar.setProgress(0);
                progressBar.setProgressDrawable(b());
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, 20, 1.0f);
                int i11 = this.f18490d;
                layoutParams3.leftMargin = i11 / 2;
                layoutParams3.rightMargin = i11 / 2;
                progressBar.setLayoutParams(layoutParams3);
                linearLayout.addView(progressBar);
                this.f18495i.add(progressBar);
            }
            int i12 = this.f18489c;
            if (i12 == 1) {
                setPadding(15, 10, 15, 25);
                addView(this.f18496j);
                addView(linearLayout);
            } else {
                if (i12 == 2) {
                    setPadding(15, 0, 15, 25);
                    layoutParams2.gravity = 16;
                    layoutParams2.weight = 1.0f;
                    addView(linearLayout);
                    addView(this.f18496j);
                    return;
                }
                addView(linearLayout);
            }
        } catch (Throwable th3) {
            ad.b("MBridgeSegmentsProgressBar", th3.getMessage());
        }
    }

    private LayerDrawable b() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(this.f18491e);
        gradientDrawable.setColor(this.f18493g);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(this.f18491e);
        gradientDrawable2.setColor(this.f18494h);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, new ScaleDrawable(gradientDrawable2, 3, 1.0f, -1.0f)});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.progress);
        return layerDrawable;
    }

    private GradientDrawable c() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setGradientType(0);
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        gradientDrawable.setDither(true);
        gradientDrawable.setColors(new int[]{0, 1291845632});
        return gradientDrawable;
    }

    public void dismiss() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(1000L);
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeSegmentsProgressBar.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                MBridgeSegmentsProgressBar.this.setVisibility(8);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        startAnimation(alphaAnimation);
    }

    public void init(int i8, int i9) {
        this.f18488b = i8;
        this.f18489c = i9;
        a();
    }

    public void setIndicatorText(String str) {
        this.f18497k = str;
    }

    public void setProgress(int i8, int i9) {
        try {
            if (this.f18495i.size() == 0) {
                return;
            }
            if (i9 < this.f18495i.size()) {
                this.f18495i.get(i9).setProgress(i8);
            }
            int i10 = i9 + 1;
            if (i10 > this.f18492f) {
                this.f18492f = i10;
                TextView textView = this.f18496j;
                if (textView != null) {
                    textView.setText(a(i10));
                }
            }
        } catch (Throwable th) {
            ad.b("MBridgeSegmentsProgressBar", th.getMessage());
        }
    }

    public void init(int i8, int i9, int i10, int i11) {
        this.f18488b = i8;
        this.f18489c = i9;
        this.f18494h = i10;
        this.f18493g = i11;
        a();
    }

    public void init(int i8, int i9, int i10, int i11, int i12, int i13) {
        this.f18488b = i8;
        this.f18489c = i9;
        this.f18494h = i10;
        this.f18493g = i11;
        this.f18490d = i12;
        this.f18491e = i13;
        a();
    }

    public MBridgeSegmentsProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18487a = "MBridgeSegmentsProgressBar";
        this.f18489c = 1;
        this.f18490d = 20;
        this.f18491e = 10;
        this.f18492f = 1;
        this.f18493g = -1711276033;
        this.f18494h = -1;
        this.f18495i = new ArrayList();
        this.f18498l = false;
    }

    public MBridgeSegmentsProgressBar(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f18487a = "MBridgeSegmentsProgressBar";
        this.f18489c = 1;
        this.f18490d = 20;
        this.f18491e = 10;
        this.f18492f = 1;
        this.f18493g = -1711276033;
        this.f18494h = -1;
        this.f18495i = new ArrayList();
        this.f18498l = false;
    }

    public MBridgeSegmentsProgressBar(Context context, AttributeSet attributeSet, int i8, int i9) {
        super(context, attributeSet, i8, i9);
        this.f18487a = "MBridgeSegmentsProgressBar";
        this.f18489c = 1;
        this.f18490d = 20;
        this.f18491e = 10;
        this.f18492f = 1;
        this.f18493g = -1711276033;
        this.f18494h = -1;
        this.f18495i = new ArrayList();
        this.f18498l = false;
    }

    private StringBuilder a(int i8) {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append(String.format(this.f18497k, Integer.valueOf(i8), Integer.valueOf(this.f18488b)));
        } catch (Throwable th) {
            sb.append(this.f18488b);
            sb.append("videos, the");
            sb.append(i8);
            sb.append(" is playing.");
            ad.b("MBridgeSegmentsProgressBar", th.getMessage());
        }
        return sb;
    }
}
