package t7;

import java.io.Serializable;
import java.util.Stack;
import t7.g;
import t7.i;
import t7.j;

/* loaded from: classes5.dex */
class c implements Serializable, Cloneable {

    /* renamed from: a, reason: collision with root package name */
    private u f38256a;

    /* renamed from: b, reason: collision with root package name */
    private final int f38257b;

    /* renamed from: c, reason: collision with root package name */
    private int f38258c;

    /* renamed from: d, reason: collision with root package name */
    private int f38259d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f38260e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f38261f = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(int i8) {
        this.f38257b = i8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public c clone() {
        c cVar = new c(this.f38257b);
        cVar.f38256a = this.f38256a;
        cVar.f38258c = this.f38258c;
        cVar.f38259d = this.f38259d;
        cVar.f38260e = this.f38260e;
        cVar.f38261f = this.f38261f;
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        if (this.f38260e && !this.f38261f) {
            return this.f38258c;
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return this.f38259d;
    }

    public u d() {
        return this.f38256a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(int i8) {
        this.f38256a = null;
        this.f38258c = this.f38257b;
        this.f38259d = i8;
        this.f38260e = true;
        this.f38261f = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f() {
        return this.f38261f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g() {
        return this.f38260e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(u uVar) {
        this.f38256a = uVar;
        int a8 = uVar.a();
        this.f38258c = a8;
        if (a8 == this.f38257b) {
            this.f38261f = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(Stack stack, k kVar, byte[] bArr, byte[] bArr2, j jVar) {
        if (jVar != null) {
            if (!this.f38261f && this.f38260e) {
                j jVar2 = (j) ((j.b) ((j.b) ((j.b) new j.b().g(jVar.b())).h(jVar.c())).p(this.f38259d).n(jVar.e()).o(jVar.f()).f(jVar.a())).l();
                i iVar = (i) ((i.b) ((i.b) new i.b().g(jVar2.b())).h(jVar2.c())).n(this.f38259d).l();
                g gVar = (g) ((g.b) ((g.b) new g.b().g(jVar2.b())).h(jVar2.c())).n(this.f38259d).k();
                kVar.h(kVar.g(bArr2, jVar2), bArr);
                u a8 = v.a(kVar, kVar.e(jVar2), iVar);
                while (!stack.isEmpty() && ((u) stack.peek()).a() == a8.a() && ((u) stack.peek()).a() != this.f38257b) {
                    g gVar2 = (g) ((g.b) ((g.b) ((g.b) new g.b().g(gVar.b())).h(gVar.c())).m(gVar.e()).n((gVar.f() - 1) / 2).f(gVar.a())).k();
                    u b8 = v.b(kVar, (u) stack.pop(), a8, gVar2);
                    u uVar = new u(b8.a() + 1, b8.b());
                    gVar = (g) ((g.b) ((g.b) ((g.b) new g.b().g(gVar2.b())).h(gVar2.c())).m(gVar2.e() + 1).n(gVar2.f()).f(gVar2.a())).k();
                    a8 = uVar;
                }
                u uVar2 = this.f38256a;
                if (uVar2 == null) {
                    this.f38256a = a8;
                } else if (uVar2.a() == a8.a()) {
                    g gVar3 = (g) ((g.b) ((g.b) ((g.b) new g.b().g(gVar.b())).h(gVar.c())).m(gVar.e()).n((gVar.f() - 1) / 2).f(gVar.a())).k();
                    a8 = new u(this.f38256a.a() + 1, v.b(kVar, this.f38256a, a8, gVar3).b());
                    this.f38256a = a8;
                } else {
                    stack.push(a8);
                }
                if (this.f38256a.a() == this.f38257b) {
                    this.f38261f = true;
                    return;
                } else {
                    this.f38258c = a8.a();
                    this.f38259d++;
                    return;
                }
            }
            throw new IllegalStateException("finished or not initialized");
        }
        throw new NullPointerException("otsHashAddress == null");
    }
}
