package com.mbridge.msdk.video.dynview.g;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;

/* loaded from: classes4.dex */
public final class a extends ShapeDrawable {

    /* renamed from: a, reason: collision with root package name */
    private int f22037a;

    /* renamed from: b, reason: collision with root package name */
    private float f22038b;

    /* renamed from: c, reason: collision with root package name */
    private float f22039c;

    /* renamed from: d, reason: collision with root package name */
    private int f22040d;

    /* renamed from: e, reason: collision with root package name */
    private int f22041e;

    /* renamed from: f, reason: collision with root package name */
    private Bitmap f22042f;

    /* renamed from: g, reason: collision with root package name */
    private Bitmap f22043g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f22044h;

    /* renamed from: i, reason: collision with root package name */
    private Paint f22045i;

    /* renamed from: j, reason: collision with root package name */
    private Matrix f22046j;

    /* renamed from: com.mbridge.msdk.video.dynview.g.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0431a implements b {

        /* renamed from: a, reason: collision with root package name */
        private RectShape f22047a;

        /* renamed from: b, reason: collision with root package name */
        private Bitmap f22048b;

        /* renamed from: c, reason: collision with root package name */
        private Bitmap f22049c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f22050d;

        /* renamed from: e, reason: collision with root package name */
        private int f22051e;

        /* renamed from: f, reason: collision with root package name */
        private int f22052f;

        /* renamed from: g, reason: collision with root package name */
        private int f22053g;

        /* renamed from: h, reason: collision with root package name */
        private float f22054h;

        /* renamed from: i, reason: collision with root package name */
        private float f22055i;

        private C0431a() {
            this.f22052f = 100;
            this.f22053g = 10;
            this.f22047a = new RectShape();
        }

        @Override // com.mbridge.msdk.video.dynview.g.a.b
        public final b a(Bitmap bitmap) {
            this.f22048b = bitmap;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.g.a.b
        public final b b(Bitmap bitmap) {
            this.f22049c = bitmap;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.g.a.b
        public final b a(boolean z8) {
            this.f22050d = z8;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.g.a.b
        public final b b(float f8) {
            this.f22055i = f8;
            return this;
        }

        public final b a(int i8) {
            this.f22051e = i8;
            return this;
        }

        public final b a(float f8) {
            this.f22054h = f8;
            return this;
        }

        public final a a() {
            return new a(this);
        }
    }

    /* loaded from: classes4.dex */
    public interface b {
        b a(Bitmap bitmap);

        b a(boolean z8);

        b b(float f8);

        b b(Bitmap bitmap);
    }

    private void a(Canvas canvas, Path path, Bitmap bitmap) {
        if (canvas == null || path == null || bitmap == null || bitmap.isRecycled()) {
            return;
        }
        if (bitmap.getWidth() != 0 && bitmap.getHeight() != 0) {
            float max = Math.max(this.f22038b / bitmap.getWidth(), this.f22039c / bitmap.getHeight());
            if (this.f22046j == null) {
                this.f22046j = new Matrix();
            }
            this.f22046j.reset();
            this.f22046j.preScale(max, max);
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(this.f22046j);
        this.f22045i.setShader(bitmapShader);
        canvas.drawPath(path, this.f22045i);
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f22037a == 1) {
            float f8 = this.f22039c / 2.0f;
            Path path = new Path();
            path.moveTo(0.0f, 0.0f);
            path.lineTo(0.0f, (this.f22040d + f8) - this.f22041e);
            path.lineTo(this.f22038b, (f8 - this.f22040d) - this.f22041e);
            path.lineTo(this.f22038b, 0.0f);
            if (this.f22044h) {
                try {
                    a(canvas, path);
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
            } else {
                Bitmap bitmap = this.f22042f;
                if (bitmap != null && !bitmap.isRecycled()) {
                    try {
                        a(canvas, path, this.f22042f);
                    } catch (Exception e9) {
                        e9.printStackTrace();
                    }
                }
            }
            Path path2 = new Path();
            path2.moveTo(0.0f, this.f22040d + f8 + this.f22041e);
            path2.lineTo(0.0f, this.f22039c);
            path2.lineTo(this.f22038b, this.f22039c);
            path2.lineTo(this.f22038b, (f8 - this.f22040d) + this.f22041e);
            if (this.f22044h) {
                try {
                    a(canvas, path2);
                    return;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return;
                }
            }
            Bitmap bitmap2 = this.f22043g;
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                try {
                    a(canvas, path2, this.f22043g);
                    return;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return;
                }
            }
            return;
        }
        float f9 = this.f22038b / 2.0f;
        Path path3 = new Path();
        path3.moveTo(0.0f, 0.0f);
        path3.lineTo(0.0f, this.f22039c);
        path3.lineTo((f9 - this.f22040d) - this.f22041e, this.f22039c);
        path3.lineTo((this.f22040d + f9) - this.f22041e, 0.0f);
        if (this.f22044h) {
            try {
                a(canvas, path3);
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        } else {
            Bitmap bitmap3 = this.f22042f;
            if (bitmap3 != null && !bitmap3.isRecycled()) {
                try {
                    a(canvas, path3, this.f22042f);
                } catch (Exception e13) {
                    e13.printStackTrace();
                }
            }
        }
        Path path4 = new Path();
        path4.moveTo(this.f22040d + f9 + this.f22041e, 0.0f);
        path4.lineTo(this.f22038b, 0.0f);
        path4.lineTo(this.f22038b, this.f22039c);
        path4.lineTo((f9 - this.f22040d) + this.f22041e, this.f22039c);
        if (this.f22044h) {
            try {
                a(canvas, path4);
                return;
            } catch (Exception e14) {
                e14.printStackTrace();
                return;
            }
        }
        Bitmap bitmap4 = this.f22043g;
        if (bitmap4 != null && !bitmap4.isRecycled()) {
            try {
                a(canvas, path4, this.f22043g);
            } catch (Exception e15) {
                e15.printStackTrace();
            }
        }
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    private a(C0431a c0431a) {
        super(c0431a.f22047a);
        this.f22044h = false;
        this.f22042f = c0431a.f22048b;
        this.f22043g = c0431a.f22049c;
        this.f22044h = c0431a.f22050d;
        this.f22037a = c0431a.f22051e;
        this.f22040d = c0431a.f22052f;
        this.f22041e = c0431a.f22053g;
        this.f22038b = c0431a.f22054h;
        this.f22039c = c0431a.f22055i;
        Paint paint = new Paint();
        this.f22045i = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f22045i.setAntiAlias(true);
        this.f22046j = new Matrix();
    }

    private void a(Canvas canvas, Path path) {
        this.f22045i.setColor(Color.parseColor("#40EAEAEA"));
        canvas.drawPath(path, this.f22045i);
    }

    public static C0431a a() {
        return new C0431a();
    }
}
