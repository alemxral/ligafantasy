package com.google.gson.internal;

import j$.util.Objects;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes3.dex */
public final class g extends AbstractMap implements Serializable {

    /* renamed from: i, reason: collision with root package name */
    private static final Comparator f17729i = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Comparator f17730a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f17731b;

    /* renamed from: c, reason: collision with root package name */
    e f17732c;

    /* renamed from: d, reason: collision with root package name */
    int f17733d;

    /* renamed from: e, reason: collision with root package name */
    int f17734e;

    /* renamed from: f, reason: collision with root package name */
    final e f17735f;

    /* renamed from: g, reason: collision with root package name */
    private b f17736g;

    /* renamed from: h, reason: collision with root package name */
    private c f17737h;

    /* loaded from: classes3.dex */
    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* loaded from: classes3.dex */
    class b extends AbstractSet {

        /* loaded from: classes3.dex */
        class a extends d {
            a() {
                super();
            }

            @Override // java.util.Iterator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public Map.Entry next() {
                return b();
            }
        }

        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            g.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if ((obj instanceof Map.Entry) && g.this.c((Map.Entry) obj) != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            e c8;
            if (!(obj instanceof Map.Entry) || (c8 = g.this.c((Map.Entry) obj)) == null) {
                return false;
            }
            g.this.g(c8, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return g.this.f17733d;
        }
    }

    /* loaded from: classes3.dex */
    final class c extends AbstractSet {

        /* loaded from: classes3.dex */
        class a extends d {
            a() {
                super();
            }

