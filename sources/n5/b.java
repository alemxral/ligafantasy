package N5;

import M5.AbstractC1230c;
import M5.AbstractC1233f;
import M5.AbstractC1239l;
import M5.AbstractC1246t;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class b extends AbstractC1233f implements List, RandomAccess, Serializable, Y5.b {

    /* renamed from: g, reason: collision with root package name */
    private static final a f7463g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    private static final b f7464h;

    /* renamed from: a, reason: collision with root package name */
    private Object[] f7465a;

    /* renamed from: b, reason: collision with root package name */
    private int f7466b;

    /* renamed from: c, reason: collision with root package name */
    private int f7467c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f7468d;

    /* renamed from: e, reason: collision with root package name */
    private final b f7469e;

    /* renamed from: f, reason: collision with root package name */
    private final b f7470f;

    /* loaded from: classes5.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N5.b$b, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0161b implements ListIterator, Y5.a {

        /* renamed from: a, reason: collision with root package name */
        private final b f7471a;

        /* renamed from: b, reason: collision with root package name */
        private int f7472b;

        /* renamed from: c, reason: collision with root package name */
        private int f7473c;

        /* renamed from: d, reason: collision with root package name */
        private int f7474d;

        public C0161b(b list, int i8) {
            AbstractC3159y.i(list, "list");
            this.f7471a = list;
            this.f7472b = i8;
            this.f7473c = -1;
            this.f7474d = ((AbstractList) list).modCount;
        }

        private final void b() {
            if (((AbstractList) this.f7471a).modCount == this.f7474d) {
            } else {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            b();
            b bVar = this.f7471a;
            int i8 = this.f7472b;
            this.f7472b = i8 + 1;
            bVar.add(i8, obj);
            this.f7473c = -1;
            this.f7474d = ((AbstractList) this.f7471a).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            if (this.f7472b < this.f7471a.f7467c) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            if (this.f7472b > 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            b();
            if (this.f7472b < this.f7471a.f7467c) {
                int i8 = this.f7472b;
                this.f7472b = i8 + 1;
                this.f7473c = i8;
                return this.f7471a.f7465a[this.f7471a.f7466b + this.f7473c];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f7472b;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            b();
            int i8 = this.f7472b;
            if (i8 > 0) {
                int i9 = i8 - 1;
                this.f7472b = i9;
                this.f7473c = i9;
                return this.f7471a.f7465a[this.f7471a.f7466b + this.f7473c];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f7472b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            b();
            int i8 = this.f7473c;
            if (i8 != -1) {
                this.f7471a.remove(i8);
                this.f7472b = this.f7473c;
                this.f7473c = -1;
                this.f7474d = ((AbstractList) this.f7471a).modCount;
                return;
            }
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            b();
            int i8 = this.f7473c;
            if (i8 != -1) {
                this.f7471a.set(i8, obj);
                return;
            }
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
        }
    }

    static {
        b bVar = new b(0);
        bVar.f7468d = true;
        f7464h = bVar;
    }

    private b(Object[] objArr, int i8, int i9, boolean z8, b bVar, b bVar2) {
        this.f7465a = objArr;
        this.f7466b = i8;
        this.f7467c = i9;
        this.f7468d = z8;
        this.f7469e = bVar;
        this.f7470f = bVar2;
        if (bVar != null) {
            ((AbstractList) this).modCount = ((AbstractList) bVar).modCount;
        }
    }

    private final void A() {
        ((AbstractList) this).modCount++;
    }

    private final Object B(int i8) {
        A();
        b bVar = this.f7469e;
        if (bVar != null) {
            this.f7467c--;
            return bVar.B(i8);
        }
        Object[] objArr = this.f7465a;
        Object obj = objArr[i8];
        AbstractC1239l.i(objArr, objArr, i8, i8 + 1, this.f7466b + this.f7467c);
        c.f(this.f7465a, (this.f7466b + this.f7467c) - 1);
        this.f7467c--;
        return obj;
    }

    private final void C(int i8, int i9) {
        if (i9 > 0) {
            A();
        }
        b bVar = this.f7469e;
        if (bVar != null) {
            bVar.C(i8, i9);
        } else {
            Object[] objArr = this.f7465a;
            AbstractC1239l.i(objArr, objArr, i8, i8 + i9, this.f7467c);
            Object[] objArr2 = this.f7465a;
            int i10 = this.f7467c;
            c.g(objArr2, i10 - i9, i10);
        }
        this.f7467c -= i9;
    }

    private final int D(int i8, int i9, Collection collection, boolean z8) {
        int i10;
        b bVar = this.f7469e;
        if (bVar != null) {
            i10 = bVar.D(i8, i9, collection, z8);
        } else {
            int i11 = 0;
            int i12 = 0;
            while (i11 < i9) {
                int i13 = i8 + i11;
                if (collection.contains(this.f7465a[i13]) == z8) {
                    Object[] objArr = this.f7465a;
                    i11++;
                    objArr[i12 + i8] = objArr[i13];
                    i12++;
                } else {
                    i11++;
                }
            }
            int i14 = i9 - i12;
            Object[] objArr2 = this.f7465a;
            AbstractC1239l.i(objArr2, objArr2, i8 + i12, i9 + i8, this.f7467c);
            Object[] objArr3 = this.f7465a;
            int i15 = this.f7467c;
            c.g(objArr3, i15 - i14, i15);
            i10 = i14;
        }
        if (i10 > 0) {
            A();
        }
        this.f7467c -= i10;
        return i10;
    }

    private final void m(int i8, Collection collection, int i9) {
        A();
        b bVar = this.f7469e;
        if (bVar != null) {
            bVar.m(i8, collection, i9);
            this.f7465a = this.f7469e.f7465a;
            this.f7467c += i9;
        } else {
            x(i8, i9);
            Iterator it = collection.iterator();
            for (int i10 = 0; i10 < i9; i10++) {
                this.f7465a[i8 + i10] = it.next();
            }
        }
    }

    private final void p(int i8, Object obj) {
        A();
        b bVar = this.f7469e;
        if (bVar != null) {
            bVar.p(i8, obj);
            this.f7465a = this.f7469e.f7465a;
            this.f7467c++;
        } else {
            x(i8, 1);
            this.f7465a[i8] = obj;
        }
    }

    private final void r() {
        b bVar = this.f7470f;
        if (bVar != null && ((AbstractList) bVar).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    private final void t() {
        if (!y()) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    private final boolean u(List list) {
        boolean h8;
        h8 = c.h(this.f7465a, this.f7466b, this.f7467c, list);
        return h8;
    }

    private final void v(int i8) {
        if (i8 >= 0) {
            Object[] objArr = this.f7465a;
            if (i8 > objArr.length) {
                this.f7465a = c.e(this.f7465a, AbstractC1230c.Companion.e(objArr.length, i8));
                return;
            }
            return;
        }
        throw new OutOfMemoryError();
    }

    private final void w(int i8) {
        v(this.f7467c + i8);
    }

    private final void x(int i8, int i9) {
        w(i9);
        Object[] objArr = this.f7465a;
        AbstractC1239l.i(objArr, objArr, i8 + i9, i8, this.f7466b + this.f7467c);
        this.f7467c += i9;
    }

    private final boolean y() {
        b bVar;
        if (!this.f7468d && ((bVar = this.f7470f) == null || !bVar.f7468d)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        t();
        r();
        p(this.f7466b + this.f7467c, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection elements) {
        AbstractC3159y.i(elements, "elements");
        t();
        r();
        int size = elements.size();
        m(this.f7466b + this.f7467c, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        t();
        r();
        C(this.f7466b, this.f7467c);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        r();
        if (obj != this && (!(obj instanceof List) || !u((List) obj))) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i8) {
        r();
        AbstractC1230c.Companion.b(i8, this.f7467c);
        return this.f7465a[this.f7466b + i8];
    }

    @Override // M5.AbstractC1233f
    public int getSize() {
        r();
        return this.f7467c;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i8;
        r();
        i8 = c.i(this.f7465a, this.f7466b, this.f7467c);
        return i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        r();
        for (int i8 = 0; i8 < this.f7467c; i8++) {
            if (AbstractC3159y.d(this.f7465a[this.f7466b + i8], obj)) {
                return i8;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        r();
        if (this.f7467c == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        r();
        for (int i8 = this.f7467c - 1; i8 >= 0; i8--) {
            if (AbstractC3159y.d(this.f7465a[this.f7466b + i8], obj)) {
                return i8;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    public final List q() {
        if (this.f7469e == null) {
            t();
            this.f7468d = true;
            if (this.f7467c > 0) {
                return this;
            }
            return f7464h;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        t();
        r();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
        }
        if (indexOf >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection elements) {
        AbstractC3159y.i(elements, "elements");
        t();
        r();
        if (D(this.f7466b, this.f7467c, elements, false) <= 0) {
            return false;
        }
        return true;
    }

    @Override // M5.AbstractC1233f
    public Object removeAt(int i8) {
        t();
        r();
        AbstractC1230c.Companion.b(i8, this.f7467c);
        return B(this.f7466b + i8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection elements) {
        AbstractC3159y.i(elements, "elements");
        t();
        r();
        if (D(this.f7466b, this.f7467c, elements, true) > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i8, Object obj) {
        t();
        r();
        AbstractC1230c.Companion.b(i8, this.f7467c);
        Object[] objArr = this.f7465a;
        int i9 = this.f7466b;
        Object obj2 = objArr[i9 + i8];
        objArr[i9 + i8] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public List subList(int i8, int i9) {
        b bVar;
        AbstractC1230c.Companion.d(i8, i9, this.f7467c);
        Object[] objArr = this.f7465a;
        int i10 = this.f7466b + i8;
        int i11 = i9 - i8;
        boolean z8 = this.f7468d;
        b bVar2 = this.f7470f;
        if (bVar2 == null) {
            bVar = this;
        } else {
            bVar = bVar2;
        }
        return new b(objArr, i10, i11, z8, this, bVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] destination) {
        AbstractC3159y.i(destination, "destination");
        r();
        int length = destination.length;
        int i8 = this.f7467c;
        if (length < i8) {
            Object[] objArr = this.f7465a;
            int i9 = this.f7466b;
            Object[] copyOfRange = Arrays.copyOfRange(objArr, i9, i8 + i9, destination.getClass());
            AbstractC3159y.h(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        Object[] objArr2 = this.f7465a;
        int i10 = this.f7466b;
        AbstractC1239l.i(objArr2, destination, 0, i10, i8 + i10);
        return AbstractC1246t.f(this.f7467c, destination);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        String j8;
        r();
        j8 = c.j(this.f7465a, this.f7466b, this.f7467c, this);
        return j8;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i8) {
        r();
        AbstractC1230c.Companion.c(i8, this.f7467c);
        return new C0161b(this, i8);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i8, Object obj) {
        t();
        r();
        AbstractC1230c.Companion.c(i8, this.f7467c);
        p(this.f7466b + i8, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i8, Collection elements) {
        AbstractC3159y.i(elements, "elements");
        t();
        r();
        AbstractC1230c.Companion.c(i8, this.f7467c);
        int size = elements.size();
        m(this.f7466b + i8, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        r();
        Object[] objArr = this.f7465a;
        int i8 = this.f7466b;
        return AbstractC1239l.p(objArr, i8, this.f7467c + i8);
    }

    public b() {
        this(10);
    }

    public b(int i8) {
        this(c.d(i8), 0, 0, false, null, null);
    }
}
