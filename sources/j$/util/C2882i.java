package j$.util;

import java.util.Comparator;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2882i extends C2881h implements java.util.List, List {
    private static final long serialVersionUID = -7754090372962971524L;

    /* renamed from: c, reason: collision with root package name */
    final java.util.List f32210c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2882i(java.util.List list) {
        super(list);
        this.f32210c = list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2882i(java.util.List list, Object obj) {
        super(list, obj);
        this.f32210c = list;
    }

    private Object readResolve() {
        java.util.List list = this.f32210c;
        return list instanceof RandomAccess ? new C2882i(list) : this;
    }

    @Override // java.util.List
    public final void add(int i8, Object obj) {
        synchronized (this.f32206b) {
            this.f32210c.add(i8, obj);
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i8, java.util.Collection collection) {
        boolean addAll;
        synchronized (this.f32206b) {
            addAll = this.f32210c.addAll(i8, collection);
        }
        return addAll;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        boolean equals;
        if (this == obj) {
            return true;
        }
        synchronized (this.f32206b) {
            equals = this.f32210c.equals(obj);
        }
        return equals;
    }

    @Override // java.util.List
    public final Object get(int i8) {
        Object obj;
        synchronized (this.f32206b) {
            obj = this.f32210c.get(i8);
        }
        return obj;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int hashCode;
        synchronized (this.f32206b) {
            hashCode = this.f32210c.hashCode();
        }
        return hashCode;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int indexOf;
        synchronized (this.f32206b) {
            indexOf = this.f32210c.indexOf(obj);
        }
        return indexOf;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int lastIndexOf;
        synchronized (this.f32206b) {
            lastIndexOf = this.f32210c.lastIndexOf(obj);
        }
        return lastIndexOf;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return this.f32210c.listIterator();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i8) {
        return this.f32210c.listIterator(i8);
    }

    @Override // java.util.List
    public final Object remove(int i8) {
        Object remove;
        synchronized (this.f32206b) {
            remove = this.f32210c.remove(i8);
        }
        return remove;
    }

    @Override // java.util.List, j$.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        synchronized (this.f32206b) {
            java.util.List list = this.f32210c;
            if (list instanceof List) {
                ((List) list).replaceAll(unaryOperator);
            } else {
                Objects.requireNonNull(unaryOperator);
                ListIterator listIterator = list.listIterator();
                while (listIterator.hasNext()) {
                    listIterator.set(unaryOperator.apply(listIterator.next()));
                }
            }
        }
    }

    @Override // java.util.List
    public final Object set(int i8, Object obj) {
        Object obj2;
        synchronized (this.f32206b) {
            obj2 = this.f32210c.set(i8, obj);
        }
        return obj2;
    }

    @Override // java.util.List, j$.util.List
    public final void sort(Comparator comparator) {
        synchronized (this.f32206b) {
            AbstractC2877d.u(this.f32210c, comparator);
        }
    }

    @Override // java.util.List
    public java.util.List subList(int i8, int i9) {
        C2882i c2882i;
        synchronized (this.f32206b) {
            c2882i = new C2882i(this.f32210c.subList(i8, i9), this.f32206b);
        }
        return c2882i;
    }
}
