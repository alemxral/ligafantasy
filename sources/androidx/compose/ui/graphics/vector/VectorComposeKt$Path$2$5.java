package androidx.compose.ui.graphics.vector;

import L5.I;
import X5.n;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class VectorComposeKt$Path$2$5 extends AbstractC3160z implements n {
    public static final VectorComposeKt$Path$2$5 INSTANCE = new VectorComposeKt$Path$2$5();

    VectorComposeKt$Path$2$5() {
        super(2);
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((PathComponent) obj, ((Number) obj2).floatValue());
        return I.f6474a;
    }

    public final void invoke(PathComponent pathComponent, float f8) {
        pathComponent.setFillAlpha(f8);
    }
}
