package androidx.compose.material;

import L5.I;
import X5.n;
import X5.o;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.ScrollState;
import androidx.compose.material.ExposedDropdownMenuBoxScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.TransformOrigin;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1 extends AbstractC3160z implements n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ o $content;
    final /* synthetic */ MutableTransitionState<Boolean> $expandedStates;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ ScrollState $scrollState;
    final /* synthetic */ MutableState<TransformOrigin> $transformOriginState;
    final /* synthetic */ ExposedDropdownMenuBoxScope this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1(MutableTransitionState<Boolean> mutableTransitionState, MutableState<TransformOrigin> mutableState, ScrollState scrollState, ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, Modifier modifier, o oVar, int i8) {
        super(2);
        this.$expandedStates = mutableTransitionState;
        this.$transformOriginState = mutableState;
        this.$scrollState = scrollState;
        this.this$0 = exposedDropdownMenuBoxScope;
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
            ComposerKt.traceEventStart(-1167205969, i8, -1, "androidx.compose.material.ExposedDropdownMenuBoxScope.ExposedDropdownMenu.<anonymous> (ExposedDropdownMenu.kt:264)");
        }
        MutableTransitionState<Boolean> mutableTransitionState = this.$expandedStates;
        MutableState<TransformOrigin> mutableState = this.$transformOriginState;
        ScrollState scrollState = this.$scrollState;
        Modifier c8 = ExposedDropdownMenuBoxScope.CC.c(this.this$0, this.$modifier, false, 1, null);
        o oVar = this.$content;
        int i9 = MutableTransitionState.$stable | 48;
        int i10 = this.$$dirty;
        MenuKt.DropdownMenuContent(mutableTransitionState, mutableState, scrollState, c8, oVar, composer, i9 | ((i10 >> 3) & 896) | (i10 & 57344), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
