package androidx.compose.material;

import L5.I;
import X5.n;
import X5.o;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class NavigationRailKt$NavigationRailTransition$1 extends AbstractC3160z implements n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ State<Float> $animationProgress$delegate;
    final /* synthetic */ o $content;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationRailKt$NavigationRailTransition$1(o oVar, int i8, State<Float> state) {
        super(2);
        this.$content = oVar;
        this.$$dirty = i8;
        this.$animationProgress$delegate = state;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f6474a;
    }

    @Composable
    public final void invoke(Composer composer, int i8) {
        float NavigationRailTransition_Klgx_Pg$lambda$3;
        if ((i8 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1688205042, i8, -1, "androidx.compose.material.NavigationRailTransition.<anonymous> (NavigationRail.kt:242)");
        }
        o oVar = this.$content;
        NavigationRailTransition_Klgx_Pg$lambda$3 = NavigationRailKt.NavigationRailTransition_Klgx_Pg$lambda$3(this.$animationProgress$delegate);
        oVar.invoke(Float.valueOf(NavigationRailTransition_Klgx_Pg$lambda$3), composer, Integer.valueOf((this.$$dirty >> 6) & 112));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
