package androidx.compose.foundation.gestures;

import X5.n;
import androidx.compose.foundation.MutatePriority;

/* loaded from: classes.dex */
public abstract /* synthetic */ class e {
    public static /* synthetic */ Object a(TransformableState transformableState, MutatePriority mutatePriority, n nVar, P5.d dVar, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 1) != 0) {
                mutatePriority = MutatePriority.Default;
            }
            return transformableState.transform(mutatePriority, nVar, dVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: transform");
    }
}
