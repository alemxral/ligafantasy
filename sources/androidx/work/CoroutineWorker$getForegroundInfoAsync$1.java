package androidx.work;

import L5.I;
import L5.t;
import P5.d;
import Q5.b;
import X5.n;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import i6.M;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;

@f(c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", f = "CoroutineWorker.kt", l = {TsExtractor.TS_STREAM_TYPE_SPLICE_INFO}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CoroutineWorker$getForegroundInfoAsync$1 extends l implements n {
    final /* synthetic */ JobListenableFuture<ForegroundInfo> $jobFuture;
    Object L$0;
    int label;
    final /* synthetic */ CoroutineWorker this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker$getForegroundInfoAsync$1(JobListenableFuture<ForegroundInfo> jobListenableFuture, CoroutineWorker coroutineWorker, d dVar) {
        super(2, dVar);
        this.$jobFuture = jobListenableFuture;
        this.this$0 = coroutineWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new CoroutineWorker$getForegroundInfoAsync$1(this.$jobFuture, this.this$0, dVar);
    }

    @Override // X5.n
    public final Object invoke(M m8, d dVar) {
        return ((CoroutineWorker$getForegroundInfoAsync$1) create(m8, dVar)).invokeSuspend(I.f6474a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        JobListenableFuture jobListenableFuture;
        Object e8 = b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 == 1) {
                jobListenableFuture = (JobListenableFuture) this.L$0;
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            JobListenableFuture<ForegroundInfo> jobListenableFuture2 = this.$jobFuture;
            CoroutineWorker coroutineWorker = this.this$0;
            this.L$0 = jobListenableFuture2;
            this.label = 1;
            Object foregroundInfo = coroutineWorker.getForegroundInfo(this);
            if (foregroundInfo == e8) {
                return e8;
            }
            jobListenableFuture = jobListenableFuture2;
            obj = foregroundInfo;
        }
        jobListenableFuture.complete(obj);
        return I.f6474a;
    }
}
