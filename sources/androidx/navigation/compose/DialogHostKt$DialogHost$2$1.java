package androidx.navigation.compose;

import L5.I;
import L5.t;
import P5.d;
import Q5.b;
import X5.n;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.navigation.NavBackStackEntry;
import i6.M;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.navigation.compose.DialogHostKt$DialogHost$2$1", f = "DialogHost.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class DialogHostKt$DialogHost$2$1 extends l implements n {
    final /* synthetic */ DialogNavigator $dialogNavigator;
    final /* synthetic */ SnapshotStateList<NavBackStackEntry> $dialogsToDispose;
    final /* synthetic */ State<Set<NavBackStackEntry>> $transitionInProgress$delegate;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DialogHostKt$DialogHost$2$1(State<? extends Set<NavBackStackEntry>> state, DialogNavigator dialogNavigator, SnapshotStateList<NavBackStackEntry> snapshotStateList, d dVar) {
        super(2, dVar);
        this.$transitionInProgress$delegate = state;
        this.$dialogNavigator = dialogNavigator;
        this.$dialogsToDispose = snapshotStateList;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new DialogHostKt$DialogHost$2$1(this.$transitionInProgress$delegate, this.$dialogNavigator, this.$dialogsToDispose, dVar);
    }

    @Override // X5.n
    public final Object invoke(M m8, d dVar) {
        return ((DialogHostKt$DialogHost$2$1) create(m8, dVar)).invokeSuspend(I.f6474a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Set<NavBackStackEntry> DialogHost$lambda$1;
        b.e();
        if (this.label == 0) {
            t.b(obj);
            DialogHost$lambda$1 = DialogHostKt.DialogHost$lambda$1(this.$transitionInProgress$delegate);
            DialogNavigator dialogNavigator = this.$dialogNavigator;
            SnapshotStateList<NavBackStackEntry> snapshotStateList = this.$dialogsToDispose;
            for (NavBackStackEntry navBackStackEntry : DialogHost$lambda$1) {
                if (!((List) dialogNavigator.getBackStack$navigation_compose_release().getValue()).contains(navBackStackEntry) && !snapshotStateList.contains(navBackStackEntry)) {
                    dialogNavigator.onTransitionComplete$navigation_compose_release(navBackStackEntry);
                }
            }
            return I.f6474a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
