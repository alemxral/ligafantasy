package androidx.compose.runtime;

import L5.AbstractC1221e;
import L5.I;
import androidx.compose.runtime.Recomposer;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;
import l6.v;

/* loaded from: classes.dex */
final class Recomposer$effectJob$1$1$1$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ Throwable $throwable;
    final /* synthetic */ Recomposer this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$effectJob$1$1$1$1(Recomposer recomposer, Throwable th) {
        super(1);
        this.this$0 = recomposer;
        this.$throwable = th;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return I.f6474a;
    }

    public final void invoke(Throwable th) {
        v vVar;
        Object obj = this.this$0.stateLock;
        Recomposer recomposer = this.this$0;
        Throwable th2 = this.$throwable;
        synchronized (obj) {
            if (th2 == null) {
                th2 = null;
            } else if (th != null) {
                try {
                    if (th instanceof CancellationException) {
                        th = null;
                    }
                    if (th != null) {
                        AbstractC1221e.a(th2, th);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            recomposer.closeCause = th2;
            vVar = recomposer._state;
            vVar.setValue(Recomposer.State.ShutDown);
            I i8 = I.f6474a;
        }
    }
}
