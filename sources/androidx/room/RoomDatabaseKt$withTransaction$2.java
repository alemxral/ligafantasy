package androidx.room;

import L5.I;
import P5.g;
import i6.M;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.room.RoomDatabaseKt$withTransaction$2", f = "RoomDatabaseExt.kt", l = {59}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class RoomDatabaseKt$withTransaction$2 extends kotlin.coroutines.jvm.internal.l implements X5.n {
    final /* synthetic */ Function1 $block;
    final /* synthetic */ RoomDatabase $this_withTransaction;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomDatabaseKt$withTransaction$2(RoomDatabase roomDatabase, Function1 function1, P5.d dVar) {
        super(2, dVar);
        this.$this_withTransaction = roomDatabase;
        this.$block = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final P5.d create(Object obj, P5.d dVar) {
        RoomDatabaseKt$withTransaction$2 roomDatabaseKt$withTransaction$2 = new RoomDatabaseKt$withTransaction$2(this.$this_withTransaction, this.$block, dVar);
        roomDatabaseKt$withTransaction$2.L$0 = obj;
        return roomDatabaseKt$withTransaction$2;
    }

    @Override // X5.n
    public final Object invoke(M m8, P5.d dVar) {
        return ((RoomDatabaseKt$withTransaction$2) create(m8, dVar)).invokeSuspend(I.f6474a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        TransactionElement transactionElement;
        TransactionElement e8 = Q5.b.e();
        int i8 = this.label;
        try {
            if (i8 != 0) {
                if (i8 == 1) {
                    transactionElement = (TransactionElement) this.L$0;
                    try {
                        L5.t.b(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        this.$this_withTransaction.endTransaction();
                        throw th;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                g.b bVar = ((M) this.L$0).getCoroutineContext().get(TransactionElement.Key);
                AbstractC3159y.f(bVar);
                TransactionElement transactionElement2 = (TransactionElement) bVar;
                transactionElement2.acquire();
                try {
                    this.$this_withTransaction.beginTransaction();
                    try {
                        Function1 function1 = this.$block;
                        this.L$0 = transactionElement2;
                        this.label = 1;
                        Object invoke = function1.invoke(this);
                        if (invoke == e8) {
                            return e8;
                        }
                        transactionElement = transactionElement2;
                        obj = invoke;
                    } catch (Throwable th3) {
                        th = th3;
                        this.$this_withTransaction.endTransaction();
                        throw th;
                    }
                } catch (Throwable th4) {
                    e8 = transactionElement2;
                    th = th4;
                    e8.release();
                    throw th;
                }
            }
            this.$this_withTransaction.setTransactionSuccessful();
            this.$this_withTransaction.endTransaction();
            transactionElement.release();
            return obj;
        } catch (Throwable th5) {
            th = th5;
        }
    }
}
