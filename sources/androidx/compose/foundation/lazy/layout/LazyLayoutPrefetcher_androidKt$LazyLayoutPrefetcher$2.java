package androidx.compose.foundation.lazy.layout;

import L5.I;
import X5.n;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LazyLayoutPrefetcher_androidKt$LazyLayoutPrefetcher$2 extends AbstractC3160z implements n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ LazyLayoutItemContentFactory $itemContentFactory;
    final /* synthetic */ LazyLayoutPrefetchState $prefetchState;
    final /* synthetic */ SubcomposeLayoutState $subcomposeLayoutState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutPrefetcher_androidKt$LazyLayoutPrefetcher$2(LazyLayoutPrefetchState lazyLayoutPrefetchState, LazyLayoutItemContentFactory lazyLayoutItemContentFactory, SubcomposeLayoutState subcomposeLayoutState, int i8) {
        super(2);
        this.$prefetchState = lazyLayoutPrefetchState;
        this.$itemContentFactory = lazyLayoutItemContentFactory;
        this.$subcomposeLayoutState = subcomposeLayoutState;
        this.$$changed = i8;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f6474a;
    }

    public final void invoke(Composer composer, int i8) {
        LazyLayoutPrefetcher_androidKt.LazyLayoutPrefetcher(this.$prefetchState, this.$itemContentFactory, this.$subcomposeLayoutState, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
