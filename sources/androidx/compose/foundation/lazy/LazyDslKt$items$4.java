package androidx.compose.foundation.lazy;

import L5.I;
import X5.p;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
public final class LazyDslKt$items$4 extends AbstractC3160z implements p {
    final /* synthetic */ p $itemContent;
    final /* synthetic */ List<T> $items;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyDslKt$items$4(p pVar, List<? extends T> list) {
        super(4);
        this.$itemContent = pVar;
        this.$items = list;
    }

    @Override // X5.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
        return I.f6474a;
    }

    @Composable
    public final void invoke(LazyItemScope items, int i8, Composer composer, int i9) {
        int i10;
        AbstractC3159y.i(items, "$this$items");
        if ((i9 & 14) == 0) {
            i10 = (composer.changed(items) ? 4 : 2) | i9;
        } else {
            i10 = i9;
        }
        if ((i9 & 112) == 0) {
            i10 |= composer.changed(i8) ? 32 : 16;
        }
        if ((i10 & 731) == 146 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-632812321, i10, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:144)");
        }
        this.$itemContent.invoke(items, this.$items.get(i8), composer, Integer.valueOf(i10 & 14));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
