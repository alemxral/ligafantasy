package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC3151p;

@Immutable
/* loaded from: classes.dex */
public abstract class PathNode {
    private final boolean isCurve;
    private final boolean isQuad;

    @Immutable
    /* loaded from: classes.dex */
    public static final class ArcTo extends PathNode {
        private final float arcStartX;
        private final float arcStartY;
        private final float horizontalEllipseRadius;
        private final boolean isMoreThanHalf;
        private final boolean isPositiveArc;
        private final float theta;
        private final float verticalEllipseRadius;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public ArcTo(float r4, float r5, float r6, boolean r7, boolean r8, float r9, float r10) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.horizontalEllipseRadius = r4
                r3.verticalEllipseRadius = r5
                r3.theta = r6
                r3.isMoreThanHalf = r7
                r3.isPositiveArc = r8
                r3.arcStartX = r9
                r3.arcStartY = r10
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.PathNode.ArcTo.<init>(float, float, float, boolean, boolean, float, float):void");
        }

        public static /* synthetic */ ArcTo copy$default(ArcTo arcTo, float f8, float f9, float f10, boolean z8, boolean z9, float f11, float f12, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                f8 = arcTo.horizontalEllipseRadius;
            }
            if ((i8 & 2) != 0) {
                f9 = arcTo.verticalEllipseRadius;
            }
            float f13 = f9;
            if ((i8 & 4) != 0) {
                f10 = arcTo.theta;
            }
            float f14 = f10;
            if ((i8 & 8) != 0) {
                z8 = arcTo.isMoreThanHalf;
            }
            boolean z10 = z8;
            if ((i8 & 16) != 0) {
                z9 = arcTo.isPositiveArc;
            }
            boolean z11 = z9;
            if ((i8 & 32) != 0) {
                f11 = arcTo.arcStartX;
            }
            float f15 = f11;
            if ((i8 & 64) != 0) {
                f12 = arcTo.arcStartY;
            }
            return arcTo.copy(f8, f13, f14, z10, z11, f15, f12);
        }

        public final float component1() {
            return this.horizontalEllipseRadius;
        }

        public final float component2() {
            return this.verticalEllipseRadius;
        }

        public final float component3() {
            return this.theta;
        }

        public final boolean component4() {
            return this.isMoreThanHalf;
        }

        public final boolean component5() {
            return this.isPositiveArc;
        }

        public final float component6() {
            return this.arcStartX;
        }

        public final float component7() {
            return this.arcStartY;
        }

        public final ArcTo copy(float f8, float f9, float f10, boolean z8, boolean z9, float f11, float f12) {
            return new ArcTo(f8, f9, f10, z8, z9, f11, f12);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ArcTo)) {
                return false;
            }
            ArcTo arcTo = (ArcTo) obj;
            return Float.compare(this.horizontalEllipseRadius, arcTo.horizontalEllipseRadius) == 0 && Float.compare(this.verticalEllipseRadius, arcTo.verticalEllipseRadius) == 0 && Float.compare(this.theta, arcTo.theta) == 0 && this.isMoreThanHalf == arcTo.isMoreThanHalf && this.isPositiveArc == arcTo.isPositiveArc && Float.compare(this.arcStartX, arcTo.arcStartX) == 0 && Float.compare(this.arcStartY, arcTo.arcStartY) == 0;
        }

        public final float getArcStartX() {
            return this.arcStartX;
        }

        public final float getArcStartY() {
            return this.arcStartY;
        }

        public final float getHorizontalEllipseRadius() {
            return this.horizontalEllipseRadius;
        }

        public final float getTheta() {
            return this.theta;
        }

        public final float getVerticalEllipseRadius() {
            return this.verticalEllipseRadius;
        }

        public int hashCode() {
            return (((((((((((Float.floatToIntBits(this.horizontalEllipseRadius) * 31) + Float.floatToIntBits(this.verticalEllipseRadius)) * 31) + Float.floatToIntBits(this.theta)) * 31) + androidx.compose.foundation.a.a(this.isMoreThanHalf)) * 31) + androidx.compose.foundation.a.a(this.isPositiveArc)) * 31) + Float.floatToIntBits(this.arcStartX)) * 31) + Float.floatToIntBits(this.arcStartY);
        }

        public final boolean isMoreThanHalf() {
            return this.isMoreThanHalf;
        }

        public final boolean isPositiveArc() {
            return this.isPositiveArc;
        }

        public String toString() {
            return "ArcTo(horizontalEllipseRadius=" + this.horizontalEllipseRadius + ", verticalEllipseRadius=" + this.verticalEllipseRadius + ", theta=" + this.theta + ", isMoreThanHalf=" + this.isMoreThanHalf + ", isPositiveArc=" + this.isPositiveArc + ", arcStartX=" + this.arcStartX + ", arcStartY=" + this.arcStartY + ')';
        }
    }

    @Immutable
    /* loaded from: classes.dex */
    public static final class Close extends PathNode {
        public static final Close INSTANCE = new Close();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private Close() {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.PathNode.Close.<init>():void");
        }
    }

    @Immutable
    /* loaded from: classes.dex */
    public static final class CurveTo extends PathNode {

        /* renamed from: x1, reason: collision with root package name */
        private final float f13799x1;

        /* renamed from: x2, reason: collision with root package name */
        private final float f13800x2;

        /* renamed from: x3, reason: collision with root package name */
        private final float f13801x3;

        /* renamed from: y1, reason: collision with root package name */
        private final float f13802y1;

        /* renamed from: y2, reason: collision with root package name */
        private final float f13803y2;

        /* renamed from: y3, reason: collision with root package name */
        private final float f13804y3;

        public CurveTo(float f8, float f9, float f10, float f11, float f12, float f13) {
            super(true, false, 2, null);
            this.f13799x1 = f8;
            this.f13802y1 = f9;
            this.f13800x2 = f10;
            this.f13803y2 = f11;
            this.f13801x3 = f12;
            this.f13804y3 = f13;
        }

        public static /* synthetic */ CurveTo copy$default(CurveTo curveTo, float f8, float f9, float f10, float f11, float f12, float f13, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                f8 = curveTo.f13799x1;
            }
            if ((i8 & 2) != 0) {
                f9 = curveTo.f13802y1;
            }
            float f14 = f9;
            if ((i8 & 4) != 0) {
                f10 = curveTo.f13800x2;
            }
            float f15 = f10;
            if ((i8 & 8) != 0) {
                f11 = curveTo.f13803y2;
            }
            float f16 = f11;
            if ((i8 & 16) != 0) {
                f12 = curveTo.f13801x3;
            }
            float f17 = f12;
            if ((i8 & 32) != 0) {
                f13 = curveTo.f13804y3;
            }
            return curveTo.copy(f8, f14, f15, f16, f17, f13);
        }

        public final float component1() {
            return this.f13799x1;
        }

        public final float component2() {
            return this.f13802y1;
        }

        public final float component3() {
            return this.f13800x2;
        }

        public final float component4() {
            return this.f13803y2;
        }

        public final float component5() {
            return this.f13801x3;
        }

        public final float component6() {
            return this.f13804y3;
        }

        public final CurveTo copy(float f8, float f9, float f10, float f11, float f12, float f13) {
            return new CurveTo(f8, f9, f10, f11, f12, f13);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CurveTo)) {
                return false;
            }
            CurveTo curveTo = (CurveTo) obj;
            return Float.compare(this.f13799x1, curveTo.f13799x1) == 0 && Float.compare(this.f13802y1, curveTo.f13802y1) == 0 && Float.compare(this.f13800x2, curveTo.f13800x2) == 0 && Float.compare(this.f13803y2, curveTo.f13803y2) == 0 && Float.compare(this.f13801x3, curveTo.f13801x3) == 0 && Float.compare(this.f13804y3, curveTo.f13804y3) == 0;
        }

        public final float getX1() {
            return this.f13799x1;
        }

        public final float getX2() {
            return this.f13800x2;
        }

        public final float getX3() {
            return this.f13801x3;
        }

        public final float getY1() {
            return this.f13802y1;
        }

        public final float getY2() {
            return this.f13803y2;
        }

        public final float getY3() {
            return this.f13804y3;
        }

        public int hashCode() {
            return (((((((((Float.floatToIntBits(this.f13799x1) * 31) + Float.floatToIntBits(this.f13802y1)) * 31) + Float.floatToIntBits(this.f13800x2)) * 31) + Float.floatToIntBits(this.f13803y2)) * 31) + Float.floatToIntBits(this.f13801x3)) * 31) + Float.floatToIntBits(this.f13804y3);
        }

        public String toString() {
            return "CurveTo(x1=" + this.f13799x1 + ", y1=" + this.f13802y1 + ", x2=" + this.f13800x2 + ", y2=" + this.f13803y2 + ", x3=" + this.f13801x3 + ", y3=" + this.f13804y3 + ')';
        }
    }

    @Immutable
    /* loaded from: classes.dex */
    public static final class HorizontalTo extends PathNode {

        /* renamed from: x, reason: collision with root package name */
        private final float f13805x;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public HorizontalTo(float r4) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.f13805x = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.PathNode.HorizontalTo.<init>(float):void");
        }

        public static /* synthetic */ HorizontalTo copy$default(HorizontalTo horizontalTo, float f8, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                f8 = horizontalTo.f13805x;
            }
            return horizontalTo.copy(f8);
        }

        public final float component1() {
            return this.f13805x;
        }

        public final HorizontalTo copy(float f8) {
            return new HorizontalTo(f8);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HorizontalTo) && Float.compare(this.f13805x, ((HorizontalTo) obj).f13805x) == 0;
        }

        public final float getX() {
            return this.f13805x;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f13805x);
        }

        public String toString() {
            return "HorizontalTo(x=" + this.f13805x + ')';
        }
    }

    @Immutable
    /* loaded from: classes.dex */
    public static final class LineTo extends PathNode {

        /* renamed from: x, reason: collision with root package name */
        private final float f13806x;

        /* renamed from: y, reason: collision with root package name */
        private final float f13807y;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public LineTo(float r4, float r5) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.f13806x = r4
                r3.f13807y = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.PathNode.LineTo.<init>(float, float):void");
        }

        public static /* synthetic */ LineTo copy$default(LineTo lineTo, float f8, float f9, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                f8 = lineTo.f13806x;
            }
            if ((i8 & 2) != 0) {
                f9 = lineTo.f13807y;
            }
            return lineTo.copy(f8, f9);
        }

        public final float component1() {
            return this.f13806x;
        }

        public final float component2() {
            return this.f13807y;
        }

        public final LineTo copy(float f8, float f9) {
            return new LineTo(f8, f9);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LineTo)) {
                return false;
            }
            LineTo lineTo = (LineTo) obj;
            return Float.compare(this.f13806x, lineTo.f13806x) == 0 && Float.compare(this.f13807y, lineTo.f13807y) == 0;
        }

        public final float getX() {
            return this.f13806x;
        }

        public final float getY() {
            return this.f13807y;
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.f13806x) * 31) + Float.floatToIntBits(this.f13807y);
        }

        public String toString() {
            return "LineTo(x=" + this.f13806x + ", y=" + this.f13807y + ')';
        }
    }

    @Immutable
    /* loaded from: classes.dex */
    public static final class MoveTo extends PathNode {

        /* renamed from: x, reason: collision with root package name */
        private final float f13808x;

        /* renamed from: y, reason: collision with root package name */
        private final float f13809y;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public MoveTo(float r4, float r5) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.f13808x = r4
                r3.f13809y = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.PathNode.MoveTo.<init>(float, float):void");
        }

        public static /* synthetic */ MoveTo copy$default(MoveTo moveTo, float f8, float f9, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                f8 = moveTo.f13808x;
            }
            if ((i8 & 2) != 0) {
                f9 = moveTo.f13809y;
            }
            return moveTo.copy(f8, f9);
        }

        public final float component1() {
            return this.f13808x;
        }

        public final float component2() {
            return this.f13809y;
        }

        public final MoveTo copy(float f8, float f9) {
            return new MoveTo(f8, f9);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MoveTo)) {
                return false;
            }
            MoveTo moveTo = (MoveTo) obj;
            return Float.compare(this.f13808x, moveTo.f13808x) == 0 && Float.compare(this.f13809y, moveTo.f13809y) == 0;
        }

        public final float getX() {
            return this.f13808x;
        }

        public final float getY() {
            return this.f13809y;
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.f13808x) * 31) + Float.floatToIntBits(this.f13809y);
        }

        public String toString() {
            return "MoveTo(x=" + this.f13808x + ", y=" + this.f13809y + ')';
        }
    }

    @Immutable
    /* loaded from: classes.dex */
    public static final class QuadTo extends PathNode {

        /* renamed from: x1, reason: collision with root package name */
        private final float f13810x1;

        /* renamed from: x2, reason: collision with root package name */
        private final float f13811x2;

        /* renamed from: y1, reason: collision with root package name */
        private final float f13812y1;

        /* renamed from: y2, reason: collision with root package name */
        private final float f13813y2;

        public QuadTo(float f8, float f9, float f10, float f11) {
            super(false, true, true ? 1 : 0, null);
            this.f13810x1 = f8;
            this.f13812y1 = f9;
            this.f13811x2 = f10;
            this.f13813y2 = f11;
        }

        public static /* synthetic */ QuadTo copy$default(QuadTo quadTo, float f8, float f9, float f10, float f11, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                f8 = quadTo.f13810x1;
            }
            if ((i8 & 2) != 0) {
                f9 = quadTo.f13812y1;
            }
            if ((i8 & 4) != 0) {
                f10 = quadTo.f13811x2;
            }
            if ((i8 & 8) != 0) {
                f11 = quadTo.f13813y2;
            }
            return quadTo.copy(f8, f9, f10, f11);
        }

        public final float component1() {
            return this.f13810x1;
        }

        public final float component2() {
            return this.f13812y1;
        }

        public final float component3() {
            return this.f13811x2;
        }

        public final float component4() {
            return this.f13813y2;
        }

        public final QuadTo copy(float f8, float f9, float f10, float f11) {
            return new QuadTo(f8, f9, f10, f11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QuadTo)) {
                return false;
            }
            QuadTo quadTo = (QuadTo) obj;
            return Float.compare(this.f13810x1, quadTo.f13810x1) == 0 && Float.compare(this.f13812y1, quadTo.f13812y1) == 0 && Float.compare(this.f13811x2, quadTo.f13811x2) == 0 && Float.compare(this.f13813y2, quadTo.f13813y2) == 0;
        }

        public final float getX1() {
            return this.f13810x1;
        }

        public final float getX2() {
            return this.f13811x2;
        }

        public final float getY1() {
            return this.f13812y1;
        }

        public final float getY2() {
            return this.f13813y2;
        }

        public int hashCode() {
            return (((((Float.floatToIntBits(this.f13810x1) * 31) + Float.floatToIntBits(this.f13812y1)) * 31) + Float.floatToIntBits(this.f13811x2)) * 31) + Float.floatToIntBits(this.f13813y2);
        }

        public String toString() {
            return "QuadTo(x1=" + this.f13810x1 + ", y1=" + this.f13812y1 + ", x2=" + this.f13811x2 + ", y2=" + this.f13813y2 + ')';
        }
    }

    @Immutable
    /* loaded from: classes.dex */
    public static final class ReflectiveCurveTo extends PathNode {

        /* renamed from: x1, reason: collision with root package name */
        private final float f13814x1;

        /* renamed from: x2, reason: collision with root package name */
        private final float f13815x2;

        /* renamed from: y1, reason: collision with root package name */
        private final float f13816y1;

        /* renamed from: y2, reason: collision with root package name */
        private final float f13817y2;

        public ReflectiveCurveTo(float f8, float f9, float f10, float f11) {
            super(true, false, 2, null);
            this.f13814x1 = f8;
            this.f13816y1 = f9;
            this.f13815x2 = f10;
            this.f13817y2 = f11;
        }

        public static /* synthetic */ ReflectiveCurveTo copy$default(ReflectiveCurveTo reflectiveCurveTo, float f8, float f9, float f10, float f11, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                f8 = reflectiveCurveTo.f13814x1;
            }
            if ((i8 & 2) != 0) {
                f9 = reflectiveCurveTo.f13816y1;
            }
            if ((i8 & 4) != 0) {
                f10 = reflectiveCurveTo.f13815x2;
            }
            if ((i8 & 8) != 0) {
                f11 = reflectiveCurveTo.f13817y2;
            }
            return reflectiveCurveTo.copy(f8, f9, f10, f11);
        }

        public final float component1() {
            return this.f13814x1;
        }

        public final float component2() {
            return this.f13816y1;
        }

        public final float component3() {
            return this.f13815x2;
        }

        public final float component4() {
            return this.f13817y2;
        }

        public final ReflectiveCurveTo copy(float f8, float f9, float f10, float f11) {
            return new ReflectiveCurveTo(f8, f9, f10, f11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReflectiveCurveTo)) {
                return false;
            }
            ReflectiveCurveTo reflectiveCurveTo = (ReflectiveCurveTo) obj;
            return Float.compare(this.f13814x1, reflectiveCurveTo.f13814x1) == 0 && Float.compare(this.f13816y1, reflectiveCurveTo.f13816y1) == 0 && Float.compare(this.f13815x2, reflectiveCurveTo.f13815x2) == 0 && Float.compare(this.f13817y2, reflectiveCurveTo.f13817y2) == 0;
        }

        public final float getX1() {
            return this.f13814x1;
        }

        public final float getX2() {
            return this.f13815x2;
        }

        public final float getY1() {
            return this.f13816y1;
        }

        public final float getY2() {
            return this.f13817y2;
        }

        public int hashCode() {
            return (((((Float.floatToIntBits(this.f13814x1) * 31) + Float.floatToIntBits(this.f13816y1)) * 31) + Float.floatToIntBits(this.f13815x2)) * 31) + Float.floatToIntBits(this.f13817y2);
        }

        public String toString() {
            return "ReflectiveCurveTo(x1=" + this.f13814x1 + ", y1=" + this.f13816y1 + ", x2=" + this.f13815x2 + ", y2=" + this.f13817y2 + ')';
        }
    }

    @Immutable
    /* loaded from: classes.dex */
    public static final class ReflectiveQuadTo extends PathNode {

        /* renamed from: x, reason: collision with root package name */
        private final float f13818x;

        /* renamed from: y, reason: collision with root package name */
        private final float f13819y;

        public ReflectiveQuadTo(float f8, float f9) {
            super(false, true, true ? 1 : 0, null);
            this.f13818x = f8;
            this.f13819y = f9;
        }

        public static /* synthetic */ ReflectiveQuadTo copy$default(ReflectiveQuadTo reflectiveQuadTo, float f8, float f9, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                f8 = reflectiveQuadTo.f13818x;
            }
            if ((i8 & 2) != 0) {
                f9 = reflectiveQuadTo.f13819y;
            }
            return reflectiveQuadTo.copy(f8, f9);
        }

        public final float component1() {
            return this.f13818x;
        }

        public final float component2() {
            return this.f13819y;
        }

        public final ReflectiveQuadTo copy(float f8, float f9) {
            return new ReflectiveQuadTo(f8, f9);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReflectiveQuadTo)) {
                return false;
            }
            ReflectiveQuadTo reflectiveQuadTo = (ReflectiveQuadTo) obj;
            return Float.compare(this.f13818x, reflectiveQuadTo.f13818x) == 0 && Float.compare(this.f13819y, reflectiveQuadTo.f13819y) == 0;
        }

        public final float getX() {
            return this.f13818x;
        }

        public final float getY() {
            return this.f13819y;
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.f13818x) * 31) + Float.floatToIntBits(this.f13819y);
        }

        public String toString() {
            return "ReflectiveQuadTo(x=" + this.f13818x + ", y=" + this.f13819y + ')';
        }
    }

    @Immutable
    /* loaded from: classes.dex */
    public static final class RelativeArcTo extends PathNode {
        private final float arcStartDx;
        private final float arcStartDy;
        private final float horizontalEllipseRadius;
        private final boolean isMoreThanHalf;
        private final boolean isPositiveArc;
        private final float theta;
        private final float verticalEllipseRadius;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public RelativeArcTo(float r4, float r5, float r6, boolean r7, boolean r8, float r9, float r10) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.horizontalEllipseRadius = r4
                r3.verticalEllipseRadius = r5
                r3.theta = r6
                r3.isMoreThanHalf = r7
                r3.isPositiveArc = r8
                r3.arcStartDx = r9
                r3.arcStartDy = r10
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.PathNode.RelativeArcTo.<init>(float, float, float, boolean, boolean, float, float):void");
        }

        public static /* synthetic */ RelativeArcTo copy$default(RelativeArcTo relativeArcTo, float f8, float f9, float f10, boolean z8, boolean z9, float f11, float f12, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                f8 = relativeArcTo.horizontalEllipseRadius;
            }
            if ((i8 & 2) != 0) {
                f9 = relativeArcTo.verticalEllipseRadius;
            }
            float f13 = f9;
            if ((i8 & 4) != 0) {
                f10 = relativeArcTo.theta;
            }
            float f14 = f10;
            if ((i8 & 8) != 0) {
                z8 = relativeArcTo.isMoreThanHalf;
            }
            boolean z10 = z8;
            if ((i8 & 16) != 0) {
                z9 = relativeArcTo.isPositiveArc;
            }
            boolean z11 = z9;
            if ((i8 & 32) != 0) {
                f11 = relativeArcTo.arcStartDx;
            }
            float f15 = f11;
            if ((i8 & 64) != 0) {
                f12 = relativeArcTo.arcStartDy;
            }
            return relativeArcTo.copy(f8, f13, f14, z10, z11, f15, f12);
        }

        public final float component1() {
            return this.horizontalEllipseRadius;
        }

        public final float component2() {
            return this.verticalEllipseRadius;
        }

        public final float component3() {
            return this.theta;
        }

        public final boolean component4() {
            return this.isMoreThanHalf;
        }

        public final boolean component5() {
            return this.isPositiveArc;
        }

        public final float component6() {
            return this.arcStartDx;
        }

        public final float component7() {
            return this.arcStartDy;
        }

        public final RelativeArcTo copy(float f8, float f9, float f10, boolean z8, boolean z9, float f11, float f12) {
            return new RelativeArcTo(f8, f9, f10, z8, z9, f11, f12);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeArcTo)) {
                return false;
            }
            RelativeArcTo relativeArcTo = (RelativeArcTo) obj;
            return Float.compare(this.horizontalEllipseRadius, relativeArcTo.horizontalEllipseRadius) == 0 && Float.compare(this.verticalEllipseRadius, relativeArcTo.verticalEllipseRadius) == 0 && Float.compare(this.theta, relativeArcTo.theta) == 0 && this.isMoreThanHalf == relativeArcTo.isMoreThanHalf && this.isPositiveArc == relativeArcTo.isPositiveArc && Float.compare(this.arcStartDx, relativeArcTo.arcStartDx) == 0 && Float.compare(this.arcStartDy, relativeArcTo.arcStartDy) == 0;
        }

        public final float getArcStartDx() {
            return this.arcStartDx;
        }

        public final float getArcStartDy() {
            return this.arcStartDy;
        }

        public final float getHorizontalEllipseRadius() {
            return this.horizontalEllipseRadius;
        }

        public final float getTheta() {
            return this.theta;
        }

        public final float getVerticalEllipseRadius() {
            return this.verticalEllipseRadius;
        }

        public int hashCode() {
            return (((((((((((Float.floatToIntBits(this.horizontalEllipseRadius) * 31) + Float.floatToIntBits(this.verticalEllipseRadius)) * 31) + Float.floatToIntBits(this.theta)) * 31) + androidx.compose.foundation.a.a(this.isMoreThanHalf)) * 31) + androidx.compose.foundation.a.a(this.isPositiveArc)) * 31) + Float.floatToIntBits(this.arcStartDx)) * 31) + Float.floatToIntBits(this.arcStartDy);
        }

        public final boolean isMoreThanHalf() {
            return this.isMoreThanHalf;
        }

        public final boolean isPositiveArc() {
            return this.isPositiveArc;
        }

        public String toString() {
            return "RelativeArcTo(horizontalEllipseRadius=" + this.horizontalEllipseRadius + ", verticalEllipseRadius=" + this.verticalEllipseRadius + ", theta=" + this.theta + ", isMoreThanHalf=" + this.isMoreThanHalf + ", isPositiveArc=" + this.isPositiveArc + ", arcStartDx=" + this.arcStartDx + ", arcStartDy=" + this.arcStartDy + ')';
        }
    }

    @Immutable
    /* loaded from: classes.dex */
    public static final class RelativeCurveTo extends PathNode {
        private final float dx1;
        private final float dx2;
        private final float dx3;
        private final float dy1;
        private final float dy2;
        private final float dy3;

        public RelativeCurveTo(float f8, float f9, float f10, float f11, float f12, float f13) {
            super(true, false, 2, null);
            this.dx1 = f8;
            this.dy1 = f9;
            this.dx2 = f10;
            this.dy2 = f11;
            this.dx3 = f12;
            this.dy3 = f13;
        }

        public static /* synthetic */ RelativeCurveTo copy$default(RelativeCurveTo relativeCurveTo, float f8, float f9, float f10, float f11, float f12, float f13, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                f8 = relativeCurveTo.dx1;
            }
            if ((i8 & 2) != 0) {
                f9 = relativeCurveTo.dy1;
            }
            float f14 = f9;
            if ((i8 & 4) != 0) {
                f10 = relativeCurveTo.dx2;
            }
            float f15 = f10;
            if ((i8 & 8) != 0) {
                f11 = relativeCurveTo.dy2;
            }
            float f16 = f11;
            if ((i8 & 16) != 0) {
                f12 = relativeCurveTo.dx3;
            }
            float f17 = f12;
            if ((i8 & 32) != 0) {
                f13 = relativeCurveTo.dy3;
            }
            return relativeCurveTo.copy(f8, f14, f15, f16, f17, f13);
        }

        public final float component1() {
            return this.dx1;
        }

        public final float component2() {
            return this.dy1;
        }

        public final float component3() {
            return this.dx2;
        }

        public final float component4() {
            return this.dy2;
        }

        public final float component5() {
            return this.dx3;
        }

        public final float component6() {
            return this.dy3;
        }

        public final RelativeCurveTo copy(float f8, float f9, float f10, float f11, float f12, float f13) {
            return new RelativeCurveTo(f8, f9, f10, f11, f12, f13);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeCurveTo)) {
                return false;
            }
            RelativeCurveTo relativeCurveTo = (RelativeCurveTo) obj;
            return Float.compare(this.dx1, relativeCurveTo.dx1) == 0 && Float.compare(this.dy1, relativeCurveTo.dy1) == 0 && Float.compare(this.dx2, relativeCurveTo.dx2) == 0 && Float.compare(this.dy2, relativeCurveTo.dy2) == 0 && Float.compare(this.dx3, relativeCurveTo.dx3) == 0 && Float.compare(this.dy3, relativeCurveTo.dy3) == 0;
        }

        public final float getDx1() {
            return this.dx1;
        }

        public final float getDx2() {
            return this.dx2;
        }

        public final float getDx3() {
            return this.dx3;
        }

        public final float getDy1() {
            return this.dy1;
        }

        public final float getDy2() {
            return this.dy2;
        }

        public final float getDy3() {
            return this.dy3;
        }

        public int hashCode() {
            return (((((((((Float.floatToIntBits(this.dx1) * 31) + Float.floatToIntBits(this.dy1)) * 31) + Float.floatToIntBits(this.dx2)) * 31) + Float.floatToIntBits(this.dy2)) * 31) + Float.floatToIntBits(this.dx3)) * 31) + Float.floatToIntBits(this.dy3);
        }

        public String toString() {
            return "RelativeCurveTo(dx1=" + this.dx1 + ", dy1=" + this.dy1 + ", dx2=" + this.dx2 + ", dy2=" + this.dy2 + ", dx3=" + this.dx3 + ", dy3=" + this.dy3 + ')';
        }
    }

    @Immutable
    /* loaded from: classes.dex */
    public static final class RelativeHorizontalTo extends PathNode {
        private final float dx;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public RelativeHorizontalTo(float r4) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.dx = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.PathNode.RelativeHorizontalTo.<init>(float):void");
        }

        public static /* synthetic */ RelativeHorizontalTo copy$default(RelativeHorizontalTo relativeHorizontalTo, float f8, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                f8 = relativeHorizontalTo.dx;
            }
            return relativeHorizontalTo.copy(f8);
        }

        public final float component1() {
            return this.dx;
        }

        public final RelativeHorizontalTo copy(float f8) {
            return new RelativeHorizontalTo(f8);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RelativeHorizontalTo) && Float.compare(this.dx, ((RelativeHorizontalTo) obj).dx) == 0;
        }

        public final float getDx() {
            return this.dx;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.dx);
        }

        public String toString() {
            return "RelativeHorizontalTo(dx=" + this.dx + ')';
        }
    }

    @Immutable
    /* loaded from: classes.dex */
    public static final class RelativeLineTo extends PathNode {
        private final float dx;
        private final float dy;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public RelativeLineTo(float r4, float r5) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.dx = r4
                r3.dy = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.PathNode.RelativeLineTo.<init>(float, float):void");
        }

        public static /* synthetic */ RelativeLineTo copy$default(RelativeLineTo relativeLineTo, float f8, float f9, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                f8 = relativeLineTo.dx;
            }
            if ((i8 & 2) != 0) {
                f9 = relativeLineTo.dy;
            }
            return relativeLineTo.copy(f8, f9);
        }

        public final float component1() {
            return this.dx;
        }

        public final float component2() {
            return this.dy;
        }

        public final RelativeLineTo copy(float f8, float f9) {
            return new RelativeLineTo(f8, f9);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeLineTo)) {
                return false;
            }
            RelativeLineTo relativeLineTo = (RelativeLineTo) obj;
            return Float.compare(this.dx, relativeLineTo.dx) == 0 && Float.compare(this.dy, relativeLineTo.dy) == 0;
        }

        public final float getDx() {
            return this.dx;
        }

        public final float getDy() {
            return this.dy;
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.dx) * 31) + Float.floatToIntBits(this.dy);
        }

        public String toString() {
            return "RelativeLineTo(dx=" + this.dx + ", dy=" + this.dy + ')';
        }
    }

    @Immutable
    /* loaded from: classes.dex */
    public static final class RelativeMoveTo extends PathNode {
        private final float dx;
        private final float dy;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public RelativeMoveTo(float r4, float r5) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.dx = r4
                r3.dy = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.PathNode.RelativeMoveTo.<init>(float, float):void");
        }

        public static /* synthetic */ RelativeMoveTo copy$default(RelativeMoveTo relativeMoveTo, float f8, float f9, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                f8 = relativeMoveTo.dx;
            }
            if ((i8 & 2) != 0) {
                f9 = relativeMoveTo.dy;
            }
            return relativeMoveTo.copy(f8, f9);
        }

        public final float component1() {
            return this.dx;
        }

        public final float component2() {
            return this.dy;
        }

        public final RelativeMoveTo copy(float f8, float f9) {
            return new RelativeMoveTo(f8, f9);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeMoveTo)) {
                return false;
            }
            RelativeMoveTo relativeMoveTo = (RelativeMoveTo) obj;
            return Float.compare(this.dx, relativeMoveTo.dx) == 0 && Float.compare(this.dy, relativeMoveTo.dy) == 0;
        }

        public final float getDx() {
            return this.dx;
        }

        public final float getDy() {
            return this.dy;
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.dx) * 31) + Float.floatToIntBits(this.dy);
        }

        public String toString() {
            return "RelativeMoveTo(dx=" + this.dx + ", dy=" + this.dy + ')';
        }
    }

    @Immutable
    /* loaded from: classes.dex */
    public static final class RelativeQuadTo extends PathNode {
        private final float dx1;
        private final float dx2;
        private final float dy1;
        private final float dy2;

        public RelativeQuadTo(float f8, float f9, float f10, float f11) {
            super(false, true, true ? 1 : 0, null);
            this.dx1 = f8;
            this.dy1 = f9;
            this.dx2 = f10;
            this.dy2 = f11;
        }

        public static /* synthetic */ RelativeQuadTo copy$default(RelativeQuadTo relativeQuadTo, float f8, float f9, float f10, float f11, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                f8 = relativeQuadTo.dx1;
            }
            if ((i8 & 2) != 0) {
                f9 = relativeQuadTo.dy1;
            }
            if ((i8 & 4) != 0) {
                f10 = relativeQuadTo.dx2;
            }
            if ((i8 & 8) != 0) {
                f11 = relativeQuadTo.dy2;
            }
            return relativeQuadTo.copy(f8, f9, f10, f11);
        }

        public final float component1() {
            return this.dx1;
        }

        public final float component2() {
            return this.dy1;
        }

        public final float component3() {
            return this.dx2;
        }

        public final float component4() {
            return this.dy2;
        }

        public final RelativeQuadTo copy(float f8, float f9, float f10, float f11) {
            return new RelativeQuadTo(f8, f9, f10, f11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeQuadTo)) {
                return false;
            }
            RelativeQuadTo relativeQuadTo = (RelativeQuadTo) obj;
            return Float.compare(this.dx1, relativeQuadTo.dx1) == 0 && Float.compare(this.dy1, relativeQuadTo.dy1) == 0 && Float.compare(this.dx2, relativeQuadTo.dx2) == 0 && Float.compare(this.dy2, relativeQuadTo.dy2) == 0;
        }

        public final float getDx1() {
            return this.dx1;
        }

        public final float getDx2() {
            return this.dx2;
        }

        public final float getDy1() {
            return this.dy1;
        }

        public final float getDy2() {
            return this.dy2;
        }

        public int hashCode() {
            return (((((Float.floatToIntBits(this.dx1) * 31) + Float.floatToIntBits(this.dy1)) * 31) + Float.floatToIntBits(this.dx2)) * 31) + Float.floatToIntBits(this.dy2);
        }

        public String toString() {
            return "RelativeQuadTo(dx1=" + this.dx1 + ", dy1=" + this.dy1 + ", dx2=" + this.dx2 + ", dy2=" + this.dy2 + ')';
        }
    }

    @Immutable
    /* loaded from: classes.dex */
    public static final class RelativeReflectiveCurveTo extends PathNode {
        private final float dx1;
        private final float dx2;
        private final float dy1;
        private final float dy2;

        public RelativeReflectiveCurveTo(float f8, float f9, float f10, float f11) {
            super(true, false, 2, null);
            this.dx1 = f8;
            this.dy1 = f9;
            this.dx2 = f10;
            this.dy2 = f11;
        }

        public static /* synthetic */ RelativeReflectiveCurveTo copy$default(RelativeReflectiveCurveTo relativeReflectiveCurveTo, float f8, float f9, float f10, float f11, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                f8 = relativeReflectiveCurveTo.dx1;
            }
            if ((i8 & 2) != 0) {
                f9 = relativeReflectiveCurveTo.dy1;
            }
            if ((i8 & 4) != 0) {
                f10 = relativeReflectiveCurveTo.dx2;
            }
            if ((i8 & 8) != 0) {
                f11 = relativeReflectiveCurveTo.dy2;
            }
            return relativeReflectiveCurveTo.copy(f8, f9, f10, f11);
        }

        public final float component1() {
            return this.dx1;
        }

        public final float component2() {
            return this.dy1;
        }

        public final float component3() {
            return this.dx2;
        }

        public final float component4() {
            return this.dy2;
        }

        public final RelativeReflectiveCurveTo copy(float f8, float f9, float f10, float f11) {
            return new RelativeReflectiveCurveTo(f8, f9, f10, f11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeReflectiveCurveTo)) {
                return false;
            }
            RelativeReflectiveCurveTo relativeReflectiveCurveTo = (RelativeReflectiveCurveTo) obj;
            return Float.compare(this.dx1, relativeReflectiveCurveTo.dx1) == 0 && Float.compare(this.dy1, relativeReflectiveCurveTo.dy1) == 0 && Float.compare(this.dx2, relativeReflectiveCurveTo.dx2) == 0 && Float.compare(this.dy2, relativeReflectiveCurveTo.dy2) == 0;
        }

        public final float getDx1() {
            return this.dx1;
        }

        public final float getDx2() {
            return this.dx2;
        }

        public final float getDy1() {
            return this.dy1;
        }

        public final float getDy2() {
            return this.dy2;
        }

        public int hashCode() {
            return (((((Float.floatToIntBits(this.dx1) * 31) + Float.floatToIntBits(this.dy1)) * 31) + Float.floatToIntBits(this.dx2)) * 31) + Float.floatToIntBits(this.dy2);
        }

        public String toString() {
            return "RelativeReflectiveCurveTo(dx1=" + this.dx1 + ", dy1=" + this.dy1 + ", dx2=" + this.dx2 + ", dy2=" + this.dy2 + ')';
        }
    }

    @Immutable
    /* loaded from: classes.dex */
    public static final class RelativeReflectiveQuadTo extends PathNode {
        private final float dx;
        private final float dy;

        public RelativeReflectiveQuadTo(float f8, float f9) {
            super(false, true, true ? 1 : 0, null);
            this.dx = f8;
            this.dy = f9;
        }

        public static /* synthetic */ RelativeReflectiveQuadTo copy$default(RelativeReflectiveQuadTo relativeReflectiveQuadTo, float f8, float f9, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                f8 = relativeReflectiveQuadTo.dx;
            }
            if ((i8 & 2) != 0) {
                f9 = relativeReflectiveQuadTo.dy;
            }
            return relativeReflectiveQuadTo.copy(f8, f9);
        }

        public final float component1() {
            return this.dx;
        }

        public final float component2() {
            return this.dy;
        }

        public final RelativeReflectiveQuadTo copy(float f8, float f9) {
            return new RelativeReflectiveQuadTo(f8, f9);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeReflectiveQuadTo)) {
                return false;
            }
            RelativeReflectiveQuadTo relativeReflectiveQuadTo = (RelativeReflectiveQuadTo) obj;
            return Float.compare(this.dx, relativeReflectiveQuadTo.dx) == 0 && Float.compare(this.dy, relativeReflectiveQuadTo.dy) == 0;
        }

        public final float getDx() {
            return this.dx;
        }

        public final float getDy() {
            return this.dy;
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.dx) * 31) + Float.floatToIntBits(this.dy);
        }

        public String toString() {
            return "RelativeReflectiveQuadTo(dx=" + this.dx + ", dy=" + this.dy + ')';
        }
    }

    @Immutable
    /* loaded from: classes.dex */
    public static final class RelativeVerticalTo extends PathNode {
        private final float dy;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public RelativeVerticalTo(float r4) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.dy = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.PathNode.RelativeVerticalTo.<init>(float):void");
        }

        public static /* synthetic */ RelativeVerticalTo copy$default(RelativeVerticalTo relativeVerticalTo, float f8, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                f8 = relativeVerticalTo.dy;
            }
            return relativeVerticalTo.copy(f8);
        }

        public final float component1() {
            return this.dy;
        }

        public final RelativeVerticalTo copy(float f8) {
            return new RelativeVerticalTo(f8);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RelativeVerticalTo) && Float.compare(this.dy, ((RelativeVerticalTo) obj).dy) == 0;
        }

        public final float getDy() {
            return this.dy;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.dy);
        }

        public String toString() {
            return "RelativeVerticalTo(dy=" + this.dy + ')';
        }
    }

    @Immutable
    /* loaded from: classes.dex */
    public static final class VerticalTo extends PathNode {

        /* renamed from: y, reason: collision with root package name */
        private final float f13820y;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public VerticalTo(float r4) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.f13820y = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.PathNode.VerticalTo.<init>(float):void");
        }

        public static /* synthetic */ VerticalTo copy$default(VerticalTo verticalTo, float f8, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                f8 = verticalTo.f13820y;
            }
            return verticalTo.copy(f8);
        }

        public final float component1() {
            return this.f13820y;
        }

        public final VerticalTo copy(float f8) {
            return new VerticalTo(f8);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VerticalTo) && Float.compare(this.f13820y, ((VerticalTo) obj).f13820y) == 0;
        }

        public final float getY() {
            return this.f13820y;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f13820y);
        }

        public String toString() {
            return "VerticalTo(y=" + this.f13820y + ')';
        }
    }

    public /* synthetic */ PathNode(boolean z8, boolean z9, AbstractC3151p abstractC3151p) {
        this(z8, z9);
    }

    public final boolean isCurve() {
        return this.isCurve;
    }

    public final boolean isQuad() {
        return this.isQuad;
    }

    private PathNode(boolean z8, boolean z9) {
        this.isCurve = z8;
        this.isQuad = z9;
    }

    public /* synthetic */ PathNode(boolean z8, boolean z9, int i8, AbstractC3151p abstractC3151p) {
        this((i8 & 1) != 0 ? false : z8, (i8 & 2) != 0 ? false : z9, null);
    }
}
