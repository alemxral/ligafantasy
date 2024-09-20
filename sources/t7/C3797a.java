package t7;

import R6.C1347n;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;
import t7.g;
import t7.i;
import t7.j;

/* renamed from: t7.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3797a implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private transient k f38242a;

    /* renamed from: b, reason: collision with root package name */
    private final int f38243b;

    /* renamed from: c, reason: collision with root package name */
    private final List f38244c;

    /* renamed from: d, reason: collision with root package name */
    private int f38245d;

    /* renamed from: e, reason: collision with root package name */
    private u f38246e;

    /* renamed from: f, reason: collision with root package name */
    private List f38247f;

    /* renamed from: g, reason: collision with root package name */
    private Map f38248g;

    /* renamed from: h, reason: collision with root package name */
    private Stack f38249h;

    /* renamed from: i, reason: collision with root package name */
    private Map f38250i;

    /* renamed from: j, reason: collision with root package name */
    private int f38251j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f38252k;

    /* renamed from: l, reason: collision with root package name */
    private transient int f38253l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3797a(C3797a c3797a) {
        this.f38242a = new k(c3797a.f38242a.d());
        this.f38243b = c3797a.f38243b;
        this.f38245d = c3797a.f38245d;
        this.f38246e = c3797a.f38246e;
        ArrayList arrayList = new ArrayList();
        this.f38247f = arrayList;
        arrayList.addAll(c3797a.f38247f);
        this.f38248g = new TreeMap();
        for (Integer num : c3797a.f38248g.keySet()) {
            this.f38248g.put(num, (LinkedList) ((LinkedList) c3797a.f38248g.get(num)).clone());
        }
        Stack stack = new Stack();
        this.f38249h = stack;
        stack.addAll(c3797a.f38249h);
        this.f38244c = new ArrayList();
        Iterator it = c3797a.f38244c.iterator();
        while (it.hasNext()) {
            this.f38244c.add(((c) it.next()).clone());
        }
        this.f38250i = new TreeMap(c3797a.f38250i);
        this.f38251j = c3797a.f38251j;
        this.f38253l = c3797a.f38253l;
        this.f38252k = c3797a.f38252k;
    }

    private c a() {
        c cVar = null;
        for (c cVar2 : this.f38244c) {
            if (!cVar2.f() && cVar2.g() && (cVar == null || cVar2.b() < cVar.b() || (cVar2.b() == cVar.b() && cVar2.c() < cVar.c()))) {
                cVar = cVar2;
            }
        }
        return cVar;
    }

    private void e(byte[] bArr, byte[] bArr2, j jVar) {
        if (jVar != null) {
            i iVar = (i) ((i.b) ((i.b) new i.b().g(jVar.b())).h(jVar.c())).l();
            g gVar = (g) ((g.b) ((g.b) new g.b().g(jVar.b())).h(jVar.c())).k();
            for (int i8 = 0; i8 < (1 << this.f38243b); i8++) {
                jVar = (j) ((j.b) ((j.b) ((j.b) new j.b().g(jVar.b())).h(jVar.c())).p(i8).n(jVar.e()).o(jVar.f()).f(jVar.a())).l();
                k kVar = this.f38242a;
                kVar.h(kVar.g(bArr2, jVar), bArr);
                n e8 = this.f38242a.e(jVar);
                iVar = (i) ((i.b) ((i.b) ((i.b) new i.b().g(iVar.b())).h(iVar.c())).n(i8).o(iVar.f()).p(iVar.g()).f(iVar.a())).l();
                u a8 = v.a(this.f38242a, e8, iVar);
                gVar = (g) ((g.b) ((g.b) ((g.b) new g.b().g(gVar.b())).h(gVar.c())).n(i8).f(gVar.a())).k();
                while (!this.f38249h.isEmpty() && ((u) this.f38249h.peek()).a() == a8.a()) {
                    int a9 = i8 / (1 << a8.a());
                    if (a9 == 1) {
                        this.f38247f.add(a8);
                    }
                    if (a9 == 3 && a8.a() < this.f38243b - this.f38245d) {
                        ((c) this.f38244c.get(a8.a())).h(a8);
                    }
                    if (a9 >= 3 && (a9 & 1) == 1 && a8.a() >= this.f38243b - this.f38245d && a8.a() <= this.f38243b - 2) {
                        if (this.f38248g.get(Integer.valueOf(a8.a())) == null) {
                            LinkedList linkedList = new LinkedList();
                            linkedList.add(a8);
                            this.f38248g.put(Integer.valueOf(a8.a()), linkedList);
                        } else {
                            ((LinkedList) this.f38248g.get(Integer.valueOf(a8.a()))).add(a8);
                        }
                    }
                    g gVar2 = (g) ((g.b) ((g.b) ((g.b) new g.b().g(gVar.b())).h(gVar.c())).m(gVar.e()).n((gVar.f() - 1) / 2).f(gVar.a())).k();
                    u b8 = v.b(this.f38242a, (u) this.f38249h.pop(), a8, gVar2);
                    u uVar = new u(b8.a() + 1, b8.b());
                    gVar = (g) ((g.b) ((g.b) ((g.b) new g.b().g(gVar2.b())).h(gVar2.c())).m(gVar2.e() + 1).n(gVar2.f()).f(gVar2.a())).k();
                    a8 = uVar;
                }
                this.f38249h.push(a8);
            }
            this.f38246e = (u) this.f38249h.pop();
            return;
        }
        throw new NullPointerException("otsHashAddress == null");
    }

    private void f(byte[] bArr, byte[] bArr2, j jVar) {
        List list;
        Object removeFirst;
        if (jVar != null) {
            if (!this.f38252k) {
                int i8 = this.f38251j;
                if (i8 <= this.f38253l - 1) {
                    int b8 = A.b(i8, this.f38243b);
                    if (((this.f38251j >> (b8 + 1)) & 1) == 0 && b8 < this.f38243b - 1) {
                        this.f38250i.put(Integer.valueOf(b8), this.f38247f.get(b8));
                    }
                    i iVar = (i) ((i.b) ((i.b) new i.b().g(jVar.b())).h(jVar.c())).l();
                    g gVar = (g) ((g.b) ((g.b) new g.b().g(jVar.b())).h(jVar.c())).k();
                    if (b8 == 0) {
                        jVar = (j) ((j.b) ((j.b) ((j.b) new j.b().g(jVar.b())).h(jVar.c())).p(this.f38251j).n(jVar.e()).o(jVar.f()).f(jVar.a())).l();
                        k kVar = this.f38242a;
                        kVar.h(kVar.g(bArr2, jVar), bArr);
                        this.f38247f.set(0, v.a(this.f38242a, this.f38242a.e(jVar), (i) ((i.b) ((i.b) ((i.b) new i.b().g(iVar.b())).h(iVar.c())).n(this.f38251j).o(iVar.f()).p(iVar.g()).f(iVar.a())).l()));
                    } else {
                        int i9 = b8 - 1;
                        g gVar2 = (g) ((g.b) ((g.b) ((g.b) new g.b().g(gVar.b())).h(gVar.c())).m(i9).n(this.f38251j >> b8).f(gVar.a())).k();
                        k kVar2 = this.f38242a;
                        kVar2.h(kVar2.g(bArr2, jVar), bArr);
                        u b9 = v.b(this.f38242a, (u) this.f38247f.get(i9), (u) this.f38250i.get(Integer.valueOf(i9)), gVar2);
                        this.f38247f.set(b8, new u(b9.a() + 1, b9.b()));
                        this.f38250i.remove(Integer.valueOf(i9));
                        for (int i10 = 0; i10 < b8; i10++) {
                            if (i10 < this.f38243b - this.f38245d) {
                                list = this.f38247f;
                                removeFirst = ((c) this.f38244c.get(i10)).d();
                            } else {
                                list = this.f38247f;
                                removeFirst = ((LinkedList) this.f38248g.get(Integer.valueOf(i10))).removeFirst();
                            }
                            list.set(i10, removeFirst);
                        }
                        int min = Math.min(b8, this.f38243b - this.f38245d);
                        for (int i11 = 0; i11 < min; i11++) {
                            int i12 = this.f38251j + 1 + ((1 << i11) * 3);
                            if (i12 < (1 << this.f38243b)) {
                                ((c) this.f38244c.get(i11)).e(i12);
                            }
                        }
                    }
                    for (int i13 = 0; i13 < ((this.f38243b - this.f38245d) >> 1); i13++) {
                        c a8 = a();
                        if (a8 != null) {
                            a8.j(this.f38249h, this.f38242a, bArr, bArr2, jVar);
                        }
                    }
                    this.f38251j++;
                    return;
                }
                throw new IllegalStateException("index out of bounds");
            }
            throw new IllegalStateException("index already used");
        }
        throw new NullPointerException("otsHashAddress == null");
    }

    private void g() {
        if (this.f38247f != null) {
            if (this.f38248g != null) {
                if (this.f38249h != null) {
                    if (this.f38244c != null) {
                        if (this.f38250i != null) {
                            if (A.l(this.f38243b, this.f38251j)) {
                                return;
                            } else {
                                throw new IllegalStateException("index in BDS state out of bounds");
                            }
                        }
                        throw new IllegalStateException("keep == null");
                    }
                    throw new IllegalStateException("treeHashInstances == null");
                }
                throw new IllegalStateException("stack == null");
            }
            throw new IllegalStateException("retain == null");
        }
        throw new IllegalStateException("authenticationPath == null");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int b() {
        return this.f38251j;
    }

    public int c() {
        return this.f38253l;
    }

    public C3797a d(byte[] bArr, byte[] bArr2, j jVar) {
        return new C3797a(this, bArr, bArr2, jVar);
    }

    public C3797a h(C1347n c1347n) {
        return new C3797a(this, c1347n);
    }

    private C3797a(C3797a c3797a, C1347n c1347n) {
        this.f38242a = new k(new m(c1347n));
        this.f38243b = c3797a.f38243b;
        this.f38245d = c3797a.f38245d;
        this.f38246e = c3797a.f38246e;
        ArrayList arrayList = new ArrayList();
        this.f38247f = arrayList;
        arrayList.addAll(c3797a.f38247f);
        this.f38248g = new TreeMap();
        for (Integer num : c3797a.f38248g.keySet()) {
            this.f38248g.put(num, (LinkedList) ((LinkedList) c3797a.f38248g.get(num)).clone());
        }
        Stack stack = new Stack();
        this.f38249h = stack;
        stack.addAll(c3797a.f38249h);
        this.f38244c = new ArrayList();
        Iterator it = c3797a.f38244c.iterator();
        while (it.hasNext()) {
            this.f38244c.add(((c) it.next()).clone());
        }
        this.f38250i = new TreeMap(c3797a.f38250i);
        this.f38251j = c3797a.f38251j;
        this.f38253l = c3797a.f38253l;
        this.f38252k = c3797a.f38252k;
        g();
    }

    private C3797a(C3797a c3797a, byte[] bArr, byte[] bArr2, j jVar) {
        this.f38242a = new k(c3797a.f38242a.d());
        this.f38243b = c3797a.f38243b;
        this.f38245d = c3797a.f38245d;
        this.f38246e = c3797a.f38246e;
        ArrayList arrayList = new ArrayList();
        this.f38247f = arrayList;
        arrayList.addAll(c3797a.f38247f);
        this.f38248g = new TreeMap();
        for (Integer num : c3797a.f38248g.keySet()) {
            this.f38248g.put(num, (LinkedList) ((LinkedList) c3797a.f38248g.get(num)).clone());
        }
        Stack stack = new Stack();
        this.f38249h = stack;
        stack.addAll(c3797a.f38249h);
        this.f38244c = new ArrayList();
        Iterator it = c3797a.f38244c.iterator();
        while (it.hasNext()) {
            this.f38244c.add(((c) it.next()).clone());
        }
        this.f38250i = new TreeMap(c3797a.f38250i);
        this.f38251j = c3797a.f38251j;
        this.f38253l = c3797a.f38253l;
        this.f38252k = false;
        f(bArr, bArr2, jVar);
    }

    private C3797a(k kVar, int i8, int i9, int i10) {
        this.f38242a = kVar;
        this.f38243b = i8;
        this.f38253l = i10;
        this.f38245d = i9;
        if (i9 <= i8 && i9 >= 2) {
            int i11 = i8 - i9;
            if (i11 % 2 == 0) {
                this.f38247f = new ArrayList();
                this.f38248g = new TreeMap();
                this.f38249h = new Stack();
                this.f38244c = new ArrayList();
                for (int i12 = 0; i12 < i11; i12++) {
                    this.f38244c.add(new c(i12));
                }
                this.f38250i = new TreeMap();
                this.f38251j = 0;
                this.f38252k = false;
                return;
            }
        }
        throw new IllegalArgumentException("illegal value for BDS parameter k");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3797a(x xVar, int i8, int i9) {
        this(xVar.i(), xVar.b(), xVar.c(), i9);
        this.f38253l = i8;
        this.f38251j = i9;
        this.f38252k = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3797a(x xVar, byte[] bArr, byte[] bArr2, j jVar) {
        this(xVar.i(), xVar.b(), xVar.c(), (1 << xVar.b()) - 1);
        e(bArr, bArr2, jVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3797a(x xVar, byte[] bArr, byte[] bArr2, j jVar, int i8) {
        this(xVar.i(), xVar.b(), xVar.c(), (1 << xVar.b()) - 1);
        e(bArr, bArr2, jVar);
        while (this.f38251j < i8) {
            f(bArr, bArr2, jVar);
            this.f38252k = false;
        }
    }
}
