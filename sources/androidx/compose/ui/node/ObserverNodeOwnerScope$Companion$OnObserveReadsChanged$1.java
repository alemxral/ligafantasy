package androidx.compose.ui.node;

import L5.I;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class ObserverNodeOwnerScope$Companion$OnObserveReadsChanged$1 extends AbstractC3160z implements Function1 {
    public static final ObserverNodeOwnerScope$Companion$OnObserveReadsChanged$1 INSTANCE = new ObserverNodeOwnerScope$Companion$OnObserveReadsChanged$1();

    ObserverNodeOwnerScope$Companion$OnObserveReadsChanged$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ObserverNodeOwnerScope) obj);
        return I.f6474a;
    }

    public final void invoke(ObserverNodeOwnerScope observerNodeOwnerScope) {
        if (observerNodeOwnerScope.isValidOwnerScope()) {
            observerNodeOwnerScope.getObserverNode$ui_release().onObservedReadsChanged();
        }
    }
}
