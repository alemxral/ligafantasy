package androidx.compose.material;

import L5.I;
import X5.o;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* renamed from: androidx.compose.material.ComposableSingletons$ScaffoldKt$lambda-3$1, reason: invalid class name */
/* loaded from: classes.dex */
final class ComposableSingletons$ScaffoldKt$lambda3$1 extends AbstractC3160z implements o {
    public static final ComposableSingletons$ScaffoldKt$lambda3$1 INSTANCE = new ComposableSingletons$ScaffoldKt$lambda3$1();

    ComposableSingletons$ScaffoldKt$lambda3$1() {
        super(3);
    }

    @Override // X5.o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((SnackbarHostState) obj, (Composer) obj2, ((Number) obj3).intValue());
        return I.f6474a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(SnackbarHostState it, Composer composer, int i8) {
        AbstractC3159y.i(it, "it");
        if ((i8 & 14) == 0) {
            i8 |= composer.changed(it) ? 4 : 2;
        }
        if ((i8 & 91) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-147687984, i8, -1, "androidx.compose.material.ComposableSingletons$ScaffoldKt.lambda-3.<anonymous> (Scaffold.kt:163)");
        }
        SnackbarHostKt.SnackbarHost(it, null, null, composer, i8 & 14, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
