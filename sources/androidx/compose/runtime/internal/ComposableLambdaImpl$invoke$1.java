package androidx.compose.runtime.internal;

import L5.I;
import X5.n;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ComposableLambdaImpl$invoke$1 extends AbstractC3160z implements n {
    final /* synthetic */ int $changed;
    final /* synthetic */ Object $p1;
    final /* synthetic */ ComposableLambdaImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableLambdaImpl$invoke$1(ComposableLambdaImpl composableLambdaImpl, Object obj, int i8) {
        super(2);
        this.this$0 = composableLambdaImpl;
        this.$p1 = obj;
        this.$changed = i8;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f6474a;
    }

    public final void invoke(Composer composer, int i8) {
        this.this$0.invoke(this.$p1, composer, RecomposeScopeImplKt.updateChangedFlags(this.$changed) | 1);
    }
}
