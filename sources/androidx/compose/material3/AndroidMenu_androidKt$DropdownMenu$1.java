package androidx.compose.material3;

import L5.I;
import X5.n;
import X5.o;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.TransformOrigin;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class AndroidMenu_androidKt$DropdownMenu$1 extends AbstractC3160z implements n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ o $content;
    final /* synthetic */ MutableTransitionState<Boolean> $expandedStates;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ MutableState<TransformOrigin> $transformOriginState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidMenu_androidKt$DropdownMenu$1(MutableTransitionState<Boolean> mutableTransitionState, MutableState<TransformOrigin> mutableState, Modifier modifier, o oVar, int i8) {
        super(2);
        this.$expandedStates = mutableTransitionState;
        this.$transformOriginState = mutableState;
        this.$modifier = modifier;
        this.$content = oVar;
        this.$$dirty = i8;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f6474a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i8) {
        if ((i8 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1192563503, i8, -1, "androidx.compose.material3.DropdownMenu.<anonymous> (AndroidMenu.android.kt:98)");
        }
        MutableTransitionState<Boolean> mutableTransitionState = this.$expandedStates;
        MutableState<TransformOrigin> mutableState = this.$transformOriginState;
        Modifier modifier = this.$modifier;
        o oVar = this.$content;
        int i9 = MutableTransitionState.$stable | 48;
        int i10 = this.$$dirty;
        MenuKt.DropdownMenuContent(mutableTransitionState, mutableState, modifier, oVar, composer, i9 | (i10 & 896) | ((i10 >> 6) & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
