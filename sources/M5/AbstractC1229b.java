package M5;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: M5.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1229b implements Iterator, Y5.a {

    /* renamed from: a, reason: collision with root package name */
    private f0 f7020a = f0.f7041b;

    /* renamed from: b, reason: collision with root package name */
    private Object f7021b;

    /* renamed from: M5.b$a */
    /* loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7022a;

        static {
            int[] iArr = new int[f0.values().length];
            try {
                iArr[f0.f7042c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f0.f7040a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f7022a = iArr;
        }
    }

    private final boolean f() {
        this.f7020a = f0.f7043d;
        b();
        if (this.f7020a == f0.f7040a) {
            return true;
        }
        return false;
    }

    protected abstract void b();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c() {
        this.f7020a = f0.f7042c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e(Object obj) {
        this.f7021b = obj;
        this.f7020a = f0.f7040a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        f0 f0Var = this.f7020a;
        if (f0Var != f0.f7043d) {
            int i8 = a.f7022a[f0Var.ordinal()];
            if (i8 != 1) {
                if (i8 == 2) {
                    return true;
                }
                return f();
            }
            return false;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // java.util.Iterator
    public Object next() {
        if (hasNext()) {
            this.f7020a = f0.f7041b;
            return this.f7021b;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
