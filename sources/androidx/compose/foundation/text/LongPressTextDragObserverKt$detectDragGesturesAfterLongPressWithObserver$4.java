package androidx.compose.foundation.text;

import L5.I;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class LongPressTextDragObserverKt$detectDragGesturesAfterLongPressWithObserver$4 extends AbstractC3160z implements Function0 {
    final /* synthetic */ TextDragObserver $observer;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LongPressTextDragObserverKt$detectDragGesturesAfterLongPressWithObserver$4(TextDragObserver textDragObserver) {
        super(0);
        this.$observer = textDragObserver;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m889invoke();
        return I.f6474a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m889invoke() {
        this.$observer.onCancel();
    }
}
