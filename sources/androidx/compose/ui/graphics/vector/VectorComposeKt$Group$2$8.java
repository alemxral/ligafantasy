package androidx.compose.ui.graphics.vector;

import L5.I;
import X5.n;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class VectorComposeKt$Group$2$8 extends AbstractC3160z implements n {
    public static final VectorComposeKt$Group$2$8 INSTANCE = new VectorComposeKt$Group$2$8();

    VectorComposeKt$Group$2$8() {
        super(2);
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((GroupComponent) obj, ((Number) obj2).floatValue());
        return I.f6474a;
    }

    public final void invoke(GroupComponent groupComponent, float f8) {
        groupComponent.setTranslationY(f8);
    }
}
