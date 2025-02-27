package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class WrapContentElement extends ModifierNodeElement<WrapContentNode> {
    public static final Companion Companion = new Companion(null);
    private final Object align;
    private final X5.n alignmentCallback;
    private final Direction direction;
    private final String inspectorName;
    private final boolean unbounded;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        @Stable
        public final WrapContentElement height(Alignment.Vertical align, boolean z8) {
            AbstractC3159y.i(align, "align");
            return new WrapContentElement(Direction.Vertical, z8, new WrapContentElement$Companion$height$1(align), align, "wrapContentHeight");
        }

        @Stable
        public final WrapContentElement size(Alignment align, boolean z8) {
            AbstractC3159y.i(align, "align");
            return new WrapContentElement(Direction.Both, z8, new WrapContentElement$Companion$size$1(align), align, "wrapContentSize");
        }

        @Stable
        public final WrapContentElement width(Alignment.Horizontal align, boolean z8) {
            AbstractC3159y.i(align, "align");
            return new WrapContentElement(Direction.Horizontal, z8, new WrapContentElement$Companion$width$1(align), align, "wrapContentWidth");
        }

        public /* synthetic */ Companion(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public WrapContentElement(Direction direction, boolean z8, X5.n alignmentCallback, Object align, String inspectorName) {
        AbstractC3159y.i(direction, "direction");
        AbstractC3159y.i(alignmentCallback, "alignmentCallback");
        AbstractC3159y.i(align, "align");
        AbstractC3159y.i(inspectorName, "inspectorName");
        this.direction = direction;
        this.unbounded = z8;
        this.alignmentCallback = alignmentCallback;
        this.align = align;
        this.inspectorName = inspectorName;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!AbstractC3159y.d(WrapContentElement.class, cls)) {
            return false;
        }
        AbstractC3159y.g(obj, "null cannot be cast to non-null type androidx.compose.foundation.layout.WrapContentElement");
        WrapContentElement wrapContentElement = (WrapContentElement) obj;
        if (this.direction == wrapContentElement.direction && this.unbounded == wrapContentElement.unbounded && AbstractC3159y.d(this.align, wrapContentElement.align)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((this.direction.hashCode() * 31) + androidx.compose.foundation.a.a(this.unbounded)) * 31) + this.align.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        AbstractC3159y.i(inspectorInfo, "<this>");
        inspectorInfo.setName(this.inspectorName);
        inspectorInfo.getProperties().set("align", this.align);
        inspectorInfo.getProperties().set("unbounded", Boolean.valueOf(this.unbounded));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public WrapContentNode create() {
        return new WrapContentNode(this.direction, this.unbounded, this.alignmentCallback);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(WrapContentNode node) {
        AbstractC3159y.i(node, "node");
        node.setDirection(this.direction);
        node.setUnbounded(this.unbounded);
        node.setAlignmentCallback(this.alignmentCallback);
    }
}
