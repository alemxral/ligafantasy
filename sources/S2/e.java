package S2;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.jvm.internal.AbstractC3151p;

/* loaded from: classes4.dex */
public abstract class e {

    /* loaded from: classes4.dex */
    public static final class a extends e {

        /* renamed from: a, reason: collision with root package name */
        public static final a f8972a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final RoundedCornerShape f8973b = RoundedCornerShapeKt.m852RoundedCornerShape0680j_4(Dp.m5178constructorimpl(8));

        /* renamed from: c, reason: collision with root package name */
        private static final Modifier f8974c;

        /* renamed from: d, reason: collision with root package name */
        private static final Modifier f8975d;

        /* renamed from: e, reason: collision with root package name */
        private static final TextStyle f8976e;

        static {
            Modifier.Companion companion = Modifier.Companion;
            float f8 = 12;
            f8974c = SizeKt.m647size3ABfNKs(PaddingKt.m601paddingVpY3zN4(companion, Dp.m5178constructorimpl(10), Dp.m5178constructorimpl(f8)), Dp.m5178constructorimpl(20));
            f8975d = PaddingKt.m604paddingqDBjuR0$default(companion, 0.0f, Dp.m5178constructorimpl(f8), Dp.m5178constructorimpl(f8), Dp.m5178constructorimpl(f8), 1, null);
            f8976e = new TextStyle(0L, TextUnitKt.getSp(14), FontWeight.Companion.getNormal(), (FontStyle) null, (FontSynthesis) null, FontFamily.Companion.getDefault(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(20), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646105, (AbstractC3151p) null);
        }

        private a() {
            super(null);
        }

        @Override // S2.e
        public Modifier a() {
            return f8974c;
        }

        @Override // S2.e
        public Modifier c() {
            return f8975d;
        }

        @Override // S2.e
        public TextStyle d() {
            return f8976e;
        }

        @Override // S2.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public RoundedCornerShape b() {
            return f8973b;
        }
    }

    private e() {
    }

    public abstract Modifier a();

    public abstract Shape b();

    public abstract Modifier c();

    public abstract TextStyle d();

    public /* synthetic */ e(AbstractC3151p abstractC3151p) {
        this();
    }
}
