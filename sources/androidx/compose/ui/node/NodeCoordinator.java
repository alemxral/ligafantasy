package androidx.compose.ui.node;

import L5.I;
import M5.a0;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.MutableRectKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LookaheadLayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.exifinterface.media.ExifInterface;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.T;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public abstract class NodeCoordinator extends LookaheadCapablePlaceable implements Measurable, LayoutCoordinates, OwnerScope {
    public static final int $stable = 0;
    public static final String ExpectAttachedLayoutCoordinates = "LayoutCoordinate operations are only valid when isAttached is true";
    public static final String UnmeasuredError = "Asking for measurement result of unmeasured layout modifier";
    private MeasureResult _measureResult;
    private MutableRect _rectCache;
    private boolean isClipping;
    private boolean lastLayerDrawingWasSkipped;
    private OwnedLayer layer;
    private Function1 layerBlock;
    private LayerPositionalProperties layerPositionalProperties;
    private final LayoutNode layoutNode;
    private Map<AlignmentLine, Integer> oldAlignmentLines;
    private boolean released;
    private NodeCoordinator wrapped;
    private NodeCoordinator wrappedBy;
    private float zIndex;
    public static final Companion Companion = new Companion(null);
    private static final Function1 onCommitAffectingLayerParams = NodeCoordinator$Companion$onCommitAffectingLayerParams$1.INSTANCE;
    private static final Function1 onCommitAffectingLayer = NodeCoordinator$Companion$onCommitAffectingLayer$1.INSTANCE;
    private static final ReusableGraphicsLayerScope graphicsLayerScope = new ReusableGraphicsLayerScope();
    private static final LayerPositionalProperties tmpLayerPositionalProperties = new LayerPositionalProperties();
    private static final float[] tmpMatrix = Matrix.m3182constructorimpl$default(null, 1, null);
    private static final HitTestSource PointerInputSource = new HitTestSource() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$PointerInputSource$1
        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* renamed from: childHitTest-YqVAtuI, reason: not valid java name */
        public void mo4332childHitTestYqVAtuI(LayoutNode layoutNode, long j8, HitTestResult hitTestResult, boolean z8, boolean z9) {
            layoutNode.m4252hitTestM_7yMNQ$ui_release(j8, hitTestResult, z8, z9);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* renamed from: entityType-OLwlOKw, reason: not valid java name */
        public int mo4333entityTypeOLwlOKw() {
            return NodeKind.m4343constructorimpl(16);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v0, types: [androidx.compose.ui.Modifier$Node] */
        /* JADX WARN: Type inference failed for: r10v1, types: [androidx.compose.ui.Modifier$Node] */
        /* JADX WARN: Type inference failed for: r10v10 */
        /* JADX WARN: Type inference failed for: r10v11 */
        /* JADX WARN: Type inference failed for: r10v12 */
        /* JADX WARN: Type inference failed for: r10v4 */
        /* JADX WARN: Type inference failed for: r10v5, types: [androidx.compose.ui.Modifier$Node] */
        /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r10v7 */
        /* JADX WARN: Type inference failed for: r10v8 */
        /* JADX WARN: Type inference failed for: r10v9 */
        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean interceptOutOfBoundsChildEvents(Modifier.Node node) {
            int m4343constructorimpl = NodeKind.m4343constructorimpl(16);
            MutableVector mutableVector = null;
            while (node != 0) {
                if (node instanceof PointerInputModifierNode) {
                    if (((PointerInputModifierNode) node).interceptOutOfBoundsChildEvents()) {
                        return true;
                    }
                } else if ((node.getKindSet$ui_release() & m4343constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                    Modifier.Node delegate$ui_release = node.getDelegate$ui_release();
                    int i8 = 0;
                    node = node;
                    while (delegate$ui_release != null) {
                        if ((delegate$ui_release.getKindSet$ui_release() & m4343constructorimpl) != 0) {
                            i8++;
                            if (i8 == 1) {
                                node = delegate$ui_release;
                            } else {
                                if (mutableVector == null) {
                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (node != 0) {
                                    mutableVector.add(node);
                                    node = 0;
                                }
                                mutableVector.add(delegate$ui_release);
                            }
                        }
                        delegate$ui_release = delegate$ui_release.getChild$ui_release();
                        node = node;
                    }
                    if (i8 == 1) {
                    }
                }
                node = DelegatableNodeKt.pop(mutableVector);
            }
            return false;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean shouldHitTestChildren(LayoutNode layoutNode) {
            return true;
        }
    };
    private static final HitTestSource SemanticsSource = new HitTestSource() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$SemanticsSource$1
        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* renamed from: childHitTest-YqVAtuI */
        public void mo4332childHitTestYqVAtuI(LayoutNode layoutNode, long j8, HitTestResult hitTestResult, boolean z8, boolean z9) {
            layoutNode.m4253hitTestSemanticsM_7yMNQ$ui_release(j8, hitTestResult, z8, z9);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* renamed from: entityType-OLwlOKw */
        public int mo4333entityTypeOLwlOKw() {
            return NodeKind.m4343constructorimpl(8);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean interceptOutOfBoundsChildEvents(Modifier.Node node) {
            return false;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean shouldHitTestChildren(LayoutNode layoutNode) {
            SemanticsConfiguration collapsedSemantics$ui_release = layoutNode.getCollapsedSemantics$ui_release();
            boolean z8 = false;
            if (collapsedSemantics$ui_release != null && collapsedSemantics$ui_release.isClearingSemantics()) {
                z8 = true;
            }
            return !z8;
        }
    };
    private Density layerDensity = getLayoutNode().getDensity();
    private LayoutDirection layerLayoutDirection = getLayoutNode().getLayoutDirection();
    private float lastLayerAlpha = 0.8f;
    private long position = IntOffset.Companion.m5312getZeronOccac();
    private final Function1 drawBlock = new NodeCoordinator$drawBlock$1(this);
    private final Function0 invalidateParentLayer = new NodeCoordinator$invalidateParentLayer$1(this);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final HitTestSource getPointerInputSource() {
            return NodeCoordinator.PointerInputSource;
        }

        public final HitTestSource getSemanticsSource() {
            return NodeCoordinator.SemanticsSource;
        }

        public /* synthetic */ Companion(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public interface HitTestSource {
        /* renamed from: childHitTest-YqVAtuI */
        void mo4332childHitTestYqVAtuI(LayoutNode layoutNode, long j8, HitTestResult hitTestResult, boolean z8, boolean z9);

        /* renamed from: entityType-OLwlOKw */
        int mo4333entityTypeOLwlOKw();

        boolean interceptOutOfBoundsChildEvents(Modifier.Node node);

        boolean shouldHitTestChildren(LayoutNode layoutNode);
    }

    public NodeCoordinator(LayoutNode layoutNode) {
        this.layoutNode = layoutNode;
    }

    private final void ancestorToLocal(NodeCoordinator nodeCoordinator, MutableRect mutableRect, boolean z8) {
        if (nodeCoordinator == this) {
            return;
        }
        NodeCoordinator nodeCoordinator2 = this.wrappedBy;
        if (nodeCoordinator2 != null) {
            nodeCoordinator2.ancestorToLocal(nodeCoordinator, mutableRect, z8);
        }
        fromParentRect(mutableRect, z8);
    }

    /* renamed from: ancestorToLocal-R5De75A */
    private final long m4309ancestorToLocalR5De75A(NodeCoordinator nodeCoordinator, long j8) {
        if (nodeCoordinator == this) {
            return j8;
        }
        NodeCoordinator nodeCoordinator2 = this.wrappedBy;
        if (nodeCoordinator2 != null && !AbstractC3159y.d(nodeCoordinator, nodeCoordinator2)) {
            return m4320fromParentPositionMKHz9U(nodeCoordinator2.m4309ancestorToLocalR5De75A(nodeCoordinator, j8));
        }
        return m4320fromParentPositionMKHz9U(j8);
    }

    public final void drawContainedDrawModifiers(Canvas canvas) {
        Modifier.Node m4323headH91voCI = m4323headH91voCI(NodeKind.m4343constructorimpl(4));
        if (m4323headH91voCI == null) {
            performDraw(canvas);
        } else {
            getLayoutNode().getMDrawScope$ui_release().m4264drawx_KDEd0$ui_release(canvas, IntSizeKt.m5354toSizeozmzZPI(mo4138getSizeYbymL2g()), this, m4323headH91voCI);
        }
    }

    private final void fromParentRect(MutableRect mutableRect, boolean z8) {
        float m5302getXimpl = IntOffset.m5302getXimpl(mo4284getPositionnOccac());
        mutableRect.setLeft(mutableRect.getLeft() - m5302getXimpl);
        mutableRect.setRight(mutableRect.getRight() - m5302getXimpl);
        float m5303getYimpl = IntOffset.m5303getYimpl(mo4284getPositionnOccac());
        mutableRect.setTop(mutableRect.getTop() - m5303getYimpl);
        mutableRect.setBottom(mutableRect.getBottom() - m5303getYimpl);
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mapBounds(mutableRect, true);
            if (this.isClipping && z8) {
                mutableRect.intersect(0.0f, 0.0f, IntSize.m5344getWidthimpl(mo4138getSizeYbymL2g()), IntSize.m5343getHeightimpl(mo4138getSizeYbymL2g()));
                mutableRect.isEmpty();
            }
        }
    }

    private static /* synthetic */ void getDrawBlock$annotations() {
    }

    public final OwnerSnapshotObserver getSnapshotObserver() {
        return LayoutNodeKt.requireOwner(getLayoutNode()).getSnapshotObserver();
    }

    /* renamed from: hasNode-H91voCI */
    private final boolean m4310hasNodeH91voCI(int i8) {
        Modifier.Node headNode = headNode(NodeKindKt.m4352getIncludeSelfInTraversalH91voCI(i8));
        if (headNode == null || !DelegatableNodeKt.m4224has64DMado(headNode, i8)) {
            return false;
        }
        return true;
    }

    public final Modifier.Node headNode(boolean z8) {
        Modifier.Node tail;
        if (getLayoutNode().getOuterCoordinator$ui_release() == this) {
            return getLayoutNode().getNodes$ui_release().getHead$ui_release();
        }
        if (z8) {
            NodeCoordinator nodeCoordinator = this.wrappedBy;
            if (nodeCoordinator != null && (tail = nodeCoordinator.getTail()) != null) {
                return tail.getChild$ui_release();
            }
        } else {
            NodeCoordinator nodeCoordinator2 = this.wrappedBy;
            if (nodeCoordinator2 != null) {
                return nodeCoordinator2.getTail();
            }
        }
        return null;
    }

    /* renamed from: hit-1hIXUjU */
    public final void m4311hit1hIXUjU(Modifier.Node node, HitTestSource hitTestSource, long j8, HitTestResult hitTestResult, boolean z8, boolean z9) {
        if (node == null) {
            mo4247hitTestChildYqVAtuI(hitTestSource, j8, hitTestResult, z8, z9);
        } else {
            hitTestResult.hit(node, z9, new NodeCoordinator$hit$1(this, node, hitTestSource, j8, hitTestResult, z8, z9));
        }
    }

    /* renamed from: hitNear-JHbHoSQ */
    public final void m4312hitNearJHbHoSQ(Modifier.Node node, HitTestSource hitTestSource, long j8, HitTestResult hitTestResult, boolean z8, boolean z9, float f8) {
        if (node == null) {
            mo4247hitTestChildYqVAtuI(hitTestSource, j8, hitTestResult, z8, z9);
        } else {
            hitTestResult.hitInMinimumTouchTarget(node, f8, z9, new NodeCoordinator$hitNear$1(this, node, hitTestSource, j8, hitTestResult, z8, z9, f8));
        }
    }

    /* renamed from: offsetFromEdge-MK-Hz9U */
    private final long m4313offsetFromEdgeMKHz9U(long j8) {
        float measuredWidth;
        float measuredHeight;
        float m2735getXimpl = Offset.m2735getXimpl(j8);
        if (m2735getXimpl < 0.0f) {
            measuredWidth = -m2735getXimpl;
        } else {
            measuredWidth = m2735getXimpl - getMeasuredWidth();
        }
        float max = Math.max(0.0f, measuredWidth);
        float m2736getYimpl = Offset.m2736getYimpl(j8);
        if (m2736getYimpl < 0.0f) {
            measuredHeight = -m2736getYimpl;
        } else {
            measuredHeight = m2736getYimpl - getMeasuredHeight();
        }
        return OffsetKt.Offset(max, Math.max(0.0f, measuredHeight));
    }

    /* renamed from: placeSelf-f8xVGno */
    private final void m4314placeSelff8xVGno(long j8, float f8, Function1 function1) {
        updateLayerBlock$default(this, function1, false, 2, null);
        if (!IntOffset.m5301equalsimpl0(mo4284getPositionnOccac(), j8)) {
            m4328setPositiongyyYBs(j8);
            getLayoutNode().getLayoutDelegate$ui_release().getMeasurePassDelegate$ui_release().notifyChildrenUsingCoordinatesWhilePlacing();
            OwnedLayer ownedLayer = this.layer;
            if (ownedLayer != null) {
                ownedLayer.mo4393movegyyYBs(j8);
            } else {
                NodeCoordinator nodeCoordinator = this.wrappedBy;
                if (nodeCoordinator != null) {
                    nodeCoordinator.invalidateLayer();
                }
            }
            invalidateAlignmentLinesFromPositionChange(this);
            Owner owner$ui_release = getLayoutNode().getOwner$ui_release();
            if (owner$ui_release != null) {
                owner$ui_release.onLayoutChange(getLayoutNode());
            }
        }
        this.zIndex = f8;
    }

    public static /* synthetic */ void rectInParent$ui_release$default(NodeCoordinator nodeCoordinator, MutableRect mutableRect, boolean z8, boolean z9, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 4) != 0) {
                z9 = false;
            }
            nodeCoordinator.rectInParent$ui_release(mutableRect, z8, z9);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rectInParent");
    }

    /* renamed from: speculativeHit-JHbHoSQ */
    public final void m4315speculativeHitJHbHoSQ(Modifier.Node node, HitTestSource hitTestSource, long j8, HitTestResult hitTestResult, boolean z8, boolean z9, float f8) {
        Modifier.Node m4341nextUntilhw7D004;
        if (node == null) {
            mo4247hitTestChildYqVAtuI(hitTestSource, j8, hitTestResult, z8, z9);
        } else if (!hitTestSource.interceptOutOfBoundsChildEvents(node)) {
            m4341nextUntilhw7D004 = NodeCoordinatorKt.m4341nextUntilhw7D004(node, hitTestSource.mo4333entityTypeOLwlOKw(), NodeKind.m4343constructorimpl(2));
            m4315speculativeHitJHbHoSQ(m4341nextUntilhw7D004, hitTestSource, j8, hitTestResult, z8, z9, f8);
        } else {
            hitTestResult.speculativeHit(node, f8, z9, new NodeCoordinator$speculativeHit$1(this, node, hitTestSource, j8, hitTestResult, z8, z9, f8));
        }
    }

    private final NodeCoordinator toCoordinator(LayoutCoordinates layoutCoordinates) {
        LookaheadLayoutCoordinates lookaheadLayoutCoordinates;
        NodeCoordinator coordinator;
        if (layoutCoordinates instanceof LookaheadLayoutCoordinates) {
            lookaheadLayoutCoordinates = (LookaheadLayoutCoordinates) layoutCoordinates;
        } else {
            lookaheadLayoutCoordinates = null;
        }
        if (lookaheadLayoutCoordinates == null || (coordinator = lookaheadLayoutCoordinates.getCoordinator()) == null) {
            AbstractC3159y.g(layoutCoordinates, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
            return (NodeCoordinator) layoutCoordinates;
        }
        return coordinator;
    }

    /* renamed from: transformFromAncestor-EL8BTi8 */
    private final void m4316transformFromAncestorEL8BTi8(NodeCoordinator nodeCoordinator, float[] fArr) {
        if (!AbstractC3159y.d(nodeCoordinator, this)) {
            NodeCoordinator nodeCoordinator2 = this.wrappedBy;
            AbstractC3159y.f(nodeCoordinator2);
            nodeCoordinator2.m4316transformFromAncestorEL8BTi8(nodeCoordinator, fArr);
            if (!IntOffset.m5301equalsimpl0(mo4284getPositionnOccac(), IntOffset.Companion.m5312getZeronOccac())) {
                float[] fArr2 = tmpMatrix;
                Matrix.m3191resetimpl(fArr2);
                Matrix.m3202translateimpl$default(fArr2, -IntOffset.m5302getXimpl(mo4284getPositionnOccac()), -IntOffset.m5303getYimpl(mo4284getPositionnOccac()), 0.0f, 4, null);
                Matrix.m3199timesAssign58bKbWc(fArr, fArr2);
            }
            OwnedLayer ownedLayer = this.layer;
            if (ownedLayer != null) {
                ownedLayer.mo4390inverseTransform58bKbWc(fArr);
            }
        }
    }

    /* renamed from: transformToAncestor-EL8BTi8 */
    private final void m4317transformToAncestorEL8BTi8(NodeCoordinator nodeCoordinator, float[] fArr) {
        NodeCoordinator nodeCoordinator2 = this;
        while (!AbstractC3159y.d(nodeCoordinator2, nodeCoordinator)) {
            OwnedLayer ownedLayer = nodeCoordinator2.layer;
            if (ownedLayer != null) {
                ownedLayer.mo4395transform58bKbWc(fArr);
            }
            if (!IntOffset.m5301equalsimpl0(nodeCoordinator2.mo4284getPositionnOccac(), IntOffset.Companion.m5312getZeronOccac())) {
                float[] fArr2 = tmpMatrix;
                Matrix.m3191resetimpl(fArr2);
                Matrix.m3202translateimpl$default(fArr2, IntOffset.m5302getXimpl(r1), IntOffset.m5303getYimpl(r1), 0.0f, 4, null);
                Matrix.m3199timesAssign58bKbWc(fArr, fArr2);
            }
            nodeCoordinator2 = nodeCoordinator2.wrappedBy;
            AbstractC3159y.f(nodeCoordinator2);
        }
    }

    public static /* synthetic */ void updateLayerBlock$default(NodeCoordinator nodeCoordinator, Function1 function1, boolean z8, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 2) != 0) {
                z8 = false;
            }
            nodeCoordinator.updateLayerBlock(function1, z8);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerBlock");
    }

    private final void updateLayerParameters(boolean z8) {
        Owner owner$ui_release;
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            Function1 function1 = this.layerBlock;
            if (function1 != null) {
                ReusableGraphicsLayerScope reusableGraphicsLayerScope = graphicsLayerScope;
                reusableGraphicsLayerScope.reset();
                reusableGraphicsLayerScope.setGraphicsDensity$ui_release(getLayoutNode().getDensity());
                reusableGraphicsLayerScope.m3260setSizeuvyYCjk(IntSizeKt.m5354toSizeozmzZPI(mo4138getSizeYbymL2g()));
                getSnapshotObserver().observeReads$ui_release(this, onCommitAffectingLayerParams, new NodeCoordinator$updateLayerParameters$1(function1));
                LayerPositionalProperties layerPositionalProperties = this.layerPositionalProperties;
                if (layerPositionalProperties == null) {
                    layerPositionalProperties = new LayerPositionalProperties();
                    this.layerPositionalProperties = layerPositionalProperties;
                }
                layerPositionalProperties.copyFrom(reusableGraphicsLayerScope);
                ownedLayer.updateLayerProperties(reusableGraphicsLayerScope, getLayoutNode().getLayoutDirection(), getLayoutNode().getDensity());
                this.isClipping = reusableGraphicsLayerScope.getClip();
                this.lastLayerAlpha = reusableGraphicsLayerScope.getAlpha();
                if (z8 && (owner$ui_release = getLayoutNode().getOwner$ui_release()) != null) {
                    owner$ui_release.onLayoutChange(getLayoutNode());
                    return;
                }
                return;
            }
            throw new IllegalStateException("updateLayerParameters requires a non-null layerBlock".toString());
        }
        if (this.layerBlock == null) {
        } else {
            throw new IllegalStateException("null layer with a non-null layerBlock".toString());
        }
    }

    public static /* synthetic */ void updateLayerParameters$default(NodeCoordinator nodeCoordinator, boolean z8, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 1) != 0) {
                z8 = true;
            }
            nodeCoordinator.updateLayerParameters(z8);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerParameters");
    }

    /* renamed from: calculateMinimumTouchTargetPadding-E7KxVPU */
    protected final long m4318calculateMinimumTouchTargetPaddingE7KxVPU(long j8) {
        return SizeKt.Size(Math.max(0.0f, (Size.m2804getWidthimpl(j8) - getMeasuredWidth()) / 2.0f), Math.max(0.0f, (Size.m2801getHeightimpl(j8) - getMeasuredHeight()) / 2.0f));
    }

    /* renamed from: distanceInMinimumTouchTarget-tz77jQw */
    public final float m4319distanceInMinimumTouchTargettz77jQw(long j8, long j9) {
        if (getMeasuredWidth() >= Size.m2804getWidthimpl(j9) && getMeasuredHeight() >= Size.m2801getHeightimpl(j9)) {
            return Float.POSITIVE_INFINITY;
        }
        long m4318calculateMinimumTouchTargetPaddingE7KxVPU = m4318calculateMinimumTouchTargetPaddingE7KxVPU(j9);
        float m2804getWidthimpl = Size.m2804getWidthimpl(m4318calculateMinimumTouchTargetPaddingE7KxVPU);
        float m2801getHeightimpl = Size.m2801getHeightimpl(m4318calculateMinimumTouchTargetPaddingE7KxVPU);
        long m4313offsetFromEdgeMKHz9U = m4313offsetFromEdgeMKHz9U(j8);
        if ((m2804getWidthimpl <= 0.0f && m2801getHeightimpl <= 0.0f) || Offset.m2735getXimpl(m4313offsetFromEdgeMKHz9U) > m2804getWidthimpl || Offset.m2736getYimpl(m4313offsetFromEdgeMKHz9U) > m2801getHeightimpl) {
            return Float.POSITIVE_INFINITY;
        }
        return Offset.m2734getDistanceSquaredimpl(m4313offsetFromEdgeMKHz9U);
    }

    public final void draw(Canvas canvas) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.drawLayer(canvas);
            return;
        }
        float m5302getXimpl = IntOffset.m5302getXimpl(mo4284getPositionnOccac());
        float m5303getYimpl = IntOffset.m5303getYimpl(mo4284getPositionnOccac());
        canvas.translate(m5302getXimpl, m5303getYimpl);
        drawContainedDrawModifiers(canvas);
        canvas.translate(-m5302getXimpl, -m5303getYimpl);
    }

    public final void drawBorder(Canvas canvas, Paint paint) {
        canvas.drawRect(new Rect(0.5f, 0.5f, IntSize.m5344getWidthimpl(m4165getMeasuredSizeYbymL2g()) - 0.5f, IntSize.m5343getHeightimpl(m4165getMeasuredSizeYbymL2g()) - 0.5f), paint);
    }

    public abstract void ensureLookaheadDelegateCreated();

    public final NodeCoordinator findCommonAncestor$ui_release(NodeCoordinator nodeCoordinator) {
        LayoutNode layoutNode = nodeCoordinator.getLayoutNode();
        LayoutNode layoutNode2 = getLayoutNode();
        if (layoutNode == layoutNode2) {
            Modifier.Node tail = nodeCoordinator.getTail();
            Modifier.Node tail2 = getTail();
            int m4343constructorimpl = NodeKind.m4343constructorimpl(2);
            if (tail2.getNode().isAttached()) {
                for (Modifier.Node parent$ui_release = tail2.getNode().getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
                    if ((parent$ui_release.getKindSet$ui_release() & m4343constructorimpl) != 0 && parent$ui_release == tail) {
                        return nodeCoordinator;
                    }
                }
                return this;
            }
            throw new IllegalStateException("visitLocalAncestors called on an unattached node".toString());
        }
        while (layoutNode.getDepth$ui_release() > layoutNode2.getDepth$ui_release()) {
            layoutNode = layoutNode.getParent$ui_release();
            AbstractC3159y.f(layoutNode);
        }
        while (layoutNode2.getDepth$ui_release() > layoutNode.getDepth$ui_release()) {
            layoutNode2 = layoutNode2.getParent$ui_release();
            AbstractC3159y.f(layoutNode2);
        }
        while (layoutNode != layoutNode2) {
            layoutNode = layoutNode.getParent$ui_release();
            layoutNode2 = layoutNode2.getParent$ui_release();
            if (layoutNode == null || layoutNode2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (layoutNode2 == getLayoutNode()) {
            return this;
        }
        if (layoutNode != nodeCoordinator.getLayoutNode()) {
            return layoutNode.getInnerCoordinator$ui_release();
        }
        return nodeCoordinator;
    }

    /* renamed from: fromParentPosition-MK-Hz9U */
    public long m4320fromParentPositionMKHz9U(long j8) {
        long m5314minusNvtHpc = IntOffsetKt.m5314minusNvtHpc(j8, mo4284getPositionnOccac());
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            return ownedLayer.mo4392mapOffset8S9VItk(m5314minusNvtHpc, true);
        }
        return m5314minusNvtHpc;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public AlignmentLinesOwner getAlignmentLinesOwner() {
        return getLayoutNode().getLayoutDelegate$ui_release().getAlignmentLinesOwner$ui_release();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public LookaheadCapablePlaceable getChild() {
        return this.wrapped;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public LayoutCoordinates getCoordinates() {
        return this;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return getLayoutNode().getDensity().getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return getLayoutNode().getDensity().getFontScale();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public boolean getHasMeasureResult() {
        if (this._measureResult != null) {
            return true;
        }
        return false;
    }

    public final boolean getLastLayerDrawingWasSkipped$ui_release() {
        return this.lastLayerDrawingWasSkipped;
    }

    /* renamed from: getLastMeasurementConstraints-msEJaDk$ui_release */
    public final long m4321getLastMeasurementConstraintsmsEJaDk$ui_release() {
        return m4166getMeasurementConstraintsmsEJaDk();
    }

    public final OwnedLayer getLayer() {
        return this.layer;
    }

    protected final Function1 getLayerBlock() {
        return this.layerBlock;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public LayoutDirection getLayoutDirection() {
        return getLayoutNode().getLayoutDirection();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable, androidx.compose.ui.node.MeasureScopeWithLayoutNode
    public LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    public abstract LookaheadDelegate getLookaheadDelegate();

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public MeasureResult getMeasureResult$ui_release() {
        MeasureResult measureResult = this._measureResult;
        if (measureResult != null) {
            return measureResult;
        }
        throw new IllegalStateException(UnmeasuredError.toString());
    }

    /* renamed from: getMinimumTouchTargetSize-NH-jbRc */
    public final long m4322getMinimumTouchTargetSizeNHjbRc() {
        return this.layerDensity.mo449toSizeXkaWNTQ(getLayoutNode().getViewConfiguration().mo4256getMinimumTouchTargetSizeMYxV2XQ());
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public LookaheadCapablePlaceable getParent() {
        return this.wrappedBy;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final LayoutCoordinates getParentCoordinates() {
        if (isAttached()) {
            onCoordinatesUsed$ui_release();
            return this.wrappedBy;
        }
        throw new IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
    public Object getParentData() {
        if (!getLayoutNode().getNodes$ui_release().m4300hasH91voCI$ui_release(NodeKind.m4343constructorimpl(64))) {
            return null;
        }
        getTail();
        T t8 = new T();
        for (Modifier.Node tail$ui_release = getLayoutNode().getNodes$ui_release().getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
            if ((NodeKind.m4343constructorimpl(64) & tail$ui_release.getKindSet$ui_release()) != 0) {
                int m4343constructorimpl = NodeKind.m4343constructorimpl(64);
                MutableVector mutableVector = null;
                DelegatingNode delegatingNode = tail$ui_release;
                while (delegatingNode != 0) {
                    if (delegatingNode instanceof ParentDataModifierNode) {
                        t8.f33747a = ((ParentDataModifierNode) delegatingNode).modifyParentData(getLayoutNode().getDensity(), t8.f33747a);
                    } else if ((delegatingNode.getKindSet$ui_release() & m4343constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
                        Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                        int i8 = 0;
                        delegatingNode = delegatingNode;
                        while (delegate$ui_release != null) {
                            if ((delegate$ui_release.getKindSet$ui_release() & m4343constructorimpl) != 0) {
                                i8++;
                                if (i8 == 1) {
                                    delegatingNode = delegate$ui_release;
                                } else {
                                    if (mutableVector == null) {
                                        mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                    }
                                    if (delegatingNode != 0) {
                                        mutableVector.add(delegatingNode);
                                        delegatingNode = 0;
                                    }
                                    mutableVector.add(delegate$ui_release);
                                }
                            }
                            delegate$ui_release = delegate$ui_release.getChild$ui_release();
                            delegatingNode = delegatingNode;
                        }
                        if (i8 == 1) {
                        }
                    }
                    delegatingNode = DelegatableNodeKt.pop(mutableVector);
                }
            }
        }
        return t8.f33747a;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final LayoutCoordinates getParentLayoutCoordinates() {
        if (isAttached()) {
            onCoordinatesUsed$ui_release();
            return getLayoutNode().getOuterCoordinator$ui_release().wrappedBy;
        }
        throw new IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    /* renamed from: getPosition-nOcc-ac */
    public long mo4284getPositionnOccac() {
        return this.position;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public Set<AlignmentLine> getProvidedAlignmentLines() {
        Map<AlignmentLine, Integer> map;
        LinkedHashSet linkedHashSet = null;
        for (NodeCoordinator nodeCoordinator = this; nodeCoordinator != null; nodeCoordinator = nodeCoordinator.wrapped) {
            MeasureResult measureResult = nodeCoordinator._measureResult;
            if (measureResult != null) {
                map = measureResult.getAlignmentLines();
            } else {
                map = null;
            }
            if (map != null && (!map.isEmpty())) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.addAll(map.keySet());
            }
        }
        if (linkedHashSet == null) {
            return a0.f();
        }
        return linkedHashSet;
    }

    protected final MutableRect getRectCache() {
        MutableRect mutableRect = this._rectCache;
        if (mutableRect == null) {
            MutableRect mutableRect2 = new MutableRect(0.0f, 0.0f, 0.0f, 0.0f);
            this._rectCache = mutableRect2;
            return mutableRect2;
        }
        return mutableRect;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: getSize-YbymL2g */
    public final long mo4138getSizeYbymL2g() {
        return m4165getMeasuredSizeYbymL2g();
    }

    public abstract Modifier.Node getTail();

    public final NodeCoordinator getWrapped$ui_release() {
        return this.wrapped;
    }

    public final NodeCoordinator getWrappedBy$ui_release() {
        return this.wrappedBy;
    }

    public final float getZIndex() {
        return this.zIndex;
    }

    /* renamed from: head-H91voCI */
    public final Modifier.Node m4323headH91voCI(int i8) {
        boolean m4352getIncludeSelfInTraversalH91voCI = NodeKindKt.m4352getIncludeSelfInTraversalH91voCI(i8);
        Modifier.Node tail = getTail();
        if (m4352getIncludeSelfInTraversalH91voCI || (tail = tail.getParent$ui_release()) != null) {
            for (Modifier.Node headNode = headNode(m4352getIncludeSelfInTraversalH91voCI); headNode != null && (headNode.getAggregateChildKindSet$ui_release() & i8) != 0; headNode = headNode.getChild$ui_release()) {
                if ((headNode.getKindSet$ui_release() & i8) != 0) {
                    return headNode;
                }
                if (headNode == tail) {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: hitTest-YqVAtuI */
    public final void m4324hitTestYqVAtuI(HitTestSource hitTestSource, long j8, HitTestResult hitTestResult, boolean z8, boolean z9) {
        float m4319distanceInMinimumTouchTargettz77jQw;
        Modifier.Node m4323headH91voCI = m4323headH91voCI(hitTestSource.mo4333entityTypeOLwlOKw());
        if (!m4331withinLayerBoundsk4lQ0M(j8)) {
            if (z8) {
                float m4319distanceInMinimumTouchTargettz77jQw2 = m4319distanceInMinimumTouchTargettz77jQw(j8, m4322getMinimumTouchTargetSizeNHjbRc());
                if (!Float.isInfinite(m4319distanceInMinimumTouchTargettz77jQw2) && !Float.isNaN(m4319distanceInMinimumTouchTargettz77jQw2) && hitTestResult.isHitInMinimumTouchTargetBetter(m4319distanceInMinimumTouchTargettz77jQw2, false)) {
                    m4312hitNearJHbHoSQ(m4323headH91voCI, hitTestSource, j8, hitTestResult, z8, false, m4319distanceInMinimumTouchTargettz77jQw2);
                    return;
                }
                return;
            }
            return;
        }
        if (m4323headH91voCI == null) {
            mo4247hitTestChildYqVAtuI(hitTestSource, j8, hitTestResult, z8, z9);
            return;
        }
        if (m4325isPointerInBoundsk4lQ0M(j8)) {
            m4311hit1hIXUjU(m4323headH91voCI, hitTestSource, j8, hitTestResult, z8, z9);
            return;
        }
        if (!z8) {
            m4319distanceInMinimumTouchTargettz77jQw = Float.POSITIVE_INFINITY;
        } else {
            m4319distanceInMinimumTouchTargettz77jQw = m4319distanceInMinimumTouchTargettz77jQw(j8, m4322getMinimumTouchTargetSizeNHjbRc());
        }
        if (!Float.isInfinite(m4319distanceInMinimumTouchTargettz77jQw) && !Float.isNaN(m4319distanceInMinimumTouchTargettz77jQw)) {
            if (hitTestResult.isHitInMinimumTouchTargetBetter(m4319distanceInMinimumTouchTargettz77jQw, z9)) {
                m4312hitNearJHbHoSQ(m4323headH91voCI, hitTestSource, j8, hitTestResult, z8, z9, m4319distanceInMinimumTouchTargettz77jQw);
                return;
            }
        }
        m4315speculativeHitJHbHoSQ(m4323headH91voCI, hitTestSource, j8, hitTestResult, z8, z9, m4319distanceInMinimumTouchTargettz77jQw);
    }

    /* renamed from: hitTestChild-YqVAtuI */
    public void mo4247hitTestChildYqVAtuI(HitTestSource hitTestSource, long j8, HitTestResult hitTestResult, boolean z8, boolean z9) {
        NodeCoordinator nodeCoordinator = this.wrapped;
        if (nodeCoordinator != null) {
            nodeCoordinator.m4324hitTestYqVAtuI(hitTestSource, nodeCoordinator.m4320fromParentPositionMKHz9U(j8), hitTestResult, z8, z9);
        }
    }

    public void invalidateLayer() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
            return;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator != null) {
            nodeCoordinator.invalidateLayer();
        }
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public boolean isAttached() {
        return getTail().isAttached();
    }

    /* renamed from: isPointerInBounds-k-4lQ0M */
    protected final boolean m4325isPointerInBoundsk4lQ0M(long j8) {
        float m2735getXimpl = Offset.m2735getXimpl(j8);
        float m2736getYimpl = Offset.m2736getYimpl(j8);
        if (m2735getXimpl >= 0.0f && m2736getYimpl >= 0.0f && m2735getXimpl < getMeasuredWidth() && m2736getYimpl < getMeasuredHeight()) {
            return true;
        }
        return false;
    }

    public final boolean isTransparent() {
        if (this.layer != null && this.lastLayerAlpha <= 0.0f) {
            return true;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator != null) {
            return nodeCoordinator.isTransparent();
        }
        return false;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        if (this.layer != null && !this.released && getLayoutNode().isAttached()) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public Rect localBoundingBoxOf(LayoutCoordinates layoutCoordinates, boolean z8) {
        if (isAttached()) {
            if (layoutCoordinates.isAttached()) {
                NodeCoordinator coordinator = toCoordinator(layoutCoordinates);
                coordinator.onCoordinatesUsed$ui_release();
                NodeCoordinator findCommonAncestor$ui_release = findCommonAncestor$ui_release(coordinator);
                MutableRect rectCache = getRectCache();
                rectCache.setLeft(0.0f);
                rectCache.setTop(0.0f);
                rectCache.setRight(IntSize.m5344getWidthimpl(layoutCoordinates.mo4138getSizeYbymL2g()));
                rectCache.setBottom(IntSize.m5343getHeightimpl(layoutCoordinates.mo4138getSizeYbymL2g()));
                while (coordinator != findCommonAncestor$ui_release) {
                    rectInParent$ui_release$default(coordinator, rectCache, z8, false, 4, null);
                    if (rectCache.isEmpty()) {
                        return Rect.Companion.getZero();
                    }
                    coordinator = coordinator.wrappedBy;
                    AbstractC3159y.f(coordinator);
                }
                ancestorToLocal(findCommonAncestor$ui_release, rectCache, z8);
                return MutableRectKt.toRect(rectCache);
            }
            throw new IllegalStateException(("LayoutCoordinates " + layoutCoordinates + " is not attached!").toString());
        }
        throw new IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localPositionOf-R5De75A */
    public long mo4139localPositionOfR5De75A(LayoutCoordinates layoutCoordinates, long j8) {
        if (layoutCoordinates instanceof LookaheadLayoutCoordinates) {
            return Offset.m2744unaryMinusF1C5BW0(layoutCoordinates.mo4139localPositionOfR5De75A(this, Offset.m2744unaryMinusF1C5BW0(j8)));
        }
        NodeCoordinator coordinator = toCoordinator(layoutCoordinates);
        coordinator.onCoordinatesUsed$ui_release();
        NodeCoordinator findCommonAncestor$ui_release = findCommonAncestor$ui_release(coordinator);
        while (coordinator != findCommonAncestor$ui_release) {
            j8 = coordinator.m4329toParentPositionMKHz9U(j8);
            coordinator = coordinator.wrappedBy;
            AbstractC3159y.f(coordinator);
        }
        return m4309ancestorToLocalR5De75A(findCommonAncestor$ui_release, j8);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localToRoot-MK-Hz9U */
    public long mo4140localToRootMKHz9U(long j8) {
        if (isAttached()) {
            onCoordinatesUsed$ui_release();
            for (NodeCoordinator nodeCoordinator = this; nodeCoordinator != null; nodeCoordinator = nodeCoordinator.wrappedBy) {
                j8 = nodeCoordinator.m4329toParentPositionMKHz9U(j8);
            }
            return j8;
        }
        throw new IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localToWindow-MK-Hz9U */
    public long mo4141localToWindowMKHz9U(long j8) {
        return LayoutNodeKt.requireOwner(getLayoutNode()).mo4397calculatePositionInWindowMKHz9U(mo4140localToRootMKHz9U(j8));
    }

    public final void onCoordinatesUsed$ui_release() {
        getLayoutNode().getLayoutDelegate$ui_release().onCoordinatesUsed();
    }

    public void onLayoutModifierNodeChanged() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
        }
    }

    public final void onLayoutNodeAttach() {
        updateLayerBlock(this.layerBlock, true);
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    protected void onMeasureResultChanged(int i8, int i9) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mo4394resizeozmzZPI(IntSizeKt.IntSize(i8, i9));
        } else {
            NodeCoordinator nodeCoordinator = this.wrappedBy;
            if (nodeCoordinator != null) {
                nodeCoordinator.invalidateLayer();
            }
        }
        m4167setMeasuredSizeozmzZPI(IntSizeKt.IntSize(i8, i9));
        updateLayerParameters(false);
        int m4343constructorimpl = NodeKind.m4343constructorimpl(4);
        boolean m4352getIncludeSelfInTraversalH91voCI = NodeKindKt.m4352getIncludeSelfInTraversalH91voCI(m4343constructorimpl);
        Modifier.Node tail = getTail();
        if (m4352getIncludeSelfInTraversalH91voCI || (tail = tail.getParent$ui_release()) != null) {
            for (Modifier.Node headNode = headNode(m4352getIncludeSelfInTraversalH91voCI); headNode != null && (headNode.getAggregateChildKindSet$ui_release() & m4343constructorimpl) != 0; headNode = headNode.getChild$ui_release()) {
                if ((headNode.getKindSet$ui_release() & m4343constructorimpl) != 0) {
                    DelegatingNode delegatingNode = headNode;
                    MutableVector mutableVector = null;
                    while (delegatingNode != 0) {
                        if (delegatingNode instanceof DrawModifierNode) {
                            ((DrawModifierNode) delegatingNode).onMeasureResultChanged();
                        } else if ((delegatingNode.getKindSet$ui_release() & m4343constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
                            Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                            int i10 = 0;
                            delegatingNode = delegatingNode;
                            while (delegate$ui_release != null) {
                                if ((delegate$ui_release.getKindSet$ui_release() & m4343constructorimpl) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        delegatingNode = delegate$ui_release;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (delegatingNode != 0) {
                                            mutableVector.add(delegatingNode);
                                            delegatingNode = 0;
                                        }
                                        mutableVector.add(delegate$ui_release);
                                    }
                                }
                                delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                delegatingNode = delegatingNode;
                            }
                            if (i10 == 1) {
                            }
                        }
                        delegatingNode = DelegatableNodeKt.pop(mutableVector);
                    }
                }
                if (headNode == tail) {
                    break;
                }
            }
        }
        Owner owner$ui_release = getLayoutNode().getOwner$ui_release();
        if (owner$ui_release != null) {
            owner$ui_release.onLayoutChange(getLayoutNode());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final void onMeasured() {
        Modifier.Node parent$ui_release;
        if (m4310hasNodeH91voCI(NodeKind.m4343constructorimpl(128))) {
            Snapshot createNonObservableSnapshot = Snapshot.Companion.createNonObservableSnapshot();
            try {
                Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                try {
                    int m4343constructorimpl = NodeKind.m4343constructorimpl(128);
                    boolean m4352getIncludeSelfInTraversalH91voCI = NodeKindKt.m4352getIncludeSelfInTraversalH91voCI(m4343constructorimpl);
                    if (m4352getIncludeSelfInTraversalH91voCI) {
                        parent$ui_release = getTail();
                    } else {
                        parent$ui_release = getTail().getParent$ui_release();
                        if (parent$ui_release == null) {
                            I i8 = I.f6474a;
                            createNonObservableSnapshot.restoreCurrent(makeCurrent);
                        }
                    }
                    for (Modifier.Node headNode = headNode(m4352getIncludeSelfInTraversalH91voCI); headNode != null && (headNode.getAggregateChildKindSet$ui_release() & m4343constructorimpl) != 0; headNode = headNode.getChild$ui_release()) {
                        if ((headNode.getKindSet$ui_release() & m4343constructorimpl) != 0) {
                            DelegatingNode delegatingNode = headNode;
                            MutableVector mutableVector = null;
                            while (delegatingNode != 0) {
                                if (delegatingNode instanceof LayoutAwareModifierNode) {
                                    ((LayoutAwareModifierNode) delegatingNode).mo337onRemeasuredozmzZPI(m4165getMeasuredSizeYbymL2g());
                                } else if ((delegatingNode.getKindSet$ui_release() & m4343constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                    Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                                    int i9 = 0;
                                    delegatingNode = delegatingNode;
                                    while (delegate$ui_release != null) {
                                        if ((delegate$ui_release.getKindSet$ui_release() & m4343constructorimpl) != 0) {
                                            i9++;
                                            if (i9 == 1) {
                                                delegatingNode = delegate$ui_release;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (delegatingNode != 0) {
                                                    mutableVector.add(delegatingNode);
                                                    delegatingNode = 0;
                                                }
                                                mutableVector.add(delegate$ui_release);
                                            }
                                        }
                                        delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                        delegatingNode = delegatingNode;
                                    }
                                    if (i9 == 1) {
                                    }
                                }
                                delegatingNode = DelegatableNodeKt.pop(mutableVector);
                            }
                        }
                        if (headNode == parent$ui_release) {
                            break;
                        }
                    }
                    I i82 = I.f6474a;
                    createNonObservableSnapshot.restoreCurrent(makeCurrent);
                } catch (Throwable th) {
                    createNonObservableSnapshot.restoreCurrent(makeCurrent);
                    throw th;
                }
            } finally {
                createNonObservableSnapshot.dispose();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final void onPlaced() {
        int m4343constructorimpl = NodeKind.m4343constructorimpl(128);
        boolean m4352getIncludeSelfInTraversalH91voCI = NodeKindKt.m4352getIncludeSelfInTraversalH91voCI(m4343constructorimpl);
        Modifier.Node tail = getTail();
        if (m4352getIncludeSelfInTraversalH91voCI || (tail = tail.getParent$ui_release()) != null) {
            for (Modifier.Node headNode = headNode(m4352getIncludeSelfInTraversalH91voCI); headNode != null && (headNode.getAggregateChildKindSet$ui_release() & m4343constructorimpl) != 0; headNode = headNode.getChild$ui_release()) {
                if ((headNode.getKindSet$ui_release() & m4343constructorimpl) != 0) {
                    DelegatingNode delegatingNode = headNode;
                    MutableVector mutableVector = null;
                    while (delegatingNode != 0) {
                        if (delegatingNode instanceof LayoutAwareModifierNode) {
                            ((LayoutAwareModifierNode) delegatingNode).onPlaced(this);
                        } else if ((delegatingNode.getKindSet$ui_release() & m4343constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
                            Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                            int i8 = 0;
                            delegatingNode = delegatingNode;
                            while (delegate$ui_release != null) {
                                if ((delegate$ui_release.getKindSet$ui_release() & m4343constructorimpl) != 0) {
                                    i8++;
                                    if (i8 == 1) {
                                        delegatingNode = delegate$ui_release;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (delegatingNode != 0) {
                                            mutableVector.add(delegatingNode);
                                            delegatingNode = 0;
                                        }
                                        mutableVector.add(delegate$ui_release);
                                    }
                                }
                                delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                delegatingNode = delegatingNode;
                            }
                            if (i8 == 1) {
                            }
                        }
                        delegatingNode = DelegatableNodeKt.pop(mutableVector);
                    }
                }
                if (headNode == tail) {
                    return;
                }
            }
        }
    }

    public final void onRelease() {
        this.released = true;
        this.invalidateParentLayer.invoke();
        if (this.layer != null) {
            updateLayerBlock$default(this, null, false, 2, null);
        }
    }

    public void performDraw(Canvas canvas) {
        NodeCoordinator nodeCoordinator = this.wrapped;
        if (nodeCoordinator != null) {
            nodeCoordinator.draw(canvas);
        }
    }

    /* renamed from: performingMeasure-K40F9xA */
    protected final Placeable m4326performingMeasureK40F9xA(long j8, Function0 function0) {
        m4168setMeasurementConstraintsBRTryo0(j8);
        return (Placeable) function0.invoke();
    }

    @Override // androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public void mo4132placeAtf8xVGno(long j8, float f8, Function1 function1) {
        m4314placeSelff8xVGno(j8, f8, function1);
    }

    /* renamed from: placeSelfApparentToRealOffset-f8xVGno */
    public final void m4327placeSelfApparentToRealOffsetf8xVGno(long j8, float f8, Function1 function1) {
        long m4164getApparentToRealOffsetnOccac = m4164getApparentToRealOffsetnOccac();
        m4314placeSelff8xVGno(IntOffsetKt.IntOffset(IntOffset.m5302getXimpl(j8) + IntOffset.m5302getXimpl(m4164getApparentToRealOffsetnOccac), IntOffset.m5303getYimpl(j8) + IntOffset.m5303getYimpl(m4164getApparentToRealOffsetnOccac)), f8, function1);
    }

    public final void rectInParent$ui_release(MutableRect mutableRect, boolean z8, boolean z9) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            if (this.isClipping) {
                if (z9) {
                    long m4322getMinimumTouchTargetSizeNHjbRc = m4322getMinimumTouchTargetSizeNHjbRc();
                    float m2804getWidthimpl = Size.m2804getWidthimpl(m4322getMinimumTouchTargetSizeNHjbRc) / 2.0f;
                    float m2801getHeightimpl = Size.m2801getHeightimpl(m4322getMinimumTouchTargetSizeNHjbRc) / 2.0f;
                    mutableRect.intersect(-m2804getWidthimpl, -m2801getHeightimpl, IntSize.m5344getWidthimpl(mo4138getSizeYbymL2g()) + m2804getWidthimpl, IntSize.m5343getHeightimpl(mo4138getSizeYbymL2g()) + m2801getHeightimpl);
                } else if (z8) {
                    mutableRect.intersect(0.0f, 0.0f, IntSize.m5344getWidthimpl(mo4138getSizeYbymL2g()), IntSize.m5343getHeightimpl(mo4138getSizeYbymL2g()));
                }
                if (mutableRect.isEmpty()) {
                    return;
                }
            }
            ownedLayer.mapBounds(mutableRect, false);
        }
        float m5302getXimpl = IntOffset.m5302getXimpl(mo4284getPositionnOccac());
        mutableRect.setLeft(mutableRect.getLeft() + m5302getXimpl);
        mutableRect.setRight(mutableRect.getRight() + m5302getXimpl);
        float m5303getYimpl = IntOffset.m5303getYimpl(mo4284getPositionnOccac());
        mutableRect.setTop(mutableRect.getTop() + m5303getYimpl);
        mutableRect.setBottom(mutableRect.getBottom() + m5303getYimpl);
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public void replace$ui_release() {
        mo4132placeAtf8xVGno(mo4284getPositionnOccac(), this.zIndex, this.layerBlock);
    }

    protected abstract void setLookaheadDelegate(LookaheadDelegate lookaheadDelegate);

    public void setMeasureResult$ui_release(MeasureResult measureResult) {
        MeasureResult measureResult2 = this._measureResult;
        if (measureResult != measureResult2) {
            this._measureResult = measureResult;
            if (measureResult2 == null || measureResult.getWidth() != measureResult2.getWidth() || measureResult.getHeight() != measureResult2.getHeight()) {
                onMeasureResultChanged(measureResult.getWidth(), measureResult.getHeight());
            }
            Map<AlignmentLine, Integer> map = this.oldAlignmentLines;
            if (((map != null && !map.isEmpty()) || (!measureResult.getAlignmentLines().isEmpty())) && !AbstractC3159y.d(measureResult.getAlignmentLines(), this.oldAlignmentLines)) {
                getAlignmentLinesOwner().getAlignmentLines().onAlignmentsChanged();
                Map map2 = this.oldAlignmentLines;
                if (map2 == null) {
                    map2 = new LinkedHashMap();
                    this.oldAlignmentLines = map2;
                }
                map2.clear();
                map2.putAll(measureResult.getAlignmentLines());
            }
        }
    }

    /* renamed from: setPosition--gyyYBs */
    protected void m4328setPositiongyyYBs(long j8) {
        this.position = j8;
    }

    public final void setWrapped$ui_release(NodeCoordinator nodeCoordinator) {
        this.wrapped = nodeCoordinator;
    }

    public final void setWrappedBy$ui_release(NodeCoordinator nodeCoordinator) {
        this.wrappedBy = nodeCoordinator;
    }

    protected final void setZIndex(float f8) {
        this.zIndex = f8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final boolean shouldSharePointerInputWithSiblings() {
        Modifier.Node headNode = headNode(NodeKindKt.m4352getIncludeSelfInTraversalH91voCI(NodeKind.m4343constructorimpl(16)));
        if (headNode != null && headNode.isAttached()) {
            int m4343constructorimpl = NodeKind.m4343constructorimpl(16);
            if (headNode.getNode().isAttached()) {
                Modifier.Node node = headNode.getNode();
                if ((node.getAggregateChildKindSet$ui_release() & m4343constructorimpl) != 0) {
                    for (Modifier.Node child$ui_release = node.getChild$ui_release(); child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
                        if ((child$ui_release.getKindSet$ui_release() & m4343constructorimpl) != 0) {
                            DelegatingNode delegatingNode = child$ui_release;
                            MutableVector mutableVector = null;
                            while (delegatingNode != 0) {
                                if (delegatingNode instanceof PointerInputModifierNode) {
                                    if (((PointerInputModifierNode) delegatingNode).sharePointerInputWithSiblings()) {
                                        return true;
                                    }
                                } else if ((delegatingNode.getKindSet$ui_release() & m4343constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                    Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                                    int i8 = 0;
                                    delegatingNode = delegatingNode;
                                    while (delegate$ui_release != null) {
                                        if ((delegate$ui_release.getKindSet$ui_release() & m4343constructorimpl) != 0) {
                                            i8++;
                                            if (i8 == 1) {
                                                delegatingNode = delegate$ui_release;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (delegatingNode != 0) {
                                                    mutableVector.add(delegatingNode);
                                                    delegatingNode = 0;
                                                }
                                                mutableVector.add(delegate$ui_release);
                                            }
                                        }
                                        delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                        delegatingNode = delegatingNode;
                                    }
                                    if (i8 == 1) {
                                    }
                                }
                                delegatingNode = DelegatableNodeKt.pop(mutableVector);
                            }
                        }
                    }
                }
            } else {
                throw new IllegalStateException("visitLocalDescendants called on an unattached node".toString());
            }
        }
        return false;
    }

    /* renamed from: toParentPosition-MK-Hz9U */
    public long m4329toParentPositionMKHz9U(long j8) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            j8 = ownedLayer.mo4392mapOffset8S9VItk(j8, false);
        }
        return IntOffsetKt.m5316plusNvtHpc(j8, mo4284getPositionnOccac());
    }

    public final Rect touchBoundsInRoot() {
        if (!isAttached()) {
            return Rect.Companion.getZero();
        }
        LayoutCoordinates findRootCoordinates = LayoutCoordinatesKt.findRootCoordinates(this);
        MutableRect rectCache = getRectCache();
        long m4318calculateMinimumTouchTargetPaddingE7KxVPU = m4318calculateMinimumTouchTargetPaddingE7KxVPU(m4322getMinimumTouchTargetSizeNHjbRc());
        rectCache.setLeft(-Size.m2804getWidthimpl(m4318calculateMinimumTouchTargetPaddingE7KxVPU));
        rectCache.setTop(-Size.m2801getHeightimpl(m4318calculateMinimumTouchTargetPaddingE7KxVPU));
        rectCache.setRight(getMeasuredWidth() + Size.m2804getWidthimpl(m4318calculateMinimumTouchTargetPaddingE7KxVPU));
        rectCache.setBottom(getMeasuredHeight() + Size.m2801getHeightimpl(m4318calculateMinimumTouchTargetPaddingE7KxVPU));
        NodeCoordinator nodeCoordinator = this;
        while (nodeCoordinator != findRootCoordinates) {
            nodeCoordinator.rectInParent$ui_release(rectCache, false, true);
            if (rectCache.isEmpty()) {
                return Rect.Companion.getZero();
            }
            nodeCoordinator = nodeCoordinator.wrappedBy;
            AbstractC3159y.f(nodeCoordinator);
        }
        return MutableRectKt.toRect(rectCache);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: transformFrom-EL8BTi8 */
    public void mo4142transformFromEL8BTi8(LayoutCoordinates layoutCoordinates, float[] fArr) {
        NodeCoordinator coordinator = toCoordinator(layoutCoordinates);
        coordinator.onCoordinatesUsed$ui_release();
        NodeCoordinator findCommonAncestor$ui_release = findCommonAncestor$ui_release(coordinator);
        Matrix.m3191resetimpl(fArr);
        coordinator.m4317transformToAncestorEL8BTi8(findCommonAncestor$ui_release, fArr);
        m4316transformFromAncestorEL8BTi8(findCommonAncestor$ui_release, fArr);
    }

    public final void updateLayerBlock(Function1 function1, boolean z8) {
        boolean z9;
        Owner owner$ui_release;
        LayoutNode layoutNode = getLayoutNode();
        if (!z8 && this.layerBlock == function1 && AbstractC3159y.d(this.layerDensity, layoutNode.getDensity()) && this.layerLayoutDirection == layoutNode.getLayoutDirection()) {
            z9 = false;
        } else {
            z9 = true;
        }
        this.layerBlock = function1;
        this.layerDensity = layoutNode.getDensity();
        this.layerLayoutDirection = layoutNode.getLayoutDirection();
        if (layoutNode.isAttached() && function1 != null) {
            if (this.layer == null) {
                OwnedLayer createLayer = LayoutNodeKt.requireOwner(layoutNode).createLayer(this.drawBlock, this.invalidateParentLayer);
                createLayer.mo4394resizeozmzZPI(m4165getMeasuredSizeYbymL2g());
                createLayer.mo4393movegyyYBs(mo4284getPositionnOccac());
                this.layer = createLayer;
                updateLayerParameters$default(this, false, 1, null);
                layoutNode.setInnerLayerCoordinatorIsDirty$ui_release(true);
                this.invalidateParentLayer.invoke();
                return;
            }
            if (z9) {
                updateLayerParameters$default(this, false, 1, null);
                return;
            }
            return;
        }
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.destroy();
            layoutNode.setInnerLayerCoordinatorIsDirty$ui_release(true);
            this.invalidateParentLayer.invoke();
            if (isAttached() && (owner$ui_release = layoutNode.getOwner$ui_release()) != null) {
                owner$ui_release.onLayoutChange(layoutNode);
            }
        }
        this.layer = null;
        this.lastLayerDrawingWasSkipped = false;
    }

    public final void visitNodes(int i8, boolean z8, Function1 function1) {
        Modifier.Node tail = getTail();
        if (z8 || (tail = tail.getParent$ui_release()) != null) {
            for (Modifier.Node headNode = headNode(z8); headNode != null && (headNode.getAggregateChildKindSet$ui_release() & i8) != 0; headNode = headNode.getChild$ui_release()) {
                if ((headNode.getKindSet$ui_release() & i8) != 0) {
                    function1.invoke(headNode);
                }
                if (headNode == tail) {
                    return;
                }
            }
        }
    }

    /* renamed from: visitNodes-aLcG6gQ */
    public final /* synthetic */ <T> void m4330visitNodesaLcG6gQ(int i8, Function1 function1) {
        boolean m4352getIncludeSelfInTraversalH91voCI = NodeKindKt.m4352getIncludeSelfInTraversalH91voCI(i8);
        Modifier.Node tail = getTail();
        if (m4352getIncludeSelfInTraversalH91voCI || (tail = tail.getParent$ui_release()) != null) {
            for (Modifier.Node headNode = headNode(m4352getIncludeSelfInTraversalH91voCI); headNode != null && (headNode.getAggregateChildKindSet$ui_release() & i8) != 0; headNode = headNode.getChild$ui_release()) {
                if ((headNode.getKindSet$ui_release() & i8) != 0) {
                    for (Modifier.Node node = headNode; node != null; node = DelegatableNodeKt.pop(null)) {
                        AbstractC3159y.n(3, ExifInterface.GPS_DIRECTION_TRUE);
                        function1.invoke(node);
                    }
                }
                if (headNode == tail) {
                    return;
                }
            }
        }
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: windowToLocal-MK-Hz9U */
    public long mo4143windowToLocalMKHz9U(long j8) {
        if (isAttached()) {
            LayoutCoordinates findRootCoordinates = LayoutCoordinatesKt.findRootCoordinates(this);
            return mo4139localPositionOfR5De75A(findRootCoordinates, Offset.m2739minusMKHz9U(LayoutNodeKt.requireOwner(getLayoutNode()).mo4396calculateLocalPositionMKHz9U(j8), LayoutCoordinatesKt.positionInRoot(findRootCoordinates)));
        }
        throw new IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
    }

    protected final void withPositionTranslation(Canvas canvas, Function1 function1) {
        float m5302getXimpl = IntOffset.m5302getXimpl(mo4284getPositionnOccac());
        float m5303getYimpl = IntOffset.m5303getYimpl(mo4284getPositionnOccac());
        canvas.translate(m5302getXimpl, m5303getYimpl);
        function1.invoke(canvas);
        canvas.translate(-m5302getXimpl, -m5303getYimpl);
    }

    /* renamed from: withinLayerBounds-k-4lQ0M */
    public final boolean m4331withinLayerBoundsk4lQ0M(long j8) {
        if (!OffsetKt.m2752isFinitek4lQ0M(j8)) {
            return false;
        }
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null && this.isClipping && !ownedLayer.mo4391isInLayerk4lQ0M(j8)) {
            return false;
        }
        return true;
    }
}
