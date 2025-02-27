package com.mbridge.msdk.dycreator.baseview.rewardpopview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/* loaded from: classes4.dex */
public class MBGradientAndShadowTextView extends TextView {

    /* renamed from: a, reason: collision with root package name */
    private int f18571a;

    /* renamed from: b, reason: collision with root package name */
    private int f18572b;

    /* renamed from: c, reason: collision with root package name */
    private int f18573c;

    /* renamed from: d, reason: collision with root package name */
    private int f18574d;

    /* renamed from: e, reason: collision with root package name */
    private LinearGradient f18575e;
    public float mShadowDx;
    public float mShadowDy;
    public float mShadowRadius;

    /* loaded from: classes4.dex */
    public static class GradientAndShadowParameters {
        public int gradientEndColor;
        public int gradientStartColor;
        public int shadowColor;
        public int textSize = 40;
        public float shadowRadius = 3.0f;
        public float shadowDx = 1.5f;
        public float shadowDy = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context) {
        super(context);
        this.f18571a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f18572b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f18573c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f18574d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
        a();
    }

    private void a() {
        setTextSize(this.f18574d);
        setTypeface(Typeface.defaultFromStyle(3));
        this.f18575e = new LinearGradient(0.0f, 0.0f, 0.0f, getTextSize(), this.f18571a, this.f18572b, Shader.TileMode.CLAMP);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        getPaint().setShader(null);
        getPaint().setShadowLayer(3.0f, 1.5f, 1.8f, this.f18573c);
        super.onDraw(canvas);
        getPaint().clearShadowLayer();
        getPaint().setShader(this.f18575e);
        super.onDraw(canvas);
    }

    public MBGradientAndShadowTextView(Context context, GradientAndShadowParameters gradientAndShadowParameters) {
        super(context);
        this.f18571a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f18572b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f18573c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f18574d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
        if (gradientAndShadowParameters != null) {
            this.f18571a = gradientAndShadowParameters.gradientStartColor;
            this.f18572b = gradientAndShadowParameters.gradientEndColor;
            this.f18573c = gradientAndShadowParameters.shadowColor;
            this.f18574d = gradientAndShadowParameters.textSize;
            this.mShadowRadius = gradientAndShadowParameters.shadowRadius;
            this.mShadowDx = gradientAndShadowParameters.shadowDx;
            this.mShadowDy = gradientAndShadowParameters.shadowDy;
        }
        a();
    }

    public MBGradientAndShadowTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18571a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f18572b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f18573c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f18574d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f18571a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f18572b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f18573c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f18574d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context, AttributeSet attributeSet, int i8, int i9) {
        super(context, attributeSet, i8, i9);
        this.f18571a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f18572b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f18573c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f18574d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }
}
