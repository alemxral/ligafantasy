package androidx.compose.foundation.gestures;

import L5.I;
import X5.n;
import X5.o;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import i6.M;
import k6.g;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.T;

/* loaded from: classes.dex */
final class TransformableKt$transformable$3 extends AbstractC3160z implements o {
    final /* synthetic */ Function0 $canPan;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ boolean $lockRotationOnZoomPan;
    final /* synthetic */ TransformableState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.foundation.gestures.TransformableKt$transformable$3$1", f = "Transformable.kt", l = {105, 108}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.TransformableKt$transformable$3$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends l implements n {
        final /* synthetic */ k6.d $channel;
        final /* synthetic */ TransformableState $state;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX INFO: Access modifiers changed from: package-private */
        @f(c = "androidx.compose.foundation.gestures.TransformableKt$transformable$3$1$1", f = "Transformable.kt", l = {113}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.TransformableKt$transformable$3$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C02931 extends l implements n {
            final /* synthetic */ k6.d $channel;
            final /* synthetic */ T $event;
            private /* synthetic */ Object L$0;
            Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02931(T t8, k6.d dVar, P5.d dVar2) {
                super(2, dVar2);
                this.$event = t8;
                this.$channel = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                C02931 c02931 = new C02931(this.$event, this.$channel, dVar);
                c02931.L$0 = obj;
                return c02931;
            }

            @Override // X5.n
            public final Object invoke(TransformScope transformScope, P5.d dVar) {
                return ((C02931) create(transformScope, dVar)).invokeSuspend(I.f6474a);
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0056 -> B:5:0x0059). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    java.lang.Object r0 = Q5.b.e()
                    int r1 = r6.label
                    r2 = 1
                    if (r1 == 0) goto L1f
                    if (r1 != r2) goto L17
                    java.lang.Object r1 = r6.L$1
                    kotlin.jvm.internal.T r1 = (kotlin.jvm.internal.T) r1
                    java.lang.Object r3 = r6.L$0
                    androidx.compose.foundation.gestures.TransformScope r3 = (androidx.compose.foundation.gestures.TransformScope) r3
                    L5.t.b(r7)
                    goto L59
                L17:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L1f:
                    L5.t.b(r7)
                    java.lang.Object r7 = r6.L$0
                    androidx.compose.foundation.gestures.TransformScope r7 = (androidx.compose.foundation.gestures.TransformScope) r7
                    r3 = r7
                L27:
                    kotlin.jvm.internal.T r7 = r6.$event
                    java.lang.Object r7 = r7.f33747a
                    boolean r1 = r7 instanceof androidx.compose.foundation.gestures.TransformEvent.TransformStopped
                    if (r1 != 0) goto L5c
                    boolean r1 = r7 instanceof androidx.compose.foundation.gestures.TransformEvent.TransformDelta
                    if (r1 == 0) goto L36
                    androidx.compose.foundation.gestures.TransformEvent$TransformDelta r7 = (androidx.compose.foundation.gestures.TransformEvent.TransformDelta) r7
                    goto L37
                L36:
                    r7 = 0
                L37:
                    if (r7 == 0) goto L48
                    float r1 = r7.getZoomChange()
                    long r4 = r7.m474getPanChangeF1C5BW0()
                    float r7 = r7.getRotationChange()
                    r3.mo378transformByd4ec7I(r1, r4, r7)
                L48:
                    kotlin.jvm.internal.T r1 = r6.$event
                    k6.d r7 = r6.$channel
                    r6.L$0 = r3
                    r6.L$1 = r1
                    r6.label = r2
                    java.lang.Object r7 = r7.z(r6)
                    if (r7 != r0) goto L59
                    return r0
                L59:
                    r1.f33747a = r7
                    goto L27
                L5c:
                    L5.I r7 = L5.I.f6474a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableKt$transformable$3.AnonymousClass1.C02931.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(k6.d dVar, TransformableState transformableState, P5.d dVar2) {
            super(2, dVar2);
            this.$channel = dVar;
            this.$state = transformableState;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$channel, this.$state, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((AnonymousClass1) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x007b -> B:9:0x0038). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = Q5.b.e()
                int r1 = r9.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L31
                if (r1 == r3) goto L21
                if (r1 != r2) goto L19
                java.lang.Object r1 = r9.L$0
                i6.M r1 = (i6.M) r1
                L5.t.b(r10)     // Catch: java.util.concurrent.CancellationException -> L17
            L15:
                r10 = r1
                goto L38
            L17:
                goto L15
            L19:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L21:
                java.lang.Object r1 = r9.L$2
                kotlin.jvm.internal.T r1 = (kotlin.jvm.internal.T) r1
                java.lang.Object r4 = r9.L$1
                kotlin.jvm.internal.T r4 = (kotlin.jvm.internal.T) r4
                java.lang.Object r5 = r9.L$0
                i6.M r5 = (i6.M) r5
                L5.t.b(r10)
                goto L57
            L31:
                L5.t.b(r10)
                java.lang.Object r10 = r9.L$0
                i6.M r10 = (i6.M) r10
            L38:
                boolean r1 = i6.N.g(r10)
                if (r1 == 0) goto L7d
                kotlin.jvm.internal.T r1 = new kotlin.jvm.internal.T
                r1.<init>()
                k6.d r4 = r9.$channel
                r9.L$0 = r10
                r9.L$1 = r1
                r9.L$2 = r1
                r9.label = r3
                java.lang.Object r4 = r4.z(r9)
                if (r4 != r0) goto L54
                return r0
            L54:
                r5 = r10
                r10 = r4
                r4 = r1
            L57:
                r1.f33747a = r10
                java.lang.Object r10 = r4.f33747a
                boolean r10 = r10 instanceof androidx.compose.foundation.gestures.TransformEvent.TransformStarted
                if (r10 == 0) goto L7b
                androidx.compose.foundation.gestures.TransformableState r10 = r9.$state     // Catch: java.util.concurrent.CancellationException -> L7a
                androidx.compose.foundation.MutatePriority r1 = androidx.compose.foundation.MutatePriority.UserInput     // Catch: java.util.concurrent.CancellationException -> L7a
                androidx.compose.foundation.gestures.TransformableKt$transformable$3$1$1 r6 = new androidx.compose.foundation.gestures.TransformableKt$transformable$3$1$1     // Catch: java.util.concurrent.CancellationException -> L7a
                k6.d r7 = r9.$channel     // Catch: java.util.concurrent.CancellationException -> L7a
                r8 = 0
                r6.<init>(r4, r7, r8)     // Catch: java.util.concurrent.CancellationException -> L7a
                r9.L$0 = r5     // Catch: java.util.concurrent.CancellationException -> L7a
                r9.L$1 = r8     // Catch: java.util.concurrent.CancellationException -> L7a
                r9.L$2 = r8     // Catch: java.util.concurrent.CancellationException -> L7a
                r9.label = r2     // Catch: java.util.concurrent.CancellationException -> L7a
                java.lang.Object r10 = r10.transform(r1, r6, r9)     // Catch: java.util.concurrent.CancellationException -> L7a
                if (r10 != r0) goto L7b
                return r0
            L7a:
            L7b:
                r10 = r5
                goto L38
            L7d:
                L5.I r10 = L5.I.f6474a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableKt$transformable$3.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformableKt$transformable$3(boolean z8, Function0 function0, boolean z9, TransformableState transformableState) {
        super(3);
        this.$lockRotationOnZoomPan = z8;
        this.$canPan = function0;
        this.$enabled = z9;
        this.$state = transformableState;
    }

    @Override // X5.o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    public final Modifier invoke(Modifier composed, Composer composer, int i8) {
        AbstractC3159y.i(composed, "$this$composed");
        composer.startReplaceableGroup(298661433);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(298661433, i8, -1, "androidx.compose.foundation.gestures.transformable.<anonymous> (Transformable.kt:97)");
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(this.$lockRotationOnZoomPan), composer, 0);
        State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(this.$canPan, composer, 0);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = g.b(Integer.MAX_VALUE, null, null, 6, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        k6.d dVar = (k6.d) rememberedValue;
        composer.startReplaceableGroup(-2015615917);
        if (this.$enabled) {
            TransformableState transformableState = this.$state;
            EffectsKt.LaunchedEffect(transformableState, new AnonymousClass1(dVar, transformableState, null), composer, 64);
        }
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new TransformableKt$transformable$3$block$1$1(rememberUpdatedState, dVar, rememberUpdatedState2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        Modifier pointerInput = this.$enabled ? SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion, dVar, (n) rememberedValue2) : Modifier.Companion;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return pointerInput;
    }
}
