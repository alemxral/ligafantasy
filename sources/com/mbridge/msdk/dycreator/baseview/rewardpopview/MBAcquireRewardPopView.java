package com.mbridge.msdk.dycreator.baseview.rewardpopview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.GravityCompat;
import com.mbridge.msdk.dycreator.baseview.rewardpopview.MBGradientAndShadowTextView;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* loaded from: classes4.dex */
public class MBAcquireRewardPopView extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private final String f18540a;

    /* renamed from: b, reason: collision with root package name */
    private AcquireRewardPopViewParameters f18541b;

    /* renamed from: c, reason: collision with root package name */
    private AnimationSet f18542c;

    /* renamed from: d, reason: collision with root package name */
    private float f18543d;

    /* renamed from: e, reason: collision with root package name */
    private float f18544e;

    /* renamed from: f, reason: collision with root package name */
    private float f18545f;

    /* renamed from: g, reason: collision with root package name */
    private float f18546g;

    /* renamed from: h, reason: collision with root package name */
    private int f18547h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f18548i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f18549j;

    /* renamed from: k, reason: collision with root package name */
    private TextView f18550k;

    /* renamed from: l, reason: collision with root package name */
    private final View.OnClickListener f18551l;

    /* renamed from: m, reason: collision with root package name */
    private Runnable f18552m;

    /* renamed from: n, reason: collision with root package name */
    private Runnable f18553n;

    /* renamed from: o, reason: collision with root package name */
    private View.OnTouchListener f18554o;

    /* renamed from: p, reason: collision with root package name */
    private final View.OnClickListener f18555p;

    /* renamed from: q, reason: collision with root package name */
    private final View.OnClickListener f18556q;

    public MBAcquireRewardPopView(Context context) {
        super(context);
        this.f18540a = "MBAcquireRewardPopView";
        this.f18543d = 0.0f;
        this.f18544e = 0.0f;
        this.f18545f = 0.0f;
        this.f18546g = 0.0f;
        this.f18551l = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                View f8;
                MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.f18552m);
                String str = (String) view.getTag();
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                boolean contains = MBAcquireRewardPopView.this.f18541b.rightAnswerList.contains(str);
                MBAcquireRewardPopView mBAcquireRewardPopView2 = MBAcquireRewardPopView.this;
                if (contains) {
                    f8 = MBAcquireRewardPopView.e(mBAcquireRewardPopView2);
                } else {
                    f8 = MBAcquireRewardPopView.f(mBAcquireRewardPopView2);
                }
                View childAt = MBAcquireRewardPopView.this.getChildAt(0);
                if (childAt != null) {
                    MBAcquireRewardPopView.a(MBAcquireRewardPopView.this, childAt, f8);
                }
                if (MBAcquireRewardPopView.this.f18541b.behaviourListener != null) {
                    if (contains) {
                        MBAcquireRewardPopView.this.f18541b.behaviourListener.onReceivedSuccess(MBAcquireRewardPopView.this.f18541b.reduceTime);
                    } else {
                        MBAcquireRewardPopView.this.f18541b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_CLICK_WRONG_ANSWER);
                    }
                }
                MBAcquireRewardPopView mBAcquireRewardPopView3 = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView3.postDelayed(mBAcquireRewardPopView3.f18553n, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
            }
        };
        this.f18552m = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.6
            @Override // java.lang.Runnable
            public void run() {
                if (MBAcquireRewardPopView.this.f18547h <= 0) {
                    if (MBAcquireRewardPopView.this.f18541b.behaviourListener != null) {
                        MBAcquireRewardPopView.this.f18541b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_AUTO_DISMISS);
                    }
                    MBAcquireRewardPopView.this.f18548i = false;
                    MBAcquireRewardPopView.this.setVisibility(8);
                    MBAcquireRewardPopView.this.removeAllViews();
                    return;
                }
                MBAcquireRewardPopView.i(MBAcquireRewardPopView.this);
                MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView.postDelayed(mBAcquireRewardPopView.f18552m, 1000L);
            }
        };
        this.f18553n = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.7
            @Override // java.lang.Runnable
            public void run() {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(300L);
                alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.7.1
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        MBAcquireRewardPopView.this.f18548i = false;
                        MBAcquireRewardPopView.this.setVisibility(8);
                        MBAcquireRewardPopView.this.removeAllViews();
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }
                });
                MBAcquireRewardPopView.this.startAnimation(alphaAnimation);
            }
        };
        this.f18554o = new View.OnTouchListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.8
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 1) {
                        if (action == 2) {
                            MBAcquireRewardPopView.this.f18545f = motionEvent.getX();
                            MBAcquireRewardPopView.this.f18546g = motionEvent.getY();
                        }
                    } else if (MBAcquireRewardPopView.this.f18545f > MBAcquireRewardPopView.this.f18543d) {
                        if (Math.abs(MBAcquireRewardPopView.this.f18545f - MBAcquireRewardPopView.this.f18543d) > 50.0f && Math.abs(MBAcquireRewardPopView.this.f18546g - MBAcquireRewardPopView.this.f18544e) < 100.0f) {
                            if (MBAcquireRewardPopView.this.f18549j) {
                                return false;
                            }
                            MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                            mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.f18552m);
                            MBAcquireRewardPopView.this.f18549j = true;
                            View e8 = MBAcquireRewardPopView.e(MBAcquireRewardPopView.this);
                            View childAt = MBAcquireRewardPopView.this.getChildAt(0);
                            if (childAt != null) {
                                MBAcquireRewardPopView.a(MBAcquireRewardPopView.this, childAt, e8);
                            }
                            if (MBAcquireRewardPopView.this.f18541b.behaviourListener != null) {
                                MBAcquireRewardPopView.this.f18541b.behaviourListener.onReceivedSuccess(MBAcquireRewardPopView.this.f18541b.reduceTime);
                            }
                            MBAcquireRewardPopView mBAcquireRewardPopView2 = MBAcquireRewardPopView.this;
                            mBAcquireRewardPopView2.postDelayed(mBAcquireRewardPopView2.f18553n, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
                        } else {
                            MBAcquireRewardPopView.this.f18541b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.f18543d, MBAcquireRewardPopView.this.f18544e);
                        }
                    } else {
                        MBAcquireRewardPopView.this.f18541b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.f18543d, MBAcquireRewardPopView.this.f18544e);
                    }
                } else {
                    MBAcquireRewardPopView.this.f18543d = motionEvent.getX();
                    MBAcquireRewardPopView.this.f18544e = motionEvent.getY();
                }
                return false;
            }
        };
        this.f18555p = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MBAcquireRewardPopView.this.f18541b.behaviourListener != null) {
                    MBAcquireRewardPopView.this.f18541b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.f18543d, MBAcquireRewardPopView.this.f18544e);
                }
            }
        };
        this.f18556q = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MBAcquireRewardPopView.this.f18541b.behaviourListener != null) {
                    MBAcquireRewardPopView.this.f18541b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_CLICK_CLOSE);
                }
                MBAcquireRewardPopView.this.f18548i = false;
                MBAcquireRewardPopView.this.setVisibility(8);
                MBAcquireRewardPopView.this.removeAllViews();
            }
        };
    }

    static /* synthetic */ View e(MBAcquireRewardPopView mBAcquireRewardPopView) {
        String str;
        LinearLayout linearLayout = new LinearLayout(mBAcquireRewardPopView.getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        MBGradientAndShadowTextView.GradientAndShadowParameters gradientAndShadowParameters = new MBGradientAndShadowTextView.GradientAndShadowParameters();
        AcquireRewardPopViewParameters acquireRewardPopViewParameters = mBAcquireRewardPopView.f18541b;
        gradientAndShadowParameters.gradientStartColor = acquireRewardPopViewParameters.successTitleGradientStartColor;
        gradientAndShadowParameters.gradientEndColor = acquireRewardPopViewParameters.successTitleGradientEndColor;
        gradientAndShadowParameters.shadowColor = acquireRewardPopViewParameters.successTitleShadowColor;
        MBGradientAndShadowTextView mBGradientAndShadowTextView = new MBGradientAndShadowTextView(mBAcquireRewardPopView.getContext(), gradientAndShadowParameters);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(0, 0, 0, ai.a(mBAcquireRewardPopView.getContext(), 12.0f));
        layoutParams2.gravity = 1;
        mBGradientAndShadowTextView.setLayoutParams(layoutParams2);
        AcquireRewardPopViewParameters acquireRewardPopViewParameters2 = mBAcquireRewardPopView.f18541b;
        int i8 = acquireRewardPopViewParameters2.viewType;
        if (i8 == 1) {
            str = acquireRewardPopViewParameters2.successTitle;
        } else if (i8 == 2) {
            str = acquireRewardPopViewParameters2.slideSuccessTitle;
        } else {
            str = "";
        }
        mBGradientAndShadowTextView.setGravity(17);
        mBGradientAndShadowTextView.setText(String.format(" %s ", str));
        linearLayout.addView(mBGradientAndShadowTextView);
        GradientDrawable a8 = mBAcquireRewardPopView.a(new int[]{AcquireRewardPopViewConst.DEFAULT_COLOR_00FDB258, AcquireRewardPopViewConst.DEFAULT_COLOR_FFE39E4A, AcquireRewardPopViewConst.DEFAULT_COLOR_FFE39E4A, AcquireRewardPopViewConst.DEFAULT_COLOR_00F3A850}, GradientDrawable.Orientation.LEFT_RIGHT);
        TextView textView = new TextView(mBAcquireRewardPopView.getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        textView.setLayoutParams(layoutParams3);
        textView.setTextSize(12.0f);
        textView.setGravity(17);
        textView.setTextColor(mBAcquireRewardPopView.f18541b.successTipTextColor);
        AcquireRewardPopViewParameters acquireRewardPopViewParameters3 = mBAcquireRewardPopView.f18541b;
        textView.setText(String.format(acquireRewardPopViewParameters3.successTip, Integer.valueOf(acquireRewardPopViewParameters3.reduceTime)));
        int a9 = ai.a(mBAcquireRewardPopView.getContext(), 6.0f);
        int a10 = ai.a(mBAcquireRewardPopView.getContext(), 32.0f);
        textView.setPadding(a10, a9, a10, a9);
        textView.setBackground(a8);
        linearLayout.addView(textView);
        return linearLayout;
    }

    static /* synthetic */ View f(MBAcquireRewardPopView mBAcquireRewardPopView) {
        LinearLayout linearLayout = new LinearLayout(mBAcquireRewardPopView.getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        MBGradientAndShadowTextView.GradientAndShadowParameters gradientAndShadowParameters = new MBGradientAndShadowTextView.GradientAndShadowParameters();
        AcquireRewardPopViewParameters acquireRewardPopViewParameters = mBAcquireRewardPopView.f18541b;
        gradientAndShadowParameters.gradientStartColor = acquireRewardPopViewParameters.failTitleGradientStartColor;
        gradientAndShadowParameters.gradientEndColor = acquireRewardPopViewParameters.failTitleGradientEndColor;
        gradientAndShadowParameters.shadowColor = acquireRewardPopViewParameters.failTitleShadowColor;
        MBGradientAndShadowTextView mBGradientAndShadowTextView = new MBGradientAndShadowTextView(mBAcquireRewardPopView.getContext(), gradientAndShadowParameters);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(0, 0, 0, ai.a(mBAcquireRewardPopView.getContext(), 12.0f));
        layoutParams2.gravity = 1;
        mBGradientAndShadowTextView.setGravity(17);
        mBGradientAndShadowTextView.setLayoutParams(layoutParams2);
        mBGradientAndShadowTextView.setText(String.format(" %s ", mBAcquireRewardPopView.f18541b.failTitle));
        linearLayout.addView(mBGradientAndShadowTextView);
        GradientDrawable a8 = mBAcquireRewardPopView.a(new int[]{AcquireRewardPopViewConst.DEFAULT_COLOR_00B09A80, AcquireRewardPopViewConst.DEFAULT_COLOR_FFB09A80, AcquireRewardPopViewConst.DEFAULT_COLOR_FFB09A80, AcquireRewardPopViewConst.DEFAULT_COLOR_00B09A80}, GradientDrawable.Orientation.LEFT_RIGHT);
        TextView textView = new TextView(mBAcquireRewardPopView.getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        textView.setLayoutParams(layoutParams3);
        textView.setTextSize(12.0f);
        textView.setGravity(17);
        textView.setTextColor(mBAcquireRewardPopView.f18541b.failTipTextColor);
        textView.setText(String.format(mBAcquireRewardPopView.f18541b.failTip, ""));
        int a9 = ai.a(mBAcquireRewardPopView.getContext(), 6.0f);
        int a10 = ai.a(mBAcquireRewardPopView.getContext(), 32.0f);
        textView.setPadding(a10, a9, a10, a9);
        textView.setBackground(a8);
        linearLayout.addView(textView);
        return linearLayout;
    }

    static /* synthetic */ int i(MBAcquireRewardPopView mBAcquireRewardPopView) {
        int i8 = mBAcquireRewardPopView.f18547h;
        mBAcquireRewardPopView.f18547h = i8 - 1;
        return i8;
    }

    public void init(AcquireRewardPopViewParameters acquireRewardPopViewParameters) {
        View view;
        if (acquireRewardPopViewParameters == null) {
            ad.b("MBAcquireRewardPopView", "Must generate parameters.");
            return;
        }
        this.f18541b = acquireRewardPopViewParameters;
        if (acquireRewardPopViewParameters.viewType == 1) {
            ArrayList<String> arrayList = new ArrayList<>();
            AcquireRewardPopViewParameters acquireRewardPopViewParameters2 = this.f18541b;
            if (acquireRewardPopViewParameters2 != null) {
                List<String> list = acquireRewardPopViewParameters2.rightAnswerList;
                if (list != null) {
                    arrayList.addAll(list);
                }
                if (this.f18541b.wrongAnswerList != null) {
                    int nextInt = new Random().nextInt(this.f18541b.wrongAnswerList.size());
                    if (nextInt > this.f18541b.wrongAnswerList.size() - 1) {
                        nextInt = 0;
                    }
                    arrayList.add(this.f18541b.wrongAnswerList.get(nextInt));
                }
            }
            view = a(arrayList);
            if (this.f18541b.canClickMaskArea) {
                setOnClickListener(this.f18555p);
            }
        } else {
            view = null;
        }
        if (this.f18541b.viewType == 2) {
            int a8 = ai.a(getContext(), 290.0f);
            LinearLayout linearLayout = new LinearLayout(getContext());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a8, -2);
            layoutParams.addRule(13);
            linearLayout.setLayoutParams(layoutParams);
            linearLayout.setOrientation(1);
            MBGradientAndShadowTextView.GradientAndShadowParameters gradientAndShadowParameters = new MBGradientAndShadowTextView.GradientAndShadowParameters();
            AcquireRewardPopViewParameters acquireRewardPopViewParameters3 = this.f18541b;
            gradientAndShadowParameters.gradientStartColor = acquireRewardPopViewParameters3.successTitleGradientStartColor;
            gradientAndShadowParameters.gradientEndColor = acquireRewardPopViewParameters3.successTitleGradientEndColor;
            gradientAndShadowParameters.shadowColor = acquireRewardPopViewParameters3.successTitleShadowColor;
            gradientAndShadowParameters.textSize = 30;
            MBGradientAndShadowTextView mBGradientAndShadowTextView = new MBGradientAndShadowTextView(getContext(), gradientAndShadowParameters);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.setMargins(0, 0, 0, ai.a(getContext(), 12.0f));
            layoutParams2.gravity = 1;
            mBGradientAndShadowTextView.setLayoutParams(layoutParams2);
            mBGradientAndShadowTextView.setText(String.format(" %s ", this.f18541b.slideTitle));
            mBGradientAndShadowTextView.setGravity(17);
            linearLayout.addView(mBGradientAndShadowTextView);
            GradientDrawable a9 = a(new int[]{AcquireRewardPopViewConst.DEFAULT_COLOR_00FDB258, AcquireRewardPopViewConst.DEFAULT_COLOR_FFE39E4A, AcquireRewardPopViewConst.DEFAULT_COLOR_FFE39E4A, AcquireRewardPopViewConst.DEFAULT_COLOR_00F3A850}, GradientDrawable.Orientation.LEFT_RIGHT);
            this.f18550k = new TextView(getContext());
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 1;
            layoutParams3.setMargins(0, 0, 0, ai.a(getContext(), 25.0f));
            this.f18550k.setLayoutParams(layoutParams3);
            this.f18550k.setTextSize(12.0f);
            this.f18550k.setGravity(17);
            this.f18550k.setTextColor(this.f18541b.successTipTextColor);
            TextView textView = this.f18550k;
            AcquireRewardPopViewParameters acquireRewardPopViewParameters4 = this.f18541b;
            textView.setText(String.format(acquireRewardPopViewParameters4.slideTip, Integer.valueOf(acquireRewardPopViewParameters4.reduceTime)));
            int a10 = ai.a(getContext(), 6.0f);
            int a11 = ai.a(getContext(), 32.0f);
            this.f18550k.setPadding(a11, a10, a11, a10);
            this.f18550k.setBackground(a9);
            linearLayout.addView(this.f18550k);
            View imageView = new ImageView(getContext());
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams4.gravity = 1;
            imageView.setLayoutParams(layoutParams4);
            imageView.setBackgroundResource(getResources().getIdentifier("mbridge_slide_rightarrow", "drawable", c.m().g()));
            linearLayout.addView(imageView);
            View imageView2 = new ImageView(getContext());
            imageView2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            imageView2.setBackgroundResource(getResources().getIdentifier("mbridge_slide_hand", "drawable", c.m().g()));
            linearLayout.addView(imageView2);
            imageView2.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view2) {
                    MBAcquireRewardPopView.a(MBAcquireRewardPopView.this, view2);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view2) {
                    if (MBAcquireRewardPopView.this.f18542c != null) {
                        MBAcquireRewardPopView.this.f18542c.cancel();
                    }
                }
            });
            linearLayout.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.2
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view2) {
                    MBAcquireRewardPopView.this.setLongClickable(true);
                    MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                    mBAcquireRewardPopView.setOnTouchListener(mBAcquireRewardPopView.f18554o);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view2) {
                }
            });
            view = linearLayout;
        }
        if (view != null) {
            setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            setBackgroundColor(this.f18541b.containerBackgroundColor);
            addView(view);
            int i8 = this.f18541b.autoDismissTime;
            if (i8 > 0) {
                this.f18547h = i8;
                post(this.f18552m);
                this.f18548i = true;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f18552m);
    }

    public void onPause() {
        if (this.f18548i && this.f18547h > 0) {
            removeCallbacks(this.f18552m);
        }
    }

    public void onResume() {
        if (this.f18548i && this.f18547h > 0) {
            post(this.f18552m);
        }
    }

    public void onStop() {
        if (this.f18548i && this.f18547h > 0) {
            removeCallbacks(this.f18552m);
        }
    }

    public void onTimeLessThanReduce(int i8) {
        AcquireRewardPopViewParameters acquireRewardPopViewParameters = this.f18541b;
        acquireRewardPopViewParameters.reduceTime = i8;
        TextView textView = this.f18550k;
        if (textView != null) {
            textView.setText(String.format(acquireRewardPopViewParameters.tips, Integer.valueOf(i8)));
        }
    }

    private View a(ArrayList<String> arrayList) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ai.a(getContext(), 290.0f), -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        linearLayout.setClickable(true);
        AcquireRewardPopViewParameters acquireRewardPopViewParameters = this.f18541b;
        int i8 = acquireRewardPopViewParameters.viewBackLayerTopColor;
        int i9 = acquireRewardPopViewParameters.viewBackLayerBottomColor;
        int i10 = acquireRewardPopViewParameters.viewForegroundTopColor;
        int i11 = acquireRewardPopViewParameters.viewForegroundBottomColor;
        int[] iArr = {i8, i9};
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        GradientDrawable a8 = a(iArr, orientation);
        a8.setCornerRadius(ai.a(getContext(), 12.0f));
        GradientDrawable a9 = a(new int[]{i10, i11}, orientation);
        a9.setCornerRadius(ai.a(getContext(), 12.0f));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{a8, a9});
        layerDrawable.setLayerInset(1, 5, 5, 5, 5);
        linearLayout.setBackground(layerDrawable);
        ImageView imageView = new ImageView(getContext());
        int a10 = ai.a(getContext(), 20.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(a10, a10);
        layoutParams2.gravity = GravityCompat.END;
        layoutParams2.setMargins(0, 13, 13, 0);
        imageView.setLayoutParams(layoutParams2);
        imageView.setImageResource(getResources().getIdentifier("mbridge_reward_popview_close", "drawable", c.m().g()));
        imageView.setOnClickListener(this.f18556q);
        linearLayout.addView(imageView);
        TextView textView = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        int a11 = ai.a(getContext(), 18.0f);
        layoutParams3.setMargins(a11, 5, a11, ai.a(getContext(), 12.0f));
        textView.setLayoutParams(layoutParams3);
        textView.setText(this.f18541b.title);
        textView.setTextColor(this.f18541b.titleTextColor);
        textView.setTextSize(18.0f);
        textView.setGravity(17);
        linearLayout.addView(textView);
        if (arrayList != null && arrayList.size() > 1) {
            int a12 = ai.a(getContext(), 8.0f);
            int a13 = ai.a(getContext(), 24.0f);
            int a14 = ai.a(getContext(), 30.0f);
            int a15 = ai.a(getContext(), 12.0f);
            int a16 = ai.a(getContext(), 40.0f);
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                boolean contains = this.f18541b.rightAnswerList.contains(arrayList.get(i12));
                TextView textView2 = new TextView(getContext());
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams4.gravity = 1;
                layoutParams4.setMargins(a14, a15, a14, 0);
                textView2.setPadding(a13, a12, a13, a12);
                textView2.setLayoutParams(layoutParams4);
                textView2.setText(arrayList.get(i12));
                textView2.setSingleLine(true);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                textView2.setTag(arrayList.get(i12));
                textView2.setTextSize(17.0f);
                textView2.setGravity(17);
                AcquireRewardPopViewParameters acquireRewardPopViewParameters2 = this.f18541b;
                textView2.setTextColor(contains ? acquireRewardPopViewParameters2.buttonTextLightColor : acquireRewardPopViewParameters2.buttonTextDarkColor);
                AcquireRewardPopViewParameters acquireRewardPopViewParameters3 = this.f18541b;
                int i13 = contains ? acquireRewardPopViewParameters3.buttonBackgroundLightColor : acquireRewardPopViewParameters3.buttonBackgroundDarkColor;
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(i13);
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(a16);
                textView2.setBackground(gradientDrawable);
                textView2.setOnClickListener(this.f18551l);
                linearLayout.addView(textView2);
            }
        }
        this.f18550k = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        int a17 = ai.a(getContext(), 16.0f);
        int a18 = ai.a(getContext(), 18.0f);
        layoutParams5.setMargins(a18, a17, a18, a17);
        layoutParams5.gravity = 1;
        this.f18550k.setLayoutParams(layoutParams5);
        TextView textView3 = this.f18550k;
        AcquireRewardPopViewParameters acquireRewardPopViewParameters4 = this.f18541b;
        textView3.setText(String.format(acquireRewardPopViewParameters4.tips, Integer.valueOf(acquireRewardPopViewParameters4.reduceTime)));
        this.f18550k.setTextColor(this.f18541b.tipTextColor);
        this.f18550k.setGravity(17);
        this.f18550k.setTextSize(12.0f);
        linearLayout.addView(this.f18550k);
        return linearLayout;
    }

    public MBAcquireRewardPopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18540a = "MBAcquireRewardPopView";
        this.f18543d = 0.0f;
        this.f18544e = 0.0f;
        this.f18545f = 0.0f;
        this.f18546g = 0.0f;
        this.f18551l = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                View f8;
                MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.f18552m);
                String str = (String) view.getTag();
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                boolean contains = MBAcquireRewardPopView.this.f18541b.rightAnswerList.contains(str);
                MBAcquireRewardPopView mBAcquireRewardPopView2 = MBAcquireRewardPopView.this;
                if (contains) {
                    f8 = MBAcquireRewardPopView.e(mBAcquireRewardPopView2);
                } else {
                    f8 = MBAcquireRewardPopView.f(mBAcquireRewardPopView2);
                }
                View childAt = MBAcquireRewardPopView.this.getChildAt(0);
                if (childAt != null) {
                    MBAcquireRewardPopView.a(MBAcquireRewardPopView.this, childAt, f8);
                }
                if (MBAcquireRewardPopView.this.f18541b.behaviourListener != null) {
                    if (contains) {
                        MBAcquireRewardPopView.this.f18541b.behaviourListener.onReceivedSuccess(MBAcquireRewardPopView.this.f18541b.reduceTime);
                    } else {
                        MBAcquireRewardPopView.this.f18541b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_CLICK_WRONG_ANSWER);
                    }
                }
                MBAcquireRewardPopView mBAcquireRewardPopView3 = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView3.postDelayed(mBAcquireRewardPopView3.f18553n, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
            }
        };
        this.f18552m = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.6
            @Override // java.lang.Runnable
            public void run() {
                if (MBAcquireRewardPopView.this.f18547h <= 0) {
                    if (MBAcquireRewardPopView.this.f18541b.behaviourListener != null) {
                        MBAcquireRewardPopView.this.f18541b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_AUTO_DISMISS);
                    }
                    MBAcquireRewardPopView.this.f18548i = false;
                    MBAcquireRewardPopView.this.setVisibility(8);
                    MBAcquireRewardPopView.this.removeAllViews();
                    return;
                }
                MBAcquireRewardPopView.i(MBAcquireRewardPopView.this);
                MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView.postDelayed(mBAcquireRewardPopView.f18552m, 1000L);
            }
        };
        this.f18553n = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.7
            @Override // java.lang.Runnable
            public void run() {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(300L);
                alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.7.1
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        MBAcquireRewardPopView.this.f18548i = false;
                        MBAcquireRewardPopView.this.setVisibility(8);
                        MBAcquireRewardPopView.this.removeAllViews();
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }
                });
                MBAcquireRewardPopView.this.startAnimation(alphaAnimation);
            }
        };
        this.f18554o = new View.OnTouchListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.8
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 1) {
                        if (action == 2) {
                            MBAcquireRewardPopView.this.f18545f = motionEvent.getX();
                            MBAcquireRewardPopView.this.f18546g = motionEvent.getY();
                        }
                    } else if (MBAcquireRewardPopView.this.f18545f > MBAcquireRewardPopView.this.f18543d) {
                        if (Math.abs(MBAcquireRewardPopView.this.f18545f - MBAcquireRewardPopView.this.f18543d) > 50.0f && Math.abs(MBAcquireRewardPopView.this.f18546g - MBAcquireRewardPopView.this.f18544e) < 100.0f) {
                            if (MBAcquireRewardPopView.this.f18549j) {
                                return false;
                            }
                            MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                            mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.f18552m);
                            MBAcquireRewardPopView.this.f18549j = true;
                            View e8 = MBAcquireRewardPopView.e(MBAcquireRewardPopView.this);
                            View childAt = MBAcquireRewardPopView.this.getChildAt(0);
                            if (childAt != null) {
                                MBAcquireRewardPopView.a(MBAcquireRewardPopView.this, childAt, e8);
                            }
                            if (MBAcquireRewardPopView.this.f18541b.behaviourListener != null) {
                                MBAcquireRewardPopView.this.f18541b.behaviourListener.onReceivedSuccess(MBAcquireRewardPopView.this.f18541b.reduceTime);
                            }
                            MBAcquireRewardPopView mBAcquireRewardPopView2 = MBAcquireRewardPopView.this;
                            mBAcquireRewardPopView2.postDelayed(mBAcquireRewardPopView2.f18553n, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
                        } else {
                            MBAcquireRewardPopView.this.f18541b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.f18543d, MBAcquireRewardPopView.this.f18544e);
                        }
                    } else {
                        MBAcquireRewardPopView.this.f18541b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.f18543d, MBAcquireRewardPopView.this.f18544e);
                    }
                } else {
                    MBAcquireRewardPopView.this.f18543d = motionEvent.getX();
                    MBAcquireRewardPopView.this.f18544e = motionEvent.getY();
                }
                return false;
            }
        };
        this.f18555p = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MBAcquireRewardPopView.this.f18541b.behaviourListener != null) {
                    MBAcquireRewardPopView.this.f18541b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.f18543d, MBAcquireRewardPopView.this.f18544e);
                }
            }
        };
        this.f18556q = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MBAcquireRewardPopView.this.f18541b.behaviourListener != null) {
                    MBAcquireRewardPopView.this.f18541b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_CLICK_CLOSE);
                }
                MBAcquireRewardPopView.this.f18548i = false;
                MBAcquireRewardPopView.this.setVisibility(8);
                MBAcquireRewardPopView.this.removeAllViews();
            }
        };
    }

    public MBAcquireRewardPopView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f18540a = "MBAcquireRewardPopView";
        this.f18543d = 0.0f;
        this.f18544e = 0.0f;
        this.f18545f = 0.0f;
        this.f18546g = 0.0f;
        this.f18551l = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                View f8;
                MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.f18552m);
                String str = (String) view.getTag();
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                boolean contains = MBAcquireRewardPopView.this.f18541b.rightAnswerList.contains(str);
                MBAcquireRewardPopView mBAcquireRewardPopView2 = MBAcquireRewardPopView.this;
                if (contains) {
                    f8 = MBAcquireRewardPopView.e(mBAcquireRewardPopView2);
                } else {
                    f8 = MBAcquireRewardPopView.f(mBAcquireRewardPopView2);
                }
                View childAt = MBAcquireRewardPopView.this.getChildAt(0);
                if (childAt != null) {
                    MBAcquireRewardPopView.a(MBAcquireRewardPopView.this, childAt, f8);
                }
                if (MBAcquireRewardPopView.this.f18541b.behaviourListener != null) {
                    if (contains) {
                        MBAcquireRewardPopView.this.f18541b.behaviourListener.onReceivedSuccess(MBAcquireRewardPopView.this.f18541b.reduceTime);
                    } else {
                        MBAcquireRewardPopView.this.f18541b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_CLICK_WRONG_ANSWER);
                    }
                }
                MBAcquireRewardPopView mBAcquireRewardPopView3 = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView3.postDelayed(mBAcquireRewardPopView3.f18553n, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
            }
        };
        this.f18552m = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.6
            @Override // java.lang.Runnable
            public void run() {
                if (MBAcquireRewardPopView.this.f18547h <= 0) {
                    if (MBAcquireRewardPopView.this.f18541b.behaviourListener != null) {
                        MBAcquireRewardPopView.this.f18541b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_AUTO_DISMISS);
                    }
                    MBAcquireRewardPopView.this.f18548i = false;
                    MBAcquireRewardPopView.this.setVisibility(8);
                    MBAcquireRewardPopView.this.removeAllViews();
                    return;
                }
                MBAcquireRewardPopView.i(MBAcquireRewardPopView.this);
                MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView.postDelayed(mBAcquireRewardPopView.f18552m, 1000L);
            }
        };
        this.f18553n = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.7
            @Override // java.lang.Runnable
            public void run() {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(300L);
                alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.7.1
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        MBAcquireRewardPopView.this.f18548i = false;
                        MBAcquireRewardPopView.this.setVisibility(8);
                        MBAcquireRewardPopView.this.removeAllViews();
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }
                });
                MBAcquireRewardPopView.this.startAnimation(alphaAnimation);
            }
        };
        this.f18554o = new View.OnTouchListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.8
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 1) {
                        if (action == 2) {
                            MBAcquireRewardPopView.this.f18545f = motionEvent.getX();
                            MBAcquireRewardPopView.this.f18546g = motionEvent.getY();
                        }
                    } else if (MBAcquireRewardPopView.this.f18545f > MBAcquireRewardPopView.this.f18543d) {
                        if (Math.abs(MBAcquireRewardPopView.this.f18545f - MBAcquireRewardPopView.this.f18543d) > 50.0f && Math.abs(MBAcquireRewardPopView.this.f18546g - MBAcquireRewardPopView.this.f18544e) < 100.0f) {
                            if (MBAcquireRewardPopView.this.f18549j) {
                                return false;
                            }
                            MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                            mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.f18552m);
                            MBAcquireRewardPopView.this.f18549j = true;
                            View e8 = MBAcquireRewardPopView.e(MBAcquireRewardPopView.this);
                            View childAt = MBAcquireRewardPopView.this.getChildAt(0);
                            if (childAt != null) {
                                MBAcquireRewardPopView.a(MBAcquireRewardPopView.this, childAt, e8);
                            }
                            if (MBAcquireRewardPopView.this.f18541b.behaviourListener != null) {
                                MBAcquireRewardPopView.this.f18541b.behaviourListener.onReceivedSuccess(MBAcquireRewardPopView.this.f18541b.reduceTime);
                            }
                            MBAcquireRewardPopView mBAcquireRewardPopView2 = MBAcquireRewardPopView.this;
                            mBAcquireRewardPopView2.postDelayed(mBAcquireRewardPopView2.f18553n, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
                        } else {
                            MBAcquireRewardPopView.this.f18541b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.f18543d, MBAcquireRewardPopView.this.f18544e);
                        }
                    } else {
                        MBAcquireRewardPopView.this.f18541b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.f18543d, MBAcquireRewardPopView.this.f18544e);
                    }
                } else {
                    MBAcquireRewardPopView.this.f18543d = motionEvent.getX();
                    MBAcquireRewardPopView.this.f18544e = motionEvent.getY();
                }
                return false;
            }
        };
        this.f18555p = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MBAcquireRewardPopView.this.f18541b.behaviourListener != null) {
                    MBAcquireRewardPopView.this.f18541b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.f18543d, MBAcquireRewardPopView.this.f18544e);
                }
            }
        };
        this.f18556q = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MBAcquireRewardPopView.this.f18541b.behaviourListener != null) {
                    MBAcquireRewardPopView.this.f18541b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_CLICK_CLOSE);
                }
                MBAcquireRewardPopView.this.f18548i = false;
                MBAcquireRewardPopView.this.setVisibility(8);
                MBAcquireRewardPopView.this.removeAllViews();
            }
        };
    }

    public MBAcquireRewardPopView(Context context, AttributeSet attributeSet, int i8, int i9) {
        super(context, attributeSet, i8, i9);
        this.f18540a = "MBAcquireRewardPopView";
        this.f18543d = 0.0f;
        this.f18544e = 0.0f;
        this.f18545f = 0.0f;
        this.f18546g = 0.0f;
        this.f18551l = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                View f8;
                MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.f18552m);
                String str = (String) view.getTag();
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                boolean contains = MBAcquireRewardPopView.this.f18541b.rightAnswerList.contains(str);
                MBAcquireRewardPopView mBAcquireRewardPopView2 = MBAcquireRewardPopView.this;
                if (contains) {
                    f8 = MBAcquireRewardPopView.e(mBAcquireRewardPopView2);
                } else {
                    f8 = MBAcquireRewardPopView.f(mBAcquireRewardPopView2);
                }
                View childAt = MBAcquireRewardPopView.this.getChildAt(0);
                if (childAt != null) {
                    MBAcquireRewardPopView.a(MBAcquireRewardPopView.this, childAt, f8);
                }
                if (MBAcquireRewardPopView.this.f18541b.behaviourListener != null) {
                    if (contains) {
                        MBAcquireRewardPopView.this.f18541b.behaviourListener.onReceivedSuccess(MBAcquireRewardPopView.this.f18541b.reduceTime);
                    } else {
                        MBAcquireRewardPopView.this.f18541b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_CLICK_WRONG_ANSWER);
                    }
                }
                MBAcquireRewardPopView mBAcquireRewardPopView3 = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView3.postDelayed(mBAcquireRewardPopView3.f18553n, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
            }
        };
        this.f18552m = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.6
            @Override // java.lang.Runnable
            public void run() {
                if (MBAcquireRewardPopView.this.f18547h <= 0) {
                    if (MBAcquireRewardPopView.this.f18541b.behaviourListener != null) {
                        MBAcquireRewardPopView.this.f18541b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_AUTO_DISMISS);
                    }
                    MBAcquireRewardPopView.this.f18548i = false;
                    MBAcquireRewardPopView.this.setVisibility(8);
                    MBAcquireRewardPopView.this.removeAllViews();
                    return;
                }
                MBAcquireRewardPopView.i(MBAcquireRewardPopView.this);
                MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView.postDelayed(mBAcquireRewardPopView.f18552m, 1000L);
            }
        };
        this.f18553n = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.7
            @Override // java.lang.Runnable
            public void run() {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(300L);
                alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.7.1
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        MBAcquireRewardPopView.this.f18548i = false;
                        MBAcquireRewardPopView.this.setVisibility(8);
                        MBAcquireRewardPopView.this.removeAllViews();
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }
                });
                MBAcquireRewardPopView.this.startAnimation(alphaAnimation);
            }
        };
        this.f18554o = new View.OnTouchListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.8
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 1) {
                        if (action == 2) {
                            MBAcquireRewardPopView.this.f18545f = motionEvent.getX();
                            MBAcquireRewardPopView.this.f18546g = motionEvent.getY();
                        }
                    } else if (MBAcquireRewardPopView.this.f18545f > MBAcquireRewardPopView.this.f18543d) {
                        if (Math.abs(MBAcquireRewardPopView.this.f18545f - MBAcquireRewardPopView.this.f18543d) > 50.0f && Math.abs(MBAcquireRewardPopView.this.f18546g - MBAcquireRewardPopView.this.f18544e) < 100.0f) {
                            if (MBAcquireRewardPopView.this.f18549j) {
                                return false;
                            }
                            MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                            mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.f18552m);
                            MBAcquireRewardPopView.this.f18549j = true;
                            View e8 = MBAcquireRewardPopView.e(MBAcquireRewardPopView.this);
                            View childAt = MBAcquireRewardPopView.this.getChildAt(0);
                            if (childAt != null) {
                                MBAcquireRewardPopView.a(MBAcquireRewardPopView.this, childAt, e8);
                            }
                            if (MBAcquireRewardPopView.this.f18541b.behaviourListener != null) {
                                MBAcquireRewardPopView.this.f18541b.behaviourListener.onReceivedSuccess(MBAcquireRewardPopView.this.f18541b.reduceTime);
                            }
                            MBAcquireRewardPopView mBAcquireRewardPopView2 = MBAcquireRewardPopView.this;
                            mBAcquireRewardPopView2.postDelayed(mBAcquireRewardPopView2.f18553n, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
                        } else {
                            MBAcquireRewardPopView.this.f18541b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.f18543d, MBAcquireRewardPopView.this.f18544e);
                        }
                    } else {
                        MBAcquireRewardPopView.this.f18541b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.f18543d, MBAcquireRewardPopView.this.f18544e);
                    }
                } else {
                    MBAcquireRewardPopView.this.f18543d = motionEvent.getX();
                    MBAcquireRewardPopView.this.f18544e = motionEvent.getY();
                }
                return false;
            }
        };
        this.f18555p = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MBAcquireRewardPopView.this.f18541b.behaviourListener != null) {
                    MBAcquireRewardPopView.this.f18541b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.f18543d, MBAcquireRewardPopView.this.f18544e);
                }
            }
        };
        this.f18556q = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MBAcquireRewardPopView.this.f18541b.behaviourListener != null) {
                    MBAcquireRewardPopView.this.f18541b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_CLICK_CLOSE);
                }
                MBAcquireRewardPopView.this.f18548i = false;
                MBAcquireRewardPopView.this.setVisibility(8);
                MBAcquireRewardPopView.this.removeAllViews();
            }
        };
    }

    private GradientDrawable a(int[] iArr, GradientDrawable.Orientation orientation) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(iArr);
        gradientDrawable.setGradientType(0);
        gradientDrawable.setOrientation(orientation);
        gradientDrawable.setShape(0);
        return gradientDrawable;
    }

    static /* synthetic */ void a(MBAcquireRewardPopView mBAcquireRewardPopView, final View view) {
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 0.0f, 2, 0.8f, 1, 0.0f, 1, 0.0f);
        translateAnimation.setDuration(1000L);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(1000L);
        AnimationSet animationSet = new AnimationSet(true);
        mBAcquireRewardPopView.f18542c = animationSet;
        animationSet.addAnimation(translateAnimation);
        mBAcquireRewardPopView.f18542c.addAnimation(alphaAnimation);
        final AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setDuration(1000L);
        alphaAnimation2.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.3
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                view.startAnimation(MBAcquireRewardPopView.this.f18542c);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        mBAcquireRewardPopView.f18542c.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.4
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                view.startAnimation(alphaAnimation2);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        view.startAnimation(mBAcquireRewardPopView.f18542c);
    }

    static /* synthetic */ void a(MBAcquireRewardPopView mBAcquireRewardPopView, View view, View view2) {
        mBAcquireRewardPopView.removeView(view);
        mBAcquireRewardPopView.addView(view2);
    }
}
