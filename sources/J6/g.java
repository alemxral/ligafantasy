package J6;

import F6.o;
import F6.s;
import F6.x;
import F6.z;
import java.util.List;

/* loaded from: classes5.dex */
public final class g implements s.a {

    /* renamed from: a, reason: collision with root package name */
    private final List f5499a;

    /* renamed from: b, reason: collision with root package name */
    private final I6.g f5500b;

    /* renamed from: c, reason: collision with root package name */
    private final c f5501c;

    /* renamed from: d, reason: collision with root package name */
    private final I6.c f5502d;

    /* renamed from: e, reason: collision with root package name */
    private final int f5503e;

    /* renamed from: f, reason: collision with root package name */
    private final x f5504f;

    /* renamed from: g, reason: collision with root package name */
    private final F6.e f5505g;

    /* renamed from: h, reason: collision with root package name */
    private final o f5506h;

    /* renamed from: i, reason: collision with root package name */
    private final int f5507i;

    /* renamed from: j, reason: collision with root package name */
    private final int f5508j;

    /* renamed from: k, reason: collision with root package name */
    private final int f5509k;

    /* renamed from: l, reason: collision with root package name */
    private int f5510l;

    public g(List list, I6.g gVar, c cVar, I6.c cVar2, int i8, x xVar, F6.e eVar, o oVar, int i9, int i10, int i11) {
        this.f5499a = list;
        this.f5502d = cVar2;
        this.f5500b = gVar;
        this.f5501c = cVar;
        this.f5503e = i8;
        this.f5504f = xVar;
        this.f5505g = eVar;
        this.f5506h = oVar;
        this.f5507i = i9;
        this.f5508j = i10;
        this.f5509k = i11;
    }

    @Override // F6.s.a
    public z a(x xVar) {
        return f(xVar, this.f5500b, this.f5501c, this.f5502d);
    }

    public F6.e b() {
        return this.f5505g;
    }

    public F6.h c() {
        return this.f5502d;
    }

    @Override // F6.s.a
    public int connectTimeoutMillis() {
        return this.f5507i;
    }

    public o d() {
        return this.f5506h;
    }

    public c e() {
        return this.f5501c;
    }

    public z f(x xVar, I6.g gVar, c cVar, I6.c cVar2) {
        if (this.f5503e < this.f5499a.size()) {
            this.f5510l++;
            if (this.f5501c != null && !this.f5502d.r(xVar.i())) {
                throw new IllegalStateException("network interceptor " + this.f5499a.get(this.f5503e - 1) + " must retain the same host and port");
            }
            if (this.f5501c != null && this.f5510l > 1) {
                throw new IllegalStateException("network interceptor " + this.f5499a.get(this.f5503e - 1) + " must call proceed() exactly once");
            }
            g gVar2 = new g(this.f5499a, gVar, cVar, cVar2, this.f5503e + 1, xVar, this.f5505g, this.f5506h, this.f5507i, this.f5508j, this.f5509k);
            s sVar = (s) this.f5499a.get(this.f5503e);
            z a8 = sVar.a(gVar2);
            if (cVar != null && this.f5503e + 1 < this.f5499a.size() && gVar2.f5510l != 1) {
                throw new IllegalStateException("network interceptor " + sVar + " must call proceed() exactly once");
            }
            if (a8 != null) {
                if (a8.a() != null) {
                    return a8;
                }
                throw new IllegalStateException("interceptor " + sVar + " returned a response with no body");
            }
            throw new NullPointerException("interceptor " + sVar + " returned null");
        }
        throw new AssertionError();
    }

    public I6.g g() {
        return this.f5500b;
    }

    @Override // F6.s.a
    public int readTimeoutMillis() {
        return this.f5508j;
    }

    @Override // F6.s.a
    public x request() {
        return this.f5504f;
    }

    @Override // F6.s.a
    public int writeTimeoutMillis() {
        return this.f5509k;
    }
}
