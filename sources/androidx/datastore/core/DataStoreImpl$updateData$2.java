package androidx.datastore.core;

import L5.I;
import L5.t;
import P5.d;
import Q5.b;
import X5.n;
import androidx.datastore.core.Message;
import i6.AbstractC2858z;
import i6.InterfaceC2854x;
import i6.M;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;

@f(c = "androidx.datastore.core.DataStoreImpl$updateData$2", f = "DataStoreImpl.kt", l = {177}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DataStoreImpl$updateData$2 extends l implements n {
    final /* synthetic */ n $transform;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$updateData$2(DataStoreImpl<T> dataStoreImpl, n nVar, d dVar) {
        super(2, dVar);
        this.this$0 = dataStoreImpl;
        this.$transform = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        DataStoreImpl$updateData$2 dataStoreImpl$updateData$2 = new DataStoreImpl$updateData$2(this.this$0, this.$transform, dVar);
        dataStoreImpl$updateData$2.L$0 = obj;
        return dataStoreImpl$updateData$2;
    }

    @Override // X5.n
    public final Object invoke(M m8, d dVar) {
        return ((DataStoreImpl$updateData$2) create(m8, dVar)).invokeSuspend(I.f6474a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        SimpleActor simpleActor;
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
            M m8 = (M) this.L$0;
            InterfaceC2854x b8 = AbstractC2858z.b(null, 1, null);
            Message.Update update = new Message.Update(this.$transform, b8, ((DataStoreImpl) this.this$0).inMemoryCache.getCurrentState(), m8.getCoroutineContext());
            simpleActor = ((DataStoreImpl) this.this$0).writeActor;
            simpleActor.offer(update);
            this.label = 1;
            obj = b8.g(this);
            if (obj == e8) {
                return e8;
            }
        }
        return obj;
    }
}
