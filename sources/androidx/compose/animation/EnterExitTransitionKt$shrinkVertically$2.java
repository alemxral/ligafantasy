package androidx.compose.animation;

import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class EnterExitTransitionKt$shrinkVertically$2 extends AbstractC3160z implements Function1 {
    final /* synthetic */ Function1 $targetHeight;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$shrinkVertically$2(Function1 function1) {
        super(1);
        this.$targetHeight = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return IntSize.m5336boximpl(m172invokemzRDjE0(((IntSize) obj).m5348unboximpl()));
    }

    /* renamed from: invoke-mzRDjE0, reason: not valid java name */
    public final long m172invokemzRDjE0(long j8) {
        return IntSizeKt.IntSize(IntSize.m5344getWidthimpl(j8), ((Number) this.$targetHeight.invoke(Integer.valueOf(IntSize.m5343getHeightimpl(j8)))).intValue());
    }
}
