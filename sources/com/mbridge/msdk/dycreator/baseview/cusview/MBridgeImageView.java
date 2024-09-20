package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes4.dex */
public class MBridgeImageView extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    private Xfermode f18469a;

    /* renamed from: b, reason: collision with root package name */
    private int f18470b;

    /* renamed from: c, reason: collision with root package name */
    private int f18471c;

    /* renamed from: d, reason: collision with root package name */
    private int f18472d;

    /* renamed from: e, reason: collision with root package name */
    private int f18473e;

    /* renamed from: f, reason: collision with root package name */
    private int f18474f;

    /* renamed from: g, reason: collision with root package name */
    private int f18475g;

    /* renamed from: h, reason: collision with root package name */
    private int f18476h;

    /* renamed from: i, reason: collision with root package name */
    private int f18477i;

    /* renamed from: j, reason: collision with root package name */
    private int f18478j;

    /* renamed from: k, reason: collision with root package name */
    private float[] f18479k;

    /* renamed from: l, reason: collision with root package name */
    private float[] f18480l;

    /* renamed from: m, reason: collision with root package name */
    private RectF f18481m;

    /* renamed from: n, reason: collision with root package name */
    private RectF f18482n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f18483o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f18484p;

    /* renamed from: q, reason: collision with root package name */
    private Path f18485q;

    /* renamed from: r, reason: collision with root package name */
    private Paint f18486r;

    public MBridgeImageView(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        try {
            canvas.saveLayer(this.f18481m, null, 31);
            int i8 = this.f18470b;
            int i9 = this.f18477i;
            int i10 = this.f18471c;
            canvas.scale(((i8 - (i9 * 2)) * 1.0f) / i8, ((i10 - (i9 * 2)) * 1.0f) / i10, i8 / 2.0f, i10 / 2.0f);
            super.onDraw(canvas);
            Paint paint = this.f18486r;
            if (paint != null) {
                paint.reset();
                this.f18486r.setAntiAlias(true);
                this.f18486r.setStyle(Paint.Style.FILL);
                this.f18486r.setXfermode(this.f18469a);
            }
            Path path = this.f18485q;
            if (path != null) {
                path.reset();
                this.f18485q.addRoundRect(this.f18481m, this.f18480l, Path.Direction.CCW);
            }
            canvas.drawPath(this.f18485q, this.f18486r);
            Paint paint2 = this.f18486r;
            if (paint2 != null) {
                paint2.setXfermode(null);
            }
            canvas.restore();
            if (this.f18483o) {
                int i11 = this.f18477i;
                int i12 = this.f18478j;
                RectF rectF = this.f18482n;
                float[] fArr = this.f18479k;
                try {
                    Path path2 = this.f18485q;
                    if (path2 != null) {
                        path2.reset();
                    }
                    Paint paint3 = this.f18486r;
                    if (paint3 != null) {
                        paint3.setStrokeWidth(i11);
                        this.f18486r.setColor(i12);
                        this.f18486r.setStyle(Paint.Style.STROKE);
                    }
                    Path path3 = this.f18485q;
                    if (path3 != null) {
                        path3.addRoundRect(rectF, fArr, Path.Direction.CCW);
                    }
                    canvas.drawPath(this.f18485q, this.f18486r);
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
            }
        } catch (Exception e9) {
            ad.a("MBridgeImageView", e9.getMessage());
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i8, int i9, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        super.onSizeChanged(i8, i9, i10, i11);
        this.f18470b = i8;
        this.f18471c = i9;
        int i15 = 0;
        if (this.f18484p) {
            try {
                if (this.f18479k != null && this.f18480l != null) {
                    while (true) {
                        i12 = 2;
                        if (i15 >= 2) {
                            break;
                        }
                        float[] fArr = this.f18479k;
                        int i16 = this.f18473e;
                        fArr[i15] = i16;
                        this.f18480l[i15] = i16 - (this.f18477i / 2.0f);
                        i15++;
                    }
                    while (true) {
                        i13 = 4;
                        if (i12 >= 4) {
                            break;
                        }
                        float[] fArr2 = this.f18479k;
                        int i17 = this.f18474f;
                        fArr2[i12] = i17;
                        this.f18480l[i12] = i17 - (this.f18477i / 2.0f);
                        i12++;
                    }
                    while (true) {
                        if (i13 >= 6) {
                            break;
                        }
                        float[] fArr3 = this.f18479k;
                        int i18 = this.f18475g;
                        fArr3[i13] = i18;
                        this.f18480l[i13] = i18 - (this.f18477i / 2.0f);
                        i13++;
                    }
                    for (i14 = 6; i14 < 8; i14++) {
                        float[] fArr4 = this.f18479k;
                        int i19 = this.f18476h;
                        fArr4[i14] = i19;
                        this.f18480l[i14] = i19 - (this.f18477i / 2.0f);
                    }
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        } else if (this.f18479k != null && this.f18480l != null) {
            while (true) {
                try {
                    float[] fArr5 = this.f18479k;
                    if (i15 >= fArr5.length) {
                        break;
                    }
                    int i20 = this.f18472d;
                    fArr5[i15] = i20;
                    this.f18480l[i15] = i20 - (this.f18477i / 2.0f);
                    i15++;
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
            }
        }
        RectF rectF = this.f18482n;
        if (rectF != null) {
            int i21 = this.f18477i;
            rectF.set(i21 / 2.0f, i21 / 2.0f, this.f18470b - (i21 / 2.0f), this.f18471c - (i21 / 2.0f));
        }
        RectF rectF2 = this.f18481m;
        if (rectF2 != null) {
            rectF2.set(0.0f, 0.0f, this.f18470b, this.f18471c);
        }
    }

    public void setBorder(int i8, int i9, int i10) {
        this.f18483o = true;
        this.f18477i = i9;
        this.f18478j = i10;
        this.f18472d = i8;
    }

    public void setCornerRadius(int i8) {
        this.f18472d = i8;
    }

    public void setCustomBorder(int i8, int i9, int i10, int i11, int i12, int i13) {
        this.f18483o = true;
        this.f18484p = true;
        this.f18477i = i12;
        this.f18478j = i13;
        this.f18473e = i8;
        this.f18475g = i10;
        this.f18474f = i9;
        this.f18476h = i11;
    }

    public MBridgeImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MBridgeImageView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f18485q = new Path();
        this.f18486r = new Paint();
        this.f18479k = new float[8];
        this.f18480l = new float[8];
        this.f18482n = new RectF();
        this.f18481m = new RectF();
        this.f18469a = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
    }
}
