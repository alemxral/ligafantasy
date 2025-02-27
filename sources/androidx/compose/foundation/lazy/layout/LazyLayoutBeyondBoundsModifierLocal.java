package androidx.compose.foundation.lazy.layout;

import L5.C1224h;
import L5.p;
import X5.n;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.layout.BeyondBoundsLayoutKt;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.T;

/* loaded from: classes.dex */
public final class LazyLayoutBeyondBoundsModifierLocal implements ModifierLocalProvider<BeyondBoundsLayout>, BeyondBoundsLayout {
    public static final Companion Companion = new Companion(null);
    private static final LazyLayoutBeyondBoundsModifierLocal$Companion$emptyBeyondBoundsScope$1 emptyBeyondBoundsScope = new BeyondBoundsLayout.BeyondBoundsScope() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocal$Companion$emptyBeyondBoundsScope$1
        private final boolean hasMoreContent;

        @Override // androidx.compose.ui.layout.BeyondBoundsLayout.BeyondBoundsScope
        public boolean getHasMoreContent() {
            return this.hasMoreContent;
        }
    };
    private final LazyLayoutBeyondBoundsInfo beyondBoundsInfo;
    private final LayoutDirection layoutDirection;
    private final Orientation orientation;
    private final boolean reverseLayout;
    private final LazyLayoutBeyondBoundsState state;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public LazyLayoutBeyondBoundsModifierLocal(LazyLayoutBeyondBoundsState state, LazyLayoutBeyondBoundsInfo beyondBoundsInfo, boolean z8, LayoutDirection layoutDirection, Orientation orientation) {
        AbstractC3159y.i(state, "state");
        AbstractC3159y.i(beyondBoundsInfo, "beyondBoundsInfo");
        AbstractC3159y.i(layoutDirection, "layoutDirection");
        AbstractC3159y.i(orientation, "orientation");
        this.state = state;
        this.beyondBoundsInfo = beyondBoundsInfo;
        this.reverseLayout = z8;
        this.layoutDirection = layoutDirection;
        this.orientation = orientation;
    }

    /* renamed from: addNextInterval-FR3nfPY, reason: not valid java name */
    private final LazyLayoutBeyondBoundsInfo.Interval m748addNextIntervalFR3nfPY(LazyLayoutBeyondBoundsInfo.Interval interval, int i8) {
        int start = interval.getStart();
        int end = interval.getEnd();
        if (m750isForward4vf7U8o(i8)) {
            end++;
        } else {
            start--;
        }
        return this.beyondBoundsInfo.addInterval(start, end);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hasMoreContent-FR3nfPY, reason: not valid java name */
    public final boolean m749hasMoreContentFR3nfPY(LazyLayoutBeyondBoundsInfo.Interval interval, int i8) {
        if (m751isOppositeToOrientation4vf7U8o(i8)) {
            return false;
        }
        if (m750isForward4vf7U8o(i8)) {
            if (interval.getEnd() >= this.state.getItemCount() - 1) {
                return false;
            }
        } else if (interval.getStart() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: isForward-4vf7U8o, reason: not valid java name */
    private final boolean m750isForward4vf7U8o(int i8) {
        BeyondBoundsLayout.LayoutDirection.Companion companion = BeyondBoundsLayout.LayoutDirection.Companion;
        if (BeyondBoundsLayout.LayoutDirection.m4111equalsimpl0(i8, companion.m4117getBeforehoxUOeE())) {
            return false;
        }
        if (!BeyondBoundsLayout.LayoutDirection.m4111equalsimpl0(i8, companion.m4116getAfterhoxUOeE())) {
            if (BeyondBoundsLayout.LayoutDirection.m4111equalsimpl0(i8, companion.m4115getAbovehoxUOeE())) {
                return this.reverseLayout;
            }
            if (BeyondBoundsLayout.LayoutDirection.m4111equalsimpl0(i8, companion.m4118getBelowhoxUOeE())) {
                if (this.reverseLayout) {
                    return false;
                }
            } else if (BeyondBoundsLayout.LayoutDirection.m4111equalsimpl0(i8, companion.m4119getLefthoxUOeE())) {
                int i9 = WhenMappings.$EnumSwitchMapping$0[this.layoutDirection.ordinal()];
                if (i9 != 1) {
                    if (i9 == 2) {
                        if (this.reverseLayout) {
                            return false;
                        }
                    } else {
                        throw new p();
                    }
                } else {
                    return this.reverseLayout;
                }
            } else {
                if (!BeyondBoundsLayout.LayoutDirection.m4111equalsimpl0(i8, companion.m4120getRighthoxUOeE())) {
                    LazyLayoutBeyondBoundsModifierLocalKt.unsupportedDirection();
                    throw new C1224h();
                }
                int i10 = WhenMappings.$EnumSwitchMapping$0[this.layoutDirection.ordinal()];
                if (i10 != 1) {
                    if (i10 == 2) {
                        return this.reverseLayout;
                    }
                    throw new p();
                }
                if (this.reverseLayout) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: isOppositeToOrientation-4vf7U8o, reason: not valid java name */
    private final boolean m751isOppositeToOrientation4vf7U8o(int i8) {
        boolean m4111equalsimpl0;
        boolean m4111equalsimpl02;
        BeyondBoundsLayout.LayoutDirection.Companion companion = BeyondBoundsLayout.LayoutDirection.Companion;
        boolean z8 = true;
        if (BeyondBoundsLayout.LayoutDirection.m4111equalsimpl0(i8, companion.m4115getAbovehoxUOeE())) {
            m4111equalsimpl0 = true;
        } else {
            m4111equalsimpl0 = BeyondBoundsLayout.LayoutDirection.m4111equalsimpl0(i8, companion.m4118getBelowhoxUOeE());
        }
        if (m4111equalsimpl0) {
            if (this.orientation == Orientation.Horizontal) {
                return true;
            }
        } else {
            if (BeyondBoundsLayout.LayoutDirection.m4111equalsimpl0(i8, companion.m4119getLefthoxUOeE())) {
                m4111equalsimpl02 = true;
            } else {
                m4111equalsimpl02 = BeyondBoundsLayout.LayoutDirection.m4111equalsimpl0(i8, companion.m4120getRighthoxUOeE());
            }
            if (m4111equalsimpl02) {
                if (this.orientation == Orientation.Vertical) {
                    return true;
                }
            } else {
                if (!BeyondBoundsLayout.LayoutDirection.m4111equalsimpl0(i8, companion.m4117getBeforehoxUOeE())) {
                    z8 = BeyondBoundsLayout.LayoutDirection.m4111equalsimpl0(i8, companion.m4116getAfterhoxUOeE());
                }
                if (!z8) {
                    LazyLayoutBeyondBoundsModifierLocalKt.unsupportedDirection();
                    throw new C1224h();
                }
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean all(Function1 function1) {
        return androidx.compose.ui.b.a(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean any(Function1 function1) {
        return androidx.compose.ui.b.b(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldIn(Object obj, n nVar) {
        return androidx.compose.ui.b.c(this, obj, nVar);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldOut(Object obj, n nVar) {
        return androidx.compose.ui.b.d(this, obj, nVar);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public ProvidableModifierLocal<BeyondBoundsLayout> getKey() {
        return BeyondBoundsLayoutKt.getModifierLocalBeyondBoundsLayout();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public BeyondBoundsLayout getValue() {
        return this;
    }

    @Override // androidx.compose.ui.layout.BeyondBoundsLayout
    /* renamed from: layout-o7g1Pn8, reason: not valid java name */
    public <T> T mo752layouto7g1Pn8(final int i8, Function1 block) {
        int firstPlacedIndex;
        AbstractC3159y.i(block, "block");
        if (this.state.getItemCount() > 0 && this.state.getHasVisibleItems()) {
            if (m750isForward4vf7U8o(i8)) {
                firstPlacedIndex = this.state.getLastPlacedIndex();
            } else {
                firstPlacedIndex = this.state.getFirstPlacedIndex();
            }
            final T t8 = new T();
            t8.f33747a = this.beyondBoundsInfo.addInterval(firstPlacedIndex, firstPlacedIndex);
            T t9 = null;
            while (t9 == null && m749hasMoreContentFR3nfPY((LazyLayoutBeyondBoundsInfo.Interval) t8.f33747a, i8)) {
                LazyLayoutBeyondBoundsInfo.Interval m748addNextIntervalFR3nfPY = m748addNextIntervalFR3nfPY((LazyLayoutBeyondBoundsInfo.Interval) t8.f33747a, i8);
                this.beyondBoundsInfo.removeInterval((LazyLayoutBeyondBoundsInfo.Interval) t8.f33747a);
                t8.f33747a = m748addNextIntervalFR3nfPY;
                this.state.remeasure();
                t9 = (T) block.invoke(new BeyondBoundsLayout.BeyondBoundsScope() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocal$layout$2
                    @Override // androidx.compose.ui.layout.BeyondBoundsLayout.BeyondBoundsScope
                    public boolean getHasMoreContent() {
                        boolean m749hasMoreContentFR3nfPY;
                        m749hasMoreContentFR3nfPY = LazyLayoutBeyondBoundsModifierLocal.this.m749hasMoreContentFR3nfPY((LazyLayoutBeyondBoundsInfo.Interval) t8.f33747a, i8);
                        return m749hasMoreContentFR3nfPY;
                    }
                });
            }
            this.beyondBoundsInfo.removeInterval((LazyLayoutBeyondBoundsInfo.Interval) t8.f33747a);
            this.state.remeasure();
            return t9;
        }
        return (T) block.invoke(emptyBeyondBoundsScope);
    }

    @Override // androidx.compose.ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return androidx.compose.ui.a.a(this, modifier);
    }
}
