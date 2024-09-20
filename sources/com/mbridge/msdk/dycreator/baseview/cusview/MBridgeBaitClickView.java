package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.c.b;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.v;

/* loaded from: classes4.dex */
public class MBridgeBaitClickView extends RelativeLayout {
    public static final int ANIMATION_TYPE_DOUBLE_CLICK = 4;
    public static final int ANIMATION_TYPE_FAST_SCALE = 1;
    public static final int ANIMATION_TYPE_ROTATE = 5;
    public static final int ANIMATION_TYPE_SLOW_SCALE = 2;
    public static final int ANIMATION_TYPE_SLOW_SCALE_WITH_PAUSE = 3;

    /* renamed from: a, reason: collision with root package name */
    private MBridgeDyImageView f18445a;

    /* renamed from: b, reason: collision with root package name */
    private MBridgeDyImageView f18446b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f18447c;

    /* renamed from: d, reason: collision with root package name */
    private String f18448d;

    /* renamed from: e, reason: collision with root package name */
    private String f18449e;

    /* renamed from: f, reason: collision with root package name */
    private String f18450f;

    /* renamed from: g, reason: collision with root package name */
    private int f18451g;

    /* renamed from: h, reason: collision with root package name */
    private int f18452h;

    /* renamed from: i, reason: collision with root package name */
    private Animation f18453i;

    /* renamed from: j, reason: collision with root package name */
    private Animation f18454j;

    /* renamed from: k, reason: collision with root package name */
    private Animation f18455k;

    /* renamed from: l, reason: collision with root package name */
    private Animation f18456l;

    public MBridgeBaitClickView(Context context) {
        super(context);
        this.f18448d = "";
        this.f18449e = "";
        this.f18450f = "Click now for details";
        this.f18451g = 1;
        this.f18452h = 1342177280;
    }

    public void init(int i8) {
        this.f18451g = i8;
        init();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearAnimation();
        Animation animation = this.f18453i;
        if (animation != null) {
            animation.cancel();
        }
        Animation animation2 = this.f18454j;
        if (animation2 != null) {
            animation2.cancel();
        }
        Animation animation3 = this.f18455k;
        if (animation3 != null) {
            animation3.cancel();
        }
        Animation animation4 = this.f18456l;
        if (animation4 != null) {
            animation4.cancel();
        }
    }

