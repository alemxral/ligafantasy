package androidx.compose.material3;

import L5.I;
import L5.t;
import P5.d;
import Q5.b;
import X5.n;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import i6.M;
import i6.N;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.material3.ExposedDropdownMenuKt$expandable$1$1", f = "ExposedDropdownMenu.kt", l = {530}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ExposedDropdownMenuKt$expandable$1$1 extends l implements n {
    final /* synthetic */ Function0 $onExpandedChange;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.material3.ExposedDropdownMenuKt$expandable$1$1$1", f = "ExposedDropdownMenu.kt", l = {531}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.ExposedDropdownMenuKt$expandable$1$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends l implements n {
        final /* synthetic */ Function0 $onExpandedChange;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: package-private */
        @f(c = "androidx.compose.material3.ExposedDropdownMenuKt$expandable$1$1$1$1", f = "ExposedDropdownMenu.kt", l = {532}, m = "invokeSuspend")
        /* renamed from: androidx.compose.material3.ExposedDropdownMenuKt$expandable$1$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C03271 extends l implements n {
            final /* synthetic */ PointerInputScope $$this$forEachGesture;
            final /* synthetic */ Function0 $onExpandedChange;
            int label;

            /* JADX INFO: Access modifiers changed from: package-private */
            @f(c = "androidx.compose.material3.ExposedDropdownMenuKt$expandable$1$1$1$1$1", f = "ExposedDropdownMenu.kt", l = {535}, m = "invokeSuspend")
            /* renamed from: androidx.compose.material3.ExposedDropdownMenuKt$expandable$1$1$1$1$1, reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C03281 extends k implements n {
                final /* synthetic */ Function0 $onExpandedChange;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C03281(Function0 function0, d dVar) {
                    super(2, dVar);
                    this.$onExpandedChange = function0;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final d create(Object obj, d dVar) {
                    C03281 c03281 = new C03281(this.$onExpandedChange, dVar);
                    c03281.L$0 = obj;
                    return c03281;
                }

                @Override // X5.n
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, d dVar) {
                    return ((C03281) create(awaitPointerEventScope, dVar)).invokeSuspend(I.f6474a);
                }

                /* JADX WARN: Removed duplicated region for block: B:13:0x002f A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:7:0x003d  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x002d -> B:5:0x0030). Please report as a decompilation issue!!! */
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
                        if (r1 == 0) goto L1b
                        if (r1 != r2) goto L13
                        java.lang.Object r1 = r6.L$0
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                        L5.t.b(r7)
                        goto L30
                    L13:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r0)
                        throw r7
                    L1b:
                        L5.t.b(r7)
                        java.lang.Object r7 = r6.L$0
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r7 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r7
                        r1 = r7
                    L23:
                        androidx.compose.ui.input.pointer.PointerEventPass r7 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                        r6.L$0 = r1
                        r6.label = r2
                        java.lang.Object r7 = r1.awaitPointerEvent(r7, r6)
                        if (r7 != r0) goto L30
                        return r0
                    L30:
                        androidx.compose.ui.input.pointer.PointerEvent r7 = (androidx.compose.ui.input.pointer.PointerEvent) r7
                        java.util.List r7 = r7.getChanges()
                        int r3 = r7.size()
                        r4 = 0
                    L3b:
                        if (r4 >= r3) goto L4d
                        java.lang.Object r5 = r7.get(r4)
                        androidx.compose.ui.input.pointer.PointerInputChange r5 = (androidx.compose.ui.input.pointer.PointerInputChange) r5
                        boolean r5 = androidx.compose.ui.input.pointer.PointerEventKt.changedToUp(r5)
                        if (r5 != 0) goto L4a
                        goto L23
                    L4a:
                        int r4 = r4 + 1
                        goto L3b
                    L4d:
                        kotlin.jvm.functions.Function0 r7 = r6.$onExpandedChange
                        r7.invoke()
                        L5.I r7 = L5.I.f6474a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ExposedDropdownMenuKt$expandable$1$1.AnonymousClass1.C03271.C03281.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03271(PointerInputScope pointerInputScope, Function0 function0, d dVar) {
                super(2, dVar);
                this.$$this$forEachGesture = pointerInputScope;
                this.$onExpandedChange = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new C03271(this.$$this$forEachGesture, this.$onExpandedChange, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, d dVar) {
                return ((C03271) create(m8, dVar)).invokeSuspend(I.f6474a);
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
                    PointerInputScope pointerInputScope = this.$$this$forEachGesture;
                    C03281 c03281 = new C03281(this.$onExpandedChange, null);
                    this.label = 1;
                    if (pointerInputScope.awaitPointerEventScope(c03281, this) == e8) {
                        return e8;
                    }
                }
                return I.f6474a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Function0 function0, d dVar) {
            super(2, dVar);
            this.$onExpandedChange = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onExpandedChange, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // X5.n
        public final Object invoke(PointerInputScope pointerInputScope, d dVar) {
            return ((AnonymousClass1) create(pointerInputScope, dVar)).invokeSuspend(I.f6474a);
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
                C03271 c03271 = new C03271((PointerInputScope) this.L$0, this.$onExpandedChange, null);
                this.label = 1;
                if (N.e(c03271, this) == e8) {
                    return e8;
                }
            }
            return I.f6474a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuKt$expandable$1$1(Function0 function0, d dVar) {
        super(2, dVar);
        this.$onExpandedChange = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        ExposedDropdownMenuKt$expandable$1$1 exposedDropdownMenuKt$expandable$1$1 = new ExposedDropdownMenuKt$expandable$1$1(this.$onExpandedChange, dVar);
        exposedDropdownMenuKt$expandable$1$1.L$0 = obj;
        return exposedDropdownMenuKt$expandable$1$1;
    }

    @Override // X5.n
    public final Object invoke(PointerInputScope pointerInputScope, d dVar) {
        return ((ExposedDropdownMenuKt$expandable$1$1) create(pointerInputScope, dVar)).invokeSuspend(I.f6474a);
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
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onExpandedChange, null);
            this.label = 1;
            if (ForEachGestureKt.forEachGesture(pointerInputScope, anonymousClass1, this) == e8) {
                return e8;
            }
        }
        return I.f6474a;
    }
}
