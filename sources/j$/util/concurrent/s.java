package j$.util.concurrent;

import j$.util.Collection;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class s extends b implements Collection {
    private static final long serialVersionUID = 2249069246763182397L;

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.concurrent.b, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f32137a.containsValue(obj);
    }

    @Override // java.lang.Iterable, j$.util.Collection
    public final void forEach(Consumer consumer) {
        consumer.getClass();
        l[] lVarArr = this.f32137a.f32122a;
        if (lVarArr == null) {
            return;
        }
        p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
        while (true) {
            l a8 = pVar.a();
            if (a8 == null) {
                return;
            } else {
                consumer.o(a8.f32149c);
            }
        }
    }

    @Override // j$.util.concurrent.b, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        ConcurrentHashMap concurrentHashMap = this.f32137a;
        l[] lVarArr = concurrentHashMap.f32122a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        return new h(lVarArr, length, length, concurrentHashMap, 1);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        return Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.Collection
    public final /* synthetic */ java.util.stream.Stream parallelStream() {
        return Stream.Wrapper.convert(Collection.CC.$default$parallelStream(this));
    }

    @Override // j$.util.concurrent.b, java.util.Collection
    public final boolean remove(Object obj) {
        AbstractC2876a abstractC2876a;
        if (obj == null) {
            return false;
        }
        Object it = iterator();
        do {
            abstractC2876a = (AbstractC2876a) it;
            if (!abstractC2876a.hasNext()) {
                return false;
            }
        } while (!obj.equals(((h) it).next()));
        abstractC2876a.remove();
        return true;
    }

    @Override // j$.util.concurrent.b, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        collection.getClass();
        Object it = iterator();
        boolean z8 = false;
        while (true) {
            AbstractC2876a abstractC2876a = (AbstractC2876a) it;
            if (!abstractC2876a.hasNext()) {
                return z8;
            }
            if (collection.contains(((h) it).next())) {
                abstractC2876a.remove();
                z8 = true;
            }
        }
    }

    @Override // java.util.Collection, j$.util.Collection
    public final boolean removeIf(Predicate predicate) {
        ConcurrentHashMap concurrentHashMap = this.f32137a;
        concurrentHashMap.getClass();
        predicate.getClass();
        l[] lVarArr = concurrentHashMap.f32122a;
        boolean z8 = false;
        if (lVarArr != null) {
            p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l a8 = pVar.a();
                if (a8 == null) {
                    break;
                }
                Object obj = a8.f32148b;
                Object obj2 = a8.f32149c;
                if (predicate.test(obj2) && concurrentHashMap.g(obj, null, obj2) != null) {
                    z8 = true;
                }
            }
        }
        return z8;
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection
    public final Spliterator spliterator() {
        ConcurrentHashMap concurrentHashMap = this.f32137a;
        long j8 = concurrentHashMap.j();
        l[] lVarArr = concurrentHashMap.f32122a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        return new j(lVarArr, length, 0, length, j8 < 0 ? 0L : j8, 1);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream stream() {
        return Collection.CC.$default$stream(this);
    }

    @Override // java.util.Collection
    public final /* synthetic */ java.util.stream.Stream stream() {
        return Stream.Wrapper.convert(Collection.CC.$default$stream(this));
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        Object[] array;
        array = toArray((Object[]) intFunction.apply(0));
        return array;
    }
}
