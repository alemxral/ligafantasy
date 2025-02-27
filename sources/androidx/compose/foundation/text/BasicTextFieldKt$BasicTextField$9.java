package androidx.compose.foundation.text;

import L5.I;
import X5.n;
import X5.o;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class BasicTextFieldKt$BasicTextField$9 extends AbstractC3160z implements n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ Brush $cursorBrush;
    final /* synthetic */ o $decorationBox;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ KeyboardActions $keyboardActions;
    final /* synthetic */ KeyboardOptions $keyboardOptions;
    final /* synthetic */ int $maxLines;
    final /* synthetic */ int $minLines;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function1 $onTextLayout;
    final /* synthetic */ Function1 $onValueChange;
    final /* synthetic */ boolean $readOnly;
    final /* synthetic */ boolean $singleLine;
    final /* synthetic */ TextStyle $textStyle;
    final /* synthetic */ TextFieldValue $value;
    final /* synthetic */ VisualTransformation $visualTransformation;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTextFieldKt$BasicTextField$9(TextFieldValue textFieldValue, Function1 function1, Modifier modifier, boolean z8, boolean z9, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z10, int i8, int i9, VisualTransformation visualTransformation, Function1 function12, MutableInteractionSource mutableInteractionSource, Brush brush, o oVar, int i10, int i11, int i12) {
        super(2);
        this.$value = textFieldValue;
        this.$onValueChange = function1;
        this.$modifier = modifier;
        this.$enabled = z8;
        this.$readOnly = z9;
        this.$textStyle = textStyle;
        this.$keyboardOptions = keyboardOptions;
        this.$keyboardActions = keyboardActions;
        this.$singleLine = z10;
        this.$maxLines = i8;
        this.$minLines = i9;
        this.$visualTransformation = visualTransformation;
        this.$onTextLayout = function12;
        this.$interactionSource = mutableInteractionSource;
        this.$cursorBrush = brush;
        this.$decorationBox = oVar;
        this.$$changed = i10;
        this.$$changed1 = i11;
        this.$$default = i12;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f6474a;
    }

    public final void invoke(Composer composer, int i8) {
        BasicTextFieldKt.BasicTextField(this.$value, this.$onValueChange, this.$modifier, this.$enabled, this.$readOnly, this.$textStyle, this.$keyboardOptions, this.$keyboardActions, this.$singleLine, this.$maxLines, this.$minLines, this.$visualTransformation, this.$onTextLayout, this.$interactionSource, this.$cursorBrush, this.$decorationBox, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
    }
}
