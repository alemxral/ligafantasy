package f6;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: f6.r, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2691r implements InterfaceC2680g {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2680g f31146a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f31147b;

    /* renamed from: f6.r$a */
    /* loaded from: classes5.dex */
    public static final class a implements Iterator, Y5.a {

        /* renamed from: a, reason: collision with root package name */
        private final Iterator f31148a;

        a() {
            this.f31148a = C2691r.this.f31146a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f31148a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return C2691r.this.f31147b.invoke(this.f31148a.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C2691r(InterfaceC2680g sequence, Function1 transformer) {
        AbstractC3159y.i(sequence, "sequence");
        AbstractC3159y.i(transformer, "transformer");
        this.f31146a = sequence;
        this.f31147b = transformer;
    }

    public final InterfaceC2680g d(Function1 iterator) {
        AbstractC3159y.i(iterator, "iterator");
        return new C2678e(this.f31146a, this.f31147b, iterator);
    }

    @Override // f6.InterfaceC2680g
    public Iterator iterator() {
        return new a();
    }
}
