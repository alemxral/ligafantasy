package androidx.compose.foundation.text;

import L5.I;
import L5.t;
import P5.d;
import Q5.b;
import X5.n;
import X5.o;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.c;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import d6.m;
import i6.AbstractC2825i;
import i6.M;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TextFieldCursorKt$cursor$1 extends AbstractC3160z implements o {
    final /* synthetic */ Brush $cursorBrush;
    final /* synthetic */ OffsetMapping $offsetMapping;
    final /* synthetic */ TextFieldState $state;
    final /* synthetic */ TextFieldValue $value;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1", f = "TextFieldCursor.kt", l = {51}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends l implements n {
        final /* synthetic */ Animatable<Float, AnimationVector1D> $cursorAlpha;
        int label;

        /* JADX INFO: Access modifiers changed from: package-private */
        @f(c = "androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1$1", f = "TextFieldCursor.kt", l = {53, 55}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C03011 extends l implements n {
            final /* synthetic */ Animatable<Float, AnimationVector1D> $cursorAlpha;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03011(Animatable<Float, AnimationVector1D> animatable, d dVar) {
                super(2, dVar);
                this.$cursorAlpha = animatable;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new C03011(this.$cursorAlpha, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, d dVar) {
                return ((C03011) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AnimationSpec animationSpec;
                Object e8 = b.e();
                int i8 = this.label;
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 == 2) {
                            t.b(obj);
                            return I.f6474a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                } else {
                    t.b(obj);
                    Animatable<Float, AnimationVector1D> animatable = this.$cursorAlpha;
                    Float b8 = kotlin.coroutines.jvm.internal.b.b(1.0f);
                    this.label = 1;
                    if (animatable.snapTo(b8, this) == e8) {
                        return e8;
                    }
                }
                Animatable<Float, AnimationVector1D> animatable2 = this.$cursorAlpha;
                Float b9 = kotlin.coroutines.jvm.internal.b.b(0.0f);
                animationSpec = TextFieldCursorKt.cursorAnimationSpec;
                this.label = 2;
                if (Animatable.animateTo$default(animatable2, b9, animationSpec, null, null, this, 12, null) == e8) {
                    return e8;
                }
                return I.f6474a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Animatable<Float, AnimationVector1D> animatable, d dVar) {
            super(2, dVar);
            this.$cursorAlpha = animatable;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new AnonymousClass1(this.$cursorAlpha, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, d dVar) {
            return ((AnonymousClass1) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = b.e();
            int i8 = this.label;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                FixedMotionDurationScale fixedMotionDurationScale = FixedMotionDurationScale.INSTANCE;
                C03011 c03011 = new C03011(this.$cursorAlpha, null);
                this.label = 1;
                if (AbstractC2825i.g(fixedMotionDurationScale, c03011, this) == e8) {
                    return e8;
                }
            }
            return I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends AbstractC3160z implements Function1 {
        final /* synthetic */ Animatable<Float, AnimationVector1D> $cursorAlpha;
        final /* synthetic */ Brush $cursorBrush;
        final /* synthetic */ OffsetMapping $offsetMapping;
        final /* synthetic */ TextFieldState $state;
        final /* synthetic */ TextFieldValue $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Animatable<Float, AnimationVector1D> animatable, OffsetMapping offsetMapping, TextFieldValue textFieldValue, TextFieldState textFieldState, Brush brush) {
            super(1);
            this.$cursorAlpha = animatable;
            this.$offsetMapping = offsetMapping;
            this.$value = textFieldValue;
            this.$state = textFieldState;
            this.$cursorBrush = brush;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ContentDrawScope) obj);
            return I.f6474a;
        }

        public final void invoke(ContentDrawScope drawWithContent) {
            Rect rect;
            TextLayoutResult value;
            AbstractC3159y.i(drawWithContent, "$this$drawWithContent");
            drawWithContent.drawContent();
            float j8 = m.j(this.$cursorAlpha.getValue().floatValue(), 0.0f, 1.0f);
            if (j8 == 0.0f) {
                return;
            }
            int originalToTransformed = this.$offsetMapping.originalToTransformed(TextRange.m4692getStartimpl(this.$value.m4929getSelectiond9O1mEE()));
            TextLayoutResultProxy layoutResult = this.$state.getLayoutResult();
            if (layoutResult == null || (value = layoutResult.getValue()) == null || (rect = value.getCursorRect(originalToTransformed)) == null) {
                rect = new Rect(0.0f, 0.0f, 0.0f, 0.0f);
            }
            float mo448toPx0680j_4 = drawWithContent.mo448toPx0680j_4(TextFieldCursorKt.getDefaultCursorThickness());
            float f8 = mo448toPx0680j_4 / 2;
            float f9 = m.f(rect.getLeft() + f8, Size.m2804getWidthimpl(drawWithContent.mo3414getSizeNHjbRc()) - f8);
            c.B(drawWithContent, this.$cursorBrush, OffsetKt.Offset(f9, rect.getTop()), OffsetKt.Offset(f9, rect.getBottom()), mo448toPx0680j_4, 0, null, j8, null, 0, 432, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldCursorKt$cursor$1(Brush brush, TextFieldState textFieldState, TextFieldValue textFieldValue, OffsetMapping offsetMapping) {
        super(3);
        this.$cursorBrush = brush;
        this.$state = textFieldState;
        this.$value = textFieldValue;
        this.$offsetMapping = offsetMapping;
    }

    @Override // X5.o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    public final Modifier invoke(Modifier composed, Composer composer, int i8) {
        Modifier modifier;
        AbstractC3159y.i(composed, "$this$composed");
        composer.startReplaceableGroup(1634330012);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1634330012, i8, -1, "androidx.compose.foundation.text.cursor.<anonymous> (TextFieldCursor.kt:44)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = AnimatableKt.Animatable$default(1.0f, 0.0f, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Animatable animatable = (Animatable) rememberedValue;
        Brush brush = this.$cursorBrush;
        boolean z8 = ((brush instanceof SolidColor) && ((SolidColor) brush).m3283getValue0d7_KjU() == Color.Companion.m3007getUnspecified0d7_KjU()) ? false : true;
        if (this.$state.getHasFocus() && TextRange.m4686getCollapsedimpl(this.$value.m4929getSelectiond9O1mEE()) && z8) {
            EffectsKt.LaunchedEffect(this.$value.getAnnotatedString(), TextRange.m4680boximpl(this.$value.m4929getSelectiond9O1mEE()), new AnonymousClass1(animatable, null), composer, 512);
            modifier = DrawModifierKt.drawWithContent(composed, new AnonymousClass2(animatable, this.$offsetMapping, this.$value, this.$state, this.$cursorBrush));
        } else {
            modifier = Modifier.Companion;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return modifier;
    }
}
