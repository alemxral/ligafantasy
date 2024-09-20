package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes4.dex */
public class MBRotationView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    Runnable f18428a;

    /* renamed from: b, reason: collision with root package name */
    private Camera f18429b;

    /* renamed from: c, reason: collision with root package name */
    private Matrix f18430c;

    /* renamed from: d, reason: collision with root package name */
    private int f18431d;

    /* renamed from: e, reason: collision with root package name */
    private int f18432e;

    /* renamed from: f, reason: collision with root package name */
    private int f18433f;

    /* renamed from: g, reason: collision with root package name */
    private int f18434g;

    /* renamed from: h, reason: collision with root package name */
    private int f18435h;

    /* renamed from: i, reason: collision with root package name */
    private int f18436i;

    /* renamed from: j, reason: collision with root package name */
    private int f18437j;

    /* renamed from: k, reason: collision with root package name */
    private int f18438k;

    /* renamed from: l, reason: collision with root package name */
    private float f18439l;

    /* renamed from: m, reason: collision with root package name */
    private float f18440m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f18441n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f18442o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f18443p;

    public MBRotationView(Context context) {
        super(context);
        this.f18433f = 40;
        this.f18434g = 20;
        this.f18435h = 0;
        this.f18436i = 0;
        this.f18438k = 0;
        this.f18439l = 0.5f;
        this.f18440m = 0.9f;
        this.f18441n = true;
        this.f18442o = false;
        this.f18443p = false;
        this.f18428a = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView.1
            @Override // java.lang.Runnable
            public void run() {
                MBRotationView.a(MBRotationView.this);
            }
        };
        a();
    }

    private void a() {
        this.f18429b = new Camera();
        this.f18430c = new Matrix();
        setWillNotDraw(false);
    }

    private void b(int i8, int i9, int i10) {
        if (i10 == 0) {
            float f8 = (-i8) / 2;
            this.f18429b.translate(f8, 0.0f, 0.0f);
            float f9 = -i9;
            this.f18429b.rotateY(f9);
            this.f18429b.translate(f8, 0.0f, 0.0f);
            this.f18429b.translate(f8, 0.0f, 0.0f);
            this.f18429b.rotateY(f9);
            this.f18429b.translate(f8, 0.0f, 0.0f);
            return;
        }
        if (i10 == 1) {
            float f10 = i8 / 2;
            this.f18429b.translate(f10, 0.0f, 0.0f);
            this.f18429b.rotateY(i9);
            this.f18429b.translate(f10, 0.0f, 0.0f);
            return;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                return;
            }
            this.f18429b.rotateY(0.0f);
        } else {
            float f11 = (-i8) / 2;
            this.f18429b.translate(f11, 0.0f, 0.0f);
            this.f18429b.rotateY(-i9);
            this.f18429b.translate(f11, 0.0f, 0.0f);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (getChildCount() == 0) {
            return;
        }
        if (this.f18442o) {
            int height = getHeight() / 2;
            int i8 = ((this.f18435h * this.f18431d) / 2) / this.f18433f;
            a(canvas, i8, height, 0);
            a(canvas, i8, height, 1);
            if (Math.abs(this.f18435h) > this.f18433f / 2) {
                a(canvas, i8, height, 3);
                a(canvas, i8, height, 2);
                return;
            } else {
                a(canvas, i8, height, 2);
                a(canvas, i8, height, 3);
                return;
            }
        }
        int width = getWidth() / 2;
        int i9 = ((this.f18435h * this.f18432e) / 2) / this.f18433f;
        b(canvas, i9, width, 0);
        b(canvas, i9, width, 1);
        if (Math.abs(this.f18435h) > this.f18433f / 2) {
            b(canvas, i9, width, 3);
            b(canvas, i9, width, 2);
        } else {
            b(canvas, i9, width, 2);
            b(canvas, i9, width, 3);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        int i12 = i10 - i8;
        float f8 = i12;
        float f9 = this.f18439l;
        int i13 = (int) (((1.0f - f9) * f8) / 2.0f);
        int i14 = i11 - i9;
        float f10 = i14;
        float f11 = this.f18440m;
        int i15 = (int) (((1.0f - f11) * f10) / 2.0f);
        this.f18431d = (int) (f10 * f11);
        this.f18432e = (int) (f8 * f9);
        int childCount = getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            childAt.layout(i13, i15, i12 - i13, i14 - i15);
            childAt.setClickable(true);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            int i17 = layoutParams.width;
            int i18 = this.f18432e;
            if (i17 != i18) {
                layoutParams.width = i18;
                layoutParams.height = this.f18431d;
                childAt.setLayoutParams(layoutParams);
            }
        }
    }

    public void setAutoscroll(boolean z8) {
        if (z8) {
            postDelayed(this.f18428a, 1000 / this.f18434g);
        }
        this.f18441n = z8;
    }

    public void setHeightRatio(float f8) {
        this.f18440m = f8;
    }

    public void setRotateV(boolean z8) {
        this.f18442o = z8;
        invalidate();
    }

    public void setWidthRatio(float f8) {
        this.f18439l = f8;
    }

    private void a(int i8, int i9, int i10) {
        float f8 = (-i8) / 2.0f;
        if (i10 == 0) {
            this.f18429b.translate(0.0f, f8, 0.0f);
            float f9 = -i9;
            this.f18429b.rotateX(f9);
            this.f18429b.translate(0.0f, f8, 0.0f);
            this.f18429b.translate(0.0f, f8, 0.0f);
            this.f18429b.rotateX(f9);
            this.f18429b.translate(0.0f, f8, 0.0f);
            return;
        }
        if (i10 == 1) {
            this.f18429b.translate(0.0f, f8, 0.0f);
            this.f18429b.rotateX(i9);
            this.f18429b.translate(0.0f, f8, 0.0f);
        } else if (i10 != 2) {
            if (i10 != 3) {
                return;
            }
            this.f18429b.rotateX(0.0f);
        } else {
            this.f18429b.translate(0.0f, f8, 0.0f);
            this.f18429b.rotateX(-i9);
            this.f18429b.translate(0.0f, f8, 0.0f);
        }
    }

    public MBRotationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18433f = 40;
        this.f18434g = 20;
        this.f18435h = 0;
        this.f18436i = 0;
        this.f18438k = 0;
        this.f18439l = 0.5f;
        this.f18440m = 0.9f;
        this.f18441n = true;
        this.f18442o = false;
        this.f18443p = false;
        this.f18428a = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView.1
            @Override // java.lang.Runnable
            public void run() {
                MBRotationView.a(MBRotationView.this);
            }
        };
        a();
    }

    private void b(Canvas canvas, int i8, int i9, int i10) {
        canvas.save();
        this.f18429b.save();
        this.f18430c.reset();
        float f8 = i8;
        this.f18429b.translate(f8, 0.0f, 0.0f);
        this.f18429b.rotateY(this.f18435h);
        this.f18429b.translate(f8, 0.0f, 0.0f);
        if (i8 == 0) {
            if (this.f18443p) {
                b(this.f18432e, this.f18433f, i10);
            } else {
                b(-this.f18432e, -this.f18433f, i10);
            }
        } else if (i8 > 0) {
            b(this.f18432e, this.f18433f, i10);
        } else if (i8 < 0) {
            b(-this.f18432e, -this.f18433f, i10);
        }
        this.f18429b.getMatrix(this.f18430c);
        this.f18429b.restore();
        this.f18430c.preTranslate(-i9, (-getHeight()) / 2);
        this.f18430c.postTranslate(i9, getHeight() / 2);
        canvas.concat(this.f18430c);
        View childAt = getChildAt(a(i10));
        if (childAt != null) {
            drawChild(canvas, childAt, 0L);
        }
        canvas.restore();
    }

    private void a(Canvas canvas, int i8, int i9, int i10) {
        canvas.save();
        this.f18429b.save();
        this.f18430c.reset();
        float f8 = i8;
        this.f18429b.translate(0.0f, f8, 0.0f);
        this.f18429b.rotateX(this.f18435h);
        this.f18429b.translate(0.0f, f8, 0.0f);
        if (i8 == 0) {
            if (this.f18443p) {
                a(this.f18431d, this.f18433f, i10);
            } else {
                a(-this.f18431d, -this.f18433f, i10);
            }
        } else if (i8 > 0) {
            a(this.f18431d, this.f18433f, i10);
        } else if (i8 < 0) {
            a(-this.f18431d, -this.f18433f, i10);
        }
        this.f18429b.getMatrix(this.f18430c);
        this.f18429b.restore();
        this.f18430c.preTranslate((-getWidth()) / 2, -i9);
        this.f18430c.postTranslate(getWidth() / 2, i9);
        canvas.concat(this.f18430c);
        View childAt = getChildAt(a(i10));
        if (childAt != null) {
            drawChild(canvas, childAt, 0L);
        }
        canvas.restore();
    }

    public MBRotationView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f18433f = 40;
        this.f18434g = 20;
        this.f18435h = 0;
        this.f18436i = 0;
        this.f18438k = 0;
        this.f18439l = 0.5f;
        this.f18440m = 0.9f;
        this.f18441n = true;
        this.f18442o = false;
        this.f18443p = false;
        this.f18428a = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView.1
            @Override // java.lang.Runnable
            public void run() {
                MBRotationView.a(MBRotationView.this);
            }
        };
        a();
    }

    private int a(int i8) {
        int i9;
        int i10;
        int i11;
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 != 2) {
                    i9 = i8 != 3 ? 0 : this.f18436i;
                } else if (this.f18443p) {
                    i10 = this.f18436i;
                    i9 = i10 - 1;
                } else {
                    i11 = this.f18436i;
                    i9 = i11 + 1;
                }
            } else if (this.f18443p) {
                i11 = this.f18436i;
                i9 = i11 + 1;
            } else {
                i10 = this.f18436i;
                i9 = i10 - 1;
            }
        } else if (this.f18443p) {
            i9 = this.f18436i - 2;
        } else {
            i9 = this.f18436i + 2;
        }
        int childCount = i9 % getChildCount();
        return childCount >= 0 ? childCount : childCount + getChildCount();
    }

    static /* synthetic */ void a(MBRotationView mBRotationView) {
        int a8;
        if (mBRotationView.getChildCount() == 0) {
            return;
        }
        int i8 = mBRotationView.f18435h - 1;
        mBRotationView.f18435h = i8;
        int i9 = mBRotationView.f18436i;
        mBRotationView.f18437j = i9;
        int i10 = mBRotationView.f18433f;
        int i11 = i9 - (i8 / i10);
        int i12 = i8 % i10;
        mBRotationView.f18435h = i12;
        mBRotationView.f18436i = i11;
        if (Math.abs(i12) > mBRotationView.f18433f / 2) {
            a8 = mBRotationView.a(2);
        } else {
            a8 = mBRotationView.a(3);
        }
        if (mBRotationView.f18438k != a8) {
            mBRotationView.f18438k = a8;
        }
        mBRotationView.invalidate();
        if (mBRotationView.f18441n) {
            mBRotationView.postDelayed(mBRotationView.f18428a, 1000 / mBRotationView.f18434g);
        }
    }
}
