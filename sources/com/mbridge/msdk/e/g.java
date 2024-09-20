package com.mbridge.msdk.e;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class g implements l {

    /* renamed from: a, reason: collision with root package name */
    private final c f18864a;

    /* renamed from: b, reason: collision with root package name */
    private final r f18865b;

    /* renamed from: c, reason: collision with root package name */
    private final j f18866c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicLong f18867d = new AtomicLong(0);

    /* renamed from: e, reason: collision with root package name */
    private final long[] f18868e = new long[2];

    /* renamed from: f, reason: collision with root package name */
    private volatile i f18869f;

    public g(c cVar, r rVar, j jVar) {
        this.f18864a = cVar;
        this.f18865b = rVar;
        this.f18866c = jVar;
    }

    @Override // com.mbridge.msdk.e.l
    public final void b(final e eVar) {
        this.f18866c.b(new Runnable() { // from class: com.mbridge.msdk.e.g.1
            private void a(i iVar, int i8) {
                while (i8 > 0) {
                    if (g.this.f18864a.a(iVar) > 0) {
                        g.this.f18865b.c();
                        g.this.f18865b.d();
                        g.this.f18865b.a(eVar);
                        return;
                    }
                    i8--;
                }
                g.this.f18869f = iVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                i iVar = new i(eVar);
                iVar.a(1);
                iVar.b(0);
                iVar.a(System.currentTimeMillis() + eVar.h());
                if (g.this.f18869f != null) {
                    a(g.this.f18869f, 5);
                    g.this.f18869f = null;
                }
                a(iVar, 5);
            }
        });
    }

    @Override // com.mbridge.msdk.e.l
    public final void a(e eVar) {
        long incrementAndGet = this.f18867d.incrementAndGet();
        this.f18868e[0] = System.currentTimeMillis();
        this.f18868e[1] = incrementAndGet;
    }

    @Override // com.mbridge.msdk.e.l
    public final long[] a() {
        long[] jArr = this.f18868e;
        return jArr.length == 0 ? new long[]{0, 0} : jArr;
    }
}
