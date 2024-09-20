package com.mbridge.msdk.foundation.webview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import com.mbridge.msdk.foundation.webview.c;

/* loaded from: classes4.dex */
public class ProgressBar extends View implements c {

    /* renamed from: a, reason: collision with root package name */
    Runnable f20138a;

    /* renamed from: b, reason: collision with root package name */
    private float f20139b;

    /* renamed from: c, reason: collision with root package name */
    private float f20140c;

    /* renamed from: d, reason: collision with root package name */
    private float f20141d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f20142e;

    /* renamed from: f, reason: collision with root package name */
    private float f20143f;

    /* renamed from: g, reason: collision with root package name */
    private long f20144g;

    /* renamed from: h, reason: collision with root package name */
    private Handler f20145h;

    /* renamed from: i, reason: collision with root package name */
    private Drawable f20146i;

    /* renamed from: j, reason: collision with root package name */
    private int f20147j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f20148k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f20149l;

    /* renamed from: m, reason: collision with root package name */
    private long f20150m;

    /* renamed from: n, reason: collision with root package name */
    private float f20151n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f20152o;

    /* renamed from: p, reason: collision with root package name */
    private c.a f20153p;

    /* renamed from: q, reason: collision with root package name */
    private Drawable f20154q;

    /* renamed from: r, reason: collision with root package name */
    private Rect f20155r;

    /* renamed from: s, reason: collision with root package name */
    private Drawable f20156s;

    /* renamed from: t, reason: collision with root package name */
    private float f20157t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f20158u;

    /* renamed from: v, reason: collision with root package name */
    private int f20159v;

    /* renamed from: w, reason: collision with root package name */
    private int f20160w;

    /* renamed from: x, reason: collision with root package name */
    private int f20161x;

    /* renamed from: y, reason: collision with root package name */
    private long f20162y;

    public ProgressBar(Context context) {
        super(context);
        this.f20138a = new Runnable() { // from class: com.mbridge.msdk.foundation.webview.ProgressBar.1
            @Override // java.lang.Runnable
            public final void run() {
                ProgressBar.this.invalidate();
            }
        };
        this.f20144g = 25L;
        this.f20145h = new Handler(Looper.getMainLooper());
        this.f20148k = false;
        this.f20151n = 0.95f;
        this.f20152o = false;
        this.f20155r = new Rect();
        setWillNotDraw(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r12.f20149l != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x005f, code lost:
    
        r7 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x004b, code lost:
    
        if (r12.f20149l != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0054, code lost:
    
        if (r12.f20149l != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x005d, code lost:
    
        if (r12.f20149l != false) goto L30;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void draw(android.graphics.Canvas r13) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.webview.ProgressBar.draw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public Bitmap getDrawingCache(boolean z8) {
        return null;
    }

    public float getProgress() {
        return this.f20139b;
    }

    public void initResource(boolean z8) {
        if (!z8 && (this.f20146i != null || this.f20154q != null || this.f20156s != null || this.f20142e != null)) {
            return;
        }
        Drawable drawable = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_highlight", "drawable", com.mbridge.msdk.foundation.controller.c.m().g()));
        this.f20146i = drawable;
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.f20146i.getIntrinsicHeight());
        }
        Drawable drawable2 = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_head", "drawable", com.mbridge.msdk.foundation.controller.c.m().g()));
        this.f20154q = drawable2;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), this.f20154q.getIntrinsicHeight());
        }
        this.f20156s = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_tail", "drawable", com.mbridge.msdk.foundation.controller.c.m().g()));
        this.f20142e = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_end_animation", "drawable", com.mbridge.msdk.foundation.controller.c.m().g()));
    }

    @Override // android.view.View
    protected void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        super.onLayout(z8, i8, i9, i10, i11);
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        super.onMeasure(i8, i9);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i8, int i9, int i10, int i11) {
        super.onSizeChanged(i8, i9, i10, i11);
        this.f20157t = getMeasuredWidth();
    }

    public void onThemeChange() {
        if (this.f20148k) {
            initResource(true);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z8) {
        super.onWindowFocusChanged(z8);
        Drawable drawable = this.f20146i;
        if (drawable != null) {
            drawable.setBounds(0, 0, (int) (drawable.getIntrinsicWidth() * 1.5d), getHeight());
        }
        Drawable drawable2 = this.f20154q;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, getWidth(), getHeight());
        }
    }

    public void setPaused(boolean z8) {
        this.f20152o = z8;
        if (!z8) {
            this.f20150m = System.currentTimeMillis();
        }
    }

    public void setProgress(float f8, boolean z8) {
        if (z8 && f8 >= 1.0f) {
            startEndAnimation();
        }
    }

    public void setProgressBarListener(c.a aVar) {
        this.f20153p = aVar;
    }

    public void setProgressState(int i8) {
        if (i8 != 5) {
            if (i8 != 6) {
                if (i8 != 7) {
                    if (i8 == 8) {
                        this.f20161x = 1;
                        if (this.f20160w == 1) {
                            startEndAnimation();
                            return;
                        }
                        return;
                    }
                    return;
                }
                startEndAnimation();
                return;
            }
            this.f20160w = 1;
            if (this.f20161x == 1) {
                startEndAnimation();
            }
            this.f20162y = 0L;
            return;
        }
        this.f20159v = 1;
        this.f20160w = 0;
        this.f20161x = 0;
        this.f20162y = 0L;
    }

    @Override // android.view.View
    public void setVisibility(int i8) {
        super.setVisibility(i8);
        if (i8 == 0) {
            c.a aVar = this.f20153p;
            if (aVar != null) {
                aVar.a(true);
                return;
            }
            return;
        }
        c.a aVar2 = this.f20153p;
        if (aVar2 != null) {
            aVar2.a(false);
        }
    }

    public void setVisible(boolean z8) {
        if (z8) {
            this.f20149l = true;
            this.f20150m = System.currentTimeMillis();
            this.f20141d = 0.0f;
            this.f20162y = 0L;
            this.f20158u = false;
            this.f20143f = 0.0f;
            this.f20139b = 0.0f;
            this.f20157t = getMeasuredWidth();
            this.f20152o = false;
            this.f20159v = 0;
            this.f20160w = 0;
            this.f20161x = 0;
            Drawable drawable = this.f20146i;
            if (drawable != null) {
                this.f20147j = -drawable.getIntrinsicWidth();
            } else {
                this.f20147j = 0;
            }
            Drawable drawable2 = this.f20156s;
            if (drawable2 != null) {
                drawable2.setAlpha(255);
            }
            Drawable drawable3 = this.f20142e;
            if (drawable3 != null) {
                drawable3.setAlpha(255);
            }
            Drawable drawable4 = this.f20154q;
            if (drawable4 != null) {
                drawable4.setAlpha(255);
            }
            setVisibility(0);
            invalidate();
            return;
        }
        setVisibility(4);
    }

    public void startEndAnimation() {
        if (!this.f20158u) {
            this.f20158u = true;
            this.f20143f = 0.0f;
        }
    }

    public ProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20138a = new Runnable() { // from class: com.mbridge.msdk.foundation.webview.ProgressBar.1
            @Override // java.lang.Runnable
            public final void run() {
                ProgressBar.this.invalidate();
            }
        };
        this.f20144g = 25L;
        this.f20145h = new Handler(Looper.getMainLooper());
        this.f20148k = false;
        this.f20151n = 0.95f;
        this.f20152o = false;
        this.f20155r = new Rect();
        setWillNotDraw(false);
    }
}
