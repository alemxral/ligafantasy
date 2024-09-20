package N5;

import M5.AbstractC1230c;
import M5.AbstractC1239l;
import M5.N;
import Y5.d;
import d6.i;
import d6.m;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class d implements Map, Serializable, Y5.d {

    /* renamed from: n, reason: collision with root package name */
    public static final a f7475n = new a(null);

    /* renamed from: o, reason: collision with root package name */
    private static final d f7476o;

    /* renamed from: a, reason: collision with root package name */
    private Object[] f7477a;

    /* renamed from: b, reason: collision with root package name */
    private Object[] f7478b;

    /* renamed from: c, reason: collision with root package name */
    private int[] f7479c;

    /* renamed from: d, reason: collision with root package name */
    private int[] f7480d;

    /* renamed from: e, reason: collision with root package name */
    private int f7481e;

    /* renamed from: f, reason: collision with root package name */
    private int f7482f;

    /* renamed from: g, reason: collision with root package name */
    private int f7483g;

    /* renamed from: h, reason: collision with root package name */
    private int f7484h;

    /* renamed from: i, reason: collision with root package name */
    private int f7485i;

    /* renamed from: j, reason: collision with root package name */
    private N5.f f7486j;

    /* renamed from: k, reason: collision with root package name */
    private g f7487k;

    /* renamed from: l, reason: collision with root package name */
    private N5.e f7488l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f7489m;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int c(int i8) {
            return Integer.highestOneBit(m.d(i8, 1) * 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int d(int i8) {
            return Integer.numberOfLeadingZeros(i8) + 1;
        }

        public final d e() {
            return d.f7476o;
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends C0162d implements Iterator, Y5.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d map) {
            super(map);
            AbstractC3159y.i(map, "map");
        }

        @Override // java.util.Iterator
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public c next() {
            b();
            if (c() < f().f7482f) {
                int c8 = c();
                h(c8 + 1);
                i(c8);
                c cVar = new c(f(), e());
                g();
                return cVar;
            }
            throw new NoSuchElementException();
        }

        public final void k(StringBuilder sb) {
            AbstractC3159y.i(sb, "sb");
            if (c() < f().f7482f) {
                int c8 = c();
                h(c8 + 1);
                i(c8);
                Object obj = f().f7477a[e()];
                if (obj == f()) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj);
                }
                sb.append('=');
                Object[] objArr = f().f7478b;
                AbstractC3159y.f(objArr);
                Object obj2 = objArr[e()];
                if (obj2 == f()) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj2);
                }
                g();
                return;
            }
            throw new NoSuchElementException();
        }

        public final int l() {
            int i8;
            if (c() < f().f7482f) {
                int c8 = c();
                h(c8 + 1);
                i(c8);
                Object obj = f().f7477a[e()];
                int i9 = 0;
                if (obj != null) {
                    i8 = obj.hashCode();
                } else {
                    i8 = 0;
                }
                Object[] objArr = f().f7478b;
                AbstractC3159y.f(objArr);
                Object obj2 = objArr[e()];
                if (obj2 != null) {
                    i9 = obj2.hashCode();
                }
                int i10 = i8 ^ i9;
                g();
                return i10;
            }
            throw new NoSuchElementException();
        }
    }

    /* loaded from: classes5.dex */
    public static final class c implements Map.Entry, d.a {

        /* renamed from: a, reason: collision with root package name */
        private final d f7490a;

        /* renamed from: b, reason: collision with root package name */
        private final int f7491b;

        public c(d map, int i8) {
            AbstractC3159y.i(map, "map");
            this.f7490a = map;
            this.f7491b = i8;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (AbstractC3159y.d(entry.getKey(), getKey()) && AbstractC3159y.d(entry.getValue(), getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f7490a.f7477a[this.f7491b];
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            Object[] objArr = this.f7490a.f7478b;
            AbstractC3159y.f(objArr);
            return objArr[this.f7491b];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int i8;
            Object key = getKey();
            int i9 = 0;
            if (key != null) {
                i8 = key.hashCode();
            } else {
                i8 = 0;
            }
            Object value = getValue();
            if (value != null) {
                i9 = value.hashCode();
            }
            return i8 ^ i9;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            this.f7490a.n();
            Object[] l8 = this.f7490a.l();
            int i8 = this.f7491b;
            Object obj2 = l8[i8];
            l8[i8] = obj;
            return obj2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    /* renamed from: N5.d$d, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0162d {

        /* renamed from: a, reason: collision with root package name */
        private final d f7492a;

        /* renamed from: b, reason: collision with root package name */
        private int f7493b;

        /* renamed from: c, reason: collision with root package name */
        private int f7494c;

        /* renamed from: d, reason: collision with root package name */
        private int f7495d;

        public C0162d(d map) {
            AbstractC3159y.i(map, "map");
            this.f7492a = map;
            this.f7494c = -1;
            this.f7495d = map.f7484h;
            g();
        }

        public final void b() {
            if (this.f7492a.f7484h == this.f7495d) {
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final int c() {
            return this.f7493b;
        }

        public final int e() {
            return this.f7494c;
        }

        public final d f() {
            return this.f7492a;
        }

        public final void g() {
            while (this.f7493b < this.f7492a.f7482f) {
                int[] iArr = this.f7492a.f7479c;
                int i8 = this.f7493b;
                if (iArr[i8] < 0) {
                    this.f7493b = i8 + 1;
                } else {
                    return;
                }
            }
        }

        public final void h(int i8) {
            this.f7493b = i8;
        }

        public final boolean hasNext() {
            if (this.f7493b < this.f7492a.f7482f) {
                return true;
            }
            return false;
        }

        public final void i(int i8) {
            this.f7494c = i8;
        }

        public final void remove() {
            b();
            if (this.f7494c != -1) {
                this.f7492a.n();
                this.f7492a.Q(this.f7494c);
                this.f7494c = -1;
                this.f7495d = this.f7492a.f7484h;
                return;
            }
            throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
        }
    }

    /* loaded from: classes5.dex */
    public static final class e extends C0162d implements Iterator, Y5.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d map) {
            super(map);
            AbstractC3159y.i(map, "map");
        }

        @Override // java.util.Iterator
        public Object next() {
            b();
            if (c() < f().f7482f) {
                int c8 = c();
                h(c8 + 1);
                i(c8);
                Object obj = f().f7477a[e()];
                g();
                return obj;
            }
            throw new NoSuchElementException();
        }
    }

    /* loaded from: classes5.dex */
    public static final class f extends C0162d implements Iterator, Y5.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(d map) {
            super(map);
            AbstractC3159y.i(map, "map");
        }

        @Override // java.util.Iterator
        public Object next() {
            b();
            if (c() < f().f7482f) {
                int c8 = c();
                h(c8 + 1);
                i(c8);
                Object[] objArr = f().f7478b;
                AbstractC3159y.f(objArr);
                Object obj = objArr[e()];
                g();
                return obj;
            }
            throw new NoSuchElementException();
        }
    }

    static {
        d dVar = new d(0);
        dVar.f7489m = true;
        f7476o = dVar;
    }

    private d(Object[] objArr, Object[] objArr2, int[] iArr, int[] iArr2, int i8, int i9) {
        this.f7477a = objArr;
        this.f7478b = objArr2;
        this.f7479c = iArr;
        this.f7480d = iArr2;
        this.f7481e = i8;
        this.f7482f = i9;
        this.f7483g = f7475n.d(B());
    }

    private final int B() {
        return this.f7480d.length;
    }

    private final int F(Object obj) {
        int i8;
        if (obj != null) {
            i8 = obj.hashCode();
        } else {
            i8 = 0;
        }
        return (i8 * (-1640531527)) >>> this.f7483g;
    }

    private final boolean I(Collection collection) {
        boolean z8 = false;
        if (collection.isEmpty()) {
            return false;
        }
        u(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (J((Map.Entry) it.next())) {
                z8 = true;
            }
        }
        return z8;
    }

    private final boolean J(Map.Entry entry) {
        int k8 = k(entry.getKey());
        Object[] l8 = l();
        if (k8 >= 0) {
            l8[k8] = entry.getValue();
            return true;
        }
        int i8 = (-k8) - 1;
        if (!AbstractC3159y.d(entry.getValue(), l8[i8])) {
            l8[i8] = entry.getValue();
            return true;
        }
        return false;
    }

    private final boolean K(int i8) {
        int F8 = F(this.f7477a[i8]);
        int i9 = this.f7481e;
        while (true) {
            int[] iArr = this.f7480d;
            if (iArr[F8] == 0) {
                iArr[F8] = i8 + 1;
                this.f7479c[i8] = F8;
                return true;
            }
            i9--;
            if (i9 < 0) {
                return false;
            }
            int i10 = F8 - 1;
            if (F8 == 0) {
                F8 = B() - 1;
            } else {
                F8 = i10;
            }
        }
    }

    private final void L() {
        this.f7484h++;
    }

    private final void M(int i8) {
        L();
        if (this.f7482f > size()) {
            o();
        }
        int i9 = 0;
        if (i8 != B()) {
            this.f7480d = new int[i8];
            this.f7483g = f7475n.d(i8);
        } else {
            AbstractC1239l.r(this.f7480d, 0, 0, B());
        }
        while (i9 < this.f7482f) {
            int i10 = i9 + 1;
            if (K(i9)) {
                i9 = i10;
            } else {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
        }
    }

    private final void O(int i8) {
        int g8 = m.g(this.f7481e * 2, B() / 2);
        int i9 = 0;
        int i10 = i8;
        do {
            int i11 = i8 - 1;
            if (i8 == 0) {
                i8 = B() - 1;
            } else {
                i8 = i11;
            }
            i9++;
            if (i9 > this.f7481e) {
                this.f7480d[i10] = 0;
                return;
            }
            int[] iArr = this.f7480d;
            int i12 = iArr[i8];
            if (i12 == 0) {
                iArr[i10] = 0;
                return;
            }
            if (i12 < 0) {
                iArr[i10] = -1;
            } else {
                int i13 = i12 - 1;
                if (((F(this.f7477a[i13]) - i8) & (B() - 1)) >= i9) {
                    this.f7480d[i10] = i12;
                    this.f7479c[i13] = i10;
                }
                g8--;
            }
            i10 = i8;
            i9 = 0;
            g8--;
        } while (g8 >= 0);
        this.f7480d[i10] = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(int i8) {
        N5.c.f(this.f7477a, i8);
        O(this.f7479c[i8]);
        this.f7479c[i8] = -1;
        this.f7485i = size() - 1;
        L();
    }

    private final boolean S(int i8) {
        int y8 = y();
        int i9 = this.f7482f;
        int i10 = y8 - i9;
        int size = i9 - size();
        if (i10 < i8 && i10 + size >= i8 && size >= y() / 4) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] l() {
        Object[] objArr = this.f7478b;
        if (objArr != null) {
            return objArr;
        }
        Object[] d8 = N5.c.d(y());
        this.f7478b = d8;
        return d8;
    }

    private final void o() {
        int i8;
        Object[] objArr = this.f7478b;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            i8 = this.f7482f;
            if (i9 >= i8) {
                break;
            }
            if (this.f7479c[i9] >= 0) {
                Object[] objArr2 = this.f7477a;
                objArr2[i10] = objArr2[i9];
                if (objArr != null) {
                    objArr[i10] = objArr[i9];
                }
                i10++;
            }
            i9++;
        }
        N5.c.g(this.f7477a, i10, i8);
        if (objArr != null) {
            N5.c.g(objArr, i10, this.f7482f);
        }
        this.f7482f = i10;
    }

    private final boolean r(Map map) {
        if (size() == map.size() && p(map.entrySet())) {
            return true;
        }
        return false;
    }

    private final void t(int i8) {
        Object[] objArr;
        if (i8 >= 0) {
            if (i8 > y()) {
                int e8 = AbstractC1230c.Companion.e(y(), i8);
                this.f7477a = N5.c.e(this.f7477a, e8);
                Object[] objArr2 = this.f7478b;
                if (objArr2 != null) {
                    objArr = N5.c.e(objArr2, e8);
                } else {
                    objArr = null;
                }
                this.f7478b = objArr;
                int[] copyOf = Arrays.copyOf(this.f7479c, e8);
                AbstractC3159y.h(copyOf, "copyOf(...)");
                this.f7479c = copyOf;
                int c8 = f7475n.c(e8);
                if (c8 > B()) {
                    M(c8);
                    return;
                }
                return;
            }
            return;
        }
        throw new OutOfMemoryError();
    }

    private final void u(int i8) {
        if (S(i8)) {
            M(B());
        } else {
            t(this.f7482f + i8);
        }
    }

    private final int w(Object obj) {
        int F8 = F(obj);
        int i8 = this.f7481e;
        while (true) {
            int i9 = this.f7480d[F8];
            if (i9 == 0) {
                return -1;
            }
            if (i9 > 0) {
                int i10 = i9 - 1;
                if (AbstractC3159y.d(this.f7477a[i10], obj)) {
                    return i10;
                }
            }
            i8--;
            if (i8 < 0) {
                return -1;
            }
            int i11 = F8 - 1;
            if (F8 == 0) {
                F8 = B() - 1;
            } else {
                F8 = i11;
            }
        }
    }

    private final int x(Object obj) {
        int i8 = this.f7482f;
        while (true) {
            i8--;
            if (i8 < 0) {
                return -1;
            }
            if (this.f7479c[i8] >= 0) {
                Object[] objArr = this.f7478b;
                AbstractC3159y.f(objArr);
                if (AbstractC3159y.d(objArr[i8], obj)) {
                    return i8;
                }
            }
        }
    }

    public Set A() {
        N5.e eVar = this.f7488l;
        if (eVar == null) {
            N5.e eVar2 = new N5.e(this);
            this.f7488l = eVar2;
            return eVar2;
        }
        return eVar;
    }

    public Set C() {
        N5.f fVar = this.f7486j;
        if (fVar == null) {
            N5.f fVar2 = new N5.f(this);
            this.f7486j = fVar2;
            return fVar2;
        }
        return fVar;
    }

    public int D() {
        return this.f7485i;
    }

    public Collection E() {
        g gVar = this.f7487k;
        if (gVar == null) {
            g gVar2 = new g(this);
            this.f7487k = gVar2;
            return gVar2;
        }
        return gVar;
    }

    public final e H() {
        return new e(this);
    }

    public final boolean N(Map.Entry entry) {
        AbstractC3159y.i(entry, "entry");
        n();
        int w8 = w(entry.getKey());
        if (w8 < 0) {
            return false;
        }
        Object[] objArr = this.f7478b;
        AbstractC3159y.f(objArr);
        if (!AbstractC3159y.d(objArr[w8], entry.getValue())) {
            return false;
        }
        Q(w8);
        return true;
    }

    public final int P(Object obj) {
        n();
        int w8 = w(obj);
        if (w8 < 0) {
            return -1;
        }
        Q(w8);
        return w8;
    }

    public final boolean R(Object obj) {
        n();
        int x8 = x(obj);
        if (x8 < 0) {
            return false;
        }
        Q(x8);
        return true;
    }

    public final f T() {
        return new f(this);
    }

    @Override // java.util.Map
    public void clear() {
        n();
        N it = new i(0, this.f7482f - 1).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            int[] iArr = this.f7479c;
            int i8 = iArr[nextInt];
            if (i8 >= 0) {
                this.f7480d[i8] = 0;
                iArr[nextInt] = -1;
            }
        }
        N5.c.g(this.f7477a, 0, this.f7482f);
        Object[] objArr = this.f7478b;
        if (objArr != null) {
            N5.c.g(objArr, 0, this.f7482f);
        }
        this.f7485i = 0;
        this.f7482f = 0;
        L();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        if (w(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        if (x(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return A();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj != this && (!(obj instanceof Map) || !r((Map) obj))) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        int w8 = w(obj);
        if (w8 < 0) {
            return null;
        }
        Object[] objArr = this.f7478b;
        AbstractC3159y.f(objArr);
        return objArr[w8];
    }

    @Override // java.util.Map
    public int hashCode() {
        b v8 = v();
        int i8 = 0;
        while (v8.hasNext()) {
            i8 += v8.l();
        }
        return i8;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final int k(Object obj) {
        n();
        while (true) {
            int F8 = F(obj);
            int g8 = m.g(this.f7481e * 2, B() / 2);
            int i8 = 0;
            while (true) {
                int i9 = this.f7480d[F8];
                if (i9 <= 0) {
                    if (this.f7482f >= y()) {
                        u(1);
                    } else {
                        int i10 = this.f7482f;
                        int i11 = i10 + 1;
                        this.f7482f = i11;
                        this.f7477a[i10] = obj;
                        this.f7479c[i10] = F8;
                        this.f7480d[F8] = i11;
                        this.f7485i = size() + 1;
                        L();
                        if (i8 > this.f7481e) {
                            this.f7481e = i8;
                        }
                        return i10;
                    }
                } else {
                    if (AbstractC3159y.d(this.f7477a[i9 - 1], obj)) {
                        return -i9;
                    }
                    i8++;
                    if (i8 > g8) {
                        M(B() * 2);
                        break;
                    }
                    int i12 = F8 - 1;
                    if (F8 == 0) {
                        F8 = B() - 1;
                    } else {
                        F8 = i12;
                    }
                }
            }
        }
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return C();
    }

    public final Map m() {
        n();
        this.f7489m = true;
        if (size() > 0) {
            return this;
        }
        d dVar = f7476o;
        AbstractC3159y.g(dVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return dVar;
    }

    public final void n() {
        if (!this.f7489m) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean p(Collection m8) {
        AbstractC3159y.i(m8, "m");
        for (Object obj : m8) {
            if (obj != null) {
                try {
                    if (!q((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        n();
        int k8 = k(obj);
        Object[] l8 = l();
        if (k8 < 0) {
            int i8 = (-k8) - 1;
            Object obj3 = l8[i8];
            l8[i8] = obj2;
            return obj3;
        }
        l8[k8] = obj2;
        return null;
    }

    @Override // java.util.Map
    public void putAll(Map from) {
        AbstractC3159y.i(from, "from");
        n();
        I(from.entrySet());
    }

    public final boolean q(Map.Entry entry) {
        AbstractC3159y.i(entry, "entry");
        int w8 = w(entry.getKey());
        if (w8 < 0) {
            return false;
        }
        Object[] objArr = this.f7478b;
        AbstractC3159y.f(objArr);
        return AbstractC3159y.d(objArr[w8], entry.getValue());
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        int P8 = P(obj);
        if (P8 < 0) {
            return null;
        }
        Object[] objArr = this.f7478b;
        AbstractC3159y.f(objArr);
        Object obj2 = objArr[P8];
        N5.c.f(objArr, P8);
        return obj2;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return D();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((size() * 3) + 2);
        sb.append("{");
        b v8 = v();
        int i8 = 0;
        while (v8.hasNext()) {
            if (i8 > 0) {
                sb.append(", ");
            }
            v8.k(sb);
            i8++;
        }
        sb.append("}");
        String sb2 = sb.toString();
        AbstractC3159y.h(sb2, "toString(...)");
        return sb2;
    }

    public final b v() {
        return new b(this);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return E();
    }

    public final int y() {
        return this.f7477a.length;
    }

    public d() {
        this(8);
    }

    public d(int i8) {
        this(N5.c.d(i8), null, new int[i8], new int[f7475n.c(i8)], 2, 0);
    }
}
