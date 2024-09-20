package v4;

import L5.C1224h;
import L5.I;
import L5.t;
import X5.n;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import i6.M;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l6.InterfaceC3349K;
import l6.InterfaceC3359g;

/* loaded from: classes4.dex */
public abstract class f {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3349K f38793a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC3349K interfaceC3349K) {
            super(0);
            this.f38793a = interfaceC3349K;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.f38793a.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f38794a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f38795b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3349K f38796c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ProduceStateScope f38797a;

            a(ProduceStateScope produceStateScope) {
                this.f38797a = produceStateScope;
            }

            @Override // l6.InterfaceC3359g
            public final Object emit(Object obj, P5.d dVar) {
                this.f38797a.setValue(obj);
                return I.f6474a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC3349K interfaceC3349K, P5.d dVar) {
            super(2, dVar);
            this.f38796c = interfaceC3349K;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            b bVar = new b(this.f38796c, dVar);
            bVar.f38795b = obj;
            return bVar;
        }

        @Override // X5.n
        public final Object invoke(ProduceStateScope produceStateScope, P5.d dVar) {
            return ((b) create(produceStateScope, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f38794a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                ProduceStateScope produceStateScope = (ProduceStateScope) this.f38795b;
                InterfaceC3349K interfaceC3349K = this.f38796c;
                a aVar = new a(produceStateScope);
                this.f38794a = 1;
                if (interfaceC3349K.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f38798a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f38799b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ n f38800c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ MutableState f38801d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(n nVar, MutableState mutableState, P5.d dVar) {
            super(2, dVar);
            this.f38800c = nVar;
            this.f38801d = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            c cVar = new c(this.f38800c, this.f38801d, dVar);
            cVar.f38799b = obj;
            return cVar;
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f38798a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                M m8 = (M) this.f38799b;
                n nVar = this.f38800c;
                d dVar = new d(this.f38801d, m8.getCoroutineContext());
                this.f38798a = 1;
                if (nVar.invoke(dVar, this) == e8) {
                    return e8;
                }
            }
            return I.f6474a;
        }
    }

    public static final State a(InterfaceC3349K interfaceC3349K, Composer composer, int i8) {
        AbstractC3159y.i(interfaceC3349K, "<this>");
        composer.startReplaceableGroup(-419709006);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-419709006, i8, -1, "com.stripe.android.uicore.utils.collectAsState (StateFlowsCompose.kt:42)");
        }
        composer.startReplaceableGroup(-2023564304);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new a(interfaceC3349K);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        State b8 = b((Function0) rememberedValue, interfaceC3349K, new b(interfaceC3349K, null), composer, 582);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return b8;
    }

    private static final State b(Function0 function0, Object obj, n nVar, Composer composer, int i8) {
        composer.startReplaceableGroup(2085798134);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2085798134, i8, -1, "com.stripe.android.uicore.utils.produceState (StateFlowsCompose.kt:32)");
        }
        composer.startReplaceableGroup(-1742439704);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(function0.invoke(), null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        composer.endReplaceableGroup();
        EffectsKt.LaunchedEffect(obj, new c(nVar, mutableState, null), composer, 72);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return mutableState;
    }
}
