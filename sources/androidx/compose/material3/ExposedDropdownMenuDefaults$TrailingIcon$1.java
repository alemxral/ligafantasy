package androidx.compose.material3;

import L5.I;
import X5.n;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ExposedDropdownMenuDefaults$TrailingIcon$1 extends AbstractC3160z implements n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $expanded;
    final /* synthetic */ ExposedDropdownMenuDefaults $tmp0_rcvr;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuDefaults$TrailingIcon$1(ExposedDropdownMenuDefaults exposedDropdownMenuDefaults, boolean z8, int i8) {
        super(2);
        this.$tmp0_rcvr = exposedDropdownMenuDefaults;
        this.$expanded = z8;
        this.$$changed = i8;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f6474a;
    }

    public final void invoke(Composer composer, int i8) {
        this.$tmp0_rcvr.TrailingIcon(this.$expanded, composer, this.$$changed | 1);
    }
}
