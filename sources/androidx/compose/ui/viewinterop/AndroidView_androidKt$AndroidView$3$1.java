package androidx.compose.ui.viewinterop;

import L5.I;
import X5.n;
import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AndroidView_androidKt$AndroidView$3$1 extends AbstractC3160z implements n {
    public static final AndroidView_androidKt$AndroidView$3$1 INSTANCE = new AndroidView_androidKt$AndroidView$3$1();

    AndroidView_androidKt$AndroidView$3$1() {
        super(2);
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((LayoutNode) obj, (Function1) obj2);
        return I.f6474a;
    }

    public final void invoke(LayoutNode layoutNode, Function1 function1) {
        ViewFactoryHolder requireViewFactoryHolder;
        requireViewFactoryHolder = AndroidView_androidKt.requireViewFactoryHolder(layoutNode);
        requireViewFactoryHolder.setUpdateBlock(function1);
    }
}
