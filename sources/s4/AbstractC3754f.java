package s4;

import L5.I;
import L5.r;
import L5.s;
import L5.t;
import X5.n;
import X5.o;
import X5.p;
import android.graphics.Bitmap;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import i6.M;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import s4.AbstractC3757i;

/* renamed from: s4.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3754f {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s4.f$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f37879a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f37880b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Painter f37881c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C3755g f37882d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ o f37883e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ o f37884f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f37885g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f37886h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Alignment f37887i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ContentScale f37888j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ ColorFilter f37889k;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: s4.f$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0876a extends l implements n {

            /* renamed from: a, reason: collision with root package name */
            int f37890a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C3755g f37891b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f37892c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f37893d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f37894e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ MutableState f37895f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0876a(C3755g c3755g, String str, int i8, int i9, MutableState mutableState, P5.d dVar) {
                super(2, dVar);
                this.f37891b = c3755g;
                this.f37892c = str;
                this.f37893d = i8;
                this.f37894e = i9;
                this.f37895f = mutableState;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new C0876a(this.f37891b, this.f37892c, this.f37893d, this.f37894e, this.f37895f, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((C0876a) create(m8, dVar)).invokeSuspend(I.f6474a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object g8;
                Bitmap bitmap;
                Object e8 = Q5.b.e();
                int i8 = this.f37890a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                        g8 = ((s) obj).k();
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    C3755g c3755g = this.f37891b;
                    String str = this.f37892c;
                    int i9 = this.f37893d;
                    int i10 = this.f37894e;
                    this.f37890a = 1;
                    g8 = c3755g.g(str, i9, i10, this);
                    if (g8 == e8) {
                        return e8;
                    }
                }
                MutableState mutableState = this.f37895f;
                if (s.h(g8) && (bitmap = (Bitmap) g8) != null) {
                    mutableState.setValue(new AbstractC3757i.c(new BitmapPainter(AndroidImageBitmap_androidKt.asImageBitmap(bitmap), 0L, 0L, 6, null)));
                }
                MutableState mutableState2 = this.f37895f;
                if (s.e(g8) != null) {
                    mutableState2.setValue(AbstractC3757i.a.f37965a);
                }
                return I.f6474a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: s4.f$a$b */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f37896a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(boolean z8) {
                super(1);
                this.f37896a = z8;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(AbstractC3757i targetState) {
                AbstractC3159y.i(targetState, "targetState");
                if (this.f37896a) {
                    return Boolean.TRUE;
                }
                return targetState;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: s4.f$a$c */
        /* loaded from: classes4.dex */
        public static final class c extends AbstractC3160z implements p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ o f37897a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ BoxWithConstraintsScope f37898b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ o f37899c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Modifier f37900d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f37901e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Alignment f37902f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ ContentScale f37903g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ ColorFilter f37904h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(o oVar, BoxWithConstraintsScope boxWithConstraintsScope, o oVar2, Modifier modifier, String str, Alignment alignment, ContentScale contentScale, ColorFilter colorFilter) {
                super(4);
                this.f37897a = oVar;
                this.f37898b = boxWithConstraintsScope;
                this.f37899c = oVar2;
                this.f37900d = modifier;
                this.f37901e = str;
                this.f37902f = alignment;
                this.f37903g = contentScale;
                this.f37904h = colorFilter;
            }

            public final void a(AnimatedContentScope AnimatedContent, AbstractC3757i it, Composer composer, int i8) {
                AbstractC3159y.i(AnimatedContent, "$this$AnimatedContent");
                AbstractC3159y.i(it, "it");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1707989893, i8, -1, "com.stripe.android.uicore.image.StripeImage.<anonymous>.<anonymous> (StripeImage.kt:95)");
                }
                if (AbstractC3159y.d(it, AbstractC3757i.a.f37965a)) {
                    composer.startReplaceableGroup(-1892467073);
                    this.f37897a.invoke(this.f37898b, composer, 0);
                    composer.endReplaceableGroup();
                } else if (AbstractC3159y.d(it, AbstractC3757i.b.f37966a)) {
                    composer.startReplaceableGroup(-1892465727);
                    this.f37899c.invoke(this.f37898b, composer, 0);
                    composer.endReplaceableGroup();
                } else if (it instanceof AbstractC3757i.c) {
                    composer.startReplaceableGroup(1463161246);
                    ImageKt.Image(((AbstractC3757i.c) it).a(), this.f37901e, TestTagKt.testTag(this.f37900d, "StripeImageFromUrl"), this.f37902f, this.f37903g, 0.0f, this.f37904h, composer, 8, 32);
                    composer.endReplaceableGroup();
                } else {
                    composer.startReplaceableGroup(1463500913);
                    composer.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // X5.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                a((AnimatedContentScope) obj, (AbstractC3757i) obj2, (Composer) obj3, ((Number) obj4).intValue());
                return I.f6474a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, boolean z8, Painter painter, C3755g c3755g, o oVar, o oVar2, Modifier modifier, String str2, Alignment alignment, ContentScale contentScale, ColorFilter colorFilter) {
            super(3);
            this.f37879a = str;
            this.f37880b = z8;
            this.f37881c = painter;
            this.f37882d = c3755g;
            this.f37883e = oVar;
            this.f37884f = oVar2;
            this.f37885g = modifier;
            this.f37886h = str2;
            this.f37887i = alignment;
            this.f37888j = contentScale;
            this.f37889k = colorFilter;
        }

        @Override // X5.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f6474a;
        }

        public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i8) {
            int i9;
            AbstractC3159y.i(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((i8 & 14) == 0) {
                i9 = i8 | (composer.changed(BoxWithConstraints) ? 4 : 2);
            } else {
                i9 = i8;
            }
            if ((i9 & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1632138495, i9, -1, "com.stripe.android.uicore.image.StripeImage.<anonymous> (StripeImage.kt:61)");
            }
            boolean booleanValue = ((Boolean) composer.consume(InspectionModeKt.getLocalInspectionMode())).booleanValue();
            r c8 = AbstractC3754f.c(BoxWithConstraints);
            int intValue = ((Number) c8.a()).intValue();
            int intValue2 = ((Number) c8.b()).intValue();
            composer.startReplaceableGroup(-406660964);
            Painter painter = this.f37881c;
            Object rememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = (!booleanValue || painter == null) ? SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(AbstractC3757i.b.f37966a, null, 2, null) : SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new AbstractC3757i.c(painter), null, 2, null);
                composer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            composer.endReplaceableGroup();
            String str = this.f37879a;
            EffectsKt.LaunchedEffect(str, new C0876a(this.f37882d, str, intValue, intValue2, mutableState, null), composer, 64);
            Object value = mutableState.getValue();
            composer.startReplaceableGroup(-406637573);
            boolean changed = composer.changed(this.f37880b);
            boolean z8 = this.f37880b;
            Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new b(z8);
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            AnimatedContentKt.AnimatedContent(value, null, null, null, "loading_image_animation", (Function1) rememberedValue2, ComposableLambdaKt.composableLambda(composer, 1707989893, true, new c(this.f37883e, BoxWithConstraints, this.f37884f, this.f37885g, this.f37886h, this.f37887i, this.f37888j, this.f37889k)), composer, 1597440, 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s4.f$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f37905a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3755g f37906b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f37907c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f37908d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ContentScale f37909e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ColorFilter f37910f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Painter f37911g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Alignment f37912h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f37913i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ o f37914j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ o f37915k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f37916l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f37917m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f37918n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, C3755g c3755g, String str2, Modifier modifier, ContentScale contentScale, ColorFilter colorFilter, Painter painter, Alignment alignment, boolean z8, o oVar, o oVar2, int i8, int i9, int i10) {
            super(2);
            this.f37905a = str;
            this.f37906b = c3755g;
            this.f37907c = str2;
            this.f37908d = modifier;
            this.f37909e = contentScale;
            this.f37910f = colorFilter;
            this.f37911g = painter;
            this.f37912h = alignment;
            this.f37913i = z8;
            this.f37914j = oVar;
            this.f37915k = oVar2;
            this.f37916l = i8;
            this.f37917m = i9;
            this.f37918n = i10;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6474a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC3754f.a(this.f37905a, this.f37906b, this.f37907c, this.f37908d, this.f37909e, this.f37910f, this.f37911g, this.f37912h, this.f37913i, this.f37914j, this.f37915k, composer, RecomposeScopeImplKt.updateChangedFlags(this.f37916l | 1), RecomposeScopeImplKt.updateChangedFlags(this.f37917m), this.f37918n);
        }
    }

    public static final void a(String url, C3755g imageLoader, String str, Modifier modifier, ContentScale contentScale, ColorFilter colorFilter, Painter painter, Alignment alignment, boolean z8, o oVar, o oVar2, Composer composer, int i8, int i9, int i10) {
        AbstractC3159y.i(url, "url");
        AbstractC3159y.i(imageLoader, "imageLoader");
        Composer startRestartGroup = composer.startRestartGroup(464230935);
        Modifier modifier2 = (i10 & 8) != 0 ? Modifier.Companion : modifier;
        ContentScale fit = (i10 & 16) != 0 ? ContentScale.Companion.getFit() : contentScale;
        ColorFilter colorFilter2 = (i10 & 32) != 0 ? null : colorFilter;
        Painter painter2 = (i10 & 64) != 0 ? null : painter;
        Alignment center = (i10 & 128) != 0 ? Alignment.Companion.getCenter() : alignment;
        boolean z9 = (i10 & 256) != 0 ? false : z8;
        o a8 = (i10 & 512) != 0 ? C3749a.f37845a.a() : oVar;
        o b8 = (i10 & 1024) != 0 ? C3749a.f37845a.b() : oVar2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(464230935, i8, i9, "com.stripe.android.uicore.image.StripeImage (StripeImage.kt:59)");
        }
        BoxWithConstraintsKt.BoxWithConstraints(null, null, false, ComposableLambdaKt.composableLambda(startRestartGroup, -1632138495, true, new a(url, z9, painter2, imageLoader, a8, b8, modifier2, str, center, fit, colorFilter2)), startRestartGroup, 3072, 7);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new b(url, imageLoader, str, modifier2, fit, colorFilter2, painter2, center, z9, a8, b8, i8, i9, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r c(BoxWithConstraintsScope boxWithConstraintsScope) {
        int i8;
        int i9;
        int m5146getMaxWidthimpl = Constraints.m5146getMaxWidthimpl(boxWithConstraintsScope.mo538getConstraintsmsEJaDk());
        IntSize.Companion companion = IntSize.Companion;
        if (m5146getMaxWidthimpl > IntSize.m5344getWidthimpl(companion.m5349getZeroYbymL2g()) && Constraints.m5146getMaxWidthimpl(boxWithConstraintsScope.mo538getConstraintsmsEJaDk()) < ((int) Dp.Companion.m5197getInfinityD9Ej5fM())) {
            i8 = Constraints.m5146getMaxWidthimpl(boxWithConstraintsScope.mo538getConstraintsmsEJaDk());
        } else {
            i8 = -1;
        }
        if (Constraints.m5145getMaxHeightimpl(boxWithConstraintsScope.mo538getConstraintsmsEJaDk()) > IntSize.m5343getHeightimpl(companion.m5349getZeroYbymL2g()) && Constraints.m5145getMaxHeightimpl(boxWithConstraintsScope.mo538getConstraintsmsEJaDk()) < ((int) Dp.Companion.m5197getInfinityD9Ej5fM())) {
            i9 = Constraints.m5145getMaxHeightimpl(boxWithConstraintsScope.mo538getConstraintsmsEJaDk());
        } else {
            i9 = -1;
        }
        if (i8 == -1) {
            i8 = i9;
        }
        if (i9 == -1) {
            i9 = i8;
        }
        return new r(Integer.valueOf(i8), Integer.valueOf(i9));
    }
}
