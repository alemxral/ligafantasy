package androidx.compose.foundation.text;

import L5.I;
import X5.n;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class BasicTextKt$BasicText$9 extends AbstractC3160z implements n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Map<String, InlineTextContent> $inlineContent;
    final /* synthetic */ int $maxLines;
    final /* synthetic */ int $minLines;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function1 $onTextLayout;
    final /* synthetic */ int $overflow;
    final /* synthetic */ boolean $softWrap;
    final /* synthetic */ TextStyle $style;
    final /* synthetic */ AnnotatedString $text;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTextKt$BasicText$9(AnnotatedString annotatedString, Modifier modifier, TextStyle textStyle, Function1 function1, int i8, boolean z8, int i9, int i10, Map<String, InlineTextContent> map, int i11, int i12) {
        super(2);
        this.$text = annotatedString;
        this.$modifier = modifier;
        this.$style = textStyle;
        this.$onTextLayout = function1;
        this.$overflow = i8;
        this.$softWrap = z8;
        this.$maxLines = i9;
        this.$minLines = i10;
        this.$inlineContent = map;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f6474a;
    }

    public final void invoke(Composer composer, int i8) {
        BasicTextKt.m861BasicTextVhcvRP8(this.$text, this.$modifier, this.$style, this.$onTextLayout, this.$overflow, this.$softWrap, this.$maxLines, this.$minLines, this.$inlineContent, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
