package androidx.compose.material3;

import L5.I;
import X5.n;
import X5.o;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class NavigationBarKt$NavigationBar$2 extends AbstractC3160z implements n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $containerColor;
    final /* synthetic */ o $content;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ float $tonalElevation;
    final /* synthetic */ WindowInsets $windowInsets;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationBarKt$NavigationBar$2(Modifier modifier, long j8, long j9, float f8, WindowInsets windowInsets, o oVar, int i8, int i9) {
        super(2);
        this.$modifier = modifier;
        this.$containerColor = j8;
        this.$contentColor = j9;
        this.$tonalElevation = f8;
        this.$windowInsets = windowInsets;
        this.$content = oVar;
        this.$$changed = i8;
        this.$$default = i9;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f6474a;
    }

    public final void invoke(Composer composer, int i8) {
        NavigationBarKt.m1698NavigationBarHsRjFd4(this.$modifier, this.$containerColor, this.$contentColor, this.$tonalElevation, this.$windowInsets, this.$content, composer, this.$$changed | 1, this.$$default);
    }
}
