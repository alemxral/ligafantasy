package androidx.compose.material3;

import L5.I;
import L5.t;
import P5.d;
import Q5.b;
import X5.n;
import androidx.compose.ui.platform.AccessibilityManager;
import i6.M;
import i6.X;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;

@f(c = "androidx.compose.material3.SnackbarHostKt$SnackbarHost$1", f = "SnackbarHost.kt", l = {232}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class SnackbarHostKt$SnackbarHost$1 extends l implements n {
    final /* synthetic */ AccessibilityManager $accessibilityManager;
    final /* synthetic */ SnackbarData $currentSnackbarData;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarHostKt$SnackbarHost$1(SnackbarData snackbarData, AccessibilityManager accessibilityManager, d dVar) {
        super(2, dVar);
        this.$currentSnackbarData = snackbarData;
        this.$accessibilityManager = accessibilityManager;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new SnackbarHostKt$SnackbarHost$1(this.$currentSnackbarData, this.$accessibilityManager, dVar);
    }

    @Override // X5.n
    public final Object invoke(M m8, d dVar) {
        return ((SnackbarHostKt$SnackbarHost$1) create(m8, dVar)).invokeSuspend(I.f6474a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        boolean z8;
        Object e8 = b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            SnackbarData snackbarData = this.$currentSnackbarData;
            if (snackbarData != null) {
                SnackbarDuration duration = snackbarData.getVisuals().getDuration();
                if (this.$currentSnackbarData.getVisuals().getActionLabel() != null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                long millis = SnackbarHostKt.toMillis(duration, z8, this.$accessibilityManager);
                this.label = 1;
                if (X.b(millis, this) == e8) {
                    return e8;
                }
            }
            return I.f6474a;
        }
        this.$currentSnackbarData.dismiss();
        return I.f6474a;
    }
}
