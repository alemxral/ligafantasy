package f6;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: f6.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2678e implements InterfaceC2680g {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2680g f31113a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f31114b;

    /* renamed from: c, reason: collision with root package name */
    private final Function1 f31115c;

    /* renamed from: f6.e$a */
    /* loaded from: classes5.dex */
    public static final class a implements Iterator, Y5.a {

        /* renamed from: a, reason: collision with root package name */
        private final Iterator f31116a;

        /* renamed from: b, reason: collision with root package name */
        private Iterator f31117b;

        a() {
            this.f31116a = C2678e.this.f31113a.iterator();
        }

        private final boolean b() {
            Iterator it = this.f31117b;
            if (it != null && !it.hasNext()) {
                this.f31117b = null;
            }
            while (true) {
                if (this.f31117b != null) {
                    break;
                }
                if (!this.f31116a.hasNext()) {
                    return false;
                }
                Iterator it2 = (Iterator) C2678e.this.f31115c.invoke(C2678e.this.f31114b.invoke(this.f31116a.next()));
                if (it2.hasNext()) {
                    this.f31117b = it2;
                    break;
                }
            }
            return true;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return b();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (b()) {
                Iterator it = this.f31117b;
                AbstractC3159y.f(it);
                return it.next();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C2678e(InterfaceC2680g sequence, Function1 transformer, Function1 iterator) {
        AbstractC3159y.i(sequence, "sequence");
        AbstractC3159y.i(transformer, "transformer");
        AbstractC3159y.i(iterator, "iterator");
        this.f31113a = sequence;
        this.f31114b = transformer;
        this.f31115c = iterator;
    }

    @Override // f6.InterfaceC2680g
    public Iterator iterator() {
        return new a();
    }
}
