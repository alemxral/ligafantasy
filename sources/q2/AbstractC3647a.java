package q2;

import L5.I;
import L5.t;
import X5.n;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import i6.M;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3160z;
import n4.C3468d;
import n4.C3471g;
import r.AbstractC3666b;
import r.InterfaceC3667c;

/* renamed from: q2.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3647a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0850a extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f37225a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3471g f37226b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0850a(C3471g c3471g, P5.d dVar) {
            super(2, dVar);
            this.f37226b = c3471g;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new C0850a(this.f37226b, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((C0850a) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f37225a == 0) {
                t.b(obj);
                this.f37226b.d(AbstractC3647a.d());
                return I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q2.a$b */
    /* loaded from: classes4.dex */
    public static final class b extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f37227a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3667c f37228b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3468d f37229c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ State f37230d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC3667c interfaceC3667c, C3468d c3468d, State state, P5.d dVar) {
            super(2, dVar);
            this.f37228b = interfaceC3667c;
            this.f37229c = c3468d;
            this.f37230d = state;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(this.f37228b, this.f37229c, this.f37230d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f37227a == 0) {
                t.b(obj);
                AbstractC3666b.b(this.f37228b, Color.m2970copywmQWz5c$default(this.f37229c.a(), AbstractC3647a.b(this.f37230d), 0.0f, 0.0f, 0.0f, 14, null), false, null, 4, null);
                return I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q2.a$c */
    /* loaded from: classes4.dex */
    public static final class c extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f37231a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3667c f37232b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC3667c interfaceC3667c, P5.d dVar) {
            super(2, dVar);
            this.f37232b = interfaceC3667c;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(this.f37232b, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f6474a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f37231a == 0) {
                t.b(obj);
                AbstractC3666b.a(this.f37232b, Color.Companion.m3006getTransparent0d7_KjU(), false, false, null, 12, null);
                return I.f6474a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q2.a$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3471g f37233a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f37234b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0 f37235c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ n f37236d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f37237e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f37238f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C3471g c3471g, Modifier modifier, Function0 function0, n nVar, int i8, int i9) {
            super(2);
            this.f37233a = c3471g;
            this.f37234b = modifier;
            this.f37235c = function0;
            this.f37236d = nVar;
            this.f37237e = i8;
            this.f37238f = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6474a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC3647a.a(this.f37233a, this.f37234b, this.f37235c, this.f37236d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f37237e | 1), this.f37238f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(n4.C3471g r21, androidx.compose.ui.Modifier r22, kotlin.jvm.functions.Function0 r23, X5.n r24, androidx.compose.runtime.Composer r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.AbstractC3647a.a(n4.g, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, X5.n, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float b(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    public static final /* synthetic */ boolean d() {
        return e();
    }

    private static final boolean e() {
        return false;
    }
}
