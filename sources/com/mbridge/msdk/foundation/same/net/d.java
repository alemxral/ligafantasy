package com.mbridge.msdk.foundation.same.net;

import android.os.Handler;
import com.mbridge.msdk.foundation.tools.ad;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public class d implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f19592a = d.class.getSimpleName();

    /* renamed from: b, reason: collision with root package name */
    private final Executor f19593b;

    /* loaded from: classes4.dex */
    private class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final i f19612b;

        /* renamed from: c, reason: collision with root package name */
        private final k f19613c;

        public a(i iVar, k kVar) {
            this.f19612b = iVar;
            this.f19613c = kVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f19612b.q()) {
                this.f19612b.a("canceled-at-delivery");
                this.f19612b.c();
                return;
            }
            k kVar = this.f19613c;
            com.mbridge.msdk.foundation.same.net.b.a aVar = kVar.f19746a;
            if (aVar == null) {
                this.f19612b.a(kVar);
            } else {
                this.f19612b.a(aVar);
            }
            this.f19612b.a("done");
            this.f19612b.d();
        }
    }

    public d(final Handler handler) {
        this.f19593b = new Executor() { // from class: com.mbridge.msdk.foundation.same.net.d.1
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    @Override // com.mbridge.msdk.foundation.same.net.c
    public final void a(final i<?> iVar) {
        Executor executor = this.f19593b;
        if (executor != null) {
            executor.execute(new Runnable() { // from class: com.mbridge.msdk.foundation.same.net.d.2
                @Override // java.lang.Runnable
                public final void run() {
                    iVar.c();
                }
            });
        }
    }

    @Override // com.mbridge.msdk.foundation.same.net.c
    public final void b(final i<?> iVar) {
        Executor executor = this.f19593b;
        if (executor != null) {
            executor.execute(new Runnable() { // from class: com.mbridge.msdk.foundation.same.net.d.4
                @Override // java.lang.Runnable
                public final void run() {
                    iVar.d();
                }
            });
        }
    }

    @Override // com.mbridge.msdk.foundation.same.net.c
    public final void c(final i<?> iVar) {
        Executor executor = this.f19593b;
        if (executor != null) {
            executor.execute(new Runnable() { // from class: com.mbridge.msdk.foundation.same.net.d.5
                @Override // java.lang.Runnable
                public final void run() {
                    iVar.e();
                }
            });
        }
    }

    @Override // com.mbridge.msdk.foundation.same.net.c
    public final void d(final i<?> iVar) {
        Executor executor = this.f19593b;
        if (executor != null) {
            executor.execute(new Runnable() { // from class: com.mbridge.msdk.foundation.same.net.d.6
                @Override // java.lang.Runnable
                public final void run() {
                    iVar.f();
                }
            });
        }
    }

    @Override // com.mbridge.msdk.foundation.same.net.c
    public final void e(final i<?> iVar) {
        Executor executor = this.f19593b;
        if (executor != null) {
            executor.execute(new Runnable() { // from class: com.mbridge.msdk.foundation.same.net.d.7
                @Override // java.lang.Runnable
                public final void run() {
                    iVar.g();
                }
            });
        }
    }

    @Override // com.mbridge.msdk.foundation.same.net.c
    public final void a(final i<?> iVar, final long j8, final long j9) {
        Executor executor = this.f19593b;
        if (executor != null) {
            executor.execute(new Runnable() { // from class: com.mbridge.msdk.foundation.same.net.d.3
                @Override // java.lang.Runnable
                public final void run() {
                    iVar.a(j8, j9);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.foundation.same.net.c
    public final void a(i<?> iVar, com.mbridge.msdk.foundation.same.net.b.a aVar) {
        ad.c(this.f19592a, "postError error=" + aVar.f19588a);
        if (this.f19593b != null) {
            this.f19593b.execute(new a(iVar, k.a(aVar)));
        }
    }

    @Override // com.mbridge.msdk.foundation.same.net.c
    public final void a(i<?> iVar, k<?> kVar) {
        Executor executor = this.f19593b;
        if (executor != null) {
            executor.execute(new a(iVar, kVar));
        }
    }
}
