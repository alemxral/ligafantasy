package androidx.compose.ui.graphics.vector;

import L5.I;
import X5.n;
import androidx.compose.ui.graphics.Brush;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class VectorComposeKt$Path$2$4 extends AbstractC3160z implements n {
    public static final VectorComposeKt$Path$2$4 INSTANCE = new VectorComposeKt$Path$2$4();

    VectorComposeKt$Path$2$4() {
        super(2);
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((PathComponent) obj, (Brush) obj2);
        return I.f6474a;
    }

    public final void invoke(PathComponent pathComponent, Brush brush) {
        pathComponent.setFill(brush);
    }
}
