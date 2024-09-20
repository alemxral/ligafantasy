package com.mbridge.msdk.e.a;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class q {

    /* renamed from: e, reason: collision with root package name */
    private final b f18835e;

    /* renamed from: f, reason: collision with root package name */
    private final j f18836f;

    /* renamed from: g, reason: collision with root package name */
    private final t f18837g;

    /* renamed from: h, reason: collision with root package name */
    private final k[] f18838h;

    /* renamed from: i, reason: collision with root package name */
    private c f18839i;

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f18831a = new AtomicInteger();

    /* renamed from: b, reason: collision with root package name */
    private final Set<p<?>> f18832b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private final PriorityBlockingQueue<p<?>> f18833c = new PriorityBlockingQueue<>();

    /* renamed from: d, reason: collision with root package name */
    private final PriorityBlockingQueue<p<?>> f18834d = new PriorityBlockingQueue<>();

    /* renamed from: j, reason: collision with root package name */
    private final List<a> f18840j = new ArrayList();

    /* loaded from: classes4.dex */
    public interface a {
        void a(p<?> pVar, int i8);
    }

    public q(j jVar, t tVar, int i8, b bVar) {
        this.f18835e = bVar;
        this.f18836f = jVar;
        this.f18838h = new k[i8];
        this.f18837g = tVar;
    }

    public final <T> p<T> a(p<T> pVar) {
        pVar.a(this);
        synchronized (this.f18832b) {
            this.f18832b.add(pVar);
        }
        pVar.c(this.f18831a.incrementAndGet());
        a(pVar, 0);
        if (!pVar.p()) {
            c(pVar);
        } else {
            this.f18833c.add(pVar);
        }
        return pVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final <T> void b(p<T> pVar) {
        synchronized (this.f18832b) {
            this.f18832b.remove(pVar);
        }
        a(pVar, 5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final <T> void c(p<T> pVar) {
        this.f18834d.add(pVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(p<?> pVar, int i8) {
        synchronized (this.f18840j) {
            try {
                Iterator<a> it = this.f18840j.iterator();
                while (it.hasNext()) {
                    it.next().a(pVar, i8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        c cVar = this.f18839i;
        if (cVar != null) {
            cVar.a();
        }
        for (k kVar : this.f18838h) {
            if (kVar != null) {
                kVar.a();
            }
        }
        c cVar2 = new c(this.f18833c, this.f18834d, this.f18835e, this.f18837g);
        this.f18839i = cVar2;
        cVar2.start();
        for (int i8 = 0; i8 < this.f18838h.length; i8++) {
            k kVar2 = new k(this.f18834d, this.f18836f, this.f18835e, this.f18837g);
            this.f18838h[i8] = kVar2;
            kVar2.start();
        }
    }
}
