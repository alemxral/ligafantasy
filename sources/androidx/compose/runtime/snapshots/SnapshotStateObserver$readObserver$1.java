package androidx.compose.runtime.snapshots;

import L5.I;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SnapshotStateObserver$readObserver$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ SnapshotStateObserver this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotStateObserver$readObserver$1(SnapshotStateObserver snapshotStateObserver) {
        super(1);
        this.this$0 = snapshotStateObserver;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m2604invoke(obj);
        return I.f6474a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m2604invoke(Object obj) {
        boolean z8;
        MutableVector mutableVector;
        SnapshotStateObserver.ObservedScopeMap observedScopeMap;
        z8 = this.this$0.isPaused;
        if (z8) {
            return;
        }
        mutableVector = this.this$0.observedScopeMaps;
        SnapshotStateObserver snapshotStateObserver = this.this$0;
        synchronized (mutableVector) {
            observedScopeMap = snapshotStateObserver.currentMap;
            AbstractC3159y.f(observedScopeMap);
            observedScopeMap.recordRead(obj);
            I i8 = I.f6474a;
        }
    }
}
