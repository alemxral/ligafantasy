package androidx.compose.material.internal;

import L5.I;
import X5.n;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.AbstractC3160z;

/* renamed from: androidx.compose.material.internal.ComposableSingletons$ExposedDropdownMenuPopupKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes.dex */
final class ComposableSingletons$ExposedDropdownMenuPopupKt$lambda1$1 extends AbstractC3160z implements n {
    public static final ComposableSingletons$ExposedDropdownMenuPopupKt$lambda1$1 INSTANCE = new ComposableSingletons$ExposedDropdownMenuPopupKt$lambda1$1();

    ComposableSingletons$ExposedDropdownMenuPopupKt$lambda1$1() {
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
            ComposerKt.traceEventStart(-1627646060, i8, -1, "androidx.compose.material.internal.ComposableSingletons$ExposedDropdownMenuPopupKt.lambda-1.<anonymous> (ExposedDropdownMenuPopup.kt:285)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
