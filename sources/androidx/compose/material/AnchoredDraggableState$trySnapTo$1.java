package androidx.compose.material;

import L5.I;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AnchoredDraggableState$trySnapTo$1 extends AbstractC3160z implements Function0 {
    final /* synthetic */ T $targetValue;
    final /* synthetic */ AnchoredDraggableState<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableState$trySnapTo$1(AnchoredDraggableState<T> anchoredDraggableState, T t8) {
        super(0);
        this.this$0 = anchoredDraggableState;
        this.$targetValue = t8;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m1097invoke();
        return I.f6474a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m1097invoke() {
        AnchoredDragScope anchoredDragScope;
        anchoredDragScope = ((AnchoredDraggableState) this.this$0).anchoredDragScope;
        AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
        Object obj = this.$targetValue;
        Float f8 = (Float) anchoredDraggableState.getAnchors$material_release().get(obj);
        if (f8 != null) {
            a.a(anchoredDragScope, f8.floatValue(), 0.0f, 2, null);
            anchoredDraggableState.setAnimationTarget(null);
        }
        anchoredDraggableState.setCurrentValue(obj);
    }
}
