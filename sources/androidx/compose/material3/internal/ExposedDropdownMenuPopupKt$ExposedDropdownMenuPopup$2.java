package androidx.compose.material3.internal;

import L5.I;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$2 extends AbstractC3160z implements Function0 {
    final /* synthetic */ LayoutDirection $layoutDirection;
    final /* synthetic */ Function0 $onDismissRequest;
    final /* synthetic */ PopupLayout $popupLayout;
    final /* synthetic */ String $testTag;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$2(PopupLayout popupLayout, Function0 function0, String str, LayoutDirection layoutDirection) {
        super(0);
        this.$popupLayout = popupLayout;
        this.$onDismissRequest = function0;
        this.$testTag = str;
        this.$layoutDirection = layoutDirection;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m1956invoke();
        return I.f6474a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m1956invoke() {
        this.$popupLayout.updateParameters(this.$onDismissRequest, this.$testTag, this.$layoutDirection);
    }
}
