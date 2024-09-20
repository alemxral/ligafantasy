package F6;

import F6.q;
import androidx.browser.trusted.sharing.ShareTarget;
import java.util.List;

/* loaded from: classes5.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    final r f3015a;

    /* renamed from: b, reason: collision with root package name */
    final String f3016b;

    /* renamed from: c, reason: collision with root package name */
    final q f3017c;

    /* renamed from: d, reason: collision with root package name */
    final y f3018d;

    /* renamed from: e, reason: collision with root package name */
    final Object f3019e;

    /* renamed from: f, reason: collision with root package name */
    private volatile d f3020f;

    x(a aVar) {
        this.f3015a = aVar.f3021a;
        this.f3016b = aVar.f3022b;
        this.f3017c = aVar.f3023c.d();
        this.f3018d = aVar.f3024d;
        Object obj = aVar.f3025e;
        this.f3019e = obj == null ? this : obj;
    }

    public y a() {
        return this.f3018d;
    }

    public d b() {
        d dVar = this.f3020f;
        if (dVar == null) {
            d l8 = d.l(this.f3017c);
            this.f3020f = l8;
            return l8;
        }
        return dVar;
    }

    public String c(String str) {
        return this.f3017c.a(str);
    }

    public q d() {
        return this.f3017c;
    }

    public List e(String str) {
        return this.f3017c.g(str);
    }

    public boolean f() {
        return this.f3015a.l();
    }

    public String g() {
        return this.f3016b;
    }

    public a h() {
        return new a(this);
    }

    public r i() {
        return this.f3015a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(this.f3016b);
        sb.append(", url=");
        sb.append(this.f3015a);
        sb.append(", tag=");
        Object obj = this.f3019e;
        if (obj == this) {
            obj = null;
        }
        sb.append(obj);
        sb.append('}');
        return sb.toString();
    }

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        r f3021a;

        /* renamed from: b, reason: collision with root package name */
        String f3022b;

        /* renamed from: c, reason: collision with root package name */
        q.a f3023c;

        /* renamed from: d, reason: collision with root package name */
        y f3024d;

        /* renamed from: e, reason: collision with root package name */
        Object f3025e;

        public a() {
            this.f3022b = ShareTarget.METHOD_GET;
            this.f3023c = new q.a();
        }

        public x a() {
            if (this.f3021a != null) {
                return new x(this);
            }
            throw new IllegalStateException("url == null");
        }

        public a b(d dVar) {
            String dVar2 = dVar.toString();
            if (dVar2.isEmpty()) {
                return f("Cache-Control");
            }
            return c("Cache-Control", dVar2);
        }

        public a c(String str, String str2) {
            this.f3023c.h(str, str2);
            return this;
        }

        public a d(q qVar) {
            this.f3023c = qVar.d();
            return this;
        }

        public a e(String str, y yVar) {
            if (str != null) {
                if (str.length() != 0) {
                    if (yVar != null && !J6.f.b(str)) {
                        throw new IllegalArgumentException("method " + str + " must not have a request body.");
                    }
                    if (yVar == null && J6.f.e(str)) {
                        throw new IllegalArgumentException("method " + str + " must have a request body.");
                    }
                    this.f3022b = str;
                    this.f3024d = yVar;
                    return this;
                }
                throw new IllegalArgumentException("method.length() == 0");
            }
            throw new NullPointerException("method == null");
        }

        public a f(String str) {
            this.f3023c.g(str);
            return this;
        }

        public a g(r rVar) {
            if (rVar != null) {
                this.f3021a = rVar;
                return this;
            }
            throw new NullPointerException("url == null");
        }

        public a h(String str) {
            if (str != null) {
                if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                    str = "http:" + str.substring(3);
                } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                    str = "https:" + str.substring(4);
                }
                r p8 = r.p(str);
                if (p8 != null) {
                    return g(p8);
                }
                throw new IllegalArgumentException("unexpected url: " + str);
            }
            throw new NullPointerException("url == null");
        }

        a(x xVar) {
            this.f3021a = xVar.f3015a;
            this.f3022b = xVar.f3016b;
            this.f3024d = xVar.f3018d;
            this.f3025e = xVar.f3019e;
            this.f3023c = xVar.f3017c.d();
        }
    }
}
