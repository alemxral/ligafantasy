package androidx.compose.ui.layout;

import L5.I;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.AbstractC3160z;

/* renamed from: androidx.compose.ui.layout.ComposableSingletons$SubcomposeLayoutKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes.dex */
final class ComposableSingletons$SubcomposeLayoutKt$lambda1$1 extends AbstractC3160z implements X5.n {
    public static final ComposableSingletons$SubcomposeLayoutKt$lambda1$1 INSTANCE = new ComposableSingletons$SubcomposeLayoutKt$lambda1$1();

    ComposableSingletons$SubcomposeLayoutKt$lambda1$1() {
        super(2);
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f6474a;
    }

    @Composable
    public final void invoke(Composer composer, int i8) {
        if ((i8 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1741544742, i8, -1, "androidx.compose.ui.layout.ComposableSingletons$SubcomposeLayoutKt.lambda-1.<anonymous> (SubcomposeLayout.kt:456)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