            @Override // java.util.Iterator
            public Object next() {
                return b().f17751f;
            }
        }

        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            g.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return g.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (g.this.h(obj) != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return g.this.f17733d;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public abstract class d implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        e f17742a;

        /* renamed from: b, reason: collision with root package name */
        e f17743b = null;

        /* renamed from: c, reason: collision with root package name */
        int f17744c;

        d() {
            this.f17742a = g.this.f17735f.f17749d;
            this.f17744c = g.this.f17734e;
        }

        final e b() {
            e eVar = this.f17742a;
            g gVar = g.this;
            if (eVar != gVar.f17735f) {
                if (gVar.f17734e == this.f17744c) {
                    this.f17742a = eVar.f17749d;
                    this.f17743b = eVar;
                    return eVar;
                }
                throw new ConcurrentModificationException();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f17742a != g.this.f17735f) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e eVar = this.f17743b;
            if (eVar != null) {
                g.this.g(eVar, true);
                this.f17743b = null;
                this.f17744c = g.this.f17734e;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public g() {
        this(f17729i, true);
    }

    private boolean a(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    private void f(e eVar, boolean z8) {
        int i8;
        int i9;
        int i10;
        int i11;
        while (eVar != null) {
            e eVar2 = eVar.f17747b;
            e eVar3 = eVar.f17748c;
            int i12 = 0;
            if (eVar2 != null) {
                i8 = eVar2.f17754i;
            } else {
                i8 = 0;
            }
            if (eVar3 != null) {
                i9 = eVar3.f17754i;
            } else {
                i9 = 0;
            }
            int i13 = i8 - i9;
            if (i13 == -2) {
                e eVar4 = eVar3.f17747b;
                e eVar5 = eVar3.f17748c;
                if (eVar5 != null) {
                    i11 = eVar5.f17754i;
                } else {
                    i11 = 0;
                }
                if (eVar4 != null) {
                    i12 = eVar4.f17754i;
                }
                int i14 = i12 - i11;
                if (i14 != -1 && (i14 != 0 || z8)) {
                    l(eVar3);
                    k(eVar);
                } else {
                    k(eVar);
                }
                if (z8) {
                    return;
                }
            } else if (i13 == 2) {
                e eVar6 = eVar2.f17747b;
                e eVar7 = eVar2.f17748c;
                if (eVar7 != null) {
                    i10 = eVar7.f17754i;
                } else {
                    i10 = 0;
                }
                if (eVar6 != null) {
                    i12 = eVar6.f17754i;
                }
                int i15 = i12 - i10;
                if (i15 != 1 && (i15 != 0 || z8)) {
                    k(eVar2);
                    l(eVar);
                } else {
                    l(eVar);
                }
                if (z8) {
                    return;
                }
            } else if (i13 == 0) {
                eVar.f17754i = i8 + 1;
                if (z8) {
                    return;
                }
            } else {
                eVar.f17754i = Math.max(i8, i9) + 1;
                if (!z8) {
                    return;
                }
            }
            eVar = eVar.f17746a;
        }
    }

    private void j(e eVar, e eVar2) {
        e eVar3 = eVar.f17746a;
        eVar.f17746a = null;
        if (eVar2 != null) {
            eVar2.f17746a = eVar3;
        }
        if (eVar3 != null) {
            if (eVar3.f17747b == eVar) {
                eVar3.f17747b = eVar2;
                return;
            } else {
                eVar3.f17748c = eVar2;
                return;
            }
        }
        this.f17732c = eVar2;
    }

    private void k(e eVar) {
        int i8;
        int i9;
        e eVar2 = eVar.f17747b;
        e eVar3 = eVar.f17748c;
        e eVar4 = eVar3.f17747b;
        e eVar5 = eVar3.f17748c;
        eVar.f17748c = eVar4;
        if (eVar4 != null) {
            eVar4.f17746a = eVar;
        }
        j(eVar, eVar3);
        eVar3.f17747b = eVar;
        eVar.f17746a = eVar3;
        int i10 = 0;
        if (eVar2 != null) {
            i8 = eVar2.f17754i;
        } else {
            i8 = 0;
        }
        if (eVar4 != null) {
            i9 = eVar4.f17754i;
        } else {
            i9 = 0;
        }
        int max = Math.max(i8, i9) + 1;
        eVar.f17754i = max;
        if (eVar5 != null) {
            i10 = eVar5.f17754i;
        }
        eVar3.f17754i = Math.max(max, i10) + 1;
    }

    private void l(e eVar) {
        int i8;
        int i9;
        e eVar2 = eVar.f17747b;
        e eVar3 = eVar.f17748c;
        e eVar4 = eVar2.f17747b;
        e eVar5 = eVar2.f17748c;
        eVar.f17747b = eVar5;
        if (eVar5 != null) {
            eVar5.f17746a = eVar;
        }
        j(eVar, eVar2);
        eVar2.f17748c = eVar;
        eVar.f17746a = eVar2;
        int i10 = 0;
        if (eVar3 != null) {
            i8 = eVar3.f17754i;
        } else {
            i8 = 0;
        }
        if (eVar5 != null) {
            i9 = eVar5.f17754i;
        } else {
            i9 = 0;
        }
        int max = Math.max(i8, i9) + 1;
        eVar.f17754i = max;
        if (eVar4 != null) {
            i10 = eVar4.f17754i;
        }
        eVar2.f17754i = Math.max(max, i10) + 1;
    }

    e b(Object obj, boolean z8) {
        int i8;
        e eVar;
        Comparable comparable;
        e eVar2;
        Comparator comparator = this.f17730a;
        e eVar3 = this.f17732c;
        if (eVar3 != null) {
            if (comparator == f17729i) {
                comparable = (Comparable) obj;
            } else {
                comparable = null;
            }
            while (true) {
                if (comparable != null) {
                    i8 = comparable.compareTo(eVar3.f17751f);
                } else {
                    i8 = comparator.compare(obj, eVar3.f17751f);
                }
                if (i8 == 0) {
                    return eVar3;
                }
                if (i8 < 0) {
                    eVar2 = eVar3.f17747b;
                } else {
                    eVar2 = eVar3.f17748c;
                }
                if (eVar2 == null) {
                    break;
                }
                eVar3 = eVar2;
            }
        } else {
            i8 = 0;
        }
        if (!z8) {
            return null;
        }
        e eVar4 = this.f17735f;
        if (eVar3 == null) {
            if (comparator == f17729i && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName() + " is not Comparable");
            }
            eVar = new e(this.f17731b, eVar3, obj, eVar4, eVar4.f17750e);
            this.f17732c = eVar;
        } else {
            eVar = new e(this.f17731b, eVar3, obj, eVar4, eVar4.f17750e);
            if (i8 < 0) {
                eVar3.f17747b = eVar;
            } else {
                eVar3.f17748c = eVar;
            }
            f(eVar3, true);
        }
        this.f17733d++;
        this.f17734e++;
        return eVar;
    }

    e c(Map.Entry entry) {
        e e8 = e(entry.getKey());
        if (e8 == null || !a(e8.f17753h, entry.getValue())) {
            return null;
        }
        return e8;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f17732c = null;
        this.f17733d = 0;
        this.f17734e++;
        e eVar = this.f17735f;
        eVar.f17750e = eVar;
        eVar.f17749d = eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (e(obj) != null) {
            return true;
        }
        return false;
    }

    e e(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return b(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        b bVar = this.f17736g;
        if (bVar == null) {
            b bVar2 = new b();
            this.f17736g = bVar2;
            return bVar2;
        }
        return bVar;
    }

    void g(e eVar, boolean z8) {
        e a8;
        int i8;
        if (z8) {
            e eVar2 = eVar.f17750e;
            eVar2.f17749d = eVar.f17749d;
            eVar.f17749d.f17750e = eVar2;
        }
        e eVar3 = eVar.f17747b;
        e eVar4 = eVar.f17748c;
        e eVar5 = eVar.f17746a;
        int i9 = 0;
        if (eVar3 != null && eVar4 != null) {
            if (eVar3.f17754i > eVar4.f17754i) {
                a8 = eVar3.b();
            } else {
                a8 = eVar4.a();
            }
            g(a8, false);
            e eVar6 = eVar.f17747b;
            if (eVar6 != null) {
                i8 = eVar6.f17754i;
                a8.f17747b = eVar6;
                eVar6.f17746a = a8;
                eVar.f17747b = null;
            } else {
                i8 = 0;
            }
            e eVar7 = eVar.f17748c;
            if (eVar7 != null) {
                i9 = eVar7.f17754i;
                a8.f17748c = eVar7;
                eVar7.f17746a = a8;
                eVar.f17748c = null;
            }
            a8.f17754i = Math.max(i8, i9) + 1;
            j(eVar, a8);
            return;
        }
        if (eVar3 != null) {
            j(eVar, eVar3);
            eVar.f17747b = null;
        } else if (eVar4 != null) {
            j(eVar, eVar4);
            eVar.f17748c = null;
        } else {
            j(eVar, null);
        }
        f(eVar5, false);
        this.f17733d--;
        this.f17734e++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        e e8 = e(obj);
        if (e8 != null) {
            return e8.f17753h;
        }
        return null;
    }

    e h(Object obj) {
        e e8 = e(obj);
        if (e8 != null) {
            g(e8, true);
        }
        return e8;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        c cVar = this.f17737h;
        if (cVar == null) {
            c cVar2 = new c();
            this.f17737h = cVar2;
            return cVar2;
        }
        return cVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 == null && !this.f17731b) {
                throw new NullPointerException("value == null");
            }
            e b8 = b(obj, true);
            Object obj3 = b8.f17753h;
            b8.f17753h = obj2;
            return obj3;
        }
        throw new NullPointerException("key == null");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        e h8 = h(obj);
        if (h8 != null) {
            return h8.f17753h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f17733d;
    }

    public g(boolean z8) {
        this(f17729i, z8);
    }

    public g(Comparator comparator, boolean z8) {
        this.f17733d = 0;
        this.f17734e = 0;
        this.f17730a = comparator == null ? f17729i : comparator;
        this.f17731b = z8;
        this.f17735f = new e(z8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class e implements Map.Entry {

        /* renamed from: a, reason: collision with root package name */
        e f17746a;

        /* renamed from: b, reason: collision with root package name */
        e f17747b;

        /* renamed from: c, reason: collision with root package name */
        e f17748c;

        /* renamed from: d, reason: collision with root package name */
        e f17749d;

        /* renamed from: e, reason: collision with root package name */
        e f17750e;

        /* renamed from: f, reason: collision with root package name */
        final Object f17751f;

        /* renamed from: g, reason: collision with root package name */
        final boolean f17752g;

        /* renamed from: h, reason: collision with root package name */
        Object f17753h;

        /* renamed from: i, reason: collision with root package name */
        int f17754i;

        e(boolean z8) {
            this.f17751f = null;
            this.f17752g = z8;
            this.f17750e = this;
            this.f17749d = this;
        }

        public e a() {
            e eVar = this;
            for (e eVar2 = this.f17747b; eVar2 != null; eVar2 = eVar2.f17747b) {
                eVar = eVar2;
            }
            return eVar;
        }

        public e b() {
            e eVar = this;
            for (e eVar2 = this.f17748c; eVar2 != null; eVar2 = eVar2.f17748c) {
                eVar = eVar2;
            }
            return eVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f17751f;
            if (obj2 == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!obj2.equals(entry.getKey())) {
                return false;
            }
            Object obj3 = this.f17753h;
            if (obj3 == null) {
                if (entry.getValue() != null) {
                    return false;
                }
            } else if (!obj3.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f17751f;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f17753h;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int hashCode;
            Object obj = this.f17751f;
            int i8 = 0;
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            Object obj2 = this.f17753h;
            if (obj2 != null) {
                i8 = obj2.hashCode();
            }
            return hashCode ^ i8;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj == null && !this.f17752g) {
                throw new NullPointerException("value == null");
            }
            Object obj2 = this.f17753h;
            this.f17753h = obj;
            return obj2;
        }

        public String toString() {
            return this.f17751f + "=" + this.f17753h;
        }

        e(boolean z8, e eVar, Object obj, e eVar2, e eVar3) {
            this.f17746a = eVar;
            this.f17751f = obj;
            this.f17752g = z8;
            this.f17754i = 1;
            this.f17749d = eVar2;
            this.f17750e = eVar3;
            eVar3.f17749d = this;
            eVar2.f17750e = this;
        }
    }
}
