package J3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes4.dex */
public abstract class O {

    /* renamed from: a, reason: collision with root package name */
    private static final ProvidableCompositionLocal f4849a = CompositionLocalKt.staticCompositionLocalOf(a.f4852a);

    /* renamed from: b, reason: collision with root package name */
    private static final ProvidableCompositionLocal f4850b = CompositionLocalKt.staticCompositionLocalOf(b.f4853a);

    /* renamed from: c, reason: collision with root package name */
    private static final ProvidableCompositionLocal f4851c = CompositionLocalKt.staticCompositionLocalOf(c.f4854a);

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f4852a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final K invoke() {
            return new K(0L, 0L, 0L, 0L, 0L, 31, null);
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f4853a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final M invoke() {
            return new M(0.0f, 0.0f, 3, null);
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f4854a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final P invoke() {
            return new P(null, 0L, 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ X5.n f4855a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(X5.n nVar) {
            super(2);
            this.f4855a = nVar;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6474a;
        }

        public final void invoke(Composer composer, int i8) {
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-780814166, i8, -1, "com.stripe.android.paymentsheet.ui.PrimaryButtonTheme.<anonymous> (PrimaryButtonTheme.kt:156)");
            }
            this.f4855a.invoke(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ K f4856a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ M f4857b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ P f4858c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ X5.n f4859d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f4860e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f4861f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(K k8, M m8, P p8, X5.n nVar, int i8, int i9) {
            super(2);
            this.f4856a = k8;
            this.f4857b = m8;
            this.f4858c = p8;
            this.f4859d = nVar;
            this.f4860e = i8;
            this.f4861f = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6474a;
        }

        public final void invoke(Composer composer, int i8) {
            O.a(this.f4856a, this.f4857b, this.f4858c, this.f4859d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f4860e | 1), this.f4861f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b1, code lost:
    
        if ((r32 & 4) != 0) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(J3.K r26, J3.M r27, J3.P r28, X5.n r29, androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: J3.O.a(J3.K, J3.M, J3.P, X5.n, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final ProvidableCompositionLocal b() {
        return f4849a;
    }

    public static final ProvidableCompositionLocal c() {
        return f4850b;
    }

    public static final ProvidableCompositionLocal d() {
        return f4851c;
    }
}
