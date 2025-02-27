package androidx.compose.ui.modifier;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC3151p;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public abstract class ModifierLocalMap {
    public static final int $stable = 0;

    private ModifierLocalMap() {
    }

    public abstract boolean contains$ui_release(ModifierLocal<?> modifierLocal);

    public abstract <T> T get$ui_release(ModifierLocal<T> modifierLocal);

    /* renamed from: set$ui_release */
    public abstract <T> void mo4206set$ui_release(ModifierLocal<T> modifierLocal, T t8);

    public /* synthetic */ ModifierLocalMap(AbstractC3151p abstractC3151p) {
        this();
    }
}
