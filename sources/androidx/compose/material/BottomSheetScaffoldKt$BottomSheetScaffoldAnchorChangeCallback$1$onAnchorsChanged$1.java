package androidx.compose.material;

import L5.I;
import L5.t;
import P5.d;
import X5.n;
import i6.M;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;

@f(c = "androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldAnchorChangeCallback$1$onAnchorsChanged$1", f = "BottomSheetScaffold.kt", l = {737}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class BottomSheetScaffoldKt$BottomSheetScaffoldAnchorChangeCallback$1$onAnchorsChanged$1 extends l implements n {
    final /* synthetic */ BottomSheetValue $newTarget;
    final /* synthetic */ BottomSheetState $state;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$BottomSheetScaffoldAnchorChangeCallback$1$onAnchorsChanged$1(BottomSheetState bottomSheetState, BottomSheetValue bottomSheetValue, d dVar) {
        super(2, dVar);
        this.$state = bottomSheetState;
        this.$newTarget = bottomSheetValue;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new BottomSheetScaffoldKt$BottomSheetScaffoldAnchorChangeCallback$1$onAnchorsChanged$1(this.$state, this.$newTarget, dVar);
    }

    @Override // X5.n
    public final Object invoke(M m8, d dVar) {
        return ((BottomSheetScaffoldKt$BottomSheetScaffoldAnchorChangeCallback$1$onAnchorsChanged$1) create(m8, dVar)).invokeSuspend(I.f6474a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e8 = Q5.b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            BottomSheetState bottomSheetState = this.$state;
            BottomSheetValue bottomSheetValue = this.$newTarget;
            float lastVelocity$material_release = bottomSheetState.getLastVelocity$material_release();
            this.label = 1;
            if (bottomSheetState.animateTo$material_release(bottomSheetValue, lastVelocity$material_release, this) == e8) {
                return e8;
            }
        }
        return I.f6474a;
    }
}
