package j5;

import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import com.uptodown.tv.utils.CropImageViewTv;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: j5.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3088a {

    /* renamed from: a, reason: collision with root package name */
    private final CropImageViewTv f33267a;

    public C3088a(CropImageViewTv cropImageView) {
        AbstractC3159y.i(cropImageView, "cropImageView");
        this.f33267a = cropImageView;
    }

    private final Matrix b() {
        Matrix imageMatrix = this.f33267a.getImageMatrix();
        AbstractC3159y.h(imageMatrix, "cropImageView.imageMatrix");
        return imageMatrix;
    }

    private final float c(int i8, int i9, float f8, boolean z8) {
        if (!z8) {
            if (i8 != 3 && i8 != 4 && i8 != 5) {
                if (i8 == 6 || i8 == 7) {
                    return (i9 - f8) / 2.0f;
                }
                return 0.0f;
            }
            return i9 - f8;
        }
        return 0.0f;
    }

    private final float d(int i8, int i9, float f8, boolean z8) {
        if (z8) {
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 4) {
                        if (i8 != 5 && i8 != 7) {
                            return 0.0f;
                        }
                    }
                }
                return i9 - f8;
            }
            return (i9 - f8) / 2.0f;
        }
        return 0.0f;
    }

    public final void a() {
        boolean z8;
        int width = (this.f33267a.getWidth() - this.f33267a.getPaddingLeft()) - this.f33267a.getPaddingRight();
        int height = (this.f33267a.getHeight() - this.f33267a.getPaddingTop()) - this.f33267a.getPaddingBottom();
        int cropType = this.f33267a.getCropType();
        Drawable drawable = this.f33267a.getDrawable();
        if (cropType != -1 && height > 0 && width > 0 && drawable != null) {
            Matrix b8 = b();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            float intrinsicHeight = drawable.getIntrinsicHeight();
            float f8 = height / intrinsicHeight;
            float f9 = intrinsicWidth;
            float f10 = width / f9;
            if (f10 > f8) {
                f8 = f10;
            }
            b8.setScale(f8, f8);
            if (f10 > f8) {
                z8 = true;
            } else {
                z8 = false;
            }
            b8.postTranslate(c(cropType, width, f9 * f8, z8), d(cropType, height, intrinsicHeight * f8, z8));
            this.f33267a.setImageMatrix(b8);
        }
    }
}
