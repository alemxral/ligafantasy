package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class BorderKt {
    public static final Modifier border(Modifier modifier, BorderStroke border, Shape shape) {
        AbstractC3159y.i(modifier, "<this>");
        AbstractC3159y.i(border, "border");
        AbstractC3159y.i(shape, "shape");
        return m295borderziNgDLE(modifier, border.m308getWidthD9Ej5fM(), border.getBrush(), shape);
    }

    public static /* synthetic */ Modifier border$default(Modifier modifier, BorderStroke borderStroke, Shape shape, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        return border(modifier, borderStroke, shape);
    }

    /* renamed from: border-xT4_qwU, reason: not valid java name */
    public static final Modifier m293borderxT4_qwU(Modifier border, float f8, long j8, Shape shape) {
        AbstractC3159y.i(border, "$this$border");
        AbstractC3159y.i(shape, "shape");
        return m295borderziNgDLE(border, f8, new SolidColor(j8, null), shape);
    }

    /* renamed from: border-xT4_qwU$default, reason: not valid java name */
    public static /* synthetic */ Modifier m294borderxT4_qwU$default(Modifier modifier, float f8, long j8, Shape shape, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        return m293borderxT4_qwU(modifier, f8, j8, shape);
    }

    /* renamed from: border-ziNgDLE, reason: not valid java name */
    public static final Modifier m295borderziNgDLE(Modifier border, float f8, Brush brush, Shape shape) {
        AbstractC3159y.i(border, "$this$border");
        AbstractC3159y.i(brush, "brush");
        AbstractC3159y.i(shape, "shape");
        return border.then(new BorderModifierNodeElement(f8, brush, shape, null));
    }

    private static final RoundRect createInsetRoundedRect(float f8, RoundRect roundRect) {
        return new RoundRect(f8, f8, roundRect.getWidth() - f8, roundRect.getHeight() - f8, m297shrinkKibmq7A(roundRect.m2785getTopLeftCornerRadiuskKHJgLs(), f8), m297shrinkKibmq7A(roundRect.m2786getTopRightCornerRadiuskKHJgLs(), f8), m297shrinkKibmq7A(roundRect.m2784getBottomRightCornerRadiuskKHJgLs(), f8), m297shrinkKibmq7A(roundRect.m2783getBottomLeftCornerRadiuskKHJgLs(), f8), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Path createRoundRectPath(Path path, RoundRect roundRect, float f8, boolean z8) {
        path.reset();
        path.addRoundRect(roundRect);
        if (!z8) {
            Path Path = AndroidPath_androidKt.Path();
            Path.addRoundRect(createInsetRoundedRect(f8, roundRect));
            path.mo2869opN5in7k0(path, Path, PathOperation.Companion.m3240getDifferenceb3I0S0c());
        }
        return path;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawResult drawContentWithoutBorder(CacheDrawScope cacheDrawScope) {
        return cacheDrawScope.onDrawWithContent(BorderKt$drawContentWithoutBorder$1.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawRectBorder-NsqcLGU, reason: not valid java name */
    public static final DrawResult m296drawRectBorderNsqcLGU(CacheDrawScope cacheDrawScope, Brush brush, long j8, long j9, boolean z8, float f8) {
        long j10;
        long j11;
        DrawStyle stroke;
        if (z8) {
            j10 = Offset.Companion.m2751getZeroF1C5BW0();
        } else {
            j10 = j8;
        }
        if (z8) {
            j11 = cacheDrawScope.m2639getSizeNHjbRc();
        } else {
            j11 = j9;
        }
        if (z8) {
            stroke = Fill.INSTANCE;
        } else {
            stroke = new Stroke(f8, 0.0f, 0, 0, null, 30, null);
        }
        return cacheDrawScope.onDrawWithContent(new BorderKt$drawRectBorder$1(brush, j10, j11, stroke));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: shrink-Kibmq7A, reason: not valid java name */
    public static final long m297shrinkKibmq7A(long j8, float f8) {
        return CornerRadiusKt.CornerRadius(Math.max(0.0f, CornerRadius.m2710getXimpl(j8) - f8), Math.max(0.0f, CornerRadius.m2711getYimpl(j8) - f8));
    }
}
