package f6;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: f6.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2677d implements InterfaceC2680g {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2680g f31106a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f31107b;

    /* renamed from: c, reason: collision with root package name */
    private final Function1 f31108c;

    /* renamed from: f6.d$a */
    /* loaded from: classes5.dex */
    public static final class a implements Iterator, Y5.a {

        /* renamed from: a, reason: collision with root package name */
        private final Iterator f31109a;

        /* renamed from: b, reason: collision with root package name */
        private int f31110b = -1;

        /* renamed from: c, reason: collision with root package name */
        private Object f31111c;

        a() {
            this.f31109a = C2677d.this.f31106a.iterator();
        }

        private final void b() {
            while (this.f31109a.hasNext()) {
                Object next = this.f31109a.next();
                if (((Boolean) C2677d.this.f31108c.invoke(next)).booleanValue() == C2677d.this.f31107b) {
                    this.f31111c = next;
                    this.f31110b = 1;
                    return;
                }
            }
            this.f31110b = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f31110b == -1) {
                b();
            }
            if (this.f31110b == 1) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f31110b == -1) {
                b();
            }
            if (this.f31110b != 0) {
                Object obj = this.f31111c;
                this.f31111c = null;
                this.f31110b = -1;
                return obj;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C2677d(InterfaceC2680g sequence, boolean z8, Function1 predicate) {
        AbstractC3159y.i(sequence, "sequence");
        AbstractC3159y.i(predicate, "predicate");
        this.f31106a = sequence;
        this.f31107b = z8;
        this.f31108c = predicate;
    }

    @Override // f6.InterfaceC2680g
    public Iterator iterator() {
        return new a();
    }
}