    public void startAnimation() {
        int i8 = this.f18451g;
        if (i8 != 2) {
            if (i8 != 3) {
                if (i8 != 4) {
                    if (i8 != 5) {
                        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
                        this.f18453i = scaleAnimation;
                        scaleAnimation.setDuration(200L);
                        this.f18453i.setRepeatCount(-1);
                        this.f18453i.setRepeatMode(2);
                        MBridgeDyImageView mBridgeDyImageView = this.f18445a;
                        if (mBridgeDyImageView != null) {
                            mBridgeDyImageView.startAnimation(this.f18453i);
                        }
                        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.0f, 1.2f, 0.0f, 1.2f, 1, 0.5f, 1, 0.5f);
                        this.f18454j = scaleAnimation2;
                        scaleAnimation2.setDuration(400L);
                        this.f18454j.setRepeatCount(-1);
                        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.3f);
                        this.f18455k = alphaAnimation;
                        alphaAnimation.setDuration(400L);
                        this.f18455k.setRepeatCount(-1);
                        AnimationSet animationSet = new AnimationSet(true);
                        animationSet.addAnimation(this.f18454j);
                        animationSet.addAnimation(this.f18455k);
                        MBridgeDyImageView mBridgeDyImageView2 = this.f18446b;
                        if (mBridgeDyImageView2 != null) {
                            mBridgeDyImageView2.startAnimation(animationSet);
                            return;
                        }
                        return;
                    }
                    RotateAnimation rotateAnimation = new RotateAnimation(-10.0f, 30.0f, 1, 0.5f, 1, 0.5f);
                    this.f18456l = rotateAnimation;
                    rotateAnimation.setDuration(300L);
                    this.f18456l.setRepeatMode(2);
                    this.f18456l.setRepeatCount(-1);
                    ScaleAnimation scaleAnimation3 = new ScaleAnimation(0.0f, 1.2f, 0.0f, 1.2f, 1, 0.5f, 1, 0.5f);
                    this.f18454j = scaleAnimation3;
                    scaleAnimation3.setDuration(600L);
                    this.f18454j.setRepeatCount(-1);
                    AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
                    this.f18455k = alphaAnimation2;
                    alphaAnimation2.setDuration(600L);
                    this.f18455k.setRepeatCount(-1);
                    AnimationSet animationSet2 = new AnimationSet(true);
                    animationSet2.addAnimation(this.f18454j);
                    animationSet2.addAnimation(this.f18455k);
                    MBridgeDyImageView mBridgeDyImageView3 = this.f18445a;
                    if (mBridgeDyImageView3 != null) {
                        mBridgeDyImageView3.startAnimation(this.f18456l);
                    }
                    MBridgeDyImageView mBridgeDyImageView4 = this.f18446b;
                    if (mBridgeDyImageView4 != null) {
                        mBridgeDyImageView4.startAnimation(animationSet2);
                        return;
                    }
                    return;
                }
                this.f18446b.setVisibility(4);
                ScaleAnimation scaleAnimation4 = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
                this.f18453i = scaleAnimation4;
                scaleAnimation4.setDuration(200L);
                this.f18453i.setRepeatCount(1);
                this.f18453i.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.5
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        MBridgeBaitClickView.this.postDelayed(new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.5.1
                            @Override // java.lang.Runnable
                            public void run() {
                                if (MBridgeBaitClickView.this.f18445a != null) {
                                    MBridgeBaitClickView.this.f18445a.startAnimation(MBridgeBaitClickView.this.f18453i);
                                }
                            }
                        }, 1000L);
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }
                });
                MBridgeDyImageView mBridgeDyImageView5 = this.f18445a;
                if (mBridgeDyImageView5 != null) {
                    mBridgeDyImageView5.startAnimation(this.f18453i);
                    return;
                }
                return;
            }
            MBridgeDyImageView mBridgeDyImageView6 = this.f18446b;
            if (mBridgeDyImageView6 != null) {
                mBridgeDyImageView6.setVisibility(4);
            }
            ScaleAnimation scaleAnimation5 = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
            this.f18453i = scaleAnimation5;
            scaleAnimation5.setDuration(500L);
            this.f18453i.setRepeatCount(1);
            this.f18453i.setRepeatMode(2);
            ScaleAnimation scaleAnimation6 = new ScaleAnimation(0.0f, 1.5f, 0.0f, 1.5f, 1, 0.5f, 1, 0.5f);
            this.f18454j = scaleAnimation6;
            scaleAnimation6.setDuration(1000L);
            this.f18454j.setRepeatCount(0);
            AlphaAnimation alphaAnimation3 = new AlphaAnimation(1.0f, 0.0f);
            this.f18455k = alphaAnimation3;
            alphaAnimation3.setDuration(1000L);
            this.f18455k.setRepeatCount(0);
            final AnimationSet animationSet3 = new AnimationSet(true);
            animationSet3.addAnimation(this.f18454j);
            animationSet3.addAnimation(this.f18455k);
            this.f18454j.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.3
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    if (MBridgeBaitClickView.this.f18446b != null) {
                        MBridgeBaitClickView.this.f18446b.setVisibility(4);
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                    if (MBridgeBaitClickView.this.f18446b != null) {
                        MBridgeBaitClickView.this.f18446b.setVisibility(0);
                    }
                }
            });
            this.f18453i.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.4
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    MBridgeBaitClickView.this.postDelayed(new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.4.2
                        @Override // java.lang.Runnable
                        public void run() {
                            if (MBridgeBaitClickView.this.f18445a != null) {
                                MBridgeBaitClickView.this.f18445a.startAnimation(MBridgeBaitClickView.this.f18453i);
                            }
                        }
                    }, 1000L);
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                    MBridgeBaitClickView.this.postDelayed(new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.4.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (MBridgeBaitClickView.this.f18446b != null) {
                                MBridgeBaitClickView.this.f18446b.startAnimation(animationSet3);
                            }
                        }
                    }, 550L);
                }
            });
            MBridgeDyImageView mBridgeDyImageView7 = this.f18445a;
            if (mBridgeDyImageView7 != null) {
                mBridgeDyImageView7.startAnimation(this.f18453i);
                return;
            }
            return;
        }
        this.f18446b.setVisibility(4);
        ScaleAnimation scaleAnimation7 = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.f18453i = scaleAnimation7;
        scaleAnimation7.setDuration(500L);
        this.f18453i.setRepeatCount(-1);
        this.f18453i.setRepeatMode(2);
        MBridgeDyImageView mBridgeDyImageView8 = this.f18445a;
        if (mBridgeDyImageView8 != null) {
            mBridgeDyImageView8.startAnimation(this.f18453i);
        }
    }

    public void init(int i8, int i9) {
        this.f18452h = i8;
        this.f18451g = i9;
        init();
    }

    public void init(int i8, int i9, String str, String str2, String str3) {
        this.f18452h = i8;
        this.f18451g = i9;
        this.f18448d = str;
        this.f18449e = str2;
        this.f18450f = str3;
        init();
    }

    public MBridgeBaitClickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18448d = "";
        this.f18449e = "";
        this.f18450f = "Click now for details";
        this.f18451g = 1;
        this.f18452h = 1342177280;
    }

    public void init() {
        try {
            setBackgroundColor(this.f18452h);
            try {
                this.f18450f = getContext().getResources().getConfiguration().locale.getLanguage().contains("zh") ? "点击查看详情" : "Click now for details";
            } catch (Throwable th) {
                ad.b("MBridgeAnimationClickView", th.getMessage());
            }
            RelativeLayout relativeLayout = new RelativeLayout(getContext());
            relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
            int a8 = ai.a(getContext(), 55.0f);
            int a9 = ai.a(getContext(), 33.0f);
            this.f18446b = new MBridgeDyImageView(getContext());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a8, a8);
            layoutParams.setMargins(a9, a9, 0, 0);
            this.f18446b.setLayoutParams(layoutParams);
            final int a10 = v.a(getContext(), "mbridge_icon_click_circle", "drawable");
            if (TextUtils.isEmpty(this.f18449e)) {
                this.f18446b.setImageResource(a10);
            } else {
                b.a(c.m().c()).a(this.f18448d, new com.mbridge.msdk.foundation.same.c.c() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.1
                    @Override // com.mbridge.msdk.foundation.same.c.c
                    public void onFailedLoad(String str, String str2) {
                        MBridgeBaitClickView.this.f18446b.setImageResource(a10);
                    }

                    @Override // com.mbridge.msdk.foundation.same.c.c
                    public void onSuccessLoad(Bitmap bitmap, String str) {
                        if (!bitmap.isRecycled()) {
                            MBridgeBaitClickView.this.f18446b.setImageBitmap(bitmap);
                        }
                    }
                });
            }
            int a11 = ai.a(getContext(), 108.0f);
            int a12 = ai.a(getContext(), 35.0f);
            int a13 = ai.a(getContext(), 43.0f);
            this.f18445a = new MBridgeDyImageView(getContext());
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(a11, a11);
            layoutParams2.setMargins(a12, a13, 0, 0);
            this.f18445a.setLayoutParams(layoutParams2);
            final int a14 = v.a(getContext(), "mbridge_icon_click_hand", "drawable");
            if (TextUtils.isEmpty(this.f18448d)) {
                this.f18445a.setImageResource(a14);
            } else {
                b.a(c.m().c()).a(this.f18448d, new com.mbridge.msdk.foundation.same.c.c() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.2
                    @Override // com.mbridge.msdk.foundation.same.c.c
                    public void onFailedLoad(String str, String str2) {
                        MBridgeBaitClickView.this.f18445a.setImageResource(a14);
                    }

                    @Override // com.mbridge.msdk.foundation.same.c.c
                    public void onSuccessLoad(Bitmap bitmap, String str) {
                        if (!bitmap.isRecycled()) {
                            MBridgeBaitClickView.this.f18445a.setImageBitmap(bitmap);
                        }
                    }
                });
            }
            relativeLayout.addView(this.f18446b);
            relativeLayout.addView(this.f18445a);
            LinearLayout linearLayout = new LinearLayout(getContext());
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.addRule(13);
            linearLayout.setLayoutParams(layoutParams3);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            linearLayout.addView(relativeLayout);
            this.f18447c = new TextView(getContext());
            this.f18447c.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
            this.f18447c.setText(this.f18450f);
            this.f18447c.setTextColor(-1);
            this.f18447c.setGravity(14);
            linearLayout.addView(this.f18447c);
            addView(linearLayout);
        } catch (Throwable th2) {
            ad.b("MBridgeAnimationClickView", th2.getMessage());
        }
    }

    public MBridgeBaitClickView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f18448d = "";
        this.f18449e = "";
        this.f18450f = "Click now for details";
        this.f18451g = 1;
        this.f18452h = 1342177280;
    }

    public MBridgeBaitClickView(Context context, AttributeSet attributeSet, int i8, int i9) {
        super(context, attributeSet, i8, i9);
        this.f18448d = "";
        this.f18449e = "";
        this.f18450f = "Click now for details";
        this.f18451g = 1;
        this.f18452h = 1342177280;
    }
}
