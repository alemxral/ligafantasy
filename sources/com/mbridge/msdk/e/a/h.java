package com.mbridge.msdk.e.a;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class h implements t {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f18787a;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final p f18790a;

        /* renamed from: b, reason: collision with root package name */
        private final r f18791b;

        /* renamed from: c, reason: collision with root package name */
        private final Runnable f18792c;

        public a(p pVar, r rVar, Runnable runnable) {
            this.f18790a = pVar;
            this.f18791b = rVar;
            this.f18792c = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f18790a.m()) {
                this.f18790a.c("canceled-at-delivery");
                return;
            }
            if (this.f18791b.a()) {
                this.f18790a.a((p) this.f18791b.f18841a);
            } else {
                this.f18790a.b(this.f18791b.f18843c);
            }
            if (!this.f18791b.f18844d) {
                this.f18790a.c("done");
            }
            Runnable runnable = this.f18792c;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public h(final Handler handler) {
        this.f18787a = new Executor() { // from class: com.mbridge.msdk.e.a.h.1
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    @Override // com.mbridge.msdk.e.a.t
    public final void a(p<?> pVar, r<?> rVar) {
        a(pVar, rVar, null);
    }

    @Override // com.mbridge.msdk.e.a.t
    public final void a(p<?> pVar, r<?> rVar, Runnable runnable) {
        pVar.t();
        this.f18787a.execute(new a(pVar, rVar, runnable));
    }

    public h(Executor executor) {
        this.f18787a = executor;
    }

    @Override // com.mbridge.msdk.e.a.t
    public final void a(p<?> pVar, z zVar) {
        this.f18787a.execute(new a(pVar, r.a(zVar), null));
    }
}
